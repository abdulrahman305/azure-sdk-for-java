// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.managednetworkfabric.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.managednetworkfabric.fluent.models.NetworkFabricPatchProperties;
import java.io.IOException;
import java.util.Map;

/**
 * The Network Fabric resource definition.
 */
@Fluent
public final class NetworkFabricPatch extends TagsUpdate {
    /*
     * Network Fabric Patch properties.
     */
    private NetworkFabricPatchProperties innerProperties;

    /**
     * Creates an instance of NetworkFabricPatch class.
     */
    public NetworkFabricPatch() {
    }

    /**
     * Get the innerProperties property: Network Fabric Patch properties.
     * 
     * @return the innerProperties value.
     */
    private NetworkFabricPatchProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public NetworkFabricPatch withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Get the rackCount property: Number of compute racks associated to Network Fabric.
     * 
     * @return the rackCount value.
     */
    public Integer rackCount() {
        return this.innerProperties() == null ? null : this.innerProperties().rackCount();
    }

    /**
     * Set the rackCount property: Number of compute racks associated to Network Fabric.
     * 
     * @param rackCount the rackCount value to set.
     * @return the NetworkFabricPatch object itself.
     */
    public NetworkFabricPatch withRackCount(Integer rackCount) {
        if (this.innerProperties() == null) {
            this.innerProperties = new NetworkFabricPatchProperties();
        }
        this.innerProperties().withRackCount(rackCount);
        return this;
    }

    /**
     * Get the serverCountPerRack property: Number of servers.Possible values are from 1-16.
     * 
     * @return the serverCountPerRack value.
     */
    public Integer serverCountPerRack() {
        return this.innerProperties() == null ? null : this.innerProperties().serverCountPerRack();
    }

    /**
     * Set the serverCountPerRack property: Number of servers.Possible values are from 1-16.
     * 
     * @param serverCountPerRack the serverCountPerRack value to set.
     * @return the NetworkFabricPatch object itself.
     */
    public NetworkFabricPatch withServerCountPerRack(Integer serverCountPerRack) {
        if (this.innerProperties() == null) {
            this.innerProperties = new NetworkFabricPatchProperties();
        }
        this.innerProperties().withServerCountPerRack(serverCountPerRack);
        return this;
    }

    /**
     * Get the ipv4Prefix property: IPv4Prefix for Management Network. Example: 10.1.0.0/19.
     * 
     * @return the ipv4Prefix value.
     */
    public String ipv4Prefix() {
        return this.innerProperties() == null ? null : this.innerProperties().ipv4Prefix();
    }

    /**
     * Set the ipv4Prefix property: IPv4Prefix for Management Network. Example: 10.1.0.0/19.
     * 
     * @param ipv4Prefix the ipv4Prefix value to set.
     * @return the NetworkFabricPatch object itself.
     */
    public NetworkFabricPatch withIpv4Prefix(String ipv4Prefix) {
        if (this.innerProperties() == null) {
            this.innerProperties = new NetworkFabricPatchProperties();
        }
        this.innerProperties().withIpv4Prefix(ipv4Prefix);
        return this;
    }

    /**
     * Get the ipv6Prefix property: IPv6Prefix for Management Network. Example: 3FFE:FFFF:0:CD40::/59.
     * 
     * @return the ipv6Prefix value.
     */
    public String ipv6Prefix() {
        return this.innerProperties() == null ? null : this.innerProperties().ipv6Prefix();
    }

    /**
     * Set the ipv6Prefix property: IPv6Prefix for Management Network. Example: 3FFE:FFFF:0:CD40::/59.
     * 
     * @param ipv6Prefix the ipv6Prefix value to set.
     * @return the NetworkFabricPatch object itself.
     */
    public NetworkFabricPatch withIpv6Prefix(String ipv6Prefix) {
        if (this.innerProperties() == null) {
            this.innerProperties = new NetworkFabricPatchProperties();
        }
        this.innerProperties().withIpv6Prefix(ipv6Prefix);
        return this;
    }

