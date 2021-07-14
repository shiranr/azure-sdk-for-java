// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security;

import com.azure.core.util.Context;

/** Samples for ExternalSecuritySolutions Get. */
public final class ExternalSecuritySolutionsGetSamples {
    /**
     * Sample code: Get external security solution.
     *
     * @param securityManager Entry point to SecurityManager. API spec for Microsoft.Security (Azure Security Center)
     *     resource provider.
     */
    public static void getExternalSecuritySolution(com.azure.resourcemanager.security.SecurityManager securityManager) {
        securityManager
            .externalSecuritySolutions()
            .getWithResponse(
                "defaultresourcegroup-eus",
                "centralus",
                "aad_defaultworkspace-20ff7fc3-e762-44dd-bd96-b71116dcdc23-eus",
                Context.NONE);
    }
}