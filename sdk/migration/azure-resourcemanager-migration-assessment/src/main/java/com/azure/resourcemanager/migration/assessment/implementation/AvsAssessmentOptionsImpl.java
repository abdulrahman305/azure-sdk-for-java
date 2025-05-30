// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.migration.assessment.implementation;

import com.azure.core.management.SystemData;
import com.azure.resourcemanager.migration.assessment.fluent.models.AvsAssessmentOptionsInner;
import com.azure.resourcemanager.migration.assessment.models.AvsAssessmentOptions;
import com.azure.resourcemanager.migration.assessment.models.AvsAssessmentOptionsProperties;

public final class AvsAssessmentOptionsImpl implements AvsAssessmentOptions {
    private AvsAssessmentOptionsInner innerObject;

    private final com.azure.resourcemanager.migration.assessment.MigrationAssessmentManager serviceManager;

    AvsAssessmentOptionsImpl(AvsAssessmentOptionsInner innerObject,
        com.azure.resourcemanager.migration.assessment.MigrationAssessmentManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public AvsAssessmentOptionsProperties properties() {
        return this.innerModel().properties();
    }

    public SystemData systemData() {
        return this.innerModel().systemData();
    }

    public AvsAssessmentOptionsInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.migration.assessment.MigrationAssessmentManager manager() {
        return this.serviceManager;
    }
}
