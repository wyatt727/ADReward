package com.bytedance.sdk.openadsdk.core.ugen.Kbd;

import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: UGenTemplateModel.java */
/* loaded from: classes2.dex */
public class EYQ {
    private String EYQ;
    private String Kbd;
    private String Pm;
    private String Td;
    private String mZx;

    public String EYQ() {
        return this.EYQ;
    }

    public EYQ EYQ(String str) {
        this.EYQ = str;
        return this;
    }

    public String mZx() {
        return this.mZx;
    }

    public EYQ mZx(String str) {
        this.mZx = str;
        return this;
    }

    public String Td() {
        return this.Td;
    }

    public EYQ Td(String str) {
        this.Td = str;
        return this;
    }

    public String Pm() {
        return this.Pm;
    }

    public EYQ Pm(String str) {
        this.Pm = str;
        return this;
    }

    public String Kbd() {
        return this.Kbd;
    }

    public EYQ Kbd(String str) {
        this.Kbd = str;
        return this;
    }

    public JSONObject IPb() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("id", this.EYQ);
            jSONObject.put("md5", this.mZx);
            jSONObject.put("url", this.Td);
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }
}
