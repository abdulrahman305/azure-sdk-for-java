// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated;

/**
 * Samples for AvailableResourceGroupDelegations List.
 */
public final class AvailableResourceGroupDelegationsListSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2024-07-01/examples/
     * AvailableDelegationsResourceGroupGet.json
     */
    /**
     * Sample code: Get available delegations in the resource group.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void getAvailableDelegationsInTheResourceGroup(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.networks()
            .manager()
            .serviceClient()
            .getAvailableResourceGroupDelegations()
            .list("westcentralus", "rg1", com.azure.core.util.Context.NONE);
    }
}
