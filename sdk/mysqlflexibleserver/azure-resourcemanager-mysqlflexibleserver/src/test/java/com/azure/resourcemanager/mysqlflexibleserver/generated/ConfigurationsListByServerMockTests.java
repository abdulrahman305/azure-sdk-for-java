// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mysqlflexibleserver.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.mysqlflexibleserver.MySqlManager;
import com.azure.resourcemanager.mysqlflexibleserver.models.Configuration;
import com.azure.resourcemanager.mysqlflexibleserver.models.ConfigurationSource;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class ConfigurationsListByServerMockTests {
    @Test
    public void testListByServer() throws Exception {
        String responseStr
            = "{\"value\":[{\"properties\":{\"value\":\"cy\",\"currentValue\":\"zdgiruj\",\"description\":\"bomvzzbtdcqv\",\"documentationLink\":\"iyujviylwdshfs\",\"defaultValue\":\"rbgyefry\",\"dataType\":\"gaojf\",\"allowedValues\":\"nc\",\"source\":\"user-override\",\"isReadOnly\":\"True\",\"isConfigPendingRestart\":\"False\",\"isDynamicConfig\":\"False\"},\"id\":\"ymoxoftpipiwyczu\",\"name\":\"xacpqjli\",\"type\":\"hyus\"}]}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        MySqlManager manager = MySqlManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        PagedIterable<Configuration> response = manager.configurations()
            .listByServer("fo", "jzhpjbibgjmfx", "mv", "cluyovwxnbkf", 1806347124, 1794198042,
                com.azure.core.util.Context.NONE);

        Assertions.assertEquals("cy", response.iterator().next().value());
        Assertions.assertEquals("zdgiruj", response.iterator().next().currentValue());
        Assertions.assertEquals(ConfigurationSource.USER_OVERRIDE, response.iterator().next().source());
    }
}
