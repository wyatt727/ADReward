package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
final class zzfex implements zzgea {
    final /* synthetic */ zzeop zza;
    final /* synthetic */ zzflh zzb;
    final /* synthetic */ zzfkw zzc;
    final /* synthetic */ zzfez zzd;
    final /* synthetic */ zzffa zze;

    zzfex(zzffa zzffaVar, zzeop zzeopVar, zzflh zzflhVar, zzfkw zzfkwVar, zzfez zzfezVar) {
        this.zza = zzeopVar;
        this.zzb = zzflhVar;
        this.zzc = zzfkwVar;
        this.zzd = zzfezVar;
        this.zze = zzffaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgea
    public final void zza(Throwable th) {
        zzflh zzflhVar;
        zzdqr zzdqrVar = (zzdqr) this.zze.zze.zzd();
        final com.google.android.gms.ads.internal.client.zze zzeVarZzb = zzdqrVar == null ? zzfhk.zzb(th, null) : zzdqrVar.zzb().zza(th);
        synchronized (this.zze) {
            if (zzdqrVar != null) {
                zzdqrVar.zza().zzdB(zzeVarZzb);
                this.zze.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfev
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.zza.zze.zzd.zzdB(zzeVarZzb);
                    }
                });
            } else {
                this.zze.zzd.zzdB(zzeVarZzb);
                this.zze.zzk(this.zzd).zzh().zzb().zzc().zzh();
            }
            zzfhf.zzb(zzeVarZzb.zza, th, "RewardedAdLoader.onFailure");
            this.zza.zza();
            if (!((Boolean) zzbfm.zzc.zze()).booleanValue() || (zzflhVar = this.zzb) == null) {
                zzflk zzflkVar = this.zze.zzg;
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
        zzdqm zzdqmVar = (zzdqm) obj;
        synchronized (this.zze) {
            zzdqmVar.zzn().zzd(this.zze.zzd);
            this.zza.zzb(zzdqmVar);
            zzffa zzffaVar = this.zze;
            Executor executor = zzffaVar.zzb;
            final zzfeq zzfeqVar = zzffaVar.zzd;
            Objects.requireNonNull(zzfeqVar);
            executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfew
                @Override // java.lang.Runnable
                public final void run() {
                    zzfeqVar.zzs();
                }
            });
            this.zze.zzd.onAdMetadataChanged();
            if (!((Boolean) zzbfm.zzc.zze()).booleanValue() || (zzflhVar = this.zzb) == null) {
                zzflk zzflkVar = this.zze.zzg;
                zzfkw zzfkwVar = this.zzc;
                zzfkwVar.zzb(zzdqmVar.zzp().zzb);
                zzfkwVar.zze(zzdqmVar.zzl().zzg());
                zzfkwVar.zzg(true);
                zzflkVar.zzb(zzfkwVar.zzm());
            } else {
                zzflhVar.zzg(zzdqmVar.zzp().zzb);
                zzflhVar.zzf(zzdqmVar.zzl().zzg());
                zzfkw zzfkwVar2 = this.zzc;
                zzfkwVar2.zzg(true);
                zzflhVar.zza(zzfkwVar2);
                zzflhVar.zzh();
            }
        }
    }
}
