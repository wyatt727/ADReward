package com.facebook.ads.redexgen.uinode;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Rect;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;

/* renamed from: com.facebook.ads.redexgen.X.2e, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC04122e extends FrameLayout {
    public static final float A08;
    public static final int A09;
    public static final InterfaceC04142g A0A;
    public int A00;
    public int A01;
    public boolean A02;
    public boolean A03;
    public final Rect A04;
    public final Rect A05;
    public final InterfaceC04132f A06;
    public static String[] A07 = {"jVZ1Tu881vaZhMQc7G1YnAdrBZwLOzLZ", "MIZgMzLB91QWfj9gVmnmcTG9oR84Ntwz", "DCbfL76gOTURmFCUeHCsoybhclYkmTay", "EMPd0g2FUYEiLKskd4o9XcZgPaWME7KU", "G2pxhAodnNK6EDlWmu9QTAPYKMlMfLOc", "qEeDuFDfyNwl7ByTckOuFZ9zHyfaVY7D", "VB67ht075LyAy5nhvmM9NplNYlVRYF1n", "i4ARItf07QURagRfhioscqF5iwXVDFyZ"};
    public static final int[] A0B = {R.attr.colorBackground};

    static {
        float f = Resources.getSystem().getDisplayMetrics().density;
        A08 = f;
        A09 = (int) (f * 1.0f);
        if (Build.VERSION.SDK_INT >= 21) {
            A0A = new C1252a9();
        } else if (Build.VERSION.SDK_INT >= 17) {
            A0A = new F6();
        } else {
            A0A = new C1250a7();
        }
        A0A.A8r();
    }

    public AbstractC04122e(Context context) {
        this(context, null);
    }

    public AbstractC04122e(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AbstractC04122e(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Rect rect = new Rect();
        this.A04 = rect;
        this.A05 = new Rect();
        C1254aB c1254aB = new C1254aB(this);
        this.A06 = c1254aB;
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(A0B);
        int color = typedArrayObtainStyledAttributes.getColor(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        Color.colorToHSV(color, new float[3]);
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(-328966);
        this.A02 = false;
        this.A03 = true;
        rect.left = 0;
        rect.top = 0;
        rect.right = 0;
        rect.bottom = 0;
        int themeColorBackground = 10.0f > 50.0f ? 1092616192 : 1112014848;
        this.A01 = 0;
        this.A00 = 0;
        A0A.A8s(c1254aB, context, colorStateListValueOf, 10.0f, 10.0f, themeColorBackground);
    }

    public ColorStateList getCardBackgroundColor() {
        return A0A.A66(this.A06);
    }

    public float getCardElevation() {
        return A0A.A6t(this.A06);
    }

    public int getContentPaddingBottom() {
        return this.A04.bottom;
    }

    public int getContentPaddingLeft() {
        return this.A04.left;
    }

    public int getContentPaddingRight() {
        return this.A04.right;
    }

    public int getContentPaddingTop() {
        return this.A04.top;
    }

    public float getMaxCardElevation() {
        return A0A.A7M(this.A06);
    }

    public boolean getPreventCornerOverlap() {
        return this.A03;
    }

    public float getRadius() {
        return A0A.A7m(this.A06);
    }

    public boolean getUseCompatPadding() {
        return this.A02;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        if (!(A0A instanceof C1252a9)) {
            int mode = View.MeasureSpec.getMode(i);
            switch (mode) {
                case Integer.MIN_VALUE:
                case 1073741824:
                    double dCeil = Math.ceil(r6.A7S(this.A06));
                    if (A07[1].charAt(21) == 'T') {
                        A07[1] = "CoEZjfZf0TpQ2BZBlHTi5T6DWNYutRLI";
                        int minHeight = View.MeasureSpec.getSize(i);
                        i = View.MeasureSpec.makeMeasureSpec(Math.max((int) dCeil, minHeight), mode);
                        break;
                    } else {
                        throw new RuntimeException();
                    }
            }
            int mode2 = View.MeasureSpec.getMode(i2);
            switch (mode2) {
                case Integer.MIN_VALUE:
                case 1073741824:
                    int iCeil = (int) Math.ceil(r6.A7R(this.A06));
                    int minHeight2 = View.MeasureSpec.getSize(i2);
                    i2 = View.MeasureSpec.makeMeasureSpec(Math.max(iCeil, minHeight2), mode2);
                    break;
            }
            super.onMeasure(i, i2);
            return;
        }
        super.onMeasure(i, i2);
    }

    public void setCardBackgroundColor(int i) {
        A0A.AFt(this.A06, ColorStateList.valueOf(i));
    }

    public void setCardBackgroundColor(ColorStateList colorStateList) {
        A0A.AFt(this.A06, colorStateList);
    }

    public void setCardElevation(float f) {
        A0A.AFz(this.A06, f);
    }

    public void setMaxCardElevation(float f) {
        A0A.AG6(this.A06, f);
    }

    @Override // android.view.View
    public void setMinimumHeight(int i) {
        this.A00 = i;
        super.setMinimumHeight(i);
    }

    @Override // android.view.View
    public void setMinimumWidth(int i) {
        this.A01 = i;
        super.setMinimumWidth(i);
    }

    @Override // android.view.View
    public final void setPadding(int i, int i2, int i3, int i4) {
    }

    @Override // android.view.View
    public final void setPaddingRelative(int i, int i2, int i3, int i4) {
    }

    public void setPreventCornerOverlap(boolean z) {
        if (z != this.A03) {
            this.A03 = z;
            String[] strArr = A07;
            if (strArr[5].charAt(25) == strArr[2].charAt(25)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A07;
            strArr2[5] = "AF11DlndTIGSrqZz8tUh3XTR3YFTmMvs";
            strArr2[2] = "M7b5sm4OMM6QoyOKa0AwC0c4wRmpSBfx";
            A0A.ACk(this.A06);
        }
    }

    public void setRadius(float f) {
        A0A.AGC(this.A06, f);
    }

    public void setUseCompatPadding(boolean z) {
        if (this.A02 != z) {
            this.A02 = z;
            A0A.AB7(this.A06);
        }
    }
}
