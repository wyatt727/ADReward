package com.bytedance.adsdk.lottie.EYQ.EYQ;

import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.LongSparseArray;
import com.bytedance.adsdk.lottie.EYQ.mZx.EYQ;
import com.json.mediationsdk.logger.IronSourceError;
import java.util.ArrayList;
import java.util.List;

/* compiled from: GradientFillContent.java */
/* loaded from: classes2.dex */
public class QQ implements Kbd, MxO, EYQ.InterfaceC0072EYQ {
    float EYQ;
    private final RectF HX;
    private final com.bytedance.adsdk.lottie.EYQ.mZx.EYQ<PointF, PointF> KO;
    private final com.bytedance.adsdk.lottie.Td.mZx.VwS MxO;
    private final com.bytedance.adsdk.lottie.Td.Td.EYQ Pm;
    private final Paint QQ;
    private final boolean Td;
    private com.bytedance.adsdk.lottie.EYQ.mZx.UB UB;
    private final com.bytedance.adsdk.lottie.QQ Uc;
    private final Path VwS;
    private com.bytedance.adsdk.lottie.EYQ.mZx.Td WU;
    private final int hYh;
    private com.bytedance.adsdk.lottie.EYQ.mZx.EYQ<ColorFilter, ColorFilter> hu;
    private final String mZx;
    private final com.bytedance.adsdk.lottie.EYQ.mZx.EYQ<PointF, PointF> nWX;
    private final com.bytedance.adsdk.lottie.EYQ.mZx.EYQ<Integer, Integer> pi;
    private final List<pi> tp;
    private final com.bytedance.adsdk.lottie.EYQ.mZx.EYQ<com.bytedance.adsdk.lottie.Td.mZx.Pm, com.bytedance.adsdk.lottie.Td.mZx.Pm> tsL;
    private com.bytedance.adsdk.lottie.EYQ.mZx.EYQ<Float, Float> zF;
    private final LongSparseArray<LinearGradient> Kbd = new LongSparseArray<>();
    private final LongSparseArray<RadialGradient> IPb = new LongSparseArray<>();

    public QQ(com.bytedance.adsdk.lottie.QQ qq, com.bytedance.adsdk.lottie.IPb iPb, com.bytedance.adsdk.lottie.Td.Td.EYQ eyq, com.bytedance.adsdk.lottie.Td.mZx.Kbd kbd) {
        Path path = new Path();
        this.VwS = path;
        this.QQ = new com.bytedance.adsdk.lottie.EYQ.EYQ(1);
        this.HX = new RectF();
        this.tp = new ArrayList();
        this.EYQ = 0.0f;
        this.Pm = eyq;
        this.mZx = kbd.EYQ();
        this.Td = kbd.QQ();
        this.Uc = qq;
        this.MxO = kbd.mZx();
        path.setFillType(kbd.Td());
        this.hYh = (int) (iPb.Kbd() / 32.0f);
        com.bytedance.adsdk.lottie.EYQ.mZx.EYQ<com.bytedance.adsdk.lottie.Td.mZx.Pm, com.bytedance.adsdk.lottie.Td.mZx.Pm> EYQ = kbd.Pm().EYQ();
        this.tsL = EYQ;
        EYQ.EYQ(this);
        eyq.EYQ(EYQ);
        com.bytedance.adsdk.lottie.EYQ.mZx.EYQ<Integer, Integer> EYQ2 = kbd.Kbd().EYQ();
        this.pi = EYQ2;
        EYQ2.EYQ(this);
        eyq.EYQ(EYQ2);
        com.bytedance.adsdk.lottie.EYQ.mZx.EYQ<PointF, PointF> EYQ3 = kbd.IPb().EYQ();
        this.nWX = EYQ3;
        EYQ3.EYQ(this);
        eyq.EYQ(EYQ3);
        com.bytedance.adsdk.lottie.EYQ.mZx.EYQ<PointF, PointF> EYQ4 = kbd.VwS().EYQ();
        this.KO = EYQ4;
        EYQ4.EYQ(this);
        eyq.EYQ(EYQ4);
        if (eyq.IPb() != null) {
            com.bytedance.adsdk.lottie.EYQ.mZx.EYQ<Float, Float> EYQ5 = eyq.IPb().EYQ().EYQ();
            this.zF = EYQ5;
            EYQ5.EYQ(this);
            eyq.EYQ(this.zF);
        }
        if (eyq.VwS() != null) {
            this.WU = new com.bytedance.adsdk.lottie.EYQ.mZx.Td(this, eyq, eyq.VwS());
        }
    }

    @Override // com.bytedance.adsdk.lottie.EYQ.mZx.EYQ.InterfaceC0072EYQ
    public void EYQ() {
        this.Uc.invalidateSelf();
    }

    @Override // com.bytedance.adsdk.lottie.EYQ.EYQ.Td
    public void EYQ(List<Td> list, List<Td> list2) {
        for (int i = 0; i < list2.size(); i++) {
            Td td = list2.get(i);
            if (td instanceof pi) {
                this.tp.add((pi) td);
            }
        }
    }

