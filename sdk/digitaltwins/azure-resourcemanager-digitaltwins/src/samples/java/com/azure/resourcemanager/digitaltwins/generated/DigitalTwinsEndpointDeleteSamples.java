// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.digitaltwins.generated;

/**
 * Samples for DigitalTwinsEndpoint Delete.
 */
public final class DigitalTwinsEndpointDeleteSamples {
    /*
     * x-ms-original-file:
     * specification/digitaltwins/resource-manager/Microsoft.DigitalTwins/stable/2023-01-31/examples/
     * DigitalTwinsEndpointDelete_example.json
     */
    /**
     * Sample code: Delete a DigitalTwinsInstance endpoint.
     * 
     * @param manager Entry point to AzureDigitalTwinsManager.
     */
    public static void
        deleteADigitalTwinsInstanceEndpoint(com.azure.resourcemanager.digitaltwins.AzureDigitalTwinsManager manager) {
        manager.digitalTwinsEndpoints()
            .delete("resRg", "myDigitalTwinsService", "myendpoint", com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file:
     * specification/digitaltwins/resource-manager/Microsoft.DigitalTwins/stable/2023-01-31/examples/
     * DigitalTwinsEndpointDelete_WithIdentity_example.json
     */
    /**
     * Sample code: Delete a DigitalTwinsInstance endpoint with identity.
     * 
     * @param manager Entry point to AzureDigitalTwinsManager.
     */
    public static void deleteADigitalTwinsInstanceEndpointWithIdentity(
        com.azure.resourcemanager.digitaltwins.AzureDigitalTwinsManager manager) {
        manager.digitalTwinsEndpoints()
            .delete("resRg", "myDigitalTwinsService", "myendpoint", com.azure.core.util.Context.NONE);
    }
}
