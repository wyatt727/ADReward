package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.0.0 */
/* loaded from: classes3.dex */
final class zzkk implements Runnable {
    private final /* synthetic */ Boolean zza;
    private final /* synthetic */ zzjc zzb;

    zzkk(zzjc zzjcVar, Boolean bool) {
        this.zza = bool;
        this.zzb = zzjcVar;
    }

    @Override // java.lang.Runnable
    public final void run() throws IllegalStateException {
        this.zzb.zza(this.zza, true);
    }
}
