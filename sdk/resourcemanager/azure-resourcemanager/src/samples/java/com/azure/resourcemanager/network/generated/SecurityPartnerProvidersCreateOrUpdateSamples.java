// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated;

import com.azure.core.management.SubResource;
import com.azure.resourcemanager.network.fluent.models.SecurityPartnerProviderInner;
import com.azure.resourcemanager.network.models.SecurityProviderName;
import java.util.HashMap;
import java.util.Map;

/**
 * Samples for SecurityPartnerProviders CreateOrUpdate.
 */
public final class SecurityPartnerProvidersCreateOrUpdateSamples {
    /*
     * x-ms-original-file:
     * specification/network/resource-manager/Microsoft.Network/stable/2024-07-01/examples/SecurityPartnerProviderPut.
     * json
     */
    /**
     * Sample code: Create Security Partner Provider.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void createSecurityPartnerProvider(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.networks()
            .manager()
            .serviceClient()
            .getSecurityPartnerProviders()
            .createOrUpdate("rg1", "securityPartnerProvider",
                new SecurityPartnerProviderInner().withLocation("West US")
                    .withTags(mapOf("key1", "fakeTokenPlaceholder"))
                    .withSecurityProviderName(SecurityProviderName.ZSCALER)
                    .withVirtualHub(new SubResource().withId(
                        "/subscriptions/subid/resourceGroups/rg1/providers/Microsoft.Network/virtualHubs/hub1")),
                com.azure.core.util.Context.NONE);
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
