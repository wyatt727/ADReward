package com.applovin.impl;

import com.applovin.impl.qi;
import com.applovin.impl.sdk.utils.JsonUtils;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
class yl extends xl {
    @Override // java.lang.Runnable
    public void run() throws JSONException {
        if (com.applovin.impl.sdk.t.a()) {
            this.c.d(this.b, "Submitting user data...");
        }
        Map mapC = c4.c(this.f1179a);
        JSONObject jSONObject = new JSONObject();
        c(jSONObject);
        b(jSONObject);
        if (((Boolean) this.f1179a.a(oj.C5)).booleanValue() || ((Boolean) this.f1179a.a(oj.w5)).booleanValue()) {
            JsonUtils.putAll(jSONObject, (Map<String, ?>) mapC);
            mapC = null;
        }
        a(mapC, jSONObject);
    }

    yl(com.applovin.impl.sdk.k kVar) {
        super("TaskApiSubmitData", kVar);
    }

    private void c(JSONObject jSONObject) throws JSONException {
        Map mapL;
        Map mapA;
        if (this.f1179a.y() != null) {
            com.applovin.impl.sdk.m mVarY = this.f1179a.y();
            mapL = mVarY.d();
            mapA = mVarY.b();
        } else {
            com.applovin.impl.sdk.l lVarX = this.f1179a.x();
            mapL = lVarX.l();
            mapA = lVarX.A();
        }
        zp.a("platform", "type", mapL);
        zp.a("api_level", "sdk_version", mapL);
        JsonUtils.putObject(jSONObject, "device_info", new JSONObject(mapL));
        zp.a("sdk_version", "applovin_sdk_version", mapA);
        zp.a("ia", "installed_at", mapA);
        JsonUtils.putObject(jSONObject, "app_info", new JSONObject(mapA));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(JSONObject jSONObject) {
        JSONObject jSONObject2 = JsonUtils.getJSONObject(JsonUtils.getJSONArray(jSONObject, "results", new JSONArray()), 0, new JSONObject());
        this.f1179a.h0().a(oj.g, JsonUtils.getString(jSONObject2, "device_id", ""));
        this.f1179a.h0().a(oj.k, JsonUtils.getString(jSONObject2, "device_token", ""));
        c4.a(jSONObject2, this.f1179a);
        this.f1179a.F().b();
    }

    private void b(JSONObject jSONObject) throws JSONException {
        if (((Boolean) this.f1179a.a(oj.L4)).booleanValue()) {
            JsonUtils.putJSONObjectIfValid(jSONObject, "stats", this.f1179a.F().c());
        }
    }

    class a extends en {
        a(com.applovin.impl.sdk.network.a aVar, com.applovin.impl.sdk.k kVar) {
            super(aVar, kVar);
        }

        @Override // com.applovin.impl.en, com.applovin.impl.b4.e
        public void a(String str, int i, String str2, JSONObject jSONObject) {
            c4.a(i, this.f1179a);
        }

        @Override // com.applovin.impl.en, com.applovin.impl.b4.e
        public void a(String str, JSONObject jSONObject, int i) {
            yl.this.a(jSONObject);
        }
    }

    private void a(Map map, JSONObject jSONObject) {
        a aVar = new a(com.applovin.impl.sdk.network.a.a(this.f1179a).b(c4.b("2.0/device", this.f1179a)).a(c4.a("2.0/device", this.f1179a)).b(map).a(jSONObject).c("POST").b(((Boolean) this.f1179a.a(oj.J5)).booleanValue()).a((Object) new JSONObject()).a(((Integer) this.f1179a.a(oj.i3)).intValue()).a(qi.a.a(((Integer) this.f1179a.a(oj.u5)).intValue())).a(), this.f1179a);
        aVar.c(oj.K0);
        aVar.b(oj.L0);
        this.f1179a.l0().a(aVar);
    }
}
