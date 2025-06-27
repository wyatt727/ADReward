package com.facebook.ads.redexgen.uinode;

/* renamed from: com.facebook.ads.redexgen.X.Ev, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class RunnableC0710Ev implements Runnable {
    public final /* synthetic */ F1 A00;
    public final /* synthetic */ F2 A01;
    public final /* synthetic */ F3 A02;
    public final /* synthetic */ F4 A03;

    public RunnableC0710Ev(F1 f1, F4 f4, F2 f2, F3 f3) {
        this.A00 = f1;
        this.A03 = f4;
        this.A01 = f2;
        this.A02 = f3;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        if (KL.A02(this)) {
            return;
        }
        try {
            this.A03.ABy(this.A00.A00, this.A00.A01, this.A01, this.A02);
        } catch (Throwable th) {
            KL.A00(th, this);
        }
    }
}
