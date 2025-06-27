package com.bytedance.adsdk.lottie.Td.EYQ;

import android.graphics.PointF;
import java.util.List;

/* compiled from: AnimatablePathValue.java */
/* loaded from: classes2.dex */
public class Kbd implements pi<PointF, PointF> {
    private final List<com.bytedance.adsdk.lottie.VwS.EYQ<PointF>> EYQ;

    public Kbd(List<com.bytedance.adsdk.lottie.VwS.EYQ<PointF>> list) {
        this.EYQ = list;
    }

    @Override // com.bytedance.adsdk.lottie.Td.EYQ.pi
    public List<com.bytedance.adsdk.lottie.VwS.EYQ<PointF>> Td() {
        return this.EYQ;
    }

    @Override // com.bytedance.adsdk.lottie.Td.EYQ.pi
    public boolean mZx() {
        return this.EYQ.size() == 1 && this.EYQ.get(0).Kbd();
    }

    @Override // com.bytedance.adsdk.lottie.Td.EYQ.pi
    public com.bytedance.adsdk.lottie.EYQ.mZx.EYQ<PointF, PointF> EYQ() {
        if (this.EYQ.get(0).Kbd()) {
            return new com.bytedance.adsdk.lottie.EYQ.mZx.MxO(this.EYQ);
        }
        return new com.bytedance.adsdk.lottie.EYQ.mZx.tp(this.EYQ);
    }
}
