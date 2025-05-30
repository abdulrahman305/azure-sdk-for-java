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
 * A copy activity Xml source.
 */
@Fluent
public final class XmlSource extends CopySource {
    /*
     * Copy source type.
     */
    private String type = "XmlSource";

    /*
     * Xml store settings.
     */
    private StoreReadSettings storeSettings;

    /*
     * Xml format settings.
     */
    private XmlReadSettings formatSettings;

    /*
     * Specifies the additional columns to be added to source data. Type: array of objects(AdditionalColumns) (or
     * Expression with resultType array of objects).
     */
    private Object additionalColumns;

    /**
     * Creates an instance of XmlSource class.
     */
    public XmlSource() {
    }

    /**
     * Get the type property: Copy source type.
     * 
     * @return the type value.
     */
    @Override
    public String type() {
        return this.type;
    }

    /**
     * Get the storeSettings property: Xml store settings.
     * 
     * @return the storeSettings value.
     */
    public StoreReadSettings storeSettings() {
        return this.storeSettings;
    }

    /**
     * Set the storeSettings property: Xml store settings.
     * 
     * @param storeSettings the storeSettings value to set.
     * @return the XmlSource object itself.
     */
    public XmlSource withStoreSettings(StoreReadSettings storeSettings) {
        this.storeSettings = storeSettings;
        return this;
    }

    /**
     * Get the formatSettings property: Xml format settings.
     * 
     * @return the formatSettings value.
     */
    public XmlReadSettings formatSettings() {
        return this.formatSettings;
    }

    /**
     * Set the formatSettings property: Xml format settings.
     * 
     * @param formatSettings the formatSettings value to set.
     * @return the XmlSource object itself.
     */
    public XmlSource withFormatSettings(XmlReadSettings formatSettings) {
        this.formatSettings = formatSettings;
        return this;
    }

    /**
     * Get the additionalColumns property: Specifies the additional columns to be added to source data. Type: array of
     * objects(AdditionalColumns) (or Expression with resultType array of objects).
     * 
     * @return the additionalColumns value.
     */
    public Object additionalColumns() {
        return this.additionalColumns;
    }

    /**
     * Set the additionalColumns property: Specifies the additional columns to be added to source data. Type: array of
     * objects(AdditionalColumns) (or Expression with resultType array of objects).
     * 
     * @param additionalColumns the additionalColumns value to set.
     * @return the XmlSource object itself.
     */
    public XmlSource withAdditionalColumns(Object additionalColumns) {
        this.additionalColumns = additionalColumns;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public XmlSource withSourceRetryCount(Object sourceRetryCount) {
        super.withSourceRetryCount(sourceRetryCount);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public XmlSource withSourceRetryWait(Object sourceRetryWait) {
        super.withSourceRetryWait(sourceRetryWait);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public XmlSource withMaxConcurrentConnections(Object maxConcurrentConnections) {
        super.withMaxConcurrentConnections(maxConcurrentConnections);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public XmlSource withDisableMetricsCollection(Object disableMetricsCollection) {
        super.withDisableMetricsCollection(disableMetricsCollection);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        if (storeSettings() != null) {
            storeSettings().validate();
        }
        if (formatSettings() != null) {
            formatSettings().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        if (sourceRetryCount() != null) {
            jsonWriter.writeUntypedField("sourceRetryCount", sourceRetryCount());
        }
        if (sourceRetryWait() != null) {
            jsonWriter.writeUntypedField("sourceRetryWait", sourceRetryWait());
        }
        if (maxConcurrentConnections() != null) {
            jsonWriter.writeUntypedField("maxConcurrentConnections", maxConcurrentConnections());
        }
        if (disableMetricsCollection() != null) {
            jsonWriter.writeUntypedField("disableMetricsCollection", disableMetricsCollection());
        }
        jsonWriter.writeStringField("type", this.type);
        jsonWriter.writeJsonField("storeSettings", this.storeSettings);
        jsonWriter.writeJsonField("formatSettings", this.formatSettings);
        if (this.additionalColumns != null) {
            jsonWriter.writeUntypedField("additionalColumns", this.additionalColumns);
        }
        if (additionalProperties() != null) {
            for (Map.Entry<String, Object> additionalProperty : additionalProperties().entrySet()) {
                jsonWriter.writeUntypedField(additionalProperty.getKey(), additionalProperty.getValue());
            }
        }
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of XmlSource from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of XmlSource if the JsonReader was pointing to an instance of it, or null if it was pointing
     * to JSON null.
     * @throws IOException If an error occurs while reading the XmlSource.
     */
    public static XmlSource fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            XmlSource deserializedXmlSource = new XmlSource();
            Map<String, Object> additionalProperties = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("sourceRetryCount".equals(fieldName)) {
                    deserializedXmlSource.withSourceRetryCount(reader.readUntyped());
                } else if ("sourceRetryWait".equals(fieldName)) {
                    deserializedXmlSource.withSourceRetryWait(reader.readUntyped());
                } else if ("maxConcurrentConnections".equals(fieldName)) {
                    deserializedXmlSource.withMaxConcurrentConnections(reader.readUntyped());
                } else if ("disableMetricsCollection".equals(fieldName)) {
                    deserializedXmlSource.withDisableMetricsCollection(reader.readUntyped());
                } else if ("type".equals(fieldName)) {
                    deserializedXmlSource.type = reader.getString();
                } else if ("storeSettings".equals(fieldName)) {
                    deserializedXmlSource.storeSettings = StoreReadSettings.fromJson(reader);
                } else if ("formatSettings".equals(fieldName)) {
                    deserializedXmlSource.formatSettings = XmlReadSettings.fromJson(reader);
                } else if ("additionalColumns".equals(fieldName)) {
                    deserializedXmlSource.additionalColumns = reader.readUntyped();
                } else {
                    if (additionalProperties == null) {
                        additionalProperties = new LinkedHashMap<>();
                    }

                    additionalProperties.put(fieldName, reader.readUntyped());
                }
            }
            deserializedXmlSource.withAdditionalProperties(additionalProperties);

            return deserializedXmlSource;
        });
    }
}
