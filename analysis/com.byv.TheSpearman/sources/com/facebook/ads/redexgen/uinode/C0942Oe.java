package com.facebook.ads.redexgen.uinode;

import android.animation.ValueAnimator;

/* renamed from: com.facebook.ads.redexgen.X.Oe, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0942Oe implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ TT A00;

    public C0942Oe(TT tt) {
        this.A00 = tt;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        Integer num = (Integer) valueAnimator.getAnimatedValue();
        this.A00.A0A.getLayoutParams().height = num.intValue();
        this.A00.A0A.requestLayout();
    }
}
