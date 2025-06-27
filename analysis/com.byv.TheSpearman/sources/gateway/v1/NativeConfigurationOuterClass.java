package gateway.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import gateway.v1.DiagnosticEventRequestOuterClass;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes5.dex */
public final class NativeConfigurationOuterClass {

    public interface AdOperationsConfigurationOrBuilder extends MessageLiteOrBuilder {
        int getGetTokenTimeoutMs();

        int getLoadTimeoutMs();

        int getShowTimeoutMs();
    }

    public interface DiagnosticEventsConfigurationOrBuilder extends MessageLiteOrBuilder {
        DiagnosticEventRequestOuterClass.DiagnosticEventType getAllowedEvents(int i);

        int getAllowedEventsCount();

        List<DiagnosticEventRequestOuterClass.DiagnosticEventType> getAllowedEventsList();

        int getAllowedEventsValue(int i);

        List<Integer> getAllowedEventsValueList();

        DiagnosticEventRequestOuterClass.DiagnosticEventType getBlockedEvents(int i);

        int getBlockedEventsCount();

        List<DiagnosticEventRequestOuterClass.DiagnosticEventType> getBlockedEventsList();

        int getBlockedEventsValue(int i);

        List<Integer> getBlockedEventsValueList();

        boolean getEnabled();

        int getMaxBatchIntervalMs();

        int getMaxBatchSize();

        DiagnosticEventRequestOuterClass.DiagnosticEventsSeverity getSeverity();

        int getSeverityValue();

        boolean getTtmEnabled();
    }

    public interface FeatureFlagsOrBuilder extends MessageLiteOrBuilder {
        boolean getBoldSdkNextSessionEnabled();

        boolean getOpenglGpuEnabled();

        boolean getOpportunityIdPlacementValidation();
    }

    public interface NativeConfigurationOrBuilder extends MessageLiteOrBuilder {
        AdOperationsConfiguration getAdOperations();

        RequestPolicy getAdPolicy();

        DiagnosticEventsConfiguration getDiagnosticEvents();

        boolean getEnableIapEvent();

        boolean getEnableOm();

        FeatureFlags getFeatureFlags();

        RequestPolicy getInitPolicy();

        RequestPolicy getOperativeEventPolicy();

        RequestPolicy getOtherPolicy();

        boolean hasAdOperations();

        boolean hasAdPolicy();

        boolean hasDiagnosticEvents();

        boolean hasFeatureFlags();

        boolean hasInitPolicy();

        boolean hasOperativeEventPolicy();

        boolean hasOtherPolicy();
    }

    public interface RequestPolicyOrBuilder extends MessageLiteOrBuilder {
        RequestRetryPolicy getRetryPolicy();

        RequestTimeoutPolicy getTimeoutPolicy();

        boolean hasRetryPolicy();

        boolean hasTimeoutPolicy();
    }

    public interface RequestRetryPolicyOrBuilder extends MessageLiteOrBuilder {
        int getMaxDuration();

        float getRetryJitterPct();

        int getRetryMaxInterval();

        float getRetryScalingFactor();

        int getRetryWaitBase();

        boolean getShouldStoreLocally();
    }

    public interface RequestTimeoutPolicyOrBuilder extends MessageLiteOrBuilder {
        int getConnectTimeoutMs();

        int getOverallTimeoutMs();

        int getReadTimeoutMs();

        int getWriteTimeoutMs();
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
    }

    private NativeConfigurationOuterClass() {
    }

    public static final class RequestRetryPolicy extends GeneratedMessageLite<RequestRetryPolicy, Builder> implements RequestRetryPolicyOrBuilder {
        private static final RequestRetryPolicy DEFAULT_INSTANCE;
        public static final int MAX_DURATION_FIELD_NUMBER = 1;
        private static volatile Parser<RequestRetryPolicy> PARSER = null;
        public static final int RETRY_JITTER_PCT_FIELD_NUMBER = 4;
        public static final int RETRY_MAX_INTERVAL_FIELD_NUMBER = 3;
        public static final int RETRY_SCALING_FACTOR_FIELD_NUMBER = 5;
        public static final int RETRY_WAIT_BASE_FIELD_NUMBER = 2;
        public static final int SHOULD_STORE_LOCALLY_FIELD_NUMBER = 6;
        private int maxDuration_;
        private float retryJitterPct_;
        private int retryMaxInterval_;
        private float retryScalingFactor_;
        private int retryWaitBase_;
        private boolean shouldStoreLocally_;

        private RequestRetryPolicy() {
        }

