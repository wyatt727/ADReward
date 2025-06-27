package com.applovin.impl;

import com.applovin.exoplayer2.common.base.Preconditions;

/* loaded from: classes.dex */
class ii extends ab {
    static final ab f = new ii(new Object[0], 0);
    final transient Object[] c;
    private final transient int d;

    @Override // com.applovin.impl.ya
    int d() {
        return 0;
    }

    @Override // com.applovin.impl.ya
    boolean e() {
        return false;
    }

    ii(Object[] objArr, int i) {
        this.c = objArr;
        this.d = i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.d;
    }

    @Override // com.applovin.impl.ya
    Object[] b() {
        return this.c;
    }

    @Override // com.applovin.impl.ya
    int c() {
        return this.d;
    }

    @Override // com.applovin.impl.ab, com.applovin.impl.ya
    int a(Object[] objArr, int i) {
        System.arraycopy(this.c, 0, objArr, i, this.d);
        return i + this.d;
    }

    @Override // java.util.List
    public Object get(int i) {
        Preconditions.checkElementIndex(i, this.d);
        return this.c[i];
    }
}
