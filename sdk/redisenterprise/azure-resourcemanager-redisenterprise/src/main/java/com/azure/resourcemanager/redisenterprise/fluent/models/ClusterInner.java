// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.redisenterprise.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.Resource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.redisenterprise.models.ClusterPropertiesEncryption;
import com.azure.resourcemanager.redisenterprise.models.HighAvailability;
import com.azure.resourcemanager.redisenterprise.models.Kind;
import com.azure.resourcemanager.redisenterprise.models.ManagedServiceIdentity;
import com.azure.resourcemanager.redisenterprise.models.ProvisioningState;
import com.azure.resourcemanager.redisenterprise.models.RedundancyMode;
import com.azure.resourcemanager.redisenterprise.models.ResourceState;
import com.azure.resourcemanager.redisenterprise.models.Sku;
import com.azure.resourcemanager.redisenterprise.models.TlsVersion;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/**
 * Describes the Redis Enterprise cluster.
 */
@Fluent
public final class ClusterInner extends Resource {
    /*
     * Distinguishes the kind of cluster. Read-only.
     */
    private Kind kind;

    /*
     * The SKU to create, which affects price, performance, and features.
     */
    private Sku sku;

    /*
     * The Availability Zones where this cluster will be deployed.
     */
    private List<String> zones;

    /*
     * The identity of the resource.
     */
    private ManagedServiceIdentity identity;

    /*
     * Other properties of the cluster.
     */
    private ClusterProperties innerProperties;

    /*
     * The type of the resource.
     */
    private String type;

    /*
     * The name of the resource.
     */
    private String name;

    /*
     * Fully qualified resource Id for the resource.
     */
    private String id;

    /**
     * Creates an instance of ClusterInner class.
     */
    public ClusterInner() {
    }

    /**
     * Get the kind property: Distinguishes the kind of cluster. Read-only.
     * 
     * @return the kind value.
     */
    public Kind kind() {
        return this.kind;
    }

    /**
     * Get the sku property: The SKU to create, which affects price, performance, and features.
     * 
     * @return the sku value.
     */
    public Sku sku() {
        return this.sku;
    }

    /**
     * Set the sku property: The SKU to create, which affects price, performance, and features.
     * 
     * @param sku the sku value to set.
     * @return the ClusterInner object itself.
     */
    public ClusterInner withSku(Sku sku) {
        this.sku = sku;
        return this;
    }

    /**
     * Get the zones property: The Availability Zones where this cluster will be deployed.
     * 
     * @return the zones value.
     */
    public List<String> zones() {
        return this.zones;
    }

    /**
     * Set the zones property: The Availability Zones where this cluster will be deployed.
     * 
     * @param zones the zones value to set.
     * @return the ClusterInner object itself.
     */
    public ClusterInner withZones(List<String> zones) {
        this.zones = zones;
        return this;
    }

    /**
     * Get the identity property: The identity of the resource.
     * 
     * @return the identity value.
     */
    public ManagedServiceIdentity identity() {
        return this.identity;
    }

    /**
     * Set the identity property: The identity of the resource.
     * 
     * @param identity the identity value to set.
     * @return the ClusterInner object itself.
     */
    public ClusterInner withIdentity(ManagedServiceIdentity identity) {
        this.identity = identity;
        return this;
    }

    /**
     * Get the innerProperties property: Other properties of the cluster.
     * 
     * @return the innerProperties value.
     */
    private ClusterProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the type property: The type of the resource.
     * 
     * @return the type value.
     */
    @Override
    public String type() {
        return this.type;
    }

    /**
     * Get the name property: The name of the resource.
     * 
     * @return the name value.
     */
    @Override
    public String name() {
        return this.name;
    }

