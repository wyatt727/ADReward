package com.bytedance.sdk.component.mZx.EYQ.EYQ.EYQ;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: NetDispatcher.java */
/* loaded from: classes2.dex */
public class Pm extends com.bytedance.sdk.component.mZx.EYQ.Pm {
    private ExecutorService EYQ;
    private List<com.bytedance.sdk.component.mZx.EYQ.mZx> mZx = new CopyOnWriteArrayList();
    private List<com.bytedance.sdk.component.mZx.EYQ.mZx> Td = new CopyOnWriteArrayList();
    private AtomicInteger Pm = new AtomicInteger(64);

    public Pm() {
        if (this.EYQ == null) {
            this.EYQ = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 20L, TimeUnit.SECONDS, new SynchronousQueue(), new ThreadFactory() { // from class: com.bytedance.sdk.component.mZx.EYQ.EYQ.EYQ.Pm.1
                @Override // java.util.concurrent.ThreadFactory
                public Thread newThread(Runnable runnable) {
                    Thread thread = new Thread(runnable, "systemHttp Dispatcher");
                    thread.setDaemon(false);
                    thread.setPriority(10);
                    return thread;
                }
            });
        }
    }

    @Override // com.bytedance.sdk.component.mZx.EYQ.Pm
    public ExecutorService mZx() {
        return this.EYQ;
    }

    @Override // com.bytedance.sdk.component.mZx.EYQ.Pm
    public void EYQ(int i) {
        this.Pm.set(i);
    }

    @Override // com.bytedance.sdk.component.mZx.EYQ.Pm
    public List<com.bytedance.sdk.component.mZx.EYQ.mZx> Td() {
        return this.mZx;
    }

    @Override // com.bytedance.sdk.component.mZx.EYQ.Pm
    public List<com.bytedance.sdk.component.mZx.EYQ.mZx> Pm() {
        return this.Td;
    }

    @Override // com.bytedance.sdk.component.mZx.EYQ.Pm
    public int EYQ() {
        return this.Pm.get();
    }
}
