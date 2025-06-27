package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
final class zzeoh implements zzeop {
    final /* synthetic */ zzeoi zza;

    zzeoh(zzeoi zzeoiVar) {
        this.zza = zzeoiVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeop
    public final void zza() {
        synchronized (this.zza) {
            this.zza.zzj = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzeop
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzdhl zzdhlVar = (zzdhl) obj;
        synchronized (this.zza) {
            this.zza.zzj = zzdhlVar;
            this.zza.zzj.zzj();
        }
    }
}
