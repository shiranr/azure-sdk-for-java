// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.avs;

import com.azure.core.util.Context;

/** Samples for GlobalReachConnections List. */
public final class GlobalReachConnectionsListSamples {
    /**
     * Sample code: GlobalReachConnections_List.
     *
     * @param avsManager Entry point to AvsManager. Azure VMware Solution API.
     */
    public static void globalReachConnectionsList(com.azure.resourcemanager.avs.AvsManager avsManager) {
        avsManager.globalReachConnections().list("group1", "cloud1", Context.NONE);
    }
}