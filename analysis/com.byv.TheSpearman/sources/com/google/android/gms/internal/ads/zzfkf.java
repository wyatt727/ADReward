package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public abstract class zzfkf {
    private static final ListenableFuture zza = zzgee.zzh(null);
    private final zzgep zzb;
    private final ScheduledExecutorService zzc;
    private final zzfkg zzd;

    public zzfkf(zzgep zzgepVar, ScheduledExecutorService scheduledExecutorService, zzfkg zzfkgVar) {
        this.zzb = zzgepVar;
        this.zzc = scheduledExecutorService;
        this.zzd = zzfkgVar;
    }

    public final zzfjv zza(Object obj, ListenableFuture... listenableFutureArr) {
        return new zzfjv(this, obj, Arrays.asList(listenableFutureArr), null);
    }

    public final zzfke zzb(Object obj, ListenableFuture listenableFuture) {
        return new zzfke(this, obj, listenableFuture, Collections.singletonList(listenableFuture), listenableFuture);
    }

    protected abstract String zzf(Object obj);
}
