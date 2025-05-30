// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.cosmos.spark

import com.azure.cosmos.implementation.ImplementationBridgeHelpers.CosmosItemRequestOptionsHelper
import com.azure.cosmos.implementation.UUIDs
import com.azure.cosmos.implementation.apachecommons.lang.StringUtils
import com.azure.cosmos.implementation.guava25.base.Preconditions.checkState
import com.azure.cosmos.implementation.spark.{OperationContextAndListenerTuple, OperationListener}
import com.azure.cosmos.models.{CosmosItemRequestOptions, CosmosItemResponse, CosmosPatchItemRequestOptions, PartitionKey, PartitionKeyDefinition}
import com.azure.cosmos.spark.BulkWriter.getThreadInfo
import com.azure.cosmos.spark.PointWriter.MaxNumberOfThreadsPerCPUCore
import com.azure.cosmos.spark.diagnostics.{CosmosItemIdentifier, CreateOperation, DeleteOperation, DiagnosticsContext, DiagnosticsLoader, LoggerHelper, PatchBulkUpdateOperation, PatchOperation, ReplaceOperation, SparkTaskContext, UpsertOperation}
import com.azure.cosmos.{CosmosAsyncContainer, CosmosException}
import com.fasterxml.jackson.databind.node.ObjectNode
import org.apache.spark.TaskContext
import reactor.core.scala.publisher.SMono.PimpJMono

import java.util.UUID
import java.util.concurrent.atomic.{AtomicBoolean, AtomicReference}
import java.util.concurrent.{Callable, CompletableFuture, ExecutorService, SynchronousQueue, ThreadPoolExecutor, TimeUnit}
import scala.collection.concurrent.TrieMap
import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.duration.Duration
import scala.concurrent.{Await, Future, Promise}
import scala.util.{Failure, Success, Try}

// scalastyle:off underscore.import
import scala.compat.java8.FutureConverters._
// scalastyle:on underscore.import

