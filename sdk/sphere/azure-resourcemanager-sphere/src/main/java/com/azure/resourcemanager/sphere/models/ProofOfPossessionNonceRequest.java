// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sphere.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Request for the proof of possession nonce. */
@Fluent
public final class ProofOfPossessionNonceRequest {
    /*
     * The proof of possession nonce
     */
    @JsonProperty(value = "proofOfPossessionNonce", required = true)
    private String proofOfPossessionNonce;

    /** Creates an instance of ProofOfPossessionNonceRequest class. */
    public ProofOfPossessionNonceRequest() {
    }

    /**
     * Get the proofOfPossessionNonce property: The proof of possession nonce.
     *
     * @return the proofOfPossessionNonce value.
     */
    public String proofOfPossessionNonce() {
        return this.proofOfPossessionNonce;
    }

    /**
     * Set the proofOfPossessionNonce property: The proof of possession nonce.
     *
     * @param proofOfPossessionNonce the proofOfPossessionNonce value to set.
     * @return the ProofOfPossessionNonceRequest object itself.
     */
    public ProofOfPossessionNonceRequest withProofOfPossessionNonce(String proofOfPossessionNonce) {
        this.proofOfPossessionNonce = proofOfPossessionNonce;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (proofOfPossessionNonce() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property proofOfPossessionNonce in model ProofOfPossessionNonceRequest"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(ProofOfPossessionNonceRequest.class);
}