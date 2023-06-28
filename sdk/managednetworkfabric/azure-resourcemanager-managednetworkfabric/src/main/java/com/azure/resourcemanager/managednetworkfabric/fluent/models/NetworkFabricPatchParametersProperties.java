// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.managednetworkfabric.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.managednetworkfabric.models.AnnotationResource;
import com.azure.resourcemanager.managednetworkfabric.models.TerminalServerPatchableProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Network Fabric Patch properties. */
@Fluent
public final class NetworkFabricPatchParametersProperties extends AnnotationResource {
    /*
     * Network and credentials configuration already applied to terminal server.
     */
    @JsonProperty(value = "terminalServerConfiguration")
    private TerminalServerPatchableProperties terminalServerConfiguration;

    /*
     * List of NetworkRack resource IDs under the Network Fabric. The number of racks allowed depends on the Network
     * Fabric SKU.
     */
    @JsonProperty(value = "racks", access = JsonProperty.Access.WRITE_ONLY)
    private List<String> racks;

    /*
     * List of L2IsolationDomain resource IDs under the Network Fabric.
     */
    @JsonProperty(value = "l2IsolationDomains", access = JsonProperty.Access.WRITE_ONLY)
    private List<String> l2IsolationDomains;

    /*
     * List of L3IsolationDomain resource IDs under the Network Fabric.
     */
    @JsonProperty(value = "l3IsolationDomains", access = JsonProperty.Access.WRITE_ONLY)
    private List<String> l3IsolationDomains;

    /** Creates an instance of NetworkFabricPatchParametersProperties class. */
    public NetworkFabricPatchParametersProperties() {
    }

    /**
     * Get the terminalServerConfiguration property: Network and credentials configuration already applied to terminal
     * server.
     *
     * @return the terminalServerConfiguration value.
     */
    public TerminalServerPatchableProperties terminalServerConfiguration() {
        return this.terminalServerConfiguration;
    }

    /**
     * Set the terminalServerConfiguration property: Network and credentials configuration already applied to terminal
     * server.
     *
     * @param terminalServerConfiguration the terminalServerConfiguration value to set.
     * @return the NetworkFabricPatchParametersProperties object itself.
     */
    public NetworkFabricPatchParametersProperties withTerminalServerConfiguration(
        TerminalServerPatchableProperties terminalServerConfiguration) {
        this.terminalServerConfiguration = terminalServerConfiguration;
        return this;
    }

    /**
     * Get the racks property: List of NetworkRack resource IDs under the Network Fabric. The number of racks allowed
     * depends on the Network Fabric SKU.
     *
     * @return the racks value.
     */
    public List<String> racks() {
        return this.racks;
    }

    /**
     * Get the l2IsolationDomains property: List of L2IsolationDomain resource IDs under the Network Fabric.
     *
     * @return the l2IsolationDomains value.
     */
    public List<String> l2IsolationDomains() {
        return this.l2IsolationDomains;
    }

    /**
     * Get the l3IsolationDomains property: List of L3IsolationDomain resource IDs under the Network Fabric.
     *
     * @return the l3IsolationDomains value.
     */
    public List<String> l3IsolationDomains() {
        return this.l3IsolationDomains;
    }

    /** {@inheritDoc} */
    @Override
    public NetworkFabricPatchParametersProperties withAnnotation(String annotation) {
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
        if (terminalServerConfiguration() != null) {
            terminalServerConfiguration().validate();
        }
    }
}