package com.facebook.ads.redexgen.uinode;

import android.view.View;

/* loaded from: assets/audience_network.dex */
public class OH implements View.OnClickListener {
    public final /* synthetic */ ViewOnClickListenerC1079Tl A00;
    public final /* synthetic */ String A01;

    public OH(ViewOnClickListenerC1079Tl viewOnClickListenerC1079Tl, String str) {
        this.A00 = viewOnClickListenerC1079Tl;
        this.A01 = str;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        if (KL.A02(this)) {
            return;
        }
        try {
            this.A00.A09(this.A01);
        } catch (Throwable th) {
            KL.A00(th, this);
        }
    }
}
