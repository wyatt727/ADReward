package com.apm.insight.runtime;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import com.apm.insight.CrashType;
import com.apm.insight.ICrashCallback;
import com.apm.insight.IOOMCallback;
import com.apm.insight.nativecrash.NativeImpl;
import java.io.File;
import java.util.Map;

/* loaded from: classes.dex */
public class o {

    /* renamed from: a, reason: collision with root package name */
    private static boolean f144a = false;
    private static boolean b = false;
    private static boolean c = false;
    private static boolean d = false;
    private static boolean e = false;
    private static c f = new c();
    private static volatile boolean g = false;
    private static boolean h = false;

    public static c a() {
        return f;
    }

    public static void a(long j) {
        NativeImpl.a(j);
    }

    public static synchronized void a(Application application, Context context, boolean z, boolean z2, boolean z3, boolean z4, long j) {
        long jUptimeMillis = SystemClock.uptimeMillis();
        if (f144a) {
            return;
        }
        f144a = true;
        if (context == null || application == null) {
            throw new IllegalArgumentException("context or Application must be not null.");
        }
        com.apm.insight.i.a(application, context);
        if (com.apm.insight.i.t() && (a(application) || b(application) || q())) {
            Log.e("apminsight", "Inner npth checked.");
            return;
        }
        if (z || z2) {
            com.apm.insight.g.a aVarA = com.apm.insight.g.a.a();
            if (z2) {
                aVarA.a(new com.apm.insight.i.b(context));
            }
            if (z) {
                aVarA.b(new com.apm.insight.g.d(context));
            }
            b = true;
        }
        NativeImpl.a();
        if (z3) {
            boolean zA = NativeImpl.a(context);
            d = zA;
            if (!zA) {
                e = true;
            }
        }
        if (Looper.myLooper() == Looper.getMainLooper()) {
            g = true;
            NativeImpl.h();
        }
        g(z4);
        com.apm.insight.l.q.a((Object) ("Npth.init takes " + (SystemClock.uptimeMillis() - jUptimeMillis) + " ms."));
    }

    public static synchronized void a(Context context, boolean z, boolean z2, boolean z3, boolean z4, long j) {
        Application applicationH;
        if (com.apm.insight.i.h() != null) {
            applicationH = com.apm.insight.i.h();
        } else if (context instanceof Application) {
            applicationH = (Application) context;
            if (applicationH.getBaseContext() == null) {
                throw new IllegalArgumentException("The Application passed in when init has not been attached, please pass a attachBaseContext as param and call Npth.setApplication(Application) before init.");
            }
        } else {
            applicationH = (Application) context.getApplicationContext();
            if (applicationH == null) {
                throw new IllegalArgumentException("Can not get the Application instance since a baseContext was passed in when init, please call Npth.setApplication(Application) before init.");
            }
            if (applicationH.getBaseContext() != null) {
                context = applicationH.getBaseContext();
            }
        }
        a(applicationH, context, z, z2, z3, z4, j);
    }

    public static void a(ICrashCallback iCrashCallback, CrashType crashType) {
        a().a(iCrashCallback, crashType);
    }

    public static void a(IOOMCallback iOOMCallback) {
        a().a(iOOMCallback);
    }

    public static void a(IOOMCallback iOOMCallback, CrashType crashType) {
        a().b(iOOMCallback);
    }

    public static void a(com.apm.insight.e eVar) {
        com.apm.insight.i.i().setEncryptImpl(eVar);
    }

    public static void a(com.apm.insight.k.h hVar) {
        com.apm.insight.k.e.a(hVar);
    }

    public static void a(j jVar) {
        k.a(jVar);
    }

    public static void a(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        com.apm.insight.d.a.a(str);
    }

    public static void a(String str, com.apm.insight.a.b bVar, com.apm.insight.a.c cVar) {
        if (TextUtils.isEmpty(str) || !new File(str).exists()) {
            return;
        }
        com.apm.insight.a.a.a().a(str, bVar, cVar);
    }

    public static void a(final String str, final com.apm.insight.f fVar) {
        p.b().a(new Runnable() { // from class: com.apm.insight.runtime.o.1
            @Override // java.lang.Runnable
            public void run() {
                if (com.apm.insight.l.a.b(com.apm.insight.i.g())) {
                    com.apm.insight.b.d.a(str, fVar);
                }
            }
        });
    }

