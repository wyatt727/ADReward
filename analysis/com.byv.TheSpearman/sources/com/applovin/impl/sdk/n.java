package com.applovin.impl.sdk;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.graphics.Point;
import android.hardware.SensorManager;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.net.ConnectivityManager;
import android.os.BatteryManager;
import android.os.Build;
import android.os.Environment;
import android.os.LocaleList;
import android.os.PowerManager;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import com.applovin.impl.c4;
import com.applovin.impl.dm;
import com.applovin.impl.kn;
import com.applovin.impl.l0;
import com.applovin.impl.oj;
import com.applovin.impl.qj;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sm;
import com.applovin.impl.x3;
import com.applovin.impl.xl;
import com.applovin.impl.zp;
import com.applovin.sdk.AppLovinSdkUtils;
import com.json.t2;
import java.io.File;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONArray;

/* loaded from: classes.dex */
public class n {
    private static final AtomicReference D = new AtomicReference();
    private static final AtomicReference E = new AtomicReference();
    private static final AtomicReference F = new AtomicReference();
    private final int A;
    private final k B;
    private final Context C;

    /* renamed from: a, reason: collision with root package name */
    private final i f946a;
    private final j b;
    private final d c;
    private final e d;
    private final g e;
    private final h f;
    private final String g;
    private final String h;
    private final double i;
    private final boolean j;
    private String k;
    private long l;
    private final b m;
    private boolean n;
    private f o;
    private f p;
    private f q;
    private f r;
    private f s;
    private f t;
    private f u;
    private final int v;
    private final int w;
    private final int x;
    private final int y;
    private final int z;

    class a implements dm.a {
        a() {
        }

        @Override // com.applovin.impl.dm.a
        public void a(l0.a aVar) {
            n.D.set(aVar);
        }
    }

    public class b {

        /* renamed from: a, reason: collision with root package name */
        private final String f948a;
        private final String b;
        private final String c;
        private final String d;
        private final String e;
        private final Long f;
        private final long g;
        private final int h;
        private final int i;

        /* synthetic */ b(n nVar, a aVar) {
            this();
        }

        public Long a() {
            return this.f;
        }

        public long b() {
            return this.g;
        }

        protected Long c() {
            k kVar = n.this.B;
            qj qjVar = qj.f;
            Long l = (Long) kVar.a(qjVar);
            if (l != null) {
                return l;
            }
            n.this.B.b(qjVar, Long.valueOf(this.g));
            return null;
        }

        public String d() {
            return this.e;
        }

        public String e() {
            return this.f948a;
        }

        public String f() {
            return this.c;
        }

        public int g() {
            return this.i;
        }

        public String h() {
            return this.b;
        }

        public int i() {
            return this.h;
        }

        public String j() {
            return this.d;
        }

        private b() throws PackageManager.NameNotFoundException {
            PackageManager packageManager = n.this.C.getPackageManager();
            ApplicationInfo applicationInfo = n.this.C.getApplicationInfo();
            File file = new File(applicationInfo.sourceDir);
            PackageInfo packageInfo = packageManager.getPackageInfo(n.this.C.getPackageName(), 0);
            this.f948a = packageManager.getApplicationLabel(applicationInfo).toString();
            this.b = packageInfo.versionName;
            this.h = packageInfo.versionCode;
            String str = applicationInfo.packageName;
            this.c = str;
            this.d = StringUtils.toShortSHA1Hash(str);
            this.g = file.lastModified();
            this.f = Long.valueOf(packageInfo.firstInstallTime);
            this.i = applicationInfo.targetSdkVersion;
            this.e = packageManager.getInstallerPackageName(str);
        }
    }

    public static class c {

        /* renamed from: a, reason: collision with root package name */
        private final String f949a;
        private final int b;

        public c(String str, int i) {
            this.f949a = str;
            this.b = i;
        }

        public String a() {
            return this.f949a;
        }

        public int b() {
            return this.b;
        }
    }

    protected class d {

        /* renamed from: a, reason: collision with root package name */
        private f f950a;
        private f b;
        private f c;
        private f d;
        private f e;
        private final AudioManager f;

        /* synthetic */ d(n nVar, a aVar) {
            this();
        }

