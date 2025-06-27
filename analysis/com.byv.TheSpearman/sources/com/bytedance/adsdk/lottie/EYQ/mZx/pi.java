package com.bytedance.adsdk.lottie.EYQ.mZx;

import android.graphics.Path;
import com.bytedance.adsdk.lottie.EYQ.EYQ.hYh;
import java.util.List;

/* compiled from: ShapeKeyframeAnimation.java */
/* loaded from: classes2.dex */
public class pi extends EYQ<com.bytedance.adsdk.lottie.Td.mZx.nWX, Path> {
    private List<hYh> IPb;
    private final Path Kbd;
    private final com.bytedance.adsdk.lottie.Td.mZx.nWX Pm;

    public pi(List<com.bytedance.adsdk.lottie.VwS.EYQ<com.bytedance.adsdk.lottie.Td.mZx.nWX>> list) {
        super(list);
        this.Pm = new com.bytedance.adsdk.lottie.Td.mZx.nWX();
        this.Kbd = new Path();
    }

    @Override // com.bytedance.adsdk.lottie.EYQ.mZx.EYQ
    /* renamed from: mZx, reason: merged with bridge method [inline-methods] */
    public Path EYQ(com.bytedance.adsdk.lottie.VwS.EYQ<com.bytedance.adsdk.lottie.Td.mZx.nWX> eyq, float f) {
        this.Pm.EYQ(eyq.EYQ, eyq.mZx, f);
        com.bytedance.adsdk.lottie.Td.mZx.nWX nwxEYQ = this.Pm;
        List<hYh> list = this.IPb;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                nwxEYQ = this.IPb.get(size).EYQ(nwxEYQ);
            }
        }
        com.bytedance.adsdk.lottie.IPb.Kbd.EYQ(nwxEYQ, this.Kbd);
        return this.Kbd;
    }

    public void EYQ(List<hYh> list) {
        this.IPb = list;
    }
}
