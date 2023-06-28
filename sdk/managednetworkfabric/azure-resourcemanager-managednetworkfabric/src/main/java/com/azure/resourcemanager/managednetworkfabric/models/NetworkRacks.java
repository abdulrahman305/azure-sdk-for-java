// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.managednetworkfabric.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of NetworkRacks. */
public interface NetworkRacks {
    /**
     * Gets a Network Rack.
     *
     * <p>Get Network Rack resource details.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param networkRackName Name of the Network Rack.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return network Rack resource details along with {@link Response}.
     */
    Response<NetworkRack> getByResourceGroupWithResponse(
        String resourceGroupName, String networkRackName, Context context);

    /**
     * Gets a Network Rack.
     *
     * <p>Get Network Rack resource details.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param networkRackName Name of the Network Rack.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return network Rack resource details.
     */
    NetworkRack getByResourceGroup(String resourceGroupName, String networkRackName);

    /**
     * Deletes a Network Rack.
     *
     * <p>Delete Network Rack resource.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param networkRackName Name of the Network Rack.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteByResourceGroup(String resourceGroupName, String networkRackName);

    /**
     * Deletes a Network Rack.
     *
     * <p>Delete Network Rack resource.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param networkRackName Name of the Network Rack.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String networkRackName, Context context);

    /**
     * List NetworkRacks by resource group.
     *
     * <p>List all Network Rack resources in the given resource group.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of NetworkRacks as paginated response with {@link PagedIterable}.
     */
    PagedIterable<NetworkRack> listByResourceGroup(String resourceGroupName);

    /**
     * List NetworkRacks by resource group.
     *
     * <p>List all Network Rack resources in the given resource group.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of NetworkRacks as paginated response with {@link PagedIterable}.
     */
    PagedIterable<NetworkRack> listByResourceGroup(String resourceGroupName, Context context);

    /**
     * List NetworkRacks by subscription.
     *
     * <p>List all Network Rack resources in the given subscription.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of NetworkRacks as paginated response with {@link PagedIterable}.
     */
    PagedIterable<NetworkRack> list();

    /**
     * List NetworkRacks by subscription.
     *
     * <p>List all Network Rack resources in the given subscription.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of NetworkRacks as paginated response with {@link PagedIterable}.
     */
    PagedIterable<NetworkRack> list(Context context);

    /**
     * Gets a Network Rack.
     *
     * <p>Get Network Rack resource details.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return network Rack resource details along with {@link Response}.
     */
    NetworkRack getById(String id);

    /**
     * Gets a Network Rack.
     *
     * <p>Get Network Rack resource details.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return network Rack resource details along with {@link Response}.
     */
    Response<NetworkRack> getByIdWithResponse(String id, Context context);

    /**
     * Deletes a Network Rack.
     *
     * <p>Delete Network Rack resource.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteById(String id);

    /**
     * Deletes a Network Rack.
     *
     * <p>Delete Network Rack resource.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteByIdWithResponse(String id, Context context);

    /**
     * Begins definition for a new NetworkRack resource.
     *
     * @param name resource name.
     * @return the first stage of the new NetworkRack definition.
     */
    NetworkRack.DefinitionStages.Blank define(String name);
}