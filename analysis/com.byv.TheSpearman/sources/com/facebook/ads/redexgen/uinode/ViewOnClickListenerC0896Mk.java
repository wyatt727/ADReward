package com.facebook.ads.redexgen.uinode;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Mk, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class ViewOnClickListenerC0896Mk implements View.OnClickListener {
    public final /* synthetic */ C0899Mn A00;

    public ViewOnClickListenerC0896Mk(C0899Mn c0899Mn) {
        this.A00 = c0899Mn;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        if (KL.A02(this)) {
            return;
        }
        try {
            if (this.A00.A05) {
                this.A00.A04.A4L();
            } else {
                this.A00.A04.A4M();
            }
        } catch (Throwable th) {
            KL.A00(th, this);
        }
    }
}
