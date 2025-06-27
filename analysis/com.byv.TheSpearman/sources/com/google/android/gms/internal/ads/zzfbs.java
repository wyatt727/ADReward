package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
final class zzfbs implements zzeop {
    final /* synthetic */ zzfbt zza;

    zzfbs(zzfbt zzfbtVar) {
        this.zza = zzfbtVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeop
    public final void zza() {
        synchronized (this.zza) {
            this.zza.zza = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzeop
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzcrg zzcrgVar = (zzcrg) obj;
        synchronized (this.zza) {
            zzcrg zzcrgVar2 = this.zza.zza;
            if (zzcrgVar2 != null) {
                zzcrgVar2.zzb();
            }
            zzfbt zzfbtVar = this.zza;
            zzfbtVar.zza = zzcrgVar;
            zzcrgVar.zzc(zzfbtVar);
            zzfbt zzfbtVar2 = this.zza;
            zzfbtVar2.zzg.zzk(new zzcrh(zzcrgVar, zzfbtVar2, zzfbtVar2.zzg, zzfbtVar2.zzi));
            zzcrgVar.zzj();
        }
    }
}
