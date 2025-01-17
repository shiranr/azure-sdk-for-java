// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resources.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.resources.fluent.models.DeploymentOperationInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** List of deployment operations. */
@Fluent
public final class DeploymentOperationsListResult {
    /*
     * An array of deployment operations.
     */
    @JsonProperty(value = "value")
    private List<DeploymentOperationInner> value;

    /*
     * The URL to use for getting the next set of results.
     */
    @JsonProperty(value = "nextLink", access = JsonProperty.Access.WRITE_ONLY)
    private String nextLink;

    /**
     * Get the value property: An array of deployment operations.
     *
     * @return the value value.
     */
    public List<DeploymentOperationInner> value() {
        return this.value;
    }

    /**
     * Set the value property: An array of deployment operations.
     *
     * @param value the value value to set.
     * @return the DeploymentOperationsListResult object itself.
     */
    public DeploymentOperationsListResult withValue(List<DeploymentOperationInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: The URL to use for getting the next set of results.
     *
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() != null) {
            value().forEach(e -> e.validate());
        }
    }
}
