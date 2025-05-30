// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.v2.identity.implementation.client;

import com.azure.v2.identity.exceptions.CredentialUnavailableException;
import com.microsoft.aad.msal4jextensions.persistence.CacheFileAccessor;
import com.microsoft.aad.msal4jextensions.persistence.mac.KeyChainAccessor;
import com.sun.jna.Platform;
import io.clientcore.core.instrumentation.logging.ClientLogger;
import io.clientcore.core.serialization.json.JsonReader;
import io.clientcore.core.serialization.json.JsonToken;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Paths;

/**
 * This class accesses Azure Toolkit credentials cache via JNA.
 */
public class AzureToolkitCacheAccessor {
    private static final ClientLogger LOGGER = new ClientLogger(AzureToolkitCacheAccessor.class);
    public static final String INTELLIJ_TOOLKIT_CACHE = "azure-toolkit.cache.nocae";
    private static final byte[] CRYPTO_KEY
        = new byte[] { 0x50, 0x72, 0x6f, 0x78, 0x79, 0x20, 0x43, 0x6f, 0x6e, 0x66, 0x69, 0x67, 0x20, 0x53, 0x65, 0x63 };

    public String getIntelliJCredentialsFromIdentityMsalCache() {
        if (Platform.isMac()) {
            try {
                KeyChainAccessor accessor
                    = new KeyChainAccessor(null, "Microsoft.Developer.IdentityService", INTELLIJ_TOOLKIT_CACHE);
                String jsonCred = new String(accessor.read(), StandardCharsets.UTF_8);
                return parseRefreshTokenFromJson(jsonCred);
            } catch (RuntimeException e) {
                LOGGER.atVerbose().setThrowable(e).log("IntelliJCredential => Refresh Token Cache Unavailable");
            }

        } else if (Platform.isLinux()) {
            try {
                LinuxKeyRingAccessor accessor = new LinuxKeyRingAccessor("com.intellij.credentialStore.Credential",
                    "service", "Microsoft.Developer.IdentityService", "account", "azure-toolkit.cache");

                String jsonCred = new String(accessor.read(), StandardCharsets.UTF_8);

                return parseRefreshTokenFromJson(jsonCred);
            } catch (RuntimeException e) {
                LOGGER.atVerbose().setThrowable(e).log("IntelliJCredential => Refresh Token Cache Unavailable.");
            }

        } else if (Platform.isWindows()) {

            try {
                CacheFileAccessor cacheFileAccessor = new CacheFileAccessor(
                    Paths
                        .get(PersistentTokenCacheImpl.DEFAULT_CACHE_FILE_PATH.toString(), File.separator,
                            INTELLIJ_TOOLKIT_CACHE)
                        .toString());
                String data = new String(cacheFileAccessor.read(), StandardCharsets.UTF_8);
                return parseRefreshTokenFromJson(data);
            } catch (RuntimeException e) {
                LOGGER.atVerbose().setThrowable(e).log("IntelliJCredential => Refresh Token Cache Unavailable.");
            }

        } else {
            LOGGER.atVerbose().addKeyValue("osType", Platform.getOSType()).log("OS %s Platform not supported.");
        }
        return null;
    }

    public String parseRefreshTokenFromJson(String jsonString) {
        /*
            The json we are parsing looks like this:
              "RefreshToken": {
                "rootNode": { // this is an example, this will be some random string related to the account in question.
                  "home_account_id": "home_account_id",
                  "environment": "environment",
                  "client_id": "client_id",
                  "secret": "refresh_fake_secret",
                  "credential_type": "credential_type",
                  "family_id": "family_id"
                }
              },
              so we need to step the parser to find RefreshToken, as noted below.
         */
        try {
            try (JsonReader jsonReader = JsonReader.fromString(jsonString)) {
                return jsonReader.readObject(reader -> {
                    while (reader.nextToken() != JsonToken.END_OBJECT) {
                        String fieldName = reader.getFieldName();
                        reader.nextToken();
                        // We only want the "secret" field from the "RefreshToken" node.
                        if ("RefreshToken".equals(fieldName)) {
                            reader.nextToken(); // read past the START_OBJECT
                            reader.nextToken(); // read past the FIELD_NAME for the root sub-object
                            while (reader.nextToken() != JsonToken.END_OBJECT) { // now read through the RefreshToken
                                String secretFieldName = reader.getFieldName();
                                reader.nextToken();
                                if ("secret".equals(secretFieldName)) {
                                    return reader.getString();
                                } else {
                                    reader.skipChildren();
                                }
                            }
                        } else {
                            reader.skipChildren();
                        }
                    }
                    throw LOGGER.throwableAtError()
                        .log("IntelliJCredential => Refresh Token not found.", CredentialUnavailableException::new);
                });
            }
        } catch (IOException e) {
            LOGGER.atVerbose().setThrowable(e).log("IntelliJCredential => Refresh Token not found.");
            return null;
        }
    }
}
