package com.json.sdk.utils;

import android.text.TextUtils;
import android.util.Log;
import com.json.f7;

/* loaded from: classes4.dex */
public class Logger {

    /* renamed from: a, reason: collision with root package name */
    private static boolean f2282a;

    public static void d(String str, String str2) {
        if (f2282a) {
            Log.d(str, str2);
        }
    }

    public static void d(String str, String str2, Throwable th) {
        if (f2282a) {
            Log.d(str, str2, th);
        }
    }

    public static void e(String str, String str2) {
        if (f2282a) {
            Log.e(str, str2);
        }
    }

    public static void e(String str, String str2, Throwable th) {
        if (f2282a) {
            Log.e(str, str2, th);
        }
    }

    public static void enableLogging(int i) {
        f2282a = f7.d.MODE_0.a() != i;
    }

    public static void i(String str, String str2) {
        if (f2282a) {
            Log.i(str, str2);
        }
    }

    public static void i(String str, String str2, Throwable th) {
        if (!f2282a || TextUtils.isEmpty(str2)) {
            return;
        }
        Log.i(str, str2, th);
    }

    public static void v(String str, String str2) {
        if (f2282a) {
            Log.v(str, str2);
        }
    }

    public static void v(String str, String str2, Throwable th) {
        if (f2282a) {
            Log.v(str, str2, th);
        }
    }

    public static void w(String str, String str2) {
        if (f2282a) {
            Log.w(str, str2);
        }
    }

    public static void w(String str, String str2, Throwable th) {
        if (f2282a) {
            Log.w(str, str2, th);
        }
    }
}
