package com.facebook.ads.redexgen.uinode;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class BJ extends AbstractC1074Tg {
    public static byte[] A02;
    public static final int A03;
    public final View A00;
    public final boolean A01;

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 101);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{-24, -20, -32, -26, -28};
    }

    static {
        A01();
        A03 = Resources.getSystem().getDisplayMetrics().widthPixels;
    }

    public BJ(OP op, boolean z) {
        super(op, true);
        this.A01 = z;
        View viewA02 = op.A02();
        this.A00 = viewA02;
        A14();
        if (z) {
            addView(op.A02(), new RelativeLayout.LayoutParams(-1, -1));
        } else {
            FrameLayout frameLayout = new FrameLayout(op.A05());
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
            layoutParams.addRule(2, getAdDetailsView().getId());
            frameLayout.setLayoutParams(layoutParams);
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -2);
            layoutParams2.gravity = 17;
            layoutParams2.setMargins(OL.A07, 0, OL.A07, 0);
            frameLayout.addView(viewA02, layoutParams2);
            addView(frameLayout);
        }
        OF ofA09 = this.A07.A09(getAdDataBundle());
        op.A05().A0F().A00(ofA09.A01);
        if (viewA02 != null) {
            if (ofA09.A00) {
                getCtaButton().setCreativeAsCtaLoggingHelper(this.A07);
                viewA02.setOnClickListener(new View.OnClickListener() { // from class: com.facebook.ads.redexgen.X.OQ
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.A00.A15(view);
                    }
                });
            } else if (C0796Ih.A16(getAdContextWrapper())) {
                AbstractC0923Nl.A00(viewA02, C0796Ih.A17(getAdContextWrapper()), new OR(this));
            }
        }
        getAdDetailsView().bringToFront();
    }

    @Override // com.facebook.ads.redexgen.uinode.OL
    public final boolean A02() {
        return this.A01 && super.A02();
    }

    @Override // com.facebook.ads.redexgen.uinode.OL
    public final boolean A0D() {
        return this.A01 && super.A02();
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC1074Tg, com.facebook.ads.redexgen.uinode.OL
    public final void A10(C1G c1g, String str, double d, Bundle bundle) {
        super.A10(c1g, str, d, bundle);
        if (!this.A01 && d > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
            int mediaHeight = (int) ((A03 - (OL.A07 * 2)) / d);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, mediaHeight);
            layoutParams.gravity = 17;
            int i = OL.A07;
            int mediaHeight2 = OL.A07;
            layoutParams.setMargins(i, 0, mediaHeight2, 0);
            this.A00.setLayoutParams(layoutParams);
        }
    }

    @Override // com.facebook.ads.redexgen.uinode.OL
    public final boolean A11() {
        return this.A01;
    }

    public final /* synthetic */ void A15(View view) {
        getCtaButton().A09(A00(0, 5, 26));
    }
}
