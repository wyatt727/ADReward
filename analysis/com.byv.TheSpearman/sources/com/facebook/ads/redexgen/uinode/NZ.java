package com.facebook.ads.redexgen.uinode;

/* loaded from: assets/audience_network.dex */
public class NZ implements Runnable {
    public final /* synthetic */ C0912Na A00;
    public final /* synthetic */ InterfaceC0913Nb A01;

    public NZ(C0912Na c0912Na, InterfaceC0913Nb interfaceC0913Nb) {
        this.A00 = c0912Na;
        this.A01 = interfaceC0913Nb;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        if (KL.A02(this)) {
            return;
        }
        try {
            this.A01.AAn();
        } catch (Throwable th) {
            KL.A00(th, this);
        }
    }
}
