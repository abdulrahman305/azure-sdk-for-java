// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.avs.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * provisioned network provisioning state.
 */
public final class ProvisionedNetworkProvisioningState
    extends ExpandableStringEnum<ProvisionedNetworkProvisioningState> {
    /**
     * Static value Succeeded for ProvisionedNetworkProvisioningState.
     */
    public static final ProvisionedNetworkProvisioningState SUCCEEDED = fromString("Succeeded");

    /**
     * Static value Failed for ProvisionedNetworkProvisioningState.
     */
    public static final ProvisionedNetworkProvisioningState FAILED = fromString("Failed");

    /**
     * Static value Canceled for ProvisionedNetworkProvisioningState.
     */
    public static final ProvisionedNetworkProvisioningState CANCELED = fromString("Canceled");

    /**
     * Creates a new instance of ProvisionedNetworkProvisioningState value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public ProvisionedNetworkProvisioningState() {
    }

    /**
     * Creates or finds a ProvisionedNetworkProvisioningState from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding ProvisionedNetworkProvisioningState.
     */
    public static ProvisionedNetworkProvisioningState fromString(String name) {
        return fromString(name, ProvisionedNetworkProvisioningState.class);
    }

    /**
     * Gets known ProvisionedNetworkProvisioningState values.
     * 
     * @return known ProvisionedNetworkProvisioningState values.
     */
    public static Collection<ProvisionedNetworkProvisioningState> values() {
        return values(ProvisionedNetworkProvisioningState.class);
    }
}
