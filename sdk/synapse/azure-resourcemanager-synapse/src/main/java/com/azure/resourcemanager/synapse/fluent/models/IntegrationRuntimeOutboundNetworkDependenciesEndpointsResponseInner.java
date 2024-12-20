// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.synapse.models.IntegrationRuntimeOutboundNetworkDependenciesCategoryEndpoint;
import java.io.IOException;
import java.util.List;

/**
 * Azure-SSIS integration runtime outbound network dependency endpoints.
 */
@Fluent
public final class IntegrationRuntimeOutboundNetworkDependenciesEndpointsResponseInner
    implements JsonSerializable<IntegrationRuntimeOutboundNetworkDependenciesEndpointsResponseInner> {
    /*
     * The list of outbound network dependency endpoints.
     */
    private List<IntegrationRuntimeOutboundNetworkDependenciesCategoryEndpoint> value;

    /**
     * Creates an instance of IntegrationRuntimeOutboundNetworkDependenciesEndpointsResponseInner class.
     */
    public IntegrationRuntimeOutboundNetworkDependenciesEndpointsResponseInner() {
    }

    /**
     * Get the value property: The list of outbound network dependency endpoints.
     * 
     * @return the value value.
     */
    public List<IntegrationRuntimeOutboundNetworkDependenciesCategoryEndpoint> value() {
        return this.value;
    }

    /**
     * Set the value property: The list of outbound network dependency endpoints.
     * 
     * @param value the value value to set.
     * @return the IntegrationRuntimeOutboundNetworkDependenciesEndpointsResponseInner object itself.
     */
    public IntegrationRuntimeOutboundNetworkDependenciesEndpointsResponseInner
        withValue(List<IntegrationRuntimeOutboundNetworkDependenciesCategoryEndpoint> value) {
        this.value = value;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() != null) {
            value().forEach(e -> e.validate());
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeArrayField("value", this.value, (writer, element) -> writer.writeJson(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of IntegrationRuntimeOutboundNetworkDependenciesEndpointsResponseInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of IntegrationRuntimeOutboundNetworkDependenciesEndpointsResponseInner if the JsonReader was
     * pointing to an instance of it, or null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the
     * IntegrationRuntimeOutboundNetworkDependenciesEndpointsResponseInner.
     */
    public static IntegrationRuntimeOutboundNetworkDependenciesEndpointsResponseInner fromJson(JsonReader jsonReader)
        throws IOException {
        return jsonReader.readObject(reader -> {
            IntegrationRuntimeOutboundNetworkDependenciesEndpointsResponseInner deserializedIntegrationRuntimeOutboundNetworkDependenciesEndpointsResponseInner
                = new IntegrationRuntimeOutboundNetworkDependenciesEndpointsResponseInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("value".equals(fieldName)) {
                    List<IntegrationRuntimeOutboundNetworkDependenciesCategoryEndpoint> value = reader.readArray(
                        reader1 -> IntegrationRuntimeOutboundNetworkDependenciesCategoryEndpoint.fromJson(reader1));
                    deserializedIntegrationRuntimeOutboundNetworkDependenciesEndpointsResponseInner.value = value;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedIntegrationRuntimeOutboundNetworkDependenciesEndpointsResponseInner;
        });
    }
}
