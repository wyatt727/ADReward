package com.applovin.impl;

/* loaded from: classes.dex */
public final class mo {

    /* renamed from: a, reason: collision with root package name */
    public final int f698a;
    public final int b;
    public final long c;
    public final long d;
    public final long e;
    public final d9 f;
    public final int g;
    public final long[] h;
    public final long[] i;
    public final int j;
    private final no[] k;

    public mo(int i, int i2, long j, long j2, long j3, d9 d9Var, int i3, no[] noVarArr, int i4, long[] jArr, long[] jArr2) {
        this.f698a = i;
        this.b = i2;
        this.c = j;
        this.d = j2;
        this.e = j3;
        this.f = d9Var;
        this.g = i3;
        this.k = noVarArr;
        this.j = i4;
        this.h = jArr;
        this.i = jArr2;
    }

    public no a(int i) {
        no[] noVarArr = this.k;
        if (noVarArr == null) {
            return null;
        }
        return noVarArr[i];
    }
}
