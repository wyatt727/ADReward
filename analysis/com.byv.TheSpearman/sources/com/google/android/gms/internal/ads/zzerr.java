package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzerr implements zzewr {
    private final zzgep zza;

    zzerr(zzgep zzgepVar) {
        this.zza = zzgepVar;
    }

    @Override // com.google.android.gms.internal.ads.zzewr
    public final int zza() {
        return 55;
    }

    @Override // com.google.android.gms.internal.ads.zzewr
    public final ListenableFuture zzb() {
        return this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzerq
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return new zzers(Long.valueOf(com.google.android.gms.ads.internal.zzu.zzB().currentTimeMillis() - com.google.android.gms.ads.internal.zzu.zzo().zzi().zzg().zza()).longValue());
            }
        });
    }
}
