// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.notificationhubs.models;

import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Represents a Private Endpoint that is connected to Notification Hubs namespace using Private Endpoint Connection.
 */
@Immutable
public final class RemotePrivateEndpointConnection implements JsonSerializable<RemotePrivateEndpointConnection> {
    /*
     * ARM resource ID of the Private Endpoint. This may belong to different subscription and resource group than a
     * Notification Hubs namespace.
     */
    private String id;

    /**
     * Creates an instance of RemotePrivateEndpointConnection class.
     */
    public RemotePrivateEndpointConnection() {
    }

    /**
     * Get the id property: ARM resource ID of the Private Endpoint. This may belong to different subscription and
     * resource group than a Notification Hubs namespace.
     * 
     * @return the id value.
     */
    public String id() {
        return this.id;
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
     * Reads an instance of RemotePrivateEndpointConnection from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of RemotePrivateEndpointConnection if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the RemotePrivateEndpointConnection.
     */
    public static RemotePrivateEndpointConnection fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            RemotePrivateEndpointConnection deserializedRemotePrivateEndpointConnection
                = new RemotePrivateEndpointConnection();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    deserializedRemotePrivateEndpointConnection.id = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedRemotePrivateEndpointConnection;
        });
    }
}
