package com.applovin.impl;

import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.google.ads.mediation.mintegral.MintegralConstants;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class gn extends hn {
    private final de h;

    @Override // com.applovin.impl.hn
    protected void b(JSONObject jSONObject) {
        if (com.applovin.impl.sdk.t.a()) {
            this.c.a(this.b, "Reported reward successfully for mediated ad: " + this.h);
        }
    }

    @Override // com.applovin.impl.jn
    protected String f() {
        return "2.0/mcr";
    }

    @Override // com.applovin.impl.hn
    protected void i() {
        if (com.applovin.impl.sdk.t.a()) {
            this.c.b(this.b, "No reward result was found for mediated ad: " + this.h);
        }
    }

    public gn(de deVar, com.applovin.impl.sdk.k kVar) {
        super("TaskReportMaxReward", kVar);
        this.h = deVar;
    }

    @Override // com.applovin.impl.hn
    protected ch h() {
        return this.h.h0();
    }

    @Override // com.applovin.impl.jn
    protected void a(int i) {
        super.a(i);
        if (com.applovin.impl.sdk.t.a()) {
            this.c.a(this.b, "Failed to report reward for mediated ad: " + this.h + " - error code: " + i);
        }
    }

    @Override // com.applovin.impl.jn
    protected void a(JSONObject jSONObject) throws JSONException {
        JsonUtils.putString(jSONObject, MintegralConstants.AD_UNIT_ID, this.h.getAdUnitId());
        JsonUtils.putString(jSONObject, "placement", this.h.getPlacement());
        JsonUtils.putString(jSONObject, "custom_data", this.h.e());
        String strL0 = this.h.l0();
        if (!StringUtils.isValidString(strL0)) {
            strL0 = "NO_MCODE";
        }
        JsonUtils.putString(jSONObject, "mcode", strL0);
        String strA = this.h.A();
        if (!StringUtils.isValidString(strA)) {
            strA = "NO_BCODE";
        }
        JsonUtils.putString(jSONObject, "bcode", strA);
    }
}
