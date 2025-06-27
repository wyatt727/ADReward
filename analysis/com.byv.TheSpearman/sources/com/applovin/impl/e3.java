package com.applovin.impl;

import com.applovin.impl.ej;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class e3 implements ej {

    /* renamed from: a, reason: collision with root package name */
    public final int f376a;
    public final int[] b;
    public final long[] c;
    public final long[] d;
    public final long[] e;
    private final long f;

    @Override // com.applovin.impl.ej
    public boolean b() {
        return true;
    }

    public String toString() {
        return "ChunkIndex(length=" + this.f376a + ", sizes=" + Arrays.toString(this.b) + ", offsets=" + Arrays.toString(this.c) + ", timeUs=" + Arrays.toString(this.e) + ", durationsUs=" + Arrays.toString(this.d) + ")";
    }

    public e3(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.b = iArr;
        this.c = jArr;
        this.d = jArr2;
        this.e = jArr3;
        int length = iArr.length;
        this.f376a = length;
        if (length > 0) {
            int i = length - 1;
            this.f = jArr2[i] + jArr3[i];
        } else {
            this.f = 0L;
        }
    }

    public int c(long j) {
        return yp.b(this.e, j, true, true);
    }

    @Override // com.applovin.impl.ej
    public long d() {
        return this.f;
    }

    @Override // com.applovin.impl.ej
    public ej.a b(long j) {
        int iC = c(j);
        gj gjVar = new gj(this.e[iC], this.c[iC]);
        if (gjVar.f462a < j && iC != this.f376a - 1) {
            int i = iC + 1;
            return new ej.a(gjVar, new gj(this.e[i], this.c[i]));
        }
        return new ej.a(gjVar);
    }
}
