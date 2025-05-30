// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.InMageRcmSyncDetails;

public final class InMageRcmSyncDetailsTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        InMageRcmSyncDetails model = BinaryData.fromString(
            "{\"progressHealth\":\"NoProgress\",\"transferredBytes\":1856658975065671977,\"last15MinutesTransferredBytes\":6736190646936656758,\"lastDataTransferTimeUtc\":\"kzzertkounzsiy\",\"processedBytes\":3018411370330206536,\"startTime\":\"mfpopikzebqnnf\",\"lastRefreshTime\":\"tkqowsd\",\"progressPercentage\":1996277732}")
            .toObject(InMageRcmSyncDetails.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        InMageRcmSyncDetails model = new InMageRcmSyncDetails();
        model = BinaryData.fromObject(model).toObject(InMageRcmSyncDetails.class);
    }
}
