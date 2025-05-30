// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.peering.implementation;

import com.azure.resourcemanager.peering.fluent.models.PeeringServiceLocationInner;
import com.azure.resourcemanager.peering.models.PeeringServiceLocation;

public final class PeeringServiceLocationImpl implements PeeringServiceLocation {
    private PeeringServiceLocationInner innerObject;

    private final com.azure.resourcemanager.peering.PeeringManager serviceManager;

    PeeringServiceLocationImpl(PeeringServiceLocationInner innerObject,
        com.azure.resourcemanager.peering.PeeringManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public String country() {
        return this.innerModel().country();
    }

    public String state() {
        return this.innerModel().state();
    }

    public String azureRegion() {
        return this.innerModel().azureRegion();
    }

    public PeeringServiceLocationInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.peering.PeeringManager manager() {
        return this.serviceManager;
    }
}
