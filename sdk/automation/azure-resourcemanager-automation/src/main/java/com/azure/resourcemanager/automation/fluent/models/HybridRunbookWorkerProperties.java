// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.automation.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.CoreUtils;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.automation.models.WorkerType;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Definition of hybrid runbook worker property.
 */
@Fluent
public final class HybridRunbookWorkerProperties implements JsonSerializable<HybridRunbookWorkerProperties> {
    /*
     * Gets or sets the assigned machine IP address.
     */
    private String ip;

    /*
     * Gets or sets the registration time of the worker machine.
     */
    private OffsetDateTime registeredDateTime;

    /*
     * Last Heartbeat from the Worker
     */
    private OffsetDateTime lastSeenDateTime;

    /*
     * Azure Resource Manager Id for a virtual machine.
     */
    private String vmResourceId;

    /*
     * Type of the HybridWorker.
     */
    private WorkerType workerType;

    /*
     * Name of the HybridWorker.
     */
    private String workerName;

    /**
     * Creates an instance of HybridRunbookWorkerProperties class.
     */
    public HybridRunbookWorkerProperties() {
    }

    /**
     * Get the ip property: Gets or sets the assigned machine IP address.
     * 
     * @return the ip value.
     */
    public String ip() {
        return this.ip;
    }

    /**
     * Set the ip property: Gets or sets the assigned machine IP address.
     * 
     * @param ip the ip value to set.
     * @return the HybridRunbookWorkerProperties object itself.
     */
    public HybridRunbookWorkerProperties withIp(String ip) {
        this.ip = ip;
        return this;
    }

    /**
     * Get the registeredDateTime property: Gets or sets the registration time of the worker machine.
     * 
     * @return the registeredDateTime value.
     */
    public OffsetDateTime registeredDateTime() {
        return this.registeredDateTime;
    }

    /**
     * Set the registeredDateTime property: Gets or sets the registration time of the worker machine.
     * 
     * @param registeredDateTime the registeredDateTime value to set.
     * @return the HybridRunbookWorkerProperties object itself.
     */
    public HybridRunbookWorkerProperties withRegisteredDateTime(OffsetDateTime registeredDateTime) {
        this.registeredDateTime = registeredDateTime;
        return this;
    }

    /**
     * Get the lastSeenDateTime property: Last Heartbeat from the Worker.
     * 
     * @return the lastSeenDateTime value.
     */
    public OffsetDateTime lastSeenDateTime() {
        return this.lastSeenDateTime;
    }

    /**
     * Set the lastSeenDateTime property: Last Heartbeat from the Worker.
     * 
     * @param lastSeenDateTime the lastSeenDateTime value to set.
     * @return the HybridRunbookWorkerProperties object itself.
     */
    public HybridRunbookWorkerProperties withLastSeenDateTime(OffsetDateTime lastSeenDateTime) {
        this.lastSeenDateTime = lastSeenDateTime;
        return this;
    }

    /**
     * Get the vmResourceId property: Azure Resource Manager Id for a virtual machine.
     * 
     * @return the vmResourceId value.
     */
    public String vmResourceId() {
        return this.vmResourceId;
    }

    /**
     * Set the vmResourceId property: Azure Resource Manager Id for a virtual machine.
     * 
     * @param vmResourceId the vmResourceId value to set.
     * @return the HybridRunbookWorkerProperties object itself.
     */
    public HybridRunbookWorkerProperties withVmResourceId(String vmResourceId) {
        this.vmResourceId = vmResourceId;
        return this;
    }

    /**
     * Get the workerType property: Type of the HybridWorker.
     * 
     * @return the workerType value.
     */
    public WorkerType workerType() {
        return this.workerType;
    }

    /**
     * Set the workerType property: Type of the HybridWorker.
     * 
     * @param workerType the workerType value to set.
     * @return the HybridRunbookWorkerProperties object itself.
     */
    public HybridRunbookWorkerProperties withWorkerType(WorkerType workerType) {
        this.workerType = workerType;
        return this;
    }

    /**
     * Get the workerName property: Name of the HybridWorker.
     * 
     * @return the workerName value.
     */
    public String workerName() {
        return this.workerName;
    }

    /**
     * Set the workerName property: Name of the HybridWorker.
     * 
     * @param workerName the workerName value to set.
     * @return the HybridRunbookWorkerProperties object itself.
     */
    public HybridRunbookWorkerProperties withWorkerName(String workerName) {
        this.workerName = workerName;
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
        jsonWriter.writeStringField("ip", this.ip);
        jsonWriter.writeStringField("registeredDateTime",
            this.registeredDateTime == null
                ? null
                : DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(this.registeredDateTime));
        jsonWriter.writeStringField("lastSeenDateTime",
            this.lastSeenDateTime == null
                ? null
                : DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(this.lastSeenDateTime));
        jsonWriter.writeStringField("vmResourceId", this.vmResourceId);
        jsonWriter.writeStringField("workerType", this.workerType == null ? null : this.workerType.toString());
        jsonWriter.writeStringField("workerName", this.workerName);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of HybridRunbookWorkerProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of HybridRunbookWorkerProperties if the JsonReader was pointing to an instance of it, or null
     * if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the HybridRunbookWorkerProperties.
     */
    public static HybridRunbookWorkerProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            HybridRunbookWorkerProperties deserializedHybridRunbookWorkerProperties
                = new HybridRunbookWorkerProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("ip".equals(fieldName)) {
                    deserializedHybridRunbookWorkerProperties.ip = reader.getString();
                } else if ("registeredDateTime".equals(fieldName)) {
                    deserializedHybridRunbookWorkerProperties.registeredDateTime = reader
                        .getNullable(nonNullReader -> CoreUtils.parseBestOffsetDateTime(nonNullReader.getString()));
                } else if ("lastSeenDateTime".equals(fieldName)) {
                    deserializedHybridRunbookWorkerProperties.lastSeenDateTime = reader
                        .getNullable(nonNullReader -> CoreUtils.parseBestOffsetDateTime(nonNullReader.getString()));
                } else if ("vmResourceId".equals(fieldName)) {
                    deserializedHybridRunbookWorkerProperties.vmResourceId = reader.getString();
                } else if ("workerType".equals(fieldName)) {
                    deserializedHybridRunbookWorkerProperties.workerType = WorkerType.fromString(reader.getString());
                } else if ("workerName".equals(fieldName)) {
                    deserializedHybridRunbookWorkerProperties.workerName = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedHybridRunbookWorkerProperties;
        });
    }
}
