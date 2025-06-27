package com.google.android.gms.internal.ads;

import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.Objects;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
final class zzfby implements zzgea {
    final /* synthetic */ zzeop zza;
    final /* synthetic */ zzflh zzb;
    final /* synthetic */ zzfkw zzc;
    final /* synthetic */ zzcsm zzd;
    final /* synthetic */ zzfbz zze;

    zzfby(zzfbz zzfbzVar, zzeop zzeopVar, zzflh zzflhVar, zzfkw zzfkwVar, zzcsm zzcsmVar) {
        this.zza = zzeopVar;
        this.zzb = zzflhVar;
        this.zzc = zzfkwVar;
        this.zzd = zzcsmVar;
        this.zze = zzfbzVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgea
    public final void zza(Throwable th) {
        zzflh zzflhVar;
        final com.google.android.gms.ads.internal.client.zze zzeVarZza = this.zzd.zzd().zza(th);
        synchronized (this.zze) {
            this.zze.zzl = null;
            this.zzd.zzf().zzdB(zzeVarZza);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzie)).booleanValue()) {
                this.zze.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfbw
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.zza.zze.zzd.zzdB(zzeVarZza);
                    }
                });
            }
            zzfbz zzfbzVar = this.zze;
            zzfbzVar.zzh.zzd(zzfbzVar.zzj.zzc());
            zzfhf.zzb(zzeVarZza.zza, th, "BannerAdLoader.onFailure");
            this.zza.zza();
            if (!((Boolean) zzbfm.zzc.zze()).booleanValue() || (zzflhVar = this.zzb) == null) {
                zzflk zzflkVar = this.zze.zzi;
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
        zzcrm zzcrmVar = (zzcrm) obj;
        synchronized (this.zze) {
            this.zze.zzl = null;
            this.zze.zzf.removeAllViews();
            if (zzcrmVar.zzc() != null) {
                ViewParent parent = zzcrmVar.zzc().getParent();
                if (parent instanceof ViewGroup) {
                    com.google.android.gms.ads.internal.util.client.zzm.zzj("Banner view provided from " + (zzcrmVar.zzl() != null ? zzcrmVar.zzl().zzg() : "") + " already has a parent view. Removing its old parent.");
                    ((ViewGroup) parent).removeView(zzcrmVar.zzc());
                }
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzie)).booleanValue()) {
                zzdcv zzdcvVarZzn = zzcrmVar.zzn();
                zzdcvVarZzn.zza(this.zze.zzd);
                zzdcvVarZzn.zzc(this.zze.zze);
            }
            this.zze.zzf.addView(zzcrmVar.zzc());
            this.zza.zzb(zzcrmVar);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzie)).booleanValue()) {
                zzfbz zzfbzVar = this.zze;
                Executor executor = zzfbzVar.zzb;
                final zzeoa zzeoaVar = zzfbzVar.zzd;
                Objects.requireNonNull(zzeoaVar);
                executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfbx
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzeoaVar.zzs();
                    }
                });
            }
            this.zze.zzh.zzd(zzcrmVar.zza());
            if (!((Boolean) zzbfm.zzc.zze()).booleanValue() || (zzflhVar = this.zzb) == null) {
                zzflk zzflkVar = this.zze.zzi;
                zzfkw zzfkwVar = this.zzc;
                zzfkwVar.zzb(zzcrmVar.zzp().zzb);
                zzfkwVar.zze(zzcrmVar.zzl().zzg());
                zzfkwVar.zzg(true);
                zzflkVar.zzb(zzfkwVar.zzm());
            } else {
                zzflhVar.zzg(zzcrmVar.zzp().zzb);
                zzflhVar.zzf(zzcrmVar.zzl().zzg());
                zzfkw zzfkwVar2 = this.zzc;
                zzfkwVar2.zzg(true);
                zzflhVar.zza(zzfkwVar2);
                zzflhVar.zzh();
            }
        }
    }
}
