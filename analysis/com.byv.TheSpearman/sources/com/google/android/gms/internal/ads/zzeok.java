package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
final class zzeok implements zzeop {
    final /* synthetic */ zzeol zza;

    zzeok(zzeol zzeolVar) {
        this.zza = zzeolVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeop
    public final void zza() {
        synchronized (this.zza) {
        }
    }

    @Override // com.google.android.gms.internal.ads.zzeop
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        synchronized (this.zza) {
            this.zza.zzc = ((zzctv) obj).zzl();
            ((zzctv) obj).zzj();
        }
    }
}
