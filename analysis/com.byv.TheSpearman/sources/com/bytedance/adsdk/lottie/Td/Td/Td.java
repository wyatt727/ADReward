package com.bytedance.adsdk.lottie.Td.Td;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import com.bytedance.adsdk.lottie.HX;

/* compiled from: ImageLayer.java */
/* loaded from: classes2.dex */
public class Td extends EYQ {
    private final Rect HX;
    private com.bytedance.adsdk.lottie.EYQ.mZx.EYQ<ColorFilter, ColorFilter> MxO;
    private final Rect QQ;
    private final Paint VwS;
    private final HX tp;
    private com.bytedance.adsdk.lottie.EYQ.mZx.EYQ<Bitmap, Bitmap> tsL;

    Td(com.bytedance.adsdk.lottie.QQ qq, Pm pm) {
        super(qq, pm);
        this.VwS = new com.bytedance.adsdk.lottie.EYQ.EYQ(3);
        this.QQ = new Rect();
        this.HX = new Rect();
        this.tp = qq.IPb(pm.VwS());
    }

    @Override // com.bytedance.adsdk.lottie.Td.Td.EYQ
    public void mZx(Canvas canvas, Matrix matrix, int i) {
        Bitmap bitmapQQ = QQ();
        if (bitmapQQ == null || bitmapQQ.isRecycled() || this.tp == null) {
            return;
        }
        float fEYQ = com.bytedance.adsdk.lottie.IPb.IPb.EYQ();
        this.VwS.setAlpha(i);
        com.bytedance.adsdk.lottie.EYQ.mZx.EYQ<ColorFilter, ColorFilter> eyq = this.MxO;
        if (eyq != null) {
            this.VwS.setColorFilter(eyq.VwS());
        }
        canvas.save();
        canvas.concat(matrix);
        this.QQ.set(0, 0, bitmapQQ.getWidth(), bitmapQQ.getHeight());
        if (this.mZx.Pm()) {
            this.HX.set(0, 0, (int) (this.tp.EYQ() * fEYQ), (int) (this.tp.mZx() * fEYQ));
        } else {
            this.HX.set(0, 0, (int) (bitmapQQ.getWidth() * fEYQ), (int) (bitmapQQ.getHeight() * fEYQ));
        }
        canvas.drawBitmap(bitmapQQ, this.QQ, this.HX, this.VwS);
        canvas.restore();
    }

    @Override // com.bytedance.adsdk.lottie.Td.Td.EYQ, com.bytedance.adsdk.lottie.EYQ.EYQ.Kbd
    public void EYQ(RectF rectF, Matrix matrix, boolean z) {
        super.EYQ(rectF, matrix, z);
        if (this.tp != null) {
            float fEYQ = com.bytedance.adsdk.lottie.IPb.IPb.EYQ();
            rectF.set(0.0f, 0.0f, this.tp.EYQ() * fEYQ, this.tp.mZx() * fEYQ);
            this.EYQ.mapRect(rectF);
        }
    }

    private Bitmap QQ() {
        Bitmap bitmapVwS;
        com.bytedance.adsdk.lottie.EYQ.mZx.EYQ<Bitmap, Bitmap> eyq = this.tsL;
        if (eyq != null && (bitmapVwS = eyq.VwS()) != null) {
            return bitmapVwS;
        }
        Bitmap bitmapKbd = this.mZx.Kbd(this.Td.VwS());
        if (bitmapKbd != null) {
            return bitmapKbd;
        }
        HX hx = this.tp;
        if (hx != null) {
            return hx.IPb();
        }
        return null;
    }
}
