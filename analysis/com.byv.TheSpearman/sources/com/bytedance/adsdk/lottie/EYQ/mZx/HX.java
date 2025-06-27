package com.bytedance.adsdk.lottie.EYQ.mZx;

import android.graphics.Path;
import android.graphics.PointF;

/* compiled from: PathKeyframe.java */
/* loaded from: classes2.dex */
public class HX extends com.bytedance.adsdk.lottie.VwS.EYQ<PointF> {
    private final com.bytedance.adsdk.lottie.VwS.EYQ<PointF> MxO;
    private Path tp;

    public HX(com.bytedance.adsdk.lottie.IPb iPb, com.bytedance.adsdk.lottie.VwS.EYQ<PointF> eyq) {
        super(iPb, eyq.EYQ, eyq.mZx, eyq.Td, eyq.Pm, eyq.Kbd, eyq.IPb, eyq.VwS);
        this.MxO = eyq;
        EYQ();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void EYQ() {
        boolean z = (this.mZx == 0 || this.EYQ == 0 || !((PointF) this.EYQ).equals(((PointF) this.mZx).x, ((PointF) this.mZx).y)) ? false : true;
        if (this.EYQ == 0 || this.mZx == 0 || z) {
            return;
        }
        this.tp = com.bytedance.adsdk.lottie.IPb.IPb.EYQ((PointF) this.EYQ, (PointF) this.mZx, this.MxO.QQ, this.MxO.HX);
    }

    Path mZx() {
        return this.tp;
    }
}
