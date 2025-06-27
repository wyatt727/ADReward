package com.applovin.impl;

import com.applovin.impl.b4;
import com.applovin.impl.sdk.utils.JsonUtils;
import java.util.Collections;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class nn extends jn {
    protected abstract void a(ch chVar);

    protected abstract boolean h();

    protected nn(String str, com.applovin.impl.sdk.k kVar) {
        super(str, kVar);
    }

    class a implements b4.e {
        a() {
        }

        @Override // com.applovin.impl.b4.e
        public void a(String str, int i, String str2, JSONObject jSONObject) {
            if (nn.this.h()) {
                com.applovin.impl.sdk.t tVar = nn.this.c;
                if (com.applovin.impl.sdk.t.a()) {
                    nn nnVar = nn.this;
                    nnVar.c.b(nnVar.b, "Reward validation failed with error code " + i + " but task was cancelled already");
                    return;
                }
                return;
            }
            com.applovin.impl.sdk.t tVar2 = nn.this.c;
            if (com.applovin.impl.sdk.t.a()) {
                nn nnVar2 = nn.this;
                nnVar2.c.b(nnVar2.b, "Reward validation failed with code " + i + " and error: " + str2);
            }
            nn.this.a(i);
        }

        @Override // com.applovin.impl.b4.e
        public void a(String str, JSONObject jSONObject, int i) {
            if (nn.this.h()) {
                com.applovin.impl.sdk.t tVar = nn.this.c;
                if (com.applovin.impl.sdk.t.a()) {
                    nn nnVar = nn.this;
                    nnVar.c.b(nnVar.b, "Reward validation succeeded with code " + i + " but task was cancelled already");
                }
                com.applovin.impl.sdk.t tVar2 = nn.this.c;
                if (com.applovin.impl.sdk.t.a()) {
                    nn nnVar2 = nn.this;
                    nnVar2.c.b(nnVar2.b, "Response: " + jSONObject);
                    return;
                }
                return;
            }
            com.applovin.impl.sdk.t tVar3 = nn.this.c;
            if (com.applovin.impl.sdk.t.a()) {
                nn nnVar3 = nn.this;
                nnVar3.c.a(nnVar3.b, "Reward validation succeeded with code " + i + " and response: " + jSONObject);
            }
            nn.this.c(jSONObject);
        }
    }

    @Override // java.lang.Runnable
    public void run() throws JSONException {
        a(e(), new a());
    }

    @Override // com.applovin.impl.jn
    protected int g() {
        return ((Integer) this.f1179a.a(oj.r1)).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(JSONObject jSONObject) {
        ch chVarB = b(jSONObject);
        a(chVarB);
        if (com.applovin.impl.sdk.t.a()) {
            this.c.a(this.b, "Pending reward handled: " + chVarB);
        }
    }

    private ch b(JSONObject jSONObject) {
        Map<String, String> mapEmptyMap;
        String string;
        JSONObject jSONObject2 = JsonUtils.getJSONObject(JsonUtils.getJSONArray(jSONObject, "results", new JSONArray()), 0, new JSONObject());
        c4.c(jSONObject2, this.f1179a);
        c4.b(jSONObject, this.f1179a);
        c4.a(jSONObject, this.f1179a);
        try {
            mapEmptyMap = JsonUtils.toStringMap((JSONObject) jSONObject2.get("params"));
        } catch (Throwable unused) {
            mapEmptyMap = Collections.emptyMap();
        }
        try {
            string = jSONObject2.getString("result");
        } catch (Throwable unused2) {
            string = "network_timeout";
        }
        return ch.a(string, mapEmptyMap);
    }
}
