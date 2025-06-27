package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.List;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzfjv {
    final /* synthetic */ zzfkf zza;
    private final Object zzb;
    private final List zzc;

    /* synthetic */ zzfjv(zzfkf zzfkfVar, Object obj, List list, zzfju zzfjuVar) {
        this.zza = zzfkfVar;
        this.zzb = obj;
        this.zzc = list;
    }

    public final zzfke zza(Callable callable) {
        zzged zzgedVarZzb = zzgee.zzb(this.zzc);
        ListenableFuture listenableFutureZza = zzgedVarZzb.zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzfjt
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return null;
            }
        }, zzcbr.zzf);
        ListenableFuture listenableFutureZza2 = zzgedVarZzb.zza(callable, this.zza.zzb);
        return new zzfke(this.zza, this.zzb, listenableFutureZza, this.zzc, listenableFutureZza2);
    }
}
