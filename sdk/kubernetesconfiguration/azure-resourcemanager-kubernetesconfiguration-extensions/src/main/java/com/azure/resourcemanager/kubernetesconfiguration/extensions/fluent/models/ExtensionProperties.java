// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.kubernetesconfiguration.extensions.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.exception.ManagementError;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.kubernetesconfiguration.extensions.models.ExtensionPropertiesAksAssignedIdentity;
import com.azure.resourcemanager.kubernetesconfiguration.extensions.models.ExtensionStatus;
import com.azure.resourcemanager.kubernetesconfiguration.extensions.models.ProvisioningState;
import com.azure.resourcemanager.kubernetesconfiguration.extensions.models.Scope;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/**
 * Properties of an Extension resource.
 */
@Fluent
public final class ExtensionProperties implements JsonSerializable<ExtensionProperties> {
    /*
     * Type of the Extension, of which this resource is an instance of. It must be one of the Extension Types registered
     * with Microsoft.KubernetesConfiguration by the Extension publisher.
     */
    private String extensionType;

    /*
     * Flag to note if this extension participates in auto upgrade of minor version, or not.
     */
    private Boolean autoUpgradeMinorVersion;

    /*
     * ReleaseTrain this extension participates in for auto-upgrade (e.g. Stable, Preview, etc.) - only if
     * autoUpgradeMinorVersion is 'true'.
     */
    private String releaseTrain;

    /*
     * User-specified version of the extension for this extension to 'pin'. To use 'version', autoUpgradeMinorVersion
     * must be 'false'.
     */
    private String version;

    /*
     * Scope at which the extension is installed.
     */
    private Scope scope;

    /*
     * Configuration settings, as name-value pairs for configuring this extension.
     */
    private Map<String, String> configurationSettings;

    /*
     * Configuration settings that are sensitive, as name-value pairs for configuring this extension.
     */
    private Map<String, String> configurationProtectedSettings;

    /*
     * Currently installed version of the extension.
     */
    private String currentVersion;

    /*
     * Status of installation of this extension.
     */
    private ProvisioningState provisioningState;

    /*
     * Status from this extension.
     */
    private List<ExtensionStatus> statuses;

    /*
     * Error information from the Agent - e.g. errors during installation.
     */
    private ManagementError errorInfo;

    /*
     * Custom Location settings properties.
     */
    private Map<String, String> customLocationSettings;

    /*
     * Uri of the Helm package
     */
    private String packageUri;

    /*
     * Identity of the Extension resource in an AKS cluster
     */
    private ExtensionPropertiesAksAssignedIdentity aksAssignedIdentity;

    /*
     * Flag to note if this extension is a system extension
     */
    private Boolean isSystemExtension;

    /**
     * Creates an instance of ExtensionProperties class.
     */
    public ExtensionProperties() {
    }

    /**
     * Get the extensionType property: Type of the Extension, of which this resource is an instance of. It must be one
     * of the Extension Types registered with Microsoft.KubernetesConfiguration by the Extension publisher.
     * 
     * @return the extensionType value.
     */
    public String extensionType() {
        return this.extensionType;
    }

    /**
     * Set the extensionType property: Type of the Extension, of which this resource is an instance of. It must be one
     * of the Extension Types registered with Microsoft.KubernetesConfiguration by the Extension publisher.
     * 
     * @param extensionType the extensionType value to set.
     * @return the ExtensionProperties object itself.
     */
    public ExtensionProperties withExtensionType(String extensionType) {
        this.extensionType = extensionType;
        return this;
    }

    /**
     * Get the autoUpgradeMinorVersion property: Flag to note if this extension participates in auto upgrade of minor
     * version, or not.
     * 
     * @return the autoUpgradeMinorVersion value.
     */
    public Boolean autoUpgradeMinorVersion() {
        return this.autoUpgradeMinorVersion;
    }

    /**
     * Set the autoUpgradeMinorVersion property: Flag to note if this extension participates in auto upgrade of minor
     * version, or not.
     * 
     * @param autoUpgradeMinorVersion the autoUpgradeMinorVersion value to set.
     * @return the ExtensionProperties object itself.
     */
    public ExtensionProperties withAutoUpgradeMinorVersion(Boolean autoUpgradeMinorVersion) {
        this.autoUpgradeMinorVersion = autoUpgradeMinorVersion;
        return this;
    }

    /**
     * Get the releaseTrain property: ReleaseTrain this extension participates in for auto-upgrade (e.g. Stable,
     * Preview, etc.) - only if autoUpgradeMinorVersion is 'true'.
     * 
     * @return the releaseTrain value.
     */
    public String releaseTrain() {
        return this.releaseTrain;
    }

