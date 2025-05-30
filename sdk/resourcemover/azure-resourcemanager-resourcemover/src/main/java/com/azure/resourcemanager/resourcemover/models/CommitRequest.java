// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resourcemover.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;

/**
 * Defines the request body for commit operation.
 */
@Fluent
public final class CommitRequest implements JsonSerializable<CommitRequest> {
    /*
     * Gets or sets a value indicating whether the operation needs to only run pre-requisite.
     */
    private Boolean validateOnly;

    /*
     * Gets or sets the list of resource Id's, by default it accepts move resource id's unless the input type is
     * switched via moveResourceInputType property.
     */
    private List<String> moveResources;

    /*
     * Defines the move resource input type.
     */
    private MoveResourceInputType moveResourceInputType;

    /**
     * Creates an instance of CommitRequest class.
     */
    public CommitRequest() {
    }

    /**
     * Get the validateOnly property: Gets or sets a value indicating whether the operation needs to only run
     * pre-requisite.
     * 
     * @return the validateOnly value.
     */
    public Boolean validateOnly() {
        return this.validateOnly;
    }

    /**
     * Set the validateOnly property: Gets or sets a value indicating whether the operation needs to only run
     * pre-requisite.
     * 
     * @param validateOnly the validateOnly value to set.
     * @return the CommitRequest object itself.
     */
    public CommitRequest withValidateOnly(Boolean validateOnly) {
        this.validateOnly = validateOnly;
        return this;
    }

    /**
     * Get the moveResources property: Gets or sets the list of resource Id's, by default it accepts move resource id's
     * unless the input type is switched via moveResourceInputType property.
     * 
     * @return the moveResources value.
     */
    public List<String> moveResources() {
        return this.moveResources;
    }

    /**
     * Set the moveResources property: Gets or sets the list of resource Id's, by default it accepts move resource id's
     * unless the input type is switched via moveResourceInputType property.
     * 
     * @param moveResources the moveResources value to set.
     * @return the CommitRequest object itself.
     */
    public CommitRequest withMoveResources(List<String> moveResources) {
        this.moveResources = moveResources;
        return this;
    }

    /**
     * Get the moveResourceInputType property: Defines the move resource input type.
     * 
     * @return the moveResourceInputType value.
     */
    public MoveResourceInputType moveResourceInputType() {
        return this.moveResourceInputType;
    }

    /**
     * Set the moveResourceInputType property: Defines the move resource input type.
     * 
     * @param moveResourceInputType the moveResourceInputType value to set.
     * @return the CommitRequest object itself.
     */
    public CommitRequest withMoveResourceInputType(MoveResourceInputType moveResourceInputType) {
        this.moveResourceInputType = moveResourceInputType;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (moveResources() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException("Missing required property moveResources in model CommitRequest"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(CommitRequest.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeArrayField("moveResources", this.moveResources,
            (writer, element) -> writer.writeString(element));
        jsonWriter.writeBooleanField("validateOnly", this.validateOnly);
        jsonWriter.writeStringField("moveResourceInputType",
            this.moveResourceInputType == null ? null : this.moveResourceInputType.toString());
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of CommitRequest from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of CommitRequest if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the CommitRequest.
     */
    public static CommitRequest fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            CommitRequest deserializedCommitRequest = new CommitRequest();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("moveResources".equals(fieldName)) {
                    List<String> moveResources = reader.readArray(reader1 -> reader1.getString());
                    deserializedCommitRequest.moveResources = moveResources;
                } else if ("validateOnly".equals(fieldName)) {
                    deserializedCommitRequest.validateOnly = reader.getNullable(JsonReader::getBoolean);
                } else if ("moveResourceInputType".equals(fieldName)) {
                    deserializedCommitRequest.moveResourceInputType
                        = MoveResourceInputType.fromString(reader.getString());
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedCommitRequest;
        });
    }
}
