// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.ai.agents.persistent;

import com.azure.ai.agents.persistent.implementation.VectorStoreFilesImpl;
import com.azure.ai.agents.persistent.implementation.models.CreateVectorStoreFileRequest;
import com.azure.ai.agents.persistent.models.ListSortOrder;
import com.azure.ai.agents.persistent.models.VectorStoreChunkingStrategyRequest;
import com.azure.ai.agents.persistent.models.VectorStoreDataSource;
import com.azure.ai.agents.persistent.models.VectorStoreFile;
import com.azure.ai.agents.persistent.models.VectorStoreFileDeletionStatus;
import com.azure.ai.agents.persistent.models.VectorStoreFileStatusFilter;
import com.azure.core.annotation.Generated;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceClient;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.exception.ClientAuthenticationException;
import com.azure.core.exception.HttpResponseException;
import com.azure.core.exception.ResourceModifiedException;
import com.azure.core.exception.ResourceNotFoundException;
import com.azure.core.http.rest.PagedFlux;
import com.azure.core.http.rest.PagedResponse;
import com.azure.core.http.rest.PagedResponseBase;
import com.azure.core.http.rest.RequestOptions;
import com.azure.core.http.rest.Response;
import com.azure.core.util.BinaryData;
import com.azure.core.util.FluxUtil;
import java.util.stream.Collectors;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * Initializes a new instance of the asynchronous PersistentAgentsAdministrationClient type.
 */
@ServiceClient(builder = PersistentAgentsAdministrationClientBuilder.class, isAsync = true)
public final class VectorStoreFilesAsyncClient {

    @Generated
    private final VectorStoreFilesImpl serviceClient;

    /**
     * Initializes an instance of VectorStoreFilesAsyncClient class.
     *
     * @param serviceClient the service client implementation.
     */
    @Generated
    VectorStoreFilesAsyncClient(VectorStoreFilesImpl serviceClient) {
        this.serviceClient = serviceClient;
    }

