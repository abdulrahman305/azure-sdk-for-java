// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.quantum.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.quantum.fluent.models.QuantumWorkspaceInner;
import com.azure.resourcemanager.quantum.models.Provider;
import com.azure.resourcemanager.quantum.models.QuantumWorkspaceIdentity;
import com.azure.resourcemanager.quantum.models.ResourceIdentityType;
import com.azure.resourcemanager.quantum.models.Status;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class QuantumWorkspaceInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        QuantumWorkspaceInner model =
            BinaryData
                .fromString(
                    "{\"properties\":{\"providers\":[{\"providerId\":\"uv\",\"providerSku\":\"xpyb\",\"instanceUri\":\"m\",\"applicationName\":\"mtz\",\"provisioningState\":\"Launching\",\"resourceUsageId\":\"phrupidgsybbejhp\"}],\"usable\":\"Partial\",\"provisioningState\":\"ProviderUpdating\",\"storageAccount\":\"xaobhdxbmtqioqjz\",\"endpointUri\":\"tbmufpo\"},\"identity\":{\"principalId\":\"izhwlrxy\",\"tenantId\":\"soqijg\",\"type\":\"None\"},\"location\":\"pazlobcufpdz\",\"tags\":{\"qqjnqgl\":\"t\",\"foooj\":\"qgn\"},\"id\":\"wifsq\",\"name\":\"saagdf\",\"type\":\"glzlhjxrifkwmrv\"}")
                .toObject(QuantumWorkspaceInner.class);
        Assertions.assertEquals("pazlobcufpdz", model.location());
        Assertions.assertEquals("t", model.tags().get("qqjnqgl"));
        Assertions.assertEquals(ResourceIdentityType.NONE, model.identity().type());
        Assertions.assertEquals("uv", model.providers().get(0).providerId());
        Assertions.assertEquals("xpyb", model.providers().get(0).providerSku());
        Assertions.assertEquals("m", model.providers().get(0).instanceUri());
        Assertions.assertEquals("mtz", model.providers().get(0).applicationName());
        Assertions.assertEquals(Status.LAUNCHING, model.providers().get(0).provisioningState());
        Assertions.assertEquals("phrupidgsybbejhp", model.providers().get(0).resourceUsageId());
        Assertions.assertEquals("xaobhdxbmtqioqjz", model.storageAccount());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        QuantumWorkspaceInner model =
            new QuantumWorkspaceInner()
                .withLocation("pazlobcufpdz")
                .withTags(mapOf("qqjnqgl", "t", "foooj", "qgn"))
                .withIdentity(new QuantumWorkspaceIdentity().withType(ResourceIdentityType.NONE))
                .withProviders(
                    Arrays
                        .asList(
                            new Provider()
                                .withProviderId("uv")
                                .withProviderSku("xpyb")
                                .withInstanceUri("m")
                                .withApplicationName("mtz")
                                .withProvisioningState(Status.LAUNCHING)
                                .withResourceUsageId("phrupidgsybbejhp")))
                .withStorageAccount("xaobhdxbmtqioqjz");
        model = BinaryData.fromObject(model).toObject(QuantumWorkspaceInner.class);
        Assertions.assertEquals("pazlobcufpdz", model.location());
        Assertions.assertEquals("t", model.tags().get("qqjnqgl"));
        Assertions.assertEquals(ResourceIdentityType.NONE, model.identity().type());
        Assertions.assertEquals("uv", model.providers().get(0).providerId());
        Assertions.assertEquals("xpyb", model.providers().get(0).providerSku());
        Assertions.assertEquals("m", model.providers().get(0).instanceUri());
        Assertions.assertEquals("mtz", model.providers().get(0).applicationName());
        Assertions.assertEquals(Status.LAUNCHING, model.providers().get(0).provisioningState());
        Assertions.assertEquals("phrupidgsybbejhp", model.providers().get(0).resourceUsageId());
        Assertions.assertEquals("xaobhdxbmtqioqjz", model.storageAccount());
    }

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