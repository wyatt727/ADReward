package com.applovin.impl;

import com.applovin.exoplayer2.common.base.Charsets;
import java.nio.charset.Charset;
import java.util.Arrays;
import okio.Utf8;

/* loaded from: classes.dex */
public final class yg {

    /* renamed from: a, reason: collision with root package name */
    private byte[] f1208a;
    private int b;
    private int c;

    public yg() {
        this.f1208a = yp.f;
    }

    public yg(int i) {
        this.f1208a = new byte[i];
        this.c = i;
    }

    public int a() {
        return this.c - this.b;
    }

    public int e() {
        return this.c;
    }

    public int d() {
        return this.b;
    }

    public yg(byte[] bArr) {
        this.f1208a = bArr;
        this.c = bArr.length;
    }

    public byte[] c() {
        return this.f1208a;
    }

    public int b() {
        return this.f1208a.length;
    }

    public yg(byte[] bArr, int i) {
        this.f1208a = bArr;
        this.c = i;
    }

    public void d(int i) {
        a(b() < i ? new byte[i] : this.f1208a, i);
    }

    public int g() {
        return this.f1208a[this.b] & 255;
    }

    public char f() {
        byte[] bArr = this.f1208a;
        int i = this.b;
        return (char) ((bArr[i + 1] & 255) | ((bArr[i] & 255) << 8));
    }

    public int w() {
        byte[] bArr = this.f1208a;
        int i = this.b;
        this.b = i + 1;
        return bArr[i] & 255;
    }

    public void a(int i) {
        if (i > b()) {
            this.f1208a = Arrays.copyOf(this.f1208a, i);
        }
    }

    public int C() {
        byte[] bArr = this.f1208a;
        int i = this.b;
        int i2 = i + 1;
        int i3 = (bArr[i] & 255) << 8;
        this.b = i + 2;
        return (bArr[i2] & 255) | i3;
    }

    public int r() {
        byte[] bArr = this.f1208a;
        int i = this.b;
        int i2 = i + 1;
        int i3 = bArr[i] & 255;
        this.b = i + 2;
        return ((bArr[i2] & 255) << 8) | i3;
    }

    public short u() {
        byte[] bArr = this.f1208a;
        int i = this.b;
        int i2 = i + 1;
        int i3 = (bArr[i] & 255) << 8;
        this.b = i + 2;
        return (short) ((bArr[i2] & 255) | i3);
    }

    public short o() {
        byte[] bArr = this.f1208a;
        int i = this.b;
        int i2 = i + 1;
        int i3 = bArr[i] & 255;
        this.b = i + 2;
        return (short) (((bArr[i2] & 255) << 8) | i3);
    }

    public int z() {
        byte[] bArr = this.f1208a;
        int i = this.b;
        int i2 = i + 2;
        int i3 = ((bArr[i + 1] & 255) << 8) | ((bArr[i] & 255) << 16);
        this.b = i + 3;
        return (bArr[i2] & 255) | i3;
    }

    public void e(int i) {
        a1.a(i >= 0 && i <= this.f1208a.length);
        this.c = i;
    }

    public int k() {
        byte[] bArr = this.f1208a;
        int i = this.b;
        int i2 = i + 2;
        int i3 = ((bArr[i + 1] & 255) << 8) | (((bArr[i] & 255) << 24) >> 8);
        this.b = i + 3;
        return (bArr[i2] & 255) | i3;
    }

    public long y() {
        byte[] bArr = this.f1208a;
        int i = this.b;
        int i2 = i + 3;
        long j = ((bArr[i] & 255) << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8);
        this.b = i + 4;
        return (bArr[i2] & 255) | j;
    }

