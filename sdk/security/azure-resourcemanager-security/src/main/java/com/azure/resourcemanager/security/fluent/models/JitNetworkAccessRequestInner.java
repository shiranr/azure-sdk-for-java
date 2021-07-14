// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.security.models.JitNetworkAccessRequestVirtualMachine;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.List;

/** The JitNetworkAccessRequest model. */
@Fluent
public final class JitNetworkAccessRequestInner {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(JitNetworkAccessRequestInner.class);

    /*
     * The virtualMachines property.
     */
    @JsonProperty(value = "virtualMachines", required = true)
    private List<JitNetworkAccessRequestVirtualMachine> virtualMachines;

    /*
     * The start time of the request in UTC
     */
    @JsonProperty(value = "startTimeUtc", required = true)
    private OffsetDateTime startTimeUtc;

    /*
     * The identity of the person who made the request
     */
    @JsonProperty(value = "requestor", required = true)
    private String requestor;

    /*
     * The justification for making the initiate request
     */
    @JsonProperty(value = "justification")
    private String justification;

    /**
     * Get the virtualMachines property: The virtualMachines property.
     *
     * @return the virtualMachines value.
     */
    public List<JitNetworkAccessRequestVirtualMachine> virtualMachines() {
        return this.virtualMachines;
    }

    /**
     * Set the virtualMachines property: The virtualMachines property.
     *
     * @param virtualMachines the virtualMachines value to set.
     * @return the JitNetworkAccessRequestInner object itself.
     */
    public JitNetworkAccessRequestInner withVirtualMachines(
        List<JitNetworkAccessRequestVirtualMachine> virtualMachines) {
        this.virtualMachines = virtualMachines;
        return this;
    }

    /**
     * Get the startTimeUtc property: The start time of the request in UTC.
     *
     * @return the startTimeUtc value.
     */
    public OffsetDateTime startTimeUtc() {
        return this.startTimeUtc;
    }

    /**
     * Set the startTimeUtc property: The start time of the request in UTC.
     *
     * @param startTimeUtc the startTimeUtc value to set.
     * @return the JitNetworkAccessRequestInner object itself.
     */
    public JitNetworkAccessRequestInner withStartTimeUtc(OffsetDateTime startTimeUtc) {
        this.startTimeUtc = startTimeUtc;
        return this;
    }

    /**
     * Get the requestor property: The identity of the person who made the request.
     *
     * @return the requestor value.
     */
    public String requestor() {
        return this.requestor;
    }

    /**
     * Set the requestor property: The identity of the person who made the request.
     *
     * @param requestor the requestor value to set.
     * @return the JitNetworkAccessRequestInner object itself.
     */
    public JitNetworkAccessRequestInner withRequestor(String requestor) {
        this.requestor = requestor;
        return this;
    }

    /**
     * Get the justification property: The justification for making the initiate request.
     *
     * @return the justification value.
     */
    public String justification() {
        return this.justification;
    }

    /**
     * Set the justification property: The justification for making the initiate request.
     *
     * @param justification the justification value to set.
     * @return the JitNetworkAccessRequestInner object itself.
     */
    public JitNetworkAccessRequestInner withJustification(String justification) {
        this.justification = justification;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (virtualMachines() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property virtualMachines in model JitNetworkAccessRequestInner"));
        } else {
            virtualMachines().forEach(e -> e.validate());
        }
        if (startTimeUtc() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property startTimeUtc in model JitNetworkAccessRequestInner"));
        }
        if (requestor() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property requestor in model JitNetworkAccessRequestInner"));
        }
    }
}