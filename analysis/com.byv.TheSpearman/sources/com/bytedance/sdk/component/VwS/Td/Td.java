package com.bytedance.sdk.component.VwS.Td;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PagThreadFactory.java */
/* loaded from: classes2.dex */
public class Td implements ThreadFactory {
    protected final ThreadGroup EYQ;
    private final AtomicInteger Td = new AtomicInteger(1);
    protected final String mZx;

    public Td(String str) {
        this.EYQ = new ThreadGroup("pag_g_".concat(String.valueOf(str)));
        this.mZx = "pag_".concat(String.valueOf(str));
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable runnable) {
        Thread threadEYQ = EYQ(this.EYQ, runnable, this.mZx + "_" + this.Td.getAndIncrement());
        if (threadEYQ.isDaemon()) {
            threadEYQ.setDaemon(false);
        }
        return threadEYQ;
    }

    protected Thread EYQ(ThreadGroup threadGroup, Runnable runnable, String str) {
        return new Thread(threadGroup, runnable, str);
    }
}
