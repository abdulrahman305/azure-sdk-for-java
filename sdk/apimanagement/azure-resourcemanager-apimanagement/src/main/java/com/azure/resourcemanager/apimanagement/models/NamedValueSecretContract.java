// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.models;

import com.azure.resourcemanager.apimanagement.fluent.models.NamedValueSecretContractInner;

/**
 * An immutable client-side representation of NamedValueSecretContract.
 */
public interface NamedValueSecretContract {
    /**
     * Gets the value property: This is secret value of the NamedValue entity.
     * 
     * @return the value value.
     */
    String value();

    /**
     * Gets the inner com.azure.resourcemanager.apimanagement.fluent.models.NamedValueSecretContractInner object.
     * 
     * @return the inner object.
     */
    NamedValueSecretContractInner innerModel();
}