        protected Integer a() {
            f fVar = this.f950a;
            if (fVar != null && !fVar.b()) {
                Integer num = (Integer) this.f950a.f952a;
                num.intValue();
                return num;
            }
            if (this.f == null) {
                return null;
            }
            try {
                f fVar2 = new f(n.this, Integer.valueOf((int) (this.f.getStreamVolume(3) * ((Float) n.this.B.a(oj.i4)).floatValue())), n.this.w, null);
                this.f950a = fVar2;
                Integer num2 = (Integer) fVar2.f952a;
                num2.intValue();
                return num2;
            } catch (Throwable th) {
                n.this.B.L();
                if (t.a()) {
                    n.this.B.L().a("DataProvider", "Unable to collect device volume", th);
                }
                return null;
            }
        }

        protected int b() {
            f fVar = this.c;
            if (fVar != null && !fVar.b()) {
                return ((Integer) this.c.f952a).intValue();
            }
            n nVar = n.this;
            f fVar2 = new f(nVar, Integer.valueOf(nVar.B.m().a()), n.this.x, null);
            this.c = fVar2;
            return ((Integer) fVar2.f952a).intValue();
        }

        protected String c() {
            f fVar = this.b;
            if (fVar != null && !fVar.b()) {
                return (String) this.b.f952a;
            }
            if (this.f == null) {
                return null;
            }
            StringBuilder sb = new StringBuilder();
            if (x3.g()) {
                for (AudioDeviceInfo audioDeviceInfo : this.f.getDevices(2)) {
                    sb.append(audioDeviceInfo.getType());
                    sb.append(",");
                }
            } else {
                if (this.f.isWiredHeadsetOn()) {
                    sb.append(3);
                    sb.append(",");
                }
                if (this.f.isBluetoothScoOn()) {
                    sb.append(7);
                    sb.append(",");
                }
                if (this.f.isBluetoothA2dpOn()) {
                    sb.append(8);
                }
            }
            if (sb.length() > 0 && sb.charAt(sb.length() - 1) == ',') {
                sb.deleteCharAt(sb.length() - 1);
            }
            String string = sb.toString();
            if (TextUtils.isEmpty(string)) {
                n.this.B.L();
                if (t.a()) {
                    n.this.B.L().a("DataProvider", "No sound outputs detected");
                }
            }
            f fVar2 = new f(n.this, string, r3.y, null);
            this.b = fVar2;
            return (String) fVar2.f952a;
        }

        protected Boolean d() {
            f fVar = this.d;
            if (fVar != null && !fVar.b()) {
                Boolean bool = (Boolean) this.d.f952a;
                bool.booleanValue();
                return bool;
            }
            AudioManager audioManager = this.f;
            if (audioManager == null) {
                return null;
            }
            f fVar2 = new f(n.this, Boolean.valueOf(audioManager.isMusicActive()), n.this.y, null);
            this.d = fVar2;
            Boolean bool2 = (Boolean) fVar2.f952a;
            bool2.booleanValue();
            return bool2;
        }

        protected Boolean e() {
            f fVar = this.e;
            if (fVar != null && !fVar.b()) {
                Boolean bool = (Boolean) this.e.f952a;
                bool.booleanValue();
                return bool;
            }
            AudioManager audioManager = this.f;
            if (audioManager == null) {
                return null;
            }
            f fVar2 = new f(n.this, Boolean.valueOf(audioManager.isSpeakerphoneOn()), n.this.y, null);
            this.e = fVar2;
            Boolean bool2 = (Boolean) fVar2.f952a;
            bool2.booleanValue();
            return bool2;
        }

        private d() {
            this.f = (AudioManager) n.this.C.getSystemService("audio");
        }
    }

    protected class e {

        /* renamed from: a, reason: collision with root package name */
        private f f951a;
        private f b;
        private f c;
        private final Intent d;
        private BatteryManager e;

        /* synthetic */ e(n nVar, a aVar) {
            this();
        }

