package com.bytedance.adsdk.lottie.EYQ.mZx;

import android.graphics.PointF;
import java.util.List;

/* compiled from: PointKeyframeAnimation.java */
/* loaded from: classes2.dex */
public class MxO extends VwS<PointF> {
    private final PointF Pm;

    public MxO(List<com.bytedance.adsdk.lottie.VwS.EYQ<PointF>> list) {
        super(list);
        this.Pm = new PointF();
    }

    @Override // com.bytedance.adsdk.lottie.EYQ.mZx.EYQ
    /* renamed from: mZx, reason: merged with bridge method [inline-methods] */
    public PointF EYQ(com.bytedance.adsdk.lottie.VwS.EYQ<PointF> eyq, float f) {
        return EYQ(eyq, f, f, f);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bytedance.adsdk.lottie.EYQ.mZx.EYQ
    /* renamed from: mZx, reason: merged with bridge method [inline-methods] */
    public PointF EYQ(com.bytedance.adsdk.lottie.VwS.EYQ<PointF> eyq, float f, float f2, float f3) {
        if (eyq.EYQ == null || eyq.mZx == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        PointF pointF = eyq.EYQ;
        PointF pointF2 = eyq.mZx;
        if (this.Td != null) {
            eyq.VwS.floatValue();
            Pm();
            QQ();
            throw null;
        }
        this.Pm.set(pointF.x + (f2 * (pointF2.x - pointF.x)), pointF.y + (f3 * (pointF2.y - pointF.y)));
        return this.Pm;
    }
}
