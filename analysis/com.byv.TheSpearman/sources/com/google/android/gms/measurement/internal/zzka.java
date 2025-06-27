package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.0.0 */
/* loaded from: classes3.dex */
final class zzka implements Runnable {
    private final /* synthetic */ long zza;
    private final /* synthetic */ zzjc zzb;

    zzka(zzjc zzjcVar, long j) {
        this.zza = j;
        this.zzb = zzjcVar;
    }

    @Override // java.lang.Runnable
    public final void run() throws IllegalStateException {
        this.zzb.zza(this.zza, true);
        this.zzb.zzo().zza(new AtomicReference<>());
    }
}
