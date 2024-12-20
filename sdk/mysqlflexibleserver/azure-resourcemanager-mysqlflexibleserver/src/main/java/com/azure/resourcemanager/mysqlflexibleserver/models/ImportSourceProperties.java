// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mysqlflexibleserver.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Import source related properties.
 */
@Fluent
public final class ImportSourceProperties implements JsonSerializable<ImportSourceProperties> {
    /*
     * Storage type of import source.
     */
    private ImportSourceStorageType storageType;

    /*
     * Uri of the import source storage.
     */
    private String storageUrl;

    /*
     * Sas token for accessing source storage. Read and list permissions are required for sas token.
     */
    private String sasToken;

    /*
     * Relative path of data directory in storage.
     */
    private String dataDirPath;

    /**
     * Creates an instance of ImportSourceProperties class.
     */
    public ImportSourceProperties() {
    }

    /**
     * Get the storageType property: Storage type of import source.
     * 
     * @return the storageType value.
     */
    public ImportSourceStorageType storageType() {
        return this.storageType;
    }

    /**
     * Set the storageType property: Storage type of import source.
     * 
     * @param storageType the storageType value to set.
     * @return the ImportSourceProperties object itself.
     */
    public ImportSourceProperties withStorageType(ImportSourceStorageType storageType) {
        this.storageType = storageType;
        return this;
    }

    /**
     * Get the storageUrl property: Uri of the import source storage.
     * 
     * @return the storageUrl value.
     */
    public String storageUrl() {
        return this.storageUrl;
    }

    /**
     * Set the storageUrl property: Uri of the import source storage.
     * 
     * @param storageUrl the storageUrl value to set.
     * @return the ImportSourceProperties object itself.
     */
    public ImportSourceProperties withStorageUrl(String storageUrl) {
        this.storageUrl = storageUrl;
        return this;
    }

    /**
     * Get the sasToken property: Sas token for accessing source storage. Read and list permissions are required for sas
     * token.
     * 
     * @return the sasToken value.
     */
    public String sasToken() {
        return this.sasToken;
    }

    /**
     * Set the sasToken property: Sas token for accessing source storage. Read and list permissions are required for sas
     * token.
     * 
     * @param sasToken the sasToken value to set.
     * @return the ImportSourceProperties object itself.
     */
    public ImportSourceProperties withSasToken(String sasToken) {
        this.sasToken = sasToken;
        return this;
    }

    /**
     * Get the dataDirPath property: Relative path of data directory in storage.
     * 
     * @return the dataDirPath value.
     */
    public String dataDirPath() {
        return this.dataDirPath;
    }

    /**
     * Set the dataDirPath property: Relative path of data directory in storage.
     * 
     * @param dataDirPath the dataDirPath value to set.
     * @return the ImportSourceProperties object itself.
     */
    public ImportSourceProperties withDataDirPath(String dataDirPath) {
        this.dataDirPath = dataDirPath;
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
        jsonWriter.writeStringField("storageType", this.storageType == null ? null : this.storageType.toString());
        jsonWriter.writeStringField("storageUrl", this.storageUrl);
        jsonWriter.writeStringField("sasToken", this.sasToken);
        jsonWriter.writeStringField("dataDirPath", this.dataDirPath);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ImportSourceProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ImportSourceProperties if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IOException If an error occurs while reading the ImportSourceProperties.
     */
    public static ImportSourceProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ImportSourceProperties deserializedImportSourceProperties = new ImportSourceProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("storageType".equals(fieldName)) {
                    deserializedImportSourceProperties.storageType
                        = ImportSourceStorageType.fromString(reader.getString());
                } else if ("storageUrl".equals(fieldName)) {
                    deserializedImportSourceProperties.storageUrl = reader.getString();
                } else if ("sasToken".equals(fieldName)) {
                    deserializedImportSourceProperties.sasToken = reader.getString();
                } else if ("dataDirPath".equals(fieldName)) {
                    deserializedImportSourceProperties.dataDirPath = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedImportSourceProperties;
        });
    }
}
