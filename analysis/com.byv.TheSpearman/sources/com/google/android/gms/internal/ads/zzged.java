package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzged {
    private final boolean zza;
    private final zzfzn zzb;

    /* synthetic */ zzged(boolean z, zzfzn zzfznVar, zzgec zzgecVar) {
        this.zza = z;
        this.zzb = zzfznVar;
    }

    public final ListenableFuture zza(Callable callable, Executor executor) {
        return new zzgdr(this.zzb, this.zza, executor, callable);
    }
}
