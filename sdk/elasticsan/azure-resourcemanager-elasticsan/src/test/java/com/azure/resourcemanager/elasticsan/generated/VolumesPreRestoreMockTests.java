// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.elasticsan.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.models.AzureCloud;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.elasticsan.ElasticSanManager;
import com.azure.resourcemanager.elasticsan.models.DiskSnapshotList;
import com.azure.resourcemanager.elasticsan.models.PreValidationResponse;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class VolumesPreRestoreMockTests {
    @Test
    public void testPreRestore() throws Exception {
        String responseStr = "{\"validationStatus\":\"stwit\"}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        ElasticSanManager manager = ElasticSanManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureCloud.AZURE_PUBLIC_CLOUD));

        PreValidationResponse response = manager.volumes()
            .preRestore("ukyhejhzis", "gfpelolppvksrpqv", "jzraehtwdwrf",
                new DiskSnapshotList().withDiskSnapshotIds(Arrays.asList("wib", "rcdlbhshfwpr")),
                com.azure.core.util.Context.NONE);

        Assertions.assertEquals("stwit", response.validationStatus());
    }
}
