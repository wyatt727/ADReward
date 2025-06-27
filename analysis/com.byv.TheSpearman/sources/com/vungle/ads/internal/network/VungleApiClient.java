package com.vungle.ads.internal.network;

import android.app.UiModeManager;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.PowerManager;
import android.security.NetworkSecurityPolicy;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import android.webkit.URLUtil;
import androidx.core.content.PermissionChecker;
import androidx.core.util.Consumer;
import com.google.ads.mediation.vungle.VungleConstants;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.common.net.HttpHeaders;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.json.m4;
import com.json.t2;
import com.mbridge.msdk.foundation.entity.b;
import com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridgeBase;
import com.vungle.ads.AnalyticsClient;
import com.vungle.ads.BuildConfig;
import com.vungle.ads.ServiceLocator;
import com.vungle.ads.TimeIntervalMetric;
import com.vungle.ads.VungleAds;
import com.vungle.ads.internal.ConfigManager;
import com.vungle.ads.internal.load.BaseAdLoader;
import com.vungle.ads.internal.model.AdPayload;
import com.vungle.ads.internal.model.AdvertisingInfo;
import com.vungle.ads.internal.model.AppNode;
import com.vungle.ads.internal.model.CommonRequestBody;
import com.vungle.ads.internal.model.ConfigPayload;
import com.vungle.ads.internal.model.Cookie;
import com.vungle.ads.internal.model.DeviceNode;
import com.vungle.ads.internal.persistence.FilePreferences;
import com.vungle.ads.internal.platform.AndroidPlatform;
import com.vungle.ads.internal.platform.Platform;
import com.vungle.ads.internal.privacy.COPPA;
import com.vungle.ads.internal.privacy.PrivacyManager;
import com.vungle.ads.internal.protos.Sdk;
import com.vungle.ads.internal.signals.SignalManager;
import com.vungle.ads.internal.ui.AdActivity;
import com.vungle.ads.internal.util.FileUtility;
import com.vungle.ads.internal.util.Logger;
import java.io.IOException;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.net.MalformedURLException;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.SocketAddress;
import java.net.URI;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.annotation.AnnotationRetention;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.text.StringsKt;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializersKt;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonBuilder;
import kotlinx.serialization.json.JsonKt;
import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okio.Buffer;
import okio.BufferedSink;
import okio.GzipSink;
import okio.Okio;

