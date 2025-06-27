package com.vungle.ads.internal.presenter;

import android.content.Context;
import android.view.MotionEvent;
import android.webkit.WebView;
import android.webkit.WebViewRenderProcess;
import androidx.core.app.NotificationCompat;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.json.sdk.controller.f;
import com.json.t2;
import com.mbridge.msdk.MBridgeConstans;
import com.vungle.ads.AdConfig;
import com.vungle.ads.AdNotLoadedCantPlay;
import com.vungle.ads.AnalyticsClient;
import com.vungle.ads.InternalError;
import com.vungle.ads.ServiceLocator;
import com.vungle.ads.SingleValueMetric;
import com.vungle.ads.VungleError;
import com.vungle.ads.internal.ClickCoordinateTracker;
import com.vungle.ads.internal.ConfigManager;
import com.vungle.ads.internal.Constants;
import com.vungle.ads.internal.executor.Executors;
import com.vungle.ads.internal.model.AdPayload;
import com.vungle.ads.internal.model.BidPayload;
import com.vungle.ads.internal.model.CommonRequestBody;
import com.vungle.ads.internal.model.Placement;
import com.vungle.ads.internal.network.Call;
import com.vungle.ads.internal.network.Callback;
import com.vungle.ads.internal.network.Response;
import com.vungle.ads.internal.network.TpatSender;
import com.vungle.ads.internal.network.VungleApiClient;
import com.vungle.ads.internal.omsdk.OMTracker;
import com.vungle.ads.internal.platform.Platform;
import com.vungle.ads.internal.privacy.PrivacyManager;
import com.vungle.ads.internal.protos.Sdk;
import com.vungle.ads.internal.signals.SignalManager;
import com.vungle.ads.internal.ui.VungleWebClient;
import com.vungle.ads.internal.ui.view.MRAIDAdWidget;
import com.vungle.ads.internal.ui.view.WebViewAPI;
import com.vungle.ads.internal.util.HandlerScheduler;
import com.vungle.ads.internal.util.Logger;
import com.vungle.ads.internal.util.PathProvider;
import com.vungle.ads.internal.util.SuspendableTimer;
import java.io.File;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MRAIDPresenter.kt */
@Metadata(d1 = {"\u0000ä\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u0000 \u0093\u00012\u00020\u00012\u00020\u0002:\u0002\u0093\u0001BG\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012¢\u0006\u0002\u0010\u0013J\b\u0010f\u001a\u00020gH\u0002J\u0010\u0010h\u001a\u00020g2\b\b\u0001\u0010i\u001a\u00020jJ\u0006\u0010k\u001a\u00020gJ$\u0010l\u001a\u00020g2\u0006\u0010m\u001a\u00020n2\u0006\u0010o\u001a\u00020\u001e2\n\b\u0002\u0010p\u001a\u0004\u0018\u00010ZH\u0002J\u0010\u0010q\u001a\u00020\u001e2\u0006\u0010r\u001a\u00020sH\u0002J\u0010\u0010t\u001a\u00020g2\u0006\u0010m\u001a\u00020nH\u0002J\u0018\u0010u\u001a\u00020g2\u0006\u0010v\u001a\u00020Z2\u0006\u0010w\u001a\u00020\u001eH\u0016J\u001c\u0010x\u001a\u00020g2\b\u0010y\u001a\u0004\u0018\u00010z2\b\u0010{\u001a\u0004\u0018\u00010|H\u0016J\u0006\u0010}\u001a\u00020gJ\u0011\u0010~\u001a\u00020g2\t\u0010\u007f\u001a\u0005\u0018\u00010\u0080\u0001J$\u0010\u0081\u0001\u001a\u00020\u001e2\t\u0010\u0082\u0001\u001a\u0004\u0018\u00010z2\b\u0010w\u001a\u0004\u0018\u00010\u001eH\u0016¢\u0006\u0003\u0010\u0083\u0001J\u0007\u0010\u0084\u0001\u001a\u00020gJ\u001c\u0010\u0085\u0001\u001a\u00020\u001e2\u0007\u0010\u0086\u0001\u001a\u00020Z2\b\u0010\u0087\u0001\u001a\u00030\u0088\u0001H\u0016J\t\u0010\u0089\u0001\u001a\u00020gH\u0002J\u0011\u0010\u008a\u0001\u001a\u00020g2\u0006\u0010m\u001a\u00020nH\u0002J\u0010\u0010\u008b\u0001\u001a\u00020g2\u0007\u0010\u008c\u0001\u001a\u00020\u001eJ\u0012\u0010\u008d\u0001\u001a\u00020g2\t\u0010\u008e\u0001\u001a\u0004\u0018\u00010&J\u0019\u0010\u008f\u0001\u001a\u00020g2\b\u0010F\u001a\u0004\u0018\u00010GH\u0000¢\u0006\u0003\b\u0090\u0001J\u0007\u0010\u0091\u0001\u001a\u00020gJ\u0007\u0010\u0092\u0001\u001a\u00020gR(\u0010\u0014\u001a\u0004\u0018\u00010\u00158\u0000@\u0000X\u0081\u000e¢\u0006\u0016\n\u0002\u0010\u001c\u0012\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u000e\u0010\u001d\u001a\u00020\u001eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010\u001f\u001a\u00020\u001e8\u0000@\u0000X\u0081\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b \u0010\u0017\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R&\u0010%\u001a\u0004\u0018\u00010&8\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b'\u0010\u0017\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R!\u0010,\u001a\u00020-8@X\u0081\u0084\u0002¢\u0006\u0012\n\u0004\b1\u00102\u0012\u0004\b.\u0010\u0017\u001a\u0004\b/\u00100R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u00103\u001a\u0002048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b7\u00102\u001a\u0004\b5\u00106R$\u00108\u001a\u00020\u001e8\u0000@\u0000X\u0081\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b9\u0010\u0017\u001a\u0004\b:\u0010\"\"\u0004\b;\u0010$R\u001c\u0010<\u001a\u00020=8\u0000X\u0081\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b>\u0010\u0017\u001a\u0004\b?\u0010@R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010A\u001a\u00020B8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bE\u00102\u001a\u0004\bC\u0010DR\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010F\u001a\u0004\u0018\u00010GX\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010H\u001a\u00020I8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bL\u00102\u001a\u0004\bJ\u0010KR\u000e\u0010M\u001a\u00020=X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010N\u001a\u00020O8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bR\u00102\u001a\u0004\bP\u0010QR!\u0010S\u001a\u00020T8@X\u0081\u0084\u0002¢\u0006\u0012\n\u0004\bX\u00102\u0012\u0004\bU\u0010\u0017\u001a\u0004\bV\u0010WR&\u0010Y\u001a\u0004\u0018\u00010Z8\u0000@\u0000X\u0081\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b[\u0010\u0017\u001a\u0004\b\\\u0010]\"\u0004\b^\u0010_R!\u0010`\u001a\u00020a8@X\u0081\u0084\u0002¢\u0006\u0012\n\u0004\be\u00102\u0012\u0004\bb\u0010\u0017\u001a\u0004\bc\u0010dR\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0094\u0001"}, d2 = {"Lcom/vungle/ads/internal/presenter/MRAIDPresenter;", "Lcom/vungle/ads/internal/ui/view/WebViewAPI$MraidDelegate;", "Lcom/vungle/ads/internal/ui/view/WebViewAPI$WebClientErrorHandler;", "adWidget", "Lcom/vungle/ads/internal/ui/view/MRAIDAdWidget;", "advertisement", "Lcom/vungle/ads/internal/model/AdPayload;", "placement", "Lcom/vungle/ads/internal/model/Placement;", "vungleWebClient", "Lcom/vungle/ads/internal/ui/VungleWebClient;", "executor", "Ljava/util/concurrent/Executor;", "omTracker", "Lcom/vungle/ads/internal/omsdk/OMTracker;", "bidPayload", "Lcom/vungle/ads/internal/model/BidPayload;", "platform", "Lcom/vungle/ads/internal/platform/Platform;", "(Lcom/vungle/ads/internal/ui/view/MRAIDAdWidget;Lcom/vungle/ads/internal/model/AdPayload;Lcom/vungle/ads/internal/model/Placement;Lcom/vungle/ads/internal/ui/VungleWebClient;Ljava/util/concurrent/Executor;Lcom/vungle/ads/internal/omsdk/OMTracker;Lcom/vungle/ads/internal/model/BidPayload;Lcom/vungle/ads/internal/platform/Platform;)V", "adStartTime", "", "getAdStartTime$vungle_ads_release$annotations", "()V", "getAdStartTime$vungle_ads_release", "()Ljava/lang/Long;", "setAdStartTime$vungle_ads_release", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "adViewed", "", "backEnabled", "getBackEnabled$vungle_ads_release$annotations", "getBackEnabled$vungle_ads_release", "()Z", "setBackEnabled$vungle_ads_release", "(Z)V", "bus", "Lcom/vungle/ads/internal/presenter/AdEventListener;", "getBus$annotations", "getBus", "()Lcom/vungle/ads/internal/presenter/AdEventListener;", "setBus", "(Lcom/vungle/ads/internal/presenter/AdEventListener;)V", "clickCoordinateTracker", "Lcom/vungle/ads/internal/ClickCoordinateTracker;", "getClickCoordinateTracker$vungle_ads_release$annotations", "getClickCoordinateTracker$vungle_ads_release", "()Lcom/vungle/ads/internal/ClickCoordinateTracker;", "clickCoordinateTracker$delegate", "Lkotlin/Lazy;", "executors", "Lcom/vungle/ads/internal/executor/Executors;", "getExecutors", "()Lcom/vungle/ads/internal/executor/Executors;", "executors$delegate", "heartbeatEnabled", "getHeartbeatEnabled$vungle_ads_release$annotations", "getHeartbeatEnabled$vungle_ads_release", "setHeartbeatEnabled$vungle_ads_release", "isDestroying", "Ljava/util/concurrent/atomic/AtomicBoolean;", "isDestroying$vungle_ads_release$annotations", "isDestroying$vungle_ads_release", "()Ljava/util/concurrent/atomic/AtomicBoolean;", "pathProvider", "Lcom/vungle/ads/internal/util/PathProvider;", "getPathProvider", "()Lcom/vungle/ads/internal/util/PathProvider;", "pathProvider$delegate", "presenterDelegate", "Lcom/vungle/ads/internal/presenter/PresenterDelegate;", "scheduler", "Lcom/vungle/ads/internal/util/HandlerScheduler;", "getScheduler", "()Lcom/vungle/ads/internal/util/HandlerScheduler;", "scheduler$delegate", "sendReportIncentivized", "signalManager", "Lcom/vungle/ads/internal/signals/SignalManager;", "getSignalManager", "()Lcom/vungle/ads/internal/signals/SignalManager;", "signalManager$delegate", "suspendableTimer", "Lcom/vungle/ads/internal/util/SuspendableTimer;", "getSuspendableTimer$vungle_ads_release$annotations", "getSuspendableTimer$vungle_ads_release", "()Lcom/vungle/ads/internal/util/SuspendableTimer;", "suspendableTimer$delegate", "userId", "", "getUserId$vungle_ads_release$annotations", "getUserId$vungle_ads_release", "()Ljava/lang/String;", "setUserId$vungle_ads_release", "(Ljava/lang/String;)V", "vungleApiClient", "Lcom/vungle/ads/internal/network/VungleApiClient;", "getVungleApiClient$vungle_ads_release$annotations", "getVungleApiClient$vungle_ads_release", "()Lcom/vungle/ads/internal/network/VungleApiClient;", "vungleApiClient$delegate", "closeView", "", "detach", "stopReason", "", "handleExit", "handleWebViewException", "reason", "Lcom/vungle/ads/VungleError;", "fatal", "errorMessage", "loadMraid", "template", "Ljava/io/File;", "makeBusError", "onReceivedError", "errorDesc", "didCrash", "onRenderProcessUnresponsive", "webView", "Landroid/webkit/WebView;", "webViewRenderProcess", "Landroid/webkit/WebViewRenderProcess;", "onViewConfigurationChanged", "onViewTouched", NotificationCompat.CATEGORY_EVENT, "Landroid/view/MotionEvent;", "onWebRenderingProcessGone", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "(Landroid/webkit/WebView;Ljava/lang/Boolean;)Z", "prepare", "processCommand", f.b.COMMAND, "arguments", "Lkotlinx/serialization/json/JsonObject;", "recordPlayAssetMetric", "reportErrorAndCloseAd", "setAdVisibility", t2.h.o, "setEventListener", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setPresenterDelegate", "setPresenterDelegate$vungle_ads_release", "start", "stop", "Companion", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes5.dex */
public final class MRAIDPresenter implements WebViewAPI.MraidDelegate, WebViewAPI.WebClientErrorHandler {
    private static final String ACTION = "action";
    public static final String ACTION_WITH_VALUE = "actionWithValue";
    public static final String CLOSE = "close";
    public static final String CONSENT_ACTION = "consentAction";
    public static final String CREATIVE_HEARTBEAT = "creativeHeartbeat";

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final String ERROR = "error";
    public static final String GET_AVAILABLE_DISK_SPACE = "getAvailableDiskSpace";
    private static final double HEARTBEAT_INTERVAL = 6.0d;
    public static final String OPEN = "open";
    private static final String OPEN_NON_MRAID = "openNonMraid";
    public static final String OPEN_PRIVACY = "openPrivacy";
    public static final String SET_ORIENTATION_PROPERTIES = "setOrientationProperties";
    public static final String SUCCESSFUL_VIEW = "successfulView";
    private static final String TAG = "MRAIDPresenter";
    public static final String TPAT = "tpat";
    public static final String UPDATE_SIGNALS = "updateSignals";
    private static final String USE_CUSTOM_CLOSE = "useCustomClose";
    private static final String USE_CUSTOM_PRIVACY = "useCustomPrivacy";
    public static final String VIDEO_LENGTH = "videoLength";
    public static final String VIDEO_VIEWED = "videoViewed";
    private Long adStartTime;
    private boolean adViewed;
    private final MRAIDAdWidget adWidget;
    private final AdPayload advertisement;
    private boolean backEnabled;
    private final BidPayload bidPayload;
    private AdEventListener bus;

    /* renamed from: clickCoordinateTracker$delegate, reason: from kotlin metadata */
    private final Lazy clickCoordinateTracker;
    private Executor executor;

    /* renamed from: executors$delegate, reason: from kotlin metadata */
    private final Lazy executors;
    private boolean heartbeatEnabled;
    private final AtomicBoolean isDestroying;
    private final OMTracker omTracker;

    /* renamed from: pathProvider$delegate, reason: from kotlin metadata */
    private final Lazy pathProvider;
    private final Placement placement;
    private final Platform platform;
    private PresenterDelegate presenterDelegate;

    /* renamed from: scheduler$delegate, reason: from kotlin metadata */
    private final Lazy scheduler;
    private final AtomicBoolean sendReportIncentivized;

    /* renamed from: signalManager$delegate, reason: from kotlin metadata */
    private final Lazy signalManager;

    /* renamed from: suspendableTimer$delegate, reason: from kotlin metadata */
    private final Lazy suspendableTimer;
    private String userId;

    /* renamed from: vungleApiClient$delegate, reason: from kotlin metadata */
    private final Lazy vungleApiClient;
    private final VungleWebClient vungleWebClient;

    public static /* synthetic */ void getAdStartTime$vungle_ads_release$annotations() {
    }

    public static /* synthetic */ void getBackEnabled$vungle_ads_release$annotations() {
    }

    public static /* synthetic */ void getBus$annotations() {
    }

    public static /* synthetic */ void getClickCoordinateTracker$vungle_ads_release$annotations() {
    }

    public static /* synthetic */ void getHeartbeatEnabled$vungle_ads_release$annotations() {
    }

    public static /* synthetic */ void getSuspendableTimer$vungle_ads_release$annotations() {
    }

    public static /* synthetic */ void getUserId$vungle_ads_release$annotations() {
    }

    public static /* synthetic */ void getVungleApiClient$vungle_ads_release$annotations() {
    }

    public static /* synthetic */ void isDestroying$vungle_ads_release$annotations() {
    }

    public MRAIDPresenter(MRAIDAdWidget adWidget, AdPayload advertisement, Placement placement, VungleWebClient vungleWebClient, Executor executor, OMTracker omTracker, BidPayload bidPayload, Platform platform) {
        Intrinsics.checkNotNullParameter(adWidget, "adWidget");
        Intrinsics.checkNotNullParameter(advertisement, "advertisement");
        Intrinsics.checkNotNullParameter(placement, "placement");
        Intrinsics.checkNotNullParameter(vungleWebClient, "vungleWebClient");
        Intrinsics.checkNotNullParameter(executor, "executor");
        Intrinsics.checkNotNullParameter(omTracker, "omTracker");
        Intrinsics.checkNotNullParameter(platform, "platform");
        this.adWidget = adWidget;
        this.advertisement = advertisement;
        this.placement = placement;
        this.vungleWebClient = vungleWebClient;
        this.executor = executor;
        this.omTracker = omTracker;
        this.bidPayload = bidPayload;
        this.platform = platform;
        this.isDestroying = new AtomicBoolean(false);
        this.sendReportIncentivized = new AtomicBoolean(false);
        ServiceLocator.Companion companion = ServiceLocator.INSTANCE;
        final Context context = adWidget.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "adWidget.context");
        this.vungleApiClient = LazyKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, (Function0) new Function0<VungleApiClient>() { // from class: com.vungle.ads.internal.presenter.MRAIDPresenter$special$$inlined$inject$1
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
        final Context context2 = adWidget.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "adWidget.context");
        this.executors = LazyKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, (Function0) new Function0<Executors>() { // from class: com.vungle.ads.internal.presenter.MRAIDPresenter$special$$inlined$inject$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.vungle.ads.internal.executor.Executors, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final Executors invoke() {
                return ServiceLocator.INSTANCE.getInstance(context2).getService(Executors.class);
            }
        });
        ServiceLocator.Companion companion3 = ServiceLocator.INSTANCE;
        final Context context3 = adWidget.getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "adWidget.context");
        this.pathProvider = LazyKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, (Function0) new Function0<PathProvider>() { // from class: com.vungle.ads.internal.presenter.MRAIDPresenter$special$$inlined$inject$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.vungle.ads.internal.util.PathProvider, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final PathProvider invoke() {
                return ServiceLocator.INSTANCE.getInstance(context3).getService(PathProvider.class);
            }
        });
        ServiceLocator.Companion companion4 = ServiceLocator.INSTANCE;
        final Context context4 = adWidget.getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "adWidget.context");
        this.signalManager = LazyKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, (Function0) new Function0<SignalManager>() { // from class: com.vungle.ads.internal.presenter.MRAIDPresenter$special$$inlined$inject$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.vungle.ads.internal.signals.SignalManager, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final SignalManager invoke() {
                return ServiceLocator.INSTANCE.getInstance(context4).getService(SignalManager.class);
            }
        });
        this.scheduler = LazyKt.lazy(new Function0<HandlerScheduler>() { // from class: com.vungle.ads.internal.presenter.MRAIDPresenter$scheduler$2
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final HandlerScheduler invoke() {
                return new HandlerScheduler();
            }
        });
        this.suspendableTimer = LazyKt.lazy(new Function0<SuspendableTimer>() { // from class: com.vungle.ads.internal.presenter.MRAIDPresenter$suspendableTimer$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final SuspendableTimer invoke() {
                final MRAIDPresenter mRAIDPresenter = this.this$0;
                return new SuspendableTimer(6.0d, true, null, new Function0<Unit>() { // from class: com.vungle.ads.internal.presenter.MRAIDPresenter$suspendableTimer$2.1
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        AnalyticsClient.INSTANCE.logError$vungle_ads_release(318, "Error ad template missing Heartbeat", mRAIDPresenter.placement.getReferenceId(), mRAIDPresenter.advertisement.getCreativeId(), mRAIDPresenter.advertisement.eventId());
                        mRAIDPresenter.reportErrorAndCloseAd(new InternalError(VungleError.HEARTBEAT_ERROR, null, 2, null));
                    }
                }, 4, null);
            }
        });
        this.clickCoordinateTracker = LazyKt.lazy(new Function0<ClickCoordinateTracker>() { // from class: com.vungle.ads.internal.presenter.MRAIDPresenter$clickCoordinateTracker$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ClickCoordinateTracker invoke() {
                Context context5 = this.this$0.adWidget.getContext();
                Intrinsics.checkNotNullExpressionValue(context5, "adWidget.context");
                return new ClickCoordinateTracker(context5, this.this$0.advertisement, this.this$0.executor);
            }
        });
    }

    public final AdEventListener getBus() {
        return this.bus;
    }

    public final void setBus(AdEventListener adEventListener) {
        this.bus = adEventListener;
    }

    /* renamed from: isDestroying$vungle_ads_release, reason: from getter */
    public final AtomicBoolean getIsDestroying() {
        return this.isDestroying;
    }

    /* renamed from: getAdStartTime$vungle_ads_release, reason: from getter */
    public final Long getAdStartTime() {
        return this.adStartTime;
    }

    public final void setAdStartTime$vungle_ads_release(Long l) {
        this.adStartTime = l;
    }

    /* renamed from: getUserId$vungle_ads_release, reason: from getter */
    public final String getUserId() {
        return this.userId;
    }

    public final void setUserId$vungle_ads_release(String str) {
        this.userId = str;
    }

    public final VungleApiClient getVungleApiClient$vungle_ads_release() {
        return (VungleApiClient) this.vungleApiClient.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Executors getExecutors() {
        return (Executors) this.executors.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PathProvider getPathProvider() {
        return (PathProvider) this.pathProvider.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SignalManager getSignalManager() {
        return (SignalManager) this.signalManager.getValue();
    }

    private final HandlerScheduler getScheduler() {
        return (HandlerScheduler) this.scheduler.getValue();
    }

    /* renamed from: getHeartbeatEnabled$vungle_ads_release, reason: from getter */
    public final boolean getHeartbeatEnabled() {
        return this.heartbeatEnabled;
    }

    public final void setHeartbeatEnabled$vungle_ads_release(boolean z) {
        this.heartbeatEnabled = z;
    }

    public final SuspendableTimer getSuspendableTimer$vungle_ads_release() {
        return (SuspendableTimer) this.suspendableTimer.getValue();
    }

    /* renamed from: getBackEnabled$vungle_ads_release, reason: from getter */
    public final boolean getBackEnabled() {
        return this.backEnabled;
    }

    public final void setBackEnabled$vungle_ads_release(boolean z) {
        this.backEnabled = z;
    }

    public final ClickCoordinateTracker getClickCoordinateTracker$vungle_ads_release() {
        return (ClickCoordinateTracker) this.clickCoordinateTracker.getValue();
    }

    /* compiled from: MRAIDPresenter.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u0006\n\u0002\b\u0015\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u0016\u0010\u0005\u001a\u00020\u00048\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b\u0006\u0010\u0002R\u0016\u0010\u0007\u001a\u00020\u00048\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b\b\u0010\u0002R\u0016\u0010\t\u001a\u00020\u00048\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b\n\u0010\u0002R\u0016\u0010\u000b\u001a\u00020\u00048\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b\f\u0010\u0002R\u0016\u0010\r\u001a\u00020\u00048\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b\u000e\u0010\u0002R\u0016\u0010\u000f\u001a\u00020\u00048\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b\u0010\u0010\u0002R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082T¢\u0006\u0002\n\u0000R\u0016\u0010\u0013\u001a\u00020\u00048\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b\u0014\u0010\u0002R\u000e\u0010\u0015\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u0016\u0010\u0016\u001a\u00020\u00048\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b\u0017\u0010\u0002R\u0016\u0010\u0018\u001a\u00020\u00048\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b\u0019\u0010\u0002R\u0016\u0010\u001a\u001a\u00020\u00048\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b\u001b\u0010\u0002R\u000e\u0010\u001c\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u0016\u0010\u001d\u001a\u00020\u00048\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b\u001e\u0010\u0002R\u0016\u0010\u001f\u001a\u00020\u00048\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b \u0010\u0002R\u000e\u0010!\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u0016\u0010#\u001a\u00020\u00048\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b$\u0010\u0002R\u0016\u0010%\u001a\u00020\u00048\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b&\u0010\u0002¨\u0006'"}, d2 = {"Lcom/vungle/ads/internal/presenter/MRAIDPresenter$Companion;", "", "()V", "ACTION", "", "ACTION_WITH_VALUE", "getACTION_WITH_VALUE$vungle_ads_release$annotations", "CLOSE", "getCLOSE$vungle_ads_release$annotations", "CONSENT_ACTION", "getCONSENT_ACTION$vungle_ads_release$annotations", "CREATIVE_HEARTBEAT", "getCREATIVE_HEARTBEAT$vungle_ads_release$annotations", "ERROR", "getERROR$vungle_ads_release$annotations", "GET_AVAILABLE_DISK_SPACE", "getGET_AVAILABLE_DISK_SPACE$vungle_ads_release$annotations", "HEARTBEAT_INTERVAL", "", "OPEN", "getOPEN$vungle_ads_release$annotations", "OPEN_NON_MRAID", "OPEN_PRIVACY", "getOPEN_PRIVACY$vungle_ads_release$annotations", "SET_ORIENTATION_PROPERTIES", "getSET_ORIENTATION_PROPERTIES$vungle_ads_release$annotations", "SUCCESSFUL_VIEW", "getSUCCESSFUL_VIEW$vungle_ads_release$annotations", "TAG", "TPAT", "getTPAT$vungle_ads_release$annotations", "UPDATE_SIGNALS", "getUPDATE_SIGNALS$vungle_ads_release$annotations", "USE_CUSTOM_CLOSE", "USE_CUSTOM_PRIVACY", "VIDEO_LENGTH", "getVIDEO_LENGTH$vungle_ads_release$annotations", "VIDEO_VIEWED", "getVIDEO_VIEWED$vungle_ads_release$annotations", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ void getACTION_WITH_VALUE$vungle_ads_release$annotations() {
        }

        public static /* synthetic */ void getCLOSE$vungle_ads_release$annotations() {
        }

        public static /* synthetic */ void getCONSENT_ACTION$vungle_ads_release$annotations() {
        }

        public static /* synthetic */ void getCREATIVE_HEARTBEAT$vungle_ads_release$annotations() {
        }

        public static /* synthetic */ void getERROR$vungle_ads_release$annotations() {
        }

        public static /* synthetic */ void getGET_AVAILABLE_DISK_SPACE$vungle_ads_release$annotations() {
        }

        public static /* synthetic */ void getOPEN$vungle_ads_release$annotations() {
        }

        public static /* synthetic */ void getOPEN_PRIVACY$vungle_ads_release$annotations() {
        }

        public static /* synthetic */ void getSET_ORIENTATION_PROPERTIES$vungle_ads_release$annotations() {
        }

        public static /* synthetic */ void getSUCCESSFUL_VIEW$vungle_ads_release$annotations() {
        }

        public static /* synthetic */ void getTPAT$vungle_ads_release$annotations() {
        }

        public static /* synthetic */ void getUPDATE_SIGNALS$vungle_ads_release$annotations() {
        }

        public static /* synthetic */ void getVIDEO_LENGTH$vungle_ads_release$annotations() {
        }

        public static /* synthetic */ void getVIDEO_VIEWED$vungle_ads_release$annotations() {
        }

        private Companion() {
        }
    }

    public final void setEventListener(AdEventListener listener) {
        this.bus = listener;
    }

    public final void setPresenterDelegate$vungle_ads_release(PresenterDelegate presenterDelegate) {
        this.presenterDelegate = presenterDelegate;
    }

    public final void onViewConfigurationChanged() {
        this.vungleWebClient.notifyPropertiesChange(true);
    }

    public final void start() {
        Logger.INSTANCE.d(TAG, "start()");
        this.adWidget.resumeWeb();
        setAdVisibility(true);
        if (ConfigManager.INSTANCE.adLoadOptimizationEnabled()) {
            recordPlayAssetMetric();
        }
    }

    public final void stop() {
        Logger.INSTANCE.d(TAG, "stop()");
        this.adWidget.pauseWeb();
        setAdVisibility(false);
    }

    public final void detach(@MRAIDAdWidget.AdStopReason int stopReason) {
        AdEventListener adEventListener;
        Logger.INSTANCE.d(TAG, "detach()");
        boolean z = (stopReason & 1) != 0;
        boolean z2 = (stopReason & 2) != 0;
        this.vungleWebClient.setWebViewObserver(null);
        this.vungleWebClient.setMraidDelegate(null);
        if (!z && z2 && !this.isDestroying.getAndSet(true) && (adEventListener = this.bus) != null) {
            adEventListener.onNext("end", null, this.placement.getReferenceId());
        }
        this.adWidget.destroyWebView(this.omTracker.stop());
        if (this.heartbeatEnabled) {
            getSuspendableTimer$vungle_ads_release().cancel();
        }
    }

    public final void setAdVisibility(boolean isViewable) {
        this.vungleWebClient.setAdVisibility(isViewable);
    }

    public final void onViewTouched(MotionEvent event) {
        if (event != null) {
            getClickCoordinateTracker$vungle_ads_release().trackCoordinate(event);
        }
    }

    private final void closeView() {
        Long l = this.adStartTime;
        if (l != null) {
            long jCurrentTimeMillis = System.currentTimeMillis() - l.longValue();
            TpatSender tpatSender = new TpatSender(getVungleApiClient$vungle_ads_release(), this.placement.getReferenceId(), this.advertisement.getCreativeId(), this.advertisement.eventId(), getExecutors().getIO_EXECUTOR(), getPathProvider(), getSignalManager());
            List<String> tpatUrls = this.advertisement.getTpatUrls(Constants.AD_CLOSE_TPAT_KEY, String.valueOf(jCurrentTimeMillis), String.valueOf(this.platform.getVolumeLevel()));
            if (tpatUrls != null) {
                tpatSender.sendTpats(tpatUrls, this.executor);
            }
        }
        this.adWidget.close();
    }

    public final void handleExit() {
        if (this.backEnabled) {
            this.adWidget.showWebsite("javascript:window.vungle.mraidBridgeExt.requestMRAIDClose()");
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:100:0x024f, code lost:
    
        if (r2 == null) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0255, code lost:
    
        if (r2.length() != 0) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0258, code lost:
    
        r2 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x025a, code lost:
    
        r2 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x025b, code lost:
    
        if (r2 == false) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x025d, code lost:
    
        r2 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0260, code lost:
    
        if (r2 == null) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0266, code lost:
    
        if (r2.length() != 0) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0268, code lost:
    
        r10 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0269, code lost:
    
        if (r10 == false) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x026b, code lost:
    
        com.vungle.ads.internal.util.Logger.INSTANCE.e(com.vungle.ads.internal.presenter.MRAIDPresenter.TAG, "CTA destination URL is not configured properly");
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0273, code lost:
    
        r2 = r21.adWidget.getContext();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, "adWidget.context");
        com.vungle.ads.internal.util.ExternalRouter.launch(r11, r1, r2, new com.vungle.ads.internal.ui.PresenterAppLeftCallback(r21.bus, r21.placement.getReferenceId()), new com.vungle.ads.internal.presenter.MRAIDPresenter.AnonymousClass5(r21));
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0295, code lost:
    
        r1 = r21.bus;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0297, code lost:
    
        if (r1 == null) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0299, code lost:
    
        r1.onNext("open", "adClick", r21.placement.getReferenceId());
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0221, code lost:
    
        if (r22.equals("open") == false) goto L200;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0236, code lost:
    
        if (r22.equals(com.vungle.ads.internal.presenter.MRAIDPresenter.OPEN_NON_MRAID) == false) goto L200;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x023a, code lost:
    
        r1 = r21.advertisement.adUnit();
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0240, code lost:
    
        if (r1 == null) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0242, code lost:
    
        r11 = r1.getDeeplinkUrl();
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0246, code lost:
    
        r1 = com.vungle.ads.internal.util.JsonUtil.INSTANCE.getContentStringValue(r23, "url");
        r2 = r11;
     */
    /* JADX WARN: Removed duplicated region for block: B:168:0x038b  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x039a  */
    @Override // com.vungle.ads.internal.ui.view.WebViewAPI.MraidDelegate
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean processCommand(java.lang.String r22, kotlinx.serialization.json.JsonObject r23) throws java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 1222
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vungle.ads.internal.presenter.MRAIDPresenter.processCommand(java.lang.String, kotlinx.serialization.json.JsonObject):boolean");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: processCommand$lambda-5, reason: not valid java name */
    public static final void m964processCommand$lambda5(MRAIDPresenter this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.vungleWebClient.notifyPropertiesChange(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: processCommand$lambda-6, reason: not valid java name */
    public static final void m965processCommand$lambda6(MRAIDPresenter this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.adWidget.setVisibility(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: processCommand$lambda-8, reason: not valid java name */
    public static final void m966processCommand$lambda8(MRAIDPresenter this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        String referenceId = this$0.placement.getReferenceId();
        List list = null;
        Boolean bool = null;
        String str = null;
        Call<Void> callRi = this$0.getVungleApiClient$vungle_ads_release().ri(new CommonRequestBody.RequestParam(list, bool, str, this$0.adStartTime, this$0.advertisement.appId(), referenceId, this$0.userId, 7, (DefaultConstructorMarker) null));
        if (callRi == null) {
            Logger.INSTANCE.e(TAG, "Invalid ri call.");
        } else {
            callRi.enqueue(new Callback<Void>() { // from class: com.vungle.ads.internal.presenter.MRAIDPresenter$processCommand$6$1
                @Override // com.vungle.ads.internal.network.Callback
                public void onResponse(Call<Void> call, Response<Void> response) {
                    Logger.INSTANCE.d("MRAIDPresenter", "send RI success");
                }

                @Override // com.vungle.ads.internal.network.Callback
                public void onFailure(Call<Void> call, Throwable t) {
                    Logger.INSTANCE.d("MRAIDPresenter", "send RI Failure");
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: processCommand$lambda-9, reason: not valid java name */
    public static final void m967processCommand$lambda9(MRAIDPresenter this$0, boolean z, String str, String str2) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.handleWebViewException(new InternalError(VungleError.CREATIVE_ERROR, null, 2, null), z, str + " : " + str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: processCommand$lambda-10, reason: not valid java name */
    public static final void m962processCommand$lambda10(MRAIDPresenter this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.getSuspendableTimer$vungle_ads_release().reset();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: processCommand$lambda-11, reason: not valid java name */
    public static final void m963processCommand$lambda11(MRAIDPresenter this$0, long j) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.vungleWebClient.notifyDiskAvailableSize(j);
    }

    private final void makeBusError(VungleError reason) {
        AdEventListener adEventListener = this.bus;
        if (adEventListener != null) {
            adEventListener.onError(reason, this.placement.getReferenceId());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void reportErrorAndCloseAd(VungleError reason) {
        makeBusError(reason);
        closeView();
    }

    @Override // com.vungle.ads.internal.ui.view.WebViewAPI.WebClientErrorHandler
    public void onReceivedError(String errorDesc, boolean didCrash) {
        Intrinsics.checkNotNullParameter(errorDesc, "errorDesc");
        if (didCrash) {
            reportErrorAndCloseAd(new InternalError(VungleError.AD_RENDER_NETWORK_ERROR, null, 2, null));
        }
    }

    @Override // com.vungle.ads.internal.ui.view.WebViewAPI.WebClientErrorHandler
    public boolean onWebRenderingProcessGone(WebView view, Boolean didCrash) {
        handleWebViewException$default(this, new InternalError(VungleError.WEB_CRASH, null, 2, null), true, null, 4, null);
        return true;
    }

    @Override // com.vungle.ads.internal.ui.view.WebViewAPI.WebClientErrorHandler
    public void onRenderProcessUnresponsive(WebView webView, WebViewRenderProcess webViewRenderProcess) {
        handleWebViewException$default(this, new InternalError(VungleError.WEBVIEW_RENDER_UNRESPONSIVE, null, 2, null), true, null, 4, null);
    }

    static /* synthetic */ void handleWebViewException$default(MRAIDPresenter mRAIDPresenter, VungleError vungleError, boolean z, String str, int i, Object obj) {
        if ((i & 4) != 0) {
            str = null;
        }
        mRAIDPresenter.handleWebViewException(vungleError, z, str);
    }

    private final void handleWebViewException(VungleError reason, boolean fatal, String errorMessage) {
        Logger.INSTANCE.e(TAG, "handleWebViewException: " + reason.getLocalizedMessage() + ", fatal: " + fatal + ", errorMsg: " + errorMessage);
        if (fatal) {
            makeBusError(reason);
            closeView();
        }
    }

    private final boolean loadMraid(File template) {
        String parent = template.getParent();
        File file = parent != null ? new File(parent) : null;
        StringBuilder sb = new StringBuilder();
        sb.append(file != null ? file.getPath() : null);
        sb.append(File.separator);
        sb.append("index.html");
        File file2 = new File(sb.toString());
        if (!file2.exists()) {
            AnalyticsClient.INSTANCE.logError$vungle_ads_release(310, "Fail to load html " + file2.getPath(), this.placement.getReferenceId(), this.advertisement.getCreativeId(), this.advertisement.eventId());
            return false;
        }
        this.adWidget.showWebsite(AdPayload.FILE_SCHEME + file2.getPath());
        return true;
    }

    public final void prepare() {
        int i;
        String alertTitleText;
        String alertBodyText;
        String alertContinueButtonText;
        String alertCloseButtonText;
        int settings;
        boolean z = false;
        this.isDestroying.set(false);
        this.adWidget.linkWebView(this.vungleWebClient);
        AdConfig adConfig = this.advertisement.getAdConfig();
        if (adConfig != null && (settings = adConfig.getSettings()) > 0) {
            this.backEnabled = (settings & 2) == 2;
        }
        this.heartbeatEnabled = ConfigManager.INSTANCE.heartbeatEnabled();
        AdConfig adConfig2 = this.advertisement.getAdConfig();
        Integer numValueOf = adConfig2 != null ? Integer.valueOf(adConfig2.getAdOrientation()) : null;
        if (numValueOf != null && numValueOf.intValue() == 0) {
            i = 7;
        } else {
            i = (numValueOf != null && numValueOf.intValue() == 1) ? 6 : 4;
        }
        this.adWidget.setOrientation(i);
        this.omTracker.start();
        this.vungleWebClient.setMraidDelegate(this);
        this.vungleWebClient.setErrorHandler(this);
        File assetDirectory = this.advertisement.getAssetDirectory();
        if (assetDirectory == null || !assetDirectory.exists()) {
            reportErrorAndCloseAd(new AdNotLoadedCantPlay());
            return;
        }
        if (!loadMraid(new File(assetDirectory.getPath() + File.separator + "template"))) {
            reportErrorAndCloseAd(new AdNotLoadedCantPlay());
            return;
        }
        this.adStartTime = Long.valueOf(System.currentTimeMillis());
        PresenterDelegate presenterDelegate = this.presenterDelegate;
        this.userId = presenterDelegate != null ? presenterDelegate.getUserId() : null;
        PresenterDelegate presenterDelegate2 = this.presenterDelegate;
        if (presenterDelegate2 == null || (alertTitleText = presenterDelegate2.getAlertTitleText()) == null) {
            alertTitleText = "";
        }
        PresenterDelegate presenterDelegate3 = this.presenterDelegate;
        if (presenterDelegate3 == null || (alertBodyText = presenterDelegate3.getAlertBodyText()) == null) {
            alertBodyText = "";
        }
        PresenterDelegate presenterDelegate4 = this.presenterDelegate;
        if (presenterDelegate4 == null || (alertContinueButtonText = presenterDelegate4.getAlertContinueButtonText()) == null) {
            alertContinueButtonText = "";
        }
        PresenterDelegate presenterDelegate5 = this.presenterDelegate;
        if (presenterDelegate5 == null || (alertCloseButtonText = presenterDelegate5.getAlertCloseButtonText()) == null) {
            alertCloseButtonText = "";
        }
        this.advertisement.setIncentivizedText(alertTitleText, alertBodyText, alertContinueButtonText, alertCloseButtonText);
        if (ConfigManager.INSTANCE.getGDPRIsCountryDataProtected() && Intrinsics.areEqual("unknown", PrivacyManager.INSTANCE.getConsentStatus())) {
            z = true;
        }
        this.vungleWebClient.setConsentStatus(z, ConfigManager.INSTANCE.getGDPRConsentTitle(), ConfigManager.INSTANCE.getGDPRConsentMessage(), ConfigManager.INSTANCE.getGDPRButtonAccept(), ConfigManager.INSTANCE.getGDPRButtonDeny());
        if (z) {
            PrivacyManager.INSTANCE.updateGdprConsent("opted_out_by_timeout", "vungle_modal", "");
        }
        int showCloseDelay = this.advertisement.getShowCloseDelay(Boolean.valueOf(this.placement.getIsIncentivized()));
        if (showCloseDelay > 0) {
            getScheduler().schedule(new Runnable() { // from class: com.vungle.ads.internal.presenter.MRAIDPresenter$$ExternalSyntheticLambda2
                @Override // java.lang.Runnable
                public final void run() {
                    MRAIDPresenter.m961prepare$lambda14(this.f$0);
                }
            }, showCloseDelay);
        } else {
            this.backEnabled = true;
        }
        AdEventListener adEventListener = this.bus;
        if (adEventListener != null) {
            adEventListener.onNext("start", null, this.placement.getReferenceId());
        }
        if (this.heartbeatEnabled) {
            getSuspendableTimer$vungle_ads_release().start();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: prepare$lambda-14, reason: not valid java name */
    public static final void m961prepare$lambda14(MRAIDPresenter this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.backEnabled = true;
    }

    private final void recordPlayAssetMetric() {
        Sdk.SDKMetric.SDKMetricType sDKMetricType;
        if (this.advertisement.getAssetsFullyDownloaded()) {
            sDKMetricType = Sdk.SDKMetric.SDKMetricType.LOCAL_ASSETS_USED;
        } else {
            sDKMetricType = Sdk.SDKMetric.SDKMetricType.REMOTE_ASSETS_USED;
        }
        AnalyticsClient.INSTANCE.logMetric$vungle_ads_release(new SingleValueMetric(sDKMetricType), (16 & 2) != 0 ? null : this.placement.getReferenceId(), (16 & 4) != 0 ? null : this.advertisement.getCreativeId(), (16 & 8) != 0 ? null : this.advertisement.eventId(), (16 & 16) != 0 ? null : null);
    }
}
