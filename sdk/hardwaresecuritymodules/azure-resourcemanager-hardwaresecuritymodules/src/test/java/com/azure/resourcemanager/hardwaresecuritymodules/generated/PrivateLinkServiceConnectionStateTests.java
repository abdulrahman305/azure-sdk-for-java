// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hardwaresecuritymodules.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.hardwaresecuritymodules.models.PrivateEndpointServiceConnectionStatus;
import com.azure.resourcemanager.hardwaresecuritymodules.models.PrivateLinkServiceConnectionState;
import org.junit.jupiter.api.Assertions;

public final class PrivateLinkServiceConnectionStateTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        PrivateLinkServiceConnectionState model
            = BinaryData.fromString("{\"status\":\"Pending\",\"description\":\"hkr\",\"actionsRequired\":\"d\"}")
                .toObject(PrivateLinkServiceConnectionState.class);
        Assertions.assertEquals(PrivateEndpointServiceConnectionStatus.PENDING, model.status());
        Assertions.assertEquals("hkr", model.description());
        Assertions.assertEquals("d", model.actionsRequired());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        PrivateLinkServiceConnectionState model
            = new PrivateLinkServiceConnectionState().withStatus(PrivateEndpointServiceConnectionStatus.PENDING)
                .withDescription("hkr")
                .withActionsRequired("d");
        model = BinaryData.fromObject(model).toObject(PrivateLinkServiceConnectionState.class);
        Assertions.assertEquals(PrivateEndpointServiceConnectionStatus.PENDING, model.status());
        Assertions.assertEquals("hkr", model.description());
        Assertions.assertEquals("d", model.actionsRequired());
    }
}
