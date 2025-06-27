package com.json;

import java.util.Timer;
import java.util.TimerTask;

/* loaded from: classes4.dex */
public class fc {

    /* renamed from: a, reason: collision with root package name */
    private com.json.mediationsdk.utils.a f1780a;
    private gc b;
    private Timer c = null;

    class a extends TimerTask {
        a() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            fc.this.b.a();
        }
    }

    class b extends TimerTask {
        b() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            fc.this.b.a();
        }
    }

    public fc(com.json.mediationsdk.utils.a aVar, gc gcVar) {
        this.f1780a = aVar;
        this.b = gcVar;
    }

    private void d() {
        Timer timer = this.c;
        if (timer != null) {
            timer.cancel();
            this.c = null;
        }
    }

    public synchronized void a() {
        d();
        Timer timer = new Timer();
        this.c = timer;
        timer.schedule(new b(), this.f1780a.b());
    }

    public void b() {
        synchronized (this) {
            d();
        }
        this.b.a();
    }

    public synchronized void c() {
        d();
        Timer timer = new Timer();
        this.c = timer;
        timer.schedule(new a(), this.f1780a.j());
    }
}
