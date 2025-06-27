package com.mbridge.msdk.dycreator.bus;

import android.util.Log;

/* loaded from: classes4.dex */
final class BackgroundPoster implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final PendingPostQueue f2656a = new PendingPostQueue();
    private volatile boolean b;
    private final EventBus c;

    BackgroundPoster(EventBus eventBus) {
        this.c = eventBus;
    }

    public final void enqueue(Subscription subscription, Object obj) {
        PendingPost pendingPostA = PendingPost.a(subscription, obj);
        synchronized (this) {
            this.f2656a.a(pendingPostA);
            if (!this.b) {
                this.b = true;
                EventBus.f2657a.execute(this);
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        while (true) {
            try {
                PendingPost pendingPostA = this.f2656a.a(1000);
                if (pendingPostA == null) {
                    synchronized (this) {
                        pendingPostA = this.f2656a.a();
                        if (pendingPostA == null) {
                            return;
                        }
                    }
                }
                this.c.a(pendingPostA);
            } catch (InterruptedException e) {
                Log.w("Event", Thread.currentThread().getName() + " was interruppted", e);
                return;
            } finally {
                this.b = false;
            }
        }
    }
}
