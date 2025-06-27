package com.applovin.impl;

import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
final class np implements kl {
    public static final np b = new np();

    /* renamed from: a, reason: collision with root package name */
    private final List f728a;

    @Override // com.applovin.impl.kl
    public int a() {
        return 1;
    }

    @Override // com.applovin.impl.kl
    public int a(long j) {
        return j < 0 ? 0 : -1;
    }

    private np() {
        this.f728a = Collections.emptyList();
    }

    @Override // com.applovin.impl.kl
    public long a(int i) {
        a1.a(i == 0);
        return 0L;
    }

    @Override // com.applovin.impl.kl
    public List b(long j) {
        return j >= 0 ? this.f728a : Collections.emptyList();
    }

    public np(z4 z4Var) {
        this.f728a = Collections.singletonList(z4Var);
    }
}
