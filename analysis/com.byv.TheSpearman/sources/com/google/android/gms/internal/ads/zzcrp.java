package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
final class zzcrp extends zzcrm {
    private final Context zzc;
    private final View zzd;
    private final zzcgm zze;
    private final zzffo zzf;
    private final zzctt zzg;
    private final zzdlj zzh;
    private final zzdgp zzi;
    private final zzhip zzj;
    private final Executor zzk;
    private com.google.android.gms.ads.internal.client.zzq zzl;

    zzcrp(zzctu zzctuVar, Context context, zzffo zzffoVar, View view, zzcgm zzcgmVar, zzctt zzcttVar, zzdlj zzdljVar, zzdgp zzdgpVar, zzhip zzhipVar, Executor executor) {
        super(zzctuVar);
        this.zzc = context;
        this.zzd = view;
        this.zze = zzcgmVar;
        this.zzf = zzffoVar;
        this.zzg = zzcttVar;
        this.zzh = zzdljVar;
        this.zzi = zzdgpVar;
        this.zzj = zzhipVar;
        this.zzk = executor;
    }

    public static /* synthetic */ void zzi(zzcrp zzcrpVar) {
        zzdlj zzdljVar = zzcrpVar.zzh;
        if (zzdljVar.zze() == null) {
            return;
        }
        try {
            zzdljVar.zze().zze((com.google.android.gms.ads.internal.client.zzbu) zzcrpVar.zzj.zzb(), ObjectWrapper.wrap(zzcrpVar.zzc));
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzm.zzh("RemoteException when notifyAdLoad is called", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcrm
    public final int zza() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzhN)).booleanValue() && this.zzb.zzah) {
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzhO)).booleanValue()) {
                return 0;
            }
        }
        return this.zza.zzb.zzb.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzcrm
    public final View zzc() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzcrm
    public final com.google.android.gms.ads.internal.client.zzdq zzd() {
        try {
            return this.zzg.zza();
        } catch (zzfgp unused) {
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcrm
    public final zzffo zze() {
        com.google.android.gms.ads.internal.client.zzq zzqVar = this.zzl;
        if (zzqVar != null) {
            return zzfgo.zzb(zzqVar);
        }
        zzffn zzffnVar = this.zzb;
        if (zzffnVar.zzad) {
            for (String str : zzffnVar.zza) {
                if (str == null || !str.contains("FirstParty")) {
                }
            }
            View view = this.zzd;
            return new zzffo(view.getWidth(), view.getHeight(), false);
        }
        return (zzffo) this.zzb.zzs.get(0);
    }

    @Override // com.google.android.gms.internal.ads.zzcrm
    public final zzffo zzf() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.ads.zzcrm
    public final void zzg() {
        this.zzi.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzcrm
    public final void zzh(ViewGroup viewGroup, com.google.android.gms.ads.internal.client.zzq zzqVar) {
        zzcgm zzcgmVar;
        if (viewGroup == null || (zzcgmVar = this.zze) == null) {
            return;
        }
        zzcgmVar.zzah(zzcie.zzc(zzqVar));
        viewGroup.setMinimumHeight(zzqVar.zzc);
        viewGroup.setMinimumWidth(zzqVar.zzf);
        this.zzl = zzqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzctv
    public final void zzj() {
        this.zzk.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcro
            @Override // java.lang.Runnable
            public final void run() {
                zzcrp.zzi(this.zza);
            }
        });
        super.zzj();
    }
}
