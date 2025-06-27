package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public class zzekw extends zzelx {
    private final zzdgw zza;

    public zzekw(zzcyo zzcyoVar, zzdgl zzdglVar, zzczi zzcziVar, zzczx zzczxVar, zzdac zzdacVar, zzczd zzczdVar, zzddk zzddkVar, zzdhi zzdhiVar, zzdaw zzdawVar, zzdgw zzdgwVar, zzddg zzddgVar) {
        super(zzcyoVar, zzdglVar, zzcziVar, zzczxVar, zzdacVar, zzddkVar, zzdawVar, zzdhiVar, zzddgVar, zzczdVar);
        this.zza = zzdgwVar;
    }

    @Override // com.google.android.gms.internal.ads.zzelx, com.google.android.gms.internal.ads.zzbqu
    public final void zzs(zzbyc zzbycVar) {
        this.zza.zza(zzbycVar);
    }

    @Override // com.google.android.gms.internal.ads.zzelx, com.google.android.gms.internal.ads.zzbqu
    public final void zzt(zzbyg zzbygVar) throws RemoteException {
        this.zza.zza(new zzbyc(zzbygVar.zzf(), zzbygVar.zze()));
    }

    @Override // com.google.android.gms.internal.ads.zzelx, com.google.android.gms.internal.ads.zzbqu
    public final void zzu() throws RemoteException {
        this.zza.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzelx, com.google.android.gms.internal.ads.zzbqu
    public final void zzv() {
        this.zza.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzelx, com.google.android.gms.internal.ads.zzbqu
    public final void zzy() {
        this.zza.zzc();
    }
}
