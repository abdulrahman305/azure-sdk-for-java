// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.media.videoanalyzer.edge.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * IoT Hub Message source allows for the pipeline to consume messages from the IoT Edge Hub. Messages can be routed from
 * other IoT modules via routes declared in the IoT Edge deployment manifest.
 */
@Fluent
public final class IotHubMessageSource extends SourceNodeBase {
    /*
     * Type discriminator for the derived types.
     */
    private String type = "#Microsoft.VideoAnalyzer.IotHubMessageSource";

    /*
     * Name of the IoT Edge Hub input from which messages will be consumed.
     */
    private String hubInputName;

    /**
     * Creates an instance of IotHubMessageSource class.
     * 
     * @param name the name value to set.
     */
    public IotHubMessageSource(String name) {
        super(name);
    }

    /**
     * Get the type property: Type discriminator for the derived types.
     * 
     * @return the type value.
     */
    @Override
    public String getType() {
        return this.type;
    }

    /**
     * Get the hubInputName property: Name of the IoT Edge Hub input from which messages will be consumed.
     * 
     * @return the hubInputName value.
     */
    public String getHubInputName() {
        return this.hubInputName;
    }

    /**
     * Set the hubInputName property: Name of the IoT Edge Hub input from which messages will be consumed.
     * 
     * @param hubInputName the hubInputName value to set.
     * @return the IotHubMessageSource object itself.
     */
    public IotHubMessageSource setHubInputName(String hubInputName) {
        this.hubInputName = hubInputName;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("name", getName());
        jsonWriter.writeStringField("@type", this.type);
        jsonWriter.writeStringField("hubInputName", this.hubInputName);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of IotHubMessageSource from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of IotHubMessageSource if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the IotHubMessageSource.
     */
    public static IotHubMessageSource fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            boolean nameFound = false;
            String name = null;
            String type = "#Microsoft.VideoAnalyzer.IotHubMessageSource";
            String hubInputName = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("name".equals(fieldName)) {
                    name = reader.getString();
                    nameFound = true;
                } else if ("@type".equals(fieldName)) {
                    type = reader.getString();
                } else if ("hubInputName".equals(fieldName)) {
                    hubInputName = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }
            if (nameFound) {
                IotHubMessageSource deserializedIotHubMessageSource = new IotHubMessageSource(name);
                deserializedIotHubMessageSource.type = type;
                deserializedIotHubMessageSource.hubInputName = hubInputName;

                return deserializedIotHubMessageSource;
            }
            throw new IllegalStateException("Missing required property: name");
        });
    }
}
