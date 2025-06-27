package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzcrg extends zzctv {
    private final zzcgm zzc;
    private final int zzd;
    private final Context zze;
    private final zzcqu zzf;
    private final zzdiu zzg;
    private final zzdfr zzh;
    private final zzczd zzi;
    private final boolean zzj;
    private final zzcbl zzk;
    private boolean zzl;

    zzcrg(zzctu zzctuVar, Context context, zzcgm zzcgmVar, int i, zzcqu zzcquVar, zzdiu zzdiuVar, zzdfr zzdfrVar, zzczd zzczdVar, zzcbl zzcblVar) {
        super(zzctuVar);
        this.zzl = false;
        this.zzc = zzcgmVar;
        this.zze = context;
        this.zzd = i;
        this.zzf = zzcquVar;
        this.zzg = zzdiuVar;
        this.zzh = zzdfrVar;
        this.zzi = zzczdVar;
        this.zzj = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzfm)).booleanValue();
        this.zzk = zzcblVar;
    }

    public final int zza() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzctv
    public final void zzb() {
        super.zzb();
        zzcgm zzcgmVar = this.zzc;
        if (zzcgmVar != null) {
            zzcgmVar.destroy();
        }
    }

    public final void zzc(zzbbl zzbblVar) {
        zzcgm zzcgmVar = this.zzc;
        if (zzcgmVar != null) {
            zzcgmVar.zzai(zzbblVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v13, types: [android.content.Context] */
    public final void zzd(Activity activity, zzbby zzbbyVar, boolean z) throws RemoteException {
        zzcgm zzcgmVar;
        zzffn zzffnVarZzD;
        Activity activity2 = activity;
        if (activity == null) {
            activity2 = this.zze;
        }
        if (this.zzj) {
            this.zzh.zzb();
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzaB)).booleanValue()) {
            com.google.android.gms.ads.internal.zzu.zzp();
            if (com.google.android.gms.ads.internal.util.zzt.zzG(activity2)) {
                com.google.android.gms.ads.internal.util.client.zzm.zzj("Interstitials that show when your app is in the background are a violation of AdMob policies and may lead to blocked ad serving. To learn more, visit  https://googlemobileadssdk.page.link/admob-interstitial-policies");
                this.zzi.zzb();
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzaC)).booleanValue()) {
                    new zzfqa(activity2.getApplicationContext(), com.google.android.gms.ads.internal.zzu.zzt().zzb()).zza(this.zza.zzb.zzb.zzb);
                    return;
                }
                return;
            }
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzlz)).booleanValue() && (zzcgmVar = this.zzc) != null && (zzffnVarZzD = zzcgmVar.zzD()) != null && zzffnVarZzD.zzar && zzffnVarZzD.zzas != this.zzk.zzb()) {
            com.google.android.gms.ads.internal.util.client.zzm.zzj("The app open consent form has been shown.");
            this.zzi.zza(zzfhk.zzd(12, "The consent form has already been shown.", null));
            return;
        }
        if (this.zzl) {
            com.google.android.gms.ads.internal.util.client.zzm.zzj("App open interstitial ad is already visible.");
            this.zzi.zza(zzfhk.zzd(10, null, null));
        }
        if (this.zzl) {
            return;
        }
        try {
            this.zzg.zza(z, activity2, this.zzi);
            if (this.zzj) {
                this.zzh.zza();
            }
            this.zzl = true;
        } catch (zzdit e) {
            this.zzi.zzc(e);
        }
    }

    public final void zze(long j, int i) {
        this.zzf.zza(j, i);
    }
}
