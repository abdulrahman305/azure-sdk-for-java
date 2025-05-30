// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * ApplyRecoveryPoint input specific to HyperVReplicaAzure provider.
 */
@Fluent
public final class HyperVReplicaAzureApplyRecoveryPointInput extends ApplyRecoveryPointProviderSpecificInput {
    /*
     * The class type.
     */
    private String instanceType = "HyperVReplicaAzure";

    /*
     * The primary kek certificate pfx.
     */
    private String primaryKekCertificatePfx;

    /*
     * The secondary kek certificate pfx.
     */
    private String secondaryKekCertificatePfx;

    /**
     * Creates an instance of HyperVReplicaAzureApplyRecoveryPointInput class.
     */
    public HyperVReplicaAzureApplyRecoveryPointInput() {
    }

    /**
     * Get the instanceType property: The class type.
     * 
     * @return the instanceType value.
     */
    @Override
    public String instanceType() {
        return this.instanceType;
    }

    /**
     * Get the primaryKekCertificatePfx property: The primary kek certificate pfx.
     * 
     * @return the primaryKekCertificatePfx value.
     */
    public String primaryKekCertificatePfx() {
        return this.primaryKekCertificatePfx;
    }

    /**
     * Set the primaryKekCertificatePfx property: The primary kek certificate pfx.
     * 
     * @param primaryKekCertificatePfx the primaryKekCertificatePfx value to set.
     * @return the HyperVReplicaAzureApplyRecoveryPointInput object itself.
     */
    public HyperVReplicaAzureApplyRecoveryPointInput withPrimaryKekCertificatePfx(String primaryKekCertificatePfx) {
        this.primaryKekCertificatePfx = primaryKekCertificatePfx;
        return this;
    }

    /**
     * Get the secondaryKekCertificatePfx property: The secondary kek certificate pfx.
     * 
     * @return the secondaryKekCertificatePfx value.
     */
    public String secondaryKekCertificatePfx() {
        return this.secondaryKekCertificatePfx;
    }

    /**
     * Set the secondaryKekCertificatePfx property: The secondary kek certificate pfx.
     * 
     * @param secondaryKekCertificatePfx the secondaryKekCertificatePfx value to set.
     * @return the HyperVReplicaAzureApplyRecoveryPointInput object itself.
     */
    public HyperVReplicaAzureApplyRecoveryPointInput withSecondaryKekCertificatePfx(String secondaryKekCertificatePfx) {
        this.secondaryKekCertificatePfx = secondaryKekCertificatePfx;
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
        jsonWriter.writeStringField("instanceType", this.instanceType);
        jsonWriter.writeStringField("primaryKekCertificatePfx", this.primaryKekCertificatePfx);
        jsonWriter.writeStringField("secondaryKekCertificatePfx", this.secondaryKekCertificatePfx);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of HyperVReplicaAzureApplyRecoveryPointInput from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of HyperVReplicaAzureApplyRecoveryPointInput if the JsonReader was pointing to an instance of
     * it, or null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the HyperVReplicaAzureApplyRecoveryPointInput.
     */
    public static HyperVReplicaAzureApplyRecoveryPointInput fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            HyperVReplicaAzureApplyRecoveryPointInput deserializedHyperVReplicaAzureApplyRecoveryPointInput
                = new HyperVReplicaAzureApplyRecoveryPointInput();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("instanceType".equals(fieldName)) {
                    deserializedHyperVReplicaAzureApplyRecoveryPointInput.instanceType = reader.getString();
                } else if ("primaryKekCertificatePfx".equals(fieldName)) {
                    deserializedHyperVReplicaAzureApplyRecoveryPointInput.primaryKekCertificatePfx = reader.getString();
                } else if ("secondaryKekCertificatePfx".equals(fieldName)) {
                    deserializedHyperVReplicaAzureApplyRecoveryPointInput.secondaryKekCertificatePfx
                        = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedHyperVReplicaAzureApplyRecoveryPointInput;
        });
    }
}