    public long p() {
        byte[] bArr = this.f1208a;
        int i = this.b;
        int i2 = i + 3;
        long j = (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
        this.b = i + 4;
        return ((bArr[i2] & 255) << 24) | j;
    }

    public int j() {
        byte[] bArr = this.f1208a;
        int i = this.b;
        int i2 = ((bArr[i + 1] & 255) << 16) | ((bArr[i] & 255) << 24);
        int i3 = i + 3;
        int i4 = i2 | ((bArr[i + 2] & 255) << 8);
        this.b = i + 4;
        return (bArr[i3] & 255) | i4;
    }

    public int m() {
        byte[] bArr = this.f1208a;
        int i = this.b;
        int i2 = ((bArr[i + 1] & 255) << 8) | (bArr[i] & 255);
        int i3 = i + 3;
        int i4 = i2 | ((bArr[i + 2] & 255) << 16);
        this.b = i + 4;
        return ((bArr[i3] & 255) << 24) | i4;
    }

    public long s() {
        byte[] bArr = this.f1208a;
        int i = this.b;
        int i2 = i + 7;
        long j = ((bArr[i] & 255) << 56) | ((bArr[i + 1] & 255) << 48) | ((bArr[i + 2] & 255) << 40) | ((bArr[i + 3] & 255) << 32) | ((bArr[i + 4] & 255) << 24) | ((bArr[i + 5] & 255) << 16) | ((bArr[i + 6] & 255) << 8);
        this.b = i + 8;
        return (bArr[i2] & 255) | j;
    }

    public long n() {
        byte[] bArr = this.f1208a;
        int i = this.b;
        int i2 = i + 7;
        long j = (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48);
        this.b = i + 8;
        return ((bArr[i2] & 255) << 56) | j;
    }

    public int x() {
        byte[] bArr = this.f1208a;
        int i = this.b;
        int i2 = (bArr[i + 1] & 255) | ((bArr[i] & 255) << 8);
        this.b = i + 4;
        return i2;
    }

    public int v() {
        return (w() << 21) | (w() << 14) | (w() << 7) | w();
    }

    public int A() {
        int iJ = j();
        if (iJ >= 0) {
            return iJ;
        }
        throw new IllegalStateException("Top bit not zero: " + iJ);
    }

    public void f(int i) {
        a1.a(i >= 0 && i <= this.c);
        this.b = i;
    }

    public int q() {
        int iM = m();
        if (iM >= 0) {
            return iM;
        }
        throw new IllegalStateException("Top bit not zero: " + iM);
    }

    public long B() {
        long jS = s();
        if (jS >= 0) {
            return jS;
        }
        throw new IllegalStateException("Top bit not zero: " + jS);
    }

    public void g(int i) {
        f(this.b + i);
    }

    public float i() {
        return Float.intBitsToFloat(j());
    }

    public double h() {
        return Double.longBitsToDouble(s());
    }

    public void a(xg xgVar, int i) {
        a(xgVar.f1169a, 0, i);
        xgVar.c(0);
    }

    public String t() {
        return a((char) 0);
    }

    public String l() {
        if (a() == 0) {
            return null;
        }
        int i = this.b;
        while (i < this.c && !yp.h(this.f1208a[i])) {
            i++;
        }
        int i2 = this.b;
        if (i - i2 >= 3) {
            byte[] bArr = this.f1208a;
            if (bArr[i2] == -17 && bArr[i2 + 1] == -69 && bArr[i2 + 2] == -65) {
                this.b = i2 + 3;
            }
        }
        byte[] bArr2 = this.f1208a;
        int i3 = this.b;
        String strA = yp.a(bArr2, i3, i - i3);
        this.b = i;
        int i4 = this.c;
        if (i == i4) {
            return strA;
        }
        byte[] bArr3 = this.f1208a;
        if (bArr3[i] == 13) {
            int i5 = i + 1;
            this.b = i5;
            if (i5 == i4) {
                return strA;
            }
        }
        int i6 = this.b;
        if (bArr3[i6] == 10) {
            this.b = i6 + 1;
        }
        return strA;
    }

    public long D() {
        int i;
        int i2;
        long j = this.f1208a[this.b];
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
        if (i2 != 0) {
            for (i = 1; i < i2; i++) {
                if ((this.f1208a[this.b + i] & 192) != 128) {
                    throw new NumberFormatException("Invalid UTF-8 sequence continuation byte: " + j);
                }
                j = (j << 6) | (r3 & Utf8.REPLACEMENT_BYTE);
            }
            this.b += i2;
            return j;
        }
        throw new NumberFormatException("Invalid UTF-8 sequence first byte: " + j);
    }

    public String c(int i) {
        return a(i, Charsets.UTF_8);
    }

    public String b(int i) {
        if (i == 0) {
            return "";
        }
        int i2 = this.b;
        int i3 = (i2 + i) - 1;
        String strA = yp.a(this.f1208a, i2, (i3 >= this.c || this.f1208a[i3] != 0) ? i : i - 1);
        this.b += i;
        return strA;
    }

    public void a(byte[] bArr, int i, int i2) {
        System.arraycopy(this.f1208a, this.b, bArr, i, i2);
        this.b += i2;
    }

    public String a(char c) {
        if (a() == 0) {
            return null;
        }
        int i = this.b;
        while (i < this.c && this.f1208a[i] != c) {
            i++;
        }
        byte[] bArr = this.f1208a;
        int i2 = this.b;
        String strA = yp.a(bArr, i2, i - i2);
        this.b = i;
        if (i < this.c) {
            this.b = i + 1;
        }
        return strA;
    }

    public void a(byte[] bArr) {
        a(bArr, bArr.length);
    }

    public void a(byte[] bArr, int i) {
        this.f1208a = bArr;
        this.c = i;
        this.b = 0;
    }

    public String a(int i, Charset charset) {
        String str = new String(this.f1208a, this.b, i, charset);
        this.b += i;
        return str;
    }
}
