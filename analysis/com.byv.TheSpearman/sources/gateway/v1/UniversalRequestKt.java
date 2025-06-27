package gateway.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.Timestamp;
import gateway.v1.AdDataRefreshRequestOuterClass;
import gateway.v1.AdPlayerConfigRequestOuterClass;
import gateway.v1.AdRequestOuterClass;
import gateway.v1.DeveloperConsentOuterClass;
import gateway.v1.DiagnosticEventRequestOuterClass;
import gateway.v1.GetTokenEventRequestOuterClass;
import gateway.v1.InitializationCompletedEventRequestOuterClass;
import gateway.v1.InitializationRequestOuterClass;
import gateway.v1.OperativeEventRequestOuterClass;
import gateway.v1.PiiOuterClass;
import gateway.v1.PrivacyUpdateRequestOuterClass;
import gateway.v1.TestDataOuterClass;
import gateway.v1.TimestampsOuterClass;
import gateway.v1.TransactionEventRequestOuterClass;
import gateway.v1.UniversalRequestOuterClass;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: UniversalRequestKt.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001:\u0003\u000f\u0010\u0011B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J*\u0010\u0003\u001a\u00020\u00042\u0017\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0002\b\tH\u0087\bø\u0001\u0000¢\u0006\u0002\b\nJ*\u0010\u000b\u001a\u00020\f2\u0017\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0002\b\tH\u0087\bø\u0001\u0000¢\u0006\u0002\b\u000e\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0012"}, d2 = {"Lgateway/v1/UniversalRequestKt;", "", "()V", "payload", "Lgateway/v1/UniversalRequestOuterClass$UniversalRequest$Payload;", "block", "Lkotlin/Function1;", "Lgateway/v1/UniversalRequestKt$PayloadKt$Dsl;", "", "Lkotlin/ExtensionFunctionType;", "-initializepayload", "sharedData", "Lgateway/v1/UniversalRequestOuterClass$UniversalRequest$SharedData;", "Lgateway/v1/UniversalRequestKt$SharedDataKt$Dsl;", "-initializesharedData", "Dsl", "PayloadKt", "SharedDataKt", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class UniversalRequestKt {
    public static final UniversalRequestKt INSTANCE = new UniversalRequestKt();

    /* compiled from: UniversalRequestKt.kt */
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0007\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0012\u001a\u00020\u0013H\u0001J\u0006\u0010\u0014\u001a\u00020\u0015J\u0006\u0010\u0016\u001a\u00020\u0015J\u0006\u0010\u0017\u001a\u00020\u0018J\u0006\u0010\u0019\u001a\u00020\u0018R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR$\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\f8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u001b"}, d2 = {"Lgateway/v1/UniversalRequestKt$Dsl;", "", "_builder", "Lgateway/v1/UniversalRequestOuterClass$UniversalRequest$Builder;", "(Lgateway/v1/UniversalRequestOuterClass$UniversalRequest$Builder;)V", "value", "Lgateway/v1/UniversalRequestOuterClass$UniversalRequest$Payload;", "payload", "getPayload", "()Lgateway/v1/UniversalRequestOuterClass$UniversalRequest$Payload;", "setPayload", "(Lgateway/v1/UniversalRequestOuterClass$UniversalRequest$Payload;)V", "Lgateway/v1/UniversalRequestOuterClass$UniversalRequest$SharedData;", "sharedData", "getSharedData", "()Lgateway/v1/UniversalRequestOuterClass$UniversalRequest$SharedData;", "setSharedData", "(Lgateway/v1/UniversalRequestOuterClass$UniversalRequest$SharedData;)V", "_build", "Lgateway/v1/UniversalRequestOuterClass$UniversalRequest;", "clearPayload", "", "clearSharedData", "hasPayload", "", "hasSharedData", "Companion", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Dsl {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final UniversalRequestOuterClass.UniversalRequest.Builder _builder;

        public /* synthetic */ Dsl(UniversalRequestOuterClass.UniversalRequest.Builder builder, DefaultConstructorMarker defaultConstructorMarker) {
            this(builder);
        }

        private Dsl(UniversalRequestOuterClass.UniversalRequest.Builder builder) {
            this._builder = builder;
        }

        /* compiled from: UniversalRequestKt.kt */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0001¨\u0006\u0007"}, d2 = {"Lgateway/v1/UniversalRequestKt$Dsl$Companion;", "", "()V", "_create", "Lgateway/v1/UniversalRequestKt$Dsl;", "builder", "Lgateway/v1/UniversalRequestOuterClass$UniversalRequest$Builder;", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final /* synthetic */ Dsl _create(UniversalRequestOuterClass.UniversalRequest.Builder builder) {
                Intrinsics.checkNotNullParameter(builder, "builder");
                return new Dsl(builder, null);
            }
        }

        public final /* synthetic */ UniversalRequestOuterClass.UniversalRequest _build() {
            UniversalRequestOuterClass.UniversalRequest universalRequestBuild = this._builder.build();
            Intrinsics.checkNotNullExpressionValue(universalRequestBuild, "_builder.build()");
            return universalRequestBuild;
        }

        public final UniversalRequestOuterClass.UniversalRequest.SharedData getSharedData() {
            UniversalRequestOuterClass.UniversalRequest.SharedData sharedData = this._builder.getSharedData();
            Intrinsics.checkNotNullExpressionValue(sharedData, "_builder.getSharedData()");
            return sharedData;
        }

        public final void setSharedData(UniversalRequestOuterClass.UniversalRequest.SharedData value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setSharedData(value);
        }

        public final void clearSharedData() {
            this._builder.clearSharedData();
        }

        public final boolean hasSharedData() {
            return this._builder.hasSharedData();
        }

        public final UniversalRequestOuterClass.UniversalRequest.Payload getPayload() {
            UniversalRequestOuterClass.UniversalRequest.Payload payload = this._builder.getPayload();
            Intrinsics.checkNotNullExpressionValue(payload, "_builder.getPayload()");
            return payload;
        }

        public final void setPayload(UniversalRequestOuterClass.UniversalRequest.Payload value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setPayload(value);
        }

        public final void clearPayload() {
            this._builder.clearPayload();
        }

        public final boolean hasPayload() {
            return this._builder.hasPayload();
        }
    }

    private UniversalRequestKt() {
    }

    /* compiled from: UniversalRequestKt.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0003B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lgateway/v1/UniversalRequestKt$SharedDataKt;", "", "()V", "Dsl", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class SharedDataKt {
        public static final SharedDataKt INSTANCE = new SharedDataKt();

        /* compiled from: UniversalRequestKt.kt */
        @Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0007\u0018\u0000 `2\u00020\u0001:\u0001`B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010H\u001a\u00020IH\u0001J\u0006\u0010J\u001a\u00020KJ\u0006\u0010L\u001a\u00020KJ\u0006\u0010M\u001a\u00020KJ\u0006\u0010N\u001a\u00020KJ\u0006\u0010O\u001a\u00020KJ\u0006\u0010P\u001a\u00020KJ\u0006\u0010Q\u001a\u00020KJ\u0006\u0010R\u001a\u00020KJ\u0006\u0010S\u001a\u00020KJ\u0006\u0010T\u001a\u00020KJ\u0006\u0010U\u001a\u00020VJ\u0006\u0010W\u001a\u00020VJ\u0006\u0010X\u001a\u00020VJ\u0006\u0010Y\u001a\u00020VJ\u0006\u0010Z\u001a\u00020VJ\u0006\u0010[\u001a\u00020VJ\u0006\u0010\\\u001a\u00020VJ\u0006\u0010]\u001a\u00020VJ\u0006\u0010^\u001a\u00020VJ\u0006\u0010_\u001a\u00020VR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR$\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\f8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R$\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u00128G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R$\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0005\u001a\u00020\u00188G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR$\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0005\u001a\u00020\u001e8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R$\u0010$\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b%\u0010\t\"\u0004\b&\u0010\u000bR$\u0010'\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\f8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b(\u0010\u000f\"\u0004\b)\u0010\u0011R$\u0010+\u001a\u00020*2\u0006\u0010\u0005\u001a\u00020*8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R$\u00101\u001a\u0002002\u0006\u0010\u0005\u001a\u0002008G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b2\u00103\"\u0004\b4\u00105R$\u00107\u001a\u0002062\u0006\u0010\u0005\u001a\u0002068G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R\u0017\u0010<\u001a\u0004\u0018\u00010\u0012*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b=\u0010>R\u0017\u0010?\u001a\u0004\u0018\u00010\u0018*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b@\u0010AR\u0017\u0010B\u001a\u0004\u0018\u00010\u001e*\u00020\u00008F¢\u0006\u0006\u001a\u0004\bC\u0010DR\u0017\u0010E\u001a\u0004\u0018\u00010**\u00020\u00008F¢\u0006\u0006\u001a\u0004\bF\u0010G¨\u0006a"}, d2 = {"Lgateway/v1/UniversalRequestKt$SharedDataKt$Dsl;", "", "_builder", "Lgateway/v1/UniversalRequestOuterClass$UniversalRequest$SharedData$Builder;", "(Lgateway/v1/UniversalRequestOuterClass$UniversalRequest$SharedData$Builder;)V", "value", "Lcom/google/protobuf/Timestamp;", "appStartTime", "getAppStartTime", "()Lcom/google/protobuf/Timestamp;", "setAppStartTime", "(Lcom/google/protobuf/Timestamp;)V", "Lcom/google/protobuf/ByteString;", "currentState", "getCurrentState", "()Lcom/google/protobuf/ByteString;", "setCurrentState", "(Lcom/google/protobuf/ByteString;)V", "Lgateway/v1/DeveloperConsentOuterClass$DeveloperConsent;", "developerConsent", "getDeveloperConsent", "()Lgateway/v1/DeveloperConsentOuterClass$DeveloperConsent;", "setDeveloperConsent", "(Lgateway/v1/DeveloperConsentOuterClass$DeveloperConsent;)V", "Lgateway/v1/UniversalRequestOuterClass$LimitedSessionToken;", "limitedSessionToken", "getLimitedSessionToken", "()Lgateway/v1/UniversalRequestOuterClass$LimitedSessionToken;", "setLimitedSessionToken", "(Lgateway/v1/UniversalRequestOuterClass$LimitedSessionToken;)V", "Lgateway/v1/PiiOuterClass$Pii;", "pii", "getPii", "()Lgateway/v1/PiiOuterClass$Pii;", "setPii", "(Lgateway/v1/PiiOuterClass$Pii;)V", "sdkStartTime", "getSdkStartTime", "setSdkStartTime", "sessionToken", "getSessionToken", "setSessionToken", "Lgateway/v1/TestDataOuterClass$TestData;", "testData", "getTestData", "()Lgateway/v1/TestDataOuterClass$TestData;", "setTestData", "(Lgateway/v1/TestDataOuterClass$TestData;)V", "Lgateway/v1/TimestampsOuterClass$Timestamps;", "timestamps", "getTimestamps", "()Lgateway/v1/TimestampsOuterClass$Timestamps;", "setTimestamps", "(Lgateway/v1/TimestampsOuterClass$Timestamps;)V", "", "webviewVersion", "getWebviewVersion", "()I", "setWebviewVersion", "(I)V", "developerConsentOrNull", "getDeveloperConsentOrNull", "(Lgateway/v1/UniversalRequestKt$SharedDataKt$Dsl;)Lgateway/v1/DeveloperConsentOuterClass$DeveloperConsent;", "limitedSessionTokenOrNull", "getLimitedSessionTokenOrNull", "(Lgateway/v1/UniversalRequestKt$SharedDataKt$Dsl;)Lgateway/v1/UniversalRequestOuterClass$LimitedSessionToken;", "piiOrNull", "getPiiOrNull", "(Lgateway/v1/UniversalRequestKt$SharedDataKt$Dsl;)Lgateway/v1/PiiOuterClass$Pii;", "testDataOrNull", "getTestDataOrNull", "(Lgateway/v1/UniversalRequestKt$SharedDataKt$Dsl;)Lgateway/v1/TestDataOuterClass$TestData;", "_build", "Lgateway/v1/UniversalRequestOuterClass$UniversalRequest$SharedData;", "clearAppStartTime", "", "clearCurrentState", "clearDeveloperConsent", "clearLimitedSessionToken", "clearPii", "clearSdkStartTime", "clearSessionToken", "clearTestData", "clearTimestamps", "clearWebviewVersion", "hasAppStartTime", "", "hasCurrentState", "hasDeveloperConsent", "hasLimitedSessionToken", "hasPii", "hasSdkStartTime", "hasSessionToken", "hasTestData", "hasTimestamps", "hasWebviewVersion", "Companion", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Dsl {

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private final UniversalRequestOuterClass.UniversalRequest.SharedData.Builder _builder;

            public /* synthetic */ Dsl(UniversalRequestOuterClass.UniversalRequest.SharedData.Builder builder, DefaultConstructorMarker defaultConstructorMarker) {
                this(builder);
            }

            private Dsl(UniversalRequestOuterClass.UniversalRequest.SharedData.Builder builder) {
                this._builder = builder;
            }

            /* compiled from: UniversalRequestKt.kt */
            @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0001¨\u0006\u0007"}, d2 = {"Lgateway/v1/UniversalRequestKt$SharedDataKt$Dsl$Companion;", "", "()V", "_create", "Lgateway/v1/UniversalRequestKt$SharedDataKt$Dsl;", "builder", "Lgateway/v1/UniversalRequestOuterClass$UniversalRequest$SharedData$Builder;", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private Companion() {
                }

                public final /* synthetic */ Dsl _create(UniversalRequestOuterClass.UniversalRequest.SharedData.Builder builder) {
                    Intrinsics.checkNotNullParameter(builder, "builder");
                    return new Dsl(builder, null);
                }
            }

            public final /* synthetic */ UniversalRequestOuterClass.UniversalRequest.SharedData _build() {
                UniversalRequestOuterClass.UniversalRequest.SharedData sharedDataBuild = this._builder.build();
                Intrinsics.checkNotNullExpressionValue(sharedDataBuild, "_builder.build()");
                return sharedDataBuild;
            }

            public final ByteString getSessionToken() {
                ByteString sessionToken = this._builder.getSessionToken();
                Intrinsics.checkNotNullExpressionValue(sessionToken, "_builder.getSessionToken()");
                return sessionToken;
            }

            public final void setSessionToken(ByteString value) {
                Intrinsics.checkNotNullParameter(value, "value");
                this._builder.setSessionToken(value);
            }

            public final void clearSessionToken() {
                this._builder.clearSessionToken();
            }

            public final boolean hasSessionToken() {
                return this._builder.hasSessionToken();
            }

            public final TimestampsOuterClass.Timestamps getTimestamps() {
                TimestampsOuterClass.Timestamps timestamps = this._builder.getTimestamps();
                Intrinsics.checkNotNullExpressionValue(timestamps, "_builder.getTimestamps()");
                return timestamps;
            }

            public final void setTimestamps(TimestampsOuterClass.Timestamps value) {
                Intrinsics.checkNotNullParameter(value, "value");
                this._builder.setTimestamps(value);
            }

            public final void clearTimestamps() {
                this._builder.clearTimestamps();
            }

            public final boolean hasTimestamps() {
                return this._builder.hasTimestamps();
            }

            public final PiiOuterClass.Pii getPii() {
                PiiOuterClass.Pii pii = this._builder.getPii();
                Intrinsics.checkNotNullExpressionValue(pii, "_builder.getPii()");
                return pii;
            }

            public final void setPii(PiiOuterClass.Pii value) {
                Intrinsics.checkNotNullParameter(value, "value");
                this._builder.setPii(value);
            }

            public final void clearPii() {
                this._builder.clearPii();
            }

            public final boolean hasPii() {
                return this._builder.hasPii();
            }

            public final PiiOuterClass.Pii getPiiOrNull(Dsl dsl) {
                Intrinsics.checkNotNullParameter(dsl, "<this>");
                return UniversalRequestKtKt.getPiiOrNull(dsl._builder);
            }

            public final DeveloperConsentOuterClass.DeveloperConsent getDeveloperConsent() {
                DeveloperConsentOuterClass.DeveloperConsent developerConsent = this._builder.getDeveloperConsent();
                Intrinsics.checkNotNullExpressionValue(developerConsent, "_builder.getDeveloperConsent()");
                return developerConsent;
            }

            public final void setDeveloperConsent(DeveloperConsentOuterClass.DeveloperConsent value) {
                Intrinsics.checkNotNullParameter(value, "value");
                this._builder.setDeveloperConsent(value);
            }

            public final void clearDeveloperConsent() {
                this._builder.clearDeveloperConsent();
            }

            public final boolean hasDeveloperConsent() {
                return this._builder.hasDeveloperConsent();
            }

            public final DeveloperConsentOuterClass.DeveloperConsent getDeveloperConsentOrNull(Dsl dsl) {
                Intrinsics.checkNotNullParameter(dsl, "<this>");
                return UniversalRequestKtKt.getDeveloperConsentOrNull(dsl._builder);
            }

            public final int getWebviewVersion() {
                return this._builder.getWebviewVersion();
            }

            public final void setWebviewVersion(int i) {
                this._builder.setWebviewVersion(i);
            }

            public final void clearWebviewVersion() {
                this._builder.clearWebviewVersion();
            }

            public final boolean hasWebviewVersion() {
                return this._builder.hasWebviewVersion();
            }

            public final ByteString getCurrentState() {
                ByteString currentState = this._builder.getCurrentState();
                Intrinsics.checkNotNullExpressionValue(currentState, "_builder.getCurrentState()");
                return currentState;
            }

            public final void setCurrentState(ByteString value) {
                Intrinsics.checkNotNullParameter(value, "value");
                this._builder.setCurrentState(value);
            }

            public final void clearCurrentState() {
                this._builder.clearCurrentState();
            }

            public final boolean hasCurrentState() {
                return this._builder.hasCurrentState();
            }

            public final TestDataOuterClass.TestData getTestData() {
                TestDataOuterClass.TestData testData = this._builder.getTestData();
                Intrinsics.checkNotNullExpressionValue(testData, "_builder.getTestData()");
                return testData;
            }

            public final void setTestData(TestDataOuterClass.TestData value) {
                Intrinsics.checkNotNullParameter(value, "value");
                this._builder.setTestData(value);
            }

            public final void clearTestData() {
                this._builder.clearTestData();
            }

            public final boolean hasTestData() {
                return this._builder.hasTestData();
            }

            public final TestDataOuterClass.TestData getTestDataOrNull(Dsl dsl) {
                Intrinsics.checkNotNullParameter(dsl, "<this>");
                return UniversalRequestKtKt.getTestDataOrNull(dsl._builder);
            }

            public final Timestamp getAppStartTime() {
                Timestamp appStartTime = this._builder.getAppStartTime();
                Intrinsics.checkNotNullExpressionValue(appStartTime, "_builder.getAppStartTime()");
                return appStartTime;
            }

            public final void setAppStartTime(Timestamp value) {
                Intrinsics.checkNotNullParameter(value, "value");
                this._builder.setAppStartTime(value);
            }

            public final void clearAppStartTime() {
                this._builder.clearAppStartTime();
            }

            public final boolean hasAppStartTime() {
                return this._builder.hasAppStartTime();
            }

            public final Timestamp getSdkStartTime() {
                Timestamp sdkStartTime = this._builder.getSdkStartTime();
                Intrinsics.checkNotNullExpressionValue(sdkStartTime, "_builder.getSdkStartTime()");
                return sdkStartTime;
            }

            public final void setSdkStartTime(Timestamp value) {
                Intrinsics.checkNotNullParameter(value, "value");
                this._builder.setSdkStartTime(value);
            }

            public final void clearSdkStartTime() {
                this._builder.clearSdkStartTime();
            }

            public final boolean hasSdkStartTime() {
                return this._builder.hasSdkStartTime();
            }

            public final UniversalRequestOuterClass.LimitedSessionToken getLimitedSessionToken() {
                UniversalRequestOuterClass.LimitedSessionToken limitedSessionToken = this._builder.getLimitedSessionToken();
                Intrinsics.checkNotNullExpressionValue(limitedSessionToken, "_builder.getLimitedSessionToken()");
                return limitedSessionToken;
            }

            public final void setLimitedSessionToken(UniversalRequestOuterClass.LimitedSessionToken value) {
                Intrinsics.checkNotNullParameter(value, "value");
                this._builder.setLimitedSessionToken(value);
            }

            public final void clearLimitedSessionToken() {
                this._builder.clearLimitedSessionToken();
            }

            public final boolean hasLimitedSessionToken() {
                return this._builder.hasLimitedSessionToken();
            }

            public final UniversalRequestOuterClass.LimitedSessionToken getLimitedSessionTokenOrNull(Dsl dsl) {
                Intrinsics.checkNotNullParameter(dsl, "<this>");
                return UniversalRequestKtKt.getLimitedSessionTokenOrNull(dsl._builder);
            }
        }

        private SharedDataKt() {
        }
    }

    /* renamed from: -initializesharedData, reason: not valid java name */
    public final UniversalRequestOuterClass.UniversalRequest.SharedData m1052initializesharedData(Function1<? super SharedDataKt.Dsl, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        SharedDataKt.Dsl.Companion companion = SharedDataKt.Dsl.INSTANCE;
        UniversalRequestOuterClass.UniversalRequest.SharedData.Builder builderNewBuilder = UniversalRequestOuterClass.UniversalRequest.SharedData.newBuilder();
        Intrinsics.checkNotNullExpressionValue(builderNewBuilder, "newBuilder()");
        SharedDataKt.Dsl dsl_create = companion._create(builderNewBuilder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }

    /* compiled from: UniversalRequestKt.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0003B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lgateway/v1/UniversalRequestKt$PayloadKt;", "", "()V", "Dsl", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class PayloadKt {
        public static final PayloadKt INSTANCE = new PayloadKt();

        /* compiled from: UniversalRequestKt.kt */
        @Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0007\u0018\u0000 _2\u00020\u0001:\u0001_B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010F\u001a\u00020GH\u0001J\u0006\u0010H\u001a\u00020IJ\u0006\u0010J\u001a\u00020IJ\u0006\u0010K\u001a\u00020IJ\u0006\u0010L\u001a\u00020IJ\u0006\u0010M\u001a\u00020IJ\u0006\u0010N\u001a\u00020IJ\u0006\u0010O\u001a\u00020IJ\u0006\u0010P\u001a\u00020IJ\u0006\u0010Q\u001a\u00020IJ\u0006\u0010R\u001a\u00020IJ\u0006\u0010S\u001a\u00020IJ\u0006\u0010T\u001a\u00020UJ\u0006\u0010V\u001a\u00020UJ\u0006\u0010W\u001a\u00020UJ\u0006\u0010X\u001a\u00020UJ\u0006\u0010Y\u001a\u00020UJ\u0006\u0010Z\u001a\u00020UJ\u0006\u0010[\u001a\u00020UJ\u0006\u0010\\\u001a\u00020UJ\u0006\u0010]\u001a\u00020UJ\u0006\u0010^\u001a\u00020UR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR$\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\f8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R$\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u00128G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R$\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0005\u001a\u00020\u00188G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR$\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0005\u001a\u00020\u001e8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R$\u0010%\u001a\u00020$2\u0006\u0010\u0005\u001a\u00020$8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R$\u0010+\u001a\u00020*2\u0006\u0010\u0005\u001a\u00020*8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R$\u00101\u001a\u0002002\u0006\u0010\u0005\u001a\u0002008G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b2\u00103\"\u0004\b4\u00105R$\u00107\u001a\u0002062\u0006\u0010\u0005\u001a\u0002068G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R$\u0010=\u001a\u00020<2\u0006\u0010\u0005\u001a\u00020<8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR\u0011\u0010B\u001a\u00020C8G¢\u0006\u0006\u001a\u0004\bD\u0010E¨\u0006`"}, d2 = {"Lgateway/v1/UniversalRequestKt$PayloadKt$Dsl;", "", "_builder", "Lgateway/v1/UniversalRequestOuterClass$UniversalRequest$Payload$Builder;", "(Lgateway/v1/UniversalRequestOuterClass$UniversalRequest$Payload$Builder;)V", "value", "Lgateway/v1/AdDataRefreshRequestOuterClass$AdDataRefreshRequest;", "adDataRefreshRequest", "getAdDataRefreshRequest", "()Lgateway/v1/AdDataRefreshRequestOuterClass$AdDataRefreshRequest;", "setAdDataRefreshRequest", "(Lgateway/v1/AdDataRefreshRequestOuterClass$AdDataRefreshRequest;)V", "Lgateway/v1/AdPlayerConfigRequestOuterClass$AdPlayerConfigRequest;", "adPlayerConfigRequest", "getAdPlayerConfigRequest", "()Lgateway/v1/AdPlayerConfigRequestOuterClass$AdPlayerConfigRequest;", "setAdPlayerConfigRequest", "(Lgateway/v1/AdPlayerConfigRequestOuterClass$AdPlayerConfigRequest;)V", "Lgateway/v1/AdRequestOuterClass$AdRequest;", "adRequest", "getAdRequest", "()Lgateway/v1/AdRequestOuterClass$AdRequest;", "setAdRequest", "(Lgateway/v1/AdRequestOuterClass$AdRequest;)V", "Lgateway/v1/DiagnosticEventRequestOuterClass$DiagnosticEventRequest;", "diagnosticEventRequest", "getDiagnosticEventRequest", "()Lgateway/v1/DiagnosticEventRequestOuterClass$DiagnosticEventRequest;", "setDiagnosticEventRequest", "(Lgateway/v1/DiagnosticEventRequestOuterClass$DiagnosticEventRequest;)V", "Lgateway/v1/GetTokenEventRequestOuterClass$GetTokenEventRequest;", "getTokenEventRequest", "getGetTokenEventRequest", "()Lgateway/v1/GetTokenEventRequestOuterClass$GetTokenEventRequest;", "setGetTokenEventRequest", "(Lgateway/v1/GetTokenEventRequestOuterClass$GetTokenEventRequest;)V", "Lgateway/v1/InitializationCompletedEventRequestOuterClass$InitializationCompletedEventRequest;", "initializationCompletedEventRequest", "getInitializationCompletedEventRequest", "()Lgateway/v1/InitializationCompletedEventRequestOuterClass$InitializationCompletedEventRequest;", "setInitializationCompletedEventRequest", "(Lgateway/v1/InitializationCompletedEventRequestOuterClass$InitializationCompletedEventRequest;)V", "Lgateway/v1/InitializationRequestOuterClass$InitializationRequest;", "initializationRequest", "getInitializationRequest", "()Lgateway/v1/InitializationRequestOuterClass$InitializationRequest;", "setInitializationRequest", "(Lgateway/v1/InitializationRequestOuterClass$InitializationRequest;)V", "Lgateway/v1/OperativeEventRequestOuterClass$OperativeEventRequest;", "operativeEvent", "getOperativeEvent", "()Lgateway/v1/OperativeEventRequestOuterClass$OperativeEventRequest;", "setOperativeEvent", "(Lgateway/v1/OperativeEventRequestOuterClass$OperativeEventRequest;)V", "Lgateway/v1/PrivacyUpdateRequestOuterClass$PrivacyUpdateRequest;", "privacyUpdateRequest", "getPrivacyUpdateRequest", "()Lgateway/v1/PrivacyUpdateRequestOuterClass$PrivacyUpdateRequest;", "setPrivacyUpdateRequest", "(Lgateway/v1/PrivacyUpdateRequestOuterClass$PrivacyUpdateRequest;)V", "Lgateway/v1/TransactionEventRequestOuterClass$TransactionEventRequest;", "transactionEventRequest", "getTransactionEventRequest", "()Lgateway/v1/TransactionEventRequestOuterClass$TransactionEventRequest;", "setTransactionEventRequest", "(Lgateway/v1/TransactionEventRequestOuterClass$TransactionEventRequest;)V", "valueCase", "Lgateway/v1/UniversalRequestOuterClass$UniversalRequest$Payload$ValueCase;", "getValueCase", "()Lgateway/v1/UniversalRequestOuterClass$UniversalRequest$Payload$ValueCase;", "_build", "Lgateway/v1/UniversalRequestOuterClass$UniversalRequest$Payload;", "clearAdDataRefreshRequest", "", "clearAdPlayerConfigRequest", "clearAdRequest", "clearDiagnosticEventRequest", "clearGetTokenEventRequest", "clearInitializationCompletedEventRequest", "clearInitializationRequest", "clearOperativeEvent", "clearPrivacyUpdateRequest", "clearTransactionEventRequest", "clearValue", "hasAdDataRefreshRequest", "", "hasAdPlayerConfigRequest", "hasAdRequest", "hasDiagnosticEventRequest", "hasGetTokenEventRequest", "hasInitializationCompletedEventRequest", "hasInitializationRequest", "hasOperativeEvent", "hasPrivacyUpdateRequest", "hasTransactionEventRequest", "Companion", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Dsl {

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private final UniversalRequestOuterClass.UniversalRequest.Payload.Builder _builder;

            public /* synthetic */ Dsl(UniversalRequestOuterClass.UniversalRequest.Payload.Builder builder, DefaultConstructorMarker defaultConstructorMarker) {
                this(builder);
            }

            private Dsl(UniversalRequestOuterClass.UniversalRequest.Payload.Builder builder) {
                this._builder = builder;
            }

            /* compiled from: UniversalRequestKt.kt */
            @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0001¨\u0006\u0007"}, d2 = {"Lgateway/v1/UniversalRequestKt$PayloadKt$Dsl$Companion;", "", "()V", "_create", "Lgateway/v1/UniversalRequestKt$PayloadKt$Dsl;", "builder", "Lgateway/v1/UniversalRequestOuterClass$UniversalRequest$Payload$Builder;", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private Companion() {
                }

                public final /* synthetic */ Dsl _create(UniversalRequestOuterClass.UniversalRequest.Payload.Builder builder) {
                    Intrinsics.checkNotNullParameter(builder, "builder");
                    return new Dsl(builder, null);
                }
            }

            public final /* synthetic */ UniversalRequestOuterClass.UniversalRequest.Payload _build() {
                UniversalRequestOuterClass.UniversalRequest.Payload payloadBuild = this._builder.build();
                Intrinsics.checkNotNullExpressionValue(payloadBuild, "_builder.build()");
                return payloadBuild;
            }

            public final InitializationRequestOuterClass.InitializationRequest getInitializationRequest() {
                InitializationRequestOuterClass.InitializationRequest initializationRequest = this._builder.getInitializationRequest();
                Intrinsics.checkNotNullExpressionValue(initializationRequest, "_builder.getInitializationRequest()");
                return initializationRequest;
            }

            public final void setInitializationRequest(InitializationRequestOuterClass.InitializationRequest value) {
                Intrinsics.checkNotNullParameter(value, "value");
                this._builder.setInitializationRequest(value);
            }

            public final void clearInitializationRequest() {
                this._builder.clearInitializationRequest();
            }

            public final boolean hasInitializationRequest() {
                return this._builder.hasInitializationRequest();
            }

            public final AdRequestOuterClass.AdRequest getAdRequest() {
                AdRequestOuterClass.AdRequest adRequest = this._builder.getAdRequest();
                Intrinsics.checkNotNullExpressionValue(adRequest, "_builder.getAdRequest()");
                return adRequest;
            }

            public final void setAdRequest(AdRequestOuterClass.AdRequest value) {
                Intrinsics.checkNotNullParameter(value, "value");
                this._builder.setAdRequest(value);
            }

            public final void clearAdRequest() {
                this._builder.clearAdRequest();
            }

            public final boolean hasAdRequest() {
                return this._builder.hasAdRequest();
            }

            public final OperativeEventRequestOuterClass.OperativeEventRequest getOperativeEvent() {
                OperativeEventRequestOuterClass.OperativeEventRequest operativeEvent = this._builder.getOperativeEvent();
                Intrinsics.checkNotNullExpressionValue(operativeEvent, "_builder.getOperativeEvent()");
                return operativeEvent;
            }

            public final void setOperativeEvent(OperativeEventRequestOuterClass.OperativeEventRequest value) {
                Intrinsics.checkNotNullParameter(value, "value");
                this._builder.setOperativeEvent(value);
            }

            public final void clearOperativeEvent() {
                this._builder.clearOperativeEvent();
            }

            public final boolean hasOperativeEvent() {
                return this._builder.hasOperativeEvent();
            }

            public final DiagnosticEventRequestOuterClass.DiagnosticEventRequest getDiagnosticEventRequest() {
                DiagnosticEventRequestOuterClass.DiagnosticEventRequest diagnosticEventRequest = this._builder.getDiagnosticEventRequest();
                Intrinsics.checkNotNullExpressionValue(diagnosticEventRequest, "_builder.getDiagnosticEventRequest()");
                return diagnosticEventRequest;
            }

            public final void setDiagnosticEventRequest(DiagnosticEventRequestOuterClass.DiagnosticEventRequest value) {
                Intrinsics.checkNotNullParameter(value, "value");
                this._builder.setDiagnosticEventRequest(value);
            }

            public final void clearDiagnosticEventRequest() {
                this._builder.clearDiagnosticEventRequest();
            }

            public final boolean hasDiagnosticEventRequest() {
                return this._builder.hasDiagnosticEventRequest();
            }

            public final AdPlayerConfigRequestOuterClass.AdPlayerConfigRequest getAdPlayerConfigRequest() {
                AdPlayerConfigRequestOuterClass.AdPlayerConfigRequest adPlayerConfigRequest = this._builder.getAdPlayerConfigRequest();
                Intrinsics.checkNotNullExpressionValue(adPlayerConfigRequest, "_builder.getAdPlayerConfigRequest()");
                return adPlayerConfigRequest;
            }

            public final void setAdPlayerConfigRequest(AdPlayerConfigRequestOuterClass.AdPlayerConfigRequest value) {
                Intrinsics.checkNotNullParameter(value, "value");
                this._builder.setAdPlayerConfigRequest(value);
            }

            public final void clearAdPlayerConfigRequest() {
                this._builder.clearAdPlayerConfigRequest();
            }

            public final boolean hasAdPlayerConfigRequest() {
                return this._builder.hasAdPlayerConfigRequest();
            }

            public final GetTokenEventRequestOuterClass.GetTokenEventRequest getGetTokenEventRequest() {
                GetTokenEventRequestOuterClass.GetTokenEventRequest getTokenEventRequest = this._builder.getGetTokenEventRequest();
                Intrinsics.checkNotNullExpressionValue(getTokenEventRequest, "_builder.getGetTokenEventRequest()");
                return getTokenEventRequest;
            }

            public final void setGetTokenEventRequest(GetTokenEventRequestOuterClass.GetTokenEventRequest value) {
                Intrinsics.checkNotNullParameter(value, "value");
                this._builder.setGetTokenEventRequest(value);
            }

            public final void clearGetTokenEventRequest() {
                this._builder.clearGetTokenEventRequest();
            }

            public final boolean hasGetTokenEventRequest() {
                return this._builder.hasGetTokenEventRequest();
            }

            public final PrivacyUpdateRequestOuterClass.PrivacyUpdateRequest getPrivacyUpdateRequest() {
                PrivacyUpdateRequestOuterClass.PrivacyUpdateRequest privacyUpdateRequest = this._builder.getPrivacyUpdateRequest();
                Intrinsics.checkNotNullExpressionValue(privacyUpdateRequest, "_builder.getPrivacyUpdateRequest()");
                return privacyUpdateRequest;
            }

            public final void setPrivacyUpdateRequest(PrivacyUpdateRequestOuterClass.PrivacyUpdateRequest value) {
                Intrinsics.checkNotNullParameter(value, "value");
                this._builder.setPrivacyUpdateRequest(value);
            }

            public final void clearPrivacyUpdateRequest() {
                this._builder.clearPrivacyUpdateRequest();
            }

            public final boolean hasPrivacyUpdateRequest() {
                return this._builder.hasPrivacyUpdateRequest();
            }

            public final AdDataRefreshRequestOuterClass.AdDataRefreshRequest getAdDataRefreshRequest() {
                AdDataRefreshRequestOuterClass.AdDataRefreshRequest adDataRefreshRequest = this._builder.getAdDataRefreshRequest();
                Intrinsics.checkNotNullExpressionValue(adDataRefreshRequest, "_builder.getAdDataRefreshRequest()");
                return adDataRefreshRequest;
            }

            public final void setAdDataRefreshRequest(AdDataRefreshRequestOuterClass.AdDataRefreshRequest value) {
                Intrinsics.checkNotNullParameter(value, "value");
                this._builder.setAdDataRefreshRequest(value);
            }

            public final void clearAdDataRefreshRequest() {
                this._builder.clearAdDataRefreshRequest();
            }

            public final boolean hasAdDataRefreshRequest() {
                return this._builder.hasAdDataRefreshRequest();
            }

            public final InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequest getInitializationCompletedEventRequest() {
                InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequest initializationCompletedEventRequest = this._builder.getInitializationCompletedEventRequest();
                Intrinsics.checkNotNullExpressionValue(initializationCompletedEventRequest, "_builder.getInitializationCompletedEventRequest()");
                return initializationCompletedEventRequest;
            }

            public final void setInitializationCompletedEventRequest(InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequest value) {
                Intrinsics.checkNotNullParameter(value, "value");
                this._builder.setInitializationCompletedEventRequest(value);
            }

            public final void clearInitializationCompletedEventRequest() {
                this._builder.clearInitializationCompletedEventRequest();
            }

            public final boolean hasInitializationCompletedEventRequest() {
                return this._builder.hasInitializationCompletedEventRequest();
            }

            public final TransactionEventRequestOuterClass.TransactionEventRequest getTransactionEventRequest() {
                TransactionEventRequestOuterClass.TransactionEventRequest transactionEventRequest = this._builder.getTransactionEventRequest();
                Intrinsics.checkNotNullExpressionValue(transactionEventRequest, "_builder.getTransactionEventRequest()");
                return transactionEventRequest;
            }

            public final void setTransactionEventRequest(TransactionEventRequestOuterClass.TransactionEventRequest value) {
                Intrinsics.checkNotNullParameter(value, "value");
                this._builder.setTransactionEventRequest(value);
            }

            public final void clearTransactionEventRequest() {
                this._builder.clearTransactionEventRequest();
            }

            public final boolean hasTransactionEventRequest() {
                return this._builder.hasTransactionEventRequest();
            }

            public final UniversalRequestOuterClass.UniversalRequest.Payload.ValueCase getValueCase() {
                UniversalRequestOuterClass.UniversalRequest.Payload.ValueCase valueCase = this._builder.getValueCase();
                Intrinsics.checkNotNullExpressionValue(valueCase, "_builder.getValueCase()");
                return valueCase;
            }

            public final void clearValue() {
                this._builder.clearValue();
            }
        }

        private PayloadKt() {
        }
    }

    /* renamed from: -initializepayload, reason: not valid java name */
    public final UniversalRequestOuterClass.UniversalRequest.Payload m1051initializepayload(Function1<? super PayloadKt.Dsl, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        PayloadKt.Dsl.Companion companion = PayloadKt.Dsl.INSTANCE;
        UniversalRequestOuterClass.UniversalRequest.Payload.Builder builderNewBuilder = UniversalRequestOuterClass.UniversalRequest.Payload.newBuilder();
        Intrinsics.checkNotNullExpressionValue(builderNewBuilder, "newBuilder()");
        PayloadKt.Dsl dsl_create = companion._create(builderNewBuilder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }
}
