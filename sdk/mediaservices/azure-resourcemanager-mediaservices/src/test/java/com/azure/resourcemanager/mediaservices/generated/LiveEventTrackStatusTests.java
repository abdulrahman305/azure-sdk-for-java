// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.mediaservices.models.LiveEventTrackStatus;
import org.junit.jupiter.api.Assertions;

public final class LiveEventTrackStatusTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        LiveEventTrackStatus model = BinaryData.fromString(
            "{\"trackId\":\"ymoxoftpipiwyczu\",\"expectedBitrate\":636333226103492449,\"incomingBitrate\":5299678736839094769,\"ingestDrift\":\"ihhyuspskasd\",\"requestReceived\":8981770461637201272,\"requestSucceeded\":7451807738298006230}")
            .toObject(LiveEventTrackStatus.class);
        Assertions.assertEquals("ymoxoftpipiwyczu", model.trackId());
        Assertions.assertEquals(636333226103492449L, model.expectedBitrate());
        Assertions.assertEquals(5299678736839094769L, model.incomingBitrate());
        Assertions.assertEquals("ihhyuspskasd", model.ingestDrift());
        Assertions.assertEquals(8981770461637201272L, model.requestReceived());
        Assertions.assertEquals(7451807738298006230L, model.requestSucceeded());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        LiveEventTrackStatus model = new LiveEventTrackStatus().withTrackId("ymoxoftpipiwyczu")
            .withExpectedBitrate(636333226103492449L)
            .withIncomingBitrate(5299678736839094769L)
            .withIngestDrift("ihhyuspskasd")
            .withRequestReceived(8981770461637201272L)
            .withRequestSucceeded(7451807738298006230L);
        model = BinaryData.fromObject(model).toObject(LiveEventTrackStatus.class);
        Assertions.assertEquals("ymoxoftpipiwyczu", model.trackId());
        Assertions.assertEquals(636333226103492449L, model.expectedBitrate());
        Assertions.assertEquals(5299678736839094769L, model.incomingBitrate());
        Assertions.assertEquals("ihhyuspskasd", model.ingestDrift());
        Assertions.assertEquals(8981770461637201272L, model.requestReceived());
        Assertions.assertEquals(7451807738298006230L, model.requestSucceeded());
    }
}
