// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.SubResource;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.network.models.AddressSpace;
import com.azure.resourcemanager.network.models.AdminState;
import com.azure.resourcemanager.network.models.BgpSettings;
import com.azure.resourcemanager.network.models.ProvisioningState;
import com.azure.resourcemanager.network.models.ResiliencyModel;
import com.azure.resourcemanager.network.models.VirtualNetworkGatewayAutoScaleConfiguration;
import com.azure.resourcemanager.network.models.VirtualNetworkGatewayMigrationStatus;
import com.azure.resourcemanager.network.models.VirtualNetworkGatewayPolicyGroup;
import com.azure.resourcemanager.network.models.VirtualNetworkGatewaySku;
import com.azure.resourcemanager.network.models.VirtualNetworkGatewayType;
import com.azure.resourcemanager.network.models.VpnClientConfiguration;
import com.azure.resourcemanager.network.models.VpnGatewayGeneration;
import com.azure.resourcemanager.network.models.VpnType;
import java.io.IOException;
import java.util.List;

/**
 * VirtualNetworkGateway properties.
 */
@Fluent
public final class VirtualNetworkGatewayPropertiesFormat
    implements JsonSerializable<VirtualNetworkGatewayPropertiesFormat> {
    /*
     * Autoscale configuration for virutal network gateway
     */
    private VirtualNetworkGatewayAutoScaleConfiguration autoScaleConfiguration;

    /*
     * IP configurations for virtual network gateway.
     */
    private List<VirtualNetworkGatewayIpConfigurationInner> ipConfigurations;

    /*
     * The type of this virtual network gateway.
     */
    private VirtualNetworkGatewayType gatewayType;

    /*
     * The type of this virtual network gateway.
     */
    private VpnType vpnType;

    /*
     * The generation for this VirtualNetworkGateway. Must be None if gatewayType is not VPN.
     */
    private VpnGatewayGeneration vpnGatewayGeneration;

    /*
     * Whether BGP is enabled for this virtual network gateway or not.
     */
    private Boolean enableBgp;

    /*
     * Whether private IP needs to be enabled on this gateway for connections or not.
     */
    private Boolean enablePrivateIpAddress;

    /*
     * The reference to the VirtualNetworkGatewayMigrationStatus which represents the status of migration.
     */
    private VirtualNetworkGatewayMigrationStatus virtualNetworkGatewayMigrationStatus;

    /*
     * ActiveActive flag.
     */
    private Boolean active;

    /*
     * To enable Advanced Connectivity feature for VPN gateway
     */
    private Boolean enableHighBandwidthVpnGateway;

    /*
     * disableIPSecReplayProtection flag.
     */
    private Boolean disableIpSecReplayProtection;

    /*
     * The reference to the LocalNetworkGateway resource which represents local network site having default routes.
     * Assign Null value in case of removing existing default site setting.
     */
    private SubResource gatewayDefaultSite;

    /*
     * The reference to the VirtualNetworkGatewaySku resource which represents the SKU selected for Virtual network
     * gateway.
     */
    private VirtualNetworkGatewaySku sku;

    /*
     * The reference to the VpnClientConfiguration resource which represents the P2S VpnClient configurations.
     */
    private VpnClientConfiguration vpnClientConfiguration;

    /*
     * The reference to the VirtualNetworkGatewayPolicyGroup resource which represents the available
     * VirtualNetworkGatewayPolicyGroup for the gateway.
     */
    private List<VirtualNetworkGatewayPolicyGroup> virtualNetworkGatewayPolicyGroups;

    /*
     * Virtual network gateway's BGP speaker settings.
     */
    private BgpSettings bgpSettings;

    /*
     * The reference to the address space resource which represents the custom routes address space specified by the
     * customer for virtual network gateway and VpnClient.
     */
    private AddressSpace customRoutes;

    /*
     * The resource GUID property of the virtual network gateway resource.
     */
    private String resourceGuid;

    /*
     * The provisioning state of the virtual network gateway resource.
     */
    private ProvisioningState provisioningState;

    /*
     * Whether dns forwarding is enabled or not.
     */
    private Boolean enableDnsForwarding;

    /*
     * The IP address allocated by the gateway to which dns requests can be sent.
     */
    private String inboundDnsForwardingEndpoint;

    /*
     * Customer vnet resource id. VirtualNetworkGateway of type local gateway is associated with the customer vnet.
     */
    private String vNetExtendedLocationResourceId;

    /*
     * NatRules for virtual network gateway.
     */
    private List<VirtualNetworkGatewayNatRuleInner> natRules;

    /*
     * EnableBgpRouteTranslationForNat flag.
     */
    private Boolean enableBgpRouteTranslationForNat;

    /*
     * Configures this gateway to accept traffic from remote Virtual WAN networks.
     */
    private Boolean allowVirtualWanTraffic;

    /*
     * Configure this gateway to accept traffic from other Azure Virtual Networks. This configuration does not support
     * connectivity to Azure Virtual WAN.
     */
    private Boolean allowRemoteVnetTraffic;

    /*
     * Property to indicate if the Express Route Gateway serves traffic when there are multiple Express Route Gateways
     * in the vnet
     */
    private AdminState adminState;

    /*
     * Property to indicate if the Express Route Gateway has resiliency model of MultiHomed or SingleHomed
     */
    private ResiliencyModel resiliencyModel;

    /**
     * Creates an instance of VirtualNetworkGatewayPropertiesFormat class.
     */
    public VirtualNetworkGatewayPropertiesFormat() {
    }

    /**
     * Get the autoScaleConfiguration property: Autoscale configuration for virutal network gateway.
     * 
     * @return the autoScaleConfiguration value.
     */
    public VirtualNetworkGatewayAutoScaleConfiguration autoScaleConfiguration() {
        return this.autoScaleConfiguration;
    }

    /**
     * Set the autoScaleConfiguration property: Autoscale configuration for virutal network gateway.
     * 
     * @param autoScaleConfiguration the autoScaleConfiguration value to set.
     * @return the VirtualNetworkGatewayPropertiesFormat object itself.
     */
    public VirtualNetworkGatewayPropertiesFormat
        withAutoScaleConfiguration(VirtualNetworkGatewayAutoScaleConfiguration autoScaleConfiguration) {
        this.autoScaleConfiguration = autoScaleConfiguration;
        return this;
    }

    /**
     * Get the ipConfigurations property: IP configurations for virtual network gateway.
     * 
     * @return the ipConfigurations value.
     */
    public List<VirtualNetworkGatewayIpConfigurationInner> ipConfigurations() {
        return this.ipConfigurations;
    }

    /**
     * Set the ipConfigurations property: IP configurations for virtual network gateway.
     * 
     * @param ipConfigurations the ipConfigurations value to set.
     * @return the VirtualNetworkGatewayPropertiesFormat object itself.
     */
    public VirtualNetworkGatewayPropertiesFormat
        withIpConfigurations(List<VirtualNetworkGatewayIpConfigurationInner> ipConfigurations) {
        this.ipConfigurations = ipConfigurations;
        return this;
    }

    /**
     * Get the gatewayType property: The type of this virtual network gateway.
     * 
     * @return the gatewayType value.
     */
    public VirtualNetworkGatewayType gatewayType() {
        return this.gatewayType;
    }

    /**
     * Set the gatewayType property: The type of this virtual network gateway.
     * 
     * @param gatewayType the gatewayType value to set.
     * @return the VirtualNetworkGatewayPropertiesFormat object itself.
     */
    public VirtualNetworkGatewayPropertiesFormat withGatewayType(VirtualNetworkGatewayType gatewayType) {
        this.gatewayType = gatewayType;
        return this;
    }

    /**
     * Get the vpnType property: The type of this virtual network gateway.
     * 
     * @return the vpnType value.
     */
    public VpnType vpnType() {
        return this.vpnType;
    }

    /**
     * Set the vpnType property: The type of this virtual network gateway.
     * 
     * @param vpnType the vpnType value to set.
     * @return the VirtualNetworkGatewayPropertiesFormat object itself.
     */
    public VirtualNetworkGatewayPropertiesFormat withVpnType(VpnType vpnType) {
        this.vpnType = vpnType;
        return this;
    }

    /**
     * Get the vpnGatewayGeneration property: The generation for this VirtualNetworkGateway. Must be None if gatewayType
     * is not VPN.
     * 
     * @return the vpnGatewayGeneration value.
     */
    public VpnGatewayGeneration vpnGatewayGeneration() {
        return this.vpnGatewayGeneration;
    }

    /**
     * Set the vpnGatewayGeneration property: The generation for this VirtualNetworkGateway. Must be None if gatewayType
     * is not VPN.
     * 
     * @param vpnGatewayGeneration the vpnGatewayGeneration value to set.
     * @return the VirtualNetworkGatewayPropertiesFormat object itself.
     */
    public VirtualNetworkGatewayPropertiesFormat withVpnGatewayGeneration(VpnGatewayGeneration vpnGatewayGeneration) {
        this.vpnGatewayGeneration = vpnGatewayGeneration;
        return this;
    }

    /**
     * Get the enableBgp property: Whether BGP is enabled for this virtual network gateway or not.
     * 
     * @return the enableBgp value.
     */
    public Boolean enableBgp() {
        return this.enableBgp;
    }

    /**
     * Set the enableBgp property: Whether BGP is enabled for this virtual network gateway or not.
     * 
     * @param enableBgp the enableBgp value to set.
     * @return the VirtualNetworkGatewayPropertiesFormat object itself.
     */
    public VirtualNetworkGatewayPropertiesFormat withEnableBgp(Boolean enableBgp) {
        this.enableBgp = enableBgp;
        return this;
    }

    /**
     * Get the enablePrivateIpAddress property: Whether private IP needs to be enabled on this gateway for connections
     * or not.
     * 
     * @return the enablePrivateIpAddress value.
     */
    public Boolean enablePrivateIpAddress() {
        return this.enablePrivateIpAddress;
    }

    /**
     * Set the enablePrivateIpAddress property: Whether private IP needs to be enabled on this gateway for connections
     * or not.
     * 
     * @param enablePrivateIpAddress the enablePrivateIpAddress value to set.
     * @return the VirtualNetworkGatewayPropertiesFormat object itself.
     */
    public VirtualNetworkGatewayPropertiesFormat withEnablePrivateIpAddress(Boolean enablePrivateIpAddress) {
        this.enablePrivateIpAddress = enablePrivateIpAddress;
        return this;
    }

    /**
     * Get the virtualNetworkGatewayMigrationStatus property: The reference to the VirtualNetworkGatewayMigrationStatus
     * which represents the status of migration.
     * 
     * @return the virtualNetworkGatewayMigrationStatus value.
     */
    public VirtualNetworkGatewayMigrationStatus virtualNetworkGatewayMigrationStatus() {
        return this.virtualNetworkGatewayMigrationStatus;
    }

    /**
     * Set the virtualNetworkGatewayMigrationStatus property: The reference to the VirtualNetworkGatewayMigrationStatus
     * which represents the status of migration.
     * 
     * @param virtualNetworkGatewayMigrationStatus the virtualNetworkGatewayMigrationStatus value to set.
     * @return the VirtualNetworkGatewayPropertiesFormat object itself.
     */
    public VirtualNetworkGatewayPropertiesFormat withVirtualNetworkGatewayMigrationStatus(
        VirtualNetworkGatewayMigrationStatus virtualNetworkGatewayMigrationStatus) {
        this.virtualNetworkGatewayMigrationStatus = virtualNetworkGatewayMigrationStatus;
        return this;
    }

    /**
     * Get the active property: ActiveActive flag.
     * 
     * @return the active value.
     */
    public Boolean active() {
        return this.active;
    }

    /**
     * Set the active property: ActiveActive flag.
     * 
     * @param active the active value to set.
     * @return the VirtualNetworkGatewayPropertiesFormat object itself.
     */
    public VirtualNetworkGatewayPropertiesFormat withActive(Boolean active) {
        this.active = active;
        return this;
    }

    /**
     * Get the enableHighBandwidthVpnGateway property: To enable Advanced Connectivity feature for VPN gateway.
     * 
     * @return the enableHighBandwidthVpnGateway value.
     */
    public Boolean enableHighBandwidthVpnGateway() {
        return this.enableHighBandwidthVpnGateway;
    }

    /**
     * Set the enableHighBandwidthVpnGateway property: To enable Advanced Connectivity feature for VPN gateway.
     * 
     * @param enableHighBandwidthVpnGateway the enableHighBandwidthVpnGateway value to set.
     * @return the VirtualNetworkGatewayPropertiesFormat object itself.
     */
    public VirtualNetworkGatewayPropertiesFormat
        withEnableHighBandwidthVpnGateway(Boolean enableHighBandwidthVpnGateway) {
        this.enableHighBandwidthVpnGateway = enableHighBandwidthVpnGateway;
        return this;
    }

    /**
     * Get the disableIpSecReplayProtection property: disableIPSecReplayProtection flag.
     * 
     * @return the disableIpSecReplayProtection value.
     */
    public Boolean disableIpSecReplayProtection() {
        return this.disableIpSecReplayProtection;
    }

    /**
     * Set the disableIpSecReplayProtection property: disableIPSecReplayProtection flag.
     * 
     * @param disableIpSecReplayProtection the disableIpSecReplayProtection value to set.
     * @return the VirtualNetworkGatewayPropertiesFormat object itself.
     */
    public VirtualNetworkGatewayPropertiesFormat
        withDisableIpSecReplayProtection(Boolean disableIpSecReplayProtection) {
        this.disableIpSecReplayProtection = disableIpSecReplayProtection;
        return this;
    }

    /**
     * Get the gatewayDefaultSite property: The reference to the LocalNetworkGateway resource which represents local
     * network site having default routes. Assign Null value in case of removing existing default site setting.
     * 
     * @return the gatewayDefaultSite value.
     */
    public SubResource gatewayDefaultSite() {
        return this.gatewayDefaultSite;
    }

    /**
     * Set the gatewayDefaultSite property: The reference to the LocalNetworkGateway resource which represents local
     * network site having default routes. Assign Null value in case of removing existing default site setting.
     * 
     * @param gatewayDefaultSite the gatewayDefaultSite value to set.
     * @return the VirtualNetworkGatewayPropertiesFormat object itself.
     */
    public VirtualNetworkGatewayPropertiesFormat withGatewayDefaultSite(SubResource gatewayDefaultSite) {
        this.gatewayDefaultSite = gatewayDefaultSite;
        return this;
    }

    /**
     * Get the sku property: The reference to the VirtualNetworkGatewaySku resource which represents the SKU selected
     * for Virtual network gateway.
     * 
     * @return the sku value.
     */
    public VirtualNetworkGatewaySku sku() {
        return this.sku;
    }

    /**
     * Set the sku property: The reference to the VirtualNetworkGatewaySku resource which represents the SKU selected
     * for Virtual network gateway.
     * 
     * @param sku the sku value to set.
     * @return the VirtualNetworkGatewayPropertiesFormat object itself.
     */
    public VirtualNetworkGatewayPropertiesFormat withSku(VirtualNetworkGatewaySku sku) {
        this.sku = sku;
        return this;
    }

    /**
     * Get the vpnClientConfiguration property: The reference to the VpnClientConfiguration resource which represents
     * the P2S VpnClient configurations.
     * 
     * @return the vpnClientConfiguration value.
     */
    public VpnClientConfiguration vpnClientConfiguration() {
        return this.vpnClientConfiguration;
    }

    /**
     * Set the vpnClientConfiguration property: The reference to the VpnClientConfiguration resource which represents
     * the P2S VpnClient configurations.
     * 
     * @param vpnClientConfiguration the vpnClientConfiguration value to set.
     * @return the VirtualNetworkGatewayPropertiesFormat object itself.
     */
    public VirtualNetworkGatewayPropertiesFormat
        withVpnClientConfiguration(VpnClientConfiguration vpnClientConfiguration) {
        this.vpnClientConfiguration = vpnClientConfiguration;
        return this;
    }

    /**
     * Get the virtualNetworkGatewayPolicyGroups property: The reference to the VirtualNetworkGatewayPolicyGroup
     * resource which represents the available VirtualNetworkGatewayPolicyGroup for the gateway.
     * 
     * @return the virtualNetworkGatewayPolicyGroups value.
     */
    public List<VirtualNetworkGatewayPolicyGroup> virtualNetworkGatewayPolicyGroups() {
        return this.virtualNetworkGatewayPolicyGroups;
    }

    /**
     * Set the virtualNetworkGatewayPolicyGroups property: The reference to the VirtualNetworkGatewayPolicyGroup
     * resource which represents the available VirtualNetworkGatewayPolicyGroup for the gateway.
     * 
     * @param virtualNetworkGatewayPolicyGroups the virtualNetworkGatewayPolicyGroups value to set.
     * @return the VirtualNetworkGatewayPropertiesFormat object itself.
     */
    public VirtualNetworkGatewayPropertiesFormat withVirtualNetworkGatewayPolicyGroups(
        List<VirtualNetworkGatewayPolicyGroup> virtualNetworkGatewayPolicyGroups) {
        this.virtualNetworkGatewayPolicyGroups = virtualNetworkGatewayPolicyGroups;
        return this;
    }

    /**
     * Get the bgpSettings property: Virtual network gateway's BGP speaker settings.
     * 
     * @return the bgpSettings value.
     */
    public BgpSettings bgpSettings() {
        return this.bgpSettings;
    }

    /**
     * Set the bgpSettings property: Virtual network gateway's BGP speaker settings.
     * 
     * @param bgpSettings the bgpSettings value to set.
     * @return the VirtualNetworkGatewayPropertiesFormat object itself.
     */
    public VirtualNetworkGatewayPropertiesFormat withBgpSettings(BgpSettings bgpSettings) {
        this.bgpSettings = bgpSettings;
        return this;
    }

    /**
     * Get the customRoutes property: The reference to the address space resource which represents the custom routes
     * address space specified by the customer for virtual network gateway and VpnClient.
     * 
     * @return the customRoutes value.
     */
    public AddressSpace customRoutes() {
        return this.customRoutes;
    }

    /**
     * Set the customRoutes property: The reference to the address space resource which represents the custom routes
     * address space specified by the customer for virtual network gateway and VpnClient.
     * 
     * @param customRoutes the customRoutes value to set.
     * @return the VirtualNetworkGatewayPropertiesFormat object itself.
     */
    public VirtualNetworkGatewayPropertiesFormat withCustomRoutes(AddressSpace customRoutes) {
        this.customRoutes = customRoutes;
        return this;
    }

    /**
     * Get the resourceGuid property: The resource GUID property of the virtual network gateway resource.
     * 
     * @return the resourceGuid value.
     */
    public String resourceGuid() {
        return this.resourceGuid;
    }

    /**
     * Get the provisioningState property: The provisioning state of the virtual network gateway resource.
     * 
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the enableDnsForwarding property: Whether dns forwarding is enabled or not.
     * 
     * @return the enableDnsForwarding value.
     */
    public Boolean enableDnsForwarding() {
        return this.enableDnsForwarding;
    }

    /**
     * Set the enableDnsForwarding property: Whether dns forwarding is enabled or not.
     * 
     * @param enableDnsForwarding the enableDnsForwarding value to set.
     * @return the VirtualNetworkGatewayPropertiesFormat object itself.
     */
    public VirtualNetworkGatewayPropertiesFormat withEnableDnsForwarding(Boolean enableDnsForwarding) {
        this.enableDnsForwarding = enableDnsForwarding;
        return this;
    }

    /**
     * Get the inboundDnsForwardingEndpoint property: The IP address allocated by the gateway to which dns requests can
     * be sent.
     * 
     * @return the inboundDnsForwardingEndpoint value.
     */
    public String inboundDnsForwardingEndpoint() {
        return this.inboundDnsForwardingEndpoint;
    }

    /**
     * Get the vNetExtendedLocationResourceId property: Customer vnet resource id. VirtualNetworkGateway of type local
     * gateway is associated with the customer vnet.
     * 
     * @return the vNetExtendedLocationResourceId value.
     */
    public String vNetExtendedLocationResourceId() {
        return this.vNetExtendedLocationResourceId;
    }

    /**
     * Set the vNetExtendedLocationResourceId property: Customer vnet resource id. VirtualNetworkGateway of type local
     * gateway is associated with the customer vnet.
     * 
     * @param vNetExtendedLocationResourceId the vNetExtendedLocationResourceId value to set.
     * @return the VirtualNetworkGatewayPropertiesFormat object itself.
     */
    public VirtualNetworkGatewayPropertiesFormat
        withVNetExtendedLocationResourceId(String vNetExtendedLocationResourceId) {
        this.vNetExtendedLocationResourceId = vNetExtendedLocationResourceId;
        return this;
    }

    /**
     * Get the natRules property: NatRules for virtual network gateway.
     * 
     * @return the natRules value.
     */
    public List<VirtualNetworkGatewayNatRuleInner> natRules() {
        return this.natRules;
    }

    /**
     * Set the natRules property: NatRules for virtual network gateway.
     * 
     * @param natRules the natRules value to set.
     * @return the VirtualNetworkGatewayPropertiesFormat object itself.
     */
    public VirtualNetworkGatewayPropertiesFormat withNatRules(List<VirtualNetworkGatewayNatRuleInner> natRules) {
        this.natRules = natRules;
        return this;
    }

    /**
     * Get the enableBgpRouteTranslationForNat property: EnableBgpRouteTranslationForNat flag.
     * 
     * @return the enableBgpRouteTranslationForNat value.
     */
    public Boolean enableBgpRouteTranslationForNat() {
        return this.enableBgpRouteTranslationForNat;
    }

    /**
     * Set the enableBgpRouteTranslationForNat property: EnableBgpRouteTranslationForNat flag.
     * 
     * @param enableBgpRouteTranslationForNat the enableBgpRouteTranslationForNat value to set.
     * @return the VirtualNetworkGatewayPropertiesFormat object itself.
     */
    public VirtualNetworkGatewayPropertiesFormat
        withEnableBgpRouteTranslationForNat(Boolean enableBgpRouteTranslationForNat) {
        this.enableBgpRouteTranslationForNat = enableBgpRouteTranslationForNat;
        return this;
    }

    /**
     * Get the allowVirtualWanTraffic property: Configures this gateway to accept traffic from remote Virtual WAN
     * networks.
     * 
     * @return the allowVirtualWanTraffic value.
     */
    public Boolean allowVirtualWanTraffic() {
        return this.allowVirtualWanTraffic;
    }

    /**
     * Set the allowVirtualWanTraffic property: Configures this gateway to accept traffic from remote Virtual WAN
     * networks.
     * 
     * @param allowVirtualWanTraffic the allowVirtualWanTraffic value to set.
     * @return the VirtualNetworkGatewayPropertiesFormat object itself.
     */
    public VirtualNetworkGatewayPropertiesFormat withAllowVirtualWanTraffic(Boolean allowVirtualWanTraffic) {
        this.allowVirtualWanTraffic = allowVirtualWanTraffic;
        return this;
    }

    /**
     * Get the allowRemoteVnetTraffic property: Configure this gateway to accept traffic from other Azure Virtual
     * Networks. This configuration does not support connectivity to Azure Virtual WAN.
     * 
     * @return the allowRemoteVnetTraffic value.
     */
    public Boolean allowRemoteVnetTraffic() {
        return this.allowRemoteVnetTraffic;
    }

    /**
     * Set the allowRemoteVnetTraffic property: Configure this gateway to accept traffic from other Azure Virtual
     * Networks. This configuration does not support connectivity to Azure Virtual WAN.
     * 
     * @param allowRemoteVnetTraffic the allowRemoteVnetTraffic value to set.
     * @return the VirtualNetworkGatewayPropertiesFormat object itself.
     */
    public VirtualNetworkGatewayPropertiesFormat withAllowRemoteVnetTraffic(Boolean allowRemoteVnetTraffic) {
        this.allowRemoteVnetTraffic = allowRemoteVnetTraffic;
        return this;
    }

    /**
     * Get the adminState property: Property to indicate if the Express Route Gateway serves traffic when there are
     * multiple Express Route Gateways in the vnet.
     * 
     * @return the adminState value.
     */
    public AdminState adminState() {
        return this.adminState;
    }

    /**
     * Set the adminState property: Property to indicate if the Express Route Gateway serves traffic when there are
     * multiple Express Route Gateways in the vnet.
     * 
     * @param adminState the adminState value to set.
     * @return the VirtualNetworkGatewayPropertiesFormat object itself.
     */
    public VirtualNetworkGatewayPropertiesFormat withAdminState(AdminState adminState) {
        this.adminState = adminState;
        return this;
    }

    /**
     * Get the resiliencyModel property: Property to indicate if the Express Route Gateway has resiliency model of
     * MultiHomed or SingleHomed.
     * 
     * @return the resiliencyModel value.
     */
    public ResiliencyModel resiliencyModel() {
        return this.resiliencyModel;
    }

    /**
     * Set the resiliencyModel property: Property to indicate if the Express Route Gateway has resiliency model of
     * MultiHomed or SingleHomed.
     * 
     * @param resiliencyModel the resiliencyModel value to set.
     * @return the VirtualNetworkGatewayPropertiesFormat object itself.
     */
    public VirtualNetworkGatewayPropertiesFormat withResiliencyModel(ResiliencyModel resiliencyModel) {
        this.resiliencyModel = resiliencyModel;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (autoScaleConfiguration() != null) {
            autoScaleConfiguration().validate();
        }
        if (ipConfigurations() != null) {
            ipConfigurations().forEach(e -> e.validate());
        }
        if (virtualNetworkGatewayMigrationStatus() != null) {
            virtualNetworkGatewayMigrationStatus().validate();
        }
        if (sku() != null) {
            sku().validate();
        }
        if (vpnClientConfiguration() != null) {
            vpnClientConfiguration().validate();
        }
        if (virtualNetworkGatewayPolicyGroups() != null) {
            virtualNetworkGatewayPolicyGroups().forEach(e -> e.validate());
        }
        if (bgpSettings() != null) {
            bgpSettings().validate();
        }
        if (customRoutes() != null) {
            customRoutes().validate();
        }
        if (natRules() != null) {
            natRules().forEach(e -> e.validate());
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeJsonField("autoScaleConfiguration", this.autoScaleConfiguration);
        jsonWriter.writeArrayField("ipConfigurations", this.ipConfigurations,
            (writer, element) -> writer.writeJson(element));
        jsonWriter.writeStringField("gatewayType", this.gatewayType == null ? null : this.gatewayType.toString());
        jsonWriter.writeStringField("vpnType", this.vpnType == null ? null : this.vpnType.toString());
        jsonWriter.writeStringField("vpnGatewayGeneration",
            this.vpnGatewayGeneration == null ? null : this.vpnGatewayGeneration.toString());
        jsonWriter.writeBooleanField("enableBgp", this.enableBgp);
        jsonWriter.writeBooleanField("enablePrivateIpAddress", this.enablePrivateIpAddress);
        jsonWriter.writeJsonField("virtualNetworkGatewayMigrationStatus", this.virtualNetworkGatewayMigrationStatus);
        jsonWriter.writeBooleanField("activeActive", this.active);
        jsonWriter.writeBooleanField("enableHighBandwidthVpnGateway", this.enableHighBandwidthVpnGateway);
        jsonWriter.writeBooleanField("disableIPSecReplayProtection", this.disableIpSecReplayProtection);
        jsonWriter.writeJsonField("gatewayDefaultSite", this.gatewayDefaultSite);
        jsonWriter.writeJsonField("sku", this.sku);
        jsonWriter.writeJsonField("vpnClientConfiguration", this.vpnClientConfiguration);
        jsonWriter.writeArrayField("virtualNetworkGatewayPolicyGroups", this.virtualNetworkGatewayPolicyGroups,
            (writer, element) -> writer.writeJson(element));
        jsonWriter.writeJsonField("bgpSettings", this.bgpSettings);
        jsonWriter.writeJsonField("customRoutes", this.customRoutes);
        jsonWriter.writeBooleanField("enableDnsForwarding", this.enableDnsForwarding);
        jsonWriter.writeStringField("vNetExtendedLocationResourceId", this.vNetExtendedLocationResourceId);
        jsonWriter.writeArrayField("natRules", this.natRules, (writer, element) -> writer.writeJson(element));
        jsonWriter.writeBooleanField("enableBgpRouteTranslationForNat", this.enableBgpRouteTranslationForNat);
        jsonWriter.writeBooleanField("allowVirtualWanTraffic", this.allowVirtualWanTraffic);
        jsonWriter.writeBooleanField("allowRemoteVnetTraffic", this.allowRemoteVnetTraffic);
        jsonWriter.writeStringField("adminState", this.adminState == null ? null : this.adminState.toString());
        jsonWriter.writeStringField("resiliencyModel",
            this.resiliencyModel == null ? null : this.resiliencyModel.toString());
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of VirtualNetworkGatewayPropertiesFormat from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of VirtualNetworkGatewayPropertiesFormat if the JsonReader was pointing to an instance of it,
     * or null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the VirtualNetworkGatewayPropertiesFormat.
     */
    public static VirtualNetworkGatewayPropertiesFormat fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            VirtualNetworkGatewayPropertiesFormat deserializedVirtualNetworkGatewayPropertiesFormat
                = new VirtualNetworkGatewayPropertiesFormat();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("autoScaleConfiguration".equals(fieldName)) {
                    deserializedVirtualNetworkGatewayPropertiesFormat.autoScaleConfiguration
                        = VirtualNetworkGatewayAutoScaleConfiguration.fromJson(reader);
                } else if ("ipConfigurations".equals(fieldName)) {
                    List<VirtualNetworkGatewayIpConfigurationInner> ipConfigurations
                        = reader.readArray(reader1 -> VirtualNetworkGatewayIpConfigurationInner.fromJson(reader1));
                    deserializedVirtualNetworkGatewayPropertiesFormat.ipConfigurations = ipConfigurations;
                } else if ("gatewayType".equals(fieldName)) {
                    deserializedVirtualNetworkGatewayPropertiesFormat.gatewayType
                        = VirtualNetworkGatewayType.fromString(reader.getString());
                } else if ("vpnType".equals(fieldName)) {
                    deserializedVirtualNetworkGatewayPropertiesFormat.vpnType = VpnType.fromString(reader.getString());
                } else if ("vpnGatewayGeneration".equals(fieldName)) {
                    deserializedVirtualNetworkGatewayPropertiesFormat.vpnGatewayGeneration
                        = VpnGatewayGeneration.fromString(reader.getString());
                } else if ("enableBgp".equals(fieldName)) {
                    deserializedVirtualNetworkGatewayPropertiesFormat.enableBgp
                        = reader.getNullable(JsonReader::getBoolean);
                } else if ("enablePrivateIpAddress".equals(fieldName)) {
                    deserializedVirtualNetworkGatewayPropertiesFormat.enablePrivateIpAddress
                        = reader.getNullable(JsonReader::getBoolean);
                } else if ("virtualNetworkGatewayMigrationStatus".equals(fieldName)) {
                    deserializedVirtualNetworkGatewayPropertiesFormat.virtualNetworkGatewayMigrationStatus
                        = VirtualNetworkGatewayMigrationStatus.fromJson(reader);
                } else if ("activeActive".equals(fieldName)) {
                    deserializedVirtualNetworkGatewayPropertiesFormat.active
                        = reader.getNullable(JsonReader::getBoolean);
                } else if ("enableHighBandwidthVpnGateway".equals(fieldName)) {
                    deserializedVirtualNetworkGatewayPropertiesFormat.enableHighBandwidthVpnGateway
                        = reader.getNullable(JsonReader::getBoolean);
                } else if ("disableIPSecReplayProtection".equals(fieldName)) {
                    deserializedVirtualNetworkGatewayPropertiesFormat.disableIpSecReplayProtection
                        = reader.getNullable(JsonReader::getBoolean);
                } else if ("gatewayDefaultSite".equals(fieldName)) {
                    deserializedVirtualNetworkGatewayPropertiesFormat.gatewayDefaultSite = SubResource.fromJson(reader);
                } else if ("sku".equals(fieldName)) {
                    deserializedVirtualNetworkGatewayPropertiesFormat.sku = VirtualNetworkGatewaySku.fromJson(reader);
                } else if ("vpnClientConfiguration".equals(fieldName)) {
                    deserializedVirtualNetworkGatewayPropertiesFormat.vpnClientConfiguration
                        = VpnClientConfiguration.fromJson(reader);
                } else if ("virtualNetworkGatewayPolicyGroups".equals(fieldName)) {
                    List<VirtualNetworkGatewayPolicyGroup> virtualNetworkGatewayPolicyGroups
                        = reader.readArray(reader1 -> VirtualNetworkGatewayPolicyGroup.fromJson(reader1));
                    deserializedVirtualNetworkGatewayPropertiesFormat.virtualNetworkGatewayPolicyGroups
                        = virtualNetworkGatewayPolicyGroups;
                } else if ("bgpSettings".equals(fieldName)) {
                    deserializedVirtualNetworkGatewayPropertiesFormat.bgpSettings = BgpSettings.fromJson(reader);
                } else if ("customRoutes".equals(fieldName)) {
                    deserializedVirtualNetworkGatewayPropertiesFormat.customRoutes = AddressSpace.fromJson(reader);
                } else if ("resourceGuid".equals(fieldName)) {
                    deserializedVirtualNetworkGatewayPropertiesFormat.resourceGuid = reader.getString();
                } else if ("provisioningState".equals(fieldName)) {
                    deserializedVirtualNetworkGatewayPropertiesFormat.provisioningState
                        = ProvisioningState.fromString(reader.getString());
                } else if ("enableDnsForwarding".equals(fieldName)) {
                    deserializedVirtualNetworkGatewayPropertiesFormat.enableDnsForwarding
                        = reader.getNullable(JsonReader::getBoolean);
                } else if ("inboundDnsForwardingEndpoint".equals(fieldName)) {
                    deserializedVirtualNetworkGatewayPropertiesFormat.inboundDnsForwardingEndpoint = reader.getString();
                } else if ("vNetExtendedLocationResourceId".equals(fieldName)) {
                    deserializedVirtualNetworkGatewayPropertiesFormat.vNetExtendedLocationResourceId
                        = reader.getString();
                } else if ("natRules".equals(fieldName)) {
                    List<VirtualNetworkGatewayNatRuleInner> natRules
                        = reader.readArray(reader1 -> VirtualNetworkGatewayNatRuleInner.fromJson(reader1));
                    deserializedVirtualNetworkGatewayPropertiesFormat.natRules = natRules;
                } else if ("enableBgpRouteTranslationForNat".equals(fieldName)) {
                    deserializedVirtualNetworkGatewayPropertiesFormat.enableBgpRouteTranslationForNat
                        = reader.getNullable(JsonReader::getBoolean);
                } else if ("allowVirtualWanTraffic".equals(fieldName)) {
                    deserializedVirtualNetworkGatewayPropertiesFormat.allowVirtualWanTraffic
                        = reader.getNullable(JsonReader::getBoolean);
                } else if ("allowRemoteVnetTraffic".equals(fieldName)) {
                    deserializedVirtualNetworkGatewayPropertiesFormat.allowRemoteVnetTraffic
                        = reader.getNullable(JsonReader::getBoolean);
                } else if ("adminState".equals(fieldName)) {
                    deserializedVirtualNetworkGatewayPropertiesFormat.adminState
                        = AdminState.fromString(reader.getString());
                } else if ("resiliencyModel".equals(fieldName)) {
                    deserializedVirtualNetworkGatewayPropertiesFormat.resiliencyModel
                        = ResiliencyModel.fromString(reader.getString());
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedVirtualNetworkGatewayPropertiesFormat;
        });
    }
}
