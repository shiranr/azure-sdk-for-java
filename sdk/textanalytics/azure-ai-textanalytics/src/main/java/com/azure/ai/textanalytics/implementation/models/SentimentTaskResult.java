// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.textanalytics.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The SentimentTaskResult model. */
@Fluent
public class SentimentTaskResult {
    /*
     * The results property.
     */
    @JsonProperty(value = "results")
    private SentimentResponse results;

    /**
     * Get the results property: The results property.
     *
     * @return the results value.
     */
    public SentimentResponse getResults() {
        return this.results;
    }

    /**
     * Set the results property: The results property.
     *
     * @param results the results value to set.
     * @return the SentimentTaskResult object itself.
     */
    public SentimentTaskResult setResults(SentimentResponse results) {
        this.results = results;
        return this;
    }
}