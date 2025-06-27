package com.bytedance.sdk.openadsdk.core.model;

import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: DeepLink.java */
/* loaded from: classes2.dex */
public class tp {
    private String EYQ;
    private int Td;
    private String mZx;

    public String EYQ() {
        return this.EYQ;
    }

    public void EYQ(String str) {
        this.EYQ = str;
    }

    public String mZx() {
        return this.mZx;
    }

    public void mZx(String str) {
        this.mZx = str;
    }

    public int Td() {
        return this.Td;
    }

    public void EYQ(int i) {
        this.Td = i;
    }

    public JSONObject Pm() throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("u", this.EYQ);
            jSONObject.put("ft", this.Td);
            jSONObject.put("fu", this.mZx);
            return jSONObject;
        } catch (Exception unused) {
            return null;
        }
    }
}
