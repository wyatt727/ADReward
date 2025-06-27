package com.facebook.ads.redexgen.uinode;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: com.facebook.ads.redexgen.X.Of, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0943Of extends AnimatorListenerAdapter {
    public final /* synthetic */ TT A00;
    public final /* synthetic */ boolean A01;

    public C0943Of(TT tt, boolean z) {
        this.A00 = tt;
        this.A01 = z;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        this.A00.A0M.setTranslationY(0.0f);
        this.A00.A0U();
        if (!this.A01 && this.A00.A0J != null) {
            this.A00.A0J.destroy();
        }
        if (this.A00.A0g == null) {
            return;
        }
        this.A00.A0g.setVisibility(this.A01 ? 8 : 0);
    }
}
