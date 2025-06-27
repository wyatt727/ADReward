package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzgee extends zzgeg {
    /* JADX WARN: Multi-variable type inference failed */
    public static zzged zza(Iterable iterable) {
        return new zzged(false, zzfzn.zzk(iterable), null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static zzged zzb(Iterable iterable) {
        int i = zzfzn.zzd;
        Objects.requireNonNull(iterable);
        return new zzged(true, zzfzn.zzk(iterable), null);
    }

    @SafeVarargs
    public static zzged zzc(ListenableFuture... listenableFutureArr) {
        return new zzged(true, zzfzn.zzl(listenableFutureArr), null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static ListenableFuture zzd(Iterable iterable) {
        return new zzgdm(zzfzn.zzk(iterable), true);
    }

    public static ListenableFuture zze(ListenableFuture listenableFuture, Class cls, zzfwf zzfwfVar, Executor executor) {
        zzgcp zzgcpVar = new zzgcp(listenableFuture, cls, zzfwfVar);
        listenableFuture.addListener(zzgcpVar, zzgev.zzc(executor, zzgcpVar));
        return zzgcpVar;
    }

    public static ListenableFuture zzf(ListenableFuture listenableFuture, Class cls, zzgdl zzgdlVar, Executor executor) {
        zzgco zzgcoVar = new zzgco(listenableFuture, cls, zzgdlVar);
        listenableFuture.addListener(zzgcoVar, zzgev.zzc(executor, zzgcoVar));
        return zzgcoVar;
    }

    public static ListenableFuture zzh(Object obj) {
        return obj == null ? zzgei.zza : new zzgei(obj);
    }

    public static ListenableFuture zzi() {
        return zzgei.zza;
    }

    public static ListenableFuture zzj(Callable callable, Executor executor) {
        zzgfe zzgfeVar = new zzgfe(callable);
        executor.execute(zzgfeVar);
        return zzgfeVar;
    }

    public static ListenableFuture zzk(zzgdk zzgdkVar, Executor executor) {
        zzgfe zzgfeVar = new zzgfe(zzgdkVar);
        executor.execute(zzgfeVar);
        return zzgfeVar;
    }

    @SafeVarargs
    public static ListenableFuture zzl(ListenableFuture... listenableFutureArr) {
        return new zzgdm(zzfzn.zzl(listenableFutureArr), false);
    }

    public static ListenableFuture zzm(ListenableFuture listenableFuture, zzfwf zzfwfVar, Executor executor) {
        zzgcz zzgczVar = new zzgcz(listenableFuture, zzfwfVar);
        listenableFuture.addListener(zzgczVar, zzgev.zzc(executor, zzgczVar));
        return zzgczVar;
    }

    public static ListenableFuture zzn(ListenableFuture listenableFuture, zzgdl zzgdlVar, Executor executor) {
        int i = zzgda.zzc;
        Objects.requireNonNull(executor);
        zzgcy zzgcyVar = new zzgcy(listenableFuture, zzgdlVar);
        listenableFuture.addListener(zzgcyVar, zzgev.zzc(executor, zzgcyVar));
        return zzgcyVar;
    }

    public static ListenableFuture zzo(ListenableFuture listenableFuture, long j, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        return listenableFuture.isDone() ? listenableFuture : zzgfb.zzf(listenableFuture, j, timeUnit, scheduledExecutorService);
    }

    public static Object zzp(Future future) throws ExecutionException {
        if (future.isDone()) {
            return zzgfg.zza(future);
        }
        throw new IllegalStateException(zzfxg.zzb("Future was expected to be done: %s", future));
    }

    public static Object zzq(Future future) {
        try {
            return zzgfg.zza(future);
        } catch (ExecutionException e) {
            Throwable cause = e.getCause();
            if (cause instanceof Error) {
                throw new zzgdt((Error) cause);
            }
            throw new zzgff(cause);
        }
    }

    public static ListenableFuture zzg(Throwable th) {
        Objects.requireNonNull(th);
        return new zzgeh(th);
    }

    public static void zzr(ListenableFuture listenableFuture, zzgea zzgeaVar, Executor executor) {
        Objects.requireNonNull(zzgeaVar);
        listenableFuture.addListener(new zzgeb(listenableFuture, zzgeaVar), executor);
    }
}
