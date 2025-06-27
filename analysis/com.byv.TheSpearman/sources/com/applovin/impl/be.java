package com.applovin.impl;

import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import androidx.arch.core.util.Function;
import com.applovin.impl.sdk.utils.BundleUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxAdWaterfallInfo;
import com.applovin.mediation.nativeAds.MaxNativeAd;
import com.applovin.sdk.AppLovinSdkUtils;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.json.mediationsdk.impressionData.ImpressionData;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class be extends ke implements MaxAd {
    private final int l;
    private final AtomicBoolean m;
    private final AtomicBoolean n;
    protected com.applovin.impl.mediation.g o;
    private final String p;
    private MaxAdWaterfallInfo q;
    private long r;
    private String s;
    private String t;
    private xc u;

    public abstract be a(com.applovin.impl.mediation.g gVar);

    @Override // com.applovin.impl.ke
    public String toString() {
        return "MediatedAd{thirdPartyAdPlacementId=" + S() + ", adUnitId=" + getAdUnitId() + ", format=" + getFormat().getLabel() + ", networkName='" + getNetworkName() + "'}";
    }

    public int I() {
        return this.l;
    }

    public static be a(int i, Map map, JSONObject jSONObject, JSONObject jSONObject2, com.applovin.impl.sdk.k kVar) {
        String string = JsonUtils.getString(jSONObject2, FirebaseAnalytics.Param.AD_FORMAT, null);
        MaxAdFormat fromString = MaxAdFormat.formatFromString(string);
        Objects.requireNonNull(fromString, "Invalid ad format for string: " + string);
        if (fromString.isAdViewAd()) {
            return new ce(i, map, jSONObject, jSONObject2, kVar);
        }
        if (fromString == MaxAdFormat.NATIVE) {
            return new ee(i, map, jSONObject, jSONObject2, kVar);
        }
        if (fromString.isFullscreenAd()) {
            return new de(i, map, jSONObject, jSONObject2, kVar);
        }
        throw new IllegalArgumentException("Unsupported ad format: " + string);
    }

    protected be(int i, Map map, JSONObject jSONObject, JSONObject jSONObject2, com.applovin.impl.mediation.g gVar, com.applovin.impl.sdk.k kVar) {
        super(map, jSONObject, jSONObject2, kVar);
        this.m = new AtomicBoolean();
        this.n = new AtomicBoolean();
        this.l = i;
        this.o = gVar;
        this.p = gVar != null ? gVar.b() : null;
    }

    public List T() {
        return b("mwf_info_urls");
    }

    public String A() {
        return a("bcode", "");
    }

    public long D() {
        return a("bwt_ms", ((Long) this.f598a.a(qe.F7)).longValue());
    }

    public long R() {
        return a("twt_ms", ((Long) this.f598a.a(qe.G7)).longValue());
    }

    @Override // com.applovin.mediation.MaxAd
    public MaxAdWaterfallInfo getWaterfall() {
        return this.q;
    }

    @Override // com.applovin.mediation.MaxAd
    public long getRequestLatencyMillis() {
        return this.r;
    }

    public void i(String str) {
        this.s = str;
    }

    public String L() {
        return this.s;
    }

    @Override // com.applovin.mediation.MaxAd
    public String getAdReviewCreativeId() {
        return this.t;
    }

    @Override // com.applovin.mediation.MaxAd
    public MaxAdFormat getFormat() {
        return MaxAdFormat.formatFromString(a(FirebaseAnalytics.Param.AD_FORMAT, b(FirebaseAnalytics.Param.AD_FORMAT, (String) null)));
    }

    @Override // com.applovin.mediation.MaxAd
    public AppLovinSdkUtils.Size getSize() {
        int iA = a("ad_width", -3);
        int iA2 = a("ad_height", -3);
        if (iA != -3 && iA2 != -3) {
            return new AppLovinSdkUtils.Size(iA, iA2);
        }
        return getFormat().getSize();
    }

    @Override // com.applovin.mediation.MaxAd
    public String getNetworkName() {
        return a("network_name", "");
    }

    @Override // com.applovin.mediation.MaxAd
    public String getNetworkPlacement() {
        return StringUtils.emptyIfNull(S());
    }

    @Override // com.applovin.mediation.MaxAd
    public String getCreativeId() {
        return a(CampaignEx.JSON_KEY_CREATIVE_ID, (String) null);
    }

    @Override // com.applovin.mediation.MaxAd
    public double getRevenue() {
        if (((Boolean) this.f598a.a(qe.C7)).booleanValue() && getFormat().isFullscreenAd() && !t().get()) {
            this.f598a.L();
            if (!com.applovin.impl.sdk.t.a()) {
                return FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
            }
            this.f598a.L().b("MediatedAd", "Attempting to retrieve revenue when not available yet");
            return FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
        }
        ql qlVar = this.i;
        if (qlVar != null) {
            return ((Double) qlVar.a(new Function() { // from class: com.applovin.impl.be$$ExternalSyntheticLambda6
                @Override // androidx.arch.core.util.Function
                public final Object apply(Object obj) {
                    return be.f((ql) obj);
                }
            })).doubleValue();
        }
        return JsonUtils.getDouble(a("revenue_parameters", (JSONObject) null), ImpressionData.IMPRESSION_DATA_KEY_REVENUE, -1.0d);
    }

    public void a(long j) {
        this.r = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double f(ql qlVar) {
        return Double.valueOf(JsonUtils.getDouble(qlVar.a("revenue_parameters", (JSONObject) null), ImpressionData.IMPRESSION_DATA_KEY_REVENUE, -1.0d));
    }

    @Override // com.applovin.mediation.MaxAd
    public String getRevenuePrecision() {
        ql qlVar = this.i;
        if (qlVar != null) {
            return (String) qlVar.a(new Function() { // from class: com.applovin.impl.be$$ExternalSyntheticLambda2
                @Override // androidx.arch.core.util.Function
                public final Object apply(Object obj) {
                    return be.h((ql) obj);
                }
            });
        }
        return JsonUtils.getString(a("revenue_parameters", (JSONObject) null), ImpressionData.IMPRESSION_DATA_KEY_PRECISION, "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String h(ql qlVar) {
        return JsonUtils.getString(qlVar.a("revenue_parameters", (JSONObject) null), ImpressionData.IMPRESSION_DATA_KEY_PRECISION, "");
    }

    @Override // com.applovin.mediation.MaxAd
    public String getDspName() {
        return a("dsp_name", (String) null);
    }

    @Override // com.applovin.mediation.MaxAd
    public String getDspId() {
        return a("dsp_id", (String) null);
    }

    @Override // com.applovin.mediation.MaxAd
    public String getAdValue(String str) {
        return getAdValue(str, null);
    }

    public double M() {
        return a("price", -1.0f);
    }

    public void a(MaxAdWaterfallInfo maxAdWaterfallInfo) {
        this.q = maxAdWaterfallInfo;
    }

    public JSONObject w() {
        ql qlVar = this.i;
        if (qlVar != null) {
            return (JSONObject) qlVar.a(new Function() { // from class: com.applovin.impl.be$$ExternalSyntheticLambda3
                @Override // androidx.arch.core.util.Function
                public final Object apply(Object obj) {
                    return be.b((ql) obj);
                }
            });
        }
        return a("ad_values", new JSONObject());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ JSONObject b(ql qlVar) {
        return JsonUtils.deepCopy(qlVar.a("ad_values", new JSONObject()));
    }

    public JSONObject N() {
        ql qlVar = this.i;
        if (qlVar != null) {
            return (JSONObject) qlVar.a(new Function() { // from class: com.applovin.impl.be$$ExternalSyntheticLambda5
                @Override // androidx.arch.core.util.Function
                public final Object apply(Object obj) {
                    return be.e((ql) obj);
                }
            });
        }
        return a("publisher_extra_info", new JSONObject());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ JSONObject e(ql qlVar) {
        return JsonUtils.deepCopy(qlVar.a("publisher_extra_info", new JSONObject()));
    }

    public JSONObject P() {
        ql qlVar = this.i;
        if (qlVar != null) {
            return (JSONObject) qlVar.a(new Function() { // from class: com.applovin.impl.be$$ExternalSyntheticLambda1
                @Override // androidx.arch.core.util.Function
                public final Object apply(Object obj) {
                    return be.g((ql) obj);
                }
            });
        }
        return a("revenue_parameters", new JSONObject());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ JSONObject g(ql qlVar) {
        return JsonUtils.deepCopy(qlVar.a("revenue_parameters", new JSONObject()));
    }

    public String O() {
        return JsonUtils.getString(P(), "revenue_event", "");
    }

    public void h(String str) {
        this.t = str;
    }

    public String Q() {
        return b("event_id", "");
    }

    public String u() {
        return a("adomain", (String) null);
    }

    public boolean Z() {
        com.applovin.impl.mediation.g gVar = this.o;
        return gVar != null && gVar.k() && this.o.j();
    }

    public com.applovin.impl.mediation.g z() {
        return this.o;
    }

    public String y() {
        return this.p;
    }

    public Bundle E() throws JSONException {
        JSONObject jSONObjectA;
        ql qlVar = this.i;
        if (qlVar != null) {
            return (Bundle) qlVar.a(new Function() { // from class: com.applovin.impl.be$$ExternalSyntheticLambda0
                @Override // androidx.arch.core.util.Function
                public final Object apply(Object obj) {
                    return this.f$0.c((ql) obj);
                }
            });
        }
        if (c("credentials")) {
            jSONObjectA = a("credentials", new JSONObject());
        } else {
            jSONObjectA = a("server_parameters", new JSONObject());
            JsonUtils.putString(jSONObjectA, "placement_id", S());
        }
        return JsonUtils.toBundle(jSONObjectA);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Bundle c(ql qlVar) throws JSONException {
        JSONObject jSONObjectA;
        if (qlVar.a("credentials")) {
            jSONObjectA = qlVar.a("credentials", new JSONObject());
        } else {
            jSONObjectA = qlVar.a("server_parameters", new JSONObject());
            JsonUtils.putString(jSONObjectA, "placement_id", S());
        }
        return JsonUtils.toBundle(jSONObjectA);
    }

    public String C() {
        return a("bid_response", (String) null);
    }

    public boolean W() {
        return StringUtils.isValidString(C());
    }

    public long B() {
        return a("bid_expiration_ms", BundleUtils.getLong("bid_expiration_ms", -1L, l()));
    }

    public boolean Y() {
        return a("is_js_tag_ad", Boolean.FALSE).booleanValue();
    }

    public MaxAdFormat H() {
        String strA = a("haf", (String) null);
        if (StringUtils.isValidString(strA)) {
            return MaxAdFormat.formatFromString(strA);
        }
        return null;
    }

    public boolean X() {
        return H() != null;
    }

    public xc G() {
        xc xcVar = this.u;
        if (xcVar != null) {
            return xcVar;
        }
        ql qlVar = this.i;
        if (qlVar != null) {
            this.u = (xc) qlVar.a(new Function() { // from class: com.applovin.impl.be$$ExternalSyntheticLambda4
                @Override // androidx.arch.core.util.Function
                public final Object apply(Object obj) {
                    return be.d((ql) obj);
                }
            });
        } else {
            this.u = new xc(a("hybrid_ad_config", (JSONObject) null));
        }
        return this.u;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ xc d(ql qlVar) {
        return new xc(qlVar.a("hybrid_ad_config", (JSONObject) null));
    }

    @Override // com.applovin.mediation.MaxAd
    public String getAdValue(String str, String str2) {
        JSONObject jSONObjectW = w();
        if (jSONObjectW.has(str)) {
            return JsonUtils.getString(jSONObjectW, str, str2);
        }
        Bundle bundleL = l();
        if (bundleL.containsKey(str)) {
            return bundleL.getString(str);
        }
        JSONObject jSONObjectN = N();
        if (jSONObjectN.has(str)) {
            return JsonUtils.getString(jSONObjectN, str, str2);
        }
        return a(str, str2);
    }

    public View x() {
        com.applovin.impl.mediation.g gVar;
        if (!Z() || (gVar = this.o) == null) {
            return null;
        }
        return gVar.d();
    }

    @Override // com.applovin.mediation.MaxAd
    public MaxNativeAd getNativeAd() {
        com.applovin.impl.mediation.g gVar = this.o;
        if (gVar != null) {
            return gVar.e();
        }
        return null;
    }

    public String S() {
        return a("third_party_ad_placement_id", (String) null);
    }

    public String U() {
        return b("waterfall_name", "");
    }

    public String V() {
        return b("waterfall_test_name", "");
    }

    public long F() {
        if (K() > 0) {
            return J() - K();
        }
        return -1L;
    }

    private long K() {
        return a("load_started_time_ms", 0L);
    }

    public void b0() {
        c("load_started_time_ms", SystemClock.elapsedRealtime());
    }

    public long J() {
        return a("load_completed_time_ms", 0L);
    }

    public void a0() {
        c("load_completed_time_ms", SystemClock.elapsedRealtime());
    }

    public AtomicBoolean t() {
        return this.m;
    }

    public void a(JSONObject jSONObject) throws JSONException {
        if (jSONObject == null || jSONObject.length() == 0) {
            return;
        }
        JSONObject jSONObjectW = w();
        JsonUtils.putAll(jSONObjectW, jSONObject);
        a("ad_values", (Object) jSONObjectW);
    }

    public AtomicBoolean v() {
        return this.n;
    }

    public void s() {
        this.o = null;
        this.q = null;
    }

    public void b(JSONObject jSONObject) throws JSONException {
        if (jSONObject == null || jSONObject.length() == 0) {
            return;
        }
        JSONObject jSONObjectN = N();
        JsonUtils.putAll(jSONObjectN, jSONObject);
        a("publisher_extra_info", (Object) jSONObjectN);
    }

    public void a(Bundle bundle) throws JSONException {
        if (bundle == null) {
            return;
        }
        if (bundle.containsKey("ad_values")) {
            a(BundleUtils.toJSONObject(bundle.getBundle("ad_values")));
        }
        if (bundle.containsKey(CampaignEx.JSON_KEY_CREATIVE_ID) && !c(CampaignEx.JSON_KEY_CREATIVE_ID)) {
            c(CampaignEx.JSON_KEY_CREATIVE_ID, BundleUtils.getString(CampaignEx.JSON_KEY_CREATIVE_ID, bundle));
        }
        if (bundle.containsKey("ad_width") && !c("ad_width") && bundle.containsKey("ad_height") && !c("ad_height")) {
            int i = BundleUtils.getInt("ad_width", bundle);
            int i2 = BundleUtils.getInt("ad_height", bundle);
            c("ad_width", i);
            c("ad_height", i2);
        }
        if (bundle.containsKey("publisher_extra_info")) {
            b(BundleUtils.toJSONObject(bundle.getBundle("publisher_extra_info")));
        }
    }
}
