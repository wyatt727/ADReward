package com.facebook.ads.redexgen.uinode;

/* loaded from: assets/audience_network.dex */
public class IV implements Runnable {
    public final /* synthetic */ BC A00;
    public final /* synthetic */ C0791Ic A01;

    public IV(C0791Ic c0791Ic, BC bc) {
        this.A01 = c0791Ic;
        this.A00 = bc;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        if (KL.A02(this)) {
            return;
        }
        try {
            this.A01.A01.ADW(this.A00);
        } catch (Throwable th) {
            KL.A00(th, this);
        }
    }
}
