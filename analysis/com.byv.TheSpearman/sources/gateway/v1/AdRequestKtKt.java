package gateway.v1;

import gateway.v1.AdRequestKt;
import gateway.v1.AdRequestOuterClass;
import gateway.v1.CampaignStateOuterClass;
import gateway.v1.DynamicDeviceInfoOuterClass;
import gateway.v1.SessionCountersOuterClass;
import gateway.v1.StaticDeviceInfoOuterClass;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AdRequestKt.kt */
@Metadata(d1 = {"\u0000H\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a*\u0010\u0015\u001a\u00020\u00162\u0017\u0010\u0017\u001a\u0013\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u001a0\u0018¢\u0006\u0002\b\u001bH\u0087\bø\u0001\u0000¢\u0006\u0002\b\u001c\u001a)\u0010\u001d\u001a\u00020\u0016*\u00020\u00162\u0017\u0010\u0017\u001a\u0013\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u001a0\u0018¢\u0006\u0002\b\u001bH\u0086\bø\u0001\u0000\"\u0017\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0017\u0010\u0005\u001a\u0004\u0018\u00010\u0006*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b\"\u0017\u0010\t\u001a\u0004\u0018\u00010\n*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f\"\u0017\u0010\r\u001a\u0004\u0018\u00010\u000e*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010\"\u0017\u0010\u0011\u001a\u0004\u0018\u00010\u0012*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u001e"}, d2 = {"bannerSizeOrNull", "Lgateway/v1/AdRequestOuterClass$BannerSize;", "Lgateway/v1/AdRequestOuterClass$AdRequestOrBuilder;", "getBannerSizeOrNull", "(Lgateway/v1/AdRequestOuterClass$AdRequestOrBuilder;)Lgateway/v1/AdRequestOuterClass$BannerSize;", "campaignStateOrNull", "Lgateway/v1/CampaignStateOuterClass$CampaignState;", "getCampaignStateOrNull", "(Lgateway/v1/AdRequestOuterClass$AdRequestOrBuilder;)Lgateway/v1/CampaignStateOuterClass$CampaignState;", "dynamicDeviceInfoOrNull", "Lgateway/v1/DynamicDeviceInfoOuterClass$DynamicDeviceInfo;", "getDynamicDeviceInfoOrNull", "(Lgateway/v1/AdRequestOuterClass$AdRequestOrBuilder;)Lgateway/v1/DynamicDeviceInfoOuterClass$DynamicDeviceInfo;", "sessionCountersOrNull", "Lgateway/v1/SessionCountersOuterClass$SessionCounters;", "getSessionCountersOrNull", "(Lgateway/v1/AdRequestOuterClass$AdRequestOrBuilder;)Lgateway/v1/SessionCountersOuterClass$SessionCounters;", "staticDeviceInfoOrNull", "Lgateway/v1/StaticDeviceInfoOuterClass$StaticDeviceInfo;", "getStaticDeviceInfoOrNull", "(Lgateway/v1/AdRequestOuterClass$AdRequestOrBuilder;)Lgateway/v1/StaticDeviceInfoOuterClass$StaticDeviceInfo;", "adRequest", "Lgateway/v1/AdRequestOuterClass$AdRequest;", "block", "Lkotlin/Function1;", "Lgateway/v1/AdRequestKt$Dsl;", "", "Lkotlin/ExtensionFunctionType;", "-initializeadRequest", "copy", "unity-ads_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class AdRequestKtKt {
    /* renamed from: -initializeadRequest, reason: not valid java name */
    public static final AdRequestOuterClass.AdRequest m1008initializeadRequest(Function1<? super AdRequestKt.Dsl, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        AdRequestKt.Dsl.Companion companion = AdRequestKt.Dsl.INSTANCE;
        AdRequestOuterClass.AdRequest.Builder builderNewBuilder = AdRequestOuterClass.AdRequest.newBuilder();
        Intrinsics.checkNotNullExpressionValue(builderNewBuilder, "newBuilder()");
        AdRequestKt.Dsl dsl_create = companion._create(builderNewBuilder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final AdRequestOuterClass.AdRequest copy(AdRequestOuterClass.AdRequest adRequest, Function1<? super AdRequestKt.Dsl, Unit> block) {
        Intrinsics.checkNotNullParameter(adRequest, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        AdRequestKt.Dsl.Companion companion = AdRequestKt.Dsl.INSTANCE;
        AdRequestOuterClass.AdRequest.Builder builder = adRequest.toBuilder();
        Intrinsics.checkNotNullExpressionValue(builder, "this.toBuilder()");
        AdRequestKt.Dsl dsl_create = companion._create(builder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final SessionCountersOuterClass.SessionCounters getSessionCountersOrNull(AdRequestOuterClass.AdRequestOrBuilder adRequestOrBuilder) {
        Intrinsics.checkNotNullParameter(adRequestOrBuilder, "<this>");
        if (adRequestOrBuilder.hasSessionCounters()) {
            return adRequestOrBuilder.getSessionCounters();
        }
        return null;
    }

    public static final StaticDeviceInfoOuterClass.StaticDeviceInfo getStaticDeviceInfoOrNull(AdRequestOuterClass.AdRequestOrBuilder adRequestOrBuilder) {
        Intrinsics.checkNotNullParameter(adRequestOrBuilder, "<this>");
        if (adRequestOrBuilder.hasStaticDeviceInfo()) {
            return adRequestOrBuilder.getStaticDeviceInfo();
        }
        return null;
    }

    public static final DynamicDeviceInfoOuterClass.DynamicDeviceInfo getDynamicDeviceInfoOrNull(AdRequestOuterClass.AdRequestOrBuilder adRequestOrBuilder) {
        Intrinsics.checkNotNullParameter(adRequestOrBuilder, "<this>");
        if (adRequestOrBuilder.hasDynamicDeviceInfo()) {
            return adRequestOrBuilder.getDynamicDeviceInfo();
        }
        return null;
    }

    public static final CampaignStateOuterClass.CampaignState getCampaignStateOrNull(AdRequestOuterClass.AdRequestOrBuilder adRequestOrBuilder) {
        Intrinsics.checkNotNullParameter(adRequestOrBuilder, "<this>");
        if (adRequestOrBuilder.hasCampaignState()) {
            return adRequestOrBuilder.getCampaignState();
        }
        return null;
    }

    public static final AdRequestOuterClass.BannerSize getBannerSizeOrNull(AdRequestOuterClass.AdRequestOrBuilder adRequestOrBuilder) {
        Intrinsics.checkNotNullParameter(adRequestOrBuilder, "<this>");
        if (adRequestOrBuilder.hasBannerSize()) {
            return adRequestOrBuilder.getBannerSize();
        }
        return null;
    }
}
