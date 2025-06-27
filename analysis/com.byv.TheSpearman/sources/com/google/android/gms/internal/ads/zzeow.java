package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
final class zzeow implements zzgea {
    final /* synthetic */ zzeop zza;
    final /* synthetic */ zzflh zzb;
    final /* synthetic */ zzfkw zzc;
    final /* synthetic */ zzdji zzd;
    final /* synthetic */ zzeox zze;

    zzeow(zzeox zzeoxVar, zzeop zzeopVar, zzflh zzflhVar, zzfkw zzfkwVar, zzdji zzdjiVar) {
        this.zza = zzeopVar;
        this.zzb = zzflhVar;
        this.zzc = zzfkwVar;
        this.zzd = zzdjiVar;
        this.zze = zzeoxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgea
    public final void zza(Throwable th) {
        zzflh zzflhVar;
        final com.google.android.gms.ads.internal.client.zze zzeVarZza = this.zzd.zza().zza(th);
        this.zzd.zzb().zzdB(zzeVarZza);
        this.zze.zzb.zzB().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzeov
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zze.zzd.zza().zzdB(zzeVarZza);
            }
        });
        zzfhf.zzb(zzeVarZza.zza, th, "NativeAdLoader.onFailure");
        this.zza.zza();
        if (((Boolean) zzbfm.zzc.zze()).booleanValue() && (zzflhVar = this.zzb) != null) {
            zzflhVar.zzc(zzeVarZza);
            zzfkw zzfkwVar = this.zzc;
            zzfkwVar.zzh(th);
            zzfkwVar.zzg(false);
            zzflhVar.zza(zzfkwVar);
            zzflhVar.zzh();
            return;
        }
        zzeox zzeoxVar = this.zze;
        zzfkw zzfkwVar2 = this.zzc;
        zzflk zzflkVar = zzeoxVar.zze;
        zzfkwVar2.zza(zzeVarZza);
        zzfkwVar2.zzh(th);
        zzfkwVar2.zzg(false);
        zzflkVar.zzb(zzfkwVar2.zzm());
    }

    @Override // com.google.android.gms.internal.ads.zzgea
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzflh zzflhVar;
        zzctv zzctvVar = (zzctv) obj;
        synchronized (this.zze) {
            zzctvVar.zzn().zza(this.zze.zzd.zzd());
            this.zza.zzb(zzctvVar);
            this.zze.zzb.zzB().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzeou
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zze.zzd.zzb().zzs();
                }
            });
            if (!((Boolean) zzbfm.zzc.zze()).booleanValue() || (zzflhVar = this.zzb) == null) {
                zzflk zzflkVar = this.zze.zze;
                zzfkw zzfkwVar = this.zzc;
                zzfkwVar.zzb(zzctvVar.zzp().zzb);
                zzfkwVar.zze(zzctvVar.zzl().zzg());
                zzfkwVar.zzg(true);
                zzflkVar.zzb(zzfkwVar.zzm());
            } else {
                zzflhVar.zzg(zzctvVar.zzp().zzb);
                zzflhVar.zzf(zzctvVar.zzl().zzg());
                zzfkw zzfkwVar2 = this.zzc;
                zzfkwVar2.zzg(true);
                zzflhVar.zza(zzfkwVar2);
                zzflhVar.zzh();
            }
        }
    }
}
