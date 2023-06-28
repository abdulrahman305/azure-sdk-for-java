// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dataprotection.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.dataprotection.models.FeatureType;
import com.azure.resourcemanager.dataprotection.models.FeatureValidationRequest;
import org.junit.jupiter.api.Assertions;

public final class FeatureValidationRequestTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        FeatureValidationRequest model =
            BinaryData
                .fromString(
                    "{\"objectType\":\"FeatureValidationRequest\",\"featureType\":\"DataSourceType\",\"featureName\":\"x\"}")
                .toObject(FeatureValidationRequest.class);
        Assertions.assertEquals(FeatureType.DATA_SOURCE_TYPE, model.featureType());
        Assertions.assertEquals("x", model.featureName());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        FeatureValidationRequest model =
            new FeatureValidationRequest().withFeatureType(FeatureType.DATA_SOURCE_TYPE).withFeatureName("x");
        model = BinaryData.fromObject(model).toObject(FeatureValidationRequest.class);
        Assertions.assertEquals(FeatureType.DATA_SOURCE_TYPE, model.featureType());
        Assertions.assertEquals("x", model.featureName());
    }
}