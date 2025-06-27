package com.facebook.ads.redexgen.uinode;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Ml, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class ViewOnClickListenerC0897Ml implements View.OnClickListener {
    public final /* synthetic */ C0899Mn A00;

    public ViewOnClickListenerC0897Ml(C0899Mn c0899Mn) {
        this.A00 = c0899Mn;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        if (KL.A02(this)) {
            return;
        }
        try {
            this.A00.A04.A9N();
        } catch (Throwable th) {
            KL.A00(th, this);
        }
    }
}
