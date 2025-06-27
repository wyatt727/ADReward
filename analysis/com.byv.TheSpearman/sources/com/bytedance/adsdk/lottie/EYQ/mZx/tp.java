package com.bytedance.adsdk.lottie.EYQ.mZx;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import java.util.List;

/* compiled from: PathKeyframeAnimation.java */
/* loaded from: classes2.dex */
public class tp extends VwS<PointF> {
    private final PathMeasure IPb;
    private final float[] Kbd;
    private final PointF Pm;
    private HX VwS;

    public tp(List<? extends com.bytedance.adsdk.lottie.VwS.EYQ<PointF>> list) {
        super(list);
        this.Pm = new PointF();
        this.Kbd = new float[2];
        this.IPb = new PathMeasure();
    }

    @Override // com.bytedance.adsdk.lottie.EYQ.mZx.EYQ
    /* renamed from: mZx, reason: merged with bridge method [inline-methods] */
    public PointF EYQ(com.bytedance.adsdk.lottie.VwS.EYQ<PointF> eyq, float f) {
        HX hx = (HX) eyq;
        Path pathMZx = hx.mZx();
        if (pathMZx == null) {
            return eyq.EYQ;
        }
        if (this.Td != null) {
            hx.VwS.floatValue();
            Pm();
            QQ();
            throw null;
        }
        if (this.VwS != hx) {
            this.IPb.setPath(pathMZx, false);
            this.VwS = hx;
        }
        PathMeasure pathMeasure = this.IPb;
        pathMeasure.getPosTan(f * pathMeasure.getLength(), this.Kbd, null);
        PointF pointF = this.Pm;
        float[] fArr = this.Kbd;
        pointF.set(fArr[0], fArr[1]);
        return this.Pm;
    }
}
