// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.implementation;

import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.Get;
import com.azure.core.annotation.HeaderParam;
import com.azure.core.annotation.Headers;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.PathParam;
import com.azure.core.annotation.QueryParam;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceInterface;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.annotation.UnexpectedResponseExceptionType;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.RestProxy;
import com.azure.core.management.exception.ManagementException;
import com.azure.core.util.Context;
import com.azure.core.util.FluxUtil;
import com.azure.resourcemanager.apimanagement.fluent.ApiManagementWorkspaceLinkOperationsClient;
import com.azure.resourcemanager.apimanagement.fluent.models.ApiManagementWorkspaceLinksResourceInner;
import reactor.core.publisher.Mono;

/**
 * An instance of this class provides access to all the operations defined in
 * ApiManagementWorkspaceLinkOperationsClient.
 */
public final class ApiManagementWorkspaceLinkOperationsClientImpl
    implements ApiManagementWorkspaceLinkOperationsClient {
    /**
     * The proxy service used to perform REST calls.
     */
    private final ApiManagementWorkspaceLinkOperationsService service;

    /**
     * The service client containing this operation class.
     */
    private final ApiManagementClientImpl client;

    /**
     * Initializes an instance of ApiManagementWorkspaceLinkOperationsClientImpl.
     * 
     * @param client the instance of the service client containing this operation class.
     */
    ApiManagementWorkspaceLinkOperationsClientImpl(ApiManagementClientImpl client) {
        this.service = RestProxy.create(ApiManagementWorkspaceLinkOperationsService.class, client.getHttpPipeline(),
            client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for ApiManagementClientApiManagementWorkspaceLinkOperations to be used by
     * the proxy service to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "ApiManagementClientA")
    public interface ApiManagementWorkspaceLinkOperationsService {
        @Headers({ "Content-Type: application/json" })
        @Get("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.ApiManagement/service/{serviceName}/workspaceLinks/{workspaceId}")
        @ExpectedResponses({ 200 })
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<ApiManagementWorkspaceLinksResourceInner>> get(@HostParam("$host") String endpoint,
            @PathParam("resourceGroupName") String resourceGroupName, @PathParam("serviceName") String serviceName,
            @PathParam("workspaceId") String workspaceId, @QueryParam("api-version") String apiVersion,
            @PathParam("subscriptionId") String subscriptionId, @HeaderParam("Accept") String accept, Context context);
    }

    /**
     * Gets an API Management WorkspaceLink resource description.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serviceName The name of the API Management service.
     * @param workspaceId Workspace identifier. Must be unique in the current API Management service instance.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an API Management WorkspaceLink resource description along with {@link Response} on successful completion
     * of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<ApiManagementWorkspaceLinksResourceInner>> getWithResponseAsync(String resourceGroupName,
        String serviceName, String workspaceId) {
        if (this.client.getEndpoint() == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (serviceName == null) {
            return Mono.error(new IllegalArgumentException("Parameter serviceName is required and cannot be null."));
        }
        if (workspaceId == null) {
            return Mono.error(new IllegalArgumentException("Parameter workspaceId is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono.error(new IllegalArgumentException(
                "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(context -> service.get(this.client.getEndpoint(), resourceGroupName, serviceName, workspaceId,
                this.client.getApiVersion(), this.client.getSubscriptionId(), accept, context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Gets an API Management WorkspaceLink resource description.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serviceName The name of the API Management service.
     * @param workspaceId Workspace identifier. Must be unique in the current API Management service instance.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an API Management WorkspaceLink resource description along with {@link Response} on successful completion
     * of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<ApiManagementWorkspaceLinksResourceInner>> getWithResponseAsync(String resourceGroupName,
        String serviceName, String workspaceId, Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (serviceName == null) {
            return Mono.error(new IllegalArgumentException("Parameter serviceName is required and cannot be null."));
        }
        if (workspaceId == null) {
            return Mono.error(new IllegalArgumentException("Parameter workspaceId is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono.error(new IllegalArgumentException(
                "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service.get(this.client.getEndpoint(), resourceGroupName, serviceName, workspaceId,
            this.client.getApiVersion(), this.client.getSubscriptionId(), accept, context);
    }

    /**
     * Gets an API Management WorkspaceLink resource description.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serviceName The name of the API Management service.
     * @param workspaceId Workspace identifier. Must be unique in the current API Management service instance.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an API Management WorkspaceLink resource description on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<ApiManagementWorkspaceLinksResourceInner> getAsync(String resourceGroupName, String serviceName,
        String workspaceId) {
        return getWithResponseAsync(resourceGroupName, serviceName, workspaceId)
            .flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Gets an API Management WorkspaceLink resource description.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serviceName The name of the API Management service.
     * @param workspaceId Workspace identifier. Must be unique in the current API Management service instance.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an API Management WorkspaceLink resource description along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<ApiManagementWorkspaceLinksResourceInner> getWithResponse(String resourceGroupName,
        String serviceName, String workspaceId, Context context) {
        return getWithResponseAsync(resourceGroupName, serviceName, workspaceId, context).block();
    }

    /**
     * Gets an API Management WorkspaceLink resource description.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serviceName The name of the API Management service.
     * @param workspaceId Workspace identifier. Must be unique in the current API Management service instance.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an API Management WorkspaceLink resource description.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ApiManagementWorkspaceLinksResourceInner get(String resourceGroupName, String serviceName,
        String workspaceId) {
        return getWithResponse(resourceGroupName, serviceName, workspaceId, Context.NONE).getValue();
    }
}
