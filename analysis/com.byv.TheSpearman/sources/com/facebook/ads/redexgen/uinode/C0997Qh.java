package com.facebook.ads.redexgen.uinode;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.os.Build;
import android.widget.Button;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Qh, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0997Qh extends Button {
    public static byte[] A07;
    public String A00;
    public String A01;
    public boolean A02;
    public final Paint A03;
    public final Path A04;
    public final Path A05;
    public final Path A06;

    static {
        A02();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A07, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 4);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A07 = new byte[]{89, 104, 124, 122, 108, 118, 74, 71, 95};
    }

    public C0997Qh(C1207Yn c1207Yn) {
        this(c1207Yn, false);
    }

    public C0997Qh(C1207Yn c1207Yn, boolean z) {
        super(c1207Yn);
        this.A02 = false;
        this.A01 = A00(5, 4, 34);
        this.A00 = A00(0, 5, 13);
        this.A04 = new Path();
        this.A05 = new Path();
        this.A06 = new Path();
        this.A03 = new C0996Qg(this, z);
        A01();
        setClickable(true);
        AbstractC0874Lo.A0M(this, 0);
    }

    private void A01() {
        setContentDescription(this.A02 ? this.A01 : this.A00);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        if (canvas.isHardwareAccelerated() && Build.VERSION.SDK_INT < 17) {
            setLayerType(1, null);
        }
        float fMax = Math.max(canvas.getWidth(), canvas.getHeight()) / 100.0f;
        if (this.A02) {
            this.A06.rewind();
            float scaleFactor = fMax * 26.5f;
            float designedSize = fMax * 15.5f;
            this.A06.moveTo(scaleFactor, designedSize);
            float scaleFactor2 = fMax * 26.5f;
            float designedSize2 = 84.5f * fMax;
            this.A06.lineTo(scaleFactor2, designedSize2);
            float scaleFactor3 = 90.0f * fMax;
            float designedSize3 = 50.0f * fMax;
            this.A06.lineTo(scaleFactor3, designedSize3);
            this.A06.lineTo(26.5f * fMax, 15.5f * fMax);
            this.A06.close();
            canvas.drawPath(this.A06, this.A03);
        } else {
            this.A04.rewind();
            float scaleFactor4 = fMax * 29.0f;
            float designedSize4 = fMax * 21.0f;
            this.A04.moveTo(scaleFactor4, designedSize4);
            float scaleFactor5 = fMax * 29.0f;
            float designedSize5 = fMax * 79.0f;
            this.A04.lineTo(scaleFactor5, designedSize5);
            float scaleFactor6 = fMax * 45.0f;
            float designedSize6 = fMax * 79.0f;
            this.A04.lineTo(scaleFactor6, designedSize6);
            float designedSize7 = fMax * 21.0f;
            this.A04.lineTo(45.0f * fMax, designedSize7);
            float designedSize8 = fMax * 21.0f;
            this.A04.lineTo(29.0f * fMax, designedSize8);
            this.A04.close();
            this.A05.rewind();
            float scaleFactor7 = fMax * 55.0f;
            float designedSize9 = fMax * 21.0f;
            this.A05.moveTo(scaleFactor7, designedSize9);
            float scaleFactor8 = fMax * 55.0f;
            float designedSize10 = fMax * 79.0f;
            this.A05.lineTo(scaleFactor8, designedSize10);
            float designedSize11 = fMax * 71.0f;
            this.A05.lineTo(designedSize11, 79.0f * fMax);
            float designedSize12 = fMax * 21.0f;
            this.A05.lineTo(71.0f * fMax, designedSize12);
            this.A05.lineTo(55.0f * fMax, 21.0f * fMax);
            this.A05.close();
            canvas.drawPath(this.A04, this.A03);
            canvas.drawPath(this.A05, this.A03);
        }
        super.onDraw(canvas);
    }

    public void setChecked(boolean z) {
        this.A02 = z;
        A01();
        refreshDrawableState();
        invalidate();
    }

    public void setPauseAccessibilityLabel(String str) {
        if (str != null) {
            this.A00 = str;
            A01();
        }
    }

    public void setPlayAccessibilityLabel(String str) {
        if (str != null) {
            this.A01 = str;
            A01();
        }
    }
}
