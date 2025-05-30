// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.fluent.models;

import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;

/**
 * Properties of the perimeter associable resources.
 */
@Immutable
public final class PerimeterAssociableResourceProperties
    implements JsonSerializable<PerimeterAssociableResourceProperties> {
    /*
     * A friendly name for the properties of perimeter associable resources.
     */
    private String displayName;

    /*
     * Resource type/provider name.
     */
    private String resourceType;

    /*
     * Public DNS zone names of the resources.
     */
    private List<String> publicDnsZones;

    /**
     * Creates an instance of PerimeterAssociableResourceProperties class.
     */
    public PerimeterAssociableResourceProperties() {
    }

    /**
     * Get the displayName property: A friendly name for the properties of perimeter associable resources.
     * 
     * @return the displayName value.
     */
    public String displayName() {
        return this.displayName;
    }

    /**
     * Get the resourceType property: Resource type/provider name.
     * 
     * @return the resourceType value.
     */
    public String resourceType() {
        return this.resourceType;
    }

    /**
     * Get the publicDnsZones property: Public DNS zone names of the resources.
     * 
     * @return the publicDnsZones value.
     */
    public List<String> publicDnsZones() {
        return this.publicDnsZones;
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
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of PerimeterAssociableResourceProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of PerimeterAssociableResourceProperties if the JsonReader was pointing to an instance of it,
     * or null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the PerimeterAssociableResourceProperties.
     */
    public static PerimeterAssociableResourceProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            PerimeterAssociableResourceProperties deserializedPerimeterAssociableResourceProperties
                = new PerimeterAssociableResourceProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("displayName".equals(fieldName)) {
                    deserializedPerimeterAssociableResourceProperties.displayName = reader.getString();
                } else if ("resourceType".equals(fieldName)) {
                    deserializedPerimeterAssociableResourceProperties.resourceType = reader.getString();
                } else if ("publicDnsZones".equals(fieldName)) {
                    List<String> publicDnsZones = reader.readArray(reader1 -> reader1.getString());
                    deserializedPerimeterAssociableResourceProperties.publicDnsZones = publicDnsZones;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedPerimeterAssociableResourceProperties;
        });
    }
}
