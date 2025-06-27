package com.bytedance.sdk.component.VwS;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: TTThreadFactory.java */
/* loaded from: classes2.dex */
public class HX implements ThreadFactory {
    public static final String THREAD_GROUP_NAME_PRE = "csj_g_";
    public static final String THREAD_NAME_PRE = "csj_";
    protected final ThreadGroup EYQ;
    private final AtomicInteger Pm;
    protected int Td;
    protected final String mZx;

    public HX(String str) {
        this(5, str);
    }

    public HX(int i, String str) {
        this.Pm = new AtomicInteger(1);
        this.Td = i;
        this.EYQ = new ThreadGroup(THREAD_GROUP_NAME_PRE.concat(String.valueOf(str)));
        this.mZx = THREAD_NAME_PRE.concat(String.valueOf(str));
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable runnable) {
        Thread threadEYQ = EYQ(this.EYQ, runnable, this.mZx + this.Pm.getAndIncrement());
        if (threadEYQ.isDaemon()) {
            threadEYQ.setDaemon(false);
        }
        int i = this.Td;
        if (i > 10 || i <= 0) {
            this.Td = 5;
        }
        threadEYQ.setPriority(this.Td);
        return threadEYQ;
    }

    protected Thread EYQ(ThreadGroup threadGroup, Runnable runnable, String str) {
        return new Thread(threadGroup, runnable, str);
    }
}
