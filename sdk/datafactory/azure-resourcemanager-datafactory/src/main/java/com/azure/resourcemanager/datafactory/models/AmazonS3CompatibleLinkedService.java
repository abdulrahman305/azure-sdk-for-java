// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.datafactory.fluent.models.AmazonS3CompatibleLinkedServiceTypeProperties;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * Linked service for Amazon S3 Compatible.
 */
@Fluent
public final class AmazonS3CompatibleLinkedService extends LinkedService {
    /*
     * Type of linked service.
     */
    private String type = "AmazonS3Compatible";

    /*
     * Amazon S3 Compatible linked service properties.
     */
    private AmazonS3CompatibleLinkedServiceTypeProperties innerTypeProperties
        = new AmazonS3CompatibleLinkedServiceTypeProperties();

    /**
     * Creates an instance of AmazonS3CompatibleLinkedService class.
     */
    public AmazonS3CompatibleLinkedService() {
    }

    /**
     * Get the type property: Type of linked service.
     * 
     * @return the type value.
     */
    @Override
    public String type() {
        return this.type;
    }

    /**
     * Get the innerTypeProperties property: Amazon S3 Compatible linked service properties.
     * 
     * @return the innerTypeProperties value.
     */
    AmazonS3CompatibleLinkedServiceTypeProperties innerTypeProperties() {
        return this.innerTypeProperties;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AmazonS3CompatibleLinkedService withVersion(String version) {
        super.withVersion(version);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AmazonS3CompatibleLinkedService withConnectVia(IntegrationRuntimeReference connectVia) {
        super.withConnectVia(connectVia);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AmazonS3CompatibleLinkedService withDescription(String description) {
        super.withDescription(description);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AmazonS3CompatibleLinkedService withParameters(Map<String, ParameterSpecification> parameters) {
        super.withParameters(parameters);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AmazonS3CompatibleLinkedService withAnnotations(List<Object> annotations) {
        super.withAnnotations(annotations);
        return this;
    }

    /**
     * Get the accessKeyId property: The access key identifier of the Amazon S3 Compatible Identity and Access
     * Management (IAM) user. Type: string (or Expression with resultType string).
     * 
     * @return the accessKeyId value.
     */
    public Object accessKeyId() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().accessKeyId();
    }

    /**
     * Set the accessKeyId property: The access key identifier of the Amazon S3 Compatible Identity and Access
     * Management (IAM) user. Type: string (or Expression with resultType string).
     * 
     * @param accessKeyId the accessKeyId value to set.
     * @return the AmazonS3CompatibleLinkedService object itself.
     */
    public AmazonS3CompatibleLinkedService withAccessKeyId(Object accessKeyId) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new AmazonS3CompatibleLinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withAccessKeyId(accessKeyId);
        return this;
    }

    /**
     * Get the secretAccessKey property: The secret access key of the Amazon S3 Compatible Identity and Access
     * Management (IAM) user.
     * 
     * @return the secretAccessKey value.
     */
    public SecretBase secretAccessKey() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().secretAccessKey();
    }

    /**
     * Set the secretAccessKey property: The secret access key of the Amazon S3 Compatible Identity and Access
     * Management (IAM) user.
     * 
     * @param secretAccessKey the secretAccessKey value to set.
     * @return the AmazonS3CompatibleLinkedService object itself.
     */
    public AmazonS3CompatibleLinkedService withSecretAccessKey(SecretBase secretAccessKey) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new AmazonS3CompatibleLinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withSecretAccessKey(secretAccessKey);
        return this;
    }

    /**
     * Get the serviceUrl property: This value specifies the endpoint to access with the Amazon S3 Compatible Connector.
     * This is an optional property; change it only if you want to try a different service endpoint or want to switch
     * between https and http. Type: string (or Expression with resultType string).
     * 
     * @return the serviceUrl value.
     */
    public Object serviceUrl() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().serviceUrl();
    }

