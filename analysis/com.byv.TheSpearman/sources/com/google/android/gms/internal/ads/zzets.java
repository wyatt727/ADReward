package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzets implements zzewr {
    private final zzgep zza;
    private final zzfgi zzb;

    zzets(zzgep zzgepVar, zzfgi zzfgiVar) {
        this.zza = zzgepVar;
        this.zzb = zzfgiVar;
    }

    @Override // com.google.android.gms.internal.ads.zzewr
    public final int zza() {
        return 21;
    }

    @Override // com.google.android.gms.internal.ads.zzewr
    public final ListenableFuture zzb() {
        return this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzetr
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.zza.zzc();
            }
        });
    }

    final /* synthetic */ zzett zzc() throws Exception {
        return new zzett("requester_type_2".equals(com.google.android.gms.ads.nonagon.signalgeneration.zzh.zzb(this.zzb.zzd)));
    }
}
