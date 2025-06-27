package com.facebook.ads.redexgen.uinode;

/* renamed from: com.facebook.ads.redexgen.X.Ah, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class RunnableC0608Ah implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C0609Ai A01;

    public RunnableC0608Ah(C0609Ai c0609Ai, int i) {
        this.A01 = c0609Ai;
        this.A00 = i;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        if (KL.A02(this)) {
            return;
        }
        try {
            this.A01.A01.AAs(this.A00);
        } catch (Throwable th) {
            KL.A00(th, this);
        }
    }
}
