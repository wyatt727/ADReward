package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
final class zzgdp extends zzgdq {
    final /* synthetic */ zzgdr zza;
    private final Callable zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzgdp(zzgdr zzgdrVar, Callable callable, Executor executor) {
        super(zzgdrVar, executor);
        this.zza = zzgdrVar;
        this.zzc = callable;
    }

    @Override // com.google.android.gms.internal.ads.zzgen
    final Object zza() throws Exception {
        return this.zzc.call();
    }

    @Override // com.google.android.gms.internal.ads.zzgen
    final String zzb() {
        return this.zzc.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzgdq
    final void zzc(Object obj) {
        this.zza.zzc(obj);
    }
}
