// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.network.fluent.models.ServiceTagInformationInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Response for Get ServiceTagInformation API service call. Retrieves the list of service tag information resources. */
@Fluent
public final class ServiceTagInformationListResult {
    /*
     * The list of service tag information resources.
     */
    @JsonProperty(value = "value")
    private List<ServiceTagInformationInner> value;

    /*
     * The URL to get the next set of results.
     */
    @JsonProperty(value = "nextLink", access = JsonProperty.Access.WRITE_ONLY)
    private String nextLink;

    /**
     * Get the value property: The list of service tag information resources.
     *
     * @return the value value.
     */
    public List<ServiceTagInformationInner> value() {
        return this.value;
    }

    /**
     * Set the value property: The list of service tag information resources.
     *
     * @param value the value value to set.
     * @return the ServiceTagInformationListResult object itself.
     */
    public ServiceTagInformationListResult withValue(List<ServiceTagInformationInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: The URL to get the next set of results.
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
