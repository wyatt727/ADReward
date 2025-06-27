package com.facebook.ads.redexgen.uinode;

/* loaded from: assets/audience_network.dex */
public class BE extends Thread {
    public final /* synthetic */ AbstractC1183Xp A00;

    public BE(AbstractC1183Xp abstractC1183Xp) {
        this.A00 = abstractC1183Xp;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() throws Throwable {
        if (KL.A02(this)) {
            return;
        }
        try {
            this.A00.A0M();
        } catch (Throwable th) {
            KL.A00(th, this);
        }
    }
}
