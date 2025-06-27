package com.applovin.impl;

import com.applovin.exoplayer2.common.base.Preconditions;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;

/* loaded from: classes.dex */
public abstract class ya extends AbstractCollection implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    private static final Object[] f1198a = new Object[0];

    abstract int a(Object[] objArr, int i);

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    Object[] b() {
        return null;
    }

    int c() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public abstract boolean contains(Object obj);

    int d() {
        throw new UnsupportedOperationException();
    }

    abstract boolean e();

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public abstract qp iterator();

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    ya() {
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray() {
        return toArray(f1198a);
    }

    public ab a() {
        return isEmpty() ? ab.h() : ab.a(toArray());
    }

    public static abstract class b {
        b() {
        }

        static int a(int i, int i2) {
            if (i2 < 0) {
                throw new AssertionError("cannot store more than MAX_VALUE elements");
            }
            int iHighestOneBit = i + (i >> 1) + 1;
            if (iHighestOneBit < i2) {
                iHighestOneBit = Integer.highestOneBit(i2 - 1) << 1;
            }
            if (iHighestOneBit < 0) {
                return Integer.MAX_VALUE;
            }
            return iHighestOneBit;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        Preconditions.checkNotNull(objArr);
        int size = size();
        if (objArr.length < size) {
            Object[] objArrB = b();
            if (objArrB != null) {
                return jh.a(objArrB, d(), c(), objArr);
            }
            objArr = cg.b(objArr, size);
        } else if (objArr.length > size) {
            objArr[size] = null;
        }
        a(objArr, 0);
        return objArr;
    }

    static abstract class a extends b {

        /* renamed from: a, reason: collision with root package name */
        Object[] f1199a;
        int b;
        boolean c;

        a(int i) {
            n3.a(i, "initialCapacity");
            this.f1199a = new Object[i];
            this.b = 0;
        }

        public a a(Object obj) {
            Preconditions.checkNotNull(obj);
            a(this.b + 1);
            Object[] objArr = this.f1199a;
            int i = this.b;
            this.b = i + 1;
            objArr[i] = obj;
            return this;
        }

        private void a(int i) {
            Object[] objArr = this.f1199a;
            if (objArr.length < i) {
                this.f1199a = Arrays.copyOf(objArr, b.a(objArr.length, i));
                this.c = false;
            } else if (this.c) {
                this.f1199a = (Object[]) objArr.clone();
                this.c = false;
            }
        }
    }
}
