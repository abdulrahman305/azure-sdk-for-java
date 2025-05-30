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
 * Detailed information about an individual pollutant. Not returned if `pollutants`=false.
 */
@Fluent
public final class Pollutant implements JsonSerializable<Pollutant> {

    /*
     * Type of pollutant. Please note that more may be added at any time.
     */
    @Generated
    private PollutantType type;

    /*
     * The name of the pollutant in English.
     */
    @Generated
    private String name;

    /*
     * Air quality rating on a scale set by local regulating bodies. Scales can vary widely based on location. See
     * [Wikipedia](https://en.wikipedia.org/wiki/Air_quality_index) for more information.
     */
    @Generated
    private Float index;

    /*
     * Internationally normalized air quality rating on a scale from 0 to 300 and up, with higher numbers representing
     * worse air quality.
     */
    @Generated
    private Float globalIndex;

    /*
     * An object containing the number of pollutant particles per volume of air.
     */
    @Generated
    private WeatherUnitDetails concentration;

    /**
     * Set default Pollutant constructor to private
     */
    @Generated
    private Pollutant() {
    }

    /**
     * Get the type property: Type of pollutant. Please note that more may be added at any time.
     *
     * @return the type value.
     */
    @Generated
    public PollutantType getType() {
        return this.type;
    }

    /**
     * Get the name property: The name of the pollutant in English.
     *
     * @return the name value.
     */
    @Generated
    public String getName() {
        return this.name;
    }

    /**
     * Get the index property: Air quality rating on a scale set by local regulating bodies. Scales can vary widely
     * based on location. See [Wikipedia](https://en.wikipedia.org/wiki/Air_quality_index) for more information.
     *
     * @return the index value.
     */
    @Generated
    public Float getIndex() {
        return this.index;
    }

    /**
     * Get the globalIndex property: Internationally normalized air quality rating on a scale from 0 to 300 and up, with
     * higher numbers representing worse air quality.
     *
     * @return the globalIndex value.
     */
    @Generated
    public Float getGlobalIndex() {
        return this.globalIndex;
    }

    /**
     * Get the concentration property: An object containing the number of pollutant particles per volume of air.
     *
     * @return the concentration value.
     */
    @Generated
    public WeatherUnitDetails getConcentration() {
        return this.concentration;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("type", this.type == null ? null : this.type.toString());
        jsonWriter.writeStringField("name", this.name);
        jsonWriter.writeNumberField("index", this.index);
        jsonWriter.writeNumberField("globalIndex", this.globalIndex);
        jsonWriter.writeJsonField("concentration", this.concentration);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of Pollutant from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of Pollutant if the JsonReader was pointing to an instance of it, or null if it was pointing
     * to JSON null.
     * @throws IOException If an error occurs while reading the Pollutant.
     */
    @Generated
    public static Pollutant fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            Pollutant deserializedPollutant = new Pollutant();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();
                if ("type".equals(fieldName)) {
                    deserializedPollutant.type = PollutantType.fromString(reader.getString());
                } else if ("name".equals(fieldName)) {
                    deserializedPollutant.name = reader.getString();
                } else if ("index".equals(fieldName)) {
                    deserializedPollutant.index = reader.getNullable(JsonReader::getFloat);
                } else if ("globalIndex".equals(fieldName)) {
                    deserializedPollutant.globalIndex = reader.getNullable(JsonReader::getFloat);
                } else if ("concentration".equals(fieldName)) {
                    deserializedPollutant.concentration = WeatherUnitDetails.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }
            return deserializedPollutant;
        });
    }
}
