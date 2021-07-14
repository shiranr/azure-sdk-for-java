// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security;

import com.azure.core.util.Context;

/** Samples for DiscoveredSecuritySolutions Get. */
public final class DiscoveredSecuritySolutionsGetSamples {
    /**
     * Sample code: Get discovered security solution from a security data location.
     *
     * @param securityManager Entry point to SecurityManager. API spec for Microsoft.Security (Azure Security Center)
     *     resource provider.
     */
    public static void getDiscoveredSecuritySolutionFromASecurityDataLocation(
        com.azure.resourcemanager.security.SecurityManager securityManager) {
        securityManager.discoveredSecuritySolutions().getWithResponse("myRg2", "centralus", "paloalto7", Context.NONE);
    }
}