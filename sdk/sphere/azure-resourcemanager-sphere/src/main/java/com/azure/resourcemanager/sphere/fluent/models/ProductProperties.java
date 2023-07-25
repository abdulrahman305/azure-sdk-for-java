// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sphere.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.sphere.models.ProvisioningState;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The properties of product. */
@Fluent
public final class ProductProperties {
    /*
     * Description of the product
     */
    @JsonProperty(value = "description", required = true)
    private String description;

    /*
     * The status of the last operation.
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /** Creates an instance of ProductProperties class. */
    public ProductProperties() {
    }

    /**
     * Get the description property: Description of the product.
     *
     * @return the description value.
     */
    public String description() {
        return this.description;
    }

    /**
     * Set the description property: Description of the product.
     *
     * @param description the description value to set.
     * @return the ProductProperties object itself.
     */
    public ProductProperties withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get the provisioningState property: The status of the last operation.
     *
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (description() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property description in model ProductProperties"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(ProductProperties.class);
}