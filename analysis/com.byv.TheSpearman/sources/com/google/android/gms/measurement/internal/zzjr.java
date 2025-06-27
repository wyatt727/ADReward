package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.0.0 */
/* loaded from: classes3.dex */
final class zzjr implements Runnable {
    private final /* synthetic */ long zza;
    private final /* synthetic */ zzjc zzb;

    zzjr(zzjc zzjcVar, long j) {
        this.zza = j;
        this.zzb = zzjcVar;
    }

    @Override // java.lang.Runnable
    public final void run() throws IllegalStateException {
        this.zzb.zzk().zzf.zza(this.zza);
        this.zzb.zzj().zzc().zza("Session timeout duration set", Long.valueOf(this.zza));
    }
}
