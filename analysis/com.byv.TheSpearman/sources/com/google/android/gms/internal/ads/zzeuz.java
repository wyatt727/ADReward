package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzeuz implements zzewr {
    private final zzewr zza;
    private final long zzb;
    private final ScheduledExecutorService zzc;

    public zzeuz(zzewr zzewrVar, long j, ScheduledExecutorService scheduledExecutorService) {
        this.zza = zzewrVar;
        this.zzb = j;
        this.zzc = scheduledExecutorService;
    }

    @Override // com.google.android.gms.internal.ads.zzewr
    public final int zza() {
        return this.zza.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzewr
    public final ListenableFuture zzb() {
        ListenableFuture listenableFutureZzb = this.zza.zzb();
        long j = this.zzb;
        if (j > 0) {
            listenableFutureZzb = zzgee.zzo(listenableFutureZzb, j, TimeUnit.MILLISECONDS, this.zzc);
        }
        return zzgee.zzf(listenableFutureZzb, Throwable.class, new zzgdl() { // from class: com.google.android.gms.internal.ads.zzeuy
            @Override // com.google.android.gms.internal.ads.zzgdl
            public final ListenableFuture zza(Object obj) {
                return zzgee.zzh(null);
            }
        }, zzcbr.zzf);
    }
}
