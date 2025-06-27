package com.facebook.ads.redexgen.uinode;

import java.util.LinkedList;
import java.util.List;

/* loaded from: assets/audience_network.dex */
public final class JZ {
    public final JX A0B;
    public final boolean A0F;
    public final String A0C = JZ.class.getSimpleName();
    public final int A07 = 101;
    public final int A0A = 102;
    public final int A08 = 103;
    public final int A03 = 104;
    public final int A09 = 105;
    public final int A02 = 106;
    public final int A04 = 107;
    public final int A05 = 108;
    public final int A06 = 109;
    public final int A01 = 110;
    public final boolean A0E = false;
    public long A00 = -1;
    public final List<JY> A0D = new LinkedList();

    public JZ(C05357f c05357f, JX jx) {
        int nativeViewabilityHistorySamplingRate = Ij.A0D(c05357f);
        if (nativeViewabilityHistorySamplingRate < 1) {
            this.A0F = false;
        } else {
            this.A0F = c05357f.A08().A00() < 1.0d / ((double) nativeViewabilityHistorySamplingRate);
        }
        this.A0B = jx;
    }

    private int A00() {
        return this.A0B.A6c();
    }

    private int A01() {
        if (this.A00 > 0) {
            return (int) (System.currentTimeMillis() - this.A00);
        }
        return -1;
    }

    private void A03(JY jy) {
        synchronized (this.A0D) {
            this.A0D.add(jy);
        }
    }

    public final void A04() {
        if (!this.A0F) {
            return;
        }
        A03(new JY(A01(), 110, A00(), null));
    }

    public final void A05() {
        if (!this.A0F) {
            return;
        }
        A03(new JY(A01(), 106, A00(), null));
    }

    public final void A06() {
        if (!this.A0F) {
            return;
        }
        A03(new JY(A01(), 104, A00(), null));
    }

    public final void A07() {
        if (!this.A0F) {
            return;
        }
        A03(new JY(A01(), 109, -1, null));
    }

    public final void A08() {
        if (!this.A0F) {
            return;
        }
        A03(new JY(A01(), 108, A00(), null));
    }

    public final void A09() {
        if (!this.A0F) {
            return;
        }
        this.A00 = System.currentTimeMillis();
        A03(new JY(0, 101, -1, null));
    }

    public final void A0A() {
        if (!this.A0F) {
            return;
        }
        A03(new JY(A01(), 105, A00(), null));
    }

    public final void A0B() {
        if (!this.A0F) {
            return;
        }
        A03(new JY(A01(), 102, A00(), null));
    }

    public final void A0C(C05357f c05357f, String str) {
        if (!this.A0F) {
            return;
        }
        A03(new JY(A01(), 103, A00(), null));
        ExecutorC0879Lt.A06.execute(new JW(this, str, c05357f));
    }
}
