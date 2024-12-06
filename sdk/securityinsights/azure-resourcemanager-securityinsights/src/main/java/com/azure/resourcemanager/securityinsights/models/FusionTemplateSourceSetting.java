// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.securityinsights.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;

/**
 * Represents a source signal consumed in Fusion detection.
 */
@Fluent
public final class FusionTemplateSourceSetting implements JsonSerializable<FusionTemplateSourceSetting> {
    /*
     * The name of a source signal consumed in Fusion detection.
     */
    private String sourceName;

    /*
     * All supported source subtypes under this source signal consumed in fusion detection.
     */
    private List<FusionTemplateSourceSubType> sourceSubTypes;

    /**
     * Creates an instance of FusionTemplateSourceSetting class.
     */
    public FusionTemplateSourceSetting() {
    }

    /**
     * Get the sourceName property: The name of a source signal consumed in Fusion detection.
     * 
     * @return the sourceName value.
     */
    public String sourceName() {
        return this.sourceName;
    }

    /**
     * Set the sourceName property: The name of a source signal consumed in Fusion detection.
     * 
     * @param sourceName the sourceName value to set.
     * @return the FusionTemplateSourceSetting object itself.
     */
    public FusionTemplateSourceSetting withSourceName(String sourceName) {
        this.sourceName = sourceName;
        return this;
    }

    /**
     * Get the sourceSubTypes property: All supported source subtypes under this source signal consumed in fusion
     * detection.
     * 
     * @return the sourceSubTypes value.
     */
    public List<FusionTemplateSourceSubType> sourceSubTypes() {
        return this.sourceSubTypes;
    }

    /**
     * Set the sourceSubTypes property: All supported source subtypes under this source signal consumed in fusion
     * detection.
     * 
     * @param sourceSubTypes the sourceSubTypes value to set.
     * @return the FusionTemplateSourceSetting object itself.
     */
    public FusionTemplateSourceSetting withSourceSubTypes(List<FusionTemplateSourceSubType> sourceSubTypes) {
        this.sourceSubTypes = sourceSubTypes;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (sourceName() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property sourceName in model FusionTemplateSourceSetting"));
        }
        if (sourceSubTypes() != null) {
            sourceSubTypes().forEach(e -> e.validate());
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(FusionTemplateSourceSetting.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("sourceName", this.sourceName);
        jsonWriter.writeArrayField("sourceSubTypes", this.sourceSubTypes,
            (writer, element) -> writer.writeJson(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of FusionTemplateSourceSetting from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of FusionTemplateSourceSetting if the JsonReader was pointing to an instance of it, or null
     * if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the FusionTemplateSourceSetting.
     */
    public static FusionTemplateSourceSetting fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            FusionTemplateSourceSetting deserializedFusionTemplateSourceSetting = new FusionTemplateSourceSetting();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("sourceName".equals(fieldName)) {
                    deserializedFusionTemplateSourceSetting.sourceName = reader.getString();
                } else if ("sourceSubTypes".equals(fieldName)) {
                    List<FusionTemplateSourceSubType> sourceSubTypes
                        = reader.readArray(reader1 -> FusionTemplateSourceSubType.fromJson(reader1));
                    deserializedFusionTemplateSourceSetting.sourceSubTypes = sourceSubTypes;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedFusionTemplateSourceSetting;
        });
    }
}
