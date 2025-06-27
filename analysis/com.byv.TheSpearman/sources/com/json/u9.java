package com.json;

import android.util.Log;
import java.util.Timer;
import java.util.TimerTask;

/* loaded from: classes4.dex */
public class u9 {
    private static final String g = "u9";

    /* renamed from: a, reason: collision with root package name */
    private final com.json.lifecycle.b f2329a;
    private final Runnable b;
    private final qd c;
    private Timer e;
    private final Object d = new Object();
    private final j9 f = new a();

    class a implements j9 {
        a() {
        }

        @Override // com.json.j9
        public void a() {
        }

        @Override // com.json.j9
        public void b() {
            u9.this.c.c(System.currentTimeMillis());
            u9.this.c();
        }

        @Override // com.json.j9
        public void c() {
            u9.this.c.b(System.currentTimeMillis());
            u9 u9Var = u9.this;
            u9Var.b(u9Var.c.a());
        }

        @Override // com.json.j9
        public void d() {
        }
    }

    class b extends TimerTask {
        b() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            u9.this.f2329a.b(u9.this.f);
            u9.this.c.b();
            u9.this.b.run();
        }
    }

    public u9(Runnable runnable, com.json.lifecycle.b bVar, qd qdVar) {
        this.b = runnable;
        this.f2329a = bVar;
        this.c = qdVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(long j) {
        synchronized (this.d) {
            c();
            Timer timer = new Timer();
            this.e = timer;
            timer.schedule(new b(), j);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        synchronized (this.d) {
            Timer timer = this.e;
            if (timer != null) {
                timer.cancel();
                this.e = null;
            }
        }
    }

    public void a() {
        a(0L);
    }

    public void a(long j) {
        if (j < 0) {
            Log.d(g, "cannot start timer with delay < 0");
            return;
        }
        this.f2329a.a(this.f);
        this.c.a(j);
        if (this.f2329a.e()) {
            this.c.c(System.currentTimeMillis());
        } else {
            b(j);
        }
    }

    public void b() {
        c();
        this.f2329a.b(this.f);
        this.c.b();
    }
}
