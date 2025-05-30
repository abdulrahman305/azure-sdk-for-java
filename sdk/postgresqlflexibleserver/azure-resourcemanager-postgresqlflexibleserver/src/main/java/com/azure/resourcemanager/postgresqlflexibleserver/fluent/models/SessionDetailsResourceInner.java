// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.postgresqlflexibleserver.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Session details properties.
 */
@Fluent
public final class SessionDetailsResourceInner implements JsonSerializable<SessionDetailsResourceInner> {
    /*
     * Iteration id.
     */
    private String iterationId;

    /*
     * Session id.
     */
    private String sessionId;

    /*
     * Applied configuration for the iteration.
     */
    private String appliedConfiguration;

    /*
     * Iteration start time.
     */
    private String iterationStartTime;

    /*
     * The aqr for the iteration.
     */
    private String averageQueryRuntimeMs;

    /*
     * The tps for the iteration.
     */
    private String transactionsPerSecond;

    /**
     * Creates an instance of SessionDetailsResourceInner class.
     */
    public SessionDetailsResourceInner() {
    }

    /**
     * Get the iterationId property: Iteration id.
     * 
     * @return the iterationId value.
     */
    public String iterationId() {
        return this.iterationId;
    }

    /**
     * Set the iterationId property: Iteration id.
     * 
     * @param iterationId the iterationId value to set.
     * @return the SessionDetailsResourceInner object itself.
     */
    public SessionDetailsResourceInner withIterationId(String iterationId) {
        this.iterationId = iterationId;
        return this;
    }

    /**
     * Get the sessionId property: Session id.
     * 
     * @return the sessionId value.
     */
    public String sessionId() {
        return this.sessionId;
    }

    /**
     * Set the sessionId property: Session id.
     * 
     * @param sessionId the sessionId value to set.
     * @return the SessionDetailsResourceInner object itself.
     */
    public SessionDetailsResourceInner withSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }

    /**
     * Get the appliedConfiguration property: Applied configuration for the iteration.
     * 
     * @return the appliedConfiguration value.
     */
    public String appliedConfiguration() {
        return this.appliedConfiguration;
    }

    /**
     * Set the appliedConfiguration property: Applied configuration for the iteration.
     * 
     * @param appliedConfiguration the appliedConfiguration value to set.
     * @return the SessionDetailsResourceInner object itself.
     */
    public SessionDetailsResourceInner withAppliedConfiguration(String appliedConfiguration) {
        this.appliedConfiguration = appliedConfiguration;
        return this;
    }

    /**
     * Get the iterationStartTime property: Iteration start time.
     * 
     * @return the iterationStartTime value.
     */
    public String iterationStartTime() {
        return this.iterationStartTime;
    }

    /**
     * Set the iterationStartTime property: Iteration start time.
     * 
     * @param iterationStartTime the iterationStartTime value to set.
     * @return the SessionDetailsResourceInner object itself.
     */
    public SessionDetailsResourceInner withIterationStartTime(String iterationStartTime) {
        this.iterationStartTime = iterationStartTime;
        return this;
    }

    /**
     * Get the averageQueryRuntimeMs property: The aqr for the iteration.
     * 
     * @return the averageQueryRuntimeMs value.
     */
    public String averageQueryRuntimeMs() {
        return this.averageQueryRuntimeMs;
    }

    /**
     * Set the averageQueryRuntimeMs property: The aqr for the iteration.
     * 
     * @param averageQueryRuntimeMs the averageQueryRuntimeMs value to set.
     * @return the SessionDetailsResourceInner object itself.
     */
    public SessionDetailsResourceInner withAverageQueryRuntimeMs(String averageQueryRuntimeMs) {
        this.averageQueryRuntimeMs = averageQueryRuntimeMs;
        return this;
    }

    /**
     * Get the transactionsPerSecond property: The tps for the iteration.
     * 
     * @return the transactionsPerSecond value.
     */
    public String transactionsPerSecond() {
        return this.transactionsPerSecond;
    }

    /**
     * Set the transactionsPerSecond property: The tps for the iteration.
     * 
     * @param transactionsPerSecond the transactionsPerSecond value to set.
     * @return the SessionDetailsResourceInner object itself.
     */
    public SessionDetailsResourceInner withTransactionsPerSecond(String transactionsPerSecond) {
        this.transactionsPerSecond = transactionsPerSecond;
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
        jsonWriter.writeStringField("iterationId", this.iterationId);
        jsonWriter.writeStringField("sessionId", this.sessionId);
        jsonWriter.writeStringField("appliedConfiguration", this.appliedConfiguration);
        jsonWriter.writeStringField("iterationStartTime", this.iterationStartTime);
        jsonWriter.writeStringField("averageQueryRuntimeMs", this.averageQueryRuntimeMs);
        jsonWriter.writeStringField("transactionsPerSecond", this.transactionsPerSecond);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of SessionDetailsResourceInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of SessionDetailsResourceInner if the JsonReader was pointing to an instance of it, or null
     * if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the SessionDetailsResourceInner.
     */
    public static SessionDetailsResourceInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            SessionDetailsResourceInner deserializedSessionDetailsResourceInner = new SessionDetailsResourceInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("iterationId".equals(fieldName)) {
                    deserializedSessionDetailsResourceInner.iterationId = reader.getString();
                } else if ("sessionId".equals(fieldName)) {
                    deserializedSessionDetailsResourceInner.sessionId = reader.getString();
                } else if ("appliedConfiguration".equals(fieldName)) {
                    deserializedSessionDetailsResourceInner.appliedConfiguration = reader.getString();
                } else if ("iterationStartTime".equals(fieldName)) {
                    deserializedSessionDetailsResourceInner.iterationStartTime = reader.getString();
                } else if ("averageQueryRuntimeMs".equals(fieldName)) {
                    deserializedSessionDetailsResourceInner.averageQueryRuntimeMs = reader.getString();
                } else if ("transactionsPerSecond".equals(fieldName)) {
                    deserializedSessionDetailsResourceInner.transactionsPerSecond = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedSessionDetailsResourceInner;
        });
    }
}
