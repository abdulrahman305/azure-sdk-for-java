// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.servicelinker.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.servicelinker.fluent.models.ConfigurationNameItemInner;
import java.io.IOException;
import java.util.List;

/**
 * Configuration Name list which will be set based on different target resource, client type, auth type.
 */
@Fluent
public final class ConfigurationNameResult implements JsonSerializable<ConfigurationNameResult> {
    /*
     * Expected configuration names for each target service.
     */
    private List<ConfigurationNameItemInner> value;

    /*
     * Link to next page of resources.
     */
    private String nextLink;

    /**
     * Creates an instance of ConfigurationNameResult class.
     */
    public ConfigurationNameResult() {
    }

    /**
     * Get the value property: Expected configuration names for each target service.
     * 
     * @return the value value.
     */
    public List<ConfigurationNameItemInner> value() {
        return this.value;
    }

    /**
     * Set the value property: Expected configuration names for each target service.
     * 
     * @param value the value value to set.
     * @return the ConfigurationNameResult object itself.
     */
    public ConfigurationNameResult withValue(List<ConfigurationNameItemInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: Link to next page of resources.
     * 
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() != null) {
            value().forEach(e -> e.validate());
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeArrayField("value", this.value, (writer, element) -> writer.writeJson(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ConfigurationNameResult from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ConfigurationNameResult if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IOException If an error occurs while reading the ConfigurationNameResult.
     */
    public static ConfigurationNameResult fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ConfigurationNameResult deserializedConfigurationNameResult = new ConfigurationNameResult();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("value".equals(fieldName)) {
                    List<ConfigurationNameItemInner> value
                        = reader.readArray(reader1 -> ConfigurationNameItemInner.fromJson(reader1));
                    deserializedConfigurationNameResult.value = value;
                } else if ("nextLink".equals(fieldName)) {
                    deserializedConfigurationNameResult.nextLink = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedConfigurationNameResult;
        });
    }
}
