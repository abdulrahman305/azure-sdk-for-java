// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.datafactory.DataFactoryManager;
import com.azure.resourcemanager.datafactory.models.Activity;
import com.azure.resourcemanager.datafactory.models.ActivityDependency;
import com.azure.resourcemanager.datafactory.models.ActivityOnInactiveMarkAs;
import com.azure.resourcemanager.datafactory.models.ActivityState;
import com.azure.resourcemanager.datafactory.models.ParameterSpecification;
import com.azure.resourcemanager.datafactory.models.ParameterType;
import com.azure.resourcemanager.datafactory.models.PipelineElapsedTimeMetricPolicy;
import com.azure.resourcemanager.datafactory.models.PipelineFolder;
import com.azure.resourcemanager.datafactory.models.PipelinePolicy;
import com.azure.resourcemanager.datafactory.models.PipelineResource;
import com.azure.resourcemanager.datafactory.models.UserProperty;
import com.azure.resourcemanager.datafactory.models.VariableSpecification;
import com.azure.resourcemanager.datafactory.models.VariableType;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class PipelinesCreateOrUpdateWithResponseMockTests {
    @Test
    public void testCreateOrUpdateWithResponse() throws Exception {
        String responseStr
            = "{\"properties\":{\"description\":\"srysgab\",\"activities\":[{\"type\":\"Activity\",\"name\":\"pvadyxjcckhgstoh\",\"description\":\"rqbzlmvw\",\"state\":\"Inactive\",\"onInactiveMarkAs\":\"Succeeded\",\"dependsOn\":[{\"activity\":\"qumpspo\",\"dependencyConditions\":[]}],\"userProperties\":[{\"name\":\"pnyzytgkdwvt\",\"value\":\"datamvqliqzf\"},{\"name\":\"lprljilpuav\",\"value\":\"dataidytjmkfx\"},{\"name\":\"go\",\"value\":\"datackmmagfbreyvr\"}],\"\":{\"urlywxjvs\":\"dataikwqtlgfry\",\"qmikljczxotblx\":\"datazchysqypt\"}},{\"type\":\"Activity\",\"name\":\"pqfxyywsxrxv\",\"description\":\"wkzaqqkqyijy\",\"state\":\"Inactive\",\"onInactiveMarkAs\":\"Skipped\",\"dependsOn\":[{\"activity\":\"qiqzmgx\",\"dependencyConditions\":[]},{\"activity\":\"nldbkuqc\",\"dependencyConditions\":[]}],\"userProperties\":[{\"name\":\"wzqnbjkstvbmfnj\",\"value\":\"dataz\"}],\"\":{\"agehqghxj\":\"dataowyyy\",\"xpaytzqgsaegaahw\":\"dataiggcaimk\",\"hgrgiu\":\"dataerd\"}}],\"parameters\":{\"brdamdnebko\":{\"type\":\"Bool\",\"defaultValue\":\"datavoskji\"},\"hepjs\":{\"type\":\"String\",\"defaultValue\":\"dataknmza\"},\"bw\":{\"type\":\"Bool\",\"defaultValue\":\"datauhhfohsp\"},\"djsakigrlmiglnqr\":{\"type\":\"Int\",\"defaultValue\":\"datalavuecmdmcor\"}},\"variables\":{\"di\":{\"type\":\"Array\",\"defaultValue\":\"dataquwsfebhvkk\"},\"yotejljdrerzjwex\":{\"type\":\"String\",\"defaultValue\":\"datalioagvijr\"},\"dcxf\":{\"type\":\"String\",\"defaultValue\":\"dataxbeufzb\"}},\"concurrency\":886481924,\"annotations\":[\"datazme\",\"datacjsneybpqot\",\"datadb\",\"dataljs\"],\"runDimensions\":{\"lauupwt\":\"datauptre\",\"ab\":\"datatpbi\",\"kxbgfed\":\"dataegcogyctekaaju\"},\"folder\":{\"name\":\"jsyors\"},\"policy\":{\"elapsedTimeMetric\":{\"duration\":\"datatqragq\"}}},\"name\":\"ouxspkxapqgyh\",\"type\":\"qkkwzbgbwwop\",\"etag\":\"dwsekr\",\"\":{\"btztwvhgkmxarqt\":\"datalqstmi\",\"oxdwox\":\"datazeo\",\"bswfjrtxf\":\"datanqt\",\"flbaxywojtryrd\":\"datahaqpmlyzwgotl\"},\"id\":\"gt\"}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        DataFactoryManager manager = DataFactoryManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        PipelineResource response = manager.pipelines()
            .define("brkrfvlqwije")
            .withExistingFactory("fhqxhtcohrhw", "vvomcjpjrxvsgga")
            .withDescription("npihtgigaeeqg")
            .withActivities(Arrays.asList(
                new Activity().withName("rozlfccpgeqix")
                    .withDescription("gltqld")
                    .withState(ActivityState.INACTIVE)
                    .withOnInactiveMarkAs(ActivityOnInactiveMarkAs.SKIPPED)
                    .withDependsOn(Arrays.asList(new ActivityDependency().withActivity("ld")
                        .withDependencyConditions(Arrays.asList())
                        .withAdditionalProperties(mapOf())))
                    .withUserProperties(
                        Arrays.asList(new UserProperty().withName("cajhnnbp").withValue("datanogyvpfyjlfnjmwb"),
                            new UserProperty().withName("oqhy").withValue("datarpwkvz"),
                            new UserProperty().withName("bvdlhcyoykmp").withValue("datatfc"),
                            new UserProperty().withName("ugitjnwajqzig").withValue("datafea")))
                    .withAdditionalProperties(mapOf("type", "Activity")),
                new Activity().withName("edaqpquzcvmrux")
                    .withDescription("slausvbvtctiso")
                    .withState(ActivityState.INACTIVE)
                    .withOnInactiveMarkAs(ActivityOnInactiveMarkAs.SKIPPED)
                    .withDependsOn(Arrays.asList(
                        new ActivityDependency().withActivity("bacmnjzjjrhvd")
                            .withDependencyConditions(Arrays.asList())
                            .withAdditionalProperties(mapOf()),
                        new ActivityDependency().withActivity("fstmbbjil")
                            .withDependencyConditions(Arrays.asList())
                            .withAdditionalProperties(mapOf())))
                    .withUserProperties(
                        Arrays.asList(new UserProperty().withName("ctykc").withValue("dataksvflurrfnlhlfv"),
                            new UserProperty().withName("rohyecblvpwu").withValue("dataqvmfuuhm")))
                    .withAdditionalProperties(mapOf("type", "Activity")),
                new Activity().withName("mgvipzvvrfplkemv")
                    .withDescription("gezy")
                    .withState(ActivityState.INACTIVE)
                    .withOnInactiveMarkAs(ActivityOnInactiveMarkAs.FAILED)
                    .withDependsOn(Arrays.asList(new ActivityDependency().withActivity("wplyv")
                        .withDependencyConditions(Arrays.asList())
                        .withAdditionalProperties(mapOf())))
                    .withUserProperties(Arrays.asList(new UserProperty().withName("pemcf").withValue("dataxkifjvil"),
                        new UserProperty().withName("zopwud").withValue("dataew"),
                        new UserProperty().withName("xaufowhmd").withValue("dataggakt")))
                    .withAdditionalProperties(mapOf("type", "Activity"))))
            .withParameters(mapOf("ftdfmzlgjcepx",
                new ParameterSpecification().withType(ParameterType.FLOAT).withDefaultValue("dataaddmji"), "wyclehagb",
                new ParameterSpecification().withType(ParameterType.SECURE_STRING).withDefaultValue("datawvpavutis"),
                "mpzamq", new ParameterSpecification().withType(ParameterType.BOOL).withDefaultValue("dataet")))
            .withVariables(mapOf("hmwxhvspumokm",
                new VariableSpecification().withType(VariableType.BOOL).withDefaultValue("datayyphtd")))
            .withConcurrency(1435502173)
            .withAnnotations(Arrays.asList("datatpvebxesuc", "dataynsqxyowwrb", "dataej"))
            .withRunDimensions(mapOf("sw", "datarshl"))
            .withFolder(new PipelineFolder().withName("rusxyugidk"))
            .withPolicy(new PipelinePolicy()
                .withElapsedTimeMetric(new PipelineElapsedTimeMetricPolicy().withDuration("datavdtrtkqqd")))
            .withIfMatch("kmdaihgiglk")
            .create();

        Assertions.assertEquals("gt", response.id());
        Assertions.assertEquals("srysgab", response.description());
        Assertions.assertEquals("pvadyxjcckhgstoh", response.activities().get(0).name());
        Assertions.assertEquals("rqbzlmvw", response.activities().get(0).description());
        Assertions.assertEquals(ActivityState.INACTIVE, response.activities().get(0).state());
        Assertions.assertEquals(ActivityOnInactiveMarkAs.SUCCEEDED, response.activities().get(0).onInactiveMarkAs());
        Assertions.assertEquals("qumpspo", response.activities().get(0).dependsOn().get(0).activity());
        Assertions.assertEquals("pnyzytgkdwvt", response.activities().get(0).userProperties().get(0).name());
        Assertions.assertEquals(ParameterType.BOOL, response.parameters().get("brdamdnebko").type());
        Assertions.assertEquals(VariableType.ARRAY, response.variables().get("di").type());
        Assertions.assertEquals(886481924, response.concurrency());
        Assertions.assertEquals("jsyors", response.folder().name());
    }

    // Use "Map.of" if available
    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}
