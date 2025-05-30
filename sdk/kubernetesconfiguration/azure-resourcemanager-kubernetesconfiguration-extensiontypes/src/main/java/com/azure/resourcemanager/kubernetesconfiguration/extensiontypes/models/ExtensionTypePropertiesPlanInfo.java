// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.kubernetesconfiguration.extensiontypes.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Plan information only for the Marketplace Extension Type.
 */
@Fluent
public final class ExtensionTypePropertiesPlanInfo implements JsonSerializable<ExtensionTypePropertiesPlanInfo> {
    /*
     * Publisher ID of the Marketplace Extension Type.
     */
    private String publisherId;

    /*
     * Plan ID of the Marketplace Extension Type.
     */
    private String planId;

    /*
     * Offer or Product ID of the Marketplace Extension Type.
     */
    private String offerId;

    /**
     * Creates an instance of ExtensionTypePropertiesPlanInfo class.
     */
    public ExtensionTypePropertiesPlanInfo() {
    }

    /**
     * Get the publisherId property: Publisher ID of the Marketplace Extension Type.
     * 
     * @return the publisherId value.
     */
    public String publisherId() {
        return this.publisherId;
    }

    /**
     * Set the publisherId property: Publisher ID of the Marketplace Extension Type.
     * 
     * @param publisherId the publisherId value to set.
     * @return the ExtensionTypePropertiesPlanInfo object itself.
     */
    public ExtensionTypePropertiesPlanInfo withPublisherId(String publisherId) {
        this.publisherId = publisherId;
        return this;
    }

    /**
     * Get the planId property: Plan ID of the Marketplace Extension Type.
     * 
     * @return the planId value.
     */
    public String planId() {
        return this.planId;
    }

    /**
     * Set the planId property: Plan ID of the Marketplace Extension Type.
     * 
     * @param planId the planId value to set.
     * @return the ExtensionTypePropertiesPlanInfo object itself.
     */
    public ExtensionTypePropertiesPlanInfo withPlanId(String planId) {
        this.planId = planId;
        return this;
    }

    /**
     * Get the offerId property: Offer or Product ID of the Marketplace Extension Type.
     * 
     * @return the offerId value.
     */
    public String offerId() {
        return this.offerId;
    }

    /**
     * Set the offerId property: Offer or Product ID of the Marketplace Extension Type.
     * 
     * @param offerId the offerId value to set.
     * @return the ExtensionTypePropertiesPlanInfo object itself.
     */
    public ExtensionTypePropertiesPlanInfo withOfferId(String offerId) {
        this.offerId = offerId;
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
        jsonWriter.writeStringField("publisherId", this.publisherId);
        jsonWriter.writeStringField("planId", this.planId);
        jsonWriter.writeStringField("offerId", this.offerId);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ExtensionTypePropertiesPlanInfo from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ExtensionTypePropertiesPlanInfo if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the ExtensionTypePropertiesPlanInfo.
     */
    public static ExtensionTypePropertiesPlanInfo fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ExtensionTypePropertiesPlanInfo deserializedExtensionTypePropertiesPlanInfo
                = new ExtensionTypePropertiesPlanInfo();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("publisherId".equals(fieldName)) {
                    deserializedExtensionTypePropertiesPlanInfo.publisherId = reader.getString();
                } else if ("planId".equals(fieldName)) {
                    deserializedExtensionTypePropertiesPlanInfo.planId = reader.getString();
                } else if ("offerId".equals(fieldName)) {
                    deserializedExtensionTypePropertiesPlanInfo.offerId = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedExtensionTypePropertiesPlanInfo;
        });
    }
}
