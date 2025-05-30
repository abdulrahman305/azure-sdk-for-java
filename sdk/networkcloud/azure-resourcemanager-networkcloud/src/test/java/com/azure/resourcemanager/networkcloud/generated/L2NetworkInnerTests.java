// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.networkcloud.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.networkcloud.fluent.models.L2NetworkInner;
import com.azure.resourcemanager.networkcloud.models.ExtendedLocation;
import com.azure.resourcemanager.networkcloud.models.HybridAksPluginType;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class L2NetworkInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        L2NetworkInner model = BinaryData.fromString(
            "{\"extendedLocation\":{\"name\":\"uhbxvvy\",\"type\":\"gsopbyrqufegxu\"},\"properties\":{\"associatedResourceIds\":[\"fbn\"],\"clusterId\":\"mctlpdngitv\",\"detailedStatus\":\"Error\",\"detailedStatusMessage\":\"rixkwmyijejve\",\"hybridAksClustersAssociatedIds\":[\"bpnaixexccbdre\",\"xhcexdrrvqahq\",\"ghtpw\",\"jnhyjsvf\"],\"hybridAksPluginType\":\"SRIOV\",\"interfaceName\":\"bfvoowvrv\",\"l2IsolationDomainId\":\"t\",\"provisioningState\":\"Accepted\",\"virtualMachinesAssociatedIds\":[\"y\",\"s\",\"ronzmyhgfip\",\"sxkm\"]},\"location\":\"a\",\"tags\":{\"umh\":\"rjreafxts\",\"pvuzlmv\":\"glikkxwslolb\",\"gplcrpwjxeznoigb\":\"elfk\"},\"id\":\"njwmwkpnbsazejj\",\"name\":\"qkagfhsxt\",\"type\":\"augzxnfaazpxdtn\"}")
            .toObject(L2NetworkInner.class);
        Assertions.assertEquals("a", model.location());
        Assertions.assertEquals("rjreafxts", model.tags().get("umh"));
        Assertions.assertEquals("uhbxvvy", model.extendedLocation().name());
        Assertions.assertEquals("gsopbyrqufegxu", model.extendedLocation().type());
        Assertions.assertEquals(HybridAksPluginType.SRIOV, model.hybridAksPluginType());
        Assertions.assertEquals("bfvoowvrv", model.interfaceName());
        Assertions.assertEquals("t", model.l2IsolationDomainId());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        L2NetworkInner model = new L2NetworkInner().withLocation("a")
            .withTags(mapOf("umh", "rjreafxts", "pvuzlmv", "glikkxwslolb", "gplcrpwjxeznoigb", "elfk"))
            .withExtendedLocation(new ExtendedLocation().withName("uhbxvvy").withType("gsopbyrqufegxu"))
            .withHybridAksPluginType(HybridAksPluginType.SRIOV)
            .withInterfaceName("bfvoowvrv")
            .withL2IsolationDomainId("t");
        model = BinaryData.fromObject(model).toObject(L2NetworkInner.class);
        Assertions.assertEquals("a", model.location());
        Assertions.assertEquals("rjreafxts", model.tags().get("umh"));
        Assertions.assertEquals("uhbxvvy", model.extendedLocation().name());
        Assertions.assertEquals("gsopbyrqufegxu", model.extendedLocation().type());
        Assertions.assertEquals(HybridAksPluginType.SRIOV, model.hybridAksPluginType());
        Assertions.assertEquals("bfvoowvrv", model.interfaceName());
        Assertions.assertEquals("t", model.l2IsolationDomainId());
    }

    // Use "Map.of" if available
    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}
