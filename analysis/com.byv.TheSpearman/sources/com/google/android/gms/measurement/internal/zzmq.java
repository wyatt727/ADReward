package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.0.0 */
/* loaded from: classes3.dex */
final class zzmq implements Runnable {
    private final /* synthetic */ long zza;
    private final /* synthetic */ zzmn zzb;

    zzmq(zzmn zzmnVar, long j) {
        this.zza = j;
        this.zzb = zzmnVar;
    }

    @Override // java.lang.Runnable
    public final void run() throws IllegalStateException {
        zzmn.zzb(this.zzb, this.zza);
    }
}
