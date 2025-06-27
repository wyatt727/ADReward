package com.applovin.impl;

import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.google.ads.mediation.mintegral.MintegralConstants;
import com.google.firebase.analytics.FirebaseAnalytics;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class mn extends nn {
    private final de h;

    @Override // com.applovin.impl.jn
    protected String f() {
        return "2.0/mvr";
    }

    public mn(de deVar, com.applovin.impl.sdk.k kVar) {
        super("TaskValidateMaxReward", kVar);
        this.h = deVar;
    }

    @Override // com.applovin.impl.nn
    protected void a(ch chVar) {
        this.h.a(chVar);
    }

    @Override // com.applovin.impl.nn
    protected boolean h() {
        return this.h.o0();
    }

    @Override // com.applovin.impl.jn
    protected void a(int i) {
        super.a(i);
        this.h.a(ch.a((i < 400 || i >= 500) ? "network_timeout" : "rejected"));
    }

    @Override // com.applovin.impl.jn
    protected void a(JSONObject jSONObject) throws JSONException {
        JsonUtils.putString(jSONObject, MintegralConstants.AD_UNIT_ID, this.h.getAdUnitId());
        JsonUtils.putString(jSONObject, "placement", this.h.getPlacement());
        JsonUtils.putString(jSONObject, "custom_data", this.h.e());
        JsonUtils.putString(jSONObject, FirebaseAnalytics.Param.AD_FORMAT, this.h.getFormat().getLabel());
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
