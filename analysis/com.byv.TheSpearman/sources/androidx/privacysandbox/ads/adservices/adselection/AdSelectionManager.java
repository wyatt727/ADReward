package androidx.privacysandbox.ads.adservices.adselection;

import android.adservices.adselection.AdSelectionConfig;
import android.adservices.common.AdSelectionSignals;
import android.adservices.common.AdTechIdentifier;
import android.content.Context;
import android.net.Uri;
import androidx.core.os.OutcomeReceiverKt;
import androidx.privacysandbox.ads.adservices.adid.AdIdManager$Api33Ext4Impl$$ExternalSyntheticLambda0;
import androidx.privacysandbox.ads.adservices.internal.AdServicesInfo;
import com.json.mediationsdk.utils.c;
import com.vungle.ads.internal.ui.AdActivity;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CancellableContinuationImpl;

/* compiled from: AdSelectionManager.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u0000 \u000e2\u00020\u0001:\u0002\r\u000eB\u0007\b\u0000¢\u0006\u0002\u0010\u0002J\u0019\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H§@ø\u0001\u0000¢\u0006\u0002\u0010\u0007J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH§@ø\u0001\u0000¢\u0006\u0002\u0010\f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000f"}, d2 = {"Landroidx/privacysandbox/ads/adservices/adselection/AdSelectionManager;", "", "()V", "reportImpression", "", "reportImpressionRequest", "Landroidx/privacysandbox/ads/adservices/adselection/ReportImpressionRequest;", "(Landroidx/privacysandbox/ads/adservices/adselection/ReportImpressionRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "selectAds", "Landroidx/privacysandbox/ads/adservices/adselection/AdSelectionOutcome;", "adSelectionConfig", "Landroidx/privacysandbox/ads/adservices/adselection/AdSelectionConfig;", "(Landroidx/privacysandbox/ads/adservices/adselection/AdSelectionConfig;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Api33Ext4Impl", "Companion", "ads-adservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class AdSelectionManager {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @JvmStatic
    public static final AdSelectionManager obtain(Context context) {
        return INSTANCE.obtain(context);
    }

    public abstract Object reportImpression(ReportImpressionRequest reportImpressionRequest, Continuation<? super Unit> continuation);

    public abstract Object selectAds(AdSelectionConfig adSelectionConfig, Continuation<? super AdSelectionOutcome> continuation);

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AdSelectionManager.kt */
    @Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\b\u0003\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\r\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0002J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u000eH\u0002J\u001c\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013H\u0002J*\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00162\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u000e0\u0016H\u0002J\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\n\u001a\u00020\u0019H\u0002J\u0010\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0002J\u0019\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0019H\u0097@ø\u0001\u0000¢\u0006\u0002\u0010!J\u0019\u0010\"\u001a\u00020\u001b2\u0006\u0010#\u001a\u00020\u000bH\u0097@ø\u0001\u0000¢\u0006\u0002\u0010$J\u0019\u0010%\u001a\u00020\u001d2\u0006\u0010#\u001a\u00020\tH\u0083@ø\u0001\u0000¢\u0006\u0002\u0010&R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006'"}, d2 = {"Landroidx/privacysandbox/ads/adservices/adselection/AdSelectionManager$Api33Ext4Impl;", "Landroidx/privacysandbox/ads/adservices/adselection/AdSelectionManager;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "mAdSelectionManager", "Landroid/adservices/adselection/AdSelectionManager;", "(Landroid/adservices/adselection/AdSelectionManager;)V", "convertAdSelectionConfig", "Landroid/adservices/adselection/AdSelectionConfig;", AdActivity.REQUEST_KEY_EXTRA, "Landroidx/privacysandbox/ads/adservices/adselection/AdSelectionConfig;", "convertAdSelectionSignals", "Landroid/adservices/common/AdSelectionSignals;", "Landroidx/privacysandbox/ads/adservices/common/AdSelectionSignals;", "convertBuyers", "", "Landroid/adservices/common/AdTechIdentifier;", "buyers", "", "Landroidx/privacysandbox/ads/adservices/common/AdTechIdentifier;", "convertPerBuyerSignals", "", "convertReportImpressionRequest", "Landroid/adservices/adselection/ReportImpressionRequest;", "Landroidx/privacysandbox/ads/adservices/adselection/ReportImpressionRequest;", "convertResponse", "Landroidx/privacysandbox/ads/adservices/adselection/AdSelectionOutcome;", c.Y1, "Landroid/adservices/adselection/AdSelectionOutcome;", "reportImpression", "", "reportImpressionRequest", "(Landroidx/privacysandbox/ads/adservices/adselection/ReportImpressionRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "selectAds", "adSelectionConfig", "(Landroidx/privacysandbox/ads/adservices/adselection/AdSelectionConfig;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "selectAdsInternal", "(Landroid/adservices/adselection/AdSelectionConfig;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ads-adservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    static final class Api33Ext4Impl extends AdSelectionManager {
        private final android.adservices.adselection.AdSelectionManager mAdSelectionManager;

        public Api33Ext4Impl(android.adservices.adselection.AdSelectionManager mAdSelectionManager) {
            Intrinsics.checkNotNullParameter(mAdSelectionManager, "mAdSelectionManager");
            this.mAdSelectionManager = mAdSelectionManager;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public Api33Ext4Impl(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            Object systemService = context.getSystemService((Class<Object>) android.adservices.adselection.AdSelectionManager.class);
            Intrinsics.checkNotNullExpressionValue(systemService, "context.getSystemService…:class.java\n            )");
            this((android.adservices.adselection.AdSelectionManager) systemService);
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
        @Override // androidx.privacysandbox.ads.adservices.adselection.AdSelectionManager
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Object selectAds(androidx.privacysandbox.ads.adservices.adselection.AdSelectionConfig r5, kotlin.coroutines.Continuation<? super androidx.privacysandbox.ads.adservices.adselection.AdSelectionOutcome> r6) throws java.lang.Throwable {
            /*
                r4 = this;
                boolean r0 = r6 instanceof androidx.privacysandbox.ads.adservices.adselection.AdSelectionManager$Api33Ext4Impl$selectAds$1
                if (r0 == 0) goto L14
                r0 = r6
                androidx.privacysandbox.ads.adservices.adselection.AdSelectionManager$Api33Ext4Impl$selectAds$1 r0 = (androidx.privacysandbox.ads.adservices.adselection.AdSelectionManager$Api33Ext4Impl$selectAds$1) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r1 = r1 & r2
                if (r1 == 0) goto L14
                int r6 = r0.label
                int r6 = r6 - r2
                r0.label = r6
                goto L19
            L14:
                androidx.privacysandbox.ads.adservices.adselection.AdSelectionManager$Api33Ext4Impl$selectAds$1 r0 = new androidx.privacysandbox.ads.adservices.adselection.AdSelectionManager$Api33Ext4Impl$selectAds$1
                r0.<init>(r4, r6)
            L19:
                java.lang.Object r6 = r0.result
                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r2 = r0.label
                r3 = 1
                if (r2 == 0) goto L36
                if (r2 != r3) goto L2e
                java.lang.Object r5 = r0.L$0
                androidx.privacysandbox.ads.adservices.adselection.AdSelectionManager$Api33Ext4Impl r5 = (androidx.privacysandbox.ads.adservices.adselection.AdSelectionManager.Api33Ext4Impl) r5
                kotlin.ResultKt.throwOnFailure(r6)
                goto L49
            L2e:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L36:
                kotlin.ResultKt.throwOnFailure(r6)
                android.adservices.adselection.AdSelectionConfig r5 = r4.convertAdSelectionConfig(r5)
                r0.L$0 = r4
                r0.label = r3
                java.lang.Object r6 = r4.selectAdsInternal(r5, r0)
                if (r6 != r1) goto L48
                return r1
            L48:
                r5 = r4
            L49:
                android.adservices.adselection.AdSelectionOutcome r6 = (android.adservices.adselection.AdSelectionOutcome) r6
                androidx.privacysandbox.ads.adservices.adselection.AdSelectionOutcome r5 = r5.convertResponse(r6)
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.privacysandbox.ads.adservices.adselection.AdSelectionManager.Api33Ext4Impl.selectAds(androidx.privacysandbox.ads.adservices.adselection.AdSelectionConfig, kotlin.coroutines.Continuation):java.lang.Object");
        }

        private final android.adservices.adselection.AdSelectionConfig convertAdSelectionConfig(AdSelectionConfig request) {
            android.adservices.adselection.AdSelectionConfig adSelectionConfigBuild = new AdSelectionConfig.Builder().setAdSelectionSignals(convertAdSelectionSignals(request.getAdSelectionSignals())).setCustomAudienceBuyers(convertBuyers(request.getCustomAudienceBuyers())).setDecisionLogicUri(request.getDecisionLogicUri()).setSeller(AdTechIdentifier.fromString(request.getSeller().getIdentifier())).setPerBuyerSignals(convertPerBuyerSignals(request.getPerBuyerSignals())).setSellerSignals(convertAdSelectionSignals(request.getSellerSignals())).setTrustedScoringSignalsUri(request.getTrustedScoringSignalsUri()).build();
            Intrinsics.checkNotNullExpressionValue(adSelectionConfigBuild, "Builder()\n              …\n                .build()");
            return adSelectionConfigBuild;
        }

        private final AdSelectionSignals convertAdSelectionSignals(androidx.privacysandbox.ads.adservices.common.AdSelectionSignals request) {
            AdSelectionSignals adSelectionSignalsFromString = AdSelectionSignals.fromString(request.getSignals());
            Intrinsics.checkNotNullExpressionValue(adSelectionSignalsFromString, "fromString(request.signals)");
            return adSelectionSignalsFromString;
        }

        private final List<AdTechIdentifier> convertBuyers(List<androidx.privacysandbox.ads.adservices.common.AdTechIdentifier> buyers) {
            ArrayList arrayList = new ArrayList();
            Iterator<androidx.privacysandbox.ads.adservices.common.AdTechIdentifier> it = buyers.iterator();
            while (it.hasNext()) {
                AdTechIdentifier adTechIdentifierFromString = AdTechIdentifier.fromString(it.next().getIdentifier());
                Intrinsics.checkNotNullExpressionValue(adTechIdentifierFromString, "fromString(buyer.identifier)");
                arrayList.add(adTechIdentifierFromString);
            }
            return arrayList;
        }

        private final Map<AdTechIdentifier, AdSelectionSignals> convertPerBuyerSignals(Map<androidx.privacysandbox.ads.adservices.common.AdTechIdentifier, androidx.privacysandbox.ads.adservices.common.AdSelectionSignals> request) {
            AdSelectionSignals adSelectionSignalsConvertAdSelectionSignals;
            HashMap map = new HashMap();
            for (androidx.privacysandbox.ads.adservices.common.AdTechIdentifier adTechIdentifier : request.keySet()) {
                AdTechIdentifier adTechIdentifierFromString = AdTechIdentifier.fromString(adTechIdentifier.getIdentifier());
                Intrinsics.checkNotNullExpressionValue(adTechIdentifierFromString, "fromString(key.identifier)");
                if (request.get(adTechIdentifier) != null) {
                    androidx.privacysandbox.ads.adservices.common.AdSelectionSignals adSelectionSignals = request.get(adTechIdentifier);
                    Intrinsics.checkNotNull(adSelectionSignals);
                    adSelectionSignalsConvertAdSelectionSignals = convertAdSelectionSignals(adSelectionSignals);
                } else {
                    adSelectionSignalsConvertAdSelectionSignals = null;
                }
                map.put(adTechIdentifierFromString, adSelectionSignalsConvertAdSelectionSignals);
            }
            return map;
        }

        private final AdSelectionOutcome convertResponse(android.adservices.adselection.AdSelectionOutcome response) {
            long adSelectionId = response.getAdSelectionId();
            Uri renderUri = response.getRenderUri();
            Intrinsics.checkNotNullExpressionValue(renderUri, "response.renderUri");
            return new AdSelectionOutcome(adSelectionId, renderUri);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final android.adservices.adselection.ReportImpressionRequest convertReportImpressionRequest(ReportImpressionRequest request) {
            return new android.adservices.adselection.ReportImpressionRequest(request.getAdSelectionId(), convertAdSelectionConfig(request.getAdSelectionConfig()));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Object selectAdsInternal(android.adservices.adselection.AdSelectionConfig adSelectionConfig, Continuation<? super android.adservices.adselection.AdSelectionOutcome> continuation) {
            CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
            cancellableContinuationImpl.initCancellability();
            this.mAdSelectionManager.selectAds(adSelectionConfig, AdIdManager$Api33Ext4Impl$$ExternalSyntheticLambda0.INSTANCE, OutcomeReceiverKt.asOutcomeReceiver(cancellableContinuationImpl));
            Object result = cancellableContinuationImpl.getResult();
            if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                DebugProbesKt.probeCoroutineSuspended(continuation);
            }
            return result;
        }

        @Override // androidx.privacysandbox.ads.adservices.adselection.AdSelectionManager
        public Object reportImpression(ReportImpressionRequest reportImpressionRequest, Continuation<? super Unit> continuation) {
            CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
            cancellableContinuationImpl.initCancellability();
            this.mAdSelectionManager.reportImpression(convertReportImpressionRequest(reportImpressionRequest), AdIdManager$Api33Ext4Impl$$ExternalSyntheticLambda0.INSTANCE, OutcomeReceiverKt.asOutcomeReceiver(cancellableContinuationImpl));
            Object result = cancellableContinuationImpl.getResult();
            if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                DebugProbesKt.probeCoroutineSuspended(continuation);
            }
            return result == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? result : Unit.INSTANCE;
        }
    }

    /* compiled from: AdSelectionManager.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, d2 = {"Landroidx/privacysandbox/ads/adservices/adselection/AdSelectionManager$Companion;", "", "()V", "obtain", "Landroidx/privacysandbox/ads/adservices/adselection/AdSelectionManager;", "context", "Landroid/content/Context;", "ads-adservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final AdSelectionManager obtain(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            if (AdServicesInfo.INSTANCE.version() >= 4) {
                return new Api33Ext4Impl(context);
            }
            return null;
        }
    }
}
