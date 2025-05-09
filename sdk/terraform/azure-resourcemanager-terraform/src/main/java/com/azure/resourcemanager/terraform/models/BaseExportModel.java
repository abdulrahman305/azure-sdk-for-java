// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.terraform.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * The base export parameter.
 */
@Fluent
public class BaseExportModel implements JsonSerializable<BaseExportModel> {
    /*
     * The parameter type
     */
    private Type type = Type.fromString("BaseExportModel");

    /*
     * The target Azure Terraform Provider
     */
    private TargetProvider targetProvider;

    /*
     * Whether to output all non-computed properties in the generated Terraform configuration? This probably needs
     * manual modifications to make it valid
     */
    private Boolean fullProperties;

    /*
     * Mask sensitive attributes in the Terraform configuration
     */
    private Boolean maskSensitive;

    /**
     * Creates an instance of BaseExportModel class.
     */
    public BaseExportModel() {
    }

    /**
     * Get the type property: The parameter type.
     * 
     * @return the type value.
     */
    public Type type() {
        return this.type;
    }

    /**
     * Get the targetProvider property: The target Azure Terraform Provider.
     * 
     * @return the targetProvider value.
     */
    public TargetProvider targetProvider() {
        return this.targetProvider;
    }

    /**
     * Set the targetProvider property: The target Azure Terraform Provider.
     * 
     * @param targetProvider the targetProvider value to set.
     * @return the BaseExportModel object itself.
     */
    public BaseExportModel withTargetProvider(TargetProvider targetProvider) {
        this.targetProvider = targetProvider;
        return this;
    }

    /**
     * Get the fullProperties property: Whether to output all non-computed properties in the generated Terraform
     * configuration? This probably needs manual modifications to make it valid.
     * 
     * @return the fullProperties value.
     */
    public Boolean fullProperties() {
        return this.fullProperties;
    }

    /**
     * Set the fullProperties property: Whether to output all non-computed properties in the generated Terraform
     * configuration? This probably needs manual modifications to make it valid.
     * 
     * @param fullProperties the fullProperties value to set.
     * @return the BaseExportModel object itself.
     */
    public BaseExportModel withFullProperties(Boolean fullProperties) {
        this.fullProperties = fullProperties;
        return this;
    }

    /**
     * Get the maskSensitive property: Mask sensitive attributes in the Terraform configuration.
     * 
     * @return the maskSensitive value.
     */
    public Boolean maskSensitive() {
        return this.maskSensitive;
    }

    /**
     * Set the maskSensitive property: Mask sensitive attributes in the Terraform configuration.
     * 
     * @param maskSensitive the maskSensitive value to set.
     * @return the BaseExportModel object itself.
     */
    public BaseExportModel withMaskSensitive(Boolean maskSensitive) {
        this.maskSensitive = maskSensitive;
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
        jsonWriter.writeStringField("type", this.type == null ? null : this.type.toString());
        jsonWriter.writeStringField("targetProvider",
            this.targetProvider == null ? null : this.targetProvider.toString());
        jsonWriter.writeBooleanField("fullProperties", this.fullProperties);
        jsonWriter.writeBooleanField("maskSensitive", this.maskSensitive);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of BaseExportModel from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of BaseExportModel if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the BaseExportModel.
     */
    public static BaseExportModel fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            String discriminatorValue = null;
            try (JsonReader readerToUse = reader.bufferObject()) {
                readerToUse.nextToken(); // Prepare for reading
                while (readerToUse.nextToken() != JsonToken.END_OBJECT) {
                    String fieldName = readerToUse.getFieldName();
                    readerToUse.nextToken();
                    if ("type".equals(fieldName)) {
                        discriminatorValue = readerToUse.getString();
                        break;
                    } else {
                        readerToUse.skipChildren();
                    }
                }
                // Use the discriminator value to determine which subtype should be deserialized.
                if ("ExportQuery".equals(discriminatorValue)) {
                    return ExportQuery.fromJson(readerToUse.reset());
                } else if ("ExportResource".equals(discriminatorValue)) {
                    return ExportResource.fromJson(readerToUse.reset());
                } else if ("ExportResourceGroup".equals(discriminatorValue)) {
                    return ExportResourceGroup.fromJson(readerToUse.reset());
                } else {
                    return fromJsonKnownDiscriminator(readerToUse.reset());
                }
            }
        });
    }

    static BaseExportModel fromJsonKnownDiscriminator(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            BaseExportModel deserializedBaseExportModel = new BaseExportModel();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("type".equals(fieldName)) {
                    deserializedBaseExportModel.type = Type.fromString(reader.getString());
                } else if ("targetProvider".equals(fieldName)) {
                    deserializedBaseExportModel.targetProvider = TargetProvider.fromString(reader.getString());
                } else if ("fullProperties".equals(fieldName)) {
                    deserializedBaseExportModel.fullProperties = reader.getNullable(JsonReader::getBoolean);
                } else if ("maskSensitive".equals(fieldName)) {
                    deserializedBaseExportModel.maskSensitive = reader.getNullable(JsonReader::getBoolean);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedBaseExportModel;
        });
    }
}
