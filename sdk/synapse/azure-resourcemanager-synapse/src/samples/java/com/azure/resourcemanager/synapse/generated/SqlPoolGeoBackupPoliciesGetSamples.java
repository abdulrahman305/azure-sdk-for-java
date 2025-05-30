// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.generated;

import com.azure.resourcemanager.synapse.models.GeoBackupPolicyName;

/**
 * Samples for SqlPoolGeoBackupPolicies Get.
 */
public final class SqlPoolGeoBackupPoliciesGetSamples {
    /*
     * x-ms-original-file:
     * specification/synapse/resource-manager/Microsoft.Synapse/stable/2021-03-01/examples/GetSqlPoolGeoBackupPolicy.
     * json
     */
    /**
     * Sample code: Get Sql pool geo backup policy.
     * 
     * @param manager Entry point to SynapseManager.
     */
    public static void getSqlPoolGeoBackupPolicy(com.azure.resourcemanager.synapse.SynapseManager manager) {
        manager.sqlPoolGeoBackupPolicies()
            .getWithResponse("sqlcrudtest-4799", "sqlcrudtest-5961", "testdw", GeoBackupPolicyName.DEFAULT,
                com.azure.core.util.Context.NONE);
    }
}
