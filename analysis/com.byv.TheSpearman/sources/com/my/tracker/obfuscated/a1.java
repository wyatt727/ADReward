package com.my.tracker.obfuscated;

import android.net.Uri;
import android.os.Handler;
import android.text.TextUtils;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.android.gms.nearby.messages.Strategy;
import com.my.tracker.MyTracker;
import com.my.tracker.MyTrackerConfig;
import com.my.tracker.MyTrackerParams;
import com.my.tracker.config.AntiFraudConfig;
import java.net.URI;

/* loaded from: classes4.dex */
public final class a1 {

    /* renamed from: a, reason: collision with root package name */
    private final MyTrackerParams f4210a = new MyTrackerParams();
    private String b = "";
    private AntiFraudConfig c = AntiFraudConfig.newBuilder().build();
    private volatile boolean d = true;
    private volatile boolean e = false;
    private volatile boolean f = true;
    private volatile boolean g = true;
    private volatile boolean h = true;
    private volatile boolean i = true;
    private volatile int j = 30;
    private volatile int k = 0;
    private volatile int l = TypedValues.Custom.TYPE_INT;
    private volatile String m = null;
    private volatile String n = null;
    private volatile MyTrackerConfig.InstalledPackagesProvider o = null;
    private volatile MyTrackerConfig.OkHttpClientProvider p = null;
    private volatile String q = a("https", "tracker-api.my.com", null);
    private volatile MyTracker.AttributionListener r = null;
    private volatile Handler s = null;

    private a1() {
    }

    private static String a(String str, String str2, String str3) {
        Uri.Builder builder = new Uri.Builder();
        if (TextUtils.isEmpty(str)) {
            str = "https";
        }
        Uri.Builder builderEncodedAuthority = builder.scheme(str).encodedAuthority(str2);
        if (!TextUtils.isEmpty(str3)) {
            builderEncodedAuthority = builderEncodedAuthority.encodedPath(str3);
        }
        return builderEncodedAuthority.appendEncodedPath("v3/").toString();
    }

    public static a1 t() {
        return new a1();
    }

    public AntiFraudConfig a() {
        return this.c;
    }

    public void a(int i) {
        if (i > 86400) {
            z0.a("Invalid bufferingPeriod value " + i + ", bufferingPeriod set to max " + Strategy.TTL_SECONDS_MAX);
            i = 86400;
        } else if (i < 1) {
            z0.a("Invalid bufferingPeriod value " + i + ", bufferingPeriod set to min 1");
            i = 1;
        }
        this.l = i;
    }

    public void a(MyTracker.AttributionListener attributionListener, Handler handler) {
        this.r = attributionListener;
        this.s = handler;
    }

    public void a(MyTrackerConfig.InstalledPackagesProvider installedPackagesProvider) {
        this.o = installedPackagesProvider;
    }

    public void a(MyTrackerConfig.OkHttpClientProvider okHttpClientProvider) {
        this.p = okHttpClientProvider;
    }

    public void a(AntiFraudConfig antiFraudConfig) {
        this.c = antiFraudConfig;
    }

    public void a(s0 s0Var) {
        s0Var.c(this.b);
        this.f4210a.putDataToBuilder(s0Var);
        int i = this.j;
        if (i != 30) {
            s0Var.c(i);
        }
        int i2 = this.l;
        if (i2 != 900) {
            s0Var.a(i2);
        }
        int i3 = this.k;
        if (i3 != 0) {
            s0Var.b(i3);
        }
        if (!this.e) {
            s0Var.l();
        }
        if (!this.d) {
            s0Var.k();
        }
        if (!this.f) {
            s0Var.j();
        }
        if (!this.g) {
            s0Var.b();
        }
        if (!this.h) {
            s0Var.f();
        }
        if (!this.i) {
            s0Var.g();
        }
        if (!this.c.useLightSensor) {
            s0Var.d();
        }
        if (!this.c.useMagneticFieldSensor) {
            s0Var.e();
        }
        if (!this.c.useGyroscope) {
            s0Var.c();
        }
        if (!this.c.usePressureSensor) {
            s0Var.h();
        }
        if (this.c.useProximitySensor) {
            return;
        }
        s0Var.i();
    }

    public void a(String str) {
        this.m = str;
    }

    public void a(boolean z) {
        this.g = z;
    }

    public String b() {
        return this.m;
    }

    public void b(int i) {
        if (i > 432000) {
            z0.a("Invalid forcingPeriod value " + i + ", forcingPeriod set to max 432000");
            this.k = 432000;
            return;
        }
        if (i < 0) {
            StringBuilder sb = new StringBuilder();
            sb.append("Invalid forcingPeriod value ");
            sb.append(i);
            sb.append(", forcingPeriod set to min ");
            i = 0;
            sb.append(0);
            z0.a(sb.toString());
        }
        this.k = i;
    }

    void b(String str) {
        this.b = str;
    }

    public void b(boolean z) {
        this.f = z;
    }

    public Handler c() {
        return this.s;
    }

    public void c(int i) {
        if (i > 7200) {
            z0.a("Invalid launchTimeout value " + i + ", timeout set to max 7200");
            i = 7200;
        } else if (i < 30) {
            z0.a("Invalid launchTimeout value " + i + ", timeout set to min 30");
            i = 30;
        }
        this.j = i;
    }

    public void c(String str) {
        URI uri;
        try {
            if (TextUtils.isEmpty(str)) {
                this.q = a("https", "tracker-api.my.com", null);
                return;
            }
            if (str.contains("://")) {
                uri = new URI(str);
            } else {
                uri = new URI("https://" + str);
            }
            this.q = a(uri.getScheme(), uri.getAuthority(), uri.getPath());
            z0.a("set tracker url to " + this.q);
        } catch (Throwable unused) {
            this.q = a("https", "tracker-api.my.com", null);
            z0.b("unable to set invalid url " + this.q + ", using default");
        }
    }

    public void c(boolean z) {
        this.d = z;
    }

    public MyTracker.AttributionListener d() {
        return this.r;
    }

    public void d(int i) {
        c(i != 0 ? i != 1 ? null : "eu.tracker-api.my.com" : "ru.tracker-api.my.com");
    }

    public void d(String str) {
        this.n = str;
    }

    public void d(boolean z) {
        this.e = z;
    }

    public int e() {
        return this.l;
    }

    public void e(boolean z) {
        this.h = z;
    }

    public int f() {
        return this.k;
    }

    public void f(boolean z) {
        this.i = z;
    }

    public String g() {
        return this.b;
    }

    public MyTrackerConfig.InstalledPackagesProvider h() {
        return this.o;
    }

    public int i() {
        return this.j;
    }

    public MyTrackerParams j() {
        return this.f4210a;
    }

    public MyTrackerConfig.OkHttpClientProvider k() {
        return this.p;
    }

    public String l() {
        return this.q;
    }

    public String m() {
        return this.n;
    }

    public boolean n() {
        return this.g;
    }

    public boolean o() {
        return this.f;
    }

    public boolean p() {
        return this.d;
    }

    public boolean q() {
        return this.e;
    }

    public boolean r() {
        return this.h;
    }

    public boolean s() {
        return this.i;
    }

    public void u() {
        this.n = "com.my.games.vendorapp";
    }
}
