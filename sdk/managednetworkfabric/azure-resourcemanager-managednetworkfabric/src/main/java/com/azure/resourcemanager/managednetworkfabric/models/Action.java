// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.managednetworkfabric.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Specify action. */
public final class Action extends ExpandableStringEnum<Action> {
    /** Static value Allow for Action. */
    public static final Action ALLOW = fromString("Allow");

    /** Static value Deny for Action. */
    public static final Action DENY = fromString("Deny");

    /**
     * Creates a new instance of Action value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public Action() {
    }

    /**
     * Creates or finds a Action from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding Action.
     */
    @JsonCreator
    public static Action fromString(String name) {
        return fromString(name, Action.class);
    }

    /**
     * Gets known Action values.
     *
     * @return known Action values.
     */
    public static Collection<Action> values() {
        return values(Action.class);
    }
}