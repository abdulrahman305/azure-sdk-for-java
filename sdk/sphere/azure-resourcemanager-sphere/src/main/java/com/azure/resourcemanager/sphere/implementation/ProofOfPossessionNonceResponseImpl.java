// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sphere.implementation;

import com.azure.resourcemanager.sphere.fluent.models.ProofOfPossessionNonceResponseInner;
import com.azure.resourcemanager.sphere.models.CertificateStatus;
import com.azure.resourcemanager.sphere.models.ProofOfPossessionNonceResponse;
import com.azure.resourcemanager.sphere.models.ProvisioningState;
import java.time.OffsetDateTime;

public final class ProofOfPossessionNonceResponseImpl implements ProofOfPossessionNonceResponse {
    private ProofOfPossessionNonceResponseInner innerObject;

    private final com.azure.resourcemanager.sphere.AzureSphereManager serviceManager;

    ProofOfPossessionNonceResponseImpl(
        ProofOfPossessionNonceResponseInner innerObject,
        com.azure.resourcemanager.sphere.AzureSphereManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String certificate() {
        return this.innerModel().certificate();
    }

    public CertificateStatus status() {
        return this.innerModel().status();
    }

    public String subject() {
        return this.innerModel().subject();
    }

    public String thumbprint() {
        return this.innerModel().thumbprint();
    }

    public OffsetDateTime expiryUtc() {
        return this.innerModel().expiryUtc();
    }

    public OffsetDateTime notBeforeUtc() {
        return this.innerModel().notBeforeUtc();
    }

    public ProvisioningState provisioningState() {
        return this.innerModel().provisioningState();
    }

    public ProofOfPossessionNonceResponseInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.sphere.AzureSphereManager manager() {
        return this.serviceManager;
    }
}