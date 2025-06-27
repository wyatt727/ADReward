package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
final class zzgco extends zzgcq {
    zzgco(ListenableFuture listenableFuture, Class cls, zzgdl zzgdlVar) {
        super(listenableFuture, cls, zzgdlVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgcq
    final /* bridge */ /* synthetic */ Object zze(Object obj, Throwable th) throws Exception {
        zzgdl zzgdlVar = (zzgdl) obj;
        ListenableFuture listenableFutureZza = zzgdlVar.zza(th);
        zzfwr.zzd(listenableFutureZza, "AsyncFunction.apply returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", zzgdlVar);
        return listenableFutureZza;
    }

    @Override // com.google.android.gms.internal.ads.zzgcq
    final /* synthetic */ void zzf(Object obj) {
        zzs((ListenableFuture) obj);
    }
}
