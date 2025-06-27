package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
final class zzccb implements zzgea {
    final /* synthetic */ zzccd zza;

    zzccb(zzccd zzccdVar) {
        this.zza = zzccdVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgea
    public final void zza(Throwable th) {
        this.zza.zzb.set(-1);
    }

    @Override // com.google.android.gms.internal.ads.zzgea
    public final void zzb(Object obj) {
        this.zza.zzb.set(1);
    }
}
