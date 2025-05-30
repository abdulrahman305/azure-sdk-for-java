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
import com.azure.resourcemanager.datafactory.models.SnowflakeAuthenticationType;
import java.io.IOException;

/**
 * Snowflake linked service properties.
 */
@Fluent
public final class SnowflakeLinkedV2ServiceTypeProperties
    implements JsonSerializable<SnowflakeLinkedV2ServiceTypeProperties> {
    /*
     * The account identifier of your Snowflake account, e.g. xy12345.east-us-2.azure
     */
    private Object accountIdentifier;

    /*
     * The name of the Snowflake user.
     */
    private Object user;

    /*
     * The Azure key vault secret reference of password in connection string.
     */
    private SecretBase password;

    /*
     * The name of the Snowflake database.
     */
    private Object database;

    /*
     * The name of the Snowflake warehouse.
     */
    private Object warehouse;

    /*
     * The type used for authentication. Type: string.
     */
    private SnowflakeAuthenticationType authenticationType;

    /*
     * The client ID of the application registered in Azure Active Directory for AADServicePrincipal authentication.
     */
    private Object clientId;

    /*
     * The Azure key vault secret reference of client secret for AADServicePrincipal authentication.
     */
    private SecretBase clientSecret;

    /*
     * The tenant ID of the application registered in Azure Active Directory for AADServicePrincipal authentication.
     */
    private Object tenantId;

    /*
     * The scope of the application registered in Azure Active Directory for AADServicePrincipal authentication.
     */
    private Object scope;

    /*
     * The Azure key vault secret reference of privateKey for KeyPair auth.
     */
    private SecretBase privateKey;

    /*
     * The Azure key vault secret reference of private key password for KeyPair auth with encrypted private key.
     */
    private SecretBase privateKeyPassphrase;

    /*
     * The default access control role to use in the Snowflake session. Type: string (or Expression with resultType
     * string).
     */
    private Object role;

    /*
     * The host name of the Snowflake account. Type: string (or Expression with resultType string).
     */
    private Object host;

    /*
     * Schema name for connection. Type: string (or Expression with resultType string).
     */
    private Object schema;

    /*
     * The encrypted credential used for authentication. Credentials are encrypted using the integration runtime
     * credential manager. Type: string.
     */
    private String encryptedCredential;

    /**
     * Creates an instance of SnowflakeLinkedV2ServiceTypeProperties class.
     */
    public SnowflakeLinkedV2ServiceTypeProperties() {
    }

    /**
     * Get the accountIdentifier property: The account identifier of your Snowflake account, e.g.
     * xy12345.east-us-2.azure.
     * 
     * @return the accountIdentifier value.
     */
    public Object accountIdentifier() {
        return this.accountIdentifier;
    }

    /**
     * Set the accountIdentifier property: The account identifier of your Snowflake account, e.g.
     * xy12345.east-us-2.azure.
     * 
     * @param accountIdentifier the accountIdentifier value to set.
     * @return the SnowflakeLinkedV2ServiceTypeProperties object itself.
     */
    public SnowflakeLinkedV2ServiceTypeProperties withAccountIdentifier(Object accountIdentifier) {
        this.accountIdentifier = accountIdentifier;
        return this;
    }

    /**
     * Get the user property: The name of the Snowflake user.
     * 
     * @return the user value.
     */
    public Object user() {
        return this.user;
    }

    /**
     * Set the user property: The name of the Snowflake user.
     * 
     * @param user the user value to set.
     * @return the SnowflakeLinkedV2ServiceTypeProperties object itself.
     */
    public SnowflakeLinkedV2ServiceTypeProperties withUser(Object user) {
        this.user = user;
        return this;
    }

    /**
     * Get the password property: The Azure key vault secret reference of password in connection string.
     * 
     * @return the password value.
     */
    public SecretBase password() {
        return this.password;
    }

    /**
     * Set the password property: The Azure key vault secret reference of password in connection string.
     * 
     * @param password the password value to set.
     * @return the SnowflakeLinkedV2ServiceTypeProperties object itself.
     */
    public SnowflakeLinkedV2ServiceTypeProperties withPassword(SecretBase password) {
        this.password = password;
        return this;
    }

    /**
     * Get the database property: The name of the Snowflake database.
     * 
     * @return the database value.
     */
    public Object database() {
        return this.database;
    }

    /**
     * Set the database property: The name of the Snowflake database.
     * 
     * @param database the database value to set.
     * @return the SnowflakeLinkedV2ServiceTypeProperties object itself.
     */
    public SnowflakeLinkedV2ServiceTypeProperties withDatabase(Object database) {
        this.database = database;
        return this;
    }

    /**
     * Get the warehouse property: The name of the Snowflake warehouse.
     * 
     * @return the warehouse value.
     */
    public Object warehouse() {
        return this.warehouse;
    }

    /**
     * Set the warehouse property: The name of the Snowflake warehouse.
     * 
     * @param warehouse the warehouse value to set.
     * @return the SnowflakeLinkedV2ServiceTypeProperties object itself.
     */
    public SnowflakeLinkedV2ServiceTypeProperties withWarehouse(Object warehouse) {
        this.warehouse = warehouse;
        return this;
    }

    /**
     * Get the authenticationType property: The type used for authentication. Type: string.
     * 
     * @return the authenticationType value.
     */
    public SnowflakeAuthenticationType authenticationType() {
        return this.authenticationType;
    }

    /**
     * Set the authenticationType property: The type used for authentication. Type: string.
     * 
     * @param authenticationType the authenticationType value to set.
     * @return the SnowflakeLinkedV2ServiceTypeProperties object itself.
     */
    public SnowflakeLinkedV2ServiceTypeProperties
        withAuthenticationType(SnowflakeAuthenticationType authenticationType) {
        this.authenticationType = authenticationType;
        return this;
    }

    /**
     * Get the clientId property: The client ID of the application registered in Azure Active Directory for
     * AADServicePrincipal authentication.
     * 
     * @return the clientId value.
     */
    public Object clientId() {
        return this.clientId;
    }

    /**
     * Set the clientId property: The client ID of the application registered in Azure Active Directory for
     * AADServicePrincipal authentication.
     * 
     * @param clientId the clientId value to set.
     * @return the SnowflakeLinkedV2ServiceTypeProperties object itself.
     */
    public SnowflakeLinkedV2ServiceTypeProperties withClientId(Object clientId) {
        this.clientId = clientId;
        return this;
    }

    /**
     * Get the clientSecret property: The Azure key vault secret reference of client secret for AADServicePrincipal
     * authentication.
     * 
     * @return the clientSecret value.
     */
    public SecretBase clientSecret() {
        return this.clientSecret;
    }

    /**
     * Set the clientSecret property: The Azure key vault secret reference of client secret for AADServicePrincipal
     * authentication.
     * 
     * @param clientSecret the clientSecret value to set.
     * @return the SnowflakeLinkedV2ServiceTypeProperties object itself.
     */
    public SnowflakeLinkedV2ServiceTypeProperties withClientSecret(SecretBase clientSecret) {
        this.clientSecret = clientSecret;
        return this;
    }

    /**
     * Get the tenantId property: The tenant ID of the application registered in Azure Active Directory for
     * AADServicePrincipal authentication.
     * 
     * @return the tenantId value.
     */
    public Object tenantId() {
        return this.tenantId;
    }

    /**
     * Set the tenantId property: The tenant ID of the application registered in Azure Active Directory for
     * AADServicePrincipal authentication.
     * 
     * @param tenantId the tenantId value to set.
     * @return the SnowflakeLinkedV2ServiceTypeProperties object itself.
     */
    public SnowflakeLinkedV2ServiceTypeProperties withTenantId(Object tenantId) {
        this.tenantId = tenantId;
        return this;
    }

    /**
     * Get the scope property: The scope of the application registered in Azure Active Directory for AADServicePrincipal
     * authentication.
     * 
     * @return the scope value.
     */
    public Object scope() {
        return this.scope;
    }

    /**
     * Set the scope property: The scope of the application registered in Azure Active Directory for AADServicePrincipal
     * authentication.
     * 
     * @param scope the scope value to set.
     * @return the SnowflakeLinkedV2ServiceTypeProperties object itself.
     */
    public SnowflakeLinkedV2ServiceTypeProperties withScope(Object scope) {
        this.scope = scope;
        return this;
    }

    /**
     * Get the privateKey property: The Azure key vault secret reference of privateKey for KeyPair auth.
     * 
     * @return the privateKey value.
     */
    public SecretBase privateKey() {
        return this.privateKey;
    }

    /**
     * Set the privateKey property: The Azure key vault secret reference of privateKey for KeyPair auth.
     * 
     * @param privateKey the privateKey value to set.
     * @return the SnowflakeLinkedV2ServiceTypeProperties object itself.
     */
    public SnowflakeLinkedV2ServiceTypeProperties withPrivateKey(SecretBase privateKey) {
        this.privateKey = privateKey;
        return this;
    }

    /**
     * Get the privateKeyPassphrase property: The Azure key vault secret reference of private key password for KeyPair
     * auth with encrypted private key.
     * 
     * @return the privateKeyPassphrase value.
     */
    public SecretBase privateKeyPassphrase() {
        return this.privateKeyPassphrase;
    }

    /**
     * Set the privateKeyPassphrase property: The Azure key vault secret reference of private key password for KeyPair
     * auth with encrypted private key.
     * 
     * @param privateKeyPassphrase the privateKeyPassphrase value to set.
     * @return the SnowflakeLinkedV2ServiceTypeProperties object itself.
     */
    public SnowflakeLinkedV2ServiceTypeProperties withPrivateKeyPassphrase(SecretBase privateKeyPassphrase) {
        this.privateKeyPassphrase = privateKeyPassphrase;
        return this;
    }

    /**
     * Get the role property: The default access control role to use in the Snowflake session. Type: string (or
     * Expression with resultType string).
     * 
     * @return the role value.
     */
    public Object role() {
        return this.role;
    }

    /**
     * Set the role property: The default access control role to use in the Snowflake session. Type: string (or
     * Expression with resultType string).
     * 
     * @param role the role value to set.
     * @return the SnowflakeLinkedV2ServiceTypeProperties object itself.
     */
    public SnowflakeLinkedV2ServiceTypeProperties withRole(Object role) {
        this.role = role;
        return this;
    }

    /**
     * Get the host property: The host name of the Snowflake account. Type: string (or Expression with resultType
     * string).
     * 
     * @return the host value.
     */
    public Object host() {
        return this.host;
    }

    /**
     * Set the host property: The host name of the Snowflake account. Type: string (or Expression with resultType
     * string).
     * 
     * @param host the host value to set.
     * @return the SnowflakeLinkedV2ServiceTypeProperties object itself.
     */
    public SnowflakeLinkedV2ServiceTypeProperties withHost(Object host) {
        this.host = host;
        return this;
    }

    /**
     * Get the schema property: Schema name for connection. Type: string (or Expression with resultType string).
     * 
     * @return the schema value.
     */
    public Object schema() {
        return this.schema;
    }

    /**
     * Set the schema property: Schema name for connection. Type: string (or Expression with resultType string).
     * 
     * @param schema the schema value to set.
     * @return the SnowflakeLinkedV2ServiceTypeProperties object itself.
     */
    public SnowflakeLinkedV2ServiceTypeProperties withSchema(Object schema) {
        this.schema = schema;
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
     * @return the SnowflakeLinkedV2ServiceTypeProperties object itself.
     */
    public SnowflakeLinkedV2ServiceTypeProperties withEncryptedCredential(String encryptedCredential) {
        this.encryptedCredential = encryptedCredential;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (accountIdentifier() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property accountIdentifier in model SnowflakeLinkedV2ServiceTypeProperties"));
        }
        if (password() != null) {
            password().validate();
        }
        if (database() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property database in model SnowflakeLinkedV2ServiceTypeProperties"));
        }
        if (warehouse() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property warehouse in model SnowflakeLinkedV2ServiceTypeProperties"));
        }
        if (clientSecret() != null) {
            clientSecret().validate();
        }
        if (privateKey() != null) {
            privateKey().validate();
        }
        if (privateKeyPassphrase() != null) {
            privateKeyPassphrase().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(SnowflakeLinkedV2ServiceTypeProperties.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeUntypedField("accountIdentifier", this.accountIdentifier);
        jsonWriter.writeUntypedField("database", this.database);
        jsonWriter.writeUntypedField("warehouse", this.warehouse);
        if (this.user != null) {
            jsonWriter.writeUntypedField("user", this.user);
        }
        jsonWriter.writeJsonField("password", this.password);
        jsonWriter.writeStringField("authenticationType",
            this.authenticationType == null ? null : this.authenticationType.toString());
        if (this.clientId != null) {
            jsonWriter.writeUntypedField("clientId", this.clientId);
        }
        jsonWriter.writeJsonField("clientSecret", this.clientSecret);
        if (this.tenantId != null) {
            jsonWriter.writeUntypedField("tenantId", this.tenantId);
        }
        if (this.scope != null) {
            jsonWriter.writeUntypedField("scope", this.scope);
        }
        jsonWriter.writeJsonField("privateKey", this.privateKey);
        jsonWriter.writeJsonField("privateKeyPassphrase", this.privateKeyPassphrase);
        if (this.role != null) {
            jsonWriter.writeUntypedField("role", this.role);
        }
        if (this.host != null) {
            jsonWriter.writeUntypedField("host", this.host);
        }
        if (this.schema != null) {
            jsonWriter.writeUntypedField("schema", this.schema);
        }
        jsonWriter.writeStringField("encryptedCredential", this.encryptedCredential);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of SnowflakeLinkedV2ServiceTypeProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of SnowflakeLinkedV2ServiceTypeProperties if the JsonReader was pointing to an instance of
     * it, or null if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the SnowflakeLinkedV2ServiceTypeProperties.
     */
    public static SnowflakeLinkedV2ServiceTypeProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            SnowflakeLinkedV2ServiceTypeProperties deserializedSnowflakeLinkedV2ServiceTypeProperties
                = new SnowflakeLinkedV2ServiceTypeProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("accountIdentifier".equals(fieldName)) {
                    deserializedSnowflakeLinkedV2ServiceTypeProperties.accountIdentifier = reader.readUntyped();
                } else if ("database".equals(fieldName)) {
                    deserializedSnowflakeLinkedV2ServiceTypeProperties.database = reader.readUntyped();
                } else if ("warehouse".equals(fieldName)) {
                    deserializedSnowflakeLinkedV2ServiceTypeProperties.warehouse = reader.readUntyped();
                } else if ("user".equals(fieldName)) {
                    deserializedSnowflakeLinkedV2ServiceTypeProperties.user = reader.readUntyped();
                } else if ("password".equals(fieldName)) {
                    deserializedSnowflakeLinkedV2ServiceTypeProperties.password = SecretBase.fromJson(reader);
                } else if ("authenticationType".equals(fieldName)) {
                    deserializedSnowflakeLinkedV2ServiceTypeProperties.authenticationType
                        = SnowflakeAuthenticationType.fromString(reader.getString());
                } else if ("clientId".equals(fieldName)) {
                    deserializedSnowflakeLinkedV2ServiceTypeProperties.clientId = reader.readUntyped();
                } else if ("clientSecret".equals(fieldName)) {
                    deserializedSnowflakeLinkedV2ServiceTypeProperties.clientSecret = SecretBase.fromJson(reader);
                } else if ("tenantId".equals(fieldName)) {
                    deserializedSnowflakeLinkedV2ServiceTypeProperties.tenantId = reader.readUntyped();
                } else if ("scope".equals(fieldName)) {
                    deserializedSnowflakeLinkedV2ServiceTypeProperties.scope = reader.readUntyped();
                } else if ("privateKey".equals(fieldName)) {
                    deserializedSnowflakeLinkedV2ServiceTypeProperties.privateKey = SecretBase.fromJson(reader);
                } else if ("privateKeyPassphrase".equals(fieldName)) {
                    deserializedSnowflakeLinkedV2ServiceTypeProperties.privateKeyPassphrase
                        = SecretBase.fromJson(reader);
                } else if ("role".equals(fieldName)) {
                    deserializedSnowflakeLinkedV2ServiceTypeProperties.role = reader.readUntyped();
                } else if ("host".equals(fieldName)) {
                    deserializedSnowflakeLinkedV2ServiceTypeProperties.host = reader.readUntyped();
                } else if ("schema".equals(fieldName)) {
                    deserializedSnowflakeLinkedV2ServiceTypeProperties.schema = reader.readUntyped();
                } else if ("encryptedCredential".equals(fieldName)) {
                    deserializedSnowflakeLinkedV2ServiceTypeProperties.encryptedCredential = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedSnowflakeLinkedV2ServiceTypeProperties;
        });
    }
}
