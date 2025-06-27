package com.my.tracker.obfuscated;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.firebase.remoteconfig.RemoteConfigConstants;

/* loaded from: classes4.dex */
public final class r0 {
    private static volatile r0 b;

    /* renamed from: a, reason: collision with root package name */
    private final SharedPreferences f4254a;

    private r0(SharedPreferences sharedPreferences) {
        this.f4254a = sharedPreferences;
    }

    public static r0 a(Context context) {
        r0 r0Var = b;
        if (r0Var == null) {
            synchronized (r0.class) {
                r0Var = b;
                if (r0Var == null) {
                    r0Var = new r0(context.getSharedPreferences("mytracker_prefs", 0));
                    b = r0Var;
                }
            }
        }
        return r0Var;
    }

    public String a() {
        return c("appVersion");
    }

    public void a(int i) {
        a("appSetIdScope", i);
    }

    public void a(long j) {
        a("appGalleryTrackedTime", j);
    }

    void a(String str, long j) {
        try {
            this.f4254a.edit().putLong(str, j).commit();
        } catch (Throwable th) {
            z0.a("PrefsCache error: ", th);
        }
    }

    void a(String str, String str2) {
        try {
            this.f4254a.edit().putString(str, str2).commit();
        } catch (Throwable th) {
            z0.a("PrefsCache error: ", th);
        }
    }

    void a(String str, boolean z) {
        try {
            this.f4254a.edit().putBoolean(str, z).commit();
        } catch (Throwable th) {
            z0.a("PrefsCache error: ", th);
        }
    }

    boolean a(String str) {
        try {
            return this.f4254a.getBoolean(str, false);
        } catch (Throwable unused) {
            return false;
        }
    }

    public long b() {
        return b("appGalleryTrackedTime");
    }

    long b(String str) {
        try {
            return this.f4254a.getLong(str, 0L);
        } catch (Throwable unused) {
            return 0L;
        }
    }

    public void b(long j) {
        a("installTimestamp", j);
    }

    public String c() {
        return c(RemoteConfigConstants.RequestFieldKey.APP_ID);
    }

    String c(String str) {
        try {
            return this.f4254a.getString(str, "");
        } catch (Throwable unused) {
            return "";
        }
    }

    public void c(long j) {
        a("lastUpdateTimestamp", j);
    }

    public String d() {
        return c("appSetId");
    }

    public void d(long j) {
        a("lastStopTimeStampSec", j);
    }

    public void d(String str) {
        a("appVersion", str);
    }

    public String e() {
        return c("appVersionName");
    }

    public void e(String str) {
        a(RemoteConfigConstants.RequestFieldKey.APP_ID, str);
    }

    public String f() {
        return c("appsHash");
    }

    public void f(String str) {
        a("appSetId", str);
    }

    public String g() {
        return c("attribution");
    }

    public void g(String str) {
        a("appVersionName", str);
    }

    public String h() {
        return c("firebaseAppInstanceId");
    }

    public void h(String str) {
        a("appsHash", str);
    }

    public long i() {
        return b("installTimestamp");
    }

    public void i(String str) {
        a("attribution", str);
    }

    public String j() {
        return c("instanceId");
    }

    public void j(String str) {
        a("firebaseAppInstanceId", str);
    }

    public long k() {
        return b("lastUpdateTimestamp");
    }

    public void k(String str) {
        a("instanceId", str);
    }

    public String l() {
        return c("referrer");
    }

    public void l(String str) {
        a("referrer", str);
    }

    public long m() {
        long jB = b("lastStopTimeStampSec");
        a("lastStopTimeStampSec", 0L);
        return jB;
    }

    public boolean n() {
        return a("apiReferrerSent");
    }

    public boolean o() {
        return a("huaweiApiReferrerSent");
    }

    public boolean p() {
        return a("preinstallRead");
    }

    public boolean q() {
        return a("referrerSent");
    }

    public void r() {
        a("apiReferrerSent", true);
    }

    public void s() {
        a("huaweiApiReferrerSent", true);
    }

    public void t() {
        a("preinstallRead", true);
    }

    public void u() {
        a("referrerSent", true);
    }
}
