// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated;

/**
 * Samples for PublicIpAddresses ListCloudServicePublicIpAddresses.
 */
public final class PublicIpAddressesListCloudServicePublicIpAddressesSamples {
    /*
     * x-ms-original-file:
     * specification/network/resource-manager/Microsoft.Network/stable/2024-07-01/examples/CloudServicePublicIpListAll.
     * json
     */
    /**
     * Sample code: ListVMSSPublicIP.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void listVMSSPublicIP(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.networks()
            .manager()
            .serviceClient()
            .getPublicIpAddresses()
            .listCloudServicePublicIpAddresses("cs-tester", "cs1", com.azure.core.util.Context.NONE);
    }
}
