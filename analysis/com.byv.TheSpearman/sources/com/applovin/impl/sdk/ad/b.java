package com.applovin.impl.sdk.ad;

import android.graphics.Point;
import android.net.Uri;
import android.os.Bundle;
import android.view.MotionEvent;
import androidx.arch.core.util.Function;
import androidx.core.util.Consumer;
import com.applovin.impl.adview.e;
import com.applovin.impl.adview.m;
import com.applovin.impl.c5;
import com.applovin.impl.ch;
import com.applovin.impl.ig;
import com.applovin.impl.oj;
import com.applovin.impl.ql;
import com.applovin.impl.rq;
import com.applovin.impl.sdk.AppLovinAdBase;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.t;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.tr;
import com.applovin.impl.x3;
import com.applovin.impl.zp;
import com.applovin.sdk.AppLovinAdType;
import com.applovin.sdk.AppLovinSdkUtils;
import com.iab.omid.library.applovin.adsession.VerificationScriptResource;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class b extends AppLovinAdImpl {
    private final List f;
    private final AtomicBoolean g;
    private final AtomicBoolean h;
    private final AtomicReference i;
    private final Bundle j;
    private d k;

    /* renamed from: com.applovin.impl.sdk.ad.b$b, reason: collision with other inner class name */
    public enum EnumC0043b {
        UNSPECIFIED,
        DISMISS,
        DO_NOT_DISMISS
    }

    public enum c {
        DEFAULT,
        ACTIVITY_PORTRAIT,
        ACTIVITY_LANDSCAPE
    }

    public class d {

        /* renamed from: a, reason: collision with root package name */
        public final int f918a;
        public final int b;
        public final int c;
        public final int d;
        public final int e;

        private d() {
            this.f918a = AppLovinSdkUtils.dpToPx(k.k(), b.this.m());
            this.b = AppLovinSdkUtils.dpToPx(k.k(), b.this.o());
            this.c = AppLovinSdkUtils.dpToPx(k.k(), b.this.k());
            this.d = AppLovinSdkUtils.dpToPx(k.k(), ((Integer) ((AppLovinAdBase) b.this).sdk.a(oj.C1)).intValue());
            this.e = AppLovinSdkUtils.dpToPx(k.k(), ((Integer) ((AppLovinAdBase) b.this).sdk.a(oj.B1)).intValue());
        }
    }

    public enum e {
        RESIZE_ASPECT,
        TOP,
        BOTTOM,
        LEFT,
        RIGHT
    }

    public b(JSONObject jSONObject, JSONObject jSONObject2, k kVar) {
        super(jSONObject, jSONObject2, kVar);
        this.f = CollectionUtils.synchronizedList();
        this.g = new AtomicBoolean();
        this.h = new AtomicBoolean();
        this.i = new AtomicReference();
        this.j = new Bundle();
    }

    private List J() {
        return getIntegerListFromAdObject("multi_close_style", null);
    }

    private String o0() {
        String stringFromAdObject = getStringFromAdObject("video_end_url", null);
        if (stringFromAdObject != null) {
            return stringFromAdObject.replace("{CLCODE}", getClCode());
        }
        return null;
    }

    public List A() {
        return getStringListFromAdObject("custom_tabs_warmup_urls", Collections.emptyList());
    }

    public boolean A0() {
        return getBooleanFromAdObject("custom_tabs_enabled", Boolean.FALSE);
    }

    public boolean B() {
        return getBooleanFromAdObject("dismiss_on_skip", Boolean.FALSE);
    }

    public boolean B0() {
        return getBooleanFromAdObject("forward_lifecycle_events_to_webview", Boolean.FALSE);
    }

    public int C() {
        return getIntFromAdObject("poststitial_dismiss_forward_delay_millis", -1);
    }

    public boolean C0() {
        return getBooleanFromAdObject("lock_current_orientation", Boolean.FALSE);
    }

    public int D() {
        return getIntFromAdObject("poststitial_shown_forward_delay_millis", -1);
    }

    public AtomicBoolean D0() {
        return this.g;
    }

    public int E() {
        return zp.a(getIntFromAdObject("graphic_completion_percent", -1), 90);
    }

    public boolean E0() {
        return getBooleanFromAdObject("lhs_skip_button", (Boolean) this.sdk.a(oj.r2));
    }

    public List F() {
        List listA;
        ql qlVar = this.synchronizedAdObject;
        if (qlVar != null) {
            return (List) qlVar.a(new Function() { // from class: com.applovin.impl.sdk.ad.b$$ExternalSyntheticLambda19
                @Override // androidx.arch.core.util.Function
                public final Object apply(Object obj) {
                    return this.f$0.l((ql) obj);
                }
            });
        }
        synchronized (this.adObjectLock) {
            listA = zp.a(getJsonObjectFromAdObject("imp_urls", new JSONObject()), getClCode(), null, null, Q(), Q0(), this.sdk);
        }
        return listA;
    }

    public boolean F0() {
        return getBooleanFromAdObject("video_clickable", Boolean.FALSE);
    }

    public boolean G() {
        return getBooleanFromAdObject("playback_requires_user_action", Boolean.TRUE);
    }

    public abstract boolean G0();

    public String H() {
        return getStringFromFullResponse("event_id", null);
    }

    public boolean H0() {
        return getBooleanFromAdObject("web_contents_debugging_enabled", Boolean.valueOf(zp.h(k.k()) || zp.f(k.k()) || ((Boolean) this.sdk.a(oj.n6)).booleanValue()));
    }

    public List I() {
        List listJ = J();
        if (listJ == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(listJ.size());
        Iterator it = listJ.iterator();
        while (it.hasNext()) {
            arrayList.add(a(((Integer) it.next()).intValue()));
        }
        return arrayList;
    }

    public boolean I0() {
        return getBooleanFromAdObject("web_video", Boolean.FALSE);
    }

    public abstract void J0();

    public List K() {
        return getIntegerListFromAdObject("multi_close_delay_graphic", null);
    }

    public boolean K0() {
        return getBooleanFromAdObject("should_apply_mute_setting_to_poststitial", Boolean.FALSE);
    }

    public Uri L() {
        String stringFromAdObject = getStringFromAdObject("mute_image", "https://assets.applovin.com/sound_off.png");
        if (StringUtils.isValidString(stringFromAdObject)) {
            return Uri.parse(stringFromAdObject);
        }
        return null;
    }

    public boolean L0() {
        return getBooleanFromAdObject("should_apply_web_view_settings_to_web_view_button", (Boolean) this.sdk.a(oj.r6));
    }

    public String M() {
        return getStringFromAdObject("nia_button_title", "");
    }

    public boolean M0() {
        ql qlVar = this.synchronizedAdObject;
        return qlVar != null ? ((Boolean) qlVar.a(new Function() { // from class: com.applovin.impl.sdk.ad.b$$ExternalSyntheticLambda10
            @Override // androidx.arch.core.util.Function
            public final Object apply(Object obj) {
                return b.t((ql) obj);
            }
        })).booleanValue() : JsonUtils.getBoolean(getJsonObjectFromAdObject("video_button_properties", null), "should_cache_video_button_html_assets", Boolean.FALSE).booleanValue();
    }

    public String N() {
        return getStringFromAdObject("nia_message", "");
    }

    public boolean N0() {
        ql qlVar = this.synchronizedAdObject;
        return qlVar != null ? ((Boolean) qlVar.a(new Function() { // from class: com.applovin.impl.sdk.ad.b$$ExternalSyntheticLambda8
            @Override // androidx.arch.core.util.Function
            public final Object apply(Object obj) {
                return b.u((ql) obj);
            }
        })).booleanValue() : JsonUtils.getBoolean(getJsonObjectFromAdObject("video_button_properties", null), "should_cache_video_button_html_url_contents", Boolean.FALSE).booleanValue();
    }

    public String O() {
        return getStringFromAdObject("nia_title", "");
    }

    public boolean O0() {
        return this.h.get();
    }

    public abstract String P();

    public boolean P0() {
        return getBooleanFromAdObject("custom_tabs_should_track_events", Boolean.FALSE);
    }

    public Map Q() {
        HashMap map = new HashMap();
        try {
            ql qlVar = this.synchronizedAdObject;
            map.putAll(qlVar != null ? (Map) qlVar.a(new Function() { // from class: com.applovin.impl.sdk.ad.b$$ExternalSyntheticLambda12
                @Override // androidx.arch.core.util.Function
                public final Object apply(Object obj) {
                    return b.m((ql) obj);
                }
            }) : JsonUtils.toStringMap(getJsonObjectFromAdObject("http_headers_for_postbacks", new JSONObject())));
        } catch (JSONException e2) {
            this.sdk.L();
            if (t.a()) {
                this.sdk.L().a("DirectAd", "Failed to retrieve http headers for postbacks", e2);
            }
        }
        if (getBooleanFromAdObject("use_webview_ua_for_postbacks", Boolean.FALSE)) {
            map.put("User-Agent", tr.a());
        }
        return map;
    }

    public boolean Q0() {
        return getBooleanFromAdObject("fire_postbacks_from_webview", Boolean.FALSE);
    }

    public EnumC0043b R() {
        String stringFromAdObject = getStringFromAdObject("poststitial_dismiss_type", null);
        if (StringUtils.isValidString(stringFromAdObject)) {
            if ("dismiss".equalsIgnoreCase(stringFromAdObject)) {
                return EnumC0043b.DISMISS;
            }
            if ("no_dismiss".equalsIgnoreCase(stringFromAdObject)) {
                return EnumC0043b.DO_NOT_DISMISS;
            }
        }
        return EnumC0043b.UNSPECIFIED;
    }

    public boolean R0() {
        return getBooleanFromAdObject("should_forward_close_button_tapped_to_poststitial", Boolean.FALSE);
    }

    public int S() {
        return getColorFromAdObject("postitial_progress_bar_color", -922746881);
    }

    public boolean S0() {
        return getBooleanFromAdObject("avoms", Boolean.FALSE);
    }

    public long T() {
        return getLongFromAdObject("postitial_progress_bar_total_ms", -1L);
    }

    public boolean T0() {
        return getBooleanFromAdObject("report_reward_percent_include_close_delay", Boolean.TRUE);
    }

    public long U() {
        long longFromAdObject = getLongFromAdObject("report_reward_duration", -1L);
        if (longFromAdObject >= 0) {
            return TimeUnit.SECONDS.toMillis(longFromAdObject);
        }
        return -1L;
    }

    public boolean U0() {
        return getBooleanFromAdObject("require_interaction_for_click", Boolean.FALSE);
    }

    public int V() {
        return getIntFromAdObject("report_reward_percent", -1);
    }

    public boolean V0() {
        return getBooleanFromAdObject("sruifwvc", Boolean.FALSE);
    }

    public List W() {
        String stringFromAdObject = getStringFromAdObject("required_html_resources", null);
        return stringFromAdObject != null ? CollectionUtils.explode(stringFromAdObject) : Collections.emptyList();
    }

    public boolean W0() {
        return getBooleanFromAdObject("respect_adview_fully_watched", Boolean.FALSE);
    }

    public List X() {
        String stringFromAdObject = getStringFromAdObject("resource_cache_prefix", null);
        return stringFromAdObject != null ? CollectionUtils.explode(stringFromAdObject) : this.sdk.c(oj.Z0);
    }

    public boolean X0() {
        ql qlVar = this.synchronizedAdObject;
        return qlVar != null ? ((Boolean) qlVar.a(new Function() { // from class: com.applovin.impl.sdk.ad.b$$ExternalSyntheticLambda14
            @Override // androidx.arch.core.util.Function
            public final Object apply(Object obj) {
                return b.v((ql) obj);
            }
        })).booleanValue() : JsonUtils.getBoolean(getJsonObjectFromAdObject("video_button_properties", null), "should_respect_whitelist_when_retrieving_video_button_html_from_url", Boolean.FALSE).booleanValue();
    }

    public String Y() {
        return getStringFromAdObject("text_rewarded_inter_alert_body", "");
    }

    public boolean Y0() {
        return getBooleanFromAdObject("show_nia", Boolean.FALSE);
    }

    public String Z() {
        return getStringFromAdObject("text_rewarded_inter_alert_ok_action", "OK!");
    }

    public boolean Z0() {
        return getBooleanFromAdObject("show_rewarded_interstitial_overlay_alert", Boolean.valueOf(AppLovinAdType.AUTO_INCENTIVIZED == getType()));
    }

    public String a0() {
        return getStringFromAdObject("text_rewarded_inter_alert_title", "Watch a video to earn a reward!");
    }

    public boolean a1() {
        return getBooleanFromAdObject("sscomt", Boolean.FALSE);
    }

    public e.a b0() {
        int intFromAdObject = getIntFromAdObject("skip_style", -1);
        return intFromAdObject == -1 ? n() : a(intFromAdObject);
    }

    public boolean b1() {
        String str = this.sdk.g0().getExtraParameters().get("should_use_exoplayer_if_available");
        return StringUtils.isValidString(str) ? Boolean.parseBoolean(str) : getBooleanFromAdObject("suep", Boolean.FALSE);
    }

    public List c0() {
        return getStringListFromAdObject("substrings_for_disabled_click_logic", Collections.emptyList());
    }

    public boolean c1() {
        return getBooleanFromAdObject("upiosp", Boolean.FALSE);
    }

    public c d0() {
        c cVar = c.DEFAULT;
        String upperCase = getStringFromAdObject("ad_target", cVar.toString()).toUpperCase(Locale.ENGLISH);
        return "ACTIVITY_PORTRAIT".equalsIgnoreCase(upperCase) ? c.ACTIVITY_PORTRAIT : "ACTIVITY_LANDSCAPE".equalsIgnoreCase(upperCase) ? c.ACTIVITY_LANDSCAPE : cVar;
    }

    public Uri e0() {
        String stringFromAdObject = getStringFromAdObject("unmute_image", "https://assets.applovin.com/sound_on.png");
        if (StringUtils.isValidString(stringFromAdObject)) {
            return Uri.parse(stringFromAdObject);
        }
        return null;
    }

    public String f0() {
        ql qlVar = this.synchronizedAdObject;
        return qlVar != null ? (String) qlVar.a(new Function() { // from class: com.applovin.impl.sdk.ad.b$$ExternalSyntheticLambda7
            @Override // androidx.arch.core.util.Function
            public final Object apply(Object obj) {
                return b.n((ql) obj);
            }
        }) : JsonUtils.getString(getJsonObjectFromAdObject("video_button_properties", null), "video_button_base_url", "/");
    }

    public String g0() {
        ql qlVar = this.synchronizedAdObject;
        return qlVar != null ? (String) qlVar.a(new Function() { // from class: com.applovin.impl.sdk.ad.b$$ExternalSyntheticLambda9
            @Override // androidx.arch.core.util.Function
            public final Object apply(Object obj) {
                return b.o((ql) obj);
            }
        }) : JsonUtils.getString(getJsonObjectFromAdObject("video_button_properties", null), "video_button_html", "");
    }

    @Override // com.applovin.impl.sdk.AppLovinAdBase, com.applovin.impl.hg
    public abstract ig getAdEventTracker();

    public String getCachePrefix() {
        return getStringFromAdObject("cache_prefix", null);
    }

    @Override // com.applovin.impl.sdk.array.ArrayDirectDownloadAd
    public Bundle getDirectDownloadParameters() {
        ql qlVar = this.synchronizedAdObject;
        return qlVar != null ? (Bundle) qlVar.a(new Function() { // from class: com.applovin.impl.sdk.ad.b$$ExternalSyntheticLambda13
            @Override // androidx.arch.core.util.Function
            public final Object apply(Object obj) {
                return b.k((ql) obj);
            }
        }) : JsonUtils.toBundle(getJsonObjectFromAdObject("ah_parameters", null));
    }

    @Override // com.applovin.impl.sdk.array.ArrayDirectDownloadAd
    public String getDirectDownloadToken() {
        return getStringFromAdObject("ah_dd_token", null);
    }

    @Override // com.applovin.impl.sdk.AppLovinAdBase, com.applovin.impl.hg
    public String getOpenMeasurementContentUrl() {
        return getStringFromAdObject("omid_content_url", null);
    }

    @Override // com.applovin.impl.sdk.AppLovinAdBase, com.applovin.impl.hg
    public String getOpenMeasurementCustomReferenceData() {
        return getStringFromAdObject("omid_custom_ref_data", "");
    }

    @Override // com.applovin.impl.sdk.AppLovinAdBase, com.applovin.impl.hg
    public List getOpenMeasurementVerificationScriptResources() {
        List list;
        final Function function = new Function() { // from class: com.applovin.impl.sdk.ad.b$$ExternalSyntheticLambda4
            @Override // androidx.arch.core.util.Function
            public final Object apply(Object obj) {
                return this.f$0.m205xccf9e37f((JSONArray) obj);
            }
        };
        ql qlVar = this.synchronizedAdObject;
        if (qlVar != null) {
            return (List) qlVar.a(new Function() { // from class: com.applovin.impl.sdk.ad.b$$ExternalSyntheticLambda0
                @Override // androidx.arch.core.util.Function
                public final Object apply(Object obj) {
                    return b.lambda$getOpenMeasurementVerificationScriptResources$2(function, (ql) obj);
                }
            });
        }
        synchronized (this.adObjectLock) {
            list = (List) function.apply(getJsonArrayFromAdObject("omid_verification_script_resources", null));
        }
        return list;
    }

    public List getPrivacySandboxImpressionAttributionUrls() {
        List<String> stringListFromAdObject = getStringListFromAdObject("privacy_sandbox_impression_attribution_urls", Collections.emptyList());
        if (stringListFromAdObject.isEmpty()) {
            return stringListFromAdObject;
        }
        ArrayList arrayList = new ArrayList(stringListFromAdObject.size());
        String clCode = getClCode();
        Iterator<String> it = stringListFromAdObject.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().replace("{CLCODE}", clCode));
        }
        return arrayList;
    }

    public String h0() {
        ql qlVar = this.synchronizedAdObject;
        return qlVar != null ? (String) qlVar.a(new Function() { // from class: com.applovin.impl.sdk.ad.b$$ExternalSyntheticLambda15
            @Override // androidx.arch.core.util.Function
            public final Object apply(Object obj) {
                return b.p((ql) obj);
            }
        }) : JsonUtils.getString(getJsonObjectFromAdObject("video_button_properties", null), "video_button_html_url", "");
    }

    @Override // com.applovin.impl.sdk.array.ArrayDirectDownloadAd
    public boolean isDirectDownloadEnabled() {
        return StringUtils.isValidString(getDirectDownloadToken());
    }

    @Override // com.applovin.impl.sdk.AppLovinAdBase, com.applovin.impl.hg
    public abstract boolean isOpenMeasurementEnabled();

    public abstract Uri j();

    public abstract Uri j0();

    public long k0() {
        return getLongFromAdObject("close_delay", 0L);
    }

    public long l0() {
        return TimeUnit.SECONDS.toMillis(getLongFromAdObject("close_delay_max_buffering_time_seconds", 5L));
    }

    /* renamed from: lambda$getOpenMeasurementVerificationScriptResources$1$com-applovin-impl-sdk-ad-b, reason: not valid java name */
    public /* synthetic */ List m205xccf9e37f(JSONArray jSONArray) {
        if (jSONArray == null) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject jSONObject = JsonUtils.getJSONObject(jSONArray, i, (JSONObject) null);
            try {
                URL url = new URL(JsonUtils.getString(jSONObject, "url", null));
                String string = JsonUtils.getString(jSONObject, "vendor_key", null);
                String string2 = JsonUtils.getString(jSONObject, "parameters", null);
                if (StringUtils.isValidString(string) && StringUtils.isValidString(string2)) {
                    arrayList.add(VerificationScriptResource.createVerificationScriptResourceWithParameters(string, url, string2));
                } else {
                    arrayList.add(VerificationScriptResource.createVerificationScriptResourceWithoutParameters(url));
                }
            } catch (Throwable th) {
                this.sdk.L();
                if (t.a()) {
                    this.sdk.L().a("DirectAd", "Failed to parse OMID verification script resource", th);
                }
            }
        }
        return arrayList;
    }

    public int m0() {
        return zp.a(getIntFromAdObject("video_completion_percent", -1));
    }

    public List n0() {
        List listA;
        ql qlVar = this.synchronizedAdObject;
        if (qlVar != null) {
            return (List) qlVar.a(new Function() { // from class: com.applovin.impl.sdk.ad.b$$ExternalSyntheticLambda24
                @Override // androidx.arch.core.util.Function
                public final Object apply(Object obj) {
                    return this.f$0.r((ql) obj);
                }
            });
        }
        synchronized (this.adObjectLock) {
            listA = zp.a(getJsonObjectFromAdObject("video_end_urls", new JSONObject()), getClCode(), o0(), this.sdk);
        }
        return listA;
    }

    public e p0() {
        String stringFromAdObject = getStringFromAdObject("video_gravity", null);
        return "top".equals(stringFromAdObject) ? e.TOP : "bottom".equals(stringFromAdObject) ? e.BOTTOM : "left".equals(stringFromAdObject) ? e.LEFT : "right".equals(stringFromAdObject) ? e.RIGHT : e.RESIZE_ASPECT;
    }

    public int q0() {
        return getColorFromAdObject("progress_bar_color", -922746881);
    }

    public boolean r0() {
        return getBooleanFromAdObject("progress_bar_enabled", Boolean.FALSE);
    }

    public abstract Uri s0();

    public int t0() {
        return getIntFromAdObject("whalt", zp.a(getSize()) ? 1 : ((Boolean) this.sdk.a(oj.S5)).booleanValue() ? 0 : -1);
    }

    public m u0() {
        ql qlVar = this.synchronizedAdObject;
        if (qlVar != null) {
            return (m) qlVar.a(new Function() { // from class: com.applovin.impl.sdk.ad.b$$ExternalSyntheticLambda16
                @Override // androidx.arch.core.util.Function
                public final Object apply(Object obj) {
                    return b.s((ql) obj);
                }
            });
        }
        JSONObject jsonObjectFromAdObject = getJsonObjectFromAdObject("web_view_settings", null);
        if (jsonObjectFromAdObject != null) {
            return new m(jsonObjectFromAdObject);
        }
        return null;
    }

    public List v0() {
        return CollectionUtils.explode(getStringFromAdObject("wlh", null));
    }

    public List w() {
        List listA;
        ql qlVar = this.synchronizedAdObject;
        if (qlVar != null) {
            return (List) qlVar.a(new Function() { // from class: com.applovin.impl.sdk.ad.b$$ExternalSyntheticLambda22
                @Override // androidx.arch.core.util.Function
                public final Object apply(Object obj) {
                    return this.f$0.g((ql) obj);
                }
            });
        }
        synchronized (this.adObjectLock) {
            listA = zp.a(getJsonObjectFromAdObject("custom_tabs_navigation_started_urls", new JSONObject()), getClCode(), (String) null, this.sdk);
        }
        return listA;
    }

    public List w0() {
        return CollectionUtils.explode(getStringFromAdObject("wls", ""));
    }

    public boolean x0() {
        return getBooleanFromAdObject("bvde", (Boolean) this.sdk.a(oj.Y5));
    }

    public List y() {
        List listA;
        ql qlVar = this.synchronizedAdObject;
        if (qlVar != null) {
            return (List) qlVar.a(new Function() { // from class: com.applovin.impl.sdk.ad.b$$ExternalSyntheticLambda25
                @Override // androidx.arch.core.util.Function
                public final Object apply(Object obj) {
                    return this.f$0.i((ql) obj);
                }
            });
        }
        synchronized (this.adObjectLock) {
            listA = zp.a(getJsonObjectFromAdObject("custom_tabs_tab_hidden_urls", new JSONObject()), getClCode(), (String) null, this.sdk);
        }
        return listA;
    }

    public boolean y0() {
        return getBooleanFromAdObject("lhs_close_button", (Boolean) this.sdk.a(oj.e2));
    }

    public List z() {
        List listA;
        ql qlVar = this.synchronizedAdObject;
        if (qlVar != null) {
            return (List) qlVar.a(new Function() { // from class: com.applovin.impl.sdk.ad.b$$ExternalSyntheticLambda26
                @Override // androidx.arch.core.util.Function
                public final Object apply(Object obj) {
                    return this.f$0.j((ql) obj);
                }
            });
        }
        synchronized (this.adObjectLock) {
            listA = zp.a(getJsonObjectFromAdObject("custom_tabs_tab_shown_urls", new JSONObject()), getClCode(), (String) null, this.sdk);
        }
        return listA;
    }

    public boolean z0() {
        return getBooleanFromAdObject("custom_tabs_client_warmup_enabled", Boolean.FALSE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Bundle k(ql qlVar) {
        return JsonUtils.toBundle(qlVar.a("ah_parameters", (JSONObject) null));
    }

    public int k() {
        return getIntFromAdObject("close_button_horizontal_margin", ((Integer) this.sdk.a(oj.f2)).intValue());
    }

    static /* synthetic */ List lambda$getOpenMeasurementVerificationScriptResources$2(Function function, ql qlVar) {
        return (List) function.apply(qlVar.a("omid_verification_script_resources", (JSONArray) null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String p(ql qlVar) {
        return JsonUtils.getString(qlVar.a("video_button_properties", (JSONObject) null), "video_button_html_url", "");
    }

    public long p() {
        List listK = K();
        long longFromAdObject = getLongFromAdObject("close_delay_graphic", (listK == null || listK.size() <= 0) ? 0L : ((Integer) listK.get(0)).intValue());
        if (longFromAdObject == -1 || longFromAdObject == -2) {
            return 0L;
        }
        return longFromAdObject;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Boolean u(ql qlVar) {
        return JsonUtils.getBoolean(qlVar.a("video_button_properties", (JSONObject) null), "should_cache_video_button_html_url_contents", Boolean.FALSE);
    }

    public List u() {
        List listA;
        ql qlVar = this.synchronizedAdObject;
        if (qlVar != null) {
            return (List) qlVar.a(new Function() { // from class: com.applovin.impl.sdk.ad.b$$ExternalSyntheticLambda23
                @Override // androidx.arch.core.util.Function
                public final Object apply(Object obj) {
                    return this.f$0.e((ql) obj);
                }
            });
        }
        synchronized (this.adObjectLock) {
            listA = zp.a(getJsonObjectFromAdObject("custom_tabs_navigation_failed_urls", new JSONObject()), getClCode(), (String) null, this.sdk);
        }
        return listA;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Boolean v(ql qlVar) {
        return JsonUtils.getBoolean(qlVar.a("video_button_properties", (JSONObject) null), "should_respect_whitelist_when_retrieving_video_button_html_from_url", Boolean.FALSE);
    }

    public List v() {
        List listA;
        ql qlVar = this.synchronizedAdObject;
        if (qlVar != null) {
            return (List) qlVar.a(new Function() { // from class: com.applovin.impl.sdk.ad.b$$ExternalSyntheticLambda1
                @Override // androidx.arch.core.util.Function
                public final Object apply(Object obj) {
                    return this.f$0.f((ql) obj);
                }
            });
        }
        synchronized (this.adObjectLock) {
            listA = zp.a(getJsonObjectFromAdObject("custom_tabs_navigation_finished_urls", new JSONObject()), getClCode(), (String) null, this.sdk);
        }
        return listA;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String o(ql qlVar) {
        return JsonUtils.getString(qlVar.a("video_button_properties", (JSONObject) null), "video_button_html", "");
    }

    public int o() {
        return getIntFromAdObject("close_button_top_margin", ((Integer) this.sdk.a(oj.h2)).intValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Boolean t(ql qlVar) {
        return JsonUtils.getBoolean(qlVar.a("video_button_properties", (JSONObject) null), "should_cache_video_button_html_assets", Boolean.FALSE);
    }

    public List t() {
        List listA;
        ql qlVar = this.synchronizedAdObject;
        if (qlVar != null) {
            return (List) qlVar.a(new Function() { // from class: com.applovin.impl.sdk.ad.b$$ExternalSyntheticLambda3
                @Override // androidx.arch.core.util.Function
                public final Object apply(Object obj) {
                    return this.f$0.d((ql) obj);
                }
            });
        }
        synchronized (this.adObjectLock) {
            listA = zp.a(getJsonObjectFromAdObject("custom_tabs_navigation_aborted_urls", new JSONObject()), getClCode(), (String) null, this.sdk);
        }
        return listA;
    }

    public rq i0() {
        ql qlVar = this.synchronizedAdObject;
        if (qlVar != null) {
            return (rq) qlVar.a(new Function() { // from class: com.applovin.impl.sdk.ad.b$$ExternalSyntheticLambda2
                @Override // androidx.arch.core.util.Function
                public final Object apply(Object obj) {
                    return this.f$0.q((ql) obj);
                }
            });
        }
        return new rq(getJsonObjectFromAdObject("video_button_properties", null), this.sdk);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ rq q(ql qlVar) {
        return new rq(qlVar.a("video_button_properties", (JSONObject) null), this.sdk);
    }

    public int q() {
        return getColorFromAdObject("countdown_color", -922746881);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ List r(ql qlVar) {
        return zp.a(qlVar.a("video_end_urls", new JSONObject()), getClCode(), o0(), this.sdk);
    }

    public int r() {
        return getIntFromAdObject("countdown_length", 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ List a(ql qlVar) {
        return zp.a(qlVar.a("ad_closed_urls", new JSONObject()), getClCode(), (String) null, this.sdk);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ List b(ql qlVar) {
        return zp.a(qlVar.a("app_killed_urls", new JSONObject()), getClCode(), (String) null, this.sdk);
    }

    public void b(boolean z) {
        ql qlVar = this.synchronizedAdObject;
        if (qlVar != null) {
            qlVar.a("html_resources_cached", z);
            return;
        }
        synchronized (this.adObjectLock) {
            JsonUtils.putBoolean(this.adObject, "html_resources_cached", z);
        }
    }

    public List b(final MotionEvent motionEvent, final boolean z, final boolean z2) {
        List listA;
        ql qlVar = this.synchronizedAdObject;
        if (qlVar != null) {
            return (List) qlVar.a(new Function() { // from class: com.applovin.impl.sdk.ad.b$$ExternalSyntheticLambda6
                @Override // androidx.arch.core.util.Function
                public final Object apply(Object obj) {
                    return this.f$0.a(motionEvent, z, z2, (ql) obj);
                }
            });
        }
        synchronized (this.adObjectLock) {
            listA = zp.a(getJsonObjectFromAdObject("click_tracking_urls", new JSONObject()), a(motionEvent, z, z2), c(motionEvent, z, z2), Q(), Q0(), this.sdk);
        }
        return listA;
    }

    public void b(Uri uri) {
        ql qlVar = this.synchronizedAdObject;
        if (qlVar != null) {
            qlVar.b("mute_image", uri.toString());
            return;
        }
        synchronized (this.adObjectLock) {
            JsonUtils.putString(this.adObject, "mute_image", uri.toString());
        }
    }

    public void b() {
        this.h.set(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ List l(ql qlVar) {
        return zp.a(qlVar.a("imp_urls", new JSONObject()), getClCode(), null, null, Q(), Q0(), this.sdk);
    }

    public d l() {
        if (this.k == null) {
            this.k = new d();
        }
        return this.k;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Map m(ql qlVar) {
        try {
            return JsonUtils.toStringMap(qlVar.a("http_headers_for_postbacks", new JSONObject()));
        } catch (JSONException e2) {
            throw new RuntimeException(e2);
        }
    }

    public int m() {
        return getIntFromAdObject("close_button_size", ((Integer) this.sdk.a(oj.g2)).intValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String n(ql qlVar) {
        return JsonUtils.getString(qlVar.a("video_button_properties", (JSONObject) null), "video_button_base_url", "/");
    }

    public e.a n() {
        List listJ = J();
        int intFromAdObject = getIntFromAdObject("close_style", (listJ == null || listJ.size() <= 0) ? -1 : ((Integer) listJ.get(0)).intValue());
        return intFromAdObject == -1 ? a(hasVideoUrl()) : a(intFromAdObject);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ m s(ql qlVar) {
        JSONObject jSONObjectA = qlVar.a("web_view_settings", (JSONObject) null);
        if (jSONObjectA != null) {
            return new m(jSONObjectA);
        }
        return null;
    }

    public Bundle s() {
        Map map;
        ql qlVar = this.synchronizedAdObject;
        if (qlVar != null) {
            map = (Map) qlVar.a(new Function() { // from class: com.applovin.impl.sdk.ad.b$$ExternalSyntheticLambda21
                @Override // androidx.arch.core.util.Function
                public final Object apply(Object obj) {
                    return this.f$0.c((ql) obj);
                }
            });
        } else {
            try {
                map = JsonUtils.toStringMap(getJsonObjectFromAdObject("custom_tabs_http_headers", new JSONObject()));
            } catch (JSONException e2) {
                this.sdk.L();
                if (t.a()) {
                    this.sdk.L().a("DirectAd", "Failed to retrieve http headers for Custom Tabs", e2);
                }
                map = new HashMap();
            }
        }
        Bundle bundle = new Bundle();
        for (Map.Entry entry : map.entrySet()) {
            bundle.putString((String) entry.getKey(), (String) entry.getValue());
        }
        if (getBooleanFromAdObject("custom_tabs_should_use_webview_ua", Boolean.FALSE)) {
            bundle.putString("User-Agent", tr.a());
        }
        return bundle;
    }

    public c5 x() {
        ql qlVar = this.synchronizedAdObject;
        if (qlVar != null) {
            return (c5) qlVar.a(new Function() { // from class: com.applovin.impl.sdk.ad.b$$ExternalSyntheticLambda17
                @Override // androidx.arch.core.util.Function
                public final Object apply(Object obj) {
                    return b.h((ql) obj);
                }
            });
        }
        JSONObject jsonObjectFromAdObject = getJsonObjectFromAdObject("custom_tabs_settings", null);
        if (jsonObjectFromAdObject != null) {
            return new c5(jsonObjectFromAdObject);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ c5 h(ql qlVar) {
        JSONObject jSONObjectA = qlVar.a("custom_tabs_settings", (JSONObject) null);
        if (jSONObjectA != null) {
            return new c5(jSONObjectA);
        }
        return null;
    }

    public String h() {
        String stringFromAdObject = getStringFromAdObject("base_url", "/");
        if (AbstractJsonLexerKt.NULL.equalsIgnoreCase(stringFromAdObject)) {
            return null;
        }
        return stringFromAdObject;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Map c(ql qlVar) {
        try {
            return JsonUtils.toStringMap(qlVar.a("custom_tabs_http_headers", new JSONObject()));
        } catch (JSONException e2) {
            this.sdk.L();
            if (t.a()) {
                this.sdk.L().a("DirectAd", "Failed to retrieve http headers for Custom Tabs", e2);
            }
            return new HashMap();
        }
    }

    public List c() {
        List listA;
        ql qlVar = this.synchronizedAdObject;
        if (qlVar != null) {
            return (List) qlVar.a(new Function() { // from class: com.applovin.impl.sdk.ad.b$$ExternalSyntheticLambda11
                @Override // androidx.arch.core.util.Function
                public final Object apply(Object obj) {
                    return this.f$0.a((ql) obj);
                }
            });
        }
        synchronized (this.adObjectLock) {
            listA = zp.a(getJsonObjectFromAdObject("ad_closed_urls", new JSONObject()), getClCode(), (String) null, this.sdk);
        }
        return listA;
    }

    private String c(MotionEvent motionEvent, boolean z, boolean z2) {
        String stringFromAdObject = getStringFromAdObject("click_tracking_url", null);
        Map mapA = a(motionEvent, z, z2);
        if (stringFromAdObject != null) {
            return StringUtils.replace(stringFromAdObject, mapA);
        }
        return null;
    }

    public void c(Uri uri) {
        ql qlVar = this.synchronizedAdObject;
        if (qlVar != null) {
            qlVar.b("unmute_image", uri.toString());
            return;
        }
        synchronized (this.adObjectLock) {
            JsonUtils.putString(this.adObject, "unmute_image", uri.toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ List g(ql qlVar) {
        return zp.a(qlVar.a("custom_tabs_navigation_started_urls", new JSONObject()), getClCode(), (String) null, this.sdk);
    }

    public List g() {
        List listA;
        ql qlVar = this.synchronizedAdObject;
        if (qlVar != null) {
            return (List) qlVar.a(new Function() { // from class: com.applovin.impl.sdk.ad.b$$ExternalSyntheticLambda20
                @Override // androidx.arch.core.util.Function
                public final Object apply(Object obj) {
                    return this.f$0.b((ql) obj);
                }
            });
        }
        synchronized (this.adObjectLock) {
            listA = zp.a(getJsonObjectFromAdObject("app_killed_urls", new JSONObject()), getClCode(), (String) null, this.sdk);
        }
        return listA;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ List e(ql qlVar) {
        return zp.a(qlVar.a("custom_tabs_navigation_failed_urls", new JSONObject()), getClCode(), (String) null, this.sdk);
    }

    public Bundle e() {
        return this.j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ List d(ql qlVar) {
        return zp.a(qlVar.a("custom_tabs_navigation_aborted_urls", new JSONObject()), getClCode(), (String) null, this.sdk);
    }

    public long d() {
        return getLongFromAdObject("ad_reshow_delay_on_app_launch_ms", -1L);
    }

    public List d(MotionEvent motionEvent, boolean z, boolean z2) {
        List<String> stringListFromAdObject = getStringListFromAdObject("privacy_sandbox_click_attribution_urls", Collections.emptyList());
        if (stringListFromAdObject.isEmpty()) {
            return stringListFromAdObject;
        }
        Map mapA = a(motionEvent, z, z2);
        ArrayList arrayList = new ArrayList(stringListFromAdObject.size());
        Iterator<String> it = stringListFromAdObject.iterator();
        while (it.hasNext()) {
            arrayList.add(StringUtils.replace(it.next(), mapA));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ List j(ql qlVar) {
        return zp.a(qlVar.a("custom_tabs_tab_shown_urls", new JSONObject()), getClCode(), (String) null, this.sdk);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ List i(ql qlVar) {
        return zp.a(qlVar.a("custom_tabs_tab_hidden_urls", new JSONObject()), getClCode(), (String) null, this.sdk);
    }

    public List i() {
        return this.f;
    }

    public ch f() {
        return (ch) this.i.getAndSet(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ List a(MotionEvent motionEvent, boolean z, boolean z2, ql qlVar) {
        return zp.a(qlVar.a("click_tracking_urls", new JSONObject()), a(motionEvent, z, z2), c(motionEvent, z, z2), Q(), Q0(), this.sdk);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ List a(MotionEvent motionEvent, boolean z, ql qlVar) {
        return zp.a(qlVar.a("video_click_tracking_urls", new JSONObject()), a(motionEvent, true, z), null, Q(), Q0(), this.sdk);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ List f(ql qlVar) {
        return zp.a(qlVar.a("custom_tabs_navigation_finished_urls", new JSONObject()), getClCode(), (String) null, this.sdk);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(String str, ql qlVar) throws JSONException {
        JsonUtils.putString(qlVar.a("video_button_properties", (JSONObject) null), "video_button_html", str);
    }

    public void a(ch chVar) {
        this.i.set(chVar);
    }

    public void a(Uri uri) {
        this.f.add(uri);
    }

    public void a(final String str) {
        ql qlVar = this.synchronizedAdObject;
        if (qlVar != null) {
            qlVar.a(new Consumer() { // from class: com.applovin.impl.sdk.ad.b$$ExternalSyntheticLambda18
                @Override // androidx.core.util.Consumer
                public final void accept(Object obj) throws JSONException {
                    b.a(str, (ql) obj);
                }
            });
            return;
        }
        synchronized (this.adObjectLock) {
            JsonUtils.putString(getJsonObjectFromAdObject("video_button_properties", null), "video_button_html", str);
        }
    }

    public List a(final MotionEvent motionEvent, final boolean z) {
        List listA;
        List list;
        ql qlVar = this.synchronizedAdObject;
        if (qlVar != null) {
            list = (List) qlVar.a(new Function() { // from class: com.applovin.impl.sdk.ad.b$$ExternalSyntheticLambda5
                @Override // androidx.arch.core.util.Function
                public final Object apply(Object obj) {
                    return this.f$0.a(motionEvent, z, (ql) obj);
                }
            });
        } else {
            synchronized (this.adObjectLock) {
                listA = zp.a(getJsonObjectFromAdObject("video_click_tracking_urls", new JSONObject()), a(motionEvent, true, z), null, Q(), Q0(), this.sdk);
            }
            list = listA;
        }
        return list.isEmpty() ? b(motionEvent, true, z) : list;
    }

    private Map a(MotionEvent motionEvent, boolean z, boolean z2) {
        Point pointB = x3.b(k.k());
        HashMap map = new HashMap(7);
        map.put("{CLCODE}", getClCode());
        map.put("{CLICK_X}", String.valueOf(motionEvent != null ? motionEvent.getRawX() : -1.0f));
        map.put("{CLICK_Y}", String.valueOf(motionEvent != null ? motionEvent.getRawY() : -1.0f));
        map.put("{SCREEN_WIDTH}", String.valueOf(pointB.x));
        map.put("{SCREEN_HEIGHT}", String.valueOf(pointB.y));
        map.put("{IS_VIDEO_CLICK}", String.valueOf(z));
        map.put("{IS_INSTALL}", String.valueOf(z2));
        return map;
    }

    private e.a a(boolean z) {
        return z ? e.a.WHITE_ON_TRANSPARENT : e.a.WHITE_ON_BLACK;
    }

    protected e.a a(int i) {
        if (i == 1) {
            return e.a.WHITE_ON_TRANSPARENT;
        }
        if (i == 2) {
            return e.a.INVISIBLE;
        }
        if (i == 3) {
            return e.a.TRANSPARENT_SKIP;
        }
        return e.a.WHITE_ON_BLACK;
    }
}
