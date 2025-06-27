package com.bytedance.sdk.component.Kbd.EYQ.EYQ.mZx;

import com.bytedance.sdk.component.Kbd.EYQ.Pm.EYQ;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

/* compiled from: EventMemoryCacheManager.java */
/* loaded from: classes2.dex */
public abstract class Pm<T extends com.bytedance.sdk.component.Kbd.EYQ.Pm.EYQ> {
    private com.bytedance.sdk.component.Kbd.EYQ.Pm.mZx.EYQ EYQ;
    private String Pm;
    private Queue<String> Td;
    private Queue<T> mZx = new ConcurrentLinkedQueue();

    public Pm(com.bytedance.sdk.component.Kbd.EYQ.Pm.mZx.EYQ eyq, Queue<String> queue, String str) {
        this.Pm = "EventMemoryCacheManager";
        this.EYQ = eyq;
        this.Td = queue;
        this.Pm = str;
    }

    public void EYQ(T t) {
        Queue<T> queue = this.mZx;
        if (queue == null || t == null) {
            return;
        }
        queue.offer(t);
    }

    public synchronized List<com.bytedance.sdk.component.Kbd.EYQ.Pm.EYQ> EYQ(int i, int i2) {
        if (!mZx(i, i2)) {
            return null;
        }
        ArrayList arrayList = new ArrayList(this.EYQ.EYQ());
        do {
            T tPoll = this.mZx.poll();
            if (tPoll == null) {
                break;
            }
            arrayList.add(tPoll);
        } while (arrayList.size() != this.EYQ.mZx());
        return arrayList;
    }

    public synchronized void EYQ(int i, List<T> list) {
        if (i == -1 || i == 200 || i == 509) {
            this.mZx.size();
        } else {
            this.mZx.addAll(list);
        }
    }

    public synchronized boolean mZx(int i, int i2) {
        int size = this.mZx.size();
        int iEYQ = this.EYQ.EYQ();
        return (i == 2 || i == 1) ? com.bytedance.sdk.component.Kbd.EYQ.Td.EYQ.Td() ? size > 0 : size >= iEYQ : size >= iEYQ;
    }
}
