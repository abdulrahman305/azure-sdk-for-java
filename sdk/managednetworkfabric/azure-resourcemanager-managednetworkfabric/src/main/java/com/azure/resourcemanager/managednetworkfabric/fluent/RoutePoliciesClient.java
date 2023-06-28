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
import com.azure.resourcemanager.managednetworkfabric.fluent.models.RoutePolicyInner;
import com.azure.resourcemanager.managednetworkfabric.models.RoutePolicyPatch;

/** An instance of this class provides access to all the operations defined in RoutePoliciesClient. */
public interface RoutePoliciesClient {
    /**
     * Create Route Policy.
     *
     * <p>Implements Route Policy PUT method.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param routePolicyName Name of the Route Policy.
     * @param body Request payload.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of the RoutePolicy resource definition.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<RoutePolicyInner>, RoutePolicyInner> beginCreate(
        String resourceGroupName, String routePolicyName, RoutePolicyInner body);

    /**
     * Create Route Policy.
     *
     * <p>Implements Route Policy PUT method.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param routePolicyName Name of the Route Policy.
     * @param body Request payload.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of the RoutePolicy resource definition.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<RoutePolicyInner>, RoutePolicyInner> beginCreate(
        String resourceGroupName, String routePolicyName, RoutePolicyInner body, Context context);

    /**
     * Create Route Policy.
     *
     * <p>Implements Route Policy PUT method.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param routePolicyName Name of the Route Policy.
     * @param body Request payload.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the RoutePolicy resource definition.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    RoutePolicyInner create(String resourceGroupName, String routePolicyName, RoutePolicyInner body);

    /**
     * Create Route Policy.
     *
     * <p>Implements Route Policy PUT method.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param routePolicyName Name of the Route Policy.
     * @param body Request payload.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the RoutePolicy resource definition.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    RoutePolicyInner create(String resourceGroupName, String routePolicyName, RoutePolicyInner body, Context context);

    /**
     * Gets a Route Policy.
     *
     * <p>Implements Route Policy GET method.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param routePolicyName Name of the Route Policy.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the RoutePolicy resource definition along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<RoutePolicyInner> getByResourceGroupWithResponse(
        String resourceGroupName, String routePolicyName, Context context);

    /**
     * Gets a Route Policy.
     *
     * <p>Implements Route Policy GET method.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param routePolicyName Name of the Route Policy.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the RoutePolicy resource definition.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    RoutePolicyInner getByResourceGroup(String resourceGroupName, String routePolicyName);

    /**
     * Updates a Route Policy.
     *
     * <p>API to update certain properties of the Route Policy resource.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param routePolicyName Name of the Route Policy.
     * @param body Route Policy properties to update.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of the RoutePolicy resource definition.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<RoutePolicyInner>, RoutePolicyInner> beginUpdate(
        String resourceGroupName, String routePolicyName, RoutePolicyPatch body);

    /**
     * Updates a Route Policy.
     *
     * <p>API to update certain properties of the Route Policy resource.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param routePolicyName Name of the Route Policy.
     * @param body Route Policy properties to update.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of the RoutePolicy resource definition.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<RoutePolicyInner>, RoutePolicyInner> beginUpdate(
        String resourceGroupName, String routePolicyName, RoutePolicyPatch body, Context context);

    /**
     * Updates a Route Policy.
     *
     * <p>API to update certain properties of the Route Policy resource.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param routePolicyName Name of the Route Policy.
     * @param body Route Policy properties to update.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the RoutePolicy resource definition.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    RoutePolicyInner update(String resourceGroupName, String routePolicyName, RoutePolicyPatch body);

    /**
     * Updates a Route Policy.
     *
     * <p>API to update certain properties of the Route Policy resource.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param routePolicyName Name of the Route Policy.
     * @param body Route Policy properties to update.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the RoutePolicy resource definition.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    RoutePolicyInner update(String resourceGroupName, String routePolicyName, RoutePolicyPatch body, Context context);

    /**
     * Deletes a Route Policy.
     *
     * <p>Implements Route Policy DELETE method.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param routePolicyName Name of the Route Policy.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(String resourceGroupName, String routePolicyName);

    /**
     * Deletes a Route Policy.
     *
     * <p>Implements Route Policy DELETE method.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param routePolicyName Name of the Route Policy.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(String resourceGroupName, String routePolicyName, Context context);

    /**
     * Deletes a Route Policy.
     *
     * <p>Implements Route Policy DELETE method.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param routePolicyName Name of the Route Policy.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String routePolicyName);

    /**
     * Deletes a Route Policy.
     *
     * <p>Implements Route Policy DELETE method.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param routePolicyName Name of the Route Policy.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String routePolicyName, Context context);

    /**
     * List RoutePolicies by resource group.
     *
     * <p>Implements RoutePolicies list by resource group GET method.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of RoutePolicies as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<RoutePolicyInner> listByResourceGroup(String resourceGroupName);

    /**
     * List RoutePolicies by resource group.
     *
     * <p>Implements RoutePolicies list by resource group GET method.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of RoutePolicies as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<RoutePolicyInner> listByResourceGroup(String resourceGroupName, Context context);

    /**
     * List RoutePolicies by subscription.
     *
     * <p>Implements RoutePolicies list by subscription GET method.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of RoutePolicies as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<RoutePolicyInner> list();

    /**
     * List RoutePolicies by subscription.
     *
     * <p>Implements RoutePolicies list by subscription GET method.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of RoutePolicies as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<RoutePolicyInner> list(Context context);
}