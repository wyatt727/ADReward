package com.bytedance.sdk.openadsdk.core;

import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: ConvertTracker.java */
/* loaded from: classes2.dex */
public class Pm {
    public static void EYQ(com.bytedance.sdk.openadsdk.core.model.UB ub, String str, int i, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        try {
            jSONObject.put("type", i);
        } catch (JSONException unused) {
        }
        com.bytedance.sdk.openadsdk.mZx.Td.mZx(ub, str, "convert_track", jSONObject);
    }
}
