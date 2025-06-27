package com.apm.insight.runtime;

import android.os.Build;
import android.system.Os;
import android.system.OsConstants;
import com.json.i5;

/* loaded from: classes.dex */
public class q {

    /* renamed from: a, reason: collision with root package name */
    private static long f149a = -1;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private static long f150a = -1;

        public static long a() {
            if (q.f149a == -1) {
                long unused = q.f149a = 1000 / b();
            }
            return q.f149a;
        }

        public static long a(long j) {
            long j2 = f150a;
            if (j2 > 0) {
                return j2;
            }
            long jSysconf = Build.VERSION.SDK_INT >= 21 ? Os.sysconf(OsConstants._SC_CLK_TCK) : Build.VERSION.SDK_INT >= 14 ? a("_SC_CLK_TCK", j) : j;
            if (jSysconf > 0) {
                j = jSysconf;
            }
            f150a = j;
            return j;
        }

        private static long a(String str, long j) {
            try {
                int i = Class.forName("libcore.io.OsConstants").getField(str).getInt(null);
                Class<?> cls = Class.forName("libcore.io.Libcore");
                Class<?> cls2 = Class.forName("libcore.io.Os");
                return ((Long) cls2.getMethod("sysconf", Integer.TYPE).invoke(cls.getField(i5.x).get(null), Integer.valueOf(i))).longValue();
            } catch (Throwable th) {
                th.printStackTrace();
                return j;
            }
        }

        public static long b() {
            return a(100L);
        }
    }
}
