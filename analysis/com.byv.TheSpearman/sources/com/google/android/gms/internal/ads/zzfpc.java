package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzfpc {
    private final BlockingQueue zza;
    private final ThreadPoolExecutor zzb;
    private final ArrayDeque zzc = new ArrayDeque();
    private zzfpb zzd = null;

    public zzfpc() {
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        this.zza = linkedBlockingQueue;
        this.zzb = new ThreadPoolExecutor(1, 1, 1L, TimeUnit.SECONDS, linkedBlockingQueue);
    }

    private final void zzc() {
        zzfpb zzfpbVar = (zzfpb) this.zzc.poll();
        this.zzd = zzfpbVar;
        if (zzfpbVar != null) {
            zzfpbVar.executeOnExecutor(this.zzb, new Object[0]);
        }
    }

    public final void zza(zzfpb zzfpbVar) {
        this.zzd = null;
        zzc();
    }

    public final void zzb(zzfpb zzfpbVar) {
        zzfpbVar.zzb(this);
        this.zzc.add(zzfpbVar);
        if (this.zzd == null) {
            zzc();
        }
    }
}
