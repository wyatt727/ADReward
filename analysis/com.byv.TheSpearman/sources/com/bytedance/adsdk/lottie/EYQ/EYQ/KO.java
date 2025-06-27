package com.bytedance.adsdk.lottie.EYQ.EYQ;

import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import com.bytedance.adsdk.lottie.EYQ.mZx.EYQ;

/* compiled from: RectangleContent.java */
/* loaded from: classes2.dex */
public class KO implements MxO, pi, EYQ.InterfaceC0072EYQ {
    private final com.bytedance.adsdk.lottie.EYQ.mZx.EYQ<?, PointF> IPb;
    private final com.bytedance.adsdk.lottie.QQ Kbd;
    private boolean MxO;
    private final boolean Pm;
    private final com.bytedance.adsdk.lottie.EYQ.mZx.EYQ<?, Float> QQ;
    private final String Td;
    private final com.bytedance.adsdk.lottie.EYQ.mZx.EYQ<?, PointF> VwS;
    private final Path EYQ = new Path();
    private final RectF mZx = new RectF();
    private final mZx HX = new mZx();
    private com.bytedance.adsdk.lottie.EYQ.mZx.EYQ<Float, Float> tp = null;

    public KO(com.bytedance.adsdk.lottie.QQ qq, com.bytedance.adsdk.lottie.Td.Td.EYQ eyq, com.bytedance.adsdk.lottie.Td.mZx.MxO mxO) {
        this.Td = mxO.EYQ();
        this.Pm = mxO.Kbd();
        this.Kbd = qq;
        com.bytedance.adsdk.lottie.EYQ.mZx.EYQ<PointF, PointF> EYQ = mxO.Pm().EYQ();
        this.IPb = EYQ;
        com.bytedance.adsdk.lottie.EYQ.mZx.EYQ<PointF, PointF> EYQ2 = mxO.Td().EYQ();
        this.VwS = EYQ2;
        com.bytedance.adsdk.lottie.EYQ.mZx.EYQ<Float, Float> EYQ3 = mxO.mZx().EYQ();
        this.QQ = EYQ3;
        eyq.EYQ(EYQ);
        eyq.EYQ(EYQ2);
        eyq.EYQ(EYQ3);
        EYQ.EYQ(this);
        EYQ2.EYQ(this);
        EYQ3.EYQ(this);
    }

    @Override // com.bytedance.adsdk.lottie.EYQ.mZx.EYQ.InterfaceC0072EYQ
    public void EYQ() {
        mZx();
    }

