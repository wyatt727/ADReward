package com.mbridge.msdk.foundation.tools;

import android.os.Build;
import java.nio.charset.StandardCharsets;
import okio.Utf8;

/* compiled from: FastBuffer.java */
/* loaded from: classes4.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public byte[] f2994a;
    public int b;
    private char[] c;

    public p(int i) {
        this(new byte[i], 0);
    }

    public p(byte[] bArr, int i) {
        this.c = null;
        this.f2994a = bArr;
        this.b = i;
    }

    public p(byte[] bArr) {
        this(bArr, 0);
    }

    public static int a(String str) {
        int length = str.length();
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int i3 = i + 1;
            char cCharAt = str.charAt(i);
            if (cCharAt < 128) {
                i2++;
            } else if (cCharAt < 2048) {
                i2 += 2;
            } else if (cCharAt < 55296 || cCharAt > 57343) {
                i2 += 3;
            } else {
                i3++;
                i2 += 4;
            }
            i = i3;
        }
        return i2;
    }

    public final byte a() {
        byte[] bArr = this.f2994a;
        int i = this.b;
        this.b = i + 1;
        return bArr[i];
    }

    final long a(int i, int i2) {
        long jC = 0;
        if (i2 <= 0) {
            return 0L;
        }
        int i3 = i2 >> 3;
        int i4 = i2 & 7;
        int i5 = 0;
        int i6 = i;
        for (int i7 = 0; i7 < i3; i7++) {
            jC ^= c(i6);
            i6 += 8;
        }
        while (i5 < (i4 << 3)) {
            jC ^= (this.f2994a[i6] & 255) << i5;
            i5 += 8;
            i6++;
        }
        int i8 = (i & 7) << 3;
        return (jC >>> (64 - i8)) | (jC << i8);
    }

    private long c(int i) {
        byte[] bArr = this.f2994a;
        long j = bArr[i] & 255;
        int i2 = i + 1 + 1 + 1;
        long j2 = j | ((bArr[r1] & 255) << 8) | ((bArr[r9] & 255) << 16);
        long j3 = j2 | ((bArr[i2] & 255) << 24);
        long j4 = j3 | ((bArr[r9] & 255) << 32);
        int i3 = i2 + 1 + 1 + 1;
        return j4 | ((bArr[r3] & 255) << 40) | ((255 & bArr[i3]) << 48) | (bArr[i3 + 1] << 56);
    }

    public final long b() {
        long jC = c(this.b);
        this.b += 8;
        return jC;
    }

    public final int c() {
        byte[] bArr = this.f2994a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        int i3 = bArr[i] & 255;
        int i4 = i2 + 1;
        this.b = i4;
        int i5 = i3 | ((bArr[i2] & 255) << 8);
        int i6 = i4 + 1;
        this.b = i6;
        int i7 = i5 | ((bArr[i4] & 255) << 16);
        this.b = i6 + 1;
        return (bArr[i6] << 24) | i7;
    }

    public final short d() {
        byte[] bArr = this.f2994a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        int i3 = bArr[i] & 255;
        this.b = i2 + 1;
        return (short) ((bArr[i2] << 8) | i3);
    }

    public final void a(byte b) {
        byte[] bArr = this.f2994a;
        int i = this.b;
        this.b = i + 1;
        bArr[i] = b;
    }

    public final void a(byte[] bArr) {
        int length = bArr.length;
        if (length > 0) {
            System.arraycopy(bArr, 0, this.f2994a, this.b, length);
            this.b += length;
        }
    }

    public final void b(int i) {
        byte[] bArr = this.f2994a;
        int i2 = this.b;
        int i3 = i2 + 1;
        this.b = i3;
        bArr[i2] = (byte) i;
        int i4 = i3 + 1;
        this.b = i4;
        bArr[i3] = (byte) (i >> 8);
        int i5 = i4 + 1;
        this.b = i5;
        bArr[i4] = (byte) (i >> 16);
        this.b = i5 + 1;
        bArr[i5] = (byte) (i >> 24);
    }

    public final void b(int i, int i2) {
        byte[] bArr = this.f2994a;
        int i3 = i + 1;
        bArr[i] = (byte) i2;
        int i4 = i3 + 1;
        bArr[i3] = (byte) (i2 >> 8);
        bArr[i4] = (byte) (i2 >> 16);
        bArr[i4 + 1] = (byte) (i2 >> 24);
    }

    public final void a(long j) {
        a(this.b, j);
        this.b += 8;
    }

    public final void a(int i, long j) {
        byte[] bArr = this.f2994a;
        int i2 = i + 1;
        bArr[i] = (byte) j;
        int i3 = i2 + 1;
        bArr[i2] = (byte) (j >> 8);
        int i4 = i3 + 1;
        bArr[i3] = (byte) (j >> 16);
        int i5 = i4 + 1;
        bArr[i4] = (byte) (j >> 24);
        int i6 = i5 + 1;
        bArr[i5] = (byte) (j >> 32);
        int i7 = i6 + 1;
        bArr[i6] = (byte) (j >> 40);
        bArr[i7] = (byte) (j >> 48);
        bArr[i7 + 1] = (byte) (j >> 56);
    }

    public final void a(short s) {
        byte[] bArr = this.f2994a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        bArr[i] = (byte) s;
        this.b = i2 + 1;
        bArr[i2] = (byte) (s >> 8);
    }

    public final void b(String str) {
        if (str == null || str.isEmpty()) {
            return;
        }
        byte[] bArr = this.f2994a;
        int i = this.b;
        int i2 = 0;
        int length = str.length();
        while (i2 < length) {
            int i3 = i2 + 1;
            char cCharAt = str.charAt(i2);
            if (cCharAt < 128) {
                bArr[i] = (byte) cCharAt;
                i2 = i3;
                i++;
            } else if (cCharAt < 2048) {
                int i4 = i + 1;
                bArr[i] = (byte) ((cCharAt >>> 6) | 192);
                i = i4 + 1;
                bArr[i4] = (byte) ((cCharAt & '?') | 128);
                i2 = i3;
            } else if (cCharAt < 55296 || cCharAt > 57343) {
                int i5 = i + 1;
                bArr[i] = (byte) ((cCharAt >>> '\f') | 224);
                int i6 = i5 + 1;
                bArr[i5] = (byte) (((cCharAt >>> 6) & 63) | 128);
                bArr[i6] = (byte) ((cCharAt & '?') | 128);
                i2 = i3;
                i = i6 + 1;
            } else {
                int i7 = i3 + 1;
                int iCharAt = ((cCharAt << '\n') + str.charAt(i3)) - 56613888;
                int i8 = i + 1;
                bArr[i] = (byte) ((iCharAt >>> 18) | 240);
                int i9 = i8 + 1;
                bArr[i8] = (byte) (((iCharAt >>> 12) & 63) | 128);
                int i10 = i9 + 1;
                bArr[i9] = (byte) (((iCharAt >>> 6) & 63) | 128);
                i = i10 + 1;
                bArr[i10] = (byte) ((iCharAt & 63) | 128);
                i2 = i7;
            }
        }
        this.b = i;
    }

    public final String a(int i) {
        String str;
        if (i < 0) {
            return null;
        }
        if (i == 0) {
            return "";
        }
        if (i > 2048) {
            if (Build.VERSION.SDK_INT >= 19) {
                str = new String(this.f2994a, this.b, i, StandardCharsets.UTF_8);
            } else {
                str = new String(this.f2994a, this.b, i);
            }
        } else {
            char[] cArr = this.c;
            if (cArr == null) {
                if (i <= 256) {
                    this.c = new char[256];
                } else {
                    this.c = new char[2048];
                }
            } else if (cArr.length < i) {
                this.c = new char[2048];
            }
            char[] cArr2 = this.c;
            byte[] bArr = this.f2994a;
            int i2 = this.b;
            int i3 = i2 + i;
            int i4 = 0;
            while (i2 < i3) {
                int i5 = i2 + 1;
                byte b = bArr[i2];
                if (b > 0) {
                    cArr2[i4] = (char) b;
                    i2 = i5;
                    i4++;
                } else if (b < -32) {
                    cArr2[i4] = (char) (((b & 31) << 6) | (bArr[i5] & Utf8.REPLACEMENT_BYTE));
                    i2 = i5 + 1;
                    i4++;
                } else if (b < -16) {
                    int i6 = i5 + 1;
                    cArr2[i4] = (char) (((b & 15) << 12) | ((bArr[i5] & Utf8.REPLACEMENT_BYTE) << 6) | (bArr[i6] & Utf8.REPLACEMENT_BYTE));
                    i2 = i6 + 1;
                    i4++;
                } else {
                    int i7 = i5 + 1;
                    int i8 = i7 + 1;
                    int i9 = ((b & 7) << 18) | ((bArr[i5] & Utf8.REPLACEMENT_BYTE) << 12) | ((bArr[i7] & Utf8.REPLACEMENT_BYTE) << 6) | (bArr[i8] & Utf8.REPLACEMENT_BYTE);
                    int i10 = i4 + 1;
                    cArr2[i4] = (char) ((i9 >>> 10) + Utf8.HIGH_SURROGATE_HEADER);
                    i4 = i10 + 1;
                    cArr2[i10] = (char) ((i9 & 1023) + Utf8.LOG_SURROGATE_HEADER);
                    i2 = i8 + 1;
                }
            }
            if (i2 > i3) {
                throw new IllegalArgumentException("Invalid String");
            }
            str = new String(cArr2, 0, i4);
        }
        this.b += i;
        return str;
    }
}
