package com.bytedance.sdk.component.VwS;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/* compiled from: TTFutureTask.java */
/* loaded from: classes2.dex */
public class VwS<V> extends FutureTask<V> implements Comparable<VwS<V>> {
    private int EYQ;
    private int mZx;

    public VwS(Callable<V> callable, int i, int i2) {
        super(callable);
        this.EYQ = i == -1 ? 5 : i;
        this.mZx = i2;
    }

    public VwS(Runnable runnable, V v, int i, int i2) {
        super(runnable, v);
        this.EYQ = i == -1 ? 5 : i;
        this.mZx = i2;
    }

    @Override // java.lang.Comparable
    /* renamed from: EYQ, reason: merged with bridge method [inline-methods] */
    public int compareTo(VwS vwS) {
        if (EYQ() < vwS.EYQ()) {
            return 1;
        }
        return EYQ() > vwS.EYQ() ? -1 : 0;
    }

    public int EYQ() {
        return this.EYQ;
    }
}
