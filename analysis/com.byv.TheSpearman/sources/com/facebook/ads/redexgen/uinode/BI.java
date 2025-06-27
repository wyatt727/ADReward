package com.facebook.ads.redexgen.uinode;

import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: assets/audience_network.dex */
public final class BI extends AbstractC1074Tg {
    public static byte[] A0F;
    public static String[] A0G = {"QUFYIN7o4MSHfMbcaqgxGqdg8oING", "Qixa92rp7KQSHPhBId3L5m9SXc6gxNRP", "TUKhftCqFUFv9xNbjbPA3CLhBIkdW", "aNiMBj1VMT3xct4Co4hWzqTsg", "QYSCqyZ4CS", "VjIbmM2G6pRRrYhuKIf6SOzC6eQUF7eo", "KFJXOgKoK7JNlCBWMf", "dachHr6cLZKwbIDqTeRsc0FgbmZCJ"};
    public View A00;
    public View A01;
    public C1207Yn A02;
    public L9 A03;
    public MB A04;
    public Q5 A05;
    public KA A06;
    public boolean A07;
    public boolean A08;
    public final MC A09;
    public final O0 A0A;
    public final O1 A0B;
    public final SA A0C;
    public final KP A0D;
    public final AtomicBoolean A0E;

    public static String A03(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0F, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 13);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A08() {
        A0F = new byte[]{-53, -60, -39, -56, -30, -42, -41, -60, -43, -41, -52, -47, -54, -30, -60, -47, -52, -48, -60, -41, -52, -46, -47, -42, -30, -45, -49, -60, -36, -56, -57, -51, -48, -44, -58, -32, -45, -58, -40, -62, -45, -59, -32, -44, -60, -45, -58, -58, -49, -32, -44, -55, -48, -40, -49, -53, -75, -57, -45, -71, -62, -72, -45, -73, -75, -58, -72, -45, -57, -68, -61, -53, -62};
    }

    static {
        A08();
    }

    public BI(OP op) {
        super(op, false);
        this.A0E = new AtomicBoolean(false);
        this.A08 = false;
        this.A07 = false;
        this.A02 = op.A05();
        this.A04 = op.A08();
        View view = new View(this.A02);
        this.A01 = view;
        AbstractC0874Lo.A0K(view);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(0, 0);
        layoutParams.addRule(13);
        addView(this.A01, layoutParams);
        A05();
        MC mcA09 = op.A09();
        this.A09 = mcA09;
        OA.A00(op.A05(), this, getAdInfo().A0D().A07());
        SA saA01 = A01(op);
        this.A0C = saA01;
        getAdDetailsView().bringToFront();
        KP kpA02 = A02(op);
        this.A0D = kpA02;
        A14();
        this.A05 = new Q5(this.A02, op.A06(), getAdDataBundle());
        C1072Te c1072Te = new C1072Te(this);
        this.A0A = c1072Te;
        this.A0B = new O1(op, getAdDataBundle(), saA01, kpA02, getAdDetailsView(), mcA09, c1072Te);
        OF supported = super.A07.A09(getAdDataBundle());
        this.A02.A0F().A00(supported.A01);
        if (supported.A00) {
            getCtaButton().setCreativeAsCtaLoggingHelper(super.A07);
            saA01.getVideoImplView().setOnClickListener(new OS(this));
        } else {
            if (!C0796Ih.A18(getAdContextWrapper())) {
                return;
            }
            AbstractC0923Nl.A00(saA01.getVideoImplView(), C0796Ih.A19(getAdContextWrapper()), new OT(this));
        }
    }

    private SA A01(OP op) {
        SA sa = (SA) op.A02();
        int iA13 = A13(op.A08());
        ImageView imageView = (ImageView) op.A03();
        int i = AbstractC1074Tg.A0F;
        int i2 = AbstractC1074Tg.A0F;
        int toolbarHeight = AbstractC1074Tg.A0F;
        imageView.setPadding(i, i2, toolbarHeight, AbstractC1074Tg.A0F);
        int toolbarHeight2 = AbstractC1074Tg.A0G;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(toolbarHeight2, AbstractC1074Tg.A0G);
        int toolbarHeight3 = AbstractC1074Tg.A0E;
        layoutParams.setMargins(0, iA13, toolbarHeight3, 0);
        layoutParams.addRule(11);
        layoutParams.addRule(10);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams2.addRule(13);
        addView(sa, layoutParams2);
        sa.addView(imageView, layoutParams);
        return sa;
    }

