// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security;

import com.azure.core.util.Context;
import com.azure.resourcemanager.security.fluent.models.PricingInner;
import com.azure.resourcemanager.security.models.PricingTier;

/** Samples for Pricings Update. */
public final class PricingsUpdateSamples {
    /**
     * Sample code: Update pricing on subscription.
     *
     * @param securityManager Entry point to SecurityManager. API spec for Microsoft.Security (Azure Security Center)
     *     resource provider.
     */
    public static void updatePricingOnSubscription(com.azure.resourcemanager.security.SecurityManager securityManager) {
        securityManager
            .pricings()
            .updateWithResponse(
                "VirtualMachines", new PricingInner().withPricingTier(PricingTier.STANDARD), Context.NONE);
    }
}