// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.kubernetesconfiguration.fluxconfigurations.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Array of ConfigMaps/Secrets from which the variables are substituted for this Kustomization.
 */
@Fluent
public final class SubstituteFromDefinition implements JsonSerializable<SubstituteFromDefinition> {
    /*
     * Define whether it is ConfigMap or Secret that holds the variables to be used in substitution.
     */
    private String kind;

    /*
     * Name of the ConfigMap/Secret that holds the variables to be used in substitution.
     */
    private String name;

    /*
     * Set to True to proceed without ConfigMap/Secret, if it is not present.
     */
    private Boolean optional;

    /**
     * Creates an instance of SubstituteFromDefinition class.
     */
    public SubstituteFromDefinition() {
    }

    /**
     * Get the kind property: Define whether it is ConfigMap or Secret that holds the variables to be used in
     * substitution.
     * 
     * @return the kind value.
     */
    public String kind() {
        return this.kind;
    }

    /**
     * Set the kind property: Define whether it is ConfigMap or Secret that holds the variables to be used in
     * substitution.
     * 
     * @param kind the kind value to set.
     * @return the SubstituteFromDefinition object itself.
     */
    public SubstituteFromDefinition withKind(String kind) {
        this.kind = kind;
        return this;
    }

    /**
     * Get the name property: Name of the ConfigMap/Secret that holds the variables to be used in substitution.
     * 
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: Name of the ConfigMap/Secret that holds the variables to be used in substitution.
     * 
     * @param name the name value to set.
     * @return the SubstituteFromDefinition object itself.
     */
    public SubstituteFromDefinition withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the optional property: Set to True to proceed without ConfigMap/Secret, if it is not present.
     * 
     * @return the optional value.
     */
    public Boolean optional() {
        return this.optional;
    }

    /**
     * Set the optional property: Set to True to proceed without ConfigMap/Secret, if it is not present.
     * 
     * @param optional the optional value to set.
     * @return the SubstituteFromDefinition object itself.
     */
    public SubstituteFromDefinition withOptional(Boolean optional) {
        this.optional = optional;
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
        jsonWriter.writeStringField("kind", this.kind);
        jsonWriter.writeStringField("name", this.name);
        jsonWriter.writeBooleanField("optional", this.optional);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of SubstituteFromDefinition from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of SubstituteFromDefinition if the JsonReader was pointing to an instance of it, or null if
     * it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the SubstituteFromDefinition.
     */
    public static SubstituteFromDefinition fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            SubstituteFromDefinition deserializedSubstituteFromDefinition = new SubstituteFromDefinition();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("kind".equals(fieldName)) {
                    deserializedSubstituteFromDefinition.kind = reader.getString();
                } else if ("name".equals(fieldName)) {
                    deserializedSubstituteFromDefinition.name = reader.getString();
                } else if ("optional".equals(fieldName)) {
                    deserializedSubstituteFromDefinition.optional = reader.getNullable(JsonReader::getBoolean);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedSubstituteFromDefinition;
        });
    }
}