        @Override // gateway.v1.NativeConfigurationOuterClass.RequestRetryPolicyOrBuilder
        public int getMaxDuration() {
            return this.maxDuration_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMaxDuration(int i) {
            this.maxDuration_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMaxDuration() {
            this.maxDuration_ = 0;
        }

        @Override // gateway.v1.NativeConfigurationOuterClass.RequestRetryPolicyOrBuilder
        public int getRetryWaitBase() {
            return this.retryWaitBase_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRetryWaitBase(int i) {
            this.retryWaitBase_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearRetryWaitBase() {
            this.retryWaitBase_ = 0;
        }

        @Override // gateway.v1.NativeConfigurationOuterClass.RequestRetryPolicyOrBuilder
        public int getRetryMaxInterval() {
            return this.retryMaxInterval_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRetryMaxInterval(int i) {
            this.retryMaxInterval_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearRetryMaxInterval() {
            this.retryMaxInterval_ = 0;
        }

        @Override // gateway.v1.NativeConfigurationOuterClass.RequestRetryPolicyOrBuilder
        public float getRetryJitterPct() {
            return this.retryJitterPct_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRetryJitterPct(float f) {
            this.retryJitterPct_ = f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearRetryJitterPct() {
            this.retryJitterPct_ = 0.0f;
        }

        @Override // gateway.v1.NativeConfigurationOuterClass.RequestRetryPolicyOrBuilder
        public float getRetryScalingFactor() {
            return this.retryScalingFactor_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRetryScalingFactor(float f) {
            this.retryScalingFactor_ = f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearRetryScalingFactor() {
            this.retryScalingFactor_ = 0.0f;
        }

        @Override // gateway.v1.NativeConfigurationOuterClass.RequestRetryPolicyOrBuilder
        public boolean getShouldStoreLocally() {
            return this.shouldStoreLocally_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setShouldStoreLocally(boolean z) {
            this.shouldStoreLocally_ = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearShouldStoreLocally() {
            this.shouldStoreLocally_ = false;
        }

        public static RequestRetryPolicy parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (RequestRetryPolicy) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static RequestRetryPolicy parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (RequestRetryPolicy) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static RequestRetryPolicy parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (RequestRetryPolicy) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static RequestRetryPolicy parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (RequestRetryPolicy) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static RequestRetryPolicy parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (RequestRetryPolicy) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static RequestRetryPolicy parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (RequestRetryPolicy) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static RequestRetryPolicy parseFrom(InputStream inputStream) throws IOException {
            return (RequestRetryPolicy) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static RequestRetryPolicy parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (RequestRetryPolicy) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static RequestRetryPolicy parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (RequestRetryPolicy) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static RequestRetryPolicy parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (RequestRetryPolicy) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static RequestRetryPolicy parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (RequestRetryPolicy) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static RequestRetryPolicy parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (RequestRetryPolicy) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(RequestRetryPolicy requestRetryPolicy) {
            return DEFAULT_INSTANCE.createBuilder(requestRetryPolicy);
        }

        public static final class Builder extends GeneratedMessageLite.Builder<RequestRetryPolicy, Builder> implements RequestRetryPolicyOrBuilder {
            /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            private Builder() {
                super(RequestRetryPolicy.DEFAULT_INSTANCE);
            }

            @Override // gateway.v1.NativeConfigurationOuterClass.RequestRetryPolicyOrBuilder
            public int getMaxDuration() {
                return ((RequestRetryPolicy) this.instance).getMaxDuration();
            }

            public Builder setMaxDuration(int i) {
                copyOnWrite();
                ((RequestRetryPolicy) this.instance).setMaxDuration(i);
                return this;
            }

            public Builder clearMaxDuration() {
                copyOnWrite();
                ((RequestRetryPolicy) this.instance).clearMaxDuration();
                return this;
            }

            @Override // gateway.v1.NativeConfigurationOuterClass.RequestRetryPolicyOrBuilder
            public int getRetryWaitBase() {
                return ((RequestRetryPolicy) this.instance).getRetryWaitBase();
            }

            public Builder setRetryWaitBase(int i) {
                copyOnWrite();
                ((RequestRetryPolicy) this.instance).setRetryWaitBase(i);
                return this;
            }

            public Builder clearRetryWaitBase() {
                copyOnWrite();
                ((RequestRetryPolicy) this.instance).clearRetryWaitBase();
                return this;
            }

            @Override // gateway.v1.NativeConfigurationOuterClass.RequestRetryPolicyOrBuilder
            public int getRetryMaxInterval() {
                return ((RequestRetryPolicy) this.instance).getRetryMaxInterval();
            }

            public Builder setRetryMaxInterval(int i) {
                copyOnWrite();
                ((RequestRetryPolicy) this.instance).setRetryMaxInterval(i);
                return this;
            }

            public Builder clearRetryMaxInterval() {
                copyOnWrite();
                ((RequestRetryPolicy) this.instance).clearRetryMaxInterval();
                return this;
            }

            @Override // gateway.v1.NativeConfigurationOuterClass.RequestRetryPolicyOrBuilder
            public float getRetryJitterPct() {
                return ((RequestRetryPolicy) this.instance).getRetryJitterPct();
            }

            public Builder setRetryJitterPct(float f) {
                copyOnWrite();
                ((RequestRetryPolicy) this.instance).setRetryJitterPct(f);
                return this;
            }

            public Builder clearRetryJitterPct() {
                copyOnWrite();
                ((RequestRetryPolicy) this.instance).clearRetryJitterPct();
                return this;
            }

            @Override // gateway.v1.NativeConfigurationOuterClass.RequestRetryPolicyOrBuilder
            public float getRetryScalingFactor() {
                return ((RequestRetryPolicy) this.instance).getRetryScalingFactor();
            }

            public Builder setRetryScalingFactor(float f) {
                copyOnWrite();
                ((RequestRetryPolicy) this.instance).setRetryScalingFactor(f);
                return this;
            }

            public Builder clearRetryScalingFactor() {
                copyOnWrite();
                ((RequestRetryPolicy) this.instance).clearRetryScalingFactor();
                return this;
            }

            @Override // gateway.v1.NativeConfigurationOuterClass.RequestRetryPolicyOrBuilder
            public boolean getShouldStoreLocally() {
                return ((RequestRetryPolicy) this.instance).getShouldStoreLocally();
            }

            public Builder setShouldStoreLocally(boolean z) {
                copyOnWrite();
                ((RequestRetryPolicy) this.instance).setShouldStoreLocally(z);
                return this;
            }

            public Builder clearShouldStoreLocally() {
                copyOnWrite();
                ((RequestRetryPolicy) this.instance).clearShouldStoreLocally();
                return this;
            }
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new RequestRetryPolicy();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001\u0004\u0002\u0004\u0003\u0004\u0004\u0001\u0005\u0001\u0006\u0007", new Object[]{"maxDuration_", "retryWaitBase_", "retryMaxInterval_", "retryJitterPct_", "retryScalingFactor_", "shouldStoreLocally_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<RequestRetryPolicy> defaultInstanceBasedParser = PARSER;
                    if (defaultInstanceBasedParser == null) {
                        synchronized (RequestRetryPolicy.class) {
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
            RequestRetryPolicy requestRetryPolicy = new RequestRetryPolicy();
            DEFAULT_INSTANCE = requestRetryPolicy;
            GeneratedMessageLite.registerDefaultInstance(RequestRetryPolicy.class, requestRetryPolicy);
        }

        public static RequestRetryPolicy getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<RequestRetryPolicy> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }

    /* renamed from: gateway.v1.NativeConfigurationOuterClass$1, reason: invalid class name */
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

    public static final class RequestTimeoutPolicy extends GeneratedMessageLite<RequestTimeoutPolicy, Builder> implements RequestTimeoutPolicyOrBuilder {
        public static final int CONNECT_TIMEOUT_MS_FIELD_NUMBER = 1;
        private static final RequestTimeoutPolicy DEFAULT_INSTANCE;
        public static final int OVERALL_TIMEOUT_MS_FIELD_NUMBER = 4;
        private static volatile Parser<RequestTimeoutPolicy> PARSER = null;
        public static final int READ_TIMEOUT_MS_FIELD_NUMBER = 2;
        public static final int WRITE_TIMEOUT_MS_FIELD_NUMBER = 3;
        private int connectTimeoutMs_;
        private int overallTimeoutMs_;
        private int readTimeoutMs_;
        private int writeTimeoutMs_;

        private RequestTimeoutPolicy() {
        }

        @Override // gateway.v1.NativeConfigurationOuterClass.RequestTimeoutPolicyOrBuilder
        public int getConnectTimeoutMs() {
            return this.connectTimeoutMs_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setConnectTimeoutMs(int i) {
            this.connectTimeoutMs_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearConnectTimeoutMs() {
            this.connectTimeoutMs_ = 0;
        }

        @Override // gateway.v1.NativeConfigurationOuterClass.RequestTimeoutPolicyOrBuilder
        public int getReadTimeoutMs() {
            return this.readTimeoutMs_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setReadTimeoutMs(int i) {
            this.readTimeoutMs_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearReadTimeoutMs() {
            this.readTimeoutMs_ = 0;
        }

        @Override // gateway.v1.NativeConfigurationOuterClass.RequestTimeoutPolicyOrBuilder
        public int getWriteTimeoutMs() {
            return this.writeTimeoutMs_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setWriteTimeoutMs(int i) {
            this.writeTimeoutMs_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearWriteTimeoutMs() {
            this.writeTimeoutMs_ = 0;
        }

        @Override // gateway.v1.NativeConfigurationOuterClass.RequestTimeoutPolicyOrBuilder
        public int getOverallTimeoutMs() {
            return this.overallTimeoutMs_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setOverallTimeoutMs(int i) {
            this.overallTimeoutMs_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearOverallTimeoutMs() {
            this.overallTimeoutMs_ = 0;
        }

        public static RequestTimeoutPolicy parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (RequestTimeoutPolicy) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static RequestTimeoutPolicy parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (RequestTimeoutPolicy) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static RequestTimeoutPolicy parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (RequestTimeoutPolicy) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static RequestTimeoutPolicy parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (RequestTimeoutPolicy) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static RequestTimeoutPolicy parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (RequestTimeoutPolicy) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static RequestTimeoutPolicy parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (RequestTimeoutPolicy) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static RequestTimeoutPolicy parseFrom(InputStream inputStream) throws IOException {
            return (RequestTimeoutPolicy) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static RequestTimeoutPolicy parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (RequestTimeoutPolicy) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static RequestTimeoutPolicy parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (RequestTimeoutPolicy) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static RequestTimeoutPolicy parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (RequestTimeoutPolicy) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static RequestTimeoutPolicy parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (RequestTimeoutPolicy) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static RequestTimeoutPolicy parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (RequestTimeoutPolicy) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(RequestTimeoutPolicy requestTimeoutPolicy) {
            return DEFAULT_INSTANCE.createBuilder(requestTimeoutPolicy);
        }

        public static final class Builder extends GeneratedMessageLite.Builder<RequestTimeoutPolicy, Builder> implements RequestTimeoutPolicyOrBuilder {
            /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            private Builder() {
                super(RequestTimeoutPolicy.DEFAULT_INSTANCE);
            }

            @Override // gateway.v1.NativeConfigurationOuterClass.RequestTimeoutPolicyOrBuilder
            public int getConnectTimeoutMs() {
                return ((RequestTimeoutPolicy) this.instance).getConnectTimeoutMs();
            }

            public Builder setConnectTimeoutMs(int i) {
                copyOnWrite();
                ((RequestTimeoutPolicy) this.instance).setConnectTimeoutMs(i);
                return this;
            }

            public Builder clearConnectTimeoutMs() {
                copyOnWrite();
                ((RequestTimeoutPolicy) this.instance).clearConnectTimeoutMs();
                return this;
            }

            @Override // gateway.v1.NativeConfigurationOuterClass.RequestTimeoutPolicyOrBuilder
            public int getReadTimeoutMs() {
                return ((RequestTimeoutPolicy) this.instance).getReadTimeoutMs();
            }

            public Builder setReadTimeoutMs(int i) {
                copyOnWrite();
                ((RequestTimeoutPolicy) this.instance).setReadTimeoutMs(i);
                return this;
            }

            public Builder clearReadTimeoutMs() {
                copyOnWrite();
                ((RequestTimeoutPolicy) this.instance).clearReadTimeoutMs();
                return this;
            }

            @Override // gateway.v1.NativeConfigurationOuterClass.RequestTimeoutPolicyOrBuilder
            public int getWriteTimeoutMs() {
                return ((RequestTimeoutPolicy) this.instance).getWriteTimeoutMs();
            }

            public Builder setWriteTimeoutMs(int i) {
                copyOnWrite();
                ((RequestTimeoutPolicy) this.instance).setWriteTimeoutMs(i);
                return this;
            }

            public Builder clearWriteTimeoutMs() {
                copyOnWrite();
                ((RequestTimeoutPolicy) this.instance).clearWriteTimeoutMs();
                return this;
            }

            @Override // gateway.v1.NativeConfigurationOuterClass.RequestTimeoutPolicyOrBuilder
            public int getOverallTimeoutMs() {
                return ((RequestTimeoutPolicy) this.instance).getOverallTimeoutMs();
            }

            public Builder setOverallTimeoutMs(int i) {
                copyOnWrite();
                ((RequestTimeoutPolicy) this.instance).setOverallTimeoutMs(i);
                return this;
            }

            public Builder clearOverallTimeoutMs() {
                copyOnWrite();
                ((RequestTimeoutPolicy) this.instance).clearOverallTimeoutMs();
                return this;
            }
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new RequestTimeoutPolicy();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u0004\u0002\u0004\u0003\u0004\u0004\u0004", new Object[]{"connectTimeoutMs_", "readTimeoutMs_", "writeTimeoutMs_", "overallTimeoutMs_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<RequestTimeoutPolicy> defaultInstanceBasedParser = PARSER;
                    if (defaultInstanceBasedParser == null) {
                        synchronized (RequestTimeoutPolicy.class) {
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
            RequestTimeoutPolicy requestTimeoutPolicy = new RequestTimeoutPolicy();
            DEFAULT_INSTANCE = requestTimeoutPolicy;
            GeneratedMessageLite.registerDefaultInstance(RequestTimeoutPolicy.class, requestTimeoutPolicy);
        }

        public static RequestTimeoutPolicy getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<RequestTimeoutPolicy> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }

    public static final class RequestPolicy extends GeneratedMessageLite<RequestPolicy, Builder> implements RequestPolicyOrBuilder {
        private static final RequestPolicy DEFAULT_INSTANCE;
        private static volatile Parser<RequestPolicy> PARSER = null;
        public static final int RETRY_POLICY_FIELD_NUMBER = 1;
        public static final int TIMEOUT_POLICY_FIELD_NUMBER = 2;
        private RequestRetryPolicy retryPolicy_;
        private RequestTimeoutPolicy timeoutPolicy_;

        private RequestPolicy() {
        }

        @Override // gateway.v1.NativeConfigurationOuterClass.RequestPolicyOrBuilder
        public boolean hasRetryPolicy() {
            return this.retryPolicy_ != null;
        }

        @Override // gateway.v1.NativeConfigurationOuterClass.RequestPolicyOrBuilder
        public RequestRetryPolicy getRetryPolicy() {
            RequestRetryPolicy requestRetryPolicy = this.retryPolicy_;
            return requestRetryPolicy == null ? RequestRetryPolicy.getDefaultInstance() : requestRetryPolicy;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRetryPolicy(RequestRetryPolicy requestRetryPolicy) {
            requestRetryPolicy.getClass();
            this.retryPolicy_ = requestRetryPolicy;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeRetryPolicy(RequestRetryPolicy requestRetryPolicy) {
            requestRetryPolicy.getClass();
            RequestRetryPolicy requestRetryPolicy2 = this.retryPolicy_;
            if (requestRetryPolicy2 != null && requestRetryPolicy2 != RequestRetryPolicy.getDefaultInstance()) {
                this.retryPolicy_ = RequestRetryPolicy.newBuilder(this.retryPolicy_).mergeFrom((RequestRetryPolicy.Builder) requestRetryPolicy).buildPartial();
            } else {
                this.retryPolicy_ = requestRetryPolicy;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearRetryPolicy() {
            this.retryPolicy_ = null;
        }

        @Override // gateway.v1.NativeConfigurationOuterClass.RequestPolicyOrBuilder
        public boolean hasTimeoutPolicy() {
            return this.timeoutPolicy_ != null;
        }

        @Override // gateway.v1.NativeConfigurationOuterClass.RequestPolicyOrBuilder
        public RequestTimeoutPolicy getTimeoutPolicy() {
            RequestTimeoutPolicy requestTimeoutPolicy = this.timeoutPolicy_;
            return requestTimeoutPolicy == null ? RequestTimeoutPolicy.getDefaultInstance() : requestTimeoutPolicy;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTimeoutPolicy(RequestTimeoutPolicy requestTimeoutPolicy) {
            requestTimeoutPolicy.getClass();
            this.timeoutPolicy_ = requestTimeoutPolicy;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeTimeoutPolicy(RequestTimeoutPolicy requestTimeoutPolicy) {
            requestTimeoutPolicy.getClass();
            RequestTimeoutPolicy requestTimeoutPolicy2 = this.timeoutPolicy_;
            if (requestTimeoutPolicy2 != null && requestTimeoutPolicy2 != RequestTimeoutPolicy.getDefaultInstance()) {
                this.timeoutPolicy_ = RequestTimeoutPolicy.newBuilder(this.timeoutPolicy_).mergeFrom((RequestTimeoutPolicy.Builder) requestTimeoutPolicy).buildPartial();
            } else {
                this.timeoutPolicy_ = requestTimeoutPolicy;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTimeoutPolicy() {
            this.timeoutPolicy_ = null;
        }

        public static RequestPolicy parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (RequestPolicy) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static RequestPolicy parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (RequestPolicy) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static RequestPolicy parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (RequestPolicy) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static RequestPolicy parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (RequestPolicy) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static RequestPolicy parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (RequestPolicy) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static RequestPolicy parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (RequestPolicy) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static RequestPolicy parseFrom(InputStream inputStream) throws IOException {
            return (RequestPolicy) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static RequestPolicy parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (RequestPolicy) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static RequestPolicy parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (RequestPolicy) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static RequestPolicy parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (RequestPolicy) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static RequestPolicy parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (RequestPolicy) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static RequestPolicy parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (RequestPolicy) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(RequestPolicy requestPolicy) {
            return DEFAULT_INSTANCE.createBuilder(requestPolicy);
        }

        public static final class Builder extends GeneratedMessageLite.Builder<RequestPolicy, Builder> implements RequestPolicyOrBuilder {
            /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            private Builder() {
                super(RequestPolicy.DEFAULT_INSTANCE);
            }

            @Override // gateway.v1.NativeConfigurationOuterClass.RequestPolicyOrBuilder
            public boolean hasRetryPolicy() {
                return ((RequestPolicy) this.instance).hasRetryPolicy();
            }

            @Override // gateway.v1.NativeConfigurationOuterClass.RequestPolicyOrBuilder
            public RequestRetryPolicy getRetryPolicy() {
                return ((RequestPolicy) this.instance).getRetryPolicy();
            }

            public Builder setRetryPolicy(RequestRetryPolicy requestRetryPolicy) {
                copyOnWrite();
                ((RequestPolicy) this.instance).setRetryPolicy(requestRetryPolicy);
                return this;
            }

            public Builder setRetryPolicy(RequestRetryPolicy.Builder builder) {
                copyOnWrite();
                ((RequestPolicy) this.instance).setRetryPolicy(builder.build());
                return this;
            }

            public Builder mergeRetryPolicy(RequestRetryPolicy requestRetryPolicy) {
                copyOnWrite();
                ((RequestPolicy) this.instance).mergeRetryPolicy(requestRetryPolicy);
                return this;
            }

            public Builder clearRetryPolicy() {
                copyOnWrite();
                ((RequestPolicy) this.instance).clearRetryPolicy();
                return this;
            }

            @Override // gateway.v1.NativeConfigurationOuterClass.RequestPolicyOrBuilder
            public boolean hasTimeoutPolicy() {
                return ((RequestPolicy) this.instance).hasTimeoutPolicy();
            }

            @Override // gateway.v1.NativeConfigurationOuterClass.RequestPolicyOrBuilder
            public RequestTimeoutPolicy getTimeoutPolicy() {
                return ((RequestPolicy) this.instance).getTimeoutPolicy();
            }

            public Builder setTimeoutPolicy(RequestTimeoutPolicy requestTimeoutPolicy) {
                copyOnWrite();
                ((RequestPolicy) this.instance).setTimeoutPolicy(requestTimeoutPolicy);
                return this;
            }

            public Builder setTimeoutPolicy(RequestTimeoutPolicy.Builder builder) {
                copyOnWrite();
                ((RequestPolicy) this.instance).setTimeoutPolicy(builder.build());
                return this;
            }

            public Builder mergeTimeoutPolicy(RequestTimeoutPolicy requestTimeoutPolicy) {
                copyOnWrite();
                ((RequestPolicy) this.instance).mergeTimeoutPolicy(requestTimeoutPolicy);
                return this;
            }

            public Builder clearTimeoutPolicy() {
                copyOnWrite();
                ((RequestPolicy) this.instance).clearTimeoutPolicy();
                return this;
            }
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new RequestPolicy();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\t", new Object[]{"retryPolicy_", "timeoutPolicy_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<RequestPolicy> defaultInstanceBasedParser = PARSER;
                    if (defaultInstanceBasedParser == null) {
                        synchronized (RequestPolicy.class) {
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
            RequestPolicy requestPolicy = new RequestPolicy();
            DEFAULT_INSTANCE = requestPolicy;
            GeneratedMessageLite.registerDefaultInstance(RequestPolicy.class, requestPolicy);
        }

        public static RequestPolicy getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<RequestPolicy> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }

    public static final class DiagnosticEventsConfiguration extends GeneratedMessageLite<DiagnosticEventsConfiguration, Builder> implements DiagnosticEventsConfigurationOrBuilder {
        public static final int ALLOWED_EVENTS_FIELD_NUMBER = 6;
        public static final int BLOCKED_EVENTS_FIELD_NUMBER = 7;
        private static final DiagnosticEventsConfiguration DEFAULT_INSTANCE;
        public static final int ENABLED_FIELD_NUMBER = 1;
        public static final int MAX_BATCH_INTERVAL_MS_FIELD_NUMBER = 3;
        public static final int MAX_BATCH_SIZE_FIELD_NUMBER = 2;
        private static volatile Parser<DiagnosticEventsConfiguration> PARSER = null;
        public static final int SEVERITY_FIELD_NUMBER = 5;
        public static final int TTM_ENABLED_FIELD_NUMBER = 4;
        private static final Internal.ListAdapter.Converter<Integer, DiagnosticEventRequestOuterClass.DiagnosticEventType> allowedEvents_converter_ = new Internal.ListAdapter.Converter<Integer, DiagnosticEventRequestOuterClass.DiagnosticEventType>() { // from class: gateway.v1.NativeConfigurationOuterClass.DiagnosticEventsConfiguration.1
            @Override // com.google.protobuf.Internal.ListAdapter.Converter
            public DiagnosticEventRequestOuterClass.DiagnosticEventType convert(Integer num) {
                DiagnosticEventRequestOuterClass.DiagnosticEventType diagnosticEventTypeForNumber = DiagnosticEventRequestOuterClass.DiagnosticEventType.forNumber(num.intValue());
                return diagnosticEventTypeForNumber == null ? DiagnosticEventRequestOuterClass.DiagnosticEventType.UNRECOGNIZED : diagnosticEventTypeForNumber;
            }
        };
        private static final Internal.ListAdapter.Converter<Integer, DiagnosticEventRequestOuterClass.DiagnosticEventType> blockedEvents_converter_ = new Internal.ListAdapter.Converter<Integer, DiagnosticEventRequestOuterClass.DiagnosticEventType>() { // from class: gateway.v1.NativeConfigurationOuterClass.DiagnosticEventsConfiguration.2
            @Override // com.google.protobuf.Internal.ListAdapter.Converter
            public DiagnosticEventRequestOuterClass.DiagnosticEventType convert(Integer num) {
                DiagnosticEventRequestOuterClass.DiagnosticEventType diagnosticEventTypeForNumber = DiagnosticEventRequestOuterClass.DiagnosticEventType.forNumber(num.intValue());
                return diagnosticEventTypeForNumber == null ? DiagnosticEventRequestOuterClass.DiagnosticEventType.UNRECOGNIZED : diagnosticEventTypeForNumber;
            }
        };
        private int allowedEventsMemoizedSerializedSize;
        private int blockedEventsMemoizedSerializedSize;
        private boolean enabled_;
        private int maxBatchIntervalMs_;
        private int maxBatchSize_;
        private int severity_;
        private boolean ttmEnabled_;
        private Internal.IntList allowedEvents_ = emptyIntList();
        private Internal.IntList blockedEvents_ = emptyIntList();

        private DiagnosticEventsConfiguration() {
        }

        @Override // gateway.v1.NativeConfigurationOuterClass.DiagnosticEventsConfigurationOrBuilder
        public boolean getEnabled() {
            return this.enabled_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setEnabled(boolean z) {
            this.enabled_ = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearEnabled() {
            this.enabled_ = false;
        }

        @Override // gateway.v1.NativeConfigurationOuterClass.DiagnosticEventsConfigurationOrBuilder
        public int getMaxBatchSize() {
            return this.maxBatchSize_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMaxBatchSize(int i) {
            this.maxBatchSize_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMaxBatchSize() {
            this.maxBatchSize_ = 0;
        }

        @Override // gateway.v1.NativeConfigurationOuterClass.DiagnosticEventsConfigurationOrBuilder
        public int getMaxBatchIntervalMs() {
            return this.maxBatchIntervalMs_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMaxBatchIntervalMs(int i) {
            this.maxBatchIntervalMs_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMaxBatchIntervalMs() {
            this.maxBatchIntervalMs_ = 0;
        }

        @Override // gateway.v1.NativeConfigurationOuterClass.DiagnosticEventsConfigurationOrBuilder
        public boolean getTtmEnabled() {
            return this.ttmEnabled_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTtmEnabled(boolean z) {
            this.ttmEnabled_ = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTtmEnabled() {
            this.ttmEnabled_ = false;
        }

        @Override // gateway.v1.NativeConfigurationOuterClass.DiagnosticEventsConfigurationOrBuilder
        public int getSeverityValue() {
            return this.severity_;
        }

        @Override // gateway.v1.NativeConfigurationOuterClass.DiagnosticEventsConfigurationOrBuilder
        public DiagnosticEventRequestOuterClass.DiagnosticEventsSeverity getSeverity() {
            DiagnosticEventRequestOuterClass.DiagnosticEventsSeverity diagnosticEventsSeverityForNumber = DiagnosticEventRequestOuterClass.DiagnosticEventsSeverity.forNumber(this.severity_);
            return diagnosticEventsSeverityForNumber == null ? DiagnosticEventRequestOuterClass.DiagnosticEventsSeverity.UNRECOGNIZED : diagnosticEventsSeverityForNumber;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSeverityValue(int i) {
            this.severity_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSeverity(DiagnosticEventRequestOuterClass.DiagnosticEventsSeverity diagnosticEventsSeverity) {
            this.severity_ = diagnosticEventsSeverity.getNumber();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSeverity() {
            this.severity_ = 0;
        }

        static {
            DiagnosticEventsConfiguration diagnosticEventsConfiguration = new DiagnosticEventsConfiguration();
            DEFAULT_INSTANCE = diagnosticEventsConfiguration;
            GeneratedMessageLite.registerDefaultInstance(DiagnosticEventsConfiguration.class, diagnosticEventsConfiguration);
        }

        @Override // gateway.v1.NativeConfigurationOuterClass.DiagnosticEventsConfigurationOrBuilder
        public List<DiagnosticEventRequestOuterClass.DiagnosticEventType> getAllowedEventsList() {
            return new Internal.ListAdapter(this.allowedEvents_, allowedEvents_converter_);
        }

        @Override // gateway.v1.NativeConfigurationOuterClass.DiagnosticEventsConfigurationOrBuilder
        public int getAllowedEventsCount() {
            return this.allowedEvents_.size();
        }

        @Override // gateway.v1.NativeConfigurationOuterClass.DiagnosticEventsConfigurationOrBuilder
        public DiagnosticEventRequestOuterClass.DiagnosticEventType getAllowedEvents(int i) {
            DiagnosticEventRequestOuterClass.DiagnosticEventType diagnosticEventTypeForNumber = DiagnosticEventRequestOuterClass.DiagnosticEventType.forNumber(this.allowedEvents_.getInt(i));
            return diagnosticEventTypeForNumber == null ? DiagnosticEventRequestOuterClass.DiagnosticEventType.UNRECOGNIZED : diagnosticEventTypeForNumber;
        }

        @Override // gateway.v1.NativeConfigurationOuterClass.DiagnosticEventsConfigurationOrBuilder
        public List<Integer> getAllowedEventsValueList() {
            return this.allowedEvents_;
        }

        @Override // gateway.v1.NativeConfigurationOuterClass.DiagnosticEventsConfigurationOrBuilder
        public int getAllowedEventsValue(int i) {
            return this.allowedEvents_.getInt(i);
        }

        private void ensureAllowedEventsIsMutable() {
            Internal.IntList intList = this.allowedEvents_;
            if (intList.isModifiable()) {
                return;
            }
            this.allowedEvents_ = GeneratedMessageLite.mutableCopy(intList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAllowedEvents(int i, DiagnosticEventRequestOuterClass.DiagnosticEventType diagnosticEventType) {
            diagnosticEventType.getClass();
            ensureAllowedEventsIsMutable();
            this.allowedEvents_.setInt(i, diagnosticEventType.getNumber());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllowedEvents(DiagnosticEventRequestOuterClass.DiagnosticEventType diagnosticEventType) {
            diagnosticEventType.getClass();
            ensureAllowedEventsIsMutable();
            this.allowedEvents_.addInt(diagnosticEventType.getNumber());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllAllowedEvents(Iterable<? extends DiagnosticEventRequestOuterClass.DiagnosticEventType> iterable) {
            ensureAllowedEventsIsMutable();
            Iterator<? extends DiagnosticEventRequestOuterClass.DiagnosticEventType> it = iterable.iterator();
            while (it.hasNext()) {
                this.allowedEvents_.addInt(it.next().getNumber());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAllowedEvents() {
            this.allowedEvents_ = emptyIntList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAllowedEventsValue(int i, int i2) {
            ensureAllowedEventsIsMutable();
            this.allowedEvents_.setInt(i, i2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllowedEventsValue(int i) {
            ensureAllowedEventsIsMutable();
            this.allowedEvents_.addInt(i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllAllowedEventsValue(Iterable<Integer> iterable) {
            ensureAllowedEventsIsMutable();
            Iterator<Integer> it = iterable.iterator();
            while (it.hasNext()) {
                this.allowedEvents_.addInt(it.next().intValue());
            }
        }

        @Override // gateway.v1.NativeConfigurationOuterClass.DiagnosticEventsConfigurationOrBuilder
        public List<DiagnosticEventRequestOuterClass.DiagnosticEventType> getBlockedEventsList() {
            return new Internal.ListAdapter(this.blockedEvents_, blockedEvents_converter_);
        }

        @Override // gateway.v1.NativeConfigurationOuterClass.DiagnosticEventsConfigurationOrBuilder
        public int getBlockedEventsCount() {
            return this.blockedEvents_.size();
        }

        @Override // gateway.v1.NativeConfigurationOuterClass.DiagnosticEventsConfigurationOrBuilder
        public DiagnosticEventRequestOuterClass.DiagnosticEventType getBlockedEvents(int i) {
            DiagnosticEventRequestOuterClass.DiagnosticEventType diagnosticEventTypeForNumber = DiagnosticEventRequestOuterClass.DiagnosticEventType.forNumber(this.blockedEvents_.getInt(i));
            return diagnosticEventTypeForNumber == null ? DiagnosticEventRequestOuterClass.DiagnosticEventType.UNRECOGNIZED : diagnosticEventTypeForNumber;
        }

        @Override // gateway.v1.NativeConfigurationOuterClass.DiagnosticEventsConfigurationOrBuilder
        public List<Integer> getBlockedEventsValueList() {
            return this.blockedEvents_;
        }

        @Override // gateway.v1.NativeConfigurationOuterClass.DiagnosticEventsConfigurationOrBuilder
        public int getBlockedEventsValue(int i) {
            return this.blockedEvents_.getInt(i);
        }

        private void ensureBlockedEventsIsMutable() {
            Internal.IntList intList = this.blockedEvents_;
            if (intList.isModifiable()) {
                return;
            }
            this.blockedEvents_ = GeneratedMessageLite.mutableCopy(intList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBlockedEvents(int i, DiagnosticEventRequestOuterClass.DiagnosticEventType diagnosticEventType) {
            diagnosticEventType.getClass();
            ensureBlockedEventsIsMutable();
            this.blockedEvents_.setInt(i, diagnosticEventType.getNumber());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addBlockedEvents(DiagnosticEventRequestOuterClass.DiagnosticEventType diagnosticEventType) {
            diagnosticEventType.getClass();
            ensureBlockedEventsIsMutable();
            this.blockedEvents_.addInt(diagnosticEventType.getNumber());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllBlockedEvents(Iterable<? extends DiagnosticEventRequestOuterClass.DiagnosticEventType> iterable) {
            ensureBlockedEventsIsMutable();
            Iterator<? extends DiagnosticEventRequestOuterClass.DiagnosticEventType> it = iterable.iterator();
            while (it.hasNext()) {
                this.blockedEvents_.addInt(it.next().getNumber());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearBlockedEvents() {
            this.blockedEvents_ = emptyIntList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBlockedEventsValue(int i, int i2) {
            ensureBlockedEventsIsMutable();
            this.blockedEvents_.setInt(i, i2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addBlockedEventsValue(int i) {
            ensureBlockedEventsIsMutable();
            this.blockedEvents_.addInt(i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllBlockedEventsValue(Iterable<Integer> iterable) {
            ensureBlockedEventsIsMutable();
            Iterator<Integer> it = iterable.iterator();
            while (it.hasNext()) {
                this.blockedEvents_.addInt(it.next().intValue());
            }
        }

        public static DiagnosticEventsConfiguration parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (DiagnosticEventsConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static DiagnosticEventsConfiguration parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (DiagnosticEventsConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static DiagnosticEventsConfiguration parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (DiagnosticEventsConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static DiagnosticEventsConfiguration parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (DiagnosticEventsConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static DiagnosticEventsConfiguration parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (DiagnosticEventsConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static DiagnosticEventsConfiguration parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (DiagnosticEventsConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static DiagnosticEventsConfiguration parseFrom(InputStream inputStream) throws IOException {
            return (DiagnosticEventsConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static DiagnosticEventsConfiguration parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (DiagnosticEventsConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static DiagnosticEventsConfiguration parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (DiagnosticEventsConfiguration) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static DiagnosticEventsConfiguration parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (DiagnosticEventsConfiguration) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static DiagnosticEventsConfiguration parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (DiagnosticEventsConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static DiagnosticEventsConfiguration parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (DiagnosticEventsConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(DiagnosticEventsConfiguration diagnosticEventsConfiguration) {
            return DEFAULT_INSTANCE.createBuilder(diagnosticEventsConfiguration);
        }

        public static final class Builder extends GeneratedMessageLite.Builder<DiagnosticEventsConfiguration, Builder> implements DiagnosticEventsConfigurationOrBuilder {
            /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            private Builder() {
                super(DiagnosticEventsConfiguration.DEFAULT_INSTANCE);
            }

            @Override // gateway.v1.NativeConfigurationOuterClass.DiagnosticEventsConfigurationOrBuilder
            public boolean getEnabled() {
                return ((DiagnosticEventsConfiguration) this.instance).getEnabled();
            }

            public Builder setEnabled(boolean z) {
                copyOnWrite();
                ((DiagnosticEventsConfiguration) this.instance).setEnabled(z);
                return this;
            }

            public Builder clearEnabled() {
                copyOnWrite();
                ((DiagnosticEventsConfiguration) this.instance).clearEnabled();
                return this;
            }

            @Override // gateway.v1.NativeConfigurationOuterClass.DiagnosticEventsConfigurationOrBuilder
            public int getMaxBatchSize() {
                return ((DiagnosticEventsConfiguration) this.instance).getMaxBatchSize();
            }

            public Builder setMaxBatchSize(int i) {
                copyOnWrite();
                ((DiagnosticEventsConfiguration) this.instance).setMaxBatchSize(i);
                return this;
            }

            public Builder clearMaxBatchSize() {
                copyOnWrite();
                ((DiagnosticEventsConfiguration) this.instance).clearMaxBatchSize();
                return this;
            }

            @Override // gateway.v1.NativeConfigurationOuterClass.DiagnosticEventsConfigurationOrBuilder
            public int getMaxBatchIntervalMs() {
                return ((DiagnosticEventsConfiguration) this.instance).getMaxBatchIntervalMs();
            }

            public Builder setMaxBatchIntervalMs(int i) {
                copyOnWrite();
                ((DiagnosticEventsConfiguration) this.instance).setMaxBatchIntervalMs(i);
                return this;
            }

            public Builder clearMaxBatchIntervalMs() {
                copyOnWrite();
                ((DiagnosticEventsConfiguration) this.instance).clearMaxBatchIntervalMs();
                return this;
            }

            @Override // gateway.v1.NativeConfigurationOuterClass.DiagnosticEventsConfigurationOrBuilder
            public boolean getTtmEnabled() {
                return ((DiagnosticEventsConfiguration) this.instance).getTtmEnabled();
            }

            public Builder setTtmEnabled(boolean z) {
                copyOnWrite();
                ((DiagnosticEventsConfiguration) this.instance).setTtmEnabled(z);
                return this;
            }

            public Builder clearTtmEnabled() {
                copyOnWrite();
                ((DiagnosticEventsConfiguration) this.instance).clearTtmEnabled();
                return this;
            }

            @Override // gateway.v1.NativeConfigurationOuterClass.DiagnosticEventsConfigurationOrBuilder
            public int getSeverityValue() {
                return ((DiagnosticEventsConfiguration) this.instance).getSeverityValue();
            }

            public Builder setSeverityValue(int i) {
                copyOnWrite();
                ((DiagnosticEventsConfiguration) this.instance).setSeverityValue(i);
                return this;
            }

            @Override // gateway.v1.NativeConfigurationOuterClass.DiagnosticEventsConfigurationOrBuilder
            public DiagnosticEventRequestOuterClass.DiagnosticEventsSeverity getSeverity() {
                return ((DiagnosticEventsConfiguration) this.instance).getSeverity();
            }

            public Builder setSeverity(DiagnosticEventRequestOuterClass.DiagnosticEventsSeverity diagnosticEventsSeverity) {
                copyOnWrite();
                ((DiagnosticEventsConfiguration) this.instance).setSeverity(diagnosticEventsSeverity);
                return this;
            }

            public Builder clearSeverity() {
                copyOnWrite();
                ((DiagnosticEventsConfiguration) this.instance).clearSeverity();
                return this;
            }

            @Override // gateway.v1.NativeConfigurationOuterClass.DiagnosticEventsConfigurationOrBuilder
            public List<DiagnosticEventRequestOuterClass.DiagnosticEventType> getAllowedEventsList() {
                return ((DiagnosticEventsConfiguration) this.instance).getAllowedEventsList();
            }

            @Override // gateway.v1.NativeConfigurationOuterClass.DiagnosticEventsConfigurationOrBuilder
            public int getAllowedEventsCount() {
                return ((DiagnosticEventsConfiguration) this.instance).getAllowedEventsCount();
            }

            @Override // gateway.v1.NativeConfigurationOuterClass.DiagnosticEventsConfigurationOrBuilder
            public DiagnosticEventRequestOuterClass.DiagnosticEventType getAllowedEvents(int i) {
                return ((DiagnosticEventsConfiguration) this.instance).getAllowedEvents(i);
            }

            public Builder setAllowedEvents(int i, DiagnosticEventRequestOuterClass.DiagnosticEventType diagnosticEventType) {
                copyOnWrite();
                ((DiagnosticEventsConfiguration) this.instance).setAllowedEvents(i, diagnosticEventType);
                return this;
            }

            public Builder addAllowedEvents(DiagnosticEventRequestOuterClass.DiagnosticEventType diagnosticEventType) {
                copyOnWrite();
                ((DiagnosticEventsConfiguration) this.instance).addAllowedEvents(diagnosticEventType);
                return this;
            }

            public Builder addAllAllowedEvents(Iterable<? extends DiagnosticEventRequestOuterClass.DiagnosticEventType> iterable) {
                copyOnWrite();
                ((DiagnosticEventsConfiguration) this.instance).addAllAllowedEvents(iterable);
                return this;
            }

            public Builder clearAllowedEvents() {
                copyOnWrite();
                ((DiagnosticEventsConfiguration) this.instance).clearAllowedEvents();
                return this;
            }

            @Override // gateway.v1.NativeConfigurationOuterClass.DiagnosticEventsConfigurationOrBuilder
            public List<Integer> getAllowedEventsValueList() {
                return Collections.unmodifiableList(((DiagnosticEventsConfiguration) this.instance).getAllowedEventsValueList());
            }

            @Override // gateway.v1.NativeConfigurationOuterClass.DiagnosticEventsConfigurationOrBuilder
            public int getAllowedEventsValue(int i) {
                return ((DiagnosticEventsConfiguration) this.instance).getAllowedEventsValue(i);
            }

            public Builder setAllowedEventsValue(int i, int i2) {
                copyOnWrite();
                ((DiagnosticEventsConfiguration) this.instance).setAllowedEventsValue(i, i2);
                return this;
            }

            public Builder addAllowedEventsValue(int i) {
                ((DiagnosticEventsConfiguration) this.instance).addAllowedEventsValue(i);
                return this;
            }

            public Builder addAllAllowedEventsValue(Iterable<Integer> iterable) {
                copyOnWrite();
                ((DiagnosticEventsConfiguration) this.instance).addAllAllowedEventsValue(iterable);
                return this;
            }

            @Override // gateway.v1.NativeConfigurationOuterClass.DiagnosticEventsConfigurationOrBuilder
            public List<DiagnosticEventRequestOuterClass.DiagnosticEventType> getBlockedEventsList() {
                return ((DiagnosticEventsConfiguration) this.instance).getBlockedEventsList();
            }

            @Override // gateway.v1.NativeConfigurationOuterClass.DiagnosticEventsConfigurationOrBuilder
            public int getBlockedEventsCount() {
                return ((DiagnosticEventsConfiguration) this.instance).getBlockedEventsCount();
            }

            @Override // gateway.v1.NativeConfigurationOuterClass.DiagnosticEventsConfigurationOrBuilder
            public DiagnosticEventRequestOuterClass.DiagnosticEventType getBlockedEvents(int i) {
                return ((DiagnosticEventsConfiguration) this.instance).getBlockedEvents(i);
            }

            public Builder setBlockedEvents(int i, DiagnosticEventRequestOuterClass.DiagnosticEventType diagnosticEventType) {
                copyOnWrite();
                ((DiagnosticEventsConfiguration) this.instance).setBlockedEvents(i, diagnosticEventType);
                return this;
            }

            public Builder addBlockedEvents(DiagnosticEventRequestOuterClass.DiagnosticEventType diagnosticEventType) {
                copyOnWrite();
                ((DiagnosticEventsConfiguration) this.instance).addBlockedEvents(diagnosticEventType);
                return this;
            }

            public Builder addAllBlockedEvents(Iterable<? extends DiagnosticEventRequestOuterClass.DiagnosticEventType> iterable) {
                copyOnWrite();
                ((DiagnosticEventsConfiguration) this.instance).addAllBlockedEvents(iterable);
                return this;
            }

            public Builder clearBlockedEvents() {
                copyOnWrite();
                ((DiagnosticEventsConfiguration) this.instance).clearBlockedEvents();
                return this;
            }

            @Override // gateway.v1.NativeConfigurationOuterClass.DiagnosticEventsConfigurationOrBuilder
            public List<Integer> getBlockedEventsValueList() {
                return Collections.unmodifiableList(((DiagnosticEventsConfiguration) this.instance).getBlockedEventsValueList());
            }

            @Override // gateway.v1.NativeConfigurationOuterClass.DiagnosticEventsConfigurationOrBuilder
            public int getBlockedEventsValue(int i) {
                return ((DiagnosticEventsConfiguration) this.instance).getBlockedEventsValue(i);
            }

            public Builder setBlockedEventsValue(int i, int i2) {
                copyOnWrite();
                ((DiagnosticEventsConfiguration) this.instance).setBlockedEventsValue(i, i2);
                return this;
            }

            public Builder addBlockedEventsValue(int i) {
                ((DiagnosticEventsConfiguration) this.instance).addBlockedEventsValue(i);
                return this;
            }

            public Builder addAllBlockedEventsValue(Iterable<Integer> iterable) {
                copyOnWrite();
                ((DiagnosticEventsConfiguration) this.instance).addAllBlockedEventsValue(iterable);
                return this;
            }
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new DiagnosticEventsConfiguration();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0000\u0001\u0007\u0007\u0000\u0002\u0000\u0001\u0007\u0002\u0004\u0003\u0004\u0004\u0007\u0005\f\u0006,\u0007,", new Object[]{"enabled_", "maxBatchSize_", "maxBatchIntervalMs_", "ttmEnabled_", "severity_", "allowedEvents_", "blockedEvents_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<DiagnosticEventsConfiguration> defaultInstanceBasedParser = PARSER;
                    if (defaultInstanceBasedParser == null) {
                        synchronized (DiagnosticEventsConfiguration.class) {
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

        public static DiagnosticEventsConfiguration getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<DiagnosticEventsConfiguration> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }

    public static final class AdOperationsConfiguration extends GeneratedMessageLite<AdOperationsConfiguration, Builder> implements AdOperationsConfigurationOrBuilder {
        private static final AdOperationsConfiguration DEFAULT_INSTANCE;
        public static final int GET_TOKEN_TIMEOUT_MS_FIELD_NUMBER = 3;
        public static final int LOAD_TIMEOUT_MS_FIELD_NUMBER = 1;
        private static volatile Parser<AdOperationsConfiguration> PARSER = null;
        public static final int SHOW_TIMEOUT_MS_FIELD_NUMBER = 2;
        private int getTokenTimeoutMs_;
        private int loadTimeoutMs_;
        private int showTimeoutMs_;

        private AdOperationsConfiguration() {
        }

        @Override // gateway.v1.NativeConfigurationOuterClass.AdOperationsConfigurationOrBuilder
        public int getLoadTimeoutMs() {
            return this.loadTimeoutMs_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLoadTimeoutMs(int i) {
            this.loadTimeoutMs_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearLoadTimeoutMs() {
            this.loadTimeoutMs_ = 0;
        }

        @Override // gateway.v1.NativeConfigurationOuterClass.AdOperationsConfigurationOrBuilder
        public int getShowTimeoutMs() {
            return this.showTimeoutMs_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setShowTimeoutMs(int i) {
            this.showTimeoutMs_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearShowTimeoutMs() {
            this.showTimeoutMs_ = 0;
        }

        @Override // gateway.v1.NativeConfigurationOuterClass.AdOperationsConfigurationOrBuilder
        public int getGetTokenTimeoutMs() {
            return this.getTokenTimeoutMs_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setGetTokenTimeoutMs(int i) {
            this.getTokenTimeoutMs_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearGetTokenTimeoutMs() {
            this.getTokenTimeoutMs_ = 0;
        }

        public static AdOperationsConfiguration parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (AdOperationsConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static AdOperationsConfiguration parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (AdOperationsConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static AdOperationsConfiguration parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (AdOperationsConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static AdOperationsConfiguration parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (AdOperationsConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static AdOperationsConfiguration parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (AdOperationsConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static AdOperationsConfiguration parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (AdOperationsConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static AdOperationsConfiguration parseFrom(InputStream inputStream) throws IOException {
            return (AdOperationsConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static AdOperationsConfiguration parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (AdOperationsConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static AdOperationsConfiguration parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (AdOperationsConfiguration) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static AdOperationsConfiguration parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (AdOperationsConfiguration) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static AdOperationsConfiguration parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (AdOperationsConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static AdOperationsConfiguration parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (AdOperationsConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(AdOperationsConfiguration adOperationsConfiguration) {
            return DEFAULT_INSTANCE.createBuilder(adOperationsConfiguration);
        }

        public static final class Builder extends GeneratedMessageLite.Builder<AdOperationsConfiguration, Builder> implements AdOperationsConfigurationOrBuilder {
            /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            private Builder() {
                super(AdOperationsConfiguration.DEFAULT_INSTANCE);
            }

            @Override // gateway.v1.NativeConfigurationOuterClass.AdOperationsConfigurationOrBuilder
            public int getLoadTimeoutMs() {
                return ((AdOperationsConfiguration) this.instance).getLoadTimeoutMs();
            }

            public Builder setLoadTimeoutMs(int i) {
                copyOnWrite();
                ((AdOperationsConfiguration) this.instance).setLoadTimeoutMs(i);
                return this;
            }

            public Builder clearLoadTimeoutMs() {
                copyOnWrite();
                ((AdOperationsConfiguration) this.instance).clearLoadTimeoutMs();
                return this;
            }

            @Override // gateway.v1.NativeConfigurationOuterClass.AdOperationsConfigurationOrBuilder
            public int getShowTimeoutMs() {
                return ((AdOperationsConfiguration) this.instance).getShowTimeoutMs();
            }

            public Builder setShowTimeoutMs(int i) {
                copyOnWrite();
                ((AdOperationsConfiguration) this.instance).setShowTimeoutMs(i);
                return this;
            }

            public Builder clearShowTimeoutMs() {
                copyOnWrite();
                ((AdOperationsConfiguration) this.instance).clearShowTimeoutMs();
                return this;
            }

            @Override // gateway.v1.NativeConfigurationOuterClass.AdOperationsConfigurationOrBuilder
            public int getGetTokenTimeoutMs() {
                return ((AdOperationsConfiguration) this.instance).getGetTokenTimeoutMs();
            }

            public Builder setGetTokenTimeoutMs(int i) {
                copyOnWrite();
                ((AdOperationsConfiguration) this.instance).setGetTokenTimeoutMs(i);
                return this;
            }

            public Builder clearGetTokenTimeoutMs() {
                copyOnWrite();
                ((AdOperationsConfiguration) this.instance).clearGetTokenTimeoutMs();
                return this;
            }
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new AdOperationsConfiguration();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0004\u0002\u0004\u0003\u0004", new Object[]{"loadTimeoutMs_", "showTimeoutMs_", "getTokenTimeoutMs_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<AdOperationsConfiguration> defaultInstanceBasedParser = PARSER;
                    if (defaultInstanceBasedParser == null) {
                        synchronized (AdOperationsConfiguration.class) {
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
            AdOperationsConfiguration adOperationsConfiguration = new AdOperationsConfiguration();
            DEFAULT_INSTANCE = adOperationsConfiguration;
            GeneratedMessageLite.registerDefaultInstance(AdOperationsConfiguration.class, adOperationsConfiguration);
        }

        public static AdOperationsConfiguration getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<AdOperationsConfiguration> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }

    public static final class NativeConfiguration extends GeneratedMessageLite<NativeConfiguration, Builder> implements NativeConfigurationOrBuilder {
        public static final int AD_OPERATIONS_FIELD_NUMBER = 6;
        public static final int AD_POLICY_FIELD_NUMBER = 3;
        private static final NativeConfiguration DEFAULT_INSTANCE;
        public static final int DIAGNOSTIC_EVENTS_FIELD_NUMBER = 1;
        public static final int ENABLE_IAP_EVENT_FIELD_NUMBER = 8;
        public static final int ENABLE_OM_FIELD_NUMBER = 9;
        public static final int FEATURE_FLAGS_FIELD_NUMBER = 7;
        public static final int INIT_POLICY_FIELD_NUMBER = 2;
        public static final int OPERATIVE_EVENT_POLICY_FIELD_NUMBER = 4;
        public static final int OTHER_POLICY_FIELD_NUMBER = 5;
        private static volatile Parser<NativeConfiguration> PARSER;
        private AdOperationsConfiguration adOperations_;
        private RequestPolicy adPolicy_;
        private DiagnosticEventsConfiguration diagnosticEvents_;
        private boolean enableIapEvent_;
        private boolean enableOm_;
        private FeatureFlags featureFlags_;
        private RequestPolicy initPolicy_;
        private RequestPolicy operativeEventPolicy_;
        private RequestPolicy otherPolicy_;

        private NativeConfiguration() {
        }

        @Override // gateway.v1.NativeConfigurationOuterClass.NativeConfigurationOrBuilder
        public boolean hasDiagnosticEvents() {
            return this.diagnosticEvents_ != null;
        }

        @Override // gateway.v1.NativeConfigurationOuterClass.NativeConfigurationOrBuilder
        public DiagnosticEventsConfiguration getDiagnosticEvents() {
            DiagnosticEventsConfiguration diagnosticEventsConfiguration = this.diagnosticEvents_;
            return diagnosticEventsConfiguration == null ? DiagnosticEventsConfiguration.getDefaultInstance() : diagnosticEventsConfiguration;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDiagnosticEvents(DiagnosticEventsConfiguration diagnosticEventsConfiguration) {
            diagnosticEventsConfiguration.getClass();
            this.diagnosticEvents_ = diagnosticEventsConfiguration;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeDiagnosticEvents(DiagnosticEventsConfiguration diagnosticEventsConfiguration) {
            diagnosticEventsConfiguration.getClass();
            DiagnosticEventsConfiguration diagnosticEventsConfiguration2 = this.diagnosticEvents_;
            if (diagnosticEventsConfiguration2 != null && diagnosticEventsConfiguration2 != DiagnosticEventsConfiguration.getDefaultInstance()) {
                this.diagnosticEvents_ = DiagnosticEventsConfiguration.newBuilder(this.diagnosticEvents_).mergeFrom((DiagnosticEventsConfiguration.Builder) diagnosticEventsConfiguration).buildPartial();
            } else {
                this.diagnosticEvents_ = diagnosticEventsConfiguration;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDiagnosticEvents() {
            this.diagnosticEvents_ = null;
        }

        @Override // gateway.v1.NativeConfigurationOuterClass.NativeConfigurationOrBuilder
        public boolean hasInitPolicy() {
            return this.initPolicy_ != null;
        }

        @Override // gateway.v1.NativeConfigurationOuterClass.NativeConfigurationOrBuilder
        public RequestPolicy getInitPolicy() {
            RequestPolicy requestPolicy = this.initPolicy_;
            return requestPolicy == null ? RequestPolicy.getDefaultInstance() : requestPolicy;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setInitPolicy(RequestPolicy requestPolicy) {
            requestPolicy.getClass();
            this.initPolicy_ = requestPolicy;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeInitPolicy(RequestPolicy requestPolicy) {
            requestPolicy.getClass();
            RequestPolicy requestPolicy2 = this.initPolicy_;
            if (requestPolicy2 != null && requestPolicy2 != RequestPolicy.getDefaultInstance()) {
                this.initPolicy_ = RequestPolicy.newBuilder(this.initPolicy_).mergeFrom((RequestPolicy.Builder) requestPolicy).buildPartial();
            } else {
                this.initPolicy_ = requestPolicy;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearInitPolicy() {
            this.initPolicy_ = null;
        }

        @Override // gateway.v1.NativeConfigurationOuterClass.NativeConfigurationOrBuilder
        public boolean hasAdPolicy() {
            return this.adPolicy_ != null;
        }

        @Override // gateway.v1.NativeConfigurationOuterClass.NativeConfigurationOrBuilder
        public RequestPolicy getAdPolicy() {
            RequestPolicy requestPolicy = this.adPolicy_;
            return requestPolicy == null ? RequestPolicy.getDefaultInstance() : requestPolicy;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAdPolicy(RequestPolicy requestPolicy) {
            requestPolicy.getClass();
            this.adPolicy_ = requestPolicy;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeAdPolicy(RequestPolicy requestPolicy) {
            requestPolicy.getClass();
            RequestPolicy requestPolicy2 = this.adPolicy_;
            if (requestPolicy2 != null && requestPolicy2 != RequestPolicy.getDefaultInstance()) {
                this.adPolicy_ = RequestPolicy.newBuilder(this.adPolicy_).mergeFrom((RequestPolicy.Builder) requestPolicy).buildPartial();
            } else {
                this.adPolicy_ = requestPolicy;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAdPolicy() {
            this.adPolicy_ = null;
        }

        @Override // gateway.v1.NativeConfigurationOuterClass.NativeConfigurationOrBuilder
        public boolean hasOperativeEventPolicy() {
            return this.operativeEventPolicy_ != null;
        }

        @Override // gateway.v1.NativeConfigurationOuterClass.NativeConfigurationOrBuilder
        public RequestPolicy getOperativeEventPolicy() {
            RequestPolicy requestPolicy = this.operativeEventPolicy_;
            return requestPolicy == null ? RequestPolicy.getDefaultInstance() : requestPolicy;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setOperativeEventPolicy(RequestPolicy requestPolicy) {
            requestPolicy.getClass();
            this.operativeEventPolicy_ = requestPolicy;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeOperativeEventPolicy(RequestPolicy requestPolicy) {
            requestPolicy.getClass();
            RequestPolicy requestPolicy2 = this.operativeEventPolicy_;
            if (requestPolicy2 != null && requestPolicy2 != RequestPolicy.getDefaultInstance()) {
                this.operativeEventPolicy_ = RequestPolicy.newBuilder(this.operativeEventPolicy_).mergeFrom((RequestPolicy.Builder) requestPolicy).buildPartial();
            } else {
                this.operativeEventPolicy_ = requestPolicy;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearOperativeEventPolicy() {
            this.operativeEventPolicy_ = null;
        }

        @Override // gateway.v1.NativeConfigurationOuterClass.NativeConfigurationOrBuilder
        public boolean hasOtherPolicy() {
            return this.otherPolicy_ != null;
        }

        @Override // gateway.v1.NativeConfigurationOuterClass.NativeConfigurationOrBuilder
        public RequestPolicy getOtherPolicy() {
            RequestPolicy requestPolicy = this.otherPolicy_;
            return requestPolicy == null ? RequestPolicy.getDefaultInstance() : requestPolicy;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setOtherPolicy(RequestPolicy requestPolicy) {
            requestPolicy.getClass();
            this.otherPolicy_ = requestPolicy;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeOtherPolicy(RequestPolicy requestPolicy) {
            requestPolicy.getClass();
            RequestPolicy requestPolicy2 = this.otherPolicy_;
            if (requestPolicy2 != null && requestPolicy2 != RequestPolicy.getDefaultInstance()) {
                this.otherPolicy_ = RequestPolicy.newBuilder(this.otherPolicy_).mergeFrom((RequestPolicy.Builder) requestPolicy).buildPartial();
            } else {
                this.otherPolicy_ = requestPolicy;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearOtherPolicy() {
            this.otherPolicy_ = null;
        }

        @Override // gateway.v1.NativeConfigurationOuterClass.NativeConfigurationOrBuilder
        public boolean hasAdOperations() {
            return this.adOperations_ != null;
        }

        @Override // gateway.v1.NativeConfigurationOuterClass.NativeConfigurationOrBuilder
        public AdOperationsConfiguration getAdOperations() {
            AdOperationsConfiguration adOperationsConfiguration = this.adOperations_;
            return adOperationsConfiguration == null ? AdOperationsConfiguration.getDefaultInstance() : adOperationsConfiguration;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAdOperations(AdOperationsConfiguration adOperationsConfiguration) {
            adOperationsConfiguration.getClass();
            this.adOperations_ = adOperationsConfiguration;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeAdOperations(AdOperationsConfiguration adOperationsConfiguration) {
            adOperationsConfiguration.getClass();
            AdOperationsConfiguration adOperationsConfiguration2 = this.adOperations_;
            if (adOperationsConfiguration2 != null && adOperationsConfiguration2 != AdOperationsConfiguration.getDefaultInstance()) {
                this.adOperations_ = AdOperationsConfiguration.newBuilder(this.adOperations_).mergeFrom((AdOperationsConfiguration.Builder) adOperationsConfiguration).buildPartial();
            } else {
                this.adOperations_ = adOperationsConfiguration;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAdOperations() {
            this.adOperations_ = null;
        }

        @Override // gateway.v1.NativeConfigurationOuterClass.NativeConfigurationOrBuilder
        public boolean hasFeatureFlags() {
            return this.featureFlags_ != null;
        }

        @Override // gateway.v1.NativeConfigurationOuterClass.NativeConfigurationOrBuilder
        public FeatureFlags getFeatureFlags() {
            FeatureFlags featureFlags = this.featureFlags_;
            return featureFlags == null ? FeatureFlags.getDefaultInstance() : featureFlags;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFeatureFlags(FeatureFlags featureFlags) {
            featureFlags.getClass();
            this.featureFlags_ = featureFlags;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeFeatureFlags(FeatureFlags featureFlags) {
            featureFlags.getClass();
            FeatureFlags featureFlags2 = this.featureFlags_;
            if (featureFlags2 != null && featureFlags2 != FeatureFlags.getDefaultInstance()) {
                this.featureFlags_ = FeatureFlags.newBuilder(this.featureFlags_).mergeFrom((FeatureFlags.Builder) featureFlags).buildPartial();
            } else {
                this.featureFlags_ = featureFlags;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearFeatureFlags() {
            this.featureFlags_ = null;
        }

        @Override // gateway.v1.NativeConfigurationOuterClass.NativeConfigurationOrBuilder
        public boolean getEnableIapEvent() {
            return this.enableIapEvent_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setEnableIapEvent(boolean z) {
            this.enableIapEvent_ = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearEnableIapEvent() {
            this.enableIapEvent_ = false;
        }

        @Override // gateway.v1.NativeConfigurationOuterClass.NativeConfigurationOrBuilder
        public boolean getEnableOm() {
            return this.enableOm_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setEnableOm(boolean z) {
            this.enableOm_ = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearEnableOm() {
            this.enableOm_ = false;
        }

        public static NativeConfiguration parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (NativeConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static NativeConfiguration parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (NativeConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static NativeConfiguration parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (NativeConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static NativeConfiguration parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (NativeConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static NativeConfiguration parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (NativeConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static NativeConfiguration parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (NativeConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static NativeConfiguration parseFrom(InputStream inputStream) throws IOException {
            return (NativeConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static NativeConfiguration parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (NativeConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static NativeConfiguration parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (NativeConfiguration) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static NativeConfiguration parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (NativeConfiguration) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static NativeConfiguration parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (NativeConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static NativeConfiguration parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (NativeConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(NativeConfiguration nativeConfiguration) {
            return DEFAULT_INSTANCE.createBuilder(nativeConfiguration);
        }

        public static final class Builder extends GeneratedMessageLite.Builder<NativeConfiguration, Builder> implements NativeConfigurationOrBuilder {
            /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            private Builder() {
                super(NativeConfiguration.DEFAULT_INSTANCE);
            }

            @Override // gateway.v1.NativeConfigurationOuterClass.NativeConfigurationOrBuilder
            public boolean hasDiagnosticEvents() {
                return ((NativeConfiguration) this.instance).hasDiagnosticEvents();
            }

            @Override // gateway.v1.NativeConfigurationOuterClass.NativeConfigurationOrBuilder
            public DiagnosticEventsConfiguration getDiagnosticEvents() {
                return ((NativeConfiguration) this.instance).getDiagnosticEvents();
            }

            public Builder setDiagnosticEvents(DiagnosticEventsConfiguration diagnosticEventsConfiguration) {
                copyOnWrite();
                ((NativeConfiguration) this.instance).setDiagnosticEvents(diagnosticEventsConfiguration);
                return this;
            }

            public Builder setDiagnosticEvents(DiagnosticEventsConfiguration.Builder builder) {
                copyOnWrite();
                ((NativeConfiguration) this.instance).setDiagnosticEvents(builder.build());
                return this;
            }

            public Builder mergeDiagnosticEvents(DiagnosticEventsConfiguration diagnosticEventsConfiguration) {
                copyOnWrite();
                ((NativeConfiguration) this.instance).mergeDiagnosticEvents(diagnosticEventsConfiguration);
                return this;
            }

            public Builder clearDiagnosticEvents() {
                copyOnWrite();
                ((NativeConfiguration) this.instance).clearDiagnosticEvents();
                return this;
            }

            @Override // gateway.v1.NativeConfigurationOuterClass.NativeConfigurationOrBuilder
            public boolean hasInitPolicy() {
                return ((NativeConfiguration) this.instance).hasInitPolicy();
            }

            @Override // gateway.v1.NativeConfigurationOuterClass.NativeConfigurationOrBuilder
            public RequestPolicy getInitPolicy() {
                return ((NativeConfiguration) this.instance).getInitPolicy();
            }

            public Builder setInitPolicy(RequestPolicy requestPolicy) {
                copyOnWrite();
                ((NativeConfiguration) this.instance).setInitPolicy(requestPolicy);
                return this;
            }

            public Builder setInitPolicy(RequestPolicy.Builder builder) {
                copyOnWrite();
                ((NativeConfiguration) this.instance).setInitPolicy(builder.build());
                return this;
            }

            public Builder mergeInitPolicy(RequestPolicy requestPolicy) {
                copyOnWrite();
                ((NativeConfiguration) this.instance).mergeInitPolicy(requestPolicy);
                return this;
            }

            public Builder clearInitPolicy() {
                copyOnWrite();
                ((NativeConfiguration) this.instance).clearInitPolicy();
                return this;
            }

            @Override // gateway.v1.NativeConfigurationOuterClass.NativeConfigurationOrBuilder
            public boolean hasAdPolicy() {
                return ((NativeConfiguration) this.instance).hasAdPolicy();
            }

            @Override // gateway.v1.NativeConfigurationOuterClass.NativeConfigurationOrBuilder
            public RequestPolicy getAdPolicy() {
                return ((NativeConfiguration) this.instance).getAdPolicy();
            }

            public Builder setAdPolicy(RequestPolicy requestPolicy) {
                copyOnWrite();
                ((NativeConfiguration) this.instance).setAdPolicy(requestPolicy);
                return this;
            }

            public Builder setAdPolicy(RequestPolicy.Builder builder) {
                copyOnWrite();
                ((NativeConfiguration) this.instance).setAdPolicy(builder.build());
                return this;
            }

            public Builder mergeAdPolicy(RequestPolicy requestPolicy) {
                copyOnWrite();
                ((NativeConfiguration) this.instance).mergeAdPolicy(requestPolicy);
                return this;
            }

            public Builder clearAdPolicy() {
                copyOnWrite();
                ((NativeConfiguration) this.instance).clearAdPolicy();
                return this;
            }

            @Override // gateway.v1.NativeConfigurationOuterClass.NativeConfigurationOrBuilder
            public boolean hasOperativeEventPolicy() {
                return ((NativeConfiguration) this.instance).hasOperativeEventPolicy();
            }

            @Override // gateway.v1.NativeConfigurationOuterClass.NativeConfigurationOrBuilder
            public RequestPolicy getOperativeEventPolicy() {
                return ((NativeConfiguration) this.instance).getOperativeEventPolicy();
            }

            public Builder setOperativeEventPolicy(RequestPolicy requestPolicy) {
                copyOnWrite();
                ((NativeConfiguration) this.instance).setOperativeEventPolicy(requestPolicy);
                return this;
            }

            public Builder setOperativeEventPolicy(RequestPolicy.Builder builder) {
                copyOnWrite();
                ((NativeConfiguration) this.instance).setOperativeEventPolicy(builder.build());
                return this;
            }

            public Builder mergeOperativeEventPolicy(RequestPolicy requestPolicy) {
                copyOnWrite();
                ((NativeConfiguration) this.instance).mergeOperativeEventPolicy(requestPolicy);
                return this;
            }

            public Builder clearOperativeEventPolicy() {
                copyOnWrite();
                ((NativeConfiguration) this.instance).clearOperativeEventPolicy();
                return this;
            }

            @Override // gateway.v1.NativeConfigurationOuterClass.NativeConfigurationOrBuilder
            public boolean hasOtherPolicy() {
                return ((NativeConfiguration) this.instance).hasOtherPolicy();
            }

            @Override // gateway.v1.NativeConfigurationOuterClass.NativeConfigurationOrBuilder
            public RequestPolicy getOtherPolicy() {
                return ((NativeConfiguration) this.instance).getOtherPolicy();
            }

            public Builder setOtherPolicy(RequestPolicy requestPolicy) {
                copyOnWrite();
                ((NativeConfiguration) this.instance).setOtherPolicy(requestPolicy);
                return this;
            }

            public Builder setOtherPolicy(RequestPolicy.Builder builder) {
                copyOnWrite();
                ((NativeConfiguration) this.instance).setOtherPolicy(builder.build());
                return this;
            }

            public Builder mergeOtherPolicy(RequestPolicy requestPolicy) {
                copyOnWrite();
                ((NativeConfiguration) this.instance).mergeOtherPolicy(requestPolicy);
                return this;
            }

            public Builder clearOtherPolicy() {
                copyOnWrite();
                ((NativeConfiguration) this.instance).clearOtherPolicy();
                return this;
            }

            @Override // gateway.v1.NativeConfigurationOuterClass.NativeConfigurationOrBuilder
            public boolean hasAdOperations() {
                return ((NativeConfiguration) this.instance).hasAdOperations();
            }

            @Override // gateway.v1.NativeConfigurationOuterClass.NativeConfigurationOrBuilder
            public AdOperationsConfiguration getAdOperations() {
                return ((NativeConfiguration) this.instance).getAdOperations();
            }

            public Builder setAdOperations(AdOperationsConfiguration adOperationsConfiguration) {
                copyOnWrite();
                ((NativeConfiguration) this.instance).setAdOperations(adOperationsConfiguration);
                return this;
            }

            public Builder setAdOperations(AdOperationsConfiguration.Builder builder) {
                copyOnWrite();
                ((NativeConfiguration) this.instance).setAdOperations(builder.build());
                return this;
            }

            public Builder mergeAdOperations(AdOperationsConfiguration adOperationsConfiguration) {
                copyOnWrite();
                ((NativeConfiguration) this.instance).mergeAdOperations(adOperationsConfiguration);
                return this;
            }

            public Builder clearAdOperations() {
                copyOnWrite();
                ((NativeConfiguration) this.instance).clearAdOperations();
                return this;
            }

            @Override // gateway.v1.NativeConfigurationOuterClass.NativeConfigurationOrBuilder
            public boolean hasFeatureFlags() {
                return ((NativeConfiguration) this.instance).hasFeatureFlags();
            }

            @Override // gateway.v1.NativeConfigurationOuterClass.NativeConfigurationOrBuilder
            public FeatureFlags getFeatureFlags() {
                return ((NativeConfiguration) this.instance).getFeatureFlags();
            }

            public Builder setFeatureFlags(FeatureFlags featureFlags) {
                copyOnWrite();
                ((NativeConfiguration) this.instance).setFeatureFlags(featureFlags);
                return this;
            }

            public Builder setFeatureFlags(FeatureFlags.Builder builder) {
                copyOnWrite();
                ((NativeConfiguration) this.instance).setFeatureFlags(builder.build());
                return this;
            }

            public Builder mergeFeatureFlags(FeatureFlags featureFlags) {
                copyOnWrite();
                ((NativeConfiguration) this.instance).mergeFeatureFlags(featureFlags);
                return this;
            }

            public Builder clearFeatureFlags() {
                copyOnWrite();
                ((NativeConfiguration) this.instance).clearFeatureFlags();
                return this;
            }

            @Override // gateway.v1.NativeConfigurationOuterClass.NativeConfigurationOrBuilder
            public boolean getEnableIapEvent() {
                return ((NativeConfiguration) this.instance).getEnableIapEvent();
            }

            public Builder setEnableIapEvent(boolean z) {
                copyOnWrite();
                ((NativeConfiguration) this.instance).setEnableIapEvent(z);
                return this;
            }

            public Builder clearEnableIapEvent() {
                copyOnWrite();
                ((NativeConfiguration) this.instance).clearEnableIapEvent();
                return this;
            }

            @Override // gateway.v1.NativeConfigurationOuterClass.NativeConfigurationOrBuilder
            public boolean getEnableOm() {
                return ((NativeConfiguration) this.instance).getEnableOm();
            }

            public Builder setEnableOm(boolean z) {
                copyOnWrite();
                ((NativeConfiguration) this.instance).setEnableOm(z);
                return this;
            }

            public Builder clearEnableOm() {
                copyOnWrite();
                ((NativeConfiguration) this.instance).clearEnableOm();
                return this;
            }
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new NativeConfiguration();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0000\t\u0000\u0000\u0001\t\t\u0000\u0000\u0000\u0001\t\u0002\t\u0003\t\u0004\t\u0005\t\u0006\t\u0007\t\b\u0007\t\u0007", new Object[]{"diagnosticEvents_", "initPolicy_", "adPolicy_", "operativeEventPolicy_", "otherPolicy_", "adOperations_", "featureFlags_", "enableIapEvent_", "enableOm_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<NativeConfiguration> defaultInstanceBasedParser = PARSER;
                    if (defaultInstanceBasedParser == null) {
                        synchronized (NativeConfiguration.class) {
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
            NativeConfiguration nativeConfiguration = new NativeConfiguration();
            DEFAULT_INSTANCE = nativeConfiguration;
            GeneratedMessageLite.registerDefaultInstance(NativeConfiguration.class, nativeConfiguration);
        }

        public static NativeConfiguration getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<NativeConfiguration> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }

    public static final class FeatureFlags extends GeneratedMessageLite<FeatureFlags, Builder> implements FeatureFlagsOrBuilder {
        public static final int BOLD_SDK_NEXT_SESSION_ENABLED_FIELD_NUMBER = 3;
        private static final FeatureFlags DEFAULT_INSTANCE;
        public static final int OPENGL_GPU_ENABLED_FIELD_NUMBER = 1;
        public static final int OPPORTUNITY_ID_PLACEMENT_VALIDATION_FIELD_NUMBER = 2;
        private static volatile Parser<FeatureFlags> PARSER;
        private boolean boldSdkNextSessionEnabled_;
        private boolean openglGpuEnabled_;
        private boolean opportunityIdPlacementValidation_;

        private FeatureFlags() {
        }

        @Override // gateway.v1.NativeConfigurationOuterClass.FeatureFlagsOrBuilder
        public boolean getOpenglGpuEnabled() {
            return this.openglGpuEnabled_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setOpenglGpuEnabled(boolean z) {
            this.openglGpuEnabled_ = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearOpenglGpuEnabled() {
            this.openglGpuEnabled_ = false;
        }

        @Override // gateway.v1.NativeConfigurationOuterClass.FeatureFlagsOrBuilder
        public boolean getOpportunityIdPlacementValidation() {
            return this.opportunityIdPlacementValidation_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setOpportunityIdPlacementValidation(boolean z) {
            this.opportunityIdPlacementValidation_ = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearOpportunityIdPlacementValidation() {
            this.opportunityIdPlacementValidation_ = false;
        }

        @Override // gateway.v1.NativeConfigurationOuterClass.FeatureFlagsOrBuilder
        public boolean getBoldSdkNextSessionEnabled() {
            return this.boldSdkNextSessionEnabled_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBoldSdkNextSessionEnabled(boolean z) {
            this.boldSdkNextSessionEnabled_ = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearBoldSdkNextSessionEnabled() {
            this.boldSdkNextSessionEnabled_ = false;
        }

        public static FeatureFlags parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (FeatureFlags) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static FeatureFlags parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (FeatureFlags) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static FeatureFlags parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (FeatureFlags) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static FeatureFlags parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (FeatureFlags) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static FeatureFlags parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (FeatureFlags) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static FeatureFlags parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (FeatureFlags) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static FeatureFlags parseFrom(InputStream inputStream) throws IOException {
            return (FeatureFlags) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static FeatureFlags parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (FeatureFlags) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static FeatureFlags parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (FeatureFlags) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static FeatureFlags parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (FeatureFlags) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static FeatureFlags parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (FeatureFlags) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static FeatureFlags parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (FeatureFlags) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(FeatureFlags featureFlags) {
            return DEFAULT_INSTANCE.createBuilder(featureFlags);
        }

        public static final class Builder extends GeneratedMessageLite.Builder<FeatureFlags, Builder> implements FeatureFlagsOrBuilder {
            /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            private Builder() {
                super(FeatureFlags.DEFAULT_INSTANCE);
            }

            @Override // gateway.v1.NativeConfigurationOuterClass.FeatureFlagsOrBuilder
            public boolean getOpenglGpuEnabled() {
                return ((FeatureFlags) this.instance).getOpenglGpuEnabled();
            }

            public Builder setOpenglGpuEnabled(boolean z) {
                copyOnWrite();
                ((FeatureFlags) this.instance).setOpenglGpuEnabled(z);
                return this;
            }

            public Builder clearOpenglGpuEnabled() {
                copyOnWrite();
                ((FeatureFlags) this.instance).clearOpenglGpuEnabled();
                return this;
            }

            @Override // gateway.v1.NativeConfigurationOuterClass.FeatureFlagsOrBuilder
            public boolean getOpportunityIdPlacementValidation() {
                return ((FeatureFlags) this.instance).getOpportunityIdPlacementValidation();
            }

            public Builder setOpportunityIdPlacementValidation(boolean z) {
                copyOnWrite();
                ((FeatureFlags) this.instance).setOpportunityIdPlacementValidation(z);
                return this;
            }

            public Builder clearOpportunityIdPlacementValidation() {
                copyOnWrite();
                ((FeatureFlags) this.instance).clearOpportunityIdPlacementValidation();
                return this;
            }

            @Override // gateway.v1.NativeConfigurationOuterClass.FeatureFlagsOrBuilder
            public boolean getBoldSdkNextSessionEnabled() {
                return ((FeatureFlags) this.instance).getBoldSdkNextSessionEnabled();
            }

            public Builder setBoldSdkNextSessionEnabled(boolean z) {
                copyOnWrite();
                ((FeatureFlags) this.instance).setBoldSdkNextSessionEnabled(z);
                return this;
            }

            public Builder clearBoldSdkNextSessionEnabled() {
                copyOnWrite();
                ((FeatureFlags) this.instance).clearBoldSdkNextSessionEnabled();
                return this;
            }
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new FeatureFlags();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0007\u0002\u0007\u0003\u0007", new Object[]{"openglGpuEnabled_", "opportunityIdPlacementValidation_", "boldSdkNextSessionEnabled_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<FeatureFlags> defaultInstanceBasedParser = PARSER;
                    if (defaultInstanceBasedParser == null) {
                        synchronized (FeatureFlags.class) {
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
            FeatureFlags featureFlags = new FeatureFlags();
            DEFAULT_INSTANCE = featureFlags;
            GeneratedMessageLite.registerDefaultInstance(FeatureFlags.class, featureFlags);
        }

        public static FeatureFlags getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<FeatureFlags> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }
}
