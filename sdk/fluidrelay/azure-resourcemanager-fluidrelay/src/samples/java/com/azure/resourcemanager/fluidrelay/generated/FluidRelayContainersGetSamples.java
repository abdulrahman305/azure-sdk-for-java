// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.fluidrelay.generated;

/**
 * Samples for FluidRelayContainers Get.
 */
public final class FluidRelayContainersGetSamples {
    /*
     * x-ms-original-file: specification/fluidrelay/resource-manager/Microsoft.FluidRelay/stable/2022-06-01/examples/
     * FluidRelayContainers_Get.json
     */
    /**
     * Sample code: Get Fluid Relay container details.
     * 
     * @param manager Entry point to FluidRelayManager.
     */
    public static void getFluidRelayContainerDetails(com.azure.resourcemanager.fluidrelay.FluidRelayManager manager) {
        manager.fluidRelayContainers()
            .getWithResponse("myResourceGroup", "myFluidRelayServer", "myFluidRelayContainer",
                com.azure.core.util.Context.NONE);
    }
}
