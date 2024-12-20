// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * The KeyVaultProperties model.
 */
@Fluent
public final class KeyVaultProperties implements JsonSerializable<KeyVaultProperties> {
    /*
     * The URL of the Key Vault key used to encrypt the account. The key may either be versioned (for example
     * https://vault/keys/mykey/version1) or reference a key without a version (for example https://vault/keys/mykey).
     */
    private String keyIdentifier;

    /*
     * The current key used to encrypt the Media Services account, including the key version.
     */
    private String currentKeyIdentifier;

    /**
     * Creates an instance of KeyVaultProperties class.
     */
    public KeyVaultProperties() {
    }

    /**
     * Get the keyIdentifier property: The URL of the Key Vault key used to encrypt the account. The key may either be
     * versioned (for example https://vault/keys/mykey/version1) or reference a key without a version (for example
     * https://vault/keys/mykey).
     * 
     * @return the keyIdentifier value.
     */
    public String keyIdentifier() {
        return this.keyIdentifier;
    }

    /**
     * Set the keyIdentifier property: The URL of the Key Vault key used to encrypt the account. The key may either be
     * versioned (for example https://vault/keys/mykey/version1) or reference a key without a version (for example
     * https://vault/keys/mykey).
     * 
     * @param keyIdentifier the keyIdentifier value to set.
     * @return the KeyVaultProperties object itself.
     */
    public KeyVaultProperties withKeyIdentifier(String keyIdentifier) {
        this.keyIdentifier = keyIdentifier;
        return this;
    }

    /**
     * Get the currentKeyIdentifier property: The current key used to encrypt the Media Services account, including the
     * key version.
     * 
     * @return the currentKeyIdentifier value.
     */
    public String currentKeyIdentifier() {
        return this.currentKeyIdentifier;
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
        jsonWriter.writeStringField("keyIdentifier", this.keyIdentifier);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of KeyVaultProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of KeyVaultProperties if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the KeyVaultProperties.
     */
    public static KeyVaultProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            KeyVaultProperties deserializedKeyVaultProperties = new KeyVaultProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("keyIdentifier".equals(fieldName)) {
                    deserializedKeyVaultProperties.keyIdentifier = reader.getString();
                } else if ("currentKeyIdentifier".equals(fieldName)) {
                    deserializedKeyVaultProperties.currentKeyIdentifier = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedKeyVaultProperties;
        });
    }
}
