package com.facebook.ads.redexgen.uinode;

/* loaded from: assets/audience_network.dex */
public class PZ implements Runnable {
    public final /* synthetic */ C1065Sx A00;

    public PZ(C1065Sx c1065Sx) {
        this.A00 = c1065Sx;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        if (KL.A02(this)) {
            return;
        }
        try {
            if (!this.A00.A0K) {
                return;
            }
            this.A00.A0Q();
        } catch (Throwable th) {
            KL.A00(th, this);
        }
    }
}
