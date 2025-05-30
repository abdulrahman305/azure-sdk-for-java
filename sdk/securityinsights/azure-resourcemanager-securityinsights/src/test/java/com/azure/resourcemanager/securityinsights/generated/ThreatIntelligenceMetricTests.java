// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.securityinsights.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.securityinsights.models.ThreatIntelligenceMetric;
import com.azure.resourcemanager.securityinsights.models.ThreatIntelligenceMetricEntity;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class ThreatIntelligenceMetricTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ThreatIntelligenceMetric model = BinaryData.fromString(
            "{\"lastUpdatedTimeUtc\":\"epbqpcrfkbw\",\"threatTypeMetrics\":[{\"metricName\":\"jvcdwxlpqekf\",\"metricValue\":839437170},{\"metricName\":\"tjsyin\",\"metricValue\":291919724},{\"metricName\":\"atmtdhtmdvy\",\"metricValue\":932898449},{\"metricName\":\"dgszywkbirryuzh\",\"metricValue\":524454595}],\"patternTypeMetrics\":[{\"metricName\":\"rvqqaatj\",\"metricValue\":379667314},{\"metricName\":\"goupmfiibfg\",\"metricValue\":2107533163},{\"metricName\":\"olvrw\",\"metricValue\":148831092}],\"sourceMetrics\":[{\"metricName\":\"gllqwjy\",\"metricValue\":104545862},{\"metricName\":\"yvblmhvkzu\",\"metricValue\":919724990}]}")
            .toObject(ThreatIntelligenceMetric.class);
        Assertions.assertEquals("epbqpcrfkbw", model.lastUpdatedTimeUtc());
        Assertions.assertEquals("jvcdwxlpqekf", model.threatTypeMetrics().get(0).metricName());
        Assertions.assertEquals(839437170, model.threatTypeMetrics().get(0).metricValue());
        Assertions.assertEquals("rvqqaatj", model.patternTypeMetrics().get(0).metricName());
        Assertions.assertEquals(379667314, model.patternTypeMetrics().get(0).metricValue());
        Assertions.assertEquals("gllqwjy", model.sourceMetrics().get(0).metricName());
        Assertions.assertEquals(104545862, model.sourceMetrics().get(0).metricValue());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ThreatIntelligenceMetric model = new ThreatIntelligenceMetric().withLastUpdatedTimeUtc("epbqpcrfkbw")
            .withThreatTypeMetrics(Arrays.asList(
                new ThreatIntelligenceMetricEntity().withMetricName("jvcdwxlpqekf").withMetricValue(839437170),
                new ThreatIntelligenceMetricEntity().withMetricName("tjsyin").withMetricValue(291919724),
                new ThreatIntelligenceMetricEntity().withMetricName("atmtdhtmdvy").withMetricValue(932898449),
                new ThreatIntelligenceMetricEntity().withMetricName("dgszywkbirryuzh").withMetricValue(524454595)))
            .withPatternTypeMetrics(Arrays.asList(
                new ThreatIntelligenceMetricEntity().withMetricName("rvqqaatj").withMetricValue(379667314),
                new ThreatIntelligenceMetricEntity().withMetricName("goupmfiibfg").withMetricValue(2107533163),
                new ThreatIntelligenceMetricEntity().withMetricName("olvrw").withMetricValue(148831092)))
            .withSourceMetrics(
                Arrays.asList(new ThreatIntelligenceMetricEntity().withMetricName("gllqwjy").withMetricValue(104545862),
                    new ThreatIntelligenceMetricEntity().withMetricName("yvblmhvkzu").withMetricValue(919724990)));
        model = BinaryData.fromObject(model).toObject(ThreatIntelligenceMetric.class);
        Assertions.assertEquals("epbqpcrfkbw", model.lastUpdatedTimeUtc());
        Assertions.assertEquals("jvcdwxlpqekf", model.threatTypeMetrics().get(0).metricName());
        Assertions.assertEquals(839437170, model.threatTypeMetrics().get(0).metricValue());
        Assertions.assertEquals("rvqqaatj", model.patternTypeMetrics().get(0).metricName());
        Assertions.assertEquals(379667314, model.patternTypeMetrics().get(0).metricValue());
        Assertions.assertEquals("gllqwjy", model.sourceMetrics().get(0).metricName());
        Assertions.assertEquals(104545862, model.sourceMetrics().get(0).metricValue());
    }
}
