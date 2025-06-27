package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzegk implements zzegj {
    public final zzegj zza;
    private final zzfwf zzb;

    public zzegk(zzegj zzegjVar, zzfwf zzfwfVar) {
        this.zza = zzegjVar;
        this.zzb = zzfwfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzegj
    public final ListenableFuture zza(zzffz zzffzVar, zzffn zzffnVar) {
        return zzgee.zzm(this.zza.zza(zzffzVar, zzffnVar), this.zzb, zzcbr.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzegj
    public final boolean zzb(zzffz zzffzVar, zzffn zzffnVar) {
        return this.zza.zzb(zzffzVar, zzffnVar);
    }
}
