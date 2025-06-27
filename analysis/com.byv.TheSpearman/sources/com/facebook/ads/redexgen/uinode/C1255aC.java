package com.facebook.ads.redexgen.uinode;

import android.content.SharedPreferences;

/* renamed from: com.facebook.ads.redexgen.X.aC, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1255aC implements C2Y {
    public final SharedPreferences A00;

    public C1255aC(SharedPreferences sharedPreferences) {
        this.A00 = sharedPreferences;
    }

    @Override // com.facebook.ads.redexgen.uinode.C2Y
    public final C1256aD A5S() {
        return new C1256aD(this.A00.edit());
    }

    @Override // com.facebook.ads.redexgen.uinode.C2Y
    public final long A7K(String str, long j) {
        return this.A00.getLong(str, j);
    }

    @Override // com.facebook.ads.redexgen.uinode.C2Y
    public final String A85(String str, String str2) {
        return this.A00.getString(str, str2);
    }
}
