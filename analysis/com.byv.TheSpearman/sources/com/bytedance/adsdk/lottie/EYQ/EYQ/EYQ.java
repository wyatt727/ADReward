package com.bytedance.adsdk.lottie.EYQ.EYQ;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.DashPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.RectF;
import com.bytedance.adsdk.lottie.EYQ.mZx.EYQ;
import java.util.ArrayList;
import java.util.List;

/* compiled from: BaseStrokeContent.java */
/* loaded from: classes2.dex */
public abstract class EYQ implements Kbd, MxO, EYQ.InterfaceC0072EYQ {
    protected final com.bytedance.adsdk.lottie.Td.Td.EYQ EYQ;
    private com.bytedance.adsdk.lottie.EYQ.mZx.EYQ<ColorFilter, ColorFilter> KO;
    private final com.bytedance.adsdk.lottie.EYQ.mZx.EYQ<?, Float> MxO;
    private final com.bytedance.adsdk.lottie.QQ QQ;
    float Td;
    private com.bytedance.adsdk.lottie.EYQ.mZx.Td UB;
    private com.bytedance.adsdk.lottie.EYQ.mZx.EYQ<Float, Float> hu;
    final Paint mZx;
    private final com.bytedance.adsdk.lottie.EYQ.mZx.EYQ<?, Float> nWX;
    private final List<com.bytedance.adsdk.lottie.EYQ.mZx.EYQ<?, Float>> pi;
    private final float[] tp;
    private final com.bytedance.adsdk.lottie.EYQ.mZx.EYQ<?, Integer> tsL;
    private final PathMeasure Pm = new PathMeasure();
    private final Path Kbd = new Path();
    private final Path IPb = new Path();
    private final RectF VwS = new RectF();
    private final List<C0071EYQ> HX = new ArrayList();

    EYQ(com.bytedance.adsdk.lottie.QQ qq, com.bytedance.adsdk.lottie.Td.Td.EYQ eyq, Paint.Cap cap, Paint.Join join, float f, com.bytedance.adsdk.lottie.Td.EYQ.Pm pm, com.bytedance.adsdk.lottie.Td.EYQ.mZx mzx, List<com.bytedance.adsdk.lottie.Td.EYQ.mZx> list, com.bytedance.adsdk.lottie.Td.EYQ.mZx mzx2) {
        com.bytedance.adsdk.lottie.EYQ.EYQ eyq2 = new com.bytedance.adsdk.lottie.EYQ.EYQ(1);
        this.mZx = eyq2;
        this.Td = 0.0f;
        this.QQ = qq;
        this.EYQ = eyq;
        eyq2.setStyle(Paint.Style.STROKE);
        eyq2.setStrokeCap(cap);
        eyq2.setStrokeJoin(join);
        eyq2.setStrokeMiter(f);
        this.tsL = pm.EYQ();
        this.MxO = mzx.EYQ();
        if (mzx2 == null) {
            this.nWX = null;
        } else {
            this.nWX = mzx2.EYQ();
        }
        this.pi = new ArrayList(list.size());
        this.tp = new float[list.size()];
        for (int i = 0; i < list.size(); i++) {
            this.pi.add(list.get(i).EYQ());
        }
        eyq.EYQ(this.tsL);
        eyq.EYQ(this.MxO);
        for (int i2 = 0; i2 < this.pi.size(); i2++) {
            eyq.EYQ(this.pi.get(i2));
        }
        com.bytedance.adsdk.lottie.EYQ.mZx.EYQ<?, Float> eyq3 = this.nWX;
        if (eyq3 != null) {
            eyq.EYQ(eyq3);
        }
        this.tsL.EYQ(this);
        this.MxO.EYQ(this);
        for (int i3 = 0; i3 < list.size(); i3++) {
            this.pi.get(i3).EYQ(this);
        }
        com.bytedance.adsdk.lottie.EYQ.mZx.EYQ<?, Float> eyq4 = this.nWX;
        if (eyq4 != null) {
            eyq4.EYQ(this);
        }
        if (eyq.IPb() != null) {
            com.bytedance.adsdk.lottie.EYQ.mZx.EYQ<Float, Float> EYQ = eyq.IPb().EYQ().EYQ();
            this.hu = EYQ;
            EYQ.EYQ(this);
            eyq.EYQ(this.hu);
        }
        if (eyq.VwS() != null) {
            this.UB = new com.bytedance.adsdk.lottie.EYQ.mZx.Td(this, eyq, eyq.VwS());
        }
    }

