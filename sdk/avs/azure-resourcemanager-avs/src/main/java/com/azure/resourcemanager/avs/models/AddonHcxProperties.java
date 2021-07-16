// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.avs.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** The properties of an HCX addon. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "addonType")
@JsonTypeName("HCX")
@Fluent
public final class AddonHcxProperties extends AddonProperties {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(AddonHcxProperties.class);

    /*
     * The HCX offer, example VMware MaaS Cloud Provider (Enterprise)
     */
    @JsonProperty(value = "offer", required = true)
    private String offer;

    /**
     * Get the offer property: The HCX offer, example VMware MaaS Cloud Provider (Enterprise).
     *
     * @return the offer value.
     */
    public String offer() {
        return this.offer;
    }

    /**
     * Set the offer property: The HCX offer, example VMware MaaS Cloud Provider (Enterprise).
     *
     * @param offer the offer value to set.
     * @return the AddonHcxProperties object itself.
     */
    public AddonHcxProperties withOffer(String offer) {
        this.offer = offer;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (offer() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property offer in model AddonHcxProperties"));
        }
    }
}