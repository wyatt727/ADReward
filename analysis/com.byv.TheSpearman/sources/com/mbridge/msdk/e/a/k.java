package com.mbridge.msdk.e.a;

import android.net.TrafficStats;
import android.os.Process;
import android.os.SystemClock;
import java.util.concurrent.BlockingQueue;

/* compiled from: NetworkDispatcher.java */
/* loaded from: classes4.dex */
public final class k extends Thread {

    /* renamed from: a, reason: collision with root package name */
    private final BlockingQueue<p<?>> f2708a;
    private final j b;
    private final b c;
    private final t d;
    private volatile boolean e = false;

    public k(BlockingQueue<p<?>> blockingQueue, j jVar, b bVar, t tVar) {
        this.f2708a = blockingQueue;
        this.b = jVar;
        this.c = bVar;
        this.d = tVar;
    }

    public final void a() {
        this.e = true;
        interrupt();
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() throws InterruptedException, SecurityException, IllegalArgumentException {
        Process.setThreadPriority(10);
        while (true) {
            try {
                p<?> pVarTake = this.f2708a.take();
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                pVarTake.b(3);
                try {
                    try {
                        if (pVarTake.m()) {
                            pVarTake.c("network-discard-cancelled");
                            pVarTake.v();
                        } else {
                            TrafficStats.setThreadStatsTag(pVarTake.h());
                            m mVarA = this.b.a(pVarTake);
                            if (mVarA.e && pVarTake.u()) {
                                pVarTake.c("not-modified");
                                pVarTake.v();
                            } else {
                                r<?> rVarA = pVarTake.a(mVarA);
                                if (pVarTake.p() && rVarA.b != null) {
                                    this.c.a(pVarTake.j(), rVarA.b);
                                }
                                pVarTake.t();
                                this.d.a(pVarTake, rVarA);
                                pVarTake.a(rVarA);
                            }
                        }
                    } catch (z e) {
                        e.a(SystemClock.elapsedRealtime() - jElapsedRealtime);
                        this.d.a(pVarTake, e);
                        pVarTake.v();
                    } catch (Exception e2) {
                        aa.a(e2, "Unhandled exception %s", e2.toString());
                        y yVar = new y(e2);
                        yVar.a(SystemClock.elapsedRealtime() - jElapsedRealtime);
                        this.d.a(pVarTake, yVar);
                        pVarTake.v();
                    }
                    pVarTake.b(4);
                } catch (Throwable th) {
                    pVarTake.b(4);
                    throw th;
                }
            } catch (InterruptedException unused) {
                if (this.e) {
                    Thread.currentThread().interrupt();
                    return;
                }
                aa.c("Ignoring spurious interrupt of NetworkDispatcher thread; use quit() to terminate it", new Object[0]);
            }
        }
    }
}