    public static void a(String str, Map<? extends String, ? extends String> map, Map<String, String> map2, com.apm.insight.g gVar) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        com.apm.insight.d.a.a(str, map, map2, gVar);
    }

    public static void a(String str, Map<? extends String, ? extends String> map, Map<String, String> map2, Map<String, String> map3, com.apm.insight.g gVar) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        com.apm.insight.d.a.a(str, map, map2, map3, gVar);
    }

    @Deprecated
    public static void a(Throwable th) {
        if (com.apm.insight.i.i().isReportErrorEnable()) {
            com.apm.insight.g.a.a(th);
        }
    }

    public static void a(boolean z) {
        com.apm.insight.i.b(z);
    }

    private static boolean a(Context context) {
        try {
            return new File(com.apm.insight.l.o.j(context), "npth").exists();
        } catch (Throwable unused) {
            return false;
        }
    }

    public static void b(long j) {
        NativeImpl.b(j);
    }

    public static void b(ICrashCallback iCrashCallback, CrashType crashType) {
        a().b(iCrashCallback, crashType);
    }

    @Deprecated
    public static void b(String str) {
        if (com.apm.insight.i.i().isReportErrorEnable()) {
            com.apm.insight.g.a.c(str);
        }
    }

    public static void b(boolean z) {
        com.apm.insight.i.c(z);
    }

    public static boolean b() {
        return b;
    }

    private static boolean b(Context context) {
        try {
            return new File(context.getApplicationInfo().nativeLibraryDir, "libnpth.so").exists();
        } catch (Throwable unused) {
            return false;
        }
    }

    public static void c(long j) {
        NativeImpl.c(j);
    }

    public static void c(String str) {
        NativeImpl.b(str);
    }

    public static void c(boolean z) {
        com.apm.insight.i.d(z);
    }

    public static boolean c() {
        return c;
    }

    public static void d(boolean z) {
        com.apm.insight.i.e(z);
    }

    public static boolean d() {
        return d;
    }

    public static boolean e() {
        return f144a;
    }

    public static void f() {
        if (!f144a || b) {
            return;
        }
        Context contextG = com.apm.insight.i.g();
        com.apm.insight.g.a aVarA = com.apm.insight.g.a.a();
        aVarA.a(new com.apm.insight.i.b(contextG));
        aVarA.b(new com.apm.insight.g.d(contextG));
    }

    public static void g() {
        if (f144a) {
            com.apm.insight.b.g.a(com.apm.insight.i.g()).c();
            c = true;
        }
    }

    private static void g(final boolean z) {
        p.b().a(new Runnable() { // from class: com.apm.insight.runtime.o.2
            @Override // java.lang.Runnable
            public void run() {
                if (!o.g) {
                    new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.apm.insight.runtime.o.2.1
                        @Override // java.lang.Runnable
                        public void run() {
                            boolean unused = o.g = true;
                            NativeImpl.h();
                        }
                    });
                }
                o.h(z);
            }
        }, 0L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void h(boolean r3) {
        /*
            android.content.Context r0 = com.apm.insight.i.g()
            com.apm.insight.runtime.a.f.a()
            com.apm.insight.runtime.m.a()
            java.lang.String r1 = "Npth.initAsync-createCallbackThread"
            com.apm.insight.k.a(r1)
            int r1 = com.apm.insight.nativecrash.NativeImpl.b()
            com.apm.insight.k.a()
            com.apm.insight.nativecrash.NativeImpl.c()
            boolean r2 = com.apm.insight.runtime.o.e
            if (r2 == 0) goto L27
            com.apm.insight.d r1 = com.apm.insight.c.a()
            java.lang.String r2 = "NativeLibraryLoad faild"
        L23:
            r1.a(r2)
            goto L30
        L27:
            if (r1 >= 0) goto L30
            com.apm.insight.d r1 = com.apm.insight.c.a()
            java.lang.String r2 = "createCallbackThread faild"
            goto L23
        L30:
            java.lang.String r1 = "Npth.initAsync-NpthDataManager"
            com.apm.insight.k.a(r1)
            com.apm.insight.e.a r1 = com.apm.insight.e.a.a()
            r1.a(r0)
            com.apm.insight.k.a()
            com.apm.insight.c.a()
            java.lang.String r1 = "Npth.initAsync-LaunchScanner"
            com.apm.insight.k.a(r1)
            com.apm.insight.k.i.a(r0)
            com.apm.insight.k.a()
            if (r3 == 0) goto L60
            java.lang.String r1 = "Npth.initAsync-CrashANRHandler"
            com.apm.insight.k.a(r1)
            com.apm.insight.b.g r0 = com.apm.insight.b.g.a(r0)
            r0.c()
            com.apm.insight.k.a()
            com.apm.insight.runtime.o.c = r3
        L60:
            java.lang.String r3 = "Npth.initAsync-EventUploadQueue"
            com.apm.insight.k.a(r3)
            com.apm.insight.k.g r3 = com.apm.insight.k.g.a()
            r3.b()
            com.apm.insight.k.a()
            java.lang.String r3 = "Npth.initAsync-BlockMonitor"
            com.apm.insight.k.a(r3)
            com.apm.insight.k.a()
            java.lang.String r3 = "Npth.initAsync-OriginExceptionMonitor"
            com.apm.insight.k.a(r3)
            com.apm.insight.k.a()
            com.apm.insight.nativecrash.NativeImpl.f()
            com.apm.insight.j.a()
            com.apm.insight.k.k.d()
            com.apm.insight.nativecrash.NativeImpl.j()
            java.lang.String r3 = "afterNpthInitAsync"
            java.lang.String r0 = "noValue"
            com.apm.insight.runtime.r.a(r3, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.apm.insight.runtime.o.h(boolean):void");
    }

    public static boolean h() {
        if (f144a && !d) {
            boolean zA = NativeImpl.a(com.apm.insight.i.g());
            d = zA;
            if (!zA) {
                e = true;
            }
        }
        return d;
    }

    public static boolean i() {
        return com.apm.insight.b.c.c();
    }

    public static void j() {
        if (f144a) {
            com.apm.insight.b.g.a(com.apm.insight.i.g()).d();
            c = false;
        }
    }

    public static boolean k() {
        return com.apm.insight.g.a.b() || NativeImpl.d();
    }

    public static boolean l() {
        return com.apm.insight.g.a.c() || NativeImpl.d();
    }

    public static boolean m() {
        return com.apm.insight.g.a.b();
    }

    public static boolean n() {
        return h;
    }

    public static void o() {
        h = true;
    }

    private static boolean q() {
        return false;
    }
}
