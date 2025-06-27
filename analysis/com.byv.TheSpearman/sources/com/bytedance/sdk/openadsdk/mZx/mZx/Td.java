package com.bytedance.sdk.openadsdk.mZx.mZx;

import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: EventStartListenerWrapper.java */
/* loaded from: classes2.dex */
public class Td implements mZx {
    mZx EYQ;

    @Override // com.bytedance.sdk.openadsdk.mZx.mZx.mZx
    public void EYQ(JSONObject jSONObject, long j) throws JSONException {
        mZx mzx = this.EYQ;
        if (mzx != null) {
            mzx.EYQ(jSONObject, j);
        }
        if (j <= 0) {
            j = System.currentTimeMillis();
        }
        jSONObject.put("event_ts", j);
    }
}
