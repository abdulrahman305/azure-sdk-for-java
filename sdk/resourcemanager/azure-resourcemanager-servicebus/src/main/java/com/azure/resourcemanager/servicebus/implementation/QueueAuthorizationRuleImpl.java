// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.resourcemanager.servicebus.implementation;

import com.azure.resourcemanager.servicebus.ServiceBusManager;
import com.azure.resourcemanager.servicebus.fluent.models.AccessKeysInner;
import com.azure.resourcemanager.servicebus.fluent.models.SBAuthorizationRuleInner;
import com.azure.resourcemanager.servicebus.models.RegenerateAccessKeyParameters;
import com.azure.resourcemanager.servicebus.models.QueueAuthorizationRule;
import reactor.core.publisher.Mono;

/**
 * Implementation for QueueAuthorizationRule.
 */
class QueueAuthorizationRuleImpl extends
    AuthorizationRuleBaseImpl<QueueAuthorizationRule, QueueImpl, SBAuthorizationRuleInner, QueueAuthorizationRuleImpl, ServiceBusManager>
    implements QueueAuthorizationRule, QueueAuthorizationRule.Definition, QueueAuthorizationRule.Update {
    private final String namespaceName;

    QueueAuthorizationRuleImpl(String resourceGroupName, String namespaceName, String queueName, String name,
        SBAuthorizationRuleInner inner, ServiceBusManager manager) {
        super(name, inner, manager);
        this.namespaceName = namespaceName;
        this.withExistingParentResource(resourceGroupName, queueName);
    }

    @Override
    public String namespaceName() {
        return this.namespaceName;
    }

    @Override
    public String queueName() {
        return this.parentName;
    }

    @Override
    protected Mono<SBAuthorizationRuleInner> getInnerAsync() {
        return this.manager()
            .serviceClient()
            .getQueues()
            .getAuthorizationRuleAsync(this.resourceGroupName(), this.namespaceName(), this.queueName(), this.name());
    }

    @Override
    protected Mono<QueueAuthorizationRule> createChildResourceAsync() {
        final QueueAuthorizationRule self = this;
        return this.manager()
            .serviceClient()
            .getQueues()
            .createOrUpdateAuthorizationRuleAsync(this.resourceGroupName(), this.namespaceName(), this.queueName(),
                this.name(), this.innerModel())
            .map(inner -> {
                setInner(inner);
                return self;
            });
    }

    @Override
    protected Mono<AccessKeysInner> getKeysInnerAsync() {
        return this.manager()
            .serviceClient()
            .getQueues()
            .listKeysAsync(this.resourceGroupName(), this.namespaceName(), this.queueName(), this.name());
    }

    @Override
    protected Mono<AccessKeysInner>
        regenerateKeysInnerAsync(RegenerateAccessKeyParameters regenerateAccessKeyParameters) {
        return this.manager()
            .serviceClient()
            .getQueues()
            .regenerateKeysAsync(this.resourceGroupName(), this.namespaceName(), this.queueName(), this.name(),
                regenerateAccessKeyParameters);
    }
}