    @Override // com.bytedance.adsdk.lottie.EYQ.mZx.EYQ.InterfaceC0072EYQ
    public void EYQ() {
        this.QQ.invalidateSelf();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0055  */
    @Override // com.bytedance.adsdk.lottie.EYQ.EYQ.Td
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void EYQ(java.util.List<com.bytedance.adsdk.lottie.EYQ.EYQ.Td> r8, java.util.List<com.bytedance.adsdk.lottie.EYQ.EYQ.Td> r9) {
        /*
            r7 = this;
            int r0 = r8.size()
            int r0 = r0 + (-1)
            r1 = 0
            r2 = r1
        L8:
            if (r0 < 0) goto L22
            java.lang.Object r3 = r8.get(r0)
            com.bytedance.adsdk.lottie.EYQ.EYQ.Td r3 = (com.bytedance.adsdk.lottie.EYQ.EYQ.Td) r3
            boolean r4 = r3 instanceof com.bytedance.adsdk.lottie.EYQ.EYQ.WU
            if (r4 == 0) goto L1f
            com.bytedance.adsdk.lottie.EYQ.EYQ.WU r3 = (com.bytedance.adsdk.lottie.EYQ.EYQ.WU) r3
            com.bytedance.adsdk.lottie.Td.mZx.hYh$EYQ r4 = r3.mZx()
            com.bytedance.adsdk.lottie.Td.mZx.hYh$EYQ r5 = com.bytedance.adsdk.lottie.Td.mZx.hYh.EYQ.INDIVIDUALLY
            if (r4 != r5) goto L1f
            r2 = r3
        L1f:
            int r0 = r0 + (-1)
            goto L8
        L22:
            if (r2 == 0) goto L27
            r2.EYQ(r7)
        L27:
            int r8 = r9.size()
            int r8 = r8 + (-1)
            r0 = r1
        L2e:
            if (r8 < 0) goto L6c
            java.lang.Object r3 = r9.get(r8)
            com.bytedance.adsdk.lottie.EYQ.EYQ.Td r3 = (com.bytedance.adsdk.lottie.EYQ.EYQ.Td) r3
            boolean r4 = r3 instanceof com.bytedance.adsdk.lottie.EYQ.EYQ.WU
            if (r4 == 0) goto L55
            r4 = r3
            com.bytedance.adsdk.lottie.EYQ.EYQ.WU r4 = (com.bytedance.adsdk.lottie.EYQ.EYQ.WU) r4
            com.bytedance.adsdk.lottie.Td.mZx.hYh$EYQ r5 = r4.mZx()
            com.bytedance.adsdk.lottie.Td.mZx.hYh$EYQ r6 = com.bytedance.adsdk.lottie.Td.mZx.hYh.EYQ.INDIVIDUALLY
            if (r5 != r6) goto L55
            if (r0 == 0) goto L4c
            java.util.List<com.bytedance.adsdk.lottie.EYQ.EYQ.EYQ$EYQ> r3 = r7.HX
            r3.add(r0)
        L4c:
            com.bytedance.adsdk.lottie.EYQ.EYQ.EYQ$EYQ r0 = new com.bytedance.adsdk.lottie.EYQ.EYQ.EYQ$EYQ
            r0.<init>(r4)
            r4.EYQ(r7)
            goto L69
        L55:
            boolean r4 = r3 instanceof com.bytedance.adsdk.lottie.EYQ.EYQ.pi
            if (r4 == 0) goto L69
            if (r0 != 0) goto L60
            com.bytedance.adsdk.lottie.EYQ.EYQ.EYQ$EYQ r0 = new com.bytedance.adsdk.lottie.EYQ.EYQ.EYQ$EYQ
            r0.<init>(r2)
        L60:
            java.util.List r4 = com.bytedance.adsdk.lottie.EYQ.EYQ.EYQ.C0071EYQ.EYQ(r0)
            com.bytedance.adsdk.lottie.EYQ.EYQ.pi r3 = (com.bytedance.adsdk.lottie.EYQ.EYQ.pi) r3
            r4.add(r3)
        L69:
            int r8 = r8 + (-1)
            goto L2e
        L6c:
            if (r0 == 0) goto L73
            java.util.List<com.bytedance.adsdk.lottie.EYQ.EYQ.EYQ$EYQ> r8 = r7.HX
            r8.add(r0)
        L73:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.adsdk.lottie.EYQ.EYQ.EYQ.EYQ(java.util.List, java.util.List):void");
    }

    @Override // com.bytedance.adsdk.lottie.EYQ.EYQ.Kbd
    public void EYQ(Canvas canvas, Matrix matrix, int i) {
        com.bytedance.adsdk.lottie.Kbd.EYQ("StrokeContent#draw");
        if (com.bytedance.adsdk.lottie.IPb.IPb.mZx(matrix)) {
            com.bytedance.adsdk.lottie.Kbd.mZx("StrokeContent#draw");
            return;
        }
        this.mZx.setAlpha(com.bytedance.adsdk.lottie.IPb.Kbd.EYQ((int) ((((i / 255.0f) * ((com.bytedance.adsdk.lottie.EYQ.mZx.IPb) this.tsL).HX()) / 100.0f) * 255.0f), 0, 255));
        this.mZx.setStrokeWidth(((com.bytedance.adsdk.lottie.EYQ.mZx.Pm) this.MxO).HX() * com.bytedance.adsdk.lottie.IPb.IPb.EYQ(matrix));
        if (this.mZx.getStrokeWidth() <= 0.0f) {
            com.bytedance.adsdk.lottie.Kbd.mZx("StrokeContent#draw");
            return;
        }
        EYQ(matrix);
        com.bytedance.adsdk.lottie.EYQ.mZx.EYQ<ColorFilter, ColorFilter> eyq = this.KO;
        if (eyq != null) {
            this.mZx.setColorFilter(eyq.VwS());
        }
        com.bytedance.adsdk.lottie.EYQ.mZx.EYQ<Float, Float> eyq2 = this.hu;
        if (eyq2 != null) {
            float fFloatValue = eyq2.VwS().floatValue();
            if (fFloatValue == 0.0f) {
                this.mZx.setMaskFilter(null);
            } else if (fFloatValue != this.Td) {
                this.mZx.setMaskFilter(this.EYQ.mZx(fFloatValue));
            }
            this.Td = fFloatValue;
        }
        com.bytedance.adsdk.lottie.EYQ.mZx.Td td = this.UB;
        if (td != null) {
            td.EYQ(this.mZx);
        }
        for (int i2 = 0; i2 < this.HX.size(); i2++) {
            C0071EYQ c0071eyq = this.HX.get(i2);
            if (c0071eyq.mZx != null) {
                EYQ(canvas, c0071eyq, matrix);
            } else {
                com.bytedance.adsdk.lottie.Kbd.EYQ("StrokeContent#buildPath");
                this.Kbd.reset();
                for (int size = c0071eyq.EYQ.size() - 1; size >= 0; size--) {
                    this.Kbd.addPath(((pi) c0071eyq.EYQ.get(size)).Pm(), matrix);
                }
                com.bytedance.adsdk.lottie.Kbd.mZx("StrokeContent#buildPath");
                com.bytedance.adsdk.lottie.Kbd.EYQ("StrokeContent#drawPath");
                canvas.drawPath(this.Kbd, this.mZx);
                com.bytedance.adsdk.lottie.Kbd.mZx("StrokeContent#drawPath");
            }
        }
        com.bytedance.adsdk.lottie.Kbd.mZx("StrokeContent#draw");
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0110  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void EYQ(android.graphics.Canvas r17, com.bytedance.adsdk.lottie.EYQ.EYQ.EYQ.C0071EYQ r18, android.graphics.Matrix r19) {
        /*
            Method dump skipped, instructions count: 337
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.adsdk.lottie.EYQ.EYQ.EYQ.EYQ(android.graphics.Canvas, com.bytedance.adsdk.lottie.EYQ.EYQ.EYQ$EYQ, android.graphics.Matrix):void");
    }

    @Override // com.bytedance.adsdk.lottie.EYQ.EYQ.Kbd
    public void EYQ(RectF rectF, Matrix matrix, boolean z) {
        com.bytedance.adsdk.lottie.Kbd.EYQ("StrokeContent#getBounds");
        this.Kbd.reset();
        for (int i = 0; i < this.HX.size(); i++) {
            C0071EYQ c0071eyq = this.HX.get(i);
            for (int i2 = 0; i2 < c0071eyq.EYQ.size(); i2++) {
                this.Kbd.addPath(((pi) c0071eyq.EYQ.get(i2)).Pm(), matrix);
            }
        }
        this.Kbd.computeBounds(this.VwS, false);
        float fHX = ((com.bytedance.adsdk.lottie.EYQ.mZx.Pm) this.MxO).HX();
        RectF rectF2 = this.VwS;
        float f = fHX / 2.0f;
        rectF2.set(rectF2.left - f, this.VwS.top - f, this.VwS.right + f, this.VwS.bottom + f);
        rectF.set(this.VwS);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
        com.bytedance.adsdk.lottie.Kbd.mZx("StrokeContent#getBounds");
    }

    private void EYQ(Matrix matrix) {
        com.bytedance.adsdk.lottie.Kbd.EYQ("StrokeContent#applyDashPattern");
        if (this.pi.isEmpty()) {
            com.bytedance.adsdk.lottie.Kbd.mZx("StrokeContent#applyDashPattern");
            return;
        }
        float fEYQ = com.bytedance.adsdk.lottie.IPb.IPb.EYQ(matrix);
        for (int i = 0; i < this.pi.size(); i++) {
            this.tp[i] = this.pi.get(i).VwS().floatValue();
            if (i % 2 == 0) {
                float[] fArr = this.tp;
                if (fArr[i] < 1.0f) {
                    fArr[i] = 1.0f;
                }
            } else {
                float[] fArr2 = this.tp;
                if (fArr2[i] < 0.1f) {
                    fArr2[i] = 0.1f;
                }
            }
            float[] fArr3 = this.tp;
            fArr3[i] = fArr3[i] * fEYQ;
        }
        com.bytedance.adsdk.lottie.EYQ.mZx.EYQ<?, Float> eyq = this.nWX;
        this.mZx.setPathEffect(new DashPathEffect(this.tp, eyq == null ? 0.0f : fEYQ * eyq.VwS().floatValue()));
        com.bytedance.adsdk.lottie.Kbd.mZx("StrokeContent#applyDashPattern");
    }

    /* compiled from: BaseStrokeContent.java */
    /* renamed from: com.bytedance.adsdk.lottie.EYQ.EYQ.EYQ$EYQ, reason: collision with other inner class name */
    private static final class C0071EYQ {
        private final List<pi> EYQ;
        private final WU mZx;

        private C0071EYQ(WU wu) {
            this.EYQ = new ArrayList();
            this.mZx = wu;
        }
    }
}
