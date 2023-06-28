// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.managednetworkfabric.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.managednetworkfabric.fluent.models.InternalNetworkPatchProperties;
import com.azure.resourcemanager.managednetworkfabric.models.AllowASOverride;
import com.azure.resourcemanager.managednetworkfabric.models.BfdConfiguration;
import com.azure.resourcemanager.managednetworkfabric.models.BgpConfiguration;
import com.azure.resourcemanager.managednetworkfabric.models.BooleanEnumProperty;
import com.azure.resourcemanager.managednetworkfabric.models.ConnectedSubnet;
import com.azure.resourcemanager.managednetworkfabric.models.NeighborAddress;
import com.azure.resourcemanager.managednetworkfabric.models.StaticRouteConfiguration;
import com.azure.resourcemanager.managednetworkfabric.models.StaticRouteProperties;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class InternalNetworkPatchPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        InternalNetworkPatchProperties model =
            BinaryData
                .fromString(
                    "{\"mtu\":1307171109,\"connectedIPv4Subnets\":[{\"prefix\":\"gqggebdunygae\",\"annotation\":\"db\"},{\"prefix\":\"atpxl\",\"annotation\":\"xcyjmoadsuvarmy\"}],\"connectedIPv6Subnets\":[{\"prefix\":\"sjqbjhhyxxrw\",\"annotation\":\"co\"},{\"prefix\":\"hp\",\"annotation\":\"kgymareqnajxqug\"}],\"staticRouteConfiguration\":{\"bfdConfiguration\":{\"administrativeState\":\"Disabled\",\"interval\":314169873,\"multiplier\":642347272},\"ipv4Routes\":[{\"prefix\":\"ssofwqmzqa\",\"nextHop\":[]},{\"prefix\":\"krmnjijpxacqqud\",\"nextHop\":[]}],\"ipv6Routes\":[{\"prefix\":\"yxbaaabjyvayf\",\"nextHop\":[]},{\"prefix\":\"imrzrtuzqog\",\"nextHop\":[]},{\"prefix\":\"exn\",\"nextHop\":[]}]},\"bgpConfiguration\":{\"bfdConfiguration\":{\"administrativeState\":\"Enabled\",\"interval\":512160368,\"multiplier\":2059840008},\"defaultRouteOriginate\":\"False\",\"allowAS\":1440499034,\"allowASOverride\":\"Disable\",\"fabricASN\":1475196585,\"peerASN\":1091496648,\"ipv4ListenRangePrefixes\":[\"oibjudpfrxtrthz\",\"aytdwkqbrq\",\"bpaxhexiilivpdt\"],\"ipv6ListenRangePrefixes\":[\"q\"],\"ipv4NeighborAddress\":[{\"address\":\"axoruzfgsquy\",\"operationalState\":\"rxxle\"},{\"address\":\"ramxjezwlwnw\",\"operationalState\":\"qlcvydy\"},{\"address\":\"tdooaoj\",\"operationalState\":\"iodkooebwnujhem\"}],\"ipv6NeighborAddress\":[{\"address\":\"dkcrodt\",\"operationalState\":\"nfwjlfltkacjvefk\"},{\"address\":\"foakgg\",\"operationalState\":\"pagao\"},{\"address\":\"ulpqblylsyxkqjn\",\"operationalState\":\"ervtiagxs\"}],\"annotation\":\"zuempsbzkf\"},\"importRoutePolicyId\":\"eyvpnqicvinvkj\",\"exportRoutePolicyId\":\"dxrbuukzcle\",\"annotation\":\"hmlwpaztzpo\"}")
                .toObject(InternalNetworkPatchProperties.class);
        Assertions.assertEquals("hmlwpaztzpo", model.annotation());
        Assertions.assertEquals(1307171109, model.mtu());
        Assertions.assertEquals("db", model.connectedIPv4Subnets().get(0).annotation());
        Assertions.assertEquals("gqggebdunygae", model.connectedIPv4Subnets().get(0).prefix());
        Assertions.assertEquals("co", model.connectedIPv6Subnets().get(0).annotation());
        Assertions.assertEquals("sjqbjhhyxxrw", model.connectedIPv6Subnets().get(0).prefix());
        Assertions.assertEquals("ssofwqmzqa", model.staticRouteConfiguration().ipv4Routes().get(0).prefix());
        Assertions.assertEquals("yxbaaabjyvayf", model.staticRouteConfiguration().ipv6Routes().get(0).prefix());
        Assertions.assertEquals("zuempsbzkf", model.bgpConfiguration().annotation());
        Assertions.assertEquals(BooleanEnumProperty.FALSE, model.bgpConfiguration().defaultRouteOriginate());
        Assertions.assertEquals(1440499034, model.bgpConfiguration().allowAS());
        Assertions.assertEquals(AllowASOverride.DISABLE, model.bgpConfiguration().allowASOverride());
        Assertions.assertEquals(1091496648, model.bgpConfiguration().peerAsn());
        Assertions.assertEquals("oibjudpfrxtrthz", model.bgpConfiguration().ipv4ListenRangePrefixes().get(0));
        Assertions.assertEquals("q", model.bgpConfiguration().ipv6ListenRangePrefixes().get(0));
        Assertions.assertEquals("axoruzfgsquy", model.bgpConfiguration().ipv4NeighborAddress().get(0).address());
        Assertions.assertEquals("dkcrodt", model.bgpConfiguration().ipv6NeighborAddress().get(0).address());
        Assertions.assertEquals("eyvpnqicvinvkj", model.importRoutePolicyId());
        Assertions.assertEquals("dxrbuukzcle", model.exportRoutePolicyId());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        InternalNetworkPatchProperties model =
            new InternalNetworkPatchProperties()
                .withAnnotation("hmlwpaztzpo")
                .withMtu(1307171109)
                .withConnectedIPv4Subnets(
                    Arrays
                        .asList(
                            new ConnectedSubnet().withAnnotation("db").withPrefix("gqggebdunygae"),
                            new ConnectedSubnet().withAnnotation("xcyjmoadsuvarmy").withPrefix("atpxl")))
                .withConnectedIPv6Subnets(
                    Arrays
                        .asList(
                            new ConnectedSubnet().withAnnotation("co").withPrefix("sjqbjhhyxxrw"),
                            new ConnectedSubnet().withAnnotation("kgymareqnajxqug").withPrefix("hp")))
                .withStaticRouteConfiguration(
                    new StaticRouteConfiguration()
                        .withBfdConfiguration(new BfdConfiguration())
                        .withIpv4Routes(
                            Arrays
                                .asList(
                                    new StaticRouteProperties().withPrefix("ssofwqmzqa").withNextHop(Arrays.asList()),
                                    new StaticRouteProperties()
                                        .withPrefix("krmnjijpxacqqud")
                                        .withNextHop(Arrays.asList())))
                        .withIpv6Routes(
                            Arrays
                                .asList(
                                    new StaticRouteProperties()
                                        .withPrefix("yxbaaabjyvayf")
                                        .withNextHop(Arrays.asList()),
                                    new StaticRouteProperties().withPrefix("imrzrtuzqog").withNextHop(Arrays.asList()),
                                    new StaticRouteProperties().withPrefix("exn").withNextHop(Arrays.asList()))))
                .withBgpConfiguration(
                    new BgpConfiguration()
                        .withAnnotation("zuempsbzkf")
                        .withBfdConfiguration(new BfdConfiguration())
                        .withDefaultRouteOriginate(BooleanEnumProperty.FALSE)
                        .withAllowAS(1440499034)
                        .withAllowASOverride(AllowASOverride.DISABLE)
                        .withPeerAsn(1091496648)
                        .withIpv4ListenRangePrefixes(Arrays.asList("oibjudpfrxtrthz", "aytdwkqbrq", "bpaxhexiilivpdt"))
                        .withIpv6ListenRangePrefixes(Arrays.asList("q"))
                        .withIpv4NeighborAddress(
                            Arrays
                                .asList(
                                    new NeighborAddress().withAddress("axoruzfgsquy"),
                                    new NeighborAddress().withAddress("ramxjezwlwnw"),
                                    new NeighborAddress().withAddress("tdooaoj")))
                        .withIpv6NeighborAddress(
                            Arrays
                                .asList(
                                    new NeighborAddress().withAddress("dkcrodt"),
                                    new NeighborAddress().withAddress("foakgg"),
                                    new NeighborAddress().withAddress("ulpqblylsyxkqjn"))))
                .withImportRoutePolicyId("eyvpnqicvinvkj")
                .withExportRoutePolicyId("dxrbuukzcle");
        model = BinaryData.fromObject(model).toObject(InternalNetworkPatchProperties.class);
        Assertions.assertEquals("hmlwpaztzpo", model.annotation());
        Assertions.assertEquals(1307171109, model.mtu());
        Assertions.assertEquals("db", model.connectedIPv4Subnets().get(0).annotation());
        Assertions.assertEquals("gqggebdunygae", model.connectedIPv4Subnets().get(0).prefix());
        Assertions.assertEquals("co", model.connectedIPv6Subnets().get(0).annotation());
        Assertions.assertEquals("sjqbjhhyxxrw", model.connectedIPv6Subnets().get(0).prefix());
        Assertions.assertEquals("ssofwqmzqa", model.staticRouteConfiguration().ipv4Routes().get(0).prefix());
        Assertions.assertEquals("yxbaaabjyvayf", model.staticRouteConfiguration().ipv6Routes().get(0).prefix());
        Assertions.assertEquals("zuempsbzkf", model.bgpConfiguration().annotation());
        Assertions.assertEquals(BooleanEnumProperty.FALSE, model.bgpConfiguration().defaultRouteOriginate());
        Assertions.assertEquals(1440499034, model.bgpConfiguration().allowAS());
        Assertions.assertEquals(AllowASOverride.DISABLE, model.bgpConfiguration().allowASOverride());
        Assertions.assertEquals(1091496648, model.bgpConfiguration().peerAsn());
        Assertions.assertEquals("oibjudpfrxtrthz", model.bgpConfiguration().ipv4ListenRangePrefixes().get(0));
        Assertions.assertEquals("q", model.bgpConfiguration().ipv6ListenRangePrefixes().get(0));
        Assertions.assertEquals("axoruzfgsquy", model.bgpConfiguration().ipv4NeighborAddress().get(0).address());
        Assertions.assertEquals("dkcrodt", model.bgpConfiguration().ipv6NeighborAddress().get(0).address());
        Assertions.assertEquals("eyvpnqicvinvkj", model.importRoutePolicyId());
        Assertions.assertEquals("dxrbuukzcle", model.exportRoutePolicyId());
    }
}