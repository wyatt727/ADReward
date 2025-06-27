package com.bytedance.sdk.openadsdk.adapter;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Xfermode;
import android.os.Build;
import android.util.AttributeSet;
import com.bytedance.sdk.openadsdk.core.customview.PAGImageView;
import com.bytedance.sdk.openadsdk.utils.tr;

/* loaded from: classes2.dex */
public class NiceImageView extends PAGImageView {
    private final Context EYQ;
    private int HX;
    private int IPb;
    private int KO;
    private int Kbd;
    private int MxO;
    private final Path NZ;
    private int Pm;
    private int QQ;
    private boolean Td;
    private float UB;
    private final float[] Uc;
    private int VwS;
    private final RectF WU;
    private final Paint XN;
    private final float[] hYh;
    private int hu;
    private boolean mZx;
    private final Xfermode nWX;
    private int pi;
    private Path tPj;
    private int tp;
    private int tsL;
    private RectF zF;

    public NiceImageView(Context context) {
        this(context, null);
    }

    public NiceImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NiceImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.Kbd = -1;
        this.VwS = -1;
        this.EYQ = context;
        this.QQ = tr.mZx(context, 10.0f);
        this.Uc = new float[8];
        this.hYh = new float[8];
        this.WU = new RectF();
        this.zF = new RectF();
        this.XN = new Paint();
        this.NZ = new Path();
        if (Build.VERSION.SDK_INT <= 27) {
            this.nWX = new PorterDuffXfermode(PorterDuff.Mode.DST_IN);
        } else {
            this.nWX = new PorterDuffXfermode(PorterDuff.Mode.DST_OUT);
            this.tPj = new Path();
        }
        Td();
        Pm();
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.KO = i;
        this.hu = i2;
        EYQ();
        mZx();
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDraw(Canvas canvas) {
        canvas.saveLayer(this.zF, null, 31);
        if (!this.Td) {
            int i = this.KO;
            int i2 = this.Pm;
            int i3 = this.IPb;
            int i4 = this.hu;
            canvas.scale((((i - (i2 * 2)) - (i3 * 2)) * 1.0f) / i, (((i4 - (i2 * 2)) - (i3 * 2)) * 1.0f) / i4, i / 2.0f, i4 / 2.0f);
        }
        super.onDraw(canvas);
        this.XN.reset();
        this.NZ.reset();
        if (this.mZx) {
            this.NZ.addCircle(this.KO / 2.0f, this.hu / 2.0f, this.UB, Path.Direction.CCW);
        } else {
            this.NZ.addRoundRect(this.zF, this.hYh, Path.Direction.CCW);
        }
        this.XN.setAntiAlias(true);
        this.XN.setStyle(Paint.Style.FILL);
        this.XN.setXfermode(this.nWX);
        if (Build.VERSION.SDK_INT <= 27) {
            canvas.drawPath(this.NZ, this.XN);
        } else {
            this.tPj.addRect(this.zF, Path.Direction.CCW);
            this.tPj.op(this.NZ, Path.Op.DIFFERENCE);
            canvas.drawPath(this.tPj, this.XN);
        }
        this.XN.setXfermode(null);
        int i5 = this.pi;
        if (i5 != 0) {
            this.XN.setColor(i5);
            canvas.drawPath(this.NZ, this.XN);
        }
        canvas.restore();
        EYQ(canvas);
    }

    private void EYQ(Canvas canvas) {
        if (this.mZx) {
            int i = this.Pm;
            if (i > 0) {
                EYQ(canvas, i, this.Kbd, this.UB - (i / 2.0f));
            }
            int i2 = this.IPb;
            if (i2 > 0) {
                EYQ(canvas, i2, this.VwS, (this.UB - this.Pm) - (i2 / 2.0f));
                return;
            }
            return;
        }
        int i3 = this.Pm;
        if (i3 > 0) {
            EYQ(canvas, i3, this.Kbd, this.WU, this.Uc);
        }
    }

    private void EYQ(Canvas canvas, int i, int i2, float f) {
        EYQ(i, i2);
        this.NZ.addCircle(this.KO / 2.0f, this.hu / 2.0f, f, Path.Direction.CCW);
        canvas.drawPath(this.NZ, this.XN);
    }

    private void EYQ(Canvas canvas, int i, int i2, RectF rectF, float[] fArr) {
        EYQ(i, i2);
        this.NZ.addRoundRect(rectF, fArr, Path.Direction.CCW);
        canvas.drawPath(this.NZ, this.XN);
    }

