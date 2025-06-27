package com.facebook.ads.redexgen.uinode;

import android.os.Handler;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: assets/audience_network.dex */
public final class LX implements QN {
    public static String[] A0C = {"ua4Z1F3Vn1tdURaP0tTj5Z", "VlqKJtfjGqtNso0qX2A6lmnvOZsZ2xTE", "1pb0xsuTqC4ySw1JjiCpjHk6a0KK", "HW9a8amQa56v9usqS4J3KzzxMBRp7oUY", "lzg290ZQq0ECc78zj7A2Pt", "9JBQniCNh78hbF6UnJo6", "DIRAqcjzgSQz4x9q8OrEXdtc6Zce0V5V", "FPN1H6gS7aT4O5CCkRk249I"};
    public SA A01;
    public boolean A02;
    public boolean A03;
    public boolean A04;
    public final AbstractC0951On A07 = new AbstractC0951On() { // from class: com.facebook.ads.redexgen.X.8p
        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.facebook.ads.redexgen.uinode.AbstractC05698s
        /* renamed from: A00, reason: merged with bridge method [inline-methods] */
        public final void A03(AnonymousClass98 anonymousClass98) {
            this.A00.A05.removeCallbacksAndMessages(null);
            if (this.A00.A0D(EnumC0998Qi.A05)) {
                this.A00.A03();
                this.A00.A06(true, false);
            }
            this.A00.A03 = true;
        }
    };
    public final AbstractC0984Pu A06 = new AbstractC0984Pu() { // from class: com.facebook.ads.redexgen.X.8R
        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.facebook.ads.redexgen.uinode.AbstractC05698s
        /* renamed from: A00, reason: merged with bridge method [inline-methods] */
        public final void A03(C9H c9h) {
            this.A00.A03();
            this.A00.A06(false, false);
            this.A00.A03 = true;
        }
    };
    public final O7 A08 = new C8P(this);
    public final NQ A09 = new NQ() { // from class: com.facebook.ads.redexgen.X.8O
        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.facebook.ads.redexgen.uinode.AbstractC05698s
        /* renamed from: A00, reason: merged with bridge method [inline-methods] */
        public final void A03(AnonymousClass93 anonymousClass93) {
            if (this.A00.A02 || !this.A00.A0D(EnumC0998Qi.A05)) {
                return;
            }
            this.A00.A03();
            this.A00.A06(true, false);
        }
    };
    public final MX A0A = new C8N(this);
    public final Handler A05 = new Handler();
    public final List<InterfaceC0999Qj> A0B = new ArrayList();
    public int A00 = 2000;

    public LX(boolean z) {
        this.A02 = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A03() {
        this.A05.removeCallbacksAndMessages(null);
        Iterator<InterfaceC0999Qj> it = this.A0B.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            if (A0C[2].length() != 28) {
                throw new RuntimeException();
            }
            A0C[1] = "SzC94btdcN1119JNHgRanzsWdfoutew0";
            if (zHasNext) {
                it.next().cancel();
            } else {
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A06(boolean z, boolean z2) {
        for (InterfaceC0999Qj interfaceC0999Qj : this.A0B) {
            if (A0C[2].length() != 28) {
                throw new RuntimeException();
            }
            A0C[1] = "qWrr7wKcnD6M25Nm7U3j0NNRElcnIA4d";
            interfaceC0999Qj.A3Y(z, z2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean A0D(EnumC0998Qi enumC0998Qi) {
        Iterator<InterfaceC0999Qj> it = this.A0B.iterator();
        while (it.hasNext()) {
            if (it.next().A82() != enumC0998Qi) {
                return false;
            }
        }
        return true;
    }

    public final void A0E() {
        this.A0B.clear();
    }

    public final void A0F() {
        if (this.A02) {
            this.A05.removeCallbacksAndMessages(null);
            this.A02 = false;
        }
    }

    public final void A0G() {
        this.A04 = true;
        this.A03 = true;
        A06(false, false);
    }

    public final void A0H(int i) {
        this.A00 = i;
    }

    public final void A0I(InterfaceC0999Qj interfaceC0999Qj) {
        this.A0B.add(interfaceC0999Qj);
    }

    public final boolean A0J() {
        return this.A02;
    }

    @Override // com.facebook.ads.redexgen.uinode.QN
    public final void A9R(SA sa) {
        this.A01 = sa;
        sa.getEventBus().A03(this.A07, this.A0A, this.A08, this.A09, this.A06);
    }

    @Override // com.facebook.ads.redexgen.uinode.QN
    public final void AGl(SA sa) {
        A03();
        sa.getEventBus().A04(this.A06, this.A0A, this.A08, this.A09, this.A07);
        this.A01 = null;
    }
}
