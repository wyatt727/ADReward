package com.facebook.ads.redexgen.uinode;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Pb, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class ViewOnClickListenerC0965Pb implements View.OnClickListener {
    public final /* synthetic */ C1065Sx A00;

    public ViewOnClickListenerC0965Pb(C1065Sx c1065Sx) {
        this.A00 = c1065Sx;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        if (KL.A02(this)) {
            return;
        }
        try {
            if (!this.A00.A0K) {
                this.A00.A0L = true;
                C1065Sx c1065Sx = this.A00;
                c1065Sx.A0h(((C0720Ff) c1065Sx.A0T).A0G().toString());
                if (((PQ) this.A00).A05.A0H() >= 0) {
                    this.A00.A08.postDelayed(this.A00.A0j, ((PQ) this.A00).A05.A0H());
                }
            }
            C1065Sx c1065Sx2 = this.A00;
            c1065Sx2.A0k(c1065Sx2.A0K ? false : true);
        } catch (Throwable th) {
            KL.A00(th, this);
        }
    }
}