    private void mZx() {
        this.MxO = false;
        this.Kbd.invalidateSelf();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    @Override // com.bytedance.adsdk.lottie.EYQ.EYQ.Td
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void EYQ(java.util.List<com.bytedance.adsdk.lottie.EYQ.EYQ.Td> r5, java.util.List<com.bytedance.adsdk.lottie.EYQ.EYQ.Td> r6) {
        /*
            r4 = this;
            r6 = 0
        L1:
            int r0 = r5.size()
            if (r6 >= r0) goto L34
            java.lang.Object r0 = r5.get(r6)
            com.bytedance.adsdk.lottie.EYQ.EYQ.Td r0 = (com.bytedance.adsdk.lottie.EYQ.EYQ.Td) r0
            boolean r1 = r0 instanceof com.bytedance.adsdk.lottie.EYQ.EYQ.WU
            if (r1 == 0) goto L25
            r1 = r0
            com.bytedance.adsdk.lottie.EYQ.EYQ.WU r1 = (com.bytedance.adsdk.lottie.EYQ.EYQ.WU) r1
            com.bytedance.adsdk.lottie.Td.mZx.hYh$EYQ r2 = r1.mZx()
            com.bytedance.adsdk.lottie.Td.mZx.hYh$EYQ r3 = com.bytedance.adsdk.lottie.Td.mZx.hYh.EYQ.SIMULTANEOUSLY
            if (r2 != r3) goto L25
            com.bytedance.adsdk.lottie.EYQ.EYQ.mZx r0 = r4.HX
            r0.EYQ(r1)
            r1.EYQ(r4)
            goto L31
        L25:
            boolean r1 = r0 instanceof com.bytedance.adsdk.lottie.EYQ.EYQ.UB
            if (r1 == 0) goto L31
            com.bytedance.adsdk.lottie.EYQ.EYQ.UB r0 = (com.bytedance.adsdk.lottie.EYQ.EYQ.UB) r0
            com.bytedance.adsdk.lottie.EYQ.mZx.EYQ r0 = r0.mZx()
            r4.tp = r0
        L31:
            int r6 = r6 + 1
            goto L1
        L34:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.adsdk.lottie.EYQ.EYQ.KO.EYQ(java.util.List, java.util.List):void");
    }

    @Override // com.bytedance.adsdk.lottie.EYQ.EYQ.pi
    public Path Pm() {
        com.bytedance.adsdk.lottie.EYQ.mZx.EYQ<Float, Float> eyq;
        if (this.MxO) {
            return this.EYQ;
        }
        this.EYQ.reset();
        if (this.Pm) {
            this.MxO = true;
            return this.EYQ;
        }
        PointF pointFVwS = this.VwS.VwS();
        float f = pointFVwS.x / 2.0f;
        float f2 = pointFVwS.y / 2.0f;
        com.bytedance.adsdk.lottie.EYQ.mZx.EYQ<?, Float> eyq2 = this.QQ;
        float fHX = eyq2 == null ? 0.0f : ((com.bytedance.adsdk.lottie.EYQ.mZx.Pm) eyq2).HX();
        if (fHX == 0.0f && (eyq = this.tp) != null) {
            fHX = Math.min(eyq.VwS().floatValue(), Math.min(f, f2));
        }
        float fMin = Math.min(f, f2);
        if (fHX > fMin) {
            fHX = fMin;
        }
        PointF pointFVwS2 = this.IPb.VwS();
        this.EYQ.moveTo(pointFVwS2.x + f, (pointFVwS2.y - f2) + fHX);
        this.EYQ.lineTo(pointFVwS2.x + f, (pointFVwS2.y + f2) - fHX);
        if (fHX > 0.0f) {
            float f3 = fHX * 2.0f;
            this.mZx.set((pointFVwS2.x + f) - f3, (pointFVwS2.y + f2) - f3, pointFVwS2.x + f, pointFVwS2.y + f2);
            this.EYQ.arcTo(this.mZx, 0.0f, 90.0f, false);
        }
        this.EYQ.lineTo((pointFVwS2.x - f) + fHX, pointFVwS2.y + f2);
        if (fHX > 0.0f) {
            float f4 = fHX * 2.0f;
            this.mZx.set(pointFVwS2.x - f, (pointFVwS2.y + f2) - f4, (pointFVwS2.x - f) + f4, pointFVwS2.y + f2);
            this.EYQ.arcTo(this.mZx, 90.0f, 90.0f, false);
        }
        this.EYQ.lineTo(pointFVwS2.x - f, (pointFVwS2.y - f2) + fHX);
        if (fHX > 0.0f) {
            float f5 = fHX * 2.0f;
            this.mZx.set(pointFVwS2.x - f, pointFVwS2.y - f2, (pointFVwS2.x - f) + f5, (pointFVwS2.y - f2) + f5);
            this.EYQ.arcTo(this.mZx, 180.0f, 90.0f, false);
        }
        this.EYQ.lineTo((pointFVwS2.x + f) - fHX, pointFVwS2.y - f2);
        if (fHX > 0.0f) {
            float f6 = fHX * 2.0f;
            this.mZx.set((pointFVwS2.x + f) - f6, pointFVwS2.y - f2, pointFVwS2.x + f, (pointFVwS2.y - f2) + f6);
            this.EYQ.arcTo(this.mZx, 270.0f, 90.0f, false);
        }
        this.EYQ.close();
        this.HX.EYQ(this.EYQ);
        this.MxO = true;
        return this.EYQ;
    }
}
