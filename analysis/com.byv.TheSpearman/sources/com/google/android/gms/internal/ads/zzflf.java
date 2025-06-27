package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
final class zzflf implements zzgea {
    final /* synthetic */ zzflh zza;
    final /* synthetic */ zzfkw zzb;

    zzflf(zzflh zzflhVar, zzfkw zzfkwVar) {
        this.zza = zzflhVar;
        this.zzb = zzfkwVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgea
    public final void zza(Throwable th) {
        zzfkw zzfkwVar = this.zzb;
        zzfkwVar.zzh(th);
        zzfkwVar.zzg(false);
        this.zza.zza(zzfkwVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgea
    public final void zzb(Object obj) {
    }
}
