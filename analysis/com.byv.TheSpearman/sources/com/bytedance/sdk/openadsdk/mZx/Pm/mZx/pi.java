package com.bytedance.sdk.openadsdk.mZx.Pm.mZx;

import org.json.JSONObject;

/* compiled from: PlayBufferModel.java */
/* loaded from: classes2.dex */
public class pi implements Td {
    public long EYQ;
    public long Td;
    public int mZx;

    public void EYQ(long j) {
        this.EYQ = j;
    }

    public void EYQ(int i) {
        this.mZx = i;
    }

    public void mZx(long j) {
        this.Td = j;
    }

    @Override // com.bytedance.sdk.openadsdk.mZx.Pm.mZx.Td
    public void EYQ(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        try {
            jSONObject.put("buffers_time", this.EYQ);
            jSONObject.put("buffers_count", this.mZx);
            jSONObject.put("total_duration", this.Td);
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.pi.EYQ("PlayBufferModel", th.getMessage());
        }
    }
}
