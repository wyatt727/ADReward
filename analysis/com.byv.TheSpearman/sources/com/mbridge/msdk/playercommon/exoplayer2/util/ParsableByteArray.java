package com.mbridge.msdk.playercommon.exoplayer2.util;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import okio.Utf8;

/* loaded from: classes4.dex */
public final class ParsableByteArray {
    public byte[] data;
    private int limit;
    private int position;

    public ParsableByteArray() {
    }

    public ParsableByteArray(int i) {
        this.data = new byte[i];
        this.limit = i;
    }

    public ParsableByteArray(byte[] bArr) {
        this.data = bArr;
        this.limit = bArr.length;
    }

    public ParsableByteArray(byte[] bArr, int i) {
        this.data = bArr;
        this.limit = i;
    }

    public final void reset(int i) {
        reset(capacity() < i ? new byte[i] : this.data, i);
    }

    public final void reset(byte[] bArr, int i) {
        this.data = bArr;
        this.limit = i;
        this.position = 0;
    }

    public final void reset() {
        this.position = 0;
        this.limit = 0;
    }

    public final int bytesLeft() {
        return this.limit - this.position;
    }

    public final int limit() {
        return this.limit;
    }

    public final void setLimit(int i) {
        Assertions.checkArgument(i >= 0 && i <= this.data.length);
        this.limit = i;
    }

    public final int getPosition() {
        return this.position;
    }

    public final int capacity() {
        byte[] bArr = this.data;
        if (bArr == null) {
            return 0;
        }
        return bArr.length;
    }

    public final void setPosition(int i) {
        Assertions.checkArgument(i >= 0 && i <= this.limit);
        this.position = i;
    }

    public final void skipBytes(int i) {
        setPosition(this.position + i);
    }

    public final void readBytes(ParsableBitArray parsableBitArray, int i) {
        readBytes(parsableBitArray.data, 0, i);
        parsableBitArray.setPosition(0);
    }

    public final void readBytes(byte[] bArr, int i, int i2) {
        System.arraycopy(this.data, this.position, bArr, i, i2);
        this.position += i2;
    }

    public final void readBytes(ByteBuffer byteBuffer, int i) {
        byteBuffer.put(this.data, this.position, i);
        this.position += i;
    }

    public final int peekUnsignedByte() {
        return this.data[this.position] & 255;
    }

    public final char peekChar() {
        byte[] bArr = this.data;
        int i = this.position;
        return (char) ((bArr[i + 1] & 255) | ((bArr[i] & 255) << 8));
    }

    public final int readUnsignedByte() {
        byte[] bArr = this.data;
        int i = this.position;
        this.position = i + 1;
        return bArr[i] & 255;
    }

    public final int readUnsignedShort() {
        byte[] bArr = this.data;
        int i = this.position;
        int i2 = i + 1;
        this.position = i2;
        int i3 = (bArr[i] & 255) << 8;
        this.position = i2 + 1;
        return (bArr[i2] & 255) | i3;
    }

    public final int readLittleEndianUnsignedShort() {
        byte[] bArr = this.data;
        int i = this.position;
        int i2 = i + 1;
        this.position = i2;
        int i3 = bArr[i] & 255;
        this.position = i2 + 1;
        return ((bArr[i2] & 255) << 8) | i3;
    }

    public final short readShort() {
        byte[] bArr = this.data;
        int i = this.position;
        int i2 = i + 1;
        this.position = i2;
        int i3 = (bArr[i] & 255) << 8;
        this.position = i2 + 1;
        return (short) ((bArr[i2] & 255) | i3);
    }

    public final short readLittleEndianShort() {
        byte[] bArr = this.data;
        int i = this.position;
        int i2 = i + 1;
        this.position = i2;
        int i3 = bArr[i] & 255;
        this.position = i2 + 1;
        return (short) (((bArr[i2] & 255) << 8) | i3);
    }

    public final int readUnsignedInt24() {
        byte[] bArr = this.data;
        int i = this.position;
        int i2 = i + 1;
        this.position = i2;
        int i3 = (bArr[i] & 255) << 16;
        int i4 = i2 + 1;
        this.position = i4;
        int i5 = i3 | ((bArr[i2] & 255) << 8);
        this.position = i4 + 1;
        return (bArr[i4] & 255) | i5;
    }

    public final int readInt24() {
        byte[] bArr = this.data;
        int i = this.position;
        int i2 = i + 1;
        this.position = i2;
        int i3 = ((bArr[i] & 255) << 24) >> 8;
        int i4 = i2 + 1;
        this.position = i4;
        int i5 = i3 | ((bArr[i2] & 255) << 8);
        this.position = i4 + 1;
        return (bArr[i4] & 255) | i5;
    }

