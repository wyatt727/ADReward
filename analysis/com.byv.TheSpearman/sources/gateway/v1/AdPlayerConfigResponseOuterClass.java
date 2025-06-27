package gateway.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import gateway.v1.ErrorOuterClass;
import gateway.v1.WebviewConfiguration;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes5.dex */
public final class AdPlayerConfigResponseOuterClass {

    public interface AdPlayerConfigResponseOrBuilder extends MessageLiteOrBuilder {
        ByteString getAdDataRefreshToken();

        ErrorOuterClass.Error getError();

        ByteString getImpressionConfiguration();

        int getImpressionConfigurationVersion();

        ByteString getTrackingToken();

        WebviewConfiguration.WebViewConfiguration getWebviewConfiguration();

        boolean hasError();

        boolean hasWebviewConfiguration();
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
    }

    private AdPlayerConfigResponseOuterClass() {
    }

    public static final class AdPlayerConfigResponse extends GeneratedMessageLite<AdPlayerConfigResponse, Builder> implements AdPlayerConfigResponseOrBuilder {
        public static final int AD_DATA_REFRESH_TOKEN_FIELD_NUMBER = 5;
        private static final AdPlayerConfigResponse DEFAULT_INSTANCE;
        public static final int ERROR_FIELD_NUMBER = 6;
        public static final int IMPRESSION_CONFIGURATION_FIELD_NUMBER = 2;
        public static final int IMPRESSION_CONFIGURATION_VERSION_FIELD_NUMBER = 3;
        private static volatile Parser<AdPlayerConfigResponse> PARSER = null;
        public static final int TRACKING_TOKEN_FIELD_NUMBER = 1;
        public static final int WEBVIEW_CONFIGURATION_FIELD_NUMBER = 4;
        private int bitField0_;
        private ErrorOuterClass.Error error_;
        private int impressionConfigurationVersion_;
        private WebviewConfiguration.WebViewConfiguration webviewConfiguration_;
        private ByteString trackingToken_ = ByteString.EMPTY;
        private ByteString impressionConfiguration_ = ByteString.EMPTY;
        private ByteString adDataRefreshToken_ = ByteString.EMPTY;

        private AdPlayerConfigResponse() {
        }

