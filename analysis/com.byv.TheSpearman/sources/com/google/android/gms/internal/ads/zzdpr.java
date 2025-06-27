package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
final class zzdpr implements zzgea {
    final /* synthetic */ zzffn zza;
    final /* synthetic */ zzffq zzb;
    final /* synthetic */ zzcpk zzc;
    final /* synthetic */ zzdpx zzd;

    zzdpr(zzdpx zzdpxVar, zzffn zzffnVar, zzffq zzffqVar, zzcpk zzcpkVar) {
        this.zza = zzffnVar;
        this.zzb = zzffqVar;
        this.zzc = zzcpkVar;
        this.zzd = zzdpxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgea
    public final void zza(Throwable th) {
    }

    @Override // com.google.android.gms.internal.ads.zzgea
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzcgm zzcgmVar = (zzcgm) obj;
        zzcgmVar.zzU(this.zza, this.zzb);
        zzcic zzcicVarZzN = zzcgmVar.zzN();
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzjS)).booleanValue() || zzcicVarZzN == null) {
            return;
        }
        zzcpk zzcpkVar = this.zzc;
        zzdpx zzdpxVar = this.zzd;
        zzcicVarZzN.zzI(zzcpkVar, zzdpxVar.zzj, zzdpxVar.zzk);
        zzcpk zzcpkVar2 = this.zzc;
        zzdpx zzdpxVar2 = this.zzd;
        zzcicVarZzN.zzK(zzcpkVar2, zzdpxVar2.zzj, zzdpxVar2.zze);
    }
}
