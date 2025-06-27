package com.facebook.ads.redexgen.uinode;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.RectF;

/* renamed from: com.facebook.ads.redexgen.X.a7, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1250a7 implements InterfaceC04142g {
    public final RectF A00 = new RectF();

    private C04172j A00(Context context, ColorStateList colorStateList, float f, float f2, float f3) {
        return new C04172j(context.getResources(), colorStateList, f, f2, f3);
    }

    private C04172j A01(InterfaceC04132f interfaceC04132f) {
        return (C04172j) interfaceC04132f.A6J();
    }

    public final void A02(InterfaceC04132f interfaceC04132f) {
        Rect rect = new Rect();
        A01(interfaceC04132f).A0K(rect);
        interfaceC04132f.AG7((int) Math.ceil(A7S(interfaceC04132f)), (int) Math.ceil(A7R(interfaceC04132f)));
        interfaceC04132f.AGE(rect.left, rect.top, rect.right, rect.bottom);
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC04142g
    public final ColorStateList A66(InterfaceC04132f interfaceC04132f) {
        return A01(interfaceC04132f).A0F();
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC04142g
    public final float A6t(InterfaceC04132f interfaceC04132f) {
        return A01(interfaceC04132f).A0E();
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC04142g
    public final float A7M(InterfaceC04132f interfaceC04132f) {
        return A01(interfaceC04132f).A0B();
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC04142g
    public final float A7R(InterfaceC04132f interfaceC04132f) {
        return A01(interfaceC04132f).A0C();
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC04142g
    public final float A7S(InterfaceC04132f interfaceC04132f) {
        return A01(interfaceC04132f).A0D();
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC04142g
    public final float A7m(InterfaceC04132f interfaceC04132f) {
        return A01(interfaceC04132f).A0A();
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC04142g
    public void A8r() {
        C04172j.A0G = new C1251a8(this);
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC04142g
    public final void A8s(InterfaceC04132f interfaceC04132f, Context context, ColorStateList colorStateList, float f, float f2, float f3) {
        C04172j c04172jA00 = A00(context, colorStateList, f, f2, f3);
        c04172jA00.A0L(interfaceC04132f.A7l());
        interfaceC04132f.AFu(c04172jA00);
        A02(interfaceC04132f);
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC04142g
    public final void AB7(InterfaceC04132f interfaceC04132f) {
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC04142g
    public final void ACk(InterfaceC04132f interfaceC04132f) {
        A01(interfaceC04132f).A0L(interfaceC04132f.A7l());
        A02(interfaceC04132f);
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC04142g
    public final void AFt(InterfaceC04132f interfaceC04132f, ColorStateList colorStateList) {
        A01(interfaceC04132f).A0J(colorStateList);
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC04142g
    public final void AFz(InterfaceC04132f interfaceC04132f, float f) {
        A01(interfaceC04132f).A0I(f);
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC04142g
    public final void AG6(InterfaceC04132f interfaceC04132f, float f) {
        A01(interfaceC04132f).A0H(f);
        A02(interfaceC04132f);
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC04142g
    public final void AGC(InterfaceC04132f interfaceC04132f, float f) {
        A01(interfaceC04132f).A0G(f);
        A02(interfaceC04132f);
    }
}
