// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.iotfirmwaredefense.models;

import com.azure.resourcemanager.iotfirmwaredefense.fluent.models.PasswordHashInner;

/** An immutable client-side representation of PasswordHash. */
public interface PasswordHash {
    /**
     * Gets the passwordHashId property: ID for password hash.
     *
     * @return the passwordHashId value.
     */
    String passwordHashId();

    /**
     * Gets the filePath property: File path of the password hash.
     *
     * @return the filePath value.
     */
    String filePath();

    /**
     * Gets the salt property: Salt of the password hash.
     *
     * @return the salt value.
     */
    String salt();

    /**
     * Gets the hash property: Hash of the password.
     *
     * @return the hash value.
     */
    String hash();

    /**
     * Gets the context property: Context of password hash.
     *
     * @return the context value.
     */
    String context();

    /**
     * Gets the username property: User name of password hash.
     *
     * @return the username value.
     */
    String username();

    /**
     * Gets the algorithm property: Algorithm of the password hash.
     *
     * @return the algorithm value.
     */
    String algorithm();

    /**
     * Gets the inner com.azure.resourcemanager.iotfirmwaredefense.fluent.models.PasswordHashInner object.
     *
     * @return the inner object.
     */
    PasswordHashInner innerModel();
}