package com.bytedance.sdk.openadsdk.mZx.EYQ;

import androidx.core.app.NotificationCompat;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.utils.DeviceUtils;
import com.vungle.ads.internal.signals.SignalManager;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONObject;

/* compiled from: GetAdEventMonitor.java */
/* loaded from: classes2.dex */
public class IPb {
    public static AtomicInteger EYQ = new AtomicInteger(0);
    public static AtomicInteger mZx = new AtomicInteger(0);
    public static AtomicInteger Td = new AtomicInteger(0);
    public static AtomicInteger Pm = new AtomicInteger(0);
    public static AtomicInteger Kbd = new AtomicInteger(0);
    public static AtomicInteger IPb = new AtomicInteger(0);
    public static AtomicInteger VwS = new AtomicInteger(0);
    public static AtomicInteger QQ = new AtomicInteger(0);
    public static AtomicInteger HX = new AtomicInteger(0);

    public static void EYQ() {
        try {
            long jEYQ = com.bytedance.sdk.openadsdk.multipro.Pm.EYQ.EYQ("tt_sdk_event_get_ad", "get_ad_event_time_key", 0L);
            if (jEYQ > 0 && System.currentTimeMillis() - jEYQ >= SignalManager.TWENTY_FOUR_HOURS_MILLIS) {
                mZx();
                com.bytedance.sdk.openadsdk.multipro.Pm.EYQ.EYQ("tt_sdk_event_get_ad", "get_ad_event_time_key", Long.valueOf(System.currentTimeMillis()));
                return;
            }
            if (jEYQ <= 0 || jEYQ > System.currentTimeMillis()) {
                com.bytedance.sdk.openadsdk.multipro.Pm.EYQ.EYQ("tt_sdk_event_get_ad", "get_ad_event_time_key", Long.valueOf(System.currentTimeMillis()));
            }
            JSONObject jSONObject = new JSONObject(com.bytedance.sdk.openadsdk.multipro.Pm.EYQ.mZx("tt_sdk_event_get_ad", "get_ad_event_key", ""));
            int iOptInt = jSONObject.optInt("load_get_ad_version", 0);
            if (iOptInt >= 5702 && (iOptInt < 5800 || iOptInt >= 5802)) {
                EYQ.addAndGet(jSONObject.optInt("load_times"));
                mZx.addAndGet(jSONObject.optInt("load_success"));
                Td.addAndGet(jSONObject.optInt("load_fail"));
                Pm.addAndGet(jSONObject.optInt("load_success_and_parse_success"));
                Kbd.addAndGet(jSONObject.optInt("load_success_and_parse_fail"));
                IPb.addAndGet(jSONObject.optInt("load_success_and_no_ad"));
                VwS.addAndGet(jSONObject.optInt("load_fail_by_no_net"));
                QQ.addAndGet(jSONObject.optInt("load_fail_by_io"));
                HX.addAndGet(jSONObject.optInt("load_fail_in_background"));
                return;
            }
            com.bytedance.sdk.openadsdk.multipro.Pm.EYQ.EYQ("tt_sdk_event_get_ad");
        } catch (Throwable unused) {
        }
    }

    public static void mZx() {
        try {
            com.bytedance.sdk.openadsdk.tp.Td.EYQ().EYQ("pangle_sdk_get_ad_track", com.bytedance.sdk.openadsdk.multipro.Pm.EYQ.mZx("tt_sdk_event_get_ad", "get_ad_event_key", ""));
            com.bytedance.sdk.openadsdk.multipro.Pm.EYQ.EYQ("tt_sdk_event_get_ad");
        } catch (Throwable unused) {
        }
    }

    public static void Td() {
        try {
            com.bytedance.sdk.openadsdk.multipro.Pm.EYQ.EYQ("tt_sdk_event_get_ad", "get_ad_event_key", Pm().toString());
        } catch (Throwable unused) {
        }
    }

    public static JSONObject Pm() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("load_times", EYQ.get());
            jSONObject.put("load_success", mZx.get());
            jSONObject.put("load_fail", Td.get());
            jSONObject.put("load_fail_in_background", HX.get());
            jSONObject.put("load_success_and_parse_success", Pm.get());
            jSONObject.put("load_success_and_parse_fail", Kbd.get());
            jSONObject.put("load_success_and_no_ad", IPb.get());
            jSONObject.put("load_fail_by_no_net", VwS.get());
            jSONObject.put("load_fail_by_io", QQ.get());
            jSONObject.put("load_get_ad_version", BuildConfig.VERSION_CODE);
            return jSONObject;
        } catch (Throwable unused) {
            return new JSONObject();
        }
    }

    public static void EYQ(int i, String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", i);
            jSONObject.put(NotificationCompat.CATEGORY_MESSAGE, str);
            com.bytedance.sdk.openadsdk.tp.Td.EYQ().EYQ("pangle_sdk_client_load_error", jSONObject);
        } catch (Throwable unused) {
        }
    }

    public static void Kbd() {
        try {
            if (DeviceUtils.mZx()) {
                return;
            }
            HX.incrementAndGet();
        } catch (Throwable unused) {
        }
    }
}
