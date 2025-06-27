package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.0.0 */
/* loaded from: classes3.dex */
final class zzlb implements Runnable {
    private final /* synthetic */ zzkv zza;
    private final /* synthetic */ long zzb;
    private final /* synthetic */ zzky zzc;

    zzlb(zzky zzkyVar, zzkv zzkvVar, long j) {
        this.zza = zzkvVar;
        this.zzb = j;
        this.zzc = zzkyVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzc.zza(this.zza, false, this.zzb);
        this.zzc.zza = null;
        this.zzc.zzo().zza((zzkv) null);
    }
}
