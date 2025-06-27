package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
class zzfyc implements Iterator {
    final Iterator zza;
    final Collection zzb;
    final /* synthetic */ zzfyd zzc;

    zzfyc(zzfyd zzfydVar) {
        this.zzc = zzfydVar;
        this.zzb = zzfydVar.zzb;
        Collection collection = zzfydVar.zzb;
        this.zza = collection instanceof List ? ((List) collection).listIterator() : collection.iterator();
    }

    zzfyc(zzfyd zzfydVar, Iterator it) {
        this.zzc = zzfydVar;
        this.zzb = zzfydVar.zzb;
        this.zza = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        zza();
        return this.zza.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        zza();
        return this.zza.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.zza.remove();
        zzfyg zzfygVar = this.zzc.zze;
        zzfygVar.zzb--;
        this.zzc.zzc();
    }

    final void zza() {
        this.zzc.zzb();
        if (this.zzc.zzb != this.zzb) {
            throw new ConcurrentModificationException();
        }
    }
}
