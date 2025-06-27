package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
final class zzfio implements zzgea {
    final /* synthetic */ zzfir zza;
    final /* synthetic */ zzfis zzb;

    zzfio(zzfis zzfisVar, zzfir zzfirVar) {
        this.zza = zzfirVar;
        this.zzb = zzfisVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgea
    public final void zza(Throwable th) {
        synchronized (this.zzb) {
            this.zzb.zze = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgea
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        synchronized (this.zzb) {
            this.zzb.zze = null;
            this.zzb.zzd.addFirst(this.zza);
            zzfis zzfisVar = this.zzb;
            if (zzfisVar.zzf == 1) {
                zzfisVar.zzh();
            }
        }
    }
}
