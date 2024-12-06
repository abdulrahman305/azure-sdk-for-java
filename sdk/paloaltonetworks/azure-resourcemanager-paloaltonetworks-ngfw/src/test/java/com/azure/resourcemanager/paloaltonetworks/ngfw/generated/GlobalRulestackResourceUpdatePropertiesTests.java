// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.paloaltonetworks.ngfw.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.paloaltonetworks.ngfw.models.DefaultMode;
import com.azure.resourcemanager.paloaltonetworks.ngfw.models.GlobalRulestackResourceUpdateProperties;
import com.azure.resourcemanager.paloaltonetworks.ngfw.models.ScopeType;
import com.azure.resourcemanager.paloaltonetworks.ngfw.models.SecurityServices;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class GlobalRulestackResourceUpdatePropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        GlobalRulestackResourceUpdateProperties model = BinaryData.fromString(
            "{\"panEtag\":\"igeho\",\"panLocation\":\"bowsk\",\"scope\":\"LOCAL\",\"associatedSubscriptions\":[\"zlcuiywgqywgndrv\",\"nhzgpphrcgyn\",\"ocpecfvmmco\",\"fsxlzevgbmqjqa\"],\"description\":\"y\",\"defaultMode\":\"FIREWALL\",\"minAppIdVersion\":\"kwlzuvccfwnfn\",\"securityServices\":{\"vulnerabilityProfile\":\"fionl\",\"antiSpywareProfile\":\"x\",\"antiVirusProfile\":\"qgtz\",\"urlFilteringProfile\":\"pnqbqqwxrjfe\",\"fileBlockingProfile\":\"lnwsubisn\",\"dnsSubscription\":\"mpmngnzscxaqwoo\",\"outboundUnTrustCertificate\":\"cbonqvpk\",\"outboundTrustCertificate\":\"rxnjeaseipheofl\"}}")
            .toObject(GlobalRulestackResourceUpdateProperties.class);
        Assertions.assertEquals("igeho", model.panEtag());
        Assertions.assertEquals("bowsk", model.panLocation());
        Assertions.assertEquals(ScopeType.LOCAL, model.scope());
        Assertions.assertEquals("zlcuiywgqywgndrv", model.associatedSubscriptions().get(0));
        Assertions.assertEquals("y", model.description());
        Assertions.assertEquals(DefaultMode.FIREWALL, model.defaultMode());
        Assertions.assertEquals("kwlzuvccfwnfn", model.minAppIdVersion());
        Assertions.assertEquals("fionl", model.securityServices().vulnerabilityProfile());
        Assertions.assertEquals("x", model.securityServices().antiSpywareProfile());
        Assertions.assertEquals("qgtz", model.securityServices().antiVirusProfile());
        Assertions.assertEquals("pnqbqqwxrjfe", model.securityServices().urlFilteringProfile());
        Assertions.assertEquals("lnwsubisn", model.securityServices().fileBlockingProfile());
        Assertions.assertEquals("mpmngnzscxaqwoo", model.securityServices().dnsSubscription());
        Assertions.assertEquals("cbonqvpk", model.securityServices().outboundUnTrustCertificate());
        Assertions.assertEquals("rxnjeaseipheofl", model.securityServices().outboundTrustCertificate());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        GlobalRulestackResourceUpdateProperties model
            = new GlobalRulestackResourceUpdateProperties().withPanEtag("igeho")
                .withPanLocation("bowsk")
                .withScope(ScopeType.LOCAL)
                .withAssociatedSubscriptions(
                    Arrays.asList("zlcuiywgqywgndrv", "nhzgpphrcgyn", "ocpecfvmmco", "fsxlzevgbmqjqa"))
                .withDescription("y")
                .withDefaultMode(DefaultMode.FIREWALL)
                .withMinAppIdVersion("kwlzuvccfwnfn")
                .withSecurityServices(new SecurityServices().withVulnerabilityProfile("fionl")
                    .withAntiSpywareProfile("x")
                    .withAntiVirusProfile("qgtz")
                    .withUrlFilteringProfile("pnqbqqwxrjfe")
                    .withFileBlockingProfile("lnwsubisn")
                    .withDnsSubscription("mpmngnzscxaqwoo")
                    .withOutboundUnTrustCertificate("cbonqvpk")
                    .withOutboundTrustCertificate("rxnjeaseipheofl"));
        model = BinaryData.fromObject(model).toObject(GlobalRulestackResourceUpdateProperties.class);
        Assertions.assertEquals("igeho", model.panEtag());
        Assertions.assertEquals("bowsk", model.panLocation());
        Assertions.assertEquals(ScopeType.LOCAL, model.scope());
        Assertions.assertEquals("zlcuiywgqywgndrv", model.associatedSubscriptions().get(0));
        Assertions.assertEquals("y", model.description());
        Assertions.assertEquals(DefaultMode.FIREWALL, model.defaultMode());
        Assertions.assertEquals("kwlzuvccfwnfn", model.minAppIdVersion());
        Assertions.assertEquals("fionl", model.securityServices().vulnerabilityProfile());
        Assertions.assertEquals("x", model.securityServices().antiSpywareProfile());
        Assertions.assertEquals("qgtz", model.securityServices().antiVirusProfile());
        Assertions.assertEquals("pnqbqqwxrjfe", model.securityServices().urlFilteringProfile());
        Assertions.assertEquals("lnwsubisn", model.securityServices().fileBlockingProfile());
        Assertions.assertEquals("mpmngnzscxaqwoo", model.securityServices().dnsSubscription());
        Assertions.assertEquals("cbonqvpk", model.securityServices().outboundUnTrustCertificate());
        Assertions.assertEquals("rxnjeaseipheofl", model.securityServices().outboundTrustCertificate());
    }
}
