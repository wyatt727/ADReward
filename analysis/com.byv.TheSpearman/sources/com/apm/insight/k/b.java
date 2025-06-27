package com.apm.insight.k;

import android.content.Context;
import android.text.TextUtils;
import com.apm.insight.CrashType;
import com.apm.insight.Npth;
import com.apm.insight.entity.Header;
import com.apm.insight.entity.b;
import com.apm.insight.k.c;
import com.apm.insight.l.o;
import com.apm.insight.l.p;
import com.apm.insight.l.w;
import com.apm.insight.nativecrash.NativeImpl;
import com.apm.insight.runtime.q;
import com.apm.insight.runtime.s;
import com.google.android.gms.ads.RequestConfiguration;
import com.json.t2;
import com.my.target.ads.Reward;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class b {
    private static volatile b d;
    private Context c;
    private C0011b f;
    private HashMap<String, C0011b> g;

    /* renamed from: a, reason: collision with root package name */
    List<File> f69a = new ArrayList();
    List<File> b = new ArrayList();
    private int e = -1;
    private volatile boolean h = false;
    private Runnable i = new Runnable() { // from class: com.apm.insight.k.b.1
        @Override // java.lang.Runnable
        public void run() throws Throwable {
            b.this.g();
        }
    };
    private Runnable j = new Runnable() { // from class: com.apm.insight.k.b.2
        @Override // java.lang.Runnable
        public void run() throws Throwable {
            b.this.e();
        }
    };

    static class a {

        /* renamed from: a, reason: collision with root package name */
        File f74a;
        long b;
        long c;
        CrashType d;
        String e;

        a(File file, long j, CrashType crashType) {
            this.b = -1L;
            this.c = -1L;
            this.f74a = file;
            this.b = j;
            this.d = crashType;
            this.e = file.getName();
        }

        a(File file, CrashType crashType) {
            this.b = -1L;
            this.c = -1L;
            this.f74a = file;
            this.d = crashType;
            this.e = file.getName();
        }
    }

    /* renamed from: com.apm.insight.k.b$b, reason: collision with other inner class name */
    static class C0011b {

        /* renamed from: a, reason: collision with root package name */
        String f75a;
        a d;
        a e;
        List<a> b = new ArrayList();
        List<a> c = new ArrayList();
        boolean f = false;
        int g = 0;

        C0011b(String str) {
            this.f75a = str;
        }
    }

    private b(Context context) {
        this.c = context;
    }

    private com.apm.insight.entity.e a(File file, CrashType crashType, String str, long j, long j2) {
        com.apm.insight.entity.e eVar;
        try {
            try {
                if (file.isFile()) {
                    com.apm.insight.l.i.a(file);
                    return null;
                }
                boolean z = crashType == CrashType.LAUNCH;
                if (crashType == null) {
                    try {
                        return com.apm.insight.l.i.d(new File(file, file.getName()).getAbsolutePath());
                    } catch (Throwable th) {
                        th = th;
                        eVar = null;
                        com.apm.insight.l.i.a(file);
                        com.apm.insight.c.a().a("NPTH_CATCH", th);
                        return eVar;
                    }
                }
                com.apm.insight.entity.e eVarA = com.apm.insight.l.i.a(file, crashType);
                try {
                    JSONObject jSONObjectB = eVarA.b();
                    if (eVarA.b() == null) {
                        com.apm.insight.l.i.a(file);
                    } else {
                        if (crashType == CrashType.ANR) {
                            return eVarA;
                        }
                        jSONObjectB.put("crash_time", j);
                        jSONObjectB.put("app_start_time", j2);
                        JSONObject jSONObjectOptJSONObject = jSONObjectB.optJSONObject("header");
                        if (jSONObjectOptJSONObject == null) {
                            jSONObjectOptJSONObject = Header.a(this.c, j).f();
                        } else if (z) {
                            jSONObjectB.remove("header");
                        }
                        String strOptString = jSONObjectOptJSONObject.optString("sdk_version_name", null);
                        if (strOptString == null) {
                            strOptString = "1.3.8.nourl-alpha.19";
                        }
                        com.apm.insight.entity.a.a(jSONObjectB, "filters", "sdk_version", strOptString);
                        if (com.apm.insight.l.i.a(jSONObjectB.optJSONArray("logcat"))) {
                            jSONObjectB.put("logcat", com.apm.insight.runtime.k.b(str));
                        }
                        com.apm.insight.entity.a.a(jSONObjectB, "filters", "has_dump", com.json.mediationsdk.metadata.a.g);
                        com.apm.insight.entity.a.a(jSONObjectB, "filters", "has_logcat", String.valueOf(!com.apm.insight.l.l.a(jSONObjectB, "logcat")));
                        com.apm.insight.entity.a.a(jSONObjectB, "filters", "memory_leak", String.valueOf(com.apm.insight.entity.a.b(str)));
                        com.apm.insight.entity.a.a(jSONObjectB, "filters", "fd_leak", String.valueOf(com.apm.insight.entity.a.c(str)));
                        com.apm.insight.entity.a.a(jSONObjectB, "filters", "threads_leak", String.valueOf(com.apm.insight.entity.a.d(str)));
                        com.apm.insight.entity.a.a(jSONObjectB, "filters", "is_64_devices", String.valueOf(Header.a()));
                        com.apm.insight.entity.a.a(jSONObjectB, "filters", "is_64_runtime", String.valueOf(NativeImpl.e()));
                        com.apm.insight.entity.a.a(jSONObjectB, "filters", "is_x86_devices", String.valueOf(Header.b()));
                        com.apm.insight.entity.a.a(jSONObjectB, "filters", "has_meminfo_file", String.valueOf(com.apm.insight.entity.a.a(str)));
                        com.apm.insight.entity.a.a(jSONObjectB, "filters", "is_root", String.valueOf(com.apm.insight.nativecrash.c.m()));
                        jSONObjectB.put("launch_did", com.apm.insight.i.a.a(this.c));
                        jSONObjectB.put("crash_uuid", file.getName());
                        jSONObjectB.put("jiffy", q.a.a());
                        try {
                            long j3 = Long.parseLong(com.apm.insight.runtime.b.a(j, str));
                            com.apm.insight.entity.a.a(jSONObjectB, "filters", "lastAliveTime", Math.abs(j3 - j) < 60000 ? "< 60s" : "> 60s");
                            jSONObjectB.put("lastAliveTime", String.valueOf(j3));
                        } catch (Throwable unused) {
                            jSONObjectB.put("lastAliveTime", "unknown");
                            com.apm.insight.entity.a.a(jSONObjectB, "filters", "lastAliveTime", "unknown");
                        }
                        jSONObjectB.put("has_dump", com.json.mediationsdk.metadata.a.g);
                        if (jSONObjectB.opt(t2.a.j) == null) {
                            com.apm.insight.entity.a.a(jSONObjectB, w.a(com.apm.insight.i.g()));
                        }
                        if (Header.b(jSONObjectOptJSONObject)) {
                            com.apm.insight.entity.a.a(jSONObjectB, "filters", "unauthentic_version", "unauthentic_version");
                        }
                        com.apm.insight.entity.d.b(jSONObjectB);
                        eVarA.b().put("upload_scene", "launch_scan");
                        if (z) {
                            JSONObject jSONObject = new JSONObject();
                            jSONObjectB.put("event_type", "start_crash");
                            jSONObjectB.put("stack", jSONObjectB.remove("data"));
                            jSONObject.put("data", new JSONArray().put(jSONObjectB));
                            jSONObject.put("header", jSONObjectOptJSONObject);
                            eVarA.a(jSONObject);
                        } else {
                            jSONObjectB.put("isJava", 1);
                        }
                    }
                    return eVarA;
                } catch (Throwable th2) {
                    th = th2;
                    eVar = eVarA;
                    com.apm.insight.l.i.a(file);
                    com.apm.insight.c.a().a("NPTH_CATCH", th);
                    return eVar;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (Throwable th4) {
            th = th4;
            eVar = null;
        }
    }

    public static b a() {
        if (d == null) {
            synchronized (b.class) {
                if (d == null) {
                    d = new b(com.apm.insight.i.g());
                }
            }
        }
        return d;
    }

    private JSONObject a(com.apm.insight.nativecrash.c cVar) {
        JSONObject jSONObjectD = cVar.d();
        if (jSONObjectD != null && jSONObjectD.length() != 0) {
            return jSONObjectD;
        }
        if (com.apm.insight.i.d()) {
            cVar.l();
        }
        if (!cVar.c()) {
            cVar.k();
            return null;
        }
        if (!cVar.f()) {
            cVar.k();
            return null;
        }
        if (cVar.g()) {
            cVar.k();
            return null;
        }
        cVar.e();
        return cVar.j();
    }

    private void a(C0011b c0011b) {
        com.apm.insight.l.i.a(o.a(this.c, c0011b.f75a));
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0093 A[Catch: all -> 0x0166, PHI: r12
      0x0093: PHI (r12v2 java.io.File) = (r12v3 java.io.File), (r12v4 java.io.File) binds: [B:33:0x00a2, B:29:0x0091] A[DONT_GENERATE, DONT_INLINE], TryCatch #2 {all -> 0x0166, blocks: (B:14:0x0045, B:16:0x004b, B:17:0x0050, B:20:0x0057, B:24:0x0062, B:26:0x0073, B:32:0x009a, B:36:0x00ae, B:38:0x00b2, B:43:0x00c7, B:61:0x011e, B:55:0x00fe, B:45:0x00cb, B:58:0x010a, B:60:0x0118, B:30:0x0093, B:28:0x0081), top: B:84:0x0045 }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x014c A[Catch: all -> 0x0161, TryCatch #0 {all -> 0x0161, blocks: (B:63:0x0140, B:65:0x014c, B:66:0x015b), top: B:80:0x0140 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void a(final com.apm.insight.k.b.C0011b r21, boolean r22, com.apm.insight.runtime.h r23) {
        /*
            Method dump skipped, instructions count: 384
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.apm.insight.k.b.a(com.apm.insight.k.b$b, boolean, com.apm.insight.runtime.h):void");
    }

    private void a(File file, C0011b c0011b) {
    }

    private void a(HashMap<String, C0011b> map) {
        File[] fileArrListFiles = o.f(this.c).listFiles();
        if (fileArrListFiles == null || fileArrListFiles.length == 0) {
            return;
        }
        for (int i = 0; i < fileArrListFiles.length && i < 5; i++) {
            File file = fileArrListFiles[i];
            try {
                if (file.isDirectory() && file.getName().endsWith(RequestConfiguration.MAX_AD_CONTENT_RATING_G)) {
                    String name = file.getName();
                    C0011b c0011b = map.get(name);
                    if (c0011b == null) {
                        c0011b = new C0011b(name);
                        map.put(name, c0011b);
                    }
                    JSONArray jSONArrayA = com.apm.insight.nativecrash.d.a(o.l(file), o.m(file));
                    c0011b.g = jSONArrayA.length();
                    if (c0011b.g > 0) {
                        try {
                            com.apm.insight.l.i.a(o.n(file), jSONArrayA, false);
                        } catch (Throwable unused) {
                        }
                    }
                } else {
                    com.apm.insight.l.i.a(file);
                }
            } catch (Throwable th) {
                com.apm.insight.c.a().a("NPTH_CATCH", th);
                com.apm.insight.l.i.a(file);
            }
        }
    }

    private void a(HashMap<String, C0011b> map, C0011b c0011b) {
        File[] fileArrListFiles = o.d(this.c).listFiles();
        if (fileArrListFiles == null || fileArrListFiles.length == 0) {
            return;
        }
        for (int i = 0; i < fileArrListFiles.length && i < 5; i++) {
            File file = fileArrListFiles[i];
            try {
                if (file.isDirectory() && file.getName().endsWith(RequestConfiguration.MAX_AD_CONTENT_RATING_G)) {
                    String name = file.getName();
                    C0011b c0011b2 = map.get(name);
                    if (c0011b2 == null) {
                        c0011b2 = new C0011b(name);
                        map.put(name, c0011b2);
                    }
                    c0011b2.c.add(new a(file, CrashType.NATIVE));
                } else {
                    com.apm.insight.l.i.a(file);
                }
            } catch (Throwable th) {
                com.apm.insight.c.a().a("NPTH_CATCH", th);
                com.apm.insight.l.i.a(file);
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:12:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void a(java.util.HashMap<java.lang.String, com.apm.insight.k.b.C0011b> r12, com.apm.insight.k.b.C0011b r13, java.io.File r14, java.lang.String r15) {
        /*
            r11 = this;
            java.lang.String r0 = "G"
            boolean r0 = r15.endsWith(r0)
            if (r0 == 0) goto Lcf
            java.lang.String r0 = "_"
            java.lang.String[] r0 = r15.split(r0)
            int r1 = r0.length
            r2 = 5
            r3 = 0
            if (r1 >= r2) goto L1e
            java.util.List<com.apm.insight.k.b$a> r12 = r13.b
            com.apm.insight.k.b$a r13 = new com.apm.insight.k.b$a
            r13.<init>(r14, r3)
            r12.add(r13)
            return
        L1e:
            r1 = 0
            r2 = r0[r1]     // Catch: java.lang.Throwable -> La5
            long r4 = java.lang.Long.parseLong(r2)     // Catch: java.lang.Throwable -> La5
            r2 = 4
            r2 = r0[r2]     // Catch: java.lang.Throwable -> La5
            long r6 = java.lang.Long.parseLong(r2)     // Catch: java.lang.Throwable -> La5
            r13 = 2
            r2 = r0[r13]
            r8 = 1
            r0 = r0[r8]
            r0.hashCode()
            r9 = -1
            int r10 = r0.hashCode()
            switch(r10) {
                case -1109843021: goto L55;
                case 96741: goto L4a;
                case 3254818: goto L3f;
                default: goto L3d;
            }
        L3d:
            r1 = r9
            goto L5e
        L3f:
            java.lang.String r1 = "java"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L48
            goto L3d
        L48:
            r1 = r13
            goto L5e
        L4a:
            java.lang.String r13 = "anr"
            boolean r13 = r0.equals(r13)
            if (r13 != 0) goto L53
            goto L3d
        L53:
            r1 = r8
            goto L5e
        L55:
            java.lang.String r13 = "launch"
            boolean r13 = r0.equals(r13)
            if (r13 != 0) goto L5e
            goto L3d
        L5e:
            switch(r1) {
                case 0: goto L68;
                case 1: goto L65;
                case 2: goto L62;
                default: goto L61;
            }
        L61:
            goto L6a
        L62:
            com.apm.insight.CrashType r3 = com.apm.insight.CrashType.JAVA
            goto L6a
        L65:
            com.apm.insight.CrashType r3 = com.apm.insight.CrashType.ANR
            goto L6a
        L68:
            com.apm.insight.CrashType r3 = com.apm.insight.CrashType.LAUNCH
        L6a:
            java.lang.Object r13 = r12.get(r2)
            com.apm.insight.k.b$b r13 = (com.apm.insight.k.b.C0011b) r13
            if (r13 != 0) goto L7a
            com.apm.insight.k.b$b r13 = new com.apm.insight.k.b$b
            r13.<init>(r2)
            r12.put(r2, r13)
        L7a:
            com.apm.insight.k.b$a r12 = new com.apm.insight.k.b$a
            r12.<init>(r14, r4, r3)
            r12.c = r6
            com.apm.insight.k.b$a r14 = r13.d
            if (r14 == 0) goto L8f
            com.apm.insight.k.b$a r14 = r13.d
            long r0 = r14.b
            long r4 = r12.b
            int r14 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r14 <= 0) goto L9f
        L8f:
            if (r3 == 0) goto L9f
            com.apm.insight.CrashType r14 = com.apm.insight.CrashType.ANR
            if (r3 == r14) goto L9f
            java.lang.String r14 = "ignore"
            boolean r14 = r15.contains(r14)
            if (r14 != 0) goto L9f
            r13.d = r12
        L9f:
            java.util.List<com.apm.insight.k.b$a> r13 = r13.b
            r13.add(r12)
            goto Ld2
        La5:
            java.util.List<com.apm.insight.k.b$a> r12 = r13.b
            com.apm.insight.k.b$a r13 = new com.apm.insight.k.b$a
            r13.<init>(r14, r3)
            r12.add(r13)
            com.apm.insight.d r12 = com.apm.insight.c.a()
            java.lang.RuntimeException r13 = new java.lang.RuntimeException
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            java.lang.String r0 = "err format crashTime:"
            r14.append(r0)
            r14.append(r15)
            java.lang.String r14 = r14.toString()
            r13.<init>(r14)
            java.lang.String r14 = "NPTH_CATCH"
            r12.a(r14, r13)
            return
        Lcf:
            com.apm.insight.l.i.a(r14)
        Ld2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.apm.insight.k.b.a(java.util.HashMap, com.apm.insight.k.b$b, java.io.File, java.lang.String):void");
    }

    private boolean a(File file) {
        String[] list = file.list();
        if (list == null) {
            return false;
        }
        for (String str : list) {
            if (!TextUtils.isEmpty(str) && str.endsWith("")) {
                return true;
            }
        }
        return false;
    }

    private void b(final C0011b c0011b, boolean z, com.apm.insight.runtime.h hVar) {
        boolean z2;
        JSONObject jSONObjectA;
        if (c0011b.c.size() <= 1 && c0011b.c.isEmpty()) {
            c0011b.e = c0011b.d;
            return;
        }
        boolean zB = p.b(this.c);
        c0011b.e = c0011b.d;
        com.apm.insight.nativecrash.c cVar = new com.apm.insight.nativecrash.c(this.c);
        for (a aVar : c0011b.c) {
            final File file = aVar.f74a;
            try {
                cVar.a(file);
                jSONObjectA = a(cVar);
            } catch (Throwable th) {
                th = th;
                z2 = zB;
            }
            if (jSONObjectA == null || jSONObjectA.length() == 0) {
                z2 = zB;
            } else {
                if (jSONObjectA.length() != 0) {
                    if (z) {
                        z2 = zB;
                        if (hVar != null && !hVar.a(Reward.DEFAULT)) {
                        }
                    } else {
                        long jOptLong = jSONObjectA.optLong("crash_time");
                        try {
                            if (c0011b.e == null) {
                                c0011b.e = aVar;
                                c0011b.f = true;
                                if (hVar == null || hVar.a(Reward.DEFAULT)) {
                                    z2 = zB;
                                } else {
                                    cVar.k();
                                }
                            } else {
                                if (c0011b.f) {
                                    z2 = zB;
                                } else {
                                    z2 = zB;
                                    try {
                                        if (jOptLong < c0011b.e.b) {
                                            c0011b.e = aVar;
                                            if (hVar == null || hVar.a(Reward.DEFAULT)) {
                                                if (!a(file)) {
                                                    a(file, c0011b);
                                                }
                                                c0011b.f = true;
                                            } else {
                                                cVar.k();
                                                zB = z2;
                                            }
                                        }
                                    } catch (Throwable th2) {
                                        th = th2;
                                        com.apm.insight.c.a().a("NPTH_CATCH", th);
                                        com.apm.insight.l.i.a(file);
                                        zB = z2;
                                    }
                                }
                                com.apm.insight.entity.a.a(jSONObjectA, "filters", "aid", String.valueOf(jSONObjectA.optJSONObject("header").opt("aid")));
                                jSONObjectA.optJSONObject("header").put("aid", 2010);
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            z2 = zB;
                        }
                    }
                    com.apm.insight.entity.a.a(jSONObjectA, "filters", "start_uuid", c0011b.f75a);
                    com.apm.insight.entity.a.a(jSONObjectA, "filters", "crash_thread_name", jSONObjectA.optString("crash_thread_name", "unknown"));
                    if (z2) {
                        try {
                            c.a aVar2 = new c.a(jSONObjectA, CrashType.NATIVE);
                            com.apm.insight.entity.b.a(jSONObjectA, com.apm.insight.entity.b.a(aVar2.c(), aVar2.a(), s.a().b(aVar2.b() == -1 ? System.currentTimeMillis() : aVar2.b())), new b.a() { // from class: com.apm.insight.k.b.4
                                @Override // com.apm.insight.entity.b.a
                                public void a(JSONObject jSONObject) {
                                    d.a().a(jSONObject, file, o.a(b.this.c, c0011b.f75a));
                                }
                            });
                            if (!cVar.k()) {
                                cVar.h();
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            com.apm.insight.c.a().a("NPTH_CATCH", th);
                            com.apm.insight.l.i.a(file);
                            zB = z2;
                        }
                    }
                    c.a(CrashType.NATIVE, jSONObjectA);
                } else {
                    z2 = zB;
                }
                zB = z2;
            }
            cVar.k();
            zB = z2;
        }
    }

    private void b(HashMap<String, C0011b> map, C0011b c0011b) {
        File[] fileArrListFiles = o.a(this.c).listFiles();
        if (fileArrListFiles == null) {
            return;
        }
        Arrays.sort(fileArrListFiles, Collections.reverseOrder());
        for (File file : fileArrListFiles) {
            try {
                if (com.apm.insight.e.a.a().a(file.getAbsolutePath())) {
                    com.apm.insight.l.i.a(file);
                } else if (!com.apm.insight.l.i.g(file) && !com.apm.insight.g.a.a().b(file.getName())) {
                    if (file.isFile()) {
                        com.apm.insight.l.i.a(file);
                    } else {
                        a(map, c0011b, file, file.getName());
                    }
                }
            } catch (Throwable th) {
                com.apm.insight.c.a().a("NPTH_CATCH", th);
            }
        }
    }

    private void c(HashMap<String, C0011b> map, C0011b c0011b) {
        com.apm.insight.l.i.a(o.b(this.c));
    }

    private void d() throws Throwable {
        if (this.f != null) {
            return;
        }
        this.f = new C0011b("old_uuid");
        HashMap<String, C0011b> map = new HashMap<>();
        this.g = map;
        a(map);
        b(this.g, this.f);
        c(this.g, this.f);
        a(this.g, this.f);
        b(this.f, true, null);
        a(this.f, true, null);
        this.f = null;
        if (this.g.isEmpty()) {
            f();
        } else {
            g();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() throws Throwable {
        if (this.h || this.g == null) {
            return;
        }
        if (!p.b(this.c)) {
            f();
        }
        boolean zH = h();
        com.apm.insight.runtime.h hVar = new com.apm.insight.runtime.h(this.c);
        Iterator<C0011b> it = this.g.values().iterator();
        while (it.hasNext()) {
            b(it.next(), zH, hVar);
        }
        Iterator<C0011b> it2 = this.g.values().iterator();
        while (it2.hasNext()) {
            a(it2.next(), zH, hVar);
        }
        Iterator<C0011b> it3 = this.g.values().iterator();
        while (it3.hasNext()) {
            a(it3.next());
        }
        hVar.a();
        com.apm.insight.runtime.b.a();
        f();
    }

    private void f() {
        this.h = true;
        this.g = null;
        NativeImpl.i();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() throws Throwable {
        if (this.h) {
            return;
        }
        if (!p.b(this.c) || (System.currentTimeMillis() - com.apm.insight.i.j() <= 5000 && com.apm.insight.i.i().isApmExists() && !Npth.hasCrash())) {
            com.apm.insight.runtime.p.b().a(this.i, 5000L);
        } else {
            e();
        }
    }

    private boolean h() {
        if (this.e == -1) {
            if (com.apm.insight.runtime.a.b() && com.apm.insight.runtime.a.g()) {
                this.e = 1;
            } else {
                this.e = 0;
            }
        }
        return this.e == 1;
    }

    private void i() {
        File[] fileArrListFiles = o.i(this.c).listFiles();
        if (fileArrListFiles == null) {
            return;
        }
        for (int i = 0; i < fileArrListFiles.length && i < 5; i++) {
            File file = fileArrListFiles[i];
            if (file.getName().endsWith(".atmp")) {
                com.apm.insight.a.a.a().a(file.getAbsolutePath());
            } else {
                try {
                    com.apm.insight.entity.e eVarE = com.apm.insight.l.i.e(file.getAbsolutePath());
                    if (eVarE != null) {
                        if (eVarE.b() != null) {
                            eVarE.b().put("upload_scene", "launch_scan");
                        }
                        if (e.a(e.d(), eVarE.e(), eVarE.d(), eVarE.f(), eVarE.g())) {
                            com.apm.insight.l.i.a(file);
                            com.apm.insight.l.i.a(eVarE.c());
                        }
                    } else {
                        com.apm.insight.l.i.a(file);
                    }
                } catch (Throwable th) {
                    com.apm.insight.c.a().a("NPTH_CATCH", th);
                }
            }
        }
    }

    public void a(boolean z) throws Throwable {
        if (!Npth.isStopUpload() && z) {
            d();
            i();
            com.apm.insight.c.a.a();
        }
    }

    public void b() {
        try {
            if (!this.h && com.apm.insight.l.a.b(com.apm.insight.i.g())) {
                com.apm.insight.runtime.p.b().a(this.j);
            }
        } catch (Throwable unused) {
        }
    }

    public boolean c() {
        return this.h;
    }
}
