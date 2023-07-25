// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sphere.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.sphere.fluent.models.DeviceProperties;
import org.junit.jupiter.api.Assertions;

public final class DevicePropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        DeviceProperties model =
            BinaryData
                .fromString(
                    "{\"deviceId\":\"pvecxgodeb\",\"chipSku\":\"kk\",\"lastAvailableOsVersion\":\"mpukgriw\",\"lastInstalledOsVersion\":\"zlfbxzpuzycispnq\",\"lastOsUpdateUtc\":\"2021-11-25T03:44:38Z\",\"lastUpdateRequestUtc\":\"2021-01-22T12:22:34Z\",\"provisioningState\":\"Succeeded\"}")
                .toObject(DeviceProperties.class);
        Assertions.assertEquals("pvecxgodeb", model.deviceId());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        DeviceProperties model = new DeviceProperties().withDeviceId("pvecxgodeb");
        model = BinaryData.fromObject(model).toObject(DeviceProperties.class);
        Assertions.assertEquals("pvecxgodeb", model.deviceId());
    }
}