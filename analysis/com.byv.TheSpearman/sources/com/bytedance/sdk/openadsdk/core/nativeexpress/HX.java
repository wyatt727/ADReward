package com.bytedance.sdk.openadsdk.core.nativeexpress;

import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.core.model.UB;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: ExpressEventManager.java */
/* loaded from: classes2.dex */
public class HX {
    public static void EYQ(String str, int i, String str2, String str3, String str4, com.bytedance.sdk.openadsdk.core.model.UB ub) throws JSONException {
        if (TextUtils.isEmpty(str2)) {
            str2 = com.bytedance.sdk.openadsdk.core.VwS.EYQ(i);
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("render_source", str);
            UB.EYQ eyqPI = ub.PI();
            if (eyqPI != null) {
                jSONObject.put("tpl_id", eyqPI.Kbd());
                if ("Web".equals(str)) {
                    if (eyqPI.pi()) {
                        jSONObject.put("engine_version", "v3");
                    } else {
                        jSONObject.put("engine_version", "v1");
                    }
                }
            }
        } catch (Exception unused) {
        }
        com.bytedance.sdk.openadsdk.tp.Td.EYQ().EYQ(com.bytedance.sdk.openadsdk.tp.EYQ.Td.mZx().EYQ(EYQ(str3)).Td(str4).Kbd(ub != null ? ub.ZFP() : "").mZx(i).mZx(jSONObject.toString()).IPb(str2));
    }

    private static int EYQ(String str) {
        str.hashCode();
        switch (str) {
            case "banner_ad":
                return 1;
            case "rewarded_video":
                return 7;
            case "open_ad":
                return 3;
            case "fullscreen_interstitial_ad":
                return 8;
            case "interaction":
                return 2;
            default:
                return 5;
        }
    }
}
