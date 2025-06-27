package com.facebook.ads.redexgen.uinode;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;

/* renamed from: com.facebook.ads.redexgen.X.a8, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1251a8 implements InterfaceC04162i {
    public final /* synthetic */ C1250a7 A00;

    public C1251a8(C1250a7 c1250a7) {
        this.A00 = c1250a7;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC04162i
    public final void A5E(Canvas canvas, RectF rectF, float f, Paint paint) {
        float f2 = f * 2.0f;
        float fWidth = (rectF.width() - f2) - 1.0f;
        float fHeight = (rectF.height() - f2) - 1.0f;
        Canvas canvas2 = canvas;
        Paint paint2 = paint;
        if (f >= 1.0f) {
            float f3 = f + 0.5f;
            this.A00.A00.set(-f3, -f3, f3, f3);
            int iSave = canvas2.save();
            canvas2.translate(rectF.left + f3, rectF.top + f3);
            canvas2.drawArc(this.A00.A00, 180.0f, 90.0f, true, paint2);
            canvas2.translate(fWidth, 0.0f);
            canvas2.rotate(90.0f);
            canvas2.drawArc(this.A00.A00, 180.0f, 90.0f, true, paint2);
            canvas2.translate(fHeight, 0.0f);
            canvas2.rotate(90.0f);
            canvas2.drawArc(this.A00.A00, 180.0f, 90.0f, true, paint2);
            canvas2.translate(fWidth, 0.0f);
            canvas2.rotate(90.0f);
            canvas2 = canvas2;
            canvas2.drawArc(this.A00.A00, 180.0f, 90.0f, true, paint2);
            canvas2.restoreToCount(iSave);
            float f4 = (rectF.left + f3) - 1.0f;
            float innerWidth = rectF.top;
            float innerHeight = (rectF.right - f3) + 1.0f;
            float roundedCornerRadius = rectF.top + f3;
            canvas2.drawRect(f4, innerWidth, innerHeight, roundedCornerRadius, paint2);
            float f5 = (rectF.left + f3) - 1.0f;
            float innerWidth2 = rectF.bottom - f3;
            float innerHeight2 = (rectF.right - f3) + 1.0f;
            float roundedCornerRadius2 = rectF.bottom;
            paint2 = paint2;
            canvas2.drawRect(f5, innerWidth2, innerHeight2, roundedCornerRadius2, paint2);
        }
        float f6 = rectF.left;
        float innerWidth3 = rectF.top + f;
        float innerHeight3 = rectF.right;
        canvas2.drawRect(f6, innerWidth3, innerHeight3, rectF.bottom - f, paint2);
    }
}
