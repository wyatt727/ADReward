package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
final class zzejm implements zzgea {
    final /* synthetic */ zzffn zza;
    final /* synthetic */ zzejn zzb;

    zzejm(zzejn zzejnVar, zzffn zzffnVar) {
        this.zza = zzffnVar;
        this.zzb = zzejnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgea
    public final void zza(Throwable th) {
        synchronized (this.zzb) {
            this.zzb.zzh.zzb(th, this.zza);
            if (this.zzb.zzh.zze()) {
                zzejn zzejnVar = this.zzb;
                zzejnVar.zze(zzejnVar.zzh.zza());
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgea
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzeke zzekeVar = (zzeke) obj;
        synchronized (this.zzb) {
            this.zzb.zzh.zzc(zzekeVar, this.zza);
            if (this.zzb.zzh.zze()) {
                zzejn zzejnVar = this.zzb;
                zzejnVar.zze(zzejnVar.zzh.zza());
            }
        }
    }
}
