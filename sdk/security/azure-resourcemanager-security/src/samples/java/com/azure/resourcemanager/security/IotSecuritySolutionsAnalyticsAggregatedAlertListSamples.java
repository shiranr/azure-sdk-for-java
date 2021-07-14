// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security;

import com.azure.core.util.Context;

/** Samples for IotSecuritySolutionsAnalyticsAggregatedAlert List. */
public final class IotSecuritySolutionsAnalyticsAggregatedAlertListSamples {
    /**
     * Sample code: Get the aggregated alert list of yours IoT Security solution.
     *
     * @param securityManager Entry point to SecurityManager. API spec for Microsoft.Security (Azure Security Center)
     *     resource provider.
     */
    public static void getTheAggregatedAlertListOfYoursIoTSecuritySolution(
        com.azure.resourcemanager.security.SecurityManager securityManager) {
        securityManager.iotSecuritySolutionsAnalyticsAggregatedAlerts().list("MyGroup", "default", null, Context.NONE);
    }
}