private class PointWriter(container: CosmosAsyncContainer,
                  partitionKeyDefinition: PartitionKeyDefinition,
                  cosmosWriteConfig: CosmosWriteConfig,
                  diagnosticsConfig: DiagnosticsConfig,
                  taskContext: TaskContext,
                  outputMetricsPublisher: OutputMetricsPublisherTrait)
  extends AsyncItemWriter {

  @transient private val log = LoggerHelper.getLogger(diagnosticsConfig, this.getClass)

  private val maxConcurrency = cosmosWriteConfig.pointMaxConcurrency
    .getOrElse(SparkUtils.getNumberOfHostCPUCores * MaxNumberOfThreadsPerCPUCore)

  val executorService: ExecutorService = new ThreadPoolExecutor(
    maxConcurrency,
    maxConcurrency,
    0L,
    TimeUnit.MILLISECONDS,
    // A synchronous queue does not have any internal capacity, not even a capacity of one.
    new SynchronousQueue(),
    SparkUtils.daemonThreadFactory(),
    // if all worker threads are busy,
    // this policy makes the caller thread execute the task.
    // This provides a simple feedback control mechanism that will slow down the rate that new tasks are submitted.
    new ThreadPoolExecutor.CallerRunsPolicy()
  )

  private val capturedFailure = new AtomicReference[Throwable]()
  private val pendingPointWrites = new TrieMap[Future[Unit], Boolean]()
  private val closed = new AtomicBoolean(false)

  private val diagnosticsContext: DiagnosticsContext = DiagnosticsContext(UUIDs.nonBlockingRandomUUID(), "PointWriter")

  private  val taskDiagnosticsContext = SparkTaskContext(diagnosticsContext.correlationActivityId,
    taskContext.stageId(),
    taskContext.partitionId(),
    taskContext.taskAttemptId(),
    "PointWriter")

  private val cosmosPatchHelpOpt = cosmosWriteConfig.itemWriteStrategy match {
    case ItemWriteStrategy.ItemPatch | ItemWriteStrategy.ItemBulkUpdate =>
        Some(new CosmosPatchHelper(diagnosticsConfig, cosmosWriteConfig.patchConfigs.get))
    case _ => None
  }

  override def scheduleWrite(partitionKeyValue: PartitionKey, objectNode: ObjectNode): Unit = {
    checkState(!closed.get())

    val etag = getETag(objectNode)

    cosmosWriteConfig.itemWriteStrategy match {
      case ItemWriteStrategy.ItemOverwrite => upsertWithRetryAsync(partitionKeyValue, objectNode)
      case ItemWriteStrategy.ItemOverwriteIfNotModified =>
        etag match {
          case Some(e) => replaceIfNotModifiedWithRetryAsync(partitionKeyValue, objectNode, e)
          case None => createWithRetryAsync(partitionKeyValue, objectNode)
        }
      case ItemWriteStrategy.ItemAppend => createWithRetryAsync(partitionKeyValue, objectNode)
      case ItemWriteStrategy.ItemDelete =>
        deleteWithRetryAsync(partitionKeyValue, objectNode, onlyIfNotModified=false)
      case ItemWriteStrategy.ItemDeleteIfNotModified =>
        deleteWithRetryAsync(partitionKeyValue, objectNode, onlyIfNotModified=true)
      case ItemWriteStrategy.ItemPatch =>
        patchWithRetryAsync(partitionKeyValue, objectNode)
      case ItemWriteStrategy.ItemBulkUpdate =>
        patchBulkUpdateWithRetry(partitionKeyValue, objectNode)
    }
  }

  // scalastyle:off return
  override def flushAndClose() : Unit = {
    this.synchronized {
      try {
        if (!closed.compareAndSet(false, true)) {
          return
        }

        log.logInfo(s"flushAndClose invoked, $getThreadInfo")
        log.logInfo(s"Pending tasks ${pendingPointWrites.size},$getThreadInfo")

        // TODO: better error handling here
        // Instead of waiting all operations to finish, if there is any exception signal, fail fast
        for ((future, _) <- pendingPointWrites.snapshot()) {
          Try(Await.result(future, Duration.Inf))
        }

        throwIfCapturedExceptionExists()
      } finally {
        executorService.shutdown()
      }
    }
  }

  private[this] def throwIfCapturedExceptionExists(): Unit = {
    val errorSnapshot = capturedFailure.get()
    if (errorSnapshot != null) {
      log.logError(s"throw captured error ${errorSnapshot.getMessage} $getThreadInfo")
      throw errorSnapshot
    }
  }

  private def createWithRetryAsync(partitionKeyValue: PartitionKey,
                                   objectNode: ObjectNode): Unit = {

    val promise = Promise[Unit]()
    pendingPointWrites.put(promise.future, true)

    val createOperation = CreateOperation(taskDiagnosticsContext,
      CosmosItemIdentifier(objectNode.get(CosmosConstants.Properties.Id).asText(), partitionKeyValue))

    executeAsync(() => createWithRetry(partitionKeyValue, objectNode, createOperation))
      .onComplete {
        case Success(_) =>
          promise.success(Unit)
          pendingPointWrites.remove(promise.future)
          log.logItemWriteCompletion(createOperation)
        case Failure(e) =>
          captureIfFirstFailure(e)
          promise.failure(e)
          log.logItemWriteFailure(createOperation, e)
          pendingPointWrites.remove(promise.future)
      }
  }

  private def upsertWithRetryAsync(partitionKeyValue: PartitionKey,
                                   objectNode: ObjectNode): Unit = {
    val promise = Promise[Unit]()
    pendingPointWrites.put(promise.future, true)

    val upsertOperation = UpsertOperation(taskDiagnosticsContext,
      CosmosItemIdentifier(objectNode.get(CosmosConstants.Properties.Id).asText(), partitionKeyValue))

    executeAsync(() => upsertWithRetry(partitionKeyValue, objectNode, upsertOperation))
      .onComplete {
        case Success(_) =>
          promise.success(Unit)
          pendingPointWrites.remove(promise.future)
          log.logItemWriteCompletion(upsertOperation)
        case Failure(e) =>
          captureIfFirstFailure(e)
          promise.failure(e)
          pendingPointWrites.remove(promise.future)
          log.logItemWriteFailure(upsertOperation, e)
      }
  }

  private def deleteWithRetryAsync(partitionKeyValue: PartitionKey,
                                   objectNode: ObjectNode,
                                   onlyIfNotModified: Boolean): Unit = {

    val promise = Promise[Unit]()
    pendingPointWrites.put(promise.future, true)

    val deleteOperation = DeleteOperation(taskDiagnosticsContext,
      CosmosItemIdentifier(objectNode.get(CosmosConstants.Properties.Id).asText(), partitionKeyValue))

    executeAsync(() => deleteWithRetry(partitionKeyValue, objectNode, onlyIfNotModified, deleteOperation))
      .onComplete {
        case Success(_) =>
          promise.success(Unit)
          pendingPointWrites.remove(promise.future)
          log.logItemWriteCompletion(deleteOperation)
        case Failure(e) =>
          captureIfFirstFailure(e)
          promise.failure(e)
          pendingPointWrites.remove(promise.future)
          log.logItemWriteFailure(deleteOperation, e)
      }
  }

  private def patchWithRetryAsync(partitionKeyValue: PartitionKey,
                                  objectNode: ObjectNode): Unit = {
    val promise = Promise[Unit]()
    pendingPointWrites.put(promise.future, true)

    val patchOperation = PatchOperation(taskDiagnosticsContext,
      CosmosItemIdentifier(objectNode.get(CosmosConstants.Properties.Id).asText(), partitionKeyValue))

    executeAsync(() => patchWithRetry(partitionKeyValue, objectNode, patchOperation))
     .onComplete {
       case Success(_) =>
         promise.success(Unit)
         pendingPointWrites.remove(promise.future)
         log.logItemWriteCompletion(patchOperation)
       case Failure(e) =>
         captureIfFirstFailure(e)
         promise.failure(e)
         pendingPointWrites.remove(promise.future)
         log.logItemWriteFailure(patchOperation, e)
     }
  }

  private def replaceIfNotModifiedWithRetryAsync
  (
    partitionKeyValue: PartitionKey,
    objectNode: ObjectNode,
    etag: String
  ): Unit = {

    val promise = Promise[Unit]()
    pendingPointWrites.put(promise.future, true)

    val replaceOperation = ReplaceOperation(taskDiagnosticsContext,
      CosmosItemIdentifier(objectNode.get(CosmosConstants.Properties.Id).asText(), partitionKeyValue))

    executeAsync(() => replaceIfNotModifiedWithRetry(partitionKeyValue, objectNode, etag, replaceOperation))
      .onComplete {
        case Success(_) =>
          promise.success(Unit)
          pendingPointWrites.remove(promise.future)
          log.logItemWriteCompletion(replaceOperation)
        case Failure(e) =>
          captureIfFirstFailure(e)
          promise.failure(e)
          pendingPointWrites.remove(promise.future)
          log.logItemWriteFailure(replaceOperation, e)
      }
  }

  // scalastyle:off multiple.string.literals
  private def createWithRetry(partitionKeyValue: PartitionKey,
                              objectNode: ObjectNode,
                              createOperation: CreateOperation): Unit = {

    var exceptionOpt = Option.empty[Exception]
    for (attempt <- 0 to cosmosWriteConfig.maxRetryCount) {
      try {
        val response: CosmosItemResponse[ObjectNode] =
          container.createItem(objectNode, partitionKeyValue, getOptions).block()

        outputMetricsPublisher.trackWriteOperation(
          1,
          Option.apply(response.getDiagnostics) match {
            case Some(diagnostics) => Option.apply(diagnostics.getDiagnosticsContext)
            case None => None
          })

        return
      } catch {
        case e: CosmosException if Exceptions.isResourceExistsException(e.getStatusCode) =>
          log.logItemWriteDetails(createOperation, "item already exists")
          outputMetricsPublisher.trackWriteOperation(
            0,
            Option.apply(e.getDiagnostics) match {
              case Some(diagnostics) => Option.apply(diagnostics.getDiagnosticsContext)
              case None => None
            })
          return
        case e: CosmosException if Exceptions.canBeTransientFailure(e.getStatusCode, e.getSubStatusCode) =>
          log.logWarning(
            s"create item $createOperation attempt #$attempt max remaining retries"
              + s"${cosmosWriteConfig.maxRetryCount - attempt}, encountered ${e.getMessage}")
          outputMetricsPublisher.trackWriteOperation(
            0,
            Option.apply(e.getDiagnostics) match {
              case Some(diagnostics) => Option.apply(diagnostics.getDiagnosticsContext)
              case None => None
            })
          exceptionOpt = Option.apply(e)
      }
    }

    assert(exceptionOpt.isDefined)
    throw exceptionOpt.get
  }

  // scalastyle:on multiple.string.literals
  private def upsertWithRetry(partitionKeyValue: PartitionKey,
                              objectNode: ObjectNode,
                              upsertOperation: UpsertOperation): Unit = {

    var exceptionOpt = Option.empty[Exception]
    for (attempt <- 0 to cosmosWriteConfig.maxRetryCount) {
      try {
        val response : CosmosItemResponse[ObjectNode] = container.upsertItem(objectNode,
          partitionKeyValue,
          getOptions)
          .block()

        outputMetricsPublisher.trackWriteOperation(
          1,
          Option.apply(response.getDiagnostics) match {
            case Some(diagnostics) => Option.apply(diagnostics.getDiagnosticsContext)
            case None => None
          })

        return
      } catch {
        case e: CosmosException if (Exceptions.canBeTransientFailure(e.getStatusCode, e.getSubStatusCode) ||
          Exceptions.isNotFoundExceptionCore(e.getStatusCode, e.getSubStatusCode) ||
          e.getStatusCode == 0) => // Gateway mode reports inability to connect due to PoolAcquirePendingLimitException as status code 0
          log.logWarning(
            s"upsert item $upsertOperation attempt #$attempt max remaining retries "
              + s"${cosmosWriteConfig.maxRetryCount - attempt}, encountered ${e.getMessage}")
          outputMetricsPublisher.trackWriteOperation(
            0,
            Option.apply(e.getDiagnostics) match {
              case Some(diagnostics) => Option.apply(diagnostics.getDiagnosticsContext)
              case None => None
            })
          exceptionOpt = Option.apply(e)
      }
    }

    log.logItemWriteFailure(upsertOperation, exceptionOpt.get)
    assert(exceptionOpt.isDefined)
    exceptionOpt.get.printStackTrace()
    throw exceptionOpt.get
  }
  // scalastyle:on return

  // scalastyle:on multiple.string.literals
  private def patchWithRetry(partitionKeyValue: PartitionKey,
                             objectNode: ObjectNode,
                             patchOperation: PatchOperation): Unit = {

    var exceptionOpt = Option.empty[Exception]

    for (attempt <- 0 to cosmosWriteConfig.maxRetryCount) {
      try {
        val response: CosmosItemResponse[ObjectNode] =
          patchItem(container, partitionKeyValue, objectNode)

        outputMetricsPublisher.trackWriteOperation(
          1,
          Option.apply(response.getDiagnostics) match {
            case Some(diagnostics) => Option.apply(diagnostics.getDiagnosticsContext)
            case None => None
          })

        return
      } catch {
        case e: CosmosException if Exceptions.canBeTransientFailure(e.getStatusCode, e.getSubStatusCode) =>
          log.logWarning(
            s"patch item $patchOperation attempt #$attempt max remaining retries "
             + s"${cosmosWriteConfig.maxRetryCount - attempt}, encountered ${e.getMessage}")
          outputMetricsPublisher.trackWriteOperation(
            0,
            Option.apply(e.getDiagnostics) match {
              case Some(diagnostics) => Option.apply(diagnostics.getDiagnosticsContext)
              case None => None
            })
          exceptionOpt = Option.apply(e)
      }
    }

    log.logItemWriteFailure(patchOperation, exceptionOpt.get)
    assert(exceptionOpt.isDefined)
    exceptionOpt.get.printStackTrace()
    throw exceptionOpt.get
  }
  // scalastyle:on return

  // scalastyle:on multiple.string.literals
  private def patchBulkUpdateWithRetry(
                                      partitionKeyValue: PartitionKey,
                                      objectNode: ObjectNode): Unit = {

      var exceptionOpt = Option.empty[Exception]
      val patchBulkUpdateOperation = PatchBulkUpdateOperation(taskDiagnosticsContext,
          CosmosItemIdentifier(objectNode.get(CosmosConstants.Properties.Id).asText(), partitionKeyValue))

      for (attempt <- 0 to cosmosWriteConfig.maxRetryCount) {
          try {
              val response: CosmosItemResponse[ObjectNode] =
                patchBulkUpdateItem(container, partitionKeyValue, objectNode)

              outputMetricsPublisher.trackWriteOperation(
                1,
                Option.apply(response.getDiagnostics) match {
                  case Some(diagnostics) => Option.apply(diagnostics.getDiagnosticsContext)
                  case None => None
                })

              return
          } catch {
              case e: CosmosException if Exceptions.canBeTransientFailure(e.getStatusCode, e.getSubStatusCode) ||
              Exceptions.isPreconditionFailedException(e.getStatusCode) ||
              Exceptions.isResourceExistsException(e.getStatusCode) =>
                  log.logWarning(
                      s"patch update item $patchBulkUpdateOperation attempt #$attempt max remaining retries "
                          + s"${cosmosWriteConfig.maxRetryCount - attempt}, encountered ${e.getMessage}")

                  outputMetricsPublisher.trackWriteOperation(
                    0,
                    Option.apply(e.getDiagnostics) match {
                      case Some(diagnostics) => Option.apply(diagnostics.getDiagnosticsContext)
                      case None => None
                    })

                  exceptionOpt = Option.apply(e)
          }
      }

      log.logItemWriteFailure(patchBulkUpdateOperation, exceptionOpt.get)
      assert(exceptionOpt.isDefined)
      exceptionOpt.get.printStackTrace()
      throw exceptionOpt.get
  }
  // scalastyle:on return

  private[this] def patchBulkUpdateItem(container: CosmosAsyncContainer,
                                    partitionKey: PartitionKey,
                                    objectNode: ObjectNode): CosmosItemResponse[ObjectNode] = {
      assert(cosmosPatchHelpOpt.isDefined)

      val itemId = objectNode.get(CosmosConstants.Properties.Id).asText()
      val patchBulkUpdateOperations = cosmosPatchHelpOpt.get.createCosmosPatchBulkUpdateOperations(objectNode)

      container
        .readItem(itemId, partitionKey, classOf[ObjectNode])
        .flatMap(response => {
          outputMetricsPublisher.trackWriteOperation(
            0,
            Option.apply(response.getDiagnostics) match {
              case Some(diagnostics) => Option.apply(diagnostics.getDiagnosticsContext)
              case None => None
            })
          val updatedNode = cosmosPatchHelpOpt.get.patchBulkUpdateItem(Some(response.getItem), patchBulkUpdateOperations)
          val cosmosItemRequestOptions = new CosmosItemRequestOptions().setIfMatchETag(response.getETag)
          container.replaceItem(updatedNode, itemId, partitionKey, cosmosItemRequestOptions)
        })
        .asScala
        .onErrorResume {
          case e: CosmosException if Exceptions.isNotFoundException(e) =>
            outputMetricsPublisher.trackWriteOperation(
              0,
              Option.apply(e.getDiagnostics) match {
                case Some(diagnostics) => Option.apply(diagnostics.getDiagnosticsContext)
                case None => None
              })
            val updatedNode = cosmosPatchHelpOpt.get.patchBulkUpdateItem(None, patchBulkUpdateOperations)
            container.createItem(updatedNode, partitionKey, new CosmosItemRequestOptions()).asScala
        }
        .block()

  }

  private[this] def patchItem(container: CosmosAsyncContainer,
                              partitionKey: PartitionKey,
                              objectNode: ObjectNode): CosmosItemResponse[ObjectNode] = {

    assert(cosmosWriteConfig.patchConfigs.isDefined)
    assert(cosmosPatchHelpOpt.isDefined)

    val patchConfigs = cosmosWriteConfig.patchConfigs.get
    val cosmosPatchHelper = cosmosPatchHelpOpt.get
    val itemId = objectNode.get(CosmosConstants.Properties.Id).asText()

    val cosmosPatchOperations = cosmosPatchHelper.createCosmosPatchOperations(itemId, partitionKeyDefinition, objectNode)
    val requestOptions = this.getPatchOption

    if (patchConfigs.filter.isDefined && !StringUtils.isEmpty(patchConfigs.filter.get)) {
      requestOptions.setFilterPredicate(patchConfigs.filter.get)
    }

    container.patchItem(itemId, partitionKey, cosmosPatchOperations, requestOptions, classOf[ObjectNode]).block
  }

  // scalastyle:off return
  private def deleteWithRetry(partitionKeyValue: PartitionKey,
                              objectNode: ObjectNode,
                              onlyIfNotModified: Boolean,
                              deleteOperation: DeleteOperation): Unit = {

    var exceptionOpt = Option.empty[Exception]
    for (attempt <- 0 to cosmosWriteConfig.maxRetryCount) {
      try {
        val itemId = objectNode.get(CosmosConstants.Properties.Id).asText()

        val options = if (onlyIfNotModified) {
          getOptions
            .setIfMatchETag(objectNode.get(CosmosConstants.Properties.ETag).asText())
        } else {
          getOptions
        }

        val response: CosmosItemResponse[_] = container.deleteItem(itemId,
          partitionKeyValue,
          options)
          .block()

        outputMetricsPublisher.trackWriteOperation(
          1,
          Option.apply(response.getDiagnostics) match {
            case Some(diagnostics) => Option.apply(diagnostics.getDiagnosticsContext)
            case None => None
          })

        return
      } catch {
        case e: CosmosException if Exceptions.isNotFoundExceptionCore(e.getStatusCode, e.getSubStatusCode) =>
          log.logItemWriteSkipped(deleteOperation, "notFound")
          outputMetricsPublisher.trackWriteOperation(
            0,
            Option.apply(e.getDiagnostics) match {
              case Some(diagnostics) => Option.apply(diagnostics.getDiagnosticsContext)
              case None => None
            })
          return
        case e: CosmosException if Exceptions.isPreconditionFailedException(e.getStatusCode) && onlyIfNotModified =>
          log.logItemWriteSkipped(deleteOperation, "preConditionNotMet")
          outputMetricsPublisher.trackWriteOperation(
            0,
            Option.apply(e.getDiagnostics) match {
              case Some(diagnostics) => Option.apply(diagnostics.getDiagnosticsContext)
              case None => None
            })
          return
        case e: CosmosException if Exceptions.canBeTransientFailure(e.getStatusCode, e.getSubStatusCode) =>
          log.logWarning(
            s"delete item attempt #$attempt max remaining retries"
              + s"${cosmosWriteConfig.maxRetryCount - attempt}, encountered ${e.getMessage}")
          outputMetricsPublisher.trackWriteOperation(
            0,
            Option.apply(e.getDiagnostics) match {
              case Some(diagnostics) => Option.apply(diagnostics.getDiagnosticsContext)
              case None => None
            })
          exceptionOpt = Option.apply(e)
      }
    }

    assert(exceptionOpt.isDefined)
    throw exceptionOpt.get
  }
  // scalastyle:on return

  // scalastyle:off return
  private def replaceIfNotModifiedWithRetry
  (
    partitionKeyValue: PartitionKey,
    objectNode: ObjectNode,
    etag: String,
    replaceOperation: ReplaceOperation
  ): Unit = {

    var exceptionOpt = Option.empty[Exception]
    for (attempt <- 0 to cosmosWriteConfig.maxRetryCount) {
      try {
        val itemId = objectNode.get(CosmosConstants.Properties.Id).asText()

        val options = getOptions
          .setIfMatchETag(etag)
          .setContentResponseOnWriteEnabled(false)

        val response: CosmosItemResponse[ObjectNode] = container.replaceItem(
          objectNode,
          itemId,
          partitionKeyValue,
          options)
          .block()

        outputMetricsPublisher.trackWriteOperation(
          1,
          Option.apply(response.getDiagnostics) match {
            case Some(diagnostics) => Option.apply(diagnostics.getDiagnosticsContext)
            case None => None
          })

        return
      } catch {
        case e: CosmosException if Exceptions.isNotFoundExceptionCore(e.getStatusCode, e.getSubStatusCode) =>
          log.logItemWriteSkipped(replaceOperation, "notFound")
          outputMetricsPublisher.trackWriteOperation(
            0,
            Option.apply(e.getDiagnostics) match {
              case Some(diagnostics) => Option.apply(diagnostics.getDiagnosticsContext)
              case None => None
            })
          return
        case e: CosmosException if Exceptions.isPreconditionFailedException(e.getStatusCode) =>
          log.logItemWriteSkipped(replaceOperation, "preConditionNotMet")
          outputMetricsPublisher.trackWriteOperation(
            0,
            Option.apply(e.getDiagnostics) match {
              case Some(diagnostics) => Option.apply(diagnostics.getDiagnosticsContext)
              case None => None
            })
          return
        case e: CosmosException if Exceptions.canBeTransientFailure(e.getStatusCode, e.getSubStatusCode) =>
          log.logWarning(
            s"replace item if not modified attempt #$attempt max remaining retries"
              + s"${cosmosWriteConfig.maxRetryCount - attempt}, encountered ${e.getMessage}")
          outputMetricsPublisher.trackWriteOperation(
            0,
            Option.apply(e.getDiagnostics) match {
              case Some(diagnostics) => Option.apply(diagnostics.getDiagnosticsContext)
              case None => None
            })
          exceptionOpt = Option.apply(e)
      }
    }

    assert(exceptionOpt.isDefined)
    throw exceptionOpt.get
  }
  // scalastyle:on return

  private def executeAsync(work: () => Any) : Future[Unit] = {
    val future = new CompletableFuture[Unit]()
    executorService.submit(new Callable[Unit] {
      override def call(): Unit = {
        try {
          work()
          future.complete(Unit)
        } catch {
          case e: Exception =>
            future.completeExceptionally(e)
        }
      }
    })
    future.toScala
  }

  private def getOptions(itemOption: CosmosItemRequestOptions): CosmosItemRequestOptions = {
    if (diagnosticsConfig.mode.isDefined) {
      val taskDiagnosticsContext = SparkTaskContext(
        diagnosticsContext.correlationActivityId,
        taskContext.stageId(),
        taskContext.partitionId(),
        taskContext.taskAttemptId(),
        "")

      val listener: OperationListener =
        DiagnosticsLoader.getDiagnosticsProvider(diagnosticsConfig).getLogger(this.getClass)

      val operationContextAndListenerTuple = new OperationContextAndListenerTuple(taskDiagnosticsContext, listener)
      CosmosItemRequestOptionsHelper
       .getCosmosItemRequestOptionsAccessor
       .setOperationContext(itemOption, operationContextAndListenerTuple)
    }

    ThroughputControlHelper.populateThroughputControlGroupName(itemOption, cosmosWriteConfig.throughputControlConfig)
    itemOption
  }

  private def getOptions: CosmosItemRequestOptions = {
    this.getOptions(new CosmosItemRequestOptions())
  }

  private def getPatchOption: CosmosPatchItemRequestOptions = {
    val patchItemRequestOptions =  new CosmosPatchItemRequestOptions()
    this.getOptions(patchItemRequestOptions).asInstanceOf[CosmosPatchItemRequestOptions]
  }

  /**
   * Don't wait for any remaining work but signal to the writer the ungraceful close
   * Should not throw any exceptions
   */
  override def abort(shouldThrow: Boolean): Unit = {
    if (shouldThrow) {
      // signal an exception that will be thrown for any pending work/flushAndClose if no other exception has
      // been registered
      captureIfFirstFailure(
        new IllegalStateException(s"The Spark task was aborted, Context: ${taskDiagnosticsContext.toString}"))
    }

    closed.set(true)

    try {
      executorService.shutdownNow()
    } catch {
      case e: Throwable =>
        log.logWarning(s"Exception when trying to shut down executor service", e)
    }
  }

  private def captureIfFirstFailure(throwable: Throwable): Unit = {
    log.logError(s"capture failure, Context: {${taskDiagnosticsContext.toString}}", throwable)
    //scalastyle:off null
    capturedFailure.compareAndSet(null, throwable)
    //scalastyle:on null
  }
}

private object PointWriter {
  val MaxNumberOfThreadsPerCPUCore = 50
}
