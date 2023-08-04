// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.chaos.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Model that represents a step in the Experiment resource. */
@Fluent
public final class Step {
    /*
     * String of the step name.
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /*
     * List of branches.
     */
    @JsonProperty(value = "branches", required = true)
    private List<Branch> branches;

    /** Creates an instance of Step class. */
    public Step() {
    }

    /**
     * Get the name property: String of the step name.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: String of the step name.
     *
     * @param name the name value to set.
     * @return the Step object itself.
     */
    public Step withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the branches property: List of branches.
     *
     * @return the branches value.
     */
    public List<Branch> branches() {
        return this.branches;
    }

    /**
     * Set the branches property: List of branches.
     *
     * @param branches the branches value to set.
     * @return the Step object itself.
     */
    public Step withBranches(List<Branch> branches) {
        this.branches = branches;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (name() == null) {
            throw LOGGER
                .logExceptionAsError(new IllegalArgumentException("Missing required property name in model Step"));
        }
        if (branches() == null) {
            throw LOGGER
                .logExceptionAsError(new IllegalArgumentException("Missing required property branches in model Step"));
        } else {
            branches().forEach(e -> e.validate());
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(Step.class);
}