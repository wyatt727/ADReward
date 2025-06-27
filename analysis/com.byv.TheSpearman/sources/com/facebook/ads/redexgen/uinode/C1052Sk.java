package com.facebook.ads.redexgen.uinode;

import android.view.animation.Animation;

/* renamed from: com.facebook.ads.redexgen.X.Sk, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1052Sk extends AnimationAnimationListenerC0873Ln {
    public final /* synthetic */ C1051Sj A00;

    public C1052Sk(C1051Sj c1051Sj) {
        this.A00 = c1051Sj;
    }

    @Override // com.facebook.ads.redexgen.uinode.AnimationAnimationListenerC0873Ln, android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        AbstractC0874Lo.A0H(this.A00.A01);
        this.A00.A00.ABu();
    }
}
