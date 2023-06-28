// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.managednetworkfabric.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.managednetworkfabric.models.AnnotationResource;
import com.fasterxml.jackson.annotation.JsonProperty;

/** L2IsolationDomainPatchProperties define the patchable resource properties. */
@Fluent
public final class L2IsolationDomainPatchProperties extends AnnotationResource {
    /*
     * maximum transmission unit. Default value is 1500.
     */
    @JsonProperty(value = "mtu")
    private Integer mtu;

    /** Creates an instance of L2IsolationDomainPatchProperties class. */
    public L2IsolationDomainPatchProperties() {
    }

    /**
     * Get the mtu property: maximum transmission unit. Default value is 1500.
     *
     * @return the mtu value.
     */
    public Integer mtu() {
        return this.mtu;
    }

    /**
     * Set the mtu property: maximum transmission unit. Default value is 1500.
     *
     * @param mtu the mtu value to set.
     * @return the L2IsolationDomainPatchProperties object itself.
     */
    public L2IsolationDomainPatchProperties withMtu(Integer mtu) {
        this.mtu = mtu;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public L2IsolationDomainPatchProperties withAnnotation(String annotation) {
        super.withAnnotation(annotation);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
    }
}