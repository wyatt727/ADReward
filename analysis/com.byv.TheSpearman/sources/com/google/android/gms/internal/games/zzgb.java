package com.google.android.gms.internal.games;

import java.util.Iterator;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* compiled from: com.google.android.gms:play-services-games@@21.0.0 */
/* loaded from: classes3.dex */
final class zzgb<E> extends zzfy<E> {
    static final zzgb<Object> zzmz = new zzgb<>(new Object[0], 0, null, 0, 0);
    private final transient int mask;
    private final transient int size;
    private final transient Object[] zzna;
    private final transient Object[] zznb;
    private final transient int zznc;

    zzgb(Object[] objArr, int i, Object[] objArr2, int i2, int i3) {
        this.zzna = objArr;
        this.zznb = objArr2;
        this.mask = i2;
        this.zznc = i;
        this.size = i3;
    }

    @Override // com.google.android.gms.internal.games.zzfs
    final int zzcp() {
        return 0;
    }

    @Override // com.google.android.gms.internal.games.zzfy
    final boolean zzcu() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(@NullableDecl Object obj) {
        Object[] objArr = this.zznb;
        if (obj == null || objArr == null) {
            return false;
        }
        int iZzp = zzfp.zzp(obj == null ? 0 : obj.hashCode());
        while (true) {
            int i = iZzp & this.mask;
            Object obj2 = objArr[i];
            if (obj2 == null) {
                return false;
            }
            if (obj2.equals(obj)) {
                return true;
            }
            iZzp = i + 1;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.size;
    }

    @Override // com.google.android.gms.internal.games.zzfs
    /* renamed from: zzcn */
    public final zzgg<E> iterator() {
        return (zzgg) zzcr().iterator();
    }

    @Override // com.google.android.gms.internal.games.zzfs
    final Object[] zzco() {
        return this.zzna;
    }

    @Override // com.google.android.gms.internal.games.zzfs
    final int zzcq() {
        return this.size;
    }

    @Override // com.google.android.gms.internal.games.zzfs
    final int zza(Object[] objArr, int i) {
        System.arraycopy(this.zzna, 0, objArr, i, this.size);
        return i + this.size;
    }

    @Override // com.google.android.gms.internal.games.zzfy
    final zzft<E> zzcv() {
        return zzft.zzb(this.zzna, this.size);
    }

    @Override // com.google.android.gms.internal.games.zzfy, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.zznc;
    }

    @Override // com.google.android.gms.internal.games.zzfy, com.google.android.gms.internal.games.zzfs, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return iterator();
    }
}
