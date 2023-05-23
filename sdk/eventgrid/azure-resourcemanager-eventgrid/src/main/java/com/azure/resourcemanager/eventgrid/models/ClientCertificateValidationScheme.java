// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** The validation scheme used to authenticate the client. Default value is SubjectMatchesAuthenticationName. */
public final class ClientCertificateValidationScheme extends ExpandableStringEnum<ClientCertificateValidationScheme> {
    /** Static value SubjectMatchesAuthenticationName for ClientCertificateValidationScheme. */
    public static final ClientCertificateValidationScheme SUBJECT_MATCHES_AUTHENTICATION_NAME =
        fromString("SubjectMatchesAuthenticationName");

    /** Static value DnsMatchesAuthenticationName for ClientCertificateValidationScheme. */
    public static final ClientCertificateValidationScheme DNS_MATCHES_AUTHENTICATION_NAME =
        fromString("DnsMatchesAuthenticationName");

    /** Static value UriMatchesAuthenticationName for ClientCertificateValidationScheme. */
    public static final ClientCertificateValidationScheme URI_MATCHES_AUTHENTICATION_NAME =
        fromString("UriMatchesAuthenticationName");

    /** Static value IpMatchesAuthenticationName for ClientCertificateValidationScheme. */
    public static final ClientCertificateValidationScheme IP_MATCHES_AUTHENTICATION_NAME =
        fromString("IpMatchesAuthenticationName");

    /** Static value EmailMatchesAuthenticationName for ClientCertificateValidationScheme. */
    public static final ClientCertificateValidationScheme EMAIL_MATCHES_AUTHENTICATION_NAME =
        fromString("EmailMatchesAuthenticationName");

    /** Static value ThumbprintMatch for ClientCertificateValidationScheme. */
    public static final ClientCertificateValidationScheme THUMBPRINT_MATCH = fromString("ThumbprintMatch");

    /**
     * Creates a new instance of ClientCertificateValidationScheme value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public ClientCertificateValidationScheme() {
    }

    /**
     * Creates or finds a ClientCertificateValidationScheme from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding ClientCertificateValidationScheme.
     */
    @JsonCreator
    public static ClientCertificateValidationScheme fromString(String name) {
        return fromString(name, ClientCertificateValidationScheme.class);
    }

    /**
     * Gets known ClientCertificateValidationScheme values.
     *
     * @return known ClientCertificateValidationScheme values.
     */
    public static Collection<ClientCertificateValidationScheme> values() {
        return values(ClientCertificateValidationScheme.class);
    }
}