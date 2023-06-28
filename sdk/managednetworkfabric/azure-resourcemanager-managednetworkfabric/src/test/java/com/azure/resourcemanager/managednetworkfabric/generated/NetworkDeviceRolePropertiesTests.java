// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.managednetworkfabric.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.managednetworkfabric.models.NetworkDeviceRackRoleType;
import com.azure.resourcemanager.managednetworkfabric.models.NetworkDeviceRoleProperties;
import org.junit.jupiter.api.Assertions;

public final class NetworkDeviceRolePropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        NetworkDeviceRoleProperties model =
            BinaryData
                .fromString("{\"networkDeviceSkuName\":\"dzaapmudqme\",\"roleType\":\"NPB\",\"rackSlot\":1979942108}")
                .toObject(NetworkDeviceRoleProperties.class);
        Assertions.assertEquals("dzaapmudqme", model.networkDeviceSkuName());
        Assertions.assertEquals(NetworkDeviceRackRoleType.NPB, model.roleType());
        Assertions.assertEquals(1979942108, model.rackSlot());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        NetworkDeviceRoleProperties model =
            new NetworkDeviceRoleProperties()
                .withNetworkDeviceSkuName("dzaapmudqme")
                .withRoleType(NetworkDeviceRackRoleType.NPB)
                .withRackSlot(1979942108);
        model = BinaryData.fromObject(model).toObject(NetworkDeviceRoleProperties.class);
        Assertions.assertEquals("dzaapmudqme", model.networkDeviceSkuName());
        Assertions.assertEquals(NetworkDeviceRackRoleType.NPB, model.roleType());
        Assertions.assertEquals(1979942108, model.rackSlot());
    }
}