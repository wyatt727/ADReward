package com.applovin.impl.sdk;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
import android.os.SystemClock;
import android.util.Base64;
import com.applovin.impl.aa;
import com.applovin.impl.b4;
import com.applovin.impl.ba;
import com.applovin.impl.bc;
import com.applovin.impl.kn;
import com.applovin.impl.l0;
import com.applovin.impl.oj;
import com.applovin.impl.qi;
import com.applovin.impl.qj;
import com.applovin.impl.sdk.array.ArrayService;
import com.applovin.impl.sdk.n;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sm;
import com.applovin.impl.th;
import com.applovin.impl.tr;
import com.applovin.impl.xl;
import com.applovin.impl.xp;
import com.applovin.impl.y3;
import com.applovin.impl.zp;
import com.applovin.sdk.AppLovinBidTokenCollectionListener;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkUtils;
import com.applovin.sdk.AppLovinWebViewActivity;
import com.json.i5;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class m {

    /* renamed from: a, reason: collision with root package name */
    private final k f945a;
    private final n c;
    private final Object e = new Object();
    private final Object g = new Object();
    private final Context b = k.k();
    private final Map d = g();
    private final Map f = f();

    protected m(k kVar) {
        this.f945a = kVar;
        this.c = kVar.z();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(AppLovinBidTokenCollectionListener appLovinBidTokenCollectionListener) {
        try {
            String strH = h();
            if (StringUtils.isValidString(strH)) {
                this.f945a.L();
                if (t.a()) {
                    this.f945a.L().a("DataCollectorV2", "Successfully retrieved bid token");
                }
                bc.a(appLovinBidTokenCollectionListener, strH);
                return;
            }
            this.f945a.L();
            if (t.a()) {
                this.f945a.L().b("DataCollectorV2", "Empty bid token");
            }
            bc.b(appLovinBidTokenCollectionListener, "Empty bid token");
        } catch (Throwable th) {
            this.f945a.L();
            if (t.a()) {
                this.f945a.L().a("DataCollectorV2", "Failed to collect bid token", th);
            }
            this.f945a.B().a("DataCollectorV2", "collectBidToken", th);
            bc.b(appLovinBidTokenCollectionListener, "Failed to collect bid token");
        }
    }

    private Map e() {
        if (!this.f945a.g0().isLocationCollectionEnabled() || !((Boolean) this.f945a.a(oj.I4)).booleanValue()) {
            return null;
        }
        HashMap map = new HashMap(4);
        s sVarK = this.f945a.K();
        boolean zE = sVarK.e();
        CollectionUtils.putBooleanIfValid("loc_services_enabled", Boolean.valueOf(zE), map);
        if (!zE) {
            return map;
        }
        CollectionUtils.putBooleanIfValid("loc_auth", Boolean.valueOf(sVarK.c()), map);
        if (!this.f945a.K().d()) {
            return map;
        }
        double dA = sVarK.a();
        k kVar = this.f945a;
        oj ojVar = oj.K4;
        CollectionUtils.putStringIfValid("loc_lat", zp.a(dA, ((Integer) kVar.a(ojVar)).intValue()), map);
        CollectionUtils.putStringIfValid("loc_long", zp.a(sVarK.b(), ((Integer) this.f945a.a(ojVar)).intValue()), map);
        return map;
    }

    private Map f() {
        HashMap map = new HashMap(22);
        CollectionUtils.putStringIfValid("app_name", this.c.g().e(), map);
        CollectionUtils.putStringIfValid("app_version", this.c.g().h(), map);
        CollectionUtils.putStringIfValid("package_name", this.c.g().f(), map);
        CollectionUtils.putStringIfValid("vz", this.c.g().j(), map);
        CollectionUtils.putStringIfValid("installer_name", this.c.g().d(), map);
        CollectionUtils.putIntegerIfValid("app_version_code", Integer.valueOf(this.c.g().i()), map);
        CollectionUtils.putIntegerIfValid("target_sdk", Integer.valueOf(this.c.g().g()), map);
        CollectionUtils.putLongIfValid("first_install_v3_ms", this.c.g().a(), map);
        CollectionUtils.putLongIfValid("ia", Long.valueOf(this.c.g().b()), map);
        CollectionUtils.putLongIfValid("ia_v2", this.c.g().c(), map);
        CollectionUtils.putStringIfValid("tg", xp.a(this.f945a), map);
        CollectionUtils.putStringIfValid("sdk_version", AppLovinSdk.VERSION, map);
        CollectionUtils.putStringIfValid("omid_sdk_version", this.f945a.Y().c(), map);
        CollectionUtils.putStringIfValid("ad_review_sdk_version", com.applovin.impl.v.b(), map);
        CollectionUtils.putStringIfValid("api_did", (String) this.f945a.a(oj.g), map);
        CollectionUtils.putBooleanIfValid("debug", Boolean.valueOf(zp.c(this.f945a)), map);
        CollectionUtils.putBooleanIfValid("j8", Boolean.valueOf(k.B0()), map);
        CollectionUtils.putIntegerIfValid("epv", Integer.valueOf(zp.f()), map);
        CollectionUtils.putLongIfValid("alts_ms", Long.valueOf(k.j()), map);
        CollectionUtils.putBooleanIfValid("ps_tpg", Boolean.valueOf(th.d(this.b)), map);
        CollectionUtils.putBooleanIfValid("ps_apg", Boolean.valueOf(th.b(this.b)), map);
        CollectionUtils.putBooleanIfValid("ps_capg", Boolean.valueOf(th.c(this.b)), map);
        CollectionUtils.putBooleanIfValid("ps_aipg", Boolean.valueOf(th.a(this.b)), map);
        return map;
    }

    private Map g() {
        HashMap map = new HashMap(36);
        CollectionUtils.putStringIfValid("kb", this.c.p(), map);
        CollectionUtils.putBooleanIfValid("gy", Boolean.valueOf(this.c.E()), map);
        CollectionUtils.putDoubleIfValid("tz_offset", Double.valueOf(this.c.z()), map);
        CollectionUtils.putLongIfValid("tm", Long.valueOf(this.c.q().c()), map);
        CollectionUtils.putLongIfValid("tds", Long.valueOf(this.c.A()), map);
        CollectionUtils.putStringIfValid("country_code", this.c.y().b(), map);
        CollectionUtils.putStringIfValid(i5.s0, this.c.y().a(), map);
        CollectionUtils.putStringIfValid("mcc", this.c.y().d(), map);
        CollectionUtils.putStringIfValid("mnc", this.c.y().e(), map);
        CollectionUtils.putIntegerIfValid("adnsd", Integer.valueOf(this.c.m().b()), map);
        CollectionUtils.putIntegerIfValid("dx", Integer.valueOf(this.c.m().c()), map);
        CollectionUtils.putIntegerIfValid("dy", Integer.valueOf(this.c.m().d()), map);
        CollectionUtils.putFloatIfValid("adns", Float.valueOf(this.c.m().a()), map);
        CollectionUtils.putFloatIfValid("xdpi", Float.valueOf(this.c.m().g()), map);
        CollectionUtils.putFloatIfValid("ydpi", Float.valueOf(this.c.m().h()), map);
        CollectionUtils.putDoubleIfValid("screen_size_in", Double.valueOf(this.c.m().f()), map);
        CollectionUtils.putBooleanIfValid("hdr", this.c.m().e(), map);
        CollectionUtils.putStringIfValid("orientation_lock", this.c.t(), map);
        CollectionUtils.putIntegerIfValid("api_level", Integer.valueOf(Build.VERSION.SDK_INT), map);
        CollectionUtils.putStringIfValid("brand", Build.MANUFACTURER, map);
        CollectionUtils.putStringIfValid("brand_name", Build.BRAND, map);
        CollectionUtils.putStringIfValid("hardware", Build.HARDWARE, map);
        CollectionUtils.putStringIfValid("locale", Locale.getDefault().toString(), map);
        CollectionUtils.putStringIfValid(i5.u, Build.MODEL, map);
        CollectionUtils.putStringIfValid(i5.x, Build.VERSION.RELEASE, map);
        CollectionUtils.putStringIfValid("revision", Build.DEVICE, map);
        CollectionUtils.putStringIfValid("platform", AppLovinSdkUtils.isFireOS(this.b) ? "fireos" : "android", map);
        CollectionUtils.putBooleanIfValid("sim", Boolean.valueOf(AppLovinSdkUtils.isEmulator()), map);
        CollectionUtils.putBooleanIfValid("aida", Boolean.valueOf(l0.a()), map);
        CollectionUtils.putBooleanIfValid("is_tablet", Boolean.valueOf(AppLovinSdkUtils.isTablet(this.b)), map);
        CollectionUtils.putBooleanIfValid("tv", Boolean.valueOf(AppLovinSdkUtils.isTv(this.b)), map);
        CollectionUtils.putLongIfValid("bt_ms", Long.valueOf(System.currentTimeMillis() - SystemClock.elapsedRealtime()), map);
        CollectionUtils.putLongIfValid("tbalsi_ms", Long.valueOf(this.f945a.J() - k.j()), map);
        CollectionUtils.putIntegerIfValid("pc", Integer.valueOf(Runtime.getRuntime().availableProcessors()), map);
        CollectionUtils.putJsonArrayIfValid("supported_abis", this.c.x(), map);
        CollectionUtils.putBooleanIfValid("psase", Boolean.valueOf(th.e(this.b)), map);
        CollectionUtils.putStringIfValid("process_name", zp.b(this.b), map);
        CollectionUtils.putBooleanIfValid("is_main_process", zp.g(this.b), map);
        try {
            PackageInfo packageInfo = this.b.getPackageManager().getPackageInfo("com.android.vending", 0);
            CollectionUtils.putStringIfValid("ps_version", packageInfo.versionName, map);
            CollectionUtils.putIntegerIfValid("ps_version_code", Integer.valueOf(packageInfo.versionCode), map);
        } catch (Throwable unused) {
            CollectionUtils.putStringIfValid("ps_version", "", map);
            CollectionUtils.putIntegerIfValid("ps_version_code", -1, map);
        }
        a(map);
        return map;
    }

    private Map i() {
        return zp.a(a(null, true, false));
    }

    protected void a(final AppLovinBidTokenCollectionListener appLovinBidTokenCollectionListener) {
        this.f945a.l0().a((xl) new kn(this.f945a, ((Boolean) this.f945a.a(oj.V3)).booleanValue(), "DataCollectorV2", new Runnable() { // from class: com.applovin.impl.sdk.m$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.b(appLovinBidTokenCollectionListener);
            }
        }), sm.b.CORE);
    }

    public Map c() {
        b4.d dVarA = this.f945a.r().a();
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

    public Map d() {
        return a(false);
    }

    protected String h() {
        String strEncodeToString = Base64.encodeToString(new JSONObject(i()).toString().getBytes(Charset.defaultCharset()), 2);
        return ((Boolean) this.f945a.a(oj.l5)).booleanValue() ? qi.b(strEncodeToString, zp.a(this.f945a), qi.a.a(((Integer) this.f945a.a(oj.m5)).intValue()), this.f945a.d0(), this.f945a) : strEncodeToString;
    }

    public Map j() {
        return this.f;
    }

    public Map k() {
        return this.d;
    }

    public void l() {
        synchronized (this.e) {
            a(this.d);
        }
    }

    public Map a(Map map, boolean z, boolean z2) {
        HashMap map2;
        Map mapA = a(z);
        Map mapB = b();
        Map mapC = c();
        Map mapE = e();
        Map mapK0 = this.f945a.k0();
        Map mapA2 = a();
        if (z2) {
            map2 = new HashMap(mapA2.size() + 19);
            map2.put("device_info", mapA);
            map2.put("app_info", mapB);
            if (mapC != null) {
                map2.put("connection_info", mapC);
            }
            if (map != null) {
                map2.put("ad_info", map);
            }
            if (mapE != null) {
                map2.put("location_info", mapE);
            }
            if (mapK0 != null) {
                map2.put("targeting_data", mapK0);
            }
        } else {
            map2 = new HashMap(mapA.size() + 14 + mapB.size() + (map != null ? map.size() : 0) + (mapE != null ? mapE.size() : 0) + (mapK0 != null ? mapK0.size() : 0) + mapA2.size());
            map2.putAll(mapA);
            map2.putAll(mapB);
            if (mapC != null) {
                map2.putAll(mapC);
            }
            if (map != null) {
                map2.putAll(map);
            }
            if (mapE != null) {
                map2.putAll(mapE);
            }
            if (mapK0 != null && !mapK0.isEmpty()) {
                map2.putAll(mapK0);
            }
        }
        map2.putAll(mapA2);
        map2.put("accept", "custom_size,launch_app,video");
        map2.put("format", "json");
        CollectionUtils.putStringIfValid("mediation_provider", this.f945a.Q(), map2);
        CollectionUtils.putStringIfValid("mediation_provider_v2", this.f945a.A(), map2);
        CollectionUtils.putStringIfValid("plugin_version", (String) this.f945a.a(oj.U3), map2);
        CollectionUtils.putLongIfValid("tssf_ms", Long.valueOf(this.f945a.o0()), map2);
        CollectionUtils.putStringIfValid("rid", UUID.randomUUID().toString(), map2);
        if (!((Boolean) this.f945a.a(oj.j5)).booleanValue()) {
            CollectionUtils.putStringIfValid(AppLovinWebViewActivity.INTENT_EXTRA_KEY_SDK_KEY, this.f945a.d0(), map2);
        }
        if (((Boolean) this.f945a.a(oj.L4)).booleanValue()) {
            ba baVarF = this.f945a.F();
            CollectionUtils.putLongIfValid("li", Long.valueOf(baVarF.b(aa.e)), map2);
            CollectionUtils.putLongIfValid("si", Long.valueOf(baVarF.b(aa.h)), map2);
            CollectionUtils.putLongIfValid("mad", Long.valueOf(baVarF.b(aa.f)), map2);
            CollectionUtils.putLongIfValid("msad", Long.valueOf(baVarF.b(aa.i)), map2);
            CollectionUtils.putLongIfValid("pf", Long.valueOf(baVarF.b(aa.m)), map2);
            CollectionUtils.putLongIfValid("mpf", Long.valueOf(baVarF.b(aa.t)), map2);
            CollectionUtils.putLongIfValid("gpf", Long.valueOf(baVarF.b(aa.n)), map2);
            CollectionUtils.putLongIfValid("asoac", Long.valueOf(baVarF.b(aa.r)), map2);
        }
        return map2;
    }

    public Map b() {
        Map map;
        synchronized (this.g) {
            map = CollectionUtils.map(this.f);
        }
        CollectionUtils.putBooleanIfValid("first_install", Boolean.valueOf(this.f945a.z0()), map);
        CollectionUtils.putBooleanIfValid("first_install_v2", Boolean.valueOf(!this.f945a.w0()), map);
        CollectionUtils.putBooleanIfValid("test_ads", Boolean.valueOf(this.c.G()), map);
        CollectionUtils.putBooleanIfValid("muted", Boolean.valueOf(this.f945a.g0().isMuted()), map);
        if (this.f945a.r0() != null) {
            CollectionUtils.putStringIfValid("user_segment_name", this.f945a.r0().getName(), map);
        }
        CollectionUtils.putIntegerIfValid("IABTCF_gdprApplies", this.f945a.m0().g(), map);
        CollectionUtils.putStringIfValid("IABTCF_TCString", this.f945a.m0().k(), map);
        CollectionUtils.putStringIfValid("IABTCF_AddtlConsent", this.f945a.m0().c(), map);
        if (((Boolean) this.f945a.a(oj.K3)).booleanValue()) {
            CollectionUtils.putStringIfValid("cuid", this.f945a.t0().c(), map);
        }
        if (((Boolean) this.f945a.a(oj.N3)).booleanValue()) {
            CollectionUtils.putStringIfValid("compass_random_token", this.f945a.p(), map);
        }
        if (((Boolean) this.f945a.a(oj.P3)).booleanValue()) {
            CollectionUtils.putStringIfValid("applovin_random_token", this.f945a.c0(), map);
        }
        if (this.f945a.b0() != null) {
            CollectionUtils.putJsonArrayIfValid("ps_topics", this.f945a.b0().a(), map);
        }
        return map;
    }

    public Map a(boolean z) {
        Map map;
        l0.a aVarD;
        synchronized (this.e) {
            map = CollectionUtils.map(this.d);
        }
        if (z) {
            aVarD = this.c.f();
            if (aVarD != null) {
                this.c.J();
            } else if (zp.h()) {
                aVarD = new l0.a();
                map.put("inc", Boolean.TRUE);
            } else {
                aVarD = this.c.d();
            }
        } else {
            aVarD = this.c.d();
        }
        CollectionUtils.putBooleanIfValid("huc", y3.b().b(this.b), map);
        CollectionUtils.putBooleanIfValid("aru", y3.c().b(this.b), map);
        CollectionUtils.putBooleanIfValid("dns", y3.a().b(this.b), map);
        CollectionUtils.putBooleanIfValid("dnt", Boolean.valueOf(aVarD.c()), map);
        CollectionUtils.putStringIfValid("dnt_code", aVarD.b().b(), map);
        CollectionUtils.putStringIfValid("idfa", aVarD.a(), map);
        n.c cVarH = this.c.h();
        if (cVarH != null) {
            CollectionUtils.putStringIfValid("idfv", cVarH.a(), map);
            CollectionUtils.putIntegerIfValid("idfv_scope", Integer.valueOf(cVarH.b()), map);
        }
        CollectionUtils.putIntegerIfValid("volume", z ? this.c.B() : this.c.i().a(), map);
        CollectionUtils.putIntegerIfValid("lpm", this.c.v().a(), map);
        CollectionUtils.putIntegerIfValid("sb", this.c.w(), map);
        CollectionUtils.putIntegerIfValid("mute_switch", Integer.valueOf(this.c.i().b()), map);
        CollectionUtils.putLongIfValid(i5.v0, this.c.o(), map);
        CollectionUtils.putStringIfValid("network", this.c.r(), map);
        CollectionUtils.putBooleanIfValid("ma", this.c.i().d(), map);
        CollectionUtils.putBooleanIfValid("spo", this.c.i().e(), map);
        CollectionUtils.putBooleanIfValid("aif", Boolean.valueOf(!this.f945a.f0().isApplicationPaused()), map);
        CollectionUtils.putLongIfValid("af_ts_ms", Long.valueOf(this.f945a.f0().getAppEnteredForegroundTimeMillis()), map);
        CollectionUtils.putLongIfValid("ab_ts_ms", Long.valueOf(this.f945a.f0().getAppEnteredBackgroundTimeMillis()), map);
        if (((Boolean) this.f945a.a(oj.Z3)).booleanValue()) {
            CollectionUtils.putLongIfValid("fm", this.c.q().a(), map);
            CollectionUtils.putLongIfValid("lmt", this.c.q().b(), map);
            CollectionUtils.putBooleanIfValid("lm", this.c.q().d(), map);
        }
        if (((Boolean) this.f945a.a(oj.a4)).booleanValue()) {
            CollectionUtils.putIntegerIfValid("rat", this.c.y().c(), map);
        }
        if (((Boolean) this.f945a.a(oj.X3)).booleanValue()) {
            CollectionUtils.putStringIfValid("so", this.c.i().c(), map);
        }
        if (((Boolean) this.f945a.a(oj.b4)).booleanValue()) {
            CollectionUtils.putBooleanIfValid("vs", Boolean.valueOf(this.c.H()), map);
        }
        if (((Boolean) this.f945a.a(oj.l4)).booleanValue()) {
            CollectionUtils.putFloatIfValid("da", this.c.k(), map);
        }
        if (((Boolean) this.f945a.a(oj.m4)).booleanValue()) {
            CollectionUtils.putFloatIfValid("dm", this.c.l(), map);
        }
        if (((Boolean) this.f945a.a(oj.W3)).booleanValue()) {
            CollectionUtils.putIntegerIfValid("act", this.c.j().b(), map);
            CollectionUtils.putIntegerIfValid("acm", this.c.j().a(), map);
            CollectionUtils.putBooleanIfValid("sowpie", this.c.j().c(), map);
        }
        if (((Boolean) this.f945a.a(oj.h4)).booleanValue()) {
            CollectionUtils.putBooleanIfValid("adr", Boolean.valueOf(this.c.D()), map);
        }
        if (((Boolean) this.f945a.a(oj.e4)).booleanValue()) {
            CollectionUtils.putIntegerIfValid("mtl", Integer.valueOf(this.f945a.f0().getLastTrimMemoryLevel()), map);
        }
        if (((Boolean) this.f945a.a(oj.k4)).booleanValue() && zp.d(this.f945a)) {
            tr.a(this.f945a);
            CollectionUtils.putStringIfValid(i5.R, tr.a(), map);
        }
        if (((Boolean) this.f945a.a(oj.x4)).booleanValue()) {
            tr.b(this.f945a);
            CollectionUtils.putIntegerIfValid("wvvc", Integer.valueOf(tr.d()), map);
            CollectionUtils.putStringIfValid("wvv", tr.c(), map);
            CollectionUtils.putStringIfValid("wvpn", tr.b(), map);
        }
        ArrayService arrayServiceL = this.f945a.l();
        if (arrayServiceL.isAppHubInstalled()) {
            if (arrayServiceL.getIsDirectDownloadEnabled() != null) {
                CollectionUtils.putBooleanIfValid("ah_dd_enabled", arrayServiceL.getIsDirectDownloadEnabled(), map);
            }
            CollectionUtils.putLongIfValid("ah_sdk_version_code", Long.valueOf(arrayServiceL.getAppHubVersionCode()), map);
            CollectionUtils.putStringIfValid("ah_random_user_token", StringUtils.emptyIfNull(arrayServiceL.getRandomUserToken()), map);
            CollectionUtils.putStringIfValid("ah_sdk_package_name", StringUtils.emptyIfNull(arrayServiceL.getAppHubPackageName()), map);
        }
        return map;
    }

    private void a(Map map) {
        if (((Boolean) this.f945a.a(oj.k4)).booleanValue() && zp.d(this.f945a)) {
            tr.a(this.f945a);
        }
        if (((Boolean) this.f945a.a(oj.x4)).booleanValue()) {
            tr.b(this.f945a);
        }
        if (((Boolean) this.f945a.a(oj.c4)).booleanValue() && !map.containsKey("af")) {
            CollectionUtils.putLongIfValid("af", Long.valueOf(this.c.e()), map);
        }
        if (((Boolean) this.f945a.a(oj.d4)).booleanValue() && !map.containsKey("font")) {
            CollectionUtils.putFloatIfValid("font", Float.valueOf(this.c.n()), map);
        }
        if (((Boolean) this.f945a.a(oj.j4)).booleanValue() && !map.containsKey("sua")) {
            CollectionUtils.putStringIfValid("sua", System.getProperty("http.agent"), map);
        }
        if (((Boolean) this.f945a.a(oj.f4)).booleanValue() && !map.containsKey("network_restricted")) {
            CollectionUtils.putBooleanIfValid("network_restricted", Boolean.valueOf(this.c.F()), map);
        }
        if (((Boolean) this.f945a.a(oj.n4)).booleanValue()) {
            CollectionUtils.putBooleanIfValid("is_pc", Boolean.valueOf(this.c.C()), map);
        }
        if (((Boolean) this.f945a.a(oj.z4)).booleanValue()) {
            CollectionUtils.putStringIfValid("oglv", this.c.s(), map);
        }
    }

    public Map a() {
        HashMap map = new HashMap(5);
        CollectionUtils.putStringIfValid("sc", (String) this.f945a.a(oj.q), map);
        CollectionUtils.putStringIfValid("sc2", (String) this.f945a.a(oj.r), map);
        CollectionUtils.putStringIfValid("sc3", (String) this.f945a.a(oj.s), map);
        CollectionUtils.putStringIfValid("server_installed_at", (String) this.f945a.a(oj.t), map);
        CollectionUtils.putStringIfValid("persisted_data", (String) this.f945a.a(qj.H), map);
        return map;
    }
}
