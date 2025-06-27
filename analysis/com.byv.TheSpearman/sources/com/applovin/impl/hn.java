package com.applovin.impl;

import com.applovin.impl.b4;
import com.applovin.impl.sdk.utils.JsonUtils;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class hn extends jn {
    protected abstract void b(JSONObject jSONObject);

    protected abstract ch h();

    protected abstract void i();

    protected hn(String str, com.applovin.impl.sdk.k kVar) {
        super(str, kVar);
    }

    @Override // java.lang.Runnable
    public void run() throws JSONException {
        ch chVarH = h();
        if (chVarH != null) {
            if (com.applovin.impl.sdk.t.a()) {
                this.c.a(this.b, "Reporting pending reward: " + chVarH + "...");
            }
            a(a(chVarH), new a());
            return;
        }
        if (com.applovin.impl.sdk.t.a()) {
            this.c.b(this.b, "Pending reward not found");
        }
        i();
    }

    class a implements b4.e {
        a() {
        }

        @Override // com.applovin.impl.b4.e
        public void a(String str, int i, String str2, JSONObject jSONObject) {
            hn.this.a(i);
        }

        @Override // com.applovin.impl.b4.e
        public void a(String str, JSONObject jSONObject, int i) {
            hn.this.b(jSONObject);
        }
    }

    @Override // com.applovin.impl.jn
    protected int g() {
        return ((Integer) this.f1179a.a(oj.s1)).intValue();
    }

    private JSONObject a(ch chVar) throws JSONException {
        JSONObject jSONObjectE = e();
        JsonUtils.putString(jSONObjectE, "result", chVar.b());
        Map mapA = chVar.a();
        if (mapA != null) {
            JsonUtils.putJSONObject(jSONObjectE, "params", new JSONObject(mapA));
        }
        return jSONObjectE;
    }
}
