package com.vungle.ads;

import android.content.Context;
import com.json.id;
import com.json.t2;
import com.vungle.ads.ServiceLocator;
import com.vungle.ads.internal.AdInternal;
import com.vungle.ads.internal.load.AdLoaderCallback;
import com.vungle.ads.internal.model.AdPayload;
import com.vungle.ads.internal.protos.Sdk;
import com.vungle.ads.internal.signals.SignalManager;
import com.vungle.ads.internal.signals.SignaledAd;
import com.vungle.ads.internal.util.ThreadUtil;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BaseAd.kt */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\r\u00109\u001a\u00020:H\u0016¢\u0006\u0002\u0010;J\u0015\u0010<\u001a\u00020\f2\u0006\u0010\u0002\u001a\u00020\u0003H ¢\u0006\u0002\b=J\u0012\u0010>\u001a\u00020?2\b\u0010@\u001a\u0004\u0018\u00010\u0005H\u0016J\u0015\u0010A\u001a\u00020?2\u0006\u0010B\u001a\u00020CH\u0010¢\u0006\u0002\bDJ\b\u0010E\u001a\u00020?H\u0002J\u001d\u0010F\u001a\u00020?2\u0006\u0010G\u001a\u00020\u00002\u0006\u0010H\u001a\u00020IH\u0010¢\u0006\u0002\bJJ\u001f\u0010K\u001a\u00020?2\u0006\u0010G\u001a\u00020\u00002\b\u0010@\u001a\u0004\u0018\u00010\u0005H\u0010¢\u0006\u0002\bLR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001b\u0010\u000b\u001a\u00020\f8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\"\u0010\u001a\u001a\u0004\u0018\u00010\u00052\b\u0010\u0019\u001a\u0004\u0018\u00010\u0005@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001d\u001a\u00020\u001eX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\"\u0010!\u001a\u0004\u0018\u00010\u00052\b\u0010\u0019\u001a\u0004\u0018\u00010\u0005@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001cR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001cR\u001c\u0010$\u001a\u00020%8\u0000X\u0081\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u0014\u0010*\u001a\u00020%X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b+\u0010)R\u0014\u0010,\u001a\u00020%X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b-\u0010)R\u001b\u0010.\u001a\u00020/8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b2\u0010\u0010\u001a\u0004\b0\u00101R\u001c\u00103\u001a\u0004\u0018\u000104X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b5\u00106\"\u0004\b7\u00108¨\u0006M"}, d2 = {"Lcom/vungle/ads/BaseAd;", "Lcom/vungle/ads/Ad;", "context", "Landroid/content/Context;", t2.k, "", "adConfig", "Lcom/vungle/ads/AdConfig;", "(Landroid/content/Context;Ljava/lang/String;Lcom/vungle/ads/AdConfig;)V", "getAdConfig", "()Lcom/vungle/ads/AdConfig;", "adInternal", "Lcom/vungle/ads/internal/AdInternal;", "getAdInternal", "()Lcom/vungle/ads/internal/AdInternal;", "adInternal$delegate", "Lkotlin/Lazy;", "adListener", "Lcom/vungle/ads/BaseAdListener;", "getAdListener", "()Lcom/vungle/ads/BaseAdListener;", "setAdListener", "(Lcom/vungle/ads/BaseAdListener;)V", "getContext", "()Landroid/content/Context;", "<set-?>", "creativeId", "getCreativeId", "()Ljava/lang/String;", "displayToClickMetric", "Lcom/vungle/ads/OneShotTimeIntervalMetric;", "getDisplayToClickMetric$vungle_ads_release", "()Lcom/vungle/ads/OneShotTimeIntervalMetric;", "eventId", "getEventId", "getPlacementId", "requestToResponseMetric", "Lcom/vungle/ads/TimeIntervalMetric;", "getRequestToResponseMetric$vungle_ads_release$annotations", "()V", "getRequestToResponseMetric$vungle_ads_release", "()Lcom/vungle/ads/TimeIntervalMetric;", "responseToShowMetric", "getResponseToShowMetric$vungle_ads_release", "showToDisplayMetric", "getShowToDisplayMetric$vungle_ads_release", "signalManager", "Lcom/vungle/ads/internal/signals/SignalManager;", "getSignalManager", "()Lcom/vungle/ads/internal/signals/SignalManager;", "signalManager$delegate", "signaledAd", "Lcom/vungle/ads/internal/signals/SignaledAd;", "getSignaledAd$vungle_ads_release", "()Lcom/vungle/ads/internal/signals/SignaledAd;", "setSignaledAd$vungle_ads_release", "(Lcom/vungle/ads/internal/signals/SignaledAd;)V", "canPlayAd", "", "()Ljava/lang/Boolean;", "constructAdInternal", "constructAdInternal$vungle_ads_release", "load", "", "adMarkup", id.j, "advertisement", "Lcom/vungle/ads/internal/model/AdPayload;", "onAdLoaded$vungle_ads_release", "onLoadEnd", "onLoadFailure", "baseAd", "vungleError", "Lcom/vungle/ads/VungleError;", "onLoadFailure$vungle_ads_release", "onLoadSuccess", "onLoadSuccess$vungle_ads_release", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes2.dex */
public abstract class BaseAd implements Ad {
    private final AdConfig adConfig;

    /* renamed from: adInternal$delegate, reason: from kotlin metadata */
    private final Lazy adInternal;
    private BaseAdListener adListener;
    private final Context context;
    private String creativeId;
    private final OneShotTimeIntervalMetric displayToClickMetric;
    private String eventId;
    private final String placementId;
    private final TimeIntervalMetric requestToResponseMetric;
    private final TimeIntervalMetric responseToShowMetric;
    private final TimeIntervalMetric showToDisplayMetric;

    /* renamed from: signalManager$delegate, reason: from kotlin metadata */
    private final Lazy signalManager;
    private SignaledAd signaledAd;

    public static /* synthetic */ void getRequestToResponseMetric$vungle_ads_release$annotations() {
    }

    public abstract AdInternal constructAdInternal$vungle_ads_release(Context context);

    public BaseAd(final Context context, String placementId, AdConfig adConfig) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(placementId, "placementId");
        Intrinsics.checkNotNullParameter(adConfig, "adConfig");
        this.context = context;
        this.placementId = placementId;
        this.adConfig = adConfig;
        this.adInternal = LazyKt.lazy(new Function0<AdInternal>() { // from class: com.vungle.ads.BaseAd$adInternal$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final AdInternal invoke() {
                BaseAd baseAd = this.this$0;
                return baseAd.constructAdInternal$vungle_ads_release(baseAd.getContext());
            }
        });
        ServiceLocator.Companion companion = ServiceLocator.INSTANCE;
        this.signalManager = LazyKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, (Function0) new Function0<SignalManager>() { // from class: com.vungle.ads.BaseAd$special$$inlined$inject$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.vungle.ads.internal.signals.SignalManager, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final SignalManager invoke() {
                return ServiceLocator.INSTANCE.getInstance(context).getService(SignalManager.class);
            }
        });
        this.requestToResponseMetric = new TimeIntervalMetric(Sdk.SDKMetric.SDKMetricType.AD_REQUEST_TO_RESPONSE_DURATION_MS);
        this.responseToShowMetric = new TimeIntervalMetric(Sdk.SDKMetric.SDKMetricType.AD_RESPONSE_TO_SHOW_DURATION_MS);
        this.showToDisplayMetric = new TimeIntervalMetric(Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_DISPLAY_DURATION_MS);
        this.displayToClickMetric = new OneShotTimeIntervalMetric(Sdk.SDKMetric.SDKMetricType.AD_DISPLAY_TO_CLICK_DURATION_MS);
    }

    public final Context getContext() {
        return this.context;
    }

    public final String getPlacementId() {
        return this.placementId;
    }

    public final AdConfig getAdConfig() {
        return this.adConfig;
    }

    public final BaseAdListener getAdListener() {
        return this.adListener;
    }

    public final void setAdListener(BaseAdListener baseAdListener) {
        this.adListener = baseAdListener;
    }

    public final AdInternal getAdInternal() {
        return (AdInternal) this.adInternal.getValue();
    }

    public final SignalManager getSignalManager() {
        return (SignalManager) this.signalManager.getValue();
    }

    /* renamed from: getRequestToResponseMetric$vungle_ads_release, reason: from getter */
    public final TimeIntervalMetric getRequestToResponseMetric() {
        return this.requestToResponseMetric;
    }

    /* renamed from: getResponseToShowMetric$vungle_ads_release, reason: from getter */
    public final TimeIntervalMetric getResponseToShowMetric() {
        return this.responseToShowMetric;
    }

    /* renamed from: getShowToDisplayMetric$vungle_ads_release, reason: from getter */
    public final TimeIntervalMetric getShowToDisplayMetric() {
        return this.showToDisplayMetric;
    }

    /* renamed from: getDisplayToClickMetric$vungle_ads_release, reason: from getter */
    public final OneShotTimeIntervalMetric getDisplayToClickMetric() {
        return this.displayToClickMetric;
    }

    /* renamed from: getSignaledAd$vungle_ads_release, reason: from getter */
    public final SignaledAd getSignaledAd() {
        return this.signaledAd;
    }

    public final void setSignaledAd$vungle_ads_release(SignaledAd signaledAd) {
        this.signaledAd = signaledAd;
    }

    @Override // com.vungle.ads.Ad
    public Boolean canPlayAd() {
        return Boolean.valueOf(AdInternal.canPlayAd$default(getAdInternal(), false, 1, null) == null);
    }

    public final String getCreativeId() {
        return this.creativeId;
    }

    public final String getEventId() {
        return this.eventId;
    }

    @Override // com.vungle.ads.Ad
    public void load(final String adMarkup) {
        this.requestToResponseMetric.markStart();
        getAdInternal().loadAd(this.placementId, adMarkup, new AdLoaderCallback() { // from class: com.vungle.ads.BaseAd.load.1
            @Override // com.vungle.ads.internal.load.AdLoaderCallback
            public void onSuccess(AdPayload advertisement) {
                Intrinsics.checkNotNullParameter(advertisement, "advertisement");
                BaseAd.this.onAdLoaded$vungle_ads_release(advertisement);
                BaseAd baseAd = BaseAd.this;
                baseAd.onLoadSuccess$vungle_ads_release(baseAd, adMarkup);
            }

            @Override // com.vungle.ads.internal.load.AdLoaderCallback
            public void onFailure(VungleError error) {
                Intrinsics.checkNotNullParameter(error, "error");
                BaseAd baseAd = BaseAd.this;
                baseAd.onLoadFailure$vungle_ads_release(baseAd, error);
            }
        });
    }

    public void onAdLoaded$vungle_ads_release(AdPayload advertisement) {
        Intrinsics.checkNotNullParameter(advertisement, "advertisement");
        advertisement.setAdConfig(this.adConfig);
        this.creativeId = advertisement.getCreativeId();
        String strEventId = advertisement.eventId();
        this.eventId = strEventId;
        SignaledAd signaledAd = this.signaledAd;
        if (signaledAd == null) {
            return;
        }
        signaledAd.setEventId(strEventId);
    }

    public void onLoadSuccess$vungle_ads_release(BaseAd baseAd, String adMarkup) {
        Intrinsics.checkNotNullParameter(baseAd, "baseAd");
        ThreadUtil.INSTANCE.runOnUiThread(new Runnable() { // from class: com.vungle.ads.BaseAd$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                BaseAd.m872onLoadSuccess$lambda0(this.f$0);
            }
        });
        onLoadEnd();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onLoadSuccess$lambda-0, reason: not valid java name */
    public static final void m872onLoadSuccess$lambda0(BaseAd this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        BaseAdListener baseAdListener = this$0.adListener;
        if (baseAdListener != null) {
            baseAdListener.onAdLoaded(this$0);
        }
    }

    public void onLoadFailure$vungle_ads_release(BaseAd baseAd, final VungleError vungleError) {
        Intrinsics.checkNotNullParameter(baseAd, "baseAd");
        Intrinsics.checkNotNullParameter(vungleError, "vungleError");
        ThreadUtil.INSTANCE.runOnUiThread(new Runnable() { // from class: com.vungle.ads.BaseAd$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                BaseAd.m871onLoadFailure$lambda1(this.f$0, vungleError);
            }
        });
        onLoadEnd();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onLoadFailure$lambda-1, reason: not valid java name */
    public static final void m871onLoadFailure$lambda1(BaseAd this$0, VungleError vungleError) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(vungleError, "$vungleError");
        BaseAdListener baseAdListener = this$0.adListener;
        if (baseAdListener != null) {
            baseAdListener.onAdFailedToLoad(this$0, vungleError);
        }
    }

    private final void onLoadEnd() {
        this.requestToResponseMetric.markEnd();
        AnalyticsClient.logMetric$vungle_ads_release$default(AnalyticsClient.INSTANCE, this.requestToResponseMetric, this.placementId, this.creativeId, this.eventId, (String) null, 16, (Object) null);
        this.responseToShowMetric.markStart();
    }
}
