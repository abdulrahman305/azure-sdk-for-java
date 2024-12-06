// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.ai.openai.models;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * The authentication options for Azure OpenAI On Your Data when using a username and password.
 */
@Immutable
public final class OnYourDataUsernameAndPasswordAuthenticationOptions extends OnYourDataAuthenticationOptions {

    /*
     * The authentication type.
     */
    @Generated
    private OnYourDataAuthenticationType type = OnYourDataAuthenticationType.USERNAME_AND_PASSWORD;

    /*
     * The username.
     */
    @Generated
    private final String username;

    /*
     * The password.
     */
    @Generated
    private final String password;

    /**
     * Creates an instance of OnYourDataUsernameAndPasswordAuthenticationOptions class.
     *
     * @param username the username value to set.
     * @param password the password value to set.
     */
    @Generated
    public OnYourDataUsernameAndPasswordAuthenticationOptions(String username, String password) {
        this.username = username;
        this.password = password;
    }

    /**
     * Get the type property: The authentication type.
     *
     * @return the type value.
     */
    @Generated
    @Override
    public OnYourDataAuthenticationType getType() {
        return this.type;
    }

    /**
     * Get the username property: The username.
     *
     * @return the username value.
     */
    @Generated
    public String getUsername() {
        return this.username;
    }

    /**
     * Get the password property: The password.
     *
     * @return the password value.
     */
    @Generated
    public String getPassword() {
        return this.password;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("username", this.username);
        jsonWriter.writeStringField("password", this.password);
        jsonWriter.writeStringField("type", this.type == null ? null : this.type.toString());
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of OnYourDataUsernameAndPasswordAuthenticationOptions from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of OnYourDataUsernameAndPasswordAuthenticationOptions if the JsonReader was pointing to an
     * instance of it, or null if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the OnYourDataUsernameAndPasswordAuthenticationOptions.
     */
    @Generated
    public static OnYourDataUsernameAndPasswordAuthenticationOptions fromJson(JsonReader jsonReader)
        throws IOException {
        return jsonReader.readObject(reader -> {
            String username = null;
            String password = null;
            OnYourDataAuthenticationType type = OnYourDataAuthenticationType.USERNAME_AND_PASSWORD;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();
                if ("username".equals(fieldName)) {
                    username = reader.getString();
                } else if ("password".equals(fieldName)) {
                    password = reader.getString();
                } else if ("type".equals(fieldName)) {
                    type = OnYourDataAuthenticationType.fromString(reader.getString());
                } else {
                    reader.skipChildren();
                }
            }
            OnYourDataUsernameAndPasswordAuthenticationOptions deserializedOnYourDataUsernameAndPasswordAuthenticationOptions
                = new OnYourDataUsernameAndPasswordAuthenticationOptions(username, password);
            deserializedOnYourDataUsernameAndPasswordAuthenticationOptions.type = type;
            return deserializedOnYourDataUsernameAndPasswordAuthenticationOptions;
        });
    }
}
