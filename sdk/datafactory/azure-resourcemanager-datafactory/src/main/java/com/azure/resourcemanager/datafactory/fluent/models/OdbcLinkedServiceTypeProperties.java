// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.datafactory.models.SecretBase;
import java.io.IOException;

/**
 * ODBC linked service properties.
 */
@Fluent
public final class OdbcLinkedServiceTypeProperties implements JsonSerializable<OdbcLinkedServiceTypeProperties> {
    /*
     * The non-access credential portion of the connection string as well as an optional encrypted credential. Type:
     * string, or SecureString, or AzureKeyVaultSecretReference, or Expression with resultType string.
     */
    private Object connectionString;

    /*
     * Type of authentication used to connect to the ODBC data store. Possible values are: Anonymous and Basic. Type:
     * string (or Expression with resultType string).
     */
    private Object authenticationType;

    /*
     * The access credential portion of the connection string specified in driver-specific property-value format.
     */
    private SecretBase credential;

    /*
     * User name for Basic authentication. Type: string (or Expression with resultType string).
     */
    private Object username;

    /*
     * Password for Basic authentication.
     */
    private SecretBase password;

    /*
     * The encrypted credential used for authentication. Credentials are encrypted using the integration runtime
     * credential manager. Type: string.
     */
    private String encryptedCredential;

    /**
     * Creates an instance of OdbcLinkedServiceTypeProperties class.
     */
    public OdbcLinkedServiceTypeProperties() {
    }

    /**
     * Get the connectionString property: The non-access credential portion of the connection string as well as an
     * optional encrypted credential. Type: string, or SecureString, or AzureKeyVaultSecretReference, or Expression with
     * resultType string.
     * 
     * @return the connectionString value.
     */
    public Object connectionString() {
        return this.connectionString;
    }

    /**
     * Set the connectionString property: The non-access credential portion of the connection string as well as an
     * optional encrypted credential. Type: string, or SecureString, or AzureKeyVaultSecretReference, or Expression with
     * resultType string.
     * 
     * @param connectionString the connectionString value to set.
     * @return the OdbcLinkedServiceTypeProperties object itself.
     */
    public OdbcLinkedServiceTypeProperties withConnectionString(Object connectionString) {
        this.connectionString = connectionString;
        return this;
    }

    /**
     * Get the authenticationType property: Type of authentication used to connect to the ODBC data store. Possible
     * values are: Anonymous and Basic. Type: string (or Expression with resultType string).
     * 
     * @return the authenticationType value.
     */
    public Object authenticationType() {
        return this.authenticationType;
    }

    /**
     * Set the authenticationType property: Type of authentication used to connect to the ODBC data store. Possible
     * values are: Anonymous and Basic. Type: string (or Expression with resultType string).
     * 
     * @param authenticationType the authenticationType value to set.
     * @return the OdbcLinkedServiceTypeProperties object itself.
     */
    public OdbcLinkedServiceTypeProperties withAuthenticationType(Object authenticationType) {
        this.authenticationType = authenticationType;
        return this;
    }

    /**
     * Get the credential property: The access credential portion of the connection string specified in driver-specific
     * property-value format.
     * 
     * @return the credential value.
     */
    public SecretBase credential() {
        return this.credential;
    }

    /**
     * Set the credential property: The access credential portion of the connection string specified in driver-specific
     * property-value format.
     * 
     * @param credential the credential value to set.
     * @return the OdbcLinkedServiceTypeProperties object itself.
     */
    public OdbcLinkedServiceTypeProperties withCredential(SecretBase credential) {
        this.credential = credential;
        return this;
    }

    /**
     * Get the username property: User name for Basic authentication. Type: string (or Expression with resultType
     * string).
     * 
     * @return the username value.
     */
    public Object username() {
        return this.username;
    }

    /**
     * Set the username property: User name for Basic authentication. Type: string (or Expression with resultType
     * string).
     * 
     * @param username the username value to set.
     * @return the OdbcLinkedServiceTypeProperties object itself.
     */
    public OdbcLinkedServiceTypeProperties withUsername(Object username) {
        this.username = username;
        return this;
    }

    /**
     * Get the password property: Password for Basic authentication.
     * 
     * @return the password value.
     */
    public SecretBase password() {
        return this.password;
    }

    /**
     * Set the password property: Password for Basic authentication.
     * 
     * @param password the password value to set.
     * @return the OdbcLinkedServiceTypeProperties object itself.
     */
    public OdbcLinkedServiceTypeProperties withPassword(SecretBase password) {
        this.password = password;
        return this;
    }

    /**
     * Get the encryptedCredential property: The encrypted credential used for authentication. Credentials are encrypted
     * using the integration runtime credential manager. Type: string.
     * 
     * @return the encryptedCredential value.
     */
    public String encryptedCredential() {
        return this.encryptedCredential;
    }

    /**
     * Set the encryptedCredential property: The encrypted credential used for authentication. Credentials are encrypted
     * using the integration runtime credential manager. Type: string.
     * 
     * @param encryptedCredential the encryptedCredential value to set.
     * @return the OdbcLinkedServiceTypeProperties object itself.
     */
    public OdbcLinkedServiceTypeProperties withEncryptedCredential(String encryptedCredential) {
        this.encryptedCredential = encryptedCredential;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (connectionString() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property connectionString in model OdbcLinkedServiceTypeProperties"));
        }
        if (credential() != null) {
            credential().validate();
        }
        if (password() != null) {
            password().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(OdbcLinkedServiceTypeProperties.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeUntypedField("connectionString", this.connectionString);
        if (this.authenticationType != null) {
            jsonWriter.writeUntypedField("authenticationType", this.authenticationType);
        }
        jsonWriter.writeJsonField("credential", this.credential);
        if (this.username != null) {
            jsonWriter.writeUntypedField("userName", this.username);
        }
        jsonWriter.writeJsonField("password", this.password);
        jsonWriter.writeStringField("encryptedCredential", this.encryptedCredential);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of OdbcLinkedServiceTypeProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of OdbcLinkedServiceTypeProperties if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the OdbcLinkedServiceTypeProperties.
     */
    public static OdbcLinkedServiceTypeProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            OdbcLinkedServiceTypeProperties deserializedOdbcLinkedServiceTypeProperties
                = new OdbcLinkedServiceTypeProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("connectionString".equals(fieldName)) {
                    deserializedOdbcLinkedServiceTypeProperties.connectionString = reader.readUntyped();
                } else if ("authenticationType".equals(fieldName)) {
                    deserializedOdbcLinkedServiceTypeProperties.authenticationType = reader.readUntyped();
                } else if ("credential".equals(fieldName)) {
                    deserializedOdbcLinkedServiceTypeProperties.credential = SecretBase.fromJson(reader);
                } else if ("userName".equals(fieldName)) {
                    deserializedOdbcLinkedServiceTypeProperties.username = reader.readUntyped();
                } else if ("password".equals(fieldName)) {
                    deserializedOdbcLinkedServiceTypeProperties.password = SecretBase.fromJson(reader);
                } else if ("encryptedCredential".equals(fieldName)) {
                    deserializedOdbcLinkedServiceTypeProperties.encryptedCredential = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedOdbcLinkedServiceTypeProperties;
        });
    }
}