        protected Integer a() {
            int intProperty;
            BatteryManager batteryManager;
            f fVar = this.f951a;
            if (fVar != null && !fVar.b()) {
                Integer num = (Integer) this.f951a.f952a;
                num.intValue();
                return num;
            }
            if (!x3.f() || (batteryManager = this.e) == null) {
                Intent intent = this.d;
                if (intent == null) {
                    return null;
                }
                int intExtra = intent.getIntExtra("level", -1);
                int intExtra2 = this.d.getIntExtra("scale", -1);
                if (intExtra < 0 || intExtra2 < 0) {
                    return null;
                }
                intProperty = (int) ((intExtra / intExtra2) * 100.0f);
            } else {
                intProperty = batteryManager.getIntProperty(4);
            }
            f fVar2 = new f(n.this, Integer.valueOf(intProperty), n.this.x, null);
            this.f951a = fVar2;
            Integer num2 = (Integer) fVar2.f952a;
            num2.intValue();
            return num2;
        }

        protected Integer b() {
            int intExtra;
            BatteryManager batteryManager;
            f fVar = this.b;
            if (fVar != null && !fVar.b()) {
                Integer num = (Integer) this.b.f952a;
                num.intValue();
                return num;
            }
            if (!x3.i() || (batteryManager = this.e) == null) {
                Intent intent = this.d;
                if (intent == null || (intExtra = intent.getIntExtra("status", -1)) < 0) {
                    return null;
                }
            } else {
                intExtra = batteryManager.getIntProperty(6);
            }
            f fVar2 = new f(n.this, Integer.valueOf(intExtra), n.this.x, null);
            this.b = fVar2;
            Integer num2 = (Integer) fVar2.f952a;
            num2.intValue();
            return num2;
        }

        protected Boolean c() {
            f fVar = this.c;
            if (fVar != null && !fVar.b()) {
                Boolean bool = (Boolean) this.c.f952a;
                bool.booleanValue();
                return bool;
            }
            if (x3.d()) {
                this.c = new f(n.this, Boolean.valueOf(Settings.Global.getInt(n.this.C.getContentResolver(), "stay_on_while_plugged_in", -1) > 0), n.this.x, null);
            } else {
                Intent intent = this.d;
                if (intent == null) {
                    return null;
                }
                this.c = new f(n.this, Boolean.valueOf(((intent.getIntExtra("plugged", -1) & 1) | 14) > 0), n.this.x, null);
            }
            Boolean bool2 = (Boolean) this.c.f952a;
            bool2.booleanValue();
            return bool2;
        }

        private e() {
            this.d = n.this.C.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            if (x3.f()) {
                this.e = (BatteryManager) n.this.C.getSystemService("batterymanager");
            }
        }
    }

    private class f {

        /* renamed from: a, reason: collision with root package name */
        private final Object f952a;
        private final long b;

        /* synthetic */ f(n nVar, Object obj, long j, a aVar) {
            this(obj, j);
        }

        private f(Object obj, long j) {
            this.f952a = obj;
            this.b = a() + j;
        }

        private long a() {
            return System.currentTimeMillis() / 1000;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean b() {
            return !((Boolean) n.this.B.a(oj.G3)).booleanValue() || this.b - a() <= 0;
        }
    }

    protected class g {

        /* renamed from: a, reason: collision with root package name */
        private int f953a;
        private int b;
        private int c;
        private float d;
        private float e;
        private float f;
        private double g;
        private final Boolean h;

        /* synthetic */ g(n nVar, a aVar) {
            this();
        }

        public float a() {
            return this.f;
        }

        public int b() {
            return this.c;
        }

        public int c() {
            return this.f953a;
        }

        public int d() {
            return this.b;
        }

        public Boolean e() {
            return this.h;
        }

        public double f() {
            return this.g;
        }

        public float g() {
            return this.d;
        }

        public float h() {
            return this.e;
        }

        private g() {
            this.h = x3.i() ? Boolean.valueOf(n.this.C.getResources().getConfiguration().isScreenHdr()) : null;
            DisplayMetrics displayMetrics = n.this.C.getResources().getDisplayMetrics();
            if (displayMetrics == null) {
                return;
            }
            this.f = displayMetrics.density;
            this.d = displayMetrics.xdpi;
            this.e = displayMetrics.ydpi;
            this.c = displayMetrics.densityDpi;
            Point pointB = x3.b(n.this.C);
            int i = pointB.x;
            this.f953a = i;
            this.b = pointB.y;
            this.g = Math.sqrt(Math.pow(i, 2.0d) + Math.pow(this.b, 2.0d)) / this.d;
        }
    }

