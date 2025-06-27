package com.applovin.impl;

import android.net.Uri;
import android.webkit.URLUtil;
import com.applovin.impl.sdk.AppLovinError;
import com.applovin.impl.sdk.nativeAd.AppLovinNativeAdLoadListener;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.adapter.parameters.MaxAdapterInitializationParameters;
import com.applovin.mediation.adapter.parameters.MaxAdapterResponseParameters;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.json.t2;
import com.mbridge.msdk.MBridgeConstans;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class ul extends vi {
    public static final Uri j = Uri.parse("https://api.taboola.com/");
    private final String e;
    private final Uri f;
    private final Map g;
    private String h;
    private String i;

    public ul(String str, String str2, String str3, com.applovin.impl.sdk.k kVar) {
        super("TaboolaApiService", kVar);
        this.h = t2.a.e;
        this.i = "";
        this.e = str;
        this.f = Uri.withAppendedPath(URLUtil.isValidUrl(str3) ? Uri.parse(str3) : j, "2.0/json/" + str2);
        HashMap map = new HashMap(3);
        this.g = map;
        map.put("type", "mobile");
        map.put("apiKey", str);
        map.put("origin", "SERVER");
    }

    private JSONObject b(MaxAdapterResponseParameters maxAdapterResponseParameters) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        JsonUtils.putString(jSONObject, "type", maxAdapterResponseParameters.getCustomParameters().getString("source_type", ""));
        JsonUtils.putString(jSONObject, "id", maxAdapterResponseParameters.getCustomParameters().getString("source_id", ""));
        JsonUtils.putString(jSONObject, "url", maxAdapterResponseParameters.getCustomParameters().getString("source_url", ""));
        return jSONObject;
    }

    class a extends en {
        final /* synthetic */ MaxAdapterResponseParameters n;
        final /* synthetic */ AppLovinNativeAdLoadListener o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(com.applovin.impl.sdk.network.a aVar, com.applovin.impl.sdk.k kVar, MaxAdapterResponseParameters maxAdapterResponseParameters, AppLovinNativeAdLoadListener appLovinNativeAdLoadListener) {
            super(aVar, kVar);
            this.n = maxAdapterResponseParameters;
            this.o = appLovinNativeAdLoadListener;
        }

        @Override // com.applovin.impl.en, com.applovin.impl.b4.e
        public void a(String str, JSONObject jSONObject, int i) {
            if (i == 200 && jSONObject != null) {
                ul.this.h = JsonUtils.getString(JsonUtils.getJSONObject(jSONObject, "user", new JSONObject()), "session", "");
                this.f1179a.l0().a(new an(jSONObject, this.n, MaxAdFormat.NATIVE, this.o, this.f1179a));
                return;
            }
            if (com.applovin.impl.sdk.t.a()) {
                this.c.b(this.b, "Unable to fetch " + this.n.getThirdPartyAdPlacementId() + " Taboola ad: server returned " + i);
            }
            this.o.onNativeAdLoadFailed(new AppLovinError(i, "Taboola server returned with code: " + jSONObject));
        }

        @Override // com.applovin.impl.en, com.applovin.impl.b4.e
        public void a(String str, int i, String str2, JSONObject jSONObject) {
            if (com.applovin.impl.sdk.t.a()) {
                this.c.b(this.b, "Unable to fetch " + this.n.getThirdPartyAdPlacementId() + " Taboola ad: server returned " + i);
            }
            this.o.onNativeAdLoadFailed(new AppLovinError(i, "Taboola server returned with code: " + jSONObject));
        }
    }

    class b extends en {
        final /* synthetic */ vl n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(com.applovin.impl.sdk.network.a aVar, com.applovin.impl.sdk.k kVar, vl vlVar) {
            super(aVar, kVar);
            this.n = vlVar;
        }

        @Override // com.applovin.impl.en, com.applovin.impl.b4.e
        public void a(String str, JSONObject jSONObject, int i) {
            if (i == 200 && jSONObject != null) {
                ul.this.i = JsonUtils.getString(JsonUtils.getJSONObject(jSONObject, "user", new JSONObject()), "id", "");
                this.f1179a.b(rj.Q, ul.this.i, ul.this.c);
                this.f1179a.b(rj.R, Long.valueOf(System.currentTimeMillis()), ul.this.c);
                this.n.onInitialized(true, null);
                return;
            }
            String str2 = "Unable to fetch user id. Server returned " + i;
            if (com.applovin.impl.sdk.t.a()) {
                this.c.b(this.b, str2);
            }
            this.n.onInitialized(false, str2);
        }

        @Override // com.applovin.impl.en, com.applovin.impl.b4.e
        public void a(String str, int i, String str2, JSONObject jSONObject) {
            if (com.applovin.impl.sdk.t.a()) {
                this.c.b(this.b, "Unable to fetch user id. Server returned " + i);
            }
            this.n.onInitialized(false, str2);
        }
    }

    private JSONObject d() throws JSONException {
        Map mapA;
        JSONObject jSONObject = new JSONObject();
        if (this.f1096a.y() != null) {
            mapA = this.f1096a.y().b();
        } else {
            mapA = this.f1096a.x().A();
        }
        Object obj = mapA.get("IABTCF_gdprApplies");
        if (obj != null) {
            JsonUtils.putObject(jSONObject, "gdpr_applies", obj);
            JsonUtils.putString(jSONObject, "daisyBit", String.valueOf(mapA.get("IABTCF_TCString")));
        }
        return jSONObject;
    }

    private JSONObject d(MaxAdapterResponseParameters maxAdapterResponseParameters) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        JsonUtils.putString(jSONObject, "id", a(maxAdapterResponseParameters, "taboola_view_id", ""));
        return jSONObject;
    }

    private void a(vl vlVar) {
        HashMap map = new HashMap(2);
        map.put("app.type", "mobile");
        map.put("app.apikey", this.e);
        this.f1096a.l0().a(new b(com.applovin.impl.sdk.network.a.a(this.f1096a).b(this.f.toString() + "/user.sync").c("GET").b(map).a((Object) new JSONObject()).a(false).b(false).a(), this.f1096a, vlVar));
    }

    private JSONObject c(MaxAdapterResponseParameters maxAdapterResponseParameters) throws JSONException {
        Map mapL;
        if (this.f1096a.y() != null) {
            mapL = this.f1096a.y().d();
        } else {
            mapL = this.f1096a.x().l();
        }
        String strValueOf = String.valueOf(mapL.get(com.json.i5.R));
        String strValueOf2 = String.valueOf(mapL.get("idfa"));
        String str = this.h;
        Map<String, Object> localExtraParameters = maxAdapterResponseParameters.getLocalExtraParameters();
        if (localExtraParameters.containsKey("taboola_session")) {
            Object obj = localExtraParameters.get("taboola_session");
            if (obj instanceof String) {
                str = (String) obj;
            }
        }
        JSONObject jSONObject = new JSONObject();
        JsonUtils.putString(jSONObject, "session", str);
        JsonUtils.putString(jSONObject, "agent", strValueOf);
        JsonUtils.putString(jSONObject, t2.h.G, strValueOf2);
        JsonUtils.putString(jSONObject, "id", this.i);
        JsonUtils.putString(jSONObject, "realip", maxAdapterResponseParameters.getServerParameters().getString("s2s_ip", ""));
        return jSONObject;
    }

    private Integer a(MaxAdapterResponseParameters maxAdapterResponseParameters, String str, Integer num) {
        if (maxAdapterResponseParameters.getLocalExtraParameters().containsKey(str)) {
            Object obj = maxAdapterResponseParameters.getLocalExtraParameters().get(str);
            if (obj instanceof Integer) {
                return (Integer) obj;
            }
        }
        return Integer.valueOf(maxAdapterResponseParameters.getCustomParameters().getInt(str, num.intValue()));
    }

    private String a(MaxAdapterResponseParameters maxAdapterResponseParameters, String str, String str2) {
        if (maxAdapterResponseParameters.getLocalExtraParameters().containsKey(str)) {
            Object obj = maxAdapterResponseParameters.getLocalExtraParameters().get(str);
            if (obj instanceof String) {
                return (String) obj;
            }
        }
        return maxAdapterResponseParameters.getCustomParameters().getString(str, str2);
    }

    private JSONArray a(MaxAdapterResponseParameters maxAdapterResponseParameters) throws JSONException {
        JSONArray jSONArray = new JSONArray();
        JSONObject jSONObject = new JSONObject();
        JsonUtils.putString(jSONObject, "name", maxAdapterResponseParameters.getThirdPartyAdPlacementId());
        JsonUtils.putInt(jSONObject, "recCount", 1);
        JsonUtils.putString(jSONObject, "organicType", maxAdapterResponseParameters.getCustomParameters().getString("placement_type", "MIX"));
        Map<String, Object> localExtraParameters = maxAdapterResponseParameters.getLocalExtraParameters();
        if (localExtraParameters.containsKey("taboola_thumbnail_height") && localExtraParameters.containsKey("taboola_thumbnail_width")) {
            Integer numA = a(maxAdapterResponseParameters, "taboola_thumbnail_height", (Integer) 0);
            Integer numA2 = a(maxAdapterResponseParameters, "taboola_thumbnail_width", (Integer) 0);
            if (numA.intValue() > 0 && numA2.intValue() > 0) {
                JSONObject jSONObject2 = new JSONObject();
                JsonUtils.putInt(jSONObject2, "width", numA.intValue());
                JsonUtils.putInt(jSONObject2, "height", numA2.intValue());
                JsonUtils.putJSONObject(jSONObject, "thumbnail", jSONObject2);
            }
        }
        jSONArray.put(jSONObject);
        return jSONArray;
    }

    public void a(MaxAdapterInitializationParameters maxAdapterInitializationParameters, vl vlVar) {
        String str = (String) this.f1096a.a(rj.Q, (Object) null, this.c);
        Long l = (Long) this.f1096a.a(rj.R, (Object) null, this.c);
        if (!StringUtils.isValidString(str) || l == null) {
            a(vlVar);
        } else if (maxAdapterInitializationParameters.getServerParameters().getLong("user_id_expiration_millis", TimeUnit.DAYS.toMillis(30L)) - (System.currentTimeMillis() - l.longValue()) > TimeUnit.HOURS.toMillis(1L)) {
            this.i = str;
            vlVar.onInitialized(true, null);
        } else {
            a(vlVar);
        }
    }

    public void a(MaxAdapterResponseParameters maxAdapterResponseParameters, AppLovinNativeAdLoadListener appLovinNativeAdLoadListener) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        JsonUtils.putJSONObject(jSONObject, MBridgeConstans.DYNAMIC_VIEW_WX_APP, new JSONObject(this.g));
        JsonUtils.putJSONObject(jSONObject, "consent", d());
        JsonUtils.putJSONObject(jSONObject, "user", c(maxAdapterResponseParameters));
        JsonUtils.putJSONObject(jSONObject, FirebaseAnalytics.Param.SOURCE, b(maxAdapterResponseParameters));
        JsonUtils.putJSONObject(jSONObject, MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, d(maxAdapterResponseParameters));
        JsonUtils.putJsonArray(jSONObject, "placements", a(maxAdapterResponseParameters));
        this.f1096a.l0().a(new a(com.applovin.impl.sdk.network.a.a(this.f1096a).b(this.f.toString() + "/recommendations.get").c("POST").a(jSONObject).a((Object) new JSONObject()).a(false).b(false).a(), this.f1096a, maxAdapterResponseParameters, appLovinNativeAdLoadListener));
    }
}
