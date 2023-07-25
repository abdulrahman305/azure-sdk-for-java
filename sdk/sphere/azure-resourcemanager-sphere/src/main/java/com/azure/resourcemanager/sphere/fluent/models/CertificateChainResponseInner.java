// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sphere.fluent.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The certificate chain response. */
@Immutable
public final class CertificateChainResponseInner {
    /*
     * The certificate chain.
     */
    @JsonProperty(value = "certificateChain", access = JsonProperty.Access.WRITE_ONLY)
    private String certificateChain;

    /** Creates an instance of CertificateChainResponseInner class. */
    public CertificateChainResponseInner() {
    }

    /**
     * Get the certificateChain property: The certificate chain.
     *
     * @return the certificateChain value.
     */
    public String certificateChain() {
        return this.certificateChain;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}