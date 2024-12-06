// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.logz.models;

import com.azure.core.management.SystemData;
import com.azure.resourcemanager.logz.fluent.models.MonitoredResourceInner;

/**
 * An immutable client-side representation of MonitoredResource.
 */
public interface MonitoredResource {
    /**
     * Gets the id property: The ARM id of the resource.
     * 
     * @return the id value.
     */
    String id();

    /**
     * Gets the sendingMetrics property: Flag indicating if resource is sending metrics to Logz.
     * 
     * @return the sendingMetrics value.
     */
    Boolean sendingMetrics();

    /**
     * Gets the reasonForMetricsStatus property: Reason for why the resource is sending metrics (or why it is not
     * sending).
     * 
     * @return the reasonForMetricsStatus value.
     */
    String reasonForMetricsStatus();

    /**
     * Gets the sendingLogs property: Flag indicating if resource is sending logs to Logz.
     * 
     * @return the sendingLogs value.
     */
    Boolean sendingLogs();

    /**
     * Gets the systemData property: Metadata pertaining to creation and last modification of the resource.
     * 
     * @return the systemData value.
     */
    SystemData systemData();

    /**
     * Gets the reasonForLogsStatus property: Reason for why the resource is sending logs (or why it is not sending).
     * 
     * @return the reasonForLogsStatus value.
     */
    String reasonForLogsStatus();

    /**
     * Gets the inner com.azure.resourcemanager.logz.fluent.models.MonitoredResourceInner object.
     * 
     * @return the inner object.
     */
    MonitoredResourceInner innerModel();
}
