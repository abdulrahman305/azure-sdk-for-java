// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.apimanagement.fluent.models.EmailTemplateContractInner;
import com.azure.resourcemanager.apimanagement.models.EmailTemplateParametersContractProperties;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class EmailTemplateContractInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        EmailTemplateContractInner model = BinaryData.fromString(
            "{\"properties\":{\"subject\":\"bgiark\",\"body\":\"ykpgd\",\"title\":\"wabzr\",\"description\":\"qrxhaclcdos\",\"isDefault\":false,\"parameters\":[{\"name\":\"gkifmmainwh\",\"title\":\"xkpbqwun\",\"description\":\"buizazzelwg\"},{\"name\":\"djufbnkl\",\"title\":\"axpegjw\",\"description\":\"bal\"},{\"name\":\"xa\",\"title\":\"zfytlbtlqhopxou\",\"description\":\"rsifliky\"},{\"name\":\"zkg\",\"title\":\"xfmyrqs\",\"description\":\"pokszanmhwgpt\"}]},\"id\":\"rdiuwkirksk\",\"name\":\"ztsdetjygow\",\"type\":\"fcqpol\"}")
            .toObject(EmailTemplateContractInner.class);
        Assertions.assertEquals("bgiark", model.subject());
        Assertions.assertEquals("ykpgd", model.body());
        Assertions.assertEquals("wabzr", model.title());
        Assertions.assertEquals("qrxhaclcdos", model.description());
        Assertions.assertEquals("gkifmmainwh", model.parameters().get(0).name());
        Assertions.assertEquals("xkpbqwun", model.parameters().get(0).title());
        Assertions.assertEquals("buizazzelwg", model.parameters().get(0).description());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        EmailTemplateContractInner model = new EmailTemplateContractInner().withSubject("bgiark")
            .withBody("ykpgd")
            .withTitle("wabzr")
            .withDescription("qrxhaclcdos")
            .withParameters(Arrays.asList(
                new EmailTemplateParametersContractProperties().withName("gkifmmainwh")
                    .withTitle("xkpbqwun")
                    .withDescription("buizazzelwg"),
                new EmailTemplateParametersContractProperties().withName("djufbnkl")
                    .withTitle("axpegjw")
                    .withDescription("bal"),
                new EmailTemplateParametersContractProperties().withName("xa")
                    .withTitle("zfytlbtlqhopxou")
                    .withDescription("rsifliky"),
                new EmailTemplateParametersContractProperties().withName("zkg")
                    .withTitle("xfmyrqs")
                    .withDescription("pokszanmhwgpt")));
        model = BinaryData.fromObject(model).toObject(EmailTemplateContractInner.class);
        Assertions.assertEquals("bgiark", model.subject());
        Assertions.assertEquals("ykpgd", model.body());
        Assertions.assertEquals("wabzr", model.title());
        Assertions.assertEquals("qrxhaclcdos", model.description());
        Assertions.assertEquals("gkifmmainwh", model.parameters().get(0).name());
        Assertions.assertEquals("xkpbqwun", model.parameters().get(0).title());
        Assertions.assertEquals("buizazzelwg", model.parameters().get(0).description());
    }
}
