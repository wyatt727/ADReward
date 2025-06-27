package com.applovin.impl;

import com.applovin.impl.b4;
import com.applovin.impl.l0;
import com.applovin.impl.qi;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinWebViewActivity;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class lm extends xl {
    private final b4.e h;

    public lm(b4.e eVar, com.applovin.impl.sdk.k kVar) {
        super("TaskFetchMediationDebuggerInfo", kVar, true);
        this.h = eVar;
    }

    @Override // java.lang.Runnable
    public void run() throws JSONException {
        Map mapF = f();
        JSONObject jSONObjectE = e();
        if (((Boolean) this.f1179a.a(oj.z5)).booleanValue() || ((Boolean) this.f1179a.a(oj.w5)).booleanValue()) {
            JsonUtils.putAll(jSONObjectE, (Map<String, ?>) mapF);
            mapF = null;
        }
        a aVar = new a(com.applovin.impl.sdk.network.a.a(this.f1179a).c("POST").b(le.j(this.f1179a)).a(le.i(this.f1179a)).b(mapF).a(jSONObjectE).a((Object) new JSONObject()).c(((Long) this.f1179a.a(qe.M6)).intValue()).a(qi.a.a(((Integer) this.f1179a.a(oj.q5)).intValue())).a(), this.f1179a, d());
        aVar.c(qe.I6);
        aVar.b(qe.J6);
        this.f1179a.l0().a(aVar);
    }

    class a extends en {
        a(com.applovin.impl.sdk.network.a aVar, com.applovin.impl.sdk.k kVar, boolean z) {
            super(aVar, kVar, z);
        }

        @Override // com.applovin.impl.en, com.applovin.impl.b4.e
        public void a(String str, int i, String str2, JSONObject jSONObject) {
            lm.this.h.a(str, i, str2, jSONObject);
        }

        @Override // com.applovin.impl.en, com.applovin.impl.b4.e
        public void a(String str, JSONObject jSONObject, int i) {
            lm.this.h.a(str, jSONObject, i);
        }
    }

    protected Map f() {
        Map mapA;
        Map mapG;
        HashMap map = new HashMap();
        map.put("sdk_version", AppLovinSdk.VERSION);
        if (!((Boolean) this.f1179a.a(oj.j5)).booleanValue()) {
            map.put(AppLovinWebViewActivity.INTENT_EXTRA_KEY_SDK_KEY, this.f1179a.d0());
        }
        if (this.f1179a.y() != null) {
            mapA = this.f1179a.y().b();
            mapG = this.f1179a.y().k();
        } else {
            mapA = this.f1179a.x().A();
            mapG = this.f1179a.x().G();
        }
        map.put("package_name", String.valueOf(mapA.get("package_name")));
        map.put("app_version", String.valueOf(mapA.get("app_version")));
        map.put("platform", String.valueOf(mapG.get("platform")));
        map.put(com.json.i5.x, String.valueOf(mapG.get(com.json.i5.x)));
        return map;
    }

    private JSONObject e() throws JSONException {
        l0.a aVarF;
        JSONObject jSONObject = new JSONObject();
        JsonUtils.putJsonArrayIfValid(jSONObject, "installed_mediation_adapters", ve.a(this.f1179a));
        if (this.f1179a.y() != null) {
            aVarF = this.f1179a.z().d();
        } else {
            aVarF = this.f1179a.x().f();
        }
        JsonUtils.putStringIfValid(jSONObject, "dnt_code", aVarF.b().b());
        Boolean boolB = y3.c().b(a());
        if (((Boolean) this.f1179a.a(oj.S3)).booleanValue() && !Boolean.TRUE.equals(boolB)) {
            JsonUtils.putStringIfValid(jSONObject, "idfa", aVarF.a());
        }
        return jSONObject;
    }
}
