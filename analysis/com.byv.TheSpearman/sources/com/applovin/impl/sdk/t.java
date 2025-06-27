package com.applovin.impl.sdk;

import android.text.TextUtils;
import android.util.Log;
import com.applovin.impl.lc;
import com.applovin.impl.oj;
import com.applovin.impl.x3;
import com.json.t2;

/* loaded from: classes.dex */
public class t {
    private static boolean b;

    /* renamed from: a, reason: collision with root package name */
    private final k f982a;

    t(k kVar) {
        this.f982a = kVar;
        a("SDK Session Begin");
    }

    public static void a(boolean z) {
        b = z;
    }

    public static void c(String str, String str2, Throwable th) {
        if (!b || a()) {
            Log.e("AppLovinSdk", t2.i.d + str + "] " + str2, th);
        }
    }

    public static void e(String str, String str2) {
        g(str, str2);
    }

    public static void g(String str, String str2) {
        if (!b || a()) {
            Log.d("AppLovinSdk", t2.i.d + str + "] " + str2);
        }
    }

    public static void h(String str, String str2) {
        c(str, str2, null);
    }

    public static void i(String str, String str2) {
        if (!b || a()) {
            Log.i("AppLovinSdk", t2.i.d + str + "] " + str2);
        }
    }

    public static void j(String str, String str2) {
        if (!b || a()) {
            Log.w("AppLovinSdk", t2.i.d + str + "] " + str2);
        }
    }

    public static void l(String str, String str2) {
        k kVar = k.A0;
        if (kVar == null) {
            return;
        }
        kVar.L();
        if (a()) {
            k.A0.L().k(str, str2);
        }
    }

    public void b(String str, String str2) {
        a(str, str2, null);
    }

    public void d(String str, String str2) {
        Log.i("AppLovinSdk", t2.i.d + str + "] " + str2);
    }

    public void f(String str, String str2) {
        int iIntValue;
        if (a(this.f982a) && !TextUtils.isEmpty(str2) && (iIntValue = ((Integer) this.f982a.a(oj.x)).intValue()) > 0) {
            int length = str2.length();
            int i = ((length + iIntValue) - 1) / iIntValue;
            for (int i2 = 0; i2 < i; i2++) {
                int i3 = i2 * iIntValue;
                a(str, str2.substring(i3, Math.min(length, i3 + iIntValue)));
            }
        }
    }

    public void k(String str, String str2) {
        d(str, str2, null);
    }

    private void a(String str) {
        lc lcVar = new lc();
        lcVar.a().a(str).a();
        g("AppLovinSdk", lcVar.toString());
    }

    public static void b(String str, String str2, Throwable th) {
        k kVar = k.A0;
        if (kVar == null) {
            return;
        }
        kVar.L();
        if (a()) {
            k.A0.L().a(str, str2, th);
        }
    }

    public void d(String str, String str2, Throwable th) {
        Log.w("AppLovinSdk", t2.i.d + str + "] " + str2, th);
    }

    public static void c(String str, String str2) {
        b(str, str2, null);
    }

    public void a(String str, Throwable th) {
        if (x3.e()) {
            for (Throwable th2 : th.getSuppressed()) {
                b(str, th2.toString());
            }
        }
    }

    public void a(String str, String str2) {
        Log.d("AppLovinSdk", t2.i.d + str + "] " + str2);
    }

    public void a(String str, String str2, Throwable th) {
        Log.e("AppLovinSdk", t2.i.d + str + "] " + str2, th);
    }

    public static boolean a() {
        return a(k.A0);
    }

    public static boolean a(k kVar) {
        return kVar != null && kVar.h0().c();
    }
}
