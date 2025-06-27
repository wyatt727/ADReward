package com.vungle.ads.internal.protos;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

/* loaded from: classes5.dex */
public final class Sdk {

    public interface MetricBatchOrBuilder extends MessageLiteOrBuilder {
        SDKMetric getMetrics(int i);

        int getMetricsCount();

        List<SDKMetric> getMetricsList();
    }

    public interface SDKErrorBatchOrBuilder extends MessageLiteOrBuilder {
        SDKError getErrors(int i);

        int getErrorsCount();

        List<SDKError> getErrorsList();
    }

    public interface SDKErrorOrBuilder extends MessageLiteOrBuilder {
        long getAt();

        String getConnectionType();

        ByteString getConnectionTypeBytes();

        String getConnectionTypeDetail();

        String getConnectionTypeDetailAndroid();

        ByteString getConnectionTypeDetailAndroidBytes();

        ByteString getConnectionTypeDetailBytes();

        String getCreativeId();

        ByteString getCreativeIdBytes();

        String getEventId();

        ByteString getEventIdBytes();

        String getMake();

        ByteString getMakeBytes();

        String getMessage();

        ByteString getMessageBytes();

        String getModel();

        ByteString getModelBytes();

        String getOs();

        ByteString getOsBytes();

        String getOsVersion();

        ByteString getOsVersionBytes();

        String getPlacementReferenceId();

        ByteString getPlacementReferenceIdBytes();

        SDKError.Reason getReason();

        int getReasonValue();

        String getSessionId();

        ByteString getSessionIdBytes();
    }

    public interface SDKMetricOrBuilder extends MessageLiteOrBuilder {
        String getConnectionType();

        ByteString getConnectionTypeBytes();

        String getConnectionTypeDetail();

        ByteString getConnectionTypeDetailBytes();

        String getCreativeId();

        ByteString getCreativeIdBytes();

        String getEventId();

        ByteString getEventIdBytes();

        String getMake();

        ByteString getMakeBytes();

        String getMeta();

        ByteString getMetaBytes();

        String getModel();

        ByteString getModelBytes();

        String getOs();

        ByteString getOsBytes();

        String getOsVersion();

        ByteString getOsVersionBytes();

        String getPlacementReferenceId();

        ByteString getPlacementReferenceIdBytes();

        String getSessionId();

        ByteString getSessionIdBytes();

        SDKMetric.SDKMetricType getType();

        int getTypeValue();

        long getValue();
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
    }

    private Sdk() {
    }

    public static final class SDKErrorBatch extends GeneratedMessageLite<SDKErrorBatch, Builder> implements SDKErrorBatchOrBuilder {
        private static final SDKErrorBatch DEFAULT_INSTANCE;
        public static final int ERRORS_FIELD_NUMBER = 1;
        private static volatile Parser<SDKErrorBatch> PARSER;
        private Internal.ProtobufList<SDKError> errors_ = emptyProtobufList();

        private SDKErrorBatch() {
        }

        @Override // com.vungle.ads.internal.protos.Sdk.SDKErrorBatchOrBuilder
        public List<SDKError> getErrorsList() {
            return this.errors_;
        }

        public List<? extends SDKErrorOrBuilder> getErrorsOrBuilderList() {
            return this.errors_;
        }

        @Override // com.vungle.ads.internal.protos.Sdk.SDKErrorBatchOrBuilder
        public int getErrorsCount() {
            return this.errors_.size();
        }

        @Override // com.vungle.ads.internal.protos.Sdk.SDKErrorBatchOrBuilder
        public SDKError getErrors(int i) {
            return this.errors_.get(i);
        }

        public SDKErrorOrBuilder getErrorsOrBuilder(int i) {
            return this.errors_.get(i);
        }

