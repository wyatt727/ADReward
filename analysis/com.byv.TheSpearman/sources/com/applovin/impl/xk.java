package com.applovin.impl;

import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
final class xk implements kl {

    /* renamed from: a, reason: collision with root package name */
    private final List f1178a;
    private final List b;

    public xk(List list, List list2) {
        this.f1178a = list;
        this.b = list2;
    }

    @Override // com.applovin.impl.kl
    public long a(int i) {
        a1.a(i >= 0);
        a1.a(i < this.b.size());
        return ((Long) this.b.get(i)).longValue();
    }

    @Override // com.applovin.impl.kl
    public List b(long j) {
        int iB = yp.b(this.b, (Comparable) Long.valueOf(j), true, false);
        if (iB == -1) {
            return Collections.emptyList();
        }
        return (List) this.f1178a.get(iB);
    }

    @Override // com.applovin.impl.kl
    public int a() {
        return this.b.size();
    }

    @Override // com.applovin.impl.kl
    public int a(long j) {
        int iA = yp.a(this.b, (Comparable) Long.valueOf(j), false, false);
        if (iA < this.b.size()) {
            return iA;
        }
        return -1;
    }
}
