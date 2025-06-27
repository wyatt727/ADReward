package com.vungle.ads;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.json.t2;
import com.json.x6;
import com.vungle.ads.ServiceLocator;
import com.vungle.ads.internal.ConfigManager;
import com.vungle.ads.internal.ImpressionTracker;
import com.vungle.ads.internal.executor.Executors;
import com.vungle.ads.internal.model.AdPayload;
import com.vungle.ads.internal.model.BidPayload;
import com.vungle.ads.internal.model.Placement;
import com.vungle.ads.internal.omsdk.OMTracker;
import com.vungle.ads.internal.platform.Platform;
import com.vungle.ads.internal.presenter.AdEventListener;
import com.vungle.ads.internal.presenter.AdPlayCallback;
import com.vungle.ads.internal.presenter.MRAIDPresenter;
import com.vungle.ads.internal.protos.Sdk;
import com.vungle.ads.internal.ui.VungleWebClient;
import com.vungle.ads.internal.ui.WatermarkView;
import com.vungle.ads.internal.ui.view.MRAIDAdWidget;
import com.vungle.ads.internal.util.Logger;
import com.vungle.ads.internal.util.ViewUtility;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BannerView.kt */
@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0018\u0000 32\u00020\u0001:\u00013B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\u0002\u0010\u0010J\b\u0010)\u001a\u00020*H\u0002J\u000e\u0010+\u001a\u00020*2\u0006\u0010,\u001a\u00020#J\b\u0010-\u001a\u00020*H\u0014J\u0010\u0010.\u001a\u00020*2\u0006\u0010/\u001a\u00020\u0016H\u0014J\b\u00100\u001a\u00020*H\u0002J\u0010\u00101\u001a\u00020*2\u0006\u00102\u001a\u00020#H\u0002R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u001c\u001a\u00020\u001d8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\u001e\u0010\u001fR\u000e\u0010\"\u001a\u00020#X\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0010\u0010&\u001a\u0004\u0018\u00010'X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020\u0019X\u0082\u0004¢\u0006\u0002\n\u0000¨\u00064²\u0006\n\u00105\u001a\u000206X\u008a\u0084\u0002²\u0006\n\u00107\u001a\u000208X\u008a\u0084\u0002²\u0006\n\u00109\u001a\u00020:X\u008a\u0084\u0002"}, d2 = {"Lcom/vungle/ads/BannerView;", "Landroid/widget/RelativeLayout;", "context", "Landroid/content/Context;", "placement", "Lcom/vungle/ads/internal/model/Placement;", "advertisement", "Lcom/vungle/ads/internal/model/AdPayload;", t2.h.O, "Lcom/vungle/ads/BannerAdSize;", "adConfig", "Lcom/vungle/ads/AdConfig;", "adPlayCallback", "Lcom/vungle/ads/internal/presenter/AdPlayCallback;", "bidPayload", "Lcom/vungle/ads/internal/model/BidPayload;", "(Landroid/content/Context;Lcom/vungle/ads/internal/model/Placement;Lcom/vungle/ads/internal/model/AdPayload;Lcom/vungle/ads/BannerAdSize;Lcom/vungle/ads/AdConfig;Lcom/vungle/ads/internal/presenter/AdPlayCallback;Lcom/vungle/ads/internal/model/BidPayload;)V", "adWidget", "Lcom/vungle/ads/internal/ui/view/MRAIDAdWidget;", "getAdvertisement", "()Lcom/vungle/ads/internal/model/AdPayload;", "calculatedPixelHeight", "", "calculatedPixelWidth", "destroyed", "Ljava/util/concurrent/atomic/AtomicBoolean;", "imageView", "Lcom/vungle/ads/internal/ui/WatermarkView;", "impressionTracker", "Lcom/vungle/ads/internal/ImpressionTracker;", "getImpressionTracker", "()Lcom/vungle/ads/internal/ImpressionTracker;", "impressionTracker$delegate", "Lkotlin/Lazy;", "isOnImpressionCalled", "", "getPlacement", "()Lcom/vungle/ads/internal/model/Placement;", "presenter", "Lcom/vungle/ads/internal/presenter/MRAIDPresenter;", "presenterStarted", "checkHardwareAcceleration", "", "finishAdInternal", "isFinishedByApi", "onAttachedToWindow", "onWindowVisibilityChanged", "visibility", "renderAd", "setAdVisibility", x6.k, "Companion", "vungle-ads_release", "executors", "Lcom/vungle/ads/internal/executor/Executors;", "omTrackerFactory", "Lcom/vungle/ads/internal/omsdk/OMTracker$Factory;", "platform", "Lcom/vungle/ads/internal/platform/Platform;"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class BannerView extends RelativeLayout {
    private static final String TAG = "BannerView";
    private MRAIDAdWidget adWidget;
    private final AdPayload advertisement;
    private int calculatedPixelHeight;
    private int calculatedPixelWidth;
    private final AtomicBoolean destroyed;
    private WatermarkView imageView;

    /* renamed from: impressionTracker$delegate, reason: from kotlin metadata */
    private final Lazy impressionTracker;
    private boolean isOnImpressionCalled;
    private final Placement placement;
    private MRAIDPresenter presenter;
    private final AtomicBoolean presenterStarted;

    public final Placement getPlacement() {
        return this.placement;
    }

    public final AdPayload getAdvertisement() {
        return this.advertisement;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BannerView(final Context context, final Placement placement, AdPayload advertisement, BannerAdSize adSize, AdConfig adConfig, final AdPlayCallback adPlayCallback, BidPayload bidPayload) throws InstantiationException {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(placement, "placement");
        Intrinsics.checkNotNullParameter(advertisement, "advertisement");
        Intrinsics.checkNotNullParameter(adSize, "adSize");
        Intrinsics.checkNotNullParameter(adConfig, "adConfig");
        Intrinsics.checkNotNullParameter(adPlayCallback, "adPlayCallback");
        this.placement = placement;
        this.advertisement = advertisement;
        boolean z = false;
        this.destroyed = new AtomicBoolean(false);
        this.presenterStarted = new AtomicBoolean(false);
        this.impressionTracker = LazyKt.lazy(new Function0<ImpressionTracker>() { // from class: com.vungle.ads.BannerView$impressionTracker$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ImpressionTracker invoke() {
                return new ImpressionTracker(context);
            }
        });
        this.calculatedPixelHeight = ViewUtility.INSTANCE.dpToPixels(context, adSize.getHeight());
        this.calculatedPixelWidth = ViewUtility.INSTANCE.dpToPixels(context, adSize.getWidth());
        AdEventListener adEventListener = new AdEventListener(adPlayCallback, placement) { // from class: com.vungle.ads.BannerView$adEventListener$1
        };
        try {
            MRAIDAdWidget mRAIDAdWidget = new MRAIDAdWidget(context);
            this.adWidget = mRAIDAdWidget;
            mRAIDAdWidget.setCloseDelegate(new MRAIDAdWidget.CloseDelegate() { // from class: com.vungle.ads.BannerView.2
                @Override // com.vungle.ads.internal.ui.view.MRAIDAdWidget.CloseDelegate
                public void close() {
                    BannerView.this.finishAdInternal(false);
                }
            });
            ServiceLocator.Companion companion = ServiceLocator.INSTANCE;
            Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, (Function0) new Function0<Executors>() { // from class: com.vungle.ads.BannerView$special$$inlined$inject$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                /* JADX WARN: Type inference failed for: r0v2, types: [com.vungle.ads.internal.executor.Executors, java.lang.Object] */
                @Override // kotlin.jvm.functions.Function0
                public final Executors invoke() {
                    return ServiceLocator.INSTANCE.getInstance(context).getService(Executors.class);
                }
            });
            ServiceLocator.Companion companion2 = ServiceLocator.INSTANCE;
            OMTracker.Factory factoryM868_init_$lambda3 = m868_init_$lambda3(LazyKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, (Function0) new Function0<OMTracker.Factory>() { // from class: com.vungle.ads.BannerView$special$$inlined$inject$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                /* JADX WARN: Type inference failed for: r0v2, types: [com.vungle.ads.internal.omsdk.OMTracker$Factory, java.lang.Object] */
                @Override // kotlin.jvm.functions.Function0
                public final OMTracker.Factory invoke() {
                    return ServiceLocator.INSTANCE.getInstance(context).getService(OMTracker.Factory.class);
                }
            }));
            if (ConfigManager.INSTANCE.omEnabled() && advertisement.omEnabled()) {
                z = true;
            }
            OMTracker oMTrackerMake = factoryM868_init_$lambda3.make(z);
            VungleWebClient vungleWebClient = new VungleWebClient(advertisement, placement, m867_init_$lambda2(lazy).getOFFLOAD_EXECUTOR(), null, 8, null);
            ServiceLocator.Companion companion3 = ServiceLocator.INSTANCE;
            Lazy lazy2 = LazyKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, (Function0) new Function0<Platform>() { // from class: com.vungle.ads.BannerView$special$$inlined$inject$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                /* JADX WARN: Type inference failed for: r0v2, types: [com.vungle.ads.internal.platform.Platform, java.lang.Object] */
                @Override // kotlin.jvm.functions.Function0
                public final Platform invoke() {
                    return ServiceLocator.INSTANCE.getInstance(context).getService(Platform.class);
                }
            });
            vungleWebClient.setWebViewObserver(oMTrackerMake);
            MRAIDPresenter mRAIDPresenter = new MRAIDPresenter(mRAIDAdWidget, advertisement, placement, vungleWebClient, m867_init_$lambda2(lazy).getJOB_EXECUTOR(), oMTrackerMake, bidPayload, m869_init_$lambda4(lazy2));
            mRAIDPresenter.setEventListener(adEventListener);
            this.presenter = mRAIDPresenter;
            String watermark$vungle_ads_release = adConfig.getWatermark$vungle_ads_release();
            if (watermark$vungle_ads_release != null) {
                this.imageView = new WatermarkView(context, watermark$vungle_ads_release);
            }
        } catch (InstantiationException e) {
            AdCantPlayWithoutWebView adCantPlayWithoutWebView = new AdCantPlayWithoutWebView();
            adCantPlayWithoutWebView.setPlacementId$vungle_ads_release(this.placement.getReferenceId());
            adCantPlayWithoutWebView.setEventId$vungle_ads_release(this.advertisement.eventId());
            adCantPlayWithoutWebView.setCreativeId$vungle_ads_release(this.advertisement.getCreativeId());
            adEventListener.onError(adCantPlayWithoutWebView.logError$vungle_ads_release(), this.placement.getReferenceId());
            throw e;
        }
    }

    private final ImpressionTracker getImpressionTracker() {
        return (ImpressionTracker) this.impressionTracker.getValue();
    }

    @Override // android.view.View
    protected void onWindowVisibilityChanged(int visibility) {
        super.onWindowVisibilityChanged(visibility);
        setAdVisibility(visibility == 0);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        Logger.INSTANCE.d(TAG, "onAttachedToWindow()");
        if (!this.presenterStarted.getAndSet(true)) {
            MRAIDPresenter mRAIDPresenter = this.presenter;
            if (mRAIDPresenter != null) {
                mRAIDPresenter.prepare();
            }
            MRAIDPresenter mRAIDPresenter2 = this.presenter;
            if (mRAIDPresenter2 != null) {
                mRAIDPresenter2.start();
            }
            getImpressionTracker().addView(this, new ImpressionTracker.ImpressionListener() { // from class: com.vungle.ads.BannerView$$ExternalSyntheticLambda0
                @Override // com.vungle.ads.internal.ImpressionTracker.ImpressionListener
                public final void onImpression(View view) {
                    BannerView.m870onAttachedToWindow$lambda0(this.f$0, view);
                }
            });
        }
        renderAd();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onAttachedToWindow$lambda-0, reason: not valid java name */
    public static final void m870onAttachedToWindow$lambda0(BannerView this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Logger.INSTANCE.d(TAG, "ImpressionTracker checked the banner view become visible.");
        this$0.isOnImpressionCalled = true;
        this$0.checkHardwareAcceleration();
        this$0.setAdVisibility(this$0.getVisibility() == 0);
    }

    private final void setAdVisibility(boolean isVisible) {
        MRAIDPresenter mRAIDPresenter;
        if (!this.isOnImpressionCalled || this.destroyed.get() || (mRAIDPresenter = this.presenter) == null) {
            return;
        }
        mRAIDPresenter.setAdVisibility(isVisible);
    }

    private final void checkHardwareAcceleration() {
        Logger.INSTANCE.w(TAG, "hardwareAccelerated = " + isHardwareAccelerated());
        if (isHardwareAccelerated()) {
            return;
        }
        AnalyticsClient.INSTANCE.logMetric$vungle_ads_release(Sdk.SDKMetric.SDKMetricType.HARDWARE_ACCELERATE_DISABLED, (34 & 2) != 0 ? 0L : 0L, (34 & 4) != 0 ? null : this.placement.getReferenceId(), (34 & 8) != 0 ? null : this.advertisement.getCreativeId(), (34 & 16) != 0 ? null : this.advertisement.eventId(), (34 & 32) == 0 ? null : null);
    }

    public final void finishAdInternal(boolean isFinishedByApi) {
        if (this.destroyed.get()) {
            return;
        }
        this.destroyed.set(true);
        int i = (isFinishedByApi ? 4 : 0) | 2;
        MRAIDPresenter mRAIDPresenter = this.presenter;
        if (mRAIDPresenter != null) {
            mRAIDPresenter.stop();
        }
        MRAIDPresenter mRAIDPresenter2 = this.presenter;
        if (mRAIDPresenter2 != null) {
            mRAIDPresenter2.detach(i);
        }
        getImpressionTracker().destroy();
        try {
            removeAllViews();
        } catch (Exception e) {
            Logger.INSTANCE.d(TAG, "Removing webView error: " + e);
        }
    }

    private final void renderAd() {
        if (getVisibility() != 0) {
            return;
        }
        MRAIDAdWidget mRAIDAdWidget = this.adWidget;
        if (mRAIDAdWidget != null) {
            if (!Intrinsics.areEqual(mRAIDAdWidget != null ? mRAIDAdWidget.getParent() : null, this)) {
                addView(this.adWidget, this.calculatedPixelWidth, this.calculatedPixelHeight);
                WatermarkView watermarkView = this.imageView;
                if (watermarkView != null) {
                    addView(watermarkView, this.calculatedPixelWidth, this.calculatedPixelHeight);
                    WatermarkView watermarkView2 = this.imageView;
                    if (watermarkView2 != null) {
                        watermarkView2.bringToFront();
                    }
                }
            }
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null) {
            layoutParams.height = this.calculatedPixelHeight;
            layoutParams.width = this.calculatedPixelWidth;
            requestLayout();
        }
    }

    /* renamed from: _init_$lambda-2, reason: not valid java name */
    private static final Executors m867_init_$lambda2(Lazy<? extends Executors> lazy) {
        return lazy.getValue();
    }

    /* renamed from: _init_$lambda-3, reason: not valid java name */
    private static final OMTracker.Factory m868_init_$lambda3(Lazy<OMTracker.Factory> lazy) {
        return lazy.getValue();
    }

    /* renamed from: _init_$lambda-4, reason: not valid java name */
    private static final Platform m869_init_$lambda4(Lazy<? extends Platform> lazy) {
        return lazy.getValue();
    }
}
