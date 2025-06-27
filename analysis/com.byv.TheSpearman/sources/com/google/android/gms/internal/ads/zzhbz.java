package com.google.android.gms.internal.ads;

import java.util.NoSuchElementException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.1.0 */
/* loaded from: classes3.dex */
final class zzhbz extends zzgyb {
    final zzhcd zza;
    zzgyd zzb = zzb();
    final /* synthetic */ zzhcf zzc;

    zzhbz(zzhcf zzhcfVar) {
        this.zzc = zzhcfVar;
        this.zza = new zzhcd(zzhcfVar, null);
    }

    private final zzgyd zzb() {
        zzhcd zzhcdVar = this.zza;
        if (zzhcdVar.hasNext()) {
            return zzhcdVar.next().iterator();
        }
        return null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zzb != null;
    }

    @Override // com.google.android.gms.internal.ads.zzgyd
    public final byte zza() {
        zzgyd zzgydVar = this.zzb;
        if (zzgydVar == null) {
            throw new NoSuchElementException();
        }
        byte bZza = zzgydVar.zza();
        if (!this.zzb.hasNext()) {
            this.zzb = zzb();
        }
        return bZza;
    }
}
