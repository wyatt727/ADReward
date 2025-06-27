package com.vungle.ads.internal;

import android.content.Context;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.json.mediationsdk.utils.IronSourceConstants;
import com.json.t2;
import com.vungle.ads.AdExpiredError;
import com.vungle.ads.AdExpiredOnPlayError;
import com.vungle.ads.AdNotLoadedCantPlay;
import com.vungle.ads.AnalyticsClient;
import com.vungle.ads.ConcurrentPlaybackUnsupported;
import com.vungle.ads.InvalidAdStateError;
import com.vungle.ads.ServiceLocator;
import com.vungle.ads.TimeIntervalMetric;
import com.vungle.ads.VungleError;
import com.vungle.ads.internal.AdInternal;
import com.vungle.ads.internal.downloader.Downloader;
import com.vungle.ads.internal.executor.SDKExecutors;
import com.vungle.ads.internal.load.AdLoaderCallback;
import com.vungle.ads.internal.load.BaseAdLoader;
import com.vungle.ads.internal.model.AdPayload;
import com.vungle.ads.internal.model.BidPayload;
import com.vungle.ads.internal.model.Placement;
import com.vungle.ads.internal.network.TpatSender;
import com.vungle.ads.internal.network.VungleApiClient;
import com.vungle.ads.internal.omsdk.OMInjector;
import com.vungle.ads.internal.presenter.AdEventListener;
import com.vungle.ads.internal.presenter.AdPlayCallback;
import com.vungle.ads.internal.presenter.AdPlayCallbackWrapper;
import com.vungle.ads.internal.signals.SignalManager;
import com.vungle.ads.internal.task.CleanupJob;
import com.vungle.ads.internal.task.JobRunner;
import com.vungle.ads.internal.ui.AdActivity;
import com.vungle.ads.internal.util.ActivityManager;
import com.vungle.ads.internal.util.Logger;
import com.vungle.ads.internal.util.PathProvider;
import java.lang.ref.WeakReference;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonBuilder;
import kotlinx.serialization.json.JsonKt;

