package com.applovin.impl;

import com.applovin.impl.b4;
import com.applovin.impl.qi;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class jn extends xl {
    protected abstract void a(JSONObject jSONObject);

    protected abstract String f();

    protected abstract int g();

    protected jn(String str, com.applovin.impl.sdk.k kVar) {
        super(str, kVar);
    }

    class a extends en {
        final /* synthetic */ b4.e n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(com.applovin.impl.sdk.network.a aVar, com.applovin.impl.sdk.k kVar, b4.e eVar) {
            super(aVar, kVar);
            this.n = eVar;
        }

        @Override // com.applovin.impl.en, com.applovin.impl.b4.e
        public void a(String str, int i, String str2, JSONObject jSONObject) {
            this.n.a(str, i, str2, jSONObject);
        }

        @Override // com.applovin.impl.en, com.applovin.impl.b4.e
        public void a(String str, JSONObject jSONObject, int i) {
            this.n.a(str, jSONObject, i);
        }
    }

    protected JSONObject e() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        String strC = this.f1179a.t0().c();
        if (((Boolean) this.f1179a.a(oj.L3)).booleanValue() && StringUtils.isValidString(strC)) {
            JsonUtils.putString(jSONObject, "cuid", strC);
        }
        if (((Boolean) this.f1179a.a(oj.N3)).booleanValue()) {
            JsonUtils.putString(jSONObject, "compass_random_token", this.f1179a.p());
        }
        if (((Boolean) this.f1179a.a(oj.P3)).booleanValue()) {
            JsonUtils.putString(jSONObject, "applovin_random_token", this.f1179a.c0());
        }
        a(jSONObject);
        return jSONObject;
    }

    protected void a(int i) {
        c4.a(i, this.f1179a);
    }

    void a(JSONObject jSONObject, b4.e eVar) throws JSONException {
        Map mapC = c4.c(this.f1179a);
        if (((Boolean) this.f1179a.a(oj.D5)).booleanValue() || ((Boolean) this.f1179a.a(oj.w5)).booleanValue()) {
            JsonUtils.putAll(jSONObject, (Map<String, ?>) mapC);
            mapC = null;
        }
        a aVar = new a(com.applovin.impl.sdk.network.a.a(this.f1179a).b(c4.b(f(), this.f1179a)).a(c4.a(f(), this.f1179a)).b(mapC).a(jSONObject).c("POST").b(((Boolean) this.f1179a.a(oj.M5)).booleanValue()).a((Object) new JSONObject()).a(g()).a(qi.a.a(((Integer) this.f1179a.a(oj.v5)).intValue())).a(), this.f1179a, eVar);
        aVar.c(oj.K0);
        aVar.b(oj.L0);
        this.f1179a.l0().a(aVar);
    }
}
