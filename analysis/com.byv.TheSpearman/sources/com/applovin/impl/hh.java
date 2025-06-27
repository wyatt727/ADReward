package com.applovin.impl;

import java.util.List;

/* loaded from: classes.dex */
final class hh implements kl {

    /* renamed from: a, reason: collision with root package name */
    private final List f502a;

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

    public hh(List list) {
        this.f502a = list;
    }

    @Override // com.applovin.impl.kl
    public List b(long j) {
        return this.f502a;
    }
}