    private KP A02(OP op) {
        KP kpA0A = op.A0A();
        kpA0A.A06(-1, AbstractC1074Tg.A0B);
        kpA0A.setPadding(AbstractC1074Tg.A0J, AbstractC1074Tg.A0J, AbstractC1074Tg.A0J, AbstractC1074Tg.A0J);
        RelativeLayout.LayoutParams progressBarLayoutParams = new RelativeLayout.LayoutParams(-1, AbstractC1074Tg.A0I);
        progressBarLayoutParams.addRule(12);
        addView(kpA0A, progressBarLayoutParams);
        return kpA0A;
    }

    private void A04() {
        if (getAnimationPlugin() != null) {
            getAnimationPlugin().A0E();
            this.A0C.A0d(getAnimationPlugin());
        }
    }

    private void A05() {
        MB mb = this.A04;
        if (mb == null) {
            return;
        }
        this.A06 = new KA(mb, 400, -mb.getToolbarHeight(), 0);
    }

    private void A06() {
        new JA(getAdDataBundle().A12(), getAdEventManager()).A04(J9.A0r, null);
        if (!getAdInfo().A0O()) {
            return;
        }
        this.A0E.set(true);
        AbstractC0874Lo.A0T(this);
        AbstractC0874Lo.A0H(this.A0C);
        AbstractC0874Lo.A0a(this.A0C, this.A0D, this.A0B, this.A00);
        AbstractC0874Lo.A0L(this.A04);
        Q5 q5 = this.A05;
        ViewOnClickListenerC1079Tl ctaButton = getCtaButton();
        String[] strArr = A0G;
        if (strArr[2].length() != strArr[0].length()) {
            throw new RuntimeException();
        }
        A0G[3] = "FxfG3zWETYKhpCEsP1aqGpvXk";
        Pair<Q4, View> pairA03 = q5.A03(ctaButton);
        this.A00 = (View) pairA03.second;
        switch (OU.A00[((Q4) pairA03.first).ordinal()]) {
            case 1:
                getAdDetailsView().setVisibility(0);
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
                layoutParams.setMargins(0, A13(this.A04), 0, 0);
                layoutParams.addRule(2, getAdDetailsView().getId());
                addView(this.A00, layoutParams);
                break;
            case 2:
                AbstractC0874Lo.A0a(getAdDetailsView());
                RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -1);
                layoutParams2.setMargins(AbstractC1074Tg.A0H, AbstractC1074Tg.A0H, AbstractC1074Tg.A0H, AbstractC1074Tg.A0H);
                addView(this.A00, layoutParams2);
                break;
        }
        if (getAdInfo().A0G().A00() >= 0) {
            this.A07 = true;
            MB mb = this.A04;
            if (mb != null) {
                mb.setToolbarActionMode(2);
                this.A04.setProgressImmediate(0.0f);
            }
            L9 l9 = new L9((int) getAdInfo().A0G().A00(), 20.0f, 20L, new Handler(Looper.getMainLooper()), new C1071Td(this));
            this.A03 = l9;
            l9.A07();
        }
    }

    private void A07() {
        KA ka = this.A06;
        if (ka != null) {
            ka.A3Y(true, false);
        }
        if (getAdDetailsAnimation() != null) {
            getAdDetailsAnimation().A3Y(true, false);
        }
    }

    @Override // com.facebook.ads.redexgen.uinode.OL
    public final void A0B(C9H c9h) {
        super.A0B(c9h);
        A06();
    }

    @Override // com.facebook.ads.redexgen.uinode.OL
    public final void A0C(AnonymousClass93 anonymousClass93) {
        super.A0C(anonymousClass93);
        int videoLengthMs = anonymousClass93.A00();
        int duration = this.A0C.getDuration() - videoLengthMs;
        if (getAnimationPlugin() != null) {
            int videoLengthMs2 = A0G[1].charAt(18);
            if (videoLengthMs2 != 51) {
                throw new RuntimeException();
            }
            A0G[5] = "xiBnzSw2W6K3rvYkwdUGMYXv5m3ZqRWR";
            if (duration < 3000 && getAnimationPlugin().A0J()) {
                getAnimationPlugin().A0F();
            }
        }
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC1074Tg, com.facebook.ads.redexgen.uinode.OL
    public final void A0v() {
        super.A0v();
        A04();
        this.A04 = null;
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC1074Tg, com.facebook.ads.redexgen.uinode.OL
    public final void A10(C1G c1g, String str, double d, Bundle bundle) {
        super.A10(c1g, str, d, bundle);
        if (bundle == null) {
            bundle = new Bundle();
        }
        if (!bundle.getBoolean(A03(0, 31, 118), false)) {
            A07();
        }
        if (bundle.getBoolean(A03(55, 18, 103), false)) {
            A06();
        }
        if (bundle.getBoolean(A03(31, 24, 116), false)) {
            O1 o1 = this.A0B;
            if (A0G[1].charAt(18) != '3') {
                throw new RuntimeException();
            }
            String[] strArr = A0G;
            strArr[2] = "jjtMTZWEM7Dg1szUnnnmuTjwvMhej";
            strArr[0] = "cexdZia4vusGbXInA5fVVHDcQrSB4";
            o1.A07(this);
        }
    }

    @Override // com.facebook.ads.redexgen.uinode.OL
    public final boolean A11() {
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x004a  */
    @Override // com.facebook.ads.redexgen.uinode.OL
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean A12(boolean r6) {
        /*
            r5 = this;
            r4 = 1
            if (r6 == 0) goto L33
            boolean r0 = r5.A08
            if (r0 != 0) goto L33
            java.util.concurrent.atomic.AtomicBoolean r0 = r5.A0E
            boolean r3 = r0.get()
            java.lang.String[] r2 = com.facebook.ads.redexgen.uinode.BI.A0G
            r0 = 7
            r1 = r2[r0]
            r0 = 4
            r0 = r2[r0]
            int r1 = r1.length()
            int r0 = r0.length()
            if (r1 == r0) goto L65
            java.lang.String[] r2 = com.facebook.ads.redexgen.uinode.BI.A0G
            java.lang.String r1 = "IfEmWBIDBUNw5tL7YhS4lNzldGhzw"
            r0 = 2
            r2[r0] = r1
            java.lang.String r1 = "8CoNQoXVMdzgwU1krh95bRLsSKKH4"
            r0 = 0
            r2[r0] = r1
            if (r3 != 0) goto L33
            com.facebook.ads.redexgen.X.O1 r0 = r5.A0B
            r0.A07(r5)
            return r4
        L33:
            com.facebook.ads.redexgen.X.1G r0 = r5.getAdInfo()
            boolean r3 = r0.A0O()
            java.lang.String[] r1 = com.facebook.ads.redexgen.uinode.BI.A0G
            r0 = 5
            r1 = r1[r0]
            r0 = 17
            char r1 = r1.charAt(r0)
            r0 = 107(0x6b, float:1.5E-43)
            if (r1 == r0) goto L65
            java.lang.String[] r2 = com.facebook.ads.redexgen.uinode.BI.A0G
            java.lang.String r1 = "YRUjLZqfjvY5EOxU383ujQcW8j7gUgor"
            r0 = 1
            r2[r0] = r1
            if (r3 == 0) goto L63
            java.util.concurrent.atomic.AtomicBoolean r0 = r5.A0E
            boolean r0 = r0.get()
            if (r0 != 0) goto L63
            com.facebook.ads.redexgen.X.SA r1 = r5.A0C
            com.facebook.ads.redexgen.X.QH r0 = com.facebook.ads.redexgen.uinode.QH.A08
            r1.A0a(r0)
            return r4
        L63:
            r0 = 0
            return r0
        L65:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.uinode.BI.A12(boolean):boolean");
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC1074Tg
    public final void A14() {
        super.A14();
        if (getAnimationPlugin() != null) {
            getAnimationPlugin().A9R(this.A0C);
        }
    }

    public final boolean A15() {
        return getAdInfo().A0O();
    }

    @Override // com.facebook.ads.redexgen.uinode.OL
    public int getCloseButtonStyle() {
        if (this.A07) {
            return 2;
        }
        if (A15() && !this.A0E.get()) {
            return 1;
        }
        return super.getCloseButtonStyle();
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC1074Tg, com.facebook.ads.redexgen.uinode.OL, android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }
}
