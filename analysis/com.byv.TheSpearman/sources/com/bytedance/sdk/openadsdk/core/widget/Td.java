package com.bytedance.sdk.openadsdk.core.widget;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.bytedance.sdk.component.utils.zF;
import com.bytedance.sdk.openadsdk.core.hu;

/* compiled from: TTCustomShadowBackground.java */
/* loaded from: classes2.dex */
public class Td extends Drawable {
    private final int EYQ;
    private final int HX;
    private final int IPb;
    private final LinearGradient Kbd;
    private Paint MxO;
    private final float[] Pm;
    private final int QQ;
    private final int[] Td;
    private final int VwS;
    private final int mZx;
    private RectF tp;

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    public Td(int i, int[] iArr, float[] fArr, int i2, LinearGradient linearGradient, int i3, int i4, int i5, int i6) {
        this.EYQ = i;
        this.Td = iArr;
        this.Pm = fArr;
        this.mZx = i2;
        this.Kbd = linearGradient;
        this.IPb = i3;
        this.VwS = i4;
        this.QQ = i5;
        this.HX = i6;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (this.tp == null) {
            Rect bounds = getBounds();
            this.tp = new RectF((bounds.left + this.VwS) - this.QQ, (bounds.top + this.VwS) - this.HX, (bounds.right - this.VwS) - this.QQ, (bounds.bottom - this.VwS) - this.HX);
        }
        if (this.MxO == null) {
            EYQ();
        }
        RectF rectF = this.tp;
        int i = this.IPb;
        canvas.drawRoundRect(rectF, i, i, this.MxO);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        Paint paint = this.MxO;
        if (paint != null) {
            paint.setAlpha(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        Paint paint = this.MxO;
        if (paint != null) {
            paint.setColorFilter(colorFilter);
        }
    }

    private void EYQ() {
        int[] iArr;
        Paint paint = new Paint();
        this.MxO = paint;
        paint.setAntiAlias(true);
        this.MxO.setShadowLayer(this.VwS, this.QQ, this.HX, this.mZx);
        if (this.tp != null && (iArr = this.Td) != null && iArr.length > 1) {
            float[] fArr = this.Pm;
            boolean z = fArr != null && fArr.length > 0 && fArr.length == iArr.length;
            Paint paint2 = this.MxO;
            LinearGradient linearGradient = this.Kbd;
            if (linearGradient == null) {
                linearGradient = new LinearGradient(this.tp.left, 0.0f, this.tp.right, 0.0f, this.Td, z ? this.Pm : null, Shader.TileMode.CLAMP);
            }
            paint2.setShader(linearGradient);
            return;
        }
        this.MxO.setColor(this.EYQ);
    }

    public static void EYQ(View view, EYQ eyq) {
        if (view == null || eyq == null) {
            return;
        }
        view.setLayerType(1, null);
        view.setBackground(eyq.EYQ());
    }

    /* compiled from: TTCustomShadowBackground.java */
    public static class EYQ {
        private int HX;
        private LinearGradient Kbd;
        private float[] Pm;
        private int QQ;
        private int[] Td;
        private int EYQ = zF.HX(hu.EYQ(), "tt_ssxinmian8");
        private int mZx = zF.HX(hu.EYQ(), "tt_ssxinxian3");
        private int IPb = 10;
        private int VwS = 16;

        public EYQ() {
            this.QQ = 0;
            this.HX = 0;
            this.QQ = 0;
            this.HX = 0;
        }

        public EYQ EYQ(int i) {
            this.EYQ = i;
            return this;
        }

        public EYQ mZx(int i) {
            this.mZx = i;
            return this;
        }

        public EYQ EYQ(int[] iArr) {
            this.Td = iArr;
            return this;
        }

        public EYQ Td(int i) {
            this.IPb = i;
            return this;
        }

        public EYQ Pm(int i) {
            this.QQ = i;
            return this;
        }

        public EYQ Kbd(int i) {
            this.HX = i;
            return this;
        }

        public Td EYQ() {
            return new Td(this.EYQ, this.Td, this.Pm, this.mZx, this.Kbd, this.IPb, this.VwS, this.QQ, this.HX);
        }
    }
}
