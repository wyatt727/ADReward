package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
final class zzbkm implements zzgea {
    final /* synthetic */ zzcgm zza;

    zzbkm(zzcgm zzcgmVar) {
        this.zza = zzcgmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgea
    public final void zza(Throwable th) {
        com.google.android.gms.ads.internal.zzu.zzo().zzw(th, "DefaultGmsgHandlers.attributionReportingManager");
    }

    @Override // com.google.android.gms.internal.ads.zzgea
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzcgm zzcgmVar = this.zza;
        new com.google.android.gms.ads.internal.util.zzca(zzcgmVar.getContext(), zzcgmVar.zzn().afmaVersion, (String) obj).zzb();
    }
}
