// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.iotoperations.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * DataflowEndpoint Authentication X509 properties.
 */
@Fluent
public final class DataflowEndpointAuthenticationX509 implements JsonSerializable<DataflowEndpointAuthenticationX509> {
    /*
     * Secret reference of the X.509 certificate.
     */
    private String secretRef;

    /**
     * Creates an instance of DataflowEndpointAuthenticationX509 class.
     */
    public DataflowEndpointAuthenticationX509() {
    }

    /**
     * Get the secretRef property: Secret reference of the X.509 certificate.
     * 
     * @return the secretRef value.
     */
    public String secretRef() {
        return this.secretRef;
    }

    /**
     * Set the secretRef property: Secret reference of the X.509 certificate.
     * 
     * @param secretRef the secretRef value to set.
     * @return the DataflowEndpointAuthenticationX509 object itself.
     */
    public DataflowEndpointAuthenticationX509 withSecretRef(String secretRef) {
        this.secretRef = secretRef;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (secretRef() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property secretRef in model DataflowEndpointAuthenticationX509"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(DataflowEndpointAuthenticationX509.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("secretRef", this.secretRef);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of DataflowEndpointAuthenticationX509 from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of DataflowEndpointAuthenticationX509 if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the DataflowEndpointAuthenticationX509.
     */
    public static DataflowEndpointAuthenticationX509 fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            DataflowEndpointAuthenticationX509 deserializedDataflowEndpointAuthenticationX509
                = new DataflowEndpointAuthenticationX509();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("secretRef".equals(fieldName)) {
                    deserializedDataflowEndpointAuthenticationX509.secretRef = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedDataflowEndpointAuthenticationX509;
        });
    }
}
