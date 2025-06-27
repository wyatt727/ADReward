package com.bytedance.adsdk.EYQ.mZx.mZx.EYQ;

import java.util.Map;
import org.json.JSONObject;

/* compiled from: NumberNode.java */
/* loaded from: classes2.dex */
public class KO implements com.bytedance.adsdk.EYQ.mZx.mZx.EYQ {
    private Number EYQ;

    public KO(String str) throws NumberFormatException {
        if (str.indexOf(46) >= 0) {
            Float fValueOf = Float.valueOf(str);
            this.EYQ = fValueOf;
            if (Float.isInfinite(fValueOf.floatValue())) {
                this.EYQ = Double.valueOf(str);
                return;
            }
            return;
        }
        try {
            this.EYQ = Integer.valueOf(str);
        } catch (NumberFormatException unused) {
            this.EYQ = Long.valueOf(str);
        }
    }

    @Override // com.bytedance.adsdk.EYQ.mZx.mZx.EYQ
    public Object EYQ(Map<String, JSONObject> map) {
        return this.EYQ;
    }

    @Override // com.bytedance.adsdk.EYQ.mZx.mZx.EYQ
    public com.bytedance.adsdk.EYQ.mZx.Pm.Kbd EYQ() {
        return com.bytedance.adsdk.EYQ.mZx.Pm.IPb.NUMBER;
    }

    @Override // com.bytedance.adsdk.EYQ.mZx.mZx.EYQ
    public String mZx() {
        return this.EYQ.toString();
    }

    public String toString() {
        return mZx();
    }
}
