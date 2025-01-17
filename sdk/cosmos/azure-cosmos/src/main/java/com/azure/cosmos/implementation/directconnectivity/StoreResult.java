// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.cosmos.implementation.directconnectivity;

import com.azure.cosmos.BridgeInternal;
import com.azure.cosmos.CosmosException;
import com.azure.cosmos.implementation.Exceptions;
import com.azure.cosmos.implementation.HttpConstants;
import com.azure.cosmos.implementation.ISessionToken;
import com.azure.cosmos.implementation.ImplementationBridgeHelpers;
import com.azure.cosmos.implementation.InternalServerErrorException;
import com.azure.cosmos.implementation.RMResources;
import com.azure.cosmos.implementation.RequestChargeTracker;
import com.azure.cosmos.implementation.Strings;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;

public class StoreResult {
    private final static Logger logger = LoggerFactory.getLogger(StoreResult.class);

    private final StoreResponse storeResponse;
    private final CosmosException exception;

    final public long lsn;
    final public String partitionKeyRangeId;
    final public long quorumAckedLSN;
    final public long globalCommittedLSN;
    final public long numberOfReadRegions;
    final public long itemLSN;
    final public ISessionToken sessionToken;
    final public String sessionTokenAsString;
    final public double requestCharge;
    final public String activityId;
    final public String correlatedActivityId;
    final public int currentReplicaSetSize;
    final public int currentWriteQuorum;
    final public boolean isValid;
    final public boolean isGoneException;
    final public boolean isNotFoundException;
    final public boolean isInvalidPartitionException;
    final public Uri storePhysicalAddress;
    final public String storePhysicalAddressAsString;
    final public boolean isThroughputControlRequestRateTooLargeException;
    final public Double backendLatencyInMs;

    public StoreResult(
            StoreResponse storeResponse,
            CosmosException exception,
            String partitionKeyRangeId,
            long lsn,
            long quorumAckedLsn,
            double requestCharge,
            String activityId,
            String correlatedActivityId,
            int currentReplicaSetSize,
            int currentWriteQuorum,
            boolean isValid,
            Uri storePhysicalAddress,
            long globalCommittedLSN,
            int numberOfReadRegions,
            long itemLSN,
            ISessionToken sessionToken,
            Double backendLatencyInMs) {
        this.storeResponse = storeResponse;
        this.exception = exception;
        this.partitionKeyRangeId = partitionKeyRangeId;
        this.lsn = lsn;
        this.quorumAckedLSN = quorumAckedLsn;
        this.requestCharge = requestCharge;
        this.activityId= activityId;
        this.correlatedActivityId = correlatedActivityId;
        this.currentReplicaSetSize = currentReplicaSetSize;
        this.currentWriteQuorum = currentWriteQuorum;
        this.isValid = isValid;
        this.isGoneException = this.exception != null && this.exception.getStatusCode() == HttpConstants.StatusCodes.GONE;
        this.isNotFoundException = this.exception != null && this.exception.getStatusCode() == HttpConstants.StatusCodes.NOTFOUND;
        this.isInvalidPartitionException = this.exception != null
                && Exceptions.isNameCacheStale(this.exception);
        this.storePhysicalAddress = storePhysicalAddress;
        this.storePhysicalAddressAsString = storePhysicalAddress != null ? storePhysicalAddress.getURIAsString() : null;
        this.globalCommittedLSN = globalCommittedLSN;
        this.numberOfReadRegions = numberOfReadRegions;
        this.itemLSN = itemLSN;
        this.sessionToken = sessionToken;
        this.sessionTokenAsString = sessionToken != null ? sessionToken.convertToString() : null;
        this.isThroughputControlRequestRateTooLargeException = this.exception != null && Exceptions.isThroughputControlRequestRateTooLargeException(this.exception);
        this.backendLatencyInMs = backendLatencyInMs;
    }

    public CosmosException getException() throws InternalServerErrorException {
        if (this.exception == null) {
            String message = "Exception should be available but found none";
            assert false : message;
            logger.error(message);
            throw new InternalServerErrorException(RMResources.InternalServerError);
        }

        return exception;
    }

    public StoreResponse toResponse() {
        return toResponse(null);
    }

    public StoreResponse toResponse(RequestChargeTracker requestChargeTracker) {
        if (!this.isValid) {
            if (this.exception == null) {
                logger.error("Exception not set for invalid response");
                throw new InternalServerErrorException(RMResources.InternalServerError);
            }

            throw this.exception;
        }

        if (requestChargeTracker != null) {
            StoreResult.setRequestCharge(this.storeResponse, this.exception, requestChargeTracker.getTotalRequestCharge());
        }

        if (this.exception != null) {
            throw exception;
        }

        return this.storeResponse;
    }

