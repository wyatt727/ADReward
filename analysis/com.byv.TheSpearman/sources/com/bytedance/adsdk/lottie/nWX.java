package com.bytedance.adsdk.lottie;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* compiled from: MapCollections.java */
/* loaded from: classes2.dex */
abstract class nWX<K, V> {
    nWX<K, V>.mZx mZx;

    protected abstract int EYQ();

    protected abstract int EYQ(Object obj);

    protected abstract Object EYQ(int i, int i2);

    protected abstract void EYQ(int i);

    protected abstract void Td();

    protected abstract Map<K, V> mZx();

    nWX() {
    }

    /* compiled from: MapCollections.java */
    final class EYQ<T> implements Iterator<T> {
        final int EYQ;
        boolean Pm = false;
        int Td;
        int mZx;

        EYQ(int i) {
            this.EYQ = i;
            this.mZx = nWX.this.EYQ();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.Td < this.mZx;
        }

        @Override // java.util.Iterator
        public T next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            T t = (T) nWX.this.EYQ(this.Td, this.EYQ);
            this.Td++;
            this.Pm = true;
            return t;
        }

        @Override // java.util.Iterator
        public void remove() {
            if (!this.Pm) {
                throw new IllegalStateException();
            }
            int i = this.Td - 1;
            this.Td = i;
            this.mZx--;
            this.Pm = false;
            nWX.this.EYQ(i);
        }
    }

    /* compiled from: MapCollections.java */
    final class mZx implements Set<K> {
        mZx() {
        }

        @Override // java.util.Set, java.util.Collection
        public boolean add(K k) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean addAll(Collection<? extends K> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public void clear() {
            nWX.this.Td();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean contains(Object obj) {
            return nWX.this.EYQ(obj) >= 0;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean containsAll(Collection<?> collection) {
            return nWX.EYQ(nWX.this.mZx(), collection);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean isEmpty() {
            return nWX.this.EYQ() == 0;
        }

        @Override // java.util.Set, java.util.Collection, java.lang.Iterable
        public Iterator<K> iterator() {
            return new EYQ(0);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean remove(Object obj) {
            int iEYQ = nWX.this.EYQ(obj);
            if (iEYQ < 0) {
                return false;
            }
            nWX.this.EYQ(iEYQ);
            return true;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            return nWX.mZx(nWX.this.mZx(), collection);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean retainAll(Collection<?> collection) {
            return nWX.Td(nWX.this.mZx(), collection);
        }

        @Override // java.util.Set, java.util.Collection
        public int size() {
            return nWX.this.EYQ();
        }

        @Override // java.util.Set, java.util.Collection
        public Object[] toArray() {
            return nWX.this.mZx(0);
        }

        @Override // java.util.Set, java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            return (T[]) nWX.this.EYQ(tArr, 0);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean equals(Object obj) {
            return nWX.EYQ(this, obj);
        }

        @Override // java.util.Set, java.util.Collection
        public int hashCode() {
            int iHashCode = 0;
            for (int iEYQ = nWX.this.EYQ() - 1; iEYQ >= 0; iEYQ--) {
                Object objEYQ = nWX.this.EYQ(iEYQ, 0);
                iHashCode += objEYQ == null ? 0 : objEYQ.hashCode();
            }
            return iHashCode;
        }
    }

    public static <K, V> boolean EYQ(Map<K, V> map, Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            if (!map.containsKey(it.next())) {
                return false;
            }
        }
        return true;
    }

    public static <K, V> boolean mZx(Map<K, V> map, Collection<?> collection) {
        int size = map.size();
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            map.remove(it.next());
        }
        return size != map.size();
    }

    public static <K, V> boolean Td(Map<K, V> map, Collection<?> collection) {
        int size = map.size();
        Iterator<K> it = map.keySet().iterator();
        while (it.hasNext()) {
            if (!collection.contains(it.next())) {
                it.remove();
            }
        }
        return size != map.size();
    }

    public Object[] mZx(int i) {
        int iEYQ = EYQ();
        Object[] objArr = new Object[iEYQ];
        for (int i2 = 0; i2 < iEYQ; i2++) {
            objArr[i2] = EYQ(i2, i);
        }
        return objArr;
    }

    public <T> T[] EYQ(T[] tArr, int i) {
        int iEYQ = EYQ();
        if (tArr.length < iEYQ) {
            tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), iEYQ));
        }
        for (int i2 = 0; i2 < iEYQ; i2++) {
            tArr[i2] = EYQ(i2, i);
        }
        if (tArr.length > iEYQ) {
            tArr[iEYQ] = null;
        }
        return tArr;
    }

    public static <T> boolean EYQ(Set<T> set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                if (set.size() == set2.size()) {
                    if (set.containsAll(set2)) {
                        return true;
                    }
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    public Set<K> Pm() {
        if (this.mZx == null) {
            this.mZx = new mZx();
        }
        return this.mZx;
    }
}
