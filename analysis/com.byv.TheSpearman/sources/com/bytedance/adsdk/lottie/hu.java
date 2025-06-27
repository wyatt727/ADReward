package com.bytedance.adsdk.lottie;

import android.os.Build;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;

/* compiled from: PathInterpolatorCompat.java */
/* loaded from: classes2.dex */
public final class hu {
    public static Interpolator EYQ(float f, float f2, float f3, float f4) {
        return Build.VERSION.SDK_INT >= 21 ? new PathInterpolator(f, f2, f3, f4) : new KO(f, f2, f3, f4);
    }
}
