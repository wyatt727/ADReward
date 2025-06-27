package com.bytedance.sdk.openadsdk.mZx.Pm.mZx;

import org.json.JSONObject;

/* compiled from: EndcardSkipModel.java */
/* loaded from: classes2.dex */
public class mZx implements Td {
    private long EYQ;
    private int Pm;
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

    public void mZx(int i) {
        this.Pm = i;
    }

    @Override // com.bytedance.sdk.openadsdk.mZx.Pm.mZx.Td
    public void EYQ(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        try {
            jSONObject.put("buffers_time", this.EYQ);
            jSONObject.put("total_duration", this.mZx);
            jSONObject.put("vbtt_skip_type", this.Td);
            jSONObject.put("skip_reason", this.Pm);
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.pi.EYQ("EndcardSkipModel", th.getMessage());
        }
    }
}
