// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cognitiveservices.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.CoreUtils;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Map;

/**
 * This connection type covers the AAD auth for any applicable Azure service.
 */
@Fluent
public final class AadAuthTypeConnectionProperties extends ConnectionPropertiesV2 {
    /*
     * Authentication type of the connection target
     */
    private ConnectionAuthType authType = ConnectionAuthType.AAD;

    /**
     * Creates an instance of AadAuthTypeConnectionProperties class.
     */
    public AadAuthTypeConnectionProperties() {
    }

    /**
     * Get the authType property: Authentication type of the connection target.
     * 
     * @return the authType value.
     */
    @Override
    public ConnectionAuthType authType() {
        return this.authType;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AadAuthTypeConnectionProperties withCategory(ConnectionCategory category) {
        super.withCategory(category);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AadAuthTypeConnectionProperties withError(String error) {
        super.withError(error);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AadAuthTypeConnectionProperties withExpiryTime(OffsetDateTime expiryTime) {
        super.withExpiryTime(expiryTime);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AadAuthTypeConnectionProperties withIsSharedToAll(Boolean isSharedToAll) {
        super.withIsSharedToAll(isSharedToAll);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AadAuthTypeConnectionProperties withMetadata(Map<String, String> metadata) {
        super.withMetadata(metadata);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AadAuthTypeConnectionProperties withPeRequirement(ManagedPERequirement peRequirement) {
        super.withPeRequirement(peRequirement);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AadAuthTypeConnectionProperties withPeStatus(ManagedPEStatus peStatus) {
        super.withPeStatus(peStatus);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AadAuthTypeConnectionProperties withSharedUserList(List<String> sharedUserList) {
        super.withSharedUserList(sharedUserList);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AadAuthTypeConnectionProperties withTarget(String target) {
        super.withTarget(target);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AadAuthTypeConnectionProperties withUseWorkspaceManagedIdentity(Boolean useWorkspaceManagedIdentity) {
        super.withUseWorkspaceManagedIdentity(useWorkspaceManagedIdentity);
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
        jsonWriter.writeStringField("category", category() == null ? null : category().toString());
        jsonWriter.writeStringField("error", error());
        jsonWriter.writeStringField("expiryTime",
            expiryTime() == null ? null : DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(expiryTime()));
        jsonWriter.writeBooleanField("isSharedToAll", isSharedToAll());
        jsonWriter.writeMapField("metadata", metadata(), (writer, element) -> writer.writeString(element));
        jsonWriter.writeStringField("peRequirement", peRequirement() == null ? null : peRequirement().toString());
        jsonWriter.writeStringField("peStatus", peStatus() == null ? null : peStatus().toString());
        jsonWriter.writeArrayField("sharedUserList", sharedUserList(),
            (writer, element) -> writer.writeString(element));
        jsonWriter.writeStringField("target", target());
        jsonWriter.writeBooleanField("useWorkspaceManagedIdentity", useWorkspaceManagedIdentity());
        jsonWriter.writeStringField("authType", this.authType == null ? null : this.authType.toString());
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of AadAuthTypeConnectionProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of AadAuthTypeConnectionProperties if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the AadAuthTypeConnectionProperties.
     */
    public static AadAuthTypeConnectionProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            AadAuthTypeConnectionProperties deserializedAadAuthTypeConnectionProperties
                = new AadAuthTypeConnectionProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("category".equals(fieldName)) {
                    deserializedAadAuthTypeConnectionProperties
                        .withCategory(ConnectionCategory.fromString(reader.getString()));
                } else if ("createdByWorkspaceArmId".equals(fieldName)) {
                    deserializedAadAuthTypeConnectionProperties.withCreatedByWorkspaceArmId(reader.getString());
                } else if ("error".equals(fieldName)) {
                    deserializedAadAuthTypeConnectionProperties.withError(reader.getString());
                } else if ("expiryTime".equals(fieldName)) {
                    deserializedAadAuthTypeConnectionProperties.withExpiryTime(reader
                        .getNullable(nonNullReader -> CoreUtils.parseBestOffsetDateTime(nonNullReader.getString())));
                } else if ("group".equals(fieldName)) {
                    deserializedAadAuthTypeConnectionProperties
                        .withGroup(ConnectionGroup.fromString(reader.getString()));
                } else if ("isSharedToAll".equals(fieldName)) {
                    deserializedAadAuthTypeConnectionProperties
                        .withIsSharedToAll(reader.getNullable(JsonReader::getBoolean));
                } else if ("metadata".equals(fieldName)) {
                    Map<String, String> metadata = reader.readMap(reader1 -> reader1.getString());
                    deserializedAadAuthTypeConnectionProperties.withMetadata(metadata);
                } else if ("peRequirement".equals(fieldName)) {
                    deserializedAadAuthTypeConnectionProperties
                        .withPeRequirement(ManagedPERequirement.fromString(reader.getString()));
                } else if ("peStatus".equals(fieldName)) {
                    deserializedAadAuthTypeConnectionProperties
                        .withPeStatus(ManagedPEStatus.fromString(reader.getString()));
                } else if ("sharedUserList".equals(fieldName)) {
                    List<String> sharedUserList = reader.readArray(reader1 -> reader1.getString());
                    deserializedAadAuthTypeConnectionProperties.withSharedUserList(sharedUserList);
                } else if ("target".equals(fieldName)) {
                    deserializedAadAuthTypeConnectionProperties.withTarget(reader.getString());
                } else if ("useWorkspaceManagedIdentity".equals(fieldName)) {
                    deserializedAadAuthTypeConnectionProperties
                        .withUseWorkspaceManagedIdentity(reader.getNullable(JsonReader::getBoolean));
                } else if ("authType".equals(fieldName)) {
                    deserializedAadAuthTypeConnectionProperties.authType
                        = ConnectionAuthType.fromString(reader.getString());
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedAadAuthTypeConnectionProperties;
        });
    }
}
