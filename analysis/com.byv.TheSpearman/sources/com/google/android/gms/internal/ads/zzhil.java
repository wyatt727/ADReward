package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
final class zzhil implements Iterator {
    int zza = 0;
    final /* synthetic */ zzhim zzb;

    zzhil(zzhim zzhimVar) {
        this.zzb = zzhimVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zza < this.zzb.zza.size() || this.zzb.zzb.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.zza >= this.zzb.zza.size()) {
            zzhim zzhimVar = this.zzb;
            zzhimVar.zza.add(zzhimVar.zzb.next());
            return next();
        }
        zzhim zzhimVar2 = this.zzb;
        int i = this.zza;
        this.zza = i + 1;
        return zzhimVar2.zza.get(i);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
