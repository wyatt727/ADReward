package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.List;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzezj implements zzewr {
    final zzgep zza;
    final List zzb;
    final zzbdj zzc;

    public zzezj(zzbdj zzbdjVar, zzgep zzgepVar, List list) {
        this.zzc = zzbdjVar;
        this.zza = zzgepVar;
        this.zzb = list;
    }

    @Override // com.google.android.gms.internal.ads.zzewr
    public final int zza() {
        return 48;
    }

    @Override // com.google.android.gms.internal.ads.zzewr
    public final ListenableFuture zzb() {
        return this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzezi
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return new zzezk(this.zza.zzb);
            }
        });
    }
}
