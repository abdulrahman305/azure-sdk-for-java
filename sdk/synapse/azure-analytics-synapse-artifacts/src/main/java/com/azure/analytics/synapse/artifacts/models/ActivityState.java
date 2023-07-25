// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.artifacts.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Activity state. This is an optional property and if not provided, the state will be Active by default. */
public final class ActivityState extends ExpandableStringEnum<ActivityState> {
    /** Static value Active for ActivityState. */
    public static final ActivityState ACTIVE = fromString("Active");

    /** Static value Inactive for ActivityState. */
    public static final ActivityState INACTIVE = fromString("Inactive");

    /**
     * Creates a new instance of ActivityState value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public ActivityState() {}

    /**
     * Creates or finds a ActivityState from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding ActivityState.
     */
    @JsonCreator
    public static ActivityState fromString(String name) {
        return fromString(name, ActivityState.class);
    }

    /**
     * Gets known ActivityState values.
     *
     * @return known ActivityState values.
     */
    public static Collection<ActivityState> values() {
        return values(ActivityState.class);
    }
}