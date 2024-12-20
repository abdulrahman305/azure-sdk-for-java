// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devtestlabs.implementation;

import com.azure.resourcemanager.devtestlabs.fluent.models.ApplicableSchedulePropertiesInner;
import com.azure.resourcemanager.devtestlabs.fluent.models.ScheduleInner;
import com.azure.resourcemanager.devtestlabs.models.ApplicableScheduleProperties;
import com.azure.resourcemanager.devtestlabs.models.Schedule;

public final class ApplicableSchedulePropertiesImpl implements ApplicableScheduleProperties {
    private ApplicableSchedulePropertiesInner innerObject;

    private final com.azure.resourcemanager.devtestlabs.DevTestLabsManager serviceManager;

    ApplicableSchedulePropertiesImpl(ApplicableSchedulePropertiesInner innerObject,
        com.azure.resourcemanager.devtestlabs.DevTestLabsManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public Schedule labVmsShutdown() {
        ScheduleInner inner = this.innerModel().labVmsShutdown();
        if (inner != null) {
            return new ScheduleImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Schedule labVmsStartup() {
        ScheduleInner inner = this.innerModel().labVmsStartup();
        if (inner != null) {
            return new ScheduleImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public ApplicableSchedulePropertiesInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.devtestlabs.DevTestLabsManager manager() {
        return this.serviceManager;
    }
}
