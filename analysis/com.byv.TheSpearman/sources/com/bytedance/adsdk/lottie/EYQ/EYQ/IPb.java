package com.bytedance.adsdk.lottie.EYQ.EYQ;

import android.graphics.Path;
import android.graphics.PointF;
import com.bytedance.adsdk.lottie.EYQ.mZx.EYQ;
import com.bytedance.adsdk.lottie.Td.mZx.hYh;
import java.util.List;

/* compiled from: EllipseContent.java */
/* loaded from: classes2.dex */
public class IPb implements MxO, pi, EYQ.InterfaceC0072EYQ {
    private final com.bytedance.adsdk.lottie.Td.mZx.mZx IPb;
    private final com.bytedance.adsdk.lottie.EYQ.mZx.EYQ<?, PointF> Kbd;
    private final com.bytedance.adsdk.lottie.EYQ.mZx.EYQ<?, PointF> Pm;
    private boolean QQ;
    private final com.bytedance.adsdk.lottie.QQ Td;
    private final String mZx;
    private final Path EYQ = new Path();
    private final mZx VwS = new mZx();

    public IPb(com.bytedance.adsdk.lottie.QQ qq, com.bytedance.adsdk.lottie.Td.Td.EYQ eyq, com.bytedance.adsdk.lottie.Td.mZx.mZx mzx) {
        this.mZx = mzx.EYQ();
        this.Td = qq;
        com.bytedance.adsdk.lottie.EYQ.mZx.EYQ<PointF, PointF> EYQ = mzx.Td().EYQ();
        this.Pm = EYQ;
        com.bytedance.adsdk.lottie.EYQ.mZx.EYQ<PointF, PointF> EYQ2 = mzx.mZx().EYQ();
        this.Kbd = EYQ2;
        this.IPb = mzx;
        eyq.EYQ(EYQ);
        eyq.EYQ(EYQ2);
        EYQ.EYQ(this);
        EYQ2.EYQ(this);
    }

    @Override // com.bytedance.adsdk.lottie.EYQ.mZx.EYQ.InterfaceC0072EYQ
    public void EYQ() {
        mZx();
    }

    private void mZx() {
        this.QQ = false;
        this.Td.invalidateSelf();
    }

    @Override // com.bytedance.adsdk.lottie.EYQ.EYQ.Td
    public void EYQ(List<Td> list, List<Td> list2) {
        for (int i = 0; i < list.size(); i++) {
            Td td = list.get(i);
            if (td instanceof WU) {
                WU wu = (WU) td;
                if (wu.mZx() == hYh.EYQ.SIMULTANEOUSLY) {
                    this.VwS.EYQ(wu);
                    wu.EYQ(this);
                }
            }
        }
    }

    @Override // com.bytedance.adsdk.lottie.EYQ.EYQ.pi
    public Path Pm() {
        if (this.QQ) {
            return this.EYQ;
        }
        this.EYQ.reset();
        if (this.IPb.Kbd()) {
            this.QQ = true;
            return this.EYQ;
        }
        PointF pointFVwS = this.Pm.VwS();
        float f = pointFVwS.x / 2.0f;
        float f2 = pointFVwS.y / 2.0f;
        float f3 = f * 0.55228f;
        float f4 = 0.55228f * f2;
        this.EYQ.reset();
        if (this.IPb.Pm()) {
            float f5 = -f2;
            this.EYQ.moveTo(0.0f, f5);
            float f6 = 0.0f - f3;
            float f7 = -f;
            float f8 = 0.0f - f4;
            this.EYQ.cubicTo(f6, f5, f7, f8, f7, 0.0f);
            float f9 = f4 + 0.0f;
            this.EYQ.cubicTo(f7, f9, f6, f2, 0.0f, f2);
            float f10 = f3 + 0.0f;
            this.EYQ.cubicTo(f10, f2, f, f9, f, 0.0f);
            this.EYQ.cubicTo(f, f8, f10, f5, 0.0f, f5);
        } else {
            float f11 = -f2;
            this.EYQ.moveTo(0.0f, f11);
            float f12 = f3 + 0.0f;
            float f13 = 0.0f - f4;
            this.EYQ.cubicTo(f12, f11, f, f13, f, 0.0f);
            float f14 = f4 + 0.0f;
            this.EYQ.cubicTo(f, f14, f12, f2, 0.0f, f2);
            float f15 = 0.0f - f3;
            float f16 = -f;
            this.EYQ.cubicTo(f15, f2, f16, f14, f16, 0.0f);
            this.EYQ.cubicTo(f16, f13, f15, f11, 0.0f, f11);
        }
        PointF pointFVwS2 = this.Kbd.VwS();
        this.EYQ.offset(pointFVwS2.x, pointFVwS2.y);
        this.EYQ.close();
        this.VwS.EYQ(this.EYQ);
        this.QQ = true;
        return this.EYQ;
    }
}
