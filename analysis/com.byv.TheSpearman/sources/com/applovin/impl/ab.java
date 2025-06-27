package com.applovin.impl;

import com.applovin.exoplayer2.common.base.Preconditions;
import com.applovin.impl.ya;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public abstract class ab extends ya implements List, RandomAccess {
    private static final rp b = new b(ii.f, 0);

    public static a f() {
        return new a();
    }

    public static ab h() {
        return ii.f;
    }

    @Override // com.applovin.impl.ya
    public final ab a() {
        return this;
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final Object remove(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    public static ab c(Object[] objArr) {
        if (objArr.length == 0) {
            return h();
        }
        return b((Object[]) objArr.clone());
    }

    static ab a(Object[] objArr) {
        return b(objArr, objArr.length);
    }

    static ab b(Object[] objArr, int i) {
        if (i == 0) {
            return h();
        }
        return new ii(objArr, i);
    }

    ab() {
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public qp iterator() {
        return listIterator();
    }

    @Override // java.util.List
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public rp listIterator() {
        return listIterator(0);
    }

    static class b extends com.applovin.impl.c {
        private final ab c;

        b(ab abVar, int i) {
            super(abVar.size(), i);
            this.c = abVar;
        }

        @Override // com.applovin.impl.c
        protected Object a(int i) {
            return this.c.get(i);
        }
    }

    @Override // java.util.List
    public int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        return dc.b(this, obj);
    }

    @Override // java.util.List
    public int lastIndexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        return dc.d(this, obj);
    }

    @Override // com.applovin.impl.ya, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    class c extends ab {
        final transient int c;
        final transient int d;

        @Override // com.applovin.impl.ya
        boolean e() {
            return true;
        }

        @Override // com.applovin.impl.ab, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
        public /* bridge */ /* synthetic */ Iterator iterator() {
            return super.iterator();
        }

        @Override // com.applovin.impl.ab, java.util.List
        public /* bridge */ /* synthetic */ ListIterator listIterator() {
            return super.listIterator();
        }

        c(int i, int i2) {
            this.c = i;
            this.d = i2;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.d;
        }

        @Override // com.applovin.impl.ya
        Object[] b() {
            return ab.this.b();
        }

        @Override // com.applovin.impl.ya
        int d() {
            return ab.this.d() + this.c;
        }

        @Override // com.applovin.impl.ya
        int c() {
            return ab.this.d() + this.c + this.d;
        }

        @Override // java.util.List
        public Object get(int i) {
            Preconditions.checkElementIndex(i, this.d);
            return ab.this.get(i + this.c);
        }

        @Override // com.applovin.impl.ab, java.util.List
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public ab subList(int i, int i2) {
            Preconditions.checkPositionIndexes(i, i2, this.d);
            ab abVar = ab.this;
            int i3 = this.c;
            return abVar.subList(i + i3, i2 + i3);
        }

        @Override // com.applovin.impl.ab, java.util.List
        public /* bridge */ /* synthetic */ ListIterator listIterator(int i) {
            return super.listIterator(i);
        }
    }

    @Override // java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        return dc.a(this, obj);
    }

    @Override // java.util.Collection, java.util.List
    public int hashCode() {
        int size = size();
        int i = 1;
        for (int i2 = 0; i2 < size; i2++) {
            i = ~(~((i * 31) + get(i2).hashCode()));
        }
        return i;
    }

    private static ab b(Object... objArr) {
        return a(cg.a(objArr));
    }

    ab b(int i, int i2) {
        return new c(i, i2 - i);
    }

    public static final class a extends ya.a {
        public a() {
            this(4);
        }

        public a b(Object obj) {
            super.a(obj);
            return this;
        }

        public ab a() {
            this.c = true;
            return ab.b(this.f1199a, this.b);
        }

        a(int i) {
            super(i);
        }
    }

    @Override // com.applovin.impl.ya
    int a(Object[] objArr, int i) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            objArr[i + i2] = get(i2);
        }
        return i + size;
    }

    public static ab a(Collection collection) {
        if (collection instanceof ya) {
            ab abVarA = ((ya) collection).a();
            return abVarA.e() ? a(abVarA.toArray()) : abVarA;
        }
        return b(collection.toArray());
    }

    @Override // java.util.List
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public rp listIterator(int i) {
        Preconditions.checkPositionIndex(i, size());
        if (isEmpty()) {
            return b;
        }
        return new b(this, i);
    }

    public static ab a(Object obj) {
        return b(obj);
    }

    public static ab a(Object obj, Object obj2) {
        return b(obj, obj2);
    }

    public static ab a(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return b(obj, obj2, obj3, obj4, obj5);
    }

    public static ab a(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        return b(obj, obj2, obj3, obj4, obj5, obj6);
    }

    public static ab a(Comparator comparator, Iterable iterable) {
        Preconditions.checkNotNull(comparator);
        Object[] objArrC = rb.c(iterable);
        cg.a(objArrC);
        Arrays.sort(objArrC, comparator);
        return a(objArrC);
    }

    @Override // java.util.List
    /* renamed from: a */
    public ab subList(int i, int i2) {
        Preconditions.checkPositionIndexes(i, i2, size());
        int i3 = i2 - i;
        if (i3 == size()) {
            return this;
        }
        if (i3 == 0) {
            return h();
        }
        return b(i, i2);
    }
}
