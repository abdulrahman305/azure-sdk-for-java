// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.quantum.models;

import com.azure.resourcemanager.quantum.fluent.models.OperationInner;

/** An immutable client-side representation of Operation. */
public interface Operation {
    /**
     * Gets the name property: Name of the operation.
     *
     * @return the name value.
     */
    String name();

    /**
     * Gets the isDataAction property: Indicates whether the operation is a data action.
     *
     * @return the isDataAction value.
     */
    Boolean isDataAction();

    /**
     * Gets the display property: Properties of the operation.
     *
     * @return the display value.
     */
    OperationDisplay display();

    /**
     * Gets the inner com.azure.resourcemanager.quantum.fluent.models.OperationInner object.
     *
     * @return the inner object.
     */
    OperationInner innerModel();
}