package com.applovin.impl;

import com.applovin.impl.ej;
import com.applovin.impl.y8;

/* loaded from: classes.dex */
public final class x8 implements ej {

    /* renamed from: a, reason: collision with root package name */
    private final y8 f1162a;
    private final long b;

    @Override // com.applovin.impl.ej
    public boolean b() {
        return true;
    }

    public x8(y8 y8Var, long j) {
        this.f1162a = y8Var;
        this.b = j;
    }

    @Override // com.applovin.impl.ej
    public long d() {
        return this.f1162a.b();
    }

    @Override // com.applovin.impl.ej
    public ej.a b(long j) {
        a1.b(this.f1162a.k);
        y8 y8Var = this.f1162a;
        y8.a aVar = y8Var.k;
        long[] jArr = aVar.f1197a;
        long[] jArr2 = aVar.b;
        int iB = yp.b(jArr, y8Var.a(j), true, false);
        gj gjVarA = a(iB == -1 ? 0L : jArr[iB], iB != -1 ? jArr2[iB] : 0L);
        if (gjVarA.f462a != j && iB != jArr.length - 1) {
            int i = iB + 1;
            return new ej.a(gjVarA, a(jArr[i], jArr2[i]));
        }
        return new ej.a(gjVarA);
    }

    private gj a(long j, long j2) {
        return new gj((j * 1000000) / this.f1162a.e, this.b + j2);
    }
}
