package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import org.json.JSONException;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
final class zzdvs extends com.google.android.gms.ads.internal.client.zzbg {
    final /* synthetic */ zzdvm zza;
    final /* synthetic */ zzdvt zzb;

    zzdvs(zzdvt zzdvtVar, zzdvm zzdvmVar) {
        this.zza = zzdvmVar;
        this.zzb = zzdvtVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbh
    public final void zzc() throws JSONException, RemoteException {
        this.zza.zzb(this.zzb.zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbh
    public final void zzd() throws JSONException, RemoteException {
        this.zza.zzc(this.zzb.zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbh
    public final void zze(int i) throws JSONException, RemoteException {
        this.zza.zzd(this.zzb.zza, i);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbh
    public final void zzf(com.google.android.gms.ads.internal.client.zze zzeVar) throws JSONException, RemoteException {
        this.zza.zzd(this.zzb.zza, zzeVar.zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbh
    public final void zzg() {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbh
    public final void zzh() {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbh
    public final void zzi() throws JSONException, RemoteException {
        this.zza.zze(this.zzb.zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbh
    public final void zzj() throws JSONException, RemoteException {
        this.zza.zzg(this.zzb.zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbh
    public final void zzk() {
    }
}
