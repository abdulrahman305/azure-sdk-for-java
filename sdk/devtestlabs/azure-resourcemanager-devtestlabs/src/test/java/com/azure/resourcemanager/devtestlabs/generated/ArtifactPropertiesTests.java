// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devtestlabs.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.devtestlabs.fluent.models.ArtifactProperties;

public final class ArtifactPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ArtifactProperties model = BinaryData.fromString(
            "{\"title\":\"bpodxunkbebxm\",\"description\":\"yyntwl\",\"publisher\":\"qtkoievs\",\"filePath\":\"tgqr\",\"icon\":\"tmuwlauwzi\",\"targetOsType\":\"bm\",\"parameters\":\"datacjefuzmu\",\"createdDate\":\"2021-06-02T10:08:07Z\"}")
            .toObject(ArtifactProperties.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ArtifactProperties model = new ArtifactProperties();
        model = BinaryData.fromObject(model).toObject(ArtifactProperties.class);
    }
}
