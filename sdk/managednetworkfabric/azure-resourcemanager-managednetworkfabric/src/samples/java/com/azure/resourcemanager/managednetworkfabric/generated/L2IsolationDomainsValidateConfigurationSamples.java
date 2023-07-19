// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.managednetworkfabric.generated;

/** Samples for L2IsolationDomains ValidateConfiguration. */
public final class L2IsolationDomainsValidateConfigurationSamples {
    /*
     * x-ms-original-file: specification/managednetworkfabric/resource-manager/Microsoft.ManagedNetworkFabric/stable/2023-06-15/examples/L2IsolationDomains_ValidateConfiguration_MaximumSet_Gen.json
     */
    /**
     * Sample code: L2IsolationDomains_ValidateConfiguration_MaximumSet_Gen.
     *
     * @param manager Entry point to ManagedNetworkFabricManager.
     */
    public static void l2IsolationDomainsValidateConfigurationMaximumSetGen(
        com.azure.resourcemanager.managednetworkfabric.ManagedNetworkFabricManager manager) {
        manager
            .l2IsolationDomains()
            .validateConfiguration("example-rg", "example-l2domain", com.azure.core.util.Context.NONE);
    }
}