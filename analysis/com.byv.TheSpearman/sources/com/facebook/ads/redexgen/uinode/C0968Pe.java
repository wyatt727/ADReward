package com.facebook.ads.redexgen.uinode;

/* renamed from: com.facebook.ads.redexgen.X.Pe, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0968Pe {
    public String A02;
    public String A03;
    public final C1N A04;
    public final C03821a A05;
    public final C1207Yn A06;
    public C1P A01 = C1P.A01(null);
    public int A00 = 1000;

    public C0968Pe(C1207Yn c1207Yn, C1N c1n, C03821a c03821a) {
        this.A06 = c1207Yn;
        this.A04 = c1n;
        this.A05 = c03821a;
    }

    public final C0968Pe A07(int i) {
        this.A00 = i;
        return this;
    }

    public final C0968Pe A08(C1P c1p) {
        this.A01 = c1p;
        return this;
    }

    public final C0968Pe A09(String str) {
        this.A02 = str;
        return this;
    }

    public final C0968Pe A0A(String str) {
        this.A03 = str;
        return this;
    }

    public final C0970Pg A0B() {
        return new C0970Pg(this, null);
    }
}
