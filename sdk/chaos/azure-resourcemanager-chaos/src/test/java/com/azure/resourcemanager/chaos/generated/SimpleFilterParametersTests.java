// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.chaos.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.chaos.models.SimpleFilterParameters;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class SimpleFilterParametersTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        SimpleFilterParameters model =
            BinaryData
                .fromString("{\"zones\":[\"jaltolmnc\",\"sobqw\",\"sdbnwdcfhucqdpf\"]}")
                .toObject(SimpleFilterParameters.class);
        Assertions.assertEquals("jaltolmnc", model.zones().get(0));
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        SimpleFilterParameters model =
            new SimpleFilterParameters().withZones(Arrays.asList("jaltolmnc", "sobqw", "sdbnwdcfhucqdpf"));
        model = BinaryData.fromObject(model).toObject(SimpleFilterParameters.class);
        Assertions.assertEquals("jaltolmnc", model.zones().get(0));
    }
}