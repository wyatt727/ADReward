package com.bytedance.sdk.component.Pm.EYQ;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: DefaultThreadFactory.java */
/* loaded from: classes2.dex */
public class EYQ implements ThreadFactory {
    private final ThreadGroup EYQ;
    private final AtomicInteger mZx = new AtomicInteger(1);

    public EYQ(String str) {
        this.EYQ = new ThreadGroup("tt_img_".concat(String.valueOf(str)));
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable runnable) {
        Thread thread = new Thread(this.EYQ, runnable, "tt_img_" + this.mZx.getAndIncrement());
        if (thread.isDaemon()) {
            thread.setDaemon(false);
        }
        return thread;
    }
}
