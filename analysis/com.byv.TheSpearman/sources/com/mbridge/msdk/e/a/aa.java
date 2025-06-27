package com.mbridge.msdk.e.a;

import android.util.Log;
import java.util.List;
import java.util.Locale;

/* compiled from: VolleyLog.java */
/* loaded from: classes4.dex */
public class aa {

    /* renamed from: a, reason: collision with root package name */
    public static String f2696a = "TrackManager_Volley";
    private static final String b = "com.mbridge.msdk.e.a.aa";

    public static void a(String str, Object... objArr) {
    }

    public static void b(String str, Object... objArr) {
        Log.d(f2696a, d(str, objArr));
    }

    public static void c(String str, Object... objArr) {
        Log.e(f2696a, d(str, objArr));
    }

    public static void a(Throwable th, String str, Object... objArr) {
        Log.e(f2696a, d(str, objArr), th);
    }

    private static String d(String str, Object... objArr) {
        String str2;
        if (objArr != null) {
            str = String.format(Locale.US, str, objArr);
        }
        StackTraceElement[] stackTrace = new Throwable().fillInStackTrace().getStackTrace();
        int i = 2;
        while (true) {
            if (i >= stackTrace.length) {
                str2 = "<unknown>";
                break;
            }
            if (!stackTrace[i].getClassName().equals(b)) {
                String className = stackTrace[i].getClassName();
                String strSubstring = className.substring(className.lastIndexOf(46) + 1);
                str2 = strSubstring.substring(strSubstring.lastIndexOf(36) + 1) + "." + stackTrace[i].getMethodName();
                break;
            }
            i++;
        }
        return String.format(Locale.US, "[%d] %s: %s", Long.valueOf(Thread.currentThread().getId()), str2, str);
    }

    /* compiled from: VolleyLog.java */
    static class a {

        /* renamed from: a, reason: collision with root package name */
        private final List<C0261a> f2697a;
        private boolean b;

        /* compiled from: VolleyLog.java */
        /* renamed from: com.mbridge.msdk.e.a.aa$a$a, reason: collision with other inner class name */
        private static class C0261a {

            /* renamed from: a, reason: collision with root package name */
            public final String f2698a;
            public final long b;
            public final long c;
        }

        protected final void finalize() throws Throwable {
            long j;
            if (this.b) {
                return;
            }
            this.b = true;
            if (this.f2697a.size() == 0) {
                j = 0;
            } else {
                long j2 = this.f2697a.get(0).c;
                List<C0261a> list = this.f2697a;
                j = list.get(list.size() - 1).c - j2;
            }
            if (j > 0) {
                long j3 = this.f2697a.get(0).c;
                aa.b("(%-4d ms) %s", Long.valueOf(j), "Request on the loose");
                for (C0261a c0261a : this.f2697a) {
                    long j4 = c0261a.c;
                    aa.b("(+%-4d) [%2d] %s", Long.valueOf(j4 - j3), Long.valueOf(c0261a.b), c0261a.f2698a);
                    j3 = j4;
                }
            }
            aa.c("Marker log finalized without finish() - uncaught exit point for request", new Object[0]);
        }
    }
}
