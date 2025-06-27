package com.bytedance.adsdk.lottie.EYQ.EYQ;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.LongSparseArray;
import com.json.mediationsdk.logger.IronSourceError;

/* compiled from: GradientStrokeContent.java */
/* loaded from: classes2.dex */
public class HX extends EYQ {
    private final com.bytedance.adsdk.lottie.Td.mZx.VwS HX;
    private final LongSparseArray<LinearGradient> IPb;
    private final boolean Kbd;
    private final com.bytedance.adsdk.lottie.EYQ.mZx.EYQ<com.bytedance.adsdk.lottie.Td.mZx.Pm, com.bytedance.adsdk.lottie.Td.mZx.Pm> MxO;
    private final String Pm;
    private final RectF QQ;
    private final LongSparseArray<RadialGradient> VwS;
    private com.bytedance.adsdk.lottie.EYQ.mZx.UB nWX;
    private final com.bytedance.adsdk.lottie.EYQ.mZx.EYQ<PointF, PointF> pi;
    private final int tp;
    private final com.bytedance.adsdk.lottie.EYQ.mZx.EYQ<PointF, PointF> tsL;

    public HX(com.bytedance.adsdk.lottie.QQ qq, com.bytedance.adsdk.lottie.Td.Td.EYQ eyq, com.bytedance.adsdk.lottie.Td.mZx.IPb iPb) {
        super(qq, eyq, iPb.QQ().EYQ(), iPb.HX().EYQ(), iPb.tsL(), iPb.Pm(), iPb.VwS(), iPb.tp(), iPb.MxO());
        this.IPb = new LongSparseArray<>();
        this.VwS = new LongSparseArray<>();
        this.QQ = new RectF();
        this.Pm = iPb.EYQ();
        this.HX = iPb.mZx();
        this.Kbd = iPb.pi();
        this.tp = (int) (qq.XN().Kbd() / 32.0f);
        com.bytedance.adsdk.lottie.EYQ.mZx.EYQ<com.bytedance.adsdk.lottie.Td.mZx.Pm, com.bytedance.adsdk.lottie.Td.mZx.Pm> EYQ = iPb.Td().EYQ();
        this.MxO = EYQ;
        EYQ.EYQ(this);
        eyq.EYQ(EYQ);
        com.bytedance.adsdk.lottie.EYQ.mZx.EYQ<PointF, PointF> EYQ2 = iPb.Kbd().EYQ();
        this.tsL = EYQ2;
        EYQ2.EYQ(this);
        eyq.EYQ(EYQ2);
        com.bytedance.adsdk.lottie.EYQ.mZx.EYQ<PointF, PointF> EYQ3 = iPb.IPb().EYQ();
        this.pi = EYQ3;
        EYQ3.EYQ(this);
        eyq.EYQ(EYQ3);
    }

    @Override // com.bytedance.adsdk.lottie.EYQ.EYQ.EYQ, com.bytedance.adsdk.lottie.EYQ.EYQ.Kbd
    public void EYQ(Canvas canvas, Matrix matrix, int i) {
        Shader shaderTd;
        if (this.Kbd) {
            return;
        }
        EYQ(this.QQ, matrix, false);
        if (this.HX == com.bytedance.adsdk.lottie.Td.mZx.VwS.LINEAR) {
            shaderTd = mZx();
        } else {
            shaderTd = Td();
        }
        shaderTd.setLocalMatrix(matrix);
        this.mZx.setShader(shaderTd);
        super.EYQ(canvas, matrix, i);
    }

    private LinearGradient mZx() {
        long jPm = Pm();
        LinearGradient linearGradient = this.IPb.get(jPm);
        if (linearGradient != null) {
            return linearGradient;
        }
        PointF pointFVwS = this.tsL.VwS();
        PointF pointFVwS2 = this.pi.VwS();
        com.bytedance.adsdk.lottie.Td.mZx.Pm pmVwS = this.MxO.VwS();
        LinearGradient linearGradient2 = new LinearGradient(pointFVwS.x, pointFVwS.y, pointFVwS2.x, pointFVwS2.y, EYQ(pmVwS.mZx()), pmVwS.EYQ(), Shader.TileMode.CLAMP);
        this.IPb.put(jPm, linearGradient2);
        return linearGradient2;
    }

    private RadialGradient Td() {
        long jPm = Pm();
        RadialGradient radialGradient = this.VwS.get(jPm);
        if (radialGradient != null) {
            return radialGradient;
        }
        PointF pointFVwS = this.tsL.VwS();
        PointF pointFVwS2 = this.pi.VwS();
        com.bytedance.adsdk.lottie.Td.mZx.Pm pmVwS = this.MxO.VwS();
        int[] iArrEYQ = EYQ(pmVwS.mZx());
        float[] fArrEYQ = pmVwS.EYQ();
        RadialGradient radialGradient2 = new RadialGradient(pointFVwS.x, pointFVwS.y, (float) Math.hypot(pointFVwS2.x - r7, pointFVwS2.y - r8), iArrEYQ, fArrEYQ, Shader.TileMode.CLAMP);
        this.VwS.put(jPm, radialGradient2);
        return radialGradient2;
    }

    private int Pm() {
        int iRound = Math.round(this.tsL.QQ() * this.tp);
        int iRound2 = Math.round(this.pi.QQ() * this.tp);
        int iRound3 = Math.round(this.MxO.QQ() * this.tp);
        int i = iRound != 0 ? iRound * IronSourceError.ERROR_NON_EXISTENT_INSTANCE : 17;
        if (iRound2 != 0) {
            i = i * 31 * iRound2;
        }
        return iRound3 != 0 ? i * 31 * iRound3 : i;
    }

    private int[] EYQ(int[] iArr) {
        if (this.nWX == null) {
            return iArr;
        }
        throw null;
    }
}
