// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.containerorchestratorruntime.implementation;

import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.containerorchestratorruntime.fluent.models.StorageClassResourceInner;
import com.azure.resourcemanager.containerorchestratorruntime.models.StorageClassProperties;
import com.azure.resourcemanager.containerorchestratorruntime.models.StorageClassPropertiesUpdate;
import com.azure.resourcemanager.containerorchestratorruntime.models.StorageClassResource;
import com.azure.resourcemanager.containerorchestratorruntime.models.StorageClassResourceUpdate;

public final class StorageClassResourceImpl
    implements StorageClassResource, StorageClassResource.Definition, StorageClassResource.Update {
    private StorageClassResourceInner innerObject;

    private final com.azure.resourcemanager.containerorchestratorruntime.ContainerOrchestratorRuntimeManager serviceManager;

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public StorageClassProperties properties() {
        return this.innerModel().properties();
    }

    public SystemData systemData() {
        return this.innerModel().systemData();
    }

    public StorageClassResourceInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.containerorchestratorruntime.ContainerOrchestratorRuntimeManager manager() {
        return this.serviceManager;
    }

    private String resourceUri;

    private String storageClassName;

    private StorageClassResourceUpdate updateProperties;

    public StorageClassResourceImpl withExistingResourceUri(String resourceUri) {
        this.resourceUri = resourceUri;
        return this;
    }

    public StorageClassResource create() {
        this.innerObject = serviceManager.serviceClient()
            .getStorageClass()
            .createOrUpdate(resourceUri, storageClassName, this.innerModel(), Context.NONE);
        return this;
    }

    public StorageClassResource create(Context context) {
        this.innerObject = serviceManager.serviceClient()
            .getStorageClass()
            .createOrUpdate(resourceUri, storageClassName, this.innerModel(), context);
        return this;
    }

    StorageClassResourceImpl(String name,
        com.azure.resourcemanager.containerorchestratorruntime.ContainerOrchestratorRuntimeManager serviceManager) {
        this.innerObject = new StorageClassResourceInner();
        this.serviceManager = serviceManager;
        this.storageClassName = name;
    }

    public StorageClassResourceImpl update() {
        this.updateProperties = new StorageClassResourceUpdate();
        return this;
    }

    public StorageClassResource apply() {
        this.innerObject = serviceManager.serviceClient()
            .getStorageClass()
            .update(resourceUri, storageClassName, updateProperties, Context.NONE);
        return this;
    }

    public StorageClassResource apply(Context context) {
        this.innerObject = serviceManager.serviceClient()
            .getStorageClass()
            .update(resourceUri, storageClassName, updateProperties, context);
        return this;
    }

    StorageClassResourceImpl(StorageClassResourceInner innerObject,
        com.azure.resourcemanager.containerorchestratorruntime.ContainerOrchestratorRuntimeManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceUri = ResourceManagerUtils.getValueFromIdByParameterName(innerObject.id(),
            "/{resourceUri}/providers/Microsoft.KubernetesRuntime/storageClasses/{storageClassName}", "resourceUri");
        this.storageClassName = ResourceManagerUtils.getValueFromIdByParameterName(innerObject.id(),
            "/{resourceUri}/providers/Microsoft.KubernetesRuntime/storageClasses/{storageClassName}",
            "storageClassName");
    }

    public StorageClassResource refresh() {
        this.innerObject = serviceManager.serviceClient()
            .getStorageClass()
            .getWithResponse(resourceUri, storageClassName, Context.NONE)
            .getValue();
        return this;
    }

    public StorageClassResource refresh(Context context) {
        this.innerObject = serviceManager.serviceClient()
            .getStorageClass()
            .getWithResponse(resourceUri, storageClassName, context)
            .getValue();
        return this;
    }

    public StorageClassResourceImpl withProperties(StorageClassProperties properties) {
        this.innerModel().withProperties(properties);
        return this;
    }

    public StorageClassResourceImpl withProperties(StorageClassPropertiesUpdate properties) {
        this.updateProperties.withProperties(properties);
        return this;
    }
}
