package com.bytedance.sdk.component.VwS.Td;

import android.os.SystemClock;
import com.bytedance.sdk.component.utils.pi;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: PagThreadPoolExecutor.java */
/* loaded from: classes2.dex */
public class Kbd extends ThreadPoolExecutor {
    private final String EYQ;
    private final int IPb;
    private final int Kbd;
    private final int Pm;
    private LinkedHashMap<String, com.bytedance.sdk.component.VwS.Td.EYQ.EYQ> QQ;
    private final int Td;
    private boolean VwS;
    private int mZx;

    private Kbd(EYQ eyq) {
        super(eyq.mZx, Integer.MAX_VALUE, eyq.Kbd, eyq.VwS, (BlockingQueue<Runnable>) eyq.MxO, eyq.tsL);
        this.VwS = false;
        this.EYQ = eyq.EYQ;
        this.Pm = eyq.mZx;
        this.Kbd = eyq.Td;
        this.IPb = eyq.Pm;
        allowCoreThreadTimeOut(eyq.IPb);
        this.mZx = eyq.QQ;
        int i = eyq.HX;
        this.Td = i;
        this.VwS = eyq.tp;
        if (VwS()) {
            final int i2 = i + 4;
            this.QQ = new LinkedHashMap<String, com.bytedance.sdk.component.VwS.Td.EYQ.EYQ>(i2, 0.75f, true) { // from class: com.bytedance.sdk.component.VwS.Td.Kbd.1
                @Override // java.util.LinkedHashMap
                protected boolean removeEldestEntry(Map.Entry<String, com.bytedance.sdk.component.VwS.Td.EYQ.EYQ> entry) {
                    return size() > i2;
                }
            };
        }
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    protected void beforeExecute(Thread thread, Runnable runnable) {
        if (runnable instanceof com.bytedance.sdk.component.VwS.Td.EYQ) {
            ((com.bytedance.sdk.component.VwS.Td.EYQ) runnable).mZx(SystemClock.elapsedRealtime());
        }
        super.beforeExecute(thread, runnable);
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    protected void afterExecute(Runnable runnable, Throwable th) {
        if (runnable instanceof com.bytedance.sdk.component.VwS.Td.EYQ) {
            ((com.bytedance.sdk.component.VwS.Td.EYQ) runnable).Td(SystemClock.elapsedRealtime());
            try {
                if (VwS() && this.QQ != null) {
                    EYQ((com.bytedance.sdk.component.VwS.Td.EYQ) runnable);
                    IPb();
                }
            } catch (Exception e) {
                pi.EYQ("PAGThreadPoolExecutor", e.getMessage());
            }
        }
        super.afterExecute(runnable, th);
        Kbd();
    }

    private void Pm() {
        int corePoolSize;
        try {
            if (this.Pm != 0 && (corePoolSize = getCorePoolSize()) < this.Kbd) {
                int size = getQueue().size();
                if (getActiveCount() < this.Pm || size < this.IPb) {
                    return;
                }
                setCorePoolSize(this.Kbd);
                Integer.valueOf(size);
                Integer.valueOf(corePoolSize);
                Integer.valueOf(this.Kbd);
            }
        } catch (Exception e) {
            e.getMessage();
        }
    }

    private void Kbd() {
        int corePoolSize;
        int size;
        try {
            if (this.Pm != 0 && (corePoolSize = getCorePoolSize()) > this.Pm && (size = getQueue().size()) == 0) {
                setCorePoolSize(this.Pm);
                Integer.valueOf(size);
                Integer.valueOf(corePoolSize);
                Integer.valueOf(this.Pm);
            }
        } catch (Exception e) {
            e.getMessage();
        }
    }

    @Override // java.util.concurrent.ThreadPoolExecutor, java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        if (!(runnable instanceof com.bytedance.sdk.component.VwS.Td.EYQ)) {
            runnable = new com.bytedance.sdk.component.VwS.Td.EYQ("unknown", runnable) { // from class: com.bytedance.sdk.component.VwS.Td.Kbd.2
                @Override // java.lang.Runnable
                public void run() {
                    Runnable runnableKbd = Kbd();
                    if (runnableKbd != null) {
                        runnableKbd.run();
                    }
                }
            };
        }
        ((com.bytedance.sdk.component.VwS.Td.EYQ) runnable).EYQ(SystemClock.elapsedRealtime());
        super.execute(runnable);
        Pm();
    }

