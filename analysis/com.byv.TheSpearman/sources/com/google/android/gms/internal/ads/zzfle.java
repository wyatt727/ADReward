package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
final class zzfle implements zzgea {
    final /* synthetic */ zzflh zza;
    final /* synthetic */ zzfkw zzb;
    final /* synthetic */ boolean zzc;

    zzfle(zzflh zzflhVar, zzfkw zzfkwVar, boolean z) {
        this.zza = zzflhVar;
        this.zzb = zzfkwVar;
        this.zzc = z;
    }

    @Override // com.google.android.gms.internal.ads.zzgea
    public final void zza(Throwable th) {
        zzfkw zzfkwVar = this.zzb;
        if (zzfkwVar.zzk()) {
            zzflh zzflhVar = this.zza;
            zzfkwVar.zzh(th);
            zzfkwVar.zzg(false);
            zzflhVar.zza(zzfkwVar);
            if (this.zzc) {
                this.zza.zzh();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgea
    public final void zzb(Object obj) {
        zzfkw zzfkwVar = this.zzb;
        zzfkwVar.zzg(true);
        this.zza.zza(zzfkwVar);
        if (this.zzc) {
            this.zza.zzh();
        }
    }
}
