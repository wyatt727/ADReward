package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import org.json.JSONException;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
final class zzdvw extends zzbyl {
    final /* synthetic */ zzdvx zza;

    zzdvw(zzdvx zzdvxVar) {
        this.zza = zzdvxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbym
    public final void zze() throws JSONException, RemoteException {
        zzdvx zzdvxVar = this.zza;
        zzdvxVar.zzb.zzj(zzdvxVar.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbym
    public final void zzf() throws JSONException, RemoteException {
        zzdvx zzdvxVar = this.zza;
        zzdvxVar.zzb.zzo(zzdvxVar.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbym
    public final void zzg() throws JSONException, RemoteException {
        zzdvx zzdvxVar = this.zza;
        zzdvxVar.zzb.zzk(zzdvxVar.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbym
    public final void zzh(int i) throws JSONException, RemoteException {
        zzdvx zzdvxVar = this.zza;
        zzdvxVar.zzb.zzn(zzdvxVar.zza, i);
    }

    @Override // com.google.android.gms.internal.ads.zzbym
    public final void zzi(com.google.android.gms.ads.internal.client.zze zzeVar) throws JSONException, RemoteException {
        zzdvx zzdvxVar = this.zza;
        zzdvxVar.zzb.zzn(zzdvxVar.zza, zzeVar.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbym
    public final void zzj() throws JSONException, RemoteException {
        zzdvx zzdvxVar = this.zza;
        zzdvxVar.zzb.zzr(zzdvxVar.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbym
    public final void zzk(zzbyg zzbygVar) throws JSONException, RemoteException {
        zzdvx zzdvxVar = this.zza;
        zzdvxVar.zzb.zzl(zzdvxVar.zza, zzbygVar);
    }
}
