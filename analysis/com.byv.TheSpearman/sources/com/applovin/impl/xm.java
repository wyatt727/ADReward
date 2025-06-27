package com.applovin.impl;

import com.applovin.impl.sdk.AppLovinError;
import com.applovin.impl.sdk.nativeAd.AppLovinNativeAdLoadListener;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.mediation.MaxAdFormat;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class xm extends xl {
    private final JSONObject h;
    private final AppLovinNativeAdLoadListener i;

    public xm(JSONObject jSONObject, AppLovinNativeAdLoadListener appLovinNativeAdLoadListener, com.applovin.impl.sdk.k kVar) {
        super("TaskProcessNativeAdResponse", kVar);
        this.h = jSONObject;
        this.i = appLovinNativeAdLoadListener;
    }

    @Override // java.lang.Runnable
    public void run() throws JSONException {
        JSONArray jSONArray = JsonUtils.getJSONArray(this.h, com.mbridge.msdk.foundation.entity.b.JSON_KEY_ADS, new JSONArray());
        if (jSONArray.length() > 0) {
            if (com.applovin.impl.sdk.t.a()) {
                this.c.a(this.b, "Processing ad...");
            }
            this.f1179a.l0().a(new com.applovin.impl.sdk.nativeAd.b(JsonUtils.getJSONObject(jSONArray, 0, new JSONObject()), this.h, this.i, this.f1179a));
            return;
        }
        if (com.applovin.impl.sdk.t.a()) {
            this.c.k(this.b, "No ads were returned from the server");
        }
        zp.a("native_native", MaxAdFormat.NATIVE, this.h, this.f1179a);
        this.i.onNativeAdLoadFailed(AppLovinError.NO_FILL);
    }
}
