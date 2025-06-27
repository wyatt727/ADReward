package com.facebook.ads.redexgen.uinode;

import com.google.android.exoplayer2.upstream.CmcdHeadersFactory;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class Y8 implements InterfaceC0779Hq {
    public static byte[] A04;
    public static String[] A05 = {"Xobc5aSRFsnlTfq950Hm2L3uP2yqTx5R", CmcdHeadersFactory.STREAM_TYPE_LIVE, "qpzLH3olNTSgnmEJfqgMoILAygrv9Gvu", "rA2kHVtwjUdxF3LXQtoL786BdYvsVYLD", "0rBDFyThd5IBv1Jp4I3rS", "drj1vvUtkoX3RGiyI02l8il3i3aSfPCy", "cZlTLMFk7RrLemAAhuy1ARzIYrj9DMLk", "NSM"};
    public Y5 A00;
    public InterfaceC0779Hq A01;
    public final C9Z A02;
    public final C1123Ve A03;

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A04, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 64);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A04 = new byte[]{-84, -44, -53, -45, -56, -49, -53, -60, Byte.MAX_VALUE, -47, -60, -51, -61, -60, -47, -60, -47, Byte.MAX_VALUE, -52, -60, -61, -56, -64, Byte.MAX_VALUE, -62, -53, -50, -62, -54, -46, Byte.MAX_VALUE, -60, -51, -64, -63, -53, -60, -61, -115};
    }

    static {
        A02();
    }

    public Y8(C9Z c9z, InterfaceC0766Hd interfaceC0766Hd) {
        this.A02 = c9z;
        this.A03 = new C1123Ve(interfaceC0766Hd);
    }

    private void A01() {
        this.A03.A02(this.A01.A7k());
        C05989x c05989xA7h = this.A01.A7h();
        if (!c05989xA7h.equals(this.A03.A7h())) {
            this.A03.AGA(c05989xA7h);
            this.A02.ACb(c05989xA7h);
        }
    }

    private boolean A03() {
        Y5 y5 = this.A00;
        if (y5 != null && !y5.A91()) {
            boolean zA9C = this.A00.A9C();
            if (A05[1].length() == 23) {
                throw new RuntimeException();
            }
            A05[1] = "Da4vHoBMew1xMnwVwhw0NxQudcM";
            if (zA9C || !this.A00.A8a()) {
                return true;
            }
        }
        return false;
    }

    public final long A04() {
        if (A03()) {
            A01();
            long jA7k = this.A01.A7k();
            if (A05[7].length() == 18) {
                throw new RuntimeException();
            }
            A05[7] = "L098bBK7xK";
            return jA7k;
        }
        return this.A03.A7k();
    }

    public final void A05() {
        this.A03.A00();
    }

    public final void A06() {
        this.A03.A01();
    }

    public final void A07(long j) {
        this.A03.A02(j);
    }

    public final void A08(Y5 y5) {
        if (y5 == this.A00) {
            this.A01 = null;
            this.A00 = null;
        }
    }

    public final void A09(Y5 y5) throws C05789c {
        InterfaceC0779Hq interfaceC0779HqA7N = y5.A7N();
        if (interfaceC0779HqA7N != null) {
            InterfaceC0779Hq interfaceC0779Hq = this.A01;
            if (A05[0].charAt(12) != 'T') {
                throw new RuntimeException();
            }
            String[] strArr = A05;
            strArr[6] = "G6KpX7Ur5Z0x6RCw4xSrHpY3l6NonZ5O";
            strArr[3] = "DkiI2Rz4cuYvxyrSRslfvXTI6PdAzLXl";
            if (interfaceC0779HqA7N != interfaceC0779Hq) {
                if (interfaceC0779Hq == null) {
                    this.A01 = interfaceC0779HqA7N;
                    this.A00 = y5;
                    InterfaceC0779Hq rendererMediaClock = this.A03;
                    interfaceC0779HqA7N.AGA(rendererMediaClock.A7h());
                    A01();
                    return;
                }
                throw C05789c.A02(new IllegalStateException(A00(0, 39, 31)));
            }
        }
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC0779Hq
    public final C05989x A7h() {
        InterfaceC0779Hq interfaceC0779Hq = this.A01;
        if (interfaceC0779Hq != null) {
            return interfaceC0779Hq.A7h();
        }
        return this.A03.A7h();
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC0779Hq
    public final long A7k() {
        if (A03()) {
            return this.A01.A7k();
        }
        return this.A03.A7k();
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC0779Hq
    public final C05989x AGA(C05989x c05989x) {
        InterfaceC0779Hq interfaceC0779Hq = this.A01;
        if (interfaceC0779Hq != null) {
            c05989x = interfaceC0779Hq.AGA(c05989x);
        }
        this.A03.AGA(c05989x);
        this.A02.ACb(c05989x);
        return c05989x;
    }
}
