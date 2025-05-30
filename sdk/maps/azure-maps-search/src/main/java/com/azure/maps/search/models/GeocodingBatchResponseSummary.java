// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.maps.search.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Generated;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Summary for the batch request.
 */
@Fluent
public final class GeocodingBatchResponseSummary implements JsonSerializable<GeocodingBatchResponseSummary> {
    /*
     * Number of successful requests in the batch
     */
    @Generated
    private Integer successfulRequests;

    /*
     * Total number of requests in the batch
     */
    @Generated
    private Integer totalRequests;

    /**
     * Creates an instance of GeocodingBatchResponseSummary class.
     */
    @Generated
    public GeocodingBatchResponseSummary() {
    }

    /**
     * Get the successfulRequests property: Number of successful requests in the batch.
     * 
     * @return the successfulRequests value.
     */
    @Generated
    public Integer getSuccessfulRequests() {
        return this.successfulRequests;
    }

    /**
     * Set the successfulRequests property: Number of successful requests in the batch.
     * 
     * @param successfulRequests the successfulRequests value to set.
     * @return the GeocodingBatchResponseSummary object itself.
     */
    @Generated
    public GeocodingBatchResponseSummary setSuccessfulRequests(Integer successfulRequests) {
        this.successfulRequests = successfulRequests;
        return this;
    }

    /**
     * Get the totalRequests property: Total number of requests in the batch.
     * 
     * @return the totalRequests value.
     */
    @Generated
    public Integer getTotalRequests() {
        return this.totalRequests;
    }

    /**
     * Set the totalRequests property: Total number of requests in the batch.
     * 
     * @param totalRequests the totalRequests value to set.
     * @return the GeocodingBatchResponseSummary object itself.
     */
    @Generated
    public GeocodingBatchResponseSummary setTotalRequests(Integer totalRequests) {
        this.totalRequests = totalRequests;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeNumberField("successfulRequests", this.successfulRequests);
        jsonWriter.writeNumberField("totalRequests", this.totalRequests);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of GeocodingBatchResponseSummary from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of GeocodingBatchResponseSummary if the JsonReader was pointing to an instance of it, or null
     * if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the GeocodingBatchResponseSummary.
     */
    @Generated
    public static GeocodingBatchResponseSummary fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            GeocodingBatchResponseSummary deserializedGeocodingBatchResponseSummary
                = new GeocodingBatchResponseSummary();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("successfulRequests".equals(fieldName)) {
                    deserializedGeocodingBatchResponseSummary.successfulRequests
                        = reader.getNullable(JsonReader::getInt);
                } else if ("totalRequests".equals(fieldName)) {
                    deserializedGeocodingBatchResponseSummary.totalRequests = reader.getNullable(JsonReader::getInt);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedGeocodingBatchResponseSummary;
        });
    }
}
