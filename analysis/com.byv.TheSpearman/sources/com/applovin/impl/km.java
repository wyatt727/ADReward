package com.applovin.impl;

import android.content.Context;
import com.applovin.impl.mediation.MaxErrorImpl;
import com.applovin.impl.mediation.ads.a;
import com.applovin.impl.qi;
import com.applovin.impl.sdk.o;
import com.applovin.impl.sdk.u;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.se;
import com.applovin.impl.sm;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.adapter.MaxAdapterError;
import com.applovin.sdk.AppLovinWebViewActivity;
import com.google.ads.mediation.mintegral.MintegralConstants;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class km extends xl {
    private final String h;
    private final MaxAdFormat i;
    private final Map j;
    private final Map k;
    private final Map l;
    private final JSONArray m;
    private final Context n;
    private final a.InterfaceC0032a o;

    @Override // java.lang.Runnable
    public void run() {
        if (com.applovin.impl.sdk.t.a()) {
            this.c.a(this.b, "Fetching next ad for " + this.i.getLabel() + " ad unit " + this.h);
        }
        com.applovin.impl.sdk.r.a();
        if (((Boolean) this.f1179a.a(oj.b4)).booleanValue() && zp.j() && com.applovin.impl.sdk.t.a()) {
            this.c.a(this.b, "User is connected to a VPN");
        }
        if (((Boolean) this.f1179a.a(oj.M4)).booleanValue()) {
            te teVarT = this.f1179a.T();
            re reVar = re.c;
            teVarT.a(reVar, se.a(this.h));
            teVarT.a(reVar, se.a(this.i));
        }
        ba baVarF = this.f1179a.F();
        baVarF.c(aa.s);
        aa aaVar = aa.g;
        if (baVarF.b(aaVar) == 0) {
            baVarF.b(aaVar, System.currentTimeMillis());
        }
        try {
            JSONObject jSONObjectG = g();
            HashMap map = new HashMap();
            if (!((Boolean) this.f1179a.a(oj.y5)).booleanValue() && !((Boolean) this.f1179a.a(oj.w5)).booleanValue()) {
                map.put("rid", UUID.randomUUID().toString());
            }
            if (!((Boolean) this.f1179a.a(oj.j5)).booleanValue()) {
                map.put(AppLovinWebViewActivity.INTENT_EXTRA_KEY_SDK_KEY, this.f1179a.d0());
            }
            if (this.f1179a.n0().c()) {
                map.put("test_mode", "1");
            }
            List listB = this.f1179a.n0().b();
            String str = this.f1179a.g0().getExtraParameters().get("fan");
            if (listB != null && !listB.isEmpty()) {
                String strM = b0$$ExternalSyntheticBackport0.m(",", listB);
                map.put("filter_ad_network", strM);
                if (!this.f1179a.n0().c()) {
                    map.put("fhkZsVqYC7", "1");
                }
                if (this.f1179a.n0().d()) {
                    map.put("force_ad_network", strM);
                }
            } else if (StringUtils.isValidString(str)) {
                map.put("filter_ad_network", str);
            }
            a(baVarF);
            a aVar = new a(com.applovin.impl.sdk.network.a.a(this.f1179a).c("POST").a(h()).b(f()).a(e()).b(map).a(jSONObjectG).b(((Boolean) this.f1179a.a(qe.N7)).booleanValue()).a((Object) new JSONObject()).c(((Long) this.f1179a.a(qe.L6)).intValue()).a(((Integer) this.f1179a.a(oj.f3)).intValue()).b(((Long) this.f1179a.a(qe.K6)).intValue()).a(qi.a.a(((Integer) this.f1179a.a(oj.p5)).intValue())).f(true).a(), this.f1179a);
            aVar.c(qe.I6);
            aVar.b(qe.J6);
            this.f1179a.l0().a(aVar);
        } catch (Throwable th) {
            if (com.applovin.impl.sdk.t.a()) {
                this.c.a(this.b, "Unable to fetch ad for ad unit " + this.h, th);
            }
            throw new RuntimeException("Unable to fetch ad: " + th);
        }
    }

    public km(String str, MaxAdFormat maxAdFormat, Map map, Map map2, Map map3, JSONArray jSONArray, Context context, com.applovin.impl.sdk.k kVar, a.InterfaceC0032a interfaceC0032a) {
        super("TaskFetchMediatedAd", kVar, str);
        this.h = str;
        this.i = maxAdFormat;
        this.j = map;
        this.k = map2;
        this.l = map3;
        this.m = jSONArray;
        this.n = context;
        this.o = interfaceC0032a;
    }

    class a extends en {
        a(com.applovin.impl.sdk.network.a aVar, com.applovin.impl.sdk.k kVar) {
            super(aVar, kVar);
        }

        @Override // com.applovin.impl.en, com.applovin.impl.b4.e
        public void a(String str, int i, String str2, JSONObject jSONObject) {
            km.this.a(i, str2);
            this.f1179a.B().a("fetchMediatedAd", str, i, CollectionUtils.hashMap("error_message", str2));
        }

        @Override // com.applovin.impl.en, com.applovin.impl.b4.e
        public void a(String str, JSONObject jSONObject, int i) throws JSONException {
            if (i != 200) {
                km.this.a(i, (String) null);
                this.f1179a.B().a("fetchMediatedAd", str, i);
            } else {
                JsonUtils.putLong(jSONObject, "ad_fetch_latency_millis", this.m.a());
                JsonUtils.putLong(jSONObject, "ad_fetch_response_size", this.m.b());
                km.this.b(jSONObject);
            }
        }
    }

    private String f() {
        return le.b(this.f1179a);
    }

    private String e() {
        return le.a(this.f1179a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(JSONObject jSONObject) {
        String label;
        try {
            c4.c(jSONObject, this.f1179a);
            c4.b(jSONObject, this.f1179a);
            c4.a(jSONObject, this.f1179a);
            le.f(jSONObject, this.f1179a);
            le.d(jSONObject, this.f1179a);
            le.e(jSONObject, this.f1179a);
            le.a(jSONObject);
            com.applovin.impl.sdk.e.b(this.f1179a);
            MaxAdFormat fromString = MaxAdFormat.formatFromString(JsonUtils.getString(jSONObject, FirebaseAnalytics.Param.AD_FORMAT, null));
            if (((Boolean) this.f1179a.a(oj.l6)).booleanValue()) {
                if (zp.a(this.i, fromString)) {
                    a(jSONObject);
                    return;
                }
                label = fromString != null ? fromString.getLabel() : "UNKNOWN";
                String str = "Requested ad format " + this.i.getLabel() + " is not compatible with received ad format " + label;
                com.applovin.impl.sdk.t.h(this.b, str);
                this.o.onAdLoadFailed(this.h, new MaxAdapterError(MaxAdapterError.INVALID_CONFIGURATION, 0, str));
                HashMap<String, String> mapHashMap = CollectionUtils.hashMap(MintegralConstants.AD_UNIT_ID, this.h);
                CollectionUtils.putStringIfValid("name", this.i.getLabel(), mapHashMap);
                CollectionUtils.putStringIfValid("details", label, mapHashMap);
                this.f1179a.B().a(o.b.INTEGRATION_ERROR, "incompatible_ad_format", (Map) mapHashMap);
                return;
            }
            if (this.i != fromString) {
                label = fromString != null ? fromString.getLabel() : "UNKNOWN";
                com.applovin.impl.sdk.t.h(this.b, "Ad format requested (" + this.i.getLabel() + ") does not match ad format for ad unit id " + this.h + " (" + label + ")");
            }
            a(jSONObject);
        } catch (Throwable th) {
            if (com.applovin.impl.sdk.t.a()) {
                this.c.a(this.b, "Unable to process mediated ad response for ad unit " + this.h, th);
            }
            throw new RuntimeException("Unable to process ad: " + th);
        }
    }

    private JSONObject g() throws JSONException {
        Map mapA;
        if (this.f1179a.y() != null) {
            mapA = this.f1179a.y().a(null, false, true);
        } else {
            mapA = this.f1179a.x().a(null, false, true);
        }
        mapA.putAll(this.l);
        JSONObject jSONObject = new JSONObject(mapA);
        e(jSONObject);
        h(jSONObject);
        f(jSONObject);
        c(jSONObject);
        g(jSONObject);
        d(jSONObject);
        return jSONObject;
    }

    private void a(JSONObject jSONObject) {
        xl wmVar;
        if (this.f1179a.a(qe.E7, this.i)) {
            wmVar = new vm(this.h, this.i, this.j, jSONObject, this.n, this.f1179a, this.o);
        } else {
            wmVar = new wm(this.h, this.i, this.j, jSONObject, this.n, this.f1179a, this.o);
        }
        xl xlVar = wmVar;
        long j = JsonUtils.getLong(jSONObject, "process_waterfall_delay_ms", -1L);
        if (j > 0) {
            this.f1179a.l0().a(xlVar, sm.b.MEDIATION, j, true);
        } else {
            this.f1179a.l0().a(xlVar);
        }
    }

    private void h(JSONObject jSONObject) throws JSONException {
        JSONArray jSONArray = this.m;
        if (jSONArray != null) {
            jSONObject.put("signal_data", jSONArray);
        }
    }

    private Map h() {
        HashMap map = new HashMap(2);
        map.put("AppLovin-Ad-Unit-Id", this.h);
        map.put("AppLovin-Ad-Format", this.i.getLabel());
        CollectionUtils.putObjectToStringIfValid("AppLovin-Retry-Attempt", this.k.get("retry_attempt"), map);
        CollectionUtils.putObjectToStringIfValid("AppLovin-Retry-Delay-Sec", this.k.get("retry_delay_sec"), map);
        return map;
    }

    private void c(JSONObject jSONObject) throws JSONException {
        JSONObject andResetCustomPostBodyData = this.f1179a.S().getAndResetCustomPostBodyData();
        if (andResetCustomPostBodyData == null || !zp.f(com.applovin.impl.sdk.k.k())) {
            return;
        }
        JsonUtils.putAll(jSONObject, andResetCustomPostBodyData);
    }

    private void d(JSONObject jSONObject) throws JSONException {
        if (((Boolean) this.f1179a.a(oj.M4)).booleanValue()) {
            te teVarT = this.f1179a.T();
            JSONObject jSONObject2 = new JSONObject();
            JSONObject jSONObject3 = new JSONObject();
            re reVar = re.c;
            JsonUtils.putAll(jSONObject3, (Map<String, ?>) teVarT.a(reVar, se.a.AD_UNIT_ID));
            JsonUtils.putJSONObject(jSONObject2, "arpau", jSONObject3);
            JSONObject jSONObject4 = new JSONObject();
            JsonUtils.putAll(jSONObject4, (Map<String, ?>) teVarT.a(reVar, se.a.AD_FORMAT));
            JsonUtils.putJSONObject(jSONObject2, "arpaf", jSONObject4);
            JSONObject jSONObject5 = new JSONObject();
            JsonUtils.putAll(jSONObject5, (Map<String, ?>) teVarT.a(re.d, se.a.AD));
            JsonUtils.putJSONObject(jSONObject2, "ttdasipa_ms", jSONObject5);
            JsonUtils.putJSONObject(jSONObject, "mediation_stats", jSONObject2);
        }
    }

    private void f(JSONObject jSONObject) throws JSONException {
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("disabled", new JSONArray(this.f1179a.O().a()));
            jSONObject2.put("installed", ve.a(this.f1179a));
            jSONObject2.put("initialized", this.f1179a.N().b());
            jSONObject2.put("initialized_classnames", new JSONArray((Collection) this.f1179a.N().a().keySet()));
            jSONObject2.put("loaded_classnames", new JSONArray(this.f1179a.O().c()));
            jSONObject2.put("failed_classnames", new JSONArray(this.f1179a.O().b()));
            jSONObject.put("adapters_info", jSONObject2);
        } catch (Exception e) {
            if (com.applovin.impl.sdk.t.a()) {
                this.c.a(this.b, "Failed to populate adapter classNames", e);
            }
            throw new RuntimeException("Failed to populate classNames: " + e);
        }
    }

    private void e(JSONObject jSONObject) throws JSONException {
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put(MintegralConstants.AD_UNIT_ID, this.h);
        jSONObject2.put(FirebaseAnalytics.Param.AD_FORMAT, this.i.getLabel());
        Map map = CollectionUtils.map(this.k);
        u.a aVarA = this.f1179a.V().a(this.h);
        if (aVarA != null) {
            if (Boolean.parseBoolean(this.f1179a.g0().getExtraParameters().get("esc"))) {
                map.put("previous_winning_network", "APPLOVIN_NETWORK");
                map.put("previous_winning_network_name", "AppLovin");
            } else {
                map.put("previous_winning_network", aVarA.a());
                map.put("previous_winning_network_name", aVarA.c());
                CollectionUtils.putStringIfValid("second_previous_winning_network", aVarA.d(), map);
                CollectionUtils.putStringIfValid("second_previous_winning_network_name", aVarA.e(), map);
            }
        }
        jSONObject2.put("extra_parameters", CollectionUtils.toJson(map));
        jSONObject.put("ad_info", jSONObject2);
    }

    private void a(ba baVar) {
        aa aaVar = aa.g;
        long jB = baVar.b(aaVar);
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - jB > TimeUnit.MINUTES.toMillis(((Integer) this.f1179a.a(oj.B3)).intValue())) {
            baVar.b(aaVar, jCurrentTimeMillis);
            baVar.a(aa.h);
            baVar.a(aa.i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i, String str) {
        MaxErrorImpl maxErrorImpl;
        if (com.applovin.impl.sdk.t.a()) {
            this.c.b(this.b, "Unable to fetch ad for ad unit " + this.h + ": server returned " + i);
        }
        if (i == -800) {
            this.f1179a.F().c(aa.t);
        }
        if (i == -1009) {
            maxErrorImpl = new MaxErrorImpl(-1009, str);
        } else if (i == -1001) {
            maxErrorImpl = new MaxErrorImpl(-1001, str);
        } else if (StringUtils.isValidString(str)) {
            maxErrorImpl = new MaxErrorImpl(-1000, str);
        } else {
            maxErrorImpl = new MaxErrorImpl(-1);
        }
        bc.a(this.o, this.h, maxErrorImpl);
    }

    private void g(JSONObject jSONObject) throws JSONException {
        JsonUtils.putObject(jSONObject, "sdk_extra_parameters", new JSONObject(this.f1179a.g0().getExtraParameters()));
    }
}
