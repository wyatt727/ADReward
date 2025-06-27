package org.objectweb.asm.tree.analysis;

import java.util.AbstractSet;
import java.util.HashSet;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;

/* loaded from: classes5.dex */
final class SmallSet<T> extends AbstractSet<T> {
    private final T element1;
    private final T element2;

    SmallSet() {
        this.element1 = null;
        this.element2 = null;
    }

    SmallSet(T t) {
        this.element1 = t;
        this.element2 = null;
    }

    private SmallSet(T t, T t2) {
        this.element1 = t;
        this.element2 = t2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator<T> iterator() {
        return new IteratorImpl(this.element1, this.element2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        if (this.element1 == null) {
            return 0;
        }
        return this.element2 == null ? 1 : 2;
    }

    Set<T> union(SmallSet<T> smallSet) {
        T t;
        T t2 = smallSet.element1;
        T t3 = this.element1;
        if ((t2 == t3 && smallSet.element2 == this.element2) || ((t2 == (t = this.element2) && smallSet.element2 == t3) || t2 == null)) {
            return this;
        }
        if (t3 == null) {
            return smallSet;
        }
        T t4 = smallSet.element2;
        if (t4 == null) {
            if (t == null) {
                return new SmallSet(this.element1, smallSet.element1);
            }
            if (t2 == t3 || t2 == t) {
                return this;
            }
        }
        if (t == null && (t3 == t2 || t3 == t4)) {
            return smallSet;
        }
        HashSet hashSet = new HashSet(4);
        hashSet.add(this.element1);
        T t5 = this.element2;
        if (t5 != null) {
            hashSet.add(t5);
        }
        hashSet.add(smallSet.element1);
        T t6 = smallSet.element2;
        if (t6 != null) {
            hashSet.add(t6);
        }
        return hashSet;
    }

    static class IteratorImpl<T> implements Iterator<T> {
        private T firstElement;
        private T secondElement;

        IteratorImpl(T t, T t2) {
            this.firstElement = t;
            this.secondElement = t2;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.firstElement != null;
        }

        @Override // java.util.Iterator
        public T next() {
            T t = this.firstElement;
            if (t == null) {
                throw new NoSuchElementException();
            }
            this.firstElement = this.secondElement;
            this.secondElement = null;
            return t;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }
}
