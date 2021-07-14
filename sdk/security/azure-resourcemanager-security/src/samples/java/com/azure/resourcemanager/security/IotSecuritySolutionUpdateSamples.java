// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security;

import com.azure.core.util.Context;
import com.azure.resourcemanager.security.models.IoTSecuritySolutionModel;
import com.azure.resourcemanager.security.models.RecommendationConfigStatus;
import com.azure.resourcemanager.security.models.RecommendationConfigurationProperties;
import com.azure.resourcemanager.security.models.RecommendationType;
import com.azure.resourcemanager.security.models.UserDefinedResourcesProperties;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/** Samples for IotSecuritySolution Update. */
public final class IotSecuritySolutionUpdateSamples {
    /**
     * Sample code: Use this method to update existing IoT Security solution.
     *
     * @param securityManager Entry point to SecurityManager. API spec for Microsoft.Security (Azure Security Center)
     *     resource provider.
     */
    public static void useThisMethodToUpdateExistingIoTSecuritySolution(
        com.azure.resourcemanager.security.SecurityManager securityManager) {
        IoTSecuritySolutionModel resource =
            securityManager
                .iotSecuritySolutions()
                .getByResourceGroupWithResponse("myRg", "default", Context.NONE)
                .getValue();
        resource
            .update()
            .withTags(mapOf("foo", "bar"))
            .withUserDefinedResources(
                new UserDefinedResourcesProperties()
                    .withQuery("where type != \"microsoft.devices/iothubs\" | where name contains \"v2\"")
                    .withQuerySubscriptions(Arrays.asList("075423e9-7d33-4166-8bdf-3920b04e3735")))
            .withRecommendationsConfiguration(
                Arrays
                    .asList(
                        new RecommendationConfigurationProperties()
                            .withRecommendationType(RecommendationType.IO_T_OPEN_PORTS)
                            .withStatus(RecommendationConfigStatus.DISABLED),
                        new RecommendationConfigurationProperties()
                            .withRecommendationType(RecommendationType.IO_T_SHARED_CREDENTIALS)
                            .withStatus(RecommendationConfigStatus.DISABLED)))
            .apply();
    }

    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}