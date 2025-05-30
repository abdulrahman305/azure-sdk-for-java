// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.edgezones.generated;

/**
 * Samples for Operations List.
 */
public final class OperationsListSamples {
    /*
     * x-ms-original-file:
     * specification/edgezones/resource-manager/Microsoft.EdgeZones/preview/2024-04-01-preview/examples/Operations_List.
     * json
     */
    /**
     * Sample code: ListOperations.
     * 
     * @param manager Entry point to EdgeZonesManager.
     */
    public static void listOperations(com.azure.resourcemanager.edgezones.EdgeZonesManager manager) {
        manager.operations().list(com.azure.core.util.Context.NONE);
    }
}
