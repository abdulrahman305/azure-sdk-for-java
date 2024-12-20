// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.timeseriesinsights.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.timeseriesinsights.models.EventSourceUpdateParameters;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class EventSourceUpdateParametersTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        EventSourceUpdateParameters model = BinaryData.fromString(
            "{\"kind\":\"EventSourceUpdateParameters\",\"tags\":{\"onpc\":\"idyjrrfbyaosvexc\",\"eggzfb\":\"hocohslkev\"}}")
            .toObject(EventSourceUpdateParameters.class);
        Assertions.assertEquals("idyjrrfbyaosvexc", model.tags().get("onpc"));
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        EventSourceUpdateParameters model
            = new EventSourceUpdateParameters().withTags(mapOf("onpc", "idyjrrfbyaosvexc", "eggzfb", "hocohslkev"));
        model = BinaryData.fromObject(model).toObject(EventSourceUpdateParameters.class);
        Assertions.assertEquals("idyjrrfbyaosvexc", model.tags().get("onpc"));
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
