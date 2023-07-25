// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.iotfirmwaredefense.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Indicates the key size is considered too small to be secure for the algorithm. */
public final class IsShortKeySize extends ExpandableStringEnum<IsShortKeySize> {
    /** Static value True for IsShortKeySize. */
    public static final IsShortKeySize TRUE = fromString("True");

    /** Static value False for IsShortKeySize. */
    public static final IsShortKeySize FALSE = fromString("False");

    /**
     * Creates a new instance of IsShortKeySize value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public IsShortKeySize() {
    }

    /**
     * Creates or finds a IsShortKeySize from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding IsShortKeySize.
     */
    @JsonCreator
    public static IsShortKeySize fromString(String name) {
        return fromString(name, IsShortKeySize.class);
    }

    /**
     * Gets known IsShortKeySize values.
     *
     * @return known IsShortKeySize values.
     */
    public static Collection<IsShortKeySize> values() {
        return values(IsShortKeySize.class);
    }
}