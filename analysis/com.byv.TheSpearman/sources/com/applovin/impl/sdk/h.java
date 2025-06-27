package com.applovin.impl.sdk;

import android.os.Bundle;
import android.view.View;
import com.applovin.communicator.AppLovinCommunicator;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.communicator.AppLovinCommunicatorPublisher;
import com.applovin.communicator.AppLovinCommunicatorSubscriber;
import com.applovin.impl.ar;
import com.applovin.impl.be;
import com.applovin.impl.ce;
import com.applovin.impl.communicator.CommunicatorMessageImpl;
import com.applovin.impl.de;
import com.applovin.impl.ee;
import com.applovin.impl.ie;
import com.applovin.impl.jo;
import com.applovin.impl.oj;
import com.applovin.impl.sdk.network.d;
import com.applovin.impl.sdk.utils.BundleUtils;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sm;
import com.applovin.impl.t3;
import com.applovin.impl.ve;
import com.applovin.impl.xl;
import com.applovin.impl.zp;
import com.applovin.mediation.adapter.MaxAdapter;
import com.applovin.sdk.AppLovinSdkUtils;
import com.applovin.sdk.AppLovinWebViewActivity;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.json.t2;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class h implements AppLovinCommunicatorSubscriber, AppLovinCommunicatorPublisher {

    /* renamed from: a, reason: collision with root package name */
    private final k f930a;
    private final AppLovinCommunicator b;

    h(k kVar) {
        this.f930a = kVar;
        AppLovinCommunicator appLovinCommunicator = AppLovinCommunicator.getInstance(k.k());
        this.b = appLovinCommunicator;
        if (((Boolean) kVar.a(oj.E6)).booleanValue()) {
            appLovinCommunicator.a(kVar);
            appLovinCommunicator.subscribe(this, jo.f575a);
        }
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorEntity
    public String getCommunicatorId() {
        return "applovin_sdk";
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorSubscriber
    public void onMessageReceived(AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
        Map<String, Object> map;
        long j;
        int i;
        Map mapA;
        Map mapL;
        if (((Boolean) this.f930a.a(oj.E6)).booleanValue()) {
            if ("send_http_request".equalsIgnoreCase(appLovinCommunicatorMessage.getTopic())) {
                Bundle messageData = appLovinCommunicatorMessage.getMessageData();
                Map<String, String> stringMap = BundleUtils.toStringMap(messageData.getBundle("query_params"));
                Map<String, Object> map2 = BundleUtils.toMap(messageData.getBundle("post_body"));
                Map<String, String> stringMap2 = BundleUtils.toStringMap(messageData.getBundle("headers"));
                String string = messageData.getString("id", "");
                if (!map2.containsKey(AppLovinWebViewActivity.INTENT_EXTRA_KEY_SDK_KEY)) {
                    map2.put(AppLovinWebViewActivity.INTENT_EXTRA_KEY_SDK_KEY, this.f930a.d0());
                }
                this.f930a.Z().e(new d.b().d(messageData.getString("url")).a(messageData.getString("backup_url")).b(stringMap).c(map2).a(stringMap2).a(((Boolean) this.f930a.a(oj.j5)).booleanValue()).b(string).a());
                return;
            }
            if (!"send_http_request_v2".equalsIgnoreCase(appLovinCommunicatorMessage.getTopic())) {
                if ("set_ad_request_query_params".equalsIgnoreCase(appLovinCommunicatorMessage.getTopic())) {
                    this.f930a.i().addCustomQueryParams(zp.a((Map) BundleUtils.toMap(appLovinCommunicatorMessage.getMessageData())));
                    return;
                } else if ("set_ad_request_post_body".equalsIgnoreCase(appLovinCommunicatorMessage.getTopic())) {
                    this.f930a.i().setCustomPostBody(BundleUtils.toJSONObject(appLovinCommunicatorMessage.getMessageData()));
                    return;
                } else {
                    if ("set_mediate_request_post_body_data".equalsIgnoreCase(appLovinCommunicatorMessage.getTopic())) {
                        this.f930a.S().setCustomPostBodyData(BundleUtils.toJSONObject(appLovinCommunicatorMessage.getMessageData()));
                        return;
                    }
                    return;
                }
            }
            Bundle messageData2 = appLovinCommunicatorMessage.getMessageData();
            String string2 = messageData2.getString("http_method", "POST");
            long millis = messageData2.containsKey("timeout_sec") ? TimeUnit.SECONDS.toMillis(messageData2.getLong("timeout_sec")) : ((Long) this.f930a.a(oj.s3)).longValue();
            int i2 = messageData2.getInt("retry_count", ((Integer) this.f930a.a(oj.t3)).intValue());
            long millis2 = messageData2.containsKey("retry_delay_sec") ? TimeUnit.SECONDS.toMillis(messageData2.getLong("retry_delay_sec")) : ((Long) this.f930a.a(oj.u3)).longValue();
            Map<String, String> stringMap3 = BundleUtils.toStringMap(messageData2.getBundle("query_params"));
            long j2 = millis2;
            if ("GET".equalsIgnoreCase(string2)) {
                if (messageData2.getBoolean("include_data_collector_info", true)) {
                    stringMap3.putAll(BundleUtils.toStringMap(CollectionUtils.toBundle(this.f930a.y() != null ? this.f930a.y().a(null, false, false) : this.f930a.x().a(null, false, false))));
                }
                j = millis;
                i = i2;
                map = null;
            } else {
                map = BundleUtils.toMap(messageData2.getBundle("post_body"));
                if (messageData2.getBoolean("include_data_collector_info", true)) {
                    if (this.f930a.y() != null) {
                        mapA = this.f930a.y().b();
                        mapL = this.f930a.y().d();
                    } else {
                        mapA = this.f930a.x().A();
                        mapL = this.f930a.x().l();
                    }
                    if (mapL.containsKey("idfv") && mapL.containsKey("idfv_scope")) {
                        i = i2;
                        String str = (String) mapL.get("idfv");
                        j = millis;
                        Integer num = (Integer) mapL.get("idfv_scope");
                        num.intValue();
                        mapL.remove("idfv");
                        mapL.remove("idfv_scope");
                        mapA.put("idfv", str);
                        mapA.put("idfv_scope", num);
                    } else {
                        j = millis;
                        i = i2;
                    }
                    mapA.put("server_installed_at", this.f930a.a(oj.t));
                    mapA.put(AppLovinWebViewActivity.INTENT_EXTRA_KEY_SDK_KEY, this.f930a.d0());
                    map.put(MBridgeConstans.DYNAMIC_VIEW_WX_APP, mapA);
                    map.put(t2.h.G, mapL);
                } else {
                    j = millis;
                    i = i2;
                }
            }
            this.f930a.l0().a((xl) new t3(appLovinCommunicatorMessage.getPublisherId(), com.applovin.impl.sdk.network.a.a(this.f930a).b(messageData2.getString("url")).a(messageData2.getString("backup_url")).b(stringMap3).c(string2).a((Map) BundleUtils.toStringMap(messageData2.getBundle("headers"))).a(map != null ? new JSONObject(map) : null).c((int) j).a(i).b((int) j2).a((Object) new JSONObject()).a(messageData2.getBoolean("is_encoding_enabled", false)).a(), this.f930a), sm.b.OTHER);
        }
    }

    public void b(be beVar, String str) {
        if (((Boolean) this.f930a.a(oj.E6)).booleanValue() && this.b.hasSubscriber("max_ad_events")) {
            Bundle bundleA = a(beVar);
            bundleA.putString("type", str);
            this.f930a.L();
            if (t.a()) {
                this.f930a.L().a("CommunicatorService", "Sending \"max_ad_events\" message: " + bundleA);
            }
            a(bundleA, "max_ad_events");
        }
    }

    public void a(be beVar, String str) {
        if (((Boolean) this.f930a.a(oj.E6)).booleanValue() && this.b.hasSubscriber("ad_callback_blocked_after_hidden")) {
            Bundle bundleA = a(beVar);
            bundleA.putString("callback_name", str);
            a(bundleA, "ad_callback_blocked_after_hidden");
        }
    }

    public void a(JSONObject jSONObject, boolean z) throws JSONException {
        if (((Boolean) this.f930a.a(oj.E6)).booleanValue() && this.b.hasSubscriber("safedk_init")) {
            Bundle bundle = new Bundle();
            bundle.putString(AppLovinWebViewActivity.INTENT_EXTRA_KEY_SDK_KEY, this.f930a.d0());
            bundle.putString("applovin_random_token", this.f930a.c0());
            bundle.putString("compass_random_token", this.f930a.p());
            bundle.putString("device_type", AppLovinSdkUtils.isTablet(k.k()) ? "tablet" : "phone");
            bundle.putString("init_success", String.valueOf(z));
            bundle.putParcelableArrayList("installed_mediation_adapters", JsonUtils.toBundle(ve.a(this.f930a)));
            JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONObject, "communicator_settings", (JSONObject) null);
            Bundle bundle2 = (Bundle) bundle.clone();
            bundle2.putString("user_id", this.f930a.t0().c());
            JSONObject jSONObject3 = JsonUtils.getJSONObject(jSONObject2, "safedk_settings", new JSONObject());
            if (!((Boolean) this.f930a.a(oj.F6)).booleanValue()) {
                JSONObject jSONObject4 = new JSONObject();
                JsonUtils.putBoolean(jSONObject4, "deactivated", true);
                JsonUtils.putJSONObject(jSONObject3, "safeDKDeactivation", jSONObject4);
            }
            bundle2.putBundle(com.json.mediationsdk.d.g, JsonUtils.toBundle(jSONObject3));
            this.f930a.L();
            if (t.a()) {
                this.f930a.L().a("CommunicatorService", "Sending \"safedk_init\" message: " + bundle);
            }
            a(bundle2, "safedk_init");
        }
    }

    public void a(MaxAdapter.InitializationStatus initializationStatus, String str) {
        if (((Boolean) this.f930a.a(oj.E6)).booleanValue() && this.b.hasSubscriber("adapter_initialization_status")) {
            Bundle bundle = new Bundle();
            bundle.putString("adapter_class", str);
            bundle.putInt("init_status", initializationStatus.getCode());
            a(bundle, "adapter_initialization_status");
        }
    }

    public void a() {
        if (((Boolean) this.f930a.a(oj.E6)).booleanValue() && this.b.hasSubscriber("privacy_setting_updated")) {
            a(new Bundle(), "privacy_setting_updated");
        }
    }

    public void a(String str, String str2) {
        if (((Boolean) this.f930a.a(oj.E6)).booleanValue() && this.b.hasSubscriber("network_sdk_version_updated")) {
            Bundle bundle = new Bundle();
            bundle.putString("adapter_class", str2);
            bundle.putString("sdk_version", str);
            a(bundle, "network_sdk_version_updated");
        }
    }

    public void a(List list) {
        if (((Boolean) this.f930a.a(oj.E6)).booleanValue() && this.b.hasSubscriber("live_networks_updated")) {
            if (list != null && !list.isEmpty()) {
                Bundle bundle = new Bundle();
                bundle.putStringArrayList("live_networks", new ArrayList<>(list));
                a(bundle, "live_networks_updated");
                return;
            }
            a(Bundle.EMPTY, "live_networks_updated");
        }
    }

    public void a(String str, String str2, String str3) {
        if (((Boolean) this.f930a.a(oj.E6)).booleanValue() && this.b.hasSubscriber("responses")) {
            String strMaybeConvertToIndentedString = JsonUtils.maybeConvertToIndentedString(str3, 2);
            String strMaybeConvertToIndentedString2 = JsonUtils.maybeConvertToIndentedString(str, 2);
            Bundle bundle = new Bundle();
            bundle.putString("request_url", str2);
            bundle.putString("request_body", strMaybeConvertToIndentedString);
            bundle.putString(com.json.mediationsdk.utils.c.Y1, strMaybeConvertToIndentedString2);
            a(bundle, "responses");
        }
    }

    public void a(String str, String str2, int i, Object obj, String str3, boolean z) {
        if (((Boolean) this.f930a.a(oj.E6)).booleanValue() && this.b.hasSubscriber("receive_http_response")) {
            Bundle bundle = new Bundle();
            bundle.putString("id", str);
            bundle.putString("url", str2);
            bundle.putInt("code", i);
            bundle.putBundle("body", JsonUtils.toBundle(obj));
            bundle.putBoolean("success", z);
            BundleUtils.putString("error_message", str3, bundle);
            a(bundle, "receive_http_response");
        }
    }

    public void a(Bundle bundle, String str) {
        if (((Boolean) this.f930a.a(oj.E6)).booleanValue() && this.b.hasSubscriber(str)) {
            this.b.getMessagingService().publish(CommunicatorMessageImpl.create(bundle, str, this));
        }
    }

    public boolean a(String str) {
        return jo.f575a.contains(str);
    }

    private Bundle a(be beVar) {
        Bundle bundle = new Bundle();
        bundle.putString("id", beVar.Q());
        bundle.putString("network_name", beVar.c());
        bundle.putString("max_ad_unit_id", beVar.getAdUnitId());
        bundle.putString("third_party_ad_placement_id", beVar.S());
        bundle.putString(FirebaseAnalytics.Param.AD_FORMAT, beVar.getFormat().getLabel());
        BundleUtils.putStringIfValid(CampaignEx.JSON_KEY_CREATIVE_ID, beVar.getCreativeId(), bundle);
        BundleUtils.putStringIfValid("adomain", beVar.u(), bundle);
        BundleUtils.putStringIfValid("dsp_name", beVar.getDspName(), bundle);
        if (beVar.X()) {
            BundleUtils.putStringIfValid("hybrid_ad_format", beVar.H().getLabel(), bundle);
        }
        if (beVar.Y()) {
            bundle.putString("custom_js_network_name", beVar.getNetworkName());
        } else if ("CUSTOM_NETWORK_SDK".equalsIgnoreCase(beVar.c())) {
            bundle.putString("custom_sdk_network_name", beVar.getNetworkName());
        }
        bundle.putAll(JsonUtils.toBundle(beVar.w()));
        if (beVar instanceof ie) {
            View viewL0 = null;
            if (beVar instanceof ce) {
                viewL0 = ((ce) beVar).x();
            } else if (beVar instanceof ee) {
                ee eeVar = (ee) beVar;
                if (!eeVar.r0()) {
                    viewL0 = eeVar.l0() != null ? eeVar.l0() : eeVar.m0();
                }
            }
            bundle.putString("ad_view", viewL0 != null ? ar.a(viewL0) : "N/A");
        } else if (beVar instanceof de) {
            Bundle bundle2 = ((de) beVar).j0().getBundle("applovin_ad_view_info");
            bundle.putString("ad_view", BundleUtils.getString("ad_view_address", "N/A", bundle2));
            bundle.putString("video_view", BundleUtils.getString("video_view_address", "N/A", bundle2));
        }
        return bundle;
    }

    public void b(be beVar) {
        if (((Boolean) this.f930a.a(oj.E6)).booleanValue() && this.b.hasSubscriber("max_revenue_events")) {
            Bundle bundleA = a(beVar);
            bundleA.putAll(JsonUtils.toBundle(beVar.P()));
            bundleA.putString("country_code", this.f930a.q().getCountryCode());
            if (this.f930a.r0() != null) {
                BundleUtils.putStringIfValid("user_segment", this.f930a.r0().getName(), bundleA);
            }
            a(bundleA, "max_revenue_events");
        }
    }

    public void b(String str, String str2) {
        if (((Boolean) this.f930a.a(oj.E6)).booleanValue() && this.b.hasSubscriber("user_info")) {
            Bundle bundle = new Bundle(2);
            bundle.putString("user_id", StringUtils.emptyIfNull(str));
            bundle.putString("applovin_random_token", str2);
            a(bundle, "user_info");
        }
    }

    public void b(List list) {
        if (((Boolean) this.f930a.a(oj.E6)).booleanValue() && this.b.hasSubscriber("test_mode_networks_updated")) {
            if (list != null && !list.isEmpty()) {
                Bundle bundle = new Bundle();
                bundle.putStringArrayList("test_mode_networks", new ArrayList<>(list));
                a(bundle, "test_mode_networks_updated");
                return;
            }
            a(Bundle.EMPTY, "test_mode_networks_updated");
        }
    }
}
