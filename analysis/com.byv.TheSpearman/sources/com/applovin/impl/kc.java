package com.applovin.impl;

import android.text.TextUtils;
import android.util.Log;
import java.net.UnknownHostException;

/* loaded from: classes.dex */
public abstract class kc {

    /* renamed from: a, reason: collision with root package name */
    private static int f595a = 0;
    private static boolean b = true;

    public static void d(String str, String str2) {
        if (f595a <= 2) {
            Log.w(str, str2);
        }
    }

    public static void b(String str, String str2, Throwable th) {
        c(str, a(str2, th));
    }

    public static void c(String str, String str2, Throwable th) {
        d(str, a(str2, th));
    }

    public static void c(String str, String str2) {
        if (f595a <= 1) {
            Log.i(str, str2);
        }
    }

    private static String a(String str, Throwable th) {
        String strA = a(th);
        if (TextUtils.isEmpty(strA)) {
            return str;
        }
        return str + "\n  " + strA.replace("\n", "\n  ") + '\n';
    }

    private static boolean b(Throwable th) {
        while (th != null) {
            if (th instanceof UnknownHostException) {
                return true;
            }
            th = th.getCause();
        }
        return false;
    }

    public static void b(String str, String str2) {
        if (f595a <= 3) {
            Log.e(str, str2);
        }
    }

    public static void a(String str, String str2, Throwable th) {
        b(str, a(str2, th));
    }

    public static String a(Throwable th) {
        if (th == null) {
            return null;
        }
        if (b(th)) {
            return "UnknownHostException (no network)";
        }
        if (!b) {
            return th.getMessage();
        }
        return Log.getStackTraceString(th).trim().replace("\t", "    ");
    }

    public static void a(String str, String str2) {
        if (f595a == 0) {
            Log.d(str, str2);
        }
    }
}
