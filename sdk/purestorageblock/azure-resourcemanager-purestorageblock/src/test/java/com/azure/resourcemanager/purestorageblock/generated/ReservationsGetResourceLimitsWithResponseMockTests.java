// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.purestorageblock.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.models.AzureCloud;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.purestorageblock.PureStorageBlockManager;
import com.azure.resourcemanager.purestorageblock.models.LimitDetails;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class ReservationsGetResourceLimitsWithResponseMockTests {
    @Test
    public void testGetResourceLimitsWithResponse() throws Exception {
        String responseStr
            = "{\"storagePool\":{\"provisionedBandwidthMbPerSec\":{\"min\":4427086989076318317,\"max\":6563841329201288310},\"provisionedIops\":{\"min\":8680246364842604153,\"max\":6851254807622539389},\"physicalAvailabilityZones\":[\"uzvx\",\"risjnhnytxifqjz\"]},\"volume\":{\"provisionedSize\":{\"min\":5028173088217913035,\"max\":6352328391564368443}},\"protectionPolicy\":{\"frequency\":{\"min\":4223928428315416005,\"max\":1575354894603985523},\"retention\":{\"min\":8129609655822520955,\"max\":7038720826135192724}},\"performancePolicy\":{\"iopsLimit\":{\"min\":3311635224555992257,\"max\":411296746406972015},\"bandwidthLimit\":{\"min\":7560632422312520218,\"max\":7666921470080196819}}}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        PureStorageBlockManager manager = PureStorageBlockManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureCloud.AZURE_PUBLIC_CLOUD));

        LimitDetails response = manager.reservations()
            .getResourceLimitsWithResponse("qjlihhyuspska", "dvlmfwdgzxul", com.azure.core.util.Context.NONE)
            .getValue();

        Assertions.assertEquals(4427086989076318317L, response.storagePool().provisionedBandwidthMbPerSec().min());
        Assertions.assertEquals(6563841329201288310L, response.storagePool().provisionedBandwidthMbPerSec().max());
        Assertions.assertEquals(8680246364842604153L, response.storagePool().provisionedIops().min());
        Assertions.assertEquals(6851254807622539389L, response.storagePool().provisionedIops().max());
        Assertions.assertEquals("uzvx", response.storagePool().physicalAvailabilityZones().get(0));
        Assertions.assertEquals(5028173088217913035L, response.volume().provisionedSize().min());
        Assertions.assertEquals(6352328391564368443L, response.volume().provisionedSize().max());
        Assertions.assertEquals(4223928428315416005L, response.protectionPolicy().frequency().min());
        Assertions.assertEquals(1575354894603985523L, response.protectionPolicy().frequency().max());
        Assertions.assertEquals(8129609655822520955L, response.protectionPolicy().retention().min());
        Assertions.assertEquals(7038720826135192724L, response.protectionPolicy().retention().max());
        Assertions.assertEquals(3311635224555992257L, response.performancePolicy().iopsLimit().min());
        Assertions.assertEquals(411296746406972015L, response.performancePolicy().iopsLimit().max());
        Assertions.assertEquals(7560632422312520218L, response.performancePolicy().bandwidthLimit().min());
        Assertions.assertEquals(7666921470080196819L, response.performancePolicy().bandwidthLimit().max());
    }
}
