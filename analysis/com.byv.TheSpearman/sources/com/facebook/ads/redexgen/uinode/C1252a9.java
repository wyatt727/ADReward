package com.facebook.ads.redexgen.uinode;

import android.content.Context;
import android.content.res.ColorStateList;
import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.a9, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1252a9 implements InterfaceC04142g {
    private C04152h A00(InterfaceC04132f interfaceC04132f) {
        return (C04152h) interfaceC04132f.A6J();
    }

    public final void A01(InterfaceC04132f interfaceC04132f) {
        if (!interfaceC04132f.A8G()) {
            interfaceC04132f.AGE(0, 0, 0, 0);
            return;
        }
        float fA7M = A7M(interfaceC04132f);
        float fA7m = A7m(interfaceC04132f);
        float elevation = C04172j.A00(fA7M, fA7m, interfaceC04132f.A7l());
        int vPadding = (int) Math.ceil(elevation);
        float elevation2 = C04172j.A01(fA7M, fA7m, interfaceC04132f.A7l());
        int iCeil = (int) Math.ceil(elevation2);
        interfaceC04132f.AGE(vPadding, iCeil, vPadding, iCeil);
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC04142g
    public final ColorStateList A66(InterfaceC04132f interfaceC04132f) {
        return A00(interfaceC04132f).A05();
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC04142g
    public final float A6t(InterfaceC04132f interfaceC04132f) {
        return interfaceC04132f.A6K().getElevation();
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC04142g
    public final float A7M(InterfaceC04132f interfaceC04132f) {
        return A00(interfaceC04132f).A03();
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC04142g
    public final float A7R(InterfaceC04132f interfaceC04132f) {
        return A7m(interfaceC04132f) * 2.0f;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC04142g
    public final float A7S(InterfaceC04132f interfaceC04132f) {
        return A7m(interfaceC04132f) * 2.0f;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC04142g
    public final float A7m(InterfaceC04132f interfaceC04132f) {
        return A00(interfaceC04132f).A04();
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC04142g
    public final void A8r() {
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC04142g
    public final void A8s(InterfaceC04132f interfaceC04132f, Context context, ColorStateList colorStateList, float f, float f2, float f3) {
        C04152h background = new C04152h(colorStateList, f);
        interfaceC04132f.AFu(background);
        View view = interfaceC04132f.A6K();
        view.setClipToOutline(true);
        view.setElevation(f2);
        AG6(interfaceC04132f, f3);
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC04142g
    public final void AB7(InterfaceC04132f interfaceC04132f) {
        AG6(interfaceC04132f, A7M(interfaceC04132f));
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC04142g
    public final void ACk(InterfaceC04132f interfaceC04132f) {
        AG6(interfaceC04132f, A7M(interfaceC04132f));
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC04142g
    public final void AFt(InterfaceC04132f interfaceC04132f, ColorStateList colorStateList) {
        A00(interfaceC04132f).A08(colorStateList);
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC04142g
    public final void AFz(InterfaceC04132f interfaceC04132f, float f) {
        interfaceC04132f.A6K().setElevation(f);
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC04142g
    public final void AG6(InterfaceC04132f interfaceC04132f, float f) {
        A00(interfaceC04132f).A07(f, interfaceC04132f.A8G(), interfaceC04132f.A7l());
        A01(interfaceC04132f);
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC04142g
    public final void AGC(InterfaceC04132f interfaceC04132f, float f) {
        A00(interfaceC04132f).A06(f);
    }
}
