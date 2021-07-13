// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.postgresqlflexibleserver.fluent;

import com.azure.core.http.HttpPipeline;
import java.time.Duration;

/** The interface for PostgreSqlManagementClient class. */
public interface PostgreSqlManagementClient {
    /**
     * Gets The ID of the target subscription.
     *
     * @return the subscriptionId value.
     */
    String getSubscriptionId();

    /**
     * Gets server parameter.
     *
     * @return the endpoint value.
     */
    String getEndpoint();

    /**
     * Gets Api Version.
     *
     * @return the apiVersion value.
     */
    String getApiVersion();

    /**
     * Gets The HTTP pipeline to send requests through.
     *
     * @return the httpPipeline value.
     */
    HttpPipeline getHttpPipeline();

    /**
     * Gets The default poll interval for long-running operation.
     *
     * @return the defaultPollInterval value.
     */
    Duration getDefaultPollInterval();

    /**
     * Gets the ServersClient object to access its operations.
     *
     * @return the ServersClient object.
     */
    ServersClient getServers();

    /**
     * Gets the FirewallRulesClient object to access its operations.
     *
     * @return the FirewallRulesClient object.
     */
    FirewallRulesClient getFirewallRules();

    /**
     * Gets the ConfigurationsClient object to access its operations.
     *
     * @return the ConfigurationsClient object.
     */
    ConfigurationsClient getConfigurations();

    /**
     * Gets the CheckNameAvailabilitiesClient object to access its operations.
     *
     * @return the CheckNameAvailabilitiesClient object.
     */
    CheckNameAvailabilitiesClient getCheckNameAvailabilities();

    /**
     * Gets the LocationBasedCapabilitiesClient object to access its operations.
     *
     * @return the LocationBasedCapabilitiesClient object.
     */
    LocationBasedCapabilitiesClient getLocationBasedCapabilities();

    /**
     * Gets the VirtualNetworkSubnetUsagesClient object to access its operations.
     *
     * @return the VirtualNetworkSubnetUsagesClient object.
     */
    VirtualNetworkSubnetUsagesClient getVirtualNetworkSubnetUsages();

    /**
     * Gets the OperationsClient object to access its operations.
     *
     * @return the OperationsClient object.
     */
    OperationsClient getOperations();

    /**
     * Gets the DatabasesClient object to access its operations.
     *
     * @return the DatabasesClient object.
     */
    DatabasesClient getDatabases();

    /**
     * Gets the GetPrivateDnsZoneSuffixesClient object to access its operations.
     *
     * @return the GetPrivateDnsZoneSuffixesClient object.
     */
    GetPrivateDnsZoneSuffixesClient getGetPrivateDnsZoneSuffixes();
}