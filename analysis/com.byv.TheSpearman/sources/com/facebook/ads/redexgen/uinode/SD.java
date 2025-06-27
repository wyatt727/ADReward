package com.facebook.ads.redexgen.uinode;

/* loaded from: assets/audience_network.dex */
public class SD extends KT {
    public static String[] A04 = {"pUIboC8CwdUMtM1tPR8iEtPz8p", "ladzvmq", "gZiIZXhhpFNWaRiPv", "vQtAVDGFp8M", "7j30UYRlUEXcM4Kd2wK", "XchzO9Mtzl1GyvdPdWlZd1J0iwZmFx3H", "VTwPVxpRcW0", "YPnzN72MuP4y3lnuBhqZ0NoSyY"};
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ SA A02;
    public final /* synthetic */ RB A03;

    public SD(SA sa, RB rb, int i, int i2) {
        this.A02 = sa;
        this.A03 = rb;
        this.A00 = i;
        this.A01 = i2;
    }

    @Override // com.facebook.ads.redexgen.uinode.KT
    public final void A06() {
        if (this.A03 == RB.A07) {
            this.A02.A0L(J9.A0q);
            this.A02.A0A.A0E().A38();
            this.A02.A0B.A02(SA.A0C());
            return;
        }
        if (this.A03 == RB.A03) {
            this.A02.A0L(J9.A0l);
            this.A02.A03 = true;
            this.A02.A0B.A02(SA.A0G);
            this.A02.A0K(this.A00);
            return;
        }
        RB rb = this.A03;
        RB rb2 = RB.A06;
        String[] strArr = A04;
        if (strArr[0].length() != strArr[7].length()) {
            throw new RuntimeException();
        }
        A04[5] = "Wlqb3PCyph61UkVVxo7ng7VZa1hYfmo4";
        if (rb == rb2) {
            this.A02.A0L(J9.A0k);
            this.A02.A0A.A0E().A30();
            this.A02.A03 = true;
            this.A02.A07.removeCallbacksAndMessages(null);
            C05688r c05688r = this.A02.A0B;
            int i = this.A01;
            c05688r.A02(new C9H(i, i));
            this.A02.A0K(this.A01);
            return;
        }
        if (this.A03 == RB.A0A) {
            if (C0796Ih.A1W(this.A02.A0A)) {
                this.A02.A0A.A0A().ADg();
            }
            this.A02.A0L(J9.A0o);
            this.A02.A0A.A0E().A3F();
            this.A02.A0B.A02(SA.A0H);
            this.A02.A07.removeCallbacksAndMessages(null);
            this.A02.A0H();
            return;
        }
        if (this.A03 == RB.A05) {
            this.A02.A0L(J9.A0n);
            this.A02.A0A.A0E().A34();
            C05688r c05688r2 = this.A02.A0B;
            final int i2 = this.A00;
            c05688r2.A02(new AbstractC0985Pv(i2) { // from class: com.facebook.ads.redexgen.X.98
            });
            this.A02.A07.removeCallbacksAndMessages(null);
            this.A02.A0K(this.A00);
            return;
        }
        if (this.A03 == RB.A04) {
            this.A02.A0L(J9.A0m);
            this.A02.A0A.A0E().A31();
            this.A02.A0B.A02(SA.A0K);
            this.A02.A07.removeCallbacksAndMessages(null);
            return;
        }
        if (this.A03 == RB.A09) {
            this.A02.A0L(J9.A0k);
            this.A02.A0A.A0E().A3A();
            this.A02.A03 = true;
            this.A02.A07.removeCallbacksAndMessages(null);
            this.A02.A0B.A02(new C9H(this.A00, this.A01));
            this.A02.A0K(this.A00);
        }
    }
}
