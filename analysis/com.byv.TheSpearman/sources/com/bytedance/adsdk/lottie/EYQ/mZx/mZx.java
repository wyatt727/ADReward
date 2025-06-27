package com.bytedance.adsdk.lottie.EYQ.mZx;

import java.util.List;

/* compiled from: ColorKeyframeAnimation.java */
/* loaded from: classes2.dex */
public class mZx extends VwS<Integer> {
    public mZx(List<com.bytedance.adsdk.lottie.VwS.EYQ<Integer>> list) {
        super(list);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.bytedance.adsdk.lottie.EYQ.mZx.EYQ
    /* renamed from: mZx, reason: merged with bridge method [inline-methods] */
    public Integer EYQ(com.bytedance.adsdk.lottie.VwS.EYQ<Integer> eyq, float f) {
        return Integer.valueOf(Td(eyq, f));
    }

    public int Td(com.bytedance.adsdk.lottie.VwS.EYQ<Integer> eyq, float f) {
        if (eyq.EYQ == null || eyq.mZx == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        if (this.Td != null) {
            eyq.VwS.floatValue();
            Pm();
            QQ();
            throw null;
        }
        return com.bytedance.adsdk.lottie.IPb.mZx.EYQ(com.bytedance.adsdk.lottie.IPb.Kbd.mZx(f, 0.0f, 1.0f), eyq.EYQ.intValue(), eyq.mZx.intValue());
    }

    public int HX() {
        return Td(Td(), Kbd());
    }
}
