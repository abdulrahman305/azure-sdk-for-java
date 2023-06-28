// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.managednetworkfabric.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.managednetworkfabric.fluent.models.IpExtendedCommunityInner;
import com.azure.resourcemanager.managednetworkfabric.models.IpExtendedCommunityPatch;

/** An instance of this class provides access to all the operations defined in IpExtendedCommunitiesClient. */
public interface IpExtendedCommunitiesClient {
    /**
     * Create an IP Extended Community.
     *
     * <p>Implements IP Extended Community PUT method.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param ipExtendedCommunityName Name of the IP Extended Community.
     * @param body Request payload.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of the IpExtendedCommunity resource definition.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<IpExtendedCommunityInner>, IpExtendedCommunityInner> beginCreate(
        String resourceGroupName, String ipExtendedCommunityName, IpExtendedCommunityInner body);

    /**
     * Create an IP Extended Community.
     *
     * <p>Implements IP Extended Community PUT method.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param ipExtendedCommunityName Name of the IP Extended Community.
     * @param body Request payload.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of the IpExtendedCommunity resource definition.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<IpExtendedCommunityInner>, IpExtendedCommunityInner> beginCreate(
        String resourceGroupName, String ipExtendedCommunityName, IpExtendedCommunityInner body, Context context);

    /**
     * Create an IP Extended Community.
     *
     * <p>Implements IP Extended Community PUT method.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param ipExtendedCommunityName Name of the IP Extended Community.
     * @param body Request payload.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the IpExtendedCommunity resource definition.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    IpExtendedCommunityInner create(
        String resourceGroupName, String ipExtendedCommunityName, IpExtendedCommunityInner body);

    /**
     * Create an IP Extended Community.
     *
     * <p>Implements IP Extended Community PUT method.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param ipExtendedCommunityName Name of the IP Extended Community.
     * @param body Request payload.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the IpExtendedCommunity resource definition.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    IpExtendedCommunityInner create(
        String resourceGroupName, String ipExtendedCommunityName, IpExtendedCommunityInner body, Context context);

    /**
     * Gets an IP Extended Community.
     *
     * <p>Implements IP Extended Community GET method.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param ipExtendedCommunityName Name of the IP Extended Community.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the IpExtendedCommunity resource definition along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<IpExtendedCommunityInner> getByResourceGroupWithResponse(
        String resourceGroupName, String ipExtendedCommunityName, Context context);

    /**
     * Gets an IP Extended Community.
     *
     * <p>Implements IP Extended Community GET method.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param ipExtendedCommunityName Name of the IP Extended Community.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the IpExtendedCommunity resource definition.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    IpExtendedCommunityInner getByResourceGroup(String resourceGroupName, String ipExtendedCommunityName);

    /**
     * Updates the IP Extended Community.
     *
     * <p>API to update certain properties of the IP Extended Community resource.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param ipExtendedCommunityName Name of the IP Extended Community.
     * @param body IP Extended Community properties to update.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of the IpExtendedCommunity resource definition.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<IpExtendedCommunityInner>, IpExtendedCommunityInner> beginUpdate(
        String resourceGroupName, String ipExtendedCommunityName, IpExtendedCommunityPatch body);

    /**
     * Updates the IP Extended Community.
     *
     * <p>API to update certain properties of the IP Extended Community resource.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param ipExtendedCommunityName Name of the IP Extended Community.
     * @param body IP Extended Community properties to update.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of the IpExtendedCommunity resource definition.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<IpExtendedCommunityInner>, IpExtendedCommunityInner> beginUpdate(
        String resourceGroupName, String ipExtendedCommunityName, IpExtendedCommunityPatch body, Context context);

    /**
     * Updates the IP Extended Community.
     *
     * <p>API to update certain properties of the IP Extended Community resource.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param ipExtendedCommunityName Name of the IP Extended Community.
     * @param body IP Extended Community properties to update.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the IpExtendedCommunity resource definition.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    IpExtendedCommunityInner update(
        String resourceGroupName, String ipExtendedCommunityName, IpExtendedCommunityPatch body);

    /**
     * Updates the IP Extended Community.
     *
     * <p>API to update certain properties of the IP Extended Community resource.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param ipExtendedCommunityName Name of the IP Extended Community.
     * @param body IP Extended Community properties to update.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the IpExtendedCommunity resource definition.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    IpExtendedCommunityInner update(
        String resourceGroupName, String ipExtendedCommunityName, IpExtendedCommunityPatch body, Context context);

    /**
     * Deletes the IP Extended Community.
     *
     * <p>Implements IP Extended Community DELETE method.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param ipExtendedCommunityName Name of the IP Extended Community.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(String resourceGroupName, String ipExtendedCommunityName);

    /**
     * Deletes the IP Extended Community.
     *
     * <p>Implements IP Extended Community DELETE method.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param ipExtendedCommunityName Name of the IP Extended Community.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(
        String resourceGroupName, String ipExtendedCommunityName, Context context);

    /**
     * Deletes the IP Extended Community.
     *
     * <p>Implements IP Extended Community DELETE method.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param ipExtendedCommunityName Name of the IP Extended Community.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String ipExtendedCommunityName);

    /**
     * Deletes the IP Extended Community.
     *
     * <p>Implements IP Extended Community DELETE method.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param ipExtendedCommunityName Name of the IP Extended Community.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String ipExtendedCommunityName, Context context);

    /**
     * List IpExtendedCommunities by resource group.
     *
     * <p>Implements IpExtendedCommunities list by resource group GET method.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of IpExtendedCommunities as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<IpExtendedCommunityInner> listByResourceGroup(String resourceGroupName);

    /**
     * List IpExtendedCommunities by resource group.
     *
     * <p>Implements IpExtendedCommunities list by resource group GET method.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of IpExtendedCommunities as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<IpExtendedCommunityInner> listByResourceGroup(String resourceGroupName, Context context);

    /**
     * List IpExtendedCommunities by subscription.
     *
     * <p>Implements IpExtendedCommunities list by subscription GET method.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of IpExtendedCommunities as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<IpExtendedCommunityInner> list();

    /**
     * List IpExtendedCommunities by subscription.
     *
     * <p>Implements IpExtendedCommunities list by subscription GET method.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of IpExtendedCommunities as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<IpExtendedCommunityInner> list(Context context);
}