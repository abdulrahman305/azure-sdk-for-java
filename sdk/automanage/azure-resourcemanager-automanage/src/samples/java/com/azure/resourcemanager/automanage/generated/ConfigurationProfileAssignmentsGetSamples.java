// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.automanage.generated;

/**
 * Samples for ConfigurationProfileAssignments Get.
 */
public final class ConfigurationProfileAssignmentsGetSamples {
    /*
     * x-ms-original-file: specification/automanage/resource-manager/Microsoft.Automanage/stable/2022-05-04/examples/
     * getConfigurationProfileAssignment.json
     */
    /**
     * Sample code: Get a configuration profile assignment.
     * 
     * @param manager Entry point to AutomanageManager.
     */
    public static void
        getAConfigurationProfileAssignment(com.azure.resourcemanager.automanage.AutomanageManager manager) {
        manager.configurationProfileAssignments()
            .getWithResponse("myResourceGroupName", "default", "myVMName", com.azure.core.util.Context.NONE);
    }
}
