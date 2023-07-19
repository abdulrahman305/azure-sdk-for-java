// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.managednetworkfabric.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.managednetworkfabric.models.BfdConfiguration;
import com.azure.resourcemanager.managednetworkfabric.models.ManagementNetworkConfigurationPatchableProperties;
import com.azure.resourcemanager.managednetworkfabric.models.OptionBProperties;
import com.azure.resourcemanager.managednetworkfabric.models.PeeringOption;
import com.azure.resourcemanager.managednetworkfabric.models.RouteTargetInformation;
import com.azure.resourcemanager.managednetworkfabric.models.VpnConfigurationPatchableProperties;
import com.azure.resourcemanager.managednetworkfabric.models.VpnConfigurationPatchablePropertiesOptionAProperties;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class ManagementNetworkConfigurationPatchablePropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ManagementNetworkConfigurationPatchableProperties model =
            BinaryData
                .fromString(
                    "{\"infrastructureVpnConfiguration\":{\"networkToNetworkInterconnectId\":\"xiy\",\"peeringOption\":\"OptionB\",\"optionBProperties\":{\"importRouteTargets\":[\"zkbnzxbypfqp\",\"aix\",\"r\"],\"exportRouteTargets\":[\"kderf\",\"swqi\",\"wepwoggg\"],\"routeTargets\":{\"importIpv4RouteTargets\":[\"xhtfmcqbsudzpgch\",\"pgfqum\"],\"importIpv6RouteTargets\":[\"xhzghgodkynr\",\"eqavfdbdfmmxj\"],\"exportIpv4RouteTargets\":[\"juopjyyqm\",\"wlhvcwloqdejk\"],\"exportIpv6RouteTargets\":[\"xrwzo\"]}},\"optionAProperties\":{\"primaryIpv4Prefix\":\"msxgamtdtkwpp\",\"primaryIpv6Prefix\":\"uzdprmim\",\"secondaryIpv4Prefix\":\"j\",\"secondaryIpv6Prefix\":\"oqfx\",\"mtu\":611774756,\"vlanId\":340762854,\"peerASN\":8642884475129275171,\"bfdConfiguration\":{\"administrativeState\":\"RMA\",\"intervalInMilliSeconds\":1174463151,\"multiplier\":1493397500}}},\"workloadVpnConfiguration\":{\"networkToNetworkInterconnectId\":\"amfmxtllfl\",\"peeringOption\":\"OptionA\",\"optionBProperties\":{\"importRouteTargets\":[\"rrfijhgg\",\"bqbgamklilirwdv\",\"fhsdpzouhkt\",\"rxqwqnjxrd\"],\"exportRouteTargets\":[\"t\",\"llygta\",\"czcxdfw\",\"a\"],\"routeTargets\":{\"importIpv4RouteTargets\":[\"lxrljphraspifl\"],\"importIpv6RouteTargets\":[\"ixlmdbgic\"],\"exportIpv4RouteTargets\":[\"gs\",\"drjuqbp\",\"tokljmtznpaxw\"],\"exportIpv6RouteTargets\":[\"yyqiprcltungbsol\",\"ckmiig\",\"b\",\"uck\"]}},\"optionAProperties\":{\"primaryIpv4Prefix\":\"s\",\"primaryIpv6Prefix\":\"w\",\"secondaryIpv4Prefix\":\"iqqcq\",\"secondaryIpv6Prefix\":\"clsmal\",\"mtu\":1664987985,\"vlanId\":1369091717,\"peerASN\":6072079351329651797,\"bfdConfiguration\":{\"administrativeState\":\"Disabled\",\"intervalInMilliSeconds\":1895252476,\"multiplier\":1687559611}}}}")
                .toObject(ManagementNetworkConfigurationPatchableProperties.class);
        Assertions.assertEquals("xiy", model.infrastructureVpnConfiguration().networkToNetworkInterconnectId());
        Assertions.assertEquals(PeeringOption.OPTIONB, model.infrastructureVpnConfiguration().peeringOption());
        Assertions
            .assertEquals(
                "zkbnzxbypfqp", model.infrastructureVpnConfiguration().optionBProperties().importRouteTargets().get(0));
        Assertions
            .assertEquals(
                "kderf", model.infrastructureVpnConfiguration().optionBProperties().exportRouteTargets().get(0));
        Assertions
            .assertEquals(
                "xhtfmcqbsudzpgch",
                model
                    .infrastructureVpnConfiguration()
                    .optionBProperties()
                    .routeTargets()
                    .importIpv4RouteTargets()
                    .get(0));
        Assertions
            .assertEquals(
                "xhzghgodkynr",
                model
                    .infrastructureVpnConfiguration()
                    .optionBProperties()
                    .routeTargets()
                    .importIpv6RouteTargets()
                    .get(0));
        Assertions
            .assertEquals(
                "juopjyyqm",
                model
                    .infrastructureVpnConfiguration()
                    .optionBProperties()
                    .routeTargets()
                    .exportIpv4RouteTargets()
                    .get(0));
        Assertions
            .assertEquals(
                "xrwzo",
                model
                    .infrastructureVpnConfiguration()
                    .optionBProperties()
                    .routeTargets()
                    .exportIpv6RouteTargets()
                    .get(0));
        Assertions.assertEquals(611774756, model.infrastructureVpnConfiguration().optionAProperties().mtu());
        Assertions.assertEquals(340762854, model.infrastructureVpnConfiguration().optionAProperties().vlanId());
        Assertions
            .assertEquals(8642884475129275171L, model.infrastructureVpnConfiguration().optionAProperties().peerAsn());
        Assertions
            .assertEquals(
                1174463151,
                model.infrastructureVpnConfiguration().optionAProperties().bfdConfiguration().intervalInMilliSeconds());
        Assertions
            .assertEquals(
                1493397500, model.infrastructureVpnConfiguration().optionAProperties().bfdConfiguration().multiplier());
        Assertions
            .assertEquals(
                "msxgamtdtkwpp", model.infrastructureVpnConfiguration().optionAProperties().primaryIpv4Prefix());
        Assertions
            .assertEquals("uzdprmim", model.infrastructureVpnConfiguration().optionAProperties().primaryIpv6Prefix());
        Assertions.assertEquals("j", model.infrastructureVpnConfiguration().optionAProperties().secondaryIpv4Prefix());
        Assertions
            .assertEquals("oqfx", model.infrastructureVpnConfiguration().optionAProperties().secondaryIpv6Prefix());
        Assertions.assertEquals("amfmxtllfl", model.workloadVpnConfiguration().networkToNetworkInterconnectId());
        Assertions.assertEquals(PeeringOption.OPTIONA, model.workloadVpnConfiguration().peeringOption());
        Assertions
            .assertEquals("rrfijhgg", model.workloadVpnConfiguration().optionBProperties().importRouteTargets().get(0));
        Assertions.assertEquals("t", model.workloadVpnConfiguration().optionBProperties().exportRouteTargets().get(0));
        Assertions
            .assertEquals(
                "lxrljphraspifl",
                model.workloadVpnConfiguration().optionBProperties().routeTargets().importIpv4RouteTargets().get(0));
        Assertions
            .assertEquals(
                "ixlmdbgic",
                model.workloadVpnConfiguration().optionBProperties().routeTargets().importIpv6RouteTargets().get(0));
        Assertions
            .assertEquals(
                "gs",
                model.workloadVpnConfiguration().optionBProperties().routeTargets().exportIpv4RouteTargets().get(0));
        Assertions
            .assertEquals(
                "yyqiprcltungbsol",
                model.workloadVpnConfiguration().optionBProperties().routeTargets().exportIpv6RouteTargets().get(0));
        Assertions.assertEquals(1664987985, model.workloadVpnConfiguration().optionAProperties().mtu());
        Assertions.assertEquals(1369091717, model.workloadVpnConfiguration().optionAProperties().vlanId());
        Assertions.assertEquals(6072079351329651797L, model.workloadVpnConfiguration().optionAProperties().peerAsn());
        Assertions
            .assertEquals(
                1895252476,
                model.workloadVpnConfiguration().optionAProperties().bfdConfiguration().intervalInMilliSeconds());
        Assertions
            .assertEquals(
                1687559611, model.workloadVpnConfiguration().optionAProperties().bfdConfiguration().multiplier());
        Assertions.assertEquals("s", model.workloadVpnConfiguration().optionAProperties().primaryIpv4Prefix());
        Assertions.assertEquals("w", model.workloadVpnConfiguration().optionAProperties().primaryIpv6Prefix());
        Assertions.assertEquals("iqqcq", model.workloadVpnConfiguration().optionAProperties().secondaryIpv4Prefix());
        Assertions.assertEquals("clsmal", model.workloadVpnConfiguration().optionAProperties().secondaryIpv6Prefix());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ManagementNetworkConfigurationPatchableProperties model =
            new ManagementNetworkConfigurationPatchableProperties()
                .withInfrastructureVpnConfiguration(
                    new VpnConfigurationPatchableProperties()
                        .withNetworkToNetworkInterconnectId("xiy")
                        .withPeeringOption(PeeringOption.OPTIONB)
                        .withOptionBProperties(
                            new OptionBProperties()
                                .withImportRouteTargets(Arrays.asList("zkbnzxbypfqp", "aix", "r"))
                                .withExportRouteTargets(Arrays.asList("kderf", "swqi", "wepwoggg"))
                                .withRouteTargets(
                                    new RouteTargetInformation()
                                        .withImportIpv4RouteTargets(Arrays.asList("xhtfmcqbsudzpgch", "pgfqum"))
                                        .withImportIpv6RouteTargets(Arrays.asList("xhzghgodkynr", "eqavfdbdfmmxj"))
                                        .withExportIpv4RouteTargets(Arrays.asList("juopjyyqm", "wlhvcwloqdejk"))
                                        .withExportIpv6RouteTargets(Arrays.asList("xrwzo"))))
                        .withOptionAProperties(
                            new VpnConfigurationPatchablePropertiesOptionAProperties()
                                .withMtu(611774756)
                                .withVlanId(340762854)
                                .withPeerAsn(8642884475129275171L)
                                .withBfdConfiguration(
                                    new BfdConfiguration()
                                        .withIntervalInMilliSeconds(1174463151)
                                        .withMultiplier(1493397500))
                                .withPrimaryIpv4Prefix("msxgamtdtkwpp")
                                .withPrimaryIpv6Prefix("uzdprmim")
                                .withSecondaryIpv4Prefix("j")
                                .withSecondaryIpv6Prefix("oqfx")))
                .withWorkloadVpnConfiguration(
                    new VpnConfigurationPatchableProperties()
                        .withNetworkToNetworkInterconnectId("amfmxtllfl")
                        .withPeeringOption(PeeringOption.OPTIONA)
                        .withOptionBProperties(
                            new OptionBProperties()
                                .withImportRouteTargets(
                                    Arrays.asList("rrfijhgg", "bqbgamklilirwdv", "fhsdpzouhkt", "rxqwqnjxrd"))
                                .withExportRouteTargets(Arrays.asList("t", "llygta", "czcxdfw", "a"))
                                .withRouteTargets(
                                    new RouteTargetInformation()
                                        .withImportIpv4RouteTargets(Arrays.asList("lxrljphraspifl"))
                                        .withImportIpv6RouteTargets(Arrays.asList("ixlmdbgic"))
                                        .withExportIpv4RouteTargets(Arrays.asList("gs", "drjuqbp", "tokljmtznpaxw"))
                                        .withExportIpv6RouteTargets(
                                            Arrays.asList("yyqiprcltungbsol", "ckmiig", "b", "uck"))))
                        .withOptionAProperties(
                            new VpnConfigurationPatchablePropertiesOptionAProperties()
                                .withMtu(1664987985)
                                .withVlanId(1369091717)
                                .withPeerAsn(6072079351329651797L)
                                .withBfdConfiguration(
                                    new BfdConfiguration()
                                        .withIntervalInMilliSeconds(1895252476)
                                        .withMultiplier(1687559611))
                                .withPrimaryIpv4Prefix("s")
                                .withPrimaryIpv6Prefix("w")
                                .withSecondaryIpv4Prefix("iqqcq")
                                .withSecondaryIpv6Prefix("clsmal")));
        model = BinaryData.fromObject(model).toObject(ManagementNetworkConfigurationPatchableProperties.class);
        Assertions.assertEquals("xiy", model.infrastructureVpnConfiguration().networkToNetworkInterconnectId());
        Assertions.assertEquals(PeeringOption.OPTIONB, model.infrastructureVpnConfiguration().peeringOption());
        Assertions
            .assertEquals(
                "zkbnzxbypfqp", model.infrastructureVpnConfiguration().optionBProperties().importRouteTargets().get(0));
        Assertions
            .assertEquals(
                "kderf", model.infrastructureVpnConfiguration().optionBProperties().exportRouteTargets().get(0));
        Assertions
            .assertEquals(
                "xhtfmcqbsudzpgch",
                model
                    .infrastructureVpnConfiguration()
                    .optionBProperties()
                    .routeTargets()
                    .importIpv4RouteTargets()
                    .get(0));
        Assertions
            .assertEquals(
                "xhzghgodkynr",
                model
                    .infrastructureVpnConfiguration()
                    .optionBProperties()
                    .routeTargets()
                    .importIpv6RouteTargets()
                    .get(0));
        Assertions
            .assertEquals(
                "juopjyyqm",
                model
                    .infrastructureVpnConfiguration()
                    .optionBProperties()
                    .routeTargets()
                    .exportIpv4RouteTargets()
                    .get(0));
        Assertions
            .assertEquals(
                "xrwzo",
                model
                    .infrastructureVpnConfiguration()
                    .optionBProperties()
                    .routeTargets()
                    .exportIpv6RouteTargets()
                    .get(0));
        Assertions.assertEquals(611774756, model.infrastructureVpnConfiguration().optionAProperties().mtu());
        Assertions.assertEquals(340762854, model.infrastructureVpnConfiguration().optionAProperties().vlanId());
        Assertions
            .assertEquals(8642884475129275171L, model.infrastructureVpnConfiguration().optionAProperties().peerAsn());
        Assertions
            .assertEquals(
                1174463151,
                model.infrastructureVpnConfiguration().optionAProperties().bfdConfiguration().intervalInMilliSeconds());
        Assertions
            .assertEquals(
                1493397500, model.infrastructureVpnConfiguration().optionAProperties().bfdConfiguration().multiplier());
        Assertions
            .assertEquals(
                "msxgamtdtkwpp", model.infrastructureVpnConfiguration().optionAProperties().primaryIpv4Prefix());
        Assertions
            .assertEquals("uzdprmim", model.infrastructureVpnConfiguration().optionAProperties().primaryIpv6Prefix());
        Assertions.assertEquals("j", model.infrastructureVpnConfiguration().optionAProperties().secondaryIpv4Prefix());
        Assertions
            .assertEquals("oqfx", model.infrastructureVpnConfiguration().optionAProperties().secondaryIpv6Prefix());
        Assertions.assertEquals("amfmxtllfl", model.workloadVpnConfiguration().networkToNetworkInterconnectId());
        Assertions.assertEquals(PeeringOption.OPTIONA, model.workloadVpnConfiguration().peeringOption());
        Assertions
            .assertEquals("rrfijhgg", model.workloadVpnConfiguration().optionBProperties().importRouteTargets().get(0));
        Assertions.assertEquals("t", model.workloadVpnConfiguration().optionBProperties().exportRouteTargets().get(0));
        Assertions
            .assertEquals(
                "lxrljphraspifl",
                model.workloadVpnConfiguration().optionBProperties().routeTargets().importIpv4RouteTargets().get(0));
        Assertions
            .assertEquals(
                "ixlmdbgic",
                model.workloadVpnConfiguration().optionBProperties().routeTargets().importIpv6RouteTargets().get(0));
        Assertions
            .assertEquals(
                "gs",
                model.workloadVpnConfiguration().optionBProperties().routeTargets().exportIpv4RouteTargets().get(0));
        Assertions
            .assertEquals(
                "yyqiprcltungbsol",
                model.workloadVpnConfiguration().optionBProperties().routeTargets().exportIpv6RouteTargets().get(0));
        Assertions.assertEquals(1664987985, model.workloadVpnConfiguration().optionAProperties().mtu());
        Assertions.assertEquals(1369091717, model.workloadVpnConfiguration().optionAProperties().vlanId());
        Assertions.assertEquals(6072079351329651797L, model.workloadVpnConfiguration().optionAProperties().peerAsn());
        Assertions
            .assertEquals(
                1895252476,
                model.workloadVpnConfiguration().optionAProperties().bfdConfiguration().intervalInMilliSeconds());
        Assertions
            .assertEquals(
                1687559611, model.workloadVpnConfiguration().optionAProperties().bfdConfiguration().multiplier());
        Assertions.assertEquals("s", model.workloadVpnConfiguration().optionAProperties().primaryIpv4Prefix());
        Assertions.assertEquals("w", model.workloadVpnConfiguration().optionAProperties().primaryIpv6Prefix());
        Assertions.assertEquals("iqqcq", model.workloadVpnConfiguration().optionAProperties().secondaryIpv4Prefix());
        Assertions.assertEquals("clsmal", model.workloadVpnConfiguration().optionAProperties().secondaryIpv6Prefix());
    }
}