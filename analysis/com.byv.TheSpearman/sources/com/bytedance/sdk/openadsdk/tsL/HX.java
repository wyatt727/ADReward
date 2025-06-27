package com.bytedance.sdk.openadsdk.tsL;

import android.os.Build;
import android.webkit.WebSettings;
import android.webkit.WebView;

/* compiled from: PlayableWebSettings.java */
/* loaded from: classes2.dex */
public class HX {
    private static void mZx(WebView webView) {
        try {
            webView.removeJavascriptInterface("searchBoxJavaBridge_");
            webView.removeJavascriptInterface("accessibility");
            webView.removeJavascriptInterface("accessibilityTraversal");
        } catch (Throwable th) {
            VwS.EYQ("WebViewSettings", "removeJavascriptInterfacesSafe error", th);
        }
    }

    private static void EYQ(WebSettings webSettings) {
        try {
            if (Build.VERSION.SDK_INT >= 17) {
                webSettings.setMediaPlaybackRequiresUserGesture(false);
            }
        } catch (Throwable th) {
            VwS.EYQ("WebViewSettings", "allowMediaPlayWithoutUserGesture error", th);
        }
    }

    public static void EYQ(WebView webView) {
        mZx(webView);
        WebSettings settings = webView.getSettings();
        EYQ(settings);
        if (settings == null) {
            return;
        }
        try {
            settings.setJavaScriptEnabled(true);
        } catch (Throwable th) {
            VwS.EYQ("WebViewSettings", "setJavaScriptEnabled error", th);
        }
        try {
            settings.setSupportZoom(false);
        } catch (Throwable th2) {
            VwS.EYQ("WebViewSettings", "setSupportZoom error", th2);
        }
        settings.setLoadWithOverviewMode(true);
        settings.setUseWideViewPort(true);
        settings.setDomStorageEnabled(true);
        settings.setAllowFileAccess(false);
        settings.setBlockNetworkImage(false);
        settings.setDisplayZoomControls(false);
        if (Build.VERSION.SDK_INT >= 16) {
            settings.setAllowFileAccessFromFileURLs(false);
            settings.setAllowUniversalAccessFromFileURLs(false);
        }
        settings.setSavePassword(false);
        boolean z = Build.VERSION.SDK_INT >= 28;
        try {
            if (Build.VERSION.SDK_INT >= 11 && !z) {
                webView.setLayerType(0, null);
            } else if (Build.VERSION.SDK_INT >= 16 && z) {
                webView.setLayerType(2, null);
            }
        } catch (Throwable th3) {
            VwS.EYQ("WebViewSettings", "setLayerType error", th3);
        }
        if (Build.VERSION.SDK_INT >= 21) {
            webView.getSettings().setMixedContentMode(0);
        }
    }
}
