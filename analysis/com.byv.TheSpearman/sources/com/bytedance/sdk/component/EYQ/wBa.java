package com.bytedance.sdk.component.EYQ;

import android.content.Context;
import android.os.Build;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Base64;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;

/* compiled from: WebViewBridge.java */
/* loaded from: classes2.dex */
public class wBa extends EYQ {
    static final /* synthetic */ boolean tp = true;
    protected WebView HX;
    protected String QQ;

    @Override // com.bytedance.sdk.component.EYQ.EYQ
    protected Context EYQ(tp tpVar) {
        if (tpVar.Kbd != null) {
            return tpVar.Kbd;
        }
        if (tpVar.EYQ != null) {
            return tpVar.EYQ.getContext();
        }
        throw new IllegalStateException("WebView cannot be null!");
    }

    @Override // com.bytedance.sdk.component.EYQ.EYQ
    protected String EYQ() {
        return this.HX.getUrl();
    }

    @Override // com.bytedance.sdk.component.EYQ.EYQ
    protected void mZx(tp tpVar) {
        this.HX = tpVar.EYQ;
        this.QQ = tpVar.Td;
        if (Build.VERSION.SDK_INT < 17 || tpVar.nWX) {
            return;
        }
        Td();
    }

    protected void Td() {
        if (!tp && this.HX == null) {
            throw new AssertionError();
        }
        this.HX.addJavascriptInterface(this, this.QQ);
    }

    @Override // com.bytedance.sdk.component.EYQ.EYQ
    @JavascriptInterface
    public void invokeMethod(String str) {
        super.invokeMethod(str);
    }

    @Override // com.bytedance.sdk.component.EYQ.EYQ
    protected void mZx() {
        super.mZx();
        Pm();
    }

    protected void Pm() {
        this.HX.removeJavascriptInterface(this.QQ);
    }

    @Override // com.bytedance.sdk.component.EYQ.EYQ
    protected void EYQ(String str, hu huVar) {
        if (huVar != null && !TextUtils.isEmpty(huVar.QQ)) {
            String str2 = huVar.QQ;
            EYQ(str, String.format("javascript:(function(){   const iframe = document.querySelector(atob('%s'));   if (iframe && iframe.contentWindow) {        iframe.contentWindow.postMessage(%s, atob('%s'));   }})()", Base64.encodeToString(String.format("iframe[src=\"%s\"", str2).getBytes(), 2), str, Base64.encodeToString(str2.getBytes(), 2)));
            return;
        }
        super.EYQ(str, huVar);
    }

    @Override // com.bytedance.sdk.component.EYQ.EYQ
    protected void EYQ(String str) {
        EYQ(str, "javascript:" + this.QQ + "._handleMessageFromToutiao(" + str + ")");
    }

    private void EYQ(String str, final String str2) {
        if (this.IPb || TextUtils.isEmpty(str2)) {
            return;
        }
        Runnable runnable = new Runnable() { // from class: com.bytedance.sdk.component.EYQ.wBa.1
            @Override // java.lang.Runnable
            public void run() {
                if (wBa.this.IPb) {
                    return;
                }
                try {
                    if (Build.VERSION.SDK_INT >= 19) {
                        wBa.this.HX.evaluateJavascript(str2, null);
                    } else {
                        wBa.this.HX.loadUrl(str2);
                    }
                } catch (Throwable unused) {
                }
            }
        };
        if (Looper.myLooper() != Looper.getMainLooper()) {
            this.Pm.post(runnable);
        } else {
            runnable.run();
        }
    }
}
