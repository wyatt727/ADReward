package com.facebook.ads.redexgen.uinode;

import android.app.Activity;

/* renamed from: com.facebook.ads.redexgen.X.Kp, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0849Kp {
    public static final C0849Kp A04 = new C0849Kp(new C1106Um(), new C1105Ul());
    public final InterfaceC0848Ko A02;
    public final InterfaceC0864Le A03;
    public boolean A01 = true;
    public long A00 = -1;

    public C0849Kp(InterfaceC0864Le interfaceC0864Le, InterfaceC0848Ko interfaceC0848Ko) {
        this.A03 = interfaceC0864Le;
        this.A02 = interfaceC0848Ko;
    }

    public static C0849Kp A00() {
        return A04;
    }

    public final synchronized void A01() {
        this.A01 = false;
        this.A00 = this.A03.A50();
    }

    public final synchronized void A02() {
        this.A00 = -1L;
    }

    public final boolean A03() {
        Activity lastResumedActivity = this.A02.A7G();
        boolean z = true;
        if (lastResumedActivity != null) {
            return true;
        }
        synchronized (C0849Kp.class) {
            if (this.A01) {
                return true;
            }
            if (this.A00 >= 0 && this.A03.A50() - this.A00 >= 1000) {
                z = false;
            }
            return z;
        }
    }
}