/* compiled from: AdInternal.kt */
@Metadata(d1 = {"\u0000\u009e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\b&\u0018\u0000 Q2\u00020\u0001:\u0002PQB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0015\u00102\u001a\u0002032\u0006\u0010\r\u001a\u00020\u000eH\u0010¢\u0006\u0002\b4J\u0012\u00105\u001a\u0004\u0018\u0001062\b\b\u0002\u00107\u001a\u000208J\r\u00109\u001a\u000203H\u0000¢\u0006\u0002\b:J\b\u0010;\u001a\u00020<H&J\u0015\u0010=\u001a\u0002082\u0006\u0010>\u001a\u00020?H\u0000¢\u0006\u0002\b@J\u0010\u0010A\u001a\u0002082\u0006\u0010B\u001a\u00020<H&J\u0010\u0010C\u001a\u0002082\u0006\u0010\u001d\u001a\u00020\u001eH&J \u0010D\u001a\u0002032\u0006\u0010E\u001a\u00020<2\b\u0010F\u001a\u0004\u0018\u00010<2\u0006\u0010\u0005\u001a\u00020\u0001J\u0010\u0010G\u001a\u0002032\u0006\u0010H\u001a\u000206H\u0016J\u0010\u0010I\u001a\u0002032\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0018\u0010J\u001a\u0002032\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010K\u001a\u00020LJ'\u0010M\u001a\u0002032\b\u0010N\u001a\u0004\u0018\u00010L2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\r\u001a\u00020\u000eH\u0010¢\u0006\u0002\bOR\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000R$\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0007@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001c\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u001eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u0016\u0010#\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010$X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010%\u001a\u0004\u0018\u00010&X\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010'\u001a\u00020(8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b)\u0010*R\u001b\u0010-\u001a\u00020.8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b1\u0010,\u001a\u0004\b/\u00100¨\u0006R²\u0006\n\u0010S\u001a\u00020TX\u008a\u0084\u0002²\u0006\n\u0010U\u001a\u00020VX\u008a\u0084\u0002²\u0006\n\u0010W\u001a\u00020XX\u008a\u0084\u0002²\u0006\n\u0010Y\u001a\u00020ZX\u008a\u0084\u0002²\u0006\n\u0010[\u001a\u00020\\X\u008a\u0084\u0002²\u0006\n\u0010W\u001a\u00020XX\u008a\u0084\u0002²\u0006\n\u0010Y\u001a\u00020ZX\u008a\u0084\u0002"}, d2 = {"Lcom/vungle/ads/internal/AdInternal;", "Lcom/vungle/ads/internal/load/AdLoaderCallback;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "adLoaderCallback", "value", "Lcom/vungle/ads/internal/AdInternal$AdState;", "adState", "getAdState", "()Lcom/vungle/ads/internal/AdInternal$AdState;", "setAdState", "(Lcom/vungle/ads/internal/AdInternal$AdState;)V", "advertisement", "Lcom/vungle/ads/internal/model/AdPayload;", "getAdvertisement", "()Lcom/vungle/ads/internal/model/AdPayload;", "setAdvertisement", "(Lcom/vungle/ads/internal/model/AdPayload;)V", "baseAdLoader", "Lcom/vungle/ads/internal/load/BaseAdLoader;", "bidPayload", "Lcom/vungle/ads/internal/model/BidPayload;", "getBidPayload", "()Lcom/vungle/ads/internal/model/BidPayload;", "setBidPayload", "(Lcom/vungle/ads/internal/model/BidPayload;)V", "getContext", "()Landroid/content/Context;", "placement", "Lcom/vungle/ads/internal/model/Placement;", "getPlacement", "()Lcom/vungle/ads/internal/model/Placement;", "setPlacement", "(Lcom/vungle/ads/internal/model/Placement;)V", "playContext", "Ljava/lang/ref/WeakReference;", "requestMetric", "Lcom/vungle/ads/TimeIntervalMetric;", "signalManager", "Lcom/vungle/ads/internal/signals/SignalManager;", "getSignalManager", "()Lcom/vungle/ads/internal/signals/SignalManager;", "signalManager$delegate", "Lkotlin/Lazy;", "vungleApiClient", "Lcom/vungle/ads/internal/network/VungleApiClient;", "getVungleApiClient", "()Lcom/vungle/ads/internal/network/VungleApiClient;", "vungleApiClient$delegate", "adLoadedAndUpdateConfigure", "", "adLoadedAndUpdateConfigure$vungle_ads_release", "canPlayAd", "Lcom/vungle/ads/VungleError;", "onPlay", "", "cancelDownload", "cancelDownload$vungle_ads_release", "getAdSizeForAdRequest", "", "isErrorTerminal", IronSourceConstants.EVENTS_ERROR_CODE, "", "isErrorTerminal$vungle_ads_release", "isValidAdSize", t2.h.O, "isValidAdTypeForPlacement", "loadAd", t2.k, "adMarkup", "onFailure", "error", "onSuccess", "play", "adPlayCallback", "Lcom/vungle/ads/internal/presenter/AdPlayCallback;", "renderAd", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "renderAd$vungle_ads_release", "AdState", "Companion", "vungle-ads_release", "jobRunner", "Lcom/vungle/ads/internal/task/JobRunner;", "omInjector", "Lcom/vungle/ads/internal/omsdk/OMInjector;", "sdkExecutors", "Lcom/vungle/ads/internal/executor/SDKExecutors;", "pathProvider", "Lcom/vungle/ads/internal/util/PathProvider;", "downloader", "Lcom/vungle/ads/internal/downloader/Downloader;"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes2.dex */
public abstract class AdInternal implements AdLoaderCallback {
    private static final String TAG = "AdInternal";
    private static final boolean THROW_ON_ILLEGAL_TRANSITION = false;
    private AdLoaderCallback adLoaderCallback;
    private AdState adState;
    private AdPayload advertisement;
    private BaseAdLoader baseAdLoader;
    private BidPayload bidPayload;
    private final Context context;
    private Placement placement;
    private WeakReference<Context> playContext;
    private TimeIntervalMetric requestMetric;

    /* renamed from: signalManager$delegate, reason: from kotlin metadata */
    private final Lazy signalManager;

    /* renamed from: vungleApiClient$delegate, reason: from kotlin metadata */
    private final Lazy vungleApiClient;
    private static final Json json = JsonKt.Json$default(null, new Function1<JsonBuilder, Unit>() { // from class: com.vungle.ads.internal.AdInternal$Companion$json$1
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(JsonBuilder jsonBuilder) {
            invoke2(jsonBuilder);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(JsonBuilder Json) {
            Intrinsics.checkNotNullParameter(Json, "$this$Json");
            Json.setIgnoreUnknownKeys(true);
            Json.setEncodeDefaults(true);
            Json.setExplicitNulls(false);
        }
    }, 1, null);

    /* compiled from: AdInternal.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AdState.values().length];
            iArr[AdState.NEW.ordinal()] = 1;
            iArr[AdState.LOADING.ordinal()] = 2;
            iArr[AdState.READY.ordinal()] = 3;
            iArr[AdState.PLAYING.ordinal()] = 4;
            iArr[AdState.FINISHED.ordinal()] = 5;
            iArr[AdState.ERROR.ordinal()] = 6;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public void adLoadedAndUpdateConfigure$vungle_ads_release(AdPayload advertisement) {
        Intrinsics.checkNotNullParameter(advertisement, "advertisement");
    }

    public abstract String getAdSizeForAdRequest();

    public abstract boolean isValidAdSize(String adSize);

    public abstract boolean isValidAdTypeForPlacement(Placement placement);

    public AdInternal(final Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        this.adState = AdState.NEW;
        ServiceLocator.Companion companion = ServiceLocator.INSTANCE;
        this.vungleApiClient = LazyKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, (Function0) new Function0<VungleApiClient>() { // from class: com.vungle.ads.internal.AdInternal$special$$inlined$inject$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.vungle.ads.internal.network.VungleApiClient, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final VungleApiClient invoke() {
                return ServiceLocator.INSTANCE.getInstance(context).getService(VungleApiClient.class);
            }
        });
        ServiceLocator.Companion companion2 = ServiceLocator.INSTANCE;
        this.signalManager = LazyKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, (Function0) new Function0<SignalManager>() { // from class: com.vungle.ads.internal.AdInternal$special$$inlined$inject$2
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
    }

    public final Context getContext() {
        return this.context;
    }

    public final AdState getAdState() {
        return this.adState;
    }

    public final void setAdState(AdState value) {
        AdPayload adPayload;
        String strEventId;
        Intrinsics.checkNotNullParameter(value, "value");
        if (value.isTerminalState() && (adPayload = this.advertisement) != null && (strEventId = adPayload.eventId()) != null) {
            ServiceLocator.Companion companion = ServiceLocator.INSTANCE;
            final Context context = this.context;
            m897_set_adState_$lambda1$lambda0(LazyKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, (Function0) new Function0<JobRunner>() { // from class: com.vungle.ads.internal.AdInternal$_set_adState_$lambda-1$$inlined$inject$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                /* JADX WARN: Type inference failed for: r0v2, types: [com.vungle.ads.internal.task.JobRunner, java.lang.Object] */
                @Override // kotlin.jvm.functions.Function0
                public final JobRunner invoke() {
                    return ServiceLocator.INSTANCE.getInstance(context).getService(JobRunner.class);
                }
            })).execute(CleanupJob.INSTANCE.makeJobInfo(strEventId));
        }
        this.adState = this.adState.transitionTo(value);
    }

    /* renamed from: _set_adState_$lambda-1$lambda-0, reason: not valid java name */
    private static final JobRunner m897_set_adState_$lambda1$lambda0(Lazy<? extends JobRunner> lazy) {
        return lazy.getValue();
    }

    public final AdPayload getAdvertisement() {
        return this.advertisement;
    }

    public final void setAdvertisement(AdPayload adPayload) {
        this.advertisement = adPayload;
    }

    public final Placement getPlacement() {
        return this.placement;
    }

    public final void setPlacement(Placement placement) {
        this.placement = placement;
    }

    public final BidPayload getBidPayload() {
        return this.bidPayload;
    }

    public final void setBidPayload(BidPayload bidPayload) {
        this.bidPayload = bidPayload;
    }

    private final VungleApiClient getVungleApiClient() {
        return (VungleApiClient) this.vungleApiClient.getValue();
    }

    private final SignalManager getSignalManager() {
        return (SignalManager) this.signalManager.getValue();
    }

    public static /* synthetic */ VungleError canPlayAd$default(AdInternal adInternal, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: canPlayAd");
        }
        if ((i & 1) != 0) {
            z = false;
        }
        return adInternal.canPlayAd(z);
    }

    public final VungleError canPlayAd(boolean onPlay) {
        InvalidAdStateError invalidAdStateError;
        AdPayload adPayload = this.advertisement;
        if (adPayload == null) {
            invalidAdStateError = new AdNotLoadedCantPlay();
        } else {
            if (adPayload != null && adPayload.hasExpired()) {
                if (onPlay) {
                    invalidAdStateError = new AdExpiredOnPlayError();
                } else {
                    invalidAdStateError = new AdExpiredError();
                }
            } else if (this.adState == AdState.PLAYING) {
                invalidAdStateError = new ConcurrentPlaybackUnsupported();
            } else {
                if (this.adState == AdState.READY) {
                    return null;
                }
                invalidAdStateError = new InvalidAdStateError(0, null, null, null, null, null, 63, null);
            }
        }
        if (onPlay) {
            Placement placement = this.placement;
            VungleError placementId$vungle_ads_release = invalidAdStateError.setPlacementId$vungle_ads_release(placement != null ? placement.getReferenceId() : null);
            AdPayload adPayload2 = this.advertisement;
            VungleError creativeId$vungle_ads_release = placementId$vungle_ads_release.setCreativeId$vungle_ads_release(adPayload2 != null ? adPayload2.getCreativeId() : null);
            AdPayload adPayload3 = this.advertisement;
            creativeId$vungle_ads_release.setEventId$vungle_ads_release(adPayload3 != null ? adPayload3.eventId() : null).logErrorNoReturnValue$vungle_ads_release();
        }
        return invalidAdStateError;
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x009e, code lost:
    
        if ((r5 == null || r5.length() == 0) == false) goto L38;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0089  */
    /* JADX WARN: Type inference failed for: r11v14 */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r5v22 */
    /* JADX WARN: Type inference failed for: r5v23 */
    /* JADX WARN: Type inference failed for: r5v25 */
    /* JADX WARN: Type inference failed for: r5v28 */
    /* JADX WARN: Type inference failed for: r5v29 */
    /* JADX WARN: Type inference failed for: r5v31 */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.String, kotlin.jvm.internal.DefaultConstructorMarker] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void loadAd(java.lang.String r20, java.lang.String r21, com.vungle.ads.internal.load.AdLoaderCallback r22) {
        /*
            Method dump skipped, instructions count: 678
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vungle.ads.internal.AdInternal.loadAd(java.lang.String, java.lang.String, com.vungle.ads.internal.load.AdLoaderCallback):void");
    }

    /* renamed from: loadAd$lambda-2, reason: not valid java name */
    private static final OMInjector m898loadAd$lambda2(Lazy<OMInjector> lazy) {
        return lazy.getValue();
    }

    /* renamed from: loadAd$lambda-3, reason: not valid java name */
    private static final SDKExecutors m899loadAd$lambda3(Lazy<SDKExecutors> lazy) {
        return lazy.getValue();
    }

    /* renamed from: loadAd$lambda-4, reason: not valid java name */
    private static final PathProvider m900loadAd$lambda4(Lazy<PathProvider> lazy) {
        return lazy.getValue();
    }

    /* renamed from: loadAd$lambda-5, reason: not valid java name */
    private static final Downloader m901loadAd$lambda5(Lazy<? extends Downloader> lazy) {
        return lazy.getValue();
    }

    public final void cancelDownload$vungle_ads_release() {
        BaseAdLoader baseAdLoader = this.baseAdLoader;
        if (baseAdLoader != null) {
            baseAdLoader.cancel();
        }
    }

    public final void play(Context context, final AdPlayCallback adPlayCallback) {
        WeakReference<Context> weakReference;
        AdPayload adPayload;
        Intrinsics.checkNotNullParameter(adPlayCallback, "adPlayCallback");
        if (context != null) {
            weakReference = new WeakReference<>(context);
        } else {
            weakReference = null;
        }
        this.playContext = weakReference;
        VungleError vungleErrorCanPlayAd = canPlayAd(true);
        if (vungleErrorCanPlayAd != null) {
            adPlayCallback.onFailure(vungleErrorCanPlayAd);
            if (isErrorTerminal$vungle_ads_release(vungleErrorCanPlayAd.getCode())) {
                setAdState(AdState.ERROR);
                return;
            }
            return;
        }
        Placement placement = this.placement;
        if (placement == null || (adPayload = this.advertisement) == null) {
            return;
        }
        AdPlayCallbackWrapper adPlayCallbackWrapper = new AdPlayCallbackWrapper(adPlayCallback) { // from class: com.vungle.ads.internal.AdInternal$play$callbackWrapper$1
            @Override // com.vungle.ads.internal.presenter.AdPlayCallbackWrapper, com.vungle.ads.internal.presenter.AdPlayCallback
            public void onAdStart(String id) {
                this.setAdState(AdInternal.AdState.PLAYING);
                super.onAdStart(id);
            }

            @Override // com.vungle.ads.internal.presenter.AdPlayCallbackWrapper, com.vungle.ads.internal.presenter.AdPlayCallback
            public void onAdEnd(String id) {
                this.setAdState(AdInternal.AdState.FINISHED);
                super.onAdEnd(id);
            }

            @Override // com.vungle.ads.internal.presenter.AdPlayCallbackWrapper, com.vungle.ads.internal.presenter.AdPlayCallback
            public void onFailure(VungleError error) {
                Intrinsics.checkNotNullParameter(error, "error");
                this.setAdState(AdInternal.AdState.ERROR);
                super.onFailure(error);
            }
        };
        cancelDownload$vungle_ads_release();
        renderAd$vungle_ads_release(adPlayCallbackWrapper, placement, adPayload);
    }

    public void renderAd$vungle_ads_release(final AdPlayCallback listener, final Placement placement, AdPayload advertisement) {
        Context context;
        Intrinsics.checkNotNullParameter(placement, "placement");
        Intrinsics.checkNotNullParameter(advertisement, "advertisement");
        AdActivity.INSTANCE.setEventListener$vungle_ads_release(new AdEventListener(listener, placement) { // from class: com.vungle.ads.internal.AdInternal$renderAd$1
        });
        AdActivity.INSTANCE.setAdvertisement$vungle_ads_release(advertisement);
        AdActivity.INSTANCE.setBidPayload$vungle_ads_release(this.bidPayload);
        WeakReference<Context> weakReference = this.playContext;
        if (weakReference == null || (context = weakReference.get()) == null) {
            context = this.context;
        }
        Intrinsics.checkNotNullExpressionValue(context, "playContext?.get() ?: context");
        ActivityManager.INSTANCE.startWhenForeground(context, null, AdActivity.INSTANCE.createIntent(context, placement.getReferenceId(), advertisement.eventId()), null);
    }

    @Override // com.vungle.ads.internal.load.AdLoaderCallback
    public void onSuccess(AdPayload advertisement) {
        Intrinsics.checkNotNullParameter(advertisement, "advertisement");
        this.advertisement = advertisement;
        setAdState(AdState.READY);
        adLoadedAndUpdateConfigure$vungle_ads_release(advertisement);
        AdLoaderCallback adLoaderCallback = this.adLoaderCallback;
        if (adLoaderCallback != null) {
            adLoaderCallback.onSuccess(advertisement);
        }
        TimeIntervalMetric timeIntervalMetric = this.requestMetric;
        if (timeIntervalMetric != null) {
            timeIntervalMetric.markEnd();
            AnalyticsClient analyticsClient = AnalyticsClient.INSTANCE;
            Placement placement = this.placement;
            AnalyticsClient.logMetric$vungle_ads_release$default(analyticsClient, timeIntervalMetric, placement != null ? placement.getReferenceId() : null, advertisement.getCreativeId(), advertisement.eventId(), (String) null, 16, (Object) null);
            long jCalculateIntervalDuration = timeIntervalMetric.calculateIntervalDuration();
            ServiceLocator.Companion companion = ServiceLocator.INSTANCE;
            final Context context = this.context;
            Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, (Function0) new Function0<SDKExecutors>() { // from class: com.vungle.ads.internal.AdInternal$onSuccess$lambda-9$$inlined$inject$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                /* JADX WARN: Type inference failed for: r0v2, types: [com.vungle.ads.internal.executor.SDKExecutors, java.lang.Object] */
                @Override // kotlin.jvm.functions.Function0
                public final SDKExecutors invoke() {
                    return ServiceLocator.INSTANCE.getInstance(context).getService(SDKExecutors.class);
                }
            });
            ServiceLocator.Companion companion2 = ServiceLocator.INSTANCE;
            final Context context2 = this.context;
            Lazy lazy2 = LazyKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, (Function0) new Function0<PathProvider>() { // from class: com.vungle.ads.internal.AdInternal$onSuccess$lambda-9$$inlined$inject$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                /* JADX WARN: Type inference failed for: r0v2, types: [com.vungle.ads.internal.util.PathProvider, java.lang.Object] */
                @Override // kotlin.jvm.functions.Function0
                public final PathProvider invoke() {
                    return ServiceLocator.INSTANCE.getInstance(context2).getService(PathProvider.class);
                }
            });
            List tpatUrls$default = AdPayload.getTpatUrls$default(advertisement, Constants.AD_LOAD_DURATION_TPAT_KEY, String.valueOf(jCalculateIntervalDuration), null, 4, null);
            if (tpatUrls$default != null) {
                new TpatSender(getVungleApiClient(), advertisement.placementId(), advertisement.getCreativeId(), advertisement.eventId(), m902onSuccess$lambda9$lambda6(lazy).getIO_EXECUTOR(), m903onSuccess$lambda9$lambda7(lazy2), getSignalManager()).sendTpats(tpatUrls$default, m902onSuccess$lambda9$lambda6(lazy).getJOB_EXECUTOR());
            }
        }
    }

    /* renamed from: onSuccess$lambda-9$lambda-6, reason: not valid java name */
    private static final SDKExecutors m902onSuccess$lambda9$lambda6(Lazy<SDKExecutors> lazy) {
        return lazy.getValue();
    }

    /* renamed from: onSuccess$lambda-9$lambda-7, reason: not valid java name */
    private static final PathProvider m903onSuccess$lambda9$lambda7(Lazy<PathProvider> lazy) {
        return lazy.getValue();
    }

    @Override // com.vungle.ads.internal.load.AdLoaderCallback
    public void onFailure(VungleError error) {
        Intrinsics.checkNotNullParameter(error, "error");
        setAdState(AdState.ERROR);
        AdLoaderCallback adLoaderCallback = this.adLoaderCallback;
        if (adLoaderCallback != null) {
            adLoaderCallback.onFailure(error);
        }
    }

    public final boolean isErrorTerminal$vungle_ads_release(int errorCode) {
        return this.adState == AdState.READY && errorCode == 304;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: AdInternal.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0000H&J\u0006\u0010\u0006\u001a\u00020\u0004J\u000e\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0000j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lcom/vungle/ads/internal/AdInternal$AdState;", "", "(Ljava/lang/String;I)V", "canTransitionTo", "", "adState", "isTerminalState", "transitionTo", "NEW", "LOADING", "READY", "PLAYING", "FINISHED", "ERROR", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class AdState {
        public static final AdState NEW = new NEW("NEW", 0);
        public static final AdState LOADING = new LOADING("LOADING", 1);
        public static final AdState READY = new READY("READY", 2);
        public static final AdState PLAYING = new PLAYING("PLAYING", 3);
        public static final AdState FINISHED = new FINISHED("FINISHED", 4);
        public static final AdState ERROR = new ERROR("ERROR", 5);
        private static final /* synthetic */ AdState[] $VALUES = $values();

        private static final /* synthetic */ AdState[] $values() {
            return new AdState[]{NEW, LOADING, READY, PLAYING, FINISHED, ERROR};
        }

        public /* synthetic */ AdState(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i);
        }

        public static AdState valueOf(String str) {
            return (AdState) Enum.valueOf(AdState.class, str);
        }

        public static AdState[] values() {
            return (AdState[]) $VALUES.clone();
        }

        public abstract boolean canTransitionTo(AdState adState);

        /* compiled from: AdInternal.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\bÆ\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0001H\u0016¨\u0006\u0005"}, d2 = {"Lcom/vungle/ads/internal/AdInternal$AdState$NEW;", "Lcom/vungle/ads/internal/AdInternal$AdState;", "canTransitionTo", "", "adState", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
        static final class NEW extends AdState {
            NEW(String str, int i) {
                super(str, i, null);
            }

            @Override // com.vungle.ads.internal.AdInternal.AdState
            public boolean canTransitionTo(AdState adState) {
                Intrinsics.checkNotNullParameter(adState, "adState");
                return adState == AdState.LOADING || adState == AdState.READY || adState == AdState.ERROR;
            }
        }

        private AdState(String str, int i) {
        }

        /* compiled from: AdInternal.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\bÆ\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0001H\u0016¨\u0006\u0005"}, d2 = {"Lcom/vungle/ads/internal/AdInternal$AdState$LOADING;", "Lcom/vungle/ads/internal/AdInternal$AdState;", "canTransitionTo", "", "adState", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
        static final class LOADING extends AdState {
            LOADING(String str, int i) {
                super(str, i, null);
            }

            @Override // com.vungle.ads.internal.AdInternal.AdState
            public boolean canTransitionTo(AdState adState) {
                Intrinsics.checkNotNullParameter(adState, "adState");
                return adState == AdState.READY || adState == AdState.ERROR;
            }
        }

        /* compiled from: AdInternal.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\bÆ\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0001H\u0016¨\u0006\u0005"}, d2 = {"Lcom/vungle/ads/internal/AdInternal$AdState$READY;", "Lcom/vungle/ads/internal/AdInternal$AdState;", "canTransitionTo", "", "adState", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
        static final class READY extends AdState {
            READY(String str, int i) {
                super(str, i, null);
            }

            @Override // com.vungle.ads.internal.AdInternal.AdState
            public boolean canTransitionTo(AdState adState) {
                Intrinsics.checkNotNullParameter(adState, "adState");
                return adState == AdState.PLAYING || adState == AdState.FINISHED || adState == AdState.ERROR;
            }
        }

        /* compiled from: AdInternal.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\bÆ\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0001H\u0016¨\u0006\u0005"}, d2 = {"Lcom/vungle/ads/internal/AdInternal$AdState$PLAYING;", "Lcom/vungle/ads/internal/AdInternal$AdState;", "canTransitionTo", "", "adState", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
        static final class PLAYING extends AdState {
            PLAYING(String str, int i) {
                super(str, i, null);
            }

            @Override // com.vungle.ads.internal.AdInternal.AdState
            public boolean canTransitionTo(AdState adState) {
                Intrinsics.checkNotNullParameter(adState, "adState");
                return adState == AdState.FINISHED || adState == AdState.ERROR;
            }
        }

        /* compiled from: AdInternal.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\bÆ\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0001H\u0016¨\u0006\u0005"}, d2 = {"Lcom/vungle/ads/internal/AdInternal$AdState$FINISHED;", "Lcom/vungle/ads/internal/AdInternal$AdState;", "canTransitionTo", "", "adState", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
        static final class FINISHED extends AdState {
            @Override // com.vungle.ads.internal.AdInternal.AdState
            public boolean canTransitionTo(AdState adState) {
                Intrinsics.checkNotNullParameter(adState, "adState");
                return false;
            }

            FINISHED(String str, int i) {
                super(str, i, null);
            }
        }

        /* compiled from: AdInternal.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\bÆ\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0001H\u0016¨\u0006\u0005"}, d2 = {"Lcom/vungle/ads/internal/AdInternal$AdState$ERROR;", "Lcom/vungle/ads/internal/AdInternal$AdState;", "canTransitionTo", "", "adState", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
        static final class ERROR extends AdState {
            ERROR(String str, int i) {
                super(str, i, null);
            }

            @Override // com.vungle.ads.internal.AdInternal.AdState
            public boolean canTransitionTo(AdState adState) {
                Intrinsics.checkNotNullParameter(adState, "adState");
                return adState == AdState.FINISHED;
            }
        }

        public final AdState transitionTo(AdState adState) {
            Intrinsics.checkNotNullParameter(adState, "adState");
            if (this != adState && !canTransitionTo(adState)) {
                String str = "Cannot transition from " + name() + " to " + adState.name();
                if (AdInternal.THROW_ON_ILLEGAL_TRANSITION) {
                    throw new IllegalStateException(str);
                }
                Logger.INSTANCE.e(AdInternal.TAG, "Illegal state transition", new IllegalStateException(str));
            }
            return adState;
        }

        public final boolean isTerminalState() {
            return CollectionsKt.listOf((Object[]) new AdState[]{FINISHED, ERROR}).contains(this);
        }
    }
}
