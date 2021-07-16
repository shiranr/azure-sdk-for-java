// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.avs;

import com.azure.core.util.Context;

/** Samples for Clusters Delete. */
public final class ClustersDeleteSamples {
    /**
     * Sample code: Clusters_Delete.
     *
     * @param avsManager Entry point to AvsManager. Azure VMware Solution API.
     */
    public static void clustersDelete(com.azure.resourcemanager.avs.AvsManager avsManager) {
        avsManager.clusters().delete("group1", "cloud1", "cluster1", Context.NONE);
    }
}