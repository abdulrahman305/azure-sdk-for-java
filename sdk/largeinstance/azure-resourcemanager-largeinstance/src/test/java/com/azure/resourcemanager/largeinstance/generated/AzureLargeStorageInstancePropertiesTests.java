// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.largeinstance.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.largeinstance.models.AzureLargeInstanceHardwareTypeNamesEnum;
import com.azure.resourcemanager.largeinstance.models.AzureLargeStorageInstanceProperties;
import com.azure.resourcemanager.largeinstance.models.StorageBillingProperties;
import com.azure.resourcemanager.largeinstance.models.StorageProperties;
import org.junit.jupiter.api.Assertions;

public final class AzureLargeStorageInstancePropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        AzureLargeStorageInstanceProperties model = BinaryData.fromString(
            "{\"azureLargeStorageInstanceUniqueIdentifier\":\"c\",\"storageProperties\":{\"provisioningState\":\"Failed\",\"offeringType\":\"pmouexhdz\",\"storageType\":\"bqe\",\"generation\":\"nxqbzvddn\",\"hardwareType\":\"Cisco_UCS\",\"workloadType\":\"eic\",\"storageBillingProperties\":{\"billingMode\":\"npzaoq\",\"sku\":\"hrhcffcyddglmjth\"}}}")
            .toObject(AzureLargeStorageInstanceProperties.class);
        Assertions.assertEquals("c", model.azureLargeStorageInstanceUniqueIdentifier());
        Assertions.assertEquals("pmouexhdz", model.storageProperties().offeringType());
        Assertions.assertEquals("bqe", model.storageProperties().storageType());
        Assertions.assertEquals("nxqbzvddn", model.storageProperties().generation());
        Assertions.assertEquals(AzureLargeInstanceHardwareTypeNamesEnum.CISCO_UCS,
            model.storageProperties().hardwareType());
        Assertions.assertEquals("eic", model.storageProperties().workloadType());
        Assertions.assertEquals("npzaoq", model.storageProperties().storageBillingProperties().billingMode());
        Assertions.assertEquals("hrhcffcyddglmjth", model.storageProperties().storageBillingProperties().sku());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        AzureLargeStorageInstanceProperties model
            = new AzureLargeStorageInstanceProperties().withAzureLargeStorageInstanceUniqueIdentifier("c")
                .withStorageProperties(new StorageProperties().withOfferingType("pmouexhdz")
                    .withStorageType("bqe")
                    .withGeneration("nxqbzvddn")
                    .withHardwareType(AzureLargeInstanceHardwareTypeNamesEnum.CISCO_UCS)
                    .withWorkloadType("eic")
                    .withStorageBillingProperties(
                        new StorageBillingProperties().withBillingMode("npzaoq").withSku("hrhcffcyddglmjth")));
        model = BinaryData.fromObject(model).toObject(AzureLargeStorageInstanceProperties.class);
        Assertions.assertEquals("c", model.azureLargeStorageInstanceUniqueIdentifier());
        Assertions.assertEquals("pmouexhdz", model.storageProperties().offeringType());
        Assertions.assertEquals("bqe", model.storageProperties().storageType());
        Assertions.assertEquals("nxqbzvddn", model.storageProperties().generation());
        Assertions.assertEquals(AzureLargeInstanceHardwareTypeNamesEnum.CISCO_UCS,
            model.storageProperties().hardwareType());
        Assertions.assertEquals("eic", model.storageProperties().workloadType());
        Assertions.assertEquals("npzaoq", model.storageProperties().storageBillingProperties().billingMode());
        Assertions.assertEquals("hrhcffcyddglmjth", model.storageProperties().storageBillingProperties().sku());
    }
}
