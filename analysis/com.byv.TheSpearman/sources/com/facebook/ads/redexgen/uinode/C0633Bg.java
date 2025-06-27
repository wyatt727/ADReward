package com.facebook.ads.redexgen.uinode;

import com.google.firebase.remoteconfig.FirebaseRemoteConfig;

/* renamed from: com.facebook.ads.redexgen.X.Bg, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0633Bg extends C1233Zo {
    public static String[] A08 = {"bHvO3zM", "7z8VpEP", "iw2Y0c", "LME8njBPiXs011hhslbtp", "9K0lNzbR5X2b0vS5", "Pt0EnZUFnGQLsNks8pQcEgn0FivkNzUh", "t6anbflpJj2CGicCnIMdWTRCydsD", "D9TL9YTSSd0lWzGeUvgWfvwaUF0YdAOx"};
    public float A00;
    public int A01;
    public int A02;
    public C0634Bh A03;
    public int[] A04;
    public final C1207Yn A05;
    public final C0972Pi A06;
    public final C0973Pj A07;

    public C0633Bg(C1207Yn c1207Yn, C0973Pj c0973Pj, C0972Pi c0972Pi) {
        super(c1207Yn);
        this.A02 = 0;
        this.A00 = 50.0f;
        this.A05 = c1207Yn;
        this.A07 = c0973Pj;
        this.A06 = c0972Pi;
        this.A01 = -1;
        this.A03 = new C0634Bh(this, c1207Yn);
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x00f7  */
    @Override // com.facebook.ads.redexgen.uinode.AbstractC04734o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A1J(com.facebook.ads.redexgen.uinode.C04804w r17, com.facebook.ads.redexgen.uinode.AnonymousClass53 r18, int r19, int r20) {
        /*
            Method dump skipped, instructions count: 289
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.uinode.C0633Bg.A1J(com.facebook.ads.redexgen.X.4w, com.facebook.ads.redexgen.X.53, int, int):void");
    }

    @Override // com.facebook.ads.redexgen.uinode.C1233Zo, com.facebook.ads.redexgen.uinode.AbstractC04734o
    public final void A1p(int i) {
        A2B(i, this.A02);
    }

    @Override // com.facebook.ads.redexgen.uinode.C1233Zo, com.facebook.ads.redexgen.uinode.AbstractC04734o
    public final void A1x(C0690Eb c0690Eb, AnonymousClass53 anonymousClass53, int i) {
        this.A03.A0A(i);
        A1L(this.A03);
    }

    public final void A2G(double d) {
        if (d <= FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
            d = 1.0d;
        }
        this.A00 = (float) (50.0d / d);
        this.A03 = new C0634Bh(this, this.A05);
    }

    public final void A2H(int i) {
        this.A01 = i;
    }

    public final void A2I(int i) {
        this.A02 = i;
    }
}
