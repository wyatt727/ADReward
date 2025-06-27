package com.mbridge.msdk.e.a;

import android.os.Handler;
import java.util.concurrent.Executor;

/* compiled from: ExecutorDelivery.java */
/* loaded from: classes4.dex */
public final class h implements t {

    /* renamed from: a, reason: collision with root package name */
    private final Executor f2704a;

    public h(final Handler handler) {
        this.f2704a = new Executor() { // from class: com.mbridge.msdk.e.a.h.1
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                handler.post(runnable);
            }
        };
    }

    public h(Executor executor) {
        this.f2704a = executor;
    }

    @Override // com.mbridge.msdk.e.a.t
    public final void a(p<?> pVar, r<?> rVar) {
        a(pVar, rVar, null);
    }

    @Override // com.mbridge.msdk.e.a.t
    public final void a(p<?> pVar, r<?> rVar, Runnable runnable) {
        pVar.t();
        this.f2704a.execute(new a(pVar, rVar, runnable));
    }

    @Override // com.mbridge.msdk.e.a.t
    public final void a(p<?> pVar, z zVar) {
        this.f2704a.execute(new a(pVar, r.a(zVar), null));
    }

    /* compiled from: ExecutorDelivery.java */
    private static class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private final p f2706a;
        private final r b;
        private final Runnable c;

        public a(p pVar, r rVar, Runnable runnable) {
            this.f2706a = pVar;
            this.b = rVar;
            this.c = runnable;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.f2706a.m()) {
                this.f2706a.c("canceled-at-delivery");
                return;
            }
            if (this.b.a()) {
                this.f2706a.a((p) this.b.f2713a);
            } else {
                this.f2706a.b(this.b.c);
            }
            if (!this.b.d) {
                this.f2706a.c("done");
            }
            Runnable runnable = this.c;
            if (runnable != null) {
                runnable.run();
            }
        }
    }
}
