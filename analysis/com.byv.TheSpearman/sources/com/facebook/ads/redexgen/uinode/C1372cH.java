package com.facebook.ads.redexgen.uinode;

import android.os.Handler;
import android.os.Looper;

/* renamed from: com.facebook.ads.redexgen.X.cH, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1372cH {
    public static C1372cH A02 = null;
    public final C1384cT A00;
    public final C1382cR A01;

    public C1372cH(AbstractC1388cY abstractC1388cY, C1382cR c1382cR, C1384cT c1384cT) {
        this.A00 = c1384cT;
        this.A01 = c1382cR;
        abstractC1388cY.A02(new H2(c1382cR));
    }

    public static C1372cH A00(AbstractC1388cY abstractC1388cY, InterfaceC1392cc interfaceC1392cc, HB hb) {
        C1372cH localsTestInstance = A02;
        if (localsTestInstance != null) {
            return localsTestInstance;
        }
        C1384cT c1384cT = new C1384cT();
        return new C1372cH(abstractC1388cY, new C1382cR(interfaceC1392cc, new HL(), hb, c1384cT, new Handler(Looper.getMainLooper())), c1384cT);
    }

    public final void A01(cX cXVar) {
        this.A01.A09(cXVar);
    }

    public final void A02(InterfaceC1386cV interfaceC1386cV) {
        this.A01.A0A(interfaceC1386cV);
    }

    public final void A03(DspViewableNode dspViewableNode) {
        this.A00.A01(dspViewableNode);
    }

    public final void A04(DspViewableNode dspViewableNode, C1390ca c1390ca) {
        this.A00.A02(dspViewableNode, c1390ca);
    }
}