    public final int readLittleEndianInt24() {
        byte[] bArr = this.data;
        int i = this.position;
        int i2 = i + 1;
        this.position = i2;
        int i3 = bArr[i] & 255;
        int i4 = i2 + 1;
        this.position = i4;
        int i5 = i3 | ((bArr[i2] & 255) << 8);
        this.position = i4 + 1;
        return ((bArr[i4] & 255) << 16) | i5;
    }

    public final int readLittleEndianUnsignedInt24() {
        byte[] bArr = this.data;
        int i = this.position;
        int i2 = i + 1;
        this.position = i2;
        int i3 = bArr[i] & 255;
        int i4 = i2 + 1;
        this.position = i4;
        int i5 = i3 | ((bArr[i2] & 255) << 8);
        this.position = i4 + 1;
        return ((bArr[i4] & 255) << 16) | i5;
    }

    public final long readUnsignedInt() {
        byte[] bArr = this.data;
        int i = this.position + 1;
        this.position = i;
        long j = (bArr[r1] & 255) << 24;
        int i2 = i + 1;
        this.position = i2;
        int i3 = i2 + 1;
        this.position = i3;
        long j2 = j | ((bArr[i] & 255) << 16) | ((bArr[i2] & 255) << 8);
        this.position = i3 + 1;
        return j2 | (bArr[i3] & 255);
    }

    public final long readLittleEndianUnsignedInt() {
        byte[] bArr = this.data;
        int i = this.position + 1;
        this.position = i;
        long j = bArr[r1] & 255;
        int i2 = i + 1;
        this.position = i2;
        int i3 = i2 + 1;
        this.position = i3;
        long j2 = j | ((bArr[i] & 255) << 8) | ((bArr[i2] & 255) << 16);
        this.position = i3 + 1;
        return j2 | ((bArr[i3] & 255) << 24);
    }

    public final int readInt() {
        byte[] bArr = this.data;
        int i = this.position;
        int i2 = i + 1;
        this.position = i2;
        int i3 = (bArr[i] & 255) << 24;
        int i4 = i2 + 1;
        this.position = i4;
        int i5 = i3 | ((bArr[i2] & 255) << 16);
        int i6 = i4 + 1;
        this.position = i6;
        int i7 = i5 | ((bArr[i4] & 255) << 8);
        this.position = i6 + 1;
        return (bArr[i6] & 255) | i7;
    }

    public final int readLittleEndianInt() {
        byte[] bArr = this.data;
        int i = this.position;
        int i2 = i + 1;
        this.position = i2;
        int i3 = bArr[i] & 255;
        int i4 = i2 + 1;
        this.position = i4;
        int i5 = i3 | ((bArr[i2] & 255) << 8);
        int i6 = i4 + 1;
        this.position = i6;
        int i7 = i5 | ((bArr[i4] & 255) << 16);
        this.position = i6 + 1;
        return ((bArr[i6] & 255) << 24) | i7;
    }

    public final long readLong() {
        byte[] bArr = this.data;
        int i = this.position + 1;
        this.position = i;
        long j = (bArr[r1] & 255) << 56;
        int i2 = i + 1;
        this.position = i2;
        int i3 = i2 + 1;
        this.position = i3;
        long j2 = j | ((bArr[i] & 255) << 48) | ((bArr[i2] & 255) << 40);
        int i4 = i3 + 1;
        this.position = i4;
        long j3 = j2 | ((bArr[i3] & 255) << 32);
        int i5 = i4 + 1;
        this.position = i5;
        long j4 = j3 | ((bArr[i4] & 255) << 24);
        int i6 = i5 + 1;
        this.position = i6;
        long j5 = j4 | ((bArr[i5] & 255) << 16);
        int i7 = i6 + 1;
        this.position = i7;
        long j6 = j5 | ((bArr[i6] & 255) << 8);
        this.position = i7 + 1;
        return j6 | (bArr[i7] & 255);
    }

    public final long readLittleEndianLong() {
        byte[] bArr = this.data;
        int i = this.position + 1;
        this.position = i;
        long j = bArr[r1] & 255;
        int i2 = i + 1;
        this.position = i2;
        int i3 = i2 + 1;
        this.position = i3;
        long j2 = j | ((bArr[i] & 255) << 8) | ((bArr[i2] & 255) << 16);
        int i4 = i3 + 1;
        this.position = i4;
        long j3 = j2 | ((bArr[i3] & 255) << 24);
        int i5 = i4 + 1;
        this.position = i5;
        long j4 = j3 | ((bArr[i4] & 255) << 32);
        int i6 = i5 + 1;
        this.position = i6;
        long j5 = j4 | ((bArr[i5] & 255) << 40);
        int i7 = i6 + 1;
        this.position = i7;
        long j6 = j5 | ((bArr[i6] & 255) << 48);
        this.position = i7 + 1;
        return j6 | ((bArr[i7] & 255) << 56);
    }

