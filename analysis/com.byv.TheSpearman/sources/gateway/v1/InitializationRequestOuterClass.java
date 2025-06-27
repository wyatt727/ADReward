package gateway.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import gateway.v1.ClientInfoOuterClass;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes5.dex */
public final class InitializationRequestOuterClass {

    public interface InitializationDeviceInfoOrBuilder extends MessageLiteOrBuilder {
        String getBundleId();

        ByteString getBundleIdBytes();

        String getDeviceMake();

        ByteString getDeviceMakeBytes();

        String getDeviceModel();

        ByteString getDeviceModelBytes();

        String getOsVersion();

        ByteString getOsVersionBytes();

        int getTrackingAuthStatus();

        boolean hasTrackingAuthStatus();
    }

    public interface InitializationRequestOrBuilder extends MessageLiteOrBuilder {
        String getAnalyticsUserId();

        ByteString getAnalyticsUserIdBytes();

        ByteString getAuid();

        ByteString getCache();

        ClientInfoOuterClass.ClientInfo getClientInfo();

        InitializationDeviceInfo getDeviceInfo();

        String getIdfi();

        ByteString getIdfiBytes();

        boolean getIsFirstInit();

        String getLegacyFlowUserConsent();

        ByteString getLegacyFlowUserConsentBytes();

        ByteString getPrivacy();

        ByteString getSessionId();

        boolean hasAnalyticsUserId();

        boolean hasAuid();

        boolean hasCache();

        boolean hasClientInfo();

        boolean hasDeviceInfo();

        boolean hasLegacyFlowUserConsent();

        boolean hasPrivacy();
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
    }

    private InitializationRequestOuterClass() {
    }

    public static final class InitializationDeviceInfo extends GeneratedMessageLite<InitializationDeviceInfo, Builder> implements InitializationDeviceInfoOrBuilder {
        public static final int BUNDLE_ID_FIELD_NUMBER = 1;
        private static final InitializationDeviceInfo DEFAULT_INSTANCE;
        public static final int DEVICE_MAKE_FIELD_NUMBER = 2;
        public static final int DEVICE_MODEL_FIELD_NUMBER = 3;
        public static final int OS_VERSION_FIELD_NUMBER = 4;
        private static volatile Parser<InitializationDeviceInfo> PARSER = null;
        public static final int TRACKING_AUTH_STATUS_FIELD_NUMBER = 5;
        private int bitField0_;
        private String bundleId_ = "";
        private String deviceMake_ = "";
        private String deviceModel_ = "";
        private String osVersion_ = "";
        private int trackingAuthStatus_;

        private InitializationDeviceInfo() {
        }

        @Override // gateway.v1.InitializationRequestOuterClass.InitializationDeviceInfoOrBuilder
        public String getBundleId() {
            return this.bundleId_;
        }

