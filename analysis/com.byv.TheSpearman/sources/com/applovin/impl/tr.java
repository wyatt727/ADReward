package com.applovin.impl;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.applovin.sdk.AppLovinSdkUtils;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public abstract class tr {

    /* renamed from: a, reason: collision with root package name */
    private static WebView f1043a;
    private static String b;
    private static int e;
    private static String f;
    private static String g;
    private static final Object c = new Object();
    private static final AtomicBoolean d = new AtomicBoolean();
    private static final AtomicBoolean h = new AtomicBoolean();

    static {
        if (e()) {
            b = (String) sj.a(qj.K, "", com.applovin.impl.sdk.k.k());
            return;
        }
        b = "";
        sj.b(qj.K, (Object) null, com.applovin.impl.sdk.k.k());
        sj.b(qj.L, (Object) null, com.applovin.impl.sdk.k.k());
    }

    public static void a(final com.applovin.impl.sdk.k kVar) {
        if (e() || d.getAndSet(true)) {
            return;
        }
        if (x3.d()) {
            AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.tr$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    tr.d(kVar);
                }
            });
        } else {
            AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.tr$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    tr.e(kVar);
                }
            });
        }
    }

    public static String b() {
        return g;
    }

    public static String c() {
        return f;
    }

    public static int d() {
        return e;
    }

    public static void f(com.applovin.impl.sdk.k kVar) {
    }

    public static void b(com.applovin.impl.sdk.k kVar) {
        if (h.getAndSet(true)) {
            return;
        }
        PackageInfo packageInfoC = c(kVar);
        if (packageInfoC != null) {
            e = packageInfoC.versionCode;
            f = packageInfoC.versionName;
            g = packageInfoC.packageName;
        } else {
            kVar.L();
            if (com.applovin.impl.sdk.t.a()) {
                kVar.L().b("WebViewDataCollector", "Failed to get WebView package info");
            }
        }
    }

    private static PackageInfo c(com.applovin.impl.sdk.k kVar) {
        PackageManager packageManager = com.applovin.impl.sdk.k.k().getPackageManager();
        if (x3.i()) {
            return WebView.getCurrentWebViewPackage();
        }
        Iterator it = kVar.c(oj.y4).iterator();
        while (it.hasNext()) {
            try {
                return packageManager.getPackageInfo((String) it.next(), 0);
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void d(com.applovin.impl.sdk.k kVar) {
        try {
            synchronized (c) {
                b = WebSettings.getDefaultUserAgent(com.applovin.impl.sdk.k.k());
                sj.b(qj.K, b, com.applovin.impl.sdk.k.k());
                sj.b(qj.L, Build.VERSION.RELEASE, com.applovin.impl.sdk.k.k());
            }
        } catch (Throwable th) {
            kVar.L();
            if (com.applovin.impl.sdk.t.a()) {
                kVar.L().a("WebViewDataCollector", "Failed to collect user agent", th);
            }
            kVar.B().a("WebViewDataCollector", "collectUserAgent", th);
        }
    }

    public static String a() {
        String str;
        synchronized (c) {
            str = b;
        }
        return str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void e(com.applovin.impl.sdk.k kVar) {
        try {
            f(kVar);
            synchronized (c) {
                b = f1043a.getSettings().getUserAgentString();
                sj.b(qj.K, b, com.applovin.impl.sdk.k.k());
                sj.b(qj.L, Build.VERSION.RELEASE, com.applovin.impl.sdk.k.k());
            }
        } catch (Throwable th) {
            kVar.L();
            if (com.applovin.impl.sdk.t.a()) {
                kVar.L().a("WebViewDataCollector", "Failed to collect user agent", th);
            }
            kVar.B().a("WebViewDataCollector", "collectUserAgent", th);
        }
    }

    public static boolean e() {
        boolean zEquals;
        synchronized (c) {
            zEquals = Build.VERSION.RELEASE.equals((String) sj.a(qj.L, "", com.applovin.impl.sdk.k.k()));
        }
        return zEquals;
    }
}
