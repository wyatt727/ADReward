package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzeig extends zzbya implements zzdaa {
    private zzbyb zza;
    private zzczz zzb;
    private zzdgy zzc;

    @Override // com.google.android.gms.internal.ads.zzdaa
    public final synchronized void zza(zzczz zzczzVar) {
        this.zzb = zzczzVar;
    }

    public final synchronized void zzc(zzbyb zzbybVar) {
        this.zza = zzbybVar;
    }

    public final synchronized void zzd(zzdgy zzdgyVar) {
        this.zzc = zzdgyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbyb
    public final synchronized void zze(IObjectWrapper iObjectWrapper) throws RemoteException {
        zzbyb zzbybVar = this.zza;
        if (zzbybVar != null) {
            ((zzell) zzbybVar).zzb.onAdClicked();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbyb
    public final synchronized void zzf(IObjectWrapper iObjectWrapper) throws RemoteException {
        zzbyb zzbybVar = this.zza;
        if (zzbybVar != null) {
            zzbybVar.zzf(iObjectWrapper);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbyb
    public final synchronized void zzg(IObjectWrapper iObjectWrapper, int i) throws RemoteException {
        zzczz zzczzVar = this.zzb;
        if (zzczzVar != null) {
            zzczzVar.zza(i);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbyb
    public final synchronized void zzh(IObjectWrapper iObjectWrapper) throws RemoteException {
        zzbyb zzbybVar = this.zza;
        if (zzbybVar != null) {
            ((zzell) zzbybVar).zzc.zzb();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbyb
    public final synchronized void zzi(IObjectWrapper iObjectWrapper) throws RemoteException {
        zzczz zzczzVar = this.zzb;
        if (zzczzVar != null) {
            zzczzVar.zzd();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbyb
    public final synchronized void zzj(IObjectWrapper iObjectWrapper) throws RemoteException {
        zzbyb zzbybVar = this.zza;
        if (zzbybVar != null) {
            ((zzell) zzbybVar).zza.zzdr();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbyb
    public final synchronized void zzk(IObjectWrapper iObjectWrapper, int i) throws RemoteException {
        zzdgy zzdgyVar = this.zzc;
        if (zzdgyVar != null) {
            com.google.android.gms.ads.internal.util.client.zzm.zzj("Fail to initialize adapter ".concat(String.valueOf(((zzelk) zzdgyVar).zzc.zza)));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbyb
    public final synchronized void zzl(IObjectWrapper iObjectWrapper) throws RemoteException {
        zzdgy zzdgyVar = this.zzc;
        if (zzdgyVar != null) {
            Executor executor = ((zzelk) zzdgyVar).zzd.zzb;
            final zzegm zzegmVar = ((zzelk) zzdgyVar).zzc;
            final zzffn zzffnVar = ((zzelk) zzdgyVar).zzb;
            final zzffz zzffzVar = ((zzelk) zzdgyVar).zza;
            final zzelk zzelkVar = (zzelk) zzdgyVar;
            executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzelj
                @Override // java.lang.Runnable
                public final void run() {
                    zzelm zzelmVar = zzelkVar.zzd;
                    zzelm.zze(zzffzVar, zzffnVar, zzegmVar);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbyb
    public final synchronized void zzm(IObjectWrapper iObjectWrapper, zzbyc zzbycVar) throws RemoteException {
        zzbyb zzbybVar = this.zza;
        if (zzbybVar != null) {
            ((zzell) zzbybVar).zzd.zza(zzbycVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbyb
    public final synchronized void zzn(IObjectWrapper iObjectWrapper) throws RemoteException {
        zzbyb zzbybVar = this.zza;
        if (zzbybVar != null) {
            ((zzell) zzbybVar).zzc.zze();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbyb
    public final synchronized void zzo(IObjectWrapper iObjectWrapper) throws RemoteException {
        zzbyb zzbybVar = this.zza;
        if (zzbybVar != null) {
            ((zzell) zzbybVar).zzd.zzc();
        }
    }
}
