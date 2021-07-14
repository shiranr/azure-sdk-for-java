// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.models;

import com.azure.resourcemanager.security.fluent.models.IngestionSettingTokenInner;

/** An immutable client-side representation of IngestionSettingToken. */
public interface IngestionSettingToken {
    /**
     * Gets the token property: The token is used for correlating security data and logs with the resources in the
     * subscription.
     *
     * @return the token value.
     */
    String token();

    /**
     * Gets the inner com.azure.resourcemanager.security.fluent.models.IngestionSettingTokenInner object.
     *
     * @return the inner object.
     */
    IngestionSettingTokenInner innerModel();
}