package com.bytedance.adsdk.lottie;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;

/* compiled from: LottieTask.java */
/* loaded from: classes2.dex */
public class tsL<T> {
    public static Executor EYQ = Executors.newCachedThreadPool();
    private volatile MxO<T> Kbd;
    private final Handler Pm;
    private final Set<tp<Throwable>> Td;
    private final Set<tp<T>> mZx;

    public tsL(Callable<MxO<T>> callable) {
        this(callable, false);
    }

    tsL(Callable<MxO<T>> callable, boolean z) {
        this.mZx = new LinkedHashSet(1);
        this.Td = new LinkedHashSet(1);
        this.Pm = new Handler(Looper.getMainLooper());
        this.Kbd = null;
        if (z) {
            try {
                EYQ((MxO) callable.call());
                return;
            } catch (Throwable th) {
                EYQ((MxO) new MxO<>(th));
                return;
            }
        }
        EYQ.execute(new EYQ(callable));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void EYQ(MxO<T> mxO) {
        if (this.Kbd != null) {
            throw new IllegalStateException("A task may only be set once.");
        }
        this.Kbd = mxO;
        EYQ();
    }

    public synchronized tsL<T> EYQ(tp<T> tpVar) {
        MxO<T> mxO = this.Kbd;
        if (mxO != null && mxO.EYQ() != null) {
            tpVar.EYQ(mxO.EYQ());
        }
        this.mZx.add(tpVar);
        return this;
    }

    public synchronized tsL<T> mZx(tp<T> tpVar) {
        this.mZx.remove(tpVar);
        return this;
    }

    public synchronized tsL<T> Td(tp<Throwable> tpVar) {
        MxO<T> mxO = this.Kbd;
        if (mxO != null && mxO.mZx() != null) {
            tpVar.EYQ(mxO.mZx());
        }
        this.Td.add(tpVar);
        return this;
    }

    public synchronized tsL<T> Pm(tp<Throwable> tpVar) {
        this.Td.remove(tpVar);
        return this;
    }

    private void EYQ() {
        this.Pm.post(new Runnable() { // from class: com.bytedance.adsdk.lottie.tsL.1
            @Override // java.lang.Runnable
            public void run() {
                MxO mxO = tsL.this.Kbd;
                if (mxO == null) {
                    return;
                }
                if (mxO.EYQ() != null) {
                    tsL.this.EYQ((tsL) mxO.EYQ());
                } else {
                    tsL.this.EYQ(mxO.mZx());
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void EYQ(T t) {
        Iterator it = new ArrayList(this.mZx).iterator();
        while (it.hasNext()) {
            ((tp) it.next()).EYQ(t);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void EYQ(Throwable th) {
        ArrayList arrayList = new ArrayList(this.Td);
        if (arrayList.isEmpty()) {
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((tp) it.next()).EYQ(th);
        }
    }

    /* compiled from: LottieTask.java */
    private class EYQ extends FutureTask<MxO<T>> {
        EYQ(Callable<MxO<T>> callable) {
            super(callable);
        }

        @Override // java.util.concurrent.FutureTask
        protected void done() {
            if (isCancelled()) {
                return;
            }
            try {
                tsL.this.EYQ((MxO) get());
            } catch (InterruptedException | ExecutionException e) {
                tsL.this.EYQ(new MxO(e));
            }
        }
    }
}
