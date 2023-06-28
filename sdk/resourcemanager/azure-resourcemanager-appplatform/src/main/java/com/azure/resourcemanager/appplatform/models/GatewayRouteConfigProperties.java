// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appplatform.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** API route config of the Spring Cloud Gateway. */
@Fluent
public final class GatewayRouteConfigProperties {
    /*
     * State of the Spring Cloud Gateway route config.
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private GatewayProvisioningState provisioningState;

    /*
     * The resource Id of the Azure Spring Apps app, required unless route
     * defines `uri`.
     */
    @JsonProperty(value = "appResourceId")
    private String appResourceId;

    /*
     * OpenAPI properties of Spring Cloud Gateway route config.
     */
    @JsonProperty(value = "openApi")
    private GatewayRouteConfigOpenApiProperties openApi;

    /*
     * Protocol of routed Azure Spring Apps applications.
     */
    @JsonProperty(value = "protocol")
    private GatewayRouteConfigProtocol protocol;

    /*
     * Array of API routes, each route contains properties such as `title`,
     * `uri`, `ssoEnabled`, `predicates`, `filters`.
     */
    @JsonProperty(value = "routes")
    private List<GatewayApiRoute> routes;

    /**
     * Get the provisioningState property: State of the Spring Cloud Gateway route config.
     *
     * @return the provisioningState value.
     */
    public GatewayProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the appResourceId property: The resource Id of the Azure Spring Apps app, required unless route defines
     * `uri`.
     *
     * @return the appResourceId value.
     */
    public String appResourceId() {
        return this.appResourceId;
    }

    /**
     * Set the appResourceId property: The resource Id of the Azure Spring Apps app, required unless route defines
     * `uri`.
     *
     * @param appResourceId the appResourceId value to set.
     * @return the GatewayRouteConfigProperties object itself.
     */
    public GatewayRouteConfigProperties withAppResourceId(String appResourceId) {
        this.appResourceId = appResourceId;
        return this;
    }

    /**
     * Get the openApi property: OpenAPI properties of Spring Cloud Gateway route config.
     *
     * @return the openApi value.
     */
    public GatewayRouteConfigOpenApiProperties openApi() {
        return this.openApi;
    }

    /**
     * Set the openApi property: OpenAPI properties of Spring Cloud Gateway route config.
     *
     * @param openApi the openApi value to set.
     * @return the GatewayRouteConfigProperties object itself.
     */
    public GatewayRouteConfigProperties withOpenApi(GatewayRouteConfigOpenApiProperties openApi) {
        this.openApi = openApi;
        return this;
    }

    /**
     * Get the protocol property: Protocol of routed Azure Spring Apps applications.
     *
     * @return the protocol value.
     */
    public GatewayRouteConfigProtocol protocol() {
        return this.protocol;
    }

    /**
     * Set the protocol property: Protocol of routed Azure Spring Apps applications.
     *
     * @param protocol the protocol value to set.
     * @return the GatewayRouteConfigProperties object itself.
     */
    public GatewayRouteConfigProperties withProtocol(GatewayRouteConfigProtocol protocol) {
        this.protocol = protocol;
        return this;
    }

    /**
     * Get the routes property: Array of API routes, each route contains properties such as `title`, `uri`,
     * `ssoEnabled`, `predicates`, `filters`.
     *
     * @return the routes value.
     */
    public List<GatewayApiRoute> routes() {
        return this.routes;
    }

    /**
     * Set the routes property: Array of API routes, each route contains properties such as `title`, `uri`,
     * `ssoEnabled`, `predicates`, `filters`.
     *
     * @param routes the routes value to set.
     * @return the GatewayRouteConfigProperties object itself.
     */
    public GatewayRouteConfigProperties withRoutes(List<GatewayApiRoute> routes) {
        this.routes = routes;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (openApi() != null) {
            openApi().validate();
        }
        if (routes() != null) {
            routes().forEach(e -> e.validate());
        }
    }
}