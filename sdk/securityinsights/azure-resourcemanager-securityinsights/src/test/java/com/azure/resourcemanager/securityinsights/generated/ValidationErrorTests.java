// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.securityinsights.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.securityinsights.models.ValidationError;
import org.junit.jupiter.api.Assertions;

public final class ValidationErrorTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ValidationError model = BinaryData.fromString(
            "{\"recordIndex\":672538380,\"errorMessages\":[\"dyhgkfminsg\",\"wzf\",\"tsttktlahbq\",\"ctxtgzukxi\"]}")
            .toObject(ValidationError.class);
        Assertions.assertEquals(672538380, model.recordIndex());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ValidationError model = new ValidationError().withRecordIndex(672538380);
        model = BinaryData.fromObject(model).toObject(ValidationError.class);
        Assertions.assertEquals(672538380, model.recordIndex());
    }
}
