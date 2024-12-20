// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearningservices.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Defines an Aml Instance application and its connectivity endpoint URI. */
@Fluent
public final class ComputeInstanceApplication {
    @JsonIgnore
    private final ClientLogger logger = new ClientLogger(ComputeInstanceApplication.class);

    /*
     * Name of the ComputeInstance application.
     */
    @JsonProperty(value = "displayName")
    private String displayName;

    /*
     * Application' endpoint URI.
     */
    @JsonProperty(value = "endpointUri")
    private String endpointUri;

    /**
     * Get the displayName property: Name of the ComputeInstance application.
     *
     * @return the displayName value.
     */
    public String displayName() {
        return this.displayName;
    }

    /**
     * Set the displayName property: Name of the ComputeInstance application.
     *
     * @param displayName the displayName value to set.
     * @return the ComputeInstanceApplication object itself.
     */
    public ComputeInstanceApplication withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * Get the endpointUri property: Application' endpoint URI.
     *
     * @return the endpointUri value.
     */
    public String endpointUri() {
        return this.endpointUri;
    }

    /**
     * Set the endpointUri property: Application' endpoint URI.
     *
     * @param endpointUri the endpointUri value to set.
     * @return the ComputeInstanceApplication object itself.
     */
    public ComputeInstanceApplication withEndpointUri(String endpointUri) {
        this.endpointUri = endpointUri;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
