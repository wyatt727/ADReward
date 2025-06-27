package com.google.android.gms.internal.ads;

import android.os.Process;
import java.util.concurrent.BlockingQueue;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzaqc extends Thread {
    private static final boolean zza = zzarc.zzb;
    private final BlockingQueue zzb;
    private final BlockingQueue zzc;
    private final zzaqa zzd;
    private volatile boolean zze = false;
    private final zzard zzf;
    private final zzaqh zzg;

    public zzaqc(BlockingQueue blockingQueue, BlockingQueue blockingQueue2, zzaqa zzaqaVar, zzaqh zzaqhVar) {
        this.zzb = blockingQueue;
        this.zzc = blockingQueue2;
        this.zzd = zzaqaVar;
        this.zzg = zzaqhVar;
        this.zzf = new zzard(this, blockingQueue2, zzaqhVar);
    }

    private void zzc() throws InterruptedException {
        zzaqq zzaqqVar = (zzaqq) this.zzb.take();
        zzaqqVar.zzm("cache-queue-take");
        zzaqqVar.zzt(1);
        try {
            zzaqqVar.zzw();
            zzapz zzapzVarZza = this.zzd.zza(zzaqqVar.zzj());
            if (zzapzVarZza == null) {
                zzaqqVar.zzm("cache-miss");
                if (!this.zzf.zzc(zzaqqVar)) {
                    this.zzc.put(zzaqqVar);
                }
            } else {
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (zzapzVarZza.zza(jCurrentTimeMillis)) {
                    zzaqqVar.zzm("cache-hit-expired");
                    zzaqqVar.zze(zzapzVarZza);
                    if (!this.zzf.zzc(zzaqqVar)) {
                        this.zzc.put(zzaqqVar);
                    }
                } else {
                    zzaqqVar.zzm("cache-hit");
                    zzaqw zzaqwVarZzh = zzaqqVar.zzh(new zzaqm(zzapzVarZza.zza, zzapzVarZza.zzg));
                    zzaqqVar.zzm("cache-hit-parsed");
                    if (!zzaqwVarZzh.zzc()) {
                        zzaqqVar.zzm("cache-parsing-failed");
                        this.zzd.zzc(zzaqqVar.zzj(), true);
                        zzaqqVar.zze(null);
                        if (!this.zzf.zzc(zzaqqVar)) {
                            this.zzc.put(zzaqqVar);
                        }
                    } else if (zzapzVarZza.zzf < jCurrentTimeMillis) {
                        zzaqqVar.zzm("cache-hit-refresh-needed");
                        zzaqqVar.zze(zzapzVarZza);
                        zzaqwVarZzh.zzd = true;
                        if (this.zzf.zzc(zzaqqVar)) {
                            this.zzg.zzb(zzaqqVar, zzaqwVarZzh, null);
                        } else {
                            this.zzg.zzb(zzaqqVar, zzaqwVarZzh, new zzaqb(this, zzaqqVar));
                        }
                    } else {
                        this.zzg.zzb(zzaqqVar, zzaqwVarZzh, null);
                    }
                }
            }
        } finally {
            zzaqqVar.zzt(2);
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() throws SecurityException, IllegalArgumentException {
        if (zza) {
            zzarc.zzd("start new dispatcher", new Object[0]);
        }
        Process.setThreadPriority(10);
        this.zzd.zzb();
        while (true) {
            try {
                zzc();
            } catch (InterruptedException unused) {
                if (this.zze) {
                    Thread.currentThread().interrupt();
                    return;
                }
                zzarc.zzb("Ignoring spurious interrupt of CacheDispatcher thread; use quit() to terminate it", new Object[0]);
            }
        }
    }

    public final void zzb() {
        this.zze = true;
        interrupt();
    }
}
