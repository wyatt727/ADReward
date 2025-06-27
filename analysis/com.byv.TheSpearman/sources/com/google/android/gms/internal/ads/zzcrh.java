package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzcrh extends zzbbq {
    private final zzcrg zza;
    private final com.google.android.gms.ads.internal.client.zzbu zzb;
    private final zzfbl zzc;
    private boolean zzd = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzaG)).booleanValue();
    private final zzduh zze;

    public zzcrh(zzcrg zzcrgVar, com.google.android.gms.ads.internal.client.zzbu zzbuVar, zzfbl zzfblVar, zzduh zzduhVar) {
        this.zza = zzcrgVar;
        this.zzb = zzbuVar;
        this.zzc = zzfblVar;
        this.zze = zzduhVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbbr
    public final com.google.android.gms.ads.internal.client.zzbu zze() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbbr
    public final com.google.android.gms.ads.internal.client.zzdn zzf() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzgQ)).booleanValue()) {
            return this.zza.zzl();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbbr
    public final void zzg(boolean z) {
        this.zzd = z;
    }

    @Override // com.google.android.gms.internal.ads.zzbbr
    public final void zzh(com.google.android.gms.ads.internal.client.zzdg zzdgVar) {
        Preconditions.checkMainThread("setOnPaidEventListener must be called on the main UI thread.");
        if (this.zzc != null) {
            try {
                if (!zzdgVar.zzf()) {
                    this.zze.zze();
                }
            } catch (RemoteException e) {
                com.google.android.gms.ads.internal.util.client.zzm.zzf("Error in making CSI ping for reporting paid event callback", e);
            }
            this.zzc.zzn(zzdgVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbbr
    public final void zzi(IObjectWrapper iObjectWrapper, zzbby zzbbyVar) {
        try {
            this.zzc.zzp(zzbbyVar);
            this.zza.zzd((Activity) ObjectWrapper.unwrap(iObjectWrapper), zzbbyVar, this.zzd);
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzm.zzl("#007 Could not call remote method.", e);
        }
    }
}
