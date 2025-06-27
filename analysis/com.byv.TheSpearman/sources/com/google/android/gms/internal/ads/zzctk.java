package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzctk implements zzdae, zzazy {
    private final zzffn zza;
    private final zzczi zzb;
    private final zzdan zzc;
    private final AtomicBoolean zzd = new AtomicBoolean();
    private final AtomicBoolean zze = new AtomicBoolean();

    public zzctk(zzffn zzffnVar, zzczi zzcziVar, zzdan zzdanVar) {
        this.zza = zzffnVar;
        this.zzb = zzcziVar;
        this.zzc = zzdanVar;
    }

    private final void zza() {
        if (this.zzd.compareAndSet(false, true)) {
            this.zzb.zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzazy
    public final void zzdp(zzazx zzazxVar) {
        if (this.zza.zzf == 1 && zzazxVar.zzj) {
            zza();
        }
        if (zzazxVar.zzj && this.zze.compareAndSet(false, true)) {
            this.zzc.zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdae
    public final synchronized void zzs() {
        if (this.zza.zzf != 1) {
            zza();
        }
    }
}
