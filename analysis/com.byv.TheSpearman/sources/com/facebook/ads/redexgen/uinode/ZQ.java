package com.facebook.ads.redexgen.uinode;

import android.os.Build;
import android.view.View;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class ZQ extends AbstractC03720q {
    public static byte[] A03;
    public View A00;
    public final C5P A01;
    public final EQ A02;

    static {
        A03();
    }

    public static String A02(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 53);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A03() {
        A03 = new byte[]{-23, 7, 20, 20, 21, 26, -58, 22, 24, 11, 25, 11, 20, 26, -58, 20, 27, 18, 18, -58, 7, 10, -4, 15, 11, 29};
    }

    public ZQ(C5P c5p) {
        this.A02 = c5p.A09();
        this.A01 = c5p;
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC03720q
    public final void A0C() {
        this.A02.A0E().A3o();
        KK.A00(new ZS(this));
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC03720q
    public final void A0D() {
        this.A02.A0E().A3r();
        KK.A00(new ZR(this));
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC03720q
    public final void A0E(View view) {
        if (view != null) {
            this.A02.A0E().A3q();
            this.A00 = view;
            this.A01.A07().removeAllViews();
            this.A01.A07().addView(this.A00);
            if (this.A00 instanceof C1086Ts) {
                AbstractC0819Ji.A01(this.A01.A05(), this.A00, this.A01.A0A());
            }
            FR controller = this.A01.A08();
            if (controller != null) {
                controller.A0I();
            }
            KK.A00(new ZT(this));
            C5P c5p = this.A01;
            c5p.A0B(c5p.A07(), this.A00);
            if (Build.VERSION.SDK_INT >= 18 && C0796Ih.A11(this.A01.A07().getContext())) {
                final C0918Ng c0918Ng = new C0918Ng();
                this.A01.A0D(c0918Ng);
                c0918Ng.A0C(this.A01.getPlacementId());
                c0918Ng.A0B(this.A01.A07().getContext().getPackageName());
                if (this.A01.A08() != null && this.A01.A08().A0H() != null) {
                    c0918Ng.A09(this.A01.A08().A0H().A0C());
                }
                View view2 = this.A00;
                if (view2 instanceof C1086Ts) {
                    c0918Ng.A0A(((C1086Ts) view2).getViewabilityChecker());
                }
                this.A00.setOnLongClickListener(new View.OnLongClickListener() { // from class: com.facebook.ads.redexgen.X.5Z
                    @Override // android.view.View.OnLongClickListener
                    public final boolean onLongClick(View view3) {
                        if (this.A00.A00 != null) {
                            c0918Ng.setBounds(0, 0, this.A00.A00.getWidth(), this.A00.A00.getHeight());
                            c0918Ng.A0D(!r1.A0E());
                        }
                        return true;
                    }
                });
                this.A00.getOverlay().add(c0918Ng);
                return;
            }
            return;
        }
        throw new IllegalStateException(A02(0, 26, 113));
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC03720q
    public final void A0F(InterfaceC03710p interfaceC03710p) {
        this.A02.A0E().A3p(this.A01.A08() != null);
        if (this.A01.A08() != null) {
            this.A01.A08().A0J();
        }
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC03720q
    public final void A0G(C0813Jb c0813Jb) {
        this.A02.A0E().A2m(C0865Lf.A01(this.A01.A04()), c0813Jb.A03().getErrorCode(), c0813Jb.A04());
        KK.A00(new ZU(this, c0813Jb));
    }
}
