package headerbidding.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import gateway.v1.CampaignStateOuterClass;
import gateway.v1.ClientInfoOuterClass;
import gateway.v1.DynamicDeviceInfoOuterClass;
import gateway.v1.PiiOuterClass;
import gateway.v1.SessionCountersOuterClass;
import gateway.v1.StaticDeviceInfoOuterClass;
import gateway.v1.TimestampsOuterClass;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes5.dex */
public final class HeaderBiddingTokenOuterClass {

    public interface HeaderBiddingTokenOrBuilder extends MessageLiteOrBuilder {
        CampaignStateOuterClass.CampaignState getCampaignState();

        ClientInfoOuterClass.ClientInfo getClientInfo();

        DynamicDeviceInfoOuterClass.DynamicDeviceInfo getDynamicDeviceInfo();

        PiiOuterClass.Pii getPii();

        SessionCountersOuterClass.SessionCounters getSessionCounters();

        ByteString getSessionToken();

        StaticDeviceInfoOuterClass.StaticDeviceInfo getStaticDeviceInfo();

        ByteString getTcf();

        TimestampsOuterClass.Timestamps getTimestamps();

        ByteString getTokenId();

        int getTokenNumber();

        boolean hasCampaignState();

        boolean hasClientInfo();

        boolean hasDynamicDeviceInfo();

        boolean hasPii();

        boolean hasSessionCounters();

        boolean hasStaticDeviceInfo();

        boolean hasTcf();

        boolean hasTimestamps();
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
    }

    private HeaderBiddingTokenOuterClass() {
    }

    public static final class HeaderBiddingToken extends GeneratedMessageLite<HeaderBiddingToken, Builder> implements HeaderBiddingTokenOrBuilder {
        public static final int CAMPAIGN_STATE_FIELD_NUMBER = 10;
        public static final int CLIENT_INFO_FIELD_NUMBER = 4;
        private static final HeaderBiddingToken DEFAULT_INSTANCE;
        public static final int DYNAMIC_DEVICE_INFO_FIELD_NUMBER = 8;
        private static volatile Parser<HeaderBiddingToken> PARSER = null;
        public static final int PII_FIELD_NUMBER = 9;
        public static final int SESSION_COUNTERS_FIELD_NUMBER = 6;
        public static final int SESSION_TOKEN_FIELD_NUMBER = 3;
        public static final int STATIC_DEVICE_INFO_FIELD_NUMBER = 7;
        public static final int TCF_FIELD_NUMBER = 11;
        public static final int TIMESTAMPS_FIELD_NUMBER = 5;
        public static final int TOKEN_ID_FIELD_NUMBER = 1;
        public static final int TOKEN_NUMBER_FIELD_NUMBER = 2;
        private int bitField0_;
        private CampaignStateOuterClass.CampaignState campaignState_;
        private ClientInfoOuterClass.ClientInfo clientInfo_;
        private DynamicDeviceInfoOuterClass.DynamicDeviceInfo dynamicDeviceInfo_;
        private PiiOuterClass.Pii pii_;
        private SessionCountersOuterClass.SessionCounters sessionCounters_;
        private StaticDeviceInfoOuterClass.StaticDeviceInfo staticDeviceInfo_;
        private TimestampsOuterClass.Timestamps timestamps_;
        private int tokenNumber_;
        private ByteString tokenId_ = ByteString.EMPTY;
        private ByteString sessionToken_ = ByteString.EMPTY;
        private ByteString tcf_ = ByteString.EMPTY;

        private HeaderBiddingToken() {
        }

