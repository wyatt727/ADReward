package com.bytedance.sdk.openadsdk.core.Pm;

import com.bytedance.sdk.component.IPb.mZx.Pm;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.utils.FH;
import java.io.IOException;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: FrequentCallEventHelper.java */
/* loaded from: classes2.dex */
public class Td {
    public static void EYQ(String str, long j) throws JSONException {
        JSONObject jSONObjectMZx = mZx(str, j);
        Pm pmMZx = com.bytedance.sdk.openadsdk.MxO.Td.EYQ().mZx().mZx();
        pmMZx.EYQ(FH.Pm("/api/ad/union/sdk/stats/"));
        pmMZx.Td(jSONObjectMZx.toString());
        pmMZx.EYQ(new com.bytedance.sdk.component.IPb.EYQ.EYQ() { // from class: com.bytedance.sdk.openadsdk.core.Pm.Td.1
            @Override // com.bytedance.sdk.component.IPb.EYQ.EYQ
            public void EYQ(com.bytedance.sdk.component.IPb.mZx.Td td, com.bytedance.sdk.component.IPb.mZx mzx) {
            }

            @Override // com.bytedance.sdk.component.IPb.EYQ.EYQ
            public void EYQ(com.bytedance.sdk.component.IPb.mZx.Td td, IOException iOException) {
                iOException.getMessage();
            }
        });
    }

    private static JSONObject mZx(String str, long j) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("type", "over_freq");
            jSONObject.put("rit", str);
            jSONObject.put("ad_sdk_version", BuildConfig.VERSION_NAME);
            jSONObject.put("timestamp", j);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }
}
