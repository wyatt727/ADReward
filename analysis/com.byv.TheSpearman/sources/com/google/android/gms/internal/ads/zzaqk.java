package com.google.android.gms.internal.ads;

import android.net.TrafficStats;
import android.os.Process;
import android.os.SystemClock;
import java.util.concurrent.BlockingQueue;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzaqk extends Thread {
    private final BlockingQueue zza;
    private final zzaqj zzb;
    private final zzaqa zzc;
    private volatile boolean zzd = false;
    private final zzaqh zze;

    public zzaqk(BlockingQueue blockingQueue, zzaqj zzaqjVar, zzaqa zzaqaVar, zzaqh zzaqhVar) {
        this.zza = blockingQueue;
        this.zzb = zzaqjVar;
        this.zzc = zzaqaVar;
        this.zze = zzaqhVar;
    }

    private void zzb() throws InterruptedException {
        zzaqq zzaqqVar = (zzaqq) this.zza.take();
        SystemClock.elapsedRealtime();
        zzaqqVar.zzt(3);
        try {
            try {
                zzaqqVar.zzm("network-queue-take");
                zzaqqVar.zzw();
                TrafficStats.setThreadStatsTag(zzaqqVar.zzc());
                zzaqm zzaqmVarZza = this.zzb.zza(zzaqqVar);
                zzaqqVar.zzm("network-http-complete");
                if (zzaqmVarZza.zze && zzaqqVar.zzv()) {
                    zzaqqVar.zzp("not-modified");
                    zzaqqVar.zzr();
                } else {
                    zzaqw zzaqwVarZzh = zzaqqVar.zzh(zzaqmVarZza);
                    zzaqqVar.zzm("network-parse-complete");
                    if (zzaqwVarZzh.zzb != null) {
                        this.zzc.zzd(zzaqqVar.zzj(), zzaqwVarZzh.zzb);
                        zzaqqVar.zzm("network-cache-written");
                    }
                    zzaqqVar.zzq();
                    this.zze.zzb(zzaqqVar, zzaqwVarZzh, null);
                    zzaqqVar.zzs(zzaqwVarZzh);
                }
            } catch (zzaqz e) {
                SystemClock.elapsedRealtime();
                this.zze.zza(zzaqqVar, e);
                zzaqqVar.zzr();
            } catch (Exception e2) {
                zzarc.zzc(e2, "Unhandled exception %s", e2.toString());
                zzaqz zzaqzVar = new zzaqz(e2);
                SystemClock.elapsedRealtime();
                this.zze.zza(zzaqqVar, zzaqzVar);
                zzaqqVar.zzr();
            }
        } finally {
            zzaqqVar.zzt(4);
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() throws SecurityException, IllegalArgumentException {
        Process.setThreadPriority(10);
        while (true) {
            try {
                zzb();
            } catch (InterruptedException unused) {
                if (this.zzd) {
                    Thread.currentThread().interrupt();
                    return;
                }
                zzarc.zzb("Ignoring spurious interrupt of NetworkDispatcher thread; use quit() to terminate it", new Object[0]);
            }
        }
    }

    public final void zza() {
        this.zzd = true;
        interrupt();
    }
}
