package com.applovin.impl;

/* loaded from: classes.dex */
final class jk {

    /* renamed from: a, reason: collision with root package name */
    private final yg f573a = new yg(8);
    private int b;

    public boolean b(j8 j8Var) {
        long jA = j8Var.a();
        long j = 1024;
        if (jA != -1 && jA <= 1024) {
            j = jA;
        }
        int i = (int) j;
        j8Var.c(this.f573a.c(), 0, 4);
        long jY = this.f573a.y();
        this.b = 4;
        while (jY != 440786851) {
            int i2 = this.b + 1;
            this.b = i2;
            if (i2 == i) {
                return false;
            }
            j8Var.c(this.f573a.c(), 0, 1);
            jY = ((jY << 8) & (-256)) | (this.f573a.c()[0] & 255);
        }
        long jA2 = a(j8Var);
        long j2 = this.b;
        if (jA2 == Long.MIN_VALUE) {
            return false;
        }
        if (jA != -1 && j2 + jA2 >= jA) {
            return false;
        }
        while (true) {
            long j3 = this.b;
            long j4 = j2 + jA2;
            if (j3 >= j4) {
                return j3 == j4;
            }
            if (a(j8Var) == Long.MIN_VALUE) {
                return false;
            }
            long jA3 = a(j8Var);
            if (jA3 < 0 || jA3 > 2147483647L) {
                break;
            }
            if (jA3 != 0) {
                int i3 = (int) jA3;
                j8Var.c(i3);
                this.b += i3;
            }
        }
        return false;
    }

    private long a(j8 j8Var) {
        int i = 0;
        j8Var.c(this.f573a.c(), 0, 1);
        int i2 = this.f573a.c()[0] & 255;
        if (i2 == 0) {
            return Long.MIN_VALUE;
        }
        int i3 = 128;
        int i4 = 0;
        while ((i2 & i3) == 0) {
            i3 >>= 1;
            i4++;
        }
        int i5 = i2 & (~i3);
        j8Var.c(this.f573a.c(), 1, i4);
        while (i < i4) {
            i++;
            i5 = (this.f573a.c()[i] & 255) + (i5 << 8);
        }
        this.b += i4 + 1;
        return i5;
    }
}
