package com.mbridge.msdk.playercommon.exoplayer2.extractor.ogg;

import com.mbridge.msdk.playercommon.exoplayer2.util.Assertions;

/* loaded from: classes4.dex */
final class VorbisBitArray {
    private int bitOffset;
    private final int byteLimit;
    private int byteOffset;
    private final byte[] data;

    public VorbisBitArray(byte[] bArr) {
        this.data = bArr;
        this.byteLimit = bArr.length;
    }

    public final void reset() {
        this.byteOffset = 0;
        this.bitOffset = 0;
    }

    public final boolean readBit() {
        boolean z = (((this.data[this.byteOffset] & 255) >> this.bitOffset) & 1) == 1;
        skipBits(1);
        return z;
    }

    public final int readBits(int i) {
        int i2 = this.byteOffset;
        int iMin = Math.min(i, 8 - this.bitOffset);
        int i3 = i2 + 1;
        int i4 = ((this.data[i2] & 255) >> this.bitOffset) & (255 >> (8 - iMin));
        while (iMin < i) {
            i4 |= (this.data[i3] & 255) << iMin;
            iMin += 8;
            i3++;
        }
        int i5 = i4 & ((-1) >>> (32 - i));
        skipBits(i);
        return i5;
    }

    public final void skipBits(int i) {
        int i2 = i / 8;
        int i3 = this.byteOffset + i2;
        this.byteOffset = i3;
        int i4 = this.bitOffset + (i - (i2 * 8));
        this.bitOffset = i4;
        if (i4 > 7) {
            this.byteOffset = i3 + 1;
            this.bitOffset = i4 - 8;
        }
        assertValidOffset();
    }

    public final int getPosition() {
        return (this.byteOffset * 8) + this.bitOffset;
    }

    public final void setPosition(int i) {
        int i2 = i / 8;
        this.byteOffset = i2;
        this.bitOffset = i - (i2 * 8);
        assertValidOffset();
    }

    public final int bitsLeft() {
        return ((this.byteLimit - this.byteOffset) * 8) - this.bitOffset;
    }

    private void assertValidOffset() {
        int i;
        int i2 = this.byteOffset;
        Assertions.checkState(i2 >= 0 && (i2 < (i = this.byteLimit) || (i2 == i && this.bitOffset == 0)));
    }
}
