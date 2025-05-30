// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.generated;

/**
 * Samples for Logger Get.
 */
public final class LoggerGetSamples {
    /*
     * x-ms-original-file:
     * specification/apimanagement/resource-manager/Microsoft.ApiManagement/stable/2024-05-01/examples/
     * ApiManagementGetLogger.json
     */
    /**
     * Sample code: ApiManagementGetLogger.
     * 
     * @param manager Entry point to ApiManagementManager.
     */
    public static void apiManagementGetLogger(com.azure.resourcemanager.apimanagement.ApiManagementManager manager) {
        manager.loggers().getWithResponse("rg1", "apimService1", "templateLogger", com.azure.core.util.Context.NONE);
    }
}
