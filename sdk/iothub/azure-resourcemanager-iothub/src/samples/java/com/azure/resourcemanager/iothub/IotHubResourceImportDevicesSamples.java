// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.iothub;

import com.azure.core.util.Context;
import com.azure.resourcemanager.iothub.models.ImportDevicesRequest;

/** Samples for IotHubResource ImportDevices. */
public final class IotHubResourceImportDevicesSamples {
    /**
     * Sample code: IotHubResource_ImportDevices.
     *
     * @param iotHubManager Entry point to IotHubManager. Use this API to manage the IoT hubs in your Azure
     *     subscription.
     */
    public static void iotHubResourceImportDevices(com.azure.resourcemanager.iothub.IotHubManager iotHubManager) {
        iotHubManager
            .iotHubResources()
            .importDevicesWithResponse(
                "myResourceGroup",
                "testHub",
                new ImportDevicesRequest().withInputBlobContainerUri("testBlob").withOutputBlobContainerUri("testBlob"),
                Context.NONE);
    }
}