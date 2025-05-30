// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.
package com.azure.maps.weather.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Generated;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * The IntervalSummary model.
 */
@Fluent
public final class IntervalSummary implements JsonSerializable<IntervalSummary> {

    /*
     * The first minute to which the summary applies.
     */
    @Generated
    private Integer startMinute;

    /*
     * The last minute to which the summary applies.
     */
    @Generated
    private Integer endMinute;

    /*
     * The number of minutes for which the summary applies.
     */
    @Generated
    private Integer totalMinutes;

    /*
     * Short summary phrase. Phrase length is approximately 25 characters.
     */
    @Generated
    private String shortDescription;

    /*
     * Brief summary phrase. Phrase length is approximately 60 characters.
     */
    @Generated
    private String briefDescription;

    /*
     * Long summary phrase. Phrase length is 60+ characters.
     */
    @Generated
    private String longPhrase;

    /*
     * Numeric value representing an image that displays the `iconPhrase`. Please refer to [Weather services in Azure
     * Maps](/azure/azure-maps/weather-services-concepts#weather-icons) for details.
     */
    @Generated
    private IconCode iconCode;

    /**
     * Set default IntervalSummary constructor to private
     */
    @Generated
    private IntervalSummary() {
    }

    /**
     * Get the startMinute property: The first minute to which the summary applies.
     *
     * @return the startMinute value.
     */
    @Generated
    public Integer getStartMinute() {
        return this.startMinute;
    }

    /**
     * Get the endMinute property: The last minute to which the summary applies.
     *
     * @return the endMinute value.
     */
    @Generated
    public Integer getEndMinute() {
        return this.endMinute;
    }

    /**
     * Get the totalMinutes property: The number of minutes for which the summary applies.
     *
     * @return the totalMinutes value.
     */
    @Generated
    public Integer getTotalMinutes() {
        return this.totalMinutes;
    }

    /**
     * Get the shortDescription property: Short summary phrase. Phrase length is approximately 25 characters.
     *
     * @return the shortDescription value.
     */
    @Generated
    public String getShortDescription() {
        return this.shortDescription;
    }

    /**
     * Get the briefDescription property: Brief summary phrase. Phrase length is approximately 60 characters.
     *
     * @return the briefDescription value.
     */
    @Generated
    public String getBriefDescription() {
        return this.briefDescription;
    }

    /**
     * Get the longPhrase property: Long summary phrase. Phrase length is 60+ characters.
     *
     * @return the longPhrase value.
     */
    @Generated
    public String getLongPhrase() {
        return this.longPhrase;
    }

    /**
     * Get the iconCode property: Numeric value representing an image that displays the `iconPhrase`. Please refer to
     * [Weather services in Azure Maps](/azure/azure-maps/weather-services-concepts#weather-icons) for details.
     *
     * @return the iconCode value.
     */
    @Generated
    public IconCode getIconCode() {
        return this.iconCode;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeNumberField("startMinute", this.startMinute);
        jsonWriter.writeNumberField("endMinute", this.endMinute);
        jsonWriter.writeNumberField("totalMinutes", this.totalMinutes);
        jsonWriter.writeStringField("shortPhrase", this.shortDescription);
        jsonWriter.writeStringField("briefPhrase", this.briefDescription);
        jsonWriter.writeStringField("longPhrase", this.longPhrase);
        jsonWriter.writeNumberField("iconCode", this.iconCode == null ? null : this.iconCode.getValue());
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of IntervalSummary from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of IntervalSummary if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the IntervalSummary.
     */
    @Generated
    public static IntervalSummary fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            IntervalSummary deserializedIntervalSummary = new IntervalSummary();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();
                if ("startMinute".equals(fieldName)) {
                    deserializedIntervalSummary.startMinute = reader.getNullable(JsonReader::getInt);
                } else if ("endMinute".equals(fieldName)) {
                    deserializedIntervalSummary.endMinute = reader.getNullable(JsonReader::getInt);
                } else if ("totalMinutes".equals(fieldName)) {
                    deserializedIntervalSummary.totalMinutes = reader.getNullable(JsonReader::getInt);
                } else if ("shortPhrase".equals(fieldName)) {
                    deserializedIntervalSummary.shortDescription = reader.getString();
                } else if ("briefPhrase".equals(fieldName)) {
                    deserializedIntervalSummary.briefDescription = reader.getString();
                } else if ("longPhrase".equals(fieldName)) {
                    deserializedIntervalSummary.longPhrase = reader.getString();
                } else if ("iconCode".equals(fieldName)) {
                    deserializedIntervalSummary.iconCode = IconCode.fromValue(reader.getInt());
                } else {
                    reader.skipChildren();
                }
            }
            return deserializedIntervalSummary;
        });
    }
}
