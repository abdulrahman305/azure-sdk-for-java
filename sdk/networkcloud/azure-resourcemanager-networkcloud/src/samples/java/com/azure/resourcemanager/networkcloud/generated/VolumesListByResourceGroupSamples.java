// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.networkcloud.generated;

/** Samples for Volumes ListByResourceGroup. */
public final class VolumesListByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/networkcloud/resource-manager/Microsoft.NetworkCloud/preview/2022-12-12-preview/examples/Volumes_ListByResourceGroup.json
     */
    /**
     * Sample code: List volumes for resource group.
     *
     * @param manager Entry point to NetworkCloudManager.
     */
    public static void listVolumesForResourceGroup(com.azure.resourcemanager.networkcloud.NetworkCloudManager manager) {
        manager.volumes().listByResourceGroup("resourceGroupName", com.azure.core.util.Context.NONE);
    }
}