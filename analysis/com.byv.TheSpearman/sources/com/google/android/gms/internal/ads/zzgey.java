package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import javax.annotation.CheckForNull;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
final class zzgey implements Runnable {

    @CheckForNull
    zzgfb zza;

    zzgey(zzgfb zzgfbVar) {
        this.zza = zzgfbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ListenableFuture listenableFuture;
        zzgfb zzgfbVar = this.zza;
        if (zzgfbVar == null || (listenableFuture = zzgfbVar.zza) == null) {
            return;
        }
        this.zza = null;
        if (listenableFuture.isDone()) {
            zzgfbVar.zzs(listenableFuture);
            return;
        }
        try {
            ScheduledFuture scheduledFuture = zzgfbVar.zzb;
            zzgfbVar.zzb = null;
            String str = "Timed out";
            if (scheduledFuture != null) {
                try {
                    long jAbs = Math.abs(scheduledFuture.getDelay(TimeUnit.MILLISECONDS));
                    if (jAbs > 10) {
                        str = "Timed out (timeout delayed by " + jAbs + " ms after scheduled time)";
                    }
                } catch (Throwable th) {
                    zzgfbVar.zzd(new zzgfa(str, null));
                    throw th;
                }
            }
            zzgfbVar.zzd(new zzgfa(str + ": " + listenableFuture.toString(), null));
        } finally {
            listenableFuture.cancel(true);
        }
    }
}