    /**
     * Set the releaseTrain property: ReleaseTrain this extension participates in for auto-upgrade (e.g. Stable,
     * Preview, etc.) - only if autoUpgradeMinorVersion is 'true'.
     * 
     * @param releaseTrain the releaseTrain value to set.
     * @return the ExtensionProperties object itself.
     */
    public ExtensionProperties withReleaseTrain(String releaseTrain) {
        this.releaseTrain = releaseTrain;
        return this;
    }

    /**
     * Get the version property: User-specified version of the extension for this extension to 'pin'. To use 'version',
     * autoUpgradeMinorVersion must be 'false'.
     * 
     * @return the version value.
     */
    public String version() {
        return this.version;
    }

    /**
     * Set the version property: User-specified version of the extension for this extension to 'pin'. To use 'version',
     * autoUpgradeMinorVersion must be 'false'.
     * 
     * @param version the version value to set.
     * @return the ExtensionProperties object itself.
     */
    public ExtensionProperties withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * Get the scope property: Scope at which the extension is installed.
     * 
     * @return the scope value.
     */
    public Scope scope() {
        return this.scope;
    }

    /**
     * Set the scope property: Scope at which the extension is installed.
     * 
     * @param scope the scope value to set.
     * @return the ExtensionProperties object itself.
     */
    public ExtensionProperties withScope(Scope scope) {
        this.scope = scope;
        return this;
    }

    /**
     * Get the configurationSettings property: Configuration settings, as name-value pairs for configuring this
     * extension.
     * 
     * @return the configurationSettings value.
     */
    public Map<String, String> configurationSettings() {
        return this.configurationSettings;
    }

    /**
     * Set the configurationSettings property: Configuration settings, as name-value pairs for configuring this
     * extension.
     * 
     * @param configurationSettings the configurationSettings value to set.
     * @return the ExtensionProperties object itself.
     */
    public ExtensionProperties withConfigurationSettings(Map<String, String> configurationSettings) {
        this.configurationSettings = configurationSettings;
        return this;
    }

    /**
     * Get the configurationProtectedSettings property: Configuration settings that are sensitive, as name-value pairs
     * for configuring this extension.
     * 
     * @return the configurationProtectedSettings value.
     */
    public Map<String, String> configurationProtectedSettings() {
        return this.configurationProtectedSettings;
    }

    /**
     * Set the configurationProtectedSettings property: Configuration settings that are sensitive, as name-value pairs
     * for configuring this extension.
     * 
     * @param configurationProtectedSettings the configurationProtectedSettings value to set.
     * @return the ExtensionProperties object itself.
     */
    public ExtensionProperties withConfigurationProtectedSettings(Map<String, String> configurationProtectedSettings) {
        this.configurationProtectedSettings = configurationProtectedSettings;
        return this;
    }

    /**
     * Get the currentVersion property: Currently installed version of the extension.
     * 
     * @return the currentVersion value.
     */
    public String currentVersion() {
        return this.currentVersion;
    }

    /**
     * Get the provisioningState property: Status of installation of this extension.
     * 
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the statuses property: Status from this extension.
     * 
     * @return the statuses value.
     */
    public List<ExtensionStatus> statuses() {
        return this.statuses;
    }

    /**
     * Set the statuses property: Status from this extension.
     * 
     * @param statuses the statuses value to set.
     * @return the ExtensionProperties object itself.
     */
    public ExtensionProperties withStatuses(List<ExtensionStatus> statuses) {
        this.statuses = statuses;
        return this;
    }

    /**
     * Get the errorInfo property: Error information from the Agent - e.g. errors during installation.
     * 
     * @return the errorInfo value.
     */
    public ManagementError errorInfo() {
        return this.errorInfo;
    }

    /**
     * Get the customLocationSettings property: Custom Location settings properties.
     * 
     * @return the customLocationSettings value.
     */
    public Map<String, String> customLocationSettings() {
        return this.customLocationSettings;
    }

    /**
     * Get the packageUri property: Uri of the Helm package.
     * 
     * @return the packageUri value.
     */
    public String packageUri() {
        return this.packageUri;
    }

    /**
     * Get the aksAssignedIdentity property: Identity of the Extension resource in an AKS cluster.
     * 
     * @return the aksAssignedIdentity value.
     */
    public ExtensionPropertiesAksAssignedIdentity aksAssignedIdentity() {
        return this.aksAssignedIdentity;
    }