    private void EYQ(int i, int i2) {
        this.NZ.reset();
        this.XN.setStrokeWidth(i);
        this.XN.setColor(i2);
        this.XN.setStyle(Paint.Style.STROKE);
    }

    private void EYQ() {
        if (this.mZx) {
            return;
        }
        RectF rectF = this.WU;
        int i = this.Pm;
        rectF.set(i / 2.0f, i / 2.0f, this.KO - (i / 2.0f), this.hu - (i / 2.0f));
    }

    private void mZx() {
        if (this.mZx) {
            float fMin = Math.min(this.KO, this.hu) / 2.0f;
            this.UB = fMin;
            RectF rectF = this.zF;
            int i = this.KO;
            int i2 = this.hu;
            rectF.set((i / 2.0f) - fMin, (i2 / 2.0f) - fMin, (i / 2.0f) + fMin, (i2 / 2.0f) + fMin);
            return;
        }
        this.zF.set(0.0f, 0.0f, this.KO, this.hu);
        if (this.Td) {
            this.zF = this.WU;
        }
    }

    private void Td() {
        if (this.mZx) {
            return;
        }
        int i = 0;
        if (this.QQ <= 0) {
            float[] fArr = this.Uc;
            int i2 = this.HX;
            float f = i2;
            fArr[1] = f;
            fArr[0] = f;
            int i3 = this.tp;
            float f2 = i3;
            fArr[3] = f2;
            fArr[2] = f2;
            int i4 = this.tsL;
            float f3 = i4;
            fArr[5] = f3;
            fArr[4] = f3;
            int i5 = this.MxO;
            float f4 = i5;
            fArr[7] = f4;
            fArr[6] = f4;
            float[] fArr2 = this.hYh;
            int i6 = this.Pm;
            float f5 = i2 - (i6 / 2.0f);
            fArr2[1] = f5;
            fArr2[0] = f5;
            float f6 = i3 - (i6 / 2.0f);
            fArr2[3] = f6;
            fArr2[2] = f6;
            float f7 = i4 - (i6 / 2.0f);
            fArr2[5] = f7;
            fArr2[4] = f7;
            float f8 = i5 - (i6 / 2.0f);
            fArr2[7] = f8;
            fArr2[6] = f8;
            return;
        }
        while (true) {
            float[] fArr3 = this.Uc;
            if (i >= fArr3.length) {
                return;
            }
            int i7 = this.QQ;
            fArr3[i] = i7;
            this.hYh[i] = i7 - (this.Pm / 2.0f);
            i++;
        }
    }

    private void EYQ(boolean z) {
        if (z) {
            this.QQ = 0;
        }
        Td();
        EYQ();
        invalidate();
    }

    private void Pm() {
        if (this.mZx) {
            return;
        }
        this.IPb = 0;
    }

    public void isCoverSrc(boolean z) {
        this.Td = z;
        mZx();
        invalidate();
    }

    public void isCircle(boolean z) {
        this.mZx = z;
        Pm();
        mZx();
        invalidate();
    }

    public void setBorderWidth(int i) {
        this.Pm = tr.mZx(this.EYQ, i);
        EYQ(false);
    }

    public void setBorderColor(int i) {
        this.Kbd = i;
        invalidate();
    }

    public void setInnerBorderWidth(int i) {
        this.IPb = tr.mZx(this.EYQ, i);
        Pm();
        invalidate();
    }

    public void setInnerBorderColor(int i) {
        this.VwS = i;
        invalidate();
    }

    public void setCornerRadius(int i) {
        this.QQ = tr.mZx(this.EYQ, i);
        EYQ(false);
    }

    public void setCornerTopLeftRadius(int i) {
        this.HX = tr.mZx(this.EYQ, i);
        EYQ(true);
    }

    public void setCornerTopRightRadius(int i) {
        this.tp = tr.mZx(this.EYQ, i);
        EYQ(true);
    }

    public void setCornerBottomLeftRadius(int i) {
        this.MxO = tr.mZx(this.EYQ, i);
        EYQ(true);
    }

    public void setCornerBottomRightRadius(int i) {
        this.tsL = tr.mZx(this.EYQ, i);
        EYQ(true);
    }

    public void setMaskColor(int i) {
        this.pi = i;
        invalidate();
    }
}
