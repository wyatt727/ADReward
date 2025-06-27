package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.0.0 */
/* loaded from: classes3.dex */
final class zzmf implements Runnable {
    private final /* synthetic */ zzmc zza;

    zzmf(zzmc zzmcVar) {
        this.zza = zzmcVar;
    }

    @Override // java.lang.Runnable
    public final void run() throws IllegalStateException {
        this.zza.zza.zzb = null;
        this.zza.zza.zzap();
    }
}
