// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.managednetworkfabric.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Type of destination. Input can be IsolationDomain or Direct. */
public final class DestinationType extends ExpandableStringEnum<DestinationType> {
    /** Static value IsolationDomain for DestinationType. */
    public static final DestinationType ISOLATION_DOMAIN = fromString("IsolationDomain");

    /** Static value Direct for DestinationType. */
    public static final DestinationType DIRECT = fromString("Direct");

    /**
     * Creates a new instance of DestinationType value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public DestinationType() {
    }

    /**
     * Creates or finds a DestinationType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding DestinationType.
     */
    @JsonCreator
    public static DestinationType fromString(String name) {
        return fromString(name, DestinationType.class);
    }

    /**
     * Gets known DestinationType values.
     *
     * @return known DestinationType values.
     */
    public static Collection<DestinationType> values() {
        return values(DestinationType.class);
    }
}