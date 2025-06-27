package com.bytedance.sdk.openadsdk.core.widget.EYQ;

import android.content.Context;
import android.os.Build;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.bytedance.sdk.component.utils.pi;
import java.lang.ref.WeakReference;

/* compiled from: SSWebSettings.java */
/* loaded from: classes2.dex */
public class Td {
    private final WeakReference<Context> EYQ;
    private boolean mZx = true;
    private final boolean Td = true;
    private final boolean Pm = true;
    private final boolean Kbd = false;
    private final boolean IPb = true;
    private boolean VwS = true;

    public static Td EYQ(Context context) {
        return new Td(context);
    }

    private Td(Context context) {
        this.EYQ = new WeakReference<>(context);
    }

    public Td EYQ(boolean z) {
        this.VwS = z;
        return this;
    }

    public Td mZx(boolean z) {
        this.mZx = z;
        return this;
    }

    public void EYQ(WebView webView) {
        if (webView == null || this.EYQ.get() == null) {
            return;
        }
        mZx(webView);
        WebSettings settings = webView.getSettings();
        EYQ(settings);
        if (settings == null) {
            return;
        }
        try {
            settings.setJavaScriptEnabled(true);
        } catch (Exception e) {
            pi.EYQ("SSWebSettings", e.getMessage());
        }
        try {
            if (this.mZx) {
                settings.setSupportZoom(true);
                settings.setBuiltInZoomControls(true);
            } else {
                settings.setSupportZoom(false);
            }
        } catch (Throwable th) {
            pi.EYQ("SSWebSettings", th.getMessage());
        }
        settings.setLoadWithOverviewMode(true);
        settings.setUseWideViewPort(true);
        settings.setDomStorageEnabled(true);
        settings.setAllowFileAccess(false);
        settings.setBlockNetworkImage(false);
        settings.setSavePassword(false);
        try {
            if (this.VwS) {
                webView.setLayerType(2, null);
            } else {
                webView.setLayerType(0, null);
            }
        } catch (Throwable th2) {
            pi.EYQ("SSWebSettings", th2.getMessage());
        }
    }

    public static void mZx(WebView webView) {
        try {
            webView.removeJavascriptInterface("searchBoxJavaBridge_");
            webView.removeJavascriptInterface("accessibility");
            webView.removeJavascriptInterface("accessibilityTraversal");
        } catch (Throwable th) {
            pi.mZx(th.toString());
        }
    }

    private void EYQ(WebSettings webSettings) {
        try {
            if (Build.VERSION.SDK_INT >= 17) {
                webSettings.setMediaPlaybackRequiresUserGesture(false);
            }
        } catch (Throwable th) {
            pi.mZx(th.toString());
        }
    }
}
