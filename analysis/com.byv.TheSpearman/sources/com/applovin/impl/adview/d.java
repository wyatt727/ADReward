package com.applovin.impl.adview;

import android.webkit.WebView;
import android.webkit.WebViewRenderProcess;
import android.webkit.WebViewRenderProcessClient;
import com.applovin.impl.sdk.t;

/* loaded from: classes.dex */
class d {

    /* renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.k f255a;
    private final WebViewRenderProcessClient b = new a();

    class a extends WebViewRenderProcessClient {
        a() {
        }

        @Override // android.webkit.WebViewRenderProcessClient
        public void onRenderProcessResponsive(WebView webView, WebViewRenderProcess webViewRenderProcess) {
        }

        @Override // android.webkit.WebViewRenderProcessClient
        public void onRenderProcessUnresponsive(WebView webView, WebViewRenderProcess webViewRenderProcess) {
            if (webView instanceof b) {
                com.applovin.impl.sdk.ad.b currentAd = ((b) webView).getCurrentAd();
                d.this.f255a.L();
                if (t.a()) {
                    d.this.f255a.L().b("AdWebViewRenderProcessClient", "WebView render process unresponsive for ad: " + currentAd);
                }
            }
        }
    }

    d(com.applovin.impl.sdk.k kVar) {
        this.f255a = kVar;
    }

    WebViewRenderProcessClient a() {
        return this.b;
    }
}