        @Override // headerbidding.v1.HeaderBiddingTokenOuterClass.HeaderBiddingTokenOrBuilder
        public ByteString getTokenId() {
            return this.tokenId_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTokenId(ByteString byteString) {
            byteString.getClass();
            this.tokenId_ = byteString;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTokenId() {
            this.tokenId_ = getDefaultInstance().getTokenId();
        }

        @Override // headerbidding.v1.HeaderBiddingTokenOuterClass.HeaderBiddingTokenOrBuilder
        public int getTokenNumber() {
            return this.tokenNumber_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTokenNumber(int i) {
            this.tokenNumber_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTokenNumber() {
            this.tokenNumber_ = 0;
        }

        @Override // headerbidding.v1.HeaderBiddingTokenOuterClass.HeaderBiddingTokenOrBuilder
        public ByteString getSessionToken() {
            return this.sessionToken_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSessionToken(ByteString byteString) {
            byteString.getClass();
            this.sessionToken_ = byteString;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSessionToken() {
            this.sessionToken_ = getDefaultInstance().getSessionToken();
        }

        @Override // headerbidding.v1.HeaderBiddingTokenOuterClass.HeaderBiddingTokenOrBuilder
        public boolean hasClientInfo() {
            return this.clientInfo_ != null;
        }

        @Override // headerbidding.v1.HeaderBiddingTokenOuterClass.HeaderBiddingTokenOrBuilder
        public ClientInfoOuterClass.ClientInfo getClientInfo() {
            ClientInfoOuterClass.ClientInfo clientInfo = this.clientInfo_;
            return clientInfo == null ? ClientInfoOuterClass.ClientInfo.getDefaultInstance() : clientInfo;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setClientInfo(ClientInfoOuterClass.ClientInfo clientInfo) {
            clientInfo.getClass();
            this.clientInfo_ = clientInfo;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeClientInfo(ClientInfoOuterClass.ClientInfo clientInfo) {
            clientInfo.getClass();
            ClientInfoOuterClass.ClientInfo clientInfo2 = this.clientInfo_;
            if (clientInfo2 != null && clientInfo2 != ClientInfoOuterClass.ClientInfo.getDefaultInstance()) {
                this.clientInfo_ = ClientInfoOuterClass.ClientInfo.newBuilder(this.clientInfo_).mergeFrom((ClientInfoOuterClass.ClientInfo.Builder) clientInfo).buildPartial();
            } else {
                this.clientInfo_ = clientInfo;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearClientInfo() {
            this.clientInfo_ = null;
        }

        @Override // headerbidding.v1.HeaderBiddingTokenOuterClass.HeaderBiddingTokenOrBuilder
        public boolean hasTimestamps() {
            return this.timestamps_ != null;
        }

        @Override // headerbidding.v1.HeaderBiddingTokenOuterClass.HeaderBiddingTokenOrBuilder
        public TimestampsOuterClass.Timestamps getTimestamps() {
            TimestampsOuterClass.Timestamps timestamps = this.timestamps_;
            return timestamps == null ? TimestampsOuterClass.Timestamps.getDefaultInstance() : timestamps;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTimestamps(TimestampsOuterClass.Timestamps timestamps) {
            timestamps.getClass();
            this.timestamps_ = timestamps;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeTimestamps(TimestampsOuterClass.Timestamps timestamps) {
            timestamps.getClass();
            TimestampsOuterClass.Timestamps timestamps2 = this.timestamps_;
            if (timestamps2 != null && timestamps2 != TimestampsOuterClass.Timestamps.getDefaultInstance()) {
                this.timestamps_ = TimestampsOuterClass.Timestamps.newBuilder(this.timestamps_).mergeFrom((TimestampsOuterClass.Timestamps.Builder) timestamps).buildPartial();
            } else {
                this.timestamps_ = timestamps;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTimestamps() {
            this.timestamps_ = null;
        }

        @Override // headerbidding.v1.HeaderBiddingTokenOuterClass.HeaderBiddingTokenOrBuilder
        public boolean hasSessionCounters() {
            return this.sessionCounters_ != null;
        }

        @Override // headerbidding.v1.HeaderBiddingTokenOuterClass.HeaderBiddingTokenOrBuilder
        public SessionCountersOuterClass.SessionCounters getSessionCounters() {
            SessionCountersOuterClass.SessionCounters sessionCounters = this.sessionCounters_;
            return sessionCounters == null ? SessionCountersOuterClass.SessionCounters.getDefaultInstance() : sessionCounters;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSessionCounters(SessionCountersOuterClass.SessionCounters sessionCounters) {
            sessionCounters.getClass();
            this.sessionCounters_ = sessionCounters;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeSessionCounters(SessionCountersOuterClass.SessionCounters sessionCounters) {
            sessionCounters.getClass();
            SessionCountersOuterClass.SessionCounters sessionCounters2 = this.sessionCounters_;
            if (sessionCounters2 != null && sessionCounters2 != SessionCountersOuterClass.SessionCounters.getDefaultInstance()) {
                this.sessionCounters_ = SessionCountersOuterClass.SessionCounters.newBuilder(this.sessionCounters_).mergeFrom((SessionCountersOuterClass.SessionCounters.Builder) sessionCounters).buildPartial();
            } else {
                this.sessionCounters_ = sessionCounters;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSessionCounters() {
            this.sessionCounters_ = null;
        }

        @Override // headerbidding.v1.HeaderBiddingTokenOuterClass.HeaderBiddingTokenOrBuilder
        public boolean hasStaticDeviceInfo() {
            return this.staticDeviceInfo_ != null;
        }

        @Override // headerbidding.v1.HeaderBiddingTokenOuterClass.HeaderBiddingTokenOrBuilder
        public StaticDeviceInfoOuterClass.StaticDeviceInfo getStaticDeviceInfo() {
            StaticDeviceInfoOuterClass.StaticDeviceInfo staticDeviceInfo = this.staticDeviceInfo_;
            return staticDeviceInfo == null ? StaticDeviceInfoOuterClass.StaticDeviceInfo.getDefaultInstance() : staticDeviceInfo;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setStaticDeviceInfo(StaticDeviceInfoOuterClass.StaticDeviceInfo staticDeviceInfo) {
            staticDeviceInfo.getClass();
            this.staticDeviceInfo_ = staticDeviceInfo;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeStaticDeviceInfo(StaticDeviceInfoOuterClass.StaticDeviceInfo staticDeviceInfo) {
            staticDeviceInfo.getClass();
            StaticDeviceInfoOuterClass.StaticDeviceInfo staticDeviceInfo2 = this.staticDeviceInfo_;
            if (staticDeviceInfo2 != null && staticDeviceInfo2 != StaticDeviceInfoOuterClass.StaticDeviceInfo.getDefaultInstance()) {
                this.staticDeviceInfo_ = StaticDeviceInfoOuterClass.StaticDeviceInfo.newBuilder(this.staticDeviceInfo_).mergeFrom((StaticDeviceInfoOuterClass.StaticDeviceInfo.Builder) staticDeviceInfo).buildPartial();
            } else {
                this.staticDeviceInfo_ = staticDeviceInfo;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearStaticDeviceInfo() {
            this.staticDeviceInfo_ = null;
        }

        @Override // headerbidding.v1.HeaderBiddingTokenOuterClass.HeaderBiddingTokenOrBuilder
        public boolean hasDynamicDeviceInfo() {
            return this.dynamicDeviceInfo_ != null;
        }

        @Override // headerbidding.v1.HeaderBiddingTokenOuterClass.HeaderBiddingTokenOrBuilder
        public DynamicDeviceInfoOuterClass.DynamicDeviceInfo getDynamicDeviceInfo() {
            DynamicDeviceInfoOuterClass.DynamicDeviceInfo dynamicDeviceInfo = this.dynamicDeviceInfo_;
            return dynamicDeviceInfo == null ? DynamicDeviceInfoOuterClass.DynamicDeviceInfo.getDefaultInstance() : dynamicDeviceInfo;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDynamicDeviceInfo(DynamicDeviceInfoOuterClass.DynamicDeviceInfo dynamicDeviceInfo) {
            dynamicDeviceInfo.getClass();
            this.dynamicDeviceInfo_ = dynamicDeviceInfo;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeDynamicDeviceInfo(DynamicDeviceInfoOuterClass.DynamicDeviceInfo dynamicDeviceInfo) {
            dynamicDeviceInfo.getClass();
            DynamicDeviceInfoOuterClass.DynamicDeviceInfo dynamicDeviceInfo2 = this.dynamicDeviceInfo_;
            if (dynamicDeviceInfo2 != null && dynamicDeviceInfo2 != DynamicDeviceInfoOuterClass.DynamicDeviceInfo.getDefaultInstance()) {
                this.dynamicDeviceInfo_ = DynamicDeviceInfoOuterClass.DynamicDeviceInfo.newBuilder(this.dynamicDeviceInfo_).mergeFrom((DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Builder) dynamicDeviceInfo).buildPartial();
            } else {
                this.dynamicDeviceInfo_ = dynamicDeviceInfo;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDynamicDeviceInfo() {
            this.dynamicDeviceInfo_ = null;
        }

        @Override // headerbidding.v1.HeaderBiddingTokenOuterClass.HeaderBiddingTokenOrBuilder
        public boolean hasPii() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // headerbidding.v1.HeaderBiddingTokenOuterClass.HeaderBiddingTokenOrBuilder
        public PiiOuterClass.Pii getPii() {
            PiiOuterClass.Pii pii = this.pii_;
            return pii == null ? PiiOuterClass.Pii.getDefaultInstance() : pii;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPii(PiiOuterClass.Pii pii) {
            pii.getClass();
            this.pii_ = pii;
            this.bitField0_ |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergePii(PiiOuterClass.Pii pii) {
            pii.getClass();
            PiiOuterClass.Pii pii2 = this.pii_;
            if (pii2 != null && pii2 != PiiOuterClass.Pii.getDefaultInstance()) {
                this.pii_ = PiiOuterClass.Pii.newBuilder(this.pii_).mergeFrom((PiiOuterClass.Pii.Builder) pii).buildPartial();
            } else {
                this.pii_ = pii;
            }
            this.bitField0_ |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPii() {
            this.pii_ = null;
            this.bitField0_ &= -2;
        }

        @Override // headerbidding.v1.HeaderBiddingTokenOuterClass.HeaderBiddingTokenOrBuilder
        public boolean hasCampaignState() {
            return this.campaignState_ != null;
        }

        @Override // headerbidding.v1.HeaderBiddingTokenOuterClass.HeaderBiddingTokenOrBuilder
        public CampaignStateOuterClass.CampaignState getCampaignState() {
            CampaignStateOuterClass.CampaignState campaignState = this.campaignState_;
            return campaignState == null ? CampaignStateOuterClass.CampaignState.getDefaultInstance() : campaignState;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCampaignState(CampaignStateOuterClass.CampaignState campaignState) {
            campaignState.getClass();
            this.campaignState_ = campaignState;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeCampaignState(CampaignStateOuterClass.CampaignState campaignState) {
            campaignState.getClass();
            CampaignStateOuterClass.CampaignState campaignState2 = this.campaignState_;
            if (campaignState2 != null && campaignState2 != CampaignStateOuterClass.CampaignState.getDefaultInstance()) {
                this.campaignState_ = CampaignStateOuterClass.CampaignState.newBuilder(this.campaignState_).mergeFrom((CampaignStateOuterClass.CampaignState.Builder) campaignState).buildPartial();
            } else {
                this.campaignState_ = campaignState;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCampaignState() {
            this.campaignState_ = null;
        }

        @Override // headerbidding.v1.HeaderBiddingTokenOuterClass.HeaderBiddingTokenOrBuilder
        public boolean hasTcf() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // headerbidding.v1.HeaderBiddingTokenOuterClass.HeaderBiddingTokenOrBuilder
        public ByteString getTcf() {
            return this.tcf_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTcf(ByteString byteString) {
            byteString.getClass();
            this.bitField0_ |= 2;
            this.tcf_ = byteString;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTcf() {
            this.bitField0_ &= -3;
            this.tcf_ = getDefaultInstance().getTcf();
        }

        public static HeaderBiddingToken parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (HeaderBiddingToken) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static HeaderBiddingToken parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (HeaderBiddingToken) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static HeaderBiddingToken parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (HeaderBiddingToken) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static HeaderBiddingToken parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (HeaderBiddingToken) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static HeaderBiddingToken parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (HeaderBiddingToken) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static HeaderBiddingToken parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (HeaderBiddingToken) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static HeaderBiddingToken parseFrom(InputStream inputStream) throws IOException {
            return (HeaderBiddingToken) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static HeaderBiddingToken parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (HeaderBiddingToken) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static HeaderBiddingToken parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (HeaderBiddingToken) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static HeaderBiddingToken parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (HeaderBiddingToken) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static HeaderBiddingToken parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (HeaderBiddingToken) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static HeaderBiddingToken parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (HeaderBiddingToken) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(HeaderBiddingToken headerBiddingToken) {
            return DEFAULT_INSTANCE.createBuilder(headerBiddingToken);
        }

        public static final class Builder extends GeneratedMessageLite.Builder<HeaderBiddingToken, Builder> implements HeaderBiddingTokenOrBuilder {
            /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            private Builder() {
                super(HeaderBiddingToken.DEFAULT_INSTANCE);
            }

            @Override // headerbidding.v1.HeaderBiddingTokenOuterClass.HeaderBiddingTokenOrBuilder
            public ByteString getTokenId() {
                return ((HeaderBiddingToken) this.instance).getTokenId();
            }

            public Builder setTokenId(ByteString byteString) {
                copyOnWrite();
                ((HeaderBiddingToken) this.instance).setTokenId(byteString);
                return this;
            }

            public Builder clearTokenId() {
                copyOnWrite();
                ((HeaderBiddingToken) this.instance).clearTokenId();
                return this;
            }

            @Override // headerbidding.v1.HeaderBiddingTokenOuterClass.HeaderBiddingTokenOrBuilder
            public int getTokenNumber() {
                return ((HeaderBiddingToken) this.instance).getTokenNumber();
            }

            public Builder setTokenNumber(int i) {
                copyOnWrite();
                ((HeaderBiddingToken) this.instance).setTokenNumber(i);
                return this;
            }

            public Builder clearTokenNumber() {
                copyOnWrite();
                ((HeaderBiddingToken) this.instance).clearTokenNumber();
                return this;
            }

            @Override // headerbidding.v1.HeaderBiddingTokenOuterClass.HeaderBiddingTokenOrBuilder
            public ByteString getSessionToken() {
                return ((HeaderBiddingToken) this.instance).getSessionToken();
            }

            public Builder setSessionToken(ByteString byteString) {
                copyOnWrite();
                ((HeaderBiddingToken) this.instance).setSessionToken(byteString);
                return this;
            }

            public Builder clearSessionToken() {
                copyOnWrite();
                ((HeaderBiddingToken) this.instance).clearSessionToken();
                return this;
            }

            @Override // headerbidding.v1.HeaderBiddingTokenOuterClass.HeaderBiddingTokenOrBuilder
            public boolean hasClientInfo() {
                return ((HeaderBiddingToken) this.instance).hasClientInfo();
            }

            @Override // headerbidding.v1.HeaderBiddingTokenOuterClass.HeaderBiddingTokenOrBuilder
            public ClientInfoOuterClass.ClientInfo getClientInfo() {
                return ((HeaderBiddingToken) this.instance).getClientInfo();
            }

            public Builder setClientInfo(ClientInfoOuterClass.ClientInfo clientInfo) {
                copyOnWrite();
                ((HeaderBiddingToken) this.instance).setClientInfo(clientInfo);
                return this;
            }

            public Builder setClientInfo(ClientInfoOuterClass.ClientInfo.Builder builder) {
                copyOnWrite();
                ((HeaderBiddingToken) this.instance).setClientInfo(builder.build());
                return this;
            }

            public Builder mergeClientInfo(ClientInfoOuterClass.ClientInfo clientInfo) {
                copyOnWrite();
                ((HeaderBiddingToken) this.instance).mergeClientInfo(clientInfo);
                return this;
            }

            public Builder clearClientInfo() {
                copyOnWrite();
                ((HeaderBiddingToken) this.instance).clearClientInfo();
                return this;
            }

            @Override // headerbidding.v1.HeaderBiddingTokenOuterClass.HeaderBiddingTokenOrBuilder
            public boolean hasTimestamps() {
                return ((HeaderBiddingToken) this.instance).hasTimestamps();
            }

            @Override // headerbidding.v1.HeaderBiddingTokenOuterClass.HeaderBiddingTokenOrBuilder
            public TimestampsOuterClass.Timestamps getTimestamps() {
                return ((HeaderBiddingToken) this.instance).getTimestamps();
            }

            public Builder setTimestamps(TimestampsOuterClass.Timestamps timestamps) {
                copyOnWrite();
                ((HeaderBiddingToken) this.instance).setTimestamps(timestamps);
                return this;
            }

            public Builder setTimestamps(TimestampsOuterClass.Timestamps.Builder builder) {
                copyOnWrite();
                ((HeaderBiddingToken) this.instance).setTimestamps(builder.build());
                return this;
            }

            public Builder mergeTimestamps(TimestampsOuterClass.Timestamps timestamps) {
                copyOnWrite();
                ((HeaderBiddingToken) this.instance).mergeTimestamps(timestamps);
                return this;
            }

            public Builder clearTimestamps() {
                copyOnWrite();
                ((HeaderBiddingToken) this.instance).clearTimestamps();
                return this;
            }

            @Override // headerbidding.v1.HeaderBiddingTokenOuterClass.HeaderBiddingTokenOrBuilder
            public boolean hasSessionCounters() {
                return ((HeaderBiddingToken) this.instance).hasSessionCounters();
            }

            @Override // headerbidding.v1.HeaderBiddingTokenOuterClass.HeaderBiddingTokenOrBuilder
            public SessionCountersOuterClass.SessionCounters getSessionCounters() {
                return ((HeaderBiddingToken) this.instance).getSessionCounters();
            }

            public Builder setSessionCounters(SessionCountersOuterClass.SessionCounters sessionCounters) {
                copyOnWrite();
                ((HeaderBiddingToken) this.instance).setSessionCounters(sessionCounters);
                return this;
            }

            public Builder setSessionCounters(SessionCountersOuterClass.SessionCounters.Builder builder) {
                copyOnWrite();
                ((HeaderBiddingToken) this.instance).setSessionCounters(builder.build());
                return this;
            }

            public Builder mergeSessionCounters(SessionCountersOuterClass.SessionCounters sessionCounters) {
                copyOnWrite();
                ((HeaderBiddingToken) this.instance).mergeSessionCounters(sessionCounters);
                return this;
            }

            public Builder clearSessionCounters() {
                copyOnWrite();
                ((HeaderBiddingToken) this.instance).clearSessionCounters();
                return this;
            }

            @Override // headerbidding.v1.HeaderBiddingTokenOuterClass.HeaderBiddingTokenOrBuilder
            public boolean hasStaticDeviceInfo() {
                return ((HeaderBiddingToken) this.instance).hasStaticDeviceInfo();
            }

            @Override // headerbidding.v1.HeaderBiddingTokenOuterClass.HeaderBiddingTokenOrBuilder
            public StaticDeviceInfoOuterClass.StaticDeviceInfo getStaticDeviceInfo() {
                return ((HeaderBiddingToken) this.instance).getStaticDeviceInfo();
            }

            public Builder setStaticDeviceInfo(StaticDeviceInfoOuterClass.StaticDeviceInfo staticDeviceInfo) {
                copyOnWrite();
                ((HeaderBiddingToken) this.instance).setStaticDeviceInfo(staticDeviceInfo);
                return this;
            }

            public Builder setStaticDeviceInfo(StaticDeviceInfoOuterClass.StaticDeviceInfo.Builder builder) {
                copyOnWrite();
                ((HeaderBiddingToken) this.instance).setStaticDeviceInfo(builder.build());
                return this;
            }

            public Builder mergeStaticDeviceInfo(StaticDeviceInfoOuterClass.StaticDeviceInfo staticDeviceInfo) {
                copyOnWrite();
                ((HeaderBiddingToken) this.instance).mergeStaticDeviceInfo(staticDeviceInfo);
                return this;
            }

            public Builder clearStaticDeviceInfo() {
                copyOnWrite();
                ((HeaderBiddingToken) this.instance).clearStaticDeviceInfo();
                return this;
            }

            @Override // headerbidding.v1.HeaderBiddingTokenOuterClass.HeaderBiddingTokenOrBuilder
            public boolean hasDynamicDeviceInfo() {
                return ((HeaderBiddingToken) this.instance).hasDynamicDeviceInfo();
            }

            @Override // headerbidding.v1.HeaderBiddingTokenOuterClass.HeaderBiddingTokenOrBuilder
            public DynamicDeviceInfoOuterClass.DynamicDeviceInfo getDynamicDeviceInfo() {
                return ((HeaderBiddingToken) this.instance).getDynamicDeviceInfo();
            }

            public Builder setDynamicDeviceInfo(DynamicDeviceInfoOuterClass.DynamicDeviceInfo dynamicDeviceInfo) {
                copyOnWrite();
                ((HeaderBiddingToken) this.instance).setDynamicDeviceInfo(dynamicDeviceInfo);
                return this;
            }

            public Builder setDynamicDeviceInfo(DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Builder builder) {
                copyOnWrite();
                ((HeaderBiddingToken) this.instance).setDynamicDeviceInfo(builder.build());
                return this;
            }

            public Builder mergeDynamicDeviceInfo(DynamicDeviceInfoOuterClass.DynamicDeviceInfo dynamicDeviceInfo) {
                copyOnWrite();
                ((HeaderBiddingToken) this.instance).mergeDynamicDeviceInfo(dynamicDeviceInfo);
                return this;
            }

            public Builder clearDynamicDeviceInfo() {
                copyOnWrite();
                ((HeaderBiddingToken) this.instance).clearDynamicDeviceInfo();
                return this;
            }

            @Override // headerbidding.v1.HeaderBiddingTokenOuterClass.HeaderBiddingTokenOrBuilder
            public boolean hasPii() {
                return ((HeaderBiddingToken) this.instance).hasPii();
            }

            @Override // headerbidding.v1.HeaderBiddingTokenOuterClass.HeaderBiddingTokenOrBuilder
            public PiiOuterClass.Pii getPii() {
                return ((HeaderBiddingToken) this.instance).getPii();
            }

            public Builder setPii(PiiOuterClass.Pii pii) {
                copyOnWrite();
                ((HeaderBiddingToken) this.instance).setPii(pii);
                return this;
            }

            public Builder setPii(PiiOuterClass.Pii.Builder builder) {
                copyOnWrite();
                ((HeaderBiddingToken) this.instance).setPii(builder.build());
                return this;
            }

            public Builder mergePii(PiiOuterClass.Pii pii) {
                copyOnWrite();
                ((HeaderBiddingToken) this.instance).mergePii(pii);
                return this;
            }

            public Builder clearPii() {
                copyOnWrite();
                ((HeaderBiddingToken) this.instance).clearPii();
                return this;
            }

            @Override // headerbidding.v1.HeaderBiddingTokenOuterClass.HeaderBiddingTokenOrBuilder
            public boolean hasCampaignState() {
                return ((HeaderBiddingToken) this.instance).hasCampaignState();
            }

            @Override // headerbidding.v1.HeaderBiddingTokenOuterClass.HeaderBiddingTokenOrBuilder
            public CampaignStateOuterClass.CampaignState getCampaignState() {
                return ((HeaderBiddingToken) this.instance).getCampaignState();
            }

            public Builder setCampaignState(CampaignStateOuterClass.CampaignState campaignState) {
                copyOnWrite();
                ((HeaderBiddingToken) this.instance).setCampaignState(campaignState);
                return this;
            }

            public Builder setCampaignState(CampaignStateOuterClass.CampaignState.Builder builder) {
                copyOnWrite();
                ((HeaderBiddingToken) this.instance).setCampaignState(builder.build());
                return this;
            }

            public Builder mergeCampaignState(CampaignStateOuterClass.CampaignState campaignState) {
                copyOnWrite();
                ((HeaderBiddingToken) this.instance).mergeCampaignState(campaignState);
                return this;
            }

            public Builder clearCampaignState() {
                copyOnWrite();
                ((HeaderBiddingToken) this.instance).clearCampaignState();
                return this;
            }

            @Override // headerbidding.v1.HeaderBiddingTokenOuterClass.HeaderBiddingTokenOrBuilder
            public boolean hasTcf() {
                return ((HeaderBiddingToken) this.instance).hasTcf();
            }

            @Override // headerbidding.v1.HeaderBiddingTokenOuterClass.HeaderBiddingTokenOrBuilder
            public ByteString getTcf() {
                return ((HeaderBiddingToken) this.instance).getTcf();
            }

            public Builder setTcf(ByteString byteString) {
                copyOnWrite();
                ((HeaderBiddingToken) this.instance).setTcf(byteString);
                return this;
            }

            public Builder clearTcf() {
                copyOnWrite();
                ((HeaderBiddingToken) this.instance).clearTcf();
                return this;
            }
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new HeaderBiddingToken();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u000b\u0000\u0001\u0001\u000b\u000b\u0000\u0000\u0000\u0001\n\u0002\u0004\u0003\n\u0004\t\u0005\t\u0006\t\u0007\t\b\t\tဉ\u0000\n\t\u000bည\u0001", new Object[]{"bitField0_", "tokenId_", "tokenNumber_", "sessionToken_", "clientInfo_", "timestamps_", "sessionCounters_", "staticDeviceInfo_", "dynamicDeviceInfo_", "pii_", "campaignState_", "tcf_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<HeaderBiddingToken> defaultInstanceBasedParser = PARSER;
                    if (defaultInstanceBasedParser == null) {
                        synchronized (HeaderBiddingToken.class) {
                            defaultInstanceBasedParser = PARSER;
                            if (defaultInstanceBasedParser == null) {
                                defaultInstanceBasedParser = new GeneratedMessageLite.DefaultInstanceBasedParser<>(DEFAULT_INSTANCE);
                                PARSER = defaultInstanceBasedParser;
                            }
                        }
                    }
                    return defaultInstanceBasedParser;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        static {
            HeaderBiddingToken headerBiddingToken = new HeaderBiddingToken();
            DEFAULT_INSTANCE = headerBiddingToken;
            GeneratedMessageLite.registerDefaultInstance(HeaderBiddingToken.class, headerBiddingToken);
        }

        public static HeaderBiddingToken getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<HeaderBiddingToken> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }

    /* renamed from: headerbidding.v1.HeaderBiddingTokenOuterClass$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }
}
