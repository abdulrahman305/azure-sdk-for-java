// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated;

/**
 * Samples for ExpressRoutePortAuthorizations Get.
 */
public final class ExpressRoutePortAuthorizationsGetSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2024-07-01/examples/
     * ExpressRoutePortAuthorizationGet.json
     */
    /**
     * Sample code: Get ExpressRoutePort Authorization.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void getExpressRoutePortAuthorization(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.networks()
            .manager()
            .serviceClient()
            .getExpressRoutePortAuthorizations()
            .getWithResponse("rg1", "expressRoutePortName", "authorizationName", com.azure.core.util.Context.NONE);
    }
}
