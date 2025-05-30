// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.elasticsan;

import com.azure.core.credential.TokenCredential;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpPipeline;
import com.azure.core.http.HttpPipelineBuilder;
import com.azure.core.http.HttpPipelinePosition;
import com.azure.core.http.policy.AddDatePolicy;
import com.azure.core.http.policy.AddHeadersFromContextPolicy;
import com.azure.core.http.policy.BearerTokenAuthenticationPolicy;
import com.azure.core.http.policy.HttpLogOptions;
import com.azure.core.http.policy.HttpLoggingPolicy;
import com.azure.core.http.policy.HttpPipelinePolicy;
import com.azure.core.http.policy.HttpPolicyProviders;
import com.azure.core.http.policy.RequestIdPolicy;
import com.azure.core.http.policy.RetryOptions;
import com.azure.core.http.policy.RetryPolicy;
import com.azure.core.http.policy.UserAgentPolicy;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.util.Configuration;
import com.azure.core.util.CoreUtils;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.elasticsan.fluent.ElasticSanManagement;
import com.azure.resourcemanager.elasticsan.implementation.ElasticSanManagementBuilder;
import com.azure.resourcemanager.elasticsan.implementation.ElasticSansImpl;
import com.azure.resourcemanager.elasticsan.implementation.OperationsImpl;
import com.azure.resourcemanager.elasticsan.implementation.PrivateEndpointConnectionsImpl;
import com.azure.resourcemanager.elasticsan.implementation.PrivateLinkResourcesImpl;
import com.azure.resourcemanager.elasticsan.implementation.ResourceProvidersImpl;
import com.azure.resourcemanager.elasticsan.implementation.SkusImpl;
import com.azure.resourcemanager.elasticsan.implementation.VolumeGroupsImpl;
import com.azure.resourcemanager.elasticsan.implementation.VolumeSnapshotsImpl;
import com.azure.resourcemanager.elasticsan.implementation.VolumesImpl;
import com.azure.resourcemanager.elasticsan.models.ElasticSans;
import com.azure.resourcemanager.elasticsan.models.Operations;
import com.azure.resourcemanager.elasticsan.models.PrivateEndpointConnections;
import com.azure.resourcemanager.elasticsan.models.PrivateLinkResources;
import com.azure.resourcemanager.elasticsan.models.ResourceProviders;
import com.azure.resourcemanager.elasticsan.models.Skus;
import com.azure.resourcemanager.elasticsan.models.VolumeGroups;
import com.azure.resourcemanager.elasticsan.models.VolumeSnapshots;
import com.azure.resourcemanager.elasticsan.models.Volumes;
import java.time.Duration;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

/**
 * Entry point to ElasticSanManager.
 */
public final class ElasticSanManager {
    private Operations operations;

    private Skus skus;

    private ElasticSans elasticSans;

    private VolumeGroups volumeGroups;

    private Volumes volumes;

    private ResourceProviders resourceProviders;

    private PrivateEndpointConnections privateEndpointConnections;

    private PrivateLinkResources privateLinkResources;

    private VolumeSnapshots volumeSnapshots;

    private final ElasticSanManagement clientObject;

    private ElasticSanManager(HttpPipeline httpPipeline, AzureProfile profile, Duration defaultPollInterval) {
        Objects.requireNonNull(httpPipeline, "'httpPipeline' cannot be null.");
        Objects.requireNonNull(profile, "'profile' cannot be null.");
        this.clientObject = new ElasticSanManagementBuilder().pipeline(httpPipeline)
            .endpoint(profile.getEnvironment().getResourceManagerEndpoint())
            .subscriptionId(profile.getSubscriptionId())
            .defaultPollInterval(defaultPollInterval)
            .buildClient();
    }

    /**
     * Creates an instance of ElasticSan service API entry point.
     * 
     * @param credential the credential to use.
     * @param profile the Azure profile for client.
     * @return the ElasticSan service API instance.
     */
    public static ElasticSanManager authenticate(TokenCredential credential, AzureProfile profile) {
        Objects.requireNonNull(credential, "'credential' cannot be null.");
        Objects.requireNonNull(profile, "'profile' cannot be null.");
        return configure().authenticate(credential, profile);
    }

    /**
     * Creates an instance of ElasticSan service API entry point.
     * 
     * @param httpPipeline the {@link HttpPipeline} configured with Azure authentication credential.
     * @param profile the Azure profile for client.
     * @return the ElasticSan service API instance.
     */
    public static ElasticSanManager authenticate(HttpPipeline httpPipeline, AzureProfile profile) {
        Objects.requireNonNull(httpPipeline, "'httpPipeline' cannot be null.");
        Objects.requireNonNull(profile, "'profile' cannot be null.");
        return new ElasticSanManager(httpPipeline, profile, null);
    }

    /**
     * Gets a Configurable instance that can be used to create ElasticSanManager with optional configuration.
     * 
     * @return the Configurable instance allowing configurations.
     */
    public static Configurable configure() {
        return new ElasticSanManager.Configurable();
    }

