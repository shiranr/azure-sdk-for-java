// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.datafactory.models.ImpalaAuthenticationType;
import com.azure.resourcemanager.datafactory.models.SecretBase;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Impala server linked service properties. */
@Fluent
public final class ImpalaLinkedServiceTypeProperties {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ImpalaLinkedServiceTypeProperties.class);

    /*
     * The IP address or host name of the Impala server. (i.e. 192.168.222.160)
     */
    @JsonProperty(value = "host", required = true)
    private Object host;

    /*
     * The TCP port that the Impala server uses to listen for client
     * connections. The default value is 21050.
     */
    @JsonProperty(value = "port")
    private Object port;

    /*
     * The authentication type to use.
     */
    @JsonProperty(value = "authenticationType", required = true)
    private ImpalaAuthenticationType authenticationType;

    /*
     * The user name used to access the Impala server. The default value is
     * anonymous when using SASLUsername.
     */
    @JsonProperty(value = "username")
    private Object username;

    /*
     * The password corresponding to the user name when using
     * UsernameAndPassword.
     */
    @JsonProperty(value = "password")
    private SecretBase password;

    /*
     * Specifies whether the connections to the server are encrypted using SSL.
     * The default value is false.
     */
    @JsonProperty(value = "enableSsl")
    private Object enableSsl;

    /*
     * The full path of the .pem file containing trusted CA certificates for
     * verifying the server when connecting over SSL. This property can only be
     * set when using SSL on self-hosted IR. The default value is the
     * cacerts.pem file installed with the IR.
     */
    @JsonProperty(value = "trustedCertPath")
    private Object trustedCertPath;

    /*
     * Specifies whether to use a CA certificate from the system trust store or
     * from a specified PEM file. The default value is false.
     */
    @JsonProperty(value = "useSystemTrustStore")
    private Object useSystemTrustStore;

    /*
     * Specifies whether to require a CA-issued SSL certificate name to match
     * the host name of the server when connecting over SSL. The default value
     * is false.
     */
    @JsonProperty(value = "allowHostNameCNMismatch")
    private Object allowHostnameCNMismatch;

    /*
     * Specifies whether to allow self-signed certificates from the server. The
     * default value is false.
     */
    @JsonProperty(value = "allowSelfSignedServerCert")
    private Object allowSelfSignedServerCert;

    /*
     * The encrypted credential used for authentication. Credentials are
     * encrypted using the integration runtime credential manager. Type: string
     * (or Expression with resultType string).
     */
    @JsonProperty(value = "encryptedCredential")
    private Object encryptedCredential;

    /**
     * Get the host property: The IP address or host name of the Impala server. (i.e. 192.168.222.160).
     *
     * @return the host value.
     */
    public Object host() {
        return this.host;
    }

    /**
     * Set the host property: The IP address or host name of the Impala server. (i.e. 192.168.222.160).
     *
     * @param host the host value to set.
     * @return the ImpalaLinkedServiceTypeProperties object itself.
     */
    public ImpalaLinkedServiceTypeProperties withHost(Object host) {
        this.host = host;
        return this;
    }

    /**
     * Get the port property: The TCP port that the Impala server uses to listen for client connections. The default
     * value is 21050.
     *
     * @return the port value.
     */
    public Object port() {
        return this.port;
    }

    /**
     * Set the port property: The TCP port that the Impala server uses to listen for client connections. The default
     * value is 21050.
     *
     * @param port the port value to set.
     * @return the ImpalaLinkedServiceTypeProperties object itself.
     */
    public ImpalaLinkedServiceTypeProperties withPort(Object port) {
        this.port = port;
        return this;
    }

    /**
     * Get the authenticationType property: The authentication type to use.
     *
     * @return the authenticationType value.
     */
    public ImpalaAuthenticationType authenticationType() {
        return this.authenticationType;
    }

    /**
     * Set the authenticationType property: The authentication type to use.
     *
     * @param authenticationType the authenticationType value to set.
     * @return the ImpalaLinkedServiceTypeProperties object itself.
     */
    public ImpalaLinkedServiceTypeProperties withAuthenticationType(ImpalaAuthenticationType authenticationType) {
        this.authenticationType = authenticationType;
        return this;
    }

    /**
     * Get the username property: The user name used to access the Impala server. The default value is anonymous when
     * using SASLUsername.
     *
     * @return the username value.
     */
    public Object username() {
        return this.username;
    }

    /**
     * Set the username property: The user name used to access the Impala server. The default value is anonymous when
     * using SASLUsername.
     *
     * @param username the username value to set.
     * @return the ImpalaLinkedServiceTypeProperties object itself.
     */
    public ImpalaLinkedServiceTypeProperties withUsername(Object username) {
        this.username = username;
        return this;
    }

    /**
     * Get the password property: The password corresponding to the user name when using UsernameAndPassword.
     *
     * @return the password value.
     */
    public SecretBase password() {
        return this.password;
    }

    /**
     * Set the password property: The password corresponding to the user name when using UsernameAndPassword.
     *
     * @param password the password value to set.
     * @return the ImpalaLinkedServiceTypeProperties object itself.
     */
    public ImpalaLinkedServiceTypeProperties withPassword(SecretBase password) {
        this.password = password;
        return this;
    }

    /**
     * Get the enableSsl property: Specifies whether the connections to the server are encrypted using SSL. The default
     * value is false.
     *
     * @return the enableSsl value.
     */
    public Object enableSsl() {
        return this.enableSsl;
    }

    /**
     * Set the enableSsl property: Specifies whether the connections to the server are encrypted using SSL. The default
     * value is false.
     *
     * @param enableSsl the enableSsl value to set.
     * @return the ImpalaLinkedServiceTypeProperties object itself.
     */
    public ImpalaLinkedServiceTypeProperties withEnableSsl(Object enableSsl) {
        this.enableSsl = enableSsl;
        return this;
    }

    /**
     * Get the trustedCertPath property: The full path of the .pem file containing trusted CA certificates for verifying
     * the server when connecting over SSL. This property can only be set when using SSL on self-hosted IR. The default
     * value is the cacerts.pem file installed with the IR.
     *
     * @return the trustedCertPath value.
     */
    public Object trustedCertPath() {
        return this.trustedCertPath;
    }

    /**
     * Set the trustedCertPath property: The full path of the .pem file containing trusted CA certificates for verifying
     * the server when connecting over SSL. This property can only be set when using SSL on self-hosted IR. The default
     * value is the cacerts.pem file installed with the IR.
     *
     * @param trustedCertPath the trustedCertPath value to set.
     * @return the ImpalaLinkedServiceTypeProperties object itself.
     */
    public ImpalaLinkedServiceTypeProperties withTrustedCertPath(Object trustedCertPath) {
        this.trustedCertPath = trustedCertPath;
        return this;
    }

    /**
     * Get the useSystemTrustStore property: Specifies whether to use a CA certificate from the system trust store or
     * from a specified PEM file. The default value is false.
     *
     * @return the useSystemTrustStore value.
     */
    public Object useSystemTrustStore() {
        return this.useSystemTrustStore;
    }

    /**
     * Set the useSystemTrustStore property: Specifies whether to use a CA certificate from the system trust store or
     * from a specified PEM file. The default value is false.
     *
     * @param useSystemTrustStore the useSystemTrustStore value to set.
     * @return the ImpalaLinkedServiceTypeProperties object itself.
     */
    public ImpalaLinkedServiceTypeProperties withUseSystemTrustStore(Object useSystemTrustStore) {
        this.useSystemTrustStore = useSystemTrustStore;
        return this;
    }

    /**
     * Get the allowHostnameCNMismatch property: Specifies whether to require a CA-issued SSL certificate name to match
     * the host name of the server when connecting over SSL. The default value is false.
     *
     * @return the allowHostnameCNMismatch value.
     */
    public Object allowHostnameCNMismatch() {
        return this.allowHostnameCNMismatch;
    }

    /**
     * Set the allowHostnameCNMismatch property: Specifies whether to require a CA-issued SSL certificate name to match
     * the host name of the server when connecting over SSL. The default value is false.
     *
     * @param allowHostnameCNMismatch the allowHostnameCNMismatch value to set.
     * @return the ImpalaLinkedServiceTypeProperties object itself.
     */
    public ImpalaLinkedServiceTypeProperties withAllowHostnameCNMismatch(Object allowHostnameCNMismatch) {
        this.allowHostnameCNMismatch = allowHostnameCNMismatch;
        return this;
    }

    /**
     * Get the allowSelfSignedServerCert property: Specifies whether to allow self-signed certificates from the server.
     * The default value is false.
     *
     * @return the allowSelfSignedServerCert value.
     */
    public Object allowSelfSignedServerCert() {
        return this.allowSelfSignedServerCert;
    }

    /**
     * Set the allowSelfSignedServerCert property: Specifies whether to allow self-signed certificates from the server.
     * The default value is false.
     *
     * @param allowSelfSignedServerCert the allowSelfSignedServerCert value to set.
     * @return the ImpalaLinkedServiceTypeProperties object itself.
     */
    public ImpalaLinkedServiceTypeProperties withAllowSelfSignedServerCert(Object allowSelfSignedServerCert) {
        this.allowSelfSignedServerCert = allowSelfSignedServerCert;
        return this;
    }

    /**
     * Get the encryptedCredential property: The encrypted credential used for authentication. Credentials are encrypted
     * using the integration runtime credential manager. Type: string (or Expression with resultType string).
     *
     * @return the encryptedCredential value.
     */
    public Object encryptedCredential() {
        return this.encryptedCredential;
    }

    /**
     * Set the encryptedCredential property: The encrypted credential used for authentication. Credentials are encrypted
     * using the integration runtime credential manager. Type: string (or Expression with resultType string).
     *
     * @param encryptedCredential the encryptedCredential value to set.
     * @return the ImpalaLinkedServiceTypeProperties object itself.
     */
    public ImpalaLinkedServiceTypeProperties withEncryptedCredential(Object encryptedCredential) {
        this.encryptedCredential = encryptedCredential;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (host() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property host in model ImpalaLinkedServiceTypeProperties"));
        }
        if (authenticationType() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property authenticationType in model ImpalaLinkedServiceTypeProperties"));
        }
        if (password() != null) {
            password().validate();
        }
    }
}