package com.my.tracker.obfuscated;

import android.os.Handler;
import android.os.Looper;
import com.applovin.impl.q5$i$$ExternalSyntheticLambda0;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* loaded from: classes4.dex */
public class g {

    /* renamed from: a, reason: collision with root package name */
    public static final Handler f4225a;
    public static final Executor b;
    public static final Executor c;
    private static final Executor d;
    private static final a e;

    static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final ArrayDeque<RunnableC0313a> f4226a = new ArrayDeque<>();

        /* renamed from: com.my.tracker.obfuscated.g$a$a, reason: collision with other inner class name */
        static final class RunnableC0313a implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            final a f4227a;
            volatile Runnable b;

            RunnableC0313a(a aVar) {
                this.f4227a = aVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    Runnable runnable = this.b;
                    if (runnable != null) {
                        runnable.run();
                    }
                    a aVar = this.f4227a;
                    if (aVar == null) {
                    }
                } catch (Throwable th) {
                    try {
                        z0.b("RunnableThrowableDecorator: exception has been caught", th);
                    } finally {
                        a aVar2 = this.f4227a;
                        if (aVar2 != null) {
                            aVar2.a(this);
                        }
                    }
                }
            }
        }

        a() {
            for (int i = 0; i < 64; i++) {
                this.f4226a.add(new RunnableC0313a(this));
            }
        }

        public Runnable a(Runnable runnable) {
            RunnableC0313a runnableC0313aPollFirst;
            synchronized (this) {
                runnableC0313aPollFirst = this.f4226a.pollFirst();
            }
            if (runnableC0313aPollFirst == null) {
                runnableC0313aPollFirst = new RunnableC0313a(null);
            }
            runnableC0313aPollFirst.b = runnable;
            return runnableC0313aPollFirst;
        }

        void a(RunnableC0313a runnableC0313a) {
            synchronized (this) {
                runnableC0313a.b = null;
                this.f4226a.add(runnableC0313a);
            }
        }
    }

    static {
        Handler handler = new Handler(Looper.getMainLooper());
        f4225a = handler;
        b = Executors.newSingleThreadExecutor();
        c = Executors.newSingleThreadExecutor();
        d = new q5$i$$ExternalSyntheticLambda0(handler);
        e = new a();
    }

    public static void a(Runnable runnable) {
        b.execute(e.a(runnable));
    }

    public static void b(Runnable runnable) {
        c.execute(e.a(runnable));
    }

    public static void c(Runnable runnable) {
        Runnable runnableA = e.a(runnable);
        if (Looper.getMainLooper() == Looper.myLooper()) {
            runnableA.run();
        } else {
            d.execute(runnableA);
        }
    }
}
