package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.0.0 */
/* loaded from: classes3.dex */
final class zzkz implements Runnable {
    private final /* synthetic */ zzky zza;

    zzkz(zzky zzkyVar) {
        this.zza = zzkyVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzky zzkyVar = this.zza;
        zzkyVar.zza = zzkyVar.zzh;
    }
}