    public final int readUnsignedFixedPoint1616() {
        byte[] bArr = this.data;
        int i = this.position;
        int i2 = i + 1;
        this.position = i2;
        int i3 = (bArr[i] & 255) << 8;
        int i4 = i2 + 1;
        this.position = i4;
        int i5 = (bArr[i2] & 255) | i3;
        this.position = i4 + 2;
        return i5;
    }

    public final int readSynchSafeInt() {
        return (readUnsignedByte() << 21) | (readUnsignedByte() << 14) | (readUnsignedByte() << 7) | readUnsignedByte();
    }

    public final int readUnsignedIntToInt() {
        int i = readInt();
        if (i >= 0) {
            return i;
        }
        throw new IllegalStateException("Top bit not zero: " + i);
    }

    public final int readLittleEndianUnsignedIntToInt() {
        int littleEndianInt = readLittleEndianInt();
        if (littleEndianInt >= 0) {
            return littleEndianInt;
        }
        throw new IllegalStateException("Top bit not zero: " + littleEndianInt);
    }

    public final long readUnsignedLongToLong() {
        long j = readLong();
        if (j >= 0) {
            return j;
        }
        throw new IllegalStateException("Top bit not zero: " + j);
    }

    public final float readFloat() {
        return Float.intBitsToFloat(readInt());
    }

    public final double readDouble() {
        return Double.longBitsToDouble(readLong());
    }

    public final String readString(int i) {
        return readString(i, Charset.forName(C.UTF8_NAME));
    }

    public final String readString(int i, Charset charset) {
        String str = new String(this.data, this.position, i, charset);
        this.position += i;
        return str;
    }

    public final String readNullTerminatedString(int i) {
        if (i == 0) {
            return "";
        }
        int i2 = this.position;
        int i3 = (i2 + i) - 1;
        String strFromUtf8Bytes = Util.fromUtf8Bytes(this.data, i2, (i3 >= this.limit || this.data[i3] != 0) ? i : i - 1);
        this.position += i;
        return strFromUtf8Bytes;
    }

    public final String readNullTerminatedString() {
        if (bytesLeft() == 0) {
            return null;
        }
        int i = this.position;
        while (i < this.limit && this.data[i] != 0) {
            i++;
        }
        byte[] bArr = this.data;
        int i2 = this.position;
        String strFromUtf8Bytes = Util.fromUtf8Bytes(bArr, i2, i - i2);
        this.position = i;
        if (i < this.limit) {
            this.position = i + 1;
        }
        return strFromUtf8Bytes;
    }

    public final String readLine() {
        if (bytesLeft() == 0) {
            return null;
        }
        int i = this.position;
        while (i < this.limit && !Util.isLinebreak(this.data[i])) {
            i++;
        }
        int i2 = this.position;
        if (i - i2 >= 3) {
            byte[] bArr = this.data;
            if (bArr[i2] == -17 && bArr[i2 + 1] == -69 && bArr[i2 + 2] == -65) {
                this.position = i2 + 3;
            }
        }
        byte[] bArr2 = this.data;
        int i3 = this.position;
        String strFromUtf8Bytes = Util.fromUtf8Bytes(bArr2, i3, i - i3);
        this.position = i;
        int i4 = this.limit;
        if (i == i4) {
            return strFromUtf8Bytes;
        }
        byte[] bArr3 = this.data;
        if (bArr3[i] == 13) {
            int i5 = i + 1;
            this.position = i5;
            if (i5 == i4) {
                return strFromUtf8Bytes;
            }
        }
        int i6 = this.position;
        if (bArr3[i6] == 10) {
            this.position = i6 + 1;
        }
        return strFromUtf8Bytes;
    }

    public final long readUtf8EncodedLong() {
        int i;
        int i2;
        long j = this.data[this.position];
        int i3 = 7;
        while (true) {
            if (i3 < 0) {
                break;
            }
            if (((1 << i3) & j) != 0) {
                i3--;
            } else if (i3 < 6) {
                j &= r6 - 1;
                i2 = 7 - i3;
            } else if (i3 == 7) {
                i2 = 1;
            }
        }
        i2 = 0;
        if (i2 == 0) {
            throw new NumberFormatException("Invalid UTF-8 sequence first byte: " + j);
        }
        for (i = 1; i < i2; i++) {
            if ((this.data[this.position + i] & 192) != 128) {
                throw new NumberFormatException("Invalid UTF-8 sequence continuation byte: " + j);
            }
            j = (j << 6) | (r3 & Utf8.REPLACEMENT_BYTE);
        }
        this.position += i2;
        return j;
    }
}
