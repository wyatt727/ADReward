package com.vungle.ads.internal.ui;

import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.webkit.WebViewRenderProcess;
import android.webkit.WebViewRenderProcessClient;
import androidx.webkit.ProxyConfig;
import com.json.i5;
import com.json.mediationsdk.utils.IronSourceConstants;
import com.json.t2;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.vungle.ads.AnalyticsClient;
import com.vungle.ads.BuildConfig;
import com.vungle.ads.internal.ConfigManager;
import com.vungle.ads.internal.model.AdPayload;
import com.vungle.ads.internal.model.Placement;
import com.vungle.ads.internal.omsdk.WebViewObserver;
import com.vungle.ads.internal.signals.SignalManager;
import com.vungle.ads.internal.ui.view.WebViewAPI;
import com.vungle.ads.internal.util.Logger;
import java.util.concurrent.ExecutorService;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.serialization.json.JsonElementBuildersKt;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonObjectBuilder;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: VungleWebClient.kt */
@Metadata(d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\u0018\u0000 x2\u00020\u00012\u00020\u0002:\u0002xyB)\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u000bJ \u0010N\u001a\u00020O2\u0006\u0010P\u001a\u00020\u001c2\u0006\u0010Q\u001a\u00020\u001c2\u0006\u0010R\u001a\u00020\rH\u0002J\u0010\u0010S\u001a\u00020\r2\u0006\u0010Q\u001a\u00020\u001cH\u0002J\u000e\u0010T\u001a\u00020O2\u0006\u0010U\u001a\u00020VJ\u0010\u0010W\u001a\u00020O2\u0006\u0010X\u001a\u00020\rH\u0016J\u001c\u0010Y\u001a\u00020O2\b\u0010Z\u001a\u0004\u0018\u0001062\b\u0010Q\u001a\u0004\u0018\u00010\u001cH\u0016J&\u0010[\u001a\u00020O2\b\u0010Z\u001a\u0004\u0018\u0001062\b\u0010\\\u001a\u0004\u0018\u00010]2\b\u0010^\u001a\u0004\u0018\u00010_H\u0016J*\u0010[\u001a\u00020O2\b\u0010Z\u001a\u0004\u0018\u0001062\u0006\u0010`\u001a\u00020a2\u0006\u0010b\u001a\u00020\u001c2\u0006\u0010c\u001a\u00020\u001cH\u0017J&\u0010d\u001a\u00020O2\b\u0010Z\u001a\u0004\u0018\u0001062\b\u0010\\\u001a\u0004\u0018\u00010]2\b\u0010e\u001a\u0004\u0018\u00010fH\u0016J\u001c\u0010g\u001a\u00020\r2\b\u0010Z\u001a\u0004\u0018\u0001062\b\u0010h\u001a\u0004\u0018\u00010iH\u0016J\u001a\u0010j\u001a\u00020O2\b\u0010k\u001a\u0004\u0018\u0001062\u0006\u0010l\u001a\u00020\u001cH\u0002J\u0010\u0010m\u001a\u00020O2\u0006\u0010.\u001a\u00020\rH\u0016J8\u0010n\u001a\u00020O2\u0006\u0010o\u001a\u00020\r2\b\u0010p\u001a\u0004\u0018\u00010\u001c2\b\u0010q\u001a\u0004\u0018\u00010\u001c2\b\u0010r\u001a\u0004\u0018\u00010\u001c2\b\u0010s\u001a\u0004\u0018\u00010\u001cH\u0016J\u0010\u0010t\u001a\u00020O2\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\u0012\u0010u\u001a\u00020O2\b\u0010<\u001a\u0004\u0018\u00010=H\u0016J\u0012\u0010v\u001a\u00020O2\b\u0010G\u001a\u0004\u0018\u00010HH\u0016J\u001c\u0010w\u001a\u00020\r2\b\u0010Z\u001a\u0004\u0018\u0001062\b\u0010Q\u001a\u0004\u0018\u00010\u001cH\u0017R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010\f\u001a\u00020\r8\u0000@\u0000X\u0081\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R&\u0010\u0014\u001a\u0004\u0018\u00010\u00158\u0000@\u0000X\u0081\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u0016\u0010\u000f\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR&\u0010\u001b\u001a\u0004\u0018\u00010\u001c8\u0000@\u0000X\u0081\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u001d\u0010\u000f\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R&\u0010\"\u001a\u0004\u0018\u00010\u001c8\u0000@\u0000X\u0081\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b#\u0010\u000f\u001a\u0004\b$\u0010\u001f\"\u0004\b%\u0010!R&\u0010&\u001a\u0004\u0018\u00010\u001c8\u0000@\u0000X\u0081\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b'\u0010\u000f\u001a\u0004\b(\u0010\u001f\"\u0004\b)\u0010!R&\u0010*\u001a\u0004\u0018\u00010\u001c8\u0000@\u0000X\u0081\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b+\u0010\u000f\u001a\u0004\b,\u0010\u001f\"\u0004\b-\u0010!R(\u0010.\u001a\u0004\u0018\u00010\r8\u0000@\u0000X\u0081\u000e¢\u0006\u0016\n\u0002\u00104\u0012\u0004\b/\u0010\u000f\u001a\u0004\b0\u00101\"\u0004\b2\u00103R&\u00105\u001a\u0004\u0018\u0001068\u0000@\u0000X\u0081\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b7\u0010\u000f\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R&\u0010<\u001a\u0004\u0018\u00010=8\u0000@\u0000X\u0081\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b>\u0010\u000f\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010C\u001a\u00020\r8\u0000@\u0000X\u0081\u000e¢\u0006\u0014\n\u0000\u0012\u0004\bD\u0010\u000f\u001a\u0004\bE\u0010\u0011\"\u0004\bF\u0010\u0013R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u0004¢\u0006\u0002\n\u0000R&\u0010G\u001a\u0004\u0018\u00010H8\u0000@\u0000X\u0081\u000e¢\u0006\u0014\n\u0000\u0012\u0004\bI\u0010\u000f\u001a\u0004\bJ\u0010K\"\u0004\bL\u0010M¨\u0006z"}, d2 = {"Lcom/vungle/ads/internal/ui/VungleWebClient;", "Landroid/webkit/WebViewClient;", "Lcom/vungle/ads/internal/ui/view/WebViewAPI;", "advertisement", "Lcom/vungle/ads/internal/model/AdPayload;", "placement", "Lcom/vungle/ads/internal/model/Placement;", "offloadExecutor", "Ljava/util/concurrent/ExecutorService;", "signalManager", "Lcom/vungle/ads/internal/signals/SignalManager;", "(Lcom/vungle/ads/internal/model/AdPayload;Lcom/vungle/ads/internal/model/Placement;Ljava/util/concurrent/ExecutorService;Lcom/vungle/ads/internal/signals/SignalManager;)V", "collectConsent", "", "getCollectConsent$vungle_ads_release$annotations", "()V", "getCollectConsent$vungle_ads_release", "()Z", "setCollectConsent$vungle_ads_release", "(Z)V", "errorHandler", "Lcom/vungle/ads/internal/ui/view/WebViewAPI$WebClientErrorHandler;", "getErrorHandler$vungle_ads_release$annotations", "getErrorHandler$vungle_ads_release", "()Lcom/vungle/ads/internal/ui/view/WebViewAPI$WebClientErrorHandler;", "setErrorHandler$vungle_ads_release", "(Lcom/vungle/ads/internal/ui/view/WebViewAPI$WebClientErrorHandler;)V", "gdprAccept", "", "getGdprAccept$vungle_ads_release$annotations", "getGdprAccept$vungle_ads_release", "()Ljava/lang/String;", "setGdprAccept$vungle_ads_release", "(Ljava/lang/String;)V", "gdprBody", "getGdprBody$vungle_ads_release$annotations", "getGdprBody$vungle_ads_release", "setGdprBody$vungle_ads_release", "gdprDeny", "getGdprDeny$vungle_ads_release$annotations", "getGdprDeny$vungle_ads_release", "setGdprDeny$vungle_ads_release", "gdprTitle", "getGdprTitle$vungle_ads_release$annotations", "getGdprTitle$vungle_ads_release", "setGdprTitle$vungle_ads_release", t2.h.o, "isViewable$vungle_ads_release$annotations", "isViewable$vungle_ads_release", "()Ljava/lang/Boolean;", "setViewable$vungle_ads_release", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "loadedWebView", "Landroid/webkit/WebView;", "getLoadedWebView$vungle_ads_release$annotations", "getLoadedWebView$vungle_ads_release", "()Landroid/webkit/WebView;", "setLoadedWebView$vungle_ads_release", "(Landroid/webkit/WebView;)V", "mraidDelegate", "Lcom/vungle/ads/internal/ui/view/WebViewAPI$MraidDelegate;", "getMraidDelegate$vungle_ads_release$annotations", "getMraidDelegate$vungle_ads_release", "()Lcom/vungle/ads/internal/ui/view/WebViewAPI$MraidDelegate;", "setMraidDelegate$vungle_ads_release", "(Lcom/vungle/ads/internal/ui/view/WebViewAPI$MraidDelegate;)V", t2.h.s, "getReady$vungle_ads_release$annotations", "getReady$vungle_ads_release", "setReady$vungle_ads_release", "webViewObserver", "Lcom/vungle/ads/internal/omsdk/WebViewObserver;", "getWebViewObserver$vungle_ads_release$annotations", "getWebViewObserver$vungle_ads_release", "()Lcom/vungle/ads/internal/omsdk/WebViewObserver;", "setWebViewObserver$vungle_ads_release", "(Lcom/vungle/ads/internal/omsdk/WebViewObserver;)V", "handleWebViewError", "", "errorMsg", "url", "didCrash", "isCriticalAsset", "notifyDiskAvailableSize", "size", "", "notifyPropertiesChange", "skipCmdQueue", "onPageFinished", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "onReceivedError", AdActivity.REQUEST_KEY_EXTRA, "Landroid/webkit/WebResourceRequest;", "error", "Landroid/webkit/WebResourceError;", IronSourceConstants.EVENTS_ERROR_CODE, "", "description", "failingUrl", "onReceivedHttpError", "errorResponse", "Landroid/webkit/WebResourceResponse;", "onRenderProcessGone", "detail", "Landroid/webkit/RenderProcessGoneDetail;", "runJavascriptOnWebView", "webView", "injectJs", "setAdVisibility", "setConsentStatus", "collectedConsent", "title", "message", "accept", "deny", "setErrorHandler", "setMraidDelegate", "setWebViewObserver", "shouldOverrideUrlLoading", "Companion", "VungleWebViewRenderProcessClient", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes5.dex */
public final class VungleWebClient extends WebViewClient implements WebViewAPI {
    private static final String TAG = "VungleWebClient";
    private final AdPayload advertisement;
    private boolean collectConsent;
    private WebViewAPI.WebClientErrorHandler errorHandler;
    private String gdprAccept;
    private String gdprBody;
    private String gdprDeny;
    private String gdprTitle;
    private Boolean isViewable;
    private WebView loadedWebView;
    private WebViewAPI.MraidDelegate mraidDelegate;
    private final ExecutorService offloadExecutor;
    private final Placement placement;
    private boolean ready;
    private final SignalManager signalManager;
    private WebViewObserver webViewObserver;

    public static /* synthetic */ void getCollectConsent$vungle_ads_release$annotations() {
    }

    public static /* synthetic */ void getErrorHandler$vungle_ads_release$annotations() {
    }

    public static /* synthetic */ void getGdprAccept$vungle_ads_release$annotations() {
    }

    public static /* synthetic */ void getGdprBody$vungle_ads_release$annotations() {
    }

    public static /* synthetic */ void getGdprDeny$vungle_ads_release$annotations() {
    }

    public static /* synthetic */ void getGdprTitle$vungle_ads_release$annotations() {
    }

    public static /* synthetic */ void getLoadedWebView$vungle_ads_release$annotations() {
    }

    public static /* synthetic */ void getMraidDelegate$vungle_ads_release$annotations() {
    }

    public static /* synthetic */ void getReady$vungle_ads_release$annotations() {
    }

    public static /* synthetic */ void getWebViewObserver$vungle_ads_release$annotations() {
    }

    public static /* synthetic */ void isViewable$vungle_ads_release$annotations() {
    }

    public /* synthetic */ VungleWebClient(AdPayload adPayload, Placement placement, ExecutorService executorService, SignalManager signalManager, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(adPayload, placement, executorService, (i & 8) != 0 ? null : signalManager);
    }

    public VungleWebClient(AdPayload advertisement, Placement placement, ExecutorService offloadExecutor, SignalManager signalManager) {
        Intrinsics.checkNotNullParameter(advertisement, "advertisement");
        Intrinsics.checkNotNullParameter(placement, "placement");
        Intrinsics.checkNotNullParameter(offloadExecutor, "offloadExecutor");
        this.advertisement = advertisement;
        this.placement = placement;
        this.offloadExecutor = offloadExecutor;
        this.signalManager = signalManager;
    }

    /* renamed from: getCollectConsent$vungle_ads_release, reason: from getter */
    public final boolean getCollectConsent() {
        return this.collectConsent;
    }

    public final void setCollectConsent$vungle_ads_release(boolean z) {
        this.collectConsent = z;
    }

    /* renamed from: getGdprTitle$vungle_ads_release, reason: from getter */
    public final String getGdprTitle() {
        return this.gdprTitle;
    }

    public final void setGdprTitle$vungle_ads_release(String str) {
        this.gdprTitle = str;
    }

    /* renamed from: getGdprBody$vungle_ads_release, reason: from getter */
    public final String getGdprBody() {
        return this.gdprBody;
    }

    public final void setGdprBody$vungle_ads_release(String str) {
        this.gdprBody = str;
    }

    /* renamed from: getGdprAccept$vungle_ads_release, reason: from getter */
    public final String getGdprAccept() {
        return this.gdprAccept;
    }

    public final void setGdprAccept$vungle_ads_release(String str) {
        this.gdprAccept = str;
    }

    /* renamed from: getGdprDeny$vungle_ads_release, reason: from getter */
    public final String getGdprDeny() {
        return this.gdprDeny;
    }

    public final void setGdprDeny$vungle_ads_release(String str) {
        this.gdprDeny = str;
    }

    /* renamed from: getLoadedWebView$vungle_ads_release, reason: from getter */
    public final WebView getLoadedWebView() {
        return this.loadedWebView;
    }

    public final void setLoadedWebView$vungle_ads_release(WebView webView) {
        this.loadedWebView = webView;
    }

    /* renamed from: getReady$vungle_ads_release, reason: from getter */
    public final boolean getReady() {
        return this.ready;
    }

    public final void setReady$vungle_ads_release(boolean z) {
        this.ready = z;
    }

    /* renamed from: getMraidDelegate$vungle_ads_release, reason: from getter */
    public final WebViewAPI.MraidDelegate getMraidDelegate() {
        return this.mraidDelegate;
    }

    public final void setMraidDelegate$vungle_ads_release(WebViewAPI.MraidDelegate mraidDelegate) {
        this.mraidDelegate = mraidDelegate;
    }

    /* renamed from: getErrorHandler$vungle_ads_release, reason: from getter */
    public final WebViewAPI.WebClientErrorHandler getErrorHandler() {
        return this.errorHandler;
    }

    public final void setErrorHandler$vungle_ads_release(WebViewAPI.WebClientErrorHandler webClientErrorHandler) {
        this.errorHandler = webClientErrorHandler;
    }

    /* renamed from: getWebViewObserver$vungle_ads_release, reason: from getter */
    public final WebViewObserver getWebViewObserver() {
        return this.webViewObserver;
    }

    public final void setWebViewObserver$vungle_ads_release(WebViewObserver webViewObserver) {
        this.webViewObserver = webViewObserver;
    }

    /* renamed from: isViewable$vungle_ads_release, reason: from getter */
    public final Boolean getIsViewable() {
        return this.isViewable;
    }

    public final void setViewable$vungle_ads_release(Boolean bool) {
        this.isViewable = bool;
    }

    @Override // com.vungle.ads.internal.ui.view.WebViewAPI
    public void setConsentStatus(boolean collectedConsent, String title, String message, String accept, String deny) {
        this.collectConsent = collectedConsent;
        this.gdprTitle = title;
        this.gdprBody = message;
        this.gdprAccept = accept;
        this.gdprDeny = deny;
    }

    @Override // com.vungle.ads.internal.ui.view.WebViewAPI
    public void setMraidDelegate(WebViewAPI.MraidDelegate mraidDelegate) {
        this.mraidDelegate = mraidDelegate;
    }

    @Override // android.webkit.WebViewClient
    @Deprecated(message = "Deprecated in Java")
    public boolean shouldOverrideUrlLoading(final WebView view, String url) {
        Logger.INSTANCE.d(TAG, "MRAID Command " + url);
        String str = url;
        if (str == null || str.length() == 0) {
            Logger.INSTANCE.e(TAG, "Invalid URL ");
            return false;
        }
        Uri uri = Uri.parse(url);
        if (uri == null || uri.getScheme() == null) {
            return false;
        }
        String scheme = uri.getScheme();
        if (Intrinsics.areEqual(scheme, CampaignEx.JSON_KEY_MRAID)) {
            final String host = uri.getHost();
            if (host != null) {
                if (Intrinsics.areEqual("propertiesChangeCompleted", host)) {
                    if (!this.ready) {
                        runJavascriptOnWebView(view, "window.vungle.mraidBridge.notifyReadyEvent(" + this.advertisement.createMRAIDArgs() + ')');
                        this.ready = true;
                    }
                } else {
                    final WebViewAPI.MraidDelegate mraidDelegate = this.mraidDelegate;
                    if (mraidDelegate != null) {
                        JsonObjectBuilder jsonObjectBuilder = new JsonObjectBuilder();
                        for (String param : uri.getQueryParameterNames()) {
                            Intrinsics.checkNotNullExpressionValue(param, "param");
                            JsonElementBuildersKt.put(jsonObjectBuilder, param, uri.getQueryParameter(param));
                        }
                        final JsonObject jsonObjectBuild = jsonObjectBuilder.build();
                        final Handler handler = new Handler(Looper.getMainLooper());
                        this.offloadExecutor.submit(new Runnable() { // from class: com.vungle.ads.internal.ui.VungleWebClient$$ExternalSyntheticLambda1
                            @Override // java.lang.Runnable
                            public final void run() {
                                VungleWebClient.m985shouldOverrideUrlLoading$lambda4$lambda3$lambda2(mraidDelegate, host, jsonObjectBuild, handler, this, view);
                            }
                        });
                    }
                }
                return true;
            }
        } else if (StringsKt.equals(ProxyConfig.MATCH_HTTP, scheme, true) || StringsKt.equals("https", scheme, true)) {
            Logger.INSTANCE.d(TAG, "Open URL" + url);
            WebViewAPI.MraidDelegate mraidDelegate2 = this.mraidDelegate;
            if (mraidDelegate2 != null) {
                JsonObjectBuilder jsonObjectBuilder2 = new JsonObjectBuilder();
                JsonElementBuildersKt.put(jsonObjectBuilder2, "url", url);
                mraidDelegate2.processCommand("openNonMraid", jsonObjectBuilder2.build());
            }
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: shouldOverrideUrlLoading$lambda-4$lambda-3$lambda-2, reason: not valid java name */
    public static final void m985shouldOverrideUrlLoading$lambda4$lambda3$lambda2(WebViewAPI.MraidDelegate it, String command, JsonObject args, Handler handler, final VungleWebClient this$0, final WebView webView) {
        Intrinsics.checkNotNullParameter(it, "$it");
        Intrinsics.checkNotNullParameter(command, "$command");
        Intrinsics.checkNotNullParameter(args, "$args");
        Intrinsics.checkNotNullParameter(handler, "$handler");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (it.processCommand(command, args)) {
            handler.post(new Runnable() { // from class: com.vungle.ads.internal.ui.VungleWebClient$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    VungleWebClient.m986shouldOverrideUrlLoading$lambda4$lambda3$lambda2$lambda1(this.f$0, webView);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: shouldOverrideUrlLoading$lambda-4$lambda-3$lambda-2$lambda-1, reason: not valid java name */
    public static final void m986shouldOverrideUrlLoading$lambda4$lambda3$lambda2$lambda1(VungleWebClient this$0, WebView webView) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.runJavascriptOnWebView(webView, "window.vungle.mraidBridge.notifyCommandComplete()");
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView view, String url) {
        super.onPageFinished(view, url);
        if (view == null) {
            return;
        }
        this.loadedWebView = view;
        if (view != null) {
            view.setVisibility(0);
        }
        notifyPropertiesChange(true);
        if (Build.VERSION.SDK_INT >= 29) {
            view.setWebViewRenderProcessClient(new VungleWebViewRenderProcessClient(this.errorHandler));
        }
        WebViewObserver webViewObserver = this.webViewObserver;
        if (webViewObserver != null) {
            webViewObserver.onPageFinished(view);
        }
    }

    @Override // com.vungle.ads.internal.ui.view.WebViewAPI
    public void notifyPropertiesChange(boolean skipCmdQueue) {
        WebView webView = this.loadedWebView;
        if (webView != null) {
            JsonObjectBuilder jsonObjectBuilder = new JsonObjectBuilder();
            JsonObjectBuilder jsonObjectBuilder2 = new JsonObjectBuilder();
            JsonElementBuildersKt.put(jsonObjectBuilder2, "width", Integer.valueOf(webView.getWidth()));
            JsonElementBuildersKt.put(jsonObjectBuilder2, "height", Integer.valueOf(webView.getHeight()));
            JsonObject jsonObjectBuild = jsonObjectBuilder2.build();
            JsonObjectBuilder jsonObjectBuilder3 = new JsonObjectBuilder();
            JsonElementBuildersKt.put(jsonObjectBuilder3, "x", (Number) 0);
            JsonElementBuildersKt.put(jsonObjectBuilder3, "y", (Number) 0);
            JsonElementBuildersKt.put(jsonObjectBuilder3, "width", Integer.valueOf(webView.getWidth()));
            JsonElementBuildersKt.put(jsonObjectBuilder3, "height", Integer.valueOf(webView.getHeight()));
            JsonObject jsonObjectBuild2 = jsonObjectBuilder3.build();
            JsonObjectBuilder jsonObjectBuilder4 = new JsonObjectBuilder();
            JsonElementBuildersKt.put(jsonObjectBuilder4, "sms", (Boolean) false);
            JsonElementBuildersKt.put(jsonObjectBuilder4, "tel", (Boolean) false);
            JsonElementBuildersKt.put(jsonObjectBuilder4, "calendar", (Boolean) false);
            JsonElementBuildersKt.put(jsonObjectBuilder4, "storePicture", (Boolean) false);
            JsonElementBuildersKt.put(jsonObjectBuilder4, "inlineVideo", (Boolean) false);
            JsonObject jsonObjectBuild3 = jsonObjectBuilder4.build();
            JsonObject jsonObject = jsonObjectBuild;
            jsonObjectBuilder.put("maxSize", jsonObject);
            jsonObjectBuilder.put("screenSize", jsonObject);
            JsonObject jsonObject2 = jsonObjectBuild2;
            jsonObjectBuilder.put("defaultPosition", jsonObject2);
            jsonObjectBuilder.put("currentPosition", jsonObject2);
            jsonObjectBuilder.put("supports", jsonObjectBuild3);
            JsonElementBuildersKt.put(jsonObjectBuilder, "placementType", this.advertisement.templateType());
            Boolean bool = this.isViewable;
            if (bool != null) {
                JsonElementBuildersKt.put(jsonObjectBuilder, t2.h.o, Boolean.valueOf(bool.booleanValue()));
            }
            JsonElementBuildersKt.put(jsonObjectBuilder, i5.x, "android");
            JsonElementBuildersKt.put(jsonObjectBuilder, "osVersion", String.valueOf(Build.VERSION.SDK_INT));
            JsonElementBuildersKt.put(jsonObjectBuilder, "incentivized", this.placement.getIncentivized());
            JsonElementBuildersKt.put(jsonObjectBuilder, "enableBackImmediately", Integer.valueOf(this.advertisement.getShowCloseDelay(this.placement.getIncentivized())));
            JsonElementBuildersKt.put(jsonObjectBuilder, "version", "1.0");
            if (this.collectConsent) {
                JsonElementBuildersKt.put(jsonObjectBuilder, "consentRequired", (Boolean) true);
                JsonElementBuildersKt.put(jsonObjectBuilder, "consentTitleText", this.gdprTitle);
                JsonElementBuildersKt.put(jsonObjectBuilder, "consentBodyText", this.gdprBody);
                JsonElementBuildersKt.put(jsonObjectBuilder, "consentAcceptButtonText", this.gdprAccept);
                JsonElementBuildersKt.put(jsonObjectBuilder, "consentDenyButtonText", this.gdprDeny);
            } else {
                JsonElementBuildersKt.put(jsonObjectBuilder, "consentRequired", (Boolean) false);
            }
            if (!ConfigManager.INSTANCE.signalsDisabled()) {
                SignalManager signalManager = this.signalManager;
                String uuid = signalManager != null ? signalManager.getUuid() : null;
                if (!(uuid == null || uuid.length() == 0)) {
                    SignalManager signalManager2 = this.signalManager;
                    JsonElementBuildersKt.put(jsonObjectBuilder, "sessionId", signalManager2 != null ? signalManager2.getUuid() : null);
                }
            }
            JsonElementBuildersKt.put(jsonObjectBuilder, "sdkVersion", BuildConfig.VERSION_NAME);
            runJavascriptOnWebView(webView, "window.vungle.mraidBridge.notifyPropertiesChange(" + jsonObjectBuilder.build() + AbstractJsonLexerKt.COMMA + skipCmdQueue + ')');
        }
    }

    public final void notifyDiskAvailableSize(long size) {
        WebView webView = this.loadedWebView;
        if (webView != null) {
            runJavascriptOnWebView(webView, "window.vungle.mraidBridgeExt.notifyAvailableDiskSpace(" + size + ')');
        }
    }

    @Override // com.vungle.ads.internal.ui.view.WebViewAPI
    public void setAdVisibility(boolean isViewable) {
        this.isViewable = Boolean.valueOf(isViewable);
        notifyPropertiesChange(false);
    }

    @Override // com.vungle.ads.internal.ui.view.WebViewAPI
    public void setErrorHandler(WebViewAPI.WebClientErrorHandler errorHandler) {
        Intrinsics.checkNotNullParameter(errorHandler, "errorHandler");
        this.errorHandler = errorHandler;
    }

    @Override // com.vungle.ads.internal.ui.view.WebViewAPI
    public void setWebViewObserver(WebViewObserver webViewObserver) {
        this.webViewObserver = webViewObserver;
    }

    @Override // android.webkit.WebViewClient
    @Deprecated(message = "Deprecated in Java")
    public void onReceivedError(WebView view, int errorCode, String description, String failingUrl) {
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(failingUrl, "failingUrl");
        super.onReceivedError(view, errorCode, description, failingUrl);
        if (Build.VERSION.SDK_INT < 23) {
            boolean zIsCriticalAsset = isCriticalAsset(failingUrl);
            Logger.INSTANCE.e(TAG, "Error desc " + description + " for URL " + failingUrl);
            handleWebViewError(description, failingUrl, zIsCriticalAsset);
        }
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedHttpError(WebView view, WebResourceRequest request, WebResourceResponse errorResponse) {
        super.onReceivedHttpError(view, request, errorResponse);
        if (Build.VERSION.SDK_INT >= 21) {
            String strValueOf = String.valueOf(errorResponse != null ? Integer.valueOf(errorResponse.getStatusCode()) : null);
            String strValueOf2 = String.valueOf(request != null ? request.getUrl() : null);
            boolean z = request != null && request.isForMainFrame();
            Logger.INSTANCE.e(TAG, "Http Error desc " + strValueOf + ' ' + z + " for URL " + strValueOf2);
            handleWebViewError(strValueOf, strValueOf2, isCriticalAsset(strValueOf2) && z);
        }
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView view, WebResourceRequest request, WebResourceError error) {
        super.onReceivedError(view, request, error);
        if (Build.VERSION.SDK_INT >= 23) {
            String strValueOf = String.valueOf(error != null ? error.getDescription() : null);
            String strValueOf2 = String.valueOf(request != null ? request.getUrl() : null);
            boolean z = request != null && request.isForMainFrame();
            Logger.INSTANCE.e(TAG, "Error desc " + strValueOf + ' ' + z + " for URL " + strValueOf2);
            handleWebViewError(strValueOf, strValueOf2, isCriticalAsset(strValueOf2) && z);
        }
    }

    @Override // android.webkit.WebViewClient
    public boolean onRenderProcessGone(WebView view, RenderProcessGoneDetail detail) {
        this.loadedWebView = null;
        if (Build.VERSION.SDK_INT < 26) {
            Logger.Companion companion = Logger.INSTANCE;
            StringBuilder sb = new StringBuilder();
            sb.append("onRenderProcessGone url: ");
            sb.append(view != null ? view.getUrl() : null);
            companion.w(TAG, sb.toString());
            return true;
        }
        Logger.Companion companion2 = Logger.INSTANCE;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("onRenderProcessGone url: ");
        sb2.append(view != null ? view.getUrl() : null);
        sb2.append(", did crash: ");
        sb2.append(detail != null ? Boolean.valueOf(detail.didCrash()) : null);
        companion2.w(TAG, sb2.toString());
        WebViewAPI.WebClientErrorHandler webClientErrorHandler = this.errorHandler;
        if (webClientErrorHandler != null) {
            return webClientErrorHandler.onWebRenderingProcessGone(view, detail != null ? Boolean.valueOf(detail.didCrash()) : null);
        }
        return super.onRenderProcessGone(view, detail);
    }

    private final void handleWebViewError(String errorMsg, String url, boolean didCrash) {
        String str = url + ' ' + errorMsg;
        WebViewAPI.WebClientErrorHandler webClientErrorHandler = this.errorHandler;
        if (webClientErrorHandler != null) {
            webClientErrorHandler.onReceivedError(str, didCrash);
        }
    }

    private final boolean isCriticalAsset(String url) {
        if (url.length() > 0) {
            return this.advertisement.isCriticalAsset(url);
        }
        return false;
    }

    private final void runJavascriptOnWebView(WebView webView, String injectJs) {
        try {
            Logger.INSTANCE.w(TAG, "mraid Injecting JS " + injectJs);
            if (Build.VERSION.SDK_INT >= 19) {
                if (webView != null) {
                    webView.evaluateJavascript(injectJs, null);
                }
            } else if (webView != null) {
                webView.loadUrl("javascript:" + injectJs);
            }
        } catch (Exception e) {
            AnalyticsClient.INSTANCE.logError$vungle_ads_release(313, "Evaluate js failed " + e.getLocalizedMessage(), this.placement.getReferenceId(), this.advertisement.getCreativeId(), this.advertisement.eventId());
        }
    }

    /* compiled from: VungleWebClient.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u001a\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0016J\u001a\u0010\u000e\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0016R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004¨\u0006\u000f"}, d2 = {"Lcom/vungle/ads/internal/ui/VungleWebClient$VungleWebViewRenderProcessClient;", "Landroid/webkit/WebViewRenderProcessClient;", "errorHandler", "Lcom/vungle/ads/internal/ui/view/WebViewAPI$WebClientErrorHandler;", "(Lcom/vungle/ads/internal/ui/view/WebViewAPI$WebClientErrorHandler;)V", "getErrorHandler", "()Lcom/vungle/ads/internal/ui/view/WebViewAPI$WebClientErrorHandler;", "setErrorHandler", "onRenderProcessResponsive", "", "webView", "Landroid/webkit/WebView;", "webViewRenderProcess", "Landroid/webkit/WebViewRenderProcess;", "onRenderProcessUnresponsive", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class VungleWebViewRenderProcessClient extends WebViewRenderProcessClient {
        private WebViewAPI.WebClientErrorHandler errorHandler;

        @Override // android.webkit.WebViewRenderProcessClient
        public void onRenderProcessResponsive(WebView webView, WebViewRenderProcess webViewRenderProcess) {
            Intrinsics.checkNotNullParameter(webView, "webView");
        }

        public final WebViewAPI.WebClientErrorHandler getErrorHandler() {
            return this.errorHandler;
        }

        public final void setErrorHandler(WebViewAPI.WebClientErrorHandler webClientErrorHandler) {
            this.errorHandler = webClientErrorHandler;
        }

        public VungleWebViewRenderProcessClient(WebViewAPI.WebClientErrorHandler webClientErrorHandler) {
            this.errorHandler = webClientErrorHandler;
        }

        @Override // android.webkit.WebViewRenderProcessClient
        public void onRenderProcessUnresponsive(WebView webView, WebViewRenderProcess webViewRenderProcess) {
            Intrinsics.checkNotNullParameter(webView, "webView");
            Logger.Companion companion = Logger.INSTANCE;
            StringBuilder sb = new StringBuilder();
            sb.append("onRenderProcessUnresponsive(Title = ");
            sb.append(webView.getTitle());
            sb.append(", URL = ");
            sb.append(webView.getOriginalUrl());
            sb.append(", (webViewRenderProcess != null) = ");
            sb.append(webViewRenderProcess != null);
            companion.w(VungleWebClient.TAG, sb.toString());
            WebViewAPI.WebClientErrorHandler webClientErrorHandler = this.errorHandler;
            if (webClientErrorHandler != null) {
                webClientErrorHandler.onRenderProcessUnresponsive(webView, webViewRenderProcess);
            }
        }
    }
}
