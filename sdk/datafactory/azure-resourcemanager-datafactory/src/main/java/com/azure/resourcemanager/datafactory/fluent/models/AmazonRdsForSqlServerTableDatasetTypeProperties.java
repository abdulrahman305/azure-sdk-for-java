// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * The Amazon RDS for SQL Server dataset properties.
 */
@Fluent
public final class AmazonRdsForSqlServerTableDatasetTypeProperties
    implements JsonSerializable<AmazonRdsForSqlServerTableDatasetTypeProperties> {
    /*
     * The schema name of the SQL Server dataset. Type: string (or Expression with resultType string).
     */
    private Object schema;

    /*
     * The table name of the SQL Server dataset. Type: string (or Expression with resultType string).
     */
    private Object table;

    /**
     * Creates an instance of AmazonRdsForSqlServerTableDatasetTypeProperties class.
     */
    public AmazonRdsForSqlServerTableDatasetTypeProperties() {
    }

    /**
     * Get the schema property: The schema name of the SQL Server dataset. Type: string (or Expression with resultType
     * string).
     * 
     * @return the schema value.
     */
    public Object schema() {
        return this.schema;
    }

    /**
     * Set the schema property: The schema name of the SQL Server dataset. Type: string (or Expression with resultType
     * string).
     * 
     * @param schema the schema value to set.
     * @return the AmazonRdsForSqlServerTableDatasetTypeProperties object itself.
     */
    public AmazonRdsForSqlServerTableDatasetTypeProperties withSchema(Object schema) {
        this.schema = schema;
        return this;
    }

    /**
     * Get the table property: The table name of the SQL Server dataset. Type: string (or Expression with resultType
     * string).
     * 
     * @return the table value.
     */
    public Object table() {
        return this.table;
    }

    /**
     * Set the table property: The table name of the SQL Server dataset. Type: string (or Expression with resultType
     * string).
     * 
     * @param table the table value to set.
     * @return the AmazonRdsForSqlServerTableDatasetTypeProperties object itself.
     */
    public AmazonRdsForSqlServerTableDatasetTypeProperties withTable(Object table) {
        this.table = table;
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
        if (this.schema != null) {
            jsonWriter.writeUntypedField("schema", this.schema);
        }
        if (this.table != null) {
            jsonWriter.writeUntypedField("table", this.table);
        }
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of AmazonRdsForSqlServerTableDatasetTypeProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of AmazonRdsForSqlServerTableDatasetTypeProperties if the JsonReader was pointing to an
     * instance of it, or null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the AmazonRdsForSqlServerTableDatasetTypeProperties.
     */
    public static AmazonRdsForSqlServerTableDatasetTypeProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            AmazonRdsForSqlServerTableDatasetTypeProperties deserializedAmazonRdsForSqlServerTableDatasetTypeProperties
                = new AmazonRdsForSqlServerTableDatasetTypeProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("schema".equals(fieldName)) {
                    deserializedAmazonRdsForSqlServerTableDatasetTypeProperties.schema = reader.readUntyped();
                } else if ("table".equals(fieldName)) {
                    deserializedAmazonRdsForSqlServerTableDatasetTypeProperties.table = reader.readUntyped();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedAmazonRdsForSqlServerTableDatasetTypeProperties;
        });
    }
}
