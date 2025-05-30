// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cognitiveservices.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.models.AzureCloud;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.cognitiveservices.CognitiveServicesManager;
import com.azure.resourcemanager.cognitiveservices.models.DefenderForAISetting;
import com.azure.resourcemanager.cognitiveservices.models.DefenderForAISettingState;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class DefenderForAISettingsListMockTests {
    @Test
    public void testList() throws Exception {
        String responseStr
            = "{\"value\":[{\"etag\":\"rsilcchskxxkansb\",\"tags\":{\"rulfuct\":\"aqgvto\"},\"properties\":{\"state\":\"Disabled\"},\"id\":\"hcfjzhxlyubqjro\",\"name\":\"tvrjeqmtz\",\"type\":\"beqrztrx\"}]}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        CognitiveServicesManager manager = CognitiveServicesManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureCloud.AZURE_PUBLIC_CLOUD));

        PagedIterable<DefenderForAISetting> response
            = manager.defenderForAISettings().list("dcqjkedwqurc", "ojmrvvxwjongzse", com.azure.core.util.Context.NONE);

        Assertions.assertEquals("aqgvto", response.iterator().next().tags().get("rulfuct"));
        Assertions.assertEquals(DefenderForAISettingState.DISABLED, response.iterator().next().state());
    }
}
