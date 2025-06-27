package com.facebook.ads.redexgen.uinode;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.facebook.ads.redexgen.X.Ys, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1212Ys extends KT {
    public final /* synthetic */ C6U A00;
    public final /* synthetic */ C6V A01;
    public final /* synthetic */ C05126c A02;
    public final /* synthetic */ ArrayList A03;
    public final /* synthetic */ ArrayList A04;

    public C1212Ys(C05126c c05126c, ArrayList arrayList, C6V c6v, C6U c6u, ArrayList arrayList2) {
        this.A02 = c05126c;
        this.A03 = arrayList;
        this.A01 = c6v;
        this.A00 = c6u;
        this.A04 = arrayList2;
    }

    @Override // com.facebook.ads.redexgen.uinode.KT
    public final void A06() {
        AtomicBoolean atomicBooleanA0D = C05126c.A0D(this.A03);
        if (this.A02.A04 instanceof C1207Yn) {
            C1207Yn c1207Yn = (C1207Yn) this.A02.A04;
            if (this.A01.A00 == -1) {
                if (atomicBooleanA0D.get()) {
                    c1207Yn.A0E().A48(C0865Lf.A01(this.A02.A00));
                } else {
                    c1207Yn.A0E().A46(C0865Lf.A01(this.A02.A00));
                }
            } else if (atomicBooleanA0D.get()) {
                c1207Yn.A0E().A49(C0865Lf.A01(this.A02.A00), this.A01.A00);
            } else {
                c1207Yn.A0E().A47(C0865Lf.A01(this.A02.A00), this.A01.A00);
            }
        }
        this.A02.A02.post(new C1213Yt(this, atomicBooleanA0D));
        C05126c.A0D(this.A04);
    }
}
