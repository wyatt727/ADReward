package com.bytedance.adsdk.lottie.EYQ;

import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.os.Build;
import android.os.LocaleList;
import androidx.core.view.ViewCompat;
import com.bytedance.adsdk.lottie.IPb.Kbd;

/* compiled from: LPaint.java */
/* loaded from: classes2.dex */
public class EYQ extends Paint {
    @Override // android.graphics.Paint
    public void setTextLocales(LocaleList localeList) {
    }

    public EYQ() {
    }

    public EYQ(int i) {
        super(i);
    }

    public EYQ(PorterDuff.Mode mode) {
        setXfermode(new PorterDuffXfermode(mode));
    }

    public EYQ(int i, PorterDuff.Mode mode) {
        super(i);
        setXfermode(new PorterDuffXfermode(mode));
    }

    @Override // android.graphics.Paint
    public void setAlpha(int i) {
        if (Build.VERSION.SDK_INT < 29) {
            setColor((Kbd.EYQ(i, 0, 255) << 24) | (getColor() & ViewCompat.MEASURED_SIZE_MASK));
        } else {
            super.setAlpha(Kbd.EYQ(i, 0, 255));
        }
    }
}
