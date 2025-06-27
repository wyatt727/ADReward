package com.mbridge.msdk.mbsignalcommon.b;

import android.graphics.Bitmap;
import android.net.http.SslError;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import com.mbridge.msdk.foundation.tools.ad;

/* compiled from: DefaultRVWebViewListener.java */
/* loaded from: classes4.dex */
public class a implements com.mbridge.msdk.mbsignalcommon.windvane.b {
    public void a(Object obj) {
        ad.a("RVWindVaneWebView", "getEndScreenInfo");
    }

    public void a(WebView webView, String str, String str2, int i, int i2) {
        ad.a("RVWindVaneWebView", "loadAds");
    }

    public void a(Object obj, String str) {
        ad.a("RVWindVaneWebView", "operateComponent");
    }

    @Override // com.mbridge.msdk.mbsignalcommon.windvane.d
    public final void a(WebView webView, String str, Bitmap bitmap) {
        ad.a("RVWindVaneWebView", "onPageStarted");
    }

    @Override // com.mbridge.msdk.mbsignalcommon.windvane.d
    public final boolean b(WebView webView, String str) {
        ad.a("RVWindVaneWebView", "shouldOverrideUrlLoading");
        return true;
    }

    @Override // com.mbridge.msdk.mbsignalcommon.windvane.d
    public void a(WebView webView, int i, String str, String str2) {
        ad.a("RVWindVaneWebView", "onReceivedError");
    }

    @Override // com.mbridge.msdk.mbsignalcommon.windvane.d
    public void a(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        ad.a("RVWindVaneWebView", "onReceivedSslError");
    }

    @Override // com.mbridge.msdk.mbsignalcommon.windvane.d
    public void a(WebView webView, String str) {
        ad.a("RVWindVaneWebView", "onPageFinished");
    }

    @Override // com.mbridge.msdk.mbsignalcommon.windvane.d
    public final void b(WebView webView, int i) {
        ad.a("RVWindVaneWebView", "onProgressChanged");
    }

    @Override // com.mbridge.msdk.mbsignalcommon.windvane.d
    public void a(WebView webView, int i) {
        ad.a("RVWindVaneWebView", "readyState");
    }

    @Override // com.mbridge.msdk.mbsignalcommon.windvane.d
    public final void c(WebView webView, int i) {
        ad.a("RVWindVaneWebView", "loadingResourceStatus");
    }

    @Override // com.mbridge.msdk.mbsignalcommon.windvane.d
    public void a(WebView webView) {
        ad.a("RVWindVaneWebView", "onRenderProcessGone");
    }
}
