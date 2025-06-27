package com.facebook.ads.redexgen.uinode;

import android.graphics.drawable.Drawable;

/* renamed from: com.facebook.ads.redexgen.X.aB, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1254aB implements InterfaceC04132f {
    public Drawable A00;
    public final /* synthetic */ AbstractC04122e A01;

    public C1254aB(AbstractC04122e abstractC04122e) {
        this.A01 = abstractC04122e;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC04132f
    public final Drawable A6J() {
        return this.A00;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC04132f
    public final AbstractC04122e A6K() {
        return this.A01;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC04132f
    public final boolean A7l() {
        return this.A01.getPreventCornerOverlap();
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC04132f
    public final boolean A8G() {
        return this.A01.getUseCompatPadding();
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC04132f
    public final void AFu(Drawable drawable) {
        this.A00 = drawable;
        this.A01.setBackgroundDrawable(drawable);
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC04132f
    public final void AG7(int i, int i2) {
        if (i > this.A01.A01) {
            super/*android.widget.FrameLayout*/.setMinimumWidth(i);
        }
        if (i2 > this.A01.A00) {
            super/*android.widget.FrameLayout*/.setMinimumHeight(i2);
        }
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC04132f
    public final void AGE(int i, int i2, int i3, int i4) {
        this.A01.A05.set(i, i2, i3, i4);
        AbstractC04122e abstractC04122e = this.A01;
        super/*android.widget.FrameLayout*/.setPadding(abstractC04122e.A04.left + i, this.A01.A04.top + i2, this.A01.A04.right + i3, this.A01.A04.bottom + i4);
    }
}
