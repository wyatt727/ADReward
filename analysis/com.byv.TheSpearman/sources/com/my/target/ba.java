package com.my.target;

import android.util.Log;

/* loaded from: classes4.dex */
public final class ba {

    /* renamed from: a, reason: collision with root package name */
    public static boolean f3930a = false;

    public static String a(String str, String str2) {
        String str3;
        StringBuilder sb = new StringBuilder();
        if (str == null) {
            str3 = "";
        } else {
            str3 = str + ": ";
        }
        sb.append(str3);
        if (str2 == null) {
            str2 = "<empty log>";
        }
        sb.append(str2);
        return sb.toString();
    }

    public static void a(String str) {
        b(null, str);
    }

    public static void b(String str) {
        c(null, str);
    }

    public static void b(String str, String str2) {
        if (f3930a) {
            Log.d("[myTarget]", a(str, str2));
        }
    }

    public static void c(String str) {
        d(null, str);
    }

    public static void c(String str, String str2) {
        if (f3930a) {
            Log.e("[myTarget]", a(str, str2));
        }
    }

    public static void d(String str) {
        e(null, str);
    }

    public static void d(String str, String str2) {
        Log.i("[myTarget]", a(str, str2));
    }

    public static void e(String str, String str2) {
        if (f3930a) {
            Log.w("[myTarget]", a(str, str2));
        }
    }
}
