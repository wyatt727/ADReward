package headerbidding.v1;

import gateway.v1.CampaignStateOuterClass;
import gateway.v1.ClientInfoOuterClass;
import gateway.v1.DynamicDeviceInfoOuterClass;
import gateway.v1.PiiOuterClass;
import gateway.v1.SessionCountersOuterClass;
import gateway.v1.StaticDeviceInfoOuterClass;
import gateway.v1.TimestampsOuterClass;
import headerbidding.v1.HeaderBiddingTokenKt;
import headerbidding.v1.HeaderBiddingTokenOuterClass;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: HeaderBiddingTokenKt.kt */
@Metadata(d1 = {"\u0000X\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a*\u0010\u001d\u001a\u00020\u001e2\u0017\u0010\u001f\u001a\u0013\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\"0 ¢\u0006\u0002\b#H\u0087\bø\u0001\u0000¢\u0006\u0002\b$\u001a)\u0010%\u001a\u00020\u001e*\u00020\u001e2\u0017\u0010\u001f\u001a\u0013\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\"0 ¢\u0006\u0002\b#H\u0086\bø\u0001\u0000\"\u0017\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0017\u0010\u0005\u001a\u0004\u0018\u00010\u0006*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b\"\u0017\u0010\t\u001a\u0004\u0018\u00010\n*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f\"\u0017\u0010\r\u001a\u0004\u0018\u00010\u000e*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010\"\u0017\u0010\u0011\u001a\u0004\u0018\u00010\u0012*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014\"\u0017\u0010\u0015\u001a\u0004\u0018\u00010\u0016*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018\"\u0017\u0010\u0019\u001a\u0004\u0018\u00010\u001a*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006&"}, d2 = {"campaignStateOrNull", "Lgateway/v1/CampaignStateOuterClass$CampaignState;", "Lheaderbidding/v1/HeaderBiddingTokenOuterClass$HeaderBiddingTokenOrBuilder;", "getCampaignStateOrNull", "(Lheaderbidding/v1/HeaderBiddingTokenOuterClass$HeaderBiddingTokenOrBuilder;)Lgateway/v1/CampaignStateOuterClass$CampaignState;", "clientInfoOrNull", "Lgateway/v1/ClientInfoOuterClass$ClientInfo;", "getClientInfoOrNull", "(Lheaderbidding/v1/HeaderBiddingTokenOuterClass$HeaderBiddingTokenOrBuilder;)Lgateway/v1/ClientInfoOuterClass$ClientInfo;", "dynamicDeviceInfoOrNull", "Lgateway/v1/DynamicDeviceInfoOuterClass$DynamicDeviceInfo;", "getDynamicDeviceInfoOrNull", "(Lheaderbidding/v1/HeaderBiddingTokenOuterClass$HeaderBiddingTokenOrBuilder;)Lgateway/v1/DynamicDeviceInfoOuterClass$DynamicDeviceInfo;", "piiOrNull", "Lgateway/v1/PiiOuterClass$Pii;", "getPiiOrNull", "(Lheaderbidding/v1/HeaderBiddingTokenOuterClass$HeaderBiddingTokenOrBuilder;)Lgateway/v1/PiiOuterClass$Pii;", "sessionCountersOrNull", "Lgateway/v1/SessionCountersOuterClass$SessionCounters;", "getSessionCountersOrNull", "(Lheaderbidding/v1/HeaderBiddingTokenOuterClass$HeaderBiddingTokenOrBuilder;)Lgateway/v1/SessionCountersOuterClass$SessionCounters;", "staticDeviceInfoOrNull", "Lgateway/v1/StaticDeviceInfoOuterClass$StaticDeviceInfo;", "getStaticDeviceInfoOrNull", "(Lheaderbidding/v1/HeaderBiddingTokenOuterClass$HeaderBiddingTokenOrBuilder;)Lgateway/v1/StaticDeviceInfoOuterClass$StaticDeviceInfo;", "timestampsOrNull", "Lgateway/v1/TimestampsOuterClass$Timestamps;", "getTimestampsOrNull", "(Lheaderbidding/v1/HeaderBiddingTokenOuterClass$HeaderBiddingTokenOrBuilder;)Lgateway/v1/TimestampsOuterClass$Timestamps;", "headerBiddingToken", "Lheaderbidding/v1/HeaderBiddingTokenOuterClass$HeaderBiddingToken;", "block", "Lkotlin/Function1;", "Lheaderbidding/v1/HeaderBiddingTokenKt$Dsl;", "", "Lkotlin/ExtensionFunctionType;", "-initializeheaderBiddingToken", "copy", "unity-ads_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class HeaderBiddingTokenKtKt {
    /* renamed from: -initializeheaderBiddingToken, reason: not valid java name */
    public static final HeaderBiddingTokenOuterClass.HeaderBiddingToken m1057initializeheaderBiddingToken(Function1<? super HeaderBiddingTokenKt.Dsl, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        HeaderBiddingTokenKt.Dsl.Companion companion = HeaderBiddingTokenKt.Dsl.INSTANCE;
        HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder builderNewBuilder = HeaderBiddingTokenOuterClass.HeaderBiddingToken.newBuilder();
        Intrinsics.checkNotNullExpressionValue(builderNewBuilder, "newBuilder()");
        HeaderBiddingTokenKt.Dsl dsl_create = companion._create(builderNewBuilder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final HeaderBiddingTokenOuterClass.HeaderBiddingToken copy(HeaderBiddingTokenOuterClass.HeaderBiddingToken headerBiddingToken, Function1<? super HeaderBiddingTokenKt.Dsl, Unit> block) {
        Intrinsics.checkNotNullParameter(headerBiddingToken, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        HeaderBiddingTokenKt.Dsl.Companion companion = HeaderBiddingTokenKt.Dsl.INSTANCE;
        HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder builder = headerBiddingToken.toBuilder();
        Intrinsics.checkNotNullExpressionValue(builder, "this.toBuilder()");
        HeaderBiddingTokenKt.Dsl dsl_create = companion._create(builder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final ClientInfoOuterClass.ClientInfo getClientInfoOrNull(HeaderBiddingTokenOuterClass.HeaderBiddingTokenOrBuilder headerBiddingTokenOrBuilder) {
        Intrinsics.checkNotNullParameter(headerBiddingTokenOrBuilder, "<this>");
        if (headerBiddingTokenOrBuilder.hasClientInfo()) {
            return headerBiddingTokenOrBuilder.getClientInfo();
        }
        return null;
    }

    public static final TimestampsOuterClass.Timestamps getTimestampsOrNull(HeaderBiddingTokenOuterClass.HeaderBiddingTokenOrBuilder headerBiddingTokenOrBuilder) {
        Intrinsics.checkNotNullParameter(headerBiddingTokenOrBuilder, "<this>");
        if (headerBiddingTokenOrBuilder.hasTimestamps()) {
            return headerBiddingTokenOrBuilder.getTimestamps();
        }
        return null;
    }

    public static final SessionCountersOuterClass.SessionCounters getSessionCountersOrNull(HeaderBiddingTokenOuterClass.HeaderBiddingTokenOrBuilder headerBiddingTokenOrBuilder) {
        Intrinsics.checkNotNullParameter(headerBiddingTokenOrBuilder, "<this>");
        if (headerBiddingTokenOrBuilder.hasSessionCounters()) {
            return headerBiddingTokenOrBuilder.getSessionCounters();
        }
        return null;
    }

    public static final StaticDeviceInfoOuterClass.StaticDeviceInfo getStaticDeviceInfoOrNull(HeaderBiddingTokenOuterClass.HeaderBiddingTokenOrBuilder headerBiddingTokenOrBuilder) {
        Intrinsics.checkNotNullParameter(headerBiddingTokenOrBuilder, "<this>");
        if (headerBiddingTokenOrBuilder.hasStaticDeviceInfo()) {
            return headerBiddingTokenOrBuilder.getStaticDeviceInfo();
        }
        return null;
    }

    public static final DynamicDeviceInfoOuterClass.DynamicDeviceInfo getDynamicDeviceInfoOrNull(HeaderBiddingTokenOuterClass.HeaderBiddingTokenOrBuilder headerBiddingTokenOrBuilder) {
        Intrinsics.checkNotNullParameter(headerBiddingTokenOrBuilder, "<this>");
        if (headerBiddingTokenOrBuilder.hasDynamicDeviceInfo()) {
            return headerBiddingTokenOrBuilder.getDynamicDeviceInfo();
        }
        return null;
    }

    public static final PiiOuterClass.Pii getPiiOrNull(HeaderBiddingTokenOuterClass.HeaderBiddingTokenOrBuilder headerBiddingTokenOrBuilder) {
        Intrinsics.checkNotNullParameter(headerBiddingTokenOrBuilder, "<this>");
        if (headerBiddingTokenOrBuilder.hasPii()) {
            return headerBiddingTokenOrBuilder.getPii();
        }
        return null;
    }

    public static final CampaignStateOuterClass.CampaignState getCampaignStateOrNull(HeaderBiddingTokenOuterClass.HeaderBiddingTokenOrBuilder headerBiddingTokenOrBuilder) {
        Intrinsics.checkNotNullParameter(headerBiddingTokenOrBuilder, "<this>");
        if (headerBiddingTokenOrBuilder.hasCampaignState()) {
            return headerBiddingTokenOrBuilder.getCampaignState();
        }
        return null;
    }
}
