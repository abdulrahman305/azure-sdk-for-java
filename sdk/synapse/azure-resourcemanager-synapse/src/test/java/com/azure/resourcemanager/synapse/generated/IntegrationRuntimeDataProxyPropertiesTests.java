// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.synapse.models.EntityReference;
import com.azure.resourcemanager.synapse.models.IntegrationRuntimeDataProxyProperties;
import com.azure.resourcemanager.synapse.models.IntegrationRuntimeEntityReferenceType;
import org.junit.jupiter.api.Assertions;

public final class IntegrationRuntimeDataProxyPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        IntegrationRuntimeDataProxyProperties model = BinaryData.fromString(
            "{\"connectVia\":{\"type\":\"IntegrationRuntimeReference\",\"referenceName\":\"aoyankcoeqswa\"},\"stagingLinkedService\":{\"type\":\"IntegrationRuntimeReference\",\"referenceName\":\"tmhdroznnhdr\"},\"path\":\"tgjcsgguxheml\"}")
            .toObject(IntegrationRuntimeDataProxyProperties.class);
        Assertions.assertEquals(IntegrationRuntimeEntityReferenceType.INTEGRATION_RUNTIME_REFERENCE,
            model.connectVia().type());
        Assertions.assertEquals("aoyankcoeqswa", model.connectVia().referenceName());
        Assertions.assertEquals(IntegrationRuntimeEntityReferenceType.INTEGRATION_RUNTIME_REFERENCE,
            model.stagingLinkedService().type());
        Assertions.assertEquals("tmhdroznnhdr", model.stagingLinkedService().referenceName());
        Assertions.assertEquals("tgjcsgguxheml", model.path());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        IntegrationRuntimeDataProxyProperties model = new IntegrationRuntimeDataProxyProperties()
            .withConnectVia(
                new EntityReference().withType(IntegrationRuntimeEntityReferenceType.INTEGRATION_RUNTIME_REFERENCE)
                    .withReferenceName("aoyankcoeqswa"))
            .withStagingLinkedService(
                new EntityReference().withType(IntegrationRuntimeEntityReferenceType.INTEGRATION_RUNTIME_REFERENCE)
                    .withReferenceName("tmhdroznnhdr"))
            .withPath("tgjcsgguxheml");
        model = BinaryData.fromObject(model).toObject(IntegrationRuntimeDataProxyProperties.class);
        Assertions.assertEquals(IntegrationRuntimeEntityReferenceType.INTEGRATION_RUNTIME_REFERENCE,
            model.connectVia().type());
        Assertions.assertEquals("aoyankcoeqswa", model.connectVia().referenceName());
        Assertions.assertEquals(IntegrationRuntimeEntityReferenceType.INTEGRATION_RUNTIME_REFERENCE,
            model.stagingLinkedService().type());
        Assertions.assertEquals("tmhdroznnhdr", model.stagingLinkedService().referenceName());
        Assertions.assertEquals("tgjcsgguxheml", model.path());
    }
}
