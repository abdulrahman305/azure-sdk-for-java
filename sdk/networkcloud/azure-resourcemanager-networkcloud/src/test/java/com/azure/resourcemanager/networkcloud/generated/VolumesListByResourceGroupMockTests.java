// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.networkcloud.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.resourcemanager.networkcloud.NetworkCloudManager;
import com.azure.resourcemanager.networkcloud.models.Volume;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class VolumesListByResourceGroupMockTests {
    @Test
    public void testListByResourceGroup() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr =
            "{\"value\":[{\"extendedLocation\":{\"name\":\"pjlh\",\"type\":\"yxpzruzythqk\"},\"properties\":{\"attachedTo\":[\"bg\",\"vellvulnxdmnitm\"],\"detailedStatus\":\"Active\",\"detailedStatusMessage\":\"vm\",\"provisioningState\":\"Succeeded\",\"serialNumber\":\"mffhmjpddnyxfzuv\",\"sizeMiB\":1391759677432765278},\"location\":\"qmzjqrbrpvnmdy\",\"tags\":{\"t\":\"bojtjppglaohoqkp\",\"lmhxdqaolfylnk\":\"qjilaywkdcwmqsyr\",\"tmfwobbjwhl\":\"bjpjvlyw\"},\"id\":\"yj\",\"name\":\"nqzocrdzg\",\"type\":\"zeunt\"}]}";

        Mockito.when(httpResponse.getStatusCode()).thenReturn(200);
        Mockito.when(httpResponse.getHeaders()).thenReturn(new HttpHeaders());
        Mockito
            .when(httpResponse.getBody())
            .thenReturn(Flux.just(ByteBuffer.wrap(responseStr.getBytes(StandardCharsets.UTF_8))));
        Mockito
            .when(httpResponse.getBodyAsByteArray())
            .thenReturn(Mono.just(responseStr.getBytes(StandardCharsets.UTF_8)));
        Mockito
            .when(httpClient.send(httpRequest.capture(), Mockito.any()))
            .thenReturn(
                Mono
                    .defer(
                        () -> {
                            Mockito.when(httpResponse.getRequest()).thenReturn(httpRequest.getValue());
                            return Mono.just(httpResponse);
                        }));

        NetworkCloudManager manager =
            NetworkCloudManager
                .configure()
                .withHttpClient(httpClient)
                .authenticate(
                    tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                    new AzureProfile("", "", AzureEnvironment.AZURE));

        PagedIterable<Volume> response =
            manager.volumes().listByResourceGroup("ciduwjle", com.azure.core.util.Context.NONE);

        Assertions.assertEquals("qmzjqrbrpvnmdy", response.iterator().next().location());
        Assertions.assertEquals("bojtjppglaohoqkp", response.iterator().next().tags().get("t"));
        Assertions.assertEquals("pjlh", response.iterator().next().extendedLocation().name());
        Assertions.assertEquals("yxpzruzythqk", response.iterator().next().extendedLocation().type());
        Assertions.assertEquals(1391759677432765278L, response.iterator().next().sizeMiB());
    }
}