    /**
     * Set the serviceUrl property: This value specifies the endpoint to access with the Amazon S3 Compatible Connector.
     * This is an optional property; change it only if you want to try a different service endpoint or want to switch
     * between https and http. Type: string (or Expression with resultType string).
     * 
     * @param serviceUrl the serviceUrl value to set.
     * @return the AmazonS3CompatibleLinkedService object itself.
     */
    public AmazonS3CompatibleLinkedService withServiceUrl(Object serviceUrl) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new AmazonS3CompatibleLinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withServiceUrl(serviceUrl);
        return this;
    }

    /**
     * Get the forcePathStyle property: If true, use S3 path-style access instead of virtual hosted-style access.
     * Default value is false. Type: boolean (or Expression with resultType boolean).
     * 
     * @return the forcePathStyle value.
     */
    public Object forcePathStyle() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().forcePathStyle();
    }

    /**
     * Set the forcePathStyle property: If true, use S3 path-style access instead of virtual hosted-style access.
     * Default value is false. Type: boolean (or Expression with resultType boolean).
     * 
     * @param forcePathStyle the forcePathStyle value to set.
     * @return the AmazonS3CompatibleLinkedService object itself.
     */
    public AmazonS3CompatibleLinkedService withForcePathStyle(Object forcePathStyle) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new AmazonS3CompatibleLinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withForcePathStyle(forcePathStyle);
        return this;
    }

    /**
     * Get the encryptedCredential property: The encrypted credential used for authentication. Credentials are encrypted
     * using the integration runtime credential manager. Type: string.
     * 
     * @return the encryptedCredential value.
     */
    public String encryptedCredential() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().encryptedCredential();
    }

    /**
     * Set the encryptedCredential property: The encrypted credential used for authentication. Credentials are encrypted
     * using the integration runtime credential manager. Type: string.
     * 
     * @param encryptedCredential the encryptedCredential value to set.
     * @return the AmazonS3CompatibleLinkedService object itself.
     */
    public AmazonS3CompatibleLinkedService withEncryptedCredential(String encryptedCredential) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new AmazonS3CompatibleLinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withEncryptedCredential(encryptedCredential);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        if (innerTypeProperties() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property innerTypeProperties in model AmazonS3CompatibleLinkedService"));
        } else {
            innerTypeProperties().validate();
        }
        if (connectVia() != null) {
            connectVia().validate();
        }
        if (parameters() != null) {
            parameters().values().forEach(e -> {
                if (e != null) {
                    e.validate();
                }
            });
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(AmazonS3CompatibleLinkedService.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("version", version());
        jsonWriter.writeJsonField("connectVia", connectVia());
        jsonWriter.writeStringField("description", description());
        jsonWriter.writeMapField("parameters", parameters(), (writer, element) -> writer.writeJson(element));
        jsonWriter.writeArrayField("annotations", annotations(), (writer, element) -> writer.writeUntyped(element));
        jsonWriter.writeJsonField("typeProperties", this.innerTypeProperties);
        jsonWriter.writeStringField("type", this.type);
        if (additionalProperties() != null) {
            for (Map.Entry<String, Object> additionalProperty : additionalProperties().entrySet()) {
                jsonWriter.writeUntypedField(additionalProperty.getKey(), additionalProperty.getValue());
            }
        }
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of AmazonS3CompatibleLinkedService from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of AmazonS3CompatibleLinkedService if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the AmazonS3CompatibleLinkedService.
     */
    public static AmazonS3CompatibleLinkedService fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            AmazonS3CompatibleLinkedService deserializedAmazonS3CompatibleLinkedService
                = new AmazonS3CompatibleLinkedService();
            Map<String, Object> additionalProperties = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("version".equals(fieldName)) {
                    deserializedAmazonS3CompatibleLinkedService.withVersion(reader.getString());
                } else if ("connectVia".equals(fieldName)) {
                    deserializedAmazonS3CompatibleLinkedService
                        .withConnectVia(IntegrationRuntimeReference.fromJson(reader));
                } else if ("description".equals(fieldName)) {
                    deserializedAmazonS3CompatibleLinkedService.withDescription(reader.getString());
                } else if ("parameters".equals(fieldName)) {
                    Map<String, ParameterSpecification> parameters
                        = reader.readMap(reader1 -> ParameterSpecification.fromJson(reader1));
                    deserializedAmazonS3CompatibleLinkedService.withParameters(parameters);
                } else if ("annotations".equals(fieldName)) {
                    List<Object> annotations = reader.readArray(reader1 -> reader1.readUntyped());
                    deserializedAmazonS3CompatibleLinkedService.withAnnotations(annotations);
                } else if ("typeProperties".equals(fieldName)) {
                    deserializedAmazonS3CompatibleLinkedService.innerTypeProperties
                        = AmazonS3CompatibleLinkedServiceTypeProperties.fromJson(reader);
                } else if ("type".equals(fieldName)) {
                    deserializedAmazonS3CompatibleLinkedService.type = reader.getString();
                } else {
                    if (additionalProperties == null) {
                        additionalProperties = new LinkedHashMap<>();
                    }

                    additionalProperties.put(fieldName, reader.readUntyped());
                }
            }
            deserializedAmazonS3CompatibleLinkedService.withAdditionalProperties(additionalProperties);

            return deserializedAmazonS3CompatibleLinkedService;
        });
    }
}
