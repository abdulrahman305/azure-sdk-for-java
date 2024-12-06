// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
package com.azure.resourcemanager;

import com.azure.core.util.logging.ClientLogger;
import com.azure.core.util.logging.LogLevel;
import com.azure.resourcemanager.network.models.LocalNetworkGateway;
import com.azure.resourcemanager.network.models.LocalNetworkGateways;
import com.azure.core.management.Region;
import com.azure.resourcemanager.resources.fluentcore.utils.ResourceManagerUtils;
import org.junit.jupiter.api.Assertions;

/** Tests Local Network Gateway. */
public class TestLocalNetworkGateway extends TestTemplate<LocalNetworkGateway, LocalNetworkGateways> {
    private static final ClientLogger LOGGER = new ClientLogger(TestLocalNetworkGateway.class);

    private String testId = "";
    private static final Region REGION = Region.US_NORTH_CENTRAL;
    private String groupName;
    private String lngwName;

    private void initializeResourceNames(ResourceManagerUtils.InternalRuntimeContext internalContext) {
        testId = internalContext.randomResourceName("", 8);
        groupName = "rg" + testId;
        lngwName = "lngw" + testId;
    }

    @Override
    public LocalNetworkGateway createResource(LocalNetworkGateways localNetworkGateways) throws Exception {
        initializeResourceNames(localNetworkGateways.manager().resourceManager().internalContext());
        LocalNetworkGateway gateway = localNetworkGateways.define(lngwName)
            .withRegion(REGION)
            .withNewResourceGroup(groupName)
            .withIPAddress("40.71.184.214")
            .withAddressSpace("192.168.3.0/24")
            .withAddressSpace("192.168.4.0/27")
            .create();
        Assertions.assertEquals("40.71.184.214", gateway.ipAddress());
        Assertions.assertEquals(2, gateway.addressSpaces().size());
        Assertions.assertTrue(gateway.addressSpaces().contains("192.168.4.0/27"));
        return gateway;
    }

    @Override
    public LocalNetworkGateway updateResource(LocalNetworkGateway gateway) throws Exception {
        gateway.update()
            .withoutAddressSpace("192.168.3.0/24")
            .withIPAddress("40.71.184.216")
            .withTag("tag2", "value2")
            .withoutTag("tag1")
            .apply();
        Assertions.assertFalse(gateway.addressSpaces().contains("192.168.3.0/24"));
        Assertions.assertEquals("40.71.184.216", gateway.ipAddress());
        Assertions.assertTrue(gateway.tags().containsKey("tag2"));
        Assertions.assertFalse(gateway.tags().containsKey("tag1"));
        gateway.updateTags().withoutTag("tag2").withTag("tag3", "value3").applyTags();
        Assertions.assertFalse(gateway.tags().containsKey("tag2"));
        Assertions.assertEquals("value3", gateway.tags().get("tag3"));
        return gateway;
    }

    @Override
    public void print(LocalNetworkGateway gateway) {
        StringBuilder info = new StringBuilder();
        info.append("Local Network Gateway: ")
            .append(gateway.id())
            .append("\n\tName: ")
            .append(gateway.name())
            .append("\n\tResource group: ")
            .append(gateway.resourceGroupName())
            .append("\n\tRegion: ")
            .append(gateway.regionName())
            .append("\n\tIP address: ")
            .append(gateway.ipAddress());
        if (!gateway.addressSpaces().isEmpty()) {
            info.append("\n\tAddress spaces:");
            for (String addressSpace : gateway.addressSpaces()) {
                info.append("\n\t\t").append(addressSpace);
            }
        }
        info.append("\n\tTags: ").append(gateway.tags());
        LOGGER.log(LogLevel.VERBOSE, info::toString);
    }
}
