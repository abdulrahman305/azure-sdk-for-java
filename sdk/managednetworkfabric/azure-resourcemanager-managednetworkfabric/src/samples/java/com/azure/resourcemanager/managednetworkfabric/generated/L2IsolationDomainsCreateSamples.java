// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.managednetworkfabric.generated;

/** Samples for L2IsolationDomains Create. */
public final class L2IsolationDomainsCreateSamples {
    /*
     * x-ms-original-file: specification/managednetworkfabric/resource-manager/Microsoft.ManagedNetworkFabric/preview/2023-02-01-preview/examples/L2IsolationDomains_Create_MaximumSet_Gen.json
     */
    /**
     * Sample code: L2IsolationDomains_Create_MaximumSet_Gen.
     *
     * @param manager Entry point to ManagedNetworkFabricManager.
     */
    public static void l2IsolationDomainsCreateMaximumSetGen(
        com.azure.resourcemanager.managednetworkfabric.ManagedNetworkFabricManager manager) {
        manager
            .l2IsolationDomains()
            .define("example-l2domain")
            .withRegion("eastus")
            .withExistingResourceGroup("resourceGroupName")
            .withNetworkFabricId(
                "/subscriptions/xxxxxx/resourceGroups/resourcegroupname/providers/Microsoft.ManagedNetworkFabric/networkFabrics/FabricName")
            .withVlanId(501)
            .withMtu(1500)
            .create();
    }
}