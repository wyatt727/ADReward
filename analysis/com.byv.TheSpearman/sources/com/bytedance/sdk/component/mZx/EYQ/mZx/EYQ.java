package com.bytedance.sdk.component.mZx.EYQ.mZx;

import java.io.EOFException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;

/* compiled from: Buffer.java */
/* loaded from: classes2.dex */
public final class EYQ implements Td, mZx, Cloneable, ByteChannel {
    private static final byte[] Td = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102};
    Kbd EYQ;
    long mZx;

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public void close() {
    }

    @Override // java.io.Flushable
    public void flush() {
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return true;
    }

    public boolean EYQ() {
        return this.mZx == 0;
    }

    public byte mZx() {
        if (this.mZx == 0) {
            throw new IllegalStateException("size == 0");
        }
        Kbd kbd = this.EYQ;
        int i = kbd.mZx;
        int i2 = kbd.Td;
        int i3 = i + 1;
        byte b = kbd.EYQ[i];
        this.mZx--;
        if (i3 == i2) {
            this.EYQ = kbd.mZx();
            IPb.EYQ(kbd);
        } else {
            kbd.mZx = i3;
        }
        return b;
    }

    public String Td() {
        try {
            return EYQ(this.mZx, HX.EYQ);
        } catch (EOFException e) {
            throw new AssertionError(e);
        }
    }

    public String EYQ(long j, Charset charset) throws EOFException {
        HX.EYQ(this.mZx, 0L, j);
        if (charset == null) {
            throw new IllegalArgumentException("charset == null");
        }
        if (j > 2147483647L) {
            throw new IllegalArgumentException("byteCount > Integer.MAX_VALUE: ".concat(String.valueOf(j)));
        }
        if (j == 0) {
            return "";
        }
        Kbd kbd = this.EYQ;
        if (kbd.mZx + j > kbd.Td) {
            return new String(EYQ(j), charset);
        }
        String str = new String(kbd.EYQ, kbd.mZx, (int) j, charset);
        kbd.mZx = (int) (kbd.mZx + j);
        this.mZx -= j;
        if (kbd.mZx == kbd.Td) {
            this.EYQ = kbd.mZx();
            IPb.EYQ(kbd);
        }
        return str;
    }

    public byte[] EYQ(long j) throws EOFException {
        HX.EYQ(this.mZx, 0L, j);
        if (j > 2147483647L) {
            throw new IllegalArgumentException("byteCount > Integer.MAX_VALUE: ".concat(String.valueOf(j)));
        }
        byte[] bArr = new byte[(int) j];
        EYQ(bArr);
        return bArr;
    }

    public void EYQ(byte[] bArr) throws EOFException {
        int i = 0;
        while (i < bArr.length) {
            int iEYQ = EYQ(bArr, i, bArr.length - i);
            if (iEYQ == -1) {
                throw new EOFException();
            }
            i += iEYQ;
        }
    }

    public int EYQ(byte[] bArr, int i, int i2) {
        HX.EYQ(bArr.length, i, i2);
        Kbd kbd = this.EYQ;
        if (kbd == null) {
            return -1;
        }
        int iMin = Math.min(i2, kbd.Td - kbd.mZx);
        System.arraycopy(kbd.EYQ, kbd.mZx, bArr, i, iMin);
        kbd.mZx += iMin;
        this.mZx -= iMin;
        if (kbd.mZx == kbd.Td) {
            this.EYQ = kbd.mZx();
            IPb.EYQ(kbd);
        }
        return iMin;
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(ByteBuffer byteBuffer) throws IOException {
        Kbd kbd = this.EYQ;
        if (kbd == null) {
            return -1;
        }
        int iMin = Math.min(byteBuffer.remaining(), kbd.Td - kbd.mZx);
        byteBuffer.put(kbd.EYQ, kbd.mZx, iMin);
        kbd.mZx += iMin;
        this.mZx -= iMin;
        if (kbd.mZx == kbd.Td) {
            this.EYQ = kbd.mZx();
            IPb.EYQ(kbd);
        }
        return iMin;
    }

    public EYQ EYQ(String str) {
        return EYQ(str, 0, str.length());
    }

    public EYQ EYQ(String str, int i, int i2) {
        char cCharAt;
        if (str == null) {
            throw new IllegalArgumentException("string == null");
        }
        if (i < 0) {
            throw new IllegalArgumentException("beginIndex < 0: ".concat(String.valueOf(i)));
        }
        if (i2 < i) {
            throw new IllegalArgumentException("endIndex < beginIndex: " + i2 + " < " + i);
        }
        if (i2 > str.length()) {
            throw new IllegalArgumentException("endIndex > string.length: " + i2 + " > " + str.length());
        }
        while (i < i2) {
            char cCharAt2 = str.charAt(i);
            if (cCharAt2 < 128) {
                Kbd kbdTd = Td(1);
                byte[] bArr = kbdTd.EYQ;
                int i3 = kbdTd.Td - i;
                int iMin = Math.min(i2, 8192 - i3);
                int i4 = i + 1;
                bArr[i + i3] = (byte) cCharAt2;
                while (true) {
                    i = i4;
                    if (i >= iMin || (cCharAt = str.charAt(i)) >= 128) {
                        break;
                    }
                    i4 = i + 1;
                    bArr[i + i3] = (byte) cCharAt;
                }
                int i5 = (i3 + i) - kbdTd.Td;
                kbdTd.Td += i5;
                this.mZx += i5;
            } else {
                if (cCharAt2 < 2048) {
                    mZx((cCharAt2 >> 6) | 192);
                    mZx((cCharAt2 & '?') | 128);
                } else if (cCharAt2 < 55296 || cCharAt2 > 57343) {
                    mZx((cCharAt2 >> '\f') | 224);
                    mZx(((cCharAt2 >> 6) & 63) | 128);
                    mZx((cCharAt2 & '?') | 128);
                } else {
                    int i6 = i + 1;
                    char cCharAt3 = i6 < i2 ? str.charAt(i6) : (char) 0;
                    if (cCharAt2 > 56319 || cCharAt3 < 56320 || cCharAt3 > 57343) {
                        mZx(63);
                        i = i6;
                    } else {
                        int i7 = (((cCharAt2 & 10239) << 10) | (9215 & cCharAt3)) + 65536;
                        mZx((i7 >> 18) | 240);
                        mZx(((i7 >> 12) & 63) | 128);
                        mZx(((i7 >> 6) & 63) | 128);
                        mZx((i7 & 63) | 128);
                        i += 2;
                    }
                }
                i++;
            }
        }
        return this;
    }

    public EYQ EYQ(int i) {
        if (i < 128) {
            mZx(i);
        } else if (i < 2048) {
            mZx((i >> 6) | 192);
            mZx((i & 63) | 128);
        } else if (i < 65536) {
            if (i >= 55296 && i <= 57343) {
                mZx(63);
            } else {
                mZx((i >> 12) | 224);
                mZx(((i >> 6) & 63) | 128);
                mZx((i & 63) | 128);
            }
        } else if (i <= 1114111) {
            mZx((i >> 18) | 240);
            mZx(((i >> 12) & 63) | 128);
            mZx(((i >> 6) & 63) | 128);
            mZx((i & 63) | 128);
        } else {
            throw new IllegalArgumentException("Unexpected code point: " + Integer.toHexString(i));
        }
        return this;
    }

    public EYQ EYQ(String str, int i, int i2, Charset charset) {
        if (str == null) {
            throw new IllegalArgumentException("string == null");
        }
        if (i < 0) {
            throw new IllegalAccessError("beginIndex < 0: ".concat(String.valueOf(i)));
        }
        if (i2 < i) {
            throw new IllegalArgumentException("endIndex < beginIndex: " + i2 + " < " + i);
        }
        if (i2 > str.length()) {
            throw new IllegalArgumentException("endIndex > string.length: " + i2 + " > " + str.length());
        }
        if (charset == null) {
            throw new IllegalArgumentException("charset == null");
        }
        if (charset.equals(HX.EYQ)) {
            return EYQ(str, i, i2);
        }
        byte[] bytes = str.substring(i, i2).getBytes(charset);
        return mZx(bytes, 0, bytes.length);
    }

    public EYQ mZx(byte[] bArr, int i, int i2) {
        if (bArr == null) {
            throw new IllegalArgumentException("source == null");
        }
        long j = i2;
        HX.EYQ(bArr.length, i, j);
        int i3 = i2 + i;
        while (i < i3) {
            Kbd kbdTd = Td(1);
            int iMin = Math.min(i3 - i, 8192 - kbdTd.Td);
            System.arraycopy(bArr, i, kbdTd.EYQ, kbdTd.Td, iMin);
            i += iMin;
            kbdTd.Td += iMin;
        }
        this.mZx += j;
        return this;
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(ByteBuffer byteBuffer) throws IOException {
        if (byteBuffer == null) {
            throw new IllegalArgumentException("source == null");
        }
        int iRemaining = byteBuffer.remaining();
        int i = iRemaining;
        while (i > 0) {
            Kbd kbdTd = Td(1);
            int iMin = Math.min(i, 8192 - kbdTd.Td);
            byteBuffer.get(kbdTd.EYQ, kbdTd.Td, iMin);
            i -= iMin;
            kbdTd.Td += iMin;
        }
        this.mZx += iRemaining;
        return iRemaining;
    }

    public EYQ mZx(int i) {
        Kbd kbdTd = Td(1);
        byte[] bArr = kbdTd.EYQ;
        int i2 = kbdTd.Td;
        kbdTd.Td = i2 + 1;
        bArr[i2] = (byte) i;
        this.mZx++;
        return this;
    }

    public EYQ mZx(long j) {
        if (j == 0) {
            return mZx(48);
        }
        int iNumberOfTrailingZeros = (Long.numberOfTrailingZeros(Long.highestOneBit(j)) / 4) + 1;
        Kbd kbdTd = Td(iNumberOfTrailingZeros);
        byte[] bArr = kbdTd.EYQ;
        int i = kbdTd.Td;
        for (int i2 = (kbdTd.Td + iNumberOfTrailingZeros) - 1; i2 >= i; i2--) {
            bArr[i2] = Td[(int) (15 & j)];
            j >>>= 4;
        }
        kbdTd.Td += iNumberOfTrailingZeros;
        this.mZx += iNumberOfTrailingZeros;
        return this;
    }

    Kbd Td(int i) {
        if (i <= 0 || i > 8192) {
            throw new IllegalArgumentException();
        }
        Kbd kbd = this.EYQ;
        if (kbd == null) {
            Kbd kbdEYQ = IPb.EYQ();
            this.EYQ = kbdEYQ;
            kbdEYQ.VwS = kbdEYQ;
            kbdEYQ.IPb = kbdEYQ;
            return kbdEYQ;
        }
        Kbd kbd2 = kbd.VwS;
        return (kbd2.Td + i > 8192 || !kbd2.Kbd) ? kbd2.EYQ(IPb.EYQ()) : kbd2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EYQ)) {
            return false;
        }
        EYQ eyq = (EYQ) obj;
        long j = this.mZx;
        if (j != eyq.mZx) {
            return false;
        }
        long j2 = 0;
        if (j == 0) {
            return true;
        }
        Kbd kbd = this.EYQ;
        Kbd kbd2 = eyq.EYQ;
        int i = kbd.mZx;
        int i2 = kbd2.mZx;
        while (j2 < this.mZx) {
            long jMin = Math.min(kbd.Td - i, kbd2.Td - i2);
            int i3 = 0;
            while (i3 < jMin) {
                int i4 = i + 1;
                int i5 = i2 + 1;
                if (kbd.EYQ[i] != kbd2.EYQ[i2]) {
                    return false;
                }
                i3++;
                i = i4;
                i2 = i5;
            }
            if (i == kbd.Td) {
                kbd = kbd.IPb;
                i = kbd.mZx;
            }
            if (i2 == kbd2.Td) {
                kbd2 = kbd2.IPb;
                i2 = kbd2.mZx;
            }
            j2 += jMin;
        }
        return true;
    }

    public int hashCode() {
        Kbd kbd = this.EYQ;
        if (kbd == null) {
            return 0;
        }
        int i = 1;
        do {
            int i2 = kbd.Td;
            for (int i3 = kbd.mZx; i3 < i2; i3++) {
                i = (i * 31) + kbd.EYQ[i3];
            }
            kbd = kbd.IPb;
        } while (kbd != this.EYQ);
        return i;
    }

    public String toString() {
        return Kbd().toString();
    }

    /* renamed from: Pm, reason: merged with bridge method [inline-methods] */
    public EYQ clone() {
        EYQ eyq = new EYQ();
        if (this.mZx == 0) {
            return eyq;
        }
        Kbd kbdEYQ = this.EYQ.EYQ();
        eyq.EYQ = kbdEYQ;
        kbdEYQ.VwS = kbdEYQ;
        kbdEYQ.IPb = kbdEYQ;
        Kbd kbd = this.EYQ;
        while (true) {
            kbd = kbd.IPb;
            if (kbd != this.EYQ) {
                eyq.EYQ.VwS.EYQ(kbd.EYQ());
            } else {
                eyq.mZx = this.mZx;
                return eyq;
            }
        }
    }

    public final Pm Kbd() {
        long j = this.mZx;
        if (j > 2147483647L) {
            throw new IllegalArgumentException("size > Integer.MAX_VALUE: " + this.mZx);
        }
        return Pm((int) j);
    }

    public final Pm Pm(int i) {
        if (i == 0) {
            return Pm.Td;
        }
        return new VwS(this, i);
    }
}
