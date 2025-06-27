package com.applovin.impl;

import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.WebView;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.unity3d.ads.adplayer.AndroidWebViewClient;

/* loaded from: classes.dex */
public abstract class ur {
    public static void b(WebView webView) {
        if (webView == null) {
            return;
        }
        a(webView);
        webView.removeAllViews();
        webView.destroyDrawingCache();
        webView.destroy();
    }

    public static void a(WebView webView) {
        ViewParent parent = webView.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(webView);
        }
        webView.loadUrl(AndroidWebViewClient.BLANK_PAGE);
        webView.onPause();
    }

    public static void a(WebView webView, String str, String str2, com.applovin.impl.sdk.k kVar) {
        if (webView == null) {
            return;
        }
        try {
            kVar.L();
            if (com.applovin.impl.sdk.t.a()) {
                kVar.L().a(str2, "Forwarding \"" + str + "\" to WebView");
            }
            webView.loadUrl(str);
        } catch (Throwable th) {
            kVar.L();
            if (com.applovin.impl.sdk.t.a()) {
                kVar.L().a(str2, "Unable to forward to WebView", th);
            }
            kVar.B().a(str2, th, CollectionUtils.hashMap("operation", str));
        }
    }
}
