package com.facebook.ads.redexgen.uinode;

import android.view.View;
import android.view.WindowInsets;

/* renamed from: com.facebook.ads.redexgen.X.1m, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C03941m extends C04092b {
    @Override // com.facebook.ads.redexgen.uinode.C3S
    public final C04443k A08(View view, C04443k c04443k) {
        WindowInsets result = (WindowInsets) C04443k.A01(c04443k);
        WindowInsets unwrapped = view.dispatchApplyWindowInsets(result);
        if (unwrapped != result) {
            result = new WindowInsets(unwrapped);
        }
        return C04443k.A00(result);
    }

    @Override // com.facebook.ads.redexgen.uinode.C3S
    public final C04443k A09(View view, C04443k c04443k) {
        WindowInsets result = (WindowInsets) C04443k.A01(c04443k);
        WindowInsets unwrapped = view.onApplyWindowInsets(result);
        if (unwrapped != result) {
            result = new WindowInsets(unwrapped);
        }
        return C04443k.A00(result);
    }

    @Override // com.facebook.ads.redexgen.uinode.C3S
    public final void A0B(View view) {
        view.stopNestedScroll();
    }

    @Override // com.facebook.ads.redexgen.uinode.C3S
    public final void A0F(View view, final C3D c3d) {
        if (c3d == null) {
            view.setOnApplyWindowInsetsListener(null);
        } else {
            view.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: com.facebook.ads.redexgen.X.3R
                @Override // android.view.View.OnApplyWindowInsetsListener
                public final WindowInsets onApplyWindowInsets(View view2, WindowInsets windowInsets) {
                    C04443k compatInsets = c3d.AAk(view2, C04443k.A00(windowInsets));
                    return (WindowInsets) C04443k.A01(compatInsets);
                }
            });
        }
    }
}
