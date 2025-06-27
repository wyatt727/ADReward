package com.bytedance.sdk.openadsdk.nWX.EYQ;

import org.json.JSONObject;

/* compiled from: PAGAdViewInfo.java */
/* loaded from: classes2.dex */
public class EYQ {
    private final int EYQ;
    private final float Td;
    private final int mZx;

    public EYQ(int i, int i2, float f) {
        this.EYQ = i;
        this.mZx = i2;
        this.Td = f;
    }

    public static JSONObject EYQ(EYQ eyq) throws Throwable {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("width", eyq.EYQ);
        jSONObject.put("height", eyq.mZx);
        jSONObject.put("alpha", eyq.Td);
        return jSONObject;
    }
}
