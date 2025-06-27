package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
final class zzfas implements zzgea {
    final /* synthetic */ zzeop zza;
    final /* synthetic */ zzflh zzb;
    final /* synthetic */ zzfkw zzc;
    final /* synthetic */ zzfau zzd;
    final /* synthetic */ zzfav zze;

    zzfas(zzfav zzfavVar, zzeop zzeopVar, zzflh zzflhVar, zzfkw zzfkwVar, zzfau zzfauVar) {
        this.zza = zzeopVar;
        this.zzb = zzflhVar;
        this.zzc = zzfkwVar;
        this.zzd = zzfauVar;
        this.zze = zzfavVar;
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [com.google.android.gms.internal.ads.zzcqw, java.lang.Object] */
    @Override // com.google.android.gms.internal.ads.zzgea
    public final void zza(Throwable th) {
        zzflh zzflhVar;
        zzcqw zzcqwVar = (zzcqw) this.zze.zze.zzd();
        final com.google.android.gms.ads.internal.client.zze zzeVarZzb = zzcqwVar == null ? zzfhk.zzb(th, null) : zzcqwVar.zzb().zza(th);
        synchronized (this.zze) {
            this.zze.zzj = null;
            if (zzcqwVar != null) {
                zzcqwVar.zzc().zzdB(zzeVarZzb);
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzif)).booleanValue()) {
                    this.zze.zzc.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfar
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.zza.zze.zzd.zzdB(zzeVarZzb);
                        }
                    });
                }
            } else {
                this.zze.zzd.zzdB(zzeVarZzb);
                this.zze.zzm(this.zzd).zzh().zzb().zzc().zzh();
            }
            zzfhf.zzb(zzeVarZzb.zza, th, "AppOpenAdLoader.onFailure");
            this.zza.zza();
            if (!((Boolean) zzbfm.zzc.zze()).booleanValue() || (zzflhVar = this.zzb) == null) {
                zzflk zzflkVar = this.zze.zzh;
                zzfkw zzfkwVar = this.zzc;
                zzfkwVar.zza(zzeVarZzb);
                zzfkwVar.zzh(th);
                zzfkwVar.zzg(false);
                zzflkVar.zzb(zzfkwVar.zzm());
            } else {
                zzflhVar.zzc(zzeVarZzb);
                zzfkw zzfkwVar2 = this.zzc;
                zzfkwVar2.zzh(th);
                zzfkwVar2.zzg(false);
                zzflhVar.zza(zzfkwVar2);
                zzflhVar.zzh();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgea
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzflh zzflhVar;
        zzctv zzctvVar = (zzctv) obj;
        synchronized (this.zze) {
            this.zze.zzj = null;
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzif)).booleanValue()) {
                zzctvVar.zzn().zzb(this.zze.zzd);
            }
            this.zza.zzb(zzctvVar);
            if (!((Boolean) zzbfm.zzc.zze()).booleanValue() || (zzflhVar = this.zzb) == null) {
                zzflk zzflkVar = this.zze.zzh;
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
