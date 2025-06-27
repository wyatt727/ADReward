package com.mbridge.msdk.foundation.tools;

import android.text.TextUtils;
import android.util.Log;
import com.mbridge.msdk.MBridgeConstans;

/* compiled from: SameLogTool.java */
/* loaded from: classes4.dex */
public final class ad {

    /* renamed from: a, reason: collision with root package name */
    public static boolean f2970a = true;
    public static boolean b = true;
    public static boolean c = true;
    public static boolean d = false;
    public static boolean e = true;
    public static boolean f = false;
    public static boolean g = true;
    public static boolean h = true;

    static {
        if (MBridgeConstans.DEBUG) {
            return;
        }
        g = false;
        f2970a = false;
        c = false;
        h = false;
        b = false;
        f = false;
        e = false;
        d = false;
    }

    public static void a(String str, String str2) {
        if (!f2970a || TextUtils.isEmpty(str2)) {
            return;
        }
        Log.d(a(str), str2);
    }

    private static String a(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        return "MBRIDGE_" + str;
    }

    public static void b(String str, String str2) {
        if (!b || str2 == null) {
            return;
        }
        Log.e(a(str), str2);
    }

    public static void a(String str, String str2, Throwable th) {
        if (!b || str2 == null || th == null) {
            return;
        }
        Log.e(a(str), str2, th);
    }

    public static void c(String str, String str2) {
        if (!c || TextUtils.isEmpty(str2)) {
            return;
        }
        Log.i(a(str), str2);
    }

    public static void d(String str, String str2) {
        if (!h || TextUtils.isEmpty(str2)) {
            return;
        }
        Log.w(a(str), str2);
    }

    public static void b(String str, String str2, Throwable th) {
        if (!h || TextUtils.isEmpty(str2)) {
            return;
        }
        Log.w(a(str), str2, th);
    }

    public static void a(String str, Throwable th) {
        if (!h || th == null) {
            return;
        }
        Log.w(a(str), th);
    }
}
