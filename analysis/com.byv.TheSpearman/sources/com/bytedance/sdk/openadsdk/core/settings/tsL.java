package com.bytedance.sdk.openadsdk.core.settings;

import android.text.TextUtils;
import com.applovin.sdk.AppLovinMediationProvider;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.bytedance.sdk.openadsdk.core.settings.Pm;
import com.bytedance.sdk.openadsdk.core.settings.nWX;
import com.bytedance.sdk.openadsdk.utils.zF;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.vungle.ads.internal.signals.SignalManager;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: SettingsDefaultRepository.java */
/* loaded from: classes2.dex */
public class tsL extends nWX {
    static final ArrayList<String> Pm = new ArrayList<>(Arrays.asList("ja", "en", "ko", "zh", "th", "vi", "id", "ru", "ar", "fr", DownloadCommon.DOWNLOAD_REPORT_DOWNLOAD_ERROR, "it", "es", "hi", "pt", "zh-Hant", "ms", "pl", "tr"));
    private Set<String> Kbd;
    public boolean Td;

    public tsL(nWX.EYQ eyq) {
        super("tt_sdk_settings.prop", eyq);
        this.Kbd = Collections.synchronizedSet(new HashSet());
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.Pm
    public void EYQ(JSONObject jSONObject) {
        int iOptInt;
        Pm.EYQ EYQ = EYQ();
        JSONObject jSONObjectKbd = KO.Jpu().Kbd();
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("digest");
        this.Td = (jSONObjectOptJSONObject == null || jSONObjectKbd == null || !jSONObjectOptJSONObject.toString().equals(jSONObjectKbd.toString())) ? false : true;
        if (jSONObjectOptJSONObject != null) {
            EYQ.EYQ("digest", jSONObjectOptJSONObject.toString());
        } else {
            EYQ.EYQ("digest");
        }
        EYQ.EYQ("data_time", jSONObject.optLong("data_time"));
        if (jSONObject.has("req_inter_min")) {
            long jOptLong = jSONObject.optLong("req_inter_min", 10L) * 60 * 1000;
            if (jOptLong < 0 || jOptLong > SignalManager.TWENTY_FOUR_HOURS_MILLIS) {
                jOptLong = TTAdConstant.AD_MAX_EVENT_TIME;
            }
            EYQ.EYQ("req_inter_min", jOptLong);
        }
        if (jSONObject.has("lp_new_style")) {
            EYQ.EYQ("landingpage_new_style", jSONObject.optInt("lp_new_style", Integer.MAX_VALUE));
        }
        if (jSONObject.has("blank_detect_rate")) {
            int iOptInt2 = jSONObject.optInt("blank_detect_rate", 30);
            if (iOptInt2 < 0 || iOptInt2 > 100) {
                iOptInt2 = 30;
            }
            EYQ.EYQ("blank_detect_rate", iOptInt2);
        }
        JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("feq_policy");
        if (jSONObjectOptJSONObject2 != null) {
            if (jSONObjectOptJSONObject2.has("duration")) {
                EYQ.EYQ("duration", jSONObjectOptJSONObject2.optLong("duration") * 1000);
            }
            if (jSONObjectOptJSONObject2.has(AppLovinMediationProvider.MAX)) {
                EYQ.EYQ(AppLovinMediationProvider.MAX, jSONObjectOptJSONObject2.optInt(AppLovinMediationProvider.MAX));
            }
        }
        if (jSONObject.has("vbtt")) {
            EYQ.EYQ("vbtt", jSONObject.optInt("vbtt", 5));
        }
        JSONObject jSONObjectOptJSONObject3 = jSONObject.optJSONObject("abtest");
        if (jSONObjectOptJSONObject3 != null) {
            if (jSONObjectOptJSONObject3.has("version")) {
                EYQ.EYQ("ab_test_version", jSONObjectOptJSONObject3.optString("version"));
            }
            if (jSONObjectOptJSONObject3.has("param")) {
                EYQ.EYQ("ab_test_param", jSONObjectOptJSONObject3.optString("param"));
            }
        } else {
            KO.Jpu().VwS();
        }
        JSONObject jSONObjectOptJSONObject4 = jSONObject.optJSONObject("log_rate_conf");
        if (jSONObjectOptJSONObject4 != null && jSONObjectOptJSONObject4.has("global_rate")) {
            EYQ.EYQ("global_rate", (float) jSONObjectOptJSONObject4.optDouble("global_rate", 1.0d));
        }
        if (jSONObject.has("pyload_h5")) {
            EYQ.EYQ("pyload_h5", jSONObject.optString("pyload_h5"));
        }
        if (jSONObject.has("pure_pyload_h5")) {
            EYQ.EYQ("playableLoadH5Url", jSONObject.optString("pure_pyload_h5"));
        }
        if (jSONObject.has("ads_url")) {
            EYQ.EYQ("ads_url", jSONObject.optString("ads_url"));
        }
        if (jSONObject.has("app_log_url")) {
            EYQ.EYQ("app_log_url", jSONObject.optString("app_log_url"));
        }
        if (jSONObject.has("apm_url")) {
            EYQ.EYQ("apm_url", jSONObject.optString("apm_url"));
        }
        if (jSONObject.has("coppa")) {
            int iOptInt3 = jSONObject.optInt("coppa", -99);
            com.bytedance.sdk.openadsdk.core.QQ.mZx().Pm(iOptInt3);
            EYQ.EYQ("coppa", iOptInt3);
        }
        if (jSONObject.has(CampaignEx.JSON_KEY_PRIVACY_URL)) {
            EYQ.EYQ("policy_url", jSONObject.optString(CampaignEx.JSON_KEY_PRIVACY_URL));
        }
        if (jSONObject.has("consent_url")) {
            EYQ.EYQ("consent_url", jSONObject.optString("consent_url"));
        }
        if (jSONObject.has("ivrv_downward")) {
            EYQ.EYQ("ivrv_downward", jSONObject.optInt("ivrv_downward", 0));
        }
        if (jSONObject.has("dc")) {
            EYQ.EYQ("dc", jSONObject.optString("dc"));
        }
        KO.Jpu().EYQ(jSONObject, EYQ);
        KO.Jpu().mZx(jSONObject, EYQ);
        if (jSONObject.has("if_both_open")) {
            EYQ.EYQ("if_both_open", jSONObject.optInt("if_both_open", 0));
        }
        if (jSONObject.has("support_tnc")) {
            EYQ.EYQ("support_tnc", jSONObject.optInt("support_tnc", 1));
        }
        if (jSONObject.has("insert_js_config")) {
            EYQ.EYQ("insert_js_config", jSONObject.optString("insert_js_config", ""));
        }
        if (jSONObject.has("max_tpl_cnts")) {
            EYQ.EYQ("max_tpl_cnts", jSONObject.optInt("max_tpl_cnts", 100));
        }
        JSONObject jSONObjectOptJSONObject5 = jSONObject.optJSONObject("app_common_config");
        if (jSONObjectOptJSONObject5 != null) {
            if (jSONObjectOptJSONObject5.has("force_language")) {
                String strOptString = jSONObjectOptJSONObject5.optString("force_language");
                if (!TextUtils.isEmpty(strOptString) && Pm.contains(strOptString)) {
                    EYQ.EYQ("force_language", strOptString);
                }
            }
            if (jSONObjectOptJSONObject5.has("fetch_tpl_timeout_ctrl")) {
                EYQ.EYQ("fetch_tpl_timeout_ctrl", jSONObjectOptJSONObject5.optInt("fetch_tpl_timeout_ctrl", 3000));
            }
            if (jSONObjectOptJSONObject5.has("fetch_tpl_second")) {
                EYQ.EYQ("fetch_tpl_second", jSONObjectOptJSONObject5.optInt("fetch_tpl_second", 0));
            }
            if (jSONObjectOptJSONObject5.has("disable_rotate_banner_on_dislike")) {
                EYQ.EYQ("disable_rotate_banner_on_dislike", jSONObjectOptJSONObject5.optInt("disable_rotate_banner_on_dislike", Integer.MAX_VALUE));
            }
            if (jSONObjectOptJSONObject5.has("support_gzip")) {
                EYQ.EYQ("support_gzip", jSONObjectOptJSONObject5.optBoolean("support_gzip", false));
            }
            if (jSONObjectOptJSONObject5.has("aes_key")) {
                EYQ.EYQ("aes_key", jSONObjectOptJSONObject5.optString("aes_key"));
            }
            if (jSONObjectOptJSONObject5.has("support_rtl")) {
                EYQ.EYQ("support_rtl", jSONObjectOptJSONObject5.optBoolean("support_rtl", false));
            }
            if (jSONObjectOptJSONObject5.has("ad_revenue_enable")) {
                EYQ.EYQ("ad_revenue_enable", jSONObjectOptJSONObject5.optBoolean("ad_revenue_enable", false));
            }
            if (jSONObjectOptJSONObject5.has("gecko_hosts")) {
                try {
                    this.Kbd.clear();
                    JSONArray jSONArrayOptJSONArray = jSONObjectOptJSONObject5.optJSONArray("gecko_hosts");
                    if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() != 0) {
                        for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                            this.Kbd.add(jSONArrayOptJSONArray.getString(i));
                        }
                    }
                    this.Kbd = EYQ(this.Kbd);
                    EYQ.EYQ("gecko_hosts", jSONArrayOptJSONArray.toString());
                } catch (Throwable th) {
                    com.bytedance.sdk.component.utils.pi.mZx("GeckoLog: settings json error ".concat(String.valueOf(th)));
                }
            }
        }
        if (jSONObject.has("read_video_from_cache")) {
            EYQ.EYQ("read_video_from_cache", jSONObject.optInt("read_video_from_cache", 1));
        }
        mZx.EYQ(jSONObject.optJSONArray("ad_slot_conf_list"));
        JSONObject jSONObjectOptJSONObject6 = jSONObject.optJSONObject("privacy");
        if (jSONObjectOptJSONObject6 != null) {
            if (jSONObjectOptJSONObject6.has("ad_enable")) {
                EYQ.EYQ("privacy_ad_enable", jSONObjectOptJSONObject6.optInt("ad_enable", Integer.MAX_VALUE));
            }
            if (jSONObjectOptJSONObject6.has("personalized_ad")) {
                EYQ.EYQ("privacy_personalized_ad", jSONObjectOptJSONObject6.optInt("personalized_ad", Integer.MAX_VALUE));
            }
            if (jSONObjectOptJSONObject6.has("sladar_enable")) {
                EYQ.EYQ("privacy_sladar_enable", jSONObjectOptJSONObject6.optInt("sladar_enable", Integer.MAX_VALUE));
            }
            if (jSONObjectOptJSONObject6.has("app_log_enable")) {
                EYQ.EYQ("privacy_app_log_enable", jSONObjectOptJSONObject6.optInt("app_log_enable", Integer.MAX_VALUE));
            }
            if (jSONObjectOptJSONObject6.has("debug_unlock")) {
                EYQ.EYQ("privacy_debug_unlock", jSONObjectOptJSONObject6.optInt("debug_unlock", Integer.MAX_VALUE));
            }
            if (jSONObjectOptJSONObject6.has("fields_allowed")) {
                String strOptString2 = jSONObjectOptJSONObject6.optString("fields_allowed", "");
                if (!TextUtils.isEmpty(strOptString2)) {
                    EYQ.EYQ("privacy_fields_allowed", strOptString2);
                } else {
                    EYQ.EYQ("privacy_fields_allowed");
                }
            }
        }
        if (jSONObject.has("video_cache_config")) {
            EYQ.EYQ("video_cache_config", jSONObject.optString("video_cache_config"));
        }
        if (jSONObject.has("loaded_recall_time")) {
            int iOptInt4 = jSONObject.optInt("loaded_recall_time", 0);
            if (iOptInt4 != 0 && iOptInt4 != 1) {
                iOptInt4 = 0;
            }
            EYQ.EYQ("loadedCallbackOpportunity", iOptInt4);
        }
        if (jSONObject.has("load_strategy")) {
            int iOptInt5 = jSONObject.optInt("load_strategy", 0);
            if (iOptInt5 != 0 && iOptInt5 != 1) {
                iOptInt5 = 0;
            }
            EYQ.EYQ("load_callback_strategy", iOptInt5);
        }
        if (jSONObject.has("splash_video_load_strategy")) {
            int iOptInt6 = jSONObject.optInt("splash_video_load_strategy", 0);
            if (iOptInt6 < 0 || iOptInt6 > 3) {
                iOptInt6 = 0;
            }
            EYQ.EYQ("splash_video_load_strategy", iOptInt6);
        }
        if (jSONObject.has("support_mem_dynamic")) {
            int iOptInt7 = jSONObject.optInt("support_mem_dynamic", 0);
            if (iOptInt7 != 0 && iOptInt7 != 1) {
                iOptInt7 = 0;
            }
            EYQ.EYQ("support_mem_dynamic", iOptInt7);
        }
        if (jSONObject.has("allow_blind_mode_request_ad")) {
            EYQ.EYQ("allow_blind_mode_request_ad", jSONObject.optBoolean("allow_blind_mode_request_ad", false));
        }
        JSONObject jSONObjectOptJSONObject7 = jSONObject.optJSONObject("bus_con");
        if (jSONObjectOptJSONObject7 != null) {
            if (jSONObjectOptJSONObject7.has("bus_con_send_log_type")) {
                EYQ.EYQ("bus_con_send_log_type", jSONObjectOptJSONObject7.optInt("bus_con_send_log_type", 1));
            }
            if (jSONObjectOptJSONObject7.has("bus_con_sec_type")) {
                EYQ.EYQ("bus_con_sec_type", jSONObjectOptJSONObject7.optInt("bus_con_sec_type", Integer.MAX_VALUE));
            }
            if (jSONObjectOptJSONObject7.has("bus_con_dislike_report_raw")) {
                EYQ.EYQ("bus_con_dislike_report_raw", jSONObjectOptJSONObject7.optBoolean("bus_con_dislike_report_raw", false));
            }
            if (jSONObjectOptJSONObject7.has("bus_con_adshow_check_enable")) {
                EYQ.EYQ("bus_con_adshow_check_enable", jSONObjectOptJSONObject7.optBoolean("bus_con_adshow_check_enable", true));
            }
            if (jSONObjectOptJSONObject7.has("bus_con_tnc_interval")) {
                EYQ.EYQ("bus_con_tnc_interval", jSONObjectOptJSONObject7.optLong("bus_con_tnc_interval", TTAdConstant.AD_MAX_EVENT_TIME));
            }
            if (jSONObjectOptJSONObject7.has("bus_con_token_thread_count")) {
                EYQ.EYQ("bus_con_token_thread_count", jSONObjectOptJSONObject7.optInt("bus_con_token_thread_count", 4));
            }
            if (jSONObjectOptJSONObject7.has("bus_con_video_keep_screen_on")) {
                EYQ.EYQ("bus_con_video_keep_screen_on", jSONObjectOptJSONObject7.optInt("bus_con_video_keep_screen_on", 1));
            }
            if (jSONObjectOptJSONObject7.has("bus_con_auto_click_delay")) {
                EYQ.EYQ("bus_con_auto_click_delay", jSONObjectOptJSONObject7.optInt("bus_con_auto_click_delay", 3000));
            }
            if (jSONObjectOptJSONObject7.has("bus_con_express_host")) {
                EYQ.EYQ("bus_con_express_host", jSONObjectOptJSONObject7.optString("bus_con_express_host", "https://sf16-static.i18n-pglstatp.com/obj/ad-pattern-sg/"));
            }
        }
        if (jSONObject.has("perf_con")) {
            try {
                JSONObject jSONObjectOptJSONObject8 = jSONObject.optJSONObject("perf_con");
                if (jSONObjectOptJSONObject8 != null) {
                    if (jSONObjectOptJSONObject8.has("perf_con_stats_rate")) {
                        String strOptString3 = jSONObjectOptJSONObject8.optString("perf_con_stats_rate");
                        if (!TextUtils.isEmpty(strOptString3)) {
                            EYQ.EYQ("perf_con_stats_rate", strOptString3);
                        }
                    }
                    if (jSONObjectOptJSONObject8.has("perf_con_applog_send")) {
                        String strOptString4 = jSONObjectOptJSONObject8.optString("perf_con_applog_send");
                        if (!TextUtils.isEmpty(strOptString4)) {
                            EYQ.EYQ("perf_con_applog_send", strOptString4);
                        }
                    }
                    if (jSONObjectOptJSONObject8.has("perf_con_apm_native")) {
                        EYQ.EYQ("perf_con_apm_native", jSONObjectOptJSONObject8.optInt("perf_con_apm_native"));
                    }
                    if (jSONObjectOptJSONObject8.has("perf_con_webview_preload_cache")) {
                        EYQ.EYQ("perf_con_webview_preload_cache", jSONObjectOptJSONObject8.optInt("perf_con_webview_preload_cache"));
                    }
                    if (jSONObjectOptJSONObject8.has("perf_con_webview_preload_cache_v3")) {
                        EYQ.EYQ("perf_con_webview_preload_cache_v3", jSONObjectOptJSONObject8.optInt("perf_con_webview_preload_cache_v3"));
                    }
                    if (jSONObjectOptJSONObject8.has("perf_con_webview_cache_count")) {
                        EYQ.EYQ("perf_con_webview_cache_count", jSONObjectOptJSONObject8.optInt("perf_con_webview_cache_count", 0));
                    }
                    if (jSONObjectOptJSONObject8.has("perf_con_webview_cache_count_v3")) {
                        EYQ.EYQ("perf_con_webview_cache_count_v3", jSONObjectOptJSONObject8.optInt("perf_con_webview_cache_count_v3", 0));
                    }
                    if (jSONObjectOptJSONObject8.has("perf_con_thread_stack_size") && (iOptInt = jSONObjectOptJSONObject8.optInt("perf_con_thread_stack_size")) >= -524288 && iOptInt <= 0) {
                        EYQ.EYQ("perf_con_thread_stack_size", iOptInt);
                    }
                    if (jSONObjectOptJSONObject8.has("perf_con_apm")) {
                        EYQ.EYQ("perf_con_apm", jSONObjectOptJSONObject8.optInt("perf_con_apm"));
                    }
                    if (jSONObjectOptJSONObject8.has("perf_con_use_new_thread_pool")) {
                        EYQ.EYQ("perf_con_use_new_thread_pool", jSONObjectOptJSONObject8.optInt("perf_con_use_new_thread_pool", 0));
                    }
                    if (jSONObjectOptJSONObject8.has("perf_con_thread_pool_config")) {
                        String strOptString5 = jSONObjectOptJSONObject8.optString("perf_con_thread_pool_config");
                        if (!TextUtils.isEmpty(strOptString5)) {
                            EYQ.EYQ("perf_con_thread_pool_config", strOptString5);
                        }
                    }
                    if (jSONObjectOptJSONObject8.has("perf_con_use_prop")) {
                        zF.EYQ(jSONObjectOptJSONObject8.optInt("perf_con_use_prop", 1));
                    }
                    if (jSONObjectOptJSONObject8.has("perf_con_adlog_expire_time")) {
                        EYQ.EYQ("perf_con_adlog_expire_time", jSONObjectOptJSONObject8.optLong("perf_con_adlog_expire_time"));
                    }
                    if (jSONObjectOptJSONObject8.has("perf_con_adlog_turn_off_retry_ad")) {
                        EYQ.EYQ("perf_con_adlog_turn_off_retry_ad", jSONObjectOptJSONObject8.optLong("perf_con_adlog_turn_off_retry_ad"));
                    }
                    if (jSONObjectOptJSONObject8.has("perf_con_adlog_turn_off_retry_stats")) {
                        EYQ.EYQ("perf_con_adlog_turn_off_retry_stats", jSONObjectOptJSONObject8.optLong("perf_con_adlog_turn_off_retry_stats"));
                    }
                    if (jSONObjectOptJSONObject8.has("perf_con_applog_rate")) {
                        EYQ.EYQ("perf_con_applog_rate", jSONObjectOptJSONObject8.optString("perf_con_applog_rate"));
                    }
                    if (jSONObjectOptJSONObject8.has("perf_con_track_url_strategy")) {
                        EYQ.EYQ("perf_con_track_url_strategy", jSONObjectOptJSONObject8.optString("perf_con_track_url_strategy"));
                    }
                    if (jSONObjectOptJSONObject8.has("perf_con_drawable_code")) {
                        EYQ.EYQ("perf_con_drawable_code", jSONObjectOptJSONObject8.optInt("perf_con_drawable_code", 0));
                    }
                }
            } catch (Throwable th2) {
                com.bytedance.sdk.component.utils.pi.EYQ("SettingsDefaultRepository", th2.getMessage());
            }
        }
        if (jSONObject.has("dual_event_url")) {
            EYQ.EYQ("dual_event_url", jSONObject.optString("dual_event_url"));
        }
        EYQ.EYQ();
        KO.Jpu().FH();
    }

    public static Set<String> EYQ(Set<String> set) {
        try {
            if (set == null) {
                return new HashSet();
            }
            HashSet hashSet = new HashSet();
            for (String str : set) {
                if (!TextUtils.isEmpty(str)) {
                    hashSet.add(str);
                }
            }
            return hashSet;
        } catch (Throwable unused) {
            return new HashSet();
        }
    }
}
