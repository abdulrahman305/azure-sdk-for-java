// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mobilenetwork.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** The reason for the installation state of the packet core. */
public final class InstallationReason extends ExpandableStringEnum<InstallationReason> {
    /** Static value NoSlices for InstallationReason. */
    public static final InstallationReason NO_SLICES = fromString("NoSlices");

    /** Static value NoPacketCoreDataPlane for InstallationReason. */
    public static final InstallationReason NO_PACKET_CORE_DATA_PLANE = fromString("NoPacketCoreDataPlane");

    /** Static value NoAttachedDataNetworks for InstallationReason. */
    public static final InstallationReason NO_ATTACHED_DATA_NETWORKS = fromString("NoAttachedDataNetworks");

    /**
     * Creates a new instance of InstallationReason value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public InstallationReason() {
    }

    /**
     * Creates or finds a InstallationReason from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding InstallationReason.
     */
    @JsonCreator
    public static InstallationReason fromString(String name) {
        return fromString(name, InstallationReason.class);
    }

    /**
     * Gets known InstallationReason values.
     *
     * @return known InstallationReason values.
     */
    public static Collection<InstallationReason> values() {
        return values(InstallationReason.class);
    }
}