/* compiled from: VungleApiClient.kt */
@Metadata(d1 = {"\u0000Ö\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010%\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 t2\u00020\u0001:\u0003tuvB\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0010\u00106\u001a\u0002072\u0006\u00108\u001a\u00020\u001eH\u0007J\u0012\u00109\u001a\u00020\u00142\b\u0010:\u001a\u0004\u0018\u00010;H\u0002J\u000e\u0010<\u001a\u00020\u001e2\u0006\u0010=\u001a\u00020\u0014J\u000e\u0010>\u001a\n\u0012\u0004\u0012\u00020@\u0018\u00010?J\u0010\u0010A\u001a\u00020B2\u0006\u0010:\u001a\u00020CH\u0002J\u0010\u0010D\u001a\u00020\u00162\u0006\u0010E\u001a\u00020\u0003H\u0002J\n\u0010F\u001a\u0004\u0018\u00010\u0014H\u0002J\b\u0010G\u001a\u0004\u0018\u00010\u0014J\u000e\u0010G\u001a\u00020\u00142\u0006\u0010H\u001a\u00020IJ\b\u0010J\u001a\u00020\u0016H\u0002J\u0015\u0010J\u001a\u00020\u00162\u0006\u0010K\u001a\u00020\u001eH\u0001¢\u0006\u0002\bLJ\u0014\u0010M\u001a\u0004\u0018\u00010N2\b\b\u0002\u0010O\u001a\u00020\u001eH\u0002J\u0012\u0010P\u001a\u00020\u00142\b\u0010Q\u001a\u0004\u0018\u00010;H\u0002J\u000f\u0010R\u001a\u0004\u0018\u00010\u001eH\u0007¢\u0006\u0002\u0010SJ\u000f\u0010T\u001a\u0004\u0018\u00010\u001eH\u0007¢\u0006\u0002\u0010SJ\u000e\u0010U\u001a\u00020)2\u0006\u0010=\u001a\u00020\u0014J\b\u0010V\u001a\u00020WH\u0002J\b\u0010X\u001a\u000207H\u0002J\u000e\u0010Y\u001a\u0002072\u0006\u0010Z\u001a\u00020\u0014J\u000f\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0007¢\u0006\u0002\u0010SJ\u0010\u0010[\u001a\u0004\u0018\u00010\\2\u0006\u0010]\u001a\u00020\u0014J\u001c\u0010^\u001a\u0002072\f\u0010_\u001a\b\u0012\u0004\u0012\u00020a0`2\u0006\u0010b\u001a\u00020cJ\u001c\u0010d\u001a\u0002072\f\u0010e\u001a\b\u0012\u0004\u0012\u00020f0`2\u0006\u0010b\u001a\u00020cJ(\u0010g\u001a\n\u0012\u0004\u0012\u00020h\u0018\u00010?2\u0006\u0010i\u001a\u00020\u00142\b\u0010j\u001a\u0004\u0018\u00010\u00142\u0006\u0010k\u001a\u00020\u001eJ\u0010\u0010l\u001a\u00020m2\b\b\u0002\u0010O\u001a\u00020\u001eJ\u0016\u0010n\u001a\n\u0012\u0004\u0012\u00020o\u0018\u00010?2\u0006\u0010:\u001a\u00020pJ\u0016\u0010q\u001a\u0002072\u0006\u0010r\u001a\u00020\u00142\u0006\u0010s\u001a\u00020\u0014R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R&\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0000@\u0000X\u0081\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010\u0017\u001a\u00020\n8\u0000@\u0000X\u0081\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u0018\u0010\u000e\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u001eX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u001fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010 \u001a\u00020!8\u0000@\u0000X\u0081\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\"\u0010\u000e\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R0\u0010'\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020)0(8\u0000@\u0000X\u0081\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b*\u0010\u000e\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\u001b\u0010/\u001a\u0002008BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b1\u00102R\u0010\u00105\u001a\u0004\u0018\u00010\u0014X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006w"}, d2 = {"Lcom/vungle/ads/internal/network/VungleApiClient;", "", "applicationContext", "Landroid/content/Context;", "platform", "Lcom/vungle/ads/internal/platform/Platform;", "filePreferences", "Lcom/vungle/ads/internal/persistence/FilePreferences;", "(Landroid/content/Context;Lcom/vungle/ads/internal/platform/Platform;Lcom/vungle/ads/internal/persistence/FilePreferences;)V", "api", "Lcom/vungle/ads/internal/network/VungleApi;", "appBody", "Lcom/vungle/ads/internal/model/AppNode;", "getAppBody$vungle_ads_release$annotations", "()V", "getAppBody$vungle_ads_release", "()Lcom/vungle/ads/internal/model/AppNode;", "setAppBody$vungle_ads_release", "(Lcom/vungle/ads/internal/model/AppNode;)V", "appSetId", "", "baseDeviceInfo", "Lcom/vungle/ads/internal/model/DeviceNode;", "gzipApi", "getGzipApi$vungle_ads_release$annotations", "getGzipApi$vungle_ads_release", "()Lcom/vungle/ads/internal/network/VungleApi;", "setGzipApi$vungle_ads_release", "(Lcom/vungle/ads/internal/network/VungleApi;)V", "isGooglePlayServicesAvailable", "", "Ljava/lang/Boolean;", "responseInterceptor", "Lokhttp3/Interceptor;", "getResponseInterceptor$vungle_ads_release$annotations", "getResponseInterceptor$vungle_ads_release", "()Lokhttp3/Interceptor;", "setResponseInterceptor$vungle_ads_release", "(Lokhttp3/Interceptor;)V", "retryAfterDataMap", "", "", "getRetryAfterDataMap$vungle_ads_release$annotations", "getRetryAfterDataMap$vungle_ads_release", "()Ljava/util/Map;", "setRetryAfterDataMap$vungle_ads_release", "(Ljava/util/Map;)V", "signalManager", "Lcom/vungle/ads/internal/signals/SignalManager;", "getSignalManager", "()Lcom/vungle/ads/internal/signals/SignalManager;", "signalManager$delegate", "Lkotlin/Lazy;", "uaString", "addPlaySvcAvailabilityInCookie", "", Cookie.IS_PLAY_SERVICE_AVAILABLE, "bodyToString", AdActivity.REQUEST_KEY_EXTRA, "Lokhttp3/RequestBody;", "checkIsRetryAfterActive", VungleConstants.KEY_PLACEMENT_ID, "config", "Lcom/vungle/ads/internal/network/Call;", "Lcom/vungle/ads/internal/model/ConfigPayload;", "defaultErrorResponse", "Lokhttp3/Response;", "Lokhttp3/Request;", "getBasicDeviceBody", "context", "getConnectionType", "getConnectionTypeDetail", "type", "", "getDeviceBody", "explicitBlock", "getDeviceBody$vungle_ads_release", "getExtBody", "Lcom/vungle/ads/internal/model/CommonRequestBody$RequestExt;", "withSignals", "getPlacementID", "body", "getPlayServicesAvailabilityFromAPI", "()Ljava/lang/Boolean;", "getPlayServicesAvailabilityFromCookie", "getRetryAfterHeaderValue", "getUserBody", "Lcom/vungle/ads/internal/model/CommonRequestBody$User;", "initUserAgentLazy", MobileAdsBridgeBase.initializeMethodName, RemoteConfigConstants.RequestFieldKey.APP_ID, "pingTPAT", "Lcom/vungle/ads/internal/load/BaseAdLoader$ErrorInfo;", "url", "reportErrors", "errors", "Ljava/util/concurrent/BlockingQueue;", "Lcom/vungle/ads/internal/protos/Sdk$SDKError$Builder;", "requestListener", "Lcom/vungle/ads/AnalyticsClient$RequestListener;", "reportMetrics", "metrics", "Lcom/vungle/ads/internal/protos/Sdk$SDKMetric$Builder;", "requestAd", "Lcom/vungle/ads/internal/model/AdPayload;", "placement", t2.h.O, "isHeaderBiddingEnable", "requestBody", "Lcom/vungle/ads/internal/model/CommonRequestBody;", "ri", "Ljava/lang/Void;", "Lcom/vungle/ads/internal/model/CommonRequestBody$RequestParam;", "sendAdMarkup", "adMarkup", m4.q, "Companion", "ConnectionTypeDetail", "GzipRequestInterceptor", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes5.dex */
public final class VungleApiClient {
    private static final String BASE_URL;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final String MANUFACTURER_AMAZON = "Amazon";
    private static final String TAG = "VungleApiClient";
    private static VungleAds.WrapperFramework WRAPPER_FRAMEWORK_SELECTED;
    private static String headerUa;
    private static final Json json;
    private static final Set<Interceptor> logInterceptors;
    private static final Set<Interceptor> networkInterceptors;
    private VungleApi api;
    private AppNode appBody;
    private String appSetId;
    private final Context applicationContext;
    private DeviceNode baseDeviceInfo;
    private final FilePreferences filePreferences;
    private VungleApi gzipApi;
    private Boolean isGooglePlayServicesAvailable;
    private final Platform platform;
    private Interceptor responseInterceptor;
    private Map<String, Long> retryAfterDataMap;

    /* renamed from: signalManager$delegate, reason: from kotlin metadata */
    private final Lazy signalManager;
    private String uaString;

    public static /* synthetic */ void getAppBody$vungle_ads_release$annotations() {
    }

    public static /* synthetic */ void getGzipApi$vungle_ads_release$annotations() {
    }

    public static /* synthetic */ void getResponseInterceptor$vungle_ads_release$annotations() {
    }

    public static /* synthetic */ void getRetryAfterDataMap$vungle_ads_release$annotations() {
    }

    public final String getConnectionTypeDetail(int type) {
        if (type == 1) {
            return "gprs";
        }
        if (type == 2) {
            return "edge";
        }
        if (type == 20) {
            return "5g";
        }
        switch (type) {
            case 4:
                return "wcdma";
            case 5:
                return "cdma_evdo_0";
            case 6:
                return "cdma_evdo_a";
            case 7:
                return "cdma_1xrtt";
            case 8:
                return "hsdpa";
            case 9:
                return "hsupa";
            default:
                switch (type) {
                    case 12:
                        return "cdma_evdo_b";
                    case 13:
                        return "lte";
                    case 14:
                        return "hrpd";
                    default:
                        return "unknown";
                }
        }
    }

    public VungleApiClient(final Context applicationContext, Platform platform, FilePreferences filePreferences) {
        Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
        Intrinsics.checkNotNullParameter(platform, "platform");
        Intrinsics.checkNotNullParameter(filePreferences, "filePreferences");
        this.applicationContext = applicationContext;
        this.platform = platform;
        this.filePreferences = filePreferences;
        this.uaString = System.getProperty("http.agent");
        this.appSetId = "";
        ServiceLocator.Companion companion = ServiceLocator.INSTANCE;
        this.signalManager = LazyKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, (Function0) new Function0<SignalManager>() { // from class: com.vungle.ads.internal.network.VungleApiClient$special$$inlined$inject$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.vungle.ads.internal.signals.SignalManager, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final SignalManager invoke() {
                return ServiceLocator.INSTANCE.getInstance(applicationContext).getService(SignalManager.class);
            }
        });
        this.retryAfterDataMap = new ConcurrentHashMap();
        this.responseInterceptor = new Interceptor() { // from class: com.vungle.ads.internal.network.VungleApiClient$$ExternalSyntheticLambda0
            @Override // okhttp3.Interceptor
            public final okhttp3.Response intercept(Interceptor.Chain chain) {
                return VungleApiClient.m953responseInterceptor$lambda0(this.f$0, chain);
            }
        };
        OkHttpClient.Builder builderProxySelector = new OkHttpClient.Builder().addInterceptor(this.responseInterceptor).proxySelector(new ProxySelector() { // from class: com.vungle.ads.internal.network.VungleApiClient$builder$1
            @Override // java.net.ProxySelector
            public List<Proxy> select(URI uri) {
                try {
                    List<Proxy> listSelect = ProxySelector.getDefault().select(uri);
                    Intrinsics.checkNotNullExpressionValue(listSelect, "{\n                      …ri)\n                    }");
                    return listSelect;
                } catch (Exception unused) {
                    return CollectionsKt.listOf(Proxy.NO_PROXY);
                }
            }

            @Override // java.net.ProxySelector
            public void connectFailed(URI uri, SocketAddress sa, IOException ioe) {
                try {
                    ProxySelector.getDefault().connectFailed(uri, sa, ioe);
                } catch (Exception unused) {
                }
            }
        });
        OkHttpClient okHttpClientBuild = builderProxySelector.build();
        OkHttpClient okHttpClientBuild2 = builderProxySelector.addInterceptor(new GzipRequestInterceptor()).build();
        this.api = new VungleApiImpl(okHttpClientBuild);
        this.gzipApi = new VungleApiImpl(okHttpClientBuild2);
    }

    /* compiled from: VungleApiClient.kt */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0019\u001a\u00020\u0004H\u0002J\r\u0010\u001a\u001a\u00020\u001bH\u0000¢\u0006\u0002\b\u001cR\u0014\u0010\u0003\u001a\u00020\u0004X\u0080D¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lcom/vungle/ads/internal/network/VungleApiClient$Companion;", "", "()V", "BASE_URL", "", "getBASE_URL$vungle_ads_release", "()Ljava/lang/String;", "MANUFACTURER_AMAZON", "TAG", "WRAPPER_FRAMEWORK_SELECTED", "Lcom/vungle/ads/VungleAds$WrapperFramework;", "getWRAPPER_FRAMEWORK_SELECTED$vungle_ads_release", "()Lcom/vungle/ads/VungleAds$WrapperFramework;", "setWRAPPER_FRAMEWORK_SELECTED$vungle_ads_release", "(Lcom/vungle/ads/VungleAds$WrapperFramework;)V", "headerUa", "getHeaderUa", "setHeaderUa", "(Ljava/lang/String;)V", "json", "Lkotlinx/serialization/json/Json;", "logInterceptors", "", "Lokhttp3/Interceptor;", "networkInterceptors", "defaultHeader", "reset", "", "reset$vungle_ads_release", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final String getBASE_URL$vungle_ads_release() {
            return VungleApiClient.BASE_URL;
        }

        public final VungleAds.WrapperFramework getWRAPPER_FRAMEWORK_SELECTED$vungle_ads_release() {
            return VungleApiClient.WRAPPER_FRAMEWORK_SELECTED;
        }

        public final void setWRAPPER_FRAMEWORK_SELECTED$vungle_ads_release(VungleAds.WrapperFramework wrapperFramework) {
            VungleApiClient.WRAPPER_FRAMEWORK_SELECTED = wrapperFramework;
        }

        public final String getHeaderUa() {
            return VungleApiClient.headerUa;
        }

        public final void setHeaderUa(String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            VungleApiClient.headerUa = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String defaultHeader() {
            StringBuilder sb = new StringBuilder();
            sb.append(Intrinsics.areEqual("Amazon", Build.MANUFACTURER) ? "VungleAmazon/" : "VungleDroid/");
            sb.append(BuildConfig.VERSION_NAME);
            return sb.toString();
        }

        public final void reset$vungle_ads_release() {
            setWRAPPER_FRAMEWORK_SELECTED$vungle_ads_release(null);
            setHeaderUa(defaultHeader());
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        BASE_URL = "https://config.ads.vungle.com/";
        headerUa = companion.defaultHeader();
        networkInterceptors = new HashSet();
        logInterceptors = new HashSet();
        json = JsonKt.Json$default(null, new Function1<JsonBuilder, Unit>() { // from class: com.vungle.ads.internal.network.VungleApiClient$Companion$json$1
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
    }

    /* renamed from: getGzipApi$vungle_ads_release, reason: from getter */
    public final VungleApi getGzipApi() {
        return this.gzipApi;
    }

    public final void setGzipApi$vungle_ads_release(VungleApi vungleApi) {
        Intrinsics.checkNotNullParameter(vungleApi, "<set-?>");
        this.gzipApi = vungleApi;
    }

    /* renamed from: getAppBody$vungle_ads_release, reason: from getter */
    public final AppNode getAppBody() {
        return this.appBody;
    }

    public final void setAppBody$vungle_ads_release(AppNode appNode) {
        this.appBody = appNode;
    }

    private final SignalManager getSignalManager() {
        return (SignalManager) this.signalManager.getValue();
    }

    public final Map<String, Long> getRetryAfterDataMap$vungle_ads_release() {
        return this.retryAfterDataMap;
    }

    public final void setRetryAfterDataMap$vungle_ads_release(Map<String, Long> map) {
        Intrinsics.checkNotNullParameter(map, "<set-?>");
        this.retryAfterDataMap = map;
    }

    /* renamed from: getResponseInterceptor$vungle_ads_release, reason: from getter */
    public final Interceptor getResponseInterceptor() {
        return this.responseInterceptor;
    }

    public final void setResponseInterceptor$vungle_ads_release(Interceptor interceptor) {
        Intrinsics.checkNotNullParameter(interceptor, "<set-?>");
        this.responseInterceptor = interceptor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: responseInterceptor$lambda-0, reason: not valid java name */
    public static final okhttp3.Response m953responseInterceptor$lambda0(VungleApiClient this$0, Interceptor.Chain chain) throws NumberFormatException {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(chain, "chain");
        Request request = chain.request();
        try {
            try {
                okhttp3.Response responseProceed = chain.proceed(request);
                String str = responseProceed.headers().get(HttpHeaders.RETRY_AFTER);
                String str2 = str;
                boolean z = true;
                if (str2 == null || str2.length() == 0) {
                    return responseProceed;
                }
                try {
                    long j = Long.parseLong(str);
                    if (j <= 0) {
                        return responseProceed;
                    }
                    String strEncodedPath = request.url().encodedPath();
                    long jCurrentTimeMillis = (j * 1000) + System.currentTimeMillis();
                    if (!StringsKt.endsWith$default(strEncodedPath, b.JSON_KEY_ADS, false, 2, (Object) null)) {
                        return responseProceed;
                    }
                    String placementID = this$0.getPlacementID(request.body());
                    if (placementID.length() <= 0) {
                        z = false;
                    }
                    if (!z) {
                        return responseProceed;
                    }
                    this$0.retryAfterDataMap.put(placementID, Long.valueOf(jCurrentTimeMillis));
                    return responseProceed;
                } catch (Exception unused) {
                    Logger.INSTANCE.d(TAG, "Retry-After value is not an valid value");
                    return responseProceed;
                }
            } catch (Exception e) {
                Logger.INSTANCE.e(TAG, "Exception: " + e.getMessage() + " for " + request.url());
                return this$0.defaultErrorResponse(request);
            }
        } catch (OutOfMemoryError unused2) {
            Logger.INSTANCE.e(TAG, "OOM for " + request.url());
            return this$0.defaultErrorResponse(request);
        }
    }

    private final okhttp3.Response defaultErrorResponse(Request request) {
        return new Response.Builder().request(request).code(500).protocol(Protocol.HTTP_1_1).message("Server is busy").body(ResponseBody.INSTANCE.create("{\"Error\":\"Server is busy\"}", MediaType.INSTANCE.parse("application/json; charset=utf-8"))).build();
    }

    private final String getPlacementID(RequestBody body) {
        List<String> placements;
        try {
            Json json2 = json;
            String strBodyToString = bodyToString(body);
            KSerializer<Object> kSerializerSerializer = SerializersKt.serializer(json2.getSerializersModule(), Reflection.typeOf(CommonRequestBody.class));
            Intrinsics.checkNotNull(kSerializerSerializer, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
            CommonRequestBody.RequestParam request = ((CommonRequestBody) json2.decodeFromString(kSerializerSerializer, strBodyToString)).getRequest();
            if (request == null || (placements = request.getPlacements()) == null) {
                return "";
            }
            String str = placements.get(0);
            return str == null ? "" : str;
        } catch (Exception unused) {
            return "";
        }
    }

    private final String bodyToString(RequestBody request) {
        try {
            Buffer buffer = new Buffer();
            if (request == null) {
                return "";
            }
            request.writeTo(buffer);
            return buffer.readUtf8();
        } catch (Exception unused) {
            return "";
        }
    }

    public final boolean checkIsRetryAfterActive(String placementID) {
        Intrinsics.checkNotNullParameter(placementID, "placementID");
        Long l = this.retryAfterDataMap.get(placementID);
        if ((l != null ? l.longValue() : 0L) > System.currentTimeMillis()) {
            return true;
        }
        this.retryAfterDataMap.remove(placementID);
        return false;
    }

    public final long getRetryAfterHeaderValue(String placementID) {
        Intrinsics.checkNotNullParameter(placementID, "placementID");
        Long l = this.retryAfterDataMap.get(placementID);
        if (l != null) {
            return l.longValue();
        }
        return 0L;
    }

    /* compiled from: VungleApiClient.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 \n2\u00020\u0001:\u0001\nB\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016¨\u0006\u000b"}, d2 = {"Lcom/vungle/ads/internal/network/VungleApiClient$GzipRequestInterceptor;", "Lokhttp3/Interceptor;", "()V", GzipRequestInterceptor.GZIP, "Lokhttp3/RequestBody;", "requestBody", "intercept", "Lokhttp3/Response;", "chain", "Lokhttp3/Interceptor$Chain;", "Companion", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class GzipRequestInterceptor implements Interceptor {
        private static final String CONTENT_ENCODING = "Content-Encoding";
        private static final String GZIP = "gzip";

        @Override // okhttp3.Interceptor
        public okhttp3.Response intercept(Interceptor.Chain chain) throws IOException {
            Intrinsics.checkNotNullParameter(chain, "chain");
            Request request = chain.request();
            RequestBody requestBodyBody = request.body();
            if (requestBodyBody == null || request.header("Content-Encoding") != null) {
                return chain.proceed(request);
            }
            return chain.proceed(request.newBuilder().header("Content-Encoding", GZIP).method(request.method(), gzip(requestBodyBody)).build());
        }

        private final RequestBody gzip(final RequestBody requestBody) throws IOException {
            final Buffer buffer = new Buffer();
            BufferedSink bufferedSinkBuffer = Okio.buffer(new GzipSink(buffer));
            requestBody.writeTo(bufferedSinkBuffer);
            bufferedSinkBuffer.close();
            return new RequestBody() { // from class: com.vungle.ads.internal.network.VungleApiClient$GzipRequestInterceptor$gzip$1
                @Override // okhttp3.RequestBody
                /* renamed from: contentType */
                public MediaType get$contentType() {
                    return requestBody.get$contentType();
                }

                @Override // okhttp3.RequestBody
                public long contentLength() {
                    return buffer.size();
                }

                @Override // okhttp3.RequestBody
                public void writeTo(BufferedSink sink) throws IOException {
                    Intrinsics.checkNotNullParameter(sink, "sink");
                    sink.write(buffer.snapshot());
                }
            };
        }
    }

    public final synchronized void initialize(String appId) {
        PackageInfo packageInfo;
        Intrinsics.checkNotNullParameter(appId, "appId");
        this.api.setAppId(appId);
        this.gzipApi.setAppId(appId);
        String str = "1.0";
        try {
            if (Build.VERSION.SDK_INT >= 33) {
                packageInfo = this.applicationContext.getPackageManager().getPackageInfo(this.applicationContext.getPackageName(), PackageManager.PackageInfoFlags.of(0L));
                Intrinsics.checkNotNullExpressionValue(packageInfo, "{\n                    ap…      )\n                }");
            } else {
                packageInfo = this.applicationContext.getPackageManager().getPackageInfo(this.applicationContext.getPackageName(), 0);
                Intrinsics.checkNotNullExpressionValue(packageInfo, "{\n                    ap…      )\n                }");
            }
            String str2 = packageInfo.versionName;
            Intrinsics.checkNotNullExpressionValue(str2, "packageInfo.versionName");
            str = str2;
        } catch (Exception unused) {
        }
        this.baseDeviceInfo = getBasicDeviceBody(this.applicationContext);
        String packageName = this.applicationContext.getPackageName();
        Intrinsics.checkNotNullExpressionValue(packageName, "applicationContext.packageName");
        this.appBody = new AppNode(packageName, str, appId);
        this.isGooglePlayServicesAvailable = getPlayServicesAvailabilityFromAPI();
    }

    public final Call<ConfigPayload> config() throws IOException {
        AppNode appNode = this.appBody;
        if (appNode == null) {
            return null;
        }
        CommonRequestBody commonRequestBody = new CommonRequestBody(getDeviceBody$vungle_ads_release(true), appNode, getUserBody(), (CommonRequestBody.RequestExt) null, (CommonRequestBody.RequestParam) null, 24, (DefaultConstructorMarker) null);
        CommonRequestBody.RequestExt extBody$default = getExtBody$default(this, false, 1, null);
        if (extBody$default != null) {
            commonRequestBody.setExt(extBody$default);
        }
        FileUtility fileUtility = FileUtility.INSTANCE;
        String str = BASE_URL;
        if (!fileUtility.isValidUrl(str)) {
            str = "https://config.ads.vungle.com/";
        }
        if (!StringsKt.endsWith$default(str, "/", false, 2, (Object) null)) {
            str = str + '/';
        }
        return this.api.config(headerUa, str + "config", commonRequestBody);
    }

    public final Call<AdPayload> requestAd(String placement, String adSize, boolean isHeaderBiddingEnable) throws IllegalStateException {
        Intrinsics.checkNotNullParameter(placement, "placement");
        String adsEndpoint = ConfigManager.INSTANCE.getAdsEndpoint();
        String str = adsEndpoint;
        if (str == null || str.length() == 0) {
            return null;
        }
        CommonRequestBody commonRequestBodyRequestBody = requestBody(!ConfigManager.INSTANCE.signalsDisabled());
        CommonRequestBody.RequestParam requestParam = new CommonRequestBody.RequestParam(CollectionsKt.listOf(placement), Boolean.valueOf(isHeaderBiddingEnable), (String) null, (Long) null, (String) null, (String) null, (String) null, 124, (DefaultConstructorMarker) null);
        String str2 = adSize;
        if (!(str2 == null || str2.length() == 0)) {
            requestParam.setAdSize(adSize);
        }
        commonRequestBodyRequestBody.setRequest(requestParam);
        return this.gzipApi.ads(headerUa, adsEndpoint, commonRequestBodyRequestBody);
    }

    public final Call<Void> ri(CommonRequestBody.RequestParam request) {
        AppNode appNode;
        Intrinsics.checkNotNullParameter(request, "request");
        String riEndpoint = ConfigManager.INSTANCE.getRiEndpoint();
        String str = riEndpoint;
        if ((str == null || str.length() == 0) || (appNode = this.appBody) == null) {
            return null;
        }
        CommonRequestBody commonRequestBody = new CommonRequestBody(getDeviceBody(), appNode, getUserBody(), (CommonRequestBody.RequestExt) null, (CommonRequestBody.RequestParam) null, 24, (DefaultConstructorMarker) null);
        commonRequestBody.setRequest(request);
        CommonRequestBody.RequestExt extBody$default = getExtBody$default(this, false, 1, null);
        if (extBody$default != null) {
            commonRequestBody.setExt(extBody$default);
        }
        return this.api.ri(headerUa, riEndpoint, commonRequestBody);
    }

    public final BaseAdLoader.ErrorInfo pingTPAT(String url) {
        boolean zIsCleartextTrafficPermitted;
        okhttp3.Response rawResponse;
        Intrinsics.checkNotNullParameter(url, "url");
        if ((url.length() == 0) || HttpUrl.INSTANCE.parse(url) == null) {
            return new BaseAdLoader.ErrorInfo(121, "Invalid URL : " + url, null, true, 4, null);
        }
        try {
            String host = new URL(url).getHost();
            if (Build.VERSION.SDK_INT >= 24) {
                zIsCleartextTrafficPermitted = NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(host);
            } else {
                zIsCleartextTrafficPermitted = Build.VERSION.SDK_INT >= 23 ? NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted() : true;
            }
            if (!zIsCleartextTrafficPermitted && URLUtil.isHttpUrl(url)) {
                return new BaseAdLoader.ErrorInfo(121, "Clear Text Traffic is blocked", null, false, 12, null);
            }
            try {
                String str = this.uaString;
                if (str == null) {
                    str = "";
                }
                Response<Void> responseExecute = this.api.pingTPAT(str, url).execute();
                Integer numValueOf = null;
                if (responseExecute != null && responseExecute.isSuccessful()) {
                    return null;
                }
                if (responseExecute != null && (rawResponse = responseExecute.getRawResponse()) != null) {
                    numValueOf = Integer.valueOf(rawResponse.code());
                }
                if (CollectionsKt.contains(CollectionsKt.listOf((Object[]) new Integer[]{301, 302, 307, 308}), numValueOf)) {
                    return new BaseAdLoader.ErrorInfo(29, "Tpat ping was redirected with code " + numValueOf, null, false, 12, null);
                }
                return new BaseAdLoader.ErrorInfo(121, "Tpat ping was not successful", null, false, 12, null);
            } catch (Exception e) {
                int i = 121;
                String localizedMessage = e.getLocalizedMessage();
                if (localizedMessage == null) {
                    localizedMessage = "IOException";
                }
                return new BaseAdLoader.ErrorInfo(i, localizedMessage, null, false, 12, null);
            }
        } catch (MalformedURLException e2) {
            int i2 = 121;
            String localizedMessage2 = e2.getLocalizedMessage();
            if (localizedMessage2 == null) {
                localizedMessage2 = "MalformedURLException";
            }
            return new BaseAdLoader.ErrorInfo(i2, localizedMessage2, null, true, 4, null);
        }
    }

    public final void reportMetrics(BlockingQueue<Sdk.SDKMetric.Builder> metrics, final AnalyticsClient.RequestListener requestListener) {
        Intrinsics.checkNotNullParameter(metrics, "metrics");
        Intrinsics.checkNotNullParameter(requestListener, "requestListener");
        String metricsEndpoint = ConfigManager.INSTANCE.getMetricsEndpoint();
        String str = metricsEndpoint;
        if (str == null || str.length() == 0) {
            requestListener.onFailure();
            return;
        }
        for (Sdk.SDKMetric.Builder builder : metrics) {
            String connectionType = getConnectionType();
            if (connectionType != null) {
                builder.setConnectionType(connectionType);
            }
            String connectionTypeDetail = getConnectionTypeDetail();
            if (connectionTypeDetail != null) {
                builder.setConnectionTypeDetail(connectionTypeDetail);
            }
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = metrics.iterator();
        while (it.hasNext()) {
            arrayList.add(((Sdk.SDKMetric.Builder) it.next()).build());
        }
        Sdk.MetricBatch metricBatchBuild = Sdk.MetricBatch.newBuilder().addAllMetrics(arrayList).build();
        RequestBody.Companion companion = RequestBody.INSTANCE;
        MediaType mediaType = MediaType.INSTANCE.parse("application/x-protobuf");
        byte[] byteArray = metricBatchBuild.toByteArray();
        Intrinsics.checkNotNullExpressionValue(byteArray, "batch.toByteArray()");
        this.api.sendMetrics(headerUa, metricsEndpoint, RequestBody.Companion.create$default(companion, mediaType, byteArray, 0, 0, 12, (Object) null)).enqueue(new Callback<Void>() { // from class: com.vungle.ads.internal.network.VungleApiClient.reportMetrics.3
            @Override // com.vungle.ads.internal.network.Callback
            public void onResponse(Call<Void> call, Response<Void> response) {
                requestListener.onSuccess();
            }

            @Override // com.vungle.ads.internal.network.Callback
            public void onFailure(Call<Void> call, Throwable t) {
                requestListener.onFailure();
            }
        });
    }

    public final void reportErrors(BlockingQueue<Sdk.SDKError.Builder> errors, final AnalyticsClient.RequestListener requestListener) {
        Intrinsics.checkNotNullParameter(errors, "errors");
        Intrinsics.checkNotNullParameter(requestListener, "requestListener");
        String errorLoggingEndpoint = ConfigManager.INSTANCE.getErrorLoggingEndpoint();
        String str = errorLoggingEndpoint;
        if (str == null || str.length() == 0) {
            requestListener.onFailure();
            return;
        }
        for (Sdk.SDKError.Builder builder : errors) {
            String connectionType = getConnectionType();
            if (connectionType != null) {
                builder.setConnectionType(connectionType);
            }
            String connectionTypeDetail = getConnectionTypeDetail();
            if (connectionTypeDetail != null) {
                builder.setConnectionTypeDetail(connectionTypeDetail);
                builder.setConnectionTypeDetailAndroid(connectionTypeDetail);
            }
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = errors.iterator();
        while (it.hasNext()) {
            arrayList.add(((Sdk.SDKError.Builder) it.next()).build());
        }
        Sdk.SDKErrorBatch sDKErrorBatchBuild = Sdk.SDKErrorBatch.newBuilder().addAllErrors(arrayList).build();
        RequestBody.Companion companion = RequestBody.INSTANCE;
        byte[] byteArray = sDKErrorBatchBuild.toByteArray();
        Intrinsics.checkNotNullExpressionValue(byteArray, "batch.toByteArray()");
        this.api.sendErrors(headerUa, errorLoggingEndpoint, companion.create(byteArray, MediaType.INSTANCE.parse("application/x-protobuf"), 0, sDKErrorBatchBuild.toByteArray().length)).enqueue(new Callback<Void>() { // from class: com.vungle.ads.internal.network.VungleApiClient.reportErrors.3
            @Override // com.vungle.ads.internal.network.Callback
            public void onResponse(Call<Void> call, Response<Void> response) {
                requestListener.onSuccess();
            }

            @Override // com.vungle.ads.internal.network.Callback
            public void onFailure(Call<Void> call, Throwable t) {
                requestListener.onFailure();
            }
        });
    }

    public final void sendAdMarkup(String adMarkup, String endpoint) {
        Intrinsics.checkNotNullParameter(adMarkup, "adMarkup");
        Intrinsics.checkNotNullParameter(endpoint, "endpoint");
        this.api.sendAdMarkup(endpoint, RequestBody.INSTANCE.create(adMarkup, MediaType.INSTANCE.parse(m4.K))).enqueue(new Callback<Void>() { // from class: com.vungle.ads.internal.network.VungleApiClient.sendAdMarkup.1
            @Override // com.vungle.ads.internal.network.Callback
            public void onFailure(Call<Void> call, Throwable t) {
            }

            @Override // com.vungle.ads.internal.network.Callback
            public void onResponse(Call<Void> call, Response<Void> response) {
            }
        });
    }

    private final void initUserAgentLazy() {
        final TimeIntervalMetric timeIntervalMetric = new TimeIntervalMetric(Sdk.SDKMetric.SDKMetricType.USER_AGENT_LOAD_DURATION_MS);
        timeIntervalMetric.markStart();
        this.platform.getUserAgentLazy(new Consumer<String>() { // from class: com.vungle.ads.internal.network.VungleApiClient.initUserAgentLazy.1
            @Override // androidx.core.util.Consumer
            public void accept(String uaString) {
                if (uaString == null) {
                    Logger.INSTANCE.e(VungleApiClient.TAG, "Cannot Get UserAgent. Setting Default Device UserAgent");
                    AnalyticsClient.INSTANCE.logError$vungle_ads_release(7, "Fail to get user agent.", (8 & 4) != 0 ? null : null, (8 & 8) != 0 ? null : null, (8 & 16) != 0 ? null : null);
                } else {
                    timeIntervalMetric.markEnd();
                    AnalyticsClient.INSTANCE.logMetric$vungle_ads_release(timeIntervalMetric.getMetricType(), (34 & 2) != 0 ? 0L : timeIntervalMetric.calculateIntervalDuration(), (34 & 4) != 0 ? null : null, (34 & 8) != 0 ? null : null, (34 & 16) != 0 ? null : null, (34 & 32) == 0 ? null : null);
                    this.uaString = uaString;
                }
            }
        });
    }

    public final void addPlaySvcAvailabilityInCookie(boolean isPlaySvcAvailable) {
        this.filePreferences.put(Cookie.IS_PLAY_SERVICE_AVAILABLE, isPlaySvcAvailable).apply();
    }

    public final Boolean getPlayServicesAvailabilityFromCookie() {
        return this.filePreferences.getBoolean(Cookie.IS_PLAY_SERVICE_AVAILABLE);
    }

    public final Boolean getPlayServicesAvailabilityFromAPI() {
        Boolean boolValueOf = null;
        try {
            GoogleApiAvailabilityLight googleApiAvailabilityLight = GoogleApiAvailabilityLight.getInstance();
            Intrinsics.checkNotNullExpressionValue(googleApiAvailabilityLight, "getInstance()");
            boolValueOf = Boolean.valueOf(googleApiAvailabilityLight.isGooglePlayServicesAvailable(this.applicationContext) == 0);
            addPlaySvcAvailabilityInCookie(boolValueOf.booleanValue());
            return boolValueOf;
        } catch (Exception unused) {
            Logger.INSTANCE.w(TAG, "Unexpected exception from Play services lib.");
            return boolValueOf;
        } catch (NoClassDefFoundError unused2) {
            Logger.INSTANCE.w(TAG, "Play services Not available");
            Boolean bool = false;
            try {
                addPlaySvcAvailabilityInCookie(bool.booleanValue());
                return bool;
            } catch (Exception unused3) {
                Logger.INSTANCE.w(TAG, "Failure to write GPS availability to DB");
                return bool;
            }
        }
    }

    private final DeviceNode getBasicDeviceBody(Context context) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        Object systemService = context.getSystemService("window");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        Display defaultDisplay = ((WindowManager) systemService).getDefaultDisplay();
        if (defaultDisplay != null) {
            defaultDisplay.getMetrics(displayMetrics);
        }
        String MANUFACTURER = Build.MANUFACTURER;
        Intrinsics.checkNotNullExpressionValue(MANUFACTURER, "MANUFACTURER");
        String MODEL = Build.MODEL;
        Intrinsics.checkNotNullExpressionValue(MODEL, "MODEL");
        String RELEASE = Build.VERSION.RELEASE;
        Intrinsics.checkNotNullExpressionValue(RELEASE, "RELEASE");
        DeviceNode deviceNode = new DeviceNode(MANUFACTURER, MODEL, RELEASE, AndroidPlatform.INSTANCE.getCarrierName$vungle_ads_release(context), Intrinsics.areEqual("Amazon", Build.MANUFACTURER) ? "amazon" : "android", displayMetrics.widthPixels, displayMetrics.heightPixels, this.uaString, (String) null, (Integer) null, (DeviceNode.DeviceExt) null, 1792, (DefaultConstructorMarker) null);
        try {
            String userAgent = this.platform.getUserAgent();
            this.uaString = userAgent;
            deviceNode.setUa(userAgent);
            initUserAgentLazy();
        } catch (Exception e) {
            Logger.INSTANCE.e(TAG, "Cannot Get UserAgent. Setting Default Device UserAgent." + e.getLocalizedMessage());
        }
        return deviceNode;
    }

    public static /* synthetic */ CommonRequestBody requestBody$default(VungleApiClient vungleApiClient, boolean z, int i, Object obj) throws IllegalStateException {
        if ((i & 1) != 0) {
            z = false;
        }
        return vungleApiClient.requestBody(z);
    }

    public final CommonRequestBody requestBody(boolean withSignals) throws IllegalStateException {
        CommonRequestBody commonRequestBody = new CommonRequestBody(getDeviceBody(), this.appBody, getUserBody(), (CommonRequestBody.RequestExt) null, (CommonRequestBody.RequestParam) null, 24, (DefaultConstructorMarker) null);
        CommonRequestBody.RequestExt extBody = getExtBody(withSignals);
        if (extBody != null) {
            commonRequestBody.setExt(extBody);
        }
        return commonRequestBody;
    }

    private final DeviceNode getDeviceBody() throws IllegalStateException {
        return getDeviceBody$vungle_ads_release(false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final synchronized DeviceNode getDeviceBody$vungle_ads_release(boolean explicitBlock) throws IllegalStateException {
        DeviceNode deviceNodeCopy;
        String str;
        boolean zHasSystemFeature;
        DeviceNode.VungleExt vungleExt;
        DeviceNode basicDeviceBody = this.baseDeviceInfo;
        if (basicDeviceBody == null) {
            basicDeviceBody = getBasicDeviceBody(this.applicationContext);
            this.baseDeviceInfo = basicDeviceBody;
        }
        deviceNodeCopy = basicDeviceBody.copy((2047 & 1) != 0 ? basicDeviceBody.make : null, (2047 & 2) != 0 ? basicDeviceBody.model : null, (2047 & 4) != 0 ? basicDeviceBody.osv : null, (2047 & 8) != 0 ? basicDeviceBody.carrier : null, (2047 & 16) != 0 ? basicDeviceBody.os : null, (2047 & 32) != 0 ? basicDeviceBody.w : 0, (2047 & 64) != 0 ? basicDeviceBody.h : 0, (2047 & 128) != 0 ? basicDeviceBody.ua : null, (2047 & 256) != 0 ? basicDeviceBody.ifa : null, (2047 & 512) != 0 ? basicDeviceBody.lmt : null, (2047 & 1024) != 0 ? basicDeviceBody.ext : null);
        DeviceNode.AndroidAmazonExt androidAmazonExt = new DeviceNode.AndroidAmazonExt(null, null == true ? 1 : 0, 3, null == true ? 1 : 0);
        AdvertisingInfo advertisingInfo = this.platform.getAdvertisingInfo();
        String advertisingId = advertisingInfo != null ? advertisingInfo.getAdvertisingId() : null;
        Boolean boolValueOf = advertisingInfo != null ? Boolean.valueOf(advertisingInfo.getLimitAdTracking()) : null;
        if (PrivacyManager.INSTANCE.shouldSendAdIds()) {
            if (advertisingId != null) {
                if (Intrinsics.areEqual("Amazon", Build.MANUFACTURER)) {
                    androidAmazonExt.setAmazonAdvertisingId(advertisingId);
                } else {
                    androidAmazonExt.setGaid(advertisingId);
                }
                deviceNodeCopy.setIfa(advertisingId);
            } else {
                String androidId = this.platform.getAndroidId();
                deviceNodeCopy.setIfa(androidId == null ? "" : androidId);
                if (androidId != null) {
                    androidAmazonExt.setAndroidId(androidId);
                }
            }
        }
        if (!PrivacyManager.INSTANCE.shouldSendAdIds() || explicitBlock) {
            deviceNodeCopy.setIfa(null);
            androidAmazonExt.setAndroidId(null);
            androidAmazonExt.setGaid(null);
            androidAmazonExt.setAmazonAdvertisingId(null);
        }
        int i = 1;
        deviceNodeCopy.setLmt(Intrinsics.areEqual((Object) boolValueOf, (Object) true) ? 1 : 0);
        androidAmazonExt.setGooglePlayServicesAvailable(Intrinsics.areEqual(Boolean.TRUE, isGooglePlayServicesAvailable()));
        String appSetId = this.platform.getAppSetId();
        this.appSetId = appSetId;
        String str2 = appSetId;
        if ((str2 == null || str2.length() == 0) == false) {
            androidAmazonExt.setAppSetId(this.appSetId);
        }
        Intent intentRegisterReceiver = this.applicationContext.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        int i2 = 2;
        if (intentRegisterReceiver != null) {
            int intExtra = intentRegisterReceiver.getIntExtra("level", -1);
            int intExtra2 = intentRegisterReceiver.getIntExtra("scale", -1);
            if (intExtra > 0 && intExtra2 > 0) {
                androidAmazonExt.setBatteryLevel(intExtra / intExtra2);
            }
            int intExtra3 = intentRegisterReceiver.getIntExtra("status", -1);
            if (intExtra3 == -1) {
                str = "UNKNOWN";
            } else if (intExtra3 == 2 || intExtra3 == 5) {
                int intExtra4 = intentRegisterReceiver.getIntExtra("plugged", -1);
                str = intExtra4 != 1 ? intExtra4 != 2 ? intExtra4 != 4 ? "BATTERY_PLUGGED_OTHERS" : "BATTERY_PLUGGED_WIRELESS" : "BATTERY_PLUGGED_USB" : "BATTERY_PLUGGED_AC";
            } else {
                str = "NOT_CHARGING";
            }
        } else {
            str = "UNKNOWN";
        }
        androidAmazonExt.setBatteryState(str);
        Object systemService = this.applicationContext.getSystemService("power");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.os.PowerManager");
        androidAmazonExt.setBatterySaverEnabled((Build.VERSION.SDK_INT < 21 || !((PowerManager) systemService).isPowerSaveMode()) ? 0 : 1);
        String connectionType = getConnectionType();
        if (connectionType != null) {
            androidAmazonExt.setConnectionType(connectionType);
        }
        String connectionTypeDetail = getConnectionTypeDetail();
        if (connectionTypeDetail != null) {
            androidAmazonExt.setConnectionTypeDetail(connectionTypeDetail);
        }
        androidAmazonExt.setLocale(Locale.getDefault().toString());
        androidAmazonExt.setLanguage(Locale.getDefault().getLanguage());
        androidAmazonExt.setTimeZone(TimeZone.getDefault().getID());
        androidAmazonExt.setVolumeLevel(this.platform.getVolumeLevel());
        androidAmazonExt.setSoundEnabled(this.platform.isSoundEnabled() ? 1 : 0);
        if (Intrinsics.areEqual("Amazon", Build.MANUFACTURER)) {
            zHasSystemFeature = this.applicationContext.getPackageManager().hasSystemFeature("amazon.hardware.fire_tv");
        } else if (Build.VERSION.SDK_INT >= 23) {
            Object systemService2 = this.applicationContext.getSystemService("uimode");
            Intrinsics.checkNotNull(systemService2, "null cannot be cast to non-null type android.app.UiModeManager");
            if (((UiModeManager) systemService2).getCurrentModeType() == 4) {
            }
        } else {
            zHasSystemFeature = this.applicationContext.getPackageManager().hasSystemFeature("com.google.android.tv") || !this.applicationContext.getPackageManager().hasSystemFeature("android.hardware.touchscreen");
        }
        androidAmazonExt.setTv(zHasSystemFeature);
        androidAmazonExt.setSideloadEnabled(this.platform.getIsSideLoaded());
        androidAmazonExt.setSdCardAvailable(this.platform.isSdCardPresent() ? 1 : 0);
        androidAmazonExt.setOsName(Build.FINGERPRINT);
        deviceNodeCopy.setUa(this.uaString);
        if (Intrinsics.areEqual("Amazon", Build.MANUFACTURER)) {
            vungleExt = new DeviceNode.VungleExt((DeviceNode.AndroidAmazonExt) (null == true ? 1 : 0), androidAmazonExt, i, (DefaultConstructorMarker) (null == true ? 1 : 0));
        } else {
            vungleExt = new DeviceNode.VungleExt(androidAmazonExt, (DeviceNode.AndroidAmazonExt) (null == true ? 1 : 0), i2, (DefaultConstructorMarker) (null == true ? 1 : 0));
        }
        deviceNodeCopy.setExt(new DeviceNode.DeviceExt(vungleExt));
        return deviceNodeCopy;
    }

    private final CommonRequestBody.User getUserBody() {
        CommonRequestBody.User user = new CommonRequestBody.User((CommonRequestBody.GDPR) null, (CommonRequestBody.CCPA) null, (CommonRequestBody.COPPA) null, 7, (DefaultConstructorMarker) null);
        user.setGdpr(new CommonRequestBody.GDPR(PrivacyManager.INSTANCE.getConsentStatus(), PrivacyManager.INSTANCE.getConsentSource(), PrivacyManager.INSTANCE.getConsentTimestamp(), PrivacyManager.INSTANCE.getConsentMessageVersion()));
        user.setCcpa(new CommonRequestBody.CCPA(PrivacyManager.INSTANCE.getCcpaStatus()));
        if (PrivacyManager.INSTANCE.getCoppaStatus() != COPPA.COPPA_NOTSET) {
            user.setCoppa(new CommonRequestBody.COPPA(PrivacyManager.INSTANCE.getCoppaStatus().getValue()));
        }
        return user;
    }

    static /* synthetic */ CommonRequestBody.RequestExt getExtBody$default(VungleApiClient vungleApiClient, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return vungleApiClient.getExtBody(z);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final com.vungle.ads.internal.model.CommonRequestBody.RequestExt getExtBody(boolean r8) {
        /*
            r7 = this;
            com.vungle.ads.internal.ConfigManager r0 = com.vungle.ads.internal.ConfigManager.INSTANCE
            java.lang.String r0 = r0.getConfigExtension()
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L1a
            r3 = r0
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            int r3 = r3.length()
            if (r3 != 0) goto L15
            r3 = r1
            goto L16
        L15:
            r3 = r2
        L16:
            if (r3 != r1) goto L1a
            r3 = r1
            goto L1b
        L1a:
            r3 = r2
        L1b:
            if (r3 == 0) goto L25
            com.vungle.ads.internal.persistence.FilePreferences r0 = r7.filePreferences
            java.lang.String r3 = "config_extension"
            java.lang.String r0 = r0.getString(r3)
        L25:
            r3 = 0
            if (r8 != 0) goto L2a
        L28:
            r8 = r3
            goto L54
        L2a:
            com.vungle.ads.internal.signals.SignalManager r8 = r7.getSignalManager()     // Catch: java.lang.Exception -> L33
            java.lang.String r8 = r8.generateSignals()     // Catch: java.lang.Exception -> L33
            goto L54
        L33:
            r8 = move-exception
            com.vungle.ads.internal.util.Logger$Companion r4 = com.vungle.ads.internal.util.Logger.INSTANCE
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "Couldn't convert signals for sending. Error: "
            r5.append(r6)
            java.lang.String r8 = r8.getMessage()
            r5.append(r8)
            java.lang.String r8 = r5.toString()
            java.lang.String r5 = "VungleApiClient"
            r4.e(r5, r8)
            r8 = r3
            java.lang.String r8 = (java.lang.String) r8
            goto L28
        L54:
            r4 = r0
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            if (r4 == 0) goto L62
            int r4 = r4.length()
            if (r4 != 0) goto L60
            goto L62
        L60:
            r4 = r2
            goto L63
        L62:
            r4 = r1
        L63:
            if (r4 == 0) goto L75
            r4 = r8
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            if (r4 == 0) goto L72
            int r4 = r4.length()
            if (r4 != 0) goto L71
            goto L72
        L71:
            r1 = r2
        L72:
            if (r1 == 0) goto L75
            return r3
        L75:
            com.vungle.ads.internal.model.CommonRequestBody$RequestExt r1 = new com.vungle.ads.internal.model.CommonRequestBody$RequestExt
            r1.<init>(r0, r8)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vungle.ads.internal.network.VungleApiClient.getExtBody(boolean):com.vungle.ads.internal.model.CommonRequestBody$RequestExt");
    }

    /* compiled from: VungleApiClient.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\b\u0002\b\u0087\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002B\u0000¨\u0006\u0003"}, d2 = {"Lcom/vungle/ads/internal/network/VungleApiClient$ConnectionTypeDetail;", "", "Companion", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    @Retention(RetentionPolicy.SOURCE)
    @kotlin.annotation.Retention(AnnotationRetention.SOURCE)
    public @interface ConnectionTypeDetail {
        public static final String CDMA_1XRTT = "cdma_1xrtt";
        public static final String CDMA_EVDO_0 = "cdma_evdo_0";
        public static final String CDMA_EVDO_A = "cdma_evdo_a";
        public static final String CDMA_EVDO_B = "cdma_evdo_b";

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = Companion.$$INSTANCE;
        public static final String EDGE = "edge";
        public static final String FIFTH_G = "5g";
        public static final String GPRS = "gprs";
        public static final String HRPD = "hrpd";
        public static final String HSDPA = "hsdpa";
        public static final String HSUPA = "hsupa";
        public static final String LTE = "lte";
        public static final String UNKNOWN = "unknown";
        public static final String WCDMA = "wcdma";

        /* compiled from: VungleApiClient.kt */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\r\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/vungle/ads/internal/network/VungleApiClient$ConnectionTypeDetail$Companion;", "", "()V", "CDMA_1XRTT", "", "CDMA_EVDO_0", "CDMA_EVDO_A", "CDMA_EVDO_B", "EDGE", "FIFTH_G", "GPRS", "HRPD", "HSDPA", "HSUPA", "LTE", "UNKNOWN", "WCDMA", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
        public static final class Companion {
            static final /* synthetic */ Companion $$INSTANCE = new Companion();
            public static final String CDMA_1XRTT = "cdma_1xrtt";
            public static final String CDMA_EVDO_0 = "cdma_evdo_0";
            public static final String CDMA_EVDO_A = "cdma_evdo_a";
            public static final String CDMA_EVDO_B = "cdma_evdo_b";
            public static final String EDGE = "edge";
            public static final String FIFTH_G = "5g";
            public static final String GPRS = "gprs";
            public static final String HRPD = "hrpd";
            public static final String HSDPA = "hsdpa";
            public static final String HSUPA = "hsupa";
            public static final String LTE = "lte";
            public static final String UNKNOWN = "unknown";
            public static final String WCDMA = "wcdma";

            private Companion() {
            }
        }
    }

    public final Boolean isGooglePlayServicesAvailable() {
        if (this.isGooglePlayServicesAvailable == null) {
            this.isGooglePlayServicesAvailable = getPlayServicesAvailabilityFromCookie();
        }
        if (this.isGooglePlayServicesAvailable == null) {
            this.isGooglePlayServicesAvailable = getPlayServicesAvailabilityFromAPI();
        }
        return this.isGooglePlayServicesAvailable;
    }

    private final String getConnectionType() {
        if (PermissionChecker.checkCallingOrSelfPermission(this.applicationContext, "android.permission.ACCESS_NETWORK_STATE") != 0) {
            return null;
        }
        Object systemService = this.applicationContext.getSystemService("connectivity");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) systemService).getActiveNetworkInfo();
        if (activeNetworkInfo == null) {
            return "NONE";
        }
        int type = activeNetworkInfo.getType();
        return type != 0 ? (type == 1 || type == 6) ? "WIFI" : type != 7 ? type != 9 ? "UNKNOWN" : "ETHERNET" : "BLUETOOTH" : "MOBILE";
    }

    public final String getConnectionTypeDetail() {
        if (PermissionChecker.checkCallingOrSelfPermission(this.applicationContext, "android.permission.ACCESS_NETWORK_STATE") != 0) {
            return null;
        }
        Object systemService = this.applicationContext.getSystemService("connectivity");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) systemService).getActiveNetworkInfo();
        return activeNetworkInfo != null ? getConnectionTypeDetail(activeNetworkInfo.getSubtype()) : "unknown";
    }
}
