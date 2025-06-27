package com.google.common.collect;

import java.util.Iterator;

@ElementTypesAreNonnullByDefault
/* loaded from: classes3.dex */
public abstract class UnmodifiableIterator<E> implements Iterator<E> {
    protected UnmodifiableIterator() {
    }

    @Override // java.util.Iterator
    @Deprecated
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
