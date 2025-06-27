package com.vungle.ads;

import android.content.Context;
import com.json.id;
import com.json.t2;
import com.vungle.ads.BaseFullscreenAd;
import com.vungle.ads.internal.model.AdPayload;
import com.vungle.ads.internal.presenter.AdPlayCallback;
import com.vungle.ads.internal.protos.Sdk;
import com.vungle.ads.internal.signals.SignaledAd;
import com.vungle.ads.internal.util.ThreadUtil;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BaseFullscreenAd.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u00012\u00020\u0002B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u0012\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0006H\u0016J\u0015\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000fH\u0010¢\u0006\u0002\b\u0010J\u0012\u0010\u0011\u001a\u00020\u000b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004H\u0016¨\u0006\u0012"}, d2 = {"Lcom/vungle/ads/BaseFullscreenAd;", "Lcom/vungle/ads/BaseAd;", "Lcom/vungle/ads/FullscreenAd;", "context", "Landroid/content/Context;", t2.k, "", "adConfig", "Lcom/vungle/ads/AdConfig;", "(Landroid/content/Context;Ljava/lang/String;Lcom/vungle/ads/AdConfig;)V", "load", "", "adMarkup", id.j, "advertisement", "Lcom/vungle/ads/internal/model/AdPayload;", "onAdLoaded$vungle_ads_release", "play", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes2.dex */
public abstract class BaseFullscreenAd extends BaseAd implements FullscreenAd {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseFullscreenAd(Context context, String placementId, AdConfig adConfig) {
        super(context, placementId, adConfig);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(placementId, "placementId");
        Intrinsics.checkNotNullParameter(adConfig, "adConfig");
    }

    @Override // com.vungle.ads.BaseAd, com.vungle.ads.Ad
    public void load(String adMarkup) {
        setSignaledAd$vungle_ads_release(getSignalManager().getSignaledAd(getPlacementId()));
        super.load(adMarkup);
    }

    @Override // com.vungle.ads.BaseAd
    public void onAdLoaded$vungle_ads_release(AdPayload advertisement) {
        Intrinsics.checkNotNullParameter(advertisement, "advertisement");
        super.onAdLoaded$vungle_ads_release(advertisement);
        SignaledAd signaledAd$vungle_ads_release = getSignaledAd();
        if (signaledAd$vungle_ads_release == null) {
            return;
        }
        signaledAd$vungle_ads_release.setAdAvailabilityCallbackTime(System.currentTimeMillis());
    }

    @Override // com.vungle.ads.FullscreenAd
    public void play(Context context) {
        AnalyticsClient.INSTANCE.logMetric$vungle_ads_release(new SingleValueMetric(Sdk.SDKMetric.SDKMetricType.PLAY_AD_API), (16 & 2) != 0 ? null : getPlacementId(), (16 & 4) != 0 ? null : getCreativeId(), (16 & 8) != 0 ? null : getEventId(), (16 & 16) != 0 ? null : null);
        getResponseToShowMetric().markEnd();
        AnalyticsClient.logMetric$vungle_ads_release$default(AnalyticsClient.INSTANCE, getResponseToShowMetric(), getPlacementId(), getCreativeId(), getEventId(), (String) null, 16, (Object) null);
        getShowToDisplayMetric().markStart();
        SignaledAd signaledAd$vungle_ads_release = getSignaledAd();
        if (signaledAd$vungle_ads_release != null) {
            signaledAd$vungle_ads_release.setPlayAdTime(System.currentTimeMillis());
            signaledAd$vungle_ads_release.calculateTimeBetweenAdAvailabilityAndPlayAd();
            getSignalManager().registerSignaledAd(context, signaledAd$vungle_ads_release);
        }
        getAdInternal().play(context, new AnonymousClass2());
    }

