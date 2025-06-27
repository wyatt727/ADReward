package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzgev {
    public static zzgep zza(ExecutorService executorService) {
        if (executorService instanceof zzgep) {
            return (zzgep) executorService;
        }
        return executorService instanceof ScheduledExecutorService ? new zzgeu((ScheduledExecutorService) executorService) : new zzger(executorService);
    }

    public static Executor zzb() {
        return zzgds.INSTANCE;
    }

    static Executor zzc(Executor executor, zzgcs zzgcsVar) {
        Objects.requireNonNull(executor);
        return executor == zzgds.INSTANCE ? executor : new zzgeq(executor, zzgcsVar);
    }
}
