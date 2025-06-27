package com.bytedance.sdk.component.utils;

import android.os.Build;
import android.webkit.WebView;

/* compiled from: LoadUrlUtils.java */
/* loaded from: classes2.dex */
public class tsL {
    private static final EYQ EYQ;

    /* compiled from: LoadUrlUtils.java */
    private static class EYQ {
        private EYQ() {
        }

        public void EYQ(WebView webView, String str) {
            if (webView == null) {
                return;
            }
            try {
                webView.loadUrl(str);
            } catch (Throwable unused) {
            }
        }
    }

    /* compiled from: LoadUrlUtils.java */
    private static class mZx extends EYQ {
        private mZx() {
            super();
        }

        @Override // com.bytedance.sdk.component.utils.tsL.EYQ
        public void EYQ(WebView webView, String str) {
            if (webView == null) {
                return;
            }
            boolean z = false;
            if (str != null && str.startsWith("javascript:")) {
                try {
                    webView.evaluateJavascript(str, null);
                    z = true;
                } catch (Throwable th) {
                    boolean z2 = th instanceof IllegalStateException;
                }
            }
            if (z) {
                return;
            }
            try {
                webView.loadUrl(str);
            } catch (Throwable unused) {
            }
        }
    }

    static {
        if (Build.VERSION.SDK_INT >= 19) {
            EYQ = new mZx();
        } else {
            EYQ = new EYQ();
        }
    }

    public static void EYQ(WebView webView, String str) {
        EYQ.EYQ(webView, str);
    }
}
