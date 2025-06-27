package com.bytedance.sdk.openadsdk.mZx.Pm.mZx;

import org.json.JSONObject;

/* compiled from: FeedPlayModel.java */
/* loaded from: classes2.dex */
public class QQ implements Td {
    private long EYQ;
    private int Td;
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
            jSONObject.put("video_start_duration", this.EYQ);
            jSONObject.put("video_cache_size", this.mZx);
            jSONObject.put("is_auto_play", this.Td);
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.pi.EYQ("FeedPlayModel", th.getMessage());
        }
    }
}
