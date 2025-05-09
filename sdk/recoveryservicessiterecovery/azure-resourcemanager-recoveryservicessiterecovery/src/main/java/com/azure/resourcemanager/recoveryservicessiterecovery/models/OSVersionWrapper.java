// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Wrapper model for OSVersion to include version and service pack info.
 */
@Fluent
public final class OSVersionWrapper implements JsonSerializable<OSVersionWrapper> {
    /*
     * The version.
     */
    private String version;

    /*
     * The service pack.
     */
    private String servicePack;

    /**
     * Creates an instance of OSVersionWrapper class.
     */
    public OSVersionWrapper() {
    }

    /**
     * Get the version property: The version.
     * 
     * @return the version value.
     */
    public String version() {
        return this.version;
    }

    /**
     * Set the version property: The version.
     * 
     * @param version the version value to set.
     * @return the OSVersionWrapper object itself.
     */
    public OSVersionWrapper withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * Get the servicePack property: The service pack.
     * 
     * @return the servicePack value.
     */
    public String servicePack() {
        return this.servicePack;
    }

    /**
     * Set the servicePack property: The service pack.
     * 
     * @param servicePack the servicePack value to set.
     * @return the OSVersionWrapper object itself.
     */
    public OSVersionWrapper withServicePack(String servicePack) {
        this.servicePack = servicePack;
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
        jsonWriter.writeStringField("version", this.version);
        jsonWriter.writeStringField("servicePack", this.servicePack);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of OSVersionWrapper from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of OSVersionWrapper if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the OSVersionWrapper.
     */
    public static OSVersionWrapper fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            OSVersionWrapper deserializedOSVersionWrapper = new OSVersionWrapper();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("version".equals(fieldName)) {
                    deserializedOSVersionWrapper.version = reader.getString();
                } else if ("servicePack".equals(fieldName)) {
                    deserializedOSVersionWrapper.servicePack = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedOSVersionWrapper;
        });
    }
}
