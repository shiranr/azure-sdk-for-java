// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory;

import com.azure.core.util.Context;

/** Samples for TriggerRuns Rerun. */
public final class TriggerRunsRerunSamples {
    /**
     * Sample code: Triggers_Rerun.
     *
     * @param dataFactoryManager Entry point to DataFactoryManager. The Azure Data Factory V2 management API provides a
     *     RESTful set of web services that interact with Azure Data Factory V2 services.
     */
    public static void triggersRerun(com.azure.resourcemanager.datafactory.DataFactoryManager dataFactoryManager) {
        dataFactoryManager
            .triggerRuns()
            .rerunWithResponse(
                "exampleResourceGroup",
                "exampleFactoryName",
                "exampleTrigger",
                "2f7fdb90-5df1-4b8e-ac2f-064cfa58202b",
                Context.NONE);
    }
}