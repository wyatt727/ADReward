package com.applovin.impl;

import android.app.ActivityManager;
import com.applovin.impl.l0;
import com.applovin.impl.qi;
import com.applovin.impl.sdk.array.ArrayService;
import com.applovin.impl.sdk.l;
import com.applovin.impl.sdk.n;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sm;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinWebViewActivity;
import com.google.android.gms.security.ProviderInstaller;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class im extends xl {
    private static final AtomicBoolean k = new AtomicBoolean();
    private final int h;
    private final Object i;
    private b j;

    public interface b {
        void a(JSONObject jSONObject);
    }

    protected JSONObject e() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            com.applovin.impl.sdk.k kVar = this.f1179a;
            oj ojVar = oj.w5;
            if (((Boolean) kVar.a(ojVar)).booleanValue() || ((Boolean) this.f1179a.a(ojVar)).booleanValue()) {
                jSONObject.put("rid", UUID.randomUUID().toString());
            }
            jSONObject.put("sdk_version", AppLovinSdk.VERSION);
            JsonUtils.putStringIfValid(jSONObject, "ad_review_sdk_version", v.b());
            jSONObject.put("init_count", this.h);
            jSONObject.put("server_installed_at", this.f1179a.a(oj.t));
            jSONObject.put("legacy", this.f1179a.C0().get());
            if (this.f1179a.z0()) {
                jSONObject.put("first_install", true);
            }
            if (!this.f1179a.w0()) {
                jSONObject.put("first_install_v2", true);
            }
            JsonUtils.putStringIfValid(jSONObject, "process_name", zp.b(a()));
            JsonUtils.putBooleanIfValid(jSONObject, "is_main_process", zp.g(a()));
            JsonUtils.putStringIfValid(jSONObject, "plugin_version", (String) this.f1179a.a(oj.U3));
            JsonUtils.putStringIfValid(jSONObject, "mediation_provider", this.f1179a.Q());
            JsonUtils.putStringIfValid(jSONObject, "mediation_provider_v2", this.f1179a.A());
            jSONObject.put("installed_mediation_adapters", ve.a(this.f1179a));
            Map mapB = this.f1179a.y() != null ? this.f1179a.y().b() : this.f1179a.x().A();
            jSONObject.put("package_name", mapB.get("package_name"));
            jSONObject.put("app_version", mapB.get("app_version"));
            jSONObject.put("test_ads", mapB.get("test_ads"));
            jSONObject.put("debug", mapB.get("debug"));
            jSONObject.put("tg", mapB.get("tg"));
            jSONObject.put("target_sdk", mapB.get("target_sdk"));
            List<String> adUnitIds = null;
            if (this.f1179a.C0().get()) {
                adUnitIds = this.f1179a.g0().getInitializationAdUnitIds();
            } else if (this.f1179a.I() != null) {
                adUnitIds = this.f1179a.I().getAdUnitIds();
            }
            if (adUnitIds != null && adUnitIds.size() > 0) {
                List<String> listRemoveTrimmedEmptyStrings = CollectionUtils.removeTrimmedEmptyStrings(adUnitIds);
                jSONObject.put("ad_unit_ids", CollectionUtils.implode(listRemoveTrimmedEmptyStrings, listRemoveTrimmedEmptyStrings.size()));
            }
            jSONObject.put("IABTCF_TCString", mapB.get("IABTCF_TCString"));
            jSONObject.put("IABTCF_gdprApplies", mapB.get("IABTCF_gdprApplies"));
            Object obj = mapB.get("IABTCF_AddtlConsent");
            if (obj instanceof String) {
                JsonUtils.putStringIfValid(jSONObject, "IABTCF_AddtlConsent", (String) obj);
            }
            jSONObject.put("consent_flow_info", this.f1179a.t().c());
            Map mapK = this.f1179a.y() != null ? this.f1179a.y().k() : this.f1179a.x().G();
            jSONObject.put("platform", mapK.get("platform"));
            jSONObject.put(com.json.i5.x, mapK.get(com.json.i5.x));
            jSONObject.put("locale", mapK.get("locale"));
            jSONObject.put("brand", mapK.get("brand"));
            jSONObject.put("brand_name", mapK.get("brand_name"));
            jSONObject.put("hardware", mapK.get("hardware"));
            jSONObject.put(com.json.i5.u, mapK.get(com.json.i5.u));
            jSONObject.put("revision", mapK.get("revision"));
            jSONObject.put("is_tablet", mapK.get("is_tablet"));
            jSONObject.put("screen_size_in", mapK.get("screen_size_in"));
            jSONObject.put("supported_abis", mapK.get("supported_abis"));
            if (((Boolean) this.f1179a.a(oj.e4)).booleanValue()) {
                jSONObject.put("mtl", this.f1179a.f0().getLastTrimMemoryLevel());
            }
            try {
                ActivityManager activityManager = (ActivityManager) com.applovin.impl.sdk.k.k().getSystemService("activity");
                ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
                if (activityManager != null) {
                    activityManager.getMemoryInfo(memoryInfo);
                    jSONObject.put("fm", memoryInfo.availMem);
                    jSONObject.put("tm", memoryInfo.totalMem);
                    jSONObject.put("lmt", memoryInfo.threshold);
                    jSONObject.put("lm", memoryInfo.lowMemory);
                }
            } catch (Throwable unused) {
            }
            Map mapK0 = this.f1179a.k0();
            if (mapK0 != null && !mapK0.isEmpty()) {
                jSONObject.put("targeting_data", new JSONObject(mapK0));
            }
            if (this.f1179a.y() != null) {
                l0.a aVarD = this.f1179a.z().d();
                jSONObject.put("dnt", aVarD.c());
                jSONObject.put("dnt_code", aVarD.b().b());
                Boolean boolB = y3.c().b(a());
                if (((Boolean) this.f1179a.a(oj.Q3)).booleanValue() && StringUtils.isValidString(aVarD.a()) && !Boolean.TRUE.equals(boolB)) {
                    jSONObject.put("idfa", aVarD.a());
                }
                n.c cVarH = this.f1179a.z().h();
                if (((Boolean) this.f1179a.a(oj.J3)).booleanValue() && cVarH != null && !Boolean.TRUE.equals(boolB)) {
                    jSONObject.put("idfv", cVarH.a());
                    jSONObject.put("idfv_scope", cVarH.b());
                }
            } else {
                l0.a aVarF = this.f1179a.x().f();
                jSONObject.put("dnt", aVarF.c());
                jSONObject.put("dnt_code", aVarF.b().b());
                Boolean boolB2 = y3.c().b(a());
                if (((Boolean) this.f1179a.a(oj.Q3)).booleanValue() && StringUtils.isValidString(aVarF.a()) && !Boolean.TRUE.equals(boolB2)) {
                    jSONObject.put("idfa", aVarF.a());
                }
                l.b bVarB = this.f1179a.x().B();
                if (((Boolean) this.f1179a.a(oj.J3)).booleanValue() && bVarB != null && !Boolean.TRUE.equals(boolB2)) {
                    jSONObject.put("idfv", bVarB.f943a);
                    jSONObject.put("idfv_scope", bVarB.b);
                }
            }
            if (this.f1179a.r0() != null) {
                String name = this.f1179a.r0().getName();
                if (StringUtils.isValidString(name)) {
                    jSONObject.put("user_segment_name", StringUtils.encodeUriString(name));
                }
            }
            if (((Boolean) this.f1179a.a(oj.M3)).booleanValue()) {
                jSONObject.put("compass_random_token", this.f1179a.p());
            }
            if (((Boolean) this.f1179a.a(oj.O3)).booleanValue()) {
                jSONObject.put("applovin_random_token", this.f1179a.c0());
            }
            if (this.f1179a.n0().c()) {
                jSONObject.put("test_mode", true);
            }
            List listB = this.f1179a.n0().b();
            if (listB != null && !listB.isEmpty()) {
                jSONObject.put("test_mode_networks", listB);
            }
            jSONObject.put("sdk_extra_parameters", new JSONObject(this.f1179a.g0().getExtraParameters()));
            if (this.h > 1) {
                ArrayService arrayServiceL = this.f1179a.l();
                if (arrayServiceL.getIsDirectDownloadEnabled() != null) {
                    jSONObject.put("ah_dd_enabled", arrayServiceL.getIsDirectDownloadEnabled());
                }
                jSONObject.put("ah_sdk_version_code", arrayServiceL.getAppHubVersionCode());
                jSONObject.put("ah_random_user_token", StringUtils.emptyIfNull(arrayServiceL.getRandomUserToken()));
                jSONObject.put("ah_sdk_package_name", StringUtils.emptyIfNull(arrayServiceL.getAppHubPackageName()));
            }
        } catch (JSONException e) {
            if (com.applovin.impl.sdk.t.a()) {
                this.c.a(this.b, "Failed to create JSON body", e);
            }
            this.f1179a.B().a(this.b, "createJSONBody", e);
        }
        return jSONObject;
    }

    @Override // java.lang.Runnable
    public void run() throws JSONException {
        if (!x3.k() && k.compareAndSet(false, true)) {
            try {
                ProviderInstaller.installIfNeeded(com.applovin.impl.sdk.k.k());
            } catch (Throwable th) {
                if (com.applovin.impl.sdk.t.a()) {
                    this.c.a(this.b, "Cannot update security provider", th);
                }
            }
        }
        com.applovin.impl.sdk.network.a aVarA = com.applovin.impl.sdk.network.a.a(this.f1179a).b(g()).a(f()).b(h()).a(e()).b(((Boolean) this.f1179a.a(oj.I5)).booleanValue()).c("POST").a((Object) new JSONObject()).a(((Integer) this.f1179a.a(oj.l3)).intValue()).b(((Integer) this.f1179a.a(oj.o3)).intValue()).c(((Integer) this.f1179a.a(oj.k3)).intValue()).e(((Boolean) this.f1179a.a(oj.x3)).booleanValue()).a(qi.a.a(((Integer) this.f1179a.a(oj.o5)).intValue())).f(true).a();
        this.f1179a.l0().a(new c(this.f1179a), sm.b.TIMEOUT, ((Integer) this.f1179a.a(r3)).intValue() + 250);
        a aVar = new a(aVarA, this.f1179a, d());
        aVar.c(oj.G0);
        aVar.b(oj.H0);
        this.f1179a.l0().a(aVar);
    }

    public im(int i, com.applovin.impl.sdk.k kVar, b bVar) {
        super("TaskFetchBasicSettings", kVar, true);
        this.i = new Object();
        this.h = i;
        this.j = bVar;
    }

    class a extends en {
        a(com.applovin.impl.sdk.network.a aVar, com.applovin.impl.sdk.k kVar, boolean z) {
            super(aVar, kVar, z);
        }

        @Override // com.applovin.impl.en, com.applovin.impl.b4.e
        public void a(String str, JSONObject jSONObject, int i) {
            im.this.a(jSONObject);
            this.f1179a.B().a("fetchBasicSettings", str, i);
        }

        @Override // com.applovin.impl.en, com.applovin.impl.b4.e
        public void a(String str, int i, String str2, JSONObject jSONObject) {
            if (com.applovin.impl.sdk.t.a()) {
                this.c.b(this.b, "Unable to fetch basic SDK settings: server returned " + i);
            }
            if (jSONObject == null) {
                jSONObject = new JSONObject();
            }
            im.this.a(jSONObject);
            this.f1179a.B().a("fetchBasicSettings", str, i, CollectionUtils.hashMap("error_message", str2));
        }
    }

    protected Map h() {
        HashMap map = new HashMap();
        if (!((Boolean) this.f1179a.a(oj.x5)).booleanValue() && !((Boolean) this.f1179a.a(oj.w5)).booleanValue()) {
            map.put("rid", UUID.randomUUID().toString());
        }
        if (!((Boolean) this.f1179a.a(oj.j5)).booleanValue()) {
            map.put(AppLovinWebViewActivity.INTENT_EXTRA_KEY_SDK_KEY, this.f1179a.d0());
        }
        Boolean boolB = y3.b().b(a());
        if (boolB != null) {
            map.put("huc", boolB.toString());
        }
        Boolean boolB2 = y3.c().b(a());
        if (boolB2 != null) {
            map.put("aru", boolB2.toString());
        }
        Boolean boolB3 = y3.a().b(a());
        if (boolB3 != null) {
            map.put("dns", boolB3.toString());
        }
        return map;
    }

    private String g() {
        return c4.a((String) this.f1179a.a(oj.G0), "5.0/i", b());
    }

    private String f() {
        return c4.a((String) this.f1179a.a(oj.H0), "5.0/i", b());
    }

    private class c extends xl {
        public c(com.applovin.impl.sdk.k kVar) {
            super("TaskTimeoutFetchBasicSettings", kVar, true);
        }

        @Override // java.lang.Runnable
        public void run() {
            if (im.this.j != null) {
                if (com.applovin.impl.sdk.t.a()) {
                    this.c.b(this.b, "Timing out fetch basic settings...");
                }
                im.this.a(new JSONObject());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(JSONObject jSONObject) {
        b bVar;
        synchronized (this.i) {
            bVar = this.j;
            this.j = null;
        }
        if (bVar != null) {
            bVar.a(jSONObject);
        }
    }
}
