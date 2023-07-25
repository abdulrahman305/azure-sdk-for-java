// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cognitiveservices.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.cognitiveservices.fluent.models.UsageInner;
import com.azure.resourcemanager.cognitiveservices.models.MetricName;
import com.azure.resourcemanager.cognitiveservices.models.QuotaUsageStatus;
import com.azure.resourcemanager.cognitiveservices.models.UnitType;
import org.junit.jupiter.api.Assertions;

public final class UsageInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        UsageInner model =
            BinaryData
                .fromString(
                    "{\"unit\":\"Seconds\",\"name\":{\"value\":\"uokktwhrdxwz\",\"localizedValue\":\"q\"},\"quotaPeriod\":\"bsureximo\",\"limit\":23.538238166454796,\"currentValue\":27.071751224209883,\"nextResetTime\":\"s\",\"status\":\"Unknown\"}")
                .toObject(UsageInner.class);
        Assertions.assertEquals(UnitType.SECONDS, model.unit());
        Assertions.assertEquals("uokktwhrdxwz", model.name().value());
        Assertions.assertEquals("q", model.name().localizedValue());
        Assertions.assertEquals("bsureximo", model.quotaPeriod());
        Assertions.assertEquals(23.538238166454796D, model.limit());
        Assertions.assertEquals(27.071751224209883D, model.currentValue());
        Assertions.assertEquals("s", model.nextResetTime());
        Assertions.assertEquals(QuotaUsageStatus.UNKNOWN, model.status());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        UsageInner model =
            new UsageInner()
                .withUnit(UnitType.SECONDS)
                .withName(new MetricName().withValue("uokktwhrdxwz").withLocalizedValue("q"))
                .withQuotaPeriod("bsureximo")
                .withLimit(23.538238166454796D)
                .withCurrentValue(27.071751224209883D)
                .withNextResetTime("s")
                .withStatus(QuotaUsageStatus.UNKNOWN);
        model = BinaryData.fromObject(model).toObject(UsageInner.class);
        Assertions.assertEquals(UnitType.SECONDS, model.unit());
        Assertions.assertEquals("uokktwhrdxwz", model.name().value());
        Assertions.assertEquals("q", model.name().localizedValue());
        Assertions.assertEquals("bsureximo", model.quotaPeriod());
        Assertions.assertEquals(23.538238166454796D, model.limit());
        Assertions.assertEquals(27.071751224209883D, model.currentValue());
        Assertions.assertEquals("s", model.nextResetTime());
        Assertions.assertEquals(QuotaUsageStatus.UNKNOWN, model.status());
    }
}