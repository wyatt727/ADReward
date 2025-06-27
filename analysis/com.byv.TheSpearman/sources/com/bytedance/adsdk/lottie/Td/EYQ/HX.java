package com.bytedance.adsdk.lottie.Td.EYQ;

import android.graphics.PointF;
import java.util.List;

/* compiled from: AnimatableSplitDimensionPathValue.java */
/* loaded from: classes2.dex */
public class HX implements pi<PointF, PointF> {
    private final mZx EYQ;
    private final mZx mZx;

    public HX(mZx mzx, mZx mzx2) {
        this.EYQ = mzx;
        this.mZx = mzx2;
    }

    @Override // com.bytedance.adsdk.lottie.Td.EYQ.pi
    public List<com.bytedance.adsdk.lottie.VwS.EYQ<PointF>> Td() {
        throw new UnsupportedOperationException("Cannot call getKeyframes on AnimatableSplitDimensionPathValue.");
    }

    @Override // com.bytedance.adsdk.lottie.Td.EYQ.pi
    public boolean mZx() {
        return this.EYQ.mZx() && this.mZx.mZx();
    }

    @Override // com.bytedance.adsdk.lottie.Td.EYQ.pi
    public com.bytedance.adsdk.lottie.EYQ.mZx.EYQ<PointF, PointF> EYQ() {
        return new com.bytedance.adsdk.lottie.EYQ.mZx.nWX(this.EYQ.EYQ(), this.mZx.EYQ());
    }
}
