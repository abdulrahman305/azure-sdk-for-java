// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.communication.jobrouter.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Jobs are distributed in order to workers, starting with the worker that is after the last worker to receive a job.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "kind")
@JsonTypeName("round-robin")
@Fluent
public final class RoundRobinModeInternal extends DistributionModeInternal {
    /** Creates an instance of RoundRobinModeInternal class. */
    public RoundRobinModeInternal() {}

    /** {@inheritDoc} */
    @Override
    public RoundRobinModeInternal setMinConcurrentOffers(Integer minConcurrentOffers) {
        super.setMinConcurrentOffers(minConcurrentOffers);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public RoundRobinModeInternal setMaxConcurrentOffers(Integer maxConcurrentOffers) {
        super.setMaxConcurrentOffers(maxConcurrentOffers);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public RoundRobinModeInternal setBypassSelectors(Boolean bypassSelectors) {
        super.setBypassSelectors(bypassSelectors);
        return this;
    }
}