package com.facebook.ads.redexgen.uinode;

import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class D4 {
    public static String[] A05 = {"iFsZT", "GIrwtjs5Y9yKRnQprRliKFssvnZ626eg", "zaANWFIQpg9VP0PHXhMzOh2uHy4vuPX", "SXuHzyzb5Klrd", "166Epp2tdWdGB7BvYI0", "pZQUhJ", "kvzgTqzGY4juGUAH8hr6m1KZDAgAa2C", "eJKNB8bktVjQii80zBcR1gNx5SzXp2s0"};
    public int A00;
    public byte[] A01;
    public boolean A02;
    public boolean A03;
    public final int A04;

    public D4(int i, int i2) {
        this.A04 = i;
        byte[] bArr = new byte[i2 + 3];
        this.A01 = bArr;
        bArr[2] = 1;
    }

    public final void A00() {
        this.A03 = false;
        this.A02 = false;
    }

    public final void A01(int i) {
        AbstractC0763Ha.A04(!this.A03);
        boolean z = i == this.A04;
        this.A03 = z;
        if (z) {
            this.A00 = 3;
            this.A02 = false;
        }
    }

    public final void A02(byte[] bArr, int i, int i2) {
        if (!this.A03) {
            return;
        }
        int i3 = i2 - i;
        byte[] bArr2 = this.A01;
        int length = bArr2.length;
        int i4 = this.A00;
        int readLength = i4 + i3;
        if (length < readLength) {
            int readLength2 = (i4 + i3) * 2;
            this.A01 = Arrays.copyOf(bArr2, readLength2);
        }
        byte[] bArr3 = this.A01;
        int readLength3 = this.A00;
        System.arraycopy(bArr, i, bArr3, readLength3, i3);
        int readLength4 = this.A00;
        this.A00 = readLength4 + i3;
    }

    public final boolean A03() {
        return this.A02;
    }

    public final boolean A04(int i) {
        if (!this.A03) {
            return false;
        }
        int i2 = this.A00;
        String[] strArr = A05;
        if (strArr[2].length() != strArr[6].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A05;
        strArr2[0] = "YBe0L";
        strArr2[4] = "0OBHzAzgulxKkAZ8kiy";
        this.A00 = i2 - i;
        this.A03 = false;
        this.A02 = true;
        return true;
    }
}
