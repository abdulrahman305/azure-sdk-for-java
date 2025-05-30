// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.apimanagement.models.ConfigurationApi;
import com.azure.resourcemanager.apimanagement.models.LegacyApiState;
import org.junit.jupiter.api.Assertions;

public final class ConfigurationApiTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ConfigurationApi model = BinaryData.fromString("{\"legacyApi\":\"Enabled\"}").toObject(ConfigurationApi.class);
        Assertions.assertEquals(LegacyApiState.ENABLED, model.legacyApi());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ConfigurationApi model = new ConfigurationApi().withLegacyApi(LegacyApiState.ENABLED);
        model = BinaryData.fromObject(model).toObject(ConfigurationApi.class);
        Assertions.assertEquals(LegacyApiState.ENABLED, model.legacyApi());
    }
}
