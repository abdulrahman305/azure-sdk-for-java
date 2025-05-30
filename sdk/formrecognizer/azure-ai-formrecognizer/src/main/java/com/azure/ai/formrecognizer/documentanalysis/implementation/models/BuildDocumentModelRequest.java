// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.formrecognizer.documentanalysis.implementation.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Generated;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Request body to build a new custom document model.
 */
@Fluent
public final class BuildDocumentModelRequest implements JsonSerializable<BuildDocumentModelRequest> {
    /*
     * Unique document model name.
     */
    @Generated
    private final String modelId;

    /*
     * Document model description.
     */
    @Generated
    private String description;

    /*
     * Custom document model build mode.
     */
    @Generated
    private final DocumentBuildMode buildMode;

    /*
     * Azure Blob Storage location containing the training data. Either azureBlobSource or azureBlobFileListSource must
     * be specified.
     */
    @Generated
    private AzureBlobContentSource azureBlobSource;

    /*
     * Azure Blob Storage file list specifying the training data. Either azureBlobSource or azureBlobFileListSource must
     * be specified.
     */
    @Generated
    private AzureBlobFileListContentSource azureBlobFileListSource;

    /*
     * List of key-value tag attributes associated with the document model.
     */
    @Generated
    private Map<String, String> tags;

    /**
     * Creates an instance of BuildDocumentModelRequest class.
     * 
     * @param modelId the modelId value to set.
     * @param buildMode the buildMode value to set.
     */
    @Generated
    public BuildDocumentModelRequest(String modelId, DocumentBuildMode buildMode) {
        this.modelId = modelId;
        this.buildMode = buildMode;
    }

    /**
     * Get the modelId property: Unique document model name.
     * 
     * @return the modelId value.
     */
    @Generated
    public String getModelId() {
        return this.modelId;
    }

    /**
     * Get the description property: Document model description.
     * 
     * @return the description value.
     */
    @Generated
    public String getDescription() {
        return this.description;
    }

    /**
     * Set the description property: Document model description.
     * 
     * @param description the description value to set.
     * @return the BuildDocumentModelRequest object itself.
     */
    @Generated
    public BuildDocumentModelRequest setDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get the buildMode property: Custom document model build mode.
     * 
     * @return the buildMode value.
     */
    @Generated
    public DocumentBuildMode getBuildMode() {
        return this.buildMode;
    }

    /**
     * Get the azureBlobSource property: Azure Blob Storage location containing the training data. Either
     * azureBlobSource or azureBlobFileListSource must be specified.
     * 
     * @return the azureBlobSource value.
     */
    @Generated
    public AzureBlobContentSource getAzureBlobSource() {
        return this.azureBlobSource;
    }

    /**
     * Set the azureBlobSource property: Azure Blob Storage location containing the training data. Either
     * azureBlobSource or azureBlobFileListSource must be specified.
     * 
     * @param azureBlobSource the azureBlobSource value to set.
     * @return the BuildDocumentModelRequest object itself.
     */
    @Generated
    public BuildDocumentModelRequest setAzureBlobSource(AzureBlobContentSource azureBlobSource) {
        this.azureBlobSource = azureBlobSource;
        return this;
    }

    /**
     * Get the azureBlobFileListSource property: Azure Blob Storage file list specifying the training data. Either
     * azureBlobSource or azureBlobFileListSource must be specified.
     * 
     * @return the azureBlobFileListSource value.
     */
    @Generated
    public AzureBlobFileListContentSource getAzureBlobFileListSource() {
        return this.azureBlobFileListSource;
    }

    /**
     * Set the azureBlobFileListSource property: Azure Blob Storage file list specifying the training data. Either
     * azureBlobSource or azureBlobFileListSource must be specified.
     * 
     * @param azureBlobFileListSource the azureBlobFileListSource value to set.
     * @return the BuildDocumentModelRequest object itself.
     */
    @Generated
    public BuildDocumentModelRequest
        setAzureBlobFileListSource(AzureBlobFileListContentSource azureBlobFileListSource) {
        this.azureBlobFileListSource = azureBlobFileListSource;
        return this;
    }

    /**
     * Get the tags property: List of key-value tag attributes associated with the document model.
     * 
     * @return the tags value.
     */
    @Generated
    public Map<String, String> getTags() {
        return this.tags;
    }

    /**
     * Set the tags property: List of key-value tag attributes associated with the document model.
     * 
     * @param tags the tags value to set.
     * @return the BuildDocumentModelRequest object itself.
     */
    @Generated
    public BuildDocumentModelRequest setTags(Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("modelId", this.modelId);
        jsonWriter.writeStringField("buildMode", this.buildMode == null ? null : this.buildMode.toString());
        jsonWriter.writeStringField("description", this.description);
        jsonWriter.writeJsonField("azureBlobSource", this.azureBlobSource);
        jsonWriter.writeJsonField("azureBlobFileListSource", this.azureBlobFileListSource);
        jsonWriter.writeMapField("tags", this.tags, (writer, element) -> writer.writeString(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of BuildDocumentModelRequest from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of BuildDocumentModelRequest if the JsonReader was pointing to an instance of it, or null if
     * it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the BuildDocumentModelRequest.
     */
    @Generated
    public static BuildDocumentModelRequest fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            boolean modelIdFound = false;
            String modelId = null;
            boolean buildModeFound = false;
            DocumentBuildMode buildMode = null;
            String description = null;
            AzureBlobContentSource azureBlobSource = null;
            AzureBlobFileListContentSource azureBlobFileListSource = null;
            Map<String, String> tags = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("modelId".equals(fieldName)) {
                    modelId = reader.getString();
                    modelIdFound = true;
                } else if ("buildMode".equals(fieldName)) {
                    buildMode = DocumentBuildMode.fromString(reader.getString());
                    buildModeFound = true;
                } else if ("description".equals(fieldName)) {
                    description = reader.getString();
                } else if ("azureBlobSource".equals(fieldName)) {
                    azureBlobSource = AzureBlobContentSource.fromJson(reader);
                } else if ("azureBlobFileListSource".equals(fieldName)) {
                    azureBlobFileListSource = AzureBlobFileListContentSource.fromJson(reader);
                } else if ("tags".equals(fieldName)) {
                    tags = reader.readMap(reader1 -> reader1.getString());
                } else {
                    reader.skipChildren();
                }
            }
            if (modelIdFound && buildModeFound) {
                BuildDocumentModelRequest deserializedBuildDocumentModelRequest
                    = new BuildDocumentModelRequest(modelId, buildMode);
                deserializedBuildDocumentModelRequest.description = description;
                deserializedBuildDocumentModelRequest.azureBlobSource = azureBlobSource;
                deserializedBuildDocumentModelRequest.azureBlobFileListSource = azureBlobFileListSource;
                deserializedBuildDocumentModelRequest.tags = tags;

                return deserializedBuildDocumentModelRequest;
            }
            List<String> missingProperties = new ArrayList<>();
            if (!modelIdFound) {
                missingProperties.add("modelId");
            }
            if (!buildModeFound) {
                missingProperties.add("buildMode");
            }

            throw new IllegalStateException(
                "Missing required property/properties: " + String.join(", ", missingProperties));
        });
    }
}
