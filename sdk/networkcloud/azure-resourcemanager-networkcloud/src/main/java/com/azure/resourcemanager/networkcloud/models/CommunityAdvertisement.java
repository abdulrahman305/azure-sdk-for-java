// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.networkcloud.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** CommunityAdvertisement represents the prefix and the communities that should be associated with that prefix. */
@Fluent
public final class CommunityAdvertisement {
    /*
     * The list of community strings to announce with this prefix.
     */
    @JsonProperty(value = "communities", required = true)
    private List<String> communities;

    /*
     * The subnet in CIDR format for which properties should be advertised.
     */
    @JsonProperty(value = "subnetPrefix", required = true)
    private String subnetPrefix;

    /** Creates an instance of CommunityAdvertisement class. */
    public CommunityAdvertisement() {
    }

    /**
     * Get the communities property: The list of community strings to announce with this prefix.
     *
     * @return the communities value.
     */
    public List<String> communities() {
        return this.communities;
    }

    /**
     * Set the communities property: The list of community strings to announce with this prefix.
     *
     * @param communities the communities value to set.
     * @return the CommunityAdvertisement object itself.
     */
    public CommunityAdvertisement withCommunities(List<String> communities) {
        this.communities = communities;
        return this;
    }

    /**
     * Get the subnetPrefix property: The subnet in CIDR format for which properties should be advertised.
     *
     * @return the subnetPrefix value.
     */
    public String subnetPrefix() {
        return this.subnetPrefix;
    }

    /**
     * Set the subnetPrefix property: The subnet in CIDR format for which properties should be advertised.
     *
     * @param subnetPrefix the subnetPrefix value to set.
     * @return the CommunityAdvertisement object itself.
     */
    public CommunityAdvertisement withSubnetPrefix(String subnetPrefix) {
        this.subnetPrefix = subnetPrefix;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (communities() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property communities in model CommunityAdvertisement"));
        }
        if (subnetPrefix() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property subnetPrefix in model CommunityAdvertisement"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(CommunityAdvertisement.class);
}