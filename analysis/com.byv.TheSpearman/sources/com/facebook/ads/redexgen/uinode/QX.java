package com.facebook.ads.redexgen.uinode;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* loaded from: assets/audience_network.dex */
public class QX extends AnimatorListenerAdapter {
    public final /* synthetic */ C7T A00;

    public QX(C7T c7t) {
        this.A00 = c7t;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.A00.A00.A04.postDelayed(new LK(this), 2000L);
    }
}
