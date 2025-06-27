package com.applovin.impl;

import android.text.TextUtils;
import com.applovin.impl.sdk.ad.AppLovinAdImpl;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sm;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.adapter.parameters.MaxAdapterResponseParameters;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdLoadListener;
import com.json.t2;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class ym extends zm implements AppLovinAdLoadListener {
    private final String r;
    private final AppLovinAdLoadListener s;
    private String t;
    private JSONObject u;
    private JSONObject v;
    private String w;

    private JSONObject i() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        JsonUtils.putString(jSONObject, "Nimbus-Session-Id", this.r);
        return jSONObject;
    }

    public ym(JSONObject jSONObject, MaxAdapterResponseParameters maxAdapterResponseParameters, MaxAdFormat maxAdFormat, String str, AppLovinAdLoadListener appLovinAdLoadListener, com.applovin.impl.sdk.k kVar) {
        super("TaskProcessNimbusAd", jSONObject, maxAdapterResponseParameters, maxAdFormat, kVar);
        this.r = str;
        this.s = appLovinAdLoadListener;
    }

    @Override // java.lang.Runnable
    public void run() throws JSONException {
        String string = JsonUtils.getString(this.h, "markup", "");
        this.t = string;
        if (TextUtils.isEmpty(string)) {
            this.s.failedToReceiveAd(204);
            return;
        }
        String string2 = JsonUtils.getString(this.h, t2.h.L, "");
        String string3 = JsonUtils.getString(this.h, "placement_id", "");
        String string4 = JsonUtils.getString(this.h, "auction_id", "");
        if (com.applovin.impl.sdk.t.a()) {
            this.c.a("TaskProcessNimbusAd", "Processing Nimbus ad (" + string2 + ") for placement: " + string3 + " with auction id: " + string4 + "...");
        }
        this.n = JsonUtils.getString(this.h, "network", "");
        this.w = JsonUtils.getString(this.h, "crid", null);
        JSONObject jSONObject = JsonUtils.getJSONObject(this.h, "trackers", new JSONObject());
        this.v = a(JsonUtils.getJSONArray(jSONObject, "click_trackers", null));
        this.u = a(JsonUtils.getJSONArray(jSONObject, "impression_trackers", null));
        JSONObject jSONObjectH = h();
        JSONObject jSONObjectA = a(jSONObjectH);
        if (com.applovin.impl.sdk.t.a()) {
            this.c.a("TaskProcessNimbusAd", "Starting render task for Nimbus ad: " + string2 + "...");
        }
        this.k.l0().a((xl) new cn(jSONObjectH, jSONObjectA, this.s, this.k), sm.b.CORE);
    }

    protected JSONObject h() throws JSONException {
        JSONObject jSONObjectA = a(this.t, this.v, this.u);
        JsonUtils.putString(jSONObjectA, "cache_prefix", "nimbus");
        JsonUtils.putString(jSONObjectA, "type", "nimbus");
        JsonUtils.putJSONObject(jSONObjectA, "http_headers_for_postbacks", i());
        return jSONObjectA;
    }

    private JSONObject a(JSONArray jSONArray) throws JSONException {
        if (jSONArray == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        for (int i = 0; i < jSONArray.length(); i++) {
            try {
                String string = jSONArray.getString(i);
                if (!TextUtils.isEmpty(string)) {
                    jSONObject.put(string, "");
                }
            } catch (JSONException e) {
                this.k.L();
                if (com.applovin.impl.sdk.t.a()) {
                    this.k.L().a(this.b, "Failed to retrieve tracking url with a non-String value.", e);
                }
            }
        }
        return jSONObject;
    }

    @Override // com.applovin.sdk.AppLovinAdLoadListener
    public void adReceived(AppLovinAd appLovinAd) {
        ((AppLovinAdImpl) appLovinAd).setMaxAdValue(CampaignEx.JSON_KEY_CREATIVE_ID, this.w);
        this.s.adReceived(appLovinAd);
    }

    @Override // com.applovin.sdk.AppLovinAdLoadListener
    public void failedToReceiveAd(int i) {
        this.s.failedToReceiveAd(i);
    }
}
