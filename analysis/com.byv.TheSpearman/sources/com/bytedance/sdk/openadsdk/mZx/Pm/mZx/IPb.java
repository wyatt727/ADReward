package com.bytedance.sdk.openadsdk.mZx.Pm.mZx;

import org.json.JSONObject;

/* compiled from: FeedOverModel.java */
/* loaded from: classes2.dex */
public class IPb implements Td {
    private long EYQ;
    private int Td = 0;
    private long mZx;

    public void EYQ(long j) {
        this.EYQ = j;
    }

    public void mZx(long j) {
        this.mZx = j;
    }

    public void EYQ(int i) {
        this.Td = i;
    }

    @Override // com.bytedance.sdk.openadsdk.mZx.Pm.mZx.Td
    public void EYQ(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        try {
            jSONObject.put("total_duration", this.EYQ);
            jSONObject.put("buffers_time", this.mZx);
            jSONObject.put("video_backup", this.Td);
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.pi.EYQ("FeedOverModel", th.getMessage());
        }
    }
}
