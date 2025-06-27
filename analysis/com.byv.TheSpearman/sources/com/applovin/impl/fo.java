package com.applovin.impl;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class fo {

    /* renamed from: a, reason: collision with root package name */
    private long[] f439a;
    private Object[] b;
    private int c;
    private int d;

    public fo() {
        this(10);
    }

    public synchronized void a(long j, Object obj) {
        a(j);
        b();
        b(j, obj);
    }

    public synchronized int e() {
        return this.d;
    }

    public synchronized Object c() {
        return this.d == 0 ? null : d();
    }

    public fo(int i) {
        this.f439a = new long[i];
        this.b = a(i);
    }

    public synchronized void a() {
        this.c = 0;
        this.d = 0;
        Arrays.fill(this.b, (Object) null);
    }

    private Object d() {
        a1.b(this.d > 0);
        Object[] objArr = this.b;
        int i = this.c;
        Object obj = objArr[i];
        objArr[i] = null;
        this.c = (i + 1) % objArr.length;
        this.d--;
        return obj;
    }

    public synchronized Object c(long j) {
        return a(j, true);
    }

    private void b(long j, Object obj) {
        int i = this.c;
        int i2 = this.d;
        Object[] objArr = this.b;
        int length = (i + i2) % objArr.length;
        this.f439a[length] = j;
        objArr[length] = obj;
        this.d = i2 + 1;
    }

    private void a(long j) {
        if (this.d > 0) {
            if (j <= this.f439a[((this.c + r0) - 1) % this.b.length]) {
                a();
            }
        }
    }

    private void b() {
        int length = this.b.length;
        if (this.d < length) {
            return;
        }
        int i = length * 2;
        long[] jArr = new long[i];
        Object[] objArrA = a(i);
        int i2 = this.c;
        int i3 = length - i2;
        System.arraycopy(this.f439a, i2, jArr, 0, i3);
        System.arraycopy(this.b, this.c, objArrA, 0, i3);
        int i4 = this.c;
        if (i4 > 0) {
            System.arraycopy(this.f439a, 0, jArr, i3, i4);
            System.arraycopy(this.b, 0, objArrA, i3, this.c);
        }
        this.f439a = jArr;
        this.b = objArrA;
        this.c = 0;
    }

    private static Object[] a(int i) {
        return new Object[i];
    }

    public synchronized Object b(long j) {
        return a(j, false);
    }

    private Object a(long j, boolean z) {
        Object objD = null;
        long j2 = Long.MAX_VALUE;
        while (this.d > 0) {
            long j3 = j - this.f439a[this.c];
            if (j3 < 0 && (z || (-j3) >= j2)) {
                break;
            }
            objD = d();
            j2 = j3;
        }
        return objD;
    }
}
