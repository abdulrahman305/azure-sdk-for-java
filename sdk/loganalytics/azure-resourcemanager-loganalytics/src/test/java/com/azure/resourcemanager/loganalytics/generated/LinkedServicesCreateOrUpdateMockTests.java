// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.loganalytics.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.loganalytics.LogAnalyticsManager;
import com.azure.resourcemanager.loganalytics.models.LinkedService;
import com.azure.resourcemanager.loganalytics.models.LinkedServiceEntityStatus;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class LinkedServicesCreateOrUpdateMockTests {
    @Test
    public void testCreateOrUpdate() throws Exception {
        String responseStr
            = "{\"properties\":{\"resourceId\":\"psw\",\"writeAccessResourceId\":\"mvkhlggd\",\"provisioningState\":\"Succeeded\"},\"tags\":{\"jfpgpicrmn\":\"qkzszuwiwtglxxh\",\"mqgjsxvpq\":\"hr\",\"bakclacjfrnxous\":\"bfrmbodthsqqgvri\"},\"id\":\"au\",\"name\":\"lwvsgm\",\"type\":\"ohqfzizv\"}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        LogAnalyticsManager manager = LogAnalyticsManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        LinkedService response = manager.linkedServices()
            .define("yp")
            .withExistingWorkspace("aglqivbgkcvkh", "zvuqdflvon")
            .withTags(mapOf("fgpikqm", "bgqjxgpnrhgo"))
            .withResourceId("ubcpzgpxti")
            .withWriteAccessResourceId("j")
            .withProvisioningState(LinkedServiceEntityStatus.PROVISIONING_ACCOUNT)
            .create();

        Assertions.assertEquals("qkzszuwiwtglxxh", response.tags().get("jfpgpicrmn"));
        Assertions.assertEquals("psw", response.resourceId());
        Assertions.assertEquals("mvkhlggd", response.writeAccessResourceId());
        Assertions.assertEquals(LinkedServiceEntityStatus.SUCCEEDED, response.provisioningState());
    }

    // Use "Map.of" if available
    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}
