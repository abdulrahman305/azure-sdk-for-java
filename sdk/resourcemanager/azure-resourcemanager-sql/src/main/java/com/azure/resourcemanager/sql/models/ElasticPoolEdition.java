// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.resourcemanager.sql.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/** Defines values for ElasticPoolEdition. */
public final class ElasticPoolEdition extends ExpandableStringEnum<ElasticPoolEdition> {
    /** Static value Basic for ElasticPoolEdition. */
    public static final ElasticPoolEdition BASIC = fromString("Basic");

    /** Static value Standard for ElasticPoolEdition. */
    public static final ElasticPoolEdition STANDARD = fromString("Standard");

    /** Static value Premium for ElasticPoolEdition. */
    public static final ElasticPoolEdition PREMIUM = fromString("Premium");

    /** Static value GeneralPurpose for ElasticPoolEdition. */
    public static final ElasticPoolEdition GENERAL_PURPOSE = fromString("GeneralPurpose");

    /** Static value BusinessCritical for ElasticPoolEdition. */
    public static final ElasticPoolEdition BUSINESS_CRITICAL = fromString("BusinessCritical");

    /**
     * Creates a new instance of ElasticPoolEdition value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public ElasticPoolEdition() {
    }

    /**
     * Creates or finds a ElasticPoolEdition from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding ElasticPoolEdition.
     */
    public static ElasticPoolEdition fromString(String name) {
        return fromString(name, ElasticPoolEdition.class);
    }

    /**
     * Gets known ElasticPoolEdition values.
     *
     * @return known ElasticPoolEdition values.
     */
    public static Collection<ElasticPoolEdition> values() {
        return values(ElasticPoolEdition.class);
    }
}
