// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datamigration.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.exception.ManagementError;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;

/**
 * Properties for the task that validates connection to SQL Server and also validates source server requirements.
 */
@Fluent
public final class ConnectToSourceSqlServerTaskProperties extends ProjectTaskProperties {
    /*
     * Task type.
     */
    private String taskType = "ConnectToSource.SqlServer";

    /*
     * Task input
     */
    private ConnectToSourceSqlServerTaskInput input;

    /*
     * Task output. This is ignored if submitted.
     */
    private List<ConnectToSourceSqlServerTaskOutput> output;

    /*
     * Array of command properties.
     */
    private List<CommandProperties> commands;

    /*
     * The state of the task. This is ignored if submitted.
     */
    private TaskState state;

    /*
     * Array of errors. This is ignored if submitted.
     */
    private List<ManagementError> errors;

    /**
     * Creates an instance of ConnectToSourceSqlServerTaskProperties class.
     */
    public ConnectToSourceSqlServerTaskProperties() {
    }

    /**
     * Get the taskType property: Task type.
     * 
     * @return the taskType value.
     */
    @Override
    public String taskType() {
        return this.taskType;
    }

    /**
     * Get the input property: Task input.
     * 
     * @return the input value.
     */
    public ConnectToSourceSqlServerTaskInput input() {
        return this.input;
    }

    /**
     * Set the input property: Task input.
     * 
     * @param input the input value to set.
     * @return the ConnectToSourceSqlServerTaskProperties object itself.
     */
    public ConnectToSourceSqlServerTaskProperties withInput(ConnectToSourceSqlServerTaskInput input) {
        this.input = input;
        return this;
    }

    /**
     * Get the output property: Task output. This is ignored if submitted.
     * 
     * @return the output value.
     */
    public List<ConnectToSourceSqlServerTaskOutput> output() {
        return this.output;
    }

    /**
     * Get the commands property: Array of command properties.
     * 
     * @return the commands value.
     */
    @Override
    public List<CommandProperties> commands() {
        return this.commands;
    }

    /**
     * Get the state property: The state of the task. This is ignored if submitted.
     * 
     * @return the state value.
     */
    @Override
    public TaskState state() {
        return this.state;
    }

    /**
     * Get the errors property: Array of errors. This is ignored if submitted.
     * 
     * @return the errors value.
     */
    @Override
    public List<ManagementError> errors() {
        return this.errors;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        if (input() != null) {
            input().validate();
        }
        if (output() != null) {
            output().forEach(e -> e.validate());
        }
        if (commands() != null) {
            commands().forEach(e -> e.validate());
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("taskType", this.taskType);
        jsonWriter.writeJsonField("input", this.input);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ConnectToSourceSqlServerTaskProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ConnectToSourceSqlServerTaskProperties if the JsonReader was pointing to an instance of
     * it, or null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the ConnectToSourceSqlServerTaskProperties.
     */
    public static ConnectToSourceSqlServerTaskProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ConnectToSourceSqlServerTaskProperties deserializedConnectToSourceSqlServerTaskProperties
                = new ConnectToSourceSqlServerTaskProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("errors".equals(fieldName)) {
                    List<ManagementError> errors = reader.readArray(reader1 -> ManagementError.fromJson(reader1));
                    deserializedConnectToSourceSqlServerTaskProperties.errors = errors;
                } else if ("state".equals(fieldName)) {
                    deserializedConnectToSourceSqlServerTaskProperties.state = TaskState.fromString(reader.getString());
                } else if ("commands".equals(fieldName)) {
                    List<CommandProperties> commands = reader.readArray(reader1 -> CommandProperties.fromJson(reader1));
                    deserializedConnectToSourceSqlServerTaskProperties.commands = commands;
                } else if ("taskType".equals(fieldName)) {
                    deserializedConnectToSourceSqlServerTaskProperties.taskType = reader.getString();
                } else if ("input".equals(fieldName)) {
                    deserializedConnectToSourceSqlServerTaskProperties.input
                        = ConnectToSourceSqlServerTaskInput.fromJson(reader);
                } else if ("output".equals(fieldName)) {
                    List<ConnectToSourceSqlServerTaskOutput> output
                        = reader.readArray(reader1 -> ConnectToSourceSqlServerTaskOutput.fromJson(reader1));
                    deserializedConnectToSourceSqlServerTaskProperties.output = output;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedConnectToSourceSqlServerTaskProperties;
        });
    }
}
