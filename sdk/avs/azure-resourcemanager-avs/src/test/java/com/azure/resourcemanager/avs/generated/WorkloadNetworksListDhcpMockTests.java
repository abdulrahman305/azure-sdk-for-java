// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.avs.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.models.AzureCloud;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.avs.AvsManager;
import com.azure.resourcemanager.avs.models.WorkloadNetworkDhcp;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class WorkloadNetworksListDhcpMockTests {
    @Test
    public void testListDhcp() throws Exception {
        String responseStr
            = "{\"value\":[{\"properties\":{\"dhcpType\":\"WorkloadNetworkDhcpEntity\",\"displayName\":\"qd\",\"segments\":[\"wflj\",\"zn\",\"mtuatmzwcjjncqtj\",\"mizvgbgatzuuvbx\"],\"provisioningState\":\"Succeeded\",\"revision\":8608381823862362175},\"id\":\"gahttzlswvaj\",\"name\":\"fu\",\"type\":\"lx\"}]}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        AvsManager manager = AvsManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureCloud.AZURE_PUBLIC_CLOUD));

        PagedIterable<WorkloadNetworkDhcp> response
            = manager.workloadNetworks().listDhcp("jxcx", "rzdcgdzbenribcaw", com.azure.core.util.Context.NONE);

        Assertions.assertEquals("qd", response.iterator().next().properties().displayName());
        Assertions.assertEquals(8608381823862362175L, response.iterator().next().properties().revision());
    }
}
