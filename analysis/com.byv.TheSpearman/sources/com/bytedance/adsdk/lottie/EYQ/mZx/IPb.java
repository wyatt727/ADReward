package com.bytedance.adsdk.lottie.EYQ.mZx;

import java.util.List;

/* compiled from: IntegerKeyframeAnimation.java */
/* loaded from: classes2.dex */
public class IPb extends VwS<Integer> {
    public IPb(List<com.bytedance.adsdk.lottie.VwS.EYQ<Integer>> list) {
        super(list);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.bytedance.adsdk.lottie.EYQ.mZx.EYQ
    /* renamed from: mZx, reason: merged with bridge method [inline-methods] */
    public Integer EYQ(com.bytedance.adsdk.lottie.VwS.EYQ<Integer> eyq, float f) {
        return Integer.valueOf(Td(eyq, f));
    }

    int Td(com.bytedance.adsdk.lottie.VwS.EYQ<Integer> eyq, float f) {
        if (eyq.EYQ == null || eyq.mZx == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        if (this.Td != null) {
            eyq.VwS.floatValue();
            Pm();
            QQ();
            throw null;
        }
        return com.bytedance.adsdk.lottie.IPb.Kbd.EYQ(eyq.QQ(), eyq.HX(), f);
    }

    public int HX() {
        return Td(Td(), Kbd());
    }
}
