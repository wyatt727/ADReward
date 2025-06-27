package com.facebook.ads.redexgen.uinode;

import android.animation.ValueAnimator;

/* loaded from: assets/audience_network.dex */
public class PX implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ C1065Sx A00;

    public PX(C1065Sx c1065Sx) {
        this.A00 = c1065Sx;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        Integer num = (Integer) valueAnimator.getAnimatedValue();
        this.A00.A0Z.getLayoutParams().height = num.intValue();
        this.A00.A0Z.requestLayout();
    }
}
