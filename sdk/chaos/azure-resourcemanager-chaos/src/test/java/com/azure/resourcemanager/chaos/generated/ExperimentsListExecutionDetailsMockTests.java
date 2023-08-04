// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.chaos.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.resourcemanager.chaos.ChaosManager;
import com.azure.resourcemanager.chaos.models.ExperimentExecutionDetails;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class ExperimentsListExecutionDetailsMockTests {
    @Test
    public void testListExecutionDetails() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr =
            "{\"value\":[{\"type\":\"otmrfhir\",\"id\":\"ymoxoftpipiwyczu\",\"name\":\"a\",\"properties\":{\"experimentId\":\"jlihhyus\",\"status\":\"kasdvlm\",\"failureReason\":\"dgzxulucvpamrsr\",\"createdDateTime\":\"2021-12-07T21:14:58Z\",\"lastActionDateTime\":\"2021-03-05T11:45:05Z\",\"startDateTime\":\"2021-04-24T08:08:26Z\",\"stopDateTime\":\"2021-08-09T16:10:18Z\",\"runInformation\":{\"steps\":[{\"stepName\":\"ytxifqjzgxmrh\",\"stepId\":\"lw\",\"status\":\"esutrgjupauutpw\",\"branches\":[{},{},{},{}]}]}}}]}";

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

        ChaosManager manager =
            ChaosManager
                .configure()
                .withHttpClient(httpClient)
                .authenticate(
                    tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                    new AzureProfile("", "", AzureEnvironment.AZURE));

        PagedIterable<ExperimentExecutionDetails> response =
            manager.experiments().listExecutionDetails("ye", "rymsgaojfmw", com.azure.core.util.Context.NONE);
    }
}