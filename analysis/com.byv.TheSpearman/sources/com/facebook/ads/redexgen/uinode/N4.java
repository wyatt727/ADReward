package com.facebook.ads.redexgen.uinode;

import android.view.View;

/* loaded from: assets/audience_network.dex */
public class N4 implements View.OnClickListener {
    public final /* synthetic */ N6 A00;

    public N4(N6 n6) {
        this.A00 = n6;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        if (KL.A02(this)) {
            return;
        }
        try {
            this.A00.A02.A8P();
        } catch (Throwable th) {
            KL.A00(th, this);
        }
    }
}
