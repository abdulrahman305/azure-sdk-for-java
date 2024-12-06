// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.mediaservices.fluent.models.ContentKeyPolicyInner;
import com.azure.resourcemanager.mediaservices.models.ContentKeyPolicyCollection;
import com.azure.resourcemanager.mediaservices.models.ContentKeyPolicyConfiguration;
import com.azure.resourcemanager.mediaservices.models.ContentKeyPolicyOption;
import com.azure.resourcemanager.mediaservices.models.ContentKeyPolicyRestriction;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class ContentKeyPolicyCollectionTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ContentKeyPolicyCollection model = BinaryData.fromString(
            "{\"value\":[{\"properties\":{\"policyId\":\"8d01e0ea-247a-4f6f-8df4-7a985649acb9\",\"created\":\"2021-02-09T09:52:19Z\",\"lastModified\":\"2021-01-12T19:16:50Z\",\"description\":\"vseotgqrl\",\"options\":[{\"policyOptionId\":\"5978f263-846b-450f-be74-e024bf539980\",\"name\":\"wlauwzizxbmpg\",\"configuration\":{\"@odata.type\":\"ContentKeyPolicyConfiguration\"},\"restriction\":{\"@odata.type\":\"ContentKeyPolicyRestriction\"}},{\"policyOptionId\":\"faaa8121-1bc6-4422-8d92-7323d592271f\",\"name\":\"fuzmuvpbtt\",\"configuration\":{\"@odata.type\":\"ContentKeyPolicyConfiguration\"},\"restriction\":{\"@odata.type\":\"ContentKeyPolicyRestriction\"}},{\"policyOptionId\":\"fd9f4671-8049-44bb-9e9d-68432bfdac02\",\"name\":\"orppxebmnzbtb\",\"configuration\":{\"@odata.type\":\"ContentKeyPolicyConfiguration\"},\"restriction\":{\"@odata.type\":\"ContentKeyPolicyRestriction\"}}]},\"id\":\"pglkf\",\"name\":\"ohdneuel\",\"type\":\"phsdyhto\"},{\"properties\":{\"policyId\":\"73753960-0d94-41aa-95f0-b5a5f574b872\",\"created\":\"2021-04-04T21:16:34Z\",\"lastModified\":\"2021-11-18T18:02:06Z\",\"description\":\"quuvxzxcl\",\"options\":[{\"policyOptionId\":\"653b0e9c-ae23-485d-bac9-801502549575\",\"name\":\"hqzonosggbhcoh\",\"configuration\":{\"@odata.type\":\"ContentKeyPolicyConfiguration\"},\"restriction\":{\"@odata.type\":\"ContentKeyPolicyRestriction\"}},{\"policyOptionId\":\"b637aab2-7455-4de3-8f05-06f0b31e5fe9\",\"name\":\"sjnkal\",\"configuration\":{\"@odata.type\":\"ContentKeyPolicyConfiguration\"},\"restriction\":{\"@odata.type\":\"ContentKeyPolicyRestriction\"}}]},\"id\":\"tiiswacffg\",\"name\":\"k\",\"type\":\"zewk\"}],\"@odata.nextLink\":\"hqcrailvpnpp\"}")
            .toObject(ContentKeyPolicyCollection.class);
        Assertions.assertEquals("vseotgqrl", model.value().get(0).description());
        Assertions.assertEquals("wlauwzizxbmpg", model.value().get(0).options().get(0).name());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ContentKeyPolicyCollection model = new ContentKeyPolicyCollection().withValue(Arrays.asList(
            new ContentKeyPolicyInner().withDescription("vseotgqrl")
                .withOptions(Arrays.asList(
                    new ContentKeyPolicyOption().withName("wlauwzizxbmpg")
                        .withConfiguration(new ContentKeyPolicyConfiguration())
                        .withRestriction(new ContentKeyPolicyRestriction()),
                    new ContentKeyPolicyOption().withName("fuzmuvpbtt")
                        .withConfiguration(new ContentKeyPolicyConfiguration())
                        .withRestriction(new ContentKeyPolicyRestriction()),
                    new ContentKeyPolicyOption().withName("orppxebmnzbtb")
                        .withConfiguration(new ContentKeyPolicyConfiguration())
                        .withRestriction(new ContentKeyPolicyRestriction()))),
            new ContentKeyPolicyInner().withDescription("quuvxzxcl")
                .withOptions(Arrays.asList(
                    new ContentKeyPolicyOption().withName("hqzonosggbhcoh")
                        .withConfiguration(new ContentKeyPolicyConfiguration())
                        .withRestriction(new ContentKeyPolicyRestriction()),
                    new ContentKeyPolicyOption().withName("sjnkal")
                        .withConfiguration(new ContentKeyPolicyConfiguration())
                        .withRestriction(new ContentKeyPolicyRestriction())))));
        model = BinaryData.fromObject(model).toObject(ContentKeyPolicyCollection.class);
        Assertions.assertEquals("vseotgqrl", model.value().get(0).description());
        Assertions.assertEquals("wlauwzizxbmpg", model.value().get(0).options().get(0).name());
    }
}
