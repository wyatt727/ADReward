package com.facebook.ads.redexgen.uinode;

import android.content.Context;
import com.facebook.ads.AdSettings;

/* renamed from: com.facebook.ads.redexgen.X.aZ, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1278aZ implements C8Z {
    @Override // com.facebook.ads.redexgen.uinode.C8Z
    public final String A6E() {
        return null;
    }

    @Override // com.facebook.ads.redexgen.uinode.C8Z
    public final String A6S() {
        return null;
    }

    @Override // com.facebook.ads.redexgen.uinode.C8Z
    public final C05457t A6k(C05357f c05357f) {
        return null;
    }

    @Override // com.facebook.ads.redexgen.uinode.C8Z
    public final String A7Q() {
        return null;
    }

    @Override // com.facebook.ads.redexgen.uinode.C8Z
    public final String A87() {
        if (AdSettings.getTestAdType() != AdSettings.TestAdType.DEFAULT) {
            return AdSettings.getTestAdType().getAdTypeString();
        }
        return null;
    }

    @Override // com.facebook.ads.redexgen.uinode.C8Z
    public final boolean A99() {
        return AdSettings.isMixedAudience();
    }

    @Override // com.facebook.ads.redexgen.uinode.C8Z
    public final boolean A9E() {
        return false;
    }

    @Override // com.facebook.ads.redexgen.uinode.C8Z
    public final Boolean A9J() {
        return null;
    }

    @Override // com.facebook.ads.redexgen.uinode.C8Z
    public final boolean isTestMode(Context context) {
        return AdSettings.isTestMode(context);
    }
}
