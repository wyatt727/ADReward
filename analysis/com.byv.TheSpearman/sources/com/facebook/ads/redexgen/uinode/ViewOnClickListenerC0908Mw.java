package com.facebook.ads.redexgen.uinode;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Mw, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class ViewOnClickListenerC0908Mw implements View.OnClickListener {
    public static String[] A01 = {"RpRdDeRKSCMdi", "IuXxM6erDWGrR2ilBdYngNq10nVc0mkU", "Kill7HMysw6SnDOrBs", "MIbB774K8liBHgb3cyiNiqUG4b3Um782", "7YEQDQbB6rycAAMyAlOvxfyaq0dnUo7P", "y1fFSWKNdNdnYTXNNG", "pYfR2zdeniJKCCLkUpT", "pJHaP"};
    public final /* synthetic */ U6 A00;

    public ViewOnClickListenerC0908Mw(U6 u6) {
        this.A00 = u6;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        if (KL.A02(this)) {
            return;
        }
        try {
            this.A00.A0B.A9O();
        } catch (Throwable th) {
            KL.A00(th, this);
            if (A01[5].length() == 17) {
                throw new RuntimeException();
            }
            A01[5] = "tK5zLur";
        }
    }
}
