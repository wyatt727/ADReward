package com.bytedance.sdk.openadsdk.core.video.mZx;

import com.bytedance.sdk.component.utils.pi;
import com.bytedance.sdk.openadsdk.core.model.UB;
import com.bytedance.sdk.openadsdk.core.model.zF;
import com.json.unity.androidbridge.AndroidBridgeConstants;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: PlayableEvent.java */
/* loaded from: classes2.dex */
public class mZx {
    public static void EYQ(UB ub) {
        if (zF.mZx(ub)) {
            com.bytedance.sdk.openadsdk.mZx.Td.mZx(ub, "playable_preload", "preload_start", (JSONObject) null);
        }
    }

    public static void EYQ(UB ub, long j, long j2) throws JSONException {
        if (ub != null) {
            if (zF.MxO(ub) || zF.mZx(ub)) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("loadzip_success_time", j);
                    jSONObject.put("unzip_success_time", j2);
                } catch (JSONException e) {
                    pi.EYQ("PlayableEvent", "onSuccess json error", e);
                }
                com.bytedance.sdk.openadsdk.mZx.Td.mZx(ub, "playable_preload", "preload_success", jSONObject);
            }
        }
    }

    public static void EYQ(UB ub, int i, String str) {
        if (ub != null) {
            if (zF.MxO(ub) || zF.mZx(ub)) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put(AndroidBridgeConstants.ERROR_CODE, i);
                    jSONObject.put("error_reason", str);
                } catch (JSONException e) {
                    pi.EYQ("PlayableEvent", "onFail json error", e);
                }
                com.bytedance.sdk.openadsdk.mZx.Td.mZx(ub, "playable_preload", "preload_fail", jSONObject);
            }
        }
    }
}
