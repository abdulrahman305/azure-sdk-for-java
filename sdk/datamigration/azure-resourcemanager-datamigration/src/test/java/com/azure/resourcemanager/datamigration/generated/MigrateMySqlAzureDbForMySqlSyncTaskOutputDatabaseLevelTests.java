// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datamigration.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datamigration.models.MigrateMySqlAzureDbForMySqlSyncTaskOutputDatabaseLevel;

public final class MigrateMySqlAzureDbForMySqlSyncTaskOutputDatabaseLevelTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        MigrateMySqlAzureDbForMySqlSyncTaskOutputDatabaseLevel model = BinaryData.fromString(
            "{\"resultType\":\"DatabaseLevelOutput\",\"databaseName\":\"ggxkallatmelwuip\",\"startedOn\":\"2021-10-19T09:34:04Z\",\"endedOn\":\"2021-06-05T01:20:37Z\",\"migrationState\":\"CANCELLED\",\"incomingChanges\":662578251116723063,\"appliedChanges\":1816332624383197418,\"cdcInsertCounter\":8713915720909474504,\"cdcDeleteCounter\":8913535749004515550,\"cdcUpdateCounter\":5279516661370439683,\"fullLoadCompletedTables\":5726286891049833981,\"fullLoadLoadingTables\":4856871253065990581,\"fullLoadQueuedTables\":3189288446104139819,\"fullLoadErroredTables\":199665361160492882,\"initializationCompleted\":true,\"latency\":5152017214547708245,\"id\":\"chea\"}")
            .toObject(MigrateMySqlAzureDbForMySqlSyncTaskOutputDatabaseLevel.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        MigrateMySqlAzureDbForMySqlSyncTaskOutputDatabaseLevel model
            = new MigrateMySqlAzureDbForMySqlSyncTaskOutputDatabaseLevel();
        model = BinaryData.fromObject(model).toObject(MigrateMySqlAzureDbForMySqlSyncTaskOutputDatabaseLevel.class);
    }
}
