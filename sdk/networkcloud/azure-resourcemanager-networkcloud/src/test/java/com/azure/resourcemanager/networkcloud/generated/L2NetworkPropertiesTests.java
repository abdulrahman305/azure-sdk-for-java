// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.networkcloud.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.networkcloud.fluent.models.L2NetworkProperties;
import com.azure.resourcemanager.networkcloud.models.HybridAksPluginType;
import org.junit.jupiter.api.Assertions;

public final class L2NetworkPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        L2NetworkProperties model =
            BinaryData
                .fromString(
                    "{\"clusterId\":\"sfgytguslfead\",\"detailedStatus\":\"Available\",\"detailedStatusMessage\":\"ukyhejhzis\",\"hybridAksClustersAssociatedIds\":[\"pelol\"],\"hybridAksPluginType\":\"OSDevice\",\"interfaceName\":\"srp\",\"l2IsolationDomainId\":\"vu\",\"provisioningState\":\"Failed\",\"virtualMachinesAssociatedIds\":[\"htwdwrftswibyrcd\",\"bhshfwpracstwity\",\"hevxcced\"]}")
                .toObject(L2NetworkProperties.class);
        Assertions.assertEquals(HybridAksPluginType.OSDEVICE, model.hybridAksPluginType());
        Assertions.assertEquals("srp", model.interfaceName());
        Assertions.assertEquals("vu", model.l2IsolationDomainId());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        L2NetworkProperties model =
            new L2NetworkProperties()
                .withHybridAksPluginType(HybridAksPluginType.OSDEVICE)
                .withInterfaceName("srp")
                .withL2IsolationDomainId("vu");
        model = BinaryData.fromObject(model).toObject(L2NetworkProperties.class);
        Assertions.assertEquals(HybridAksPluginType.OSDEVICE, model.hybridAksPluginType());
        Assertions.assertEquals("srp", model.interfaceName());
        Assertions.assertEquals("vu", model.l2IsolationDomainId());
    }
}