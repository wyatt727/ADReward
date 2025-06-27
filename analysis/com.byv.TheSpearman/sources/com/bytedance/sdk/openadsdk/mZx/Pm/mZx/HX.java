package com.bytedance.sdk.openadsdk.mZx.Pm.mZx;

import org.json.JSONObject;

/* compiled from: LoadVideoCancelModel.java */
/* loaded from: classes2.dex */
public class HX implements Td {
    private final String EYQ;
    private final long mZx;

    public HX(String str, long j) {
        this.EYQ = str;
        this.mZx = j;
    }

    @Override // com.bytedance.sdk.openadsdk.mZx.Pm.mZx.Td
    public void EYQ(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        try {
            jSONObject.put("preload_url", this.EYQ);
            jSONObject.put("preload_size", this.mZx);
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.pi.EYQ("LoadVideoCancelModel", th.getMessage());
        }
    }
}
