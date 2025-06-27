package gateway.v1;

import gateway.v1.CampaignStateKt;
import gateway.v1.CampaignStateOuterClass;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CampaignStateKt.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a*\u0010\u0000\u001a\u00020\u00012\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006H\u0087\bø\u0001\u0000¢\u0006\u0002\b\u0007\u001a)\u0010\b\u001a\u00020\u0001*\u00020\u00012\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006H\u0086\bø\u0001\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\t"}, d2 = {"campaignState", "Lgateway/v1/CampaignStateOuterClass$CampaignState;", "block", "Lkotlin/Function1;", "Lgateway/v1/CampaignStateKt$Dsl;", "", "Lkotlin/ExtensionFunctionType;", "-initializecampaignState", "copy", "unity-ads_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class CampaignStateKtKt {
    /* renamed from: -initializecampaignState, reason: not valid java name */
    public static final CampaignStateOuterClass.CampaignState m1013initializecampaignState(Function1<? super CampaignStateKt.Dsl, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        CampaignStateKt.Dsl.Companion companion = CampaignStateKt.Dsl.INSTANCE;
        CampaignStateOuterClass.CampaignState.Builder builderNewBuilder = CampaignStateOuterClass.CampaignState.newBuilder();
        Intrinsics.checkNotNullExpressionValue(builderNewBuilder, "newBuilder()");
        CampaignStateKt.Dsl dsl_create = companion._create(builderNewBuilder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final CampaignStateOuterClass.CampaignState copy(CampaignStateOuterClass.CampaignState campaignState, Function1<? super CampaignStateKt.Dsl, Unit> block) {
        Intrinsics.checkNotNullParameter(campaignState, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        CampaignStateKt.Dsl.Companion companion = CampaignStateKt.Dsl.INSTANCE;
        CampaignStateOuterClass.CampaignState.Builder builder = campaignState.toBuilder();
        Intrinsics.checkNotNullExpressionValue(builder, "this.toBuilder()");
        CampaignStateKt.Dsl dsl_create = companion._create(builder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }
}
