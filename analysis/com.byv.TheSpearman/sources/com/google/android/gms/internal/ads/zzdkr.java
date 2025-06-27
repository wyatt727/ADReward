package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
final class zzdkr implements zzgea {
    final /* synthetic */ String zza = "Google";
    final /* synthetic */ zzdkt zzb;

    zzdkr(zzdkt zzdktVar, String str, boolean z) {
        this.zzb = zzdktVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgea
    public final void zza(Throwable th) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzfd)).booleanValue()) {
            com.google.android.gms.ads.internal.zzu.zzo().zzv(th, "omid native display exp");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgea
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        this.zzb.zze.zzT((zzcgm) obj);
        zzdkt zzdktVar = this.zzb;
        zzcbw zzcbwVarZzp = zzdktVar.zze.zzp();
        zzfmy zzfmyVarZzf = zzdktVar.zzf(this.zza, true);
        if (zzfmyVarZzf != null && zzcbwVarZzp != null) {
            zzcbwVarZzp.zzc(zzfmyVarZzf);
        } else if (zzcbwVarZzp != null) {
            zzcbwVarZzp.cancel(false);
        }
    }
}
