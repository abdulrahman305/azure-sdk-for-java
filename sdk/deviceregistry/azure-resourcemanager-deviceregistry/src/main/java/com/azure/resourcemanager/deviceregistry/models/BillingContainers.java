// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.deviceregistry.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/**
 * Resource collection API of BillingContainers.
 */
public interface BillingContainers {
    /**
     * Get a BillingContainer.
     * 
     * @param billingContainerName Name of the billing container.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a BillingContainer along with {@link Response}.
     */
    Response<BillingContainer> getWithResponse(String billingContainerName, Context context);

    /**
     * Get a BillingContainer.
     * 
     * @param billingContainerName Name of the billing container.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a BillingContainer.
     */
    BillingContainer get(String billingContainerName);

    /**
     * List BillingContainer resources by subscription ID.
     * 
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response of a BillingContainer list operation as paginated response with {@link PagedIterable}.
     */
    PagedIterable<BillingContainer> list();

    /**
     * List BillingContainer resources by subscription ID.
     * 
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response of a BillingContainer list operation as paginated response with {@link PagedIterable}.
     */
    PagedIterable<BillingContainer> list(Context context);
}
