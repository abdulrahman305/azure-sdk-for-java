// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservicesbackup.models.RecoveryPointMoveReadinessInfo;
import org.junit.jupiter.api.Assertions;

public final class RecoveryPointMoveReadinessInfoTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        RecoveryPointMoveReadinessInfo model
            = BinaryData.fromString("{\"isReadyForMove\":true,\"additionalInfo\":\"k\"}")
                .toObject(RecoveryPointMoveReadinessInfo.class);
        Assertions.assertEquals(true, model.isReadyForMove());
        Assertions.assertEquals("k", model.additionalInfo());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        RecoveryPointMoveReadinessInfo model
            = new RecoveryPointMoveReadinessInfo().withIsReadyForMove(true).withAdditionalInfo("k");
        model = BinaryData.fromObject(model).toObject(RecoveryPointMoveReadinessInfo.class);
        Assertions.assertEquals(true, model.isReadyForMove());
        Assertions.assertEquals("k", model.additionalInfo());
    }
}
