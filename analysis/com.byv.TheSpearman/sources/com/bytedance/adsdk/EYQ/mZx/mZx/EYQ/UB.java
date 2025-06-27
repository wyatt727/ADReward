package com.bytedance.adsdk.EYQ.mZx.mZx.EYQ;

/* compiled from: OperatorResultNode.java */
/* loaded from: classes2.dex */
public abstract class UB implements com.bytedance.adsdk.EYQ.mZx.mZx.EYQ {
    protected com.bytedance.adsdk.EYQ.mZx.mZx.EYQ EYQ;
    protected com.bytedance.adsdk.EYQ.mZx.Pm.Td Td;
    protected com.bytedance.adsdk.EYQ.mZx.mZx.EYQ mZx;

    protected UB(com.bytedance.adsdk.EYQ.mZx.Pm.Td td) {
        this.Td = td;
    }

    public void EYQ(com.bytedance.adsdk.EYQ.mZx.mZx.EYQ eyq) {
        this.EYQ = eyq;
    }

    public void mZx(com.bytedance.adsdk.EYQ.mZx.mZx.EYQ eyq) {
        this.mZx = eyq;
    }

    @Override // com.bytedance.adsdk.EYQ.mZx.mZx.EYQ
    public com.bytedance.adsdk.EYQ.mZx.Pm.Kbd EYQ() {
        return com.bytedance.adsdk.EYQ.mZx.Pm.IPb.OPERATOR_RESULT;
    }

    @Override // com.bytedance.adsdk.EYQ.mZx.mZx.EYQ
    public String mZx() {
        return this.EYQ.mZx() + this.Td.EYQ() + this.mZx.mZx();
    }

    public String toString() {
        return mZx();
    }
}
