package com.facebook.ads.redexgen.uinode;

import com.facebook.ads.AdError;
import java.util.EnumSet;

/* renamed from: com.facebook.ads.redexgen.X.az, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1304az implements InterfaceC03891h {
    public final /* synthetic */ int A00;
    public final /* synthetic */ AbstractC1310b5 A01;
    public final /* synthetic */ C1308b3 A02;
    public final /* synthetic */ InterfaceC03891h A03;
    public final /* synthetic */ C03901i A04;
    public final /* synthetic */ C1207Yn A05;
    public final /* synthetic */ EnumSet A06;

    public C1304az(C03901i c03901i, C1207Yn c1207Yn, AbstractC1310b5 abstractC1310b5, C1308b3 c1308b3, int i, InterfaceC03891h interfaceC03891h, EnumSet enumSet) {
        this.A04 = c03901i;
        this.A05 = c1207Yn;
        this.A01 = abstractC1310b5;
        this.A02 = c1308b3;
        this.A00 = i;
        this.A03 = interfaceC03891h;
        this.A06 = enumSet;
    }

    private final void A00() {
        if (this.A00 + 1 >= this.A02.A0s()) {
            return;
        }
        C03901i c03901i = this.A04;
        C1207Yn c1207Yn = this.A05;
        EnumSet enumSet = this.A06;
        C1308b3 c1308b3 = this.A02;
        c03901i.A0A(c1207Yn, enumSet, c1308b3, c1308b3.A0v(this.A00 + 1), this.A00 + 1, this.A03);
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC03891h
    public final void AAe(AdError adError) {
        if (this.A00 == 0) {
            this.A03.AAe(adError);
        }
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC03891h
    public final void AAf() {
        this.A05.A00().AFq(this.A01.A12(), this.A02.A0w());
        if (this.A00 == 0) {
            this.A03.AAf();
        }
        A00();
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC03891h
    public final void AES() {
        if (this.A00 == 0) {
            this.A03.AES();
        }
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC03891h
    public final void AGm() {
        if (this.A00 == 0) {
            this.A03.AGm();
        }
    }
}
