package com.bytedance.sdk.openadsdk.mZx.EYQ;

import android.content.Context;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.bytedance.JProtect;
import com.bytedance.sdk.component.utils.zF;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.core.hu;
import com.bytedance.sdk.openadsdk.core.model.UB;
import com.bytedance.sdk.openadsdk.utils.DeviceUtils;
import com.bytedance.sdk.openadsdk.utils.FH;
import com.bytedance.sdk.openadsdk.utils.Uc;
import com.bytedance.sdk.openadsdk.utils.WU;
import com.bytedance.sdk.openadsdk.utils.XN;
import com.bytedance.sdk.openadsdk.utils.tr;
import com.json.i5;
import com.json.t2;
import com.json.td;
import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: AdLogParamsGenerate.java */
/* loaded from: classes2.dex */
public class Td {
    private long EYQ;
    private final String Kbd;
    private final boolean Pm;
    private final Context Td;
    private int mZx;

    private String EYQ(int i) {
        return i != 120 ? i != 160 ? i != 240 ? i != 320 ? i != 480 ? i != 640 ? "mdpi" : "xxxhdpi" : "xxhdpi" : "xhdpi" : "hdpi" : "mdpi" : "ldpi";
    }

    /* compiled from: AdLogParamsGenerate.java */
    private static class EYQ {
        private static final Td EYQ = new Td();
    }

    public static Td EYQ() {
        return EYQ.EYQ;
    }

    private Td() {
        this.Pm = Td();
        this.Td = hu.EYQ().getApplicationContext();
        this.Kbd = Kbd();
    }

    public String EYQ(List<com.bytedance.sdk.openadsdk.mZx.EYQ> list) {
        return FH.Kbd((list.size() <= 0 || list.get(0) == null || list.get(0).Td() == null) ? "" : list.get(0).Td().optString("app_log_url"));
    }

    private void EYQ(com.bytedance.sdk.openadsdk.mZx.EYQ eyq, boolean z) {
        String strOptString;
        if (eyq == null) {
            return;
        }
        try {
            if (z) {
                strOptString = eyq.Td().optJSONObject("params").optString("log_extra", "");
            } else {
                strOptString = eyq.Td().optString("log_extra", "");
            }
            long jEYQ = UB.EYQ(strOptString);
            int iPm = UB.Pm(strOptString);
            if (jEYQ == 0) {
                jEYQ = this.EYQ;
            }
            this.EYQ = jEYQ;
            if (iPm == 0) {
                iPm = this.mZx;
            }
            this.mZx = iPm;
        } catch (Exception e) {
            com.bytedance.sdk.component.utils.pi.EYQ("AdLogParamsGenerate", "getInfoFromLogExtra exception", e.getMessage());
        }
    }

    public JSONObject EYQ(List<com.bytedance.sdk.openadsdk.mZx.EYQ> list, long j, JSONObject jSONObject, boolean z) {
        JSONObject jSONObject2 = new JSONObject();
        try {
            EYQ(list.get(0), z);
            jSONObject2.put("header", jSONObject);
            JSONArray jSONArray = new JSONArray();
            Iterator<com.bytedance.sdk.openadsdk.mZx.EYQ> it = list.iterator();
            while (it.hasNext()) {
                jSONArray.put(it.next().EYQ(z));
            }
            if (z) {
                jSONObject2.put("event_v3", jSONArray);
                jSONObject2.put("magic_tag", "ss_app_log");
            } else {
                jSONObject2.put(NotificationCompat.CATEGORY_EVENT, jSONArray);
            }
            jSONObject2.put("_gen_time", j);
            jSONObject2.put("local_time", j / 1000);
        } catch (JSONException unused) {
        }
        return jSONObject2;
    }

