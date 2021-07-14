// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security;

import com.azure.core.util.Context;

/** Samples for Alerts ListResourceGroupLevelByRegion. */
public final class AlertsListResourceGroupLevelByRegionSamples {
    /**
     * Sample code: Get security alerts on a resource group from a security data location.
     *
     * @param securityManager Entry point to SecurityManager. API spec for Microsoft.Security (Azure Security Center)
     *     resource provider.
     */
    public static void getSecurityAlertsOnAResourceGroupFromASecurityDataLocation(
        com.azure.resourcemanager.security.SecurityManager securityManager) {
        securityManager.alerts().listResourceGroupLevelByRegion("westeurope", "myRg1", Context.NONE);
    }
}