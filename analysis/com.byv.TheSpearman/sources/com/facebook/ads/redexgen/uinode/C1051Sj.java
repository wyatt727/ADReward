package com.facebook.ads.redexgen.uinode;

import android.view.animation.AccelerateInterpolator;
import android.view.animation.AlphaAnimation;

/* renamed from: com.facebook.ads.redexgen.X.Sj, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1051Sj extends KT {
    public final /* synthetic */ InterfaceC0969Pf A00;
    public final /* synthetic */ C0970Pg A01;

    public C1051Sj(C0970Pg c0970Pg, InterfaceC0969Pf interfaceC0969Pf) {
        this.A01 = c0970Pg;
        this.A00 = interfaceC0969Pf;
    }

    @Override // com.facebook.ads.redexgen.uinode.KT
    public final void A06() {
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        alphaAnimation.setDuration(300L);
        alphaAnimation.setInterpolator(new AccelerateInterpolator());
        alphaAnimation.setAnimationListener(new C1052Sk(this));
        this.A01.startAnimation(alphaAnimation);
    }
}
