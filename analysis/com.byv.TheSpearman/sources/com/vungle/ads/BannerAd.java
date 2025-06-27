package com.vungle.ads;

import android.content.Context;
import com.json.t2;
import com.vungle.ads.internal.AdInternal;
import com.vungle.ads.internal.model.AdPayload;
import com.vungle.ads.internal.model.Placement;
import com.vungle.ads.internal.presenter.AdPlayCallbackWrapper;
import com.vungle.ads.internal.protos.Sdk;
import com.vungle.ads.internal.util.Logger;
import com.vungle.ads.internal.util.ThreadUtil;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BannerAd.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bB'\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\u0015\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0002\u001a\u00020\u0003H\u0010¢\u0006\u0002\b\u0012J\u0006\u0010\u0013\u001a\u00020\u0014J\b\u0010\u0015\u001a\u0004\u0018\u00010\u000fR\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/vungle/ads/BannerAd;", "Lcom/vungle/ads/BaseAd;", "context", "Landroid/content/Context;", t2.k, "", t2.h.O, "Lcom/vungle/ads/BannerAdSize;", "(Landroid/content/Context;Ljava/lang/String;Lcom/vungle/ads/BannerAdSize;)V", "adConfig", "Lcom/vungle/ads/AdConfig;", "(Landroid/content/Context;Ljava/lang/String;Lcom/vungle/ads/BannerAdSize;Lcom/vungle/ads/AdConfig;)V", "adPlayCallback", "Lcom/vungle/ads/internal/presenter/AdPlayCallbackWrapper;", "bannerView", "Lcom/vungle/ads/BannerView;", "constructAdInternal", "Lcom/vungle/ads/BannerAdInternal;", "constructAdInternal$vungle_ads_release", "finishAd", "", "getBannerView", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class BannerAd extends BaseAd {
    private final AdPlayCallbackWrapper adPlayCallback;
    private BannerAdSize adSize;
    private BannerView bannerView;

    private BannerAd(Context context, String str, BannerAdSize bannerAdSize, AdConfig adConfig) {
        super(context, str, adConfig);
        this.adSize = bannerAdSize;
        AdInternal adInternal = getAdInternal();
        Intrinsics.checkNotNull(adInternal, "null cannot be cast to non-null type com.vungle.ads.BannerAdInternal");
        this.adPlayCallback = ((BannerAdInternal) adInternal).wrapCallback$vungle_ads_release(new BannerAd$adPlayCallback$1(this, str));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BannerAd(Context context, String placementId, BannerAdSize adSize) {
        this(context, placementId, adSize, new AdConfig());
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(placementId, "placementId");
        Intrinsics.checkNotNullParameter(adSize, "adSize");
    }

    @Override // com.vungle.ads.BaseAd
    public BannerAdInternal constructAdInternal$vungle_ads_release(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return new BannerAdInternal(context, this.adSize);
    }

    public final void finishAd() {
        BannerView bannerView = this.bannerView;
        if (bannerView != null) {
            bannerView.finishAdInternal(true);
        }
    }

    public final BannerView getBannerView() {
        Placement placement;
        AnalyticsClient.INSTANCE.logMetric$vungle_ads_release(new SingleValueMetric(Sdk.SDKMetric.SDKMetricType.PLAY_AD_API), (16 & 2) != 0 ? null : getPlacementId(), (16 & 4) != 0 ? null : getCreativeId(), (16 & 8) != 0 ? null : getEventId(), (16 & 16) != 0 ? null : null);
        BannerView bannerView = this.bannerView;
        if (bannerView != null) {
            return bannerView;
        }
        final VungleError vungleErrorCanPlayAd = getAdInternal().canPlayAd(true);
        if (vungleErrorCanPlayAd != null) {
            if (getAdInternal().isErrorTerminal$vungle_ads_release(vungleErrorCanPlayAd.getCode())) {
                getAdInternal().setAdState(AdInternal.AdState.ERROR);
            }
            ThreadUtil.INSTANCE.runOnUiThread(new Runnable() { // from class: com.vungle.ads.BannerAd$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    BannerAd.m856getBannerView$lambda0(this.f$0, vungleErrorCanPlayAd);
                }
            });
            return null;
        }
        AdPayload advertisement = getAdInternal().getAdvertisement();
        if (advertisement == null || (placement = getAdInternal().getPlacement()) == null) {
            return null;
        }
        getAdInternal().cancelDownload$vungle_ads_release();
        try {
            try {
                this.bannerView = new BannerView(getContext(), placement, advertisement, this.adSize, getAdConfig(), this.adPlayCallback, getAdInternal().getBidPayload());
                getResponseToShowMetric().markEnd();
                AnalyticsClient.logMetric$vungle_ads_release$default(AnalyticsClient.INSTANCE, getResponseToShowMetric(), getPlacementId(), getCreativeId(), getEventId(), (String) null, 16, (Object) null);
                getShowToDisplayMetric().markStart();
                return this.bannerView;
            } catch (InstantiationException e) {
                Logger.INSTANCE.e("BannerAd", "Can not create banner view: " + e.getMessage(), e);
                getResponseToShowMetric().markEnd();
                AnalyticsClient.logMetric$vungle_ads_release$default(AnalyticsClient.INSTANCE, getResponseToShowMetric(), getPlacementId(), getCreativeId(), getEventId(), (String) null, 16, (Object) null);
                return null;
            }
        } catch (Throwable th) {
            getResponseToShowMetric().markEnd();
            AnalyticsClient.logMetric$vungle_ads_release$default(AnalyticsClient.INSTANCE, getResponseToShowMetric(), getPlacementId(), getCreativeId(), getEventId(), (String) null, 16, (Object) null);
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: getBannerView$lambda-0, reason: not valid java name */
    public static final void m856getBannerView$lambda0(BannerAd this$0, VungleError vungleError) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        BaseAdListener adListener = this$0.getAdListener();
        if (adListener != null) {
            adListener.onAdFailedToPlay(this$0, vungleError);
        }
    }
}
