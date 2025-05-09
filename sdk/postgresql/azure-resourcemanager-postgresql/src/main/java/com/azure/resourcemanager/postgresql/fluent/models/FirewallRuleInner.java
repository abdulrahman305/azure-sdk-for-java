// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.postgresql.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Represents a server firewall rule.
 */
@Fluent
public final class FirewallRuleInner extends ProxyResource {
    /*
     * The properties of a firewall rule.
     */
    private FirewallRuleProperties innerProperties = new FirewallRuleProperties();

    /*
     * The type of the resource.
     */
    private String type;

    /*
     * The name of the resource.
     */
    private String name;

    /*
     * Fully qualified resource Id for the resource.
     */
    private String id;

    /**
     * Creates an instance of FirewallRuleInner class.
     */
    public FirewallRuleInner() {
    }

    /**
     * Get the innerProperties property: The properties of a firewall rule.
     * 
     * @return the innerProperties value.
     */
    private FirewallRuleProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the type property: The type of the resource.
     * 
     * @return the type value.
     */
    @Override
    public String type() {
        return this.type;
    }

    /**
     * Get the name property: The name of the resource.
     * 
     * @return the name value.
     */
    @Override
    public String name() {
        return this.name;
    }

    /**
     * Get the id property: Fully qualified resource Id for the resource.
     * 
     * @return the id value.
     */
    @Override
    public String id() {
        return this.id;
    }

    /**
     * Get the startIpAddress property: The start IP address of the server firewall rule. Must be IPv4 format.
     * 
     * @return the startIpAddress value.
     */
    public String startIpAddress() {
        return this.innerProperties() == null ? null : this.innerProperties().startIpAddress();
    }

    /**
     * Set the startIpAddress property: The start IP address of the server firewall rule. Must be IPv4 format.
     * 
     * @param startIpAddress the startIpAddress value to set.
     * @return the FirewallRuleInner object itself.
     */
    public FirewallRuleInner withStartIpAddress(String startIpAddress) {
        if (this.innerProperties() == null) {
            this.innerProperties = new FirewallRuleProperties();
        }
        this.innerProperties().withStartIpAddress(startIpAddress);
        return this;
    }

    /**
     * Get the endIpAddress property: The end IP address of the server firewall rule. Must be IPv4 format.
     * 
     * @return the endIpAddress value.
     */
    public String endIpAddress() {
        return this.innerProperties() == null ? null : this.innerProperties().endIpAddress();
    }

    /**
     * Set the endIpAddress property: The end IP address of the server firewall rule. Must be IPv4 format.
     * 
     * @param endIpAddress the endIpAddress value to set.
     * @return the FirewallRuleInner object itself.
     */
    public FirewallRuleInner withEndIpAddress(String endIpAddress) {
        if (this.innerProperties() == null) {
            this.innerProperties = new FirewallRuleProperties();
        }
        this.innerProperties().withEndIpAddress(endIpAddress);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property innerProperties in model FirewallRuleInner"));
        } else {
            innerProperties().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(FirewallRuleInner.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeJsonField("properties", this.innerProperties);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of FirewallRuleInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of FirewallRuleInner if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the FirewallRuleInner.
     */
    public static FirewallRuleInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            FirewallRuleInner deserializedFirewallRuleInner = new FirewallRuleInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    deserializedFirewallRuleInner.id = reader.getString();
                } else if ("name".equals(fieldName)) {
                    deserializedFirewallRuleInner.name = reader.getString();
                } else if ("type".equals(fieldName)) {
                    deserializedFirewallRuleInner.type = reader.getString();
                } else if ("properties".equals(fieldName)) {
                    deserializedFirewallRuleInner.innerProperties = FirewallRuleProperties.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedFirewallRuleInner;
        });
    }
}
