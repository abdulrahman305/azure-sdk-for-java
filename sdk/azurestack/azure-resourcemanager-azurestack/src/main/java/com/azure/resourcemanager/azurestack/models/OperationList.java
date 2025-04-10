// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azurestack.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.azurestack.fluent.models.OperationInner;
import java.io.IOException;
import java.util.List;

/**
 * List of Operations.
 */
@Fluent
public final class OperationList implements JsonSerializable<OperationList> {
    /*
     * Array of operations
     */
    private List<OperationInner> value;

    /*
     * URI to the next page of operations.
     */
    private String nextLink;

    /**
     * Creates an instance of OperationList class.
     */
    public OperationList() {
    }

    /**
     * Get the value property: Array of operations.
     * 
     * @return the value value.
     */
    public List<OperationInner> value() {
        return this.value;
    }

    /**
     * Set the value property: Array of operations.
     * 
     * @param value the value value to set.
     * @return the OperationList object itself.
     */
    public OperationList withValue(List<OperationInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: URI to the next page of operations.
     * 
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: URI to the next page of operations.
     * 
     * @param nextLink the nextLink value to set.
     * @return the OperationList object itself.
     */
    public OperationList withNextLink(String nextLink) {
        this.nextLink = nextLink;
        return this;
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
        jsonWriter.writeStringField("nextLink", this.nextLink);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of OperationList from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of OperationList if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the OperationList.
     */
    public static OperationList fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            OperationList deserializedOperationList = new OperationList();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("value".equals(fieldName)) {
                    List<OperationInner> value = reader.readArray(reader1 -> OperationInner.fromJson(reader1));
                    deserializedOperationList.value = value;
                } else if ("nextLink".equals(fieldName)) {
                    deserializedOperationList.nextLink = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedOperationList;
        });
    }
}
