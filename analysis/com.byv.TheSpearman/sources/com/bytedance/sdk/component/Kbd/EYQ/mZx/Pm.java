package com.bytedance.sdk.component.Kbd.EYQ.mZx;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import com.bytedance.sdk.component.Kbd.EYQ.Kbd;
import com.bytedance.sdk.component.Kbd.EYQ.QQ;
import java.util.Comparator;
import java.util.concurrent.Executor;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: LogThreadCenter.java */
/* loaded from: classes2.dex */
public class Pm {
    private volatile com.bytedance.sdk.component.Kbd.EYQ.mZx.Td.Td HX;
    private final Comparator<com.bytedance.sdk.component.Kbd.EYQ.Pm.EYQ> MxO;
    private volatile Handler tp;
    private final PriorityBlockingQueue<com.bytedance.sdk.component.Kbd.EYQ.Pm.EYQ> tsL;
    public static final Pm EYQ = new Pm();
    public static final com.bytedance.sdk.component.Kbd.EYQ.mZx.EYQ.EYQ Pm = new com.bytedance.sdk.component.Kbd.EYQ.mZx.EYQ.EYQ();
    public static final AtomicLong Kbd = new AtomicLong(0);
    public static final AtomicLong IPb = new AtomicLong(0);
    public static final long VwS = System.currentTimeMillis();
    public static long QQ = 0;
    public volatile boolean mZx = false;
    public volatile boolean Td = false;

    public PriorityBlockingQueue<com.bytedance.sdk.component.Kbd.EYQ.Pm.EYQ> EYQ() {
        return this.tsL;
    }

