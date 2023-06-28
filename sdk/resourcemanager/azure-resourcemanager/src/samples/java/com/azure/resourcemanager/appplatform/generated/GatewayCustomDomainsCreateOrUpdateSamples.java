// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appplatform.generated;

import com.azure.core.util.Context;
import com.azure.resourcemanager.appplatform.fluent.models.GatewayCustomDomainResourceInner;
import com.azure.resourcemanager.appplatform.models.GatewayCustomDomainProperties;

/** Samples for GatewayCustomDomains CreateOrUpdate. */
public final class GatewayCustomDomainsCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/appplatform/resource-manager/Microsoft.AppPlatform/stable/2022-12-01/examples/GatewayCustomDomains_CreateOrUpdate.json
     */
    /**
     * Sample code: GatewayCustomDomains_CreateOrUpdate.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void gatewayCustomDomainsCreateOrUpdate(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .springServices()
            .manager()
            .serviceClient()
            .getGatewayCustomDomains()
            .createOrUpdate(
                "myResourceGroup",
                "myservice",
                "default",
                "myDomainName",
                new GatewayCustomDomainResourceInner()
                    .withProperties(new GatewayCustomDomainProperties().withThumbprint("*")),
                Context.NONE);
    }
}