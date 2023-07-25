// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mobilenetwork.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.resourcemanager.mobilenetwork.MobileNetworkManager;
import com.azure.resourcemanager.mobilenetwork.models.SimPolicy;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class SimPoliciesListByMobileNetworkMockTests {
    @Test
    public void testListByMobileNetwork() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr =
            "{\"value\":[{\"properties\":{\"provisioningState\":\"Accepted\",\"siteProvisioningState\":{\"ylcc\":\"Deleting\"},\"ueAmbr\":{\"uplink\":\"evxrhyz\",\"downlink\":\"fwrsofpltdbmair\"},\"defaultSlice\":{\"id\":\"hvhfnracw\"},\"rfspIndex\":1723621906,\"registrationTimer\":189921644,\"sliceConfigurations\":[{\"slice\":{\"id\":\"uuj\"},\"defaultDataNetwork\":{\"id\":\"ouhdawsigrb\"},\"dataNetworkConfigurations\":[{\"dataNetwork\":{\"id\":\"xsjybvitvqk\"},\"sessionAmbr\":{\"uplink\":\"y\",\"downlink\":\"znumtggmuwdchoz\"},\"allowedServices\":[]},{\"dataNetwork\":{\"id\":\"nkf\"},\"sessionAmbr\":{\"uplink\":\"xlvxnoakiz\",\"downlink\":\"oaiknaqlnuwig\"},\"allowedServices\":[]},{\"dataNetwork\":{\"id\":\"yxl\"},\"sessionAmbr\":{\"uplink\":\"kwph\",\"downlink\":\"xzcwxhmpejt\"},\"allowedServices\":[]},{\"dataNetwork\":{\"id\":\"ke\"},\"sessionAmbr\":{\"uplink\":\"aonwivkcqhrxh\",\"downlink\":\"knlccrmmkyup\"},\"allowedServices\":[]}]},{\"slice\":{\"id\":\"jubyqjfkakfq\"},\"defaultDataNetwork\":{\"id\":\"rke\"},\"dataNetworkConfigurations\":[{\"dataNetwork\":{\"id\":\"il\"},\"sessionAmbr\":{\"uplink\":\"udxjascowv\",\"downlink\":\"djkpdxph\"},\"allowedServices\":[]},{\"dataNetwork\":{\"id\":\"kk\"},\"sessionAmbr\":{\"uplink\":\"nmgzvyfijdkzuqnw\",\"downlink\":\"it\"},\"allowedServices\":[]},{\"dataNetwork\":{\"id\":\"uqoly\"},\"sessionAmbr\":{\"uplink\":\"hluqwquls\",\"downlink\":\"trjbhxykfhyq\"},\"allowedServices\":[]},{\"dataNetwork\":{\"id\":\"zvqqugdrftbcvexr\"},\"sessionAmbr\":{\"uplink\":\"uquowtljvfwhr\",\"downlink\":\"agk\"},\"allowedServices\":[]}]}]},\"location\":\"xv\",\"tags\":{\"lmepjpf\":\"vbczsulmdg\",\"g\":\"eykgsangpszngaf\",\"ujcngo\":\"lkvec\"},\"id\":\"dyedmzrgjfo\",\"name\":\"nub\",\"type\":\"oitpkpztrgdgx\"}]}";

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

        MobileNetworkManager manager =
            MobileNetworkManager
                .configure()
                .withHttpClient(httpClient)
                .authenticate(
                    tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                    new AzureProfile("", "", AzureEnvironment.AZURE));

        PagedIterable<SimPolicy> response =
            manager.simPolicies().listByMobileNetwork("tnhqsycl", "selpkpbaf", com.azure.core.util.Context.NONE);

        Assertions.assertEquals("xv", response.iterator().next().location());
        Assertions.assertEquals("vbczsulmdg", response.iterator().next().tags().get("lmepjpf"));
        Assertions.assertEquals("evxrhyz", response.iterator().next().ueAmbr().uplink());
        Assertions.assertEquals("fwrsofpltdbmair", response.iterator().next().ueAmbr().downlink());
        Assertions.assertEquals("hvhfnracw", response.iterator().next().defaultSlice().id());
        Assertions.assertEquals(1723621906, response.iterator().next().rfspIndex());
        Assertions.assertEquals(189921644, response.iterator().next().registrationTimer());
        Assertions.assertEquals("uuj", response.iterator().next().sliceConfigurations().get(0).slice().id());
        Assertions
            .assertEquals(
                "ouhdawsigrb", response.iterator().next().sliceConfigurations().get(0).defaultDataNetwork().id());
        Assertions
            .assertEquals(
                "xsjybvitvqk",
                response
                    .iterator()
                    .next()
                    .sliceConfigurations()
                    .get(0)
                    .dataNetworkConfigurations()
                    .get(0)
                    .dataNetwork()
                    .id());
        Assertions
            .assertEquals(
                "y",
                response
                    .iterator()
                    .next()
                    .sliceConfigurations()
                    .get(0)
                    .dataNetworkConfigurations()
                    .get(0)
                    .sessionAmbr()
                    .uplink());
        Assertions
            .assertEquals(
                "znumtggmuwdchoz",
                response
                    .iterator()
                    .next()
                    .sliceConfigurations()
                    .get(0)
                    .dataNetworkConfigurations()
                    .get(0)
                    .sessionAmbr()
                    .downlink());
    }
}