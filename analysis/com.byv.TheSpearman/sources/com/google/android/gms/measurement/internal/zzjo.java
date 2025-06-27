package com.google.android.gms.measurement.internal;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.0.0 */
/* loaded from: classes3.dex */
final class zzjo implements Executor {
    private final /* synthetic */ zzjc zza;

    zzjo(zzjc zzjcVar) {
        this.zza = zzjcVar;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) throws IllegalStateException {
        this.zza.zzl().zzb(runnable);
    }
}
