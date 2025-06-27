package com.google.android.gms.internal.measurement;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* compiled from: com.google.android.gms:play-services-measurement-base@@22.0.0 */
@Deprecated
/* loaded from: classes3.dex */
public final class zzna extends AbstractList<String> implements zzko, RandomAccess {
    private final zzko zza;

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zza.size();
    }

    @Override // com.google.android.gms.internal.measurement.zzko
    public final zzko zzd() {
        return this;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        return (String) this.zza.get(i);
    }

    @Override // com.google.android.gms.internal.measurement.zzko
    public final Object zzb(int i) {
        return this.zza.zzb(i);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator<String> iterator() {
        return new zznc(this);
    }

    @Override // com.google.android.gms.internal.measurement.zzko
    public final List<?> zze() {
        return this.zza.zze();
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator<String> listIterator(int i) {
        return new zzmz(this, i);
    }

    public zzna(zzko zzkoVar) {
        this.zza = zzkoVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzko
    public final void zza(zzii zziiVar) {
        throw new UnsupportedOperationException();
    }
}
