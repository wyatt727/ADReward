package com.applovin.impl;

import com.applovin.exoplayer2.common.base.Preconditions;
import java.util.Iterator;

/* loaded from: classes.dex */
abstract class zo implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    final Iterator f1252a;

    abstract Object a(Object obj);

    zo(Iterator it) {
        this.f1252a = (Iterator) Preconditions.checkNotNull(it);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f1252a.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return a(this.f1252a.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f1252a.remove();
    }
}
