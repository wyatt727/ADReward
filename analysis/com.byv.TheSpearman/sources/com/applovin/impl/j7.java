package com.applovin.impl;

import java.util.List;

/* loaded from: classes.dex */
final class j7 implements kl {

    /* renamed from: a, reason: collision with root package name */
    private final List f563a;

    @Override // com.applovin.impl.kl
    public int a() {
        return 1;
    }

    @Override // com.applovin.impl.kl
    public int a(long j) {
        return -1;
    }

    @Override // com.applovin.impl.kl
    public long a(int i) {
        return 0L;
    }

    public j7(List list) {
        this.f563a = list;
    }

    @Override // com.applovin.impl.kl
    public List b(long j) {
        return this.f563a;
    }
}
