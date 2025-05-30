// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated;

/**
 * Samples for ExpressRouteConnections List.
 */
public final class ExpressRouteConnectionsListSamples {
    /*
     * x-ms-original-file:
     * specification/network/resource-manager/Microsoft.Network/stable/2024-07-01/examples/ExpressRouteConnectionList.
     * json
     */
    /**
     * Sample code: ExpressRouteConnectionList.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void expressRouteConnectionList(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.networks()
            .manager()
            .serviceClient()
            .getExpressRouteConnections()
            .listWithResponse("resourceGroupName", "expressRouteGatewayName", com.azure.core.util.Context.NONE);
    }
}
