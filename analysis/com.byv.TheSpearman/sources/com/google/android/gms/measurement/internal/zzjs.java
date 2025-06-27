package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.0.0 */
/* loaded from: classes3.dex */
final class zzjs implements Runnable {
    private final /* synthetic */ zzjc zza;

    zzjs(zzjc zzjcVar) {
        this.zza = zzjcVar;
    }

    @Override // java.lang.Runnable
    public final void run() throws IllegalStateException {
        this.zza.zzb.zza();
    }
}
