// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dataprotection.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.dataprotection.models.ResourceGuardOperationDetail;
import com.azure.resourcemanager.dataprotection.models.ResourceGuardProxyBase;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class ResourceGuardProxyBaseTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ResourceGuardProxyBase model =
            BinaryData
                .fromString(
                    "{\"resourceGuardResourceId\":\"ghimdblx\",\"resourceGuardOperationDetails\":[{\"vaultCriticalOperation\":\"fnjhfjxwmszkkfo\",\"defaultResourceRequest\":\"eyfkzikfja\"},{\"vaultCriticalOperation\":\"eaivxwczel\",\"defaultResourceRequest\":\"irels\"},{\"vaultCriticalOperation\":\"aenwabf\",\"defaultResourceRequest\":\"kl\"}],\"lastUpdatedTime\":\"xbjhwuaanozjosph\",\"description\":\"ulpjr\"}")
                .toObject(ResourceGuardProxyBase.class);
        Assertions.assertEquals("ghimdblx", model.resourceGuardResourceId());
        Assertions
            .assertEquals("fnjhfjxwmszkkfo", model.resourceGuardOperationDetails().get(0).vaultCriticalOperation());
        Assertions.assertEquals("eyfkzikfja", model.resourceGuardOperationDetails().get(0).defaultResourceRequest());
        Assertions.assertEquals("xbjhwuaanozjosph", model.lastUpdatedTime());
        Assertions.assertEquals("ulpjr", model.description());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ResourceGuardProxyBase model =
            new ResourceGuardProxyBase()
                .withResourceGuardResourceId("ghimdblx")
                .withResourceGuardOperationDetails(
                    Arrays
                        .asList(
                            new ResourceGuardOperationDetail()
                                .withVaultCriticalOperation("fnjhfjxwmszkkfo")
                                .withDefaultResourceRequest("eyfkzikfja"),
                            new ResourceGuardOperationDetail()
                                .withVaultCriticalOperation("eaivxwczel")
                                .withDefaultResourceRequest("irels"),
                            new ResourceGuardOperationDetail()
                                .withVaultCriticalOperation("aenwabf")
                                .withDefaultResourceRequest("kl")))
                .withLastUpdatedTime("xbjhwuaanozjosph")
                .withDescription("ulpjr");
        model = BinaryData.fromObject(model).toObject(ResourceGuardProxyBase.class);
        Assertions.assertEquals("ghimdblx", model.resourceGuardResourceId());
        Assertions
            .assertEquals("fnjhfjxwmszkkfo", model.resourceGuardOperationDetails().get(0).vaultCriticalOperation());
        Assertions.assertEquals("eyfkzikfja", model.resourceGuardOperationDetails().get(0).defaultResourceRequest());
        Assertions.assertEquals("xbjhwuaanozjosph", model.lastUpdatedTime());
        Assertions.assertEquals("ulpjr", model.description());
    }
}