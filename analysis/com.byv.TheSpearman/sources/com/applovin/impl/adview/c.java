package com.applovin.impl.adview;

import android.content.Intent;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Bundle;
import android.view.MotionEvent;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.applovin.adview.AppLovinAdView;
import com.applovin.impl.bq;
import com.applovin.impl.eq;
import com.applovin.impl.nq;
import com.applovin.impl.oj;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import com.applovin.impl.sdk.o;
import com.applovin.impl.sdk.t;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.x;
import com.applovin.impl.x3;
import com.applovin.impl.zp;
import com.applovin.sdk.AppLovinAdSize;
import com.google.android.gms.measurement.AppMeasurement;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.HashMap;
import java.util.Map;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes.dex */
public class c extends x {

    /* renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.k f254a;
    private final t b;
    private final a c;

    public c(a aVar, com.applovin.impl.sdk.k kVar) {
        this.f254a = kVar;
        this.b = kVar.L();
        this.c = aVar;
    }

    private void b() {
        this.c.a();
    }

    protected a c() {
        return this.c;
    }

    @Override // android.webkit.WebViewClient
    public void onLoadResource(WebView webView, String str) {
        super.onLoadResource(webView, str);
        if (t.a()) {
            this.b.d("AdWebView", "Loaded resource: " + str);
        }
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        if (t.a()) {
            this.b.d("AdWebView", "Loaded URL: " + str);
        }
        a aVar = this.c;
        if (aVar != null) {
            aVar.a(webView, str);
        }
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        super.onReceivedError(webView, webResourceRequest, webResourceError);
        onReceivedError(webView, webResourceError.getErrorCode(), webResourceError.getDescription().toString(), webResourceRequest.getUrl().toString());
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
        a aVar = this.c;
        if (aVar != null) {
            com.applovin.impl.sdk.ad.b bVarI = aVar.i();
            if (t.a()) {
                this.b.b("AdWebView", "Received HTTP error: " + webResourceResponse + "for url: " + webResourceRequest.getUrl() + " and ad: " + bVarI);
            }
        }
        if (zp.c(webResourceRequest.getUrl().toString())) {
            this.f254a.B().a("adWebViewReceivedHttpError", webResourceRequest.getUrl().toString(), webResourceResponse.getStatusCode());
        }
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        super.onReceivedSslError(webView, sslErrorHandler, sslError);
        a aVar = this.c;
        if (aVar != null) {
            com.applovin.impl.sdk.ad.b bVarI = aVar.i();
            String str = "Received SSL error: " + sslError;
            if (t.a()) {
                this.b.b("AdWebView", str + " for ad: " + bVarI);
            }
        }
    }

    @Override // com.applovin.impl.sdk.x, android.webkit.WebViewClient
    public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        AppLovinBroadcastManager.sendBroadcast(new Intent("com.applovin.render_process_gone"), null);
        if (this.c == null) {
            return true;
        }
        t.h("AdWebView", "Render process gone for ad: " + this.c.i() + ". Process did crash: " + renderProcessGoneDetail.didCrash());
        com.applovin.impl.sdk.ad.b bVarI = this.c.i();
        if (bVarI != null) {
            HashMap<String, String> mapHashMap = CollectionUtils.hashMap("top_main_method", "onRenderProcessGone");
            CollectionUtils.putStringIfValid("ad_size", bVarI.getSize().toString(), mapHashMap);
            CollectionUtils.putStringIfValid("ad_id", String.valueOf(bVarI.getAdIdNumber()), mapHashMap);
            CollectionUtils.putStringIfValid("dsp_name", bVarI.getDspName(), mapHashMap);
            if (x3.i()) {
                mapHashMap.put(FirebaseAnalytics.Param.SOURCE, renderProcessGoneDetail.didCrash() ? AppMeasurement.CRASH_ORIGIN : "non_crash");
            }
            this.f254a.B().a(o.b.WEB_VIEW_ERROR, (Map) mapHashMap);
        }
        if (((Boolean) this.f254a.a(oj.N5)).booleanValue()) {
            if (renderProcessGoneDetail.didCrash() && ((Boolean) this.f254a.a(oj.Q5)).booleanValue()) {
                throw new RuntimeException("Render process crashed. This is likely caused by a crash in an AppLovin ad with ID: " + (bVarI != null ? String.valueOf(bVarI.getAdIdNumber()) : AbstractJsonLexerKt.NULL));
            }
            if (webView != null && webView.equals(this.c.g())) {
                this.c.b();
                AppLovinAdSize appLovinAdSizeM = this.c.m();
                if (zp.a(appLovinAdSizeM)) {
                    this.c.a(appLovinAdSizeM);
                    this.c.G();
                }
            }
        }
        return super.onRenderProcessGone(webView, renderProcessGoneDetail);
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        Uri url = webResourceRequest.getUrl();
        if (url != null) {
            return a(webView, url.toString());
        }
        if (!t.a()) {
            return false;
        }
        this.b.b("AdWebView", "No url found for request");
        return false;
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, int i, String str, String str2) {
        super.onReceivedError(webView, i, str, str2);
        a aVar = this.c;
        if (aVar != null) {
            com.applovin.impl.sdk.ad.b bVarI = aVar.i();
            String str3 = "Received error with error code: " + i + " with description \\'" + str + "\\' for URL: " + str2;
            if (t.a()) {
                this.b.b("AdWebView", str3 + " for ad: " + bVarI);
            }
        }
        if (zp.c(str2)) {
            this.f254a.B().a("adWebViewReceivedError", str2, i);
        }
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        return a(webView, str);
    }

    private void a(bq bqVar, b bVar) {
        a(bqVar, bVar, (Bundle) null);
    }

    private void a(bq bqVar, b bVar, Bundle bundle) {
        eq eqVarE1 = bqVar.e1();
        if (eqVarE1 != null) {
            nq.a(eqVarE1.a(), this.c.l());
            a(bVar, eqVarE1.b(), bundle);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x02eb  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x018e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected boolean a(android.webkit.WebView r12, java.lang.String r13) {
        /*
            Method dump skipped, instructions count: 751
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.adview.c.a(android.webkit.WebView, java.lang.String):boolean");
    }

    private void a() {
        this.c.y();
    }

    private void a(MotionEvent motionEvent) {
        this.c.a(motionEvent);
    }

    private void a(b bVar, Uri uri) {
        a(bVar, uri, (Bundle) null);
    }

    private void a(b bVar, Uri uri, Bundle bundle) {
        com.applovin.impl.sdk.ad.b currentAd = bVar.getCurrentAd();
        AppLovinAdView appLovinAdViewK = this.c.k();
        if (appLovinAdViewK != null && currentAd != null) {
            if (currentAd instanceof bq) {
                ((bq) currentAd).getAdEventTracker().v();
            }
            this.c.a(currentAd, appLovinAdViewK, uri, bVar.getAndClearLastClickEvent(), bundle);
        } else if (t.a()) {
            this.b.b("AdWebView", "Attempting to track click that is null or not an ApplovinAdView instance for clickedUri = " + uri);
        }
    }

    private void a(Uri uri) {
        String str;
        boolean booleanQueryParameter = uri.getBooleanQueryParameter("success", false);
        String queryParameter = uri.getQueryParameter("type");
        if (booleanQueryParameter) {
            str = "Tracked event: " + queryParameter;
        } else {
            str = "Failed to track event: " + queryParameter;
        }
        zp.a(str, com.applovin.impl.sdk.k.k());
    }
}
