// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.managednetworkfabric.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Primary or Secondary power end. */
public final class PowerEnd extends ExpandableStringEnum<PowerEnd> {
    /** Static value Primary for PowerEnd. */
    public static final PowerEnd PRIMARY = fromString("Primary");

    /** Static value Secondary for PowerEnd. */
    public static final PowerEnd SECONDARY = fromString("Secondary");

    /**
     * Creates a new instance of PowerEnd value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public PowerEnd() {
    }

    /**
     * Creates or finds a PowerEnd from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding PowerEnd.
     */
    @JsonCreator
    public static PowerEnd fromString(String name) {
        return fromString(name, PowerEnd.class);
    }

    /**
     * Gets known PowerEnd values.
     *
     * @return known PowerEnd values.
     */
    public static Collection<PowerEnd> values() {
        return values(PowerEnd.class);
    }
}