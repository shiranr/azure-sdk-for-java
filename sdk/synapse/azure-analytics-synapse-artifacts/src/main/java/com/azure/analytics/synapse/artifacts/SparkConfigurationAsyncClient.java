// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.artifacts;

import com.azure.analytics.synapse.artifacts.implementation.SparkConfigurationsImpl;
import com.azure.analytics.synapse.artifacts.models.ArtifactRenameRequest;
import com.azure.analytics.synapse.artifacts.models.CloudErrorException;
import com.azure.analytics.synapse.artifacts.models.SparkConfigurationResource;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceClient;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedFlux;
import com.azure.core.http.rest.PagedResponse;
import com.azure.core.http.rest.Response;
import reactor.core.publisher.Mono;

/** Initializes a new instance of the asynchronous ArtifactsClient type. */
@ServiceClient(builder = ArtifactsClientBuilder.class, isAsync = true)
public final class SparkConfigurationAsyncClient {
    private final SparkConfigurationsImpl serviceClient;

    /**
     * Initializes an instance of SparkConfigurations client.
     *
     * @param serviceClient the service client implementation.
     */
    SparkConfigurationAsyncClient(SparkConfigurationsImpl serviceClient) {
        this.serviceClient = serviceClient;
    }

    /**
     * Lists sparkconfigurations.
     *
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of sparkconfiguration resources.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public Mono<PagedResponse<SparkConfigurationResource>> getSparkConfigurationsByWorkspaceSinglePage() {
        return this.serviceClient.getSparkConfigurationsByWorkspaceSinglePageAsync();
    }

    /**
     * Lists sparkconfigurations.
     *
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of sparkconfiguration resources.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<SparkConfigurationResource> getSparkConfigurationsByWorkspace() {
        return this.serviceClient.getSparkConfigurationsByWorkspaceAsync();
    }

    /**
     * Creates or updates a sparkconfiguration.
     *
     * @param sparkConfigurationName The spark Configuration name.
     * @param sparkConfiguration SparkConfiguration resource definition.
     * @param ifMatch ETag of the sparkConfiguration entity. Should only be specified for update, for which it should
     *     match existing entity or can be * for unconditional update.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return spark Configuration resource type.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<SparkConfigurationResource>> createOrUpdateSparkConfigurationWithResponse(
            String sparkConfigurationName, SparkConfigurationResource sparkConfiguration, String ifMatch) {
        return this.serviceClient.createOrUpdateSparkConfigurationWithResponseAsync(
                sparkConfigurationName, sparkConfiguration, ifMatch);
    }

    /**
     * Creates or updates a sparkconfiguration.
     *
     * @param sparkConfigurationName The spark Configuration name.
     * @param sparkConfiguration SparkConfiguration resource definition.
     * @param ifMatch ETag of the sparkConfiguration entity. Should only be specified for update, for which it should
     *     match existing entity or can be * for unconditional update.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return spark Configuration resource type.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SparkConfigurationResource> createOrUpdateSparkConfiguration(
            String sparkConfigurationName, SparkConfigurationResource sparkConfiguration, String ifMatch) {
        return this.serviceClient.createOrUpdateSparkConfigurationAsync(
                sparkConfigurationName, sparkConfiguration, ifMatch);
    }

    /**
     * Creates or updates a sparkconfiguration.
     *
     * @param sparkConfigurationName The spark Configuration name.
     * @param sparkConfiguration SparkConfiguration resource definition.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return spark Configuration resource type.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SparkConfigurationResource> createOrUpdateSparkConfiguration(
            String sparkConfigurationName, SparkConfigurationResource sparkConfiguration) {
        return this.serviceClient.createOrUpdateSparkConfigurationAsync(sparkConfigurationName, sparkConfiguration);
    }

    /**
     * Gets a sparkConfiguration.
     *
     * @param sparkConfigurationName The spark Configuration name.
     * @param ifNoneMatch ETag of the sparkConfiguration entity. Should only be specified for get. If the ETag matches
     *     the existing entity tag, or if * was provided, then no content will be returned.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a sparkConfiguration.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<SparkConfigurationResource>> getSparkConfigurationWithResponse(
            String sparkConfigurationName, String ifNoneMatch) {
        return this.serviceClient.getSparkConfigurationWithResponseAsync(sparkConfigurationName, ifNoneMatch);
    }

    /**
     * Gets a sparkConfiguration.
     *
     * @param sparkConfigurationName The spark Configuration name.
     * @param ifNoneMatch ETag of the sparkConfiguration entity. Should only be specified for get. If the ETag matches
     *     the existing entity tag, or if * was provided, then no content will be returned.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a sparkConfiguration.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SparkConfigurationResource> getSparkConfiguration(String sparkConfigurationName, String ifNoneMatch) {
        return this.serviceClient.getSparkConfigurationAsync(sparkConfigurationName, ifNoneMatch);
    }

    /**
     * Gets a sparkConfiguration.
     *
     * @param sparkConfigurationName The spark Configuration name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a sparkConfiguration.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SparkConfigurationResource> getSparkConfiguration(String sparkConfigurationName) {
        return this.serviceClient.getSparkConfigurationAsync(sparkConfigurationName);
    }

    /**
     * Deletes a sparkConfiguration.
     *
     * @param sparkConfigurationName The spark Configuration name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> deleteSparkConfigurationWithResponse(String sparkConfigurationName) {
        return this.serviceClient.deleteSparkConfigurationWithResponseAsync(sparkConfigurationName);
    }

    /**
     * Deletes a sparkConfiguration.
     *
     * @param sparkConfigurationName The spark Configuration name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> deleteSparkConfiguration(String sparkConfigurationName) {
        return this.serviceClient.deleteSparkConfigurationAsync(sparkConfigurationName);
    }

    /**
     * Renames a sparkConfiguration.
     *
     * @param sparkConfigurationName The spark Configuration name.
     * @param request proposed new name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> renameSparkConfigurationWithResponse(
            String sparkConfigurationName, ArtifactRenameRequest request) {
        return this.serviceClient.renameSparkConfigurationWithResponseAsync(sparkConfigurationName, request);
    }

    /**
     * Renames a sparkConfiguration.
     *
     * @param sparkConfigurationName The spark Configuration name.
     * @param request proposed new name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> renameSparkConfiguration(String sparkConfigurationName, ArtifactRenameRequest request) {
        return this.serviceClient.renameSparkConfigurationAsync(sparkConfigurationName, request);
    }

    /**
     * Get the next page of items.
     *
     * @param nextLink The nextLink parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of sparkconfiguration resources.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public Mono<PagedResponse<SparkConfigurationResource>> getSparkConfigurationsByWorkspaceNextSinglePage(
            String nextLink) {
        return this.serviceClient.getSparkConfigurationsByWorkspaceNextSinglePageAsync(nextLink);
    }
}