        private void ensureErrorsIsMutable() {
            Internal.ProtobufList<SDKError> protobufList = this.errors_;
            if (protobufList.isModifiable()) {
                return;
            }
            this.errors_ = GeneratedMessageLite.mutableCopy(protobufList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setErrors(int i, SDKError sDKError) {
            sDKError.getClass();
            ensureErrorsIsMutable();
            this.errors_.set(i, sDKError);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addErrors(SDKError sDKError) {
            sDKError.getClass();
            ensureErrorsIsMutable();
            this.errors_.add(sDKError);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addErrors(int i, SDKError sDKError) {
            sDKError.getClass();
            ensureErrorsIsMutable();
            this.errors_.add(i, sDKError);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllErrors(Iterable<? extends SDKError> iterable) {
            ensureErrorsIsMutable();
            AbstractMessageLite.addAll((Iterable) iterable, (List) this.errors_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearErrors() {
            this.errors_ = emptyProtobufList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeErrors(int i) {
            ensureErrorsIsMutable();
            this.errors_.remove(i);
        }

        public static SDKErrorBatch parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (SDKErrorBatch) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static SDKErrorBatch parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (SDKErrorBatch) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static SDKErrorBatch parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (SDKErrorBatch) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static SDKErrorBatch parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (SDKErrorBatch) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static SDKErrorBatch parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (SDKErrorBatch) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static SDKErrorBatch parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (SDKErrorBatch) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static SDKErrorBatch parseFrom(InputStream inputStream) throws IOException {
            return (SDKErrorBatch) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static SDKErrorBatch parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (SDKErrorBatch) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static SDKErrorBatch parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (SDKErrorBatch) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static SDKErrorBatch parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (SDKErrorBatch) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static SDKErrorBatch parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (SDKErrorBatch) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static SDKErrorBatch parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (SDKErrorBatch) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(SDKErrorBatch sDKErrorBatch) {
            return DEFAULT_INSTANCE.createBuilder(sDKErrorBatch);
        }

        public static final class Builder extends GeneratedMessageLite.Builder<SDKErrorBatch, Builder> implements SDKErrorBatchOrBuilder {
            /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            private Builder() {
                super(SDKErrorBatch.DEFAULT_INSTANCE);
            }

            @Override // com.vungle.ads.internal.protos.Sdk.SDKErrorBatchOrBuilder
            public List<SDKError> getErrorsList() {
                return Collections.unmodifiableList(((SDKErrorBatch) this.instance).getErrorsList());
            }

            @Override // com.vungle.ads.internal.protos.Sdk.SDKErrorBatchOrBuilder
            public int getErrorsCount() {
                return ((SDKErrorBatch) this.instance).getErrorsCount();
            }

            @Override // com.vungle.ads.internal.protos.Sdk.SDKErrorBatchOrBuilder
            public SDKError getErrors(int i) {
                return ((SDKErrorBatch) this.instance).getErrors(i);
            }

            public Builder setErrors(int i, SDKError sDKError) {
                copyOnWrite();
                ((SDKErrorBatch) this.instance).setErrors(i, sDKError);
                return this;
            }

            public Builder setErrors(int i, SDKError.Builder builder) {
                copyOnWrite();
                ((SDKErrorBatch) this.instance).setErrors(i, builder.build());
                return this;
            }

            public Builder addErrors(SDKError sDKError) {
                copyOnWrite();
                ((SDKErrorBatch) this.instance).addErrors(sDKError);
                return this;
            }

            public Builder addErrors(int i, SDKError sDKError) {
                copyOnWrite();
                ((SDKErrorBatch) this.instance).addErrors(i, sDKError);
                return this;
            }

            public Builder addErrors(SDKError.Builder builder) {
                copyOnWrite();
                ((SDKErrorBatch) this.instance).addErrors(builder.build());
                return this;
            }

            public Builder addErrors(int i, SDKError.Builder builder) {
                copyOnWrite();
                ((SDKErrorBatch) this.instance).addErrors(i, builder.build());
                return this;
            }

            public Builder addAllErrors(Iterable<? extends SDKError> iterable) {
                copyOnWrite();
                ((SDKErrorBatch) this.instance).addAllErrors(iterable);
                return this;
            }

            public Builder clearErrors() {
                copyOnWrite();
                ((SDKErrorBatch) this.instance).clearErrors();
                return this;
            }

            public Builder removeErrors(int i) {
                copyOnWrite();
                ((SDKErrorBatch) this.instance).removeErrors(i);
                return this;
            }
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new SDKErrorBatch();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"errors_", SDKError.class});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<SDKErrorBatch> defaultInstanceBasedParser = PARSER;
                    if (defaultInstanceBasedParser == null) {
                        synchronized (SDKErrorBatch.class) {
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
            SDKErrorBatch sDKErrorBatch = new SDKErrorBatch();
            DEFAULT_INSTANCE = sDKErrorBatch;
            GeneratedMessageLite.registerDefaultInstance(SDKErrorBatch.class, sDKErrorBatch);
        }

        public static SDKErrorBatch getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<SDKErrorBatch> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }

    /* renamed from: com.vungle.ads.internal.protos.Sdk$1, reason: invalid class name */
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

    public static final class SDKError extends GeneratedMessageLite<SDKError, Builder> implements SDKErrorOrBuilder {
        public static final int AT_FIELD_NUMBER = 1;
        public static final int CONNECTIONTYPEDETAILANDROID_FIELD_NUMBER = 101;
        public static final int CONNECTIONTYPEDETAIL_FIELD_NUMBER = 10;
        public static final int CONNECTIONTYPE_FIELD_NUMBER = 9;
        public static final int CREATIVEID_FIELD_NUMBER = 12;
        private static final SDKError DEFAULT_INSTANCE;
        public static final int EVENTID_FIELD_NUMBER = 4;
        public static final int MAKE_FIELD_NUMBER = 5;
        public static final int MESSAGE_FIELD_NUMBER = 3;
        public static final int MODEL_FIELD_NUMBER = 6;
        public static final int OSVERSION_FIELD_NUMBER = 8;
        public static final int OS_FIELD_NUMBER = 7;
        private static volatile Parser<SDKError> PARSER = null;
        public static final int PLACEMENTREFERENCEID_FIELD_NUMBER = 11;
        public static final int REASON_FIELD_NUMBER = 2;
        public static final int SESSIONID_FIELD_NUMBER = 13;
        private long at_;
        private int reason_;
        private String message_ = "";
        private String eventId_ = "";
        private String make_ = "";
        private String model_ = "";
        private String os_ = "";
        private String osVersion_ = "";
        private String connectionType_ = "";
        private String connectionTypeDetail_ = "";
        private String placementReferenceId_ = "";
        private String creativeId_ = "";
        private String sessionId_ = "";
        private String connectionTypeDetailAndroid_ = "";

        private SDKError() {
        }

        public enum Reason implements Internal.EnumLite {
            UNKNOWN_ERROR(0),
            INVALID_APP_ID(2),
            CURRENTLY_INITIALIZING(3),
            ALREADY_INITIALIZED(4),
            SDK_NOT_INITIALIZED(6),
            USER_AGENT_ERROR(7),
            API_REQUEST_ERROR(101),
            API_RESPONSE_DATA_ERROR(102),
            API_RESPONSE_DECODE_ERROR(103),
            API_FAILED_STATUS_CODE(104),
            INVALID_TEMPLATE_URL(105),
            INVALID_REQUEST_BUILDER_ERROR(106),
            TEMPLATE_UNZIP_ERROR(109),
            INVALID_CTA_URL(110),
            INVALID_ASSET_URL(111),
            ASSET_REQUEST_ERROR(112),
            ASSET_RESPONSE_DATA_ERROR(113),
            ASSET_WRITE_ERROR(114),
            INVALID_INDEX_URL(115),
            GZIP_ENCODE_ERROR(116),
            ASSET_FAILED_STATUS_CODE(117),
            PROTOBUF_SERIALIZATION_ERROR(118),
            JSON_ENCODE_ERROR(119),
            TPAT_ERROR(121),
            INVALID_ADS_ENDPOINT(122),
            INVALID_RI_ENDPOINT(123),
            INVALID_LOG_ERROR_ENDPOINT(124),
            INVALID_METRICS_ENDPOINT(125),
            ASSET_FAILED_INSUFFICIENT_SPACE(126),
            ASSET_FAILED_MAX_SPACE_EXCEEDED(127),
            INVALID_TPAT_KEY(128),
            EMPTY_TPAT_ERROR(129),
            MRAID_DOWNLOAD_JS_ERROR(130),
            MRAID_JS_WRITE_FAILED(131),
            OMSDK_DOWNLOAD_JS_ERROR(132),
            OMSDK_JS_WRITE_FAILED(133),
            STORE_REGION_CODE_ERROR(134),
            INVALID_CONFIG_RESPONSE(135),
            PRIVACY_URL_ERROR(136),
            TPAT_RETRY_FAILED(137),
            CONFIG_REFRESH_FAILED(138),
            INVALID_EVENT_ID_ERROR(200),
            INVALID_PLACEMENT_ID(201),
            AD_CONSUMED(202),
            AD_IS_LOADING(203),
            AD_ALREADY_LOADED(204),
            AD_IS_PLAYING(205),
            AD_ALREADY_FAILED(206),
            PLACEMENT_AD_TYPE_MISMATCH(207),
            INVALID_BID_PAYLOAD(208),
            INVALID_JSON_BID_PAYLOAD(209),
            AD_NOT_LOADED(210),
            PLACEMENT_SLEEP(212),
            INVALID_ADUNIT_BID_PAYLOAD(213),
            INVALID_GZIP_BID_PAYLOAD(214),
            AD_RESPONSE_EMPTY(215),
            AD_RESPONSE_INVALID_TEMPLATE_TYPE(216),
            AD_RESPONSE_TIMED_OUT(217),
            MRAID_JS_DOES_NOT_EXIST(218),
            MRAID_JS_COPY_FAILED(219),
            AD_RESPONSE_RETRY_AFTER(220),
            AD_LOAD_FAIL_RETRY_AFTER(221),
            INVALID_WATERFALL_PLACEMENT_ID(222),
            STALE_CACHED_RESPONSE(STALE_CACHED_RESPONSE_VALUE),
            AD_NO_FILL(10001),
            AD_LOAD_TOO_FREQUENTLY(10002),
            AD_SERVER_ERROR(AD_SERVER_ERROR_VALUE),
            AD_PUBLISHER_MISMATCH(AD_PUBLISHER_MISMATCH_VALUE),
            AD_INTERNAL_INTEGRATION_ERROR(AD_INTERNAL_INTEGRATION_ERROR_VALUE),
            MRAID_ERROR(301),
            INVALID_IFA_STATUS(302),
            AD_EXPIRED(304),
            MRAID_BRIDGE_ERROR(305),
            AD_EXPIRED_ON_PLAY(307),
            AD_WIN_NOTIFICATION_ERROR(308),
            ASSET_FAILED_TO_DELETE(309),
            AD_HTML_FAILED_TO_LOAD(310),
            MRAID_JS_CALL_EMPTY(311),
            DEEPLINK_OPEN_FAILED(312),
            EVALUATE_JAVASCRIPT_FAILED(313),
            LINK_COMMAND_OPEN_FAILED(314),
            JSON_PARAMS_ENCODE_ERROR(315),
            GENERATE_JSON_DATA_ERROR(316),
            AD_CLOSED_TEMPLATE_ERROR(317),
            AD_CLOSED_MISSING_HEARTBEAT(318),
            CONCURRENT_PLAYBACK_UNSUPPORTED(400),
            BANNER_VIEW_INVALID_SIZE(500),
            NATIVE_ASSET_ERROR(600),
            WEB_VIEW_WEB_CONTENT_PROCESS_DID_TERMINATE(2000),
            WEB_VIEW_FAILED_NAVIGATION(2001),
            STORE_KIT_LOAD_ERROR(2002),
            OMSDK_COPY_ERROR(2003),
            STORE_OVERLAY_LOAD_ERROR(2004),
            REACHABILITY_INITIALIZATION_FAILED(2005),
            UNKNOWN_RADIO_ACCESS_TECHNOLOGY(2006),
            STORE_KIT_PRESENTATION_ERROR(2007),
            STORE_OVERLAY_PRESENTATION_ERROR(2008),
            INVALID_PLAY_PARAMETER(2009),
            OUT_OF_MEMORY(3001),
            UNRECOGNIZED(-1);

            public static final int AD_ALREADY_FAILED_VALUE = 206;
            public static final int AD_ALREADY_LOADED_VALUE = 204;
            public static final int AD_CLOSED_MISSING_HEARTBEAT_VALUE = 318;
            public static final int AD_CLOSED_TEMPLATE_ERROR_VALUE = 317;
            public static final int AD_CONSUMED_VALUE = 202;
            public static final int AD_EXPIRED_ON_PLAY_VALUE = 307;
            public static final int AD_EXPIRED_VALUE = 304;
            public static final int AD_HTML_FAILED_TO_LOAD_VALUE = 310;
            public static final int AD_INTERNAL_INTEGRATION_ERROR_VALUE = 30002;
            public static final int AD_IS_LOADING_VALUE = 203;
            public static final int AD_IS_PLAYING_VALUE = 205;
            public static final int AD_LOAD_FAIL_RETRY_AFTER_VALUE = 221;
            public static final int AD_LOAD_TOO_FREQUENTLY_VALUE = 10002;
            public static final int AD_NOT_LOADED_VALUE = 210;
            public static final int AD_NO_FILL_VALUE = 10001;
            public static final int AD_PUBLISHER_MISMATCH_VALUE = 30001;
            public static final int AD_RESPONSE_EMPTY_VALUE = 215;
            public static final int AD_RESPONSE_INVALID_TEMPLATE_TYPE_VALUE = 216;
            public static final int AD_RESPONSE_RETRY_AFTER_VALUE = 220;
            public static final int AD_RESPONSE_TIMED_OUT_VALUE = 217;
            public static final int AD_SERVER_ERROR_VALUE = 20001;
            public static final int AD_WIN_NOTIFICATION_ERROR_VALUE = 308;
            public static final int ALREADY_INITIALIZED_VALUE = 4;
            public static final int API_FAILED_STATUS_CODE_VALUE = 104;
            public static final int API_REQUEST_ERROR_VALUE = 101;
            public static final int API_RESPONSE_DATA_ERROR_VALUE = 102;
            public static final int API_RESPONSE_DECODE_ERROR_VALUE = 103;
            public static final int ASSET_FAILED_INSUFFICIENT_SPACE_VALUE = 126;
            public static final int ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE = 127;
            public static final int ASSET_FAILED_STATUS_CODE_VALUE = 117;
            public static final int ASSET_FAILED_TO_DELETE_VALUE = 309;
            public static final int ASSET_REQUEST_ERROR_VALUE = 112;
            public static final int ASSET_RESPONSE_DATA_ERROR_VALUE = 113;
            public static final int ASSET_WRITE_ERROR_VALUE = 114;
            public static final int BANNER_VIEW_INVALID_SIZE_VALUE = 500;
            public static final int CONCURRENT_PLAYBACK_UNSUPPORTED_VALUE = 400;
            public static final int CONFIG_REFRESH_FAILED_VALUE = 138;
            public static final int CURRENTLY_INITIALIZING_VALUE = 3;
            public static final int DEEPLINK_OPEN_FAILED_VALUE = 312;
            public static final int EMPTY_TPAT_ERROR_VALUE = 129;
            public static final int EVALUATE_JAVASCRIPT_FAILED_VALUE = 313;
            public static final int GENERATE_JSON_DATA_ERROR_VALUE = 316;
            public static final int GZIP_ENCODE_ERROR_VALUE = 116;
            public static final int INVALID_ADS_ENDPOINT_VALUE = 122;
            public static final int INVALID_ADUNIT_BID_PAYLOAD_VALUE = 213;
            public static final int INVALID_APP_ID_VALUE = 2;
            public static final int INVALID_ASSET_URL_VALUE = 111;
            public static final int INVALID_BID_PAYLOAD_VALUE = 208;
            public static final int INVALID_CONFIG_RESPONSE_VALUE = 135;
            public static final int INVALID_CTA_URL_VALUE = 110;
            public static final int INVALID_EVENT_ID_ERROR_VALUE = 200;
            public static final int INVALID_GZIP_BID_PAYLOAD_VALUE = 214;
            public static final int INVALID_IFA_STATUS_VALUE = 302;
            public static final int INVALID_INDEX_URL_VALUE = 115;
            public static final int INVALID_JSON_BID_PAYLOAD_VALUE = 209;
            public static final int INVALID_LOG_ERROR_ENDPOINT_VALUE = 124;
            public static final int INVALID_METRICS_ENDPOINT_VALUE = 125;
            public static final int INVALID_PLACEMENT_ID_VALUE = 201;
            public static final int INVALID_PLAY_PARAMETER_VALUE = 2009;
            public static final int INVALID_REQUEST_BUILDER_ERROR_VALUE = 106;
            public static final int INVALID_RI_ENDPOINT_VALUE = 123;
            public static final int INVALID_TEMPLATE_URL_VALUE = 105;
            public static final int INVALID_TPAT_KEY_VALUE = 128;
            public static final int INVALID_WATERFALL_PLACEMENT_ID_VALUE = 222;
            public static final int JSON_ENCODE_ERROR_VALUE = 119;
            public static final int JSON_PARAMS_ENCODE_ERROR_VALUE = 315;
            public static final int LINK_COMMAND_OPEN_FAILED_VALUE = 314;
            public static final int MRAID_BRIDGE_ERROR_VALUE = 305;
            public static final int MRAID_DOWNLOAD_JS_ERROR_VALUE = 130;
            public static final int MRAID_ERROR_VALUE = 301;
            public static final int MRAID_JS_CALL_EMPTY_VALUE = 311;
            public static final int MRAID_JS_COPY_FAILED_VALUE = 219;
            public static final int MRAID_JS_DOES_NOT_EXIST_VALUE = 218;
            public static final int MRAID_JS_WRITE_FAILED_VALUE = 131;
            public static final int NATIVE_ASSET_ERROR_VALUE = 600;
            public static final int OMSDK_COPY_ERROR_VALUE = 2003;
            public static final int OMSDK_DOWNLOAD_JS_ERROR_VALUE = 132;
            public static final int OMSDK_JS_WRITE_FAILED_VALUE = 133;
            public static final int OUT_OF_MEMORY_VALUE = 3001;
            public static final int PLACEMENT_AD_TYPE_MISMATCH_VALUE = 207;
            public static final int PLACEMENT_SLEEP_VALUE = 212;
            public static final int PRIVACY_URL_ERROR_VALUE = 136;
            public static final int PROTOBUF_SERIALIZATION_ERROR_VALUE = 118;
            public static final int REACHABILITY_INITIALIZATION_FAILED_VALUE = 2005;
            public static final int SDK_NOT_INITIALIZED_VALUE = 6;
            public static final int STALE_CACHED_RESPONSE_VALUE = 223;
            public static final int STORE_KIT_LOAD_ERROR_VALUE = 2002;
            public static final int STORE_KIT_PRESENTATION_ERROR_VALUE = 2007;
            public static final int STORE_OVERLAY_LOAD_ERROR_VALUE = 2004;
            public static final int STORE_OVERLAY_PRESENTATION_ERROR_VALUE = 2008;
            public static final int STORE_REGION_CODE_ERROR_VALUE = 134;
            public static final int TEMPLATE_UNZIP_ERROR_VALUE = 109;
            public static final int TPAT_ERROR_VALUE = 121;
            public static final int TPAT_RETRY_FAILED_VALUE = 137;
            public static final int UNKNOWN_ERROR_VALUE = 0;
            public static final int UNKNOWN_RADIO_ACCESS_TECHNOLOGY_VALUE = 2006;
            public static final int USER_AGENT_ERROR_VALUE = 7;
            public static final int WEB_VIEW_FAILED_NAVIGATION_VALUE = 2001;
            public static final int WEB_VIEW_WEB_CONTENT_PROCESS_DID_TERMINATE_VALUE = 2000;
            private static final Internal.EnumLiteMap<Reason> internalValueMap = new Internal.EnumLiteMap<Reason>() { // from class: com.vungle.ads.internal.protos.Sdk.SDKError.Reason.1
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public Reason findValueByNumber(int i) {
                    return Reason.forNumber(i);
                }
            };
            private final int value;

            @Override // com.google.protobuf.Internal.EnumLite
            public final int getNumber() {
                if (this == UNRECOGNIZED) {
                    throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
                }
                return this.value;
            }

            @Deprecated
            public static Reason valueOf(int i) {
                return forNumber(i);
            }

            public static Reason forNumber(int i) {
                if (i != 0) {
                    if (i == 2) {
                        return INVALID_APP_ID;
                    }
                    if (i == 3) {
                        return CURRENTLY_INITIALIZING;
                    }
                    if (i == 4) {
                        return ALREADY_INITIALIZED;
                    }
                    if (i == 6) {
                        return SDK_NOT_INITIALIZED;
                    }
                    if (i == 7) {
                        return USER_AGENT_ERROR;
                    }
                    if (i == 301) {
                        return MRAID_ERROR;
                    }
                    if (i == 302) {
                        return INVALID_IFA_STATUS;
                    }
                    if (i == 304) {
                        return AD_EXPIRED;
                    }
                    if (i != 305) {
                        switch (i) {
                            case 0:
                                break;
                            case 121:
                                return TPAT_ERROR;
                            case 122:
                                return INVALID_ADS_ENDPOINT;
                            case 123:
                                return INVALID_RI_ENDPOINT;
                            case 124:
                                return INVALID_LOG_ERROR_ENDPOINT;
                            case 125:
                                return INVALID_METRICS_ENDPOINT;
                            case 126:
                                return ASSET_FAILED_INSUFFICIENT_SPACE;
                            case 127:
                                return ASSET_FAILED_MAX_SPACE_EXCEEDED;
                            case 128:
                                return INVALID_TPAT_KEY;
                            case 129:
                                return EMPTY_TPAT_ERROR;
                            case 130:
                                return MRAID_DOWNLOAD_JS_ERROR;
                            case 131:
                                return MRAID_JS_WRITE_FAILED;
                            case 132:
                                return OMSDK_DOWNLOAD_JS_ERROR;
                            case 133:
                                return OMSDK_JS_WRITE_FAILED;
                            case 134:
                                return STORE_REGION_CODE_ERROR;
                            case 135:
                                return INVALID_CONFIG_RESPONSE;
                            case 136:
                                return PRIVACY_URL_ERROR;
                            case 137:
                                return TPAT_RETRY_FAILED;
                            case 138:
                                return CONFIG_REFRESH_FAILED;
                            case 400:
                                return CONCURRENT_PLAYBACK_UNSUPPORTED;
                            case 500:
                                return BANNER_VIEW_INVALID_SIZE;
                            case 600:
                                return NATIVE_ASSET_ERROR;
                            case 2000:
                                return WEB_VIEW_WEB_CONTENT_PROCESS_DID_TERMINATE;
                            case 2001:
                                return WEB_VIEW_FAILED_NAVIGATION;
                            case 2002:
                                return STORE_KIT_LOAD_ERROR;
                            case 2003:
                                return OMSDK_COPY_ERROR;
                            case 2004:
                                return STORE_OVERLAY_LOAD_ERROR;
                            case 2005:
                                return REACHABILITY_INITIALIZATION_FAILED;
                            case 2006:
                                return UNKNOWN_RADIO_ACCESS_TECHNOLOGY;
                            case 2007:
                                return STORE_KIT_PRESENTATION_ERROR;
                            case 2008:
                                return STORE_OVERLAY_PRESENTATION_ERROR;
                            case 2009:
                                return INVALID_PLAY_PARAMETER;
                            case 3001:
                                return OUT_OF_MEMORY;
                            case 10001:
                                return AD_NO_FILL;
                            case 10002:
                                return AD_LOAD_TOO_FREQUENTLY;
                            case AD_SERVER_ERROR_VALUE:
                                return AD_SERVER_ERROR;
                            case AD_PUBLISHER_MISMATCH_VALUE:
                                return AD_PUBLISHER_MISMATCH;
                            case AD_INTERNAL_INTEGRATION_ERROR_VALUE:
                                return AD_INTERNAL_INTEGRATION_ERROR;
                            default:
                                switch (i) {
                                    case 101:
                                        return API_REQUEST_ERROR;
                                    case 102:
                                        return API_RESPONSE_DATA_ERROR;
                                    case 103:
                                        return API_RESPONSE_DECODE_ERROR;
                                    case 104:
                                        return API_FAILED_STATUS_CODE;
                                    case 105:
                                        return INVALID_TEMPLATE_URL;
                                    case 106:
                                        return INVALID_REQUEST_BUILDER_ERROR;
                                    default:
                                        switch (i) {
                                            case 109:
                                                return TEMPLATE_UNZIP_ERROR;
                                            case 110:
                                                return INVALID_CTA_URL;
                                            case 111:
                                                return INVALID_ASSET_URL;
                                            case 112:
                                                return ASSET_REQUEST_ERROR;
                                            case 113:
                                                return ASSET_RESPONSE_DATA_ERROR;
                                            case 114:
                                                return ASSET_WRITE_ERROR;
                                            case 115:
                                                return INVALID_INDEX_URL;
                                            case 116:
                                                return GZIP_ENCODE_ERROR;
                                            case 117:
                                                return ASSET_FAILED_STATUS_CODE;
                                            case 118:
                                                return PROTOBUF_SERIALIZATION_ERROR;
                                            case 119:
                                                return JSON_ENCODE_ERROR;
                                            default:
                                                switch (i) {
                                                    case 200:
                                                        return INVALID_EVENT_ID_ERROR;
                                                    case 201:
                                                        return INVALID_PLACEMENT_ID;
                                                    case 202:
                                                        return AD_CONSUMED;
                                                    case 203:
                                                        return AD_IS_LOADING;
                                                    case 204:
                                                        return AD_ALREADY_LOADED;
                                                    case 205:
                                                        return AD_IS_PLAYING;
                                                    case 206:
                                                        return AD_ALREADY_FAILED;
                                                    case 207:
                                                        return PLACEMENT_AD_TYPE_MISMATCH;
                                                    case 208:
                                                        return INVALID_BID_PAYLOAD;
                                                    case 209:
                                                        return INVALID_JSON_BID_PAYLOAD;
                                                    case 210:
                                                        return AD_NOT_LOADED;
                                                    default:
                                                        switch (i) {
                                                            case 212:
                                                                return PLACEMENT_SLEEP;
                                                            case 213:
                                                                return INVALID_ADUNIT_BID_PAYLOAD;
                                                            case 214:
                                                                return INVALID_GZIP_BID_PAYLOAD;
                                                            case 215:
                                                                return AD_RESPONSE_EMPTY;
                                                            case 216:
                                                                return AD_RESPONSE_INVALID_TEMPLATE_TYPE;
                                                            case 217:
                                                                return AD_RESPONSE_TIMED_OUT;
                                                            case 218:
                                                                return MRAID_JS_DOES_NOT_EXIST;
                                                            case 219:
                                                                return MRAID_JS_COPY_FAILED;
                                                            case 220:
                                                                return AD_RESPONSE_RETRY_AFTER;
                                                            case 221:
                                                                return AD_LOAD_FAIL_RETRY_AFTER;
                                                            case 222:
                                                                return INVALID_WATERFALL_PLACEMENT_ID;
                                                            case STALE_CACHED_RESPONSE_VALUE:
                                                                return STALE_CACHED_RESPONSE;
                                                            default:
                                                                switch (i) {
                                                                    case 307:
                                                                        return AD_EXPIRED_ON_PLAY;
                                                                    case 308:
                                                                        return AD_WIN_NOTIFICATION_ERROR;
                                                                    case 309:
                                                                        return ASSET_FAILED_TO_DELETE;
                                                                    case 310:
                                                                        return AD_HTML_FAILED_TO_LOAD;
                                                                    case 311:
                                                                        return MRAID_JS_CALL_EMPTY;
                                                                    case 312:
                                                                        return DEEPLINK_OPEN_FAILED;
                                                                    case 313:
                                                                        return EVALUATE_JAVASCRIPT_FAILED;
                                                                    case 314:
                                                                        return LINK_COMMAND_OPEN_FAILED;
                                                                    case 315:
                                                                        return JSON_PARAMS_ENCODE_ERROR;
                                                                    case 316:
                                                                        return GENERATE_JSON_DATA_ERROR;
                                                                    case 317:
                                                                        return AD_CLOSED_TEMPLATE_ERROR;
                                                                    case 318:
                                                                        return AD_CLOSED_MISSING_HEARTBEAT;
                                                                    default:
                                                                        return null;
                                                                }
                                                        }
                                                }
                                        }
                                }
                        }
                    } else {
                        return MRAID_BRIDGE_ERROR;
                    }
                }
                return UNKNOWN_ERROR;
            }

            public static Internal.EnumLiteMap<Reason> internalGetValueMap() {
                return internalValueMap;
            }

            public static Internal.EnumVerifier internalGetVerifier() {
                return ReasonVerifier.INSTANCE;
            }

            private static final class ReasonVerifier implements Internal.EnumVerifier {
                static final Internal.EnumVerifier INSTANCE = new ReasonVerifier();

                private ReasonVerifier() {
                }

                @Override // com.google.protobuf.Internal.EnumVerifier
                public boolean isInRange(int i) {
                    return Reason.forNumber(i) != null;
                }
            }

            Reason(int i) {
                this.value = i;
            }
        }

        @Override // com.vungle.ads.internal.protos.Sdk.SDKErrorOrBuilder
        public long getAt() {
            return this.at_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAt(long j) {
            this.at_ = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAt() {
            this.at_ = 0L;
        }

        @Override // com.vungle.ads.internal.protos.Sdk.SDKErrorOrBuilder
        public int getReasonValue() {
            return this.reason_;
        }

        @Override // com.vungle.ads.internal.protos.Sdk.SDKErrorOrBuilder
        public Reason getReason() {
            Reason reasonForNumber = Reason.forNumber(this.reason_);
            return reasonForNumber == null ? Reason.UNRECOGNIZED : reasonForNumber;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setReasonValue(int i) {
            this.reason_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setReason(Reason reason) {
            this.reason_ = reason.getNumber();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearReason() {
            this.reason_ = 0;
        }

        @Override // com.vungle.ads.internal.protos.Sdk.SDKErrorOrBuilder
        public String getMessage() {
            return this.message_;
        }

        @Override // com.vungle.ads.internal.protos.Sdk.SDKErrorOrBuilder
        public ByteString getMessageBytes() {
            return ByteString.copyFromUtf8(this.message_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMessage(String str) {
            str.getClass();
            this.message_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMessage() {
            this.message_ = getDefaultInstance().getMessage();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMessageBytes(ByteString byteString) {
            checkByteStringIsUtf8(byteString);
            this.message_ = byteString.toStringUtf8();
        }

        @Override // com.vungle.ads.internal.protos.Sdk.SDKErrorOrBuilder
        public String getEventId() {
            return this.eventId_;
        }

        @Override // com.vungle.ads.internal.protos.Sdk.SDKErrorOrBuilder
        public ByteString getEventIdBytes() {
            return ByteString.copyFromUtf8(this.eventId_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setEventId(String str) {
            str.getClass();
            this.eventId_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearEventId() {
            this.eventId_ = getDefaultInstance().getEventId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setEventIdBytes(ByteString byteString) {
            checkByteStringIsUtf8(byteString);
            this.eventId_ = byteString.toStringUtf8();
        }

        @Override // com.vungle.ads.internal.protos.Sdk.SDKErrorOrBuilder
        public String getMake() {
            return this.make_;
        }

        @Override // com.vungle.ads.internal.protos.Sdk.SDKErrorOrBuilder
        public ByteString getMakeBytes() {
            return ByteString.copyFromUtf8(this.make_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMake(String str) {
            str.getClass();
            this.make_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMake() {
            this.make_ = getDefaultInstance().getMake();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMakeBytes(ByteString byteString) {
            checkByteStringIsUtf8(byteString);
            this.make_ = byteString.toStringUtf8();
        }

        @Override // com.vungle.ads.internal.protos.Sdk.SDKErrorOrBuilder
        public String getModel() {
            return this.model_;
        }

        @Override // com.vungle.ads.internal.protos.Sdk.SDKErrorOrBuilder
        public ByteString getModelBytes() {
            return ByteString.copyFromUtf8(this.model_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setModel(String str) {
            str.getClass();
            this.model_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearModel() {
            this.model_ = getDefaultInstance().getModel();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setModelBytes(ByteString byteString) {
            checkByteStringIsUtf8(byteString);
            this.model_ = byteString.toStringUtf8();
        }

        @Override // com.vungle.ads.internal.protos.Sdk.SDKErrorOrBuilder
        public String getOs() {
            return this.os_;
        }

        @Override // com.vungle.ads.internal.protos.Sdk.SDKErrorOrBuilder
        public ByteString getOsBytes() {
            return ByteString.copyFromUtf8(this.os_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setOs(String str) {
            str.getClass();
            this.os_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearOs() {
            this.os_ = getDefaultInstance().getOs();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setOsBytes(ByteString byteString) {
            checkByteStringIsUtf8(byteString);
            this.os_ = byteString.toStringUtf8();
        }

        @Override // com.vungle.ads.internal.protos.Sdk.SDKErrorOrBuilder
        public String getOsVersion() {
            return this.osVersion_;
        }

        @Override // com.vungle.ads.internal.protos.Sdk.SDKErrorOrBuilder
        public ByteString getOsVersionBytes() {
            return ByteString.copyFromUtf8(this.osVersion_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setOsVersion(String str) {
            str.getClass();
            this.osVersion_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearOsVersion() {
            this.osVersion_ = getDefaultInstance().getOsVersion();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setOsVersionBytes(ByteString byteString) {
            checkByteStringIsUtf8(byteString);
            this.osVersion_ = byteString.toStringUtf8();
        }

        @Override // com.vungle.ads.internal.protos.Sdk.SDKErrorOrBuilder
        public String getConnectionType() {
            return this.connectionType_;
        }

        @Override // com.vungle.ads.internal.protos.Sdk.SDKErrorOrBuilder
        public ByteString getConnectionTypeBytes() {
            return ByteString.copyFromUtf8(this.connectionType_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setConnectionType(String str) {
            str.getClass();
            this.connectionType_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearConnectionType() {
            this.connectionType_ = getDefaultInstance().getConnectionType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setConnectionTypeBytes(ByteString byteString) {
            checkByteStringIsUtf8(byteString);
            this.connectionType_ = byteString.toStringUtf8();
        }

        @Override // com.vungle.ads.internal.protos.Sdk.SDKErrorOrBuilder
        public String getConnectionTypeDetail() {
            return this.connectionTypeDetail_;
        }

        @Override // com.vungle.ads.internal.protos.Sdk.SDKErrorOrBuilder
        public ByteString getConnectionTypeDetailBytes() {
            return ByteString.copyFromUtf8(this.connectionTypeDetail_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setConnectionTypeDetail(String str) {
            str.getClass();
            this.connectionTypeDetail_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearConnectionTypeDetail() {
            this.connectionTypeDetail_ = getDefaultInstance().getConnectionTypeDetail();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setConnectionTypeDetailBytes(ByteString byteString) {
            checkByteStringIsUtf8(byteString);
            this.connectionTypeDetail_ = byteString.toStringUtf8();
        }

        @Override // com.vungle.ads.internal.protos.Sdk.SDKErrorOrBuilder
        public String getPlacementReferenceId() {
            return this.placementReferenceId_;
        }

        @Override // com.vungle.ads.internal.protos.Sdk.SDKErrorOrBuilder
        public ByteString getPlacementReferenceIdBytes() {
            return ByteString.copyFromUtf8(this.placementReferenceId_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPlacementReferenceId(String str) {
            str.getClass();
            this.placementReferenceId_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPlacementReferenceId() {
            this.placementReferenceId_ = getDefaultInstance().getPlacementReferenceId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPlacementReferenceIdBytes(ByteString byteString) {
            checkByteStringIsUtf8(byteString);
            this.placementReferenceId_ = byteString.toStringUtf8();
        }

        @Override // com.vungle.ads.internal.protos.Sdk.SDKErrorOrBuilder
        public String getCreativeId() {
            return this.creativeId_;
        }

        @Override // com.vungle.ads.internal.protos.Sdk.SDKErrorOrBuilder
        public ByteString getCreativeIdBytes() {
            return ByteString.copyFromUtf8(this.creativeId_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCreativeId(String str) {
            str.getClass();
            this.creativeId_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCreativeId() {
            this.creativeId_ = getDefaultInstance().getCreativeId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCreativeIdBytes(ByteString byteString) {
            checkByteStringIsUtf8(byteString);
            this.creativeId_ = byteString.toStringUtf8();
        }

        @Override // com.vungle.ads.internal.protos.Sdk.SDKErrorOrBuilder
        public String getSessionId() {
            return this.sessionId_;
        }

        @Override // com.vungle.ads.internal.protos.Sdk.SDKErrorOrBuilder
        public ByteString getSessionIdBytes() {
            return ByteString.copyFromUtf8(this.sessionId_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSessionId(String str) {
            str.getClass();
            this.sessionId_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSessionId() {
            this.sessionId_ = getDefaultInstance().getSessionId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSessionIdBytes(ByteString byteString) {
            checkByteStringIsUtf8(byteString);
            this.sessionId_ = byteString.toStringUtf8();
        }

        @Override // com.vungle.ads.internal.protos.Sdk.SDKErrorOrBuilder
        public String getConnectionTypeDetailAndroid() {
            return this.connectionTypeDetailAndroid_;
        }

        @Override // com.vungle.ads.internal.protos.Sdk.SDKErrorOrBuilder
        public ByteString getConnectionTypeDetailAndroidBytes() {
            return ByteString.copyFromUtf8(this.connectionTypeDetailAndroid_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setConnectionTypeDetailAndroid(String str) {
            str.getClass();
            this.connectionTypeDetailAndroid_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearConnectionTypeDetailAndroid() {
            this.connectionTypeDetailAndroid_ = getDefaultInstance().getConnectionTypeDetailAndroid();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setConnectionTypeDetailAndroidBytes(ByteString byteString) {
            checkByteStringIsUtf8(byteString);
            this.connectionTypeDetailAndroid_ = byteString.toStringUtf8();
        }

        public static SDKError parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (SDKError) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static SDKError parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (SDKError) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static SDKError parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (SDKError) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static SDKError parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (SDKError) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static SDKError parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (SDKError) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static SDKError parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (SDKError) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static SDKError parseFrom(InputStream inputStream) throws IOException {
            return (SDKError) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static SDKError parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (SDKError) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static SDKError parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (SDKError) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static SDKError parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (SDKError) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static SDKError parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (SDKError) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static SDKError parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (SDKError) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(SDKError sDKError) {
            return DEFAULT_INSTANCE.createBuilder(sDKError);
        }

        public static final class Builder extends GeneratedMessageLite.Builder<SDKError, Builder> implements SDKErrorOrBuilder {
            /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            private Builder() {
                super(SDKError.DEFAULT_INSTANCE);
            }

            @Override // com.vungle.ads.internal.protos.Sdk.SDKErrorOrBuilder
            public long getAt() {
                return ((SDKError) this.instance).getAt();
            }

            public Builder setAt(long j) {
                copyOnWrite();
                ((SDKError) this.instance).setAt(j);
                return this;
            }

            public Builder clearAt() {
                copyOnWrite();
                ((SDKError) this.instance).clearAt();
                return this;
            }

            @Override // com.vungle.ads.internal.protos.Sdk.SDKErrorOrBuilder
            public int getReasonValue() {
                return ((SDKError) this.instance).getReasonValue();
            }

            public Builder setReasonValue(int i) {
                copyOnWrite();
                ((SDKError) this.instance).setReasonValue(i);
                return this;
            }

            @Override // com.vungle.ads.internal.protos.Sdk.SDKErrorOrBuilder
            public Reason getReason() {
                return ((SDKError) this.instance).getReason();
            }

            public Builder setReason(Reason reason) {
                copyOnWrite();
                ((SDKError) this.instance).setReason(reason);
                return this;
            }

            public Builder clearReason() {
                copyOnWrite();
                ((SDKError) this.instance).clearReason();
                return this;
            }

            @Override // com.vungle.ads.internal.protos.Sdk.SDKErrorOrBuilder
            public String getMessage() {
                return ((SDKError) this.instance).getMessage();
            }

            @Override // com.vungle.ads.internal.protos.Sdk.SDKErrorOrBuilder
            public ByteString getMessageBytes() {
                return ((SDKError) this.instance).getMessageBytes();
            }

            public Builder setMessage(String str) {
                copyOnWrite();
                ((SDKError) this.instance).setMessage(str);
                return this;
            }

            public Builder clearMessage() {
                copyOnWrite();
                ((SDKError) this.instance).clearMessage();
                return this;
            }

            public Builder setMessageBytes(ByteString byteString) {
                copyOnWrite();
                ((SDKError) this.instance).setMessageBytes(byteString);
                return this;
            }

            @Override // com.vungle.ads.internal.protos.Sdk.SDKErrorOrBuilder
            public String getEventId() {
                return ((SDKError) this.instance).getEventId();
            }

            @Override // com.vungle.ads.internal.protos.Sdk.SDKErrorOrBuilder
            public ByteString getEventIdBytes() {
                return ((SDKError) this.instance).getEventIdBytes();
            }

            public Builder setEventId(String str) {
                copyOnWrite();
                ((SDKError) this.instance).setEventId(str);
                return this;
            }

            public Builder clearEventId() {
                copyOnWrite();
                ((SDKError) this.instance).clearEventId();
                return this;
            }

            public Builder setEventIdBytes(ByteString byteString) {
                copyOnWrite();
                ((SDKError) this.instance).setEventIdBytes(byteString);
                return this;
            }

            @Override // com.vungle.ads.internal.protos.Sdk.SDKErrorOrBuilder
            public String getMake() {
                return ((SDKError) this.instance).getMake();
            }

            @Override // com.vungle.ads.internal.protos.Sdk.SDKErrorOrBuilder
            public ByteString getMakeBytes() {
                return ((SDKError) this.instance).getMakeBytes();
            }

            public Builder setMake(String str) {
                copyOnWrite();
                ((SDKError) this.instance).setMake(str);
                return this;
            }

            public Builder clearMake() {
                copyOnWrite();
                ((SDKError) this.instance).clearMake();
                return this;
            }

            public Builder setMakeBytes(ByteString byteString) {
                copyOnWrite();
                ((SDKError) this.instance).setMakeBytes(byteString);
                return this;
            }

            @Override // com.vungle.ads.internal.protos.Sdk.SDKErrorOrBuilder
            public String getModel() {
                return ((SDKError) this.instance).getModel();
            }

            @Override // com.vungle.ads.internal.protos.Sdk.SDKErrorOrBuilder
            public ByteString getModelBytes() {
                return ((SDKError) this.instance).getModelBytes();
            }

            public Builder setModel(String str) {
                copyOnWrite();
                ((SDKError) this.instance).setModel(str);
                return this;
            }

            public Builder clearModel() {
                copyOnWrite();
                ((SDKError) this.instance).clearModel();
                return this;
            }

            public Builder setModelBytes(ByteString byteString) {
                copyOnWrite();
                ((SDKError) this.instance).setModelBytes(byteString);
                return this;
            }

            @Override // com.vungle.ads.internal.protos.Sdk.SDKErrorOrBuilder
            public String getOs() {
                return ((SDKError) this.instance).getOs();
            }

            @Override // com.vungle.ads.internal.protos.Sdk.SDKErrorOrBuilder
            public ByteString getOsBytes() {
                return ((SDKError) this.instance).getOsBytes();
            }

            public Builder setOs(String str) {
                copyOnWrite();
                ((SDKError) this.instance).setOs(str);
                return this;
            }

            public Builder clearOs() {
                copyOnWrite();
                ((SDKError) this.instance).clearOs();
                return this;
            }

            public Builder setOsBytes(ByteString byteString) {
                copyOnWrite();
                ((SDKError) this.instance).setOsBytes(byteString);
                return this;
            }

            @Override // com.vungle.ads.internal.protos.Sdk.SDKErrorOrBuilder
            public String getOsVersion() {
                return ((SDKError) this.instance).getOsVersion();
            }

            @Override // com.vungle.ads.internal.protos.Sdk.SDKErrorOrBuilder
            public ByteString getOsVersionBytes() {
                return ((SDKError) this.instance).getOsVersionBytes();
            }

            public Builder setOsVersion(String str) {
                copyOnWrite();
                ((SDKError) this.instance).setOsVersion(str);
                return this;
            }

            public Builder clearOsVersion() {
                copyOnWrite();
                ((SDKError) this.instance).clearOsVersion();
                return this;
            }

            public Builder setOsVersionBytes(ByteString byteString) {
                copyOnWrite();
                ((SDKError) this.instance).setOsVersionBytes(byteString);
                return this;
            }

            @Override // com.vungle.ads.internal.protos.Sdk.SDKErrorOrBuilder
            public String getConnectionType() {
                return ((SDKError) this.instance).getConnectionType();
            }

            @Override // com.vungle.ads.internal.protos.Sdk.SDKErrorOrBuilder
            public ByteString getConnectionTypeBytes() {
                return ((SDKError) this.instance).getConnectionTypeBytes();
            }

            public Builder setConnectionType(String str) {
                copyOnWrite();
                ((SDKError) this.instance).setConnectionType(str);
                return this;
            }

            public Builder clearConnectionType() {
                copyOnWrite();
                ((SDKError) this.instance).clearConnectionType();
                return this;
            }

            public Builder setConnectionTypeBytes(ByteString byteString) {
                copyOnWrite();
                ((SDKError) this.instance).setConnectionTypeBytes(byteString);
                return this;
            }

            @Override // com.vungle.ads.internal.protos.Sdk.SDKErrorOrBuilder
            public String getConnectionTypeDetail() {
                return ((SDKError) this.instance).getConnectionTypeDetail();
            }

            @Override // com.vungle.ads.internal.protos.Sdk.SDKErrorOrBuilder
            public ByteString getConnectionTypeDetailBytes() {
                return ((SDKError) this.instance).getConnectionTypeDetailBytes();
            }

            public Builder setConnectionTypeDetail(String str) {
                copyOnWrite();
                ((SDKError) this.instance).setConnectionTypeDetail(str);
                return this;
            }

            public Builder clearConnectionTypeDetail() {
                copyOnWrite();
                ((SDKError) this.instance).clearConnectionTypeDetail();
                return this;
            }

            public Builder setConnectionTypeDetailBytes(ByteString byteString) {
                copyOnWrite();
                ((SDKError) this.instance).setConnectionTypeDetailBytes(byteString);
                return this;
            }

            @Override // com.vungle.ads.internal.protos.Sdk.SDKErrorOrBuilder
            public String getPlacementReferenceId() {
                return ((SDKError) this.instance).getPlacementReferenceId();
            }

            @Override // com.vungle.ads.internal.protos.Sdk.SDKErrorOrBuilder
            public ByteString getPlacementReferenceIdBytes() {
                return ((SDKError) this.instance).getPlacementReferenceIdBytes();
            }

            public Builder setPlacementReferenceId(String str) {
                copyOnWrite();
                ((SDKError) this.instance).setPlacementReferenceId(str);
                return this;
            }

            public Builder clearPlacementReferenceId() {
                copyOnWrite();
                ((SDKError) this.instance).clearPlacementReferenceId();
                return this;
            }

            public Builder setPlacementReferenceIdBytes(ByteString byteString) {
                copyOnWrite();
                ((SDKError) this.instance).setPlacementReferenceIdBytes(byteString);
                return this;
            }

            @Override // com.vungle.ads.internal.protos.Sdk.SDKErrorOrBuilder
            public String getCreativeId() {
                return ((SDKError) this.instance).getCreativeId();
            }

            @Override // com.vungle.ads.internal.protos.Sdk.SDKErrorOrBuilder
            public ByteString getCreativeIdBytes() {
                return ((SDKError) this.instance).getCreativeIdBytes();
            }

            public Builder setCreativeId(String str) {
                copyOnWrite();
                ((SDKError) this.instance).setCreativeId(str);
                return this;
            }

            public Builder clearCreativeId() {
                copyOnWrite();
                ((SDKError) this.instance).clearCreativeId();
                return this;
            }

            public Builder setCreativeIdBytes(ByteString byteString) {
                copyOnWrite();
                ((SDKError) this.instance).setCreativeIdBytes(byteString);
                return this;
            }

            @Override // com.vungle.ads.internal.protos.Sdk.SDKErrorOrBuilder
            public String getSessionId() {
                return ((SDKError) this.instance).getSessionId();
            }

            @Override // com.vungle.ads.internal.protos.Sdk.SDKErrorOrBuilder
            public ByteString getSessionIdBytes() {
                return ((SDKError) this.instance).getSessionIdBytes();
            }

            public Builder setSessionId(String str) {
                copyOnWrite();
                ((SDKError) this.instance).setSessionId(str);
                return this;
            }

            public Builder clearSessionId() {
                copyOnWrite();
                ((SDKError) this.instance).clearSessionId();
                return this;
            }

            public Builder setSessionIdBytes(ByteString byteString) {
                copyOnWrite();
                ((SDKError) this.instance).setSessionIdBytes(byteString);
                return this;
            }

            @Override // com.vungle.ads.internal.protos.Sdk.SDKErrorOrBuilder
            public String getConnectionTypeDetailAndroid() {
                return ((SDKError) this.instance).getConnectionTypeDetailAndroid();
            }

            @Override // com.vungle.ads.internal.protos.Sdk.SDKErrorOrBuilder
            public ByteString getConnectionTypeDetailAndroidBytes() {
                return ((SDKError) this.instance).getConnectionTypeDetailAndroidBytes();
            }

            public Builder setConnectionTypeDetailAndroid(String str) {
                copyOnWrite();
                ((SDKError) this.instance).setConnectionTypeDetailAndroid(str);
                return this;
            }

            public Builder clearConnectionTypeDetailAndroid() {
                copyOnWrite();
                ((SDKError) this.instance).clearConnectionTypeDetailAndroid();
                return this;
            }

            public Builder setConnectionTypeDetailAndroidBytes(ByteString byteString) {
                copyOnWrite();
                ((SDKError) this.instance).setConnectionTypeDetailAndroidBytes(byteString);
                return this;
            }
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new SDKError();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u000e\u0000\u0000\u0001e\u000e\u0000\u0000\u0000\u0001\u0002\u0002\f\u0003Ȉ\u0004Ȉ\u0005Ȉ\u0006Ȉ\u0007Ȉ\bȈ\tȈ\nȈ\u000bȈ\fȈ\rȈeȈ", new Object[]{"at_", "reason_", "message_", "eventId_", "make_", "model_", "os_", "osVersion_", "connectionType_", "connectionTypeDetail_", "placementReferenceId_", "creativeId_", "sessionId_", "connectionTypeDetailAndroid_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<SDKError> defaultInstanceBasedParser = PARSER;
                    if (defaultInstanceBasedParser == null) {
                        synchronized (SDKError.class) {
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
            SDKError sDKError = new SDKError();
            DEFAULT_INSTANCE = sDKError;
            GeneratedMessageLite.registerDefaultInstance(SDKError.class, sDKError);
        }

        public static SDKError getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<SDKError> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }

    public static final class MetricBatch extends GeneratedMessageLite<MetricBatch, Builder> implements MetricBatchOrBuilder {
        private static final MetricBatch DEFAULT_INSTANCE;
        public static final int METRICS_FIELD_NUMBER = 1;
        private static volatile Parser<MetricBatch> PARSER;
        private Internal.ProtobufList<SDKMetric> metrics_ = emptyProtobufList();

        private MetricBatch() {
        }

        @Override // com.vungle.ads.internal.protos.Sdk.MetricBatchOrBuilder
        public List<SDKMetric> getMetricsList() {
            return this.metrics_;
        }

        public List<? extends SDKMetricOrBuilder> getMetricsOrBuilderList() {
            return this.metrics_;
        }

        @Override // com.vungle.ads.internal.protos.Sdk.MetricBatchOrBuilder
        public int getMetricsCount() {
            return this.metrics_.size();
        }

        @Override // com.vungle.ads.internal.protos.Sdk.MetricBatchOrBuilder
        public SDKMetric getMetrics(int i) {
            return this.metrics_.get(i);
        }

        public SDKMetricOrBuilder getMetricsOrBuilder(int i) {
            return this.metrics_.get(i);
        }

        private void ensureMetricsIsMutable() {
            Internal.ProtobufList<SDKMetric> protobufList = this.metrics_;
            if (protobufList.isModifiable()) {
                return;
            }
            this.metrics_ = GeneratedMessageLite.mutableCopy(protobufList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMetrics(int i, SDKMetric sDKMetric) {
            sDKMetric.getClass();
            ensureMetricsIsMutable();
            this.metrics_.set(i, sDKMetric);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addMetrics(SDKMetric sDKMetric) {
            sDKMetric.getClass();
            ensureMetricsIsMutable();
            this.metrics_.add(sDKMetric);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addMetrics(int i, SDKMetric sDKMetric) {
            sDKMetric.getClass();
            ensureMetricsIsMutable();
            this.metrics_.add(i, sDKMetric);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllMetrics(Iterable<? extends SDKMetric> iterable) {
            ensureMetricsIsMutable();
            AbstractMessageLite.addAll((Iterable) iterable, (List) this.metrics_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMetrics() {
            this.metrics_ = emptyProtobufList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeMetrics(int i) {
            ensureMetricsIsMutable();
            this.metrics_.remove(i);
        }

        public static MetricBatch parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (MetricBatch) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static MetricBatch parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (MetricBatch) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static MetricBatch parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (MetricBatch) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static MetricBatch parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (MetricBatch) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static MetricBatch parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (MetricBatch) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static MetricBatch parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (MetricBatch) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static MetricBatch parseFrom(InputStream inputStream) throws IOException {
            return (MetricBatch) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static MetricBatch parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (MetricBatch) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static MetricBatch parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (MetricBatch) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static MetricBatch parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (MetricBatch) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static MetricBatch parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (MetricBatch) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static MetricBatch parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (MetricBatch) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(MetricBatch metricBatch) {
            return DEFAULT_INSTANCE.createBuilder(metricBatch);
        }

        public static final class Builder extends GeneratedMessageLite.Builder<MetricBatch, Builder> implements MetricBatchOrBuilder {
            /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            private Builder() {
                super(MetricBatch.DEFAULT_INSTANCE);
            }

            @Override // com.vungle.ads.internal.protos.Sdk.MetricBatchOrBuilder
            public List<SDKMetric> getMetricsList() {
                return Collections.unmodifiableList(((MetricBatch) this.instance).getMetricsList());
            }

            @Override // com.vungle.ads.internal.protos.Sdk.MetricBatchOrBuilder
            public int getMetricsCount() {
                return ((MetricBatch) this.instance).getMetricsCount();
            }

            @Override // com.vungle.ads.internal.protos.Sdk.MetricBatchOrBuilder
            public SDKMetric getMetrics(int i) {
                return ((MetricBatch) this.instance).getMetrics(i);
            }

            public Builder setMetrics(int i, SDKMetric sDKMetric) {
                copyOnWrite();
                ((MetricBatch) this.instance).setMetrics(i, sDKMetric);
                return this;
            }

            public Builder setMetrics(int i, SDKMetric.Builder builder) {
                copyOnWrite();
                ((MetricBatch) this.instance).setMetrics(i, builder.build());
                return this;
            }

            public Builder addMetrics(SDKMetric sDKMetric) {
                copyOnWrite();
                ((MetricBatch) this.instance).addMetrics(sDKMetric);
                return this;
            }

            public Builder addMetrics(int i, SDKMetric sDKMetric) {
                copyOnWrite();
                ((MetricBatch) this.instance).addMetrics(i, sDKMetric);
                return this;
            }

            public Builder addMetrics(SDKMetric.Builder builder) {
                copyOnWrite();
                ((MetricBatch) this.instance).addMetrics(builder.build());
                return this;
            }

            public Builder addMetrics(int i, SDKMetric.Builder builder) {
                copyOnWrite();
                ((MetricBatch) this.instance).addMetrics(i, builder.build());
                return this;
            }

            public Builder addAllMetrics(Iterable<? extends SDKMetric> iterable) {
                copyOnWrite();
                ((MetricBatch) this.instance).addAllMetrics(iterable);
                return this;
            }

            public Builder clearMetrics() {
                copyOnWrite();
                ((MetricBatch) this.instance).clearMetrics();
                return this;
            }

            public Builder removeMetrics(int i) {
                copyOnWrite();
                ((MetricBatch) this.instance).removeMetrics(i);
                return this;
            }
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new MetricBatch();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"metrics_", SDKMetric.class});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<MetricBatch> defaultInstanceBasedParser = PARSER;
                    if (defaultInstanceBasedParser == null) {
                        synchronized (MetricBatch.class) {
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
            MetricBatch metricBatch = new MetricBatch();
            DEFAULT_INSTANCE = metricBatch;
            GeneratedMessageLite.registerDefaultInstance(MetricBatch.class, metricBatch);
        }

        public static MetricBatch getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<MetricBatch> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }

    public static final class SDKMetric extends GeneratedMessageLite<SDKMetric, Builder> implements SDKMetricOrBuilder {
        public static final int CONNECTIONTYPEDETAIL_FIELD_NUMBER = 9;
        public static final int CONNECTIONTYPE_FIELD_NUMBER = 8;
        public static final int CREATIVEID_FIELD_NUMBER = 11;
        private static final SDKMetric DEFAULT_INSTANCE;
        public static final int EVENTID_FIELD_NUMBER = 12;
        public static final int MAKE_FIELD_NUMBER = 4;
        public static final int META_FIELD_NUMBER = 3;
        public static final int MODEL_FIELD_NUMBER = 5;
        public static final int OSVERSION_FIELD_NUMBER = 7;
        public static final int OS_FIELD_NUMBER = 6;
        private static volatile Parser<SDKMetric> PARSER = null;
        public static final int PLACEMENTREFERENCEID_FIELD_NUMBER = 10;
        public static final int SESSIONID_FIELD_NUMBER = 13;
        public static final int TYPE_FIELD_NUMBER = 1;
        public static final int VALUE_FIELD_NUMBER = 2;
        private int type_;
        private long value_;
        private String meta_ = "";
        private String make_ = "";
        private String model_ = "";
        private String os_ = "";
        private String osVersion_ = "";
        private String connectionType_ = "";
        private String connectionTypeDetail_ = "";
        private String placementReferenceId_ = "";
        private String creativeId_ = "";
        private String eventId_ = "";
        private String sessionId_ = "";

        private SDKMetric() {
        }

        public enum SDKMetricType implements Internal.EnumLite {
            UNKNOWN_METRIC_TYPE(0),
            AD_REQUEST_TO_RESPONSE_DURATION_MS(1),
            AD_RESPONSE_TO_SHOW_DURATION_MS(2),
            AD_SHOW_TO_DISPLAY_DURATION_MS(3),
            AD_DISPLAY_TO_CLICK_DURATION_MS(4),
            IOS_STORE_KIT_LOAD_TIME_MS(5),
            INIT_REQUEST_TO_RESPONSE_DURATION_MS(6),
            ASSET_DOWNLOAD_DURATION_MS(7),
            LOCAL_ASSETS_USED(8),
            REMOTE_ASSETS_USED(9),
            TEMPLATE_DOWNLOAD_DURATION_MS(10),
            AD_REQUEST_TO_CALLBACK_DURATION_MS(11),
            AD_REQUEST_TO_CALLBACK_ADO_DURATION_MS(12),
            ASSET_FILE_SIZE(13),
            USER_AGENT_LOAD_DURATION_MS(14),
            TEMPLATE_ZIP_SIZE(15),
            CACHED_ASSETS_USED(16),
            LOAD_AD_API(17),
            TPAT_FIRED(18),
            TPAT_SUCCESS(19),
            WIN_NOTIF_FIRED(20),
            WIN_NOTIF_SUCCESS(21),
            AD_EXPIRED_BEFORE_PLAY(22),
            PLAY_AD_API(23),
            AD_LOAD_FAIL(24),
            VIEW_NOT_VISIBLE_ON_PLAY(25),
            MRAID_DOWNLOAD_JS_RETRY_SUCCESS(26),
            OMSDK_DOWNLOAD_JS_RETRY_SUCCESS(27),
            PRIVACY_URL_OPENED(28),
            NOTIFICATION_REDIRECT(29),
            AD_PLAY_RESET_ON_DEINIT(30),
            TEMPLATE_HTML_SIZE(31),
            SKOVERLAY_PRESENTED_FOR_AD(2000),
            SAFARI_PRESENTED_FOR_AD(2001),
            STORE_KIT_PRESENTED_FOR_AD(2002),
            STORE_KIT_NOT_READY(2003),
            LAUNCH_STORE_KIT_REQUEST(2004),
            LAUNCH_SKOVERLAY_REQUEST(2005),
            LAUNCH_SAFARI_REQUEST(2006),
            IDFV_RESTRICTED(2007),
            NOTIFICATION_WAIT_FOR_CONNECTIVITY(2008),
            IDFV_VALUE_CHANGED(2009),
            HARDWARE_ACCELERATE_DISABLED(3001),
            UNRECOGNIZED(-1);

            public static final int AD_DISPLAY_TO_CLICK_DURATION_MS_VALUE = 4;

            @Deprecated
            public static final int AD_EXPIRED_BEFORE_PLAY_VALUE = 22;
            public static final int AD_LOAD_FAIL_VALUE = 24;
            public static final int AD_PLAY_RESET_ON_DEINIT_VALUE = 30;
            public static final int AD_REQUEST_TO_CALLBACK_ADO_DURATION_MS_VALUE = 12;
            public static final int AD_REQUEST_TO_CALLBACK_DURATION_MS_VALUE = 11;
            public static final int AD_REQUEST_TO_RESPONSE_DURATION_MS_VALUE = 1;
            public static final int AD_RESPONSE_TO_SHOW_DURATION_MS_VALUE = 2;
            public static final int AD_SHOW_TO_DISPLAY_DURATION_MS_VALUE = 3;
            public static final int ASSET_DOWNLOAD_DURATION_MS_VALUE = 7;
            public static final int ASSET_FILE_SIZE_VALUE = 13;
            public static final int CACHED_ASSETS_USED_VALUE = 16;
            public static final int HARDWARE_ACCELERATE_DISABLED_VALUE = 3001;
            public static final int IDFV_RESTRICTED_VALUE = 2007;
            public static final int IDFV_VALUE_CHANGED_VALUE = 2009;
            public static final int INIT_REQUEST_TO_RESPONSE_DURATION_MS_VALUE = 6;
            public static final int IOS_STORE_KIT_LOAD_TIME_MS_VALUE = 5;
            public static final int LAUNCH_SAFARI_REQUEST_VALUE = 2006;
            public static final int LAUNCH_SKOVERLAY_REQUEST_VALUE = 2005;
            public static final int LAUNCH_STORE_KIT_REQUEST_VALUE = 2004;
            public static final int LOAD_AD_API_VALUE = 17;
            public static final int LOCAL_ASSETS_USED_VALUE = 8;
            public static final int MRAID_DOWNLOAD_JS_RETRY_SUCCESS_VALUE = 26;
            public static final int NOTIFICATION_REDIRECT_VALUE = 29;
            public static final int NOTIFICATION_WAIT_FOR_CONNECTIVITY_VALUE = 2008;
            public static final int OMSDK_DOWNLOAD_JS_RETRY_SUCCESS_VALUE = 27;
            public static final int PLAY_AD_API_VALUE = 23;
            public static final int PRIVACY_URL_OPENED_VALUE = 28;
            public static final int REMOTE_ASSETS_USED_VALUE = 9;
            public static final int SAFARI_PRESENTED_FOR_AD_VALUE = 2001;
            public static final int SKOVERLAY_PRESENTED_FOR_AD_VALUE = 2000;
            public static final int STORE_KIT_NOT_READY_VALUE = 2003;
            public static final int STORE_KIT_PRESENTED_FOR_AD_VALUE = 2002;
            public static final int TEMPLATE_DOWNLOAD_DURATION_MS_VALUE = 10;
            public static final int TEMPLATE_HTML_SIZE_VALUE = 31;
            public static final int TEMPLATE_ZIP_SIZE_VALUE = 15;
            public static final int TPAT_FIRED_VALUE = 18;
            public static final int TPAT_SUCCESS_VALUE = 19;
            public static final int UNKNOWN_METRIC_TYPE_VALUE = 0;
            public static final int USER_AGENT_LOAD_DURATION_MS_VALUE = 14;
            public static final int VIEW_NOT_VISIBLE_ON_PLAY_VALUE = 25;
            public static final int WIN_NOTIF_FIRED_VALUE = 20;
            public static final int WIN_NOTIF_SUCCESS_VALUE = 21;
            private static final Internal.EnumLiteMap<SDKMetricType> internalValueMap = new Internal.EnumLiteMap<SDKMetricType>() { // from class: com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.1
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public SDKMetricType findValueByNumber(int i) {
                    return SDKMetricType.forNumber(i);
                }
            };
            private final int value;

            @Override // com.google.protobuf.Internal.EnumLite
            public final int getNumber() {
                if (this == UNRECOGNIZED) {
                    throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
                }
                return this.value;
            }

            @Deprecated
            public static SDKMetricType valueOf(int i) {
                return forNumber(i);
            }

            public static SDKMetricType forNumber(int i) {
                if (i != 3001) {
                    switch (i) {
                        case 0:
                            return UNKNOWN_METRIC_TYPE;
                        case 1:
                            return AD_REQUEST_TO_RESPONSE_DURATION_MS;
                        case 2:
                            return AD_RESPONSE_TO_SHOW_DURATION_MS;
                        case 3:
                            return AD_SHOW_TO_DISPLAY_DURATION_MS;
                        case 4:
                            return AD_DISPLAY_TO_CLICK_DURATION_MS;
                        case 5:
                            return IOS_STORE_KIT_LOAD_TIME_MS;
                        case 6:
                            return INIT_REQUEST_TO_RESPONSE_DURATION_MS;
                        case 7:
                            return ASSET_DOWNLOAD_DURATION_MS;
                        case 8:
                            return LOCAL_ASSETS_USED;
                        case 9:
                            return REMOTE_ASSETS_USED;
                        case 10:
                            return TEMPLATE_DOWNLOAD_DURATION_MS;
                        case 11:
                            return AD_REQUEST_TO_CALLBACK_DURATION_MS;
                        case 12:
                            return AD_REQUEST_TO_CALLBACK_ADO_DURATION_MS;
                        case 13:
                            return ASSET_FILE_SIZE;
                        case 14:
                            return USER_AGENT_LOAD_DURATION_MS;
                        case 15:
                            return TEMPLATE_ZIP_SIZE;
                        case 16:
                            return CACHED_ASSETS_USED;
                        case 17:
                            return LOAD_AD_API;
                        case 18:
                            return TPAT_FIRED;
                        case 19:
                            return TPAT_SUCCESS;
                        case 20:
                            return WIN_NOTIF_FIRED;
                        case 21:
                            return WIN_NOTIF_SUCCESS;
                        case 22:
                            return AD_EXPIRED_BEFORE_PLAY;
                        case 23:
                            return PLAY_AD_API;
                        case 24:
                            return AD_LOAD_FAIL;
                        case 25:
                            return VIEW_NOT_VISIBLE_ON_PLAY;
                        case 26:
                            return MRAID_DOWNLOAD_JS_RETRY_SUCCESS;
                        case 27:
                            return OMSDK_DOWNLOAD_JS_RETRY_SUCCESS;
                        case 28:
                            return PRIVACY_URL_OPENED;
                        case 29:
                            return NOTIFICATION_REDIRECT;
                        case 30:
                            return AD_PLAY_RESET_ON_DEINIT;
                        case 31:
                            return TEMPLATE_HTML_SIZE;
                        default:
                            switch (i) {
                                case 2000:
                                    return SKOVERLAY_PRESENTED_FOR_AD;
                                case 2001:
                                    return SAFARI_PRESENTED_FOR_AD;
                                case 2002:
                                    return STORE_KIT_PRESENTED_FOR_AD;
                                case 2003:
                                    return STORE_KIT_NOT_READY;
                                case 2004:
                                    return LAUNCH_STORE_KIT_REQUEST;
                                case 2005:
                                    return LAUNCH_SKOVERLAY_REQUEST;
                                case 2006:
                                    return LAUNCH_SAFARI_REQUEST;
                                case 2007:
                                    return IDFV_RESTRICTED;
                                case 2008:
                                    return NOTIFICATION_WAIT_FOR_CONNECTIVITY;
                                case 2009:
                                    return IDFV_VALUE_CHANGED;
                                default:
                                    return null;
                            }
                    }
                }
                return HARDWARE_ACCELERATE_DISABLED;
            }

            public static Internal.EnumLiteMap<SDKMetricType> internalGetValueMap() {
                return internalValueMap;
            }

            public static Internal.EnumVerifier internalGetVerifier() {
                return SDKMetricTypeVerifier.INSTANCE;
            }

            private static final class SDKMetricTypeVerifier implements Internal.EnumVerifier {
                static final Internal.EnumVerifier INSTANCE = new SDKMetricTypeVerifier();

                private SDKMetricTypeVerifier() {
                }

                @Override // com.google.protobuf.Internal.EnumVerifier
                public boolean isInRange(int i) {
                    return SDKMetricType.forNumber(i) != null;
                }
            }

            SDKMetricType(int i) {
                this.value = i;
            }
        }

        @Override // com.vungle.ads.internal.protos.Sdk.SDKMetricOrBuilder
        public int getTypeValue() {
            return this.type_;
        }

        @Override // com.vungle.ads.internal.protos.Sdk.SDKMetricOrBuilder
        public SDKMetricType getType() {
            SDKMetricType sDKMetricTypeForNumber = SDKMetricType.forNumber(this.type_);
            return sDKMetricTypeForNumber == null ? SDKMetricType.UNRECOGNIZED : sDKMetricTypeForNumber;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTypeValue(int i) {
            this.type_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setType(SDKMetricType sDKMetricType) {
            this.type_ = sDKMetricType.getNumber();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearType() {
            this.type_ = 0;
        }

        @Override // com.vungle.ads.internal.protos.Sdk.SDKMetricOrBuilder
        public long getValue() {
            return this.value_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setValue(long j) {
            this.value_ = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearValue() {
            this.value_ = 0L;
        }

        @Override // com.vungle.ads.internal.protos.Sdk.SDKMetricOrBuilder
        public String getMeta() {
            return this.meta_;
        }

        @Override // com.vungle.ads.internal.protos.Sdk.SDKMetricOrBuilder
        public ByteString getMetaBytes() {
            return ByteString.copyFromUtf8(this.meta_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMeta(String str) {
            str.getClass();
            this.meta_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMeta() {
            this.meta_ = getDefaultInstance().getMeta();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMetaBytes(ByteString byteString) {
            checkByteStringIsUtf8(byteString);
            this.meta_ = byteString.toStringUtf8();
        }

        @Override // com.vungle.ads.internal.protos.Sdk.SDKMetricOrBuilder
        public String getMake() {
            return this.make_;
        }

        @Override // com.vungle.ads.internal.protos.Sdk.SDKMetricOrBuilder
        public ByteString getMakeBytes() {
            return ByteString.copyFromUtf8(this.make_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMake(String str) {
            str.getClass();
            this.make_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMake() {
            this.make_ = getDefaultInstance().getMake();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMakeBytes(ByteString byteString) {
            checkByteStringIsUtf8(byteString);
            this.make_ = byteString.toStringUtf8();
        }

        @Override // com.vungle.ads.internal.protos.Sdk.SDKMetricOrBuilder
        public String getModel() {
            return this.model_;
        }

        @Override // com.vungle.ads.internal.protos.Sdk.SDKMetricOrBuilder
        public ByteString getModelBytes() {
            return ByteString.copyFromUtf8(this.model_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setModel(String str) {
            str.getClass();
            this.model_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearModel() {
            this.model_ = getDefaultInstance().getModel();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setModelBytes(ByteString byteString) {
            checkByteStringIsUtf8(byteString);
            this.model_ = byteString.toStringUtf8();
        }

        @Override // com.vungle.ads.internal.protos.Sdk.SDKMetricOrBuilder
        public String getOs() {
            return this.os_;
        }

        @Override // com.vungle.ads.internal.protos.Sdk.SDKMetricOrBuilder
        public ByteString getOsBytes() {
            return ByteString.copyFromUtf8(this.os_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setOs(String str) {
            str.getClass();
            this.os_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearOs() {
            this.os_ = getDefaultInstance().getOs();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setOsBytes(ByteString byteString) {
            checkByteStringIsUtf8(byteString);
            this.os_ = byteString.toStringUtf8();
        }

        @Override // com.vungle.ads.internal.protos.Sdk.SDKMetricOrBuilder
        public String getOsVersion() {
            return this.osVersion_;
        }

        @Override // com.vungle.ads.internal.protos.Sdk.SDKMetricOrBuilder
        public ByteString getOsVersionBytes() {
            return ByteString.copyFromUtf8(this.osVersion_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setOsVersion(String str) {
            str.getClass();
            this.osVersion_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearOsVersion() {
            this.osVersion_ = getDefaultInstance().getOsVersion();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setOsVersionBytes(ByteString byteString) {
            checkByteStringIsUtf8(byteString);
            this.osVersion_ = byteString.toStringUtf8();
        }

        @Override // com.vungle.ads.internal.protos.Sdk.SDKMetricOrBuilder
        public String getConnectionType() {
            return this.connectionType_;
        }

        @Override // com.vungle.ads.internal.protos.Sdk.SDKMetricOrBuilder
        public ByteString getConnectionTypeBytes() {
            return ByteString.copyFromUtf8(this.connectionType_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setConnectionType(String str) {
            str.getClass();
            this.connectionType_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearConnectionType() {
            this.connectionType_ = getDefaultInstance().getConnectionType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setConnectionTypeBytes(ByteString byteString) {
            checkByteStringIsUtf8(byteString);
            this.connectionType_ = byteString.toStringUtf8();
        }

        @Override // com.vungle.ads.internal.protos.Sdk.SDKMetricOrBuilder
        public String getConnectionTypeDetail() {
            return this.connectionTypeDetail_;
        }

        @Override // com.vungle.ads.internal.protos.Sdk.SDKMetricOrBuilder
        public ByteString getConnectionTypeDetailBytes() {
            return ByteString.copyFromUtf8(this.connectionTypeDetail_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setConnectionTypeDetail(String str) {
            str.getClass();
            this.connectionTypeDetail_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearConnectionTypeDetail() {
            this.connectionTypeDetail_ = getDefaultInstance().getConnectionTypeDetail();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setConnectionTypeDetailBytes(ByteString byteString) {
            checkByteStringIsUtf8(byteString);
            this.connectionTypeDetail_ = byteString.toStringUtf8();
        }

        @Override // com.vungle.ads.internal.protos.Sdk.SDKMetricOrBuilder
        public String getPlacementReferenceId() {
            return this.placementReferenceId_;
        }

        @Override // com.vungle.ads.internal.protos.Sdk.SDKMetricOrBuilder
        public ByteString getPlacementReferenceIdBytes() {
            return ByteString.copyFromUtf8(this.placementReferenceId_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPlacementReferenceId(String str) {
            str.getClass();
            this.placementReferenceId_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPlacementReferenceId() {
            this.placementReferenceId_ = getDefaultInstance().getPlacementReferenceId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPlacementReferenceIdBytes(ByteString byteString) {
            checkByteStringIsUtf8(byteString);
            this.placementReferenceId_ = byteString.toStringUtf8();
        }

        @Override // com.vungle.ads.internal.protos.Sdk.SDKMetricOrBuilder
        public String getCreativeId() {
            return this.creativeId_;
        }

        @Override // com.vungle.ads.internal.protos.Sdk.SDKMetricOrBuilder
        public ByteString getCreativeIdBytes() {
            return ByteString.copyFromUtf8(this.creativeId_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCreativeId(String str) {
            str.getClass();
            this.creativeId_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCreativeId() {
            this.creativeId_ = getDefaultInstance().getCreativeId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCreativeIdBytes(ByteString byteString) {
            checkByteStringIsUtf8(byteString);
            this.creativeId_ = byteString.toStringUtf8();
        }

        @Override // com.vungle.ads.internal.protos.Sdk.SDKMetricOrBuilder
        public String getEventId() {
            return this.eventId_;
        }

        @Override // com.vungle.ads.internal.protos.Sdk.SDKMetricOrBuilder
        public ByteString getEventIdBytes() {
            return ByteString.copyFromUtf8(this.eventId_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setEventId(String str) {
            str.getClass();
            this.eventId_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearEventId() {
            this.eventId_ = getDefaultInstance().getEventId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setEventIdBytes(ByteString byteString) {
            checkByteStringIsUtf8(byteString);
            this.eventId_ = byteString.toStringUtf8();
        }

        @Override // com.vungle.ads.internal.protos.Sdk.SDKMetricOrBuilder
        public String getSessionId() {
            return this.sessionId_;
        }

        @Override // com.vungle.ads.internal.protos.Sdk.SDKMetricOrBuilder
        public ByteString getSessionIdBytes() {
            return ByteString.copyFromUtf8(this.sessionId_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSessionId(String str) {
            str.getClass();
            this.sessionId_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSessionId() {
            this.sessionId_ = getDefaultInstance().getSessionId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSessionIdBytes(ByteString byteString) {
            checkByteStringIsUtf8(byteString);
            this.sessionId_ = byteString.toStringUtf8();
        }

        public static SDKMetric parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (SDKMetric) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static SDKMetric parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (SDKMetric) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static SDKMetric parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (SDKMetric) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static SDKMetric parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (SDKMetric) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static SDKMetric parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (SDKMetric) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static SDKMetric parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (SDKMetric) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static SDKMetric parseFrom(InputStream inputStream) throws IOException {
            return (SDKMetric) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static SDKMetric parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (SDKMetric) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static SDKMetric parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (SDKMetric) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static SDKMetric parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (SDKMetric) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static SDKMetric parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (SDKMetric) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static SDKMetric parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (SDKMetric) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(SDKMetric sDKMetric) {
            return DEFAULT_INSTANCE.createBuilder(sDKMetric);
        }

        public static final class Builder extends GeneratedMessageLite.Builder<SDKMetric, Builder> implements SDKMetricOrBuilder {
            /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            private Builder() {
                super(SDKMetric.DEFAULT_INSTANCE);
            }

            @Override // com.vungle.ads.internal.protos.Sdk.SDKMetricOrBuilder
            public int getTypeValue() {
                return ((SDKMetric) this.instance).getTypeValue();
            }

            public Builder setTypeValue(int i) {
                copyOnWrite();
                ((SDKMetric) this.instance).setTypeValue(i);
                return this;
            }

            @Override // com.vungle.ads.internal.protos.Sdk.SDKMetricOrBuilder
            public SDKMetricType getType() {
                return ((SDKMetric) this.instance).getType();
            }

            public Builder setType(SDKMetricType sDKMetricType) {
                copyOnWrite();
                ((SDKMetric) this.instance).setType(sDKMetricType);
                return this;
            }

            public Builder clearType() {
                copyOnWrite();
                ((SDKMetric) this.instance).clearType();
                return this;
            }

            @Override // com.vungle.ads.internal.protos.Sdk.SDKMetricOrBuilder
            public long getValue() {
                return ((SDKMetric) this.instance).getValue();
            }

            public Builder setValue(long j) {
                copyOnWrite();
                ((SDKMetric) this.instance).setValue(j);
                return this;
            }

            public Builder clearValue() {
                copyOnWrite();
                ((SDKMetric) this.instance).clearValue();
                return this;
            }

            @Override // com.vungle.ads.internal.protos.Sdk.SDKMetricOrBuilder
            public String getMeta() {
                return ((SDKMetric) this.instance).getMeta();
            }

            @Override // com.vungle.ads.internal.protos.Sdk.SDKMetricOrBuilder
            public ByteString getMetaBytes() {
                return ((SDKMetric) this.instance).getMetaBytes();
            }

            public Builder setMeta(String str) {
                copyOnWrite();
                ((SDKMetric) this.instance).setMeta(str);
                return this;
            }

            public Builder clearMeta() {
                copyOnWrite();
                ((SDKMetric) this.instance).clearMeta();
                return this;
            }

            public Builder setMetaBytes(ByteString byteString) {
                copyOnWrite();
                ((SDKMetric) this.instance).setMetaBytes(byteString);
                return this;
            }

            @Override // com.vungle.ads.internal.protos.Sdk.SDKMetricOrBuilder
            public String getMake() {
                return ((SDKMetric) this.instance).getMake();
            }

            @Override // com.vungle.ads.internal.protos.Sdk.SDKMetricOrBuilder
            public ByteString getMakeBytes() {
                return ((SDKMetric) this.instance).getMakeBytes();
            }

            public Builder setMake(String str) {
                copyOnWrite();
                ((SDKMetric) this.instance).setMake(str);
                return this;
            }

            public Builder clearMake() {
                copyOnWrite();
                ((SDKMetric) this.instance).clearMake();
                return this;
            }

            public Builder setMakeBytes(ByteString byteString) {
                copyOnWrite();
                ((SDKMetric) this.instance).setMakeBytes(byteString);
                return this;
            }

            @Override // com.vungle.ads.internal.protos.Sdk.SDKMetricOrBuilder
            public String getModel() {
                return ((SDKMetric) this.instance).getModel();
            }

            @Override // com.vungle.ads.internal.protos.Sdk.SDKMetricOrBuilder
            public ByteString getModelBytes() {
                return ((SDKMetric) this.instance).getModelBytes();
            }

            public Builder setModel(String str) {
                copyOnWrite();
                ((SDKMetric) this.instance).setModel(str);
                return this;
            }

            public Builder clearModel() {
                copyOnWrite();
                ((SDKMetric) this.instance).clearModel();
                return this;
            }

            public Builder setModelBytes(ByteString byteString) {
                copyOnWrite();
                ((SDKMetric) this.instance).setModelBytes(byteString);
                return this;
            }

            @Override // com.vungle.ads.internal.protos.Sdk.SDKMetricOrBuilder
            public String getOs() {
                return ((SDKMetric) this.instance).getOs();
            }

            @Override // com.vungle.ads.internal.protos.Sdk.SDKMetricOrBuilder
            public ByteString getOsBytes() {
                return ((SDKMetric) this.instance).getOsBytes();
            }

            public Builder setOs(String str) {
                copyOnWrite();
                ((SDKMetric) this.instance).setOs(str);
                return this;
            }

            public Builder clearOs() {
                copyOnWrite();
                ((SDKMetric) this.instance).clearOs();
                return this;
            }

            public Builder setOsBytes(ByteString byteString) {
                copyOnWrite();
                ((SDKMetric) this.instance).setOsBytes(byteString);
                return this;
            }

            @Override // com.vungle.ads.internal.protos.Sdk.SDKMetricOrBuilder
            public String getOsVersion() {
                return ((SDKMetric) this.instance).getOsVersion();
            }

            @Override // com.vungle.ads.internal.protos.Sdk.SDKMetricOrBuilder
            public ByteString getOsVersionBytes() {
                return ((SDKMetric) this.instance).getOsVersionBytes();
            }

            public Builder setOsVersion(String str) {
                copyOnWrite();
                ((SDKMetric) this.instance).setOsVersion(str);
                return this;
            }

            public Builder clearOsVersion() {
                copyOnWrite();
                ((SDKMetric) this.instance).clearOsVersion();
                return this;
            }

            public Builder setOsVersionBytes(ByteString byteString) {
                copyOnWrite();
                ((SDKMetric) this.instance).setOsVersionBytes(byteString);
                return this;
            }

            @Override // com.vungle.ads.internal.protos.Sdk.SDKMetricOrBuilder
            public String getConnectionType() {
                return ((SDKMetric) this.instance).getConnectionType();
            }

            @Override // com.vungle.ads.internal.protos.Sdk.SDKMetricOrBuilder
            public ByteString getConnectionTypeBytes() {
                return ((SDKMetric) this.instance).getConnectionTypeBytes();
            }

            public Builder setConnectionType(String str) {
                copyOnWrite();
                ((SDKMetric) this.instance).setConnectionType(str);
                return this;
            }

            public Builder clearConnectionType() {
                copyOnWrite();
                ((SDKMetric) this.instance).clearConnectionType();
                return this;
            }

            public Builder setConnectionTypeBytes(ByteString byteString) {
                copyOnWrite();
                ((SDKMetric) this.instance).setConnectionTypeBytes(byteString);
                return this;
            }

            @Override // com.vungle.ads.internal.protos.Sdk.SDKMetricOrBuilder
            public String getConnectionTypeDetail() {
                return ((SDKMetric) this.instance).getConnectionTypeDetail();
            }

            @Override // com.vungle.ads.internal.protos.Sdk.SDKMetricOrBuilder
            public ByteString getConnectionTypeDetailBytes() {
                return ((SDKMetric) this.instance).getConnectionTypeDetailBytes();
            }

            public Builder setConnectionTypeDetail(String str) {
                copyOnWrite();
                ((SDKMetric) this.instance).setConnectionTypeDetail(str);
                return this;
            }

            public Builder clearConnectionTypeDetail() {
                copyOnWrite();
                ((SDKMetric) this.instance).clearConnectionTypeDetail();
                return this;
            }

            public Builder setConnectionTypeDetailBytes(ByteString byteString) {
                copyOnWrite();
                ((SDKMetric) this.instance).setConnectionTypeDetailBytes(byteString);
                return this;
            }

            @Override // com.vungle.ads.internal.protos.Sdk.SDKMetricOrBuilder
            public String getPlacementReferenceId() {
                return ((SDKMetric) this.instance).getPlacementReferenceId();
            }

            @Override // com.vungle.ads.internal.protos.Sdk.SDKMetricOrBuilder
            public ByteString getPlacementReferenceIdBytes() {
                return ((SDKMetric) this.instance).getPlacementReferenceIdBytes();
            }

            public Builder setPlacementReferenceId(String str) {
                copyOnWrite();
                ((SDKMetric) this.instance).setPlacementReferenceId(str);
                return this;
            }

            public Builder clearPlacementReferenceId() {
                copyOnWrite();
                ((SDKMetric) this.instance).clearPlacementReferenceId();
                return this;
            }

            public Builder setPlacementReferenceIdBytes(ByteString byteString) {
                copyOnWrite();
                ((SDKMetric) this.instance).setPlacementReferenceIdBytes(byteString);
                return this;
            }

            @Override // com.vungle.ads.internal.protos.Sdk.SDKMetricOrBuilder
            public String getCreativeId() {
                return ((SDKMetric) this.instance).getCreativeId();
            }

            @Override // com.vungle.ads.internal.protos.Sdk.SDKMetricOrBuilder
            public ByteString getCreativeIdBytes() {
                return ((SDKMetric) this.instance).getCreativeIdBytes();
            }

            public Builder setCreativeId(String str) {
                copyOnWrite();
                ((SDKMetric) this.instance).setCreativeId(str);
                return this;
            }

            public Builder clearCreativeId() {
                copyOnWrite();
                ((SDKMetric) this.instance).clearCreativeId();
                return this;
            }

            public Builder setCreativeIdBytes(ByteString byteString) {
                copyOnWrite();
                ((SDKMetric) this.instance).setCreativeIdBytes(byteString);
                return this;
            }

            @Override // com.vungle.ads.internal.protos.Sdk.SDKMetricOrBuilder
            public String getEventId() {
                return ((SDKMetric) this.instance).getEventId();
            }

            @Override // com.vungle.ads.internal.protos.Sdk.SDKMetricOrBuilder
            public ByteString getEventIdBytes() {
                return ((SDKMetric) this.instance).getEventIdBytes();
            }

            public Builder setEventId(String str) {
                copyOnWrite();
                ((SDKMetric) this.instance).setEventId(str);
                return this;
            }

            public Builder clearEventId() {
                copyOnWrite();
                ((SDKMetric) this.instance).clearEventId();
                return this;
            }

            public Builder setEventIdBytes(ByteString byteString) {
                copyOnWrite();
                ((SDKMetric) this.instance).setEventIdBytes(byteString);
                return this;
            }

            @Override // com.vungle.ads.internal.protos.Sdk.SDKMetricOrBuilder
            public String getSessionId() {
                return ((SDKMetric) this.instance).getSessionId();
            }

            @Override // com.vungle.ads.internal.protos.Sdk.SDKMetricOrBuilder
            public ByteString getSessionIdBytes() {
                return ((SDKMetric) this.instance).getSessionIdBytes();
            }

            public Builder setSessionId(String str) {
                copyOnWrite();
                ((SDKMetric) this.instance).setSessionId(str);
                return this;
            }

            public Builder clearSessionId() {
                copyOnWrite();
                ((SDKMetric) this.instance).clearSessionId();
                return this;
            }

            public Builder setSessionIdBytes(ByteString byteString) {
                copyOnWrite();
                ((SDKMetric) this.instance).setSessionIdBytes(byteString);
                return this;
            }
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new SDKMetric();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0000\r\u0000\u0000\u0001\r\r\u0000\u0000\u0000\u0001\f\u0002\u0002\u0003Ȉ\u0004Ȉ\u0005Ȉ\u0006Ȉ\u0007Ȉ\bȈ\tȈ\nȈ\u000bȈ\fȈ\rȈ", new Object[]{"type_", "value_", "meta_", "make_", "model_", "os_", "osVersion_", "connectionType_", "connectionTypeDetail_", "placementReferenceId_", "creativeId_", "eventId_", "sessionId_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<SDKMetric> defaultInstanceBasedParser = PARSER;
                    if (defaultInstanceBasedParser == null) {
                        synchronized (SDKMetric.class) {
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
            SDKMetric sDKMetric = new SDKMetric();
            DEFAULT_INSTANCE = sDKMetric;
            GeneratedMessageLite.registerDefaultInstance(SDKMetric.class, sDKMetric);
        }

        public static SDKMetric getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<SDKMetric> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }
}
