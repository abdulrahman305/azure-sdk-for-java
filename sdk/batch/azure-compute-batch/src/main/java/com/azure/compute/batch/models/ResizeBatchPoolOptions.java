// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
package com.azure.compute.batch.models;

import com.azure.core.http.RequestConditions;

/**
 * Optional parameters for changing the number of Compute Nodes that are assigned to a Batch Pool.
 */
public class ResizeBatchPoolOptions extends BatchBaseOptions {
    private RequestConditions requestConditions;

    /**
     * Creates an instance of {@link ResizeBatchPoolOptions}.
     */
    public ResizeBatchPoolOptions() {
    }

    /**
     * Gets the HTTP options for conditional requests based on modification time.
     *
     * <p>The request conditions allow you to specify conditions that must be met for the request to be processed.
     *
     * @return The HTTP options for conditional requests.
     */
    public RequestConditions getRequestConditions() {
        return requestConditions;
    }

    /**
     * Sets the HTTP options for conditional requests based on modification time.
     *
     * <p>The request conditions allow you to specify conditions that must be met for the request to be processed.
     *
     * @param requestConditions The HTTP options for conditional requests.
     * @return The {@link ResizeBatchPoolOptions} object itself, allowing for method chaining.
     */
    public ResizeBatchPoolOptions setRequestConditions(RequestConditions requestConditions) {
        this.requestConditions = requestConditions;
        return this;
    }

}
