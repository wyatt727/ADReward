package com.bytedance.adsdk.lottie.EYQ.mZx;

import java.util.List;

/* compiled from: FloatKeyframeAnimation.java */
/* loaded from: classes2.dex */
public class Pm extends VwS<Float> {
    public Pm(List<com.bytedance.adsdk.lottie.VwS.EYQ<Float>> list) {
        super(list);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.bytedance.adsdk.lottie.EYQ.mZx.EYQ
    /* renamed from: mZx, reason: merged with bridge method [inline-methods] */
    public Float EYQ(com.bytedance.adsdk.lottie.VwS.EYQ<Float> eyq, float f) {
        return Float.valueOf(Td(eyq, f));
    }

    float Td(com.bytedance.adsdk.lottie.VwS.EYQ<Float> eyq, float f) {
        if (eyq.EYQ == null || eyq.mZx == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        if (this.Td != null) {
            eyq.VwS.floatValue();
            Pm();
            QQ();
            throw null;
        }
        return com.bytedance.adsdk.lottie.IPb.Kbd.EYQ(eyq.IPb(), eyq.VwS(), f);
    }

    public float HX() {
        return Td(Td(), Kbd());
    }
}
