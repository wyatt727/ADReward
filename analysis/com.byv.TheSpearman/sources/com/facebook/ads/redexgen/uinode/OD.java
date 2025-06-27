package com.facebook.ads.redexgen.uinode;

import android.app.Activity;
import android.os.Build;

/* loaded from: assets/audience_network.dex */
public class OD implements Runnable {
    public final /* synthetic */ C1U A00;
    public final /* synthetic */ OG A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;

    public OD(OG og, String str, C1U c1u, String str2) {
        this.A01 = og;
        this.A03 = str;
        this.A00 = c1u;
        this.A02 = str2;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        if (KL.A02(this)) {
            return;
        }
        try {
            if (!this.A01.A00) {
                return;
            }
            boolean z = false;
            this.A01.A00 = false;
            Activity activityA0D = this.A01.A03.A0D();
            boolean z2 = false;
            if (Build.VERSION.SDK_INT >= 24) {
                if (activityA0D != null && activityA0D.isInMultiWindowMode()) {
                    z = true;
                }
                z2 = z;
            }
            if (!z2 && C0849Kp.A00().A03()) {
                return;
            }
            this.A01.A05(this.A03, this.A00, this.A02);
        } catch (Throwable th) {
            KL.A00(th, this);
        }
    }
}
