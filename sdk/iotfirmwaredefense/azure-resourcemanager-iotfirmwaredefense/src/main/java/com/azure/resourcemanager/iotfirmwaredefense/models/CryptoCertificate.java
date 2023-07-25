// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.iotfirmwaredefense.models;

import com.azure.resourcemanager.iotfirmwaredefense.fluent.models.CryptoCertificateInner;
import java.time.OffsetDateTime;
import java.util.List;

/** An immutable client-side representation of CryptoCertificate. */
public interface CryptoCertificate {
    /**
     * Gets the cryptoCertId property: ID for the certificate.
     *
     * @return the cryptoCertId value.
     */
    String cryptoCertId();

    /**
     * Gets the name property: Name of the certificate.
     *
     * @return the name value.
     */
    String name();

    /**
     * Gets the subject property: Subject information of the certificate.
     *
     * @return the subject value.
     */
    CryptoCertificateEntity subject();

    /**
     * Gets the issuer property: Issuer information of the certificate.
     *
     * @return the issuer value.
     */
    CryptoCertificateEntity issuer();

    /**
     * Gets the issuedDate property: Issue date for the certificate.
     *
     * @return the issuedDate value.
     */
    OffsetDateTime issuedDate();

    /**
     * Gets the expirationDate property: Expiration date for the certificate.
     *
     * @return the expirationDate value.
     */
    OffsetDateTime expirationDate();

    /**
     * Gets the role property: Role of the certificate (Root CA, etc).
     *
     * @return the role value.
     */
    String role();

    /**
     * Gets the signatureAlgorithm property: The signature algorithm used in the certificate.
     *
     * @return the signatureAlgorithm value.
     */
    String signatureAlgorithm();

    /**
     * Gets the keySize property: Size of the certificate's key in bits.
     *
     * @return the keySize value.
     */
    Long keySize();

    /**
     * Gets the keyAlgorithm property: Key algorithm used in the certificate.
     *
     * @return the keyAlgorithm value.
     */
    String keyAlgorithm();

    /**
     * Gets the encoding property: Encoding used for the certificate.
     *
     * @return the encoding value.
     */
    String encoding();

    /**
     * Gets the serialNumber property: Serial number of the certificate.
     *
     * @return the serialNumber value.
     */
    String serialNumber();

    /**
     * Gets the fingerprint property: Fingerprint of the certificate.
     *
     * @return the fingerprint value.
     */
    String fingerprint();

    /**
     * Gets the usage property: List of functions the certificate can fulfill.
     *
     * @return the usage value.
     */
    List<String> usage();

    /**
     * Gets the filePaths property: List of files paths for this certificate.
     *
     * @return the filePaths value.
     */
    List<String> filePaths();

    /**
     * Gets the pairedKey property: A matching paired private key.
     *
     * @return the pairedKey value.
     */
    PairedKey pairedKey();

    /**
     * Gets the isExpired property: Indicates if the certificate is expired.
     *
     * @return the isExpired value.
     */
    IsExpired isExpired();

    /**
     * Gets the isSelfSigned property: Indicates if the certificate was self-signed.
     *
     * @return the isSelfSigned value.
     */
    IsSelfSigned isSelfSigned();

    /**
     * Gets the isWeakSignature property: Indicates the signature algorithm used is insecure.
     *
     * @return the isWeakSignature value.
     */
    IsWeakSignature isWeakSignature();

    /**
     * Gets the isShortKeySize property: Indicates the certificate's key size is considered too small to be secure for
     * the key algorithm.
     *
     * @return the isShortKeySize value.
     */
    IsShortKeySize isShortKeySize();

    /**
     * Gets the inner com.azure.resourcemanager.iotfirmwaredefense.fluent.models.CryptoCertificateInner object.
     *
     * @return the inner object.
     */
    CryptoCertificateInner innerModel();
}