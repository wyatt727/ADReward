package com.facebook.ads.redexgen.uinode;

import com.facebook.ads.internal.exoplayer2.thirdparty.Format;

/* loaded from: assets/audience_network.dex */
public class IX implements Runnable {
    public final /* synthetic */ Format A00;
    public final /* synthetic */ C0791Ic A01;

    public IX(C0791Ic c0791Ic, Format format) {
        this.A01 = c0791Ic;
        this.A00 = format;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        if (KL.A02(this)) {
            return;
        }
        try {
            this.A01.A01.ADa(this.A00);
        } catch (Throwable th) {
            KL.A00(th, this);
        }
    }
}
