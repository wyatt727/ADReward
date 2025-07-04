package com.applovin.impl.sdk.nativeAd;

import android.text.TextUtils;
import com.applovin.impl.bc;
import com.applovin.impl.c4;
import com.applovin.impl.mm;
import com.applovin.impl.sdk.AppLovinError;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.t;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sm;
import com.applovin.impl.w;
import com.applovin.impl.xl;
import com.applovin.impl.xm;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class AppLovinNativeAdService {
    private static final String TAG = "AppLovinNativeAdService";
    private final t logger;
    private final k sdk;

    public AppLovinNativeAdService(k kVar) {
        this.sdk = kVar;
        this.logger = kVar.L();
    }

    public void loadNextAdForAdToken(String str, AppLovinNativeAdLoadListener appLovinNativeAdLoadListener) {
        String strTrim = str != null ? str.trim() : null;
        if (TextUtils.isEmpty(strTrim)) {
            t.h(TAG, "Empty ad token");
            bc.b(appLovinNativeAdLoadListener, new AppLovinError(-8, "Empty ad token"));
            return;
        }
        w wVar = new w(strTrim, this.sdk);
        if (wVar.c() == w.a.REGULAR) {
            if (t.a()) {
                this.logger.a(TAG, "Loading next ad for token: " + wVar);
            }
            this.sdk.l0().a((xl) new mm(wVar, appLovinNativeAdLoadListener, this.sdk), sm.b.CORE);
            return;
        }
        if (wVar.c() != w.a.AD_RESPONSE_JSON) {
            AppLovinError appLovinError = new AppLovinError(-8, "Invalid token type");
            t.h(TAG, "Invalid token type");
            bc.b(appLovinNativeAdLoadListener, appLovinError);
            return;
        }
        JSONObject jSONObjectA = wVar.a();
        if (jSONObjectA == null) {
            String str2 = "Unable to retrieve ad response JSON from token: " + wVar.b();
            AppLovinError appLovinError2 = new AppLovinError(-8, str2);
            t.h(TAG, str2);
            bc.b(appLovinNativeAdLoadListener, appLovinError2);
            return;
        }
        c4.c(jSONObjectA, this.sdk);
        c4.b(jSONObjectA, this.sdk);
        c4.a(jSONObjectA, this.sdk);
        if (JsonUtils.getJSONArray(jSONObjectA, com.mbridge.msdk.foundation.entity.b.JSON_KEY_ADS, new JSONArray()).length() > 0) {
            if (t.a()) {
                this.logger.a(TAG, "Rendering ad for token: " + wVar);
            }
            this.sdk.l0().a((xl) new xm(jSONObjectA, appLovinNativeAdLoadListener, this.sdk), sm.b.CORE);
            return;
        }
        if (t.a()) {
            this.logger.b(TAG, "No ad returned from the server for token: " + wVar);
        }
        bc.b(appLovinNativeAdLoadListener, AppLovinError.NO_FILL);
    }
}
