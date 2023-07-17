// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.communication.jobrouter.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Paged instance of ClassificationPolicy. */
@Fluent
public final class ClassificationPolicyItemInternal {
    /*
     * A container for the rules that govern how jobs are classified.
     */
    @JsonProperty(value = "classificationPolicy")
    private ClassificationPolicyInternal classificationPolicy;

    /*
     * (Optional) The Concurrency Token.
     */
    @JsonProperty(value = "etag")
    private String etag;

    /** Creates an instance of ClassificationPolicyItemInternal class. */
    public ClassificationPolicyItemInternal() {}

    /**
     * Get the classificationPolicy property: A container for the rules that govern how jobs are classified.
     *
     * @return the classificationPolicy value.
     */
    public ClassificationPolicyInternal getClassificationPolicy() {
        return this.classificationPolicy;
    }

    /**
     * Set the classificationPolicy property: A container for the rules that govern how jobs are classified.
     *
     * @param classificationPolicy the classificationPolicy value to set.
     * @return the ClassificationPolicyItemInternal object itself.
     */
    public ClassificationPolicyItemInternal setClassificationPolicy(ClassificationPolicyInternal classificationPolicy) {
        this.classificationPolicy = classificationPolicy;
        return this;
    }

    /**
     * Get the etag property: (Optional) The Concurrency Token.
     *
     * @return the etag value.
     */
    public String getEtag() {
        return this.etag;
    }

    /**
     * Set the etag property: (Optional) The Concurrency Token.
     *
     * @param etag the etag value to set.
     * @return the ClassificationPolicyItemInternal object itself.
     */
    public ClassificationPolicyItemInternal setEtag(String etag) {
        this.etag = etag;
        return this;
    }
}