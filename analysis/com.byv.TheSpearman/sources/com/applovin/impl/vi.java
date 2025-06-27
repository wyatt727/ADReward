package com.applovin.impl;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.preference.PreferenceManager;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.adapter.parameters.MaxAdapterResponseParameters;
import com.google.android.exoplayer2.upstream.CmcdHeadersFactory;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.json.t2;
import com.mbridge.msdk.MBridgeConstans;
import com.my.tracker.ads.AdFormat;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class vi {
    private static JSONObject d;

    /* renamed from: a, reason: collision with root package name */
    protected final com.applovin.impl.sdk.k f1096a;
    protected final String b;
    protected final SharedPreferences c = PreferenceManager.getDefaultSharedPreferences(com.applovin.impl.sdk.k.k());

    protected Boolean c() {
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(com.applovin.impl.sdk.k.k());
        String strA = qj.r.a();
        if (!defaultSharedPreferences.contains(strA)) {
            return null;
        }
        String str = (String) sj.a(strA, "", String.class, defaultSharedPreferences, false);
        if (StringUtils.isValidString(str)) {
            return Boolean.valueOf(str.equals("1") || str.equalsIgnoreCase(com.json.mediationsdk.metadata.a.g));
        }
        Integer num = (Integer) sj.a(strA, Integer.MAX_VALUE, Integer.class, defaultSharedPreferences, false);
        if (num != null && num.intValue() != Integer.MAX_VALUE) {
            return Boolean.valueOf(num.intValue() > 0);
        }
        Long l = (Long) sj.a(strA, Long.MAX_VALUE, Long.class, defaultSharedPreferences, false);
        if (l == null || l.longValue() == Long.MAX_VALUE) {
            return (Boolean) sj.a(strA, Boolean.FALSE, Boolean.class, defaultSharedPreferences, false);
        }
        return Boolean.valueOf(l.longValue() > 0);
    }

    protected vi(String str, com.applovin.impl.sdk.k kVar) {
        this.b = str;
        this.f1096a = kVar;
    }

    private JSONObject a(Bundle bundle, JSONObject jSONObject, Context context) throws JSONException {
        JSONObject jSONObjectA = a(context);
        JsonUtils.putString(jSONObjectA, t2.i.C, bundle.getString(t2.i.C, ""));
        JsonUtils.putString(jSONObjectA, "storeurl", bundle.getString("storeurl", ""));
        JsonUtils.putJSONObjectIfValid(jSONObjectA, "ext", jSONObject);
        return jSONObjectA;
    }

    protected JSONObject b() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        Boolean boolC = c();
        if (boolC != null && boolC.booleanValue()) {
            JsonUtils.putBoolean(jSONObject, "did_consent", y3.b().b(com.applovin.impl.sdk.k.k()).booleanValue());
            JsonUtils.putString(jSONObject, "consent", this.f1096a.m0().k());
        }
        return jSONObject;
    }

    private JSONArray a(Bundle bundle, MaxAdFormat maxAdFormat, JSONObject jSONObject) throws JSONException {
        JSONArray jSONArray = new JSONArray();
        JSONObject jSONObject2 = new JSONObject();
        JsonUtils.putDouble(jSONObject2, "bidfloor", bundle.getDouble("bidfloor", FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE));
        if (maxAdFormat.isAdViewAd()) {
            JSONObject jSONObject3 = new JSONObject();
            JsonUtils.putInt(jSONObject3, "w", bundle.getInt("width", maxAdFormat.getSize().getWidth()));
            JsonUtils.putInt(jSONObject3, CmcdHeadersFactory.STREAMING_FORMAT_HLS, bundle.getInt("height", maxAdFormat.getSize().getHeight()));
            JSONArray jSONArray2 = new JSONArray();
            jSONArray2.put(3);
            jSONArray2.put(5);
            jSONArray2.put(6);
            JsonUtils.putJsonArray(jSONObject3, "api", jSONArray2);
            JsonUtils.putJSONObject(jSONObject2, AdFormat.BANNER, jSONObject3);
        }
        JsonUtils.putJSONObjectIfValid(jSONObject2, "ext", jSONObject);
        jSONArray.put(jSONObject2);
        return jSONArray;
    }

    private JSONObject b(JSONObject jSONObject) throws JSONException {
        JSONObject jSONObject2 = new JSONObject();
        JsonUtils.putJSONObjectIfValid(jSONObject2, "ext", jSONObject);
        return jSONObject2;
    }

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private final JSONObject f1097a;
        private final JSONObject b;
        private final JSONObject c;
        private final JSONObject d;
        private final JSONObject e;
        private final JSONObject f;
        private final JSONObject g;

        /* renamed from: com.applovin.impl.vi$a$a, reason: collision with other inner class name */
        public static class C0048a {

            /* renamed from: a, reason: collision with root package name */
            private JSONObject f1098a;
            private JSONObject b;
            private JSONObject c;
            private JSONObject d;
            private JSONObject e;
            private JSONObject f;
            private JSONObject g;

            C0048a() {
            }

            public String toString() {
                return "S2SApiService.Extensions.Builder(bidRequestExtObject=" + this.f1098a + ", impExtObject=" + this.b + ", appExtObject=" + this.c + ", deviceExtObject=" + this.d + ", userExtObject=" + this.e + ", sourceExtObject=" + this.f + ", regsExtObject=" + this.g + ")";
            }

            public C0048a a(JSONObject jSONObject) {
                this.f1098a = jSONObject;
                return this;
            }

            public C0048a b(JSONObject jSONObject) {
                this.b = jSONObject;
                return this;
            }

            public C0048a c(JSONObject jSONObject) {
                this.g = jSONObject;
                return this;
            }

            public C0048a d(JSONObject jSONObject) {
                this.e = jSONObject;
                return this;
            }

            public a a() {
                return new a(this.f1098a, this.b, this.c, this.d, this.e, this.f, this.g);
            }
        }

        a(JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4, JSONObject jSONObject5, JSONObject jSONObject6, JSONObject jSONObject7) {
            this.f1097a = jSONObject;
            this.b = jSONObject2;
            this.c = jSONObject3;
            this.d = jSONObject4;
            this.e = jSONObject5;
            this.f = jSONObject6;
            this.g = jSONObject7;
        }

        public static C0048a a() {
            return new C0048a();
        }
    }

    protected JSONObject a() throws JSONException {
        Map mapA;
        JSONObject jSONObject = new JSONObject();
        if (this.f1096a.y() != null) {
            mapA = this.f1096a.y().b();
        } else {
            mapA = this.f1096a.x().A();
        }
        JsonUtils.putObject(jSONObject, "gdpr", mapA.get("IABTCF_gdprApplies"));
        Boolean boolB = y3.a().b(com.applovin.impl.sdk.k.k());
        if (boolB != null) {
            JsonUtils.putString(jSONObject, "us_privacy", boolB.booleanValue() ? "1YY-" : "1YN-");
        }
        return jSONObject;
    }

    public com.applovin.impl.sdk.network.a a(String str, String str2, MaxAdapterResponseParameters maxAdapterResponseParameters, MaxAdFormat maxAdFormat, a aVar, Map map, boolean z, com.applovin.impl.sdk.k kVar) throws JSONException {
        Map mapA;
        kVar.L();
        if (com.applovin.impl.sdk.t.a()) {
            kVar.L().a(this.b, "Creating OpenRTB request with " + str2);
        }
        Bundle customParameters = maxAdapterResponseParameters.getCustomParameters();
        Context contextK = com.applovin.impl.sdk.k.k();
        if (kVar.y() != null) {
            mapA = kVar.y().d();
        } else {
            mapA = kVar.x().a(false);
        }
        JSONObject jSONObject = new JSONObject();
        JsonUtils.putString(jSONObject, "id", str2);
        JsonUtils.putBoolean(jSONObject, "test", maxAdapterResponseParameters.isTesting());
        JsonUtils.putJsonArrayIfValid(jSONObject, "imp", a(customParameters, maxAdFormat, aVar.b));
        JsonUtils.putJSONObjectIfValid(jSONObject, MBridgeConstans.DYNAMIC_VIEW_WX_APP, a(customParameters, aVar.c, contextK));
        JsonUtils.putJSONObjectIfValid(jSONObject, t2.h.G, a(aVar.d, mapA, kVar));
        JsonUtils.putJSONObjectIfValid(jSONObject, "user", b(aVar.e));
        JsonUtils.putJSONObjectIfValid(jSONObject, FirebaseAnalytics.Param.SOURCE, a(aVar.f));
        JsonUtils.putJSONObjectIfValid(jSONObject, "regs", a(aVar.g, contextK));
        JsonUtils.putJSONObjectIfValid(jSONObject, "format", a(mapA));
        JsonUtils.putJSONObjectIfValid(jSONObject, "ext", aVar.f1097a);
        return com.applovin.impl.sdk.network.a.a(kVar).b(str).c("POST").a(map).a(jSONObject).a((Object) new JSONObject()).a(false).b(z).a();
    }

    private JSONObject a(JSONObject jSONObject, Map map, com.applovin.impl.sdk.k kVar) throws JSONException {
        JSONObject jSONObject2 = new JSONObject();
        JsonUtils.putString(jSONObject2, com.json.i5.R, String.valueOf(map.get(com.json.i5.R)));
        JsonUtils.putBoolean(jSONObject2, "dnt", ((Boolean) map.get("dnt")).booleanValue());
        JsonUtils.putBoolean(jSONObject2, "lmt", ((Boolean) map.get("dnt")).booleanValue());
        JsonUtils.putString(jSONObject2, "ifa", String.valueOf(map.get("idfa")));
        JsonUtils.putString(jSONObject2, com.json.i5.q, String.valueOf(map.get("brand_name")));
        JsonUtils.putString(jSONObject2, com.json.i5.u, String.valueOf(map.get(com.json.i5.u)));
        JsonUtils.putString(jSONObject2, com.json.i5.x, "android");
        JsonUtils.putString(jSONObject2, com.json.i5.y, String.valueOf(map.get(com.json.i5.x)));
        JsonUtils.putInt(jSONObject2, "devicetype", 1);
        JsonUtils.putInt(jSONObject2, com.json.m4.e, c4.h(kVar));
        JsonUtils.putInt(jSONObject2, "w", ((Integer) map.get("dx")).intValue());
        JsonUtils.putInt(jSONObject2, CmcdHeadersFactory.STREAMING_FORMAT_HLS, ((Integer) map.get("dy")).intValue());
        JsonUtils.putJSONObjectIfValid(jSONObject2, "ext", jSONObject);
        return jSONObject2;
    }

    private JSONObject a(JSONObject jSONObject) throws JSONException {
        JSONObject jSONObject2 = new JSONObject();
        JsonUtils.putJSONObjectIfValid(jSONObject2, "ext", jSONObject);
        return jSONObject2;
    }

    private JSONObject a(JSONObject jSONObject, Context context) throws JSONException {
        JSONObject jSONObject2 = new JSONObject();
        Boolean boolB = y3.c().b(context);
        if (boolB != null) {
            JsonUtils.putBoolean(jSONObject2, "coppa", boolB.booleanValue());
        }
        JsonUtils.putJSONObjectIfValid(jSONObject2, "ext", jSONObject);
        return jSONObject2;
    }

    private JSONObject a(Map map) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        JsonUtils.putInt(jSONObject, "w", ((Integer) map.get("dx")).intValue());
        JsonUtils.putInt(jSONObject, CmcdHeadersFactory.STREAMING_FORMAT_HLS, ((Integer) map.get("dy")).intValue());
        return jSONObject;
    }

    private static JSONObject a(Context context) throws JSONException {
        JSONObject jSONObject = d;
        if (jSONObject != null) {
            return jSONObject;
        }
        PackageManager packageManager = context.getPackageManager();
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        PackageInfo packageInfo = null;
        try {
            packageInfo = packageManager.getPackageInfo(context.getPackageName(), 0);
        } catch (Throwable unused) {
        }
        JSONObject jSONObject2 = new JSONObject();
        JsonUtils.putString(jSONObject2, "name", packageManager.getApplicationLabel(applicationInfo).toString());
        JsonUtils.putString(jSONObject2, "bundle", applicationInfo.packageName);
        JsonUtils.putString(jSONObject2, "ver", packageInfo != null ? packageInfo.versionName : "");
        d = jSONObject2;
        return jSONObject2;
    }
}
