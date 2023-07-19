// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.managednetworkfabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Defines the match condition that is supported to filter the traffic. */
@Fluent
public final class AccessControlListMatchCondition extends CommonMatchConditions {
    /*
     * List of ether type values that needs to be matched.
     */
    @JsonProperty(value = "etherTypes")
    private List<String> etherTypes;

    /*
     * List of IP fragment packets that needs to be matched.
     */
    @JsonProperty(value = "fragments")
    private List<String> fragments;

    /*
     * List of IP Lengths that needs to be matched.
     */
    @JsonProperty(value = "ipLengths")
    private List<String> ipLengths;

    /*
     * List of TTL [Time To Live] values that needs to be matched.
     */
    @JsonProperty(value = "ttlValues")
    private List<String> ttlValues;

    /*
     * List of DSCP Markings that needs to be matched.
     */
    @JsonProperty(value = "dscpMarkings")
    private List<String> dscpMarkings;

    /*
     * Defines the port condition that needs to be matched.
     */
    @JsonProperty(value = "portCondition")
    private AccessControlListPortCondition portCondition;

    /** Creates an instance of AccessControlListMatchCondition class. */
    public AccessControlListMatchCondition() {
    }

    /**
     * Get the etherTypes property: List of ether type values that needs to be matched.
     *
     * @return the etherTypes value.
     */
    public List<String> etherTypes() {
        return this.etherTypes;
    }

    /**
     * Set the etherTypes property: List of ether type values that needs to be matched.
     *
     * @param etherTypes the etherTypes value to set.
     * @return the AccessControlListMatchCondition object itself.
     */
    public AccessControlListMatchCondition withEtherTypes(List<String> etherTypes) {
        this.etherTypes = etherTypes;
        return this;
    }

    /**
     * Get the fragments property: List of IP fragment packets that needs to be matched.
     *
     * @return the fragments value.
     */
    public List<String> fragments() {
        return this.fragments;
    }

    /**
     * Set the fragments property: List of IP fragment packets that needs to be matched.
     *
     * @param fragments the fragments value to set.
     * @return the AccessControlListMatchCondition object itself.
     */
    public AccessControlListMatchCondition withFragments(List<String> fragments) {
        this.fragments = fragments;
        return this;
    }

    /**
     * Get the ipLengths property: List of IP Lengths that needs to be matched.
     *
     * @return the ipLengths value.
     */
    public List<String> ipLengths() {
        return this.ipLengths;
    }

    /**
     * Set the ipLengths property: List of IP Lengths that needs to be matched.
     *
     * @param ipLengths the ipLengths value to set.
     * @return the AccessControlListMatchCondition object itself.
     */
    public AccessControlListMatchCondition withIpLengths(List<String> ipLengths) {
        this.ipLengths = ipLengths;
        return this;
    }

    /**
     * Get the ttlValues property: List of TTL [Time To Live] values that needs to be matched.
     *
     * @return the ttlValues value.
     */
    public List<String> ttlValues() {
        return this.ttlValues;
    }

    /**
     * Set the ttlValues property: List of TTL [Time To Live] values that needs to be matched.
     *
     * @param ttlValues the ttlValues value to set.
     * @return the AccessControlListMatchCondition object itself.
     */
    public AccessControlListMatchCondition withTtlValues(List<String> ttlValues) {
        this.ttlValues = ttlValues;
        return this;
    }

    /**
     * Get the dscpMarkings property: List of DSCP Markings that needs to be matched.
     *
     * @return the dscpMarkings value.
     */
    public List<String> dscpMarkings() {
        return this.dscpMarkings;
    }

    /**
     * Set the dscpMarkings property: List of DSCP Markings that needs to be matched.
     *
     * @param dscpMarkings the dscpMarkings value to set.
     * @return the AccessControlListMatchCondition object itself.
     */
    public AccessControlListMatchCondition withDscpMarkings(List<String> dscpMarkings) {
        this.dscpMarkings = dscpMarkings;
        return this;
    }

    /**
     * Get the portCondition property: Defines the port condition that needs to be matched.
     *
     * @return the portCondition value.
     */
    public AccessControlListPortCondition portCondition() {
        return this.portCondition;
    }

    /**
     * Set the portCondition property: Defines the port condition that needs to be matched.
     *
     * @param portCondition the portCondition value to set.
     * @return the AccessControlListMatchCondition object itself.
     */
    public AccessControlListMatchCondition withPortCondition(AccessControlListPortCondition portCondition) {
        this.portCondition = portCondition;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AccessControlListMatchCondition withProtocolTypes(List<String> protocolTypes) {
        super.withProtocolTypes(protocolTypes);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AccessControlListMatchCondition withVlanMatchCondition(VlanMatchCondition vlanMatchCondition) {
        super.withVlanMatchCondition(vlanMatchCondition);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AccessControlListMatchCondition withIpCondition(IpMatchCondition ipCondition) {
        super.withIpCondition(ipCondition);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (portCondition() != null) {
            portCondition().validate();
        }
    }
}