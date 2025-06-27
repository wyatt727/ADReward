package com.facebook.ads.redexgen.uinode;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Qe, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class ViewOnClickListenerC0994Qe implements View.OnClickListener {
    public final /* synthetic */ C7C A00;

    public ViewOnClickListenerC0994Qe(C7C c7c) {
        this.A00 = c7c;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        if (KL.A02(this)) {
        }
        try {
            if (this.A00.getVideoView() != null) {
                if (this.A00.A02 != null) {
                    this.A00.A02.A04(J9.A0p, null);
                }
                this.A00.A01.A0E().A35();
                switch (C0995Qf.A00[this.A00.getVideoView().getState().ordinal()]) {
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                        this.A00.getVideoView().A0b(QM.A04, 12);
                        break;
                    case 5:
                        this.A00.getVideoView().A0e(true, 8);
                        break;
                }
            }
        } catch (Throwable th) {
            KL.A00(th, this);
        }
    }
}
