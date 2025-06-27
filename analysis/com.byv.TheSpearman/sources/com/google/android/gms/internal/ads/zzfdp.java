package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
final class zzfdp implements zzgea {
    final /* synthetic */ zzeop zza;
    final /* synthetic */ zzflh zzb;
    final /* synthetic */ zzfkw zzc;
    final /* synthetic */ zzdim zzd;
    final /* synthetic */ zzfdq zze;

    zzfdp(zzfdq zzfdqVar, zzeop zzeopVar, zzflh zzflhVar, zzfkw zzfkwVar, zzdim zzdimVar) {
        this.zza = zzeopVar;
        this.zzb = zzflhVar;
        this.zzc = zzfkwVar;
        this.zzd = zzdimVar;
        this.zze = zzfdqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgea
    public final void zza(Throwable th) {
        zzflh zzflhVar;
        final com.google.android.gms.ads.internal.client.zze zzeVarZza = this.zzd.zza().zza(th);
        synchronized (this.zze) {
            this.zze.zzi = null;
            this.zzd.zzb().zzdB(zzeVarZza);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzig)).booleanValue()) {
                this.zze.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfdl
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.zza.zze.zzd.zzdB(zzeVarZza);
                    }
                });
                this.zze.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfdm
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.zza.zze.zze.zzdB(zzeVarZza);
                    }
                });
            }
            zzfhf.zzb(zzeVarZza.zza, th, "InterstitialAdLoader.onFailure");
            this.zza.zza();
            if (!((Boolean) zzbfm.zzc.zze()).booleanValue() || (zzflhVar = this.zzb) == null) {
                zzflk zzflkVar = this.zze.zzg;
                zzfkw zzfkwVar = this.zzc;
                zzfkwVar.zza(zzeVarZza);
                zzfkwVar.zzh(th);
                zzfkwVar.zzg(false);
                zzflkVar.zzb(zzfkwVar.zzm());
            } else {
                zzflhVar.zzc(zzeVarZza);
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
        zzdhl zzdhlVar = (zzdhl) obj;
        synchronized (this.zze) {
            this.zze.zzi = null;
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzig)).booleanValue()) {
                zzdcv zzdcvVarZzn = zzdhlVar.zzn();
                zzdcvVarZzn.zza(this.zze.zzd);
                zzdcvVarZzn.zzd(this.zze.zze);
            }
            this.zza.zzb(zzdhlVar);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzig)).booleanValue()) {
                this.zze.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfdn
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.zza.zze.zzd.zzs();
                    }
                });
                this.zze.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfdo
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.zza.zze.zze.zzs();
                    }
                });
            }
            if (!((Boolean) zzbfm.zzc.zze()).booleanValue() || (zzflhVar = this.zzb) == null) {
                zzflk zzflkVar = this.zze.zzg;
                zzfkw zzfkwVar = this.zzc;
                zzfkwVar.zzb(zzdhlVar.zzp().zzb);
                zzfkwVar.zze(zzdhlVar.zzl().zzg());
                zzfkwVar.zzg(true);
                zzflkVar.zzb(zzfkwVar.zzm());
            } else {
                zzflhVar.zzg(zzdhlVar.zzp().zzb);
                zzflhVar.zzf(zzdhlVar.zzl().zzg());
                zzfkw zzfkwVar2 = this.zzc;
                zzfkwVar2.zzg(true);
                zzflhVar.zza(zzfkwVar2);
                zzflhVar.zzh();
            }
        }
    }
}
