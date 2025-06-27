package com.json;

import java.util.Timer;
import java.util.TimerTask;

/* loaded from: classes4.dex */
public abstract class f<T> {

    /* renamed from: a, reason: collision with root package name */
    private Timer f1766a;
    protected long b;
    protected T c;

    class a extends TimerTask {
        a() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            f.this.b();
        }
    }

    public f() {
    }

    public f(long j) {
        this.b = j;
    }

    protected void a(T t) {
        if (a() || t == null) {
            return;
        }
        this.c = t;
        c();
        Timer timer = new Timer();
        this.f1766a = timer;
        timer.schedule(new a(), this.b);
    }

    protected boolean a() {
        return this.b <= 0;
    }

    protected abstract void b();

    protected void c() {
        Timer timer = this.f1766a;
        if (timer != null) {
            timer.cancel();
            this.f1766a = null;
        }
    }

    public void d() {
        this.c = null;
    }
}
