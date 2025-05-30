// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.managednetworkfabric.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;

/**
 * Isolation Domain Properties.
 */
@Fluent
public final class IsolationDomainProperties implements JsonSerializable<IsolationDomainProperties> {
    /*
     * Type of encapsulation.
     */
    private Encapsulation encapsulation;

    /*
     * List of Neighbor Group IDs.
     */
    private List<String> neighborGroupIds;

    /**
     * Creates an instance of IsolationDomainProperties class.
     */
    public IsolationDomainProperties() {
    }

    /**
     * Get the encapsulation property: Type of encapsulation.
     * 
     * @return the encapsulation value.
     */
    public Encapsulation encapsulation() {
        return this.encapsulation;
    }

    /**
     * Set the encapsulation property: Type of encapsulation.
     * 
     * @param encapsulation the encapsulation value to set.
     * @return the IsolationDomainProperties object itself.
     */
    public IsolationDomainProperties withEncapsulation(Encapsulation encapsulation) {
        this.encapsulation = encapsulation;
        return this;
    }

    /**
     * Get the neighborGroupIds property: List of Neighbor Group IDs.
     * 
     * @return the neighborGroupIds value.
     */
    public List<String> neighborGroupIds() {
        return this.neighborGroupIds;
    }

    /**
     * Set the neighborGroupIds property: List of Neighbor Group IDs.
     * 
     * @param neighborGroupIds the neighborGroupIds value to set.
     * @return the IsolationDomainProperties object itself.
     */
    public IsolationDomainProperties withNeighborGroupIds(List<String> neighborGroupIds) {
        this.neighborGroupIds = neighborGroupIds;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("encapsulation", this.encapsulation == null ? null : this.encapsulation.toString());
        jsonWriter.writeArrayField("neighborGroupIds", this.neighborGroupIds,
            (writer, element) -> writer.writeString(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of IsolationDomainProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of IsolationDomainProperties if the JsonReader was pointing to an instance of it, or null if
     * it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the IsolationDomainProperties.
     */
    public static IsolationDomainProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            IsolationDomainProperties deserializedIsolationDomainProperties = new IsolationDomainProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("encapsulation".equals(fieldName)) {
                    deserializedIsolationDomainProperties.encapsulation = Encapsulation.fromString(reader.getString());
                } else if ("neighborGroupIds".equals(fieldName)) {
                    List<String> neighborGroupIds = reader.readArray(reader1 -> reader1.getString());
                    deserializedIsolationDomainProperties.neighborGroupIds = neighborGroupIds;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedIsolationDomainProperties;
        });
    }
}
