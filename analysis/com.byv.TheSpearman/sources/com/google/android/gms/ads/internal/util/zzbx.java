package com.google.android.gms.ads.internal.util;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.ads.zzftg;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes2.dex */
public final class zzbx {
    private HandlerThread zza = null;
    private Handler zzb = null;
    private int zzc = 0;
    private final Object zzd = new Object();

    public final Handler zza() {
        return this.zzb;
    }

    public final Looper zzb() {
        Looper looper;
        synchronized (this.zzd) {
            if (this.zzc != 0) {
                Preconditions.checkNotNull(this.zza, "Invalid state: handlerThread should already been initialized.");
            } else if (this.zza == null) {
                zze.zza("Starting the looper thread.");
                HandlerThread handlerThread = new HandlerThread("LooperProvider");
                this.zza = handlerThread;
                handlerThread.start();
                this.zzb = new zzftg(this.zza.getLooper());
                zze.zza("Looper thread started.");
            } else {
                zze.zza("Resuming the looper thread");
                this.zzd.notifyAll();
            }
            this.zzc++;
            looper = this.zza.getLooper();
        }
        return looper;
    }
}
