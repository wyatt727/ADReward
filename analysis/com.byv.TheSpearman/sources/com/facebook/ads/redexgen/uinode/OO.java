package com.facebook.ads.redexgen.uinode;

import android.view.View;

/* loaded from: assets/audience_network.dex */
public class OO {
    public boolean A00;
    public View A03;
    public V2 A04;
    public MB A05;
    public KP A06;
    public final View A07;
    public final AbstractC1310b5 A08;
    public final C1207Yn A09;
    public final J2 A0A;
    public final C0866Lg A0B;
    public final MC A0C;
    public final RE A0D;
    public int A02 = 0;
    public int A01 = 1;

    public OO(C1207Yn c1207Yn, J2 j2, MC mc, AbstractC1310b5 abstractC1310b5, View view, RE re, C0866Lg c0866Lg) {
        this.A09 = c1207Yn;
        this.A0A = j2;
        this.A0C = mc;
        this.A08 = abstractC1310b5;
        this.A07 = view;
        this.A0D = re;
        this.A0B = c0866Lg;
    }

    public final OO A0D(int i) {
        this.A01 = i;
        return this;
    }

    public final OO A0E(int i) {
        this.A02 = i;
        return this;
    }

    public final OO A0F(View view) {
        this.A03 = view;
        return this;
    }

    public final OO A0G(V2 v2) {
        this.A04 = v2;
        return this;
    }

    public final OO A0H(MB mb) {
        this.A05 = mb;
        return this;
    }

    public final OO A0I(KP kp) {
        this.A06 = kp;
        return this;
    }

    public final OO A0J(boolean z) {
        this.A00 = z;
        return this;
    }

    public final OP A0K() {
        return new OP(this);
    }
}
