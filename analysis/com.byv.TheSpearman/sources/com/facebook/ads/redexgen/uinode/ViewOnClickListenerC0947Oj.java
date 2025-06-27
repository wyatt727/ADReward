package com.facebook.ads.redexgen.uinode;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Oj, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class ViewOnClickListenerC0947Oj implements View.OnClickListener {
    public final /* synthetic */ TT A00;

    public ViewOnClickListenerC0947Oj(TT tt) {
        this.A00 = tt;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        if (KL.A02(this)) {
            return;
        }
        try {
            if (!this.A00.A0O) {
                this.A00.A0P = true;
                TT tt = this.A00;
                tt.A0d(((C0720Ff) tt.A0c).A0G().toString());
                if (this.A00.A0G.A0H() >= 0) {
                    this.A00.A09.postDelayed(this.A00.A0i, this.A00.A0G.A0H());
                }
            }
            TT tt2 = this.A00;
            tt2.A0g(tt2.A0O ? false : true);
        } catch (Throwable th) {
            KL.A00(th, this);
        }
    }
}
