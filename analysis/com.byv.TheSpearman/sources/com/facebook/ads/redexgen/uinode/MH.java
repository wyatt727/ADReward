package com.facebook.ads.redexgen.uinode;

import android.view.animation.Animation;

/* loaded from: assets/audience_network.dex */
public class MH implements Animation.AnimationListener {
    public final /* synthetic */ ViewOnClickListenerC0635Bi A00;

    public MH(ViewOnClickListenerC0635Bi viewOnClickListenerC0635Bi) {
        this.A00 = viewOnClickListenerC0635Bi;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        ((UT) this.A00).A07.finish(16);
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
    }
}
