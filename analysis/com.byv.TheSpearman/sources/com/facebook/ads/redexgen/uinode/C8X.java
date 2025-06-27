package com.facebook.ads.redexgen.uinode;

import com.facebook.ads.AudienceNetworkAds;

/* renamed from: com.facebook.ads.redexgen.X.8X, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public class C8X implements AudienceNetworkAds.InitResult {
    public final String A00;
    public final boolean A01;

    public C8X(boolean z, String str) {
        this.A01 = z;
        this.A00 = str;
    }

    @Override // com.facebook.ads.AudienceNetworkAds.InitResult
    public final String getMessage() {
        return this.A00;
    }

    @Override // com.facebook.ads.AudienceNetworkAds.InitResult
    public final boolean isSuccess() {
        return this.A01;
    }
}
