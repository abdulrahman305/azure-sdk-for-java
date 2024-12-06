// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.networkcloud.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.networkcloud.models.ControlPlaneNodePatchConfiguration;
import com.fasterxml.jackson.annotation.JsonProperty;

/** KubernetesClusterPatchProperties represents the properties of the Kubernetes cluster that can be patched. */
@Fluent
public final class KubernetesClusterPatchProperties {
    /*
     * ControlPlaneNodePatchConfiguration represents the properties of the control plane that can be patched for this
     * Kubernetes cluster.
     *
     * The defining characteristics of the control plane that can be patched for this Kubernetes cluster.
     */
    @JsonProperty(value = "controlPlaneNodeConfiguration")
    private ControlPlaneNodePatchConfiguration controlPlaneNodeConfiguration;

    /*
     * The Kubernetes version for this cluster. Accepts n.n, n.n.n, and n.n.n-n format. The interpreted version used
     * will be resolved into this field after creation or update.
     */
    @JsonProperty(value = "kubernetesVersion")
    private String kubernetesVersion;

    /** Creates an instance of KubernetesClusterPatchProperties class. */
    public KubernetesClusterPatchProperties() {
    }

    /**
     * Get the controlPlaneNodeConfiguration property: ControlPlaneNodePatchConfiguration represents the properties of
     * the control plane that can be patched for this Kubernetes cluster.
     *
     * <p>The defining characteristics of the control plane that can be patched for this Kubernetes cluster.
     *
     * @return the controlPlaneNodeConfiguration value.
     */
    public ControlPlaneNodePatchConfiguration controlPlaneNodeConfiguration() {
        return this.controlPlaneNodeConfiguration;
    }

    /**
     * Set the controlPlaneNodeConfiguration property: ControlPlaneNodePatchConfiguration represents the properties of
     * the control plane that can be patched for this Kubernetes cluster.
     *
     * <p>The defining characteristics of the control plane that can be patched for this Kubernetes cluster.
     *
     * @param controlPlaneNodeConfiguration the controlPlaneNodeConfiguration value to set.
     * @return the KubernetesClusterPatchProperties object itself.
     */
    public KubernetesClusterPatchProperties
        withControlPlaneNodeConfiguration(ControlPlaneNodePatchConfiguration controlPlaneNodeConfiguration) {
        this.controlPlaneNodeConfiguration = controlPlaneNodeConfiguration;
        return this;
    }

    /**
     * Get the kubernetesVersion property: The Kubernetes version for this cluster. Accepts n.n, n.n.n, and n.n.n-n
     * format. The interpreted version used will be resolved into this field after creation or update.
     *
     * @return the kubernetesVersion value.
     */
    public String kubernetesVersion() {
        return this.kubernetesVersion;
    }

    /**
     * Set the kubernetesVersion property: The Kubernetes version for this cluster. Accepts n.n, n.n.n, and n.n.n-n
     * format. The interpreted version used will be resolved into this field after creation or update.
     *
     * @param kubernetesVersion the kubernetesVersion value to set.
     * @return the KubernetesClusterPatchProperties object itself.
     */
    public KubernetesClusterPatchProperties withKubernetesVersion(String kubernetesVersion) {
        this.kubernetesVersion = kubernetesVersion;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (controlPlaneNodeConfiguration() != null) {
            controlPlaneNodeConfiguration().validate();
        }
    }
}