        @Override // gateway.v1.AdPlayerConfigResponseOuterClass.AdPlayerConfigResponseOrBuilder
        public ByteString getTrackingToken() {
            return this.trackingToken_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTrackingToken(ByteString byteString) {
            byteString.getClass();
            this.trackingToken_ = byteString;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTrackingToken() {
            this.trackingToken_ = getDefaultInstance().getTrackingToken();
        }

        @Override // gateway.v1.AdPlayerConfigResponseOuterClass.AdPlayerConfigResponseOrBuilder
        public ByteString getImpressionConfiguration() {
            return this.impressionConfiguration_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setImpressionConfiguration(ByteString byteString) {
            byteString.getClass();
            this.impressionConfiguration_ = byteString;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearImpressionConfiguration() {
            this.impressionConfiguration_ = getDefaultInstance().getImpressionConfiguration();
        }

        @Override // gateway.v1.AdPlayerConfigResponseOuterClass.AdPlayerConfigResponseOrBuilder
        public int getImpressionConfigurationVersion() {
            return this.impressionConfigurationVersion_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setImpressionConfigurationVersion(int i) {
            this.impressionConfigurationVersion_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearImpressionConfigurationVersion() {
            this.impressionConfigurationVersion_ = 0;
        }

        @Override // gateway.v1.AdPlayerConfigResponseOuterClass.AdPlayerConfigResponseOrBuilder
        public boolean hasWebviewConfiguration() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // gateway.v1.AdPlayerConfigResponseOuterClass.AdPlayerConfigResponseOrBuilder
        public WebviewConfiguration.WebViewConfiguration getWebviewConfiguration() {
            WebviewConfiguration.WebViewConfiguration webViewConfiguration = this.webviewConfiguration_;
            return webViewConfiguration == null ? WebviewConfiguration.WebViewConfiguration.getDefaultInstance() : webViewConfiguration;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setWebviewConfiguration(WebviewConfiguration.WebViewConfiguration webViewConfiguration) {
            webViewConfiguration.getClass();
            this.webviewConfiguration_ = webViewConfiguration;
            this.bitField0_ |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeWebviewConfiguration(WebviewConfiguration.WebViewConfiguration webViewConfiguration) {
            webViewConfiguration.getClass();
            WebviewConfiguration.WebViewConfiguration webViewConfiguration2 = this.webviewConfiguration_;
            if (webViewConfiguration2 != null && webViewConfiguration2 != WebviewConfiguration.WebViewConfiguration.getDefaultInstance()) {
                this.webviewConfiguration_ = WebviewConfiguration.WebViewConfiguration.newBuilder(this.webviewConfiguration_).mergeFrom((WebviewConfiguration.WebViewConfiguration.Builder) webViewConfiguration).buildPartial();
            } else {
                this.webviewConfiguration_ = webViewConfiguration;
            }
            this.bitField0_ |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearWebviewConfiguration() {
            this.webviewConfiguration_ = null;
            this.bitField0_ &= -2;
        }

        @Override // gateway.v1.AdPlayerConfigResponseOuterClass.AdPlayerConfigResponseOrBuilder
        public ByteString getAdDataRefreshToken() {
            return this.adDataRefreshToken_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAdDataRefreshToken(ByteString byteString) {
            byteString.getClass();
            this.adDataRefreshToken_ = byteString;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAdDataRefreshToken() {
            this.adDataRefreshToken_ = getDefaultInstance().getAdDataRefreshToken();
        }

        @Override // gateway.v1.AdPlayerConfigResponseOuterClass.AdPlayerConfigResponseOrBuilder
        public boolean hasError() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // gateway.v1.AdPlayerConfigResponseOuterClass.AdPlayerConfigResponseOrBuilder
        public ErrorOuterClass.Error getError() {
            ErrorOuterClass.Error error = this.error_;
            return error == null ? ErrorOuterClass.Error.getDefaultInstance() : error;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setError(ErrorOuterClass.Error error) {
            error.getClass();
            this.error_ = error;
            this.bitField0_ |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeError(ErrorOuterClass.Error error) {
            error.getClass();
            ErrorOuterClass.Error error2 = this.error_;
            if (error2 != null && error2 != ErrorOuterClass.Error.getDefaultInstance()) {
                this.error_ = ErrorOuterClass.Error.newBuilder(this.error_).mergeFrom((ErrorOuterClass.Error.Builder) error).buildPartial();
            } else {
                this.error_ = error;
            }
            this.bitField0_ |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearError() {
            this.error_ = null;
            this.bitField0_ &= -3;
        }

        public static AdPlayerConfigResponse parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (AdPlayerConfigResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static AdPlayerConfigResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (AdPlayerConfigResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static AdPlayerConfigResponse parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (AdPlayerConfigResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static AdPlayerConfigResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (AdPlayerConfigResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static AdPlayerConfigResponse parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (AdPlayerConfigResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static AdPlayerConfigResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (AdPlayerConfigResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static AdPlayerConfigResponse parseFrom(InputStream inputStream) throws IOException {
            return (AdPlayerConfigResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static AdPlayerConfigResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (AdPlayerConfigResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static AdPlayerConfigResponse parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (AdPlayerConfigResponse) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static AdPlayerConfigResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (AdPlayerConfigResponse) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static AdPlayerConfigResponse parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (AdPlayerConfigResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static AdPlayerConfigResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (AdPlayerConfigResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(AdPlayerConfigResponse adPlayerConfigResponse) {
            return DEFAULT_INSTANCE.createBuilder(adPlayerConfigResponse);
        }

        public static final class Builder extends GeneratedMessageLite.Builder<AdPlayerConfigResponse, Builder> implements AdPlayerConfigResponseOrBuilder {
            /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            private Builder() {
                super(AdPlayerConfigResponse.DEFAULT_INSTANCE);
            }

            @Override // gateway.v1.AdPlayerConfigResponseOuterClass.AdPlayerConfigResponseOrBuilder
            public ByteString getTrackingToken() {
                return ((AdPlayerConfigResponse) this.instance).getTrackingToken();
            }

            public Builder setTrackingToken(ByteString byteString) {
                copyOnWrite();
                ((AdPlayerConfigResponse) this.instance).setTrackingToken(byteString);
                return this;
            }

            public Builder clearTrackingToken() {
                copyOnWrite();
                ((AdPlayerConfigResponse) this.instance).clearTrackingToken();
                return this;
            }

            @Override // gateway.v1.AdPlayerConfigResponseOuterClass.AdPlayerConfigResponseOrBuilder
            public ByteString getImpressionConfiguration() {
                return ((AdPlayerConfigResponse) this.instance).getImpressionConfiguration();
            }

            public Builder setImpressionConfiguration(ByteString byteString) {
                copyOnWrite();
                ((AdPlayerConfigResponse) this.instance).setImpressionConfiguration(byteString);
                return this;
            }

            public Builder clearImpressionConfiguration() {
                copyOnWrite();
                ((AdPlayerConfigResponse) this.instance).clearImpressionConfiguration();
                return this;
            }

            @Override // gateway.v1.AdPlayerConfigResponseOuterClass.AdPlayerConfigResponseOrBuilder
            public int getImpressionConfigurationVersion() {
                return ((AdPlayerConfigResponse) this.instance).getImpressionConfigurationVersion();
            }

            public Builder setImpressionConfigurationVersion(int i) {
                copyOnWrite();
                ((AdPlayerConfigResponse) this.instance).setImpressionConfigurationVersion(i);
                return this;
            }

            public Builder clearImpressionConfigurationVersion() {
                copyOnWrite();
                ((AdPlayerConfigResponse) this.instance).clearImpressionConfigurationVersion();
                return this;
            }

            @Override // gateway.v1.AdPlayerConfigResponseOuterClass.AdPlayerConfigResponseOrBuilder
            public boolean hasWebviewConfiguration() {
                return ((AdPlayerConfigResponse) this.instance).hasWebviewConfiguration();
            }

            @Override // gateway.v1.AdPlayerConfigResponseOuterClass.AdPlayerConfigResponseOrBuilder
            public WebviewConfiguration.WebViewConfiguration getWebviewConfiguration() {
                return ((AdPlayerConfigResponse) this.instance).getWebviewConfiguration();
            }

            public Builder setWebviewConfiguration(WebviewConfiguration.WebViewConfiguration webViewConfiguration) {
                copyOnWrite();
                ((AdPlayerConfigResponse) this.instance).setWebviewConfiguration(webViewConfiguration);
                return this;
            }

            public Builder setWebviewConfiguration(WebviewConfiguration.WebViewConfiguration.Builder builder) {
                copyOnWrite();
                ((AdPlayerConfigResponse) this.instance).setWebviewConfiguration(builder.build());
                return this;
            }

            public Builder mergeWebviewConfiguration(WebviewConfiguration.WebViewConfiguration webViewConfiguration) {
                copyOnWrite();
                ((AdPlayerConfigResponse) this.instance).mergeWebviewConfiguration(webViewConfiguration);
                return this;
            }

            public Builder clearWebviewConfiguration() {
                copyOnWrite();
                ((AdPlayerConfigResponse) this.instance).clearWebviewConfiguration();
                return this;
            }

            @Override // gateway.v1.AdPlayerConfigResponseOuterClass.AdPlayerConfigResponseOrBuilder
            public ByteString getAdDataRefreshToken() {
                return ((AdPlayerConfigResponse) this.instance).getAdDataRefreshToken();
            }

            public Builder setAdDataRefreshToken(ByteString byteString) {
                copyOnWrite();
                ((AdPlayerConfigResponse) this.instance).setAdDataRefreshToken(byteString);
                return this;
            }

            public Builder clearAdDataRefreshToken() {
                copyOnWrite();
                ((AdPlayerConfigResponse) this.instance).clearAdDataRefreshToken();
                return this;
            }

            @Override // gateway.v1.AdPlayerConfigResponseOuterClass.AdPlayerConfigResponseOrBuilder
            public boolean hasError() {
                return ((AdPlayerConfigResponse) this.instance).hasError();
            }

            @Override // gateway.v1.AdPlayerConfigResponseOuterClass.AdPlayerConfigResponseOrBuilder
            public ErrorOuterClass.Error getError() {
                return ((AdPlayerConfigResponse) this.instance).getError();
            }

            public Builder setError(ErrorOuterClass.Error error) {
                copyOnWrite();
                ((AdPlayerConfigResponse) this.instance).setError(error);
                return this;
            }

            public Builder setError(ErrorOuterClass.Error.Builder builder) {
                copyOnWrite();
                ((AdPlayerConfigResponse) this.instance).setError(builder.build());
                return this;
            }

            public Builder mergeError(ErrorOuterClass.Error error) {
                copyOnWrite();
                ((AdPlayerConfigResponse) this.instance).mergeError(error);
                return this;
            }

            public Builder clearError() {
                copyOnWrite();
                ((AdPlayerConfigResponse) this.instance).clearError();
                return this;
            }
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new AdPlayerConfigResponse();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001\n\u0002\n\u0003\u0004\u0004ဉ\u0000\u0005\n\u0006ဉ\u0001", new Object[]{"bitField0_", "trackingToken_", "impressionConfiguration_", "impressionConfigurationVersion_", "webviewConfiguration_", "adDataRefreshToken_", "error_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<AdPlayerConfigResponse> defaultInstanceBasedParser = PARSER;
                    if (defaultInstanceBasedParser == null) {
                        synchronized (AdPlayerConfigResponse.class) {
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
            AdPlayerConfigResponse adPlayerConfigResponse = new AdPlayerConfigResponse();
            DEFAULT_INSTANCE = adPlayerConfigResponse;
            GeneratedMessageLite.registerDefaultInstance(AdPlayerConfigResponse.class, adPlayerConfigResponse);
        }

        public static AdPlayerConfigResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<AdPlayerConfigResponse> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }

    /* renamed from: gateway.v1.AdPlayerConfigResponseOuterClass$1, reason: invalid class name */
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