    public List<com.bytedance.sdk.openadsdk.mZx.EYQ> EYQ(List<com.bytedance.sdk.openadsdk.mZx.EYQ> list, boolean z) {
        ArrayList arrayList = new ArrayList();
        for (com.bytedance.sdk.openadsdk.mZx.EYQ eyq : list) {
            try {
                JSONObject jSONObject = new JSONObject();
                JSONObject jSONObjectTd = eyq.Td();
                jSONObject.putOpt(NotificationCompat.CATEGORY_EVENT, jSONObjectTd.optString("label"));
                long jOptLong = jSONObjectTd.optLong("event_ts", System.currentTimeMillis());
                jSONObject.putOpt("local_time_ms", Long.valueOf(jOptLong));
                jSONObject.putOpt("datetime", com.bytedance.sdk.openadsdk.mZx.IPb.Td.format(new Date(jOptLong)));
                JSONObject jSONObject2 = new JSONObject();
                Iterator<String> itKeys = jSONObjectTd.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    if (!TextUtils.equals(next, "label")) {
                        jSONObject2.putOpt(next, jSONObjectTd.opt(next));
                    }
                }
                if (z) {
                    jSONObject2.putOpt("_ad_staging_flag", 3);
                }
                jSONObject.putOpt("params", jSONObject2);
                arrayList.add(new com.bytedance.sdk.openadsdk.mZx.IPb(eyq.EYQ, jSONObject));
            } catch (Exception e) {
                com.bytedance.sdk.component.utils.pi.EYQ("AdLogParamsGenerate", e.getMessage());
            }
        }
        return arrayList;
    }

    public List<com.bytedance.sdk.openadsdk.mZx.EYQ> mZx(List<com.bytedance.sdk.openadsdk.mZx.EYQ> list) {
        ArrayList arrayList = new ArrayList();
        for (com.bytedance.sdk.openadsdk.mZx.EYQ eyq : list) {
            try {
                JSONObject jSONObjectTd = eyq.Td();
                jSONObjectTd.putOpt("_ad_staging_flag", 1);
                arrayList.add(new com.bytedance.sdk.openadsdk.mZx.EYQ(eyq.EYQ, jSONObjectTd));
            } catch (Exception e) {
                com.bytedance.sdk.component.utils.pi.EYQ("AdLogParamsGenerate", e.getMessage());
            }
        }
        return arrayList;
    }

    @JProtect
    public JSONObject mZx() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(i5.R, FH.Td());
            jSONObject.put("ad_sdk_version", BuildConfig.VERSION_NAME);
            jSONObject.put("app_version", FH.VwS());
            jSONObject.put("sim_op", EYQ(this.Td));
            jSONObject.put(td.y, this.Pm ? 1 : 0);
            jSONObject.put("timezone", Pm());
            jSONObject.put("access", Uc.EYQ(this.Td));
            jSONObject.put(i5.x, t2.e);
            jSONObject.put("os_version", Build.VERSION.RELEASE);
            jSONObject.put("os_api", Build.VERSION.SDK_INT);
            jSONObject.put("device_type", this.Kbd);
            jSONObject.put("device_model", Build.MODEL);
            jSONObject.put("device_brand", Build.BRAND);
            jSONObject.put("device_manufacturer", Build.MANUFACTURER);
            jSONObject.put("language", Locale.getDefault().getLanguage());
            jSONObject.put("resolution", tr.Pm(this.Td) + "x" + tr.Td(this.Td));
            jSONObject.put("display_density", EYQ(tr.VwS(this.Td)));
            jSONObject.put("density_dpi", tr.VwS(this.Td));
            jSONObject.put("aid", "1371");
            jSONObject.put("device_id", com.bytedance.sdk.openadsdk.core.MxO.EYQ(this.Td));
            jSONObject.put("rom", IPb());
            jSONObject.put("cpu_abi", Build.CPU_ABI);
            jSONObject.put("ut", this.mZx);
            jSONObject.put("uid", this.EYQ);
            jSONObject.put("google_aid", com.com.bytedance.overseas.sdk.mZx.EYQ.EYQ().mZx());
            jSONObject.put("locale_language", DeviceUtils.Pm());
            jSONObject.put("screen_bright", Math.ceil(DeviceUtils.Kbd() * 10.0f) / 10.0d);
            jSONObject.put("is_screen_off", DeviceUtils.mZx() ? 0 : 1);
            com.bytedance.sdk.openadsdk.core.settings.Kbd kbdPm = hu.Pm();
            jSONObject.put("force_language", zF.EYQ(this.Td, "tt_choose_language"));
            if (kbdPm.lEs("mnc")) {
                jSONObject.put("mnc", XN.Td());
            }
            if (kbdPm.lEs("mcc")) {
                jSONObject.put("mcc", XN.mZx());
            }
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    private String EYQ(Context context) {
        try {
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
            return telephonyManager == null ? "" : telephonyManager.getSimOperator();
        } catch (Throwable unused) {
            return "";
        }
    }

    private boolean Td() {
        try {
            if (!new File("/system/bin/su").exists()) {
                if (!new File("/system/xbin/su").exists()) {
                    return false;
                }
            }
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    private int Pm() {
        int rawOffset = TimeZone.getDefault().getRawOffset() / 3600000;
        if (rawOffset < -12) {
            rawOffset = -12;
        }
        if (rawOffset > 12) {
            return 12;
        }
        return rawOffset;
    }

    private String Kbd() {
        return DeviceUtils.Td(this.Td) ? "tv" : DeviceUtils.mZx(this.Td) ? "android_pad" : "android";
    }

    @JProtect
    private String IPb() {
        StringBuilder sb = new StringBuilder();
        try {
            if (WU.Kbd()) {
                sb.append("MIUI-");
            } else if (WU.mZx()) {
                sb.append("FLYME-");
            } else {
                String strNWX = WU.nWX();
                if (WU.EYQ(strNWX)) {
                    sb.append("EMUI-");
                }
                if (!TextUtils.isEmpty(strNWX)) {
                    sb.append(strNWX);
                    sb.append("-");
                }
            }
            sb.append(Build.VERSION.INCREMENTAL);
        } catch (Throwable unused) {
        }
        return sb.toString();
    }
}
