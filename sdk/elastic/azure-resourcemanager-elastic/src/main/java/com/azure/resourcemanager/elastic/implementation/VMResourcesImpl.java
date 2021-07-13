// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.elastic.implementation;

import com.azure.resourcemanager.elastic.fluent.models.VMResourcesInner;
import com.azure.resourcemanager.elastic.models.VMResources;

public final class VMResourcesImpl implements VMResources {
    private VMResourcesInner innerObject;

    private final com.azure.resourcemanager.elastic.ElasticManager serviceManager;

    VMResourcesImpl(VMResourcesInner innerObject, com.azure.resourcemanager.elastic.ElasticManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String vmResourceId() {
        return this.innerModel().vmResourceId();
    }

    public VMResourcesInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.elastic.ElasticManager manager() {
        return this.serviceManager;
    }
}