    /* compiled from: BaseFullscreenAd.kt */
    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u0006\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u0007\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\b\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\t\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\n\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\rH\u0016¨\u0006\u000e"}, d2 = {"com/vungle/ads/BaseFullscreenAd$play$2", "Lcom/vungle/ads/internal/presenter/AdPlayCallback;", "onAdClick", "", "id", "", "onAdEnd", "onAdImpression", id.k, id.i, "onAdStart", "onFailure", "error", "Lcom/vungle/ads/VungleError;", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    /* renamed from: com.vungle.ads.BaseFullscreenAd$play$2, reason: invalid class name */
    public static final class AnonymousClass2 implements AdPlayCallback {
        AnonymousClass2() {
        }

        @Override // com.vungle.ads.internal.presenter.AdPlayCallback
        public void onAdStart(String id) {
            BaseFullscreenAd.this.getSignalManager().increaseSessionDepthCounter();
            ThreadUtil threadUtil = ThreadUtil.INSTANCE;
            final BaseFullscreenAd baseFullscreenAd = BaseFullscreenAd.this;
            threadUtil.runOnUiThread(new Runnable() { // from class: com.vungle.ads.BaseFullscreenAd$play$2$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    BaseFullscreenAd.AnonymousClass2.m880onAdStart$lambda0(baseFullscreenAd);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: onAdStart$lambda-0, reason: not valid java name */
        public static final void m880onAdStart$lambda0(BaseFullscreenAd this$0) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            BaseAdListener adListener = this$0.getAdListener();
            if (adListener != null) {
                adListener.onAdStart(this$0);
            }
        }

        @Override // com.vungle.ads.internal.presenter.AdPlayCallback
        public void onAdImpression(String id) {
            ThreadUtil threadUtil = ThreadUtil.INSTANCE;
            final BaseFullscreenAd baseFullscreenAd = BaseFullscreenAd.this;
            threadUtil.runOnUiThread(new Runnable() { // from class: com.vungle.ads.BaseFullscreenAd$play$2$$ExternalSyntheticLambda5
                @Override // java.lang.Runnable
                public final void run() {
                    BaseFullscreenAd.AnonymousClass2.m877onAdImpression$lambda1(baseFullscreenAd);
                }
            });
            BaseFullscreenAd.this.getShowToDisplayMetric().markEnd();
            AnalyticsClient.logMetric$vungle_ads_release$default(AnalyticsClient.INSTANCE, BaseFullscreenAd.this.getShowToDisplayMetric(), BaseFullscreenAd.this.getPlacementId(), BaseFullscreenAd.this.getCreativeId(), BaseFullscreenAd.this.getEventId(), (String) null, 16, (Object) null);
            BaseFullscreenAd.this.getDisplayToClickMetric().markStart();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: onAdImpression$lambda-1, reason: not valid java name */
        public static final void m877onAdImpression$lambda1(BaseFullscreenAd this$0) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            BaseAdListener adListener = this$0.getAdListener();
            if (adListener != null) {
                adListener.onAdImpression(this$0);
            }
        }

        @Override // com.vungle.ads.internal.presenter.AdPlayCallback
        public void onAdEnd(String id) {
            ThreadUtil threadUtil = ThreadUtil.INSTANCE;
            final BaseFullscreenAd baseFullscreenAd = BaseFullscreenAd.this;
            threadUtil.runOnUiThread(new Runnable() { // from class: com.vungle.ads.BaseFullscreenAd$play$2$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    BaseFullscreenAd.AnonymousClass2.m876onAdEnd$lambda2(baseFullscreenAd);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: onAdEnd$lambda-2, reason: not valid java name */
        public static final void m876onAdEnd$lambda2(BaseFullscreenAd this$0) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            BaseAdListener adListener = this$0.getAdListener();
            if (adListener != null) {
                adListener.onAdEnd(this$0);
            }
        }

        @Override // com.vungle.ads.internal.presenter.AdPlayCallback
        public void onAdClick(String id) {
            ThreadUtil threadUtil = ThreadUtil.INSTANCE;
            final BaseFullscreenAd baseFullscreenAd = BaseFullscreenAd.this;
            threadUtil.runOnUiThread(new Runnable() { // from class: com.vungle.ads.BaseFullscreenAd$play$2$$ExternalSyntheticLambda3
                @Override // java.lang.Runnable
                public final void run() {
                    BaseFullscreenAd.AnonymousClass2.m875onAdClick$lambda3(baseFullscreenAd);
                }
            });
            BaseFullscreenAd.this.getDisplayToClickMetric().markEnd();
            AnalyticsClient.INSTANCE.logMetric$vungle_ads_release(BaseFullscreenAd.this.getDisplayToClickMetric(), (16 & 2) != 0 ? null : BaseFullscreenAd.this.getPlacementId(), (16 & 4) != 0 ? null : BaseFullscreenAd.this.getCreativeId(), (16 & 8) != 0 ? null : BaseFullscreenAd.this.getEventId(), (16 & 16) != 0 ? null : null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: onAdClick$lambda-3, reason: not valid java name */
        public static final void m875onAdClick$lambda3(BaseFullscreenAd this$0) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            BaseAdListener adListener = this$0.getAdListener();
            if (adListener != null) {
                adListener.onAdClicked(this$0);
            }
        }

        @Override // com.vungle.ads.internal.presenter.AdPlayCallback
        public void onAdRewarded(String id) {
            ThreadUtil threadUtil = ThreadUtil.INSTANCE;
            final BaseFullscreenAd baseFullscreenAd = BaseFullscreenAd.this;
            threadUtil.runOnUiThread(new Runnable() { // from class: com.vungle.ads.BaseFullscreenAd$play$2$$ExternalSyntheticLambda4
                @Override // java.lang.Runnable
                public final void run() {
                    BaseFullscreenAd.AnonymousClass2.m879onAdRewarded$lambda4(baseFullscreenAd);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: onAdRewarded$lambda-4, reason: not valid java name */
        public static final void m879onAdRewarded$lambda4(BaseFullscreenAd this$0) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            BaseAdListener adListener = this$0.getAdListener();
            RewardedAdListener rewardedAdListener = adListener instanceof RewardedAdListener ? (RewardedAdListener) adListener : null;
            if (rewardedAdListener != null) {
                rewardedAdListener.onAdRewarded(this$0);
            }
        }

        @Override // com.vungle.ads.internal.presenter.AdPlayCallback
        public void onAdLeftApplication(String id) {
            ThreadUtil threadUtil = ThreadUtil.INSTANCE;
            final BaseFullscreenAd baseFullscreenAd = BaseFullscreenAd.this;
            threadUtil.runOnUiThread(new Runnable() { // from class: com.vungle.ads.BaseFullscreenAd$play$2$$ExternalSyntheticLambda2
                @Override // java.lang.Runnable
                public final void run() {
                    BaseFullscreenAd.AnonymousClass2.m878onAdLeftApplication$lambda5(baseFullscreenAd);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: onAdLeftApplication$lambda-5, reason: not valid java name */
        public static final void m878onAdLeftApplication$lambda5(BaseFullscreenAd this$0) {
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
            final BaseFullscreenAd baseFullscreenAd = BaseFullscreenAd.this;
            threadUtil.runOnUiThread(new Runnable() { // from class: com.vungle.ads.BaseFullscreenAd$play$2$$ExternalSyntheticLambda6
                @Override // java.lang.Runnable
                public final void run() {
                    BaseFullscreenAd.AnonymousClass2.m881onFailure$lambda6(baseFullscreenAd, error);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: onFailure$lambda-6, reason: not valid java name */
        public static final void m881onFailure$lambda6(BaseFullscreenAd this$0, VungleError error) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(error, "$error");
            BaseAdListener adListener = this$0.getAdListener();
            if (adListener != null) {
                adListener.onAdFailedToPlay(this$0, error);
            }
        }
    }
}
