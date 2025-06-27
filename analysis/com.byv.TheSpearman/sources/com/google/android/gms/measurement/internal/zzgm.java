package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement@@22.0.0 */
/* loaded from: classes3.dex */
final class zzgm implements Runnable {
    private final /* synthetic */ boolean zza;
    private final /* synthetic */ zzgj zzb;

    zzgm(zzgj zzgjVar, boolean z) {
        this.zza = z;
        this.zzb = zzgjVar;
    }

    @Override // java.lang.Runnable
    public final void run() throws IllegalStateException {
        this.zzb.zzb.zza(this.zza);
    }
}