    @Override // com.bytedance.adsdk.lottie.EYQ.EYQ.Kbd
    public void EYQ(Canvas canvas, Matrix matrix, int i) {
        Shader shaderTd;
        if (this.Td) {
            return;
        }
        com.bytedance.adsdk.lottie.Kbd.EYQ("GradientFillContent#draw");
        this.VwS.reset();
        for (int i2 = 0; i2 < this.tp.size(); i2++) {
            this.VwS.addPath(this.tp.get(i2).Pm(), matrix);
        }
        this.VwS.computeBounds(this.HX, false);
        if (this.MxO == com.bytedance.adsdk.lottie.Td.mZx.VwS.LINEAR) {
            shaderTd = mZx();
        } else {
            shaderTd = Td();
        }
        shaderTd.setLocalMatrix(matrix);
        this.QQ.setShader(shaderTd);
        com.bytedance.adsdk.lottie.EYQ.mZx.EYQ<ColorFilter, ColorFilter> eyq = this.hu;
        if (eyq != null) {
            this.QQ.setColorFilter(eyq.VwS());
        }
        com.bytedance.adsdk.lottie.EYQ.mZx.EYQ<Float, Float> eyq2 = this.zF;
        if (eyq2 != null) {
            float fFloatValue = eyq2.VwS().floatValue();
            if (fFloatValue == 0.0f) {
                this.QQ.setMaskFilter(null);
            } else if (fFloatValue != this.EYQ) {
                this.QQ.setMaskFilter(new BlurMaskFilter(fFloatValue, BlurMaskFilter.Blur.NORMAL));
            }
            this.EYQ = fFloatValue;
        }
        com.bytedance.adsdk.lottie.EYQ.mZx.Td td = this.WU;
        if (td != null) {
            td.EYQ(this.QQ);
        }
        this.QQ.setAlpha(com.bytedance.adsdk.lottie.IPb.Kbd.EYQ((int) ((((i / 255.0f) * this.pi.VwS().intValue()) / 100.0f) * 255.0f), 0, 255));
        canvas.drawPath(this.VwS, this.QQ);
        com.bytedance.adsdk.lottie.Kbd.mZx("GradientFillContent#draw");
    }

    @Override // com.bytedance.adsdk.lottie.EYQ.EYQ.Kbd
    public void EYQ(RectF rectF, Matrix matrix, boolean z) {
        this.VwS.reset();
        for (int i = 0; i < this.tp.size(); i++) {
            this.VwS.addPath(this.tp.get(i).Pm(), matrix);
        }
        this.VwS.computeBounds(rectF, false);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
    }

    private LinearGradient mZx() {
        long jPm = Pm();
        LinearGradient linearGradient = this.Kbd.get(jPm);
        if (linearGradient != null) {
            return linearGradient;
        }
        PointF pointFVwS = this.nWX.VwS();
        PointF pointFVwS2 = this.KO.VwS();
        com.bytedance.adsdk.lottie.Td.mZx.Pm pmVwS = this.tsL.VwS();
        LinearGradient linearGradient2 = new LinearGradient(pointFVwS.x, pointFVwS.y, pointFVwS2.x, pointFVwS2.y, EYQ(pmVwS.mZx()), pmVwS.EYQ(), Shader.TileMode.CLAMP);
        this.Kbd.put(jPm, linearGradient2);
        return linearGradient2;
    }

    private RadialGradient Td() {
        long jPm = Pm();
        RadialGradient radialGradient = this.IPb.get(jPm);
        if (radialGradient != null) {
            return radialGradient;
        }
        PointF pointFVwS = this.nWX.VwS();
        PointF pointFVwS2 = this.KO.VwS();
        com.bytedance.adsdk.lottie.Td.mZx.Pm pmVwS = this.tsL.VwS();
        int[] iArrEYQ = EYQ(pmVwS.mZx());
        float[] fArrEYQ = pmVwS.EYQ();
        float f = pointFVwS.x;
        float f2 = pointFVwS.y;
        float fHypot = (float) Math.hypot(pointFVwS2.x - f, pointFVwS2.y - f2);
        if (fHypot <= 0.0f) {
            fHypot = 0.001f;
        }
        RadialGradient radialGradient2 = new RadialGradient(f, f2, fHypot, iArrEYQ, fArrEYQ, Shader.TileMode.CLAMP);
        this.IPb.put(jPm, radialGradient2);
        return radialGradient2;
    }

    private int Pm() {
        int iRound = Math.round(this.nWX.QQ() * this.hYh);
        int iRound2 = Math.round(this.KO.QQ() * this.hYh);
        int iRound3 = Math.round(this.tsL.QQ() * this.hYh);
        int i = iRound != 0 ? iRound * IronSourceError.ERROR_NON_EXISTENT_INSTANCE : 17;
        if (iRound2 != 0) {
            i = i * 31 * iRound2;
        }
        return iRound3 != 0 ? i * 31 * iRound3 : i;
    }

    private int[] EYQ(int[] iArr) {
        if (this.UB == null) {
            return iArr;
        }
        throw null;
    }
}
