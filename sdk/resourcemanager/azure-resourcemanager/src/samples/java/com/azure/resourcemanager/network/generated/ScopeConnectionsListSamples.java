// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated;

/**
 * Samples for ScopeConnections List.
 */
public final class ScopeConnectionsListSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2024-07-01/examples/
     * NetworkManagerScopeConnectionList.json
     */
    /**
     * Sample code: List Network Manager Scope Connection.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void listNetworkManagerScopeConnection(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.networks()
            .manager()
            .serviceClient()
            .getScopeConnections()
            .list("rg1", "testNetworkManager", null, null, com.azure.core.util.Context.NONE);
    }
}
