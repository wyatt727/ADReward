package com.mbridge.msdk.e.a;

import android.os.Process;
import com.mbridge.msdk.e.a.b;
import java.util.concurrent.BlockingQueue;

/* compiled from: CacheDispatcher.java */
/* loaded from: classes4.dex */
public final class c extends Thread {

    /* renamed from: a, reason: collision with root package name */
    private final BlockingQueue<p<?>> f2701a;
    private final BlockingQueue<p<?>> b;
    private final b c;
    private final t d;
    private volatile boolean e = false;
    private final ab f;

    public c(BlockingQueue<p<?>> blockingQueue, BlockingQueue<p<?>> blockingQueue2, b bVar, t tVar) {
        this.f2701a = blockingQueue;
        this.b = blockingQueue2;
        this.c = bVar;
        this.d = tVar;
        this.f = new ab(this, blockingQueue2, tVar);
    }

    public final void a() {
        this.e = true;
        interrupt();
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() throws InterruptedException, SecurityException, IllegalArgumentException {
        Process.setThreadPriority(10);
        this.c.a();
        while (true) {
            try {
                final p<?> pVarTake = this.f2701a.take();
                pVarTake.b(1);
                try {
                    if (pVarTake.m()) {
                        pVarTake.c("cache-discard-canceled");
                    } else {
                        b.a aVarA = this.c.a(pVarTake.j());
                        if (aVarA == null) {
                            if (!this.f.b(pVarTake)) {
                                this.b.put(pVarTake);
                            }
                        } else {
                            long jCurrentTimeMillis = System.currentTimeMillis();
                            if (aVarA.a(jCurrentTimeMillis)) {
                                pVarTake.a(aVarA);
                                if (!this.f.b(pVarTake)) {
                                    this.b.put(pVarTake);
                                }
                            } else {
                                r<?> rVarA = pVarTake.a(new m(200, aVarA.f2700a, false, 0L, aVarA.h));
                                s sVarK = pVarTake.k();
                                if (!(sVarK == null || sVarK.a(rVarA, pVarTake))) {
                                    this.c.a(pVarTake.j(), true);
                                    pVarTake.a((b.a) null);
                                    if (!this.f.b(pVarTake)) {
                                        this.b.put(pVarTake);
                                    }
                                } else if (rVarA.a()) {
                                    if (!(aVarA.f < jCurrentTimeMillis)) {
                                        this.d.a(pVarTake, rVarA);
                                    } else {
                                        pVarTake.a(aVarA);
                                        rVarA.d = true;
                                        if (!this.f.b(pVarTake)) {
                                            this.d.a(pVarTake, rVarA, new Runnable() { // from class: com.mbridge.msdk.e.a.c.1
                                                @Override // java.lang.Runnable
                                                public final void run() throws InterruptedException {
                                                    try {
                                                        c.this.b.put(pVarTake);
                                                    } catch (InterruptedException unused) {
                                                        Thread.currentThread().interrupt();
                                                    }
                                                }
                                            });
                                        } else {
                                            this.d.a(pVarTake, rVarA);
                                        }
                                    }
                                } else {
                                    this.c.a(pVarTake.j(), true);
                                    pVarTake.a((b.a) null);
                                    if (!this.f.b(pVarTake)) {
                                        this.b.put(pVarTake);
                                    }
                                }
                            }
                        }
                    }
                    pVarTake.b(2);
                } catch (Throwable th) {
                    pVarTake.b(2);
                    throw th;
                }
            } catch (InterruptedException unused) {
                if (this.e) {
                    Thread.currentThread().interrupt();
                    return;
                }
                aa.c("Ignoring spurious interrupt of CacheDispatcher thread; use quit() to terminate it", new Object[0]);
            }
        }
    }
}