    /**
     * Create a vector store file by attaching a file to a vector store.
     * <p><strong>Request Body Schema</strong></p>
     * 
     * <pre>
     * {@code
     * {
     *     file_id: String (Optional)
     *     data_source (Optional): {
     *         uri: String (Required)
     *         type: String(uri_asset/id_asset) (Required)
     *     }
     *     chunking_strategy (Optional): {
     *         type: String(auto/static) (Required)
     *     }
     * }
     * }
     * </pre>
     * 
     * <p><strong>Response Body Schema</strong></p>
     * 
     * <pre>
     * {@code
     * {
     *     id: String (Required)
     *     object: String (Required)
     *     usage_bytes: int (Required)
     *     created_at: long (Required)
     *     vector_store_id: String (Required)
     *     status: String(in_progress/completed/failed/cancelled) (Required)
     *     last_error (Required): {
     *         code: String(server_error/invalid_file/unsupported_file) (Required)
     *         message: String (Required)
     *     }
     *     chunking_strategy (Required): {
     *         type: String(other/static) (Required)
     *     }
     * }
     * }
     * </pre>
     *
     * @param vectorStoreId Identifier of the vector store.
     * @param createVectorStoreFileRequest The createVectorStoreFileRequest parameter.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return description of a file attached to a vector store along with {@link Response} on successful completion of
     * {@link Mono}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<BinaryData>> createVectorStoreFileWithResponse(String vectorStoreId,
        BinaryData createVectorStoreFileRequest, RequestOptions requestOptions) {
        return this.serviceClient.createVectorStoreFileWithResponseAsync(vectorStoreId, createVectorStoreFileRequest,
            requestOptions);
    }

    /**
     * Retrieves a vector store file.
     * <p><strong>Response Body Schema</strong></p>
     * 
     * <pre>
     * {@code
     * {
     *     id: String (Required)
     *     object: String (Required)
     *     usage_bytes: int (Required)
     *     created_at: long (Required)
     *     vector_store_id: String (Required)
     *     status: String(in_progress/completed/failed/cancelled) (Required)
     *     last_error (Required): {
     *         code: String(server_error/invalid_file/unsupported_file) (Required)
     *         message: String (Required)
     *     }
     *     chunking_strategy (Required): {
     *         type: String(other/static) (Required)
     *     }
     * }
     * }
     * </pre>
     *
     * @param vectorStoreId Identifier of the vector store.
     * @param fileId Identifier of the file.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return description of a file attached to a vector store along with {@link Response} on successful completion of
     * {@link Mono}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<BinaryData>> getVectorStoreFileWithResponse(String vectorStoreId, String fileId,
        RequestOptions requestOptions) {
        return this.serviceClient.getVectorStoreFileWithResponseAsync(vectorStoreId, fileId, requestOptions);
    }

    /**
     * Deletes a vector store file. This removes the file‐to‐store link (does not delete the file itself).
     * <p><strong>Response Body Schema</strong></p>
     * 
     * <pre>
     * {@code
     * {
     *     id: String (Required)
     *     deleted: boolean (Required)
     *     object: String (Required)
     * }
     * }
     * </pre>
     *
     * @param vectorStoreId Identifier of the vector store.
     * @param fileId Identifier of the file.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return response object for deleting a vector store file relationship along with {@link Response} on successful
     * completion of {@link Mono}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<BinaryData>> deleteVectorStoreFileWithResponse(String vectorStoreId, String fileId,
        RequestOptions requestOptions) {
        return this.serviceClient.deleteVectorStoreFileWithResponseAsync(vectorStoreId, fileId, requestOptions);
    }

    /**
     * Returns a list of vector store files.
     *
     * @param vectorStoreId Identifier of the vector store.
     * @param filter Filter by file status.
     * @param limit A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default
     * is 20.
     * @param order Sort order by the created_at timestamp of the objects. asc for ascending order and desc for
     * descending order.
     * @param after A cursor for use in pagination. after is an object ID that defines your place in the list. For
     * instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can
     * include after=obj_foo in order to fetch the next page of the list.
     * @param before A cursor for use in pagination. before is an object ID that defines your place in the list. For
     * instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can
     * include before=obj_foo in order to fetch the previous page of the list.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response data for a requested list of items as paginated response with {@link PagedFlux}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<VectorStoreFile> listVectorStoreFiles(String vectorStoreId, VectorStoreFileStatusFilter filter,
        Integer limit, ListSortOrder order, String after, String before) {
        // Generated convenience method for listVectorStoreFiles
        RequestOptions requestOptions = new RequestOptions();
        if (filter != null) {
            requestOptions.addQueryParam("filter", filter.toString(), false);
        }
        if (limit != null) {
            requestOptions.addQueryParam("limit", String.valueOf(limit), false);
        }
        if (order != null) {
            requestOptions.addQueryParam("order", order.toString(), false);
        }
        if (after != null) {
            requestOptions.addQueryParam("after", after, false);
        }
        if (before != null) {
            requestOptions.addQueryParam("before", before, false);
        }
        PagedFlux<BinaryData> pagedFluxResponse = listVectorStoreFiles(vectorStoreId, requestOptions);
        return PagedFlux.create(() -> (continuationTokenParam, pageSizeParam) -> {
            Flux<PagedResponse<BinaryData>> flux = (continuationTokenParam == null)
                ? pagedFluxResponse.byPage().take(1)
                : pagedFluxResponse.byPage(continuationTokenParam).take(1);
            return flux.map(pagedResponse -> new PagedResponseBase<Void, VectorStoreFile>(pagedResponse.getRequest(),
                pagedResponse.getStatusCode(), pagedResponse.getHeaders(),
                pagedResponse.getValue()
                    .stream()
                    .map(protocolMethodData -> protocolMethodData.toObject(VectorStoreFile.class))
                    .collect(Collectors.toList()),
                pagedResponse.getContinuationToken(), null));
        });
    }

    /**
     * Returns a list of vector store files.
     *
     * @param vectorStoreId Identifier of the vector store.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response data for a requested list of items as paginated response with {@link PagedFlux}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<VectorStoreFile> listVectorStoreFiles(String vectorStoreId) {
        // Generated convenience method for listVectorStoreFiles
        RequestOptions requestOptions = new RequestOptions();
        PagedFlux<BinaryData> pagedFluxResponse = listVectorStoreFiles(vectorStoreId, requestOptions);
        return PagedFlux.create(() -> (continuationTokenParam, pageSizeParam) -> {
            Flux<PagedResponse<BinaryData>> flux = (continuationTokenParam == null)
                ? pagedFluxResponse.byPage().take(1)
                : pagedFluxResponse.byPage(continuationTokenParam).take(1);
            return flux.map(pagedResponse -> new PagedResponseBase<Void, VectorStoreFile>(pagedResponse.getRequest(),
                pagedResponse.getStatusCode(), pagedResponse.getHeaders(),
                pagedResponse.getValue()
                    .stream()
                    .map(protocolMethodData -> protocolMethodData.toObject(VectorStoreFile.class))
                    .collect(Collectors.toList()),
                pagedResponse.getContinuationToken(), null));
        });
    }

    /**
     * Create a vector store file by attaching a file to a vector store.
     *
     * @param vectorStoreId Identifier of the vector store.
     * @param fileId Identifier of the file.
     * @param dataSource Azure asset ID.
     * @param chunkingStrategy The chunking strategy used to chunk the file. If not set, uses the auto strategy.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return description of a file attached to a vector store on successful completion of {@link Mono}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<VectorStoreFile> createVectorStoreFile(String vectorStoreId, String fileId,
        VectorStoreDataSource dataSource, VectorStoreChunkingStrategyRequest chunkingStrategy) {
        // Generated convenience method for createVectorStoreFileWithResponse
        RequestOptions requestOptions = new RequestOptions();
        CreateVectorStoreFileRequest createVectorStoreFileRequestObj
            = new CreateVectorStoreFileRequest().setFileId(fileId)
                .setDataSource(dataSource)
                .setChunkingStrategy(chunkingStrategy);
        BinaryData createVectorStoreFileRequest = BinaryData.fromObject(createVectorStoreFileRequestObj);
        return createVectorStoreFileWithResponse(vectorStoreId, createVectorStoreFileRequest, requestOptions)
            .flatMap(FluxUtil::toMono)
            .map(protocolMethodData -> protocolMethodData.toObject(VectorStoreFile.class));
    }

    /**
     * Create a vector store file by attaching a file to a vector store.
     *
     * @param vectorStoreId Identifier of the vector store.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return description of a file attached to a vector store on successful completion of {@link Mono}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<VectorStoreFile> createVectorStoreFile(String vectorStoreId) {
        // Generated convenience method for createVectorStoreFileWithResponse
        RequestOptions requestOptions = new RequestOptions();
        CreateVectorStoreFileRequest createVectorStoreFileRequestObj = new CreateVectorStoreFileRequest();
        BinaryData createVectorStoreFileRequest = BinaryData.fromObject(createVectorStoreFileRequestObj);
        return createVectorStoreFileWithResponse(vectorStoreId, createVectorStoreFileRequest, requestOptions)
            .flatMap(FluxUtil::toMono)
            .map(protocolMethodData -> protocolMethodData.toObject(VectorStoreFile.class));
    }

    /**
     * Retrieves a vector store file.
     *
     * @param vectorStoreId Identifier of the vector store.
     * @param fileId Identifier of the file.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return description of a file attached to a vector store on successful completion of {@link Mono}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<VectorStoreFile> getVectorStoreFile(String vectorStoreId, String fileId) {
        // Generated convenience method for getVectorStoreFileWithResponse
        RequestOptions requestOptions = new RequestOptions();
        return getVectorStoreFileWithResponse(vectorStoreId, fileId, requestOptions).flatMap(FluxUtil::toMono)
            .map(protocolMethodData -> protocolMethodData.toObject(VectorStoreFile.class));
    }

    /**
     * Deletes a vector store file. This removes the file‐to‐store link (does not delete the file itself).
     *
     * @param vectorStoreId Identifier of the vector store.
     * @param fileId Identifier of the file.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response object for deleting a vector store file relationship on successful completion of {@link Mono}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<VectorStoreFileDeletionStatus> deleteVectorStoreFile(String vectorStoreId, String fileId) {
        // Generated convenience method for deleteVectorStoreFileWithResponse
        RequestOptions requestOptions = new RequestOptions();
        return deleteVectorStoreFileWithResponse(vectorStoreId, fileId, requestOptions).flatMap(FluxUtil::toMono)
            .map(protocolMethodData -> protocolMethodData.toObject(VectorStoreFileDeletionStatus.class));
    }

    /**
     * Returns a list of vector store files.
     * <p><strong>Query Parameters</strong></p>
     * <table border="1">
     * <caption>Query Parameters</caption>
     * <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     * <tr><td>filter</td><td>String</td><td>No</td><td>Filter by file status. Allowed values: "in_progress",
     * "completed", "failed", "cancelled".</td></tr>
     * <tr><td>limit</td><td>Integer</td><td>No</td><td>A limit on the number of objects to be returned. Limit can range
     * between 1 and 100, and the default is 20.</td></tr>
     * <tr><td>order</td><td>String</td><td>No</td><td>Sort order by the created_at timestamp of the objects. asc for
     * ascending order and desc for descending order. Allowed values: "asc", "desc".</td></tr>
     * <tr><td>after</td><td>String</td><td>No</td><td>A cursor for use in pagination. after is an object ID that
     * defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with
     * obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list.</td></tr>
     * <tr><td>before</td><td>String</td><td>No</td><td>A cursor for use in pagination. before is an object ID that
     * defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with
     * obj_foo, your subsequent call can include before=obj_foo in order to fetch the previous page of the
     * list.</td></tr>
     * </table>
     * You can add these to a request with {@link RequestOptions#addQueryParam}
     * <p><strong>Response Body Schema</strong></p>
     * 
     * <pre>
     * {@code
     * {
     *     id: String (Required)
     *     object: String (Required)
     *     usage_bytes: int (Required)
     *     created_at: long (Required)
     *     vector_store_id: String (Required)
     *     status: String(in_progress/completed/failed/cancelled) (Required)
     *     last_error (Required): {
     *         code: String(server_error/invalid_file/unsupported_file) (Required)
     *         message: String (Required)
     *     }
     *     chunking_strategy (Required): {
     *         type: String(other/static) (Required)
     *     }
     * }
     * }
     * </pre>
     *
     * @param vectorStoreId Identifier of the vector store.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the response data for a requested list of items as paginated response with {@link PagedFlux}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<BinaryData> listVectorStoreFiles(String vectorStoreId, RequestOptions requestOptions) {
        return this.serviceClient.listVectorStoreFilesAsync(vectorStoreId, requestOptions);
    }
}
