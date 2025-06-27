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
import android.os.Build;
import android.os.Environment;
import android.os.LocaleList;
import android.os.PowerManager;
import android.os.SystemClock;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.Base64;
import android.util.DisplayMetrics;
import com.applovin.impl.aa;
import com.applovin.impl.b4;
import com.applovin.impl.ba;
import com.applovin.impl.bc;
import com.applovin.impl.c4;
import com.applovin.impl.dm;
import com.applovin.impl.kn;
import com.applovin.impl.l0;
import com.applovin.impl.oj;
import com.applovin.impl.qi;
import com.applovin.impl.qj;
import com.applovin.impl.sdk.array.ArrayService;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sm;
import com.applovin.impl.th;
import com.applovin.impl.tr;
import com.applovin.impl.x3;
import com.applovin.impl.xl;
import com.applovin.impl.xp;
import com.applovin.impl.y3;
import com.applovin.impl.zp;
import com.applovin.sdk.AppLovinBidTokenCollectionListener;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkUtils;
import com.applovin.sdk.AppLovinWebViewActivity;
import com.json.i5;
import com.json.t2;
import java.io.File;
import java.nio.charset.Charset;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class l {
    private static final AtomicReference i = new AtomicReference();
    private static final AtomicReference j = new AtomicReference();

    /* renamed from: a, reason: collision with root package name */
    private final k f941a;
    private final t b;
    private final Context c;
    private final Map d;
    private final Map f;
    private boolean g;
    private final Object e = new Object();
    private final AtomicReference h = new AtomicReference();

    class a implements dm.a {
        a() {
        }

        @Override // com.applovin.impl.dm.a
        public void a(l0.a aVar) {
            l.i.set(aVar);
        }
    }

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public final String f943a;
        public final int b;

        public b(String str, int i) {
            this.f943a = str;
            this.b = i;
        }
    }

    public static class c {

        /* renamed from: a, reason: collision with root package name */
        public int f944a = -1;
        public int b = -1;
        public Boolean c = null;
    }

    protected l(k kVar) {
        if (kVar == null) {
            throw new IllegalArgumentException("No sdk specified");
        }
        this.f941a = kVar;
        this.b = kVar.L();
        this.c = k.k();
        this.d = y();
        this.f = x();
    }

    private Map E() {
        return zp.a(a(null, true, false));
    }

    private JSONArray H() {
        if (x3.f()) {
            return CollectionUtils.toJSONArray(Build.SUPPORTED_ABIS);
        }
        JSONArray jSONArray = new JSONArray();
        JsonUtils.putStringIfValid(jSONArray, Build.CPU_ABI);
        JsonUtils.putStringIfValid(jSONArray, Build.CPU_ABI2);
        return jSONArray;
    }

    private boolean I() {
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

    private boolean J() {
        ConnectivityManager connectivityManager;
        if (x3.h() && (connectivityManager = (ConnectivityManager) this.c.getSystemService("connectivity")) != null) {
            try {
                return connectivityManager.getRestrictBackgroundStatus() == 3;
            } catch (Throwable th) {
                this.f941a.L();
                if (t.a()) {
                    this.f941a.L().a("DataCollector", "Unable to collect constrained network info.", th);
                }
            }
        }
        return false;
    }

    private Boolean K() {
        if (x3.i()) {
            return Boolean.valueOf(this.c.getResources().getConfiguration().isScreenHdr());
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void M() {
        this.h.set(n());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(AppLovinBidTokenCollectionListener appLovinBidTokenCollectionListener) {
        try {
            String strC = C();
            if (StringUtils.isValidString(strC)) {
                this.f941a.L();
                if (t.a()) {
                    this.f941a.L().a("DataCollector", "Successfully retrieved bid token");
                }
                bc.a(appLovinBidTokenCollectionListener, strC);
                return;
            }
            this.f941a.L();
            if (t.a()) {
                this.f941a.L().b("DataCollector", "Empty bid token");
            }
            bc.b(appLovinBidTokenCollectionListener, "Empty bid token");
        } catch (Throwable th) {
            if (t.a()) {
                this.b.a("DataCollector", "Failed to collect bid token", th);
            }
            this.f941a.B().a("DataCollector", "collectBidToken", th);
            bc.b(appLovinBidTokenCollectionListener, "Failed to collect bid token");
        }
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
    private long d() {
        /*
            Method dump skipped, instructions count: 488
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.sdk.l.d():long");
    }

    private c h() {
        c cVar = new c();
        Intent intentRegisterReceiver = this.c.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        int intExtra = intentRegisterReceiver != null ? intentRegisterReceiver.getIntExtra("level", -1) : -1;
        int intExtra2 = intentRegisterReceiver != null ? intentRegisterReceiver.getIntExtra("scale", -1) : -1;
        if (intExtra <= 0 || intExtra2 <= 0) {
            cVar.b = -1;
        } else {
            cVar.b = (int) ((intExtra / intExtra2) * 100.0f);
        }
        cVar.f944a = intentRegisterReceiver != null ? intentRegisterReceiver.getIntExtra("status", -1) : -1;
        if (x3.d()) {
            cVar.c = Boolean.valueOf(Settings.Global.getInt(this.c.getContentResolver(), "stay_on_while_plugged_in", -1) > 0);
        } else {
            cVar.c = Boolean.valueOf(((intentRegisterReceiver.getIntExtra("plugged", -1) & 1) | 14) > 0);
        }
        return cVar;
    }

    private String i() {
        TelephonyManager telephonyManager = (TelephonyManager) this.c.getSystemService("phone");
        if (telephonyManager == null) {
            return "";
        }
        try {
            return telephonyManager.getNetworkOperatorName();
        } catch (Throwable th) {
            if (!t.a()) {
                return "";
            }
            this.b.a("DataCollector", "Unable to collect carrier", th);
            return "";
        }
    }

    private String k() {
        TelephonyManager telephonyManager = (TelephonyManager) this.c.getSystemService("phone");
        return telephonyManager != null ? telephonyManager.getSimCountryIso().toUpperCase(Locale.ENGLISH) : "";
    }

    private String m() {
        if (!x3.h()) {
            return null;
        }
        try {
            StringBuilder sb = new StringBuilder();
            LocaleList locales = this.c.getResources().getConfiguration().getLocales();
            for (int i2 = 0; i2 < locales.size(); i2++) {
                sb.append(locales.get(i2));
                sb.append(",");
            }
            if (sb.length() > 0 && sb.charAt(sb.length() - 1) == ',') {
                sb.deleteCharAt(sb.length() - 1);
            }
            return sb.toString();
        } catch (Throwable unused) {
            return null;
        }
    }

    private Integer n() {
        if (((AudioManager) this.c.getSystemService("audio")) == null) {
            return null;
        }
        try {
            return Integer.valueOf((int) (r0.getStreamVolume(3) * ((Float) this.f941a.a(oj.i4)).floatValue()));
        } catch (Throwable th) {
            this.f941a.L();
            if (t.a()) {
                this.f941a.L().a("DataCollector", "Unable to collect device volume", th);
            }
            return null;
        }
    }

    private float o() {
        try {
            return Settings.System.getFloat(this.c.getContentResolver(), "font_scale");
        } catch (Settings.SettingNotFoundException e) {
            if (!t.a()) {
                return -1.0f;
            }
            this.b.a("DataCollector", "Error collecting font scale", e);
            return -1.0f;
        }
    }

    private boolean p() {
        SensorManager sensorManager = (SensorManager) this.c.getSystemService("sensor");
        return (sensorManager == null || sensorManager.getDefaultSensor(4) == null) ? false : true;
    }

    private Map q() {
        HashMap map = new HashMap();
        CollectionUtils.putIntegerIfValid("IABTCF_gdprApplies", this.f941a.m0().g(), map);
        CollectionUtils.putStringIfValid("IABTCF_TCString", this.f941a.m0().k(), map);
        CollectionUtils.putStringIfValid("IABTCF_AddtlConsent", this.f941a.m0().c(), map);
        return map;
    }

    private Boolean r() {
        AudioManager audioManager = (AudioManager) this.c.getSystemService("audio");
        if (audioManager == null) {
            return null;
        }
        return Boolean.valueOf(audioManager.isMusicActive());
    }

    private Boolean s() {
        AudioManager audioManager = (AudioManager) this.c.getSystemService("audio");
        if (audioManager == null) {
            return null;
        }
        return Boolean.valueOf(audioManager.isSpeakerphoneOn());
    }

    private String t() {
        TelephonyManager telephonyManager = (TelephonyManager) this.c.getSystemService("phone");
        if (telephonyManager == null) {
            return "";
        }
        try {
            String networkOperator = telephonyManager.getNetworkOperator();
            return networkOperator.substring(0, Math.min(3, networkOperator.length()));
        } catch (Throwable th) {
            if (!t.a()) {
                return "";
            }
            this.b.a("DataCollector", "Unable to collect mobile country code", th);
            return "";
        }
    }

    private String u() {
        TelephonyManager telephonyManager = (TelephonyManager) this.c.getSystemService("phone");
        if (telephonyManager == null) {
            return "";
        }
        try {
            String networkOperator = telephonyManager.getNetworkOperator();
            return networkOperator.substring(Math.min(3, networkOperator.length()));
        } catch (Throwable th) {
            if (!t.a()) {
                return "";
            }
            this.b.a("DataCollector", "Unable to collect mobile network code", th);
            return "";
        }
    }

    private String w() {
        AudioManager audioManager = (AudioManager) this.c.getSystemService("audio");
        if (audioManager == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        if (x3.g()) {
            for (AudioDeviceInfo audioDeviceInfo : audioManager.getDevices(2)) {
                sb.append(audioDeviceInfo.getType());
                sb.append(",");
            }
        } else {
            if (audioManager.isWiredHeadsetOn()) {
                sb.append(3);
                sb.append(",");
            }
            if (audioManager.isBluetoothScoOn()) {
                sb.append(7);
                sb.append(",");
            }
            if (audioManager.isBluetoothA2dpOn()) {
                sb.append(8);
            }
        }
        if (sb.length() > 0 && sb.charAt(sb.length() - 1) == ',') {
            sb.deleteCharAt(sb.length() - 1);
        }
        String string = sb.toString();
        if (TextUtils.isEmpty(string) && t.a()) {
            this.b.a("DataCollector", "No sound outputs detected");
        }
        return string;
    }

    private Map x() {
        PackageInfo packageInfo;
        HashMap map = new HashMap();
        PackageManager packageManager = this.c.getPackageManager();
        ApplicationInfo applicationInfo = this.c.getApplicationInfo();
        long jLastModified = new File(applicationInfo.sourceDir).lastModified();
        String installerPackageName = null;
        try {
            packageInfo = packageManager.getPackageInfo(this.c.getPackageName(), 0);
            try {
                installerPackageName = packageManager.getInstallerPackageName(applicationInfo.packageName);
            } catch (Throwable unused) {
            }
        } catch (Throwable unused2) {
            packageInfo = null;
        }
        map.put("app_name", packageManager.getApplicationLabel(applicationInfo));
        map.put("app_version", packageInfo != null ? packageInfo.versionName : "");
        map.put("app_version_code", Integer.valueOf(packageInfo != null ? packageInfo.versionCode : -1));
        map.put("package_name", applicationInfo.packageName);
        map.put("vz", StringUtils.toShortSHA1Hash(applicationInfo.packageName));
        if (installerPackageName == null) {
            installerPackageName = "";
        }
        map.put("installer_name", installerPackageName);
        map.put("tg", xp.a(this.f941a));
        map.put("debug", Boolean.valueOf(zp.c(this.f941a)));
        map.put("ia", Long.valueOf(jLastModified));
        map.put("alts_ms", Long.valueOf(k.j()));
        map.put("j8", Boolean.valueOf(k.B0()));
        map.put("ps_tpg", Boolean.valueOf(th.d(this.c)));
        map.put("ps_apg", Boolean.valueOf(th.b(this.c)));
        map.put("ps_capg", Boolean.valueOf(th.c(this.c)));
        map.put("ps_aipg", Boolean.valueOf(th.a(this.c)));
        k kVar = this.f941a;
        qj qjVar = qj.f;
        Long l = (Long) kVar.a(qjVar);
        if (l != null) {
            map.put("ia_v2", l);
        } else {
            this.f941a.b(qjVar, Long.valueOf(jLastModified));
        }
        map.put("sdk_version", AppLovinSdk.VERSION);
        map.put("omid_sdk_version", this.f941a.Y().c());
        CollectionUtils.putStringIfValid("ad_review_sdk_version", com.applovin.impl.v.b(), map);
        map.put("api_did", this.f941a.a(oj.g));
        map.put("first_install_v3_ms", packageInfo != null ? Long.valueOf(packageInfo.firstInstallTime) : "");
        map.put("target_sdk", Integer.valueOf(applicationInfo.targetSdkVersion));
        map.put("epv", Integer.valueOf(zp.f()));
        return map;
    }

    private Map y() {
        HashMap map = new HashMap(34);
        map.put("api_level", Integer.valueOf(Build.VERSION.SDK_INT));
        map.put("brand", Build.MANUFACTURER);
        map.put("brand_name", Build.BRAND);
        map.put("hardware", Build.HARDWARE);
        map.put("sim", Boolean.valueOf(AppLovinSdkUtils.isEmulator()));
        map.put("aida", Boolean.valueOf(l0.a()));
        map.put("locale", Locale.getDefault().toString());
        map.put(i5.u, Build.MODEL);
        map.put(i5.x, Build.VERSION.RELEASE);
        map.put("platform", v());
        map.put("revision", Build.DEVICE);
        map.put("tz_offset", Double.valueOf(z()));
        map.put("gy", Boolean.valueOf(p()));
        map.put("country_code", k());
        map.put("mcc", t());
        map.put("mnc", u());
        map.put(i5.s0, i());
        map.put("is_tablet", Boolean.valueOf(AppLovinSdkUtils.isTablet(this.c)));
        map.put("tv", Boolean.valueOf(AppLovinSdkUtils.isTv(this.c)));
        map.put("pc", Integer.valueOf(Runtime.getRuntime().availableProcessors()));
        map.put("hdr", K());
        map.put("supported_abis", H());
        DisplayMetrics displayMetrics = this.c.getResources().getDisplayMetrics();
        if (displayMetrics != null) {
            map.put("adns", Float.valueOf(displayMetrics.density));
            map.put("adnsd", Integer.valueOf(displayMetrics.densityDpi));
            map.put("xdpi", Float.valueOf(displayMetrics.xdpi));
            map.put("ydpi", Float.valueOf(displayMetrics.ydpi));
            Point pointB = x3.b(this.c);
            map.put("screen_size_in", Double.valueOf(Math.sqrt(Math.pow(pointB.x, 2.0d) + Math.pow(pointB.y, 2.0d)) / displayMetrics.xdpi));
            x3.a aVarA = x3.a(this.c, this.f941a);
            if (aVarA != null) {
                map.put("tl_cr", Integer.valueOf(aVarA.c()));
                map.put("tr_cr", Integer.valueOf(aVarA.d()));
                map.put("bl_cr", Integer.valueOf(aVarA.a()));
                map.put("br_cr", Integer.valueOf(aVarA.b()));
            }
        }
        map.put("bt_ms", Long.valueOf(System.currentTimeMillis() - SystemClock.elapsedRealtime()));
        map.put("tbalsi_ms", Long.valueOf(this.f941a.J() - k.j()));
        CollectionUtils.putBooleanIfValid("psase", Boolean.valueOf(th.e(this.c)), map);
        CollectionUtils.putStringIfValid("process_name", zp.b(this.c), map);
        CollectionUtils.putBooleanIfValid("is_main_process", zp.g(this.c), map);
        try {
            PackageInfo packageInfo = this.c.getPackageManager().getPackageInfo("com.android.vending", 0);
            map.put("ps_version", packageInfo.versionName);
            map.put("ps_version_code", Integer.valueOf(packageInfo.versionCode));
        } catch (Throwable unused) {
            map.put("ps_version", "");
            map.put("ps_version_code", -1);
        }
        a(map);
        return map;
    }

    private double z() {
        return Math.round((TimeZone.getDefault().getOffset(new Date().getTime()) * 10.0d) / 3600000.0d) / 10.0d;
    }

    public Map A() {
        Map map = CollectionUtils.map(this.f);
        map.put("first_install", Boolean.valueOf(this.f941a.z0()));
        map.put("first_install_v2", Boolean.valueOf(!this.f941a.w0()));
        map.put("test_ads", Boolean.valueOf(this.g));
        map.put("muted", Boolean.valueOf(this.f941a.g0().isMuted()));
        if (((Boolean) this.f941a.a(oj.K3)).booleanValue()) {
            CollectionUtils.putStringIfValid("cuid", this.f941a.t0().c(), map);
        }
        if (((Boolean) this.f941a.a(oj.N3)).booleanValue()) {
            map.put("compass_random_token", this.f941a.p());
        }
        if (((Boolean) this.f941a.a(oj.P3)).booleanValue()) {
            map.put("applovin_random_token", this.f941a.c0());
        }
        if (this.f941a.r0() != null) {
            String name = this.f941a.r0().getName();
            if (StringUtils.isValidString(name)) {
                map.put("user_segment_name", name);
            }
        }
        map.putAll(q());
        if (this.f941a.b0() != null) {
            CollectionUtils.putJsonArrayIfValid("ps_topics", this.f941a.b0().a(), map);
        }
        return map;
    }

    public b B() {
        return (b) j.get();
    }

    protected String C() {
        String strEncodeToString = Base64.encodeToString(new JSONObject(E()).toString().getBytes(Charset.defaultCharset()), 2);
        return ((Boolean) this.f941a.a(oj.l5)).booleanValue() ? qi.b(strEncodeToString, zp.a(this.f941a), qi.a.a(((Integer) this.f941a.a(oj.m5)).intValue()), this.f941a.d0(), this.f941a) : strEncodeToString;
    }

    public String D() {
        ActivityManager activityManager = (ActivityManager) this.c.getSystemService("activity");
        if (activityManager == null) {
            return null;
        }
        return activityManager.getDeviceConfigurationInfo().getGlEsVersion();
    }

    public Map F() {
        return CollectionUtils.map(this.f);
    }

    public Map G() {
        return CollectionUtils.map(this.d);
    }

    public boolean L() {
        return this.g;
    }

    public Map N() {
        if (!this.f941a.g0().isLocationCollectionEnabled() || !((Boolean) this.f941a.a(oj.I4)).booleanValue()) {
            return null;
        }
        HashMap map = new HashMap();
        s sVarK = this.f941a.K();
        boolean zE = sVarK.e();
        map.put("loc_services_enabled", Boolean.valueOf(zE));
        if (!zE) {
            return map;
        }
        map.put("loc_auth", Boolean.valueOf(sVarK.c()));
        if (sVarK.d()) {
            double dA = sVarK.a();
            k kVar = this.f941a;
            oj ojVar = oj.K4;
            map.put("loc_lat", zp.a(dA, ((Integer) kVar.a(ojVar)).intValue()));
            map.put("loc_long", zp.a(sVarK.b(), ((Integer) this.f941a.a(ojVar)).intValue()));
        }
        return map;
    }

    public void O() {
        sm smVarL0 = this.f941a.l0();
        dm dmVar = new dm(this.f941a, new a());
        sm.b bVar = sm.b.OTHER;
        smVarL0.a((xl) dmVar, bVar);
        this.f941a.l0().a((xl) new kn(this.f941a, true, "setDeviceVolume", new Runnable() { // from class: com.applovin.impl.sdk.l$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.M();
            }
        }), bVar);
    }

    public void P() {
        synchronized (this.e) {
            a(this.d);
        }
    }

    public Map e() {
        HashMap map = new HashMap();
        map.put("sc", this.f941a.a(oj.q));
        map.put("sc2", this.f941a.a(oj.r));
        map.put("sc3", this.f941a.a(oj.s));
        map.put("server_installed_at", this.f941a.a(oj.t));
        CollectionUtils.putStringIfValid("persisted_data", (String) this.f941a.a(qj.H), map);
        return map;
    }

    public Map j() {
        b4.d dVarA = this.f941a.r().a();
        if (dVarA == null) {
            return null;
        }
        HashMap map = new HashMap(4);
        map.put("lrm_ts_ms", String.valueOf(dVarA.c()));
        map.put("lrm_url", dVarA.d());
        map.put("lrm_ct_ms", String.valueOf(dVarA.a()));
        map.put("lrm_rs", String.valueOf(dVarA.b()));
        return map;
    }

    public Map l() {
        return a(false);
    }

    public String v() {
        return AppLovinSdkUtils.isFireOS(this.c) ? "fireos" : "android";
    }

    private String g() {
        int orientation = AppLovinSdkUtils.getOrientation(this.c);
        return orientation == 1 ? t2.h.D : orientation == 2 ? t2.h.C : "none";
    }

    protected void a(final AppLovinBidTokenCollectionListener appLovinBidTokenCollectionListener) {
        this.f941a.l0().a((xl) new kn(this.f941a, ((Boolean) this.f941a.a(oj.V3)).booleanValue(), "DataCollector", new Runnable() { // from class: com.applovin.impl.sdk.l$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.b(appLovinBidTokenCollectionListener);
            }
        }), sm.b.CORE);
    }

    public Map a(Map map, boolean z, boolean z2) {
        HashMap map2 = new HashMap(64);
        Map mapA = a(z);
        Map mapA2 = A();
        Map mapJ = j();
        Map mapN = N();
        Map mapK0 = this.f941a.k0();
        if (z2) {
            map2.put("device_info", mapA);
            map2.put("app_info", mapA2);
            if (mapJ != null) {
                map2.put("connection_info", mapJ);
            }
            if (map != null) {
                map2.put("ad_info", map);
            }
            if (mapN != null) {
                map2.put("location_info", mapN);
            }
            if (mapK0 != null && !mapK0.isEmpty()) {
                map2.put("targeting_data", mapK0);
            }
        } else {
            map2.putAll(mapA);
            map2.putAll(mapA2);
            if (mapJ != null) {
                map2.putAll(mapJ);
            }
            if (map != null) {
                map2.putAll(map);
            }
            if (mapN != null) {
                map2.putAll(mapN);
            }
            if (mapK0 != null && !mapK0.isEmpty()) {
                map2.putAll(mapK0);
            }
        }
        map2.put("accept", "custom_size,launch_app,video");
        map2.put("format", "json");
        CollectionUtils.putStringIfValid("mediation_provider", this.f941a.Q(), map2);
        CollectionUtils.putStringIfValid("mediation_provider_v2", this.f941a.A(), map2);
        CollectionUtils.putStringIfValid("plugin_version", (String) this.f941a.a(oj.U3), map2);
        CollectionUtils.putLongIfValid("tssf_ms", Long.valueOf(this.f941a.o0()), map2);
        if (!((Boolean) this.f941a.a(oj.j5)).booleanValue()) {
            map2.put(AppLovinWebViewActivity.INTENT_EXTRA_KEY_SDK_KEY, this.f941a.d0());
        }
        map2.putAll(e());
        if (((Boolean) this.f941a.a(oj.L4)).booleanValue()) {
            ba baVarF = this.f941a.F();
            map2.put("li", Long.valueOf(baVarF.b(aa.e)));
            map2.put("si", Long.valueOf(baVarF.b(aa.h)));
            map2.put("mad", Long.valueOf(baVarF.b(aa.f)));
            map2.put("msad", Long.valueOf(baVarF.b(aa.i)));
            map2.put("pf", Long.valueOf(baVarF.b(aa.m)));
            map2.put("mpf", Long.valueOf(baVarF.b(aa.t)));
            map2.put("gpf", Long.valueOf(baVarF.b(aa.n)));
            map2.put("asoac", Long.valueOf(baVarF.b(aa.r)));
        }
        map2.put("rid", UUID.randomUUID().toString());
        return map2;
    }

    private int b(String str) {
        try {
            return Settings.Secure.getInt(this.c.getContentResolver(), str);
        } catch (Throwable unused) {
            return -1;
        }
    }

    private boolean b() {
        String str = Build.TAGS;
        return str != null && str.contains(c("lz}$blpz"));
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

    public Map a(boolean z) {
        Map map;
        synchronized (this.e) {
            map = CollectionUtils.map(this.d);
        }
        return a(map, z);
    }

    private void a(Map map) {
        if (((Boolean) this.f941a.a(oj.c4)).booleanValue() && !map.containsKey("af")) {
            map.put("af", Long.valueOf(d()));
        }
        if (((Boolean) this.f941a.a(oj.d4)).booleanValue() && !map.containsKey("font")) {
            map.put("font", Float.valueOf(o()));
        }
        if (((Boolean) this.f941a.a(oj.k4)).booleanValue() && zp.d(this.f941a)) {
            tr.a(this.f941a);
        }
        if (((Boolean) this.f941a.a(oj.x4)).booleanValue()) {
            tr.b(this.f941a);
        }
        if (((Boolean) this.f941a.a(oj.j4)).booleanValue() && !map.containsKey("sua")) {
            map.put("sua", System.getProperty("http.agent"));
        }
        if (((Boolean) this.f941a.a(oj.f4)).booleanValue() && !map.containsKey("network_restricted")) {
            map.put("network_restricted", Boolean.valueOf(J()));
        }
        if (((Boolean) this.f941a.a(oj.n4)).booleanValue()) {
            boolean z = true;
            boolean z2 = this.c.getResources().getConfiguration().keyboard == 2;
            boolean zHasSystemFeature = this.c.getPackageManager().hasSystemFeature("com.google.android.play.feature.HPE_EXPERIENCE");
            boolean zHasSystemFeature2 = this.c.getPackageManager().hasSystemFeature("android.hardware.type.pc");
            if (!z2 || (!zHasSystemFeature && !zHasSystemFeature2)) {
                z = false;
            }
            map.put("is_pc", Boolean.valueOf(z));
        }
        if (((Boolean) this.f941a.a(oj.z4)).booleanValue()) {
            CollectionUtils.putStringIfValid("oglv", D(), map);
        }
    }

    private Map a(Map map, boolean z) {
        l0.a aVarF;
        PowerManager powerManager;
        Map map2 = CollectionUtils.map(map);
        Point pointB = x3.b(this.c);
        map2.put("dx", Integer.valueOf(pointB.x));
        map2.put("dy", Integer.valueOf(pointB.y));
        if (z) {
            aVarF = (l0.a) i.get();
            if (aVarF != null) {
                O();
            } else if (zp.h()) {
                aVarF = new l0.a();
                map2.put("inc", Boolean.TRUE);
            } else {
                aVarF = f();
            }
        } else {
            aVarF = f();
        }
        String strA = aVarF.a();
        if (StringUtils.isValidString(strA)) {
            map2.put("idfa", strA);
        }
        map2.put("dnt", Boolean.valueOf(aVarF.c()));
        map2.put("dnt_code", aVarF.b().b());
        b bVar = (b) j.get();
        if (((Boolean) this.f941a.a(oj.J3)).booleanValue() && bVar != null) {
            map2.put("idfv", bVar.f943a);
            map2.put("idfv_scope", Integer.valueOf(bVar.b));
        }
        Boolean boolB = y3.b().b(this.c);
        if (boolB != null) {
            map2.put("huc", boolB);
        }
        Boolean boolB2 = y3.c().b(this.c);
        if (boolB2 != null) {
            map2.put("aru", boolB2);
        }
        Boolean boolB3 = y3.a().b(this.c);
        if (boolB3 != null) {
            map2.put("dns", boolB3);
        }
        if (((Boolean) this.f941a.a(oj.W3)).booleanValue()) {
            c cVarH = h();
            CollectionUtils.putIntegerIfValid("act", Integer.valueOf(cVarH.f944a), map2);
            CollectionUtils.putIntegerIfValid("acm", Integer.valueOf(cVarH.b), map2);
            CollectionUtils.putBooleanIfValid("sowpie", cVarH.c, map2);
        }
        if (((Boolean) this.f941a.a(oj.e4)).booleanValue()) {
            map2.put("mtl", Integer.valueOf(this.f941a.f0().getLastTrimMemoryLevel()));
        }
        if (((Boolean) this.f941a.a(oj.h4)).booleanValue()) {
            map2.put("adr", Boolean.valueOf(I()));
        }
        Integer numN = z ? (Integer) this.h.get() : n();
        if (numN != null) {
            map2.put("volume", numN);
        }
        CollectionUtils.putBooleanIfValid("ma", r(), map2);
        CollectionUtils.putBooleanIfValid("spo", s(), map2);
        CollectionUtils.putBooleanIfValid("aif", Boolean.valueOf(!this.f941a.f0().isApplicationPaused()), map2);
        CollectionUtils.putLongIfValid("af_ts_ms", Long.valueOf(this.f941a.f0().getAppEnteredForegroundTimeMillis()), map2);
        CollectionUtils.putLongIfValid("ab_ts_ms", Long.valueOf(this.f941a.f0().getAppEnteredBackgroundTimeMillis()), map2);
        try {
            map2.put("sb", Integer.valueOf((int) ((Settings.System.getInt(this.c.getContentResolver(), "screen_brightness") / 255.0f) * 100.0f)));
        } catch (Settings.SettingNotFoundException e) {
            if (t.a()) {
                this.b.a("DataCollector", "Unable to collect screen brightness", e);
            }
        }
        if (((Boolean) this.f941a.a(oj.k4)).booleanValue() && zp.d(this.f941a)) {
            tr.a(this.f941a);
            String strA2 = tr.a();
            if (StringUtils.isValidString(strA2)) {
                map2.put(i5.R, strA2);
            }
        }
        if (((Boolean) this.f941a.a(oj.x4)).booleanValue()) {
            tr.b(this.f941a);
            CollectionUtils.putIntegerIfValid("wvvc", Integer.valueOf(tr.d()), map2);
            CollectionUtils.putStringIfValid("wvv", tr.c(), map2);
            CollectionUtils.putStringIfValid("wvpn", tr.b(), map2);
        }
        if (((Boolean) this.f941a.a(oj.Y3)).booleanValue()) {
            try {
                map2.put(i5.v0, Long.valueOf(Environment.getDataDirectory().getFreeSpace()));
                map2.put("tds", Long.valueOf(Environment.getDataDirectory().getTotalSpace()));
            } catch (Throwable th) {
                map2.put(i5.v0, -1);
                map2.put("tds", -1);
                if (t.a()) {
                    this.b.a("DataCollector", "Unable to collect total & free space.", th);
                }
            }
        }
        if (((Boolean) this.f941a.a(oj.Z3)).booleanValue()) {
            ActivityManager.MemoryInfo memoryInfoA = zp.a((ActivityManager) this.c.getSystemService("activity"));
            if (memoryInfoA != null) {
                map2.put("fm", Long.valueOf(memoryInfoA.availMem));
                map2.put("tm", Long.valueOf(memoryInfoA.totalMem));
                map2.put("lmt", Long.valueOf(memoryInfoA.threshold));
                map2.put("lm", Boolean.valueOf(memoryInfoA.lowMemory));
            } else {
                map2.put("fm", -1);
                map2.put("tm", -1);
                map2.put("lmt", -1);
            }
        }
        if (((Boolean) this.f941a.a(oj.a4)).booleanValue() && x3.a("android.permission.READ_PHONE_STATE", this.c) && x3.h()) {
            map2.put("rat", Integer.valueOf(((TelephonyManager) this.c.getSystemService("phone")).getDataNetworkType()));
        }
        if (((Boolean) this.f941a.a(oj.X3)).booleanValue()) {
            String strW = w();
            if (!TextUtils.isEmpty(strW)) {
                map2.put("so", strW);
            }
        }
        map2.put("orientation_lock", g());
        if (((Boolean) this.f941a.a(oj.b4)).booleanValue()) {
            map2.put("vs", Boolean.valueOf(zp.j()));
        }
        if (x3.f() && (powerManager = (PowerManager) this.c.getSystemService("power")) != null) {
            map2.put("lpm", Integer.valueOf(powerManager.isPowerSaveMode() ? 1 : 0));
        }
        if (((Boolean) this.f941a.a(oj.l4)).booleanValue() && this.f941a.e0() != null) {
            map2.put("da", Float.valueOf(this.f941a.e0().a()));
        }
        if (((Boolean) this.f941a.a(oj.m4)).booleanValue() && this.f941a.e0() != null) {
            map2.put("dm", Float.valueOf(this.f941a.e0().b()));
        }
        map2.put("mute_switch", Integer.valueOf(this.f941a.m().a()));
        map2.put("network", c4.g(this.f941a));
        String strM = m();
        if (StringUtils.isValidString(strM)) {
            map2.put("kb", strM);
        }
        ArrayService arrayServiceL = this.f941a.l();
        if (arrayServiceL.isAppHubInstalled()) {
            if (arrayServiceL.getIsDirectDownloadEnabled() != null) {
                map2.put("ah_dd_enabled", arrayServiceL.getIsDirectDownloadEnabled());
            }
            map2.put("ah_sdk_version_code", Long.valueOf(arrayServiceL.getAppHubVersionCode()));
            map2.put("ah_random_user_token", StringUtils.emptyIfNull(arrayServiceL.getRandomUserToken()));
            map2.put("ah_sdk_package_name", StringUtils.emptyIfNull(arrayServiceL.getAppHubPackageName()));
        }
        return map2;
    }

    public static void a(l0.a aVar) {
        i.set(aVar);
    }

    public static void a(b bVar) {
        j.set(bVar);
    }

    private boolean a(String str) {
        return b(str) == 1;
    }

    public l0.a f() {
        List<String> testDeviceAdvertisingIds;
        l0.a aVarB = l0.b(this.c);
        if (aVarB == null) {
            return new l0.a();
        }
        if (((Boolean) this.f941a.a(oj.I3)).booleanValue()) {
            if (aVarB.c() && !((Boolean) this.f941a.a(oj.H3)).booleanValue()) {
                aVarB.a("");
            }
            i.set(aVarB);
        } else {
            aVarB = new l0.a();
        }
        if (this.f941a.C0().get()) {
            testDeviceAdvertisingIds = this.f941a.g0().getTestDeviceAdvertisingIds();
        } else {
            testDeviceAdvertisingIds = this.f941a.I() != null ? this.f941a.I().getTestDeviceAdvertisingIds() : null;
        }
        if (testDeviceAdvertisingIds != null) {
            String strA = aVarB.a();
            if (StringUtils.isValidString(strA)) {
                this.g = testDeviceAdvertisingIds.contains(strA);
            }
            b bVarB = B();
            String str = bVarB != null ? bVarB.f943a : null;
            if (StringUtils.isValidString(str)) {
                this.g = testDeviceAdvertisingIds.contains(str) | this.g;
            }
        } else {
            this.g = false;
        }
        return aVarB;
    }
}