    private static void setRequestCharge(StoreResponse response, CosmosException cosmosException, double totalRequestCharge) {
        if (cosmosException != null) {
            cosmosException.getResponseHeaders().put(HttpConstants.HttpHeaders.REQUEST_CHARGE,
                    Double.toString(totalRequestCharge));
        }
        // Set total charge as final charge for the response.
        else if (response.getResponseHeaderNames() != null) {
            for (int i = 0; i < response.getResponseHeaderNames().length; ++i) {
                if (Strings.areEqualIgnoreCase(
                        response.getResponseHeaderNames()[i],
                        HttpConstants.HttpHeaders.REQUEST_CHARGE)) {
                    response.getResponseHeaderValues()[i] = Double.toString(totalRequestCharge);
                    break;
                }
            }
        }
    }

    @Override
    public String toString() {
        int statusCode = 0;
        int subStatusCode = HttpConstants.SubStatusCodes.UNKNOWN;

        if (this.storeResponse != null) {
            statusCode = this.storeResponse.getStatus();
            subStatusCode = this.storeResponse.getSubStatusCode();
        } else if (this.exception != null) {
            statusCode = this.exception.getStatusCode();
            subStatusCode = this.exception.getSubStatusCode();
        }

        return "storePhysicalAddress: " + this.storePhysicalAddressAsString +
                ", lsn: " + this.lsn +
                ", globalCommittedLsn: " + this.globalCommittedLSN +
                ", partitionKeyRangeId: " + this.partitionKeyRangeId +
                ", isValid: " + this.isValid +
                ", statusCode: " + statusCode +
                ", subStatusCode: " + subStatusCode +
                ", isGone: " + this.isGoneException +
                ", isNotFound: " + this.isNotFoundException +
                ", isThroughputControlRequestRateTooLarge: " + this.isThroughputControlRequestRateTooLargeException +
                ", isInvalidPartition: " + this.isInvalidPartitionException +
                ", requestCharge: " + this.requestCharge +
                ", itemLSN: " + this.itemLSN +
                ", sessionToken: " + this.sessionTokenAsString +
                ", backendLatencyInMs: " + this.backendLatencyInMs +
                ", exception: " + BridgeInternal.getInnerErrorMessage(this.exception);
    }

    /**
     * Static factory method to create serializable store result to be used in CosmosDiagnostics
     * @param storeResult store result
     * @return serializable store result
     */
    public static StoreResult createSerializableStoreResult(StoreResult storeResult) {
        if (storeResult == null) {
            return null;
        }
        return new StoreResult(storeResult);
    }

    public static class StoreResultSerializer extends StdSerializer<StoreResult> {
        private static final long serialVersionUID = 5315472126043077905L;

        public StoreResultSerializer(){
            super(StoreResult.class);
        }

