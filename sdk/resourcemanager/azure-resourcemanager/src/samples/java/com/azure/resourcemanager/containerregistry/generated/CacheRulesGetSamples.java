// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerregistry.generated;

/**
 * Samples for CacheRules Get.
 */
public final class CacheRulesGetSamples {
    /*
     * x-ms-original-file:
     * specification/containerregistry/resource-manager/Microsoft.ContainerRegistry/stable/2025-04-01/examples/
     * CacheRuleGet.json
     */
    /**
     * Sample code: CacheRuleGet.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void cacheRuleGet(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.containerRegistries()
            .manager()
            .serviceClient()
            .getCacheRules()
            .getWithResponse("myResourceGroup", "myRegistry", "myCacheRule", com.azure.core.util.Context.NONE);
    }
}
