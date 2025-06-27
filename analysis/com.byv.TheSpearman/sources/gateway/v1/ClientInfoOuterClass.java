package gateway.v1;

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

/* loaded from: classes5.dex */
public final class ClientInfoOuterClass {

    public interface ClientInfoOrBuilder extends MessageLiteOrBuilder {
        String getCustomMediationName();

        ByteString getCustomMediationNameBytes();

        String getGameId();

        ByteString getGameIdBytes();

        MediationProvider getMediationProvider();

        int getMediationProviderValue();

        String getMediationVersion();

        ByteString getMediationVersionBytes();

        Platform getPlatform();

        int getPlatformValue();

        int getSdkVersion();

        String getSdkVersionName();

        ByteString getSdkVersionNameBytes();

        boolean getTest();

        boolean hasCustomMediationName();

        boolean hasMediationVersion();
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
    }

    private ClientInfoOuterClass() {
    }

    public enum Platform implements Internal.EnumLite {
        PLATFORM_UNSPECIFIED(0),
        PLATFORM_ANDROID(1),
        PLATFORM_IOS(2),
        UNRECOGNIZED(-1);

        public static final int PLATFORM_ANDROID_VALUE = 1;
        public static final int PLATFORM_IOS_VALUE = 2;
        public static final int PLATFORM_UNSPECIFIED_VALUE = 0;
        private static final Internal.EnumLiteMap<Platform> internalValueMap = new Internal.EnumLiteMap<Platform>() { // from class: gateway.v1.ClientInfoOuterClass.Platform.1
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public Platform findValueByNumber(int i) {
                return Platform.forNumber(i);
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
        public static Platform valueOf(int i) {
            return forNumber(i);
        }

        public static Platform forNumber(int i) {
            if (i == 0) {
                return PLATFORM_UNSPECIFIED;
            }
            if (i == 1) {
                return PLATFORM_ANDROID;
            }
            if (i != 2) {
                return null;
            }
            return PLATFORM_IOS;
        }

        public static Internal.EnumLiteMap<Platform> internalGetValueMap() {
            return internalValueMap;
        }

        public static Internal.EnumVerifier internalGetVerifier() {
            return PlatformVerifier.INSTANCE;
        }

        private static final class PlatformVerifier implements Internal.EnumVerifier {
            static final Internal.EnumVerifier INSTANCE = new PlatformVerifier();

            private PlatformVerifier() {
            }

            @Override // com.google.protobuf.Internal.EnumVerifier
            public boolean isInRange(int i) {
                return Platform.forNumber(i) != null;
            }
        }

        Platform(int i) {
            this.value = i;
        }
    }

    public enum MediationProvider implements Internal.EnumLite {
        MEDIATION_PROVIDER_UNSPECIFIED(0),
        MEDIATION_PROVIDER_CUSTOM(1),
        MEDIATION_PROVIDER_ADMOB(2),
        MEDIATION_PROVIDER_MAX(3),
        MEDIATION_PROVIDER_LEVELPLAY(4),
        UNRECOGNIZED(-1);

        public static final int MEDIATION_PROVIDER_ADMOB_VALUE = 2;
        public static final int MEDIATION_PROVIDER_CUSTOM_VALUE = 1;
        public static final int MEDIATION_PROVIDER_LEVELPLAY_VALUE = 4;
        public static final int MEDIATION_PROVIDER_MAX_VALUE = 3;
        public static final int MEDIATION_PROVIDER_UNSPECIFIED_VALUE = 0;
        private static final Internal.EnumLiteMap<MediationProvider> internalValueMap = new Internal.EnumLiteMap<MediationProvider>() { // from class: gateway.v1.ClientInfoOuterClass.MediationProvider.1
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public MediationProvider findValueByNumber(int i) {
                return MediationProvider.forNumber(i);
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
        public static MediationProvider valueOf(int i) {
            return forNumber(i);
        }

        public static MediationProvider forNumber(int i) {
            if (i == 0) {
                return MEDIATION_PROVIDER_UNSPECIFIED;
            }
            if (i == 1) {
                return MEDIATION_PROVIDER_CUSTOM;
            }
            if (i == 2) {
                return MEDIATION_PROVIDER_ADMOB;
            }
            if (i == 3) {
                return MEDIATION_PROVIDER_MAX;
            }
            if (i != 4) {
                return null;
            }
            return MEDIATION_PROVIDER_LEVELPLAY;
        }

        public static Internal.EnumLiteMap<MediationProvider> internalGetValueMap() {
            return internalValueMap;
        }

        public static Internal.EnumVerifier internalGetVerifier() {
            return MediationProviderVerifier.INSTANCE;
        }

        private static final class MediationProviderVerifier implements Internal.EnumVerifier {
            static final Internal.EnumVerifier INSTANCE = new MediationProviderVerifier();

            private MediationProviderVerifier() {
            }

            @Override // com.google.protobuf.Internal.EnumVerifier
            public boolean isInRange(int i) {
                return MediationProvider.forNumber(i) != null;
            }
        }

        MediationProvider(int i) {
            this.value = i;
        }
    }

    public static final class ClientInfo extends GeneratedMessageLite<ClientInfo, Builder> implements ClientInfoOrBuilder {
        public static final int CUSTOM_MEDIATION_NAME_FIELD_NUMBER = 7;
        private static final ClientInfo DEFAULT_INSTANCE;
        public static final int GAME_ID_FIELD_NUMBER = 3;
        public static final int MEDIATION_PROVIDER_FIELD_NUMBER = 6;
        public static final int MEDIATION_VERSION_FIELD_NUMBER = 8;
        private static volatile Parser<ClientInfo> PARSER = null;
        public static final int PLATFORM_FIELD_NUMBER = 5;
        public static final int SDK_VERSION_FIELD_NUMBER = 1;
        public static final int SDK_VERSION_NAME_FIELD_NUMBER = 2;
        public static final int TEST_FIELD_NUMBER = 4;
        private int bitField0_;
        private int mediationProvider_;
        private int platform_;
        private int sdkVersion_;
        private boolean test_;
        private String sdkVersionName_ = "";
        private String gameId_ = "";
        private String customMediationName_ = "";
        private String mediationVersion_ = "";

        private ClientInfo() {
        }

        @Override // gateway.v1.ClientInfoOuterClass.ClientInfoOrBuilder
        public int getSdkVersion() {
            return this.sdkVersion_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSdkVersion(int i) {
            this.sdkVersion_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSdkVersion() {
            this.sdkVersion_ = 0;
        }

        @Override // gateway.v1.ClientInfoOuterClass.ClientInfoOrBuilder
        public String getSdkVersionName() {
            return this.sdkVersionName_;
        }

        @Override // gateway.v1.ClientInfoOuterClass.ClientInfoOrBuilder
        public ByteString getSdkVersionNameBytes() {
            return ByteString.copyFromUtf8(this.sdkVersionName_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSdkVersionName(String str) {
            str.getClass();
            this.sdkVersionName_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSdkVersionName() {
            this.sdkVersionName_ = getDefaultInstance().getSdkVersionName();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSdkVersionNameBytes(ByteString byteString) {
            checkByteStringIsUtf8(byteString);
            this.sdkVersionName_ = byteString.toStringUtf8();
        }

        @Override // gateway.v1.ClientInfoOuterClass.ClientInfoOrBuilder
        public String getGameId() {
            return this.gameId_;
        }

        @Override // gateway.v1.ClientInfoOuterClass.ClientInfoOrBuilder
        public ByteString getGameIdBytes() {
            return ByteString.copyFromUtf8(this.gameId_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setGameId(String str) {
            str.getClass();
            this.gameId_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearGameId() {
            this.gameId_ = getDefaultInstance().getGameId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setGameIdBytes(ByteString byteString) {
            checkByteStringIsUtf8(byteString);
            this.gameId_ = byteString.toStringUtf8();
        }

        @Override // gateway.v1.ClientInfoOuterClass.ClientInfoOrBuilder
        public boolean getTest() {
            return this.test_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTest(boolean z) {
            this.test_ = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTest() {
            this.test_ = false;
        }

        @Override // gateway.v1.ClientInfoOuterClass.ClientInfoOrBuilder
        public int getPlatformValue() {
            return this.platform_;
        }

        @Override // gateway.v1.ClientInfoOuterClass.ClientInfoOrBuilder
        public Platform getPlatform() {
            Platform platformForNumber = Platform.forNumber(this.platform_);
            return platformForNumber == null ? Platform.UNRECOGNIZED : platformForNumber;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPlatformValue(int i) {
            this.platform_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPlatform(Platform platform) {
            this.platform_ = platform.getNumber();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPlatform() {
            this.platform_ = 0;
        }

        @Override // gateway.v1.ClientInfoOuterClass.ClientInfoOrBuilder
        public int getMediationProviderValue() {
            return this.mediationProvider_;
        }

        @Override // gateway.v1.ClientInfoOuterClass.ClientInfoOrBuilder
        public MediationProvider getMediationProvider() {
            MediationProvider mediationProviderForNumber = MediationProvider.forNumber(this.mediationProvider_);
            return mediationProviderForNumber == null ? MediationProvider.UNRECOGNIZED : mediationProviderForNumber;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMediationProviderValue(int i) {
            this.mediationProvider_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMediationProvider(MediationProvider mediationProvider) {
            this.mediationProvider_ = mediationProvider.getNumber();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMediationProvider() {
            this.mediationProvider_ = 0;
        }

        @Override // gateway.v1.ClientInfoOuterClass.ClientInfoOrBuilder
        public boolean hasCustomMediationName() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // gateway.v1.ClientInfoOuterClass.ClientInfoOrBuilder
        public String getCustomMediationName() {
            return this.customMediationName_;
        }

        @Override // gateway.v1.ClientInfoOuterClass.ClientInfoOrBuilder
        public ByteString getCustomMediationNameBytes() {
            return ByteString.copyFromUtf8(this.customMediationName_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCustomMediationName(String str) {
            str.getClass();
            this.bitField0_ |= 1;
            this.customMediationName_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCustomMediationName() {
            this.bitField0_ &= -2;
            this.customMediationName_ = getDefaultInstance().getCustomMediationName();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCustomMediationNameBytes(ByteString byteString) {
            checkByteStringIsUtf8(byteString);
            this.customMediationName_ = byteString.toStringUtf8();
            this.bitField0_ |= 1;
        }

        @Override // gateway.v1.ClientInfoOuterClass.ClientInfoOrBuilder
        public boolean hasMediationVersion() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // gateway.v1.ClientInfoOuterClass.ClientInfoOrBuilder
        public String getMediationVersion() {
            return this.mediationVersion_;
        }

        @Override // gateway.v1.ClientInfoOuterClass.ClientInfoOrBuilder
        public ByteString getMediationVersionBytes() {
            return ByteString.copyFromUtf8(this.mediationVersion_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMediationVersion(String str) {
            str.getClass();
            this.bitField0_ |= 2;
            this.mediationVersion_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMediationVersion() {
            this.bitField0_ &= -3;
            this.mediationVersion_ = getDefaultInstance().getMediationVersion();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMediationVersionBytes(ByteString byteString) {
            checkByteStringIsUtf8(byteString);
            this.mediationVersion_ = byteString.toStringUtf8();
            this.bitField0_ |= 2;
        }

        public static ClientInfo parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (ClientInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static ClientInfo parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (ClientInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static ClientInfo parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (ClientInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static ClientInfo parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (ClientInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static ClientInfo parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (ClientInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static ClientInfo parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (ClientInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static ClientInfo parseFrom(InputStream inputStream) throws IOException {
            return (ClientInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ClientInfo parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (ClientInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static ClientInfo parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (ClientInfo) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ClientInfo parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (ClientInfo) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static ClientInfo parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (ClientInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static ClientInfo parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (ClientInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(ClientInfo clientInfo) {
            return DEFAULT_INSTANCE.createBuilder(clientInfo);
        }

        public static final class Builder extends GeneratedMessageLite.Builder<ClientInfo, Builder> implements ClientInfoOrBuilder {
            /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            private Builder() {
                super(ClientInfo.DEFAULT_INSTANCE);
            }

            @Override // gateway.v1.ClientInfoOuterClass.ClientInfoOrBuilder
            public int getSdkVersion() {
                return ((ClientInfo) this.instance).getSdkVersion();
            }

            public Builder setSdkVersion(int i) {
                copyOnWrite();
                ((ClientInfo) this.instance).setSdkVersion(i);
                return this;
            }

            public Builder clearSdkVersion() {
                copyOnWrite();
                ((ClientInfo) this.instance).clearSdkVersion();
                return this;
            }

            @Override // gateway.v1.ClientInfoOuterClass.ClientInfoOrBuilder
            public String getSdkVersionName() {
                return ((ClientInfo) this.instance).getSdkVersionName();
            }

            @Override // gateway.v1.ClientInfoOuterClass.ClientInfoOrBuilder
            public ByteString getSdkVersionNameBytes() {
                return ((ClientInfo) this.instance).getSdkVersionNameBytes();
            }

            public Builder setSdkVersionName(String str) {
                copyOnWrite();
                ((ClientInfo) this.instance).setSdkVersionName(str);
                return this;
            }

            public Builder clearSdkVersionName() {
                copyOnWrite();
                ((ClientInfo) this.instance).clearSdkVersionName();
                return this;
            }

            public Builder setSdkVersionNameBytes(ByteString byteString) {
                copyOnWrite();
                ((ClientInfo) this.instance).setSdkVersionNameBytes(byteString);
                return this;
            }

            @Override // gateway.v1.ClientInfoOuterClass.ClientInfoOrBuilder
            public String getGameId() {
                return ((ClientInfo) this.instance).getGameId();
            }

            @Override // gateway.v1.ClientInfoOuterClass.ClientInfoOrBuilder
            public ByteString getGameIdBytes() {
                return ((ClientInfo) this.instance).getGameIdBytes();
            }

            public Builder setGameId(String str) {
                copyOnWrite();
                ((ClientInfo) this.instance).setGameId(str);
                return this;
            }

            public Builder clearGameId() {
                copyOnWrite();
                ((ClientInfo) this.instance).clearGameId();
                return this;
            }

            public Builder setGameIdBytes(ByteString byteString) {
                copyOnWrite();
                ((ClientInfo) this.instance).setGameIdBytes(byteString);
                return this;
            }

            @Override // gateway.v1.ClientInfoOuterClass.ClientInfoOrBuilder
            public boolean getTest() {
                return ((ClientInfo) this.instance).getTest();
            }

            public Builder setTest(boolean z) {
                copyOnWrite();
                ((ClientInfo) this.instance).setTest(z);
                return this;
            }

            public Builder clearTest() {
                copyOnWrite();
                ((ClientInfo) this.instance).clearTest();
                return this;
            }

            @Override // gateway.v1.ClientInfoOuterClass.ClientInfoOrBuilder
            public int getPlatformValue() {
                return ((ClientInfo) this.instance).getPlatformValue();
            }

            public Builder setPlatformValue(int i) {
                copyOnWrite();
                ((ClientInfo) this.instance).setPlatformValue(i);
                return this;
            }

            @Override // gateway.v1.ClientInfoOuterClass.ClientInfoOrBuilder
            public Platform getPlatform() {
                return ((ClientInfo) this.instance).getPlatform();
            }

            public Builder setPlatform(Platform platform) {
                copyOnWrite();
                ((ClientInfo) this.instance).setPlatform(platform);
                return this;
            }

            public Builder clearPlatform() {
                copyOnWrite();
                ((ClientInfo) this.instance).clearPlatform();
                return this;
            }

            @Override // gateway.v1.ClientInfoOuterClass.ClientInfoOrBuilder
            public int getMediationProviderValue() {
                return ((ClientInfo) this.instance).getMediationProviderValue();
            }

            public Builder setMediationProviderValue(int i) {
                copyOnWrite();
                ((ClientInfo) this.instance).setMediationProviderValue(i);
                return this;
            }

            @Override // gateway.v1.ClientInfoOuterClass.ClientInfoOrBuilder
            public MediationProvider getMediationProvider() {
                return ((ClientInfo) this.instance).getMediationProvider();
            }

            public Builder setMediationProvider(MediationProvider mediationProvider) {
                copyOnWrite();
                ((ClientInfo) this.instance).setMediationProvider(mediationProvider);
                return this;
            }

            public Builder clearMediationProvider() {
                copyOnWrite();
                ((ClientInfo) this.instance).clearMediationProvider();
                return this;
            }

            @Override // gateway.v1.ClientInfoOuterClass.ClientInfoOrBuilder
            public boolean hasCustomMediationName() {
                return ((ClientInfo) this.instance).hasCustomMediationName();
            }

            @Override // gateway.v1.ClientInfoOuterClass.ClientInfoOrBuilder
            public String getCustomMediationName() {
                return ((ClientInfo) this.instance).getCustomMediationName();
            }

            @Override // gateway.v1.ClientInfoOuterClass.ClientInfoOrBuilder
            public ByteString getCustomMediationNameBytes() {
                return ((ClientInfo) this.instance).getCustomMediationNameBytes();
            }

            public Builder setCustomMediationName(String str) {
                copyOnWrite();
                ((ClientInfo) this.instance).setCustomMediationName(str);
                return this;
            }

            public Builder clearCustomMediationName() {
                copyOnWrite();
                ((ClientInfo) this.instance).clearCustomMediationName();
                return this;
            }

            public Builder setCustomMediationNameBytes(ByteString byteString) {
                copyOnWrite();
                ((ClientInfo) this.instance).setCustomMediationNameBytes(byteString);
                return this;
            }

            @Override // gateway.v1.ClientInfoOuterClass.ClientInfoOrBuilder
            public boolean hasMediationVersion() {
                return ((ClientInfo) this.instance).hasMediationVersion();
            }

            @Override // gateway.v1.ClientInfoOuterClass.ClientInfoOrBuilder
            public String getMediationVersion() {
                return ((ClientInfo) this.instance).getMediationVersion();
            }

            @Override // gateway.v1.ClientInfoOuterClass.ClientInfoOrBuilder
            public ByteString getMediationVersionBytes() {
                return ((ClientInfo) this.instance).getMediationVersionBytes();
            }

            public Builder setMediationVersion(String str) {
                copyOnWrite();
                ((ClientInfo) this.instance).setMediationVersion(str);
                return this;
            }

            public Builder clearMediationVersion() {
                copyOnWrite();
                ((ClientInfo) this.instance).clearMediationVersion();
                return this;
            }

            public Builder setMediationVersionBytes(ByteString byteString) {
                copyOnWrite();
                ((ClientInfo) this.instance).setMediationVersionBytes(byteString);
                return this;
            }
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new ClientInfo();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0000\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001\u000b\u0002Ȉ\u0003Ȉ\u0004\u0007\u0005\f\u0006\f\u0007ለ\u0000\bለ\u0001", new Object[]{"bitField0_", "sdkVersion_", "sdkVersionName_", "gameId_", "test_", "platform_", "mediationProvider_", "customMediationName_", "mediationVersion_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<ClientInfo> defaultInstanceBasedParser = PARSER;
                    if (defaultInstanceBasedParser == null) {
                        synchronized (ClientInfo.class) {
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
            ClientInfo clientInfo = new ClientInfo();
            DEFAULT_INSTANCE = clientInfo;
            GeneratedMessageLite.registerDefaultInstance(ClientInfo.class, clientInfo);
        }

        public static ClientInfo getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<ClientInfo> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }

    /* renamed from: gateway.v1.ClientInfoOuterClass$1, reason: invalid class name */
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
