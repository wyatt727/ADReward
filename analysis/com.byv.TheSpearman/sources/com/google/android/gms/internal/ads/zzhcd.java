package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.1.0 */
/* loaded from: classes3.dex */
final class zzhcd implements Iterator {
    private final ArrayDeque zza;
    private zzgye zzb;

    /* synthetic */ zzhcd(zzgyj zzgyjVar, zzhcc zzhccVar) {
        if (!(zzgyjVar instanceof zzhcf)) {
            this.zza = null;
            this.zzb = (zzgye) zzgyjVar;
            return;
        }
        zzhcf zzhcfVar = (zzhcf) zzgyjVar;
        ArrayDeque arrayDeque = new ArrayDeque(zzhcfVar.zzf());
        this.zza = arrayDeque;
        arrayDeque.push(zzhcfVar);
        this.zzb = zzb(zzhcfVar.zzd);
    }

    private final zzgye zzb(zzgyj zzgyjVar) {
        while (zzgyjVar instanceof zzhcf) {
            zzhcf zzhcfVar = (zzhcf) zzgyjVar;
            this.zza.push(zzhcfVar);
            zzgyjVar = zzhcfVar.zzd;
        }
        return (zzgye) zzgyjVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zzb != null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Iterator
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzgye next() {
        zzgye zzgyeVarZzb;
        zzgye zzgyeVar = this.zzb;
        if (zzgyeVar == null) {
            throw new NoSuchElementException();
        }
        do {
            ArrayDeque arrayDeque = this.zza;
            zzgyeVarZzb = null;
            if (arrayDeque == null || arrayDeque.isEmpty()) {
                break;
            }
            zzgyeVarZzb = zzb(((zzhcf) this.zza.pop()).zze);
        } while (zzgyeVarZzb.zzd() == 0);
        this.zzb = zzgyeVarZzb;
        return zzgyeVar;
    }
}
