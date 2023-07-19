// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.managednetworkfabric.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.managednetworkfabric.fluent.models.NeighborGroupPatchProperties;
import com.azure.resourcemanager.managednetworkfabric.models.NeighborGroupDestination;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class NeighborGroupPatchPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        NeighborGroupPatchProperties model =
            BinaryData
                .fromString(
                    "{\"destination\":{\"ipv4Addresses\":[\"peg\",\"wdabalfdxaglzfyt\"],\"ipv6Addresses\":[\"lqhopxouvmrs\"]},\"annotation\":\"likyypzkgxfxfmyr\"}")
                .toObject(NeighborGroupPatchProperties.class);
        Assertions.assertEquals("likyypzkgxfxfmyr", model.annotation());
        Assertions.assertEquals("peg", model.destination().ipv4Addresses().get(0));
        Assertions.assertEquals("lqhopxouvmrs", model.destination().ipv6Addresses().get(0));
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        NeighborGroupPatchProperties model =
            new NeighborGroupPatchProperties()
                .withAnnotation("likyypzkgxfxfmyr")
                .withDestination(
                    new NeighborGroupDestination()
                        .withIpv4Addresses(Arrays.asList("peg", "wdabalfdxaglzfyt"))
                        .withIpv6Addresses(Arrays.asList("lqhopxouvmrs")));
        model = BinaryData.fromObject(model).toObject(NeighborGroupPatchProperties.class);
        Assertions.assertEquals("likyypzkgxfxfmyr", model.annotation());
        Assertions.assertEquals("peg", model.destination().ipv4Addresses().get(0));
        Assertions.assertEquals("lqhopxouvmrs", model.destination().ipv6Addresses().get(0));
    }
}