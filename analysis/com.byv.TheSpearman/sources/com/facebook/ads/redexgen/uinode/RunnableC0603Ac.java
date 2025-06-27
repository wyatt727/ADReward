package com.facebook.ads.redexgen.uinode;

/* renamed from: com.facebook.ads.redexgen.X.Ac, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class RunnableC0603Ac implements Runnable {
    public final /* synthetic */ C0609Ai A00;
    public final /* synthetic */ BC A01;

    public RunnableC0603Ac(C0609Ai c0609Ai, BC bc) {
        this.A00 = c0609Ai;
        this.A01 = bc;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        if (KL.A02(this)) {
            return;
        }
        try {
            this.A00.A01.AAq(this.A01);
        } catch (Throwable th) {
            KL.A00(th, this);
        }
    }
}
