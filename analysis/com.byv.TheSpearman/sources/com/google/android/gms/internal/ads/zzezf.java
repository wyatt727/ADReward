package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzezf implements zzewr {
    final zzgep zza;
    final String zzb;
    final zzcav zzc;

    public zzezf(zzcav zzcavVar, zzgep zzgepVar, String str) {
        this.zzc = zzcavVar;
        this.zza = zzgepVar;
        this.zzb = str;
    }

    @Override // com.google.android.gms.internal.ads.zzewr
    public final int zza() {
        return 47;
    }

    @Override // com.google.android.gms.internal.ads.zzewr
    public final ListenableFuture zzb() {
        final ListenableFuture listenableFutureZzh = zzgee.zzh(null);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzfR)).booleanValue()) {
            listenableFutureZzh = zzgee.zzh(null);
        }
        final ListenableFuture listenableFutureZzh2 = zzgee.zzh(null);
        return zzgee.zzc(listenableFutureZzh, listenableFutureZzh2).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzeze
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return new zzezg((String) listenableFutureZzh.get(), (String) listenableFutureZzh2.get());
            }
        }, zzcbr.zza);
    }
}
