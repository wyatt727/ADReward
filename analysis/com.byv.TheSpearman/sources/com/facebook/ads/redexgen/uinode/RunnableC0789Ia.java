package com.facebook.ads.redexgen.uinode;

import android.view.Surface;

/* renamed from: com.facebook.ads.redexgen.X.Ia, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class RunnableC0789Ia implements Runnable {
    public final /* synthetic */ Surface A00;
    public final /* synthetic */ C0791Ic A01;

    public RunnableC0789Ia(C0791Ic c0791Ic, Surface surface) {
        this.A01 = c0791Ic;
        this.A00 = surface;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        if (KL.A02(this)) {
            return;
        }
        try {
            this.A01.A01.ACt(this.A00);
        } catch (Throwable th) {
            KL.A00(th, this);
        }
    }
}
