// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.streamanalytics.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Describes an input column for the Azure Machine Learning Studio endpoint.
 */
@Fluent
public final class AzureMachineLearningStudioInputColumn
    implements JsonSerializable<AzureMachineLearningStudioInputColumn> {
    /*
     * The name of the input column.
     */
    private String name;

    /*
     * The (Azure Machine Learning supported) data type of the input column. A list of valid Azure Machine Learning data
     * types are described at https://msdn.microsoft.com/en-us/library/azure/dn905923.aspx .
     */
    private String dataType;

    /*
     * The zero based index of the function parameter this input maps to.
     */
    private Integer mapTo;

    /**
     * Creates an instance of AzureMachineLearningStudioInputColumn class.
     */
    public AzureMachineLearningStudioInputColumn() {
    }

    /**
     * Get the name property: The name of the input column.
     * 
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The name of the input column.
     * 
     * @param name the name value to set.
     * @return the AzureMachineLearningStudioInputColumn object itself.
     */
    public AzureMachineLearningStudioInputColumn withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the dataType property: The (Azure Machine Learning supported) data type of the input column. A list of valid
     * Azure Machine Learning data types are described at https://msdn.microsoft.com/en-us/library/azure/dn905923.aspx .
     * 
     * @return the dataType value.
     */
    public String dataType() {
        return this.dataType;
    }

    /**
     * Set the dataType property: The (Azure Machine Learning supported) data type of the input column. A list of valid
     * Azure Machine Learning data types are described at https://msdn.microsoft.com/en-us/library/azure/dn905923.aspx .
     * 
     * @param dataType the dataType value to set.
     * @return the AzureMachineLearningStudioInputColumn object itself.
     */
    public AzureMachineLearningStudioInputColumn withDataType(String dataType) {
        this.dataType = dataType;
        return this;
    }

    /**
     * Get the mapTo property: The zero based index of the function parameter this input maps to.
     * 
     * @return the mapTo value.
     */
    public Integer mapTo() {
        return this.mapTo;
    }

    /**
     * Set the mapTo property: The zero based index of the function parameter this input maps to.
     * 
     * @param mapTo the mapTo value to set.
     * @return the AzureMachineLearningStudioInputColumn object itself.
     */
    public AzureMachineLearningStudioInputColumn withMapTo(Integer mapTo) {
        this.mapTo = mapTo;
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
        jsonWriter.writeStringField("name", this.name);
        jsonWriter.writeStringField("dataType", this.dataType);
        jsonWriter.writeNumberField("mapTo", this.mapTo);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of AzureMachineLearningStudioInputColumn from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of AzureMachineLearningStudioInputColumn if the JsonReader was pointing to an instance of it,
     * or null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the AzureMachineLearningStudioInputColumn.
     */
    public static AzureMachineLearningStudioInputColumn fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            AzureMachineLearningStudioInputColumn deserializedAzureMachineLearningStudioInputColumn
                = new AzureMachineLearningStudioInputColumn();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("name".equals(fieldName)) {
                    deserializedAzureMachineLearningStudioInputColumn.name = reader.getString();
                } else if ("dataType".equals(fieldName)) {
                    deserializedAzureMachineLearningStudioInputColumn.dataType = reader.getString();
                } else if ("mapTo".equals(fieldName)) {
                    deserializedAzureMachineLearningStudioInputColumn.mapTo = reader.getNullable(JsonReader::getInt);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedAzureMachineLearningStudioInputColumn;
        });
    }
}
