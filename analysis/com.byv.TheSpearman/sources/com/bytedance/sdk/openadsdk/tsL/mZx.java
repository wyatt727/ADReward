package com.bytedance.sdk.openadsdk.tsL;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: CrashMonitor.java */
/* loaded from: classes2.dex */
public class mZx {
    private EYQ Kbd;
    private int Pm;
    private QQ mZx;
    private ScheduledExecutorService EYQ = null;
    private long Td = 0;

    /* compiled from: CrashMonitor.java */
    public interface EYQ {
    }

    public mZx(QQ qq, int i) {
        this.Pm = 700;
        this.mZx = qq;
        this.Pm = i;
    }

    public void EYQ(long j) {
        this.Td = j;
    }

    public void EYQ(int i) {
        ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(1);
        this.EYQ = scheduledExecutorServiceNewScheduledThreadPool;
        scheduledExecutorServiceNewScheduledThreadPool.scheduleAtFixedRate(new Runnable() { // from class: com.bytedance.sdk.openadsdk.tsL.mZx.1
            @Override // java.lang.Runnable
            public void run() {
                System.currentTimeMillis();
                long unused = mZx.this.Td;
                if (System.currentTimeMillis() - mZx.this.Td > mZx.this.Pm) {
                    mZx.this.EYQ.shutdown();
                    if (mZx.this.mZx != null) {
                        mZx.this.mZx.mZx(0, "Automatic detection of stuck");
                    }
                    if (mZx.this.Kbd != null) {
                        EYQ unused2 = mZx.this.Kbd;
                    }
                }
            }
        }, 0L, i, TimeUnit.MILLISECONDS);
    }

    public void EYQ() {
        ScheduledExecutorService scheduledExecutorService = this.EYQ;
        if (scheduledExecutorService != null) {
            scheduledExecutorService.shutdown();
        }
    }

    public boolean mZx() {
        ScheduledExecutorService scheduledExecutorService = this.EYQ;
        if (scheduledExecutorService != null) {
            return scheduledExecutorService.isShutdown();
        }
        return true;
    }
}
