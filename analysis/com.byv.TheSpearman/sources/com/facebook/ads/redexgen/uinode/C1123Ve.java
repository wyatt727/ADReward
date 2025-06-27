package com.facebook.ads.redexgen.uinode;

/* renamed from: com.facebook.ads.redexgen.X.Ve, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1123Ve implements InterfaceC0779Hq {
    public long A00;
    public long A01;
    public C05989x A02 = C05989x.A04;
    public boolean A03;
    public final InterfaceC0766Hd A04;

    public C1123Ve(InterfaceC0766Hd interfaceC0766Hd) {
        this.A04 = interfaceC0766Hd;
    }

    public final void A00() {
        if (!this.A03) {
            this.A00 = this.A04.A5T();
            this.A03 = true;
        }
    }

    public final void A01() {
        if (this.A03) {
            A02(A7k());
            this.A03 = false;
        }
    }

    public final void A02(long j) {
        this.A01 = j;
        if (this.A03) {
            this.A00 = this.A04.A5T();
        }
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC0779Hq
    public final C05989x A7h() {
        return this.A02;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC0779Hq
    public final long A7k() {
        long elapsedSinceBaseMs = this.A01;
        if (this.A03) {
            long jA5T = this.A04.A5T();
            long positionUs = this.A00;
            long j = jA5T - positionUs;
            if (this.A02.A01 == 1.0f) {
                long positionUs2 = C9W.A00(j);
                return elapsedSinceBaseMs + positionUs2;
            }
            long positionUs3 = this.A02.A00(j);
            return elapsedSinceBaseMs + positionUs3;
        }
        return elapsedSinceBaseMs;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC0779Hq
    public final C05989x AGA(C05989x c05989x) {
        if (this.A03) {
            A02(A7k());
        }
        this.A02 = c05989x;
        return c05989x;
    }
}
