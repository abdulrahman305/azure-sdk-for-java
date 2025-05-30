// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.
package com.azure.ai.personalizer.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Generated;
import com.azure.core.util.BinaryData;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;

/**
 * A slot with it's associated features and list of excluded actions.
 */
@Fluent
public final class PersonalizerSlotOptions implements JsonSerializable<PersonalizerSlotOptions> {

    /*
     * Slot ID
     */
    @Generated
    private String id;

    /*
     * List of dictionaries containing slot features.
     */
    @Generated
    private List<BinaryData> features;

    /*
     * List of excluded action Ids.
     */
    @Generated
    private List<String> excludedActions;

    /*
     * The 'baseline action' ID for the slot.
     * The BaselineAction is the Id of the Action your application would use in that slot if Personalizer didn't exist.
     * BaselineAction must be defined for every slot.
     * BaselineAction should never be part of ExcludedActions.
     * Each slot must have a unique BaselineAction which corresponds to an an action from the event's Actions list.
     */
    @Generated
    private String baselineAction;

    /**
     * Creates an instance of PersonalizerSlotOptions class.
     */
    @Generated
    public PersonalizerSlotOptions() {
    }

    /**
     * Get the id property: Slot ID.
     *
     * @return the id value.
     */
    @Generated
    public String getId() {
        return this.id;
    }

    /**
     * Set the id property: Slot ID.
     *
     * @param id the id value to set.
     * @return the PersonalizerSlotOptions object itself.
     */
    @Generated
    public PersonalizerSlotOptions setId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get the features property: List of dictionaries containing slot features.
     *
     * @return the features value.
     */
    @Generated
    public List<BinaryData> getFeatures() {
        return this.features;
    }

    /**
     * Set the features property: List of dictionaries containing slot features.
     *
     * @param features the features value to set.
     * @return the PersonalizerSlotOptions object itself.
     */
    @Generated
    public PersonalizerSlotOptions setFeatures(List<BinaryData> features) {
        this.features = features;
        return this;
    }

    /**
     * Get the excludedActions property: List of excluded action Ids.
     *
     * @return the excludedActions value.
     */
    @Generated
    public List<String> getExcludedActions() {
        return this.excludedActions;
    }

    /**
     * Set the excludedActions property: List of excluded action Ids.
     *
     * @param excludedActions the excludedActions value to set.
     * @return the PersonalizerSlotOptions object itself.
     */
    @Generated
    public PersonalizerSlotOptions setExcludedActions(List<String> excludedActions) {
        this.excludedActions = excludedActions;
        return this;
    }

    /**
     * Get the baselineAction property: The 'baseline action' ID for the slot.
     * The BaselineAction is the Id of the Action your application would use in that slot if Personalizer didn't exist.
     * BaselineAction must be defined for every slot.
     * BaselineAction should never be part of ExcludedActions.
     * Each slot must have a unique BaselineAction which corresponds to an an action from the event's Actions list.
     *
     * @return the baselineAction value.
     */
    @Generated
    public String getBaselineAction() {
        return this.baselineAction;
    }

    /**
     * Set the baselineAction property: The 'baseline action' ID for the slot.
     * The BaselineAction is the Id of the Action your application would use in that slot if Personalizer didn't exist.
     * BaselineAction must be defined for every slot.
     * BaselineAction should never be part of ExcludedActions.
     * Each slot must have a unique BaselineAction which corresponds to an an action from the event's Actions list.
     *
     * @param baselineAction the baselineAction value to set.
     * @return the PersonalizerSlotOptions object itself.
     */
    @Generated
    public PersonalizerSlotOptions setBaselineAction(String baselineAction) {
        this.baselineAction = baselineAction;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("id", this.id);
        jsonWriter.writeStringField("baselineAction", this.baselineAction);
        jsonWriter.writeArrayField("features", this.features, (writer, element) -> element.writeTo(writer));
        jsonWriter.writeArrayField("excludedActions", this.excludedActions,
            (writer, element) -> writer.writeString(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of PersonalizerSlotOptions from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of PersonalizerSlotOptions if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the PersonalizerSlotOptions.
     */
    @Generated
    public static PersonalizerSlotOptions fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            PersonalizerSlotOptions deserializedPersonalizerSlotOptions = new PersonalizerSlotOptions();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();
                if ("id".equals(fieldName)) {
                    deserializedPersonalizerSlotOptions.id = reader.getString();
                } else if ("baselineAction".equals(fieldName)) {
                    deserializedPersonalizerSlotOptions.baselineAction = reader.getString();
                } else if ("features".equals(fieldName)) {
                    List<BinaryData> features = reader.readArray(reader1 -> (reader1.currentToken() == JsonToken.NULL)
                        ? null
                        : BinaryData.fromObject(reader1.readUntyped()));
                    deserializedPersonalizerSlotOptions.features = features;
                } else if ("excludedActions".equals(fieldName)) {
                    List<String> excludedActions = reader.readArray(reader1 -> reader1.getString());
                    deserializedPersonalizerSlotOptions.excludedActions = excludedActions;
                } else {
                    reader.skipChildren();
                }
            }
            return deserializedPersonalizerSlotOptions;
        });
    }
}
