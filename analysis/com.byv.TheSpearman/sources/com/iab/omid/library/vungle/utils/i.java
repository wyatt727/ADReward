package com.iab.omid.library.vungle.utils;

import android.webkit.WebView;
import androidx.webkit.WebViewCompat;
import java.util.Set;

/* loaded from: classes4.dex */
public class i {
    public void a(WebView webView, String str) {
        WebViewCompat.removeWebMessageListener(webView, str);
    }

    public void a(WebView webView, String str, Set<String> set, WebViewCompat.WebMessageListener webMessageListener) {
        WebViewCompat.addWebMessageListener(webView, str, set, webMessageListener);
    }
}