    private void EYQ(com.bytedance.sdk.component.VwS.Td.EYQ eyq) {
        LinkedHashMap<String, com.bytedance.sdk.component.VwS.Td.EYQ.EYQ> linkedHashMap = this.QQ;
        if (linkedHashMap != null) {
            com.bytedance.sdk.component.VwS.Td.EYQ.EYQ eyq2 = linkedHashMap.get(eyq.mZx());
            if (eyq2 == null) {
                synchronized (linkedHashMap) {
                    eyq2 = linkedHashMap.get(eyq.mZx());
                    if (eyq2 == null) {
                        eyq2 = new com.bytedance.sdk.component.VwS.Td.EYQ.EYQ();
                        linkedHashMap.put(eyq.mZx(), eyq2);
                    }
                }
            }
            eyq2.EYQ(eyq);
        }
    }

    public LinkedHashMap<String, com.bytedance.sdk.component.VwS.Td.EYQ.EYQ> EYQ() {
        return this.QQ;
    }

    private void IPb() {
        if (getCompletedTaskCount() > this.mZx) {
            Pm pmEYQ = mZx.EYQ();
            if (pmEYQ != null) {
                pmEYQ.EYQ(this);
            }
            this.mZx = -1;
        }
    }

    @Override // java.util.concurrent.ThreadPoolExecutor, java.util.concurrent.ExecutorService
    public List<Runnable> shutdownNow() {
        if ("aidl".equals(this.EYQ)) {
            return Collections.emptyList();
        }
        return super.shutdownNow();
    }

    @Override // java.util.concurrent.ThreadPoolExecutor, java.util.concurrent.ExecutorService
    public void shutdown() {
        if ("aidl".equals(this.EYQ)) {
            return;
        }
        super.shutdown();
    }

    public String mZx() {
        return this.EYQ;
    }

    private boolean VwS() {
        return this.mZx > 0;
    }

    public boolean Td() {
        return this.VwS;
    }

    /* compiled from: PagThreadPoolExecutor.java */
    public static class EYQ {
        private String EYQ = "cache";
        private int mZx = 4;
        private int Td = 100;
        private int Pm = 0;
        private long Kbd = 30000;
        private boolean IPb = false;
        private TimeUnit VwS = TimeUnit.MILLISECONDS;
        private int QQ = -1;
        private int HX = 20;
        private boolean tp = false;
        private BlockingQueue<Runnable> MxO = new PriorityBlockingQueue();
        private ThreadFactory tsL = null;

        public EYQ EYQ(String str) {
            this.EYQ = str;
            return this;
        }

        public EYQ EYQ(int i) {
            this.mZx = i;
            return this;
        }

        public EYQ mZx(int i) {
            this.Td = i;
            return this;
        }

        public EYQ Td(int i) {
            this.Pm = i;
            return this;
        }

        public EYQ EYQ(long j) {
            this.Kbd = j;
            return this;
        }

        public EYQ EYQ(boolean z) {
            this.IPb = z;
            return this;
        }

        public EYQ Pm(int i) {
            this.HX = i;
            return this;
        }

        public EYQ Kbd(int i) {
            this.QQ = i;
            return this;
        }

        public EYQ mZx(boolean z) {
            this.tp = z;
            return this;
        }

        public Kbd EYQ() {
            if (this.tsL == null) {
                this.tsL = new Td(this.EYQ);
            }
            if (this.mZx < 0) {
                this.mZx = 8;
            }
            if (this.mZx == 0) {
                this.MxO = new SynchronousQueue();
            }
            if (this.MxO == null) {
                this.MxO = new LinkedBlockingQueue();
            }
            if (this.Td > 100) {
                this.Td = 100;
            }
            int i = this.Td;
            int i2 = this.mZx;
            if (i < i2) {
                this.Td = i2;
            }
            if (this.HX < 0) {
                this.HX = 20;
            }
            if (this.HX > 100) {
                this.HX = 100;
            }
            return new Kbd(this);
        }
    }
}
