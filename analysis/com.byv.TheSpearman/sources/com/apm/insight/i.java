package com.apm.insight;

import android.app.Application;
import android.content.Context;
import com.apm.insight.runtime.ConfigManager;
import com.apm.insight.runtime.t;
import com.google.android.gms.ads.RequestConfiguration;
import java.util.Random;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    private static Context f61a = null;
    private static Application b = null;
    private static long c = 0;
    private static String d = "default";
    private static boolean e = false;
    private static com.apm.insight.runtime.d f;
    private static volatile ConcurrentHashMap<Integer, String> i;
    private static volatile String n;
    private static ConfigManager g = new ConfigManager();
    private static a h = new a();
    private static t j = null;
    private static volatile String k = null;
    private static Object l = new Object();
    private static volatile int m = 0;
    private static int o = 0;
    private static boolean p = true;
    private static boolean q = true;
    private static boolean r = false;
    private static boolean s = true;

    public static com.apm.insight.runtime.d a() {
        if (f == null) {
            f = com.apm.insight.runtime.i.a(f61a);
        }
        return f;
    }

    public static String a(long j2, CrashType crashType, boolean z, boolean z2) {
        StringBuilder sb = new StringBuilder();
        sb.append(j2);
        sb.append("_");
        sb.append(crashType.getName());
        sb.append('_');
        sb.append(f());
        sb.append('_');
        sb.append(z ? "oom_" : "normal_");
        sb.append(j());
        sb.append('_');
        sb.append(z2 ? "ignore_" : "normal_");
        sb.append(Long.toHexString(new Random().nextLong()));
        sb.append(RequestConfiguration.MAX_AD_CONTENT_RATING_G);
        return sb.toString();
    }

    public static void a(int i2) {
        o = i2;
    }

    static void a(int i2, String str) {
        if (i == null) {
            synchronized (i.class) {
                if (i == null) {
                    i = new ConcurrentHashMap<>();
                }
            }
        }
        i.put(Integer.valueOf(i2), str);
    }

    public static void a(Application application) {
        if (application != null) {
            b = application;
        }
    }

    public static void a(Application application, Context context) {
        if (b == null) {
            c = System.currentTimeMillis();
            f61a = context;
            b = application;
            k = Long.toHexString(new Random().nextLong()) + RequestConfiguration.MAX_AD_CONTENT_RATING_G;
        }
    }

    static void a(Application application, Context context, ICommonParams iCommonParams) {
        a(application, context);
        f = new com.apm.insight.runtime.d(f61a, iCommonParams, a());
    }

    public static void a(com.apm.insight.runtime.d dVar) {
        f = dVar;
    }

    static void a(String str) {
        d = str;
    }

    static void a(boolean z) {
        e = z;
    }

    public static a b() {
        return h;
    }

    static void b(int i2, String str) {
        m = i2;
        n = str;
    }

    public static void b(boolean z) {
        p = z;
    }

    public static t c() {
        if (j == null) {
            synchronized (i.class) {
                j = new t(f61a);
            }
        }
        return j;
    }

    public static void c(boolean z) {
        q = z;
    }

    public static void d(boolean z) {
        r = z;
    }

    public static boolean d() {
        return i().isDebugMode() && n().contains("local_test");
    }

    public static String e() {
        return f() + '_' + Long.toHexString(new Random().nextLong()) + RequestConfiguration.MAX_AD_CONTENT_RATING_G;
    }

    public static void e(boolean z) {
        s = z;
    }

    public static String f() {
        if (k == null) {
            synchronized (l) {
                if (k == null) {
                    k = Long.toHexString(new Random().nextLong()) + "U";
                }
            }
        }
        return k;
    }

    public static Context g() {
        return f61a;
    }

    public static Application h() {
        return b;
    }

    public static ConfigManager i() {
        return g;
    }

    public static long j() {
        return c;
    }

    public static String k() {
        return d;
    }

    public static int l() {
        return o;
    }

    public static boolean m() {
        return e;
    }

    public static String n() {
        Object obj = a().a().get("channel");
        return obj == null ? "unknown" : String.valueOf(obj);
    }

    public static ConcurrentHashMap<Integer, String> o() {
        return i;
    }

    public static int p() {
        return m;
    }

    public static String q() {
        return n;
    }

    public static boolean r() {
        return p;
    }

    public static boolean s() {
        return q;
    }

    public static boolean t() {
        return r;
    }

    public static boolean u() {
        return s;
    }
}
