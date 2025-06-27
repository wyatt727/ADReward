package com.facebook.ads.redexgen.uinode;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Pq, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class ViewOnClickListenerC0980Pq implements View.OnClickListener {
    public final /* synthetic */ C0981Pr A00;

    public ViewOnClickListenerC0980Pq(C0981Pr c0981Pr) {
        this.A00 = c0981Pr;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        if (KL.A02(this)) {
            return;
        }
        try {
            this.A00.A05.performClick();
        } catch (Throwable th) {
            KL.A00(th, this);
        }
    }
}
