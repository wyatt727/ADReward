package com.mbridge.msdk.e;

import android.util.Log;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: ExecutorManager.java */
/* loaded from: classes4.dex */
final class j {

    /* renamed from: a, reason: collision with root package name */
    private final Executor f2721a = new ThreadPoolExecutor(1, 1, 0, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), new ThreadFactory() { // from class: com.mbridge.msdk.e.j.1
        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(Runnable runnable) {
            return new Thread(runnable, "MBridgeTrackThread");
        }
    }, new ThreadPoolExecutor.DiscardPolicy());
    private final Executor b = new ThreadPoolExecutor(1, 1, 0, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), new ThreadFactory() { // from class: com.mbridge.msdk.e.j.2
        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(Runnable runnable) {
            return new Thread(runnable, "MBridgeTrackDatabaseThread");
        }
    }, new ThreadPoolExecutor.DiscardPolicy());

    public final void a(Runnable runnable) {
        this.f2721a.execute(new a(runnable));
    }

    public final void b(Runnable runnable) {
        this.b.execute(new a(runnable));
    }

    /* compiled from: ExecutorManager.java */
    private static final class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private final Runnable f2724a;

        public a(Runnable runnable) {
            this.f2724a = runnable;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (y.a(this.f2724a)) {
                return;
            }
            try {
                this.f2724a.run();
            } catch (Exception e) {
                if (com.mbridge.msdk.e.a.f2688a) {
                    Log.e("TrackManager", "execute error", e);
                }
            }
        }
    }
}
