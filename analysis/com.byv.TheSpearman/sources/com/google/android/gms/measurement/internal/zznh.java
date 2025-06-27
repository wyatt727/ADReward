package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement@@22.0.0 */
/* loaded from: classes3.dex */
final class zznh implements Runnable {
    private final /* synthetic */ zzns zza;
    private final /* synthetic */ zzni zzb;

    zznh(zzni zzniVar, zzns zznsVar) {
        this.zza = zznsVar;
        this.zzb = zzniVar;
    }

    @Override // java.lang.Runnable
    public final void run() throws IllegalStateException {
        zzni.zza(this.zzb, this.zza);
        this.zzb.zzv();
    }
}
