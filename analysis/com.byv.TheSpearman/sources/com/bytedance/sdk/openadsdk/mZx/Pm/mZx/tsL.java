package com.bytedance.sdk.openadsdk.mZx.Pm.mZx;

import org.json.JSONObject;

/* compiled from: LoadVideoSuccessModel.java */
/* loaded from: classes2.dex */
public class tsL implements Td {
    private String EYQ;
    private long Pm;
    private long Td;
    private long mZx;

    public void EYQ(String str) {
        this.EYQ = str;
    }

    public void EYQ(long j) {
        this.mZx = j;
    }

    public void mZx(long j) {
        this.Td = j;
    }

    public void Td(long j) {
        this.Pm = j;
    }

    @Override // com.bytedance.sdk.openadsdk.mZx.Pm.mZx.Td
    public void EYQ(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        try {
            jSONObject.put("preload_url", this.EYQ);
            jSONObject.put("preload_size", this.mZx);
            jSONObject.put("load_time", this.Td);
            jSONObject.put("local_cache", this.Pm);
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.pi.EYQ("LoadVideoSuccessModel", th.getMessage());
        }
    }
}
