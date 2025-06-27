package com.bytedance.adsdk.EYQ.mZx.mZx.EYQ;

import java.util.Map;
import org.json.JSONObject;

/* compiled from: QuestionNodeImpl.java */
/* loaded from: classes2.dex */
public class hYh implements com.bytedance.adsdk.EYQ.mZx.mZx.mZx {
    private com.bytedance.adsdk.EYQ.mZx.mZx.EYQ EYQ;
    private com.bytedance.adsdk.EYQ.mZx.mZx.EYQ Td;
    private com.bytedance.adsdk.EYQ.mZx.mZx.EYQ mZx;

    @Override // com.bytedance.adsdk.EYQ.mZx.mZx.EYQ
    public Object EYQ(Map<String, JSONObject> map) {
        Object objEYQ = this.EYQ.EYQ(map);
        if (objEYQ == null) {
            return null;
        }
        if (((Boolean) objEYQ).booleanValue()) {
            return this.mZx.EYQ(map);
        }
        return this.Td.EYQ(map);
    }

    @Override // com.bytedance.adsdk.EYQ.mZx.mZx.EYQ
    public com.bytedance.adsdk.EYQ.mZx.Pm.Kbd EYQ() {
        return com.bytedance.adsdk.EYQ.mZx.Pm.IPb.OPERATOR_RESULT;
    }

    @Override // com.bytedance.adsdk.EYQ.mZx.mZx.mZx
    public void EYQ(com.bytedance.adsdk.EYQ.mZx.mZx.EYQ eyq) {
        this.EYQ = eyq;
    }

    @Override // com.bytedance.adsdk.EYQ.mZx.mZx.mZx
    public void mZx(com.bytedance.adsdk.EYQ.mZx.mZx.EYQ eyq) {
        this.mZx = eyq;
    }

    @Override // com.bytedance.adsdk.EYQ.mZx.mZx.mZx
    public void Td(com.bytedance.adsdk.EYQ.mZx.mZx.EYQ eyq) {
        this.Td = eyq;
    }

    @Override // com.bytedance.adsdk.EYQ.mZx.mZx.EYQ
    public String mZx() {
        return this.EYQ.mZx() + "?" + this.mZx.mZx() + ":" + this.Td.mZx();
    }

    public String toString() {
        return mZx();
    }
}
