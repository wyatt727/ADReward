package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
final class zzcuj implements zzgea {
    final /* synthetic */ zzgea zza;
    final /* synthetic */ zzcuk zzb;

    zzcuj(zzcuk zzcukVar, zzgea zzgeaVar) {
        this.zza = zzgeaVar;
        this.zzb = zzcukVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgea
    public final void zza(Throwable th) {
        zzcbr.zze.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcue
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzd();
            }
        });
        this.zza.zza(th);
    }

    @Override // com.google.android.gms.internal.ads.zzgea
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzcbr.zze.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcue
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzd();
            }
        });
        this.zza.zzb((zzctv) obj);
    }
}
