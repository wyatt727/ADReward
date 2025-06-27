package com.facebook.ads.redexgen.uinode;

import android.view.View;

/* loaded from: assets/audience_network.dex */
public class NF implements View.OnClickListener {
    public final /* synthetic */ NJ A00;

    public NF(NJ nj) {
        this.A00 = nj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        if (KL.A02(this)) {
            return;
        }
        try {
            if (!this.A00.A0A.canGoBack()) {
                return;
            }
            this.A00.A0A.goBack();
        } catch (Throwable th) {
            KL.A00(th, this);
        }
    }
}
