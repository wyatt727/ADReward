package com.applovin.impl;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class mc {

    /* renamed from: a, reason: collision with root package name */
    private int f642a;
    private long[] b;

    public mc() {
        this(32);
    }

    public void a(long j) {
        int i = this.f642a;
        long[] jArr = this.b;
        if (i == jArr.length) {
            this.b = Arrays.copyOf(jArr, i * 2);
        }
        long[] jArr2 = this.b;
        int i2 = this.f642a;
        this.f642a = i2 + 1;
        jArr2[i2] = j;
    }

    public mc(int i) {
        this.b = new long[i];
    }

    public long[] b() {
        return Arrays.copyOf(this.b, this.f642a);
    }

    public long a(int i) {
        if (i >= 0 && i < this.f642a) {
            return this.b[i];
        }
        throw new IndexOutOfBoundsException("Invalid index " + i + ", size is " + this.f642a);
    }

    public int a() {
        return this.f642a;
    }
}
