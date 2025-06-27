package com.applovin.impl;

import androidx.core.app.NotificationCompat;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.adapter.parameters.MaxAdapterResponseParameters;
import com.applovin.sdk.AppLovinAdSize;
import com.applovin.sdk.AppLovinAdType;
import com.google.android.exoplayer2.upstream.CmcdHeadersFactory;
import com.my.tracker.ads.AdFormat;
import com.vungle.ads.internal.model.AdPayload;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class zm extends xl {
    private static JSONObject o;
    private static JSONObject p;
    private static JSONObject q;
    protected final JSONObject h;
    protected final MaxAdapterResponseParameters i;
    protected final MaxAdFormat j;
    protected final com.applovin.impl.sdk.k k;
    private final AppLovinAdSize l;
    private final AppLovinAdType m;
    protected String n;

    private JSONObject e() throws JSONException {
        JSONObject jSONObject = o;
        if (jSONObject != null) {
            return jSONObject;
        }
        JSONObject jSONObject2 = new JSONObject();
        JsonUtils.putInt(jSONObject2, "ad_id", 0);
        JsonUtils.putString(jSONObject2, "base_url", AdPayload.FILE_SCHEME);
        JsonUtils.putString(jSONObject2, "graphic_background_color", "#000000");
        JsonUtils.putBoolean(jSONObject2, "lock_current_orientation", true);
        JsonUtils.putBoolean(jSONObject2, "omsdk_enabled", false);
        JsonUtils.putBoolean(jSONObject2, "playback_requires_user_action", true);
        JsonUtils.putString(jSONObject2, "presentation_mode", "activity");
        JsonUtils.putBoolean(jSONObject2, "unhide_adview_on_render", true);
        JsonUtils.putJSONObject(jSONObject2, "web_view_settings", g());
        o = jSONObject2;
        return jSONObject2;
    }

    private JSONObject f() throws JSONException {
        JSONObject jSONObject = p;
        if (jSONObject != null) {
            return jSONObject;
        }
        JSONObject jSONObject2 = new JSONObject();
        JsonUtils.putInt(jSONObject2, "ad_id", 0);
        JsonUtils.putBoolean(jSONObject2, "uerp", true);
        JsonUtils.putString(jSONObject2, "presentation_mode", "activity");
        JsonUtils.putJSONObject(jSONObject2, "web_view_settings", g());
        p = jSONObject2;
        return jSONObject2;
    }

    private static JSONObject g() throws JSONException {
        JSONObject jSONObject = q;
        if (jSONObject != null) {
            return jSONObject;
        }
        JSONObject jSONObject2 = new JSONObject();
        JsonUtils.putBoolean(jSONObject2, "allow_file_access", true);
        q = jSONObject2;
        return jSONObject2;
    }

    private JSONObject e(pg pgVar) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        JsonUtils.putString(jSONObject, "url", pgVar.r());
        JsonUtils.putJsonArray(jSONObject, "clicktrackers", pgVar.s());
        return jSONObject;
    }

    public zm(String str, JSONObject jSONObject, MaxAdapterResponseParameters maxAdapterResponseParameters, MaxAdFormat maxAdFormat, com.applovin.impl.sdk.k kVar) {
        super(str, kVar);
        this.h = jSONObject;
        this.i = maxAdapterResponseParameters;
        this.j = maxAdFormat;
        this.k = kVar;
        this.l = a(maxAdFormat);
        this.m = b(maxAdFormat);
    }

    protected JSONObject a(String str, JSONObject jSONObject, JSONObject jSONObject2) throws JSONException {
        JSONObject jSONObjectE = e();
        JsonUtils.putAll(jSONObjectE, JsonUtils.deserialize(this.i.getServerParameters().getString("ad_object")));
        JsonUtils.putString(jSONObjectE, "html", str);
        JsonUtils.putJSONObject(jSONObjectE, "click_tracking_urls", jSONObject);
        JsonUtils.putJSONObject(jSONObjectE, "imp_urls", jSONObject2);
        return jSONObjectE;
    }

    private JSONArray c(pg pgVar) throws JSONException {
        JSONArray jSONArray = new JSONArray();
        JSONObject jSONObject = new JSONObject();
        JsonUtils.putInt(jSONObject, "id", 1);
        JSONObject jSONObject2 = new JSONObject();
        JsonUtils.putString(jSONObject2, "text", pgVar.y());
        JsonUtils.putJSONObject(jSONObject, "title", jSONObject2);
        jSONArray.put(jSONObject);
        JSONObject jSONObject3 = new JSONObject();
        JsonUtils.putInt(jSONObject3, "id", 8);
        JSONObject jSONObject4 = new JSONObject();
        JsonUtils.putString(jSONObject4, "value", pgVar.p());
        JsonUtils.putJSONObject(jSONObject3, "data", jSONObject4);
        jSONArray.put(jSONObject3);
        JSONObject jSONObject5 = new JSONObject();
        JsonUtils.putInt(jSONObject5, "id", 4);
        JSONObject jSONObject6 = new JSONObject();
        JsonUtils.putString(jSONObject6, "value", pgVar.q());
        JsonUtils.putJSONObject(jSONObject5, "data", jSONObject6);
        jSONArray.put(jSONObject5);
        if (StringUtils.isValidString(pgVar.w())) {
            JSONObject jSONObject7 = new JSONObject();
            JsonUtils.putInt(jSONObject7, "id", 2);
            JSONObject jSONObject8 = new JSONObject();
            JsonUtils.putString(jSONObject8, "url", pgVar.w());
            JsonUtils.putInt(jSONObject8, "w", pgVar.x());
            JsonUtils.putInt(jSONObject8, CmcdHeadersFactory.STREAMING_FORMAT_HLS, pgVar.v());
            JsonUtils.putJSONObject(jSONObject7, "img", jSONObject8);
            jSONArray.put(jSONObject7);
        }
        return jSONArray;
    }

    protected JSONObject a(pg pgVar) throws JSONException {
        JSONObject jSONObjectF = f();
        JsonUtils.putAll(jSONObjectF, JsonUtils.deserialize(this.i.getServerParameters().getString("ad_object")));
        JsonUtils.putJSONObject(jSONObjectF, "ortb_response", b(pgVar));
        return jSONObjectF;
    }

    private JSONArray d(pg pgVar) throws JSONException {
        JSONArray jSONArray = new JSONArray();
        for (String str : pgVar.t()) {
            JSONObject jSONObject = new JSONObject();
            JsonUtils.putString(jSONObject, "url", str);
            JsonUtils.putInt(jSONObject, NotificationCompat.CATEGORY_EVENT, 1);
            JsonUtils.putInt(jSONObject, "method", 1);
            jSONArray.put(jSONObject);
        }
        for (String str2 : pgVar.u()) {
            JSONObject jSONObject2 = new JSONObject();
            JsonUtils.putString(jSONObject2, "url", str2);
            JsonUtils.putInt(jSONObject2, "type", 1);
            JsonUtils.putInt(jSONObject2, "method", 2);
            jSONArray.put(jSONObject2);
        }
        return jSONArray;
    }

    private static AppLovinAdType b(MaxAdFormat maxAdFormat) {
        if (!maxAdFormat.isAdViewAd() && MaxAdFormat.INTERSTITIAL != maxAdFormat) {
            if (MaxAdFormat.NATIVE == maxAdFormat) {
                return AppLovinAdType.NATIVE;
            }
            if (MaxAdFormat.REWARDED == maxAdFormat) {
                return AppLovinAdType.INCENTIVIZED;
            }
            if (MaxAdFormat.REWARDED_INTERSTITIAL == maxAdFormat) {
                return AppLovinAdType.AUTO_INCENTIVIZED;
            }
            if (MaxAdFormat.APP_OPEN == maxAdFormat) {
                return AppLovinAdType.APP_OPEN;
            }
            throw new IllegalArgumentException("Unsupported ad format: " + maxAdFormat);
        }
        return AppLovinAdType.REGULAR;
    }

    private JSONObject b(pg pgVar) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        JsonUtils.putJsonArray(jSONObject, "assets", c(pgVar));
        JsonUtils.putJSONObject(jSONObject, "link", e(pgVar));
        JsonUtils.putJsonArray(jSONObject, "eventtrackers", d(pgVar));
        JsonUtils.putString(jSONObject, "ver", pgVar.z());
        JSONObject jSONObject2 = new JSONObject();
        JsonUtils.putJSONObject(jSONObject2, AdFormat.NATIVE, jSONObject);
        JSONObject jSONObject3 = new JSONObject();
        JsonUtils.putString(jSONObject3, "version", pgVar.z());
        JsonUtils.putJSONObject(jSONObject3, "value", jSONObject2);
        return jSONObject3;
    }

    private static AppLovinAdSize a(MaxAdFormat maxAdFormat) {
        if (maxAdFormat.isFullscreenAd()) {
            return AppLovinAdSize.INTERSTITIAL;
        }
        if (MaxAdFormat.BANNER == maxAdFormat) {
            return AppLovinAdSize.BANNER;
        }
        if (MaxAdFormat.LEADER == maxAdFormat) {
            return AppLovinAdSize.LEADER;
        }
        if (MaxAdFormat.MREC == maxAdFormat) {
            return AppLovinAdSize.MREC;
        }
        if (MaxAdFormat.NATIVE == maxAdFormat) {
            return AppLovinAdSize.NATIVE;
        }
        throw new IllegalArgumentException("Unsupported ad format: " + maxAdFormat);
    }

    protected JSONObject a(JSONObject jSONObject) throws JSONException {
        JSONObject jSONObject2 = new JSONObject();
        JsonUtils.putString(jSONObject2, "ad_size", this.l.toString());
        JsonUtils.putString(jSONObject2, "ad_type", this.m.toString());
        JsonUtils.putString(jSONObject2, "dsp_name", this.n);
        JsonUtils.putInt(jSONObject2, "status", 200);
        JSONArray jSONArray = new JSONArray();
        jSONArray.put(jSONObject);
        JsonUtils.putJsonArray(jSONObject2, com.mbridge.msdk.foundation.entity.b.JSON_KEY_ADS, jSONArray);
        return jSONObject2;
    }
}
