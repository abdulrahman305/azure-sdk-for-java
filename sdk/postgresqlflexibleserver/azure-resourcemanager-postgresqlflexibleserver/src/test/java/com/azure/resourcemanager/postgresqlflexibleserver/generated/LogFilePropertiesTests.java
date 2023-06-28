// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.postgresqlflexibleserver.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.postgresqlflexibleserver.fluent.models.LogFileProperties;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;

public final class LogFilePropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        LogFileProperties model =
            BinaryData
                .fromString(
                    "{\"createdTime\":\"2021-08-23T07:26:09Z\",\"lastModifiedTime\":\"2021-05-15T10:38:25Z\",\"sizeInKb\":5098612227840659778,\"type\":\"jmygtdsslswtmwer\",\"url\":\"fzp\"}")
                .toObject(LogFileProperties.class);
        Assertions.assertEquals(OffsetDateTime.parse("2021-08-23T07:26:09Z"), model.createdTime());
        Assertions.assertEquals(OffsetDateTime.parse("2021-05-15T10:38:25Z"), model.lastModifiedTime());
        Assertions.assertEquals(5098612227840659778L, model.sizeInKb());
        Assertions.assertEquals("jmygtdsslswtmwer", model.type());
        Assertions.assertEquals("fzp", model.url());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        LogFileProperties model =
            new LogFileProperties()
                .withCreatedTime(OffsetDateTime.parse("2021-08-23T07:26:09Z"))
                .withLastModifiedTime(OffsetDateTime.parse("2021-05-15T10:38:25Z"))
                .withSizeInKb(5098612227840659778L)
                .withType("jmygtdsslswtmwer")
                .withUrl("fzp");
        model = BinaryData.fromObject(model).toObject(LogFileProperties.class);
        Assertions.assertEquals(OffsetDateTime.parse("2021-08-23T07:26:09Z"), model.createdTime());
        Assertions.assertEquals(OffsetDateTime.parse("2021-05-15T10:38:25Z"), model.lastModifiedTime());
        Assertions.assertEquals(5098612227840659778L, model.sizeInKb());
        Assertions.assertEquals("jmygtdsslswtmwer", model.type());
        Assertions.assertEquals("fzp", model.url());
    }
}