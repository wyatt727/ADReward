package com.applovin.impl;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
final class lp implements kl {

    /* renamed from: a, reason: collision with root package name */
    private final hp f632a;
    private final long[] b;
    private final Map c;
    private final Map d;
    private final Map f;

    public lp(hp hpVar, Map map, Map map2, Map map3) {
        this.f632a = hpVar;
        this.d = map2;
        this.f = map3;
        this.c = map != null ? Collections.unmodifiableMap(map) : Collections.emptyMap();
        this.b = hpVar.b();
    }

    @Override // com.applovin.impl.kl
    public long a(int i) {
        return this.b[i];
    }

    @Override // com.applovin.impl.kl
    public List b(long j) {
        return this.f632a.a(j, this.c, this.d, this.f);
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
