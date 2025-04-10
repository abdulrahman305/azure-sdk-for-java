// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.reservations.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;

/**
 * Paginated list of applied reservations.
 */
@Fluent
public final class AppliedReservationList implements JsonSerializable<AppliedReservationList> {
    /*
     * The value property.
     */
    private List<String> value;

    /*
     * Url to get the next page of reservations
     */
    private String nextLink;

    /**
     * Creates an instance of AppliedReservationList class.
     */
    public AppliedReservationList() {
    }

    /**
     * Get the value property: The value property.
     * 
     * @return the value value.
     */
    public List<String> value() {
        return this.value;
    }

    /**
     * Set the value property: The value property.
     * 
     * @param value the value value to set.
     * @return the AppliedReservationList object itself.
     */
    public AppliedReservationList withValue(List<String> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: Url to get the next page of reservations.
     * 
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: Url to get the next page of reservations.
     * 
     * @param nextLink the nextLink value to set.
     * @return the AppliedReservationList object itself.
     */
    public AppliedReservationList withNextLink(String nextLink) {
        this.nextLink = nextLink;
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
        jsonWriter.writeArrayField("value", this.value, (writer, element) -> writer.writeString(element));
        jsonWriter.writeStringField("nextLink", this.nextLink);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of AppliedReservationList from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of AppliedReservationList if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IOException If an error occurs while reading the AppliedReservationList.
     */
    public static AppliedReservationList fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            AppliedReservationList deserializedAppliedReservationList = new AppliedReservationList();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("value".equals(fieldName)) {
                    List<String> value = reader.readArray(reader1 -> reader1.getString());
                    deserializedAppliedReservationList.value = value;
                } else if ("nextLink".equals(fieldName)) {
                    deserializedAppliedReservationList.nextLink = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedAppliedReservationList;
        });
    }
}
