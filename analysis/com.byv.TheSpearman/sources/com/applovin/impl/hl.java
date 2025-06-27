package com.applovin.impl;

import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
final class hl implements kl {

    /* renamed from: a, reason: collision with root package name */
    private final z4[] f504a;
    private final long[] b;

    public hl(z4[] z4VarArr, long[] jArr) {
        this.f504a = z4VarArr;
        this.b = jArr;
    }

    @Override // com.applovin.impl.kl
    public long a(int i) {
        a1.a(i >= 0);
        a1.a(i < this.b.length);
        return this.b[i];
    }

    @Override // com.applovin.impl.kl
    public List b(long j) {
        z4 z4Var;
        int iB = yp.b(this.b, j, true, false);
        if (iB != -1 && (z4Var = this.f504a[iB]) != z4.s) {
            return Collections.singletonList(z4Var);
        }
        return Collections.emptyList();
    }

    @Override // com.applovin.impl.kl
    public int a() {
        return this.b.length;
    }

    @Override // com.applovin.impl.kl
    public int a(long j) {
        int iA = yp.a(this.b, j, false, false);
        if (iA < this.b.length) {
            return iA;
        }
        return -1;
    }
}
