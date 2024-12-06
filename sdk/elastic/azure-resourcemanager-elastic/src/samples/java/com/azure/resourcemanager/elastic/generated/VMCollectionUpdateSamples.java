// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.elastic.generated;

/**
 * Samples for VMCollection Update.
 */
public final class VMCollectionUpdateSamples {
    /*
     * x-ms-original-file:
     * specification/elastic/resource-manager/Microsoft.Elastic/stable/2024-03-01/examples/VMCollection_Update.json
     */
    /**
     * Sample code: VMCollection_Update.
     * 
     * @param manager Entry point to ElasticManager.
     */
    public static void vMCollectionUpdate(com.azure.resourcemanager.elastic.ElasticManager manager) {
        manager.vMCollections()
            .updateWithResponse("myResourceGroup", "myMonitor", null, com.azure.core.util.Context.NONE);
    }
}