        @Override
        public void serialize(StoreResult storeResult,
                              JsonGenerator jsonGenerator,
                              SerializerProvider serializerProvider) throws IOException {
            int statusCode = 0;
            int subStatusCode = HttpConstants.SubStatusCodes.UNKNOWN;

            if (storeResult.storeResponse != null) {
                statusCode = storeResult.storeResponse.getStatus();
                subStatusCode = storeResult.storeResponse.getSubStatusCode();
            } else if (storeResult.exception != null) {
                statusCode = storeResult.exception.getStatusCode();
                subStatusCode = storeResult.exception.getSubStatusCode();
            }
            jsonGenerator.writeStartObject();
            jsonGenerator.writeObjectField("storePhysicalAddress", storeResult.storePhysicalAddressAsString);
            jsonGenerator.writeNumberField("lsn", storeResult.lsn);
            jsonGenerator.writeNumberField("globalCommittedLsn", storeResult.globalCommittedLSN);
            jsonGenerator.writeStringField("partitionKeyRangeId", storeResult.partitionKeyRangeId);
            jsonGenerator.writeBooleanField("isValid", storeResult.isValid);
            jsonGenerator.writeNumberField("statusCode", statusCode);
            jsonGenerator.writeNumberField("subStatusCode", subStatusCode);
            jsonGenerator.writeBooleanField("isGone", storeResult.isGoneException);
            jsonGenerator.writeBooleanField("isNotFound", storeResult.isNotFoundException);
            jsonGenerator.writeBooleanField("isInvalidPartition", storeResult.isInvalidPartitionException);
            jsonGenerator.writeBooleanField("isThroughputControlRequestRateTooLarge", storeResult.isThroughputControlRequestRateTooLargeException);
            jsonGenerator.writeNumberField("requestCharge", storeResult.requestCharge);
            jsonGenerator.writeNumberField("itemLSN", storeResult.itemLSN);
            jsonGenerator.writeStringField("sessionToken", storeResult.sessionTokenAsString);
            jsonGenerator.writeObjectField("backendLatencyInMs", storeResult.backendLatencyInMs);
            jsonGenerator.writeStringField("exception", BridgeInternal.getInnerErrorMessage(storeResult.exception));
            jsonGenerator.writeObjectField("transportRequestTimeline", storeResult.storeResponse != null ?
                storeResult.storeResponse.getRequestTimeline() :
                storeResult.exception != null ? BridgeInternal.getRequestTimeline(storeResult.exception) : null);

            this.writeNonNullObjectField(
                jsonGenerator,
                "transportRequestChannelAcquisitionContext",
                storeResult.storeResponse != null ? storeResult.storeResponse.getChannelAcquisitionTimeline() :
                    storeResult.exception != null? BridgeInternal.getChannelAcqusitionTimeline(storeResult.exception) : null);

            jsonGenerator.writeObjectField("rntbdRequestLengthInBytes", storeResult.storeResponse != null ?
                storeResult.storeResponse.getRntbdRequestLength() : BridgeInternal.getRntbdRequestLength(storeResult.exception));
            jsonGenerator.writeObjectField("rntbdResponseLengthInBytes", storeResult.storeResponse != null ?
                storeResult.storeResponse.getRntbdResponseLength() : BridgeInternal.getRntbdResponseLength(storeResult.exception));
            jsonGenerator.writeObjectField("requestPayloadLengthInBytes", storeResult.storeResponse != null ?
                storeResult.storeResponse.getRequestPayloadLength() :  BridgeInternal.getRequestBodyLength(storeResult.exception));
            jsonGenerator.writeObjectField("responsePayloadLengthInBytes", storeResult.storeResponse != null ?
                storeResult.storeResponse.getResponseBodyLength() : null);
            jsonGenerator.writeObjectField("channelTaskQueueSize", storeResult.storeResponse != null ? storeResult.storeResponse.getRntbdChannelTaskQueueSize() :
                BridgeInternal.getChannelTaskQueueSize(storeResult.exception));
            jsonGenerator.writeObjectField("pendingRequestsCount", storeResult.storeResponse != null ? storeResult.storeResponse.getPendingRequestQueueSize() :
                BridgeInternal.getRntbdPendingRequestQueueSize(storeResult.exception));
            jsonGenerator.writeObjectField("serviceEndpointStatistics", storeResult.storeResponse != null ? storeResult.storeResponse.getEndpointStsts() :
                storeResult.exception != null ? BridgeInternal.getServiceEndpointStatistics(storeResult.exception) : null);

            jsonGenerator.writeEndObject();
        }

        private void writeNonNullObjectField(JsonGenerator jsonGenerator, String fieldName, Object object) throws IOException {
             if (object == null) {
                 return;
             }

             jsonGenerator.writeObjectField(fieldName, object);
        }
    }

    /**
     * Private copy constructor, only to be used internally for serialization purposes
     * <p>
     * NOTE: This constructor does not copy all the fields to avoid memory issues.
     */
    private StoreResult(StoreResult storeResult) {
        this.storeResponse = StoreResponse.createSerializableStoreResponse(storeResult.storeResponse);
        this.exception = ImplementationBridgeHelpers
            .CosmosExceptionHelper
            .getCosmosExceptionAccessor()
            .createSerializableCosmosException(storeResult.exception);
        this.lsn = storeResult.lsn;
        this.partitionKeyRangeId = storeResult.partitionKeyRangeId;
        this.quorumAckedLSN = storeResult.quorumAckedLSN;
        this.globalCommittedLSN = storeResult.globalCommittedLSN;
        this.numberOfReadRegions = storeResult.numberOfReadRegions;
        this.itemLSN = storeResult.itemLSN;
        //  Just saving the string representation and nulling out the ISessionToken
        this.sessionToken = null;
        this.sessionTokenAsString = storeResult.sessionTokenAsString;
        this.requestCharge = storeResult.requestCharge;
        this.activityId = storeResult.activityId;
        this.correlatedActivityId = storeResult.correlatedActivityId;
        this.currentReplicaSetSize = storeResult.currentReplicaSetSize;
        this.currentWriteQuorum = storeResult.currentWriteQuorum;
        this.isValid = storeResult.isValid;
        this.isGoneException = storeResult.isGoneException;
        this.isNotFoundException = storeResult.isNotFoundException;
        this.isInvalidPartitionException = storeResult.isInvalidPartitionException;
        //  Just saving the string representation and nulling out the URI
        this.storePhysicalAddress = null;
        this.storePhysicalAddressAsString = storeResult.storePhysicalAddressAsString;
        this.isThroughputControlRequestRateTooLargeException = storeResult.isThroughputControlRequestRateTooLargeException;
        this.backendLatencyInMs = storeResult.backendLatencyInMs;
    }
}
