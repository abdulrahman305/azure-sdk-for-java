// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.kubernetesconfiguration.extensiontypes.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.models.AzureCloud;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.kubernetesconfiguration.extensiontypes.ExtensionTypesManager;
import com.azure.resourcemanager.kubernetesconfiguration.extensiontypes.models.VersionForReleaseTrain;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class ExtensionTypesClusterGetVersioMockTests {
    @Test
    public void testClusterGetVersionWithResponse() throws Exception {
        String responseStr
            = "{\"properties\":{\"version\":\"vqtmnub\",\"unsupportedKubernetesVersions\":{\"connectedCluster\":[{\"distributions\":[\"smond\",\"mquxvypo\"],\"unsupportedVersions\":[\"opkwhojv\",\"ajqgxy\",\"mocmbqfqvmk\",\"xozap\"]}],\"appliances\":[{\"distributions\":[\"prglya\",\"dd\",\"kcbcue\"],\"unsupportedVersions\":[\"xgc\",\"qibrhosxsdqrhzoy\",\"i\"]},{\"distributions\":[\"qyib\"],\"unsupportedVersions\":[\"fluszdtm\",\"rkwofyyvoqa\"]},{\"distributions\":[\"expbtg\",\"wbwo\",\"nwashrtd\"],\"unsupportedVersions\":[\"nqxwbp\",\"kulpiujwaasi\",\"qiiobyuqer\",\"qlpqwcciuq\"]},{\"distributions\":[\"butauvfb\",\"kuwhh\",\"hykojoxafnndlpic\",\"koymkcd\"],\"unsupportedVersions\":[\"pkkpw\",\"reqnovvqfov\",\"jxywsuws\"]}],\"provisionedCluster\":[{\"distributions\":[\"sytgadgvraea\",\"neqn\",\"arrwlquu\"],\"unsupportedVersions\":[\"qkacewii\"]}],\"managedCluster\":[{\"distributions\":[\"ji\",\"wwiftohqkvpuv\",\"sgplsakn\"],\"unsupportedVersions\":[\"synljphuopxodl\",\"iyntorzihle\",\"sjswsrms\"]},{\"distributions\":[\"rpzbchckqqzqi\",\"xiy\"],\"unsupportedVersions\":[\"i\",\"ynkedyatrwyhqmib\",\"yhwitsmypyynpcdp\",\"mnzgmwznmabi\"]}]},\"supportedClusterTypes\":[\"orgjhxbldt\",\"wwrlkdmtncv\"]},\"id\":\"kotl\",\"name\":\"xdy\",\"type\":\"gsyocogj\"}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        ExtensionTypesManager manager = ExtensionTypesManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureCloud.AZURE_PUBLIC_CLOUD));

        VersionForReleaseTrain response = manager.extensionTypes()
            .clusterGetVersionWithResponse("mgxcxrslpm", "twuoegrpkhjwni", "qsluicp", "ggkzzlvmbmpa",
                "modfvuefywsbpfvm", "yhrfouyftaakcpw", com.azure.core.util.Context.NONE)
            .getValue();

        Assertions.assertEquals("vqtmnub", response.properties().version());
        Assertions.assertEquals("smond",
            response.properties().unsupportedKubernetesVersions().connectedCluster().get(0).distributions().get(0));
        Assertions.assertEquals("opkwhojv",
            response.properties()
                .unsupportedKubernetesVersions()
                .connectedCluster()
                .get(0)
                .unsupportedVersions()
                .get(0));
        Assertions.assertEquals("prglya",
            response.properties().unsupportedKubernetesVersions().appliances().get(0).distributions().get(0));
        Assertions.assertEquals("xgc",
            response.properties().unsupportedKubernetesVersions().appliances().get(0).unsupportedVersions().get(0));
        Assertions.assertEquals("sytgadgvraea",
            response.properties().unsupportedKubernetesVersions().provisionedCluster().get(0).distributions().get(0));
        Assertions.assertEquals("qkacewii",
            response.properties()
                .unsupportedKubernetesVersions()
                .provisionedCluster()
                .get(0)
                .unsupportedVersions()
                .get(0));
        Assertions.assertEquals("ji",
            response.properties().unsupportedKubernetesVersions().managedCluster().get(0).distributions().get(0));
        Assertions.assertEquals("synljphuopxodl",
            response.properties().unsupportedKubernetesVersions().managedCluster().get(0).unsupportedVersions().get(0));
        Assertions.assertEquals("orgjhxbldt", response.properties().supportedClusterTypes().get(0));
    }
}
