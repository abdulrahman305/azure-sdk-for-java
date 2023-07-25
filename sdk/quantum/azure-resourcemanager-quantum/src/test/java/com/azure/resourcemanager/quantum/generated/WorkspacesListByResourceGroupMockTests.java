// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.quantum.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.resourcemanager.quantum.AzureQuantumManager;
import com.azure.resourcemanager.quantum.models.QuantumWorkspace;
import com.azure.resourcemanager.quantum.models.ResourceIdentityType;
import com.azure.resourcemanager.quantum.models.Status;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class WorkspacesListByResourceGroupMockTests {
    @Test
    public void testListByResourceGroup() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr =
            "{\"value\":[{\"properties\":{\"providers\":[{\"providerId\":\"kzikfjawneaivxwc\",\"providerSku\":\"lpcirelsf\",\"instanceUri\":\"enwabfatk\",\"applicationName\":\"dxbjhwuaanozj\",\"provisioningState\":\"Updating\",\"resourceUsageId\":\"youlp\"},{\"providerId\":\"v\",\"providerSku\":\"glrvimjwosytxi\",\"instanceUri\":\"skfc\",\"applicationName\":\"qumiek\",\"provisioningState\":\"Deleted\",\"resourceUsageId\":\"ikh\"}],\"usable\":\"No\",\"provisioningState\":\"Failed\",\"storageAccount\":\"gqggebdunygae\",\"endpointUri\":\"db\"},\"identity\":{\"principalId\":\"t\",\"tenantId\":\"llrxcyjmoad\",\"type\":\"None\"},\"location\":\"r\",\"tags\":{\"hhyxxrw\":\"dmjsjqb\",\"duhpk\":\"yc\",\"hky\":\"kgymareqnajxqug\",\"sofwqmzqalkrmnji\":\"ubeddg\"},\"id\":\"pxacqqudfn\",\"name\":\"yxbaaabjyvayf\",\"type\":\"imrzrtuzqog\"}]}";

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

        AzureQuantumManager manager =
            AzureQuantumManager
                .configure()
                .withHttpClient(httpClient)
                .authenticate(
                    tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                    new AzureProfile("", "", AzureEnvironment.AZURE));

        PagedIterable<QuantumWorkspace> response =
            manager.workspaces().listByResourceGroup("fnjhfjxwmszkkfo", com.azure.core.util.Context.NONE);

        Assertions.assertEquals("r", response.iterator().next().location());
        Assertions.assertEquals("dmjsjqb", response.iterator().next().tags().get("hhyxxrw"));
        Assertions.assertEquals(ResourceIdentityType.NONE, response.iterator().next().identity().type());
        Assertions.assertEquals("kzikfjawneaivxwc", response.iterator().next().providers().get(0).providerId());
        Assertions.assertEquals("lpcirelsf", response.iterator().next().providers().get(0).providerSku());
        Assertions.assertEquals("enwabfatk", response.iterator().next().providers().get(0).instanceUri());
        Assertions.assertEquals("dxbjhwuaanozj", response.iterator().next().providers().get(0).applicationName());
        Assertions.assertEquals(Status.UPDATING, response.iterator().next().providers().get(0).provisioningState());
        Assertions.assertEquals("youlp", response.iterator().next().providers().get(0).resourceUsageId());
        Assertions.assertEquals("gqggebdunygae", response.iterator().next().storageAccount());
    }
}