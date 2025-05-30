// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.elastic.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.elastic.models.OpenAIIntegrationStatusResponseProperties;
import java.io.IOException;

/**
 * Status of the OpenAI Integration.
 */
@Fluent
public final class OpenAIIntegrationStatusResponseInner
    implements JsonSerializable<OpenAIIntegrationStatusResponseInner> {
    /*
     * Status of the OpenAI Integration
     */
    private OpenAIIntegrationStatusResponseProperties properties;

    /**
     * Creates an instance of OpenAIIntegrationStatusResponseInner class.
     */
    public OpenAIIntegrationStatusResponseInner() {
    }

    /**
     * Get the properties property: Status of the OpenAI Integration.
     * 
     * @return the properties value.
     */
    public OpenAIIntegrationStatusResponseProperties properties() {
        return this.properties;
    }

    /**
     * Set the properties property: Status of the OpenAI Integration.
     * 
     * @param properties the properties value to set.
     * @return the OpenAIIntegrationStatusResponseInner object itself.
     */
    public OpenAIIntegrationStatusResponseInner withProperties(OpenAIIntegrationStatusResponseProperties properties) {
        this.properties = properties;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (properties() != null) {
            properties().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeJsonField("properties", this.properties);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of OpenAIIntegrationStatusResponseInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of OpenAIIntegrationStatusResponseInner if the JsonReader was pointing to an instance of it,
     * or null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the OpenAIIntegrationStatusResponseInner.
     */
    public static OpenAIIntegrationStatusResponseInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            OpenAIIntegrationStatusResponseInner deserializedOpenAIIntegrationStatusResponseInner
                = new OpenAIIntegrationStatusResponseInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("properties".equals(fieldName)) {
                    deserializedOpenAIIntegrationStatusResponseInner.properties
                        = OpenAIIntegrationStatusResponseProperties.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedOpenAIIntegrationStatusResponseInner;
        });
    }
}
