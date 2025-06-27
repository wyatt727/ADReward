package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
final class zzcpv implements zzgea {
    final /* synthetic */ String zza;
    final /* synthetic */ zzcpw zzb;

    zzcpv(zzcpw zzcpwVar, String str) {
        this.zza = str;
        this.zzb = zzcpwVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgea
    public final void zza(Throwable th) {
        zzcpw zzcpwVar = this.zzb;
        zzcpwVar.zzh.zza(zzcpwVar.zzg.zzd(zzcpwVar.zze, zzcpwVar.zzf, false, this.zza, null, zzcpwVar.zzu()));
    }

    @Override // com.google.android.gms.internal.ads.zzgea
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzcpw zzcpwVar = this.zzb;
        zzcpwVar.zzh.zza(zzcpwVar.zzg.zzd(zzcpwVar.zze, zzcpwVar.zzf, false, this.zza, (String) obj, zzcpwVar.zzu()));
    }
}
