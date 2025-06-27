package com.facebook.ads.redexgen.uinode;

import android.os.Build;
import android.view.accessibility.AccessibilityEvent;

/* renamed from: com.facebook.ads.redexgen.X.3m, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC04463m {
    public static final C04453l A00;

    static {
        if (Build.VERSION.SDK_INT >= 19) {
            A00 = new C0702En();
        } else if (Build.VERSION.SDK_INT >= 16) {
            A00 = new C1241Zw();
        } else {
            A00 = new C04453l();
        }
    }

    public static int A00(AccessibilityEvent accessibilityEvent) {
        return A00.A00(accessibilityEvent);
    }

    public static void A01(AccessibilityEvent accessibilityEvent, int i) {
        A00.A01(accessibilityEvent, i);
    }
}
