package com.facebook.ads.redexgen.uinode;

import androidx.core.view.MotionEventCompat;

/* renamed from: com.facebook.ads.redexgen.X.Hy, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0787Hy {
    public byte[] A00;
    public int A01;
    public int A02;
    public int A03;

    public C0787Hy() {
    }

    public C0787Hy(byte[] bArr) {
        this(bArr, bArr.length);
    }

    public C0787Hy(byte[] bArr, int i) {
        this.A00 = bArr;
        this.A02 = i;
    }

    private void A00() {
        int i;
        int i2 = this.A03;
        AbstractC0763Ha.A04(i2 >= 0 && (i2 < (i = this.A02) || (i2 == i && this.A01 == 0)));
    }

    public final int A01() {
        return ((this.A02 - this.A03) * 8) - this.A01;
    }

    public final int A02() {
        AbstractC0763Ha.A04(this.A01 == 0);
        return this.A03;
    }

    public final int A03() {
        return (this.A03 * 8) + this.A01;
    }

    public final int A04(int i) {
        int i2;
        if (i == 0) {
            return 0;
        }
        int i3 = 0;
        this.A01 += i;
        while (true) {
            i2 = this.A01;
            if (i2 <= 8) {
                break;
            }
            int i4 = i2 - 8;
            this.A01 = i4;
            byte[] bArr = this.A00;
            int returnValue = this.A03;
            this.A03 = returnValue + 1;
            i3 |= (bArr[returnValue] & 255) << i4;
        }
        byte[] bArr2 = this.A00;
        int i5 = this.A03;
        int returnValue2 = bArr2[i5] & 255;
        int i6 = i3 | (returnValue2 >> (8 - i2));
        int returnValue3 = 32 - i;
        int i7 = i6 & ((-1) >>> returnValue3);
        if (i2 == 8) {
            this.A01 = 0;
            this.A03 = i5 + 1;
        }
        A00();
        return i7;
    }

    public final void A05() {
        if (this.A01 == 0) {
            return;
        }
        this.A01 = 0;
        this.A03++;
        A00();
    }

    public final void A06() {
        int i = this.A01 + 1;
        this.A01 = i;
        if (i == 8) {
            this.A01 = 0;
            this.A03++;
        }
        A00();
    }

    public final void A07(int i) {
        int i2 = i / 8;
        this.A03 = i2;
        this.A01 = i - (i2 * 8);
        A00();
    }

    public final void A08(int i) {
        int numBytes = i / 8;
        int i2 = this.A03 + numBytes;
        this.A03 = i2;
        int i3 = this.A01 + (i - (numBytes * 8));
        this.A01 = i3;
        if (i3 > 7) {
            this.A03 = i2 + 1;
            this.A01 = i3 - 8;
        }
        A00();
    }

    public final void A09(int i) {
        AbstractC0763Ha.A04(this.A01 == 0);
        this.A03 += i;
        A00();
    }

    public final void A0A(int firstByteInputBits, int i) {
        if (i < 32) {
            firstByteInputBits &= (1 << i) - 1;
        }
        int iMin = Math.min(8 - this.A01, i);
        int remainingBitsToRead = this.A01;
        int firstByteRightPaddingSize = (8 - remainingBitsToRead) - iMin;
        int firstByteReadSize = MotionEventCompat.ACTION_POINTER_INDEX_MASK >> remainingBitsToRead;
        int firstByteReadSize2 = firstByteReadSize | ((1 << firstByteRightPaddingSize) - 1);
        byte[] bArr = this.A00;
        int firstByteBitmask = this.A03;
        byte b = (byte) (bArr[firstByteBitmask] & firstByteReadSize2);
        bArr[firstByteBitmask] = b;
        int firstByteReadSize3 = b | ((firstByteInputBits >>> (i - iMin)) << firstByteRightPaddingSize);
        bArr[firstByteBitmask] = (byte) firstByteReadSize3;
        int firstByteRightPaddingSize2 = i - iMin;
        int firstByteBitmask2 = firstByteBitmask + 1;
        while (firstByteRightPaddingSize2 > 8) {
            int firstByteReadSize4 = firstByteBitmask2 + 1;
            this.A00[firstByteBitmask2] = (byte) (firstByteInputBits >>> (firstByteRightPaddingSize2 - 8));
            firstByteRightPaddingSize2 -= 8;
            firstByteBitmask2 = firstByteReadSize4;
        }
        int lastByteRightPaddingSize = 8 - firstByteRightPaddingSize2;
        byte[] bArr2 = this.A00;
        int firstByteReadSize5 = bArr2[firstByteBitmask2];
        byte b2 = (byte) (firstByteReadSize5 & ((1 << lastByteRightPaddingSize) - 1));
        bArr2[firstByteBitmask2] = b2;
        int firstByteReadSize6 = b2 | ((firstByteInputBits & ((1 << firstByteRightPaddingSize2) - 1)) << lastByteRightPaddingSize);
        bArr2[firstByteBitmask2] = (byte) firstByteReadSize6;
        A08(i);
        A00();
    }

    public final void A0B(byte[] bArr) {
        A0C(bArr, bArr.length);
    }

    public final void A0C(byte[] bArr, int i) {
        this.A00 = bArr;
        this.A03 = 0;
        this.A01 = 0;
        this.A02 = i;
    }

    public final void A0D(byte[] bArr, int i, int i2) {
        int i3 = (i2 >> 3) + i;
        while (i < i3) {
            byte[] bArr2 = this.A00;
            int to = this.A03;
            int i4 = to + 1;
            this.A03 = i4;
            int to2 = bArr2[to];
            int i5 = this.A01;
            bArr[i] = (byte) (to2 << i5);
            int i6 = bArr[i];
            int to3 = bArr2[i4];
            bArr[i] = (byte) (((255 & to3) >> (8 - i5)) | i6);
            i++;
        }
        int i7 = i2 & 7;
        if (i7 == 0) {
            return;
        }
        int bitsLeft = bArr[i3];
        int to4 = 255 >> i7;
        bArr[i3] = (byte) (bitsLeft & to4);
        int i8 = this.A01;
        int to5 = i8 + i7;
        if (to5 > 8) {
            int i9 = bArr[i3];
            byte[] bArr3 = this.A00;
            int bitsLeft2 = this.A03;
            int to6 = bitsLeft2 + 1;
            this.A03 = to6;
            int to7 = bArr3[bitsLeft2];
            bArr[i3] = (byte) (i9 | ((to7 & 255) << i8));
            this.A01 = i8 - 8;
        }
        int i10 = this.A01 + i7;
        this.A01 = i10;
        byte[] bArr4 = this.A00;
        int lastDataByteTrailingBits = this.A03;
        int to8 = bArr4[lastDataByteTrailingBits];
        int i11 = 255 & to8;
        int to9 = 8 - i10;
        int i12 = i11 >> to9;
        int bitsLeft3 = bArr[i3];
        int to10 = 8 - i7;
        bArr[i3] = (byte) (bitsLeft3 | ((byte) (i12 << to10)));
        if (i10 == 8) {
            this.A01 = 0;
            int to11 = lastDataByteTrailingBits + 1;
            this.A03 = to11;
        }
        A00();
    }

    public final void A0E(byte[] bArr, int i, int i2) {
        AbstractC0763Ha.A04(this.A01 == 0);
        System.arraycopy(this.A00, this.A03, bArr, i, i2);
        this.A03 += i2;
        A00();
    }

    public final boolean A0F() {
        boolean returnValue = (this.A00[this.A03] & (128 >> this.A01)) != 0;
        A06();
        return returnValue;
    }
}
