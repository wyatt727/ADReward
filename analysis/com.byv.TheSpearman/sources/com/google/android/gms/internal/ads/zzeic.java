package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
final class zzeic implements zzgea {
    final /* synthetic */ zzeid zza;

    zzeic(zzeid zzeidVar) {
        this.zza = zzeidVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgea
    public final void zza(Throwable th) {
        com.google.android.gms.ads.internal.client.zze zzeVarZza = this.zza.zza.zzd().zza(th);
        this.zza.zzd.zzdB(zzeVarZza);
        zzfhf.zzb(zzeVarZza.zza, th, "DelayedBannerAd.onFailure");
    }

    @Override // com.google.android.gms.internal.ads.zzgea
    public final /* synthetic */ void zzb(Object obj) {
        ((zzcrm) obj).zzj();
    }
}
