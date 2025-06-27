package com.apm.insight.runtime;

import android.content.Context;
import com.apm.insight.ICommonParams;
import java.util.Map;

/* loaded from: classes.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    private Context f133a;
    private ICommonParams b;
    private ICommonParams c;

    public d(Context context, ICommonParams iCommonParams) {
        this(context, iCommonParams, null);
    }

    public d(Context context, ICommonParams iCommonParams, d dVar) {
        this.f133a = context;
        this.b = iCommonParams;
        this.c = dVar == null ? null : dVar.b;
    }

    public static String a(Map<String, Object> map, String str) {
        Object obj;
        if (map == null || (obj = map.get(str)) == null) {
            return null;
        }
        return String.valueOf(obj);
    }

    public static boolean a(Map<String, Object> map) {
        return map == null || map.isEmpty() || !((map.containsKey("app_version") || map.containsKey("version_name")) && map.containsKey("version_code") && map.containsKey("update_version_code"));
    }

    public Map<String, Object> a() {
        Map<String, Object> mapB = b();
        if (a(mapB, "aid") == null) {
            mapB.put("aid", 4444);
        }
        return mapB;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0045 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00a7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.util.Map<java.lang.String, java.lang.Object> b() {
        /*
            r9 = this;
            java.lang.String r0 = "version_name"
            java.lang.String r1 = "update_version_code"
            java.lang.String r2 = "version_code"
            r3 = 0
            com.apm.insight.ICommonParams r4 = r9.c     // Catch: java.lang.Throwable -> L25
            if (r4 == 0) goto L10
            java.util.Map r4 = r4.getCommonParams()     // Catch: java.lang.Throwable -> L25
            goto L15
        L10:
            java.util.HashMap r4 = new java.util.HashMap     // Catch: java.lang.Throwable -> L25
            r4.<init>()     // Catch: java.lang.Throwable -> L25
        L15:
            com.apm.insight.ICommonParams r5 = r9.b     // Catch: java.lang.Throwable -> L20
            java.util.Map r5 = r5.getCommonParams()     // Catch: java.lang.Throwable -> L20
            r4.putAll(r5)     // Catch: java.lang.Throwable -> L20
            r5 = r3
            goto L2a
        L20:
            r5 = move-exception
            r8 = r5
            r5 = r4
            r4 = r8
            goto L27
        L25:
            r4 = move-exception
            r5 = r3
        L27:
            r8 = r5
            r5 = r4
            r4 = r8
        L2a:
            if (r4 != 0) goto L3d
            java.util.HashMap r4 = new java.util.HashMap
            r6 = 4
            r4.<init>(r6)
            if (r5 == 0) goto L3d
            java.lang.String r6 = "err_info"
            java.lang.String r5 = com.apm.insight.l.v.a(r5)     // Catch: java.lang.Throwable -> L3d
            r4.put(r6, r5)     // Catch: java.lang.Throwable -> L3d
        L3d:
            boolean r5 = a(r4)
            r6 = 128(0x80, float:1.794E-43)
            if (r5 == 0) goto La7
            android.content.Context r5 = r9.f133a     // Catch: java.lang.Throwable -> L83
            android.content.pm.PackageManager r5 = r5.getPackageManager()     // Catch: java.lang.Throwable -> L83
            android.content.Context r7 = r9.f133a     // Catch: java.lang.Throwable -> L83
            java.lang.String r7 = r7.getPackageName()     // Catch: java.lang.Throwable -> L83
            android.content.pm.PackageInfo r5 = r5.getPackageInfo(r7, r6)     // Catch: java.lang.Throwable -> L83
            java.lang.String r6 = r5.versionName     // Catch: java.lang.Throwable -> L83
            r4.put(r0, r6)     // Catch: java.lang.Throwable -> L83
            int r6 = r5.versionCode     // Catch: java.lang.Throwable -> L83
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch: java.lang.Throwable -> L83
            r4.put(r2, r6)     // Catch: java.lang.Throwable -> L83
            java.lang.Object r6 = r4.get(r1)     // Catch: java.lang.Throwable -> L83
            if (r6 != 0) goto Led
            android.content.pm.ApplicationInfo r6 = r5.applicationInfo     // Catch: java.lang.Throwable -> L83
            android.os.Bundle r6 = r6.metaData     // Catch: java.lang.Throwable -> L83
            if (r6 == 0) goto L79
            android.content.pm.ApplicationInfo r3 = r5.applicationInfo     // Catch: java.lang.Throwable -> L83
            android.os.Bundle r3 = r3.metaData     // Catch: java.lang.Throwable -> L83
            java.lang.String r5 = "UPDATE_VERSION_CODE"
            java.lang.Object r3 = r3.get(r5)     // Catch: java.lang.Throwable -> L83
        L79:
            if (r3 != 0) goto L7f
            java.lang.Object r3 = r4.get(r2)     // Catch: java.lang.Throwable -> L83
        L7f:
            r4.put(r1, r3)     // Catch: java.lang.Throwable -> L83
            goto Led
        L83:
            android.content.Context r3 = r9.f133a
            java.lang.String r3 = com.apm.insight.l.a.d(r3)
            r4.put(r0, r3)
            android.content.Context r0 = r9.f133a
            int r0 = com.apm.insight.l.a.e(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r4.put(r2, r0)
            java.lang.Object r0 = r4.get(r1)
            if (r0 != 0) goto Led
            java.lang.Object r0 = r4.get(r2)
            r4.put(r1, r0)
            goto Led
        La7:
            android.content.Context r0 = r9.f133a     // Catch: java.lang.Throwable -> Led
            android.content.pm.PackageManager r0 = r0.getPackageManager()     // Catch: java.lang.Throwable -> Led
            android.content.Context r1 = r9.f133a     // Catch: java.lang.Throwable -> Led
            java.lang.String r1 = r1.getPackageName()     // Catch: java.lang.Throwable -> Led
            android.content.pm.PackageInfo r0 = r0.getPackageInfo(r1, r6)     // Catch: java.lang.Throwable -> Led
            java.lang.String r0 = r0.versionName     // Catch: java.lang.Throwable -> Led
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Led
            r1.<init>()     // Catch: java.lang.Throwable -> Led
            android.content.Context r2 = r9.f133a     // Catch: java.lang.Throwable -> Led
            java.lang.String r2 = r2.getPackageName()     // Catch: java.lang.Throwable -> Led
            r1.append(r2)     // Catch: java.lang.Throwable -> Led
            java.lang.String r2 = ".BuildConfig"
            r1.append(r2)     // Catch: java.lang.Throwable -> Led
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> Led
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.Throwable -> Led
            java.lang.String r2 = "VERSION_NAME"
            java.lang.reflect.Field r1 = r1.getDeclaredField(r2)     // Catch: java.lang.Throwable -> Led
            java.lang.Object r1 = r1.get(r3)     // Catch: java.lang.Throwable -> Led
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> Led
            if (r0 == 0) goto Led
            boolean r1 = r0.equals(r1)     // Catch: java.lang.Throwable -> Led
            if (r1 != 0) goto Led
            java.lang.String r1 = "manifest_version"
            r4.put(r1, r0)     // Catch: java.lang.Throwable -> Led
        Led:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.apm.insight.runtime.d.b():java.util.Map");
    }

    public ICommonParams c() {
        return this.b;
    }

    public String d() {
        try {
            return this.b.getDeviceId();
        } catch (Throwable unused) {
            return "";
        }
    }

    public String e() {
        try {
            return String.valueOf(this.b.getCommonParams().get("aid"));
        } catch (Throwable unused) {
            return "4444";
        }
    }

    public long f() {
        try {
            return this.b.getUserId();
        } catch (Throwable unused) {
            return 0L;
        }
    }
}
