// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.kubernetesconfiguration.generated;

/**
 * Samples for Extensions List.
 */
public final class ExtensionsListSamples {
    /*
     * x-ms-original-file:
     * specification/kubernetesconfiguration/resource-manager/Microsoft.KubernetesConfiguration/stable/2023-05-01/
     * examples/ListExtensions.json
     */
    /**
     * Sample code: List Extensions.
     * 
     * @param manager Entry point to SourceControlConfigurationManager.
     */
    public static void
        listExtensions(com.azure.resourcemanager.kubernetesconfiguration.SourceControlConfigurationManager manager) {
        manager.extensions()
            .list("rg1", "Microsoft.Kubernetes", "connectedClusters", "clusterName1", com.azure.core.util.Context.NONE);
    }
}
