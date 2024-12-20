// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.applicationinsights.generated;

/**
 * Samples for Annotations List.
 */
public final class AnnotationsListSamples {
    /*
     * x-ms-original-file:
     * specification/applicationinsights/resource-manager/Microsoft.Insights/stable/2015-05-01/examples/AnnotationsList.
     * json
     */
    /**
     * Sample code: AnnotationsList.
     * 
     * @param manager Entry point to ApplicationInsightsManager.
     */
    public static void
        annotationsList(com.azure.resourcemanager.applicationinsights.ApplicationInsightsManager manager) {
        manager.annotations()
            .list("my-resource-group", "my-component", "2018-02-05T00%3A30%3A00.000Z", "2018-02-06T00%3A33A00.000Z",
                com.azure.core.util.Context.NONE);
    }
}
