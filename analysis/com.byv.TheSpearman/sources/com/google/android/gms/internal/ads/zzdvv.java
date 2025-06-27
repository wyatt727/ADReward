package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import org.json.JSONException;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
final class zzdvv extends zzbyp {
    final /* synthetic */ zzdvx zza;

    zzdvv(zzdvx zzdvxVar) {
        this.zza = zzdvxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbyq
    public final void zze(int i) throws JSONException, RemoteException {
        zzdvx zzdvxVar = this.zza;
        zzdvxVar.zzb.zzm(zzdvxVar.zza, i);
    }

    @Override // com.google.android.gms.internal.ads.zzbyq
    public final void zzf(com.google.android.gms.ads.internal.client.zze zzeVar) throws JSONException, RemoteException {
        zzdvx zzdvxVar = this.zza;
        zzdvxVar.zzb.zzm(zzdvxVar.zza, zzeVar.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbyq
    public final void zzg() throws JSONException, RemoteException {
        zzdvx zzdvxVar = this.zza;
        zzdvxVar.zzb.zzp(zzdvxVar.zza);
    }
}
