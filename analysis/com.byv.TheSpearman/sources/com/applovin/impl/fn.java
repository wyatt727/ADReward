package com.applovin.impl;

import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.AppLovinUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class fn extends hn {
    private final com.applovin.impl.sdk.ad.b h;

    @Override // com.applovin.impl.hn
    protected void b(JSONObject jSONObject) {
        if (com.applovin.impl.sdk.t.a()) {
            this.c.a(this.b, "Reported reward successfully for ad: " + this.h);
        }
    }

    @Override // com.applovin.impl.jn
    protected String f() {
        return "2.0/cr";
    }

    @Override // com.applovin.impl.hn
    protected void i() {
        if (com.applovin.impl.sdk.t.a()) {
            this.c.b(this.b, "No reward result was found for ad: " + this.h);
        }
    }

    public fn(com.applovin.impl.sdk.ad.b bVar, com.applovin.impl.sdk.k kVar) {
        super("TaskReportAppLovinReward", kVar);
        this.h = bVar;
    }

    @Override // com.applovin.impl.hn
    protected ch h() {
        return this.h.f();
    }

    @Override // com.applovin.impl.jn
    protected void a(int i) {
        super.a(i);
        if (com.applovin.impl.sdk.t.a()) {
            this.c.b(this.b, "Failed to report reward for ad: " + this.h + " - error code: " + i);
        }
    }

    @Override // com.applovin.impl.jn
    protected void a(JSONObject jSONObject) throws JSONException {
        JsonUtils.putString(jSONObject, AppLovinUtils.ServerParameterKeys.ZONE_ID, this.h.getAdZone().e());
        JsonUtils.putInt(jSONObject, "fire_percent", this.h.V());
        String clCode = this.h.getClCode();
        if (!StringUtils.isValidString(clCode)) {
            clCode = "NO_CLCODE";
        }
        JsonUtils.putString(jSONObject, "clcode", clCode);
    }
}
