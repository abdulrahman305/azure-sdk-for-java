// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated;

/**
 * Samples for PacketCaptures Stop.
 */
public final class PacketCapturesStopSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2024-07-01/examples/
     * NetworkWatcherPacketCaptureStop.json
     */
    /**
     * Sample code: Stop packet capture.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void stopPacketCapture(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.networks()
            .manager()
            .serviceClient()
            .getPacketCaptures()
            .stop("rg1", "nw1", "pc1", com.azure.core.util.Context.NONE);
    }
}
