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
import com.azure.resourcemanager.datafactory.models.SftpAuthenticationType;
import java.io.IOException;

/**
 * Properties specific to this linked service type.
 */
@Fluent
public final class SftpServerLinkedServiceTypeProperties
    implements JsonSerializable<SftpServerLinkedServiceTypeProperties> {
    /*
     * The SFTP server host name. Type: string (or Expression with resultType string).
     */
    private Object host;

    /*
     * The TCP port number that the SFTP server uses to listen for client connections. Default value is 22. Type:
     * integer (or Expression with resultType integer), minimum: 0.
     */
    private Object port;

    /*
     * The authentication type to be used to connect to the FTP server.
     */
    private SftpAuthenticationType authenticationType;

    /*
     * The username used to log on to the SFTP server. Type: string (or Expression with resultType string).
     */
    private Object username;

    /*
     * Password to logon the SFTP server for Basic authentication.
     */
    private SecretBase password;

    /*
     * The encrypted credential used for authentication. Credentials are encrypted using the integration runtime
     * credential manager. Type: string.
     */
    private String encryptedCredential;

    /*
     * The SSH private key file path for SshPublicKey authentication. Only valid for on-premises copy. For on-premises
     * copy with SshPublicKey authentication, either PrivateKeyPath or PrivateKeyContent should be specified. SSH
     * private key should be OpenSSH format. Type: string (or Expression with resultType string).
     */
    private Object privateKeyPath;

    /*
     * Base64 encoded SSH private key content for SshPublicKey authentication. For on-premises copy with SshPublicKey
     * authentication, either PrivateKeyPath or PrivateKeyContent should be specified. SSH private key should be OpenSSH
     * format.
     */
    private SecretBase privateKeyContent;

    /*
     * The password to decrypt the SSH private key if the SSH private key is encrypted.
     */
    private SecretBase passPhrase;

    /*
     * If true, skip the SSH host key validation. Default value is false. Type: boolean (or Expression with resultType
     * boolean).
     */
    private Object skipHostKeyValidation;

    /*
     * The host key finger-print of the SFTP server. When SkipHostKeyValidation is false, HostKeyFingerprint should be
     * specified. Type: string (or Expression with resultType string).
     */
    private Object hostKeyFingerprint;

    /**
     * Creates an instance of SftpServerLinkedServiceTypeProperties class.
     */
    public SftpServerLinkedServiceTypeProperties() {
    }

    /**
     * Get the host property: The SFTP server host name. Type: string (or Expression with resultType string).
     * 
     * @return the host value.
     */
    public Object host() {
        return this.host;
    }

    /**
     * Set the host property: The SFTP server host name. Type: string (or Expression with resultType string).
     * 
     * @param host the host value to set.
     * @return the SftpServerLinkedServiceTypeProperties object itself.
     */
    public SftpServerLinkedServiceTypeProperties withHost(Object host) {
        this.host = host;
        return this;
    }

    /**
     * Get the port property: The TCP port number that the SFTP server uses to listen for client connections. Default
     * value is 22. Type: integer (or Expression with resultType integer), minimum: 0.
     * 
     * @return the port value.
     */
    public Object port() {
        return this.port;
    }

    /**
     * Set the port property: The TCP port number that the SFTP server uses to listen for client connections. Default
     * value is 22. Type: integer (or Expression with resultType integer), minimum: 0.
     * 
     * @param port the port value to set.
     * @return the SftpServerLinkedServiceTypeProperties object itself.
     */
    public SftpServerLinkedServiceTypeProperties withPort(Object port) {
        this.port = port;
        return this;
    }

    /**
     * Get the authenticationType property: The authentication type to be used to connect to the FTP server.
     * 
     * @return the authenticationType value.
     */
    public SftpAuthenticationType authenticationType() {
        return this.authenticationType;
    }

    /**
     * Set the authenticationType property: The authentication type to be used to connect to the FTP server.
     * 
     * @param authenticationType the authenticationType value to set.
     * @return the SftpServerLinkedServiceTypeProperties object itself.
     */
    public SftpServerLinkedServiceTypeProperties withAuthenticationType(SftpAuthenticationType authenticationType) {
        this.authenticationType = authenticationType;
        return this;
    }

    /**
     * Get the username property: The username used to log on to the SFTP server. Type: string (or Expression with
     * resultType string).
     * 
     * @return the username value.
     */
    public Object username() {
        return this.username;
    }

    /**
     * Set the username property: The username used to log on to the SFTP server. Type: string (or Expression with
     * resultType string).
     * 
     * @param username the username value to set.
     * @return the SftpServerLinkedServiceTypeProperties object itself.
     */
    public SftpServerLinkedServiceTypeProperties withUsername(Object username) {
        this.username = username;
        return this;
    }

    /**
     * Get the password property: Password to logon the SFTP server for Basic authentication.
     * 
     * @return the password value.
     */
    public SecretBase password() {
        return this.password;
    }

    /**
     * Set the password property: Password to logon the SFTP server for Basic authentication.
     * 
     * @param password the password value to set.
     * @return the SftpServerLinkedServiceTypeProperties object itself.
     */
    public SftpServerLinkedServiceTypeProperties withPassword(SecretBase password) {
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
     * @return the SftpServerLinkedServiceTypeProperties object itself.
     */
    public SftpServerLinkedServiceTypeProperties withEncryptedCredential(String encryptedCredential) {
        this.encryptedCredential = encryptedCredential;
        return this;
    }

    /**
     * Get the privateKeyPath property: The SSH private key file path for SshPublicKey authentication. Only valid for
     * on-premises copy. For on-premises copy with SshPublicKey authentication, either PrivateKeyPath or
     * PrivateKeyContent should be specified. SSH private key should be OpenSSH format. Type: string (or Expression with
     * resultType string).
     * 
     * @return the privateKeyPath value.
     */
    public Object privateKeyPath() {
        return this.privateKeyPath;
    }

    /**
     * Set the privateKeyPath property: The SSH private key file path for SshPublicKey authentication. Only valid for
     * on-premises copy. For on-premises copy with SshPublicKey authentication, either PrivateKeyPath or
     * PrivateKeyContent should be specified. SSH private key should be OpenSSH format. Type: string (or Expression with
     * resultType string).
     * 
     * @param privateKeyPath the privateKeyPath value to set.
     * @return the SftpServerLinkedServiceTypeProperties object itself.
     */
    public SftpServerLinkedServiceTypeProperties withPrivateKeyPath(Object privateKeyPath) {
        this.privateKeyPath = privateKeyPath;
        return this;
    }

    /**
     * Get the privateKeyContent property: Base64 encoded SSH private key content for SshPublicKey authentication. For
     * on-premises copy with SshPublicKey authentication, either PrivateKeyPath or PrivateKeyContent should be
     * specified. SSH private key should be OpenSSH format.
     * 
     * @return the privateKeyContent value.
     */
    public SecretBase privateKeyContent() {
        return this.privateKeyContent;
    }

    /**
     * Set the privateKeyContent property: Base64 encoded SSH private key content for SshPublicKey authentication. For
     * on-premises copy with SshPublicKey authentication, either PrivateKeyPath or PrivateKeyContent should be
     * specified. SSH private key should be OpenSSH format.
     * 
     * @param privateKeyContent the privateKeyContent value to set.
     * @return the SftpServerLinkedServiceTypeProperties object itself.
     */
    public SftpServerLinkedServiceTypeProperties withPrivateKeyContent(SecretBase privateKeyContent) {
        this.privateKeyContent = privateKeyContent;
        return this;
    }

    /**
     * Get the passPhrase property: The password to decrypt the SSH private key if the SSH private key is encrypted.
     * 
     * @return the passPhrase value.
     */
    public SecretBase passPhrase() {
        return this.passPhrase;
    }

    /**
     * Set the passPhrase property: The password to decrypt the SSH private key if the SSH private key is encrypted.
     * 
     * @param passPhrase the passPhrase value to set.
     * @return the SftpServerLinkedServiceTypeProperties object itself.
     */
    public SftpServerLinkedServiceTypeProperties withPassPhrase(SecretBase passPhrase) {
        this.passPhrase = passPhrase;
        return this;
    }

    /**
     * Get the skipHostKeyValidation property: If true, skip the SSH host key validation. Default value is false. Type:
     * boolean (or Expression with resultType boolean).
     * 
     * @return the skipHostKeyValidation value.
     */
    public Object skipHostKeyValidation() {
        return this.skipHostKeyValidation;
    }

    /**
     * Set the skipHostKeyValidation property: If true, skip the SSH host key validation. Default value is false. Type:
     * boolean (or Expression with resultType boolean).
     * 
     * @param skipHostKeyValidation the skipHostKeyValidation value to set.
     * @return the SftpServerLinkedServiceTypeProperties object itself.
     */
    public SftpServerLinkedServiceTypeProperties withSkipHostKeyValidation(Object skipHostKeyValidation) {
        this.skipHostKeyValidation = skipHostKeyValidation;
        return this;
    }

    /**
     * Get the hostKeyFingerprint property: The host key finger-print of the SFTP server. When SkipHostKeyValidation is
     * false, HostKeyFingerprint should be specified. Type: string (or Expression with resultType string).
     * 
     * @return the hostKeyFingerprint value.
     */
    public Object hostKeyFingerprint() {
        return this.hostKeyFingerprint;
    }

    /**
     * Set the hostKeyFingerprint property: The host key finger-print of the SFTP server. When SkipHostKeyValidation is
     * false, HostKeyFingerprint should be specified. Type: string (or Expression with resultType string).
     * 
     * @param hostKeyFingerprint the hostKeyFingerprint value to set.
     * @return the SftpServerLinkedServiceTypeProperties object itself.
     */
    public SftpServerLinkedServiceTypeProperties withHostKeyFingerprint(Object hostKeyFingerprint) {
        this.hostKeyFingerprint = hostKeyFingerprint;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (host() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property host in model SftpServerLinkedServiceTypeProperties"));
        }
        if (password() != null) {
            password().validate();
        }
        if (privateKeyContent() != null) {
            privateKeyContent().validate();
        }
        if (passPhrase() != null) {
            passPhrase().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(SftpServerLinkedServiceTypeProperties.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeUntypedField("host", this.host);
        if (this.port != null) {
            jsonWriter.writeUntypedField("port", this.port);
        }
        jsonWriter.writeStringField("authenticationType",
            this.authenticationType == null ? null : this.authenticationType.toString());
        if (this.username != null) {
            jsonWriter.writeUntypedField("userName", this.username);
        }
        jsonWriter.writeJsonField("password", this.password);
        jsonWriter.writeStringField("encryptedCredential", this.encryptedCredential);
        if (this.privateKeyPath != null) {
            jsonWriter.writeUntypedField("privateKeyPath", this.privateKeyPath);
        }
        jsonWriter.writeJsonField("privateKeyContent", this.privateKeyContent);
        jsonWriter.writeJsonField("passPhrase", this.passPhrase);
        if (this.skipHostKeyValidation != null) {
            jsonWriter.writeUntypedField("skipHostKeyValidation", this.skipHostKeyValidation);
        }
        if (this.hostKeyFingerprint != null) {
            jsonWriter.writeUntypedField("hostKeyFingerprint", this.hostKeyFingerprint);
        }
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of SftpServerLinkedServiceTypeProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of SftpServerLinkedServiceTypeProperties if the JsonReader was pointing to an instance of it,
     * or null if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the SftpServerLinkedServiceTypeProperties.
     */
    public static SftpServerLinkedServiceTypeProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            SftpServerLinkedServiceTypeProperties deserializedSftpServerLinkedServiceTypeProperties
                = new SftpServerLinkedServiceTypeProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("host".equals(fieldName)) {
                    deserializedSftpServerLinkedServiceTypeProperties.host = reader.readUntyped();
                } else if ("port".equals(fieldName)) {
                    deserializedSftpServerLinkedServiceTypeProperties.port = reader.readUntyped();
                } else if ("authenticationType".equals(fieldName)) {
                    deserializedSftpServerLinkedServiceTypeProperties.authenticationType
                        = SftpAuthenticationType.fromString(reader.getString());
                } else if ("userName".equals(fieldName)) {
                    deserializedSftpServerLinkedServiceTypeProperties.username = reader.readUntyped();
                } else if ("password".equals(fieldName)) {
                    deserializedSftpServerLinkedServiceTypeProperties.password = SecretBase.fromJson(reader);
                } else if ("encryptedCredential".equals(fieldName)) {
                    deserializedSftpServerLinkedServiceTypeProperties.encryptedCredential = reader.getString();
                } else if ("privateKeyPath".equals(fieldName)) {
                    deserializedSftpServerLinkedServiceTypeProperties.privateKeyPath = reader.readUntyped();
                } else if ("privateKeyContent".equals(fieldName)) {
                    deserializedSftpServerLinkedServiceTypeProperties.privateKeyContent = SecretBase.fromJson(reader);
                } else if ("passPhrase".equals(fieldName)) {
                    deserializedSftpServerLinkedServiceTypeProperties.passPhrase = SecretBase.fromJson(reader);
                } else if ("skipHostKeyValidation".equals(fieldName)) {
                    deserializedSftpServerLinkedServiceTypeProperties.skipHostKeyValidation = reader.readUntyped();
                } else if ("hostKeyFingerprint".equals(fieldName)) {
                    deserializedSftpServerLinkedServiceTypeProperties.hostKeyFingerprint = reader.readUntyped();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedSftpServerLinkedServiceTypeProperties;
        });
    }
}
