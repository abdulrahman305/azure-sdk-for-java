// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databox.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;

/**
 * The secrets related to a databox job.
 */
@Fluent
public final class DataboxJobSecrets extends JobSecrets {
    /*
     * Used to indicate what type of job secrets object.
     */
    private ClassDiscriminator jobSecretsType = ClassDiscriminator.DATA_BOX;

    /*
     * Contains the list of secret objects for a job.
     */
    private List<DataBoxSecret> podSecrets;

    /**
     * Creates an instance of DataboxJobSecrets class.
     */
    public DataboxJobSecrets() {
    }

    /**
     * Get the jobSecretsType property: Used to indicate what type of job secrets object.
     * 
     * @return the jobSecretsType value.
     */
    @Override
    public ClassDiscriminator jobSecretsType() {
        return this.jobSecretsType;
    }

    /**
     * Get the podSecrets property: Contains the list of secret objects for a job.
     * 
     * @return the podSecrets value.
     */
    public List<DataBoxSecret> podSecrets() {
        return this.podSecrets;
    }

    /**
     * Set the podSecrets property: Contains the list of secret objects for a job.
     * 
     * @param podSecrets the podSecrets value to set.
     * @return the DataboxJobSecrets object itself.
     */
    public DataboxJobSecrets withPodSecrets(List<DataBoxSecret> podSecrets) {
        this.podSecrets = podSecrets;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        if (podSecrets() != null) {
            podSecrets().forEach(e -> e.validate());
        }
        if (dcAccessSecurityCode() != null) {
            dcAccessSecurityCode().validate();
        }
        if (error() != null) {
            error().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("jobSecretsType",
            this.jobSecretsType == null ? null : this.jobSecretsType.toString());
        jsonWriter.writeArrayField("podSecrets", this.podSecrets, (writer, element) -> writer.writeJson(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of DataboxJobSecrets from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of DataboxJobSecrets if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the DataboxJobSecrets.
     */
    public static DataboxJobSecrets fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            DataboxJobSecrets deserializedDataboxJobSecrets = new DataboxJobSecrets();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("dcAccessSecurityCode".equals(fieldName)) {
                    deserializedDataboxJobSecrets.withDcAccessSecurityCode(DcAccessSecurityCode.fromJson(reader));
                } else if ("error".equals(fieldName)) {
                    deserializedDataboxJobSecrets.withError(CloudError.fromJson(reader));
                } else if ("jobSecretsType".equals(fieldName)) {
                    deserializedDataboxJobSecrets.jobSecretsType = ClassDiscriminator.fromString(reader.getString());
                } else if ("podSecrets".equals(fieldName)) {
                    List<DataBoxSecret> podSecrets = reader.readArray(reader1 -> DataBoxSecret.fromJson(reader1));
                    deserializedDataboxJobSecrets.podSecrets = podSecrets;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedDataboxJobSecrets;
        });
    }
}
