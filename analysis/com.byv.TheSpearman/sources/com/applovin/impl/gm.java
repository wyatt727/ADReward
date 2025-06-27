package com.applovin.impl;

import com.applovin.impl.qi;
import com.applovin.impl.sdk.network.a;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.AppLovinUtils;
import com.applovin.mediation.adapter.MaxAdapterError;
import com.applovin.sdk.AppLovinWebViewActivity;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class gm extends xl {
    protected final h0 h;
    private final String i;

    protected abstract xl a(JSONObject jSONObject);

    protected abstract String e();

    protected abstract String f();

    @Override // java.lang.Runnable
    public void run() {
        qi.a aVarA;
        Map map;
        if (com.applovin.impl.sdk.t.a()) {
            this.c.a(this.b, "Fetching next ad of zone: " + this.h);
        }
        if (((Boolean) this.f1179a.a(oj.b4)).booleanValue() && zp.j() && com.applovin.impl.sdk.t.a()) {
            this.c.a(this.b, "User is connected to a VPN");
        }
        ba baVarF = this.f1179a.F();
        baVarF.c(aa.d);
        aa aaVar = aa.g;
        if (baVarF.b(aaVar) == 0) {
            baVarF.b(aaVar, System.currentTimeMillis());
        }
        JSONObject jSONObject = null;
        try {
            JSONObject andResetCustomPostBody = this.f1179a.i().getAndResetCustomPostBody();
            String str = "POST";
            if (((Boolean) this.f1179a.a(oj.q3)).booleanValue()) {
                qi.a aVarA2 = qi.a.a(((Integer) this.f1179a.a(oj.r5)).intValue());
                JSONObject jSONObject2 = new JSONObject(this.f1179a.y() != null ? this.f1179a.y().a(h(), false, true) : this.f1179a.x().a(h(), false, true));
                map = new HashMap();
                if (!((Boolean) this.f1179a.a(oj.A5)).booleanValue() && !((Boolean) this.f1179a.a(oj.w5)).booleanValue()) {
                    map.put("rid", UUID.randomUUID().toString());
                }
                if (!((Boolean) this.f1179a.a(oj.j5)).booleanValue()) {
                    map.put(AppLovinWebViewActivity.INTENT_EXTRA_KEY_SDK_KEY, this.f1179a.d0());
                }
                JsonUtils.putAll(jSONObject2, andResetCustomPostBody);
                aVarA = aVarA2;
                jSONObject = jSONObject2;
            } else {
                aVarA = qi.a.a(((Integer) this.f1179a.a(oj.s5)).intValue());
                Map mapA = zp.a(this.f1179a.y() != null ? this.f1179a.y().a(h(), false, false) : this.f1179a.x().a(h(), false, false));
                if (andResetCustomPostBody != null) {
                    jSONObject = andResetCustomPostBody;
                } else {
                    str = "GET";
                }
                map = mapA;
            }
            if (zp.f(a())) {
                map.putAll(this.f1179a.i().getAndResetCustomQueryParams());
            }
            if (StringUtils.isValidString(this.i)) {
                map.put("sts", this.i);
            }
            a(baVarF);
            a.C0045a c0045aF = com.applovin.impl.sdk.network.a.a(this.f1179a).b(f()).a(e()).b(map).c(str).a(g()).a((Object) new JSONObject()).a(((Integer) this.f1179a.a(oj.f3)).intValue()).c(((Boolean) this.f1179a.a(oj.g3)).booleanValue()).d(((Boolean) this.f1179a.a(oj.h3)).booleanValue()).c(((Integer) this.f1179a.a(oj.e3)).intValue()).a(aVarA).f(true);
            if (jSONObject != null) {
                c0045aF.a(jSONObject);
                c0045aF.b(((Boolean) this.f1179a.a(oj.K5)).booleanValue());
            }
            a aVar = new a(c0045aF.a(), this.f1179a);
            aVar.c(oj.I0);
            aVar.b(oj.J0);
            this.f1179a.l0().a(aVar);
        } catch (Throwable th) {
            if (com.applovin.impl.sdk.t.a()) {
                this.c.a(this.b, "Unable to fetch ad " + this.h, th);
            }
            a(0, th.getMessage());
        }
    }

    public gm(h0 h0Var, String str, com.applovin.impl.sdk.k kVar) {
        super(str, kVar);
        this.h = h0Var;
        this.i = kVar.b();
    }

    class a extends en {
        a(com.applovin.impl.sdk.network.a aVar, com.applovin.impl.sdk.k kVar) {
            super(aVar, kVar);
        }

        @Override // com.applovin.impl.en, com.applovin.impl.b4.e
        public void a(String str, int i, String str2, JSONObject jSONObject) {
            gm.this.a(i, str2);
            this.f1179a.B().a("fetchAd", str, i, CollectionUtils.hashMap("error_message", str2));
        }

        @Override // com.applovin.impl.en, com.applovin.impl.b4.e
        public void a(String str, JSONObject jSONObject, int i) throws JSONException {
            if (i == 200) {
                JsonUtils.putLong(jSONObject, "ad_fetch_latency_millis", this.m.a());
                JsonUtils.putLong(jSONObject, "ad_fetch_response_size", this.m.b());
                gm.this.b(jSONObject);
            } else {
                gm.this.a(i, MaxAdapterError.NO_FILL.getErrorMessage());
                this.f1179a.B().a("fetchAd", str, i);
            }
        }
    }

    private Map g() {
        HashMap map = new HashMap(3);
        map.put("AppLovin-Zone-Id", this.h.e());
        if (this.h.f() != null) {
            map.put("AppLovin-Ad-Size", this.h.f().getLabel());
        }
        if (this.h.g() != null) {
            map.put("AppLovin-Ad-Type", this.h.g().getLabel());
        }
        return map;
    }

    protected Map h() {
        HashMap map = new HashMap(4);
        map.put(AppLovinUtils.ServerParameterKeys.ZONE_ID, this.h.e());
        if (this.h.f() != null) {
            map.put("size", this.h.f().getLabel());
        }
        if (this.h.g() != null) {
            map.put("require", this.h.g().getLabel());
        }
        return map;
    }

    protected void b(JSONObject jSONObject) {
        c4.c(jSONObject, this.f1179a);
        c4.b(jSONObject, this.f1179a);
        c4.a(jSONObject, this.f1179a);
        h0.a(jSONObject);
        this.f1179a.l0().a(a(jSONObject));
    }

    private void a(ba baVar) {
        aa aaVar = aa.g;
        long jB = baVar.b(aaVar);
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - jB > TimeUnit.MINUTES.toMillis(((Integer) this.f1179a.a(oj.B3)).intValue())) {
            baVar.b(aaVar, jCurrentTimeMillis);
            baVar.a(aa.h);
            baVar.a(aa.i);
        }
    }

    protected void a(int i, String str) {
        if (com.applovin.impl.sdk.t.a()) {
            this.c.b(this.b, "Unable to fetch " + this.h + " ad: server returned " + i);
        }
        if (i == -800) {
            this.f1179a.F().c(aa.m);
        }
    }
}
