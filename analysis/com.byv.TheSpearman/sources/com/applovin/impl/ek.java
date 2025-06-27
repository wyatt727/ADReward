package com.applovin.impl;

import com.applovin.exoplayer2.common.base.Preconditions;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes.dex */
final class ek extends eb {
    final transient Object c;
    private transient int d;

    @Override // com.applovin.impl.ya
    boolean e() {
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public String toString() {
        return AbstractJsonLexerKt.BEGIN_LIST + this.c.toString() + AbstractJsonLexerKt.END_LIST;
    }

    ek(Object obj) {
        this.c = Preconditions.checkNotNull(obj);
    }

    @Override // com.applovin.impl.ya, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        return this.c.equals(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public qp iterator() {
        return sb.a(this.c);
    }

    @Override // com.applovin.impl.eb
    ab f() {
        return ab.a(this.c);
    }

    @Override // com.applovin.impl.ya
    int a(Object[] objArr, int i) {
        objArr[i] = this.c;
        return i + 1;
    }

    @Override // com.applovin.impl.eb, java.util.Collection, java.util.Set
    public final int hashCode() {
        int i = this.d;
        if (i != 0) {
            return i;
        }
        int iHashCode = this.c.hashCode();
        this.d = iHashCode;
        return iHashCode;
    }

    ek(Object obj, int i) {
        this.c = obj;
        this.d = i;
    }

    @Override // com.applovin.impl.eb
    boolean g() {
        return this.d != 0;
    }
}