    /**
     * Set the aksAssignedIdentity property: Identity of the Extension resource in an AKS cluster.
     * 
     * @param aksAssignedIdentity the aksAssignedIdentity value to set.
     * @return the ExtensionProperties object itself.
     */
    public ExtensionProperties withAksAssignedIdentity(ExtensionPropertiesAksAssignedIdentity aksAssignedIdentity) {
        this.aksAssignedIdentity = aksAssignedIdentity;
        return this;
    }

    /**
     * Get the isSystemExtension property: Flag to note if this extension is a system extension.
     * 
     * @return the isSystemExtension value.
     */
    public Boolean isSystemExtension() {
        return this.isSystemExtension;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (scope() != null) {
            scope().validate();
        }
        if (statuses() != null) {
            statuses().forEach(e -> e.validate());
        }
        if (aksAssignedIdentity() != null) {
            aksAssignedIdentity().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("extensionType", this.extensionType);
        jsonWriter.writeBooleanField("autoUpgradeMinorVersion", this.autoUpgradeMinorVersion);
        jsonWriter.writeStringField("releaseTrain", this.releaseTrain);
        jsonWriter.writeStringField("version", this.version);
        jsonWriter.writeJsonField("scope", this.scope);
        jsonWriter.writeMapField("configurationSettings", this.configurationSettings,
            (writer, element) -> writer.writeString(element));
        jsonWriter.writeMapField("configurationProtectedSettings", this.configurationProtectedSettings,
            (writer, element) -> writer.writeString(element));
        jsonWriter.writeArrayField("statuses", this.statuses, (writer, element) -> writer.writeJson(element));
        jsonWriter.writeJsonField("aksAssignedIdentity", this.aksAssignedIdentity);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ExtensionProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ExtensionProperties if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the ExtensionProperties.
     */
    public static ExtensionProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ExtensionProperties deserializedExtensionProperties = new ExtensionProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("extensionType".equals(fieldName)) {
                    deserializedExtensionProperties.extensionType = reader.getString();
                } else if ("autoUpgradeMinorVersion".equals(fieldName)) {
                    deserializedExtensionProperties.autoUpgradeMinorVersion
                        = reader.getNullable(JsonReader::getBoolean);
                } else if ("releaseTrain".equals(fieldName)) {
                    deserializedExtensionProperties.releaseTrain = reader.getString();
                } else if ("version".equals(fieldName)) {
                    deserializedExtensionProperties.version = reader.getString();
                } else if ("scope".equals(fieldName)) {
                    deserializedExtensionProperties.scope = Scope.fromJson(reader);
                } else if ("configurationSettings".equals(fieldName)) {
                    Map<String, String> configurationSettings = reader.readMap(reader1 -> reader1.getString());
                    deserializedExtensionProperties.configurationSettings = configurationSettings;
                } else if ("configurationProtectedSettings".equals(fieldName)) {
                    Map<String, String> configurationProtectedSettings = reader.readMap(reader1 -> reader1.getString());
                    deserializedExtensionProperties.configurationProtectedSettings = configurationProtectedSettings;
                } else if ("currentVersion".equals(fieldName)) {
                    deserializedExtensionProperties.currentVersion = reader.getString();
                } else if ("provisioningState".equals(fieldName)) {
                    deserializedExtensionProperties.provisioningState
                        = ProvisioningState.fromString(reader.getString());
                } else if ("statuses".equals(fieldName)) {
                    List<ExtensionStatus> statuses = reader.readArray(reader1 -> ExtensionStatus.fromJson(reader1));
                    deserializedExtensionProperties.statuses = statuses;
                } else if ("errorInfo".equals(fieldName)) {
                    deserializedExtensionProperties.errorInfo = ManagementError.fromJson(reader);
                } else if ("customLocationSettings".equals(fieldName)) {
                    Map<String, String> customLocationSettings = reader.readMap(reader1 -> reader1.getString());
                    deserializedExtensionProperties.customLocationSettings = customLocationSettings;
                } else if ("packageUri".equals(fieldName)) {
                    deserializedExtensionProperties.packageUri = reader.getString();
                } else if ("aksAssignedIdentity".equals(fieldName)) {
                    deserializedExtensionProperties.aksAssignedIdentity
                        = ExtensionPropertiesAksAssignedIdentity.fromJson(reader);
                } else if ("isSystemExtension".equals(fieldName)) {
                    deserializedExtensionProperties.isSystemExtension = reader.getNullable(JsonReader::getBoolean);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedExtensionProperties;
        });
    }
}
