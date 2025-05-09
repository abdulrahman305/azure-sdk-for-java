// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azurestack.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Links to product icons.
 */
@Fluent
public final class IconUris implements JsonSerializable<IconUris> {
    /*
     * URI to large icon.
     */
    private String large;

    /*
     * URI to wide icon.
     */
    private String wide;

    /*
     * URI to medium icon.
     */
    private String medium;

    /*
     * URI to small icon.
     */
    private String small;

    /*
     * URI to hero icon.
     */
    private String hero;

    /**
     * Creates an instance of IconUris class.
     */
    public IconUris() {
    }

    /**
     * Get the large property: URI to large icon.
     * 
     * @return the large value.
     */
    public String large() {
        return this.large;
    }

    /**
     * Set the large property: URI to large icon.
     * 
     * @param large the large value to set.
     * @return the IconUris object itself.
     */
    public IconUris withLarge(String large) {
        this.large = large;
        return this;
    }

    /**
     * Get the wide property: URI to wide icon.
     * 
     * @return the wide value.
     */
    public String wide() {
        return this.wide;
    }

    /**
     * Set the wide property: URI to wide icon.
     * 
     * @param wide the wide value to set.
     * @return the IconUris object itself.
     */
    public IconUris withWide(String wide) {
        this.wide = wide;
        return this;
    }

    /**
     * Get the medium property: URI to medium icon.
     * 
     * @return the medium value.
     */
    public String medium() {
        return this.medium;
    }

    /**
     * Set the medium property: URI to medium icon.
     * 
     * @param medium the medium value to set.
     * @return the IconUris object itself.
     */
    public IconUris withMedium(String medium) {
        this.medium = medium;
        return this;
    }

    /**
     * Get the small property: URI to small icon.
     * 
     * @return the small value.
     */
    public String small() {
        return this.small;
    }

    /**
     * Set the small property: URI to small icon.
     * 
     * @param small the small value to set.
     * @return the IconUris object itself.
     */
    public IconUris withSmall(String small) {
        this.small = small;
        return this;
    }

    /**
     * Get the hero property: URI to hero icon.
     * 
     * @return the hero value.
     */
    public String hero() {
        return this.hero;
    }

    /**
     * Set the hero property: URI to hero icon.
     * 
     * @param hero the hero value to set.
     * @return the IconUris object itself.
     */
    public IconUris withHero(String hero) {
        this.hero = hero;
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
        jsonWriter.writeStringField("large", this.large);
        jsonWriter.writeStringField("wide", this.wide);
        jsonWriter.writeStringField("medium", this.medium);
        jsonWriter.writeStringField("small", this.small);
        jsonWriter.writeStringField("hero", this.hero);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of IconUris from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of IconUris if the JsonReader was pointing to an instance of it, or null if it was pointing
     * to JSON null.
     * @throws IOException If an error occurs while reading the IconUris.
     */
    public static IconUris fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            IconUris deserializedIconUris = new IconUris();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("large".equals(fieldName)) {
                    deserializedIconUris.large = reader.getString();
                } else if ("wide".equals(fieldName)) {
                    deserializedIconUris.wide = reader.getString();
                } else if ("medium".equals(fieldName)) {
                    deserializedIconUris.medium = reader.getString();
                } else if ("small".equals(fieldName)) {
                    deserializedIconUris.small = reader.getString();
                } else if ("hero".equals(fieldName)) {
                    deserializedIconUris.hero = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedIconUris;
        });
    }
}
