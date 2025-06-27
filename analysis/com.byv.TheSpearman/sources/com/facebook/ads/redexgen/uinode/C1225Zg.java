package com.facebook.ads.redexgen.uinode;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Zg, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1225Zg implements AnonymousClass59 {
    public final /* synthetic */ AbstractC04734o A00;

    public C1225Zg(AbstractC04734o abstractC04734o) {
        this.A00 = abstractC04734o;
    }

    @Override // com.facebook.ads.redexgen.uinode.AnonymousClass59
    public final View A6M(int i) {
        return this.A00.A0t(i);
    }

    @Override // com.facebook.ads.redexgen.uinode.AnonymousClass59
    public final int A6O(View view) {
        return this.A00.A0n(view) + ((C04744p) view.getLayoutParams()).rightMargin;
    }

    @Override // com.facebook.ads.redexgen.uinode.AnonymousClass59
    public final int A6P(View view) {
        return this.A00.A0k(view) - ((C04744p) view.getLayoutParams()).leftMargin;
    }

    @Override // com.facebook.ads.redexgen.uinode.AnonymousClass59
    public final int A7a() {
        return this.A00.A0h() - this.A00.A0f();
    }

    @Override // com.facebook.ads.redexgen.uinode.AnonymousClass59
    public final int A7b() {
        return this.A00.A0e();
    }
}
