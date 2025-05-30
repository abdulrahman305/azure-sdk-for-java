// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated;

import com.azure.resourcemanager.network.fluent.models.NetworkSecurityPerimeterInner;

/**
 * Samples for NetworkSecurityPerimeters CreateOrUpdate.
 */
public final class NetworkSecurityPerimetersCreateOrUpdateSamples {
    /*
     * x-ms-original-file:
     * specification/network/resource-manager/Microsoft.Network/stable/2024-07-01/examples/NetworkSecurityPerimeterPut.
     * json
     */
    /**
     * Sample code: Put Network Security Perimeter.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void putNetworkSecurityPerimeter(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.networks()
            .manager()
            .serviceClient()
            .getNetworkSecurityPerimeters()
            .createOrUpdateWithResponse("rg1", "nsp1", new NetworkSecurityPerimeterInner().withLocation("location1"),
                com.azure.core.util.Context.NONE);
    }
}
