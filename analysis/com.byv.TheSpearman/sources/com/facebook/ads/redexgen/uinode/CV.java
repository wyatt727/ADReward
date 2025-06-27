package com.facebook.ads.redexgen.uinode;

import com.facebook.ads.internal.exoplayer2.thirdparty.drm.DrmInitData;

/* loaded from: assets/audience_network.dex */
public final class CV {
    public static String[] A0A = {"VV6EzFzDFGyxh7278LhkWh1nAnO", "a", "RIeoUtwh2k0Lp", "KiUc8yTTjWF6Y9v", "6tIA8m5WM2YSgVpCAFtgKZOFEkm", "A00z45", "ej2X1eDppCFfwh6aI5B812e88v7VHLnd", "obdd9bh"};
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public CP A04;
    public C0654Ce A05;
    public final C4 A06;
    public final C0656Cg A07 = new C0656Cg();
    public final C0788Hz A09 = new C0788Hz(1);
    public final C0788Hz A08 = new C0788Hz();

    public CV(C4 c4) {
        this.A06 = c4;
    }

    private C0655Cf A00() {
        int i = this.A07.A07.A02;
        if (this.A07.A08 != null) {
            C0656Cg c0656Cg = this.A07;
            if (A0A[2].length() == 16) {
                throw new RuntimeException();
            }
            A0A[2] = "yH";
            return c0656Cg.A08;
        }
        return this.A05.A00(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A01() {
        if (!this.A07.A0A) {
            return;
        }
        C0788Hz c0788Hz = this.A07.A09;
        C0655Cf encryptionBox = A00();
        if (encryptionBox.A00 != 0) {
            c0788Hz.A0Z(encryptionBox.A00);
        }
        if (this.A07.A0H[this.A01]) {
            c0788Hz.A0Z(c0788Hz.A0I() * 6);
        }
    }

    public final int A03() {
        C0788Hz c0788Hz;
        int vectorSize;
        if (!this.A07.A0A) {
            return 0;
        }
        C0655Cf c0655CfA00 = A00();
        if (A0A[5].length() != 6) {
            throw new RuntimeException();
        }
        A0A[1] = "c";
        if (c0655CfA00.A00 != 0) {
            c0788Hz = this.A07.A09;
            vectorSize = c0655CfA00.A00;
        } else {
            byte[] initVectorData = c0655CfA00.A04;
            this.A08.A0b(initVectorData, initVectorData.length);
            c0788Hz = this.A08;
            vectorSize = initVectorData.length;
        }
        boolean z = this.A07.A0H[this.A01];
        this.A09.A00[0] = (byte) ((z ? 128 : 0) | vectorSize);
        this.A09.A0Y(0);
        C4 c4 = this.A06;
        C0788Hz initializationVectorData = this.A09;
        c4.AFR(initializationVectorData, 1);
        this.A06.AFR(c0788Hz, vectorSize);
        if (!z) {
            return vectorSize + 1;
        }
        C0788Hz c0788Hz2 = this.A07.A09;
        int iA0I = c0788Hz2.A0I();
        c0788Hz2.A0Z(-2);
        int i = (iA0I * 6) + 2;
        this.A06.AFR(c0788Hz2, i);
        return vectorSize + 1 + i;
    }

    public final void A04() {
        this.A07.A01();
        this.A01 = 0;
        this.A02 = 0;
        this.A00 = 0;
        this.A03 = 0;
    }

    public final void A05(long j) {
        long jA01 = C9W.A01(j);
        for (int i = this.A01; i < this.A07.A00 && this.A07.A00(i) < jA01; i++) {
            if (this.A07.A0I[i]) {
                this.A03 = i;
            }
        }
    }

    public final void A06(DrmInitData drmInitData) {
        C0655Cf encryptionBox = this.A05.A00(this.A07.A07.A02);
        this.A06.A5n(this.A05.A07.A0I(drmInitData.A02(encryptionBox != null ? encryptionBox.A02 : null)));
    }

    public final void A07(C0654Ce c0654Ce, CP cp) {
        this.A05 = (C0654Ce) AbstractC0763Ha.A01(c0654Ce);
        this.A04 = (CP) AbstractC0763Ha.A01(cp);
        this.A06.A5n(c0654Ce.A07);
        A04();
    }

    public final boolean A08() {
        this.A01++;
        int i = this.A00 + 1;
        this.A00 = i;
        int[] iArr = this.A07.A0E;
        int i2 = this.A02;
        if (i != iArr[i2]) {
            return true;
        }
        this.A02 = i2 + 1;
        this.A00 = 0;
        return false;
    }
}