        @Override // gateway.v1.InitializationRequestOuterClass.InitializationDeviceInfoOrBuilder
        public ByteString getBundleIdBytes() {
            return ByteString.copyFromUtf8(this.bundleId_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBundleId(String str) {
            str.getClass();
            this.bundleId_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearBundleId() {
            this.bundleId_ = getDefaultInstance().getBundleId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBundleIdBytes(ByteString byteString) {
            checkByteStringIsUtf8(byteString);
            this.bundleId_ = byteString.toStringUtf8();
        }

        @Override // gateway.v1.InitializationRequestOuterClass.InitializationDeviceInfoOrBuilder
        public String getDeviceMake() {
            return this.deviceMake_;
        }

        @Override // gateway.v1.InitializationRequestOuterClass.InitializationDeviceInfoOrBuilder
        public ByteString getDeviceMakeBytes() {
            return ByteString.copyFromUtf8(this.deviceMake_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDeviceMake(String str) {
            str.getClass();
            this.deviceMake_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDeviceMake() {
            this.deviceMake_ = getDefaultInstance().getDeviceMake();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDeviceMakeBytes(ByteString byteString) {
            checkByteStringIsUtf8(byteString);
            this.deviceMake_ = byteString.toStringUtf8();
        }

        @Override // gateway.v1.InitializationRequestOuterClass.InitializationDeviceInfoOrBuilder
        public String getDeviceModel() {
            return this.deviceModel_;
        }

        @Override // gateway.v1.InitializationRequestOuterClass.InitializationDeviceInfoOrBuilder
        public ByteString getDeviceModelBytes() {
            return ByteString.copyFromUtf8(this.deviceModel_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDeviceModel(String str) {
            str.getClass();
            this.deviceModel_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDeviceModel() {
            this.deviceModel_ = getDefaultInstance().getDeviceModel();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDeviceModelBytes(ByteString byteString) {
            checkByteStringIsUtf8(byteString);
            this.deviceModel_ = byteString.toStringUtf8();
        }

        @Override // gateway.v1.InitializationRequestOuterClass.InitializationDeviceInfoOrBuilder
        public String getOsVersion() {
            return this.osVersion_;
        }

        @Override // gateway.v1.InitializationRequestOuterClass.InitializationDeviceInfoOrBuilder
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

        @Override // gateway.v1.InitializationRequestOuterClass.InitializationDeviceInfoOrBuilder
        public boolean hasTrackingAuthStatus() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // gateway.v1.InitializationRequestOuterClass.InitializationDeviceInfoOrBuilder
        public int getTrackingAuthStatus() {
            return this.trackingAuthStatus_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTrackingAuthStatus(int i) {
            this.bitField0_ |= 1;
            this.trackingAuthStatus_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTrackingAuthStatus() {
            this.bitField0_ &= -2;
            this.trackingAuthStatus_ = 0;
        }

        public static InitializationDeviceInfo parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (InitializationDeviceInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static InitializationDeviceInfo parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (InitializationDeviceInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static InitializationDeviceInfo parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (InitializationDeviceInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static InitializationDeviceInfo parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (InitializationDeviceInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static InitializationDeviceInfo parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (InitializationDeviceInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static InitializationDeviceInfo parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (InitializationDeviceInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static InitializationDeviceInfo parseFrom(InputStream inputStream) throws IOException {
            return (InitializationDeviceInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static InitializationDeviceInfo parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (InitializationDeviceInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static InitializationDeviceInfo parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (InitializationDeviceInfo) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static InitializationDeviceInfo parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (InitializationDeviceInfo) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static InitializationDeviceInfo parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (InitializationDeviceInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static InitializationDeviceInfo parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (InitializationDeviceInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(InitializationDeviceInfo initializationDeviceInfo) {
            return DEFAULT_INSTANCE.createBuilder(initializationDeviceInfo);
        }

        public static final class Builder extends GeneratedMessageLite.Builder<InitializationDeviceInfo, Builder> implements InitializationDeviceInfoOrBuilder {
            /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            private Builder() {
                super(InitializationDeviceInfo.DEFAULT_INSTANCE);
            }

            @Override // gateway.v1.InitializationRequestOuterClass.InitializationDeviceInfoOrBuilder
            public String getBundleId() {
                return ((InitializationDeviceInfo) this.instance).getBundleId();
            }

            @Override // gateway.v1.InitializationRequestOuterClass.InitializationDeviceInfoOrBuilder
            public ByteString getBundleIdBytes() {
                return ((InitializationDeviceInfo) this.instance).getBundleIdBytes();
            }

            public Builder setBundleId(String str) {
                copyOnWrite();
                ((InitializationDeviceInfo) this.instance).setBundleId(str);
                return this;
            }

            public Builder clearBundleId() {
                copyOnWrite();
                ((InitializationDeviceInfo) this.instance).clearBundleId();
                return this;
            }

            public Builder setBundleIdBytes(ByteString byteString) {
                copyOnWrite();
                ((InitializationDeviceInfo) this.instance).setBundleIdBytes(byteString);
                return this;
            }

            @Override // gateway.v1.InitializationRequestOuterClass.InitializationDeviceInfoOrBuilder
            public String getDeviceMake() {
                return ((InitializationDeviceInfo) this.instance).getDeviceMake();
            }

            @Override // gateway.v1.InitializationRequestOuterClass.InitializationDeviceInfoOrBuilder
            public ByteString getDeviceMakeBytes() {
                return ((InitializationDeviceInfo) this.instance).getDeviceMakeBytes();
            }

            public Builder setDeviceMake(String str) {
                copyOnWrite();
                ((InitializationDeviceInfo) this.instance).setDeviceMake(str);
                return this;
            }

            public Builder clearDeviceMake() {
                copyOnWrite();
                ((InitializationDeviceInfo) this.instance).clearDeviceMake();
                return this;
            }

            public Builder setDeviceMakeBytes(ByteString byteString) {
                copyOnWrite();
                ((InitializationDeviceInfo) this.instance).setDeviceMakeBytes(byteString);
                return this;
            }

            @Override // gateway.v1.InitializationRequestOuterClass.InitializationDeviceInfoOrBuilder
            public String getDeviceModel() {
                return ((InitializationDeviceInfo) this.instance).getDeviceModel();
            }

            @Override // gateway.v1.InitializationRequestOuterClass.InitializationDeviceInfoOrBuilder
            public ByteString getDeviceModelBytes() {
                return ((InitializationDeviceInfo) this.instance).getDeviceModelBytes();
            }

            public Builder setDeviceModel(String str) {
                copyOnWrite();
                ((InitializationDeviceInfo) this.instance).setDeviceModel(str);
                return this;
            }

            public Builder clearDeviceModel() {
                copyOnWrite();
                ((InitializationDeviceInfo) this.instance).clearDeviceModel();
                return this;
            }

            public Builder setDeviceModelBytes(ByteString byteString) {
                copyOnWrite();
                ((InitializationDeviceInfo) this.instance).setDeviceModelBytes(byteString);
                return this;
            }

            @Override // gateway.v1.InitializationRequestOuterClass.InitializationDeviceInfoOrBuilder
            public String getOsVersion() {
                return ((InitializationDeviceInfo) this.instance).getOsVersion();
            }

            @Override // gateway.v1.InitializationRequestOuterClass.InitializationDeviceInfoOrBuilder
            public ByteString getOsVersionBytes() {
                return ((InitializationDeviceInfo) this.instance).getOsVersionBytes();
            }

            public Builder setOsVersion(String str) {
                copyOnWrite();
                ((InitializationDeviceInfo) this.instance).setOsVersion(str);
                return this;
            }

            public Builder clearOsVersion() {
                copyOnWrite();
                ((InitializationDeviceInfo) this.instance).clearOsVersion();
                return this;
            }

            public Builder setOsVersionBytes(ByteString byteString) {
                copyOnWrite();
                ((InitializationDeviceInfo) this.instance).setOsVersionBytes(byteString);
                return this;
            }

            @Override // gateway.v1.InitializationRequestOuterClass.InitializationDeviceInfoOrBuilder
            public boolean hasTrackingAuthStatus() {
                return ((InitializationDeviceInfo) this.instance).hasTrackingAuthStatus();
            }

            @Override // gateway.v1.InitializationRequestOuterClass.InitializationDeviceInfoOrBuilder
            public int getTrackingAuthStatus() {
                return ((InitializationDeviceInfo) this.instance).getTrackingAuthStatus();
            }

            public Builder setTrackingAuthStatus(int i) {
                copyOnWrite();
                ((InitializationDeviceInfo) this.instance).setTrackingAuthStatus(i);
                return this;
            }

            public Builder clearTrackingAuthStatus() {
                copyOnWrite();
                ((InitializationDeviceInfo) this.instance).clearTrackingAuthStatus();
                return this;
            }
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new InitializationDeviceInfo();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005င\u0000", new Object[]{"bitField0_", "bundleId_", "deviceMake_", "deviceModel_", "osVersion_", "trackingAuthStatus_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<InitializationDeviceInfo> defaultInstanceBasedParser = PARSER;
                    if (defaultInstanceBasedParser == null) {
                        synchronized (InitializationDeviceInfo.class) {
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
            InitializationDeviceInfo initializationDeviceInfo = new InitializationDeviceInfo();
            DEFAULT_INSTANCE = initializationDeviceInfo;
            GeneratedMessageLite.registerDefaultInstance(InitializationDeviceInfo.class, initializationDeviceInfo);
        }

        public static InitializationDeviceInfo getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<InitializationDeviceInfo> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }

    /* renamed from: gateway.v1.InitializationRequestOuterClass$1, reason: invalid class name */
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

    public static final class InitializationRequest extends GeneratedMessageLite<InitializationRequest, Builder> implements InitializationRequestOrBuilder {
        public static final int ANALYTICS_USER_ID_FIELD_NUMBER = 8;
        public static final int AUID_FIELD_NUMBER = 7;
        public static final int CACHE_FIELD_NUMBER = 5;
        public static final int CLIENT_INFO_FIELD_NUMBER = 1;
        private static final InitializationRequest DEFAULT_INSTANCE;
        public static final int DEVICE_INFO_FIELD_NUMBER = 9;
        public static final int IDFI_FIELD_NUMBER = 3;
        public static final int IS_FIRST_INIT_FIELD_NUMBER = 10;
        public static final int LEGACY_FLOW_USER_CONSENT_FIELD_NUMBER = 6;
        private static volatile Parser<InitializationRequest> PARSER = null;
        public static final int PRIVACY_FIELD_NUMBER = 2;
        public static final int SESSION_ID_FIELD_NUMBER = 4;
        private int bitField0_;
        private ClientInfoOuterClass.ClientInfo clientInfo_;
        private InitializationDeviceInfo deviceInfo_;
        private boolean isFirstInit_;
        private ByteString privacy_ = ByteString.EMPTY;
        private String idfi_ = "";
        private ByteString sessionId_ = ByteString.EMPTY;
        private ByteString cache_ = ByteString.EMPTY;
        private String legacyFlowUserConsent_ = "";
        private ByteString auid_ = ByteString.EMPTY;
        private String analyticsUserId_ = "";

        private InitializationRequest() {
        }

        @Override // gateway.v1.InitializationRequestOuterClass.InitializationRequestOrBuilder
        public boolean hasClientInfo() {
            return this.clientInfo_ != null;
        }

        @Override // gateway.v1.InitializationRequestOuterClass.InitializationRequestOrBuilder
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

        @Override // gateway.v1.InitializationRequestOuterClass.InitializationRequestOrBuilder
        public boolean hasPrivacy() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // gateway.v1.InitializationRequestOuterClass.InitializationRequestOrBuilder
        public ByteString getPrivacy() {
            return this.privacy_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPrivacy(ByteString byteString) {
            byteString.getClass();
            this.bitField0_ |= 1;
            this.privacy_ = byteString;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPrivacy() {
            this.bitField0_ &= -2;
            this.privacy_ = getDefaultInstance().getPrivacy();
        }

        @Override // gateway.v1.InitializationRequestOuterClass.InitializationRequestOrBuilder
        public String getIdfi() {
            return this.idfi_;
        }

        @Override // gateway.v1.InitializationRequestOuterClass.InitializationRequestOrBuilder
        public ByteString getIdfiBytes() {
            return ByteString.copyFromUtf8(this.idfi_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setIdfi(String str) {
            str.getClass();
            this.idfi_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearIdfi() {
            this.idfi_ = getDefaultInstance().getIdfi();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setIdfiBytes(ByteString byteString) {
            checkByteStringIsUtf8(byteString);
            this.idfi_ = byteString.toStringUtf8();
        }

        @Override // gateway.v1.InitializationRequestOuterClass.InitializationRequestOrBuilder
        public ByteString getSessionId() {
            return this.sessionId_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSessionId(ByteString byteString) {
            byteString.getClass();
            this.sessionId_ = byteString;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSessionId() {
            this.sessionId_ = getDefaultInstance().getSessionId();
        }

        @Override // gateway.v1.InitializationRequestOuterClass.InitializationRequestOrBuilder
        public boolean hasCache() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // gateway.v1.InitializationRequestOuterClass.InitializationRequestOrBuilder
        public ByteString getCache() {
            return this.cache_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCache(ByteString byteString) {
            byteString.getClass();
            this.bitField0_ |= 2;
            this.cache_ = byteString;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCache() {
            this.bitField0_ &= -3;
            this.cache_ = getDefaultInstance().getCache();
        }

        @Override // gateway.v1.InitializationRequestOuterClass.InitializationRequestOrBuilder
        public boolean hasLegacyFlowUserConsent() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // gateway.v1.InitializationRequestOuterClass.InitializationRequestOrBuilder
        public String getLegacyFlowUserConsent() {
            return this.legacyFlowUserConsent_;
        }

        @Override // gateway.v1.InitializationRequestOuterClass.InitializationRequestOrBuilder
        public ByteString getLegacyFlowUserConsentBytes() {
            return ByteString.copyFromUtf8(this.legacyFlowUserConsent_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLegacyFlowUserConsent(String str) {
            str.getClass();
            this.bitField0_ |= 4;
            this.legacyFlowUserConsent_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearLegacyFlowUserConsent() {
            this.bitField0_ &= -5;
            this.legacyFlowUserConsent_ = getDefaultInstance().getLegacyFlowUserConsent();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLegacyFlowUserConsentBytes(ByteString byteString) {
            checkByteStringIsUtf8(byteString);
            this.legacyFlowUserConsent_ = byteString.toStringUtf8();
            this.bitField0_ |= 4;
        }

        @Override // gateway.v1.InitializationRequestOuterClass.InitializationRequestOrBuilder
        public boolean hasAuid() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // gateway.v1.InitializationRequestOuterClass.InitializationRequestOrBuilder
        public ByteString getAuid() {
            return this.auid_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAuid(ByteString byteString) {
            byteString.getClass();
            this.bitField0_ |= 8;
            this.auid_ = byteString;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAuid() {
            this.bitField0_ &= -9;
            this.auid_ = getDefaultInstance().getAuid();
        }

        @Override // gateway.v1.InitializationRequestOuterClass.InitializationRequestOrBuilder
        public boolean hasAnalyticsUserId() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // gateway.v1.InitializationRequestOuterClass.InitializationRequestOrBuilder
        public String getAnalyticsUserId() {
            return this.analyticsUserId_;
        }

        @Override // gateway.v1.InitializationRequestOuterClass.InitializationRequestOrBuilder
        public ByteString getAnalyticsUserIdBytes() {
            return ByteString.copyFromUtf8(this.analyticsUserId_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAnalyticsUserId(String str) {
            str.getClass();
            this.bitField0_ |= 16;
            this.analyticsUserId_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAnalyticsUserId() {
            this.bitField0_ &= -17;
            this.analyticsUserId_ = getDefaultInstance().getAnalyticsUserId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAnalyticsUserIdBytes(ByteString byteString) {
            checkByteStringIsUtf8(byteString);
            this.analyticsUserId_ = byteString.toStringUtf8();
            this.bitField0_ |= 16;
        }

        @Override // gateway.v1.InitializationRequestOuterClass.InitializationRequestOrBuilder
        public boolean hasDeviceInfo() {
            return this.deviceInfo_ != null;
        }

        @Override // gateway.v1.InitializationRequestOuterClass.InitializationRequestOrBuilder
        public InitializationDeviceInfo getDeviceInfo() {
            InitializationDeviceInfo initializationDeviceInfo = this.deviceInfo_;
            return initializationDeviceInfo == null ? InitializationDeviceInfo.getDefaultInstance() : initializationDeviceInfo;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDeviceInfo(InitializationDeviceInfo initializationDeviceInfo) {
            initializationDeviceInfo.getClass();
            this.deviceInfo_ = initializationDeviceInfo;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeDeviceInfo(InitializationDeviceInfo initializationDeviceInfo) {
            initializationDeviceInfo.getClass();
            InitializationDeviceInfo initializationDeviceInfo2 = this.deviceInfo_;
            if (initializationDeviceInfo2 != null && initializationDeviceInfo2 != InitializationDeviceInfo.getDefaultInstance()) {
                this.deviceInfo_ = InitializationDeviceInfo.newBuilder(this.deviceInfo_).mergeFrom((InitializationDeviceInfo.Builder) initializationDeviceInfo).buildPartial();
            } else {
                this.deviceInfo_ = initializationDeviceInfo;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDeviceInfo() {
            this.deviceInfo_ = null;
        }

        @Override // gateway.v1.InitializationRequestOuterClass.InitializationRequestOrBuilder
        public boolean getIsFirstInit() {
            return this.isFirstInit_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setIsFirstInit(boolean z) {
            this.isFirstInit_ = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearIsFirstInit() {
            this.isFirstInit_ = false;
        }

        public static InitializationRequest parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (InitializationRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static InitializationRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (InitializationRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static InitializationRequest parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (InitializationRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static InitializationRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (InitializationRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static InitializationRequest parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (InitializationRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static InitializationRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (InitializationRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static InitializationRequest parseFrom(InputStream inputStream) throws IOException {
            return (InitializationRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static InitializationRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (InitializationRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static InitializationRequest parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (InitializationRequest) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static InitializationRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (InitializationRequest) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static InitializationRequest parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (InitializationRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static InitializationRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (InitializationRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(InitializationRequest initializationRequest) {
            return DEFAULT_INSTANCE.createBuilder(initializationRequest);
        }

        public static final class Builder extends GeneratedMessageLite.Builder<InitializationRequest, Builder> implements InitializationRequestOrBuilder {
            /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            private Builder() {
                super(InitializationRequest.DEFAULT_INSTANCE);
            }

            @Override // gateway.v1.InitializationRequestOuterClass.InitializationRequestOrBuilder
            public boolean hasClientInfo() {
                return ((InitializationRequest) this.instance).hasClientInfo();
            }

            @Override // gateway.v1.InitializationRequestOuterClass.InitializationRequestOrBuilder
            public ClientInfoOuterClass.ClientInfo getClientInfo() {
                return ((InitializationRequest) this.instance).getClientInfo();
            }

            public Builder setClientInfo(ClientInfoOuterClass.ClientInfo clientInfo) {
                copyOnWrite();
                ((InitializationRequest) this.instance).setClientInfo(clientInfo);
                return this;
            }

            public Builder setClientInfo(ClientInfoOuterClass.ClientInfo.Builder builder) {
                copyOnWrite();
                ((InitializationRequest) this.instance).setClientInfo(builder.build());
                return this;
            }

            public Builder mergeClientInfo(ClientInfoOuterClass.ClientInfo clientInfo) {
                copyOnWrite();
                ((InitializationRequest) this.instance).mergeClientInfo(clientInfo);
                return this;
            }

            public Builder clearClientInfo() {
                copyOnWrite();
                ((InitializationRequest) this.instance).clearClientInfo();
                return this;
            }

            @Override // gateway.v1.InitializationRequestOuterClass.InitializationRequestOrBuilder
            public boolean hasPrivacy() {
                return ((InitializationRequest) this.instance).hasPrivacy();
            }

            @Override // gateway.v1.InitializationRequestOuterClass.InitializationRequestOrBuilder
            public ByteString getPrivacy() {
                return ((InitializationRequest) this.instance).getPrivacy();
            }

            public Builder setPrivacy(ByteString byteString) {
                copyOnWrite();
                ((InitializationRequest) this.instance).setPrivacy(byteString);
                return this;
            }

            public Builder clearPrivacy() {
                copyOnWrite();
                ((InitializationRequest) this.instance).clearPrivacy();
                return this;
            }

            @Override // gateway.v1.InitializationRequestOuterClass.InitializationRequestOrBuilder
            public String getIdfi() {
                return ((InitializationRequest) this.instance).getIdfi();
            }

            @Override // gateway.v1.InitializationRequestOuterClass.InitializationRequestOrBuilder
            public ByteString getIdfiBytes() {
                return ((InitializationRequest) this.instance).getIdfiBytes();
            }

            public Builder setIdfi(String str) {
                copyOnWrite();
                ((InitializationRequest) this.instance).setIdfi(str);
                return this;
            }

            public Builder clearIdfi() {
                copyOnWrite();
                ((InitializationRequest) this.instance).clearIdfi();
                return this;
            }

            public Builder setIdfiBytes(ByteString byteString) {
                copyOnWrite();
                ((InitializationRequest) this.instance).setIdfiBytes(byteString);
                return this;
            }

            @Override // gateway.v1.InitializationRequestOuterClass.InitializationRequestOrBuilder
            public ByteString getSessionId() {
                return ((InitializationRequest) this.instance).getSessionId();
            }

            public Builder setSessionId(ByteString byteString) {
                copyOnWrite();
                ((InitializationRequest) this.instance).setSessionId(byteString);
                return this;
            }

            public Builder clearSessionId() {
                copyOnWrite();
                ((InitializationRequest) this.instance).clearSessionId();
                return this;
            }

            @Override // gateway.v1.InitializationRequestOuterClass.InitializationRequestOrBuilder
            public boolean hasCache() {
                return ((InitializationRequest) this.instance).hasCache();
            }

            @Override // gateway.v1.InitializationRequestOuterClass.InitializationRequestOrBuilder
            public ByteString getCache() {
                return ((InitializationRequest) this.instance).getCache();
            }

            public Builder setCache(ByteString byteString) {
                copyOnWrite();
                ((InitializationRequest) this.instance).setCache(byteString);
                return this;
            }

            public Builder clearCache() {
                copyOnWrite();
                ((InitializationRequest) this.instance).clearCache();
                return this;
            }

            @Override // gateway.v1.InitializationRequestOuterClass.InitializationRequestOrBuilder
            public boolean hasLegacyFlowUserConsent() {
                return ((InitializationRequest) this.instance).hasLegacyFlowUserConsent();
            }

            @Override // gateway.v1.InitializationRequestOuterClass.InitializationRequestOrBuilder
            public String getLegacyFlowUserConsent() {
                return ((InitializationRequest) this.instance).getLegacyFlowUserConsent();
            }

            @Override // gateway.v1.InitializationRequestOuterClass.InitializationRequestOrBuilder
            public ByteString getLegacyFlowUserConsentBytes() {
                return ((InitializationRequest) this.instance).getLegacyFlowUserConsentBytes();
            }

            public Builder setLegacyFlowUserConsent(String str) {
                copyOnWrite();
                ((InitializationRequest) this.instance).setLegacyFlowUserConsent(str);
                return this;
            }

            public Builder clearLegacyFlowUserConsent() {
                copyOnWrite();
                ((InitializationRequest) this.instance).clearLegacyFlowUserConsent();
                return this;
            }

            public Builder setLegacyFlowUserConsentBytes(ByteString byteString) {
                copyOnWrite();
                ((InitializationRequest) this.instance).setLegacyFlowUserConsentBytes(byteString);
                return this;
            }

            @Override // gateway.v1.InitializationRequestOuterClass.InitializationRequestOrBuilder
            public boolean hasAuid() {
                return ((InitializationRequest) this.instance).hasAuid();
            }

            @Override // gateway.v1.InitializationRequestOuterClass.InitializationRequestOrBuilder
            public ByteString getAuid() {
                return ((InitializationRequest) this.instance).getAuid();
            }

            public Builder setAuid(ByteString byteString) {
                copyOnWrite();
                ((InitializationRequest) this.instance).setAuid(byteString);
                return this;
            }

            public Builder clearAuid() {
                copyOnWrite();
                ((InitializationRequest) this.instance).clearAuid();
                return this;
            }

            @Override // gateway.v1.InitializationRequestOuterClass.InitializationRequestOrBuilder
            public boolean hasAnalyticsUserId() {
                return ((InitializationRequest) this.instance).hasAnalyticsUserId();
            }

            @Override // gateway.v1.InitializationRequestOuterClass.InitializationRequestOrBuilder
            public String getAnalyticsUserId() {
                return ((InitializationRequest) this.instance).getAnalyticsUserId();
            }

            @Override // gateway.v1.InitializationRequestOuterClass.InitializationRequestOrBuilder
            public ByteString getAnalyticsUserIdBytes() {
                return ((InitializationRequest) this.instance).getAnalyticsUserIdBytes();
            }

            public Builder setAnalyticsUserId(String str) {
                copyOnWrite();
                ((InitializationRequest) this.instance).setAnalyticsUserId(str);
                return this;
            }

            public Builder clearAnalyticsUserId() {
                copyOnWrite();
                ((InitializationRequest) this.instance).clearAnalyticsUserId();
                return this;
            }

            public Builder setAnalyticsUserIdBytes(ByteString byteString) {
                copyOnWrite();
                ((InitializationRequest) this.instance).setAnalyticsUserIdBytes(byteString);
                return this;
            }

            @Override // gateway.v1.InitializationRequestOuterClass.InitializationRequestOrBuilder
            public boolean hasDeviceInfo() {
                return ((InitializationRequest) this.instance).hasDeviceInfo();
            }

            @Override // gateway.v1.InitializationRequestOuterClass.InitializationRequestOrBuilder
            public InitializationDeviceInfo getDeviceInfo() {
                return ((InitializationRequest) this.instance).getDeviceInfo();
            }

            public Builder setDeviceInfo(InitializationDeviceInfo initializationDeviceInfo) {
                copyOnWrite();
                ((InitializationRequest) this.instance).setDeviceInfo(initializationDeviceInfo);
                return this;
            }

            public Builder setDeviceInfo(InitializationDeviceInfo.Builder builder) {
                copyOnWrite();
                ((InitializationRequest) this.instance).setDeviceInfo(builder.build());
                return this;
            }

            public Builder mergeDeviceInfo(InitializationDeviceInfo initializationDeviceInfo) {
                copyOnWrite();
                ((InitializationRequest) this.instance).mergeDeviceInfo(initializationDeviceInfo);
                return this;
            }

            public Builder clearDeviceInfo() {
                copyOnWrite();
                ((InitializationRequest) this.instance).clearDeviceInfo();
                return this;
            }

            @Override // gateway.v1.InitializationRequestOuterClass.InitializationRequestOrBuilder
            public boolean getIsFirstInit() {
                return ((InitializationRequest) this.instance).getIsFirstInit();
            }

            public Builder setIsFirstInit(boolean z) {
                copyOnWrite();
                ((InitializationRequest) this.instance).setIsFirstInit(z);
                return this;
            }

            public Builder clearIsFirstInit() {
                copyOnWrite();
                ((InitializationRequest) this.instance).clearIsFirstInit();
                return this;
            }
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new InitializationRequest();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0000\n\u0000\u0001\u0001\n\n\u0000\u0000\u0000\u0001\t\u0002ည\u0000\u0003Ȉ\u0004\n\u0005ည\u0001\u0006ለ\u0002\u0007ည\u0003\bለ\u0004\t\t\n\u0007", new Object[]{"bitField0_", "clientInfo_", "privacy_", "idfi_", "sessionId_", "cache_", "legacyFlowUserConsent_", "auid_", "analyticsUserId_", "deviceInfo_", "isFirstInit_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<InitializationRequest> defaultInstanceBasedParser = PARSER;
                    if (defaultInstanceBasedParser == null) {
                        synchronized (InitializationRequest.class) {
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
            InitializationRequest initializationRequest = new InitializationRequest();
            DEFAULT_INSTANCE = initializationRequest;
            GeneratedMessageLite.registerDefaultInstance(InitializationRequest.class, initializationRequest);
        }

        public static InitializationRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<InitializationRequest> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }
}
