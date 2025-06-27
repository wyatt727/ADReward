package com.google.android.gms.internal.games;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* compiled from: com.google.android.gms:play-services-games@@21.0.0 */
/* loaded from: classes3.dex */
public abstract class zzfs<E> extends AbstractCollection<E> implements Serializable {
    private static final Object[] zzmr = new Object[0];

    zzfs() {
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: zzcn, reason: merged with bridge method [inline-methods] */
    public abstract zzgg<E> iterator();

    @NullableDecl
    Object[] zzco() {
        return null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray() {
        return toArray(zzmr);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        zzfo.checkNotNull(tArr);
        int size = size();
        if (tArr.length < size) {
            Object[] objArrZzco = zzco();
            if (objArrZzco != null) {
                return (T[]) Arrays.copyOfRange(objArrZzco, zzcp(), zzcq(), tArr.getClass());
            }
            tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), size));
        } else if (tArr.length > size) {
            tArr[size] = null;
        }
        zza(tArr, 0);
        return tArr;
    }

    int zzcp() {
        throw new UnsupportedOperationException();
    }

    int zzcq() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean add(E e) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean addAll(Collection<? extends E> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean removeAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean retainAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    public zzft<E> zzcr() {
        return isEmpty() ? zzft.zzcs() : zzft.zza(toArray());
    }

    int zza(Object[] objArr, int i) {
        zzgg zzggVar = (zzgg) iterator();
        while (zzggVar.hasNext()) {
            objArr[i] = zzggVar.next();
            i++;
        }
        return i;
    }
}
