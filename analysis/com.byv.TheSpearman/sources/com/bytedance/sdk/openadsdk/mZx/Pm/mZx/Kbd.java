package com.bytedance.sdk.openadsdk.mZx.Pm.mZx;

import org.json.JSONObject;

/* compiled from: FeedContinueModel.java */
/* loaded from: classes2.dex */
public class Kbd implements Td {
    private long EYQ;
    private long mZx;

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
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.pi.EYQ("FeedContinueModel", th.getMessage());
        }
    }
}
