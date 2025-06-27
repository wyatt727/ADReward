package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.Collections;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzfjx {
    public static final zzfke zza(Callable callable, Object obj, zzfkf zzfkfVar) {
        return zzb(callable, zzfkfVar.zzb, obj, zzfkfVar);
    }

    public static final zzfke zzb(Callable callable, zzgep zzgepVar, Object obj, zzfkf zzfkfVar) {
        return new zzfke(zzfkfVar, obj, zzfkf.zza, Collections.emptyList(), zzgepVar.zzb(callable));
    }

    public static final zzfke zzc(ListenableFuture listenableFuture, Object obj, zzfkf zzfkfVar) {
        return new zzfke(zzfkfVar, obj, zzfkf.zza, Collections.emptyList(), listenableFuture);
    }

    public static final zzfke zzd(final zzfjr zzfjrVar, zzgep zzgepVar, Object obj, zzfkf zzfkfVar) {
        return zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzfjw
            @Override // java.util.concurrent.Callable
            public final Object call() throws Exception {
                zzfjrVar.zza();
                return null;
            }
        }, zzgepVar, obj, zzfkfVar);
    }
}
