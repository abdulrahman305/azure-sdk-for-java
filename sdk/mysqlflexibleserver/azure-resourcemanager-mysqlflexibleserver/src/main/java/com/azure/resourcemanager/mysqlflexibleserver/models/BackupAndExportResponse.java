// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mysqlflexibleserver.models;

import com.azure.core.management.exception.ManagementError;
import com.azure.resourcemanager.mysqlflexibleserver.fluent.models.BackupAndExportResponseInner;
import java.time.OffsetDateTime;

/** An immutable client-side representation of BackupAndExportResponse. */
public interface BackupAndExportResponse {
    /**
     * Gets the id property: Fully qualified resource Id for the resource.
     *
     * @return the id value.
     */
    String id();

    /**
     * Gets the name property: The name of the resource.
     *
     * @return the name value.
     */
    String name();

    /**
     * Gets the type property: The type of the resource.
     *
     * @return the type value.
     */
    String type();

    /**
     * Gets the status property: The operation status.
     *
     * @return the status value.
     */
    OperationStatus status();

    /**
     * Gets the startTime property: Start time.
     *
     * @return the startTime value.
     */
    OffsetDateTime startTime();

    /**
     * Gets the endTime property: End time.
     *
     * @return the endTime value.
     */
    OffsetDateTime endTime();

    /**
     * Gets the percentComplete property: Operation progress (0-100).
     *
     * @return the percentComplete value.
     */
    Double percentComplete();

    /**
     * Gets the error property: Error Response
     *
     * <p>The BackupAndExport operation error response.
     *
     * @return the error value.
     */
    ManagementError error();

    /**
     * Gets the datasourceSizeInBytes property: Size of datasource in bytes.
     *
     * @return the datasourceSizeInBytes value.
     */
    Long datasourceSizeInBytes();

    /**
     * Gets the dataTransferredInBytes property: Data transferred in bytes.
     *
     * @return the dataTransferredInBytes value.
     */
    Long dataTransferredInBytes();

    /**
     * Gets the backupMetadata property: Metadata related to backup to be stored for restoring resource in key-value
     * pairs.
     *
     * @return the backupMetadata value.
     */
    String backupMetadata();

    /**
     * Gets the inner com.azure.resourcemanager.mysqlflexibleserver.fluent.models.BackupAndExportResponseInner object.
     *
     * @return the inner object.
     */
    BackupAndExportResponseInner innerModel();
}