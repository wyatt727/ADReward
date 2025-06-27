package com.json;

import com.json.d0;
import com.json.mediationsdk.logger.IronLog;
import java.util.Timer;
import java.util.TimerTask;

/* loaded from: classes4.dex */
public class e0 {

    /* renamed from: a, reason: collision with root package name */
    private final d0 f1740a;
    private final y9 b;
    private final u9 c = b();
    private Timer d;

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            e0.this.b.a();
        }
    }

    class b extends TimerTask {
        b() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            e0.this.b.a();
        }
    }

    public e0(d0 d0Var, y9 y9Var) {
        this.f1740a = d0Var;
        this.b = y9Var;
    }

    private void a(long j) {
        this.c.a(j);
    }

    private u9 b() {
        return new u9(new a(), com.json.lifecycle.b.d(), new qd());
    }

    private void b(long j) {
        h();
        Timer timer = new Timer();
        this.d = timer;
        timer.schedule(new b(), j);
    }

    private void g() {
        this.c.b();
    }

    private void h() {
        Timer timer = this.d;
        if (timer != null) {
            timer.cancel();
            this.d = null;
        }
    }

    public void a() {
        if (this.f1740a.a() == d0.a.MANUAL_WITH_AUTOMATIC_RELOAD) {
            g();
        }
    }

    public void c() {
        if (this.f1740a.e()) {
            IronLog.INTERNAL.verbose();
            b(this.f1740a.c());
        }
    }

    public void d() {
        if (this.f1740a.a() == d0.a.AUTOMATIC_LOAD_AFTER_CLOSE) {
            IronLog.INTERNAL.verbose();
            b(this.f1740a.d());
        }
    }

    public void e() {
        if (this.f1740a.e()) {
            IronLog.INTERNAL.verbose();
            b(0L);
        }
    }

    public void f() {
        if (this.f1740a.a() == d0.a.AUTOMATIC_LOAD_WHILE_SHOW) {
            IronLog.INTERNAL.verbose();
            b(this.f1740a.d());
        }
    }

    public void i() {
        if (this.f1740a.a() != d0.a.MANUAL_WITH_AUTOMATIC_RELOAD || this.f1740a.b() <= 0) {
            return;
        }
        IronLog.INTERNAL.verbose();
        a(this.f1740a.b());
    }
}
