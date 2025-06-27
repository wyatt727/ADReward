package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
final class zzenf implements zzeop {
    final /* synthetic */ zzeng zza;

    zzenf(zzeng zzengVar) {
        this.zza = zzengVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeop
    public final void zza() {
        synchronized (this.zza) {
            this.zza.zzi = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzeop
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzcrm zzcrmVar = (zzcrm) obj;
        synchronized (this.zza) {
            zzeng zzengVar = this.zza;
            if (zzengVar.zzi != null) {
                zzengVar.zzi.zzb();
            }
            this.zza.zzi = zzcrmVar;
            this.zza.zzi.zzj();
        }
    }
}
