package com.facebook.ads.redexgen.uinode;

import android.text.TextUtils;
import android.widget.FrameLayout;
import java.util.Arrays;
import org.json.JSONException;

/* renamed from: com.facebook.ads.redexgen.X.9Q, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C9Q extends AbstractC1060Ss {
    public static byte[] A0L;
    public static String[] A0M = {"Mriq29lS8vjEPztqvg4mnlhqPa1pf4jw", "J0ebGdEZD5oKohgNzUxMA3JiHaSF4bRJ", "IT9tvlYp44pYwsfxgtsksFS", "El43mrOkb3qqMjbYlNbneDDC3riKbt8u", "SsyQgLhJr8BA6K4Jeu0226NIXlotTSUK", "5pKSfcHcmxRzGJ6MCKbxSHPk9j0pnkgf", "vZ9Xs81YGHnjRjGsoTeSsIOHxP", "Y9Sammkz"};
    public OL A00;
    public Q7 A01;
    public QM A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public final C5T A09;
    public final SF A0A;
    public final SA A0B;
    public final C9I A0C;
    public final AbstractC0984Pu A0D;
    public final AbstractC0982Ps A0E;
    public final AbstractC0951On A0F;
    public final O7 A0G;
    public final NX A0H;
    public final NQ A0I;
    public final C0856Kw A0J;
    public final KP A0K;

    public static String A03(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0L, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 88);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A08() {
        A0L = new byte[]{-3, 21, 7, 5, 21, -1};
    }

    static {
        A08();
    }

    public C9Q(C1207Yn c1207Yn, InterfaceC0895Mj interfaceC0895Mj, J2 j2, AbstractC1310b5 abstractC1310b5, C05126c c05126c, MC mc) {
        super(c1207Yn, interfaceC0895Mj, j2, abstractC1310b5, c05126c, mc);
        this.A09 = new C1049Sh(this);
        NX nx = new NX() { // from class: com.facebook.ads.redexgen.X.9X
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.uinode.AbstractC05698s
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(C0925Nn c0925Nn) {
                this.A00.A07 = true;
            }
        };
        this.A0H = nx;
        O7 o7 = new O7() { // from class: com.facebook.ads.redexgen.X.9V
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.uinode.AbstractC05698s
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(O8 o8) {
                this.A00.A08 = true;
                this.A00.A0P();
            }
        };
        this.A0G = o7;
        AbstractC0951On abstractC0951On = new AbstractC0951On() { // from class: com.facebook.ads.redexgen.X.9U
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.uinode.AbstractC05698s
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(AnonymousClass98 anonymousClass98) {
            }
        };
        this.A0F = abstractC0951On;
        NQ nq = new NQ() { // from class: com.facebook.ads.redexgen.X.9T
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.uinode.AbstractC05698s
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(AnonymousClass93 anonymousClass93) {
                this.A00.A0F(anonymousClass93);
                this.A00.A0E(anonymousClass93);
                this.A00.A00.A0C(anonymousClass93);
            }
        };
        this.A0I = nq;
        AbstractC0984Pu abstractC0984Pu = new AbstractC0984Pu() { // from class: com.facebook.ads.redexgen.X.9S
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.uinode.AbstractC05698s
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(C9H c9h) {
                C9Q c9q = this.A00;
                c9q.A0D(c9h, c9q.A0B.getState() != RB.A06, false);
            }
        };
        this.A0D = abstractC0984Pu;
        C9R c9r = new C9R(this);
        this.A0E = c9r;
        boolean z = false;
        this.A07 = false;
        this.A08 = false;
        this.A06 = false;
        this.A05 = false;
        this.A04 = false;
        SA sa = new SA(super.A03);
        this.A0B = sa;
        sa.setFunnelLoggingHandler(super.A05);
        sa.getEventBus().A03(nx, o7, abstractC0951On, nq, abstractC0984Pu, c9r);
        C9I c9i = new C9I(super.A03, super.A04, sa, super.A01.A12());
        this.A0C = c9i;
        if (C0796Ih.A1X(super.A03)) {
            this.A0A = new SF(super.A03, super.A04, sa, super.A01.A12(), c9i, null);
        } else {
            this.A0A = null;
        }
        this.A01 = new Q7(super.A03, super.A09, super.A01.A0T(), mc);
        this.A0J = new C0856Kw(super.A03, super.A05);
        this.A0K = new KP(super.A03);
        A07();
        sa.setVideoURI(super.A02.A0S(super.A01.A0x().A0D().A08()));
        A05();
        int iA03 = super.A01.A0x().A0D().A03();
        if (C0796Ih.A1w(super.A03)) {
            this.A05 = iA03 == 0;
        } else {
            this.A05 = iA03 <= 0;
        }
        if (super.A01.A0x().A0M() && super.A01.A0x().A0D().A02() > 0) {
            z = true;
        }
        this.A03 = z;
        AbstractC0874Lo.A0M(this, super.A01.A0w().A01().A07(true));
        if (C0796Ih.A1q(super.A03)) {
            super.A07.setProgressSpinnerInvisible(true);
        }
    }

    private OL A00(int i) {
        return OM.A00(new OO(super.A03, super.A04, super.A08, super.A01, this.A0B, super.A0A, super.A06).A0E(super.A07.getToolbarHeight()).A0H(super.A07).A0D(i).A0F(this.A0J).A0I(this.A0K).A0K(), null, true);
    }

    private void A04() {
        this.A0B.postDelayed(new C1048Sg(this), C0796Ih.A0K(super.A03));
    }

    private void A05() {
        this.A0B.postDelayed(new C1047Sf(this), C0796Ih.A0L(super.A03));
    }

    private void A06() {
        this.A05 = true;
        super.A07.A04();
        OL ol = this.A00;
        if (ol != null) {
            ol.A0y();
        }
    }

    private void A07() {
        this.A0B.A0c(this.A0K);
        this.A0B.A0c(this.A0J);
        if (!TextUtils.isEmpty(super.A01.A0x().A0D().A07())) {
            C7R c7r = new C7R(super.A03);
            this.A0B.A0c(c7r);
            c7r.setImage(super.A01.A0x().A0D().A07());
        }
        C7C c7c = new C7C(super.A03, true, super.A05);
        this.A0B.A0c(c7c);
        this.A0B.A0c(new L7(c7c, QZ.A03, true));
        this.A0B.A0c(new C7H(super.A03));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0D(C9H c9h, boolean z, boolean z2) {
        if (this.A06) {
            return;
        }
        if (A0M[6].length() != 26) {
            throw new RuntimeException();
        }
        String[] strArr = A0M;
        strArr[2] = "N5ZIPH8mvSXK1CHoPTlSEsF";
        strArr[7] = "PVGkj9Ta";
        this.A06 = true;
        if (!this.A05) {
            A06();
        }
        OL ol = this.A00;
        if (ol != null) {
            ol.A0B(c9h);
        }
        super.A07.setToolbarActionMessage(A03(0, 0, 25));
        A0H(z, z2);
        super.A07.setToolbarActionMode(getCloseButtonStyle());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0E(AnonymousClass93 anonymousClass93) {
        if (this.A0B.getState() == RB.A02 && C0796Ih.A1D(super.A03)) {
            this.A0B.postDelayed(new C1050Si(this, anonymousClass93), 5000L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0F(AnonymousClass93 anonymousClass93) {
        int iA00 = anonymousClass93.A00();
        if (this.A03) {
            int currentPosMs = iA00 / 1000;
            int iA02 = super.A01.A0x().A0D().A02() - currentPosMs;
            if (!ViewOnClickListenerC1079Tl.A08(super.A01)) {
                if (iA02 > 0) {
                    super.A07.setToolbarActionMessage(super.A01.A11().A02().replace(A03(0, 6, 74), String.valueOf(iA02)));
                } else {
                    super.A07.setToolbarActionMessage(A03(0, 0, 25));
                }
            }
            if (iA02 <= 0) {
                String[] strArr = A0M;
                String str = strArr[2];
                String str2 = strArr[7];
                int totalSecondsForReward = str.length();
                int currentPosMs2 = str2.length();
                if (totalSecondsForReward == currentPosMs2) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A0M;
                strArr2[0] = "PXM0w4DTcyhv6xVVxlaJPbpxowOdlGPl";
                strArr2[4] = "ZagmJHoPVKqTZKI94Zh80WtjAbW4VeCE";
                A0H(false, false);
            }
        }
        int currentPosMs3 = super.A01.A0x().A0D().A03();
        float f = currentPosMs3 * 1000.0f;
        int currentPosMs4 = this.A0B.getDuration();
        float seenPercentage = iA00 / Math.min(f, currentPosMs4);
        super.A07.setProgress(100.0f * seenPercentage);
        if (seenPercentage >= 1.0f && !this.A05) {
            A06();
            MB mb = super.A07;
            int currentPosMs5 = getCloseButtonStyle();
            mb.setToolbarActionMode(currentPosMs5);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0G(String str) {
        int currentPositionInMillis = 0;
        int duration = 0;
        SA sa = this.A0B;
        if (sa != null) {
            currentPositionInMillis = sa.getCurrentPositionInMillis();
            duration = this.A0B.getDuration();
            this.A0B.A0Z(3);
        }
        super.A03.A0E().A2z(str);
        if (C0796Ih.A1E(super.A03)) {
            A0D(new C9H(currentPositionInMillis, duration), false, true);
            return;
        }
        MC mc = super.A08;
        int duration2 = A0M[3].charAt(0);
        if (duration2 == 122) {
            throw new RuntimeException();
        }
        A0M[3] = "uhCmlX27t5rzSWT78KYVdoY12DutI5Be";
        mc.A43(super.A09.A6y());
        super.A08.A43(super.A09.A6u());
    }

    private synchronized void A0H(boolean z, boolean z2) {
        if (this.A03 && !z && !z2) {
            super.A08.A43(super.A09.A5s());
            this.A01.A05();
            this.A03 = false;
            OL ol = this.A00;
            if (ol != null) {
                ol.A0w();
            }
            return;
        }
        this.A03 = false;
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC1060Ss
    public final void A0Q() {
        AbstractC0874Lo.A0L(this.A00);
        AbstractC0874Lo.A0L(super.A07);
        this.A0B.setVolume(super.A01.A0x().A0D().A09() ? 0.0f : 1.0f);
        this.A0B.A0b(QM.A02, 20);
        OL ol = this.A00;
        if (ol != null && this.A03) {
            ol.A0x();
        }
        OL ol2 = this.A00;
        if (ol2 != null && !this.A05) {
            ol2.A0z();
        }
        A04();
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC1060Ss
    public final void A0S(C5V c5v) {
        c5v.A0N(this.A09);
        int orientation = c5v.A0J().getResources().getConfiguration().orientation;
        OL olA00 = A00(orientation);
        this.A00 = olA00;
        addView(olA00, AbstractC1060Ss.A0E);
        addView(super.A07, new FrameLayout.LayoutParams(-1, super.A07.getToolbarHeight()));
        AbstractC0874Lo.A0H(this.A00);
        AbstractC0874Lo.A0H(super.A07);
        OL ol = this.A00;
        setUpFullscreenMode(ol != null && ol.A11());
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC1060Ss
    public final boolean A0T() {
        OL ol = this.A00;
        return ol != null && ol.A12(this.A03);
    }

    @Override // com.facebook.ads.redexgen.uinode.MD
    public final void ACW(boolean z) {
        if (this.A0B.A0i()) {
            return;
        }
        this.A02 = this.A0B.getVideoStartReason();
        this.A04 = z;
        this.A0B.A0e(false, 13);
    }

    @Override // com.facebook.ads.redexgen.uinode.MD
    public final void ACu(boolean z) {
        QM qm;
        if (this.A0B.A0j() || this.A06 || this.A0B.getState() == RB.A06 || (qm = this.A02) == null) {
            return;
        }
        if (!this.A04 || z) {
            SA sa = this.A0B;
            String[] strArr = A0M;
            if (strArr[0].charAt(8) == strArr[4].charAt(8)) {
                throw new RuntimeException();
            }
            A0M[1] = "5vrQw9TAnlgebYwA7tbvLzoGHglPMjBr";
            sa.A0b(qm, 19);
        }
    }

    private int getCloseButtonStyle() {
        OL ol = this.A00;
        if (ol != null) {
            return ol.getCloseButtonStyle();
        }
        return 0;
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC1060Ss, com.facebook.ads.redexgen.uinode.MD
    public final void onDestroy() throws JSONException {
        super.onDestroy();
        if (C0796Ih.A1W(super.A03)) {
            super.A03.A0A().AGk(this.A0B);
        }
        OL ol = this.A00;
        if (ol != null) {
            ol.A0v();
        }
        SA sa = this.A0B;
        if (sa != null) {
            if (!this.A06) {
                sa.A0a(QH.A05);
            }
            this.A0B.getEventBus().A04(this.A0H, this.A0G, this.A0F, this.A0I, this.A0D, this.A0E);
            this.A0B.A0V();
        }
        SF sf = this.A0A;
        if (sf != null) {
            sf.A0C();
        }
        this.A0C.A0i();
    }

    public void setServerSideRewardHandler(Q7 q7) {
        this.A01 = q7;
    }
}
