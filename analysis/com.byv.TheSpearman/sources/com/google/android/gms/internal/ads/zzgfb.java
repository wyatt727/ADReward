package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import com.json.t2;
import java.util.Objects;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import javax.annotation.CheckForNull;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
final class zzgfb extends zzgdu {

    @CheckForNull
    private ListenableFuture zza;

    @CheckForNull
    private ScheduledFuture zzb;

    private zzgfb(ListenableFuture listenableFuture) {
        Objects.requireNonNull(listenableFuture);
        this.zza = listenableFuture;
    }

    static ListenableFuture zzf(ListenableFuture listenableFuture, long j, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        zzgfb zzgfbVar = new zzgfb(listenableFuture);
        zzgey zzgeyVar = new zzgey(zzgfbVar);
        zzgfbVar.zzb = scheduledExecutorService.schedule(zzgeyVar, j, timeUnit);
        listenableFuture.addListener(zzgeyVar, zzgds.INSTANCE);
        return zzgfbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgcs
    @CheckForNull
    protected final String zza() {
        ListenableFuture listenableFuture = this.zza;
        ScheduledFuture scheduledFuture = this.zzb;
        if (listenableFuture == null) {
            return null;
        }
        String str = "inputFuture=[" + listenableFuture.toString() + t2.i.e;
        if (scheduledFuture == null) {
            return str;
        }
        long delay = scheduledFuture.getDelay(TimeUnit.MILLISECONDS);
        if (delay <= 0) {
            return str;
        }
        return str + ", remaining delay=[" + delay + " ms]";
    }

    @Override // com.google.android.gms.internal.ads.zzgcs
    protected final void zzb() {
        zzr(this.zza);
        ScheduledFuture scheduledFuture = this.zzb;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        this.zza = null;
        this.zzb = null;
    }
}
