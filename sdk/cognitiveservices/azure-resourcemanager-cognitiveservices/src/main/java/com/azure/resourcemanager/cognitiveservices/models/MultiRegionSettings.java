// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cognitiveservices.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;

/**
 * The multiregion settings Cognitive Services account.
 */
@Fluent
public final class MultiRegionSettings implements JsonSerializable<MultiRegionSettings> {
    /*
     * Multiregion routing methods.
     */
    private RoutingMethods routingMethod;

    /*
     * The regions property.
     */
    private List<RegionSetting> regions;

    /**
     * Creates an instance of MultiRegionSettings class.
     */
    public MultiRegionSettings() {
    }

    /**
     * Get the routingMethod property: Multiregion routing methods.
     * 
     * @return the routingMethod value.
     */
    public RoutingMethods routingMethod() {
        return this.routingMethod;
    }

    /**
     * Set the routingMethod property: Multiregion routing methods.
     * 
     * @param routingMethod the routingMethod value to set.
     * @return the MultiRegionSettings object itself.
     */
    public MultiRegionSettings withRoutingMethod(RoutingMethods routingMethod) {
        this.routingMethod = routingMethod;
        return this;
    }

    /**
     * Get the regions property: The regions property.
     * 
     * @return the regions value.
     */
    public List<RegionSetting> regions() {
        return this.regions;
    }

    /**
     * Set the regions property: The regions property.
     * 
     * @param regions the regions value to set.
     * @return the MultiRegionSettings object itself.
     */
    public MultiRegionSettings withRegions(List<RegionSetting> regions) {
        this.regions = regions;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (regions() != null) {
            regions().forEach(e -> e.validate());
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("routingMethod", this.routingMethod == null ? null : this.routingMethod.toString());
        jsonWriter.writeArrayField("regions", this.regions, (writer, element) -> writer.writeJson(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of MultiRegionSettings from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of MultiRegionSettings if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the MultiRegionSettings.
     */
    public static MultiRegionSettings fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            MultiRegionSettings deserializedMultiRegionSettings = new MultiRegionSettings();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("routingMethod".equals(fieldName)) {
                    deserializedMultiRegionSettings.routingMethod = RoutingMethods.fromString(reader.getString());
                } else if ("regions".equals(fieldName)) {
                    List<RegionSetting> regions = reader.readArray(reader1 -> RegionSetting.fromJson(reader1));
                    deserializedMultiRegionSettings.regions = regions;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedMultiRegionSettings;
        });
    }
}
