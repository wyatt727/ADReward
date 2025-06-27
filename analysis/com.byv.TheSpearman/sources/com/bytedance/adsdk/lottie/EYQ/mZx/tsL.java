package com.bytedance.adsdk.lottie.EYQ.mZx;

import java.util.List;

/* compiled from: ScaleKeyframeAnimation.java */
/* loaded from: classes2.dex */
public class tsL extends VwS<com.bytedance.adsdk.lottie.VwS.Td> {
    private final com.bytedance.adsdk.lottie.VwS.Td Pm;

    public tsL(List<com.bytedance.adsdk.lottie.VwS.EYQ<com.bytedance.adsdk.lottie.VwS.Td>> list) {
        super(list);
        this.Pm = new com.bytedance.adsdk.lottie.VwS.Td();
    }

    @Override // com.bytedance.adsdk.lottie.EYQ.mZx.EYQ
    /* renamed from: mZx, reason: merged with bridge method [inline-methods] */
    public com.bytedance.adsdk.lottie.VwS.Td EYQ(com.bytedance.adsdk.lottie.VwS.EYQ<com.bytedance.adsdk.lottie.VwS.Td> eyq, float f) {
        if (eyq.EYQ == null || eyq.mZx == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        com.bytedance.adsdk.lottie.VwS.Td td = eyq.EYQ;
        com.bytedance.adsdk.lottie.VwS.Td td2 = eyq.mZx;
        if (this.Td != null) {
            eyq.VwS.floatValue();
            Pm();
            QQ();
            throw null;
        }
        this.Pm.EYQ(com.bytedance.adsdk.lottie.IPb.Kbd.EYQ(td.EYQ(), td2.EYQ(), f), com.bytedance.adsdk.lottie.IPb.Kbd.EYQ(td.mZx(), td2.mZx(), f));
        return this.Pm;
    }
}
