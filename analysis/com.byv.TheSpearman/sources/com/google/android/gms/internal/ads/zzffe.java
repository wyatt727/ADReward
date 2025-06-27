package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzffe extends zzbyi {
    private final zzffa zza;
    private final zzfeq zzb;
    private final String zzc;
    private final zzfga zzd;
    private final Context zze;
    private final VersionInfoParcel zzf;
    private final zzawo zzg;
    private final zzduh zzh;
    private zzdqm zzi;
    private boolean zzj = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzaD)).booleanValue();

    public zzffe(String str, zzffa zzffaVar, Context context, zzfeq zzfeqVar, zzfga zzfgaVar, VersionInfoParcel versionInfoParcel, zzawo zzawoVar, zzduh zzduhVar) {
        this.zzc = str;
        this.zza = zzffaVar;
        this.zzb = zzfeqVar;
        this.zzd = zzfgaVar;
        this.zze = context;
        this.zzf = versionInfoParcel;
        this.zzg = zzawoVar;
        this.zzh = zzduhVar;
    }

    private final synchronized void zzu(com.google.android.gms.ads.internal.client.zzl zzlVar, zzbyq zzbyqVar, int i) throws RemoteException {
        boolean z = false;
        if (((Boolean) zzbfr.zzl.zze()).booleanValue()) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzkP)).booleanValue()) {
                z = true;
            }
        }
        if (this.zzf.clientJarVersion < ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzkQ)).intValue() || !z) {
            Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        }
        this.zzb.zzk(zzbyqVar);
        com.google.android.gms.ads.internal.zzu.zzp();
        if (com.google.android.gms.ads.internal.util.zzt.zzH(this.zze) && zzlVar.zzs == null) {
            com.google.android.gms.ads.internal.util.client.zzm.zzg("Failed to load the ad because app ID is missing.");
            this.zzb.zzdB(zzfhk.zzd(4, null, null));
            return;
        }
        if (this.zzi != null) {
            return;
        }
        zzfes zzfesVar = new zzfes(null);
        this.zza.zzj(i);
        this.zza.zzb(zzlVar, this.zzc, zzfesVar, new zzffd(this));
    }

    @Override // com.google.android.gms.internal.ads.zzbyj
    public final Bundle zzb() {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzdqm zzdqmVar = this.zzi;
        return zzdqmVar != null ? zzdqmVar.zza() : new Bundle();
    }

    @Override // com.google.android.gms.internal.ads.zzbyj
    public final com.google.android.gms.ads.internal.client.zzdn zzc() {
        zzdqm zzdqmVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzgQ)).booleanValue() && (zzdqmVar = this.zzi) != null) {
            return zzdqmVar.zzl();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbyj
    public final zzbyg zzd() {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzdqm zzdqmVar = this.zzi;
        if (zzdqmVar != null) {
            return zzdqmVar.zzc();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbyj
    public final synchronized String zze() throws RemoteException {
        zzdqm zzdqmVar = this.zzi;
        if (zzdqmVar == null || zzdqmVar.zzl() == null) {
            return null;
        }
        return zzdqmVar.zzl().zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzbyj
    public final synchronized void zzf(com.google.android.gms.ads.internal.client.zzl zzlVar, zzbyq zzbyqVar) throws RemoteException {
        zzu(zzlVar, zzbyqVar, 2);
    }

    @Override // com.google.android.gms.internal.ads.zzbyj
    public final synchronized void zzg(com.google.android.gms.ads.internal.client.zzl zzlVar, zzbyq zzbyqVar) throws RemoteException {
        zzu(zzlVar, zzbyqVar, 3);
    }

    @Override // com.google.android.gms.internal.ads.zzbyj
    public final synchronized void zzh(boolean z) {
        Preconditions.checkMainThread("setImmersiveMode must be called on the main UI thread.");
        this.zzj = z;
    }

    @Override // com.google.android.gms.internal.ads.zzbyj
    public final void zzi(com.google.android.gms.ads.internal.client.zzdd zzddVar) {
        if (zzddVar == null) {
            this.zzb.zzg(null);
        } else {
            this.zzb.zzg(new zzffc(this, zzddVar));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbyj
    public final void zzj(com.google.android.gms.ads.internal.client.zzdg zzdgVar) {
        Preconditions.checkMainThread("setOnPaidEventListener must be called on the main UI thread.");
        try {
            if (!zzdgVar.zzf()) {
                this.zzh.zze();
            }
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzm.zzf("Error in making CSI ping for reporting paid event callback", e);
        }
        this.zzb.zzi(zzdgVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbyj
    public final void zzk(zzbym zzbymVar) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        this.zzb.zzj(zzbymVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbyj
    public final synchronized void zzl(zzbyx zzbyxVar) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzfga zzfgaVar = this.zzd;
        zzfgaVar.zza = zzbyxVar.zza;
        zzfgaVar.zzb = zzbyxVar.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbyj
    public final synchronized void zzm(IObjectWrapper iObjectWrapper) throws RemoteException {
        zzn(iObjectWrapper, this.zzj);
    }

    @Override // com.google.android.gms.internal.ads.zzbyj
    public final synchronized void zzn(IObjectWrapper iObjectWrapper, boolean z) throws RemoteException {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        if (this.zzi == null) {
            com.google.android.gms.ads.internal.util.client.zzm.zzj("Rewarded can not be shown before loaded");
            this.zzb.zzq(zzfhk.zzd(9, null, null));
            return;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzcC)).booleanValue()) {
            this.zzg.zzc().zzn(new Throwable().getStackTrace());
        }
        this.zzi.zzh(z, (Activity) ObjectWrapper.unwrap(iObjectWrapper));
    }

    @Override // com.google.android.gms.internal.ads.zzbyj
    public final boolean zzo() {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzdqm zzdqmVar = this.zzi;
        return (zzdqmVar == null || zzdqmVar.zzf()) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.zzbyj
    public final void zzp(zzbyr zzbyrVar) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        this.zzb.zzo(zzbyrVar);
    }
}