    protected class h {

        /* renamed from: a, reason: collision with root package name */
        private long f954a;
        private f b;
        private f c;
        private f d;
        private final ActivityManager e;

        /* synthetic */ h(n nVar, a aVar) {
            this();
        }

        protected Long a() {
            f fVar = this.b;
            if (fVar != null && !fVar.b()) {
                Long l = (Long) this.b.f952a;
                l.longValue();
                return l;
            }
            ActivityManager.MemoryInfo memoryInfoA = zp.a(this.e);
            if (memoryInfoA == null) {
                return null;
            }
            f fVar2 = new f(n.this, Long.valueOf(memoryInfoA.availMem), n.this.v, null);
            this.b = fVar2;
            Long l2 = (Long) fVar2.f952a;
            l2.longValue();
            return l2;
        }

        protected Long b() {
            f fVar = this.c;
            if (fVar != null && !fVar.b()) {
                Long l = (Long) this.c.f952a;
                l.longValue();
                return l;
            }
            ActivityManager.MemoryInfo memoryInfoA = zp.a(this.e);
            if (memoryInfoA == null) {
                return null;
            }
            f fVar2 = new f(n.this, Long.valueOf(memoryInfoA.threshold), n.this.v, null);
            this.c = fVar2;
            Long l2 = (Long) fVar2.f952a;
            l2.longValue();
            return l2;
        }

        public long c() {
            return this.f954a;
        }

        protected Boolean d() {
            f fVar = this.d;
            if (fVar != null && !fVar.b()) {
                Boolean bool = (Boolean) this.d.f952a;
                bool.booleanValue();
                return bool;
            }
            ActivityManager.MemoryInfo memoryInfoA = zp.a(this.e);
            if (memoryInfoA == null) {
                return null;
            }
            f fVar2 = new f(n.this, Boolean.valueOf(memoryInfoA.lowMemory), n.this.v, null);
            this.d = fVar2;
            Boolean bool2 = (Boolean) fVar2.f952a;
            bool2.booleanValue();
            return bool2;
        }

        private h() {
            ActivityManager.MemoryInfo memoryInfoA;
            ActivityManager activityManager = (ActivityManager) n.this.C.getSystemService("activity");
            this.e = activityManager;
            if (activityManager == null || (memoryInfoA = zp.a(activityManager)) == null) {
                return;
            }
            this.f954a = memoryInfoA.totalMem;
        }
    }

    protected class i {

        /* renamed from: a, reason: collision with root package name */
        private final PowerManager f955a;

        /* synthetic */ i(n nVar, a aVar) {
            this();
        }

        protected Integer a() {
            if (n.this.o != null && !n.this.o.b()) {
                Integer num = (Integer) n.this.o.f952a;
                num.intValue();
                return num;
            }
            if (this.f955a == null || !x3.f()) {
                return null;
            }
            n nVar = n.this;
            nVar.o = new f(nVar, Integer.valueOf(this.f955a.isPowerSaveMode() ? 1 : 0), n.this.x, null);
            Integer num2 = (Integer) n.this.o.f952a;
            num2.intValue();
            return num2;
        }

        private i() {
            this.f955a = (PowerManager) n.this.C.getSystemService("power");
        }
    }

    protected class j {

        /* renamed from: a, reason: collision with root package name */
        private final TelephonyManager f956a;
        private String b;
        private String c;
        private String d;
        private String e;
        private String f;
        private f g;

        /* synthetic */ j(n nVar, a aVar) {
            this();
        }

        public String a() {
            return this.d;
        }

        public String b() {
            return this.c;
        }

        protected Integer c() {
            f fVar = this.g;
            if (fVar != null && !fVar.b()) {
                Integer num = (Integer) this.g.f952a;
                num.intValue();
                return num;
            }
            if (!x3.a("android.permission.READ_PHONE_STATE", n.this.C) || this.f956a == null || !x3.h()) {
                return null;
            }
            f fVar2 = new f(n.this, Integer.valueOf(this.f956a.getDataNetworkType()), n.this.A, null);
            this.g = fVar2;
            Integer num2 = (Integer) fVar2.f952a;
            num2.intValue();
            return num2;
        }