    /**
     * The Configurable allowing configurations to be set.
     */
    public static final class Configurable {
        private static final ClientLogger LOGGER = new ClientLogger(Configurable.class);
        private static final String SDK_VERSION = "version";
        private static final Map<String, String> PROPERTIES
            = CoreUtils.getProperties("azure-resourcemanager-elasticsan.properties");

        private HttpClient httpClient;
        private HttpLogOptions httpLogOptions;
        private final List<HttpPipelinePolicy> policies = new ArrayList<>();
        private final List<String> scopes = new ArrayList<>();
        private RetryPolicy retryPolicy;
        private RetryOptions retryOptions;
        private Duration defaultPollInterval;

        private Configurable() {
        }

        /**
         * Sets the http client.
         *
         * @param httpClient the HTTP client.
         * @return the configurable object itself.
         */
        public Configurable withHttpClient(HttpClient httpClient) {
            this.httpClient = Objects.requireNonNull(httpClient, "'httpClient' cannot be null.");
            return this;
        }

        /**
         * Sets the logging options to the HTTP pipeline.
         *
         * @param httpLogOptions the HTTP log options.
         * @return the configurable object itself.
         */
        public Configurable withLogOptions(HttpLogOptions httpLogOptions) {
            this.httpLogOptions = Objects.requireNonNull(httpLogOptions, "'httpLogOptions' cannot be null.");
            return this;
        }

        /**
         * Adds the pipeline policy to the HTTP pipeline.
         *
         * @param policy the HTTP pipeline policy.
         * @return the configurable object itself.
         */
        public Configurable withPolicy(HttpPipelinePolicy policy) {
            this.policies.add(Objects.requireNonNull(policy, "'policy' cannot be null."));
            return this;
        }

        /**
         * Adds the scope to permission sets.
         *
         * @param scope the scope.
         * @return the configurable object itself.
         */
        public Configurable withScope(String scope) {
            this.scopes.add(Objects.requireNonNull(scope, "'scope' cannot be null."));
            return this;
        }

        /**
         * Sets the retry policy to the HTTP pipeline.
         *
         * @param retryPolicy the HTTP pipeline retry policy.
         * @return the configurable object itself.
         */
        public Configurable withRetryPolicy(RetryPolicy retryPolicy) {
            this.retryPolicy = Objects.requireNonNull(retryPolicy, "'retryPolicy' cannot be null.");
            return this;
        }

        /**
         * Sets the retry options for the HTTP pipeline retry policy.
         * <p>
         * This setting has no effect, if retry policy is set via {@link #withRetryPolicy(RetryPolicy)}.
         *
         * @param retryOptions the retry options for the HTTP pipeline retry policy.
         * @return the configurable object itself.
         */
        public Configurable withRetryOptions(RetryOptions retryOptions) {
            this.retryOptions = Objects.requireNonNull(retryOptions, "'retryOptions' cannot be null.");
            return this;
        }

        /**
         * Sets the default poll interval, used when service does not provide "Retry-After" header.
         *
         * @param defaultPollInterval the default poll interval.
         * @return the configurable object itself.
         */
        public Configurable withDefaultPollInterval(Duration defaultPollInterval) {
            this.defaultPollInterval
                = Objects.requireNonNull(defaultPollInterval, "'defaultPollInterval' cannot be null.");
            if (this.defaultPollInterval.isNegative()) {
                throw LOGGER
                    .logExceptionAsError(new IllegalArgumentException("'defaultPollInterval' cannot be negative"));
            }
            return this;
        }

        /**
         * Creates an instance of ElasticSan service API entry point.
         *
         * @param credential the credential to use.
         * @param profile the Azure profile for client.
         * @return the ElasticSan service API instance.
         */
        public ElasticSanManager authenticate(TokenCredential credential, AzureProfile profile) {
            Objects.requireNonNull(credential, "'credential' cannot be null.");
            Objects.requireNonNull(profile, "'profile' cannot be null.");

            String clientVersion = PROPERTIES.getOrDefault(SDK_VERSION, "UnknownVersion");

            StringBuilder userAgentBuilder = new StringBuilder();
            userAgentBuilder.append("azsdk-java")
                .append("-")
                .append("com.azure.resourcemanager.elasticsan")
                .append("/")
                .append(clientVersion);
            if (!Configuration.getGlobalConfiguration().get("AZURE_TELEMETRY_DISABLED", false)) {
                userAgentBuilder.append(" (")
                    .append(Configuration.getGlobalConfiguration().get("java.version"))
                    .append("; ")
                    .append(Configuration.getGlobalConfiguration().get("os.name"))
                    .append("; ")
                    .append(Configuration.getGlobalConfiguration().get("os.version"))
                    .append("; auto-generated)");
            } else {
                userAgentBuilder.append(" (auto-generated)");
            }

            if (scopes.isEmpty()) {
                scopes.add(profile.getEnvironment().getManagementEndpoint() + "/.default");
            }
            if (retryPolicy == null) {
                if (retryOptions != null) {
                    retryPolicy = new RetryPolicy(retryOptions);
                } else {
                    retryPolicy = new RetryPolicy("Retry-After", ChronoUnit.SECONDS);
                }
            }
            List<HttpPipelinePolicy> policies = new ArrayList<>();
            policies.add(new UserAgentPolicy(userAgentBuilder.toString()));
            policies.add(new AddHeadersFromContextPolicy());
            policies.add(new RequestIdPolicy());
            policies.addAll(this.policies.stream()
                .filter(p -> p.getPipelinePosition() == HttpPipelinePosition.PER_CALL)
                .collect(Collectors.toList()));
            HttpPolicyProviders.addBeforeRetryPolicies(policies);
            policies.add(retryPolicy);
            policies.add(new AddDatePolicy());
            policies.add(new BearerTokenAuthenticationPolicy(credential, scopes.toArray(new String[0])));
            policies.addAll(this.policies.stream()
                .filter(p -> p.getPipelinePosition() == HttpPipelinePosition.PER_RETRY)
                .collect(Collectors.toList()));
            HttpPolicyProviders.addAfterRetryPolicies(policies);
            policies.add(new HttpLoggingPolicy(httpLogOptions));
            HttpPipeline httpPipeline = new HttpPipelineBuilder().httpClient(httpClient)
                .policies(policies.toArray(new HttpPipelinePolicy[0]))
                .build();
            return new ElasticSanManager(httpPipeline, profile, defaultPollInterval);
        }
    }

