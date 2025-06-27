package com.vungle.ads;

import com.json.id;
import com.vungle.ads.internal.presenter.AdPlayCallback;
import com.vungle.ads.internal.util.ThreadUtil;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BannerAd.kt */
@Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u0006\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u0007\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\b\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\t\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\n\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\rH\u0016¨\u0006\u000e"}, d2 = {"com/vungle/ads/BannerAd$adPlayCallback$1", "Lcom/vungle/ads/internal/presenter/AdPlayCallback;", "onAdClick", "", "id", "", "onAdEnd", "onAdImpression", id.k, id.i, "onAdStart", "onFailure", "error", "Lcom/vungle/ads/VungleError;", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class BannerAd$adPlayCallback$1 implements AdPlayCallback {
    final /* synthetic */ String $placementId;
    final /* synthetic */ BannerAd this$0;

    @Override // com.vungle.ads.internal.presenter.AdPlayCallback
    public void onAdRewarded(String id) {
    }

    BannerAd$adPlayCallback$1(BannerAd bannerAd, String str) {
        this.this$0 = bannerAd;
        this.$placementId = str;
    }

    @Override // com.vungle.ads.internal.presenter.AdPlayCallback
    public void onAdStart(String id) {
        this.this$0.getSignalManager().increaseSessionDepthCounter();
        ThreadUtil threadUtil = ThreadUtil.INSTANCE;
        final BannerAd bannerAd = this.this$0;
        threadUtil.runOnUiThread(new Runnable() { // from class: com.vungle.ads.BannerAd$adPlayCallback$1$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                BannerAd$adPlayCallback$1.m864onAdStart$lambda0(bannerAd);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onAdStart$lambda-0, reason: not valid java name */
    public static final void m864onAdStart$lambda0(BannerAd this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        BaseAdListener adListener = this$0.getAdListener();
        if (adListener != null) {
            adListener.onAdStart(this$0);
        }
    }

    @Override // com.vungle.ads.internal.presenter.AdPlayCallback
    public void onAdImpression(String id) {
        ThreadUtil threadUtil = ThreadUtil.INSTANCE;
        final BannerAd bannerAd = this.this$0;
        threadUtil.runOnUiThread(new Runnable() { // from class: com.vungle.ads.BannerAd$adPlayCallback$1$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                BannerAd$adPlayCallback$1.m862onAdImpression$lambda1(bannerAd);
            }
        });
        this.this$0.getShowToDisplayMetric().markEnd();
        AnalyticsClient.logMetric$vungle_ads_release$default(AnalyticsClient.INSTANCE, this.this$0.getShowToDisplayMetric(), this.$placementId, this.this$0.getCreativeId(), this.this$0.getEventId(), (String) null, 16, (Object) null);
        this.this$0.getDisplayToClickMetric().markStart();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onAdImpression$lambda-1, reason: not valid java name */
    public static final void m862onAdImpression$lambda1(BannerAd this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        BaseAdListener adListener = this$0.getAdListener();
        if (adListener != null) {
            adListener.onAdImpression(this$0);
        }
    }

    @Override // com.vungle.ads.internal.presenter.AdPlayCallback
    public void onAdEnd(String id) {
        ThreadUtil threadUtil = ThreadUtil.INSTANCE;
        final BannerAd bannerAd = this.this$0;
        threadUtil.runOnUiThread(new Runnable() { // from class: com.vungle.ads.BannerAd$adPlayCallback$1$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                BannerAd$adPlayCallback$1.m861onAdEnd$lambda2(bannerAd);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onAdEnd$lambda-2, reason: not valid java name */
    public static final void m861onAdEnd$lambda2(BannerAd this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        BaseAdListener adListener = this$0.getAdListener();
        if (adListener != null) {
            adListener.onAdEnd(this$0);
        }
    }

    @Override // com.vungle.ads.internal.presenter.AdPlayCallback
    public void onAdClick(String id) {
        ThreadUtil threadUtil = ThreadUtil.INSTANCE;
        final BannerAd bannerAd = this.this$0;
        threadUtil.runOnUiThread(new Runnable() { // from class: com.vungle.ads.BannerAd$adPlayCallback$1$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                BannerAd$adPlayCallback$1.m860onAdClick$lambda3(bannerAd);
            }
        });
        this.this$0.getDisplayToClickMetric().markEnd();
        AnalyticsClient.INSTANCE.logMetric$vungle_ads_release(this.this$0.getDisplayToClickMetric(), (16 & 2) != 0 ? null : this.$placementId, (16 & 4) != 0 ? null : this.this$0.getCreativeId(), (16 & 8) != 0 ? null : this.this$0.getEventId(), (16 & 16) != 0 ? null : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onAdClick$lambda-3, reason: not valid java name */
    public static final void m860onAdClick$lambda3(BannerAd this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        BaseAdListener adListener = this$0.getAdListener();
        if (adListener != null) {
            adListener.onAdClicked(this$0);
        }
    }

    @Override // com.vungle.ads.internal.presenter.AdPlayCallback
    public void onAdLeftApplication(String id) {
        ThreadUtil threadUtil = ThreadUtil.INSTANCE;
        final BannerAd bannerAd = this.this$0;
        threadUtil.runOnUiThread(new Runnable() { // from class: com.vungle.ads.BannerAd$adPlayCallback$1$$ExternalSyntheticLambda4
            @Override // java.lang.Runnable
            public final void run() {
                BannerAd$adPlayCallback$1.m863onAdLeftApplication$lambda4(bannerAd);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onAdLeftApplication$lambda-4, reason: not valid java name */
    public static final void m863onAdLeftApplication$lambda4(BannerAd this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        BaseAdListener adListener = this$0.getAdListener();
        if (adListener != null) {
            adListener.onAdLeftApplication(this$0);
        }
    }

    @Override // com.vungle.ads.internal.presenter.AdPlayCallback
    public void onFailure(final VungleError error) {
        Intrinsics.checkNotNullParameter(error, "error");
        ThreadUtil threadUtil = ThreadUtil.INSTANCE;
        final BannerAd bannerAd = this.this$0;
        threadUtil.runOnUiThread(new Runnable() { // from class: com.vungle.ads.BannerAd$adPlayCallback$1$$ExternalSyntheticLambda5
            @Override // java.lang.Runnable
            public final void run() {
                BannerAd$adPlayCallback$1.m865onFailure$lambda5(bannerAd, error);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onFailure$lambda-5, reason: not valid java name */
    public static final void m865onFailure$lambda5(BannerAd this$0, VungleError error) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(error, "$error");
        BaseAdListener adListener = this$0.getAdListener();
        if (adListener != null) {
            adListener.onAdFailedToPlay(this$0, error);
        }
    }
}