    /**
     * Get the id property: Fully qualified resource Id for the resource.
     * 
     * @return the id value.
     */
    @Override
    public String id() {
        return this.id;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ClusterInner withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ClusterInner withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Get the highAvailability property: Enabled by default. If highAvailability is disabled, the data set is not
     * replicated. This affects the availability SLA, and increases the risk of data loss.
     * 
     * @return the highAvailability value.
     */
    public HighAvailability highAvailability() {
        return this.innerProperties() == null ? null : this.innerProperties().highAvailability();
    }

    /**
     * Set the highAvailability property: Enabled by default. If highAvailability is disabled, the data set is not
     * replicated. This affects the availability SLA, and increases the risk of data loss.
     * 
     * @param highAvailability the highAvailability value to set.
     * @return the ClusterInner object itself.
     */
    public ClusterInner withHighAvailability(HighAvailability highAvailability) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ClusterProperties();
        }
        this.innerProperties().withHighAvailability(highAvailability);
        return this;
    }

    /**
     * Get the minimumTlsVersion property: The minimum TLS version for the cluster to support, e.g. '1.2'. Newer
     * versions can be added in the future. Note that TLS 1.0 and TLS 1.1 are now completely obsolete -- you cannot use
     * them. They are mentioned only for the sake of consistency with old API versions.
     * 
     * @return the minimumTlsVersion value.
     */
    public TlsVersion minimumTlsVersion() {
        return this.innerProperties() == null ? null : this.innerProperties().minimumTlsVersion();
    }

    /**
     * Set the minimumTlsVersion property: The minimum TLS version for the cluster to support, e.g. '1.2'. Newer
     * versions can be added in the future. Note that TLS 1.0 and TLS 1.1 are now completely obsolete -- you cannot use
     * them. They are mentioned only for the sake of consistency with old API versions.
     * 
     * @param minimumTlsVersion the minimumTlsVersion value to set.
     * @return the ClusterInner object itself.
     */
    public ClusterInner withMinimumTlsVersion(TlsVersion minimumTlsVersion) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ClusterProperties();
        }
        this.innerProperties().withMinimumTlsVersion(minimumTlsVersion);
        return this;
    }

    /**
     * Get the encryption property: Encryption-at-rest configuration for the cluster.
     * 
     * @return the encryption value.
     */
    public ClusterPropertiesEncryption encryption() {
        return this.innerProperties() == null ? null : this.innerProperties().encryption();
    }

    /**
     * Set the encryption property: Encryption-at-rest configuration for the cluster.
     * 
     * @param encryption the encryption value to set.
     * @return the ClusterInner object itself.
     */
    public ClusterInner withEncryption(ClusterPropertiesEncryption encryption) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ClusterProperties();
        }
        this.innerProperties().withEncryption(encryption);
        return this;
    }

    /**
     * Get the hostname property: DNS name of the cluster endpoint.
     * 
     * @return the hostname value.
     */
    public String hostname() {
        return this.innerProperties() == null ? null : this.innerProperties().hostname();
    }

    /**
     * Get the provisioningState property: Current provisioning status of the cluster.
     * 
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Get the redundancyMode property: Explains the current redundancy strategy of the cluster, which affects the
     * expected SLA.
     * 
     * @return the redundancyMode value.
     */
    public RedundancyMode redundancyMode() {
        return this.innerProperties() == null ? null : this.innerProperties().redundancyMode();
    }

    /**
     * Get the resourceState property: Current resource status of the cluster.
     * 
     * @return the resourceState value.
     */
    public ResourceState resourceState() {
        return this.innerProperties() == null ? null : this.innerProperties().resourceState();
    }

    /**
     * Get the redisVersion property: Version of redis the cluster supports, e.g. '6'.
     * 
     * @return the redisVersion value.
     */
    public String redisVersion() {
        return this.innerProperties() == null ? null : this.innerProperties().redisVersion();
    }

    /**
     * Get the privateEndpointConnections property: List of private endpoint connections associated with the specified
     * Redis Enterprise cluster.
     * 
     * @return the privateEndpointConnections value.
     */
    public List<PrivateEndpointConnectionInner> privateEndpointConnections() {
        return this.innerProperties() == null ? null : this.innerProperties().privateEndpointConnections();
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (sku() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException("Missing required property sku in model ClusterInner"));
        } else {
            sku().validate();
        }
        if (identity() != null) {
            identity().validate();
        }
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(ClusterInner.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("location", location());
        jsonWriter.writeMapField("tags", tags(), (writer, element) -> writer.writeString(element));
        jsonWriter.writeJsonField("sku", this.sku);
        jsonWriter.writeArrayField("zones", this.zones, (writer, element) -> writer.writeString(element));
        jsonWriter.writeJsonField("identity", this.identity);
        jsonWriter.writeJsonField("properties", this.innerProperties);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ClusterInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ClusterInner if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the ClusterInner.
     */
    public static ClusterInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ClusterInner deserializedClusterInner = new ClusterInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    deserializedClusterInner.id = reader.getString();
                } else if ("name".equals(fieldName)) {
                    deserializedClusterInner.name = reader.getString();
                } else if ("type".equals(fieldName)) {
                    deserializedClusterInner.type = reader.getString();
                } else if ("location".equals(fieldName)) {
                    deserializedClusterInner.withLocation(reader.getString());
                } else if ("tags".equals(fieldName)) {
                    Map<String, String> tags = reader.readMap(reader1 -> reader1.getString());
                    deserializedClusterInner.withTags(tags);
                } else if ("sku".equals(fieldName)) {
                    deserializedClusterInner.sku = Sku.fromJson(reader);
                } else if ("kind".equals(fieldName)) {
                    deserializedClusterInner.kind = Kind.fromString(reader.getString());
                } else if ("zones".equals(fieldName)) {
                    List<String> zones = reader.readArray(reader1 -> reader1.getString());
                    deserializedClusterInner.zones = zones;
                } else if ("identity".equals(fieldName)) {
                    deserializedClusterInner.identity = ManagedServiceIdentity.fromJson(reader);
                } else if ("properties".equals(fieldName)) {
                    deserializedClusterInner.innerProperties = ClusterProperties.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedClusterInner;
        });
    }
}