        public String d() {
            return this.e;
        }

        public String e() {
            return this.f;
        }

        private j() {
            TelephonyManager telephonyManager = (TelephonyManager) n.this.C.getSystemService("phone");
            this.f956a = telephonyManager;
            if (telephonyManager == null) {
                return;
            }
            this.c = telephonyManager.getSimCountryIso().toUpperCase(Locale.ENGLISH);
            try {
                this.d = telephonyManager.getNetworkOperatorName();
            } catch (Throwable th) {
                n.this.B.L();
                if (t.a()) {
                    n.this.B.L().a("DataProvider", "Unable to collect carrier", th);
                }
            }
            try {
                this.b = this.f956a.getNetworkOperator();
            } catch (Throwable th2) {
                n.this.B.L();
                if (t.a()) {
                    n.this.B.L().a("DataProvider", "Unable to collect get network operator", th2);
                }
            }
            String str = this.b;
            if (str == null) {
                return;
            }
            int iMin = Math.min(3, str.length());
            this.e = this.b.substring(0, iMin);
            this.f = this.b.substring(iMin);
        }
    }

    protected n(k kVar) {
        this.B = kVar;
        Context contextK = k.k();
        this.C = contextK;
        this.v = ((Integer) kVar.a(oj.C4)).intValue();
        this.w = ((Integer) kVar.a(oj.D4)).intValue();
        this.x = ((Integer) kVar.a(oj.E4)).intValue();
        this.y = ((Integer) kVar.a(oj.F4)).intValue();
        this.z = ((Integer) kVar.a(oj.G4)).intValue();
        this.A = ((Integer) kVar.a(oj.H4)).intValue();
        a aVar = null;
        this.f946a = new i(this, aVar);
        this.b = new j(this, aVar);
        this.c = new d(this, aVar);
        this.d = new e(this, aVar);
        this.e = new g(this, aVar);
        this.f = new h(this, aVar);
        this.g = AppLovinSdkUtils.isFireOS(contextK) ? "fireos" : "android";
        int orientation = AppLovinSdkUtils.getOrientation(contextK);
        if (orientation == 1) {
            this.h = t2.h.D;
        } else if (orientation == 2) {
            this.h = t2.h.C;
        } else {
            this.h = "none";
        }
        this.i = Math.round((TimeZone.getDefault().getOffset(new Date().getTime()) * 10.0d) / 3600000.0d) / 10.0d;
        SensorManager sensorManager = (SensorManager) contextK.getSystemService("sensor");
        this.j = (sensorManager == null || sensorManager.getDefaultSensor(4) == null) ? false : true;
        if (x3.h()) {
            LocaleList locales = contextK.getResources().getConfiguration().getLocales();
            StringBuilder sb = new StringBuilder();
            for (int i2 = 0; i2 < locales.size(); i2++) {
                sb.append(locales.get(i2));
                sb.append(",");
            }
            if (sb.length() > 0 && sb.charAt(sb.length() - 1) == ',') {
                sb.deleteCharAt(sb.length() - 1);
            }
            this.k = sb.toString();
        }
        try {
            this.l = Environment.getDataDirectory().getTotalSpace();
        } catch (Throwable th) {
            kVar.L();
            if (t.a()) {
                kVar.L().a("DataProvider", "Unable to collect total disk space.", th);
            }
        }
        this.m = new b(this, aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void I() {
        F.set(this.c.a());
    }

    public long A() {
        return this.l;
    }

    protected Integer B() {
        return (Integer) F.get();
    }

    protected boolean C() {
        return (this.C.getResources().getConfiguration().keyboard == 2) && (this.C.getPackageManager().hasSystemFeature("com.google.android.play.feature.HPE_EXPERIENCE") || this.C.getPackageManager().hasSystemFeature("android.hardware.type.pc"));
    }

    protected boolean D() {
        try {
            if (!b()) {
                if (!c()) {
                    return false;
                }
            }
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public boolean E() {
        return this.j;
    }

    protected boolean F() {
        ConnectivityManager connectivityManager;
        if (!x3.h() || (connectivityManager = (ConnectivityManager) this.C.getSystemService("connectivity")) == null) {
            return false;
        }
        try {
            return connectivityManager.getRestrictBackgroundStatus() == 3;
        } catch (Throwable th) {
            this.B.L();
            if (t.a()) {
                this.B.L().a("DataProvider", "Unable to collect constrained network info.", th);
            }
            return false;
        }
    }

    public boolean G() {
        return this.n;
    }

    protected boolean H() {
        f fVar = this.q;
        if (fVar != null && !fVar.b()) {
            return ((Boolean) this.q.f952a).booleanValue();
        }
        f fVar2 = new f(this, Boolean.valueOf(zp.j()), this.y, null);
        this.q = fVar2;
        return ((Boolean) fVar2.f952a).booleanValue();
    }

    protected void J() {
        sm smVarL0 = this.B.l0();
        dm dmVar = new dm(this.B, new a());
        sm.b bVar = sm.b.OTHER;
        smVarL0.a((xl) dmVar, bVar);
        this.B.l0().a((xl) new kn(this.B, true, "setDeviceVolume", new Runnable() { // from class: com.applovin.impl.sdk.n$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.I();
            }
        }), bVar);
    }

    public d i() {
        return this.c;
    }

    public e j() {
        return this.d;
    }

    protected Float k() {
        f fVar = this.r;
        if (fVar != null && !fVar.b()) {
            Float f2 = (Float) this.r.f952a;
            f2.floatValue();
            return f2;
        }
        if (this.B.e0() == null) {
            return null;
        }
        f fVar2 = new f(this, Float.valueOf(this.B.e0().a()), this.v, null);
        this.r = fVar2;
        Float f3 = (Float) fVar2.f952a;
        f3.floatValue();
        return f3;
    }

    protected Float l() {
        f fVar = this.s;
        if (fVar != null && !fVar.b()) {
            Float f2 = (Float) this.s.f952a;
            f2.floatValue();
            return f2;
        }
        if (this.B.e0() == null) {
            return null;
        }
        f fVar2 = new f(this, Float.valueOf(this.B.e0().b()), this.v, null);
        this.s = fVar2;
        Float f3 = (Float) fVar2.f952a;
        f3.floatValue();
        return f3;
    }

    public g m() {
        return this.e;
    }

    protected float n() {
        try {
            return Settings.System.getFloat(this.C.getContentResolver(), "font_scale");
        } catch (Settings.SettingNotFoundException e2) {
            this.B.L();
            if (!t.a()) {
                return -1.0f;
            }
            this.B.L().a("DataProvider", "Error collecting font scale", e2);
            return -1.0f;
        }
    }

    protected Long o() {
        f fVar = this.p;
        if (fVar != null && !fVar.b()) {
            Long l = (Long) this.p.f952a;
            l.longValue();
            return l;
        }
        try {
            f fVar2 = new f(this, Long.valueOf(Environment.getDataDirectory().getFreeSpace()), this.y, null);
            this.p = fVar2;
            Long l2 = (Long) fVar2.f952a;
            l2.longValue();
            return l2;
        } catch (Throwable th) {
            this.B.L();
            if (!t.a()) {
                return null;
            }
            this.B.L().a("DataProvider", "Unable to collect free space.", th);
            return null;
        }
    }

    public String p() {
        return this.k;
    }

    public h q() {
        return this.f;
    }

    protected String r() {
        f fVar = this.t;
        if (fVar != null && !fVar.b()) {
            return (String) this.t.f952a;
        }
        f fVar2 = new f(this, c4.g(this.B), this.A, null);
        this.t = fVar2;
        return (String) fVar2.f952a;
    }

    public String s() {
        ActivityManager activityManager = (ActivityManager) this.C.getSystemService("activity");
        if (activityManager == null) {
            return null;
        }
        return activityManager.getDeviceConfigurationInfo().getGlEsVersion();
    }

    public String t() {
        return this.h;
    }

    public String u() {
        return this.g;
    }

    public i v() {
        return this.f946a;
    }

    protected Integer w() {
        f fVar = this.u;
        if (fVar != null && !fVar.b()) {
            Integer num = (Integer) this.u.f952a;
            num.intValue();
            return num;
        }
        try {
            f fVar2 = new f(this, Integer.valueOf((int) ((Settings.System.getInt(this.C.getContentResolver(), "screen_brightness") / 255.0f) * 100.0f)), this.w, null);
            this.u = fVar2;
            Integer num2 = (Integer) fVar2.f952a;
            num2.intValue();
            return num2;
        } catch (Settings.SettingNotFoundException e2) {
            this.B.L();
            if (!t.a()) {
                return null;
            }
            this.B.L().a("DataProvider", "Unable to collect screen brightness", e2);
            return null;
        }
    }

    protected JSONArray x() {
        if (x3.f()) {
            return CollectionUtils.toJSONArray(Build.SUPPORTED_ABIS);
        }
        JSONArray jSONArray = new JSONArray();
        JsonUtils.putStringIfValid(jSONArray, Build.CPU_ABI);
        JsonUtils.putStringIfValid(jSONArray, Build.CPU_ABI2);
        return jSONArray;
    }

    public j y() {
        return this.b;
    }

    public double z() {
        return this.i;
    }

    private boolean b() {
        String str = Build.TAGS;
        return str != null && str.contains(c("lz}$blpz"));
    }

    private boolean c() {
        String[] strArr = {"&zpz}ld&hyy&Z|yl{|zl{'hyb", "&zk`g&z|", "&zpz}ld&k`g&z|", "&zpz}ld&qk`g&z|", "&mh}h&efjhe&qk`g&z|", "&mh}h&efjhe&k`g&z|", "&zpz}ld&zm&qk`g&z|", "&zpz}ld&k`g&oh`ezhol&z|", "&mh}h&efjhe&z|"};
        for (int i2 = 0; i2 < 9; i2++) {
            if (new File(c(strArr[i2])).exists()) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01df  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected long e() {
        /*
            Method dump skipped, instructions count: 488
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.sdk.n.e():long");
    }

    protected l0.a f() {
        return (l0.a) D.get();
    }

    public b g() {
        return this.m;
    }

    public c h() {
        return (c) E.get();
    }

    public static void a(c cVar) {
        E.set(cVar);
    }

    private int b(String str) {
        try {
            return Settings.Secure.getInt(this.C.getContentResolver(), str);
        } catch (Throwable unused) {
            return -1;
        }
    }

    public static void a(l0.a aVar) {
        D.set(aVar);
    }

    private boolean a(String str) {
        return b(str) == 1;
    }

    private String c(String str) {
        int length = str.length();
        int[] iArr = {11, 12, 10, 3, 2, 1, 15, 10, 15, 14};
        char[] cArr = new char[length];
        for (int i2 = 0; i2 < length; i2++) {
            cArr[i2] = str.charAt(i2);
            for (int i3 = 9; i3 >= 0; i3--) {
                cArr[i2] = (char) (cArr[i2] ^ iArr[i3]);
            }
        }
        return new String(cArr);
    }

    public l0.a d() {
        List<String> testDeviceAdvertisingIds;
        l0.a aVarB = l0.b(this.C);
        if (aVarB == null) {
            return new l0.a();
        }
        if (((Boolean) this.B.a(oj.I3)).booleanValue()) {
            if (aVarB.c() && !((Boolean) this.B.a(oj.H3)).booleanValue()) {
                aVarB.a("");
            }
            D.set(aVarB);
        } else {
            aVarB = new l0.a();
        }
        if (this.B.C0().get()) {
            testDeviceAdvertisingIds = this.B.g0().getTestDeviceAdvertisingIds();
        } else {
            testDeviceAdvertisingIds = this.B.I() != null ? this.B.I().getTestDeviceAdvertisingIds() : null;
        }
        if (testDeviceAdvertisingIds != null) {
            String strA = aVarB.a();
            if (StringUtils.isValidString(strA)) {
                this.n = testDeviceAdvertisingIds.contains(strA);
            }
            c cVarH = h();
            String strA2 = cVarH != null ? cVarH.a() : null;
            if (StringUtils.isValidString(strA2)) {
                this.n = testDeviceAdvertisingIds.contains(strA2) | this.n;
            }
        } else {
            this.n = false;
        }
        return aVarB;
    }
}
