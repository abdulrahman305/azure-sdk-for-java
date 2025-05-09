// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.recoveryservicessiterecovery.SiteRecoveryManager;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.CreateNetworkMappingInputProperties;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.FabricSpecificCreateNetworkMappingInput;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.NetworkMapping;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class ReplicationNetworkMappingsCreateMockTests {
    @Test
    public void testCreate() throws Exception {
        String responseStr
            = "{\"properties\":{\"state\":\"k\",\"primaryNetworkFriendlyName\":\"iksy\",\"primaryNetworkId\":\"rrbnhylsbhujcydy\",\"primaryFabricFriendlyName\":\"mxvps\",\"recoveryNetworkFriendlyName\":\"zsyqagqllcbrvaid\",\"recoveryNetworkId\":\"kyhtrrqwfyyb\",\"recoveryFabricArmId\":\"mjjrnogyk\",\"recoveryFabricFriendlyName\":\"dlavsavgthk\",\"fabricSpecificSettings\":{\"instanceType\":\"NetworkMappingFabricSpecificSettings\"}},\"location\":\"euufk\",\"id\":\"zb\",\"name\":\"bxjblajybdnb\",\"type\":\"csbto\"}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        SiteRecoveryManager manager = SiteRecoveryManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        NetworkMapping response = manager.replicationNetworkMappings()
            .define("xyxxhwr")
            .withExistingReplicationNetwork("brhfiwltkfysunte", "hkl", "whcv", "syyhgqokjbmsrk")
            .withProperties(new CreateNetworkMappingInputProperties().withRecoveryFabricName("omaqsyilpzzb")
                .withRecoveryNetworkId("wnrzozsxa")
                .withFabricSpecificDetails(new FabricSpecificCreateNetworkMappingInput()))
            .create();

        Assertions.assertEquals("k", response.properties().state());
        Assertions.assertEquals("iksy", response.properties().primaryNetworkFriendlyName());
        Assertions.assertEquals("rrbnhylsbhujcydy", response.properties().primaryNetworkId());
        Assertions.assertEquals("mxvps", response.properties().primaryFabricFriendlyName());
        Assertions.assertEquals("zsyqagqllcbrvaid", response.properties().recoveryNetworkFriendlyName());
        Assertions.assertEquals("kyhtrrqwfyyb", response.properties().recoveryNetworkId());
        Assertions.assertEquals("mjjrnogyk", response.properties().recoveryFabricArmId());
        Assertions.assertEquals("dlavsavgthk", response.properties().recoveryFabricFriendlyName());
        Assertions.assertEquals("euufk", response.location());
    }
}
