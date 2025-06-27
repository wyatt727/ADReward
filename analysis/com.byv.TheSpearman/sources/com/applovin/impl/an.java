package com.applovin.impl;

import android.net.Uri;
import android.text.TextUtils;
import com.applovin.impl.pg;
import com.applovin.impl.sdk.AppLovinError;
import com.applovin.impl.sdk.nativeAd.AppLovinNativeAdLoadListener;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sm;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.adapter.parameters.MaxAdapterResponseParameters;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class an extends zm {
    private final AppLovinNativeAdLoadListener r;
    private final pg.a s;
    private String t;
    private String u;
    private String v;
    private String w;

    public an(JSONObject jSONObject, MaxAdapterResponseParameters maxAdapterResponseParameters, MaxAdFormat maxAdFormat, AppLovinNativeAdLoadListener appLovinNativeAdLoadListener, com.applovin.impl.sdk.k kVar) {
        super("TaskProcessTaboolaAd", jSONObject, maxAdapterResponseParameters, maxAdFormat, kVar);
        this.s = pg.o();
        this.t = "";
        this.u = "";
        this.v = "";
        this.w = null;
        this.r = appLovinNativeAdLoadListener;
    }

    @Override // java.lang.Runnable
    public void run() throws JSONException {
        JSONObject jSONObjectOptJSONObject;
        JSONArray jSONArray = JsonUtils.getJSONArray(this.h, "placements", new JSONArray());
        if (jSONArray.length() == 0) {
            if (com.applovin.impl.sdk.t.a()) {
                this.c.k("TaskProcessTaboolaAd", "No ads were returned from the server");
            }
            this.r.onNativeAdLoadFailed(AppLovinError.NO_FILL);
            return;
        }
        JSONObject jSONObject = JsonUtils.getJSONObject(jSONArray, 0, new JSONObject());
        JSONArray jSONArray2 = JsonUtils.getJSONArray(jSONObject, "list", new JSONArray());
        String string = JsonUtils.getString(jSONObject, "name", "");
        if (jSONArray2.length() == 0) {
            if (com.applovin.impl.sdk.t.a()) {
                this.c.k("TaskProcessTaboolaAd", "No ads were returned from the server");
            }
            this.r.onNativeAdLoadFailed(AppLovinError.NO_FILL);
            return;
        }
        JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONArray2, 0, new JSONObject());
        this.t = JsonUtils.getString(jSONObject2, "id", "");
        if (com.applovin.impl.sdk.t.a()) {
            this.c.a("TaskProcessTaboolaAd", "Processing Taboola ad (" + this.t + ") for placement: " + string + "...");
        }
        this.u = JsonUtils.getString(jSONObject2, "type", "");
        this.v = JsonUtils.getString(jSONObject2, "origin", "");
        this.w = JsonUtils.getString(jSONObject2, "discloser", null);
        this.s.f("Taboola_2.0");
        this.s.e(JsonUtils.getString(jSONObject2, "name", ""));
        this.s.a(JsonUtils.getString(jSONObject2, "branding", ""));
        this.s.b(JsonUtils.getString(jSONObject2, "description", ""));
        this.s.c(JsonUtils.getString(jSONObject2, "url", null));
        JSONArray jSONArray3 = JsonUtils.getJSONArray(jSONObject2, "thumbnail", new JSONArray());
        if (jSONArray3.length() > 0 && (jSONObjectOptJSONObject = jSONArray3.optJSONObject(0)) != null) {
            this.s.d(JsonUtils.getString(jSONObjectOptJSONObject, "url", null));
            this.s.b(JsonUtils.getInt(jSONObjectOptJSONObject, "width", 0));
            this.s.a(JsonUtils.getInt(jSONObjectOptJSONObject, "height", 0));
        }
        JSONArray jSONArray4 = JsonUtils.getJSONArray(jSONObject2, "beacons", null);
        JSONObject jSONObject3 = JsonUtils.getJSONObject(jSONObject, "events", (JSONObject) null);
        JSONArray jSONArray5 = JsonUtils.getJSONArray(JsonUtils.getJSONObject(this.h, "user", (JSONObject) null), "beacons", null);
        this.s.a(a(jSONObject3, jSONArray4));
        this.s.b(a(jSONArray4, jSONArray5));
        this.s.a(a(jSONObject3, jSONArray4, jSONArray5));
        JSONObject jSONObjectA = a(h());
        if (com.applovin.impl.sdk.t.a()) {
            this.c.a("TaskProcessTaboolaAd", "Starting render task for Taboola ad: " + string + "...");
        }
        this.k.l0().a((xl) new xm(jSONObjectA, this.r, this.k), sm.b.CORE);
    }

    protected JSONObject h() throws JSONException {
        JSONObject jSONObjectA = a(this.s.a());
        JsonUtils.putString(jSONObjectA, "cache_prefix", "taboola_");
        JsonUtils.putString(jSONObjectA, "type", "taboola");
        JsonUtils.putString(jSONObjectA, CampaignEx.JSON_KEY_PRIVACY_URL, this.w);
        return jSONObjectA;
    }

    private String a(Object obj, String str, String str2) {
        if (!(obj instanceof JSONObject)) {
            return null;
        }
        JSONObject jSONObject = (JSONObject) obj;
        String string = JsonUtils.getString(jSONObject, "onEvent", "");
        String string2 = JsonUtils.getString(jSONObject, "type", "");
        if (StringUtils.isValidString(str) && !str.equalsIgnoreCase(string)) {
            return null;
        }
        if (!StringUtils.isValidString(str2) || str2.equalsIgnoreCase(string2)) {
            return JsonUtils.getString(jSONObject, "value", null);
        }
        return null;
    }

    private JSONArray a(JSONObject jSONObject, JSONArray jSONArray) {
        JSONArray jSONArray2 = new JSONArray();
        String string = JsonUtils.getString(jSONObject, CampaignEx.JSON_NATIVE_VIDEO_CLICK, null);
        if (StringUtils.isValidString(string)) {
            if (com.applovin.impl.sdk.t.a()) {
                this.c.a("TaskProcessTaboolaAd", "Processed click tracking URL: " + string);
            }
            jSONArray2.put(string);
        }
        if (jSONArray != null) {
            for (int i = 0; i < jSONArray.length(); i++) {
                String strA = a(JsonUtils.getObjectAtIndex(jSONArray, i, null), CampaignEx.JSON_NATIVE_VIDEO_CLICK, "pixel");
                if (!TextUtils.isEmpty(strA)) {
                    if (com.applovin.impl.sdk.t.a()) {
                        this.c.a("TaskProcessTaboolaAd", "Processed click tracking URL: " + strA);
                    }
                    jSONArray2.put(strA);
                }
            }
        }
        return jSONArray2;
    }

    private List a(JSONObject jSONObject, JSONArray jSONArray, JSONArray jSONArray2) {
        ArrayList arrayList = new ArrayList();
        String string = JsonUtils.getString(jSONObject, "available", null);
        if (StringUtils.isValidString(string)) {
            if (com.applovin.impl.sdk.t.a()) {
                this.c.a("TaskProcessTaboolaAd", "Processed impression URL: " + string);
            }
            arrayList.add(string);
        }
        String string2 = JsonUtils.getString(jSONObject, "visible", null);
        if (StringUtils.isValidString(string2)) {
            if (com.applovin.impl.sdk.t.a()) {
                this.c.a("TaskProcessTaboolaAd", "Processed impression URL: " + string2);
            }
            arrayList.add(string2);
        }
        if (jSONArray != null) {
            for (int i = 0; i < jSONArray.length(); i++) {
                Object objectAtIndex = JsonUtils.getObjectAtIndex(jSONArray, i, null);
                String strA = a(objectAtIndex, "available", "pixel");
                if (!StringUtils.isValidString(strA)) {
                    strA = a(objectAtIndex, "visible", "pixel");
                }
                if (!TextUtils.isEmpty(strA)) {
                    if (com.applovin.impl.sdk.t.a()) {
                        this.c.a("TaskProcessTaboolaAd", "Processed impression URL: " + strA);
                    }
                    arrayList.add(strA);
                }
            }
        }
        if (jSONArray2 != null) {
            for (int i2 = 0; i2 < jSONArray2.length(); i2++) {
                String strA2 = a(JsonUtils.getObjectAtIndex(jSONArray2, i2, null), (String) null, "pixel");
                if (!TextUtils.isEmpty(strA2)) {
                    if (com.applovin.impl.sdk.t.a()) {
                        this.c.a("TaskProcessTaboolaAd", "Processed impression URL: " + strA2);
                    }
                    arrayList.add(strA2);
                }
            }
        }
        return arrayList;
    }

    private List a(JSONArray jSONArray, JSONArray jSONArray2) {
        ArrayList arrayList = new ArrayList();
        if (jSONArray != null) {
            for (int i = 0; i < jSONArray.length(); i++) {
                String strA = a(JsonUtils.getObjectAtIndex(jSONArray, i, null), (String) null, "script");
                if (!TextUtils.isEmpty(strA)) {
                    arrayList.add(Uri.decode(strA));
                }
            }
        }
        if (jSONArray2 != null) {
            for (int i2 = 0; i2 < jSONArray2.length(); i2++) {
                String strA2 = a(JsonUtils.getObjectAtIndex(jSONArray2, i2, null), (String) null, "script");
                if (!TextUtils.isEmpty(strA2)) {
                    arrayList.add(Uri.decode(strA2));
                }
            }
        }
        return arrayList;
    }
}
