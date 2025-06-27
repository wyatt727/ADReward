package com.facebook.ads.redexgen.uinode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* loaded from: assets/audience_network.dex */
public final class SF implements QF {
    public static byte[] A0B;
    public boolean A00;
    public boolean A01;
    public final C1207Yn A02;
    public final J2 A03;
    public final SA A04;
    public final AbstractC0984Pu A05;
    public final AbstractC0975Pl A06;
    public final AbstractC0951On A07;
    public final SY A08;
    public final String A09;
    public final Map<String, String> A0A;

    static {
        A09();
    }

    public static String A06(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0B, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 96);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A09() {
        A0B = new byte[]{125, 105, 122, 118, 126, 104};
    }

    public SF(C1207Yn c1207Yn, J2 j2, SA sa, String str, QS qs, Map<String, String> map) {
        AbstractC0975Pl abstractC0975Pl = new AbstractC0975Pl() { // from class: com.facebook.ads.redexgen.X.9N
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.uinode.AbstractC05698s
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(C9F c9f) {
                if (!this.A00.A01) {
                    this.A00.A01 = true;
                    this.A00.A02.A0E().AFU();
                }
                SZ sz = new SZ(this.A00.A09, c9f.A03(), c9f.A01(), c9f.A02());
                if (c9f.A00() >= 0.05d) {
                    sz.A06(c9f.A01());
                }
                this.A00.A08.A0C(sz);
            }
        };
        this.A06 = abstractC0975Pl;
        AbstractC0951On abstractC0951On = new AbstractC0951On() { // from class: com.facebook.ads.redexgen.X.9M
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.uinode.AbstractC05698s
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(AnonymousClass98 anonymousClass98) {
                this.A00.A02.A0E().AFb();
                this.A00.A0D();
            }
        };
        this.A07 = abstractC0951On;
        AbstractC0984Pu abstractC0984Pu = new AbstractC0984Pu() { // from class: com.facebook.ads.redexgen.X.9L
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.uinode.AbstractC05698s
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(C9H c9h) {
                this.A00.A02.A0E().AFZ();
                this.A00.A0D();
            }
        };
        this.A05 = abstractC0984Pu;
        this.A00 = false;
        this.A01 = false;
        this.A02 = c1207Yn;
        this.A03 = j2;
        this.A09 = str;
        this.A0A = map;
        this.A04 = sa;
        this.A08 = new SY(str);
        if (C0796Ih.A1i(c1207Yn)) {
            c1207Yn.A0E().AFW();
            qs.A0h(this);
            sa.getEventBus().A05(abstractC0975Pl);
        } else {
            c1207Yn.A0E().AFX();
            sa.getEventBus().A03(abstractC0975Pl, abstractC0951On, abstractC0984Pu);
        }
    }

    private Map<String, String> A08(String str) {
        HashMap map = new HashMap();
        Map<String, String> map2 = this.A0A;
        if (map2 != null) {
            map.putAll(map2);
        }
        map.put(A06(0, 6, 123), str);
        return map;
    }

    public final void A0C() {
        SG sg = new SG(this);
        if (this.A04.A0l()) {
            ExecutorC0868Li.A00(sg);
        } else {
            this.A04.getStateHandler().post(sg);
        }
    }

    public final synchronized void A0D() {
        String strA04 = SY.A04(this.A08.A0B());
        if (strA04 != null) {
            this.A02.A0E().AFc();
            J2 j2 = this.A03;
            String encodedFrameData = this.A09;
            j2.AA1(encodedFrameData, A08(strA04));
        } else if (!this.A00) {
            this.A02.A0E().AFV();
            this.A03.AA1(this.A09, A08(A06(0, 0, 56)));
            this.A00 = true;
        } else {
            this.A02.A0E().AFe();
        }
    }

    @Override // com.facebook.ads.redexgen.uinode.QF
    public final void AC8() {
        this.A02.A0E().AFa();
        A0D();
    }
}
