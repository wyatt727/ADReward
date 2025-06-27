package gateway.v1;

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
import gateway.v1.UniversalRequestKt;
import gateway.v1.UniversalRequestOuterClass;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: UniversalRequestKt.kt */
@Metadata(d1 = {"\u0000Â\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a*\u0010M\u001a\u00020N2\u0017\u0010O\u001a\u0013\u0012\u0004\u0012\u00020Q\u0012\u0004\u0012\u00020R0P¢\u0006\u0002\bSH\u0087\bø\u0001\u0000¢\u0006\u0002\bT\u001a)\u0010U\u001a\u00020N*\u00020N2\u0017\u0010O\u001a\u0013\u0012\u0004\u0012\u00020Q\u0012\u0004\u0012\u00020R0P¢\u0006\u0002\bSH\u0086\bø\u0001\u0000\u001a)\u0010U\u001a\u00020/*\u00020/2\u0017\u0010O\u001a\u0013\u0012\u0004\u0012\u00020V\u0012\u0004\u0012\u00020R0P¢\u0006\u0002\bSH\u0086\bø\u0001\u0000\u001a)\u0010U\u001a\u00020>*\u00020>2\u0017\u0010O\u001a\u0013\u0012\u0004\u0012\u00020W\u0012\u0004\u0012\u00020R0P¢\u0006\u0002\bSH\u0086\bø\u0001\u0000\"\u0017\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0017\u0010\u0005\u001a\u0004\u0018\u00010\u0006*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b\"\u0017\u0010\t\u001a\u0004\u0018\u00010\n*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f\"\u0017\u0010\r\u001a\u0004\u0018\u00010\u000e*\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011\"\u0017\u0010\u0012\u001a\u0004\u0018\u00010\u0013*\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015\"\u0017\u0010\u0016\u001a\u0004\u0018\u00010\u0017*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019\"\u0017\u0010\u001a\u001a\u0004\u0018\u00010\u001b*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001d\"\u0017\u0010\u001e\u001a\u0004\u0018\u00010\u001f*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b \u0010!\"\u0017\u0010\"\u001a\u0004\u0018\u00010#*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b$\u0010%\"\u0017\u0010&\u001a\u0004\u0018\u00010'*\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b(\u0010)\"\u0017\u0010*\u001a\u0004\u0018\u00010+*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b,\u0010-\"\u0017\u0010.\u001a\u0004\u0018\u00010/*\u0002008F¢\u0006\u0006\u001a\u0004\b1\u00102\"\u0017\u00103\u001a\u0004\u0018\u000104*\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b5\u00106\"\u0017\u00107\u001a\u0004\u0018\u000108*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b9\u0010:\"\u0017\u0010;\u001a\u0004\u0018\u00010\u000e*\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b<\u0010\u0011\"\u0017\u0010=\u001a\u0004\u0018\u00010>*\u0002008F¢\u0006\u0006\u001a\u0004\b?\u0010@\"\u0017\u0010A\u001a\u0004\u0018\u00010B*\u00020\u000f8F¢\u0006\u0006\u001a\u0004\bC\u0010D\"\u0017\u0010E\u001a\u0004\u0018\u00010F*\u00020\u000f8F¢\u0006\u0006\u001a\u0004\bG\u0010H\"\u0017\u0010I\u001a\u0004\u0018\u00010J*\u00020\u00028F¢\u0006\u0006\u001a\u0004\bK\u0010L\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006X"}, d2 = {"adDataRefreshRequestOrNull", "Lgateway/v1/AdDataRefreshRequestOuterClass$AdDataRefreshRequest;", "Lgateway/v1/UniversalRequestOuterClass$UniversalRequest$PayloadOrBuilder;", "getAdDataRefreshRequestOrNull", "(Lgateway/v1/UniversalRequestOuterClass$UniversalRequest$PayloadOrBuilder;)Lgateway/v1/AdDataRefreshRequestOuterClass$AdDataRefreshRequest;", "adPlayerConfigRequestOrNull", "Lgateway/v1/AdPlayerConfigRequestOuterClass$AdPlayerConfigRequest;", "getAdPlayerConfigRequestOrNull", "(Lgateway/v1/UniversalRequestOuterClass$UniversalRequest$PayloadOrBuilder;)Lgateway/v1/AdPlayerConfigRequestOuterClass$AdPlayerConfigRequest;", "adRequestOrNull", "Lgateway/v1/AdRequestOuterClass$AdRequest;", "getAdRequestOrNull", "(Lgateway/v1/UniversalRequestOuterClass$UniversalRequest$PayloadOrBuilder;)Lgateway/v1/AdRequestOuterClass$AdRequest;", "appStartTimeOrNull", "Lcom/google/protobuf/Timestamp;", "Lgateway/v1/UniversalRequestOuterClass$UniversalRequest$SharedDataOrBuilder;", "getAppStartTimeOrNull", "(Lgateway/v1/UniversalRequestOuterClass$UniversalRequest$SharedDataOrBuilder;)Lcom/google/protobuf/Timestamp;", "developerConsentOrNull", "Lgateway/v1/DeveloperConsentOuterClass$DeveloperConsent;", "getDeveloperConsentOrNull", "(Lgateway/v1/UniversalRequestOuterClass$UniversalRequest$SharedDataOrBuilder;)Lgateway/v1/DeveloperConsentOuterClass$DeveloperConsent;", "diagnosticEventRequestOrNull", "Lgateway/v1/DiagnosticEventRequestOuterClass$DiagnosticEventRequest;", "getDiagnosticEventRequestOrNull", "(Lgateway/v1/UniversalRequestOuterClass$UniversalRequest$PayloadOrBuilder;)Lgateway/v1/DiagnosticEventRequestOuterClass$DiagnosticEventRequest;", "getTokenEventRequestOrNull", "Lgateway/v1/GetTokenEventRequestOuterClass$GetTokenEventRequest;", "getGetTokenEventRequestOrNull", "(Lgateway/v1/UniversalRequestOuterClass$UniversalRequest$PayloadOrBuilder;)Lgateway/v1/GetTokenEventRequestOuterClass$GetTokenEventRequest;", "initializationCompletedEventRequestOrNull", "Lgateway/v1/InitializationCompletedEventRequestOuterClass$InitializationCompletedEventRequest;", "getInitializationCompletedEventRequestOrNull", "(Lgateway/v1/UniversalRequestOuterClass$UniversalRequest$PayloadOrBuilder;)Lgateway/v1/InitializationCompletedEventRequestOuterClass$InitializationCompletedEventRequest;", "initializationRequestOrNull", "Lgateway/v1/InitializationRequestOuterClass$InitializationRequest;", "getInitializationRequestOrNull", "(Lgateway/v1/UniversalRequestOuterClass$UniversalRequest$PayloadOrBuilder;)Lgateway/v1/InitializationRequestOuterClass$InitializationRequest;", "limitedSessionTokenOrNull", "Lgateway/v1/UniversalRequestOuterClass$LimitedSessionToken;", "getLimitedSessionTokenOrNull", "(Lgateway/v1/UniversalRequestOuterClass$UniversalRequest$SharedDataOrBuilder;)Lgateway/v1/UniversalRequestOuterClass$LimitedSessionToken;", "operativeEventOrNull", "Lgateway/v1/OperativeEventRequestOuterClass$OperativeEventRequest;", "getOperativeEventOrNull", "(Lgateway/v1/UniversalRequestOuterClass$UniversalRequest$PayloadOrBuilder;)Lgateway/v1/OperativeEventRequestOuterClass$OperativeEventRequest;", "payloadOrNull", "Lgateway/v1/UniversalRequestOuterClass$UniversalRequest$Payload;", "Lgateway/v1/UniversalRequestOuterClass$UniversalRequestOrBuilder;", "getPayloadOrNull", "(Lgateway/v1/UniversalRequestOuterClass$UniversalRequestOrBuilder;)Lgateway/v1/UniversalRequestOuterClass$UniversalRequest$Payload;", "piiOrNull", "Lgateway/v1/PiiOuterClass$Pii;", "getPiiOrNull", "(Lgateway/v1/UniversalRequestOuterClass$UniversalRequest$SharedDataOrBuilder;)Lgateway/v1/PiiOuterClass$Pii;", "privacyUpdateRequestOrNull", "Lgateway/v1/PrivacyUpdateRequestOuterClass$PrivacyUpdateRequest;", "getPrivacyUpdateRequestOrNull", "(Lgateway/v1/UniversalRequestOuterClass$UniversalRequest$PayloadOrBuilder;)Lgateway/v1/PrivacyUpdateRequestOuterClass$PrivacyUpdateRequest;", "sdkStartTimeOrNull", "getSdkStartTimeOrNull", "sharedDataOrNull", "Lgateway/v1/UniversalRequestOuterClass$UniversalRequest$SharedData;", "getSharedDataOrNull", "(Lgateway/v1/UniversalRequestOuterClass$UniversalRequestOrBuilder;)Lgateway/v1/UniversalRequestOuterClass$UniversalRequest$SharedData;", "testDataOrNull", "Lgateway/v1/TestDataOuterClass$TestData;", "getTestDataOrNull", "(Lgateway/v1/UniversalRequestOuterClass$UniversalRequest$SharedDataOrBuilder;)Lgateway/v1/TestDataOuterClass$TestData;", "timestampsOrNull", "Lgateway/v1/TimestampsOuterClass$Timestamps;", "getTimestampsOrNull", "(Lgateway/v1/UniversalRequestOuterClass$UniversalRequest$SharedDataOrBuilder;)Lgateway/v1/TimestampsOuterClass$Timestamps;", "transactionEventRequestOrNull", "Lgateway/v1/TransactionEventRequestOuterClass$TransactionEventRequest;", "getTransactionEventRequestOrNull", "(Lgateway/v1/UniversalRequestOuterClass$UniversalRequest$PayloadOrBuilder;)Lgateway/v1/TransactionEventRequestOuterClass$TransactionEventRequest;", "universalRequest", "Lgateway/v1/UniversalRequestOuterClass$UniversalRequest;", "block", "Lkotlin/Function1;", "Lgateway/v1/UniversalRequestKt$Dsl;", "", "Lkotlin/ExtensionFunctionType;", "-initializeuniversalRequest", "copy", "Lgateway/v1/UniversalRequestKt$PayloadKt$Dsl;", "Lgateway/v1/UniversalRequestKt$SharedDataKt$Dsl;", "unity-ads_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class UniversalRequestKtKt {
    /* renamed from: -initializeuniversalRequest, reason: not valid java name */
    public static final UniversalRequestOuterClass.UniversalRequest m1053initializeuniversalRequest(Function1<? super UniversalRequestKt.Dsl, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        UniversalRequestKt.Dsl.Companion companion = UniversalRequestKt.Dsl.INSTANCE;
        UniversalRequestOuterClass.UniversalRequest.Builder builderNewBuilder = UniversalRequestOuterClass.UniversalRequest.newBuilder();
        Intrinsics.checkNotNullExpressionValue(builderNewBuilder, "newBuilder()");
        UniversalRequestKt.Dsl dsl_create = companion._create(builderNewBuilder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final UniversalRequestOuterClass.UniversalRequest copy(UniversalRequestOuterClass.UniversalRequest universalRequest, Function1<? super UniversalRequestKt.Dsl, Unit> block) {
        Intrinsics.checkNotNullParameter(universalRequest, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        UniversalRequestKt.Dsl.Companion companion = UniversalRequestKt.Dsl.INSTANCE;
        UniversalRequestOuterClass.UniversalRequest.Builder builder = universalRequest.toBuilder();
        Intrinsics.checkNotNullExpressionValue(builder, "this.toBuilder()");
        UniversalRequestKt.Dsl dsl_create = companion._create(builder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final UniversalRequestOuterClass.UniversalRequest.SharedData copy(UniversalRequestOuterClass.UniversalRequest.SharedData sharedData, Function1<? super UniversalRequestKt.SharedDataKt.Dsl, Unit> block) {
        Intrinsics.checkNotNullParameter(sharedData, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        UniversalRequestKt.SharedDataKt.Dsl.Companion companion = UniversalRequestKt.SharedDataKt.Dsl.INSTANCE;
        UniversalRequestOuterClass.UniversalRequest.SharedData.Builder builder = sharedData.toBuilder();
        Intrinsics.checkNotNullExpressionValue(builder, "this.toBuilder()");
        UniversalRequestKt.SharedDataKt.Dsl dsl_create = companion._create(builder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final TimestampsOuterClass.Timestamps getTimestampsOrNull(UniversalRequestOuterClass.UniversalRequest.SharedDataOrBuilder sharedDataOrBuilder) {
        Intrinsics.checkNotNullParameter(sharedDataOrBuilder, "<this>");
        if (sharedDataOrBuilder.hasTimestamps()) {
            return sharedDataOrBuilder.getTimestamps();
        }
        return null;
    }

    public static final PiiOuterClass.Pii getPiiOrNull(UniversalRequestOuterClass.UniversalRequest.SharedDataOrBuilder sharedDataOrBuilder) {
        Intrinsics.checkNotNullParameter(sharedDataOrBuilder, "<this>");
        if (sharedDataOrBuilder.hasPii()) {
            return sharedDataOrBuilder.getPii();
        }
        return null;
    }

    public static final DeveloperConsentOuterClass.DeveloperConsent getDeveloperConsentOrNull(UniversalRequestOuterClass.UniversalRequest.SharedDataOrBuilder sharedDataOrBuilder) {
        Intrinsics.checkNotNullParameter(sharedDataOrBuilder, "<this>");
        if (sharedDataOrBuilder.hasDeveloperConsent()) {
            return sharedDataOrBuilder.getDeveloperConsent();
        }
        return null;
    }

    public static final TestDataOuterClass.TestData getTestDataOrNull(UniversalRequestOuterClass.UniversalRequest.SharedDataOrBuilder sharedDataOrBuilder) {
        Intrinsics.checkNotNullParameter(sharedDataOrBuilder, "<this>");
        if (sharedDataOrBuilder.hasTestData()) {
            return sharedDataOrBuilder.getTestData();
        }
        return null;
    }

    public static final Timestamp getAppStartTimeOrNull(UniversalRequestOuterClass.UniversalRequest.SharedDataOrBuilder sharedDataOrBuilder) {
        Intrinsics.checkNotNullParameter(sharedDataOrBuilder, "<this>");
        if (sharedDataOrBuilder.hasAppStartTime()) {
            return sharedDataOrBuilder.getAppStartTime();
        }
        return null;
    }

    public static final Timestamp getSdkStartTimeOrNull(UniversalRequestOuterClass.UniversalRequest.SharedDataOrBuilder sharedDataOrBuilder) {
        Intrinsics.checkNotNullParameter(sharedDataOrBuilder, "<this>");
        if (sharedDataOrBuilder.hasSdkStartTime()) {
            return sharedDataOrBuilder.getSdkStartTime();
        }
        return null;
    }

    public static final UniversalRequestOuterClass.LimitedSessionToken getLimitedSessionTokenOrNull(UniversalRequestOuterClass.UniversalRequest.SharedDataOrBuilder sharedDataOrBuilder) {
        Intrinsics.checkNotNullParameter(sharedDataOrBuilder, "<this>");
        if (sharedDataOrBuilder.hasLimitedSessionToken()) {
            return sharedDataOrBuilder.getLimitedSessionToken();
        }
        return null;
    }

    public static final UniversalRequestOuterClass.UniversalRequest.Payload copy(UniversalRequestOuterClass.UniversalRequest.Payload payload, Function1<? super UniversalRequestKt.PayloadKt.Dsl, Unit> block) {
        Intrinsics.checkNotNullParameter(payload, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        UniversalRequestKt.PayloadKt.Dsl.Companion companion = UniversalRequestKt.PayloadKt.Dsl.INSTANCE;
        UniversalRequestOuterClass.UniversalRequest.Payload.Builder builder = payload.toBuilder();
        Intrinsics.checkNotNullExpressionValue(builder, "this.toBuilder()");
        UniversalRequestKt.PayloadKt.Dsl dsl_create = companion._create(builder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final InitializationRequestOuterClass.InitializationRequest getInitializationRequestOrNull(UniversalRequestOuterClass.UniversalRequest.PayloadOrBuilder payloadOrBuilder) {
        Intrinsics.checkNotNullParameter(payloadOrBuilder, "<this>");
        if (payloadOrBuilder.hasInitializationRequest()) {
            return payloadOrBuilder.getInitializationRequest();
        }
        return null;
    }

    public static final AdRequestOuterClass.AdRequest getAdRequestOrNull(UniversalRequestOuterClass.UniversalRequest.PayloadOrBuilder payloadOrBuilder) {
        Intrinsics.checkNotNullParameter(payloadOrBuilder, "<this>");
        if (payloadOrBuilder.hasAdRequest()) {
            return payloadOrBuilder.getAdRequest();
        }
        return null;
    }

    public static final OperativeEventRequestOuterClass.OperativeEventRequest getOperativeEventOrNull(UniversalRequestOuterClass.UniversalRequest.PayloadOrBuilder payloadOrBuilder) {
        Intrinsics.checkNotNullParameter(payloadOrBuilder, "<this>");
        if (payloadOrBuilder.hasOperativeEvent()) {
            return payloadOrBuilder.getOperativeEvent();
        }
        return null;
    }

    public static final DiagnosticEventRequestOuterClass.DiagnosticEventRequest getDiagnosticEventRequestOrNull(UniversalRequestOuterClass.UniversalRequest.PayloadOrBuilder payloadOrBuilder) {
        Intrinsics.checkNotNullParameter(payloadOrBuilder, "<this>");
        if (payloadOrBuilder.hasDiagnosticEventRequest()) {
            return payloadOrBuilder.getDiagnosticEventRequest();
        }
        return null;
    }

    public static final AdPlayerConfigRequestOuterClass.AdPlayerConfigRequest getAdPlayerConfigRequestOrNull(UniversalRequestOuterClass.UniversalRequest.PayloadOrBuilder payloadOrBuilder) {
        Intrinsics.checkNotNullParameter(payloadOrBuilder, "<this>");
        if (payloadOrBuilder.hasAdPlayerConfigRequest()) {
            return payloadOrBuilder.getAdPlayerConfigRequest();
        }
        return null;
    }

    public static final GetTokenEventRequestOuterClass.GetTokenEventRequest getGetTokenEventRequestOrNull(UniversalRequestOuterClass.UniversalRequest.PayloadOrBuilder payloadOrBuilder) {
        Intrinsics.checkNotNullParameter(payloadOrBuilder, "<this>");
        if (payloadOrBuilder.hasGetTokenEventRequest()) {
            return payloadOrBuilder.getGetTokenEventRequest();
        }
        return null;
    }

    public static final PrivacyUpdateRequestOuterClass.PrivacyUpdateRequest getPrivacyUpdateRequestOrNull(UniversalRequestOuterClass.UniversalRequest.PayloadOrBuilder payloadOrBuilder) {
        Intrinsics.checkNotNullParameter(payloadOrBuilder, "<this>");
        if (payloadOrBuilder.hasPrivacyUpdateRequest()) {
            return payloadOrBuilder.getPrivacyUpdateRequest();
        }
        return null;
    }

    public static final AdDataRefreshRequestOuterClass.AdDataRefreshRequest getAdDataRefreshRequestOrNull(UniversalRequestOuterClass.UniversalRequest.PayloadOrBuilder payloadOrBuilder) {
        Intrinsics.checkNotNullParameter(payloadOrBuilder, "<this>");
        if (payloadOrBuilder.hasAdDataRefreshRequest()) {
            return payloadOrBuilder.getAdDataRefreshRequest();
        }
        return null;
    }

    public static final InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequest getInitializationCompletedEventRequestOrNull(UniversalRequestOuterClass.UniversalRequest.PayloadOrBuilder payloadOrBuilder) {
        Intrinsics.checkNotNullParameter(payloadOrBuilder, "<this>");
        if (payloadOrBuilder.hasInitializationCompletedEventRequest()) {
            return payloadOrBuilder.getInitializationCompletedEventRequest();
        }
        return null;
    }

    public static final TransactionEventRequestOuterClass.TransactionEventRequest getTransactionEventRequestOrNull(UniversalRequestOuterClass.UniversalRequest.PayloadOrBuilder payloadOrBuilder) {
        Intrinsics.checkNotNullParameter(payloadOrBuilder, "<this>");
        if (payloadOrBuilder.hasTransactionEventRequest()) {
            return payloadOrBuilder.getTransactionEventRequest();
        }
        return null;
    }

    public static final UniversalRequestOuterClass.UniversalRequest.SharedData getSharedDataOrNull(UniversalRequestOuterClass.UniversalRequestOrBuilder universalRequestOrBuilder) {
        Intrinsics.checkNotNullParameter(universalRequestOrBuilder, "<this>");
        if (universalRequestOrBuilder.hasSharedData()) {
            return universalRequestOrBuilder.getSharedData();
        }
        return null;
    }

    public static final UniversalRequestOuterClass.UniversalRequest.Payload getPayloadOrNull(UniversalRequestOuterClass.UniversalRequestOrBuilder universalRequestOrBuilder) {
        Intrinsics.checkNotNullParameter(universalRequestOrBuilder, "<this>");
        if (universalRequestOrBuilder.hasPayload()) {
            return universalRequestOrBuilder.getPayload();
        }
        return null;
    }
}
