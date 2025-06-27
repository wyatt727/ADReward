package com.applovin.impl;

import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
final class z2 implements kl {

    /* renamed from: a, reason: collision with root package name */
    private final List f1223a;

    @Override // com.applovin.impl.kl
    public int a() {
        return 1;
    }

    @Override // com.applovin.impl.kl
    public int a(long j) {
        return j < 0 ? 0 : -1;
    }

    public z2(List list) {
        this.f1223a = list;
    }

    @Override // com.applovin.impl.kl
    public long a(int i) {
        a1.a(i == 0);
        return 0L;
    }

    @Override // com.applovin.impl.kl
    public List b(long j) {
        return j >= 0 ? this.f1223a : Collections.emptyList();
    }
}
