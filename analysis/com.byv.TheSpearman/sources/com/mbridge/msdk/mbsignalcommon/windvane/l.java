package com.mbridge.msdk.mbsignalcommon.windvane;

import android.graphics.Bitmap;
import android.text.TextUtils;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.json.m4;
import com.mbridge.msdk.foundation.tools.ad;

/* compiled from: WindVaneWebViewClient.java */
/* loaded from: classes4.dex */
public final class l extends com.mbridge.msdk.mbsignalcommon.base.b {
    public static boolean b = true;

    /* renamed from: a, reason: collision with root package name */
    protected String f3194a = null;
    private int c = 0;
    private d d;

    @Override // android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        this.f3194a = str;
        d dVar = this.d;
        if (dVar != null) {
            dVar.a(webView, str, bitmap);
        }
    }

    @Override // android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        WebResourceResponse webResourceResponseA = a(str);
        if (webResourceResponseA != null) {
            ad.c("WindVaneWebViewClient", "find WebResourceResponse url is " + str);
            return webResourceResponseA;
        }
        return super.shouldInterceptRequest(webView, str);
    }

    private WebResourceResponse a(String str) {
        try {
            if (TextUtils.isEmpty(str) || !j.d(str)) {
                return null;
            }
            ad.c("WindVaneWebViewClient", "is image " + str);
            Bitmap bitmapB = com.mbridge.msdk.foundation.same.c.b.a(com.mbridge.msdk.foundation.controller.c.m().c()).b(str);
            ad.c("WindVaneWebViewClient", "find image from cache " + str);
            if (bitmapB == null || bitmapB.isRecycled()) {
                return null;
            }
            return new WebResourceResponse(j.e(str), m4.M, com.mbridge.msdk.foundation.same.c.a.a(bitmapB));
        } catch (Throwable unused) {
            return null;
        }
    }
}
