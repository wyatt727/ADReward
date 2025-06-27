package com.facebook.ads.redexgen.uinode;

import android.content.Context;
import com.facebook.ads.internal.dynamicloading.DynamicLoaderImpl;
import com.facebook.ads.internal.util.process.ProcessUtils;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class YL implements InterfaceC05367h {
    public static YL A07;
    public static byte[] A08;
    public static String[] A09 = {"kZNWMB05A80rolZkZr5gINRkemJedumA", "PGnlsDLswmZGHAGkHnqyou4j", "CQczeQcoxNMNqPeDO5UPH4delPie3CF6", "Ozs7AQnIuhnl4TF488yhCLnc3lqg3Tqv", "QUMQF15y8F49TOv2Mbtf3pi6YRJU7tsl", "iRM3Hx3PCEqf", "8yEJzjy1AvS4vnL", "zEXAgd0MZ6iopjt"};
    public C0W A00;
    public InterfaceC05166g A01;
    public C7g A02;
    public InterfaceC05477w A03;
    public C05538c A04;
    public JE A05;
    public InterfaceC0772Hj A06;

    public static String A06(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A08, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            String[] strArr = A09;
            if (strArr[6].length() != strArr[7].length()) {
                break;
            }
            String[] strArr2 = A09;
            strArr2[6] = "Hv2WK1fJh7GnXaP";
            strArr2[7] = "jwUFRNkRPBL5IaL";
            if (i4 >= length) {
                return new String(bArrCopyOfRange);
            }
            int i5 = bArrCopyOfRange[i4] - i3;
            String[] strArr3 = A09;
            if (strArr3[4].charAt(26) != strArr3[0].charAt(26)) {
                break;
            }
            String[] strArr4 = A09;
            strArr4[2] = "3jbuj6iR6sIerVLqEJ9xAsC0KuP7QrbG";
            strArr4[3] = "qsuffxm3RCjhy50iWQEl04Txy4tWGAPw";
            bArrCopyOfRange[i4] = (byte) (i5 - 98);
            i4++;
        }
        throw new RuntimeException();
    }

    public static void A07() {
        A08 = new byte[]{-62, -11, -55, -10, -13, -62, -63, -62, -16, 2, 16, 16, 6, 12, 11, -67, 1, -2, 17, -2, -67, 6, 11, 6, 17, 6, -2, 9, 6, 23, 2, 1, 33, 20, 31, 30, 33, 35, 2, 20, 34, 34, 24, 30, 29, -13, 16, 35, 16, -8, 29, 24, 35, 24, 16, 27, 24, 41, 20, 19};
        if (A09[1].length() == 32) {
            throw new RuntimeException();
        }
        String[] strArr = A09;
        strArr[2] = "XQj6tBQR93KUWcmqG7acynHpkyXbPHo4";
        strArr[3] = "0fPU7ngiro1m2vFzwgFa3cBnolZ3o5pA";
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public final synchronized void A0C(C1206Ym c1206Ym) {
        if (this.A06 != null) {
            return;
        }
        this.A03 = A01(c1206Ym);
        InterfaceC0772Hj interfaceC0772HjA05 = A05(c1206Ym, this.A03, A03(c1206Ym));
        this.A06 = interfaceC0772HjA05;
        A09(c1206Ym, A00(c1206Ym, interfaceC0772HjA05));
        A0A(c1206Ym, this.A06);
        A0B(c1206Ym, this.A06);
        InterfaceC0772Hj interfaceC0772Hj = this.A06;
        if (interfaceC0772Hj != null) {
            interfaceC0772Hj.A5m();
        }
    }

    static {
        A07();
    }

    public static AnonymousClass66 A00(C1206Ym c1206Ym, InterfaceC0772Hj interfaceC0772Hj) {
        if (!C0796Ih.A1P(c1206Ym) || interfaceC0772Hj == null) {
            return null;
        }
        return AnonymousClass67.A00().A00(interfaceC0772Hj);
    }

    public static InterfaceC05477w A01(C1206Ym c1206Ym) {
        return AbstractC05487x.A00().A00(c1206Ym, new YS());
    }

    public static synchronized YL A02() {
        if (A07 == null) {
            A07 = new YL();
        }
        return A07;
    }

    public static RK A03(C1206Ym c1206Ym) {
        if (!C0796Ih.A1L(c1206Ym)) {
            return null;
        }
        return C1018Rc.A01(c1206Ym);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.uinode.InterfaceC05367h
    /* renamed from: A04, reason: merged with bridge method [inline-methods] */
    public final synchronized InterfaceC0772Hj A86() {
        return this.A06;
    }

    public static InterfaceC0772Hj A05(C1206Ym c1206Ym, InterfaceC05477w interfaceC05477w, RK rk) {
        if (C0796Ih.A2E(c1206Ym) && rk != null && !ProcessUtils.isRemoteRenderingProcess()) {
            return AbstractC1041Rz.A00().A00(c1206Ym, interfaceC05477w, rk, K9.A04(c1206Ym), new YM(new K1(c1206Ym, A06(0, 0, 122), null, EnumC0817Jg.A07, 0, new C0822Jl(), LW.A01(C0796Ih.A0J(c1206Ym)), null, null, new C1278aZ()), c1206Ym), C1039Rx.A00().A00());
        }
        return null;
    }

    public static void A08() {
        String strA06 = A06(8, 24, 59);
        if (A09[5].length() == 20) {
            throw new RuntimeException();
        }
        A09[5] = "4ii3kc4oT9MJsiDOLfNQb5ib2";
        AbstractC0826Jp.A05(A06(32, 28, 77), strA06, A06(0, 8, 46));
    }

    public static void A09(C1206Ym c1206Ym, AnonymousClass66 anonymousClass66) {
        if (!C0796Ih.A1P(c1206Ym) || anonymousClass66 == null) {
            return;
        }
        AnonymousClass64.A00().A00(anonymousClass66, c1206Ym);
    }

    public static void A0A(C1206Ym c1206Ym, InterfaceC0772Hj interfaceC0772Hj) {
        if (!C0796Ih.A0h(c1206Ym) || interfaceC0772Hj == null) {
            return;
        }
        new C6R(c1206Ym, interfaceC0772Hj, new C6S(), DynamicLoaderImpl.getBidderTokenProviderApi().A00());
    }

    public static void A0B(C1206Ym c1206Ym, InterfaceC0772Hj interfaceC0772Hj) {
        if (interfaceC0772Hj == null) {
            return;
        }
        AbstractC0799Il.A00(c1206Ym, interfaceC0772Hj);
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC05367h
    public final J2 A5u(C1206Ym c1206Ym) {
        return VQ.A01(c1206Ym);
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC05367h
    public final synchronized C7g A6A(C05357f c05357f) {
        if (this.A02 == null) {
            this.A02 = new YN(this);
        }
        return this.A02;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC05367h
    public final synchronized InterfaceC05166g A6L() {
        if (this.A01 == null) {
            this.A01 = new C1208Yo();
        }
        return this.A01;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC05367h
    public final synchronized InterfaceC05477w A6j(C05357f c05357f) {
        if (this.A03 == null) {
            this.A03 = A01(c05357f.A01());
        }
        return this.A03;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC05367h
    public final synchronized AnonymousClass89 A6l(C05357f c05357f) {
        return new C1195Yb(c05357f);
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC05367h
    public final synchronized InterfaceC05377i A6v(C05357f c05357f) {
        return new EO(this, c05357f);
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC05367h
    public final synchronized C0W A77(C05357f c05357f) {
        if (!C0796Ih.A0v(c05357f)) {
            return null;
        }
        if (this.A00 == null) {
            this.A00 = C0X.A00().A00(new YQ(c05357f));
        }
        return this.A00;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC05367h
    public final synchronized C7k A7q(C05357f c05357f) {
        return new YO(c05357f);
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC05367h
    public final C1206Ym A7r(Context context) {
        C1206Ym sdkContext = AbstractC05347e.A00();
        if (sdkContext == null) {
            C1206Ym sdkContext2 = new C1206Ym(context, this);
            AbstractC05347e.A01(sdkContext2);
            return sdkContext2;
        }
        return sdkContext;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC05367h
    public final synchronized JE A7s(C1206Ym c1206Ym) {
        if (this.A05 == null) {
            this.A05 = new VY(c1206Ym);
        }
        return this.A05;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC05367h
    public final synchronized C05538c A7y() {
        if (this.A04 == null) {
            this.A04 = new C05538c();
            A08();
        }
        return this.A04;
    }
}
