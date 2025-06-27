package com.mbridge.msdk.dycreator.bus;

/* loaded from: classes4.dex */
class AsyncPoster implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final PendingPostQueue f2655a = new PendingPostQueue();
    private final EventBus b;

    AsyncPoster(EventBus eventBus) {
        this.b = eventBus;
    }

    public void enqueue(Subscription subscription, Object obj) {
        this.f2655a.a(PendingPost.a(subscription, obj));
        EventBus.f2657a.execute(this);
    }

    @Override // java.lang.Runnable
    public void run() {
        PendingPost pendingPostA = this.f2655a.a();
        if (pendingPostA == null) {
            throw new IllegalStateException("No pending post available");
        }
        this.b.a(pendingPostA);
    }
}
