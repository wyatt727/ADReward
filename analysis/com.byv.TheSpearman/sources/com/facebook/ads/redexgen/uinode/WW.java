package com.facebook.ads.redexgen.uinode;

import android.os.Handler;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: assets/audience_network.dex */
public abstract class WW implements InterfaceC0705Eq {
    public static String[] A05 = {"2", "A1R5XmGNdue", "Xf2fF", "2MZr802CwBgh98iwI2LX9r8AFH0stAP", "PWtCslqWMOhLlWMecFeGOSMcL", "Nab9jbcw8W2RSLeSFi8qaY40Uhnm56i", "UlYKNWRAV2IAyBS", "QHLbHyQnMMy3J3Z"};
    public Y6 A00;
    public AH A01;
    public Object A02;
    public final ArrayList<InterfaceC0704Ep> A04 = new ArrayList<>(1);
    public final F1 A03 = new F1();

    public abstract void A02();

    public abstract void A03(Y6 y6, boolean z);

    public final F1 A00(C0703Eo c0703Eo) {
        return this.A03.A02(0, c0703Eo, 0L);
    }

    public final void A01(AH ah, Object obj) {
        this.A01 = ah;
        this.A02 = obj;
        Iterator<InterfaceC0704Ep> it = this.A04.iterator();
        while (it.hasNext()) {
            it.next().ADA(this, ah, obj);
        }
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC0705Eq
    public final void A3O(Handler handler, F4 f4) {
        this.A03.A07(handler, f4);
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC0705Eq
    public final void AE7(Y6 y6, boolean z, InterfaceC0704Ep interfaceC0704Ep) {
        Y6 y62 = this.A00;
        AbstractC0763Ha.A03(y62 == null || y62 == y6);
        this.A04.add(interfaceC0704Ep);
        if (this.A00 == null) {
            this.A00 = y6;
            A03(y6, z);
        } else {
            AH ah = this.A01;
            if (ah == null) {
                return;
            }
            interfaceC0704Ep.ADA(this, ah, this.A02);
        }
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC0705Eq
    public final void AEb(InterfaceC0704Ep interfaceC0704Ep) {
        this.A04.remove(interfaceC0704Ep);
        if (this.A04.isEmpty()) {
            this.A00 = null;
            this.A01 = null;
            if (A05[2].length() == 23) {
                throw new RuntimeException();
            }
            A05[2] = "TEgrTEJPhaeJK53iaQZF";
            this.A02 = null;
            A02();
        }
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC0705Eq
    public final void AF7(F4 f4) {
        this.A03.A0D(f4);
    }
}
