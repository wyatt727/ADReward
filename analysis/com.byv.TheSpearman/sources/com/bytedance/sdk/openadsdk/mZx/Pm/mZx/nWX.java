package com.bytedance.sdk.openadsdk.mZx.Pm.mZx;

import com.json.unity.androidbridge.AndroidBridgeConstants;
import org.json.JSONObject;

/* compiled from: PlayErrorModel.java */
/* loaded from: classes2.dex */
public class nWX implements Td {
    private long EYQ;
    private final String Kbd;
    private final int Pm;
    private final int Td;
    private long mZx;

    public nWX(com.bykv.vk.openvk.component.video.api.Td.EYQ eyq) {
        this.Td = eyq.EYQ();
        this.Pm = eyq.mZx();
        this.Kbd = eyq.Td();
    }

    public void EYQ(long j) {
        this.EYQ = j;
    }

    public void mZx(long j) {
        this.mZx = j;
    }

    @Override // com.bytedance.sdk.openadsdk.mZx.Pm.mZx.Td
    public void EYQ(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        try {
            jSONObject.put("buffers_time", this.EYQ);
            jSONObject.put("total_duration", this.mZx);
            jSONObject.put(AndroidBridgeConstants.ERROR_CODE, this.Td);
            jSONObject.put("extra_error_code", this.Pm);
            jSONObject.put("error_message", this.Kbd);
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.pi.EYQ("PlayErrorModel", th.getMessage());
        }
    }
}
