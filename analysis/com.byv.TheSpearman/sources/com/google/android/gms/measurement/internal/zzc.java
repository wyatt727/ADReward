package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.0.0 */
/* loaded from: classes3.dex */
final class zzc implements Runnable {
    private final /* synthetic */ long zza;
    private final /* synthetic */ zzb zzb;

    zzc(zzb zzbVar, long j) {
        this.zza = j;
        this.zzb = zzbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.zzb(this.zza);
    }
}
