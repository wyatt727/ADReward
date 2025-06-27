package com.bytedance.adsdk.EYQ.mZx.mZx.EYQ;

import java.util.Map;
import org.json.JSONObject;

/* compiled from: StringNode.java */
/* loaded from: classes2.dex */
public class zF implements com.bytedance.adsdk.EYQ.mZx.mZx.EYQ {
    private final String EYQ;

    public zF(String str) {
        this.EYQ = str;
    }

    @Override // com.bytedance.adsdk.EYQ.mZx.mZx.EYQ
    public Object EYQ(Map<String, JSONObject> map) {
        return this.EYQ;
    }

    @Override // com.bytedance.adsdk.EYQ.mZx.mZx.EYQ
    public com.bytedance.adsdk.EYQ.mZx.Pm.Kbd EYQ() {
        return com.bytedance.adsdk.EYQ.mZx.Pm.IPb.STRING;
    }

    @Override // com.bytedance.adsdk.EYQ.mZx.mZx.EYQ
    public String mZx() {
        return "'" + this.EYQ + "'";
    }

    public String toString() {
        return mZx();
    }
}
