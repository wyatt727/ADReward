package com.facebook.ads.redexgen.uinode;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Nl, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC0923Nl {
    public static void A00(View view, boolean z, View.OnClickListener onClickListener) {
        if (!z) {
            view.setOnClickListener(onClickListener);
        } else {
            if (!z) {
                return;
            }
            ViewOnClickListenerC0922Nk viewOnClickListenerC0922Nk = new ViewOnClickListenerC0922Nk(onClickListener);
            view.setOnClickListener(viewOnClickListenerC0922Nk);
            view.setOnTouchListener(new ViewOnTouchListenerC0921Nj(viewOnClickListenerC0922Nk));
        }
    }
}
