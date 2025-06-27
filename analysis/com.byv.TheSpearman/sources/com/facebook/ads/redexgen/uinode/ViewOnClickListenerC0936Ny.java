package com.facebook.ads.redexgen.uinode;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Ny, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class ViewOnClickListenerC0936Ny implements View.OnClickListener {
    public final /* synthetic */ O1 A00;

    public ViewOnClickListenerC0936Ny(O1 o1) {
        this.A00 = o1;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        if (KL.A02(this)) {
            return;
        }
        try {
            this.A00.A04.ACB();
            if (this.A00.A00 != null) {
                AbstractC0874Lo.A0L(this.A00.A00);
            }
            for (View view2 : this.A00.A06) {
                AbstractC0874Lo.A0N(view2, 0);
            }
            AbstractC0874Lo.A0J(this.A00);
            if (this.A00.A05 == null) {
                return;
            }
            AbstractC0874Lo.A0N(this.A00.A05, 0);
            this.A00.A05.A0b(QM.A02, 14);
        } catch (Throwable th) {
            KL.A00(th, this);
        }
    }
}
