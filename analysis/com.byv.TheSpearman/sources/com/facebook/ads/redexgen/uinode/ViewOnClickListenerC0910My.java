package com.facebook.ads.redexgen.uinode;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.My, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class ViewOnClickListenerC0910My implements View.OnClickListener {
    public final /* synthetic */ C0904Ms A00;
    public final /* synthetic */ U5 A01;

    public ViewOnClickListenerC0910My(U5 u5, C0904Ms c0904Ms) {
        this.A01 = u5;
        this.A00 = c0904Ms;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        if (KL.A02(this)) {
            return;
        }
        try {
            this.A00.A01();
            this.A01.A0B.ACI(C2U.A03);
        } catch (Throwable th) {
            KL.A00(th, this);
        }
    }
}
