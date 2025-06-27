package com.applovin.impl;

/* loaded from: classes.dex */
final class so {

    /* renamed from: a, reason: collision with root package name */
    public final mo f1005a;
    public final int b;
    public final long[] c;
    public final int[] d;
    public final int e;
    public final long[] f;
    public final int[] g;
    public final long h;

    public so(mo moVar, long[] jArr, int[] iArr, int i, long[] jArr2, int[] iArr2, long j) {
        a1.a(iArr.length == jArr2.length);
        a1.a(jArr.length == jArr2.length);
        a1.a(iArr2.length == jArr2.length);
        this.f1005a = moVar;
        this.c = jArr;
        this.d = iArr;
        this.e = i;
        this.f = jArr2;
        this.g = iArr2;
        this.h = j;
        this.b = jArr.length;
        if (iArr2.length > 0) {
            int length = iArr2.length - 1;
            iArr2[length] = iArr2[length] | 536870912;
        }
    }

    public int a(long j) {
        for (int iB = yp.b(this.f, j, true, false); iB >= 0; iB--) {
            if ((this.g[iB] & 1) != 0) {
                return iB;
            }
        }
        return -1;
    }

    public int b(long j) {
        for (int iA = yp.a(this.f, j, true, false); iA < this.f.length; iA++) {
            if ((this.g[iA] & 1) != 0) {
                return iA;
            }
        }
        return -1;
    }
}
