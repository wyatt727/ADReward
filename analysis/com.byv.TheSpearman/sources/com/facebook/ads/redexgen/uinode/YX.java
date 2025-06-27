package com.facebook.ads.redexgen.uinode;

import android.content.Context;
import android.view.View;

/* loaded from: assets/audience_network.dex */
public class YX implements KJ {
    @Override // com.facebook.ads.redexgen.uinode.KJ
    public final void AFC(Throwable th, Object obj) {
        if (obj instanceof InterfaceC05317b) {
            C1207Yn adContext = ((InterfaceC05317b) obj).A5t();
            if (adContext != null) {
                adContext.A0O(th);
                return;
            }
            return;
        }
        if (!(obj instanceof View)) {
            return;
        }
        Context context = ((View) obj).getContext();
        if (!(context instanceof C1207Yn)) {
            return;
        }
        ((C1207Yn) context).A0O(th);
    }
}
