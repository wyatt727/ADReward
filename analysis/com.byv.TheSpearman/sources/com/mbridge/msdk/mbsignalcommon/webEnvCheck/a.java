package com.mbridge.msdk.mbsignalcommon.webEnvCheck;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.webkit.WebView;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.c.g;
import com.mbridge.msdk.c.h;
import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.mbsignalcommon.base.b;

/* compiled from: MBWebViewChecker.java */
/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private static volatile Boolean f3182a;
    private static volatile Handler b;
    private static Boolean c;

    public static boolean a(final Context context) {
        g gVarA;
        try {
            gVarA = h.a().a(c.m().k());
        } catch (Exception unused) {
            gVarA = null;
        }
        if (gVarA != null) {
            c = Boolean.valueOf(gVarA.aE());
        } else {
            c = false;
        }
        Boolean bool = c;
        if (bool == null || !bool.booleanValue()) {
            return true;
        }
        if (Looper.getMainLooper() == Looper.myLooper()) {
            if (f3182a == null) {
                try {
                    f3182a = Boolean.valueOf(c(context));
                } catch (Exception unused2) {
                    f3182a = false;
                }
            }
            if (f3182a == null) {
                f3182a = new Boolean(false);
            }
            return f3182a.booleanValue();
        }
        if (f3182a == null && b == null) {
            b = new Handler(Looper.getMainLooper());
            b.post(new Runnable() { // from class: com.mbridge.msdk.mbsignalcommon.webEnvCheck.a.1
                @Override // java.lang.Runnable
                public final void run() {
                    if (a.f3182a == null) {
                        try {
                            Boolean unused3 = a.f3182a = Boolean.valueOf(a.c(context));
                        } catch (Exception unused4) {
                            Boolean unused5 = a.f3182a = false;
                        }
                    }
                }
            });
        }
        if (f3182a == null) {
            return true;
        }
        return f3182a.booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean c(Context context) {
        WebView webView;
        try {
            webView = new WebView(context);
            webView.setWebViewClient(new b());
        } catch (Exception unused) {
            webView = null;
        }
        if (webView == null) {
            return false;
        }
        try {
            webView.destroy();
            return true;
        } catch (Exception e) {
            if (!MBridgeConstans.DEBUG) {
                return true;
            }
            ad.a("MBWebViewChecker", "destroy webview error", e);
            return true;
        }
    }
}
