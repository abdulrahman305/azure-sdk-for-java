// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated;

/**
 * Samples for VirtualNetworkGateways StartExpressRouteSiteFailoverSimulation.
 */
public final class VirtualNetworkGatewaysStartExpressRouteSiteFailoverSimulationSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2024-07-01/examples/
     * VirtualNetworkGatewayStartSiteFailoverSimulation.json
     */
    /**
     * Sample code: VirtualNetworkGatewayStartSiteFailoverSimulation.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void
        virtualNetworkGatewayStartSiteFailoverSimulation(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.networks()
            .manager()
            .serviceClient()
            .getVirtualNetworkGateways()
            .startExpressRouteSiteFailoverSimulation("rg1", "ergw", "Vancouver", com.azure.core.util.Context.NONE);
    }
}
