package gateway.v1;

import gateway.v1.AdDataRefreshRequestKt;
import gateway.v1.AdDataRefreshRequestOuterClass;
import gateway.v1.CampaignStateOuterClass;
import gateway.v1.DynamicDeviceInfoOuterClass;
import gateway.v1.SessionCountersOuterClass;
import gateway.v1.StaticDeviceInfoOuterClass;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AdDataRefreshRequestKt.kt */
@Metadata(d1 = {"\u0000@\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a*\u0010\u0011\u001a\u00020\u00122\u0017\u0010\u0013\u001a\u0013\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00160\u0014¢\u0006\u0002\b\u0017H\u0087\bø\u0001\u0000¢\u0006\u0002\b\u0018\u001a)\u0010\u0019\u001a\u00020\u0012*\u00020\u00122\u0017\u0010\u0013\u001a\u0013\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00160\u0014¢\u0006\u0002\b\u0017H\u0086\bø\u0001\u0000\"\u0017\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0017\u0010\u0005\u001a\u0004\u0018\u00010\u0006*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b\"\u0017\u0010\t\u001a\u0004\u0018\u00010\n*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f\"\u0017\u0010\r\u001a\u0004\u0018\u00010\u000e*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u001a"}, d2 = {"campaignStateOrNull", "Lgateway/v1/CampaignStateOuterClass$CampaignState;", "Lgateway/v1/AdDataRefreshRequestOuterClass$AdDataRefreshRequestOrBuilder;", "getCampaignStateOrNull", "(Lgateway/v1/AdDataRefreshRequestOuterClass$AdDataRefreshRequestOrBuilder;)Lgateway/v1/CampaignStateOuterClass$CampaignState;", "dynamicDeviceInfoOrNull", "Lgateway/v1/DynamicDeviceInfoOuterClass$DynamicDeviceInfo;", "getDynamicDeviceInfoOrNull", "(Lgateway/v1/AdDataRefreshRequestOuterClass$AdDataRefreshRequestOrBuilder;)Lgateway/v1/DynamicDeviceInfoOuterClass$DynamicDeviceInfo;", "sessionCountersOrNull", "Lgateway/v1/SessionCountersOuterClass$SessionCounters;", "getSessionCountersOrNull", "(Lgateway/v1/AdDataRefreshRequestOuterClass$AdDataRefreshRequestOrBuilder;)Lgateway/v1/SessionCountersOuterClass$SessionCounters;", "staticDeviceInfoOrNull", "Lgateway/v1/StaticDeviceInfoOuterClass$StaticDeviceInfo;", "getStaticDeviceInfoOrNull", "(Lgateway/v1/AdDataRefreshRequestOuterClass$AdDataRefreshRequestOrBuilder;)Lgateway/v1/StaticDeviceInfoOuterClass$StaticDeviceInfo;", "adDataRefreshRequest", "Lgateway/v1/AdDataRefreshRequestOuterClass$AdDataRefreshRequest;", "block", "Lkotlin/Function1;", "Lgateway/v1/AdDataRefreshRequestKt$Dsl;", "", "Lkotlin/ExtensionFunctionType;", "-initializeadDataRefreshRequest", "copy", "unity-ads_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class AdDataRefreshRequestKtKt {
    /* renamed from: -initializeadDataRefreshRequest, reason: not valid java name */
    public static final AdDataRefreshRequestOuterClass.AdDataRefreshRequest m1003initializeadDataRefreshRequest(Function1<? super AdDataRefreshRequestKt.Dsl, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        AdDataRefreshRequestKt.Dsl.Companion companion = AdDataRefreshRequestKt.Dsl.INSTANCE;
        AdDataRefreshRequestOuterClass.AdDataRefreshRequest.Builder builderNewBuilder = AdDataRefreshRequestOuterClass.AdDataRefreshRequest.newBuilder();
        Intrinsics.checkNotNullExpressionValue(builderNewBuilder, "newBuilder()");
        AdDataRefreshRequestKt.Dsl dsl_create = companion._create(builderNewBuilder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final AdDataRefreshRequestOuterClass.AdDataRefreshRequest copy(AdDataRefreshRequestOuterClass.AdDataRefreshRequest adDataRefreshRequest, Function1<? super AdDataRefreshRequestKt.Dsl, Unit> block) {
        Intrinsics.checkNotNullParameter(adDataRefreshRequest, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        AdDataRefreshRequestKt.Dsl.Companion companion = AdDataRefreshRequestKt.Dsl.INSTANCE;
        AdDataRefreshRequestOuterClass.AdDataRefreshRequest.Builder builder = adDataRefreshRequest.toBuilder();
        Intrinsics.checkNotNullExpressionValue(builder, "this.toBuilder()");
        AdDataRefreshRequestKt.Dsl dsl_create = companion._create(builder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final SessionCountersOuterClass.SessionCounters getSessionCountersOrNull(AdDataRefreshRequestOuterClass.AdDataRefreshRequestOrBuilder adDataRefreshRequestOrBuilder) {
        Intrinsics.checkNotNullParameter(adDataRefreshRequestOrBuilder, "<this>");
        if (adDataRefreshRequestOrBuilder.hasSessionCounters()) {
            return adDataRefreshRequestOrBuilder.getSessionCounters();
        }
        return null;
    }

    public static final StaticDeviceInfoOuterClass.StaticDeviceInfo getStaticDeviceInfoOrNull(AdDataRefreshRequestOuterClass.AdDataRefreshRequestOrBuilder adDataRefreshRequestOrBuilder) {
        Intrinsics.checkNotNullParameter(adDataRefreshRequestOrBuilder, "<this>");
        if (adDataRefreshRequestOrBuilder.hasStaticDeviceInfo()) {
            return adDataRefreshRequestOrBuilder.getStaticDeviceInfo();
        }
        return null;
    }

    public static final DynamicDeviceInfoOuterClass.DynamicDeviceInfo getDynamicDeviceInfoOrNull(AdDataRefreshRequestOuterClass.AdDataRefreshRequestOrBuilder adDataRefreshRequestOrBuilder) {
        Intrinsics.checkNotNullParameter(adDataRefreshRequestOrBuilder, "<this>");
        if (adDataRefreshRequestOrBuilder.hasDynamicDeviceInfo()) {
            return adDataRefreshRequestOrBuilder.getDynamicDeviceInfo();
        }
        return null;
    }

    public static final CampaignStateOuterClass.CampaignState getCampaignStateOrNull(AdDataRefreshRequestOuterClass.AdDataRefreshRequestOrBuilder adDataRefreshRequestOrBuilder) {
        Intrinsics.checkNotNullParameter(adDataRefreshRequestOrBuilder, "<this>");
        if (adDataRefreshRequestOrBuilder.hasCampaignState()) {
            return adDataRefreshRequestOrBuilder.getCampaignState();
        }
        return null;
    }
}
