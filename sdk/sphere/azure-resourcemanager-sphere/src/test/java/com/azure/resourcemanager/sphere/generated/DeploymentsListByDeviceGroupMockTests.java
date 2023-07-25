// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sphere.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.resourcemanager.sphere.AzureSphereManager;
import com.azure.resourcemanager.sphere.models.Deployment;
import com.azure.resourcemanager.sphere.models.RegionalDataBoundary;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class DeploymentsListByDeviceGroupMockTests {
    @Test
    public void testListByDeviceGroup() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr =
            "{\"value\":[{\"properties\":{\"deploymentId\":\"rx\",\"deployedImages\":[{\"properties\":{\"image\":\"vaytdwkqbrq\",\"imageId\":\"paxh\",\"imageName\":\"iilivpdtiirqtd\",\"regionalDataBoundary\":\"EU\",\"uri\":\"oruzfgsquyfxrxx\",\"description\":\"ptramxj\",\"componentId\":\"wlwnwxuqlcv\",\"imageType\":\"UpdateCertStore\",\"provisioningState\":\"Failed\"},\"id\":\"tdooaoj\",\"name\":\"niodkooeb\",\"type\":\"nuj\"},{\"properties\":{\"image\":\"msbvdkcrodtjinf\",\"imageId\":\"lfltka\",\"imageName\":\"vefkdlfoakggk\",\"regionalDataBoundary\":\"EU\",\"uri\":\"ao\",\"description\":\"ulpqblylsyxkqjn\",\"componentId\":\"ervtiagxs\",\"imageType\":\"SecurityMonitor\",\"provisioningState\":\"Accepted\"},\"id\":\"mpsbzkfzbeyv\",\"name\":\"nqicvinvkjjxdxrb\",\"type\":\"ukzclewyhmlwpaz\"},{\"properties\":{\"image\":\"ofncckwyfzqwhxxb\",\"imageId\":\"qa\",\"imageName\":\"feqztppriol\",\"regionalDataBoundary\":\"EU\",\"uri\":\"altol\",\"description\":\"cwsobqwcs\",\"componentId\":\"nwdcfhu\",\"imageType\":\"PlutonRuntime\",\"provisioningState\":\"Updating\"},\"id\":\"uvglsbjjcanvx\",\"name\":\"vtvudutncormr\",\"type\":\"xqtvcofu\"},{\"properties\":{\"image\":\"vkg\",\"imageId\":\"bgdknnqv\",\"imageName\":\"znqntoru\",\"regionalDataBoundary\":\"EU\",\"uri\":\"a\",\"description\":\"kycgrauwj\",\"componentId\":\"taeburuvdm\",\"imageType\":\"NormalWorldKernel\",\"provisioningState\":\"Provisioning\"},\"id\":\"l\",\"name\":\"wabm\",\"type\":\"oefki\"}],\"deploymentDateUtc\":\"2021-07-14T12:33:43Z\",\"provisioningState\":\"Canceled\"},\"id\":\"u\",\"name\":\"ujmqlgkfbtndoa\",\"type\":\"n\"}]}";

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

        AzureSphereManager manager =
            AzureSphereManager
                .configure()
                .withHttpClient(httpClient)
                .authenticate(
                    tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                    new AzureProfile("", "", AzureEnvironment.AZURE));

        PagedIterable<Deployment> response =
            manager
                .deployments()
                .listByDeviceGroup(
                    "nbyxbaaabjyv",
                    "yffimrzrtuzqogs",
                    "xnevfdnwn",
                    "mewzsyyc",
                    "uzsoi",
                    2025880638,
                    414197490,
                    2135802257,
                    com.azure.core.util.Context.NONE);

        Assertions.assertEquals("rx", response.iterator().next().deploymentId());
        Assertions.assertEquals("vaytdwkqbrq", response.iterator().next().deployedImages().get(0).image());
        Assertions.assertEquals("paxh", response.iterator().next().deployedImages().get(0).imageId());
        Assertions
            .assertEquals(
                RegionalDataBoundary.EU, response.iterator().next().deployedImages().get(0).regionalDataBoundary());
    }
}