package com.bytedance.adsdk.lottie.Td.Td;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;

/* compiled from: SolidLayer.java */
/* loaded from: classes2.dex */
public class VwS extends EYQ {
    private final float[] HX;
    private final Pm MxO;
    private final Paint QQ;
    private final RectF VwS;
    private final Path tp;
    private com.bytedance.adsdk.lottie.EYQ.mZx.EYQ<ColorFilter, ColorFilter> tsL;

    VwS(com.bytedance.adsdk.lottie.QQ qq, Pm pm) {
        super(qq, pm);
        this.VwS = new RectF();
        com.bytedance.adsdk.lottie.EYQ.EYQ eyq = new com.bytedance.adsdk.lottie.EYQ.EYQ();
        this.QQ = eyq;
        this.HX = new float[8];
        this.tp = new Path();
        this.MxO = pm;
        eyq.setAlpha(0);
        eyq.setStyle(Paint.Style.FILL);
        eyq.setColor(pm.hu());
    }

    @Override // com.bytedance.adsdk.lottie.Td.Td.EYQ
    public void mZx(Canvas canvas, Matrix matrix, int i) {
        int iAlpha = Color.alpha(this.MxO.hu());
        if (iAlpha == 0) {
            return;
        }
        int iIntValue = (int) ((i / 255.0f) * (((iAlpha / 255.0f) * (this.Pm.EYQ() == null ? 100 : this.Pm.EYQ().VwS().intValue())) / 100.0f) * 255.0f);
        this.QQ.setAlpha(iIntValue);
        com.bytedance.adsdk.lottie.EYQ.mZx.EYQ<ColorFilter, ColorFilter> eyq = this.tsL;
        if (eyq != null) {
            this.QQ.setColorFilter(eyq.VwS());
        }
        if (iIntValue > 0) {
            float[] fArr = this.HX;
            fArr[0] = 0.0f;
            fArr[1] = 0.0f;
            fArr[2] = this.MxO.Uc();
            float[] fArr2 = this.HX;
            fArr2[3] = 0.0f;
            fArr2[4] = this.MxO.Uc();
            this.HX[5] = this.MxO.UB();
            float[] fArr3 = this.HX;
            fArr3[6] = 0.0f;
            fArr3[7] = this.MxO.UB();
            matrix.mapPoints(this.HX);
            this.tp.reset();
            Path path = this.tp;
            float[] fArr4 = this.HX;
            path.moveTo(fArr4[0], fArr4[1]);
            Path path2 = this.tp;
            float[] fArr5 = this.HX;
            path2.lineTo(fArr5[2], fArr5[3]);
            Path path3 = this.tp;
            float[] fArr6 = this.HX;
            path3.lineTo(fArr6[4], fArr6[5]);
            Path path4 = this.tp;
            float[] fArr7 = this.HX;
            path4.lineTo(fArr7[6], fArr7[7]);
            Path path5 = this.tp;
            float[] fArr8 = this.HX;
            path5.lineTo(fArr8[0], fArr8[1]);
            this.tp.close();
            canvas.drawPath(this.tp, this.QQ);
        }
    }

    @Override // com.bytedance.adsdk.lottie.Td.Td.EYQ, com.bytedance.adsdk.lottie.EYQ.EYQ.Kbd
    public void EYQ(RectF rectF, Matrix matrix, boolean z) {
        super.EYQ(rectF, matrix, z);
        this.VwS.set(0.0f, 0.0f, this.MxO.Uc(), this.MxO.UB());
        this.EYQ.mapRect(this.VwS);
        rectF.set(this.VwS);
    }
}
