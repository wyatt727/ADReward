package com.bytedance.sdk.openadsdk.mZx.Pm.mZx;

import org.json.JSONObject;

/* compiled from: FeedBreakModel.java */
/* loaded from: classes2.dex */
public class Pm implements Td {
    public long EYQ;
    public int Pm = 0;
    public int Td;
    public long mZx;

    public void EYQ(long j) {
        this.EYQ = j;
    }

    public void mZx(long j) {
        this.mZx = j;
    }

    public void EYQ(int i) {
        this.Td = i;
    }

    public void mZx(int i) {
        this.Pm = i;
    }

    @Override // com.bytedance.sdk.openadsdk.mZx.Pm.mZx.Td
    public void EYQ(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        try {
            jSONObject.put("total_duration", this.EYQ);
            jSONObject.put("buffers_time", this.mZx);
            jSONObject.put("break_reason", this.Td);
            jSONObject.put("video_backup", this.Pm);
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.pi.EYQ("FeedBreakModel", th.getMessage());
        }
    }
}
