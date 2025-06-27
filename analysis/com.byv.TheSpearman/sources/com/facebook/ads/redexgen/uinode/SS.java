package com.facebook.ads.redexgen.uinode;

import android.text.TextUtils;

/* loaded from: assets/audience_network.dex */
public class SS extends RD {
    public final /* synthetic */ C9P A00;

    public SS(C9P c9p) {
        this.A00 = c9p;
    }

    @Override // com.facebook.ads.redexgen.uinode.RD
    public final void A03() {
        if (!this.A00.A0E.A07()) {
            C9P c9p = this.A00;
            c9p.setImpressionRecordingFlag(c9p.A0E);
            if (!TextUtils.isEmpty(this.A00.A0A)) {
                ((UL) ((UL) this.A00)).A0C.A9g(this.A00.A0A, new C0920Ni().A03(this.A00.A09).A02(this.A00.A0E).A04(((UL) ((UL) this.A00)).A0A.A0O()).A05());
                C1U.A07(((UL) ((UL) this.A00)).A0A.A0y(), this.A00.A0D);
                this.A00.A0D.A0E().A2k();
                C2O.A00(this.A00.A03.A0N());
            }
        }
    }
}
