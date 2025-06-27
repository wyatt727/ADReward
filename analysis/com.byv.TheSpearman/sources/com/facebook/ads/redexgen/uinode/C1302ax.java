package com.facebook.ads.redexgen.uinode;

import com.facebook.ads.AdError;

/* renamed from: com.facebook.ads.redexgen.X.ax, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1302ax implements AnonymousClass61 {
    public static String[] A05 = {"SGxBKOT0PnlxeQ2jGccieZy3bFeI", "1PQaT", "uVEahNbfwTxCxKVGO7p", "rVPhbhRBlKfAg8fviAhE", "2ov", "KrP87Bn8e271VzBAE5Wi", "4No2VIB7eIWgh7ub8hExBeYUcY", "mEjh"};
    public final /* synthetic */ AbstractC1310b5 A00;
    public final /* synthetic */ InterfaceC03891h A01;
    public final /* synthetic */ C03901i A02;
    public final /* synthetic */ C1207Yn A03;
    public final /* synthetic */ boolean A04;

    public C1302ax(C03901i c03901i, C1207Yn c1207Yn, boolean z, AbstractC1310b5 abstractC1310b5, InterfaceC03891h interfaceC03891h) {
        this.A02 = c03901i;
        this.A03 = c1207Yn;
        this.A04 = z;
        this.A00 = abstractC1310b5;
        this.A01 = interfaceC03891h;
    }

    @Override // com.facebook.ads.redexgen.uinode.AnonymousClass61
    public final void AAl() {
        if (C0796Ih.A1O(this.A03) && this.A04) {
            this.A02.A02.add(PC.A01(this.A03, this.A00, 1, new C1303ay(this)));
            return;
        }
        InterfaceC03891h interfaceC03891h = this.A01;
        if (A05[2].length() != 19) {
            throw new RuntimeException();
        }
        String[] strArr = A05;
        strArr[5] = "X6BBoGIR5wPjpoFUlFYz";
        strArr[3] = "SlUPa0nBeexeGnx3tyWk";
        interfaceC03891h.AAf();
    }

    @Override // com.facebook.ads.redexgen.uinode.AnonymousClass61
    public final void AAm() {
        this.A01.AAe(AdError.CACHE_ERROR);
    }
}
