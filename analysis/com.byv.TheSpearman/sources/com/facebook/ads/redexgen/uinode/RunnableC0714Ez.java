package com.facebook.ads.redexgen.uinode;

/* renamed from: com.facebook.ads.redexgen.X.Ez, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class RunnableC0714Ez implements Runnable {
    public final /* synthetic */ F1 A00;
    public final /* synthetic */ F3 A01;
    public final /* synthetic */ F4 A02;

    public RunnableC0714Ez(F1 f1, F4 f4, F3 f3) {
        this.A00 = f1;
        this.A02 = f4;
        this.A01 = f3;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        if (KL.A02(this)) {
            return;
        }
        try {
            this.A02.ABM(this.A00.A00, this.A00.A01, this.A01);
        } catch (Throwable th) {
            KL.A00(th, this);
        }
    }
}
