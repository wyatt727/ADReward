package com.facebook.ads.redexgen.uinode;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Tc, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1070Tc extends OL implements OE {
    public static byte[] A05;
    public static final int A06;
    public final AbstractC1310b5 A00;
    public final MC A01;
    public final OG A02;
    public final C0950Om A03;
    public final C0978Po A04;

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A05, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 22);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A05 = new byte[]{52, 48, 60, 58, 56};
    }

    static {
        A01();
        A06 = Resources.getSystem().getDisplayMetrics().widthPixels;
    }

    public C1070Tc(OP op, boolean z) {
        int id;
        int iA01;
        super(op, z);
        this.A01 = op.A09();
        AbstractC1310b5 abstractC1310b5A04 = op.A04();
        this.A00 = abstractC1310b5A04;
        C0950Om c0950Om = new C0950Om(op.A05(), op.A02());
        this.A03 = c0950Om;
        c0950Om.A01(getTitleDescContainer(), z);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(12);
        layoutParams.setMargins(OL.A07, OL.A07, OL.A07, OL.A07);
        getCtaButton().setLayoutParams(layoutParams);
        if (op.A0C()) {
            C0978Po c0978Po = new C0978Po(op.A05());
            this.A04 = c0978Po;
            c0978Po.setPageDetails(op.A04().A10());
            AbstractC0874Lo.A0G(1007, c0978Po);
            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams2.addRule(2, getCtaButton().getId());
            layoutParams2.setMargins(OL.A07, OL.A07 - (OL.A07 / 2), OL.A07, 0);
            c0978Po.setLayoutParams(layoutParams2);
            id = c0978Po.getId();
            iA01 = op.A01() - (OL.A07 / 2);
        } else {
            id = getCtaButton().getId();
            iA01 = op.A01();
            this.A04 = null;
        }
        FrameLayout frameLayout = new FrameLayout(op.A05());
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams3.addRule(10);
        layoutParams3.addRule(2, id);
        layoutParams3.setMargins(0, iA01, 0, 0);
        frameLayout.setLayoutParams(layoutParams3);
        FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(-1, -2);
        layoutParams4.gravity = 17;
        layoutParams4.setMargins(OL.A07, 0, OL.A07, 0);
        frameLayout.addView(c0950Om, layoutParams4);
        addView(frameLayout);
        View view = this.A04;
        if (view != null) {
            addView(view);
        }
        addView(getCtaButton());
        getCtaButton().A0A(op.A04(), op.A08());
        View viewA02 = op.A02();
        OG ogA01 = OG.A01(op.A05(), abstractC1310b5A04, this);
        this.A02 = ogA01;
        OF ofA09 = ogA01.A09(abstractC1310b5A04);
        op.A05().A0F().A00(ofA09.A01);
        if (viewA02 != null && ofA09.A00) {
            getCtaButton().setCreativeAsCtaLoggingHelper(ogA01);
            viewA02.setOnClickListener(new View.OnClickListener() { // from class: com.facebook.ads.redexgen.X.OV
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.A00.A13(view2);
                }
            });
        } else if (viewA02 != null && C0796Ih.A16(getAdContextWrapper())) {
            AbstractC0923Nl.A00(viewA02, C0796Ih.A17(getAdContextWrapper()), new OW(this));
        }
        if (C0796Ih.A0y(op.A05())) {
            getTitleDescContainer().setCTAClickListener(getCtaButton());
            if (op.A08() != null) {
                op.A08().setCTAClickListener(getCtaButton());
            }
        }
        if (this.A04 != null && C0796Ih.A0z(op.A05())) {
            this.A04.setOnClickListener(getCtaButton());
        }
    }

    @Override // com.facebook.ads.redexgen.uinode.OL
    public final boolean A02() {
        return false;
    }

    @Override // com.facebook.ads.redexgen.uinode.OL
    public final boolean A0D() {
        return false;
    }

    @Override // com.facebook.ads.redexgen.uinode.OL
    public final void A0v() {
        super.A0v();
        this.A02.A0A();
    }

    @Override // com.facebook.ads.redexgen.uinode.OL
    public final void A10(C1G c1g, String str, double d, Bundle bundle) {
        super.A10(c1g, str, d, bundle);
        if (d > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
            int mediaHeight = (int) ((A06 - (OL.A07 * 2)) / d);
            this.A03.A00(mediaHeight);
        }
    }

    @Override // com.facebook.ads.redexgen.uinode.OL
    public final boolean A11() {
        return false;
    }

    public final /* synthetic */ void A13(View view) {
        getCtaButton().A09(A00(0, 5, 75));
    }

    @Override // com.facebook.ads.redexgen.uinode.OE
    public final void AC9() {
        this.A01.A43(this.A00.A0L());
    }
}
