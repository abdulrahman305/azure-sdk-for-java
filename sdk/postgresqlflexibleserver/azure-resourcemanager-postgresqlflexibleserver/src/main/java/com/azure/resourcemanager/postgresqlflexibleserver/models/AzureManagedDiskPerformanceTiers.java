// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.postgresqlflexibleserver.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Name of storage tier for IOPS. */
public final class AzureManagedDiskPerformanceTiers extends ExpandableStringEnum<AzureManagedDiskPerformanceTiers> {
    /** Static value P1 for AzureManagedDiskPerformanceTiers. */
    public static final AzureManagedDiskPerformanceTiers P1 = fromString("P1");

    /** Static value P2 for AzureManagedDiskPerformanceTiers. */
    public static final AzureManagedDiskPerformanceTiers P2 = fromString("P2");

    /** Static value P3 for AzureManagedDiskPerformanceTiers. */
    public static final AzureManagedDiskPerformanceTiers P3 = fromString("P3");

    /** Static value P4 for AzureManagedDiskPerformanceTiers. */
    public static final AzureManagedDiskPerformanceTiers P4 = fromString("P4");

    /** Static value P6 for AzureManagedDiskPerformanceTiers. */
    public static final AzureManagedDiskPerformanceTiers P6 = fromString("P6");

    /** Static value P10 for AzureManagedDiskPerformanceTiers. */
    public static final AzureManagedDiskPerformanceTiers P10 = fromString("P10");

    /** Static value P15 for AzureManagedDiskPerformanceTiers. */
    public static final AzureManagedDiskPerformanceTiers P15 = fromString("P15");

    /** Static value P20 for AzureManagedDiskPerformanceTiers. */
    public static final AzureManagedDiskPerformanceTiers P20 = fromString("P20");

    /** Static value P30 for AzureManagedDiskPerformanceTiers. */
    public static final AzureManagedDiskPerformanceTiers P30 = fromString("P30");

    /** Static value P40 for AzureManagedDiskPerformanceTiers. */
    public static final AzureManagedDiskPerformanceTiers P40 = fromString("P40");

    /** Static value P50 for AzureManagedDiskPerformanceTiers. */
    public static final AzureManagedDiskPerformanceTiers P50 = fromString("P50");

    /** Static value P60 for AzureManagedDiskPerformanceTiers. */
    public static final AzureManagedDiskPerformanceTiers P60 = fromString("P60");

    /** Static value P70 for AzureManagedDiskPerformanceTiers. */
    public static final AzureManagedDiskPerformanceTiers P70 = fromString("P70");

    /** Static value P80 for AzureManagedDiskPerformanceTiers. */
    public static final AzureManagedDiskPerformanceTiers P80 = fromString("P80");

    /**
     * Creates a new instance of AzureManagedDiskPerformanceTiers value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public AzureManagedDiskPerformanceTiers() {
    }

    /**
     * Creates or finds a AzureManagedDiskPerformanceTiers from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding AzureManagedDiskPerformanceTiers.
     */
    @JsonCreator
    public static AzureManagedDiskPerformanceTiers fromString(String name) {
        return fromString(name, AzureManagedDiskPerformanceTiers.class);
    }

    /**
     * Gets known AzureManagedDiskPerformanceTiers values.
     *
     * @return known AzureManagedDiskPerformanceTiers values.
     */
    public static Collection<AzureManagedDiskPerformanceTiers> values() {
        return values(AzureManagedDiskPerformanceTiers.class);
    }
}