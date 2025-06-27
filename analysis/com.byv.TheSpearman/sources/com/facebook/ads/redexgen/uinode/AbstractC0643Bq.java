package com.facebook.ads.redexgen.uinode;

import java.util.ArrayDeque;
import java.util.PriorityQueue;

/* renamed from: com.facebook.ads.redexgen.X.Bq, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC0643Bq implements WL {
    public static String[] A06 = {"KcRMvDVLZNgc0ooVkhN4ahdKcengok4t", "7pRgSHJJ", "GNHbGuKbKosn0JAz4xkib8iBcGb5WNz5", "hJNyShuwv1tZ2cTKHVoLW9isLSOVhBhj", "H7WHQ", "6cZmXLfi2DPGYj7ZmxIdQ5A", "b2Hmg2LD", "cSsJl4a3bVOvbO76ENMD9MAL1lcw3B"};
    public long A00;
    public long A01;
    public C04754q A02;
    public final ArrayDeque<C04754q> A03 = new ArrayDeque<>();
    public final ArrayDeque<AbstractC0644Br> A04;
    public final PriorityQueue<C04754q> A05;

    public abstract WI A0N();

    public abstract void A0P(C5 c5);

    public abstract boolean A0R();

    public AbstractC0643Bq() {
        for (int i = 0; i < 10; i++) {
            this.A03.add(new C04754q());
        }
        this.A04 = new ArrayDeque<>();
        for (int i2 = 0; i2 < 2; i2++) {
            this.A04.add(new C04724n(this));
        }
        this.A05 = new PriorityQueue<>();
    }

    private void A0K(C04754q c04754q) {
        c04754q.A07();
        this.A03.add(c04754q);
    }

    @Override // com.facebook.ads.redexgen.uinode.BB
    /* renamed from: A0L, reason: merged with bridge method [inline-methods] */
    public C5 A54() throws C0728Fp {
        AbstractC0763Ha.A04(this.A02 == null);
        boolean zIsEmpty = this.A03.isEmpty();
        if (A06[4].length() != 5) {
            throw new RuntimeException();
        }
        A06[4] = "MSCQz";
        if (zIsEmpty) {
            return null;
        }
        C04754q c04754qPollFirst = this.A03.pollFirst();
        this.A02 = c04754qPollFirst;
        return c04754qPollFirst;
    }

    @Override // com.facebook.ads.redexgen.uinode.BB
    /* renamed from: A0M, reason: merged with bridge method [inline-methods] */
    public AbstractC0644Br A55() throws C0728Fp {
        if (this.A04.isEmpty()) {
            return null;
        }
        while (!this.A05.isEmpty() && ((C1185Xr) this.A05.peek()).A00 <= this.A00) {
            C04754q c04754qPoll = this.A05.poll();
            if (c04754qPoll.A04()) {
                AbstractC0644Br abstractC0644BrPollFirst = this.A04.pollFirst();
                abstractC0644BrPollFirst.A00(4);
                A0K(c04754qPoll);
                String[] strArr = A06;
                if (strArr[1].length() != strArr[6].length()) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A06;
                strArr2[2] = "Z7l20gfPvvtRCAhrDUNIN8ivECfXDju3";
                strArr2[3] = "MHWMj6Fd4O5yELPFkyyjrniha9DdnabU";
                return abstractC0644BrPollFirst;
            }
            A0P(c04754qPoll);
            if (A0R()) {
                WI wiA0N = A0N();
                if (!c04754qPoll.A03()) {
                    AbstractC0644Br abstractC0644BrPollFirst2 = this.A04.pollFirst();
                    abstractC0644BrPollFirst2.A09(((C1185Xr) c04754qPoll).A00, wiA0N, Long.MAX_VALUE);
                    A0K(c04754qPoll);
                    return abstractC0644BrPollFirst2;
                }
            }
            A0K(c04754qPoll);
        }
        return null;
    }

    @Override // com.facebook.ads.redexgen.uinode.BB
    /* renamed from: A0O, reason: merged with bridge method [inline-methods] */
    public void AEG(C5 c5) throws C0728Fp {
        AbstractC0763Ha.A03(c5 == this.A02);
        if (A06[0].charAt(9) != 'N') {
            throw new RuntimeException();
        }
        String[] strArr = A06;
        strArr[7] = "h6rCbn8hi0Qg5CvGAi8vHFDPjl0uqV";
        strArr[5] = "6Me2Lvii1P8K0tFjrCRJacm";
        if (c5.A03()) {
            A0K(this.A02);
        } else {
            C04754q c04754q = this.A02;
            long j = this.A01;
            this.A01 = 1 + j;
            c04754q.A00 = j;
            this.A05.add(this.A02);
        }
        this.A02 = null;
    }

    public final void A0Q(AbstractC0644Br abstractC0644Br) {
        abstractC0644Br.A07();
        this.A04.add(abstractC0644Br);
    }

    @Override // com.facebook.ads.redexgen.uinode.BB
    public void AEV() {
    }

    @Override // com.facebook.ads.redexgen.uinode.WL
    public void AGB(long j) {
        this.A00 = j;
    }

    @Override // com.facebook.ads.redexgen.uinode.BB
    public void flush() {
        this.A01 = 0L;
        this.A00 = 0L;
        while (!this.A05.isEmpty()) {
            A0K(this.A05.poll());
        }
        C04754q c04754q = this.A02;
        if (c04754q != null) {
            A0K(c04754q);
            this.A02 = null;
        }
    }
}
