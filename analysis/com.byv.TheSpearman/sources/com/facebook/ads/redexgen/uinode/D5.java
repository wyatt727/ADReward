package com.facebook.ads.redexgen.uinode;

/* loaded from: assets/audience_network.dex */
public final class D5 {
    public int A00;
    public long A01;
    public boolean A02;
    public boolean A03;
    public boolean A04;
    public final InterfaceC0671Cy A05;
    public final C0787Hy A06 = new C0787Hy(new byte[64]);
    public final IB A07;

    public D5(InterfaceC0671Cy interfaceC0671Cy, IB ib) {
        this.A05 = interfaceC0671Cy;
        this.A07 = ib;
    }

    private void A00() {
        this.A06.A08(8);
        this.A03 = this.A06.A0F();
        this.A02 = this.A06.A0F();
        this.A06.A08(6);
        this.A00 = this.A06.A04(8);
    }

    private void A01() {
        this.A01 = 0L;
        if (this.A03) {
            this.A06.A08(4);
            this.A06.A08(1);
            long pts = this.A06.A04(15) << 15;
            long jA04 = (this.A06.A04(3) << 30) | pts;
            this.A06.A08(1);
            long pts2 = this.A06.A04(15);
            long j = jA04 | pts2;
            this.A06.A08(1);
            if (!this.A04 && this.A02) {
                this.A06.A08(4);
                long pts3 = this.A06.A04(3);
                this.A06.A08(1);
                this.A06.A08(1);
                this.A06.A08(1);
                this.A07.A07((pts3 << 30) | (this.A06.A04(15) << 15) | this.A06.A04(15));
                this.A04 = true;
            }
            this.A01 = this.A07.A07(j);
        }
    }

    public final void A02() {
        this.A04 = false;
        this.A05.AFg();
    }

    public final void A03(C0788Hz c0788Hz) throws C05969v {
        c0788Hz.A0c(this.A06.A00, 0, 3);
        this.A06.A07(0);
        A00();
        c0788Hz.A0c(this.A06.A00, 0, this.A00);
        this.A06.A07(0);
        A01();
        this.A05.ADt(this.A01, true);
        this.A05.A4R(c0788Hz);
        this.A05.ADs();
    }
}
