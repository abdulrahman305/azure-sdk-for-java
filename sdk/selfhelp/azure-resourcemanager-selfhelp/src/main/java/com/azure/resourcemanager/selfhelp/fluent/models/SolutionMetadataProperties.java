// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.selfhelp.fluent.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Diagnostic solution metadata. */
@Fluent
public final class SolutionMetadataProperties {
    /*
     * Solution Id.
     */
    @JsonProperty(value = "solutionId")
    private String solutionId;

    /*
     * Solution Type.
     */
    @JsonProperty(value = "solutionType")
    private String solutionType;

    /*
     * A detailed description of solution.
     */
    @JsonProperty(value = "description")
    private String description;

    /*
     * Required parameters for invoking this particular solution.
     */
    @JsonProperty(value = "requiredParameterSets")
    private List<List<String>> requiredParameterSets;

    /** Creates an instance of SolutionMetadataProperties class. */
    public SolutionMetadataProperties() {
    }

    /**
     * Get the solutionId property: Solution Id.
     *
     * @return the solutionId value.
     */
    public String solutionId() {
        return this.solutionId;
    }

    /**
     * Set the solutionId property: Solution Id.
     *
     * @param solutionId the solutionId value to set.
     * @return the SolutionMetadataProperties object itself.
     */
    public SolutionMetadataProperties withSolutionId(String solutionId) {
        this.solutionId = solutionId;
        return this;
    }

    /**
     * Get the solutionType property: Solution Type.
     *
     * @return the solutionType value.
     */
    public String solutionType() {
        return this.solutionType;
    }

    /**
     * Set the solutionType property: Solution Type.
     *
     * @param solutionType the solutionType value to set.
     * @return the SolutionMetadataProperties object itself.
     */
    public SolutionMetadataProperties withSolutionType(String solutionType) {
        this.solutionType = solutionType;
        return this;
    }

    /**
     * Get the description property: A detailed description of solution.
     *
     * @return the description value.
     */
    public String description() {
        return this.description;
    }

    /**
     * Set the description property: A detailed description of solution.
     *
     * @param description the description value to set.
     * @return the SolutionMetadataProperties object itself.
     */
    public SolutionMetadataProperties withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get the requiredParameterSets property: Required parameters for invoking this particular solution.
     *
     * @return the requiredParameterSets value.
     */
    public List<List<String>> requiredParameterSets() {
        return this.requiredParameterSets;
    }

    /**
     * Set the requiredParameterSets property: Required parameters for invoking this particular solution.
     *
     * @param requiredParameterSets the requiredParameterSets value to set.
     * @return the SolutionMetadataProperties object itself.
     */
    public SolutionMetadataProperties withRequiredParameterSets(List<List<String>> requiredParameterSets) {
        this.requiredParameterSets = requiredParameterSets;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}