package com.bytedance.sdk.component.VwS.EYQ;

import com.bytedance.sdk.component.VwS.EYQ.Td;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/* compiled from: RecyclePool.java */
/* loaded from: classes2.dex */
public class Pm<T extends Td> {
    private int EYQ;
    private BlockingQueue<T> mZx = new LinkedBlockingQueue();

    public static Pm EYQ(int i) {
        return new Pm(i);
    }

    private Pm(int i) {
        this.EYQ = i;
    }

    public T EYQ() {
        return this.mZx.poll();
    }

    public boolean EYQ(T t) {
        if (t == null) {
            return false;
        }
        t.EYQ();
        if (this.mZx.size() >= this.EYQ) {
            return false;
        }
        return this.mZx.offer(t);
    }
}
