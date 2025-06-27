package com.bytedance.adsdk.lottie.EYQ.mZx;

import android.graphics.PointF;
import java.util.Collections;

/* compiled from: SplitDimensionPathKeyframeAnimation.java */
/* loaded from: classes2.dex */
public class nWX extends EYQ<PointF, PointF> {
    private final EYQ<Float, Float> HX;
    private final PointF IPb;
    protected com.bytedance.adsdk.lottie.VwS.mZx<Float> Kbd;
    protected com.bytedance.adsdk.lottie.VwS.mZx<Float> Pm;
    private final EYQ<Float, Float> QQ;
    private final PointF VwS;

    public nWX(EYQ<Float, Float> eyq, EYQ<Float, Float> eyq2) {
        super(Collections.emptyList());
        this.IPb = new PointF();
        this.VwS = new PointF();
        this.QQ = eyq;
        this.HX = eyq2;
        EYQ(QQ());
    }

    @Override // com.bytedance.adsdk.lottie.EYQ.mZx.EYQ
    public void EYQ(float f) {
        this.QQ.EYQ(f);
        this.HX.EYQ(f);
        this.IPb.set(this.QQ.VwS().floatValue(), this.HX.VwS().floatValue());
        for (int i = 0; i < this.EYQ.size(); i++) {
            this.EYQ.get(i).EYQ();
        }
    }

    @Override // com.bytedance.adsdk.lottie.EYQ.mZx.EYQ
    /* renamed from: HX, reason: merged with bridge method [inline-methods] */
    public PointF VwS() {
        return EYQ(null, 0.0f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.bytedance.adsdk.lottie.EYQ.mZx.EYQ
    /* renamed from: mZx, reason: merged with bridge method [inline-methods] */
    public PointF EYQ(com.bytedance.adsdk.lottie.VwS.EYQ<PointF> eyq, float f) {
        com.bytedance.adsdk.lottie.VwS.EYQ<Float> eyqTd;
        com.bytedance.adsdk.lottie.VwS.EYQ<Float> eyqTd2;
        if (this.Pm != null && (eyqTd2 = this.QQ.Td()) != null) {
            this.QQ.Kbd();
            Float f2 = eyqTd2.VwS;
            if (f2 == null) {
                throw null;
            }
            f2.floatValue();
            throw null;
        }
        if (this.Kbd != null && (eyqTd = this.HX.Td()) != null) {
            this.HX.Kbd();
            Float f3 = eyqTd.VwS;
            if (f3 == null) {
                throw null;
            }
            f3.floatValue();
            throw null;
        }
        this.VwS.set(this.IPb.x, 0.0f);
        PointF pointF = this.VwS;
        pointF.set(pointF.x, this.IPb.y);
        return this.VwS;
    }
}
