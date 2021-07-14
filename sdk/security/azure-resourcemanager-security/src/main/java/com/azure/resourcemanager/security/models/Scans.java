// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.models;

import com.azure.resourcemanager.security.fluent.models.ScansInner;
import java.util.List;

/** An immutable client-side representation of Scans. */
public interface Scans {
    /**
     * Gets the value property: List of vulnerability assessment scan records.
     *
     * @return the value value.
     */
    List<Scan> value();

    /**
     * Gets the inner com.azure.resourcemanager.security.fluent.models.ScansInner object.
     *
     * @return the inner object.
     */
    ScansInner innerModel();
}