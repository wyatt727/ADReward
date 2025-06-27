package com.mbridge.msdk.dycreator.bus;

/* loaded from: classes4.dex */
final class PendingPostQueue {

    /* renamed from: a, reason: collision with root package name */
    private PendingPost f2664a;
    private PendingPost b;

    PendingPostQueue() {
    }

    final synchronized void a(PendingPost pendingPost) {
        try {
            if (pendingPost == null) {
                throw new NullPointerException("null cannot be enqueued");
            }
            PendingPost pendingPost2 = this.b;
            if (pendingPost2 != null) {
                pendingPost2.c = pendingPost;
                this.b = pendingPost;
            } else {
                if (this.f2664a != null) {
                    throw new IllegalStateException("Head present, but no tail");
                }
                this.b = pendingPost;
                this.f2664a = pendingPost;
            }
            notifyAll();
        } catch (Throwable th) {
            throw th;
        }
    }

    final synchronized PendingPost a() {
        PendingPost pendingPost;
        pendingPost = this.f2664a;
        if (pendingPost != null) {
            PendingPost pendingPost2 = pendingPost.c;
            this.f2664a = pendingPost2;
            if (pendingPost2 == null) {
                this.b = null;
            }
        }
        return pendingPost;
    }

    final synchronized PendingPost a(int i) throws InterruptedException {
        if (this.f2664a == null) {
            wait(i);
        }
        return a();
    }
}
