package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzeps implements zzewr {
    private final ListenableFuture zza;
    private final Executor zzb;
    private final ScheduledExecutorService zzc;

    public zzeps(ListenableFuture listenableFuture, Executor executor, ScheduledExecutorService scheduledExecutorService) {
        this.zza = listenableFuture;
        this.zzb = executor;
        this.zzc = scheduledExecutorService;
    }

    @Override // com.google.android.gms.internal.ads.zzewr
    public final int zza() {
        return 6;
    }

    @Override // com.google.android.gms.internal.ads.zzewr
    public final ListenableFuture zzb() {
        ListenableFuture listenableFutureZzn = zzgee.zzn(this.zza, new zzgdl() { // from class: com.google.android.gms.internal.ads.zzepo
            @Override // com.google.android.gms.internal.ads.zzgdl
            public final ListenableFuture zza(Object obj) {
                final String str = (String) obj;
                return zzgee.zzh(new zzewq() { // from class: com.google.android.gms.internal.ads.zzepn
                    @Override // com.google.android.gms.internal.ads.zzewq
                    public final void zzj(Object obj2) {
                        ((Bundle) obj2).putString("ms", str);
                    }
                });
            }
        }, this.zzb);
        if (((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzme)).intValue() > 0) {
            listenableFutureZzn = zzgee.zzo(listenableFutureZzn, ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzme)).intValue(), TimeUnit.MILLISECONDS, this.zzc);
        }
        return zzgee.zzf(listenableFutureZzn, Throwable.class, new zzgdl() { // from class: com.google.android.gms.internal.ads.zzepp
            @Override // com.google.android.gms.internal.ads.zzgdl
            public final ListenableFuture zza(Object obj) {
                return ((Throwable) obj) instanceof TimeoutException ? zzgee.zzh(new zzewq() { // from class: com.google.android.gms.internal.ads.zzepq
                    @Override // com.google.android.gms.internal.ads.zzewq
                    public final void zzj(Object obj2) {
                        ((Bundle) obj2).putString("ms", Integer.toString(17));
                    }
                }) : zzgee.zzh(new zzewq() { // from class: com.google.android.gms.internal.ads.zzepr
                    @Override // com.google.android.gms.internal.ads.zzewq
                    public final void zzj(Object obj2) {
                        ((Bundle) obj2).putString("ms", null);
                    }
                });
            }
        }, this.zzb);
    }
}
