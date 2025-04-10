// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.apimanagement.ApiManagementManager;
import com.azure.resourcemanager.apimanagement.models.TagContract;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class TagsListByServiceMockTests {
    @Test
    public void testListByService() throws Exception {
        String responseStr
            = "{\"value\":[{\"properties\":{\"displayName\":\"nlvkmnbzk\"},\"id\":\"paiildcpudkhqu\",\"name\":\"syjo\",\"type\":\"pgve\"}]}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        ApiManagementManager manager = ApiManagementManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        PagedIterable<TagContract> response = manager.tags()
            .listByService("oprwkampyh", "pbldz", "iudrcycmwhuzym", 1750801275, 1723638902, "ih",
                com.azure.core.util.Context.NONE);

        Assertions.assertEquals("nlvkmnbzk", response.iterator().next().displayName());
    }
}
