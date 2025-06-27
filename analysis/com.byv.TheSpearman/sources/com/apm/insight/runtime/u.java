package com.apm.insight.runtime;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

/* loaded from: classes.dex */
public class u {

    /* renamed from: a, reason: collision with root package name */
    static final b<d, Runnable> f157a = new b<d, Runnable>() { // from class: com.apm.insight.runtime.u.1
    };
    static final b<Message, Runnable> b = new b<Message, Runnable>() { // from class: com.apm.insight.runtime.u.2
    };
    private final HandlerThread c;
    private volatile Handler f;
    private final Queue<d> d = new ConcurrentLinkedQueue();
    private final Queue<Message> e = new ConcurrentLinkedQueue();
    private final Object g = new Object();

    class a implements Runnable {
        a() {
        }

        void a() {
            while (!u.this.d.isEmpty()) {
                d dVar = (d) u.this.d.poll();
                if (u.this.f != null) {
                    try {
                        u.this.f.sendMessageAtTime(dVar.f160a, dVar.b);
                    } catch (Throwable unused) {
                    }
                }
            }
        }

        void b() {
            while (!u.this.e.isEmpty()) {
                if (u.this.f != null) {
                    try {
                        u.this.f.sendMessageAtFrontOfQueue((Message) u.this.e.poll());
                    } catch (Throwable unused) {
                    }
                }
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            b();
            a();
        }
    }

    public interface b<A, B> {
    }

    class c extends HandlerThread {

        /* renamed from: a, reason: collision with root package name */
        volatile int f159a;
        volatile boolean b;

        c(String str) {
            super(str);
            this.f159a = 0;
            this.b = false;
        }

        @Override // android.os.HandlerThread
        protected void onLooperPrepared() {
            super.onLooperPrepared();
            synchronized (u.this.g) {
                u.this.f = new Handler();
            }
            u.this.f.post(u.this.new a());
            while (true) {
                try {
                    Looper.loop();
                } catch (Throwable th) {
                    try {
                        com.apm.insight.b.g.a(com.apm.insight.i.g()).a().c();
                        if (this.f159a < 5) {
                            com.apm.insight.c.a().a("NPTH_CATCH", th);
                        } else if (!this.b) {
                            this.b = true;
                            com.apm.insight.c.a().a("NPTH_ERR_MAX", new RuntimeException());
                        }
                        this.f159a++;
                    } catch (Throwable unused) {
                    }
                }
            }
        }
    }

    static class d {

        /* renamed from: a, reason: collision with root package name */
        Message f160a;
        long b;

        d(Message message, long j) {
            this.f160a = message;
            this.b = j;
        }
    }

    public u(String str) {
        this.c = new c(str);
    }

    private Message b(Runnable runnable) {
        return Message.obtain(this.f, runnable);
    }

    public Handler a() {
        return this.f;
    }

    public final boolean a(Message message, long j) {
        if (j < 0) {
            j = 0;
        }
        return b(message, SystemClock.uptimeMillis() + j);
    }

    public final boolean a(Runnable runnable) {
        return a(b(runnable), 0L);
    }

    public final boolean a(Runnable runnable, long j) {
        return a(b(runnable), j);
    }

    public void b() {
        this.c.start();
    }

    public final boolean b(Message message, long j) {
        if (this.f == null) {
            synchronized (this.g) {
                if (this.f == null) {
                    this.d.add(new d(message, j));
                    return true;
                }
            }
        }
        try {
            return this.f.sendMessageAtTime(message, j);
        } catch (Throwable unused) {
            return true;
        }
    }

    public HandlerThread c() {
        return this.c;
    }
}
