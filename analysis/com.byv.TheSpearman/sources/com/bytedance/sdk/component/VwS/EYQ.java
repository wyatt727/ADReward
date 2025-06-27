package com.bytedance.sdk.component.VwS;

import android.os.Looper;
import android.text.TextUtils;
import com.bytedance.sdk.component.utils.pi;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: ADThreadPoolExecutor.java */
/* loaded from: classes2.dex */
class EYQ extends ThreadPoolExecutor {
    private String EYQ;

    public EYQ(String str, int i, int i2, long j, TimeUnit timeUnit, BlockingQueue<Runnable> blockingQueue, ThreadFactory threadFactory, RejectedExecutionHandler rejectedExecutionHandler) {
        super(i, i2, j, timeUnit, blockingQueue, threadFactory, rejectedExecutionHandler);
        this.EYQ = str;
    }

    private void EYQ(Runnable runnable) {
        try {
            super.execute(runnable);
        } catch (OutOfMemoryError e) {
            EYQ(runnable, e);
        } catch (Throwable th) {
            EYQ(runnable, th);
        }
    }

    private void EYQ(Runnable runnable, OutOfMemoryError outOfMemoryError) {
        EYQ(runnable, (Throwable) outOfMemoryError);
    }

    private void EYQ(Runnable runnable, Throwable th) {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            try {
                runnable.run();
            } catch (Throwable th2) {
                pi.EYQ("", "try exc failed", th2);
            }
        }
    }

    private void EYQ(BlockingQueue<Runnable> blockingQueue, int i) {
        if (getCorePoolSize() == i || blockingQueue == null || blockingQueue.size() > 0) {
            return;
        }
        try {
            setCorePoolSize(i);
            Integer.valueOf(getCorePoolSize());
            Integer.valueOf(getMaximumPoolSize());
        } catch (Exception e) {
            e.getMessage();
        }
    }

    private void EYQ(BlockingQueue<Runnable> blockingQueue, int i, int i2) {
        if (getCorePoolSize() == i || blockingQueue == null || blockingQueue.size() < i2) {
            return;
        }
        try {
            setCorePoolSize(i);
            Integer.valueOf(getCorePoolSize());
            Integer.valueOf(getMaximumPoolSize());
        } catch (Exception e) {
            e.getMessage();
        }
    }

    @Override // java.util.concurrent.ThreadPoolExecutor, java.util.concurrent.Executor
    public void execute(final Runnable runnable) {
        BlockingQueue<Runnable> queue;
        if (runnable instanceof QQ) {
            EYQ(new mZx((QQ) runnable, this));
        } else {
            EYQ(new mZx(new QQ("unknown") { // from class: com.bytedance.sdk.component.VwS.EYQ.1
                @Override // java.lang.Runnable
                public void run() {
                    runnable.run();
                }
            }, this));
        }
        if (!IPb.VwS() || TextUtils.isEmpty(this.EYQ) || (queue = getQueue()) == null) {
            return;
        }
        String str = this.EYQ;
        str.hashCode();
        switch (str) {
            case "io":
                EYQ(queue, IPb.EYQ + 2, getCorePoolSize() * 2);
                break;
            case "log":
                EYQ(queue, 8, 8);
                break;
            case "aidl":
                EYQ(queue, 5, 5);
                break;
        }
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    protected void afterExecute(Runnable runnable, Throwable th) {
        BlockingQueue<Runnable> queue;
        super.afterExecute(runnable, th);
        if (!IPb.VwS() || TextUtils.isEmpty(this.EYQ) || (queue = getQueue()) == null) {
            return;
        }
        String str = this.EYQ;
        str.hashCode();
        switch (str) {
            case "io":
                EYQ(queue, 2);
                break;
            case "log":
                EYQ(queue, 4);
                break;
            case "aidl":
                EYQ(queue, 2);
                break;
        }
    }

    @Override // java.util.concurrent.ThreadPoolExecutor, java.util.concurrent.ExecutorService
    public List<Runnable> shutdownNow() {
        if ("io".equals(this.EYQ) || "aidl".equals(this.EYQ)) {
            return Collections.emptyList();
        }
        return super.shutdownNow();
    }

    @Override // java.util.concurrent.ThreadPoolExecutor, java.util.concurrent.ExecutorService
    public void shutdown() {
        if ("io".equals(this.EYQ) || "aidl".equals(this.EYQ)) {
            return;
        }
        super.shutdown();
    }

    public String EYQ() {
        return this.EYQ;
    }

    /* compiled from: ADThreadPoolExecutor.java */
    /* renamed from: com.bytedance.sdk.component.VwS.EYQ$EYQ, reason: collision with other inner class name */
    public static class C0087EYQ {
        private RejectedExecutionHandler QQ;
        private String EYQ = "io";
        private int mZx = 1;
        private long Td = 30;
        private TimeUnit Pm = TimeUnit.SECONDS;
        private int Kbd = Integer.MAX_VALUE;
        private BlockingQueue<Runnable> IPb = null;
        private ThreadFactory VwS = null;
        private int HX = 5;

        public C0087EYQ EYQ(String str) {
            this.EYQ = str;
            return this;
        }

        public C0087EYQ EYQ(int i) {
            this.mZx = i;
            return this;
        }

        public C0087EYQ EYQ(long j) {
            this.Td = j;
            return this;
        }

        public C0087EYQ EYQ(TimeUnit timeUnit) {
            this.Pm = timeUnit;
            return this;
        }

        public C0087EYQ EYQ(BlockingQueue<Runnable> blockingQueue) {
            this.IPb = blockingQueue;
            return this;
        }

        public C0087EYQ EYQ(ThreadFactory threadFactory) {
            this.VwS = threadFactory;
            return this;
        }

        public C0087EYQ EYQ(RejectedExecutionHandler rejectedExecutionHandler) {
            this.QQ = rejectedExecutionHandler;
            return this;
        }

        public C0087EYQ mZx(int i) {
            this.HX = i;
            return this;
        }

        public EYQ EYQ() {
            if (this.VwS == null) {
                this.VwS = Kbd.EYQ().createThreadFactory(this.HX, this.EYQ);
            }
            if (this.QQ == null) {
                this.QQ = IPb.QQ();
            }
            if (this.IPb == null) {
                this.IPb = new LinkedBlockingQueue();
            }
            return new EYQ(this.EYQ, this.mZx, this.Kbd, this.Td, this.Pm, this.IPb, this.VwS, this.QQ);
        }
    }
}
