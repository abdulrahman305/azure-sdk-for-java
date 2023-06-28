// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dataprotection.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.dataprotection.models.BackupSchedule;
import com.azure.resourcemanager.dataprotection.models.RetentionTag;
import com.azure.resourcemanager.dataprotection.models.ScheduleBasedTriggerContext;
import com.azure.resourcemanager.dataprotection.models.TaggingCriteria;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class ScheduleBasedTriggerContextTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ScheduleBasedTriggerContext model =
            BinaryData
                .fromString(
                    "{\"objectType\":\"ScheduleBasedTriggerContext\",\"schedule\":{\"repeatingTimeIntervals\":[\"aa\",\"pxdtnkdmkq\",\"jlwuenvrkp\",\"ou\"],\"timeZone\":\"bre\"},\"taggingCriteria\":[{\"criteria\":[],\"isDefault\":true,\"taggingPriority\":1549400948031704404,\"tagInfo\":{\"eTag\":\"ixqtn\",\"id\":\"tezlwff\",\"tagName\":\"iakp\"}},{\"criteria\":[],\"isDefault\":false,\"taggingPriority\":167842444741645493,\"tagInfo\":{\"eTag\":\"d\",\"id\":\"mmji\",\"tagName\":\"yeozphvwauyqncy\"}},{\"criteria\":[],\"isDefault\":false,\"taggingPriority\":9207382017369514266,\"tagInfo\":{\"eTag\":\"mdscwxqupev\",\"id\":\"f\",\"tagName\":\"totxhojujb\"}}]}")
                .toObject(ScheduleBasedTriggerContext.class);
        Assertions.assertEquals("aa", model.schedule().repeatingTimeIntervals().get(0));
        Assertions.assertEquals("bre", model.schedule().timeZone());
        Assertions.assertEquals(true, model.taggingCriteria().get(0).isDefault());
        Assertions.assertEquals(1549400948031704404L, model.taggingCriteria().get(0).taggingPriority());
        Assertions.assertEquals("iakp", model.taggingCriteria().get(0).tagInfo().tagName());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ScheduleBasedTriggerContext model =
            new ScheduleBasedTriggerContext()
                .withSchedule(
                    new BackupSchedule()
                        .withRepeatingTimeIntervals(Arrays.asList("aa", "pxdtnkdmkq", "jlwuenvrkp", "ou"))
                        .withTimeZone("bre"))
                .withTaggingCriteria(
                    Arrays
                        .asList(
                            new TaggingCriteria()
                                .withCriteria(Arrays.asList())
                                .withIsDefault(true)
                                .withTaggingPriority(1549400948031704404L)
                                .withTagInfo(new RetentionTag().withTagName("iakp")),
                            new TaggingCriteria()
                                .withCriteria(Arrays.asList())
                                .withIsDefault(false)
                                .withTaggingPriority(167842444741645493L)
                                .withTagInfo(new RetentionTag().withTagName("yeozphvwauyqncy")),
                            new TaggingCriteria()
                                .withCriteria(Arrays.asList())
                                .withIsDefault(false)
                                .withTaggingPriority(9207382017369514266L)
                                .withTagInfo(new RetentionTag().withTagName("totxhojujb"))));
        model = BinaryData.fromObject(model).toObject(ScheduleBasedTriggerContext.class);
        Assertions.assertEquals("aa", model.schedule().repeatingTimeIntervals().get(0));
        Assertions.assertEquals("bre", model.schedule().timeZone());
        Assertions.assertEquals(true, model.taggingCriteria().get(0).isDefault());
        Assertions.assertEquals(1549400948031704404L, model.taggingCriteria().get(0).taggingPriority());
        Assertions.assertEquals("iakp", model.taggingCriteria().get(0).tagInfo().tagName());
    }
}