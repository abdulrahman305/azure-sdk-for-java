// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Azure Databricks Delta Lake export command settings.
 */
@Fluent
public final class AzureDatabricksDeltaLakeExportCommand extends ExportSettings {
    /*
     * The export setting type.
     */
    private String type = "AzureDatabricksDeltaLakeExportCommand";

    /*
     * Specify the date format for the csv in Azure Databricks Delta Lake Copy. Type: string (or Expression with
     * resultType string).
     */
    private Object dateFormat;

    /*
     * Specify the timestamp format for the csv in Azure Databricks Delta Lake Copy. Type: string (or Expression with
     * resultType string).
     */
    private Object timestampFormat;

    /**
     * Creates an instance of AzureDatabricksDeltaLakeExportCommand class.
     */
    public AzureDatabricksDeltaLakeExportCommand() {
    }

    /**
     * Get the type property: The export setting type.
     * 
     * @return the type value.
     */
    @Override
    public String type() {
        return this.type;
    }

    /**
     * Get the dateFormat property: Specify the date format for the csv in Azure Databricks Delta Lake Copy. Type:
     * string (or Expression with resultType string).
     * 
     * @return the dateFormat value.
     */
    public Object dateFormat() {
        return this.dateFormat;
    }

    /**
     * Set the dateFormat property: Specify the date format for the csv in Azure Databricks Delta Lake Copy. Type:
     * string (or Expression with resultType string).
     * 
     * @param dateFormat the dateFormat value to set.
     * @return the AzureDatabricksDeltaLakeExportCommand object itself.
     */
    public AzureDatabricksDeltaLakeExportCommand withDateFormat(Object dateFormat) {
        this.dateFormat = dateFormat;
        return this;
    }

    /**
     * Get the timestampFormat property: Specify the timestamp format for the csv in Azure Databricks Delta Lake Copy.
     * Type: string (or Expression with resultType string).
     * 
     * @return the timestampFormat value.
     */
    public Object timestampFormat() {
        return this.timestampFormat;
    }

    /**
     * Set the timestampFormat property: Specify the timestamp format for the csv in Azure Databricks Delta Lake Copy.
     * Type: string (or Expression with resultType string).
     * 
     * @param timestampFormat the timestampFormat value to set.
     * @return the AzureDatabricksDeltaLakeExportCommand object itself.
     */
    public AzureDatabricksDeltaLakeExportCommand withTimestampFormat(Object timestampFormat) {
        this.timestampFormat = timestampFormat;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("type", this.type);
        if (this.dateFormat != null) {
            jsonWriter.writeUntypedField("dateFormat", this.dateFormat);
        }
        if (this.timestampFormat != null) {
            jsonWriter.writeUntypedField("timestampFormat", this.timestampFormat);
        }
        if (additionalProperties() != null) {
            for (Map.Entry<String, Object> additionalProperty : additionalProperties().entrySet()) {
                jsonWriter.writeUntypedField(additionalProperty.getKey(), additionalProperty.getValue());
            }
        }
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of AzureDatabricksDeltaLakeExportCommand from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of AzureDatabricksDeltaLakeExportCommand if the JsonReader was pointing to an instance of it,
     * or null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the AzureDatabricksDeltaLakeExportCommand.
     */
    public static AzureDatabricksDeltaLakeExportCommand fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            AzureDatabricksDeltaLakeExportCommand deserializedAzureDatabricksDeltaLakeExportCommand
                = new AzureDatabricksDeltaLakeExportCommand();
            Map<String, Object> additionalProperties = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("type".equals(fieldName)) {
                    deserializedAzureDatabricksDeltaLakeExportCommand.type = reader.getString();
                } else if ("dateFormat".equals(fieldName)) {
                    deserializedAzureDatabricksDeltaLakeExportCommand.dateFormat = reader.readUntyped();
                } else if ("timestampFormat".equals(fieldName)) {
                    deserializedAzureDatabricksDeltaLakeExportCommand.timestampFormat = reader.readUntyped();
                } else {
                    if (additionalProperties == null) {
                        additionalProperties = new LinkedHashMap<>();
                    }

                    additionalProperties.put(fieldName, reader.readUntyped());
                }
            }
            deserializedAzureDatabricksDeltaLakeExportCommand.withAdditionalProperties(additionalProperties);

            return deserializedAzureDatabricksDeltaLakeExportCommand;
        });
    }
}
