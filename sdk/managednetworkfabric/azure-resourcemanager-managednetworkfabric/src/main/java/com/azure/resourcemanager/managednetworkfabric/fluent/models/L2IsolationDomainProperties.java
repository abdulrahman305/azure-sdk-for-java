// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.managednetworkfabric.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.managednetworkfabric.models.AnnotationResource;
import com.azure.resourcemanager.managednetworkfabric.models.EnabledDisabledState;
import com.azure.resourcemanager.managednetworkfabric.models.ProvisioningState;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** L2IsolationDomainProperties define the resource properties. */
@Fluent
public final class L2IsolationDomainProperties extends AnnotationResource {
    /*
     * Network Fabric ARM resource id.
     */
    @JsonProperty(value = "networkFabricId", required = true)
    private String networkFabricId;

    /*
     * vlanId. Example: 501.
     */
    @JsonProperty(value = "vlanId", required = true)
    private int vlanId;

    /*
     * maximum transmission unit. Default value is 1500.
     */
    @JsonProperty(value = "mtu")
    private Integer mtu;

    /*
     * List of resources the L2 Isolation Domain is disabled on. Can be either entire NetworkFabric or NetworkRack.
     */
    @JsonProperty(value = "disabledOnResources", access = JsonProperty.Access.WRITE_ONLY)
    private List<String> disabledOnResources;

    /*
     * state. Example: Enabled | Disabled. It indicates administrative state of the isolationDomain, whether it is
     * enabled or disabled. If enabled, the configuration is applied on the devices. If disabled, the configuration is
     * removed from the devices
     */
    @JsonProperty(value = "administrativeState", access = JsonProperty.Access.WRITE_ONLY)
    private EnabledDisabledState administrativeState;

    /*
     * Gets the provisioning state of the resource.
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /** Creates an instance of L2IsolationDomainProperties class. */
    public L2IsolationDomainProperties() {
    }

    /**
     * Get the networkFabricId property: Network Fabric ARM resource id.
     *
     * @return the networkFabricId value.
     */
    public String networkFabricId() {
        return this.networkFabricId;
    }

    /**
     * Set the networkFabricId property: Network Fabric ARM resource id.
     *
     * @param networkFabricId the networkFabricId value to set.
     * @return the L2IsolationDomainProperties object itself.
     */
    public L2IsolationDomainProperties withNetworkFabricId(String networkFabricId) {
        this.networkFabricId = networkFabricId;
        return this;
    }

    /**
     * Get the vlanId property: vlanId. Example: 501.
     *
     * @return the vlanId value.
     */
    public int vlanId() {
        return this.vlanId;
    }

    /**
     * Set the vlanId property: vlanId. Example: 501.
     *
     * @param vlanId the vlanId value to set.
     * @return the L2IsolationDomainProperties object itself.
     */
    public L2IsolationDomainProperties withVlanId(int vlanId) {
        this.vlanId = vlanId;
        return this;
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
     * @return the L2IsolationDomainProperties object itself.
     */
    public L2IsolationDomainProperties withMtu(Integer mtu) {
        this.mtu = mtu;
        return this;
    }

    /**
     * Get the disabledOnResources property: List of resources the L2 Isolation Domain is disabled on. Can be either
     * entire NetworkFabric or NetworkRack.
     *
     * @return the disabledOnResources value.
     */
    public List<String> disabledOnResources() {
        return this.disabledOnResources;
    }

    /**
     * Get the administrativeState property: state. Example: Enabled | Disabled. It indicates administrative state of
     * the isolationDomain, whether it is enabled or disabled. If enabled, the configuration is applied on the devices.
     * If disabled, the configuration is removed from the devices.
     *
     * @return the administrativeState value.
     */
    public EnabledDisabledState administrativeState() {
        return this.administrativeState;
    }

    /**
     * Get the provisioningState property: Gets the provisioning state of the resource.
     *
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /** {@inheritDoc} */
    @Override
    public L2IsolationDomainProperties withAnnotation(String annotation) {
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
        if (networkFabricId() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property networkFabricId in model L2IsolationDomainProperties"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(L2IsolationDomainProperties.class);
}