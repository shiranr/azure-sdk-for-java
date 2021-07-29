// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** CosmosDB (MongoDB API) database dataset properties. */
@Fluent
public final class CosmosDbMongoDbApiCollectionDatasetTypeProperties {
    @JsonIgnore
    private final ClientLogger logger = new ClientLogger(CosmosDbMongoDbApiCollectionDatasetTypeProperties.class);

    /*
     * The collection name of the CosmosDB (MongoDB API) database. Type: string
     * (or Expression with resultType string).
     */
    @JsonProperty(value = "collection", required = true)
    private Object collection;

    /**
     * Get the collection property: The collection name of the CosmosDB (MongoDB API) database. Type: string (or
     * Expression with resultType string).
     *
     * @return the collection value.
     */
    public Object collection() {
        return this.collection;
    }

    /**
     * Set the collection property: The collection name of the CosmosDB (MongoDB API) database. Type: string (or
     * Expression with resultType string).
     *
     * @param collection the collection value to set.
     * @return the CosmosDbMongoDbApiCollectionDatasetTypeProperties object itself.
     */
    public CosmosDbMongoDbApiCollectionDatasetTypeProperties withCollection(Object collection) {
        this.collection = collection;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (collection() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property collection in model"
                            + " CosmosDbMongoDbApiCollectionDatasetTypeProperties"));
        }
    }
}