    private Pm() {
        Comparator<com.bytedance.sdk.component.Kbd.EYQ.Pm.EYQ> comparator = new Comparator<com.bytedance.sdk.component.Kbd.EYQ.Pm.EYQ>() { // from class: com.bytedance.sdk.component.Kbd.EYQ.mZx.Pm.1
            @Override // java.util.Comparator
            /* renamed from: EYQ, reason: merged with bridge method [inline-methods] */
            public int compare(com.bytedance.sdk.component.Kbd.EYQ.Pm.EYQ eyq, com.bytedance.sdk.component.Kbd.EYQ.Pm.EYQ eyq2) {
                return Pm.this.EYQ(eyq, eyq2);
            }
        };
        this.MxO = comparator;
        this.tsL = new PriorityBlockingQueue<>(8, comparator);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int EYQ(com.bytedance.sdk.component.Kbd.EYQ.Pm.EYQ eyq, com.bytedance.sdk.component.Kbd.EYQ.Pm.EYQ eyq2) {
        long jEYQ;
        long jMZx;
        long jMZx2;
        long jEYQ2;
        if (eyq == null) {
            return eyq2 == null ? 0 : -1;
        }
        if (eyq2 == null) {
            return 1;
        }
        if (eyq.Kbd() == eyq2.Kbd()) {
            if (eyq.EYQ() != null) {
                jEYQ = eyq.EYQ().EYQ();
                jMZx = eyq.EYQ().mZx();
            } else {
                jEYQ = 0;
                jMZx = 0;
            }
            if (eyq2.EYQ() != null) {
                jEYQ2 = eyq2.EYQ().EYQ();
                jMZx2 = eyq2.EYQ().mZx();
            } else {
                jMZx2 = 0;
                jEYQ2 = 0;
            }
            if (jEYQ == 0 || jEYQ2 == 0) {
                return 0;
            }
            long j = jEYQ - jEYQ2;
            if (Math.abs(j) > 2147483647L) {
                return 0;
            }
            if (j != 0) {
                return (int) j;
            }
            if (jMZx == 0 || jMZx2 == 0) {
                return 0;
            }
            return (int) (jMZx - jMZx2);
        }
        return eyq.Kbd() - eyq2.Kbd();
    }

    public void mZx() {
        Pm();
        Kbd();
    }

    public void EYQ(Handler handler) {
        this.tp = handler;
    }

    public void Td() {
        if (this.HX == null || !this.HX.isAlive()) {
            return;
        }
        synchronized (this) {
            if (this.HX != null && this.HX.isAlive()) {
                if (this.tp != null) {
                    this.tp.removeCallbacksAndMessages(null);
                }
                this.HX.EYQ(false);
                if (Build.VERSION.SDK_INT >= 18) {
                    this.HX.quitSafely();
                } else {
                    this.HX.quit();
                }
                this.HX = null;
            }
        }
    }

    public boolean Pm() {
        try {
            if (this.HX != null || com.bytedance.sdk.component.Kbd.EYQ.mZx.mZx()) {
                return false;
            }
            synchronized (this) {
                if (this.HX != null) {
                    return false;
                }
                this.HX = new com.bytedance.sdk.component.Kbd.EYQ.mZx.Td.Td(this.tsL);
                this.HX.start();
                return true;
            }
        } catch (Throwable th) {
            th.getMessage();
            return false;
        }
    }

    public void EYQ(com.bytedance.sdk.component.Kbd.EYQ.Pm.EYQ eyq, int i) {
        Pm();
        Kbd kbdHu = QQ.VwS().hu();
        com.bytedance.sdk.component.Kbd.EYQ.mZx.Td.Td td = this.HX;
        if (td != null) {
            EYQ(kbdHu, eyq);
            td.EYQ(eyq, eyq.Kbd() == 4);
        }
    }

    private void EYQ(final Kbd kbd, com.bytedance.sdk.component.Kbd.EYQ.Pm.EYQ eyq) {
        if (kbd != null) {
            try {
                if (kbd.VwS()) {
                    long jMZx = 0;
                    if (eyq != null && eyq.EYQ() != null) {
                        jMZx = eyq.EYQ().mZx();
                    }
                    final long j = jMZx;
                    if (j == 1) {
                        QQ = System.currentTimeMillis();
                    }
                    AtomicLong atomicLongDVQ = Pm.dVQ();
                    com.bytedance.sdk.component.Kbd.EYQ.Td.mZx.EYQ(atomicLongDVQ, 1);
                    if (atomicLongDVQ.get() == 200) {
                        if (Looper.getMainLooper() == Looper.myLooper()) {
                            Executor executorPm = kbd.Pm();
                            if (executorPm == null) {
                                executorPm = kbd.Kbd();
                            }
                            if (executorPm != null) {
                                executorPm.execute(new com.bytedance.sdk.component.Kbd.EYQ.Kbd.Kbd("report") { // from class: com.bytedance.sdk.component.Kbd.EYQ.mZx.Pm.2
                                    @Override // java.lang.Runnable
                                    public void run() {
                                        Pm.this.EYQ(kbd, j);
                                    }
                                });
                                return;
                            }
                            return;
                        }
                        EYQ(kbd, j);
                    }
                }
            } catch (Exception unused) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void EYQ(Kbd kbd, long j) {
        com.bytedance.sdk.component.Kbd.EYQ.mZx.Td.Td td = this.HX;
        if (kbd == null || td == null) {
            return;
        }
        com.bytedance.sdk.component.Kbd.EYQ.mZx.EYQ.EYQ eyq = Pm;
        td.EYQ(kbd.EYQ(eyq.mZx(j)), true);
        eyq.Dal();
    }

    public void Kbd() {
        com.bytedance.sdk.component.Kbd.EYQ.Td.mZx.EYQ(Pm.PI(), 1);
        final com.bytedance.sdk.component.Kbd.EYQ.mZx.Td.Td td = this.HX;
        if (Looper.myLooper() != Looper.getMainLooper()) {
            if (td != null) {
                td.Td(2);
                return;
            }
            return;
        }
        Kbd kbdHu = QQ.VwS().hu();
        if (kbdHu != null) {
            Executor executorPm = kbdHu.Pm();
            if (executorPm == null) {
                executorPm = kbdHu.Kbd();
            }
            if (executorPm != null) {
                executorPm.execute(new com.bytedance.sdk.component.Kbd.EYQ.Kbd.Kbd("flush") { // from class: com.bytedance.sdk.component.Kbd.EYQ.mZx.Pm.3
                    @Override // java.lang.Runnable
                    public void run() {
                        com.bytedance.sdk.component.Kbd.EYQ.mZx.Td.Td td2 = td;
                        if (td2 != null) {
                            td2.Td(2);
                        }
                    }
                });
            }
        }
    }
}
