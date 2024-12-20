// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.streamanalytics.fluent.models;

import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.streamanalytics.models.QueryCompilationError;
import java.io.IOException;
import java.util.List;

/**
 * The result of the query compilation request.
 */
@Immutable
public final class QueryCompilationResultInner implements JsonSerializable<QueryCompilationResultInner> {
    /*
     * Error messages produced by the compiler.
     */
    private List<QueryCompilationError> errors;

    /*
     * Warning messages produced by the compiler.
     */
    private List<String> warnings;

    /*
     * All input names used by the query.
     */
    private List<String> inputs;

    /*
     * All output names used by the query.
     */
    private List<String> outputs;

    /*
     * All function names used by the query.
     */
    private List<String> functions;

    /**
     * Creates an instance of QueryCompilationResultInner class.
     */
    public QueryCompilationResultInner() {
    }

    /**
     * Get the errors property: Error messages produced by the compiler.
     * 
     * @return the errors value.
     */
    public List<QueryCompilationError> errors() {
        return this.errors;
    }

    /**
     * Get the warnings property: Warning messages produced by the compiler.
     * 
     * @return the warnings value.
     */
    public List<String> warnings() {
        return this.warnings;
    }

    /**
     * Get the inputs property: All input names used by the query.
     * 
     * @return the inputs value.
     */
    public List<String> inputs() {
        return this.inputs;
    }

    /**
     * Get the outputs property: All output names used by the query.
     * 
     * @return the outputs value.
     */
    public List<String> outputs() {
        return this.outputs;
    }

    /**
     * Get the functions property: All function names used by the query.
     * 
     * @return the functions value.
     */
    public List<String> functions() {
        return this.functions;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (errors() != null) {
            errors().forEach(e -> e.validate());
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of QueryCompilationResultInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of QueryCompilationResultInner if the JsonReader was pointing to an instance of it, or null
     * if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the QueryCompilationResultInner.
     */
    public static QueryCompilationResultInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            QueryCompilationResultInner deserializedQueryCompilationResultInner = new QueryCompilationResultInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("errors".equals(fieldName)) {
                    List<QueryCompilationError> errors
                        = reader.readArray(reader1 -> QueryCompilationError.fromJson(reader1));
                    deserializedQueryCompilationResultInner.errors = errors;
                } else if ("warnings".equals(fieldName)) {
                    List<String> warnings = reader.readArray(reader1 -> reader1.getString());
                    deserializedQueryCompilationResultInner.warnings = warnings;
                } else if ("inputs".equals(fieldName)) {
                    List<String> inputs = reader.readArray(reader1 -> reader1.getString());
                    deserializedQueryCompilationResultInner.inputs = inputs;
                } else if ("outputs".equals(fieldName)) {
                    List<String> outputs = reader.readArray(reader1 -> reader1.getString());
                    deserializedQueryCompilationResultInner.outputs = outputs;
                } else if ("functions".equals(fieldName)) {
                    List<String> functions = reader.readArray(reader1 -> reader1.getString());
                    deserializedQueryCompilationResultInner.functions = functions;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedQueryCompilationResultInner;
        });
    }
}
