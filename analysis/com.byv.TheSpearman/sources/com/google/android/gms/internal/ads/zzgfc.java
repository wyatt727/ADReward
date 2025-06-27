package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
final class zzgfc extends zzgen {
    final /* synthetic */ zzgfe zza;
    private final zzgdk zzb;

    zzgfc(zzgfe zzgfeVar, zzgdk zzgdkVar) {
        this.zza = zzgfeVar;
        this.zzb = zzgdkVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgen
    final /* bridge */ /* synthetic */ Object zza() throws Exception {
        zzgdk zzgdkVar = this.zzb;
        ListenableFuture listenableFutureZza = zzgdkVar.zza();
        zzfwr.zzd(listenableFutureZza, "AsyncCallable.call returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", zzgdkVar);
        return listenableFutureZza;
    }

    @Override // com.google.android.gms.internal.ads.zzgen
    final String zzb() {
        return this.zzb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzgen
    final void zzd(Throwable th) {
        this.zza.zzd(th);
    }

    @Override // com.google.android.gms.internal.ads.zzgen
    final /* synthetic */ void zze(Object obj) {
        this.zza.zzs((ListenableFuture) obj);
    }

    @Override // com.google.android.gms.internal.ads.zzgen
    final boolean zzg() {
        return this.zza.isDone();
    }
}
