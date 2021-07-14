// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The JitNetworkAccessPortRule model. */
@Fluent
public final class JitNetworkAccessPortRule {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(JitNetworkAccessPortRule.class);

    /*
     * The number property.
     */
    @JsonProperty(value = "number", required = true)
    private int number;

    /*
     * The protocol property.
     */
    @JsonProperty(value = "protocol", required = true)
    private ProtocolValue protocol;

    /*
     * Mutually exclusive with the "allowedSourceAddressPrefixes" parameter.
     * Should be an IP address or CIDR, for example "192.168.0.3" or
     * "192.168.0.0/16".
     */
    @JsonProperty(value = "allowedSourceAddressPrefix")
    private String allowedSourceAddressPrefix;

    /*
     * Mutually exclusive with the "allowedSourceAddressPrefix" parameter.
     */
    @JsonProperty(value = "allowedSourceAddressPrefixes")
    private List<String> allowedSourceAddressPrefixes;

    /*
     * Maximum duration requests can be made for. In ISO 8601 duration format.
     * Minimum 5 minutes, maximum 1 day
     */
    @JsonProperty(value = "maxRequestAccessDuration", required = true)
    private String maxRequestAccessDuration;

    /**
     * Get the number property: The number property.
     *
     * @return the number value.
     */
    public int number() {
        return this.number;
    }

    /**
     * Set the number property: The number property.
     *
     * @param number the number value to set.
     * @return the JitNetworkAccessPortRule object itself.
     */
    public JitNetworkAccessPortRule withNumber(int number) {
        this.number = number;
        return this;
    }

    /**
     * Get the protocol property: The protocol property.
     *
     * @return the protocol value.
     */
    public ProtocolValue protocol() {
        return this.protocol;
    }

    /**
     * Set the protocol property: The protocol property.
     *
     * @param protocol the protocol value to set.
     * @return the JitNetworkAccessPortRule object itself.
     */
    public JitNetworkAccessPortRule withProtocol(ProtocolValue protocol) {
        this.protocol = protocol;
        return this;
    }

    /**
     * Get the allowedSourceAddressPrefix property: Mutually exclusive with the "allowedSourceAddressPrefixes"
     * parameter. Should be an IP address or CIDR, for example "192.168.0.3" or "192.168.0.0/16".
     *
     * @return the allowedSourceAddressPrefix value.
     */
    public String allowedSourceAddressPrefix() {
        return this.allowedSourceAddressPrefix;
    }

    /**
     * Set the allowedSourceAddressPrefix property: Mutually exclusive with the "allowedSourceAddressPrefixes"
     * parameter. Should be an IP address or CIDR, for example "192.168.0.3" or "192.168.0.0/16".
     *
     * @param allowedSourceAddressPrefix the allowedSourceAddressPrefix value to set.
     * @return the JitNetworkAccessPortRule object itself.
     */
    public JitNetworkAccessPortRule withAllowedSourceAddressPrefix(String allowedSourceAddressPrefix) {
        this.allowedSourceAddressPrefix = allowedSourceAddressPrefix;
        return this;
    }

    /**
     * Get the allowedSourceAddressPrefixes property: Mutually exclusive with the "allowedSourceAddressPrefix"
     * parameter.
     *
     * @return the allowedSourceAddressPrefixes value.
     */
    public List<String> allowedSourceAddressPrefixes() {
        return this.allowedSourceAddressPrefixes;
    }

    /**
     * Set the allowedSourceAddressPrefixes property: Mutually exclusive with the "allowedSourceAddressPrefix"
     * parameter.
     *
     * @param allowedSourceAddressPrefixes the allowedSourceAddressPrefixes value to set.
     * @return the JitNetworkAccessPortRule object itself.
     */
    public JitNetworkAccessPortRule withAllowedSourceAddressPrefixes(List<String> allowedSourceAddressPrefixes) {
        this.allowedSourceAddressPrefixes = allowedSourceAddressPrefixes;
        return this;
    }

    /**
     * Get the maxRequestAccessDuration property: Maximum duration requests can be made for. In ISO 8601 duration
     * format. Minimum 5 minutes, maximum 1 day.
     *
     * @return the maxRequestAccessDuration value.
     */
    public String maxRequestAccessDuration() {
        return this.maxRequestAccessDuration;
    }

    /**
     * Set the maxRequestAccessDuration property: Maximum duration requests can be made for. In ISO 8601 duration
     * format. Minimum 5 minutes, maximum 1 day.
     *
     * @param maxRequestAccessDuration the maxRequestAccessDuration value to set.
     * @return the JitNetworkAccessPortRule object itself.
     */
    public JitNetworkAccessPortRule withMaxRequestAccessDuration(String maxRequestAccessDuration) {
        this.maxRequestAccessDuration = maxRequestAccessDuration;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (protocol() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property protocol in model JitNetworkAccessPortRule"));
        }
        if (maxRequestAccessDuration() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property maxRequestAccessDuration in model JitNetworkAccessPortRule"));
        }
    }
}