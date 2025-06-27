package com.applovin.impl;

import com.applovin.impl.sdk.AppLovinError;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdLoadListener;
import com.applovin.sdk.AppLovinErrorCodes;
import com.google.android.gms.ads.AdError;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class tm extends xl implements mb {
    private final JSONObject h;
    private final h0 i;
    private final AppLovinAdLoadListener j;

    public tm(JSONObject jSONObject, h0 h0Var, AppLovinAdLoadListener appLovinAdLoadListener, com.applovin.impl.sdk.k kVar) {
        super("TaskProcessAdResponse", kVar);
        if (jSONObject == null) {
            throw new IllegalArgumentException("No response specified");
        }
        if (h0Var != null) {
            this.h = jSONObject;
            this.i = h0Var;
            this.j = appLovinAdLoadListener;
            return;
        }
        throw new IllegalArgumentException("No zone specified");
    }

    @Override // java.lang.Runnable
    public void run() throws JSONException {
        JSONArray jSONArray = JsonUtils.getJSONArray(this.h, com.mbridge.msdk.foundation.entity.b.JSON_KEY_ADS, new JSONArray());
        if (jSONArray.length() > 0) {
            if (com.applovin.impl.sdk.t.a()) {
                this.c.a(this.b, "Processing ad...");
            }
            a(JsonUtils.getJSONObject(jSONArray, 0, new JSONObject()));
        } else {
            if (com.applovin.impl.sdk.t.a()) {
                this.c.k(this.b, "No ads were returned from the server");
            }
            zp.a(this.i.e(), this.i.d(), this.h, this.f1179a);
            failedToReceiveAdV2(AppLovinError.NO_FILL);
        }
    }

    private void a(JSONObject jSONObject) {
        String string = JsonUtils.getString(jSONObject, "type", AdError.UNDEFINED_DOMAIN);
        if ("applovin".equalsIgnoreCase(string)) {
            if (com.applovin.impl.sdk.t.a()) {
                this.c.a(this.b, "Starting task for AppLovin ad...");
            }
            this.f1179a.l0().a(new cn(jSONObject, this.h, this, this.f1179a));
            return;
        }
        if ("vast".equalsIgnoreCase(string)) {
            if (com.applovin.impl.sdk.t.a()) {
                this.c.a(this.b, "Starting task for VAST ad...");
            }
            this.f1179a.l0().a(bn.a(jSONObject, this.h, this, this.f1179a));
            return;
        }
        if ("js_tag".equalsIgnoreCase(string)) {
            if (com.applovin.impl.sdk.t.a()) {
                this.c.a(this.b, "Starting task for JS tag ad...");
            }
            this.f1179a.l0().a(new um(jSONObject, this.h, this, this.f1179a));
            return;
        }
        if (com.applovin.impl.sdk.t.a()) {
            this.c.b(this.b, "Unable to process ad of unknown type: " + string);
        }
        failedToReceiveAdV2(new AppLovinError(AppLovinErrorCodes.INVALID_RESPONSE, "Unknown ad type: " + string));
    }

    @Override // com.applovin.sdk.AppLovinAdLoadListener
    public void adReceived(AppLovinAd appLovinAd) {
        AppLovinAdLoadListener appLovinAdLoadListener = this.j;
        if (appLovinAdLoadListener != null) {
            appLovinAdLoadListener.adReceived(appLovinAd);
        }
    }

    @Override // com.applovin.sdk.AppLovinAdLoadListener
    public void failedToReceiveAd(int i) {
        failedToReceiveAdV2(new AppLovinError(i, ""));
    }

    @Override // com.applovin.impl.mb
    public void failedToReceiveAdV2(AppLovinError appLovinError) {
        AppLovinAdLoadListener appLovinAdLoadListener = this.j;
        if (appLovinAdLoadListener == null) {
            return;
        }
        if (appLovinAdLoadListener instanceof mb) {
            ((mb) appLovinAdLoadListener).failedToReceiveAdV2(appLovinError);
        } else {
            appLovinAdLoadListener.failedToReceiveAd(appLovinError.getCode());
        }
    }
}
