package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
final class zzgeq implements Executor {
    final /* synthetic */ Executor zza;
    final /* synthetic */ zzgcs zzb;

    zzgeq(Executor executor, zzgcs zzgcsVar) {
        this.zza = executor;
        this.zzb = zzgcsVar;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        try {
            this.zza.execute(runnable);
        } catch (RejectedExecutionException e) {
            this.zzb.zzd(e);
        }
    }
}
