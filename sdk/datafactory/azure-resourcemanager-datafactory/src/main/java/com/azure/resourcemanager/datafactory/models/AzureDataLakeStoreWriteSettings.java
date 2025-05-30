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
import java.util.List;
import java.util.Map;

/**
 * Azure data lake store write settings.
 */
@Fluent
public final class AzureDataLakeStoreWriteSettings extends StoreWriteSettings {
    /*
     * The write setting type.
     */
    private String type = "AzureDataLakeStoreWriteSettings";

    /*
     * Specifies the expiry time of the written files. The time is applied to the UTC time zone in the format of
     * "2018-12-01T05:00:00Z". Default value is NULL. Type: string (or Expression with resultType string).
     */
    private Object expiryDateTime;

    /**
     * Creates an instance of AzureDataLakeStoreWriteSettings class.
     */
    public AzureDataLakeStoreWriteSettings() {
    }

    /**
     * Get the type property: The write setting type.
     * 
     * @return the type value.
     */
    @Override
    public String type() {
        return this.type;
    }

    /**
     * Get the expiryDateTime property: Specifies the expiry time of the written files. The time is applied to the UTC
     * time zone in the format of "2018-12-01T05:00:00Z". Default value is NULL. Type: string (or Expression with
     * resultType string).
     * 
     * @return the expiryDateTime value.
     */
    public Object expiryDateTime() {
        return this.expiryDateTime;
    }

    /**
     * Set the expiryDateTime property: Specifies the expiry time of the written files. The time is applied to the UTC
     * time zone in the format of "2018-12-01T05:00:00Z". Default value is NULL. Type: string (or Expression with
     * resultType string).
     * 
     * @param expiryDateTime the expiryDateTime value to set.
     * @return the AzureDataLakeStoreWriteSettings object itself.
     */
    public AzureDataLakeStoreWriteSettings withExpiryDateTime(Object expiryDateTime) {
        this.expiryDateTime = expiryDateTime;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureDataLakeStoreWriteSettings withMaxConcurrentConnections(Object maxConcurrentConnections) {
        super.withMaxConcurrentConnections(maxConcurrentConnections);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureDataLakeStoreWriteSettings withDisableMetricsCollection(Object disableMetricsCollection) {
        super.withDisableMetricsCollection(disableMetricsCollection);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureDataLakeStoreWriteSettings withCopyBehavior(Object copyBehavior) {
        super.withCopyBehavior(copyBehavior);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureDataLakeStoreWriteSettings withMetadata(List<MetadataItem> metadata) {
        super.withMetadata(metadata);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        if (metadata() != null) {
            metadata().forEach(e -> e.validate());
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        if (maxConcurrentConnections() != null) {
            jsonWriter.writeUntypedField("maxConcurrentConnections", maxConcurrentConnections());
        }
        if (disableMetricsCollection() != null) {
            jsonWriter.writeUntypedField("disableMetricsCollection", disableMetricsCollection());
        }
        if (copyBehavior() != null) {
            jsonWriter.writeUntypedField("copyBehavior", copyBehavior());
        }
        jsonWriter.writeArrayField("metadata", metadata(), (writer, element) -> writer.writeJson(element));
        jsonWriter.writeStringField("type", this.type);
        if (this.expiryDateTime != null) {
            jsonWriter.writeUntypedField("expiryDateTime", this.expiryDateTime);
        }
        if (additionalProperties() != null) {
            for (Map.Entry<String, Object> additionalProperty : additionalProperties().entrySet()) {
                jsonWriter.writeUntypedField(additionalProperty.getKey(), additionalProperty.getValue());
            }
        }
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of AzureDataLakeStoreWriteSettings from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of AzureDataLakeStoreWriteSettings if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the AzureDataLakeStoreWriteSettings.
     */
    public static AzureDataLakeStoreWriteSettings fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            AzureDataLakeStoreWriteSettings deserializedAzureDataLakeStoreWriteSettings
                = new AzureDataLakeStoreWriteSettings();
            Map<String, Object> additionalProperties = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("maxConcurrentConnections".equals(fieldName)) {
                    deserializedAzureDataLakeStoreWriteSettings.withMaxConcurrentConnections(reader.readUntyped());
                } else if ("disableMetricsCollection".equals(fieldName)) {
                    deserializedAzureDataLakeStoreWriteSettings.withDisableMetricsCollection(reader.readUntyped());
                } else if ("copyBehavior".equals(fieldName)) {
                    deserializedAzureDataLakeStoreWriteSettings.withCopyBehavior(reader.readUntyped());
                } else if ("metadata".equals(fieldName)) {
                    List<MetadataItem> metadata = reader.readArray(reader1 -> MetadataItem.fromJson(reader1));
                    deserializedAzureDataLakeStoreWriteSettings.withMetadata(metadata);
                } else if ("type".equals(fieldName)) {
                    deserializedAzureDataLakeStoreWriteSettings.type = reader.getString();
                } else if ("expiryDateTime".equals(fieldName)) {
                    deserializedAzureDataLakeStoreWriteSettings.expiryDateTime = reader.readUntyped();
                } else {
                    if (additionalProperties == null) {
                        additionalProperties = new LinkedHashMap<>();
                    }

                    additionalProperties.put(fieldName, reader.readUntyped());
                }
            }
            deserializedAzureDataLakeStoreWriteSettings.withAdditionalProperties(additionalProperties);

            return deserializedAzureDataLakeStoreWriteSettings;
        });
    }
}