    /**
     * Gets the resource collection API of Operations.
     * 
     * @return Resource collection API of Operations.
     */
    public Operations operations() {
        if (this.operations == null) {
            this.operations = new OperationsImpl(clientObject.getOperations(), this);
        }
        return operations;
    }

    /**
     * Gets the resource collection API of Skus.
     * 
     * @return Resource collection API of Skus.
     */
    public Skus skus() {
        if (this.skus == null) {
            this.skus = new SkusImpl(clientObject.getSkus(), this);
        }
        return skus;
    }

    /**
     * Gets the resource collection API of ElasticSans. It manages ElasticSan.
     * 
     * @return Resource collection API of ElasticSans.
     */
    public ElasticSans elasticSans() {
        if (this.elasticSans == null) {
            this.elasticSans = new ElasticSansImpl(clientObject.getElasticSans(), this);
        }
        return elasticSans;
    }

    /**
     * Gets the resource collection API of VolumeGroups. It manages VolumeGroup.
     * 
     * @return Resource collection API of VolumeGroups.
     */
    public VolumeGroups volumeGroups() {
        if (this.volumeGroups == null) {
            this.volumeGroups = new VolumeGroupsImpl(clientObject.getVolumeGroups(), this);
        }
        return volumeGroups;
    }

    /**
     * Gets the resource collection API of Volumes. It manages Volume.
     * 
     * @return Resource collection API of Volumes.
     */
    public Volumes volumes() {
        if (this.volumes == null) {
            this.volumes = new VolumesImpl(clientObject.getVolumes(), this);
        }
        return volumes;
    }

    /**
     * Gets the resource collection API of ResourceProviders.
     * 
     * @return Resource collection API of ResourceProviders.
     */
    public ResourceProviders resourceProviders() {
        if (this.resourceProviders == null) {
            this.resourceProviders = new ResourceProvidersImpl(clientObject.getResourceProviders(), this);
        }
        return resourceProviders;
    }

    /**
     * Gets the resource collection API of PrivateEndpointConnections. It manages PrivateEndpointConnection.
     * 
     * @return Resource collection API of PrivateEndpointConnections.
     */
    public PrivateEndpointConnections privateEndpointConnections() {
        if (this.privateEndpointConnections == null) {
            this.privateEndpointConnections
                = new PrivateEndpointConnectionsImpl(clientObject.getPrivateEndpointConnections(), this);
        }
        return privateEndpointConnections;
    }

    /**
     * Gets the resource collection API of PrivateLinkResources.
     * 
     * @return Resource collection API of PrivateLinkResources.
     */
    public PrivateLinkResources privateLinkResources() {
        if (this.privateLinkResources == null) {
            this.privateLinkResources = new PrivateLinkResourcesImpl(clientObject.getPrivateLinkResources(), this);
        }
        return privateLinkResources;
    }

    /**
     * Gets the resource collection API of VolumeSnapshots. It manages Snapshot.
     * 
     * @return Resource collection API of VolumeSnapshots.
     */
    public VolumeSnapshots volumeSnapshots() {
        if (this.volumeSnapshots == null) {
            this.volumeSnapshots = new VolumeSnapshotsImpl(clientObject.getVolumeSnapshots(), this);
        }
        return volumeSnapshots;
    }

    /**
     * Gets wrapped service client ElasticSanManagement providing direct access to the underlying auto-generated API
     * implementation, based on Azure REST API.
     * 
     * @return Wrapped service client ElasticSanManagement.
     */
    public ElasticSanManagement serviceClient() {
        return this.clientObject;
    }
}
