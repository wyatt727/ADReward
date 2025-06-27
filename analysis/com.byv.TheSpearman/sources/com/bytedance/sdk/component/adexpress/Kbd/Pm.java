package com.bytedance.sdk.component.adexpress.Kbd;

import android.webkit.JavascriptInterface;
import com.bytedance.sdk.component.EYQ.wBa;
import java.lang.ref.WeakReference;

/* compiled from: WebViewBridgeProxy.java */
/* loaded from: classes2.dex */
public class Pm {
    private WeakReference<wBa> EYQ;

    public Pm(wBa wba) {
        this.EYQ = new WeakReference<>(wba);
    }

    public void EYQ(wBa wba) {
        this.EYQ = new WeakReference<>(wba);
    }

    @JavascriptInterface
    public void invokeMethod(String str) {
        WeakReference<wBa> weakReference = this.EYQ;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.EYQ.get().invokeMethod(str);
    }
}
