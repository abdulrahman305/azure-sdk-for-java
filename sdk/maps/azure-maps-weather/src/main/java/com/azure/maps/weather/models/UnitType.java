// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.
package com.azure.maps.weather.models;

import com.azure.core.annotation.Generated;
import com.azure.core.util.ExpandableEnum;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;

/**
 * Numeric ID value associated with the type of unit being displayed. Can be used for unit translation. Please refer to
 * [Weather services in Azure Maps](/azure/azure-maps/weather-services-concepts#unit-types) for details.
 */
public final class UnitType implements ExpandableEnum<Integer>, JsonSerializable<UnitType> {

    private static final Map<Integer, UnitType> VALUES = new ConcurrentHashMap<>();

    private static final Function<Integer, UnitType> NEW_INSTANCE = UnitType::new;

    /**
     * feet.
     */
    @Generated
    public static final UnitType FEET = fromValue(0);

    /**
     * inches.
     */
    @Generated
    public static final UnitType INCHES = fromValue(1);

    /**
     * miles.
     */
    @Generated
    public static final UnitType MILES = fromValue(2);

    /**
     * millimeter.
     */
    @Generated
    public static final UnitType MILLIMETER = fromValue(3);

    /**
     * centimeter.
     */
    @Generated
    public static final UnitType CENTIMETER = fromValue(4);

    /**
     * meter.
     */
    @Generated
    public static final UnitType METER = fromValue(5);

    /**
     * kilometer.
     */
    @Generated
    public static final UnitType KILOMETER = fromValue(6);

    /**
     * kilometersPerHour.
     */
    @Generated
    public static final UnitType KILOMETERS_PER_HOUR = fromValue(7);

    /**
     * knots.
     */
    @Generated
    public static final UnitType KNOTS = fromValue(8);

    /**
     * milesPerHour.
     */
    @Generated
    public static final UnitType MILES_PER_HOUR = fromValue(9);

    /**
     * metersPerSecond.
     */
    @Generated
    public static final UnitType METERS_PER_SECOND = fromValue(10);

    /**
     * hectoPascals.
     */
    @Generated
    public static final UnitType HECTO_PASCALS = fromValue(11);

    /**
     * inchesOfMercury.
     */
    @Generated
    public static final UnitType INCHES_OF_MERCURY = fromValue(12);

    /**
     * kiloPascals.
     */
    @Generated
    public static final UnitType KILO_PASCALS = fromValue(13);

    /**
     * millibars.
     */
    @Generated
    public static final UnitType MILLIBARS = fromValue(14);

    /**
     * millimetersOfMercury.
     */
    @Generated
    public static final UnitType MILLIMETERS_OF_MERCURY = fromValue(15);

    /**
     * poundsPerSquareInch.
     */
    @Generated
    public static final UnitType POUNDS_PER_SQUARE_INCH = fromValue(16);

    /**
     * celsius.
     */
    @Generated
    public static final UnitType CELSIUS = fromValue(17);

    /**
     * fahrenheit.
     */
    @Generated
    public static final UnitType FAHRENHEIT = fromValue(18);

    /**
     * kelvin.
     */
    @Generated
    public static final UnitType KELVIN = fromValue(19);

    /**
     * percent.
     */
    @Generated
    public static final UnitType PERCENT = fromValue(20);

    /**
     * float.
     */
    @Generated
    public static final UnitType FLOAT = fromValue(21);

    /**
     * integer.
     */
    @Generated
    public static final UnitType INTEGER = fromValue(22);

    /**
     * MicrogramsPerCubicMeterOfAir.
     */
    @Generated
    public static final UnitType MICROGRAMS_PER_CUBIC_METER_OF_AIR = fromValue(31);

    private final Integer value;

    private UnitType(Integer value) {
        this.value = value;
    }

    /**
     * Creates or finds a UnitType.
     *
     * @param value a value to look for.
     * @return the corresponding UnitType.
     * @throws IllegalArgumentException if value is null.
     */
    @Generated
    public static UnitType fromValue(Integer value) {
        if (value == null) {
            throw new IllegalArgumentException("'value' cannot be null.");
        }
        return VALUES.computeIfAbsent(value, NEW_INSTANCE);
    }

    /**
     * Gets known UnitType values.
     *
     * @return Known UnitType values.
     */
    @Generated
    public static Collection<UnitType> values() {
        return new ArrayList<>(VALUES.values());
    }

    /**
     * Gets the value of the UnitType instance.
     *
     * @return the value of the UnitType instance.
     */
    @Generated
    @Override
    public Integer getValue() {
        return this.value;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        return jsonWriter.writeInt(getValue());
    }

    /**
     * Reads an instance of UnitType from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of UnitType if the JsonReader was pointing to an instance of it, or null if the JsonReader
     * was pointing to JSON null.
     * @throws IOException If an error occurs while reading the UnitType.
     * @throws IllegalStateException If unexpected JSON token is found.
     */
    @Generated
    public static UnitType fromJson(JsonReader jsonReader) throws IOException {
        JsonToken nextToken = jsonReader.nextToken();
        if (nextToken == JsonToken.NULL) {
            return null;
        }
        if (nextToken != JsonToken.NUMBER) {
            throw new IllegalStateException(
                String.format("Unexpected JSON token for %s deserialization: %s", JsonToken.NUMBER, nextToken));
        }
        return UnitType.fromValue(jsonReader.getInt());
    }

    @Generated
    @Override
    public String toString() {
        return Objects.toString(this.value);
    }

    @Generated
    @Override
    public boolean equals(Object obj) {
        return this == obj;
    }

    @Generated
    @Override
    public int hashCode() {
        return Objects.hashCode(this.value);
    }

    int toInt() {
        return Integer.parseInt(toString());
    }
}
