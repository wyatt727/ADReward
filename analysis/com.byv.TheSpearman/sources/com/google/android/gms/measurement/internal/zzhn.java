package com.google.android.gms.measurement.internal;

import android.os.Process;
import com.google.android.gms.common.internal.Preconditions;
import java.util.concurrent.BlockingQueue;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.0.0 */
/* loaded from: classes3.dex */
final class zzhn extends Thread {
    private final Object zza;
    private final BlockingQueue<zzhk<?>> zzb;
    private boolean zzc = false;
    private final /* synthetic */ zzhj zzd;

    public zzhn(zzhj zzhjVar, String str, BlockingQueue<zzhk<?>> blockingQueue) {
        this.zzd = zzhjVar;
        Preconditions.checkNotNull(str);
        Preconditions.checkNotNull(blockingQueue);
        this.zza = new Object();
        this.zzb = blockingQueue;
        setName(str);
    }

    private final void zzb() {
        synchronized (this.zzd.zzh) {
            if (!this.zzc) {
                this.zzd.zzi.release();
                this.zzd.zzh.notifyAll();
                if (this == this.zzd.zzb) {
                    this.zzd.zzb = null;
                } else if (this == this.zzd.zzc) {
                    this.zzd.zzc = null;
                } else {
                    this.zzd.zzj().zzg().zza("Current scheduler thread is neither worker nor network");
                }
                this.zzc = true;
            }
        }
    }

    private final void zza(InterruptedException interruptedException) throws IllegalStateException {
        this.zzd.zzj().zzu().zza(getName() + " was interrupted", interruptedException);
    }

    public final void zza() {
        synchronized (this.zza) {
            this.zza.notifyAll();
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() throws IllegalStateException, InterruptedException {
        boolean z = false;
        while (!z) {
            try {
                this.zzd.zzi.acquire();
                z = true;
            } catch (InterruptedException e) {
                zza(e);
            }
        }
        try {
            int threadPriority = Process.getThreadPriority(Process.myTid());
            while (true) {
                zzhk<?> zzhkVarPoll = this.zzb.poll();
                if (zzhkVarPoll != null) {
                    Process.setThreadPriority(zzhkVarPoll.zza ? threadPriority : 10);
                    zzhkVarPoll.run();
                } else {
                    synchronized (this.zza) {
                        if (this.zzb.peek() == null && !this.zzd.zzj) {
                            try {
                                this.zza.wait(30000L);
                            } catch (InterruptedException e2) {
                                zza(e2);
                            }
                        }
                    }
                    synchronized (this.zzd.zzh) {
                        if (this.zzb.peek() == null) {
                            zzb();
                            return;
                        }
                    }
                }
            }
        } finally {
            zzb();
        }
    }
}
