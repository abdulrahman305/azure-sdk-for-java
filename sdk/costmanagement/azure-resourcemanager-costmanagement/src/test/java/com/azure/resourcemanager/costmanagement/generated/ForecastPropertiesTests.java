// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.costmanagement.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.costmanagement.fluent.models.ForecastProperties;
import com.azure.resourcemanager.costmanagement.models.ForecastColumn;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class ForecastPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ForecastProperties model =
            BinaryData
                .fromString(
                    "{\"nextLink\":\"nnprn\",\"columns\":[{\"name\":\"ilpjzuaejxdult\",\"type\":\"zbbtdzumveek\"},{\"name\":\"wozuhkf\",\"type\":\"sjyofdx\"},{\"name\":\"us\",\"type\":\"touwaboekqv\"},{\"name\":\"lns\",\"type\":\"bxwyjsflhhcaa\"}],\"rows\":[[\"dataxisxyawjoyaqcsl\",\"datajpkiidzyexznelix\",\"datanr\"],[\"datafolhbnxknal\",\"dataulppggdtpnapnyir\"],[\"datauhpigvp\"],[\"datalgqg\",\"datatxmedj\",\"datac\",\"datalynqwwncwzzh\"]]}")
                .toObject(ForecastProperties.class);
        Assertions.assertEquals("nnprn", model.nextLink());
        Assertions.assertEquals("ilpjzuaejxdult", model.columns().get(0).name());
        Assertions.assertEquals("zbbtdzumveek", model.columns().get(0).type());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ForecastProperties model =
            new ForecastProperties()
                .withNextLink("nnprn")
                .withColumns(
                    Arrays
                        .asList(
                            new ForecastColumn().withName("ilpjzuaejxdult").withType("zbbtdzumveek"),
                            new ForecastColumn().withName("wozuhkf").withType("sjyofdx"),
                            new ForecastColumn().withName("us").withType("touwaboekqv"),
                            new ForecastColumn().withName("lns").withType("bxwyjsflhhcaa")))
                .withRows(
                    Arrays
                        .asList(
                            Arrays.asList("dataxisxyawjoyaqcsl", "datajpkiidzyexznelix", "datanr"),
                            Arrays.asList("datafolhbnxknal", "dataulppggdtpnapnyir"),
                            Arrays.asList("datauhpigvp"),
                            Arrays.asList("datalgqg", "datatxmedj", "datac", "datalynqwwncwzzh")));
        model = BinaryData.fromObject(model).toObject(ForecastProperties.class);
        Assertions.assertEquals("nnprn", model.nextLink());
        Assertions.assertEquals("ilpjzuaejxdult", model.columns().get(0).name());
        Assertions.assertEquals("zbbtdzumveek", model.columns().get(0).type());
    }
}