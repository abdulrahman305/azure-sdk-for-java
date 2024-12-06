// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.computefleet.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.computefleet.models.OSImageNotificationProfile;
import org.junit.jupiter.api.Assertions;

public final class OSImageNotificationProfileTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        OSImageNotificationProfile model = BinaryData.fromString("{\"notBeforeTimeout\":\"h\",\"enable\":false}")
            .toObject(OSImageNotificationProfile.class);
        Assertions.assertEquals("h", model.notBeforeTimeout());
        Assertions.assertEquals(false, model.enable());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        OSImageNotificationProfile model = new OSImageNotificationProfile().withNotBeforeTimeout("h").withEnable(false);
        model = BinaryData.fromObject(model).toObject(OSImageNotificationProfile.class);
        Assertions.assertEquals("h", model.notBeforeTimeout());
        Assertions.assertEquals(false, model.enable());
    }
}