    /**
     * Get the fabricAsn property: ASN of CE devices for CE/PE connectivity.
     * 
     * @return the fabricAsn value.
     */
    public Long fabricAsn() {
        return this.innerProperties() == null ? null : this.innerProperties().fabricAsn();
    }

    /**
     * Set the fabricAsn property: ASN of CE devices for CE/PE connectivity.
     * 
     * @param fabricAsn the fabricAsn value to set.
     * @return the NetworkFabricPatch object itself.
     */
    public NetworkFabricPatch withFabricAsn(Long fabricAsn) {
        if (this.innerProperties() == null) {
            this.innerProperties = new NetworkFabricPatchProperties();
        }
        this.innerProperties().withFabricAsn(fabricAsn);
        return this;
    }

    /**
     * Get the terminalServerConfiguration property: Network and credentials configuration already applied to terminal
     * server.
     * 
     * @return the terminalServerConfiguration value.
     */
    public NetworkFabricPatchablePropertiesTerminalServerConfiguration terminalServerConfiguration() {
        return this.innerProperties() == null ? null : this.innerProperties().terminalServerConfiguration();
    }

    /**
     * Set the terminalServerConfiguration property: Network and credentials configuration already applied to terminal
     * server.
     * 
     * @param terminalServerConfiguration the terminalServerConfiguration value to set.
     * @return the NetworkFabricPatch object itself.
     */
    public NetworkFabricPatch withTerminalServerConfiguration(
        NetworkFabricPatchablePropertiesTerminalServerConfiguration terminalServerConfiguration) {
        if (this.innerProperties() == null) {
            this.innerProperties = new NetworkFabricPatchProperties();
        }
        this.innerProperties().withTerminalServerConfiguration(terminalServerConfiguration);
        return this;
    }

    /**
     * Get the managementNetworkConfiguration property: Configuration to be used to setup the management network.
     * 
     * @return the managementNetworkConfiguration value.
     */
    public ManagementNetworkConfigurationPatchableProperties managementNetworkConfiguration() {
        return this.innerProperties() == null ? null : this.innerProperties().managementNetworkConfiguration();
    }

    /**
     * Set the managementNetworkConfiguration property: Configuration to be used to setup the management network.
     * 
     * @param managementNetworkConfiguration the managementNetworkConfiguration value to set.
     * @return the NetworkFabricPatch object itself.
     */
    public NetworkFabricPatch withManagementNetworkConfiguration(
        ManagementNetworkConfigurationPatchableProperties managementNetworkConfiguration) {
        if (this.innerProperties() == null) {
            this.innerProperties = new NetworkFabricPatchProperties();
        }
        this.innerProperties().withManagementNetworkConfiguration(managementNetworkConfiguration);
        return this;
    }

    /**
     * Get the annotation property: Switch configuration description.
     * 
     * @return the annotation value.
     */
    public String annotation() {
        return this.innerProperties() == null ? null : this.innerProperties().annotation();
    }

    /**
     * Set the annotation property: Switch configuration description.
     * 
     * @param annotation the annotation value to set.
     * @return the NetworkFabricPatch object itself.
     */
    public NetworkFabricPatch withAnnotation(String annotation) {
        if (this.innerProperties() == null) {
            this.innerProperties = new NetworkFabricPatchProperties();
        }
        this.innerProperties().withAnnotation(annotation);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeMapField("tags", tags(), (writer, element) -> writer.writeString(element));
        jsonWriter.writeJsonField("properties", this.innerProperties);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of NetworkFabricPatch from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of NetworkFabricPatch if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the NetworkFabricPatch.
     */
    public static NetworkFabricPatch fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            NetworkFabricPatch deserializedNetworkFabricPatch = new NetworkFabricPatch();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("tags".equals(fieldName)) {
                    Map<String, String> tags = reader.readMap(reader1 -> reader1.getString());
                    deserializedNetworkFabricPatch.withTags(tags);
                } else if ("properties".equals(fieldName)) {
                    deserializedNetworkFabricPatch.innerProperties = NetworkFabricPatchProperties.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedNetworkFabricPatch;
        });
    }
}
