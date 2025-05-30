// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.generated;

/**
 * Samples for SqlResources ListSqlUserDefinedFunctions.
 */
public final class SqlResourcesListSqlUserDefinedFunctionsSamples {
    /*
     * x-ms-original-file: specification/cosmos-db/resource-manager/Microsoft.DocumentDB/stable/2025-04-15/examples/
     * CosmosDBSqlUserDefinedFunctionList.json
     */
    /**
     * Sample code: CosmosDBSqlUserDefinedFunctionList.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void cosmosDBSqlUserDefinedFunctionList(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.cosmosDBAccounts()
            .manager()
            .serviceClient()
            .getSqlResources()
            .listSqlUserDefinedFunctions("rgName", "ddb1", "databaseName", "containerName",
                com.azure.core.util.Context.NONE);
    }
}
