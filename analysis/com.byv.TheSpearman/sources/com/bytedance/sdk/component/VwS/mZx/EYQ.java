package com.bytedance.sdk.component.VwS.mZx;

import org.json.JSONObject;

/* compiled from: ThreadLogModel.java */
/* loaded from: classes2.dex */
public class EYQ {
    public int EYQ;
    public int Pm;
    public int Td;
    public int mZx;

    public EYQ(int i, int i2, int i3, int i4) {
        this.EYQ = i;
        this.mZx = i2;
        this.Td = i3;
        this.Pm = i4;
    }

    public JSONObject EYQ() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("sdk_thread_num", this.EYQ);
            jSONObject.put("sdk_max_thread_num", this.mZx);
            jSONObject.put("app_thread_num", this.Td);
            jSONObject.put("app_max_thread_num", this.Pm);
        } catch (Throwable unused) {
        }
        return jSONObject;
    }
}
