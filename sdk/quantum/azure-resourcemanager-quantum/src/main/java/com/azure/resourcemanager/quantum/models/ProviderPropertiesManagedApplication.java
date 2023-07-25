// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.quantum.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Provider's Managed-Application info. */
@Immutable
public final class ProviderPropertiesManagedApplication {
    /*
     * Provider's publisher id.
     */
    @JsonProperty(value = "publisherId", access = JsonProperty.Access.WRITE_ONLY)
    private String publisherId;

    /*
     * Provider's offer id.
     */
    @JsonProperty(value = "offerId", access = JsonProperty.Access.WRITE_ONLY)
    private String offerId;

    /** Creates an instance of ProviderPropertiesManagedApplication class. */
    public ProviderPropertiesManagedApplication() {
    }

    /**
     * Get the publisherId property: Provider's publisher id.
     *
     * @return the publisherId value.
     */
    public String publisherId() {
        return this.publisherId;
    }

    /**
     * Get the offerId property: Provider's offer id.
     *
     * @return the offerId value.
     */
    public String offerId() {
        return this.offerId;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}