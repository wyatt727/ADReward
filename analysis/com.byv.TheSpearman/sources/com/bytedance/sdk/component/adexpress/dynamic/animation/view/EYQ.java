package com.bytedance.sdk.component.adexpress.dynamic.animation.view;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.sdk.component.adexpress.Pm.IPb;
import com.bytedance.sdk.component.adexpress.dynamic.Td.VwS;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicImageView;

/* compiled from: AnimationWrapper.java */
/* loaded from: classes2.dex */
public class EYQ {
    Paint EYQ;
    private int IPb;
    private int Kbd;
    private int Pm;
    Path mZx = new Path();
    Path Td = new Path();

    public EYQ() {
        Paint paint = new Paint();
        this.EYQ = paint;
        paint.setAntiAlias(true);
    }

    public void EYQ(Canvas canvas, IAnimation iAnimation, View view) {
        int iIntValue;
        int iIntValue2;
        String str;
        if (iAnimation.getRippleValue() != 0.0f) {
            if (com.bytedance.sdk.component.adexpress.EYQ.EYQ.EYQ.EYQ().Td() != null) {
                float[] fArrMZx = null;
                try {
                    str = (String) view.getTag(2097610712);
                    try {
                        fArrMZx = VwS.mZx(str);
                    } catch (Exception unused) {
                    }
                } catch (Exception unused2) {
                    str = "";
                }
                if (str.startsWith("#")) {
                    this.EYQ.setColor(Color.parseColor(str));
                    this.EYQ.setAlpha(90);
                } else if (fArrMZx != null) {
                    this.EYQ.setColor(IPb.EYQ(fArrMZx[3] * (1.0f - iAnimation.getRippleValue()), fArrMZx[0] / 256.0f, fArrMZx[1] / 256.0f, fArrMZx[2] / 256.0f));
                }
            }
            ((ViewGroup) view.getParent()).setClipChildren(true);
            canvas.drawCircle(this.Pm, this.Kbd, Math.min(r1, r4) * 2 * iAnimation.getRippleValue(), this.EYQ);
        }
        if (iAnimation.getShineValue() != 0.0f) {
            if (view.getParent() != null) {
                ((ViewGroup) view.getParent()).setClipChildren(true);
            }
            if (view.getParent().getParent() != null) {
                ((ViewGroup) view.getParent().getParent()).setClipChildren(true);
            }
            this.mZx.reset();
            try {
                iIntValue2 = ((Integer) view.getTag(2097610711)).intValue();
            } catch (Exception unused3) {
                iIntValue2 = 0;
            }
            if (iIntValue2 >= 0) {
                int shineValue = ((int) ((((this.Pm * 4) + (iIntValue2 * 2)) + (this.Kbd * 2)) * iAnimation.getShineValue())) - ((this.Kbd * 2) + iIntValue2);
                float f = shineValue;
                int i = this.Kbd;
                this.EYQ.setShader(new LinearGradient(f, 0.0f, ((iIntValue2 + i) / 2) + shineValue, i / 2, new int[]{Color.parseColor("#20ffffff"), Color.parseColor("#60ffffff"), Color.parseColor("#65ffffff")}, (float[]) null, Shader.TileMode.MIRROR));
                this.EYQ.setStrokeWidth(this.Pm * 2);
                Path path = this.Td;
                if (path != null) {
                    canvas.clipPath(path, Region.Op.INTERSECT);
                }
                int i2 = shineValue + iIntValue2;
                canvas.drawLine(f, 0.0f, i2 + r1, this.Kbd, this.EYQ);
            }
        }
        if (iAnimation.getMarqueeValue() != 0.0f) {
            try {
                iIntValue = ((Integer) view.getTag(2097610709)).intValue();
            } catch (Exception unused4) {
                iIntValue = 0;
            }
            if (iIntValue >= 0) {
                this.mZx.reset();
                this.mZx.moveTo(0.0f, 0.0f);
                this.mZx.lineTo(this.Pm * 2, 0.0f);
                this.mZx.lineTo(this.Pm * 2, this.Kbd * 2);
                this.mZx.lineTo(0.0f, this.Kbd * 2);
                this.mZx.lineTo(0.0f, 0.0f);
                this.EYQ.setShader(new LinearGradient(0.0f, 0.0f, this.Pm * 2, this.Kbd * 2, new int[]{(int) (iAnimation.getMarqueeValue() * (-65536.0f)), (int) ((1.0f - iAnimation.getMarqueeValue()) * (-65536.0f))}, (float[]) null, Shader.TileMode.CLAMP));
                this.EYQ.setColor(-65536);
                this.EYQ.setStyle(Paint.Style.STROKE);
                this.EYQ.setStrokeWidth(iIntValue);
                canvas.drawPath(this.mZx, this.EYQ);
            }
        }
    }

    public void EYQ(View view, float f) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.width = (int) (this.IPb * f);
        view.setTranslationX((this.IPb - layoutParams.width) / 2);
        if (view instanceof DynamicImageView) {
            int i = 0;
            while (true) {
                ViewGroup viewGroup = (ViewGroup) view;
                if (i >= viewGroup.getChildCount()) {
                    break;
                }
                viewGroup.getChildAt(i).setTranslationX((-(this.IPb - layoutParams.width)) / 2);
                i++;
            }
        }
        view.setLayoutParams(layoutParams);
    }

    public void EYQ(View view, int i, int i2) {
        String str;
        this.Pm = i / 2;
        this.Kbd = i2 / 2;
        if (this.IPb == 0 && view.getLayoutParams().width > 0) {
            this.IPb = view.getLayoutParams().width;
        }
        try {
            str = (String) view.getTag(2097610710);
            try {
                this.Td.addRoundRect(new RectF(0.0f, 0.0f, i, i2), i2 / 2, i2 / 2, Path.Direction.CW);
            } catch (Exception unused) {
            }
        } catch (Exception unused2) {
            str = "";
        }
        if ("right".equals(str)) {
            view.setPivotX(this.Pm * 2);
            view.setPivotY(this.Kbd);
        } else if ("left".equals(str)) {
            view.setPivotX(0.0f);
            view.setPivotY(this.Kbd);
        } else {
            view.setPivotX(this.Pm);
            view.setPivotY(this.Kbd);
        }
    }
}
