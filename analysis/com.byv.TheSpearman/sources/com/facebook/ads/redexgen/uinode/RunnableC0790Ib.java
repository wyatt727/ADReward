package com.facebook.ads.redexgen.uinode;

/* renamed from: com.facebook.ads.redexgen.X.Ib, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class RunnableC0790Ib implements Runnable {
    public final /* synthetic */ BC A00;
    public final /* synthetic */ C0791Ic A01;

    public RunnableC0790Ib(C0791Ic c0791Ic, BC bc) {
        this.A01 = c0791Ic;
        this.A00 = bc;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        if (KL.A02(this)) {
            return;
        }
        try {
            this.A00.A00();
            this.A01.A01.ADV(this.A00);
        } catch (Throwable th) {
            KL.A00(th, this);
        }
    }
}
