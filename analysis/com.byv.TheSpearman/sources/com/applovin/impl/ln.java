package com.applovin.impl;

import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.AppLovinUtils;
import com.applovin.sdk.AppLovinAdRewardListener;
import com.applovin.sdk.AppLovinErrorCodes;
import java.util.Collections;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class ln extends nn {
    private final com.applovin.impl.sdk.ad.b h;
    private final AppLovinAdRewardListener i;

    @Override // com.applovin.impl.jn
    public String f() {
        return "2.0/vr";
    }

    public ln(com.applovin.impl.sdk.ad.b bVar, AppLovinAdRewardListener appLovinAdRewardListener, com.applovin.impl.sdk.k kVar) {
        super("TaskValidateAppLovinReward", kVar);
        this.h = bVar;
        this.i = appLovinAdRewardListener;
    }

    @Override // com.applovin.impl.nn
    protected void a(ch chVar) {
        this.h.a(chVar);
        String strB = chVar.b();
        Map<String, String> mapA = chVar.a();
        if (strB.equals("accepted")) {
            this.i.userRewardVerified(this.h, mapA);
            return;
        }
        if (strB.equals("quota_exceeded")) {
            this.i.userOverQuota(this.h, mapA);
        } else if (strB.equals("rejected")) {
            this.i.userRewardRejected(this.h, mapA);
        } else {
            this.i.validationRequestFailed(this.h, AppLovinErrorCodes.INCENTIVIZED_UNKNOWN_SERVER_ERROR);
        }
    }

    @Override // com.applovin.impl.nn
    protected boolean h() {
        return this.h.O0();
    }

    @Override // com.applovin.impl.jn
    protected void a(int i) {
        String str;
        super.a(i);
        if (i >= 400 && i < 500) {
            this.i.userRewardRejected(this.h, Collections.emptyMap());
            str = "rejected";
        } else {
            this.i.validationRequestFailed(this.h, i);
            str = "network_timeout";
        }
        this.h.a(ch.a(str));
    }

    @Override // com.applovin.impl.jn
    protected void a(JSONObject jSONObject) throws JSONException {
        JsonUtils.putString(jSONObject, AppLovinUtils.ServerParameterKeys.ZONE_ID, this.h.getAdZone().e());
        String clCode = this.h.getClCode();
        if (!StringUtils.isValidString(clCode)) {
            clCode = "NO_CLCODE";
        }
        JsonUtils.putString(jSONObject, "clcode", clCode);
    }
}
