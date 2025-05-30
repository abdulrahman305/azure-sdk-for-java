// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.securityinsights.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.securityinsights.fluent.models.WatchlistItemInner;

/**
 * An instance of this class provides access to all the operations defined in WatchlistItemsClient.
 */
public interface WatchlistItemsClient {
    /**
     * Get all watchlist Items.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param watchlistAlias The watchlist alias.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all watchlist Items as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<WatchlistItemInner> list(String resourceGroupName, String workspaceName, String watchlistAlias);

    /**
     * Get all watchlist Items.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param watchlistAlias The watchlist alias.
     * @param skipToken Skiptoken is only used if a previous operation returned a partial result. If a previous response
     * contains a nextLink element, the value of the nextLink element will include a skiptoken parameter that specifies
     * a starting point to use for subsequent calls. Optional.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all watchlist Items as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<WatchlistItemInner> list(String resourceGroupName, String workspaceName, String watchlistAlias,
        String skipToken, Context context);

    /**
     * Get a watchlist item.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param watchlistAlias The watchlist alias.
     * @param watchlistItemId The watchlist item id (GUID).
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a watchlist item along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<WatchlistItemInner> getWithResponse(String resourceGroupName, String workspaceName, String watchlistAlias,
        String watchlistItemId, Context context);

    /**
     * Get a watchlist item.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param watchlistAlias The watchlist alias.
     * @param watchlistItemId The watchlist item id (GUID).
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a watchlist item.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    WatchlistItemInner get(String resourceGroupName, String workspaceName, String watchlistAlias,
        String watchlistItemId);

    /**
     * Delete a watchlist item.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param watchlistAlias The watchlist alias.
     * @param watchlistItemId The watchlist item id (GUID).
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<Void> deleteWithResponse(String resourceGroupName, String workspaceName, String watchlistAlias,
        String watchlistItemId, Context context);

    /**
     * Delete a watchlist item.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param watchlistAlias The watchlist alias.
     * @param watchlistItemId The watchlist item id (GUID).
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String workspaceName, String watchlistAlias, String watchlistItemId);

    /**
     * Create or update a watchlist item.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param watchlistAlias The watchlist alias.
     * @param watchlistItemId The watchlist item id (GUID).
     * @param watchlistItem The watchlist item.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents a Watchlist Item in Azure Security Insights along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<WatchlistItemInner> createOrUpdateWithResponse(String resourceGroupName, String workspaceName,
        String watchlistAlias, String watchlistItemId, WatchlistItemInner watchlistItem, Context context);

    /**
     * Create or update a watchlist item.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param watchlistAlias The watchlist alias.
     * @param watchlistItemId The watchlist item id (GUID).
     * @param watchlistItem The watchlist item.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents a Watchlist Item in Azure Security Insights.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    WatchlistItemInner createOrUpdate(String resourceGroupName, String workspaceName, String watchlistAlias,
        String watchlistItemId, WatchlistItemInner watchlistItem);
}
