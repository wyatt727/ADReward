package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import java.lang.ref.WeakReference;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzdqm extends zzctv {
    private final Context zzc;
    private final WeakReference zzd;
    private final zzdiu zze;
    private final zzdfr zzf;
    private final zzczd zzg;
    private final zzdak zzh;
    private final zzcuq zzi;
    private final zzbyg zzj;
    private final zzfqa zzk;
    private final zzfgb zzl;
    private boolean zzm;

    zzdqm(zzctu zzctuVar, Context context, zzcgm zzcgmVar, zzdiu zzdiuVar, zzdfr zzdfrVar, zzczd zzczdVar, zzdak zzdakVar, zzcuq zzcuqVar, zzffn zzffnVar, zzfqa zzfqaVar, zzfgb zzfgbVar) {
        super(zzctuVar);
        this.zzm = false;
        this.zzc = context;
        this.zze = zzdiuVar;
        this.zzd = new WeakReference(zzcgmVar);
        this.zzf = zzdfrVar;
        this.zzg = zzczdVar;
        this.zzh = zzdakVar;
        this.zzi = zzcuqVar;
        this.zzk = zzfqaVar;
        zzbyc zzbycVar = zzffnVar.zzm;
        this.zzj = new zzbza(zzbycVar != null ? zzbycVar.zza : "", zzbycVar != null ? zzbycVar.zzb : 1);
        this.zzl = zzfgbVar;
    }

    public final void finalize() throws Throwable {
        try {
            final zzcgm zzcgmVar = (zzcgm) this.zzd.get();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzgO)).booleanValue()) {
                if (!this.zzm && zzcgmVar != null) {
                    zzgep zzgepVar = zzcbr.zze;
                    Objects.requireNonNull(zzcgmVar);
                    zzgepVar.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdql
                        @Override // java.lang.Runnable
                        public final void run() {
                            zzcgmVar.destroy();
                        }
                    });
                }
            } else if (zzcgmVar != null) {
                zzcgmVar.destroy();
            }
        } finally {
            super.finalize();
        }
    }

    public final Bundle zza() {
        return this.zzh.zzb();
    }

    public final zzbyg zzc() {
        return this.zzj;
    }

    public final zzfgb zzd() {
        return this.zzl;
    }

    public final boolean zze() {
        return this.zzi.zzg();
    }

    public final boolean zzf() {
        return this.zzm;
    }

    public final boolean zzg() {
        zzcgm zzcgmVar = (zzcgm) this.zzd.get();
        return (zzcgmVar == null || zzcgmVar.zzaD()) ? false : true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v3, types: [android.content.Context] */
    public final boolean zzh(boolean z, Activity activity) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzaB)).booleanValue()) {
            com.google.android.gms.ads.internal.zzu.zzp();
            if (com.google.android.gms.ads.internal.util.zzt.zzG(this.zzc)) {
                com.google.android.gms.ads.internal.util.client.zzm.zzj("Rewarded ads that show when your app is in the background are a violation of AdMob policies and may lead to blocked ad serving. To learn more, visit https://googlemobileadssdk.page.link/admob-interstitial-policies");
                this.zzg.zzb();
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzaC)).booleanValue()) {
                    this.zzk.zza(this.zza.zzb.zzb.zzb);
                }
                return false;
            }
        }
        if (this.zzm) {
            com.google.android.gms.ads.internal.util.client.zzm.zzj("The rewarded ad have been showed.");
            this.zzg.zza(zzfhk.zzd(10, null, null));
            return false;
        }
        this.zzm = true;
        this.zzf.zzb();
        Activity activity2 = activity;
        if (activity == null) {
            activity2 = this.zzc;
        }
        try {
            this.zze.zza(z, activity2, this.zzg);
            this.zzf.zza();
            return true;
        } catch (zzdit e) {
            this.zzg.zzc(e);
            return false;
        }